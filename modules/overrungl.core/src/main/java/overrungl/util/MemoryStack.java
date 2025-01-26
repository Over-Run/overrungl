/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.util;

import overrungl.OverrunGLConfigurations;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

/**
 * <h2>Memory stack</h2>
 * Memory stack is backed with a {@linkplain MemorySegment memory segment}.
 * Each allocation returns a slice of the segment starts at the current offset
 * (modulo additional padding to satisfy alignment constraint),
 * with the given size.
 * <p>
 * It extends {@link SegmentAllocator}, which allows allocating from the given data.
 * <p>
 * It does not extend {@link Arena} since the memory stack is not supposed to be a long-alive arena allocator.
 * The stack itself does not bind to any segment scope;
 * it just slices the backing segment.
 * <p>
 * Memory stack is not thread-safe;
 * consider using the {@linkplain #ofLocal() local stacks} to manage with threads.
 *
 * <h3>Push and pop</h3>
 * It remembers the current offset when {@link #push()} is called,
 * then it resets to the previous offset when {@link #pop()} is called.
 * <p>
 * It extends {@link AutoCloseable} to allow using try-with-resources statement to call {@code pop} automatically.
 * <p>
 * The push and pop operations must be symmetric.
 * <p>
 * Using memory stack without push and pop operations
 * has the same effect as {@linkplain SegmentAllocator#slicingAllocator(MemorySegment) slicing allocator}.
 *
 * <h3>Type-specialized allocating methods</h3>
 * Allocating methods of primitive types (except {@code boolean}) and {@link MemorySegment} are provided
 * to avoid requiring a memory layout.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class MemoryStack implements SegmentAllocator, AutoCloseable {
    private static final ThreadLocal<MemoryStack> TLS = ThreadLocal.withInitial(MemoryStack::of);
    private final MemorySegment segment;
    private long[] frames;
    private long offset = 0L;
    private int frameIndex = 0;

    /**
     * Creates the default memory stack with the given segment and frame count.
     *
     * @param segment    the memory segment
     * @param frameCount the frame count
     */
    public MemoryStack(MemorySegment segment, int frameCount) {
        this.segment = segment;
        this.frames = new long[frameCount];
    }

    /**
     * Creates a default memory stack backed with the given memory segment and {@linkplain #frameCount() frame count}.
     *
     * @param segment    the memory segment to be sliced
     * @param frameCount the frame count of the memory stack
     * @return a new memory stack
     * @throws IllegalArgumentException if {@code segment} is {@linkplain MemorySegment#isReadOnly() read-only}
     *                                  or {@code frameCount <= 0}
     */
    public static MemoryStack of(MemorySegment segment, int frameCount) {
        assertWritable(segment);
        checkSize(frameCount, "invalid frame count");
        return new MemoryStack(segment, frameCount);
    }

    /**
     * Creates a memory stack,
     * backed with a memory segment allocated with an {@linkplain Arena#ofAuto() auto arena} and the given size,
     * with the given {@linkplain #frameCount() frame count}.
     *
     * @param byteSize   the size of the memory segment
     * @param frameCount the frame count of the memory stack
     * @return a new memory stack
     * @throws IllegalArgumentException if {@code segment} is {@linkplain MemorySegment#isReadOnly() read-only},
     *                                  {@code byteSize <= 0} or {@code frameCount <= 0}
     * @see #of(MemorySegment, int)
     */
    public static MemoryStack of(long byteSize, int frameCount) {
        checkSize(byteSize, "invalid stack size");
        return of(Arena.ofAuto().allocate(byteSize), frameCount);
    }

    /**
     * Creates a memory stack with the default size and {@linkplain #frameCount() frame count}.
     *
     * @return a new memory stack
     * @see #of(long, int)
     * @see OverrunGLConfigurations#STACK_SIZE
     * @see OverrunGLConfigurations#STACK_FRAME_COUNT
     */
    public static MemoryStack of() {
        return of(OverrunGLConfigurations.STACK_SIZE.get(), OverrunGLConfigurations.STACK_FRAME_COUNT.get());
    }

    /**
     * {@return the memory stack for the current thread}
     *
     * @see #of()
     */
    public static MemoryStack ofLocal() {
        return TLS.get();
    }

    /**
     * Calls {@link #push()} of the {@linkplain #ofLocal() local memory stack}.
     *
     * @return the local memory stack
     */
    public static MemoryStack pushLocal() {
        return ofLocal().push();
    }

    /**
     * Calls {@link #pop()} of the {@linkplain #ofLocal() local memory stack}.
     */
    public static void popLocal() {
        ofLocal().pop();
    }

    private static void assertWritable(MemorySegment segment) {
        if (segment.isReadOnly()) {
            throw new IllegalArgumentException("read-only segment");
        }
    }

    private static void checkSize(long size, String message) {
        if (size <= 0) {
            throw new IllegalArgumentException(message);
        }
    }

    private MemorySegment trySlice(long byteSize, long byteAlignment) {
        long min = segment.address();
        long start = ((min + offset + byteAlignment - 1) & -byteAlignment) - min;
        MemorySegment slice = segment.asSlice(start, byteSize, byteAlignment);
        offset = start + byteSize;
        return slice;
    }

    /**
     * {@inheritDoc}
     * The returned memory segment is a slice of the {@linkplain #segment() backing segment}
     * and is initialized with zero.
     *
     * @throws IndexOutOfBoundsException if there is not enough space to allocate
     * @throws IllegalArgumentException  if {@code byteSize < 0}, {@code byteAlignment <= 0},
     *                                   or if {@code byteAlignment} is not a power of 2
     */
    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment) {
        if (byteSize < 0) {
            throw new IllegalArgumentException("The provided allocation size is negative: " + byteSize);
        }
        if (byteAlignment <= 0 || ((byteAlignment & (byteAlignment - 1)) != 0L)) {
            throw new IllegalArgumentException("Invalid alignment constraint: " + byteAlignment);
        }
        return trySlice(byteSize, byteAlignment).fill((byte) 0);
    }

    /**
     * Remembers the current offset and pushes a frame for next allocations.
     * <p>
     * The memory stack expands the internal frames array by 1.5x if there is not enough space to push.
     *
     * @return {@code this}
     */
    public MemoryStack push() {
        if (frameIndex >= frames.length) {
            frames = Arrays.copyOf(frames, frames.length * 3 / 2);
        }
        frames[frameIndex] = offset;
        frameIndex++;
        return this;
    }

    /**
     * Pops to the previous frame and sets the current offset.
     *
     * @throws IndexOutOfBoundsException if the frame index reached the bottom of the stack
     */
    public void pop() {
        if (frameIndex <= 0) {
            throw new IndexOutOfBoundsException("stack frame underflow");
        }
        frameIndex--;
        offset = frames[frameIndex];
    }

    /**
     * Calls {@link #pop()}.
     */
    @Override
    public void close() {
        pop();
    }

    /**
     * {@return the count of the offsets this stack can store}
     */
    public int frameCount() {
        return frames.length;
    }

    /**
     * {@return the current frame index}
     */
    public int frameIndex() {
        return frameIndex;
    }

    /**
     * {@return the current offset of this stack}
     */
    public long stackPointer() {
        return offset;
    }

    /**
     * Sets the offset of this stack.
     *
     * @param pointer the new offset
     */
    public void setPointer(long pointer) {
        offset = pointer;
    }

    /**
     * {@return the backing memory segment}
     */
    public MemorySegment segment() {
        return segment;
    }

    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    /// Allocates `char`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment chars(char value) {
        return this.allocateFrom(ValueLayout.JAVA_CHAR, value);
    }

    /// Allocates `char`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment chars(char... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `byte`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment bytes(byte value) {
        return this.allocateFrom(ValueLayout.JAVA_BYTE, value);
    }

    /// Allocates `byte`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment bytes(byte... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `short`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment shorts(short value) {
        return this.allocateFrom(ValueLayout.JAVA_SHORT, value);
    }

    /// Allocates `short`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment shorts(short... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `int`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment ints(int value) {
        return this.allocateFrom(ValueLayout.JAVA_INT, value);
    }

    /// Allocates `int`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment ints(int... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `long`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment longs(long value) {
        return this.allocateFrom(ValueLayout.JAVA_LONG, value);
    }

    /// Allocates `long`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment longs(long... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `float`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment floats(float value) {
        return this.allocateFrom(ValueLayout.JAVA_FLOAT, value);
    }

    /// Allocates `float`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment floats(float... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `double`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment doubles(double value) {
        return this.allocateFrom(ValueLayout.JAVA_DOUBLE, value);
    }

    /// Allocates `double`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment doubles(double... values) {
        return MemoryUtil.allocArray(this, values);
    }

    /// Allocates `MemorySegment`.
    ///
    /// @param value the value
    /// @return the allocated segment
    public MemorySegment addresses(MemorySegment value) {
        return this.allocateFrom(ValueLayout.ADDRESS, value);
    }

    /// Allocates `MemorySegment`s.
    ///
    /// @param values the values
    /// @return the allocated segment
    public MemorySegment addresses(MemorySegment... values) {
        return MemoryUtil.allocArray(this, values);
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---
}
