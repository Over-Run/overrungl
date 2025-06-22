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

import java.lang.foreign.*;
import java.util.Arrays;
import java.util.Objects;

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
 * <h3>Segment allocator of method parameter</h3>
 * Do <strong>NOT</strong> use other {@link SegmentAllocator} provided by method parameter
 * within try-block of memory stack.
 * The method parameter might be a same instance as the memory stack,
 * thus causes memory segment allocated by {@link SegmentAllocator} invalid after method returns.
 *
 * <pre>{@code
 * void createSomething() {
 *     try (var stack = MemoryStack.pushLocal()) {
 *         var out = stack.allocate(4);
 *         doSomething(createInfo(stack), out);
 *     }
 * }
 *
 * MemorySegment createInfo(SegmentAllocator allocator) {
 *     try (var stack = MemoryStack.pushLocal()) {
 *         var seg = stack.allocate(LAYOUT);
 *         nativeFunction(seg);
 *         return allocator.allocate(LAYOUT).copyFrom(seg); // using "allocator" which is same as variable "stack"
 *     }
 *     // the allocated segment invalid before returning
 * }}</pre>
 *
 * <h3>Short-lived threads</h3>
 * Do not use {@linkplain #ofLocal() local stacks} on short-lived threads
 * because they will not be released after the thread terminated.
 * Instead, use {@link Arena}.
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
        return malloc(byteSize, byteAlignment).fill((byte) 0);
    }

    /**
     * Like {@link #allocate(long, long)}, but it doesn't initialize with zero.
     *
     * @param byteSize      the size (in bytes) of the block of memory to be allocated
     * @param byteAlignment the alignment (in bytes) of the block of memory to be allocated
     * @return a new memory segment with the given {@code byteSize} and {@code byteAlignment}
     */
    public MemorySegment malloc(long byteSize, long byteAlignment) {
        if (byteSize < 0) {
            throw new IllegalArgumentException("The provided allocation size is negative: " + byteSize);
        }
        if (byteAlignment <= 0 || ((byteAlignment & (byteAlignment - 1)) != 0L)) {
            throw new IllegalArgumentException("Invalid alignment constraint: " + byteAlignment);
        }
        return trySlice(byteSize, byteAlignment);
    }

    /**
     * Like {@link #allocate(long)}, but it doesn't initialize with zero.
     *
     * @param byteSize the size (in bytes) of the block of memory to be allocated
     * @return a new memory segment with the given {@code byteSize}
     */
    public MemorySegment malloc(long byteSize) {
        return malloc(byteSize, 1);
    }

    /**
     * Like {@link #allocate(MemoryLayout)}, but it doesn't initialize with zero.
     *
     * @param layout the layout of the block of memory to be allocated
     * @return a new memory segment with the given layout
     */
    public MemorySegment malloc(MemoryLayout layout) {
        return malloc(layout.byteSize(), layout.byteAlignment());
    }

    /**
     * Like {@link #allocate(MemoryLayout, long)}, but is not initialized with zero.
     *
     * @param elementLayout the array element layout
     * @param count         the array element count
     * @return a new memory segment with the given {@code elementLayout} and {@code count}
     */
    public MemorySegment malloc(MemoryLayout elementLayout, long count) {
        return malloc(MemoryLayout.sequenceLayout(count, elementLayout));
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

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfByte layout, byte value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfChar layout, char value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfShort layout, short value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfInt layout, int value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfFloat layout, float value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfLong layout, long value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout.OfDouble layout, double value) {
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(AddressLayout layout, MemorySegment value) {
        Objects.requireNonNull(value);
        Objects.requireNonNull(layout);
        MemorySegment seg = malloc(layout);
        seg.set(layout, 0, value);
        return seg;
    }

    @Override
    public MemorySegment allocateFrom(ValueLayout elementLayout,
                                      MemorySegment source,
                                      ValueLayout sourceElementLayout,
                                      long sourceOffset,
                                      long elementCount) {
        Objects.requireNonNull(source);
        Objects.requireNonNull(sourceElementLayout);
        Objects.requireNonNull(elementLayout);
        MemorySegment dst = malloc(elementLayout, elementCount);
        MemorySegment.copy(source, sourceElementLayout, sourceOffset, dst, elementLayout, 0, elementCount);
        return dst;
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

    /// Allocates uninitialized `CharPtr`.
    ///
    /// @return the `CharPtr`
    public CharPtr allocCharPtr() { return new CharPtr(malloc(CharPtr.LAYOUT)); }

    /// Allocates uninitialized `CharPtr.Buffer`.
    ///
    /// @param count the count of the allocated `CharPtr`
    /// @return the `CharPtr.Buffer`
    public CharPtr.Buffer allocCharPtr(long count) { return new CharPtr.Buffer(malloc(CharPtr.LAYOUT, count), count); }

    /// Allocates uninitialized `BytePtr`.
    ///
    /// @return the `BytePtr`
    public BytePtr allocBytePtr() { return new BytePtr(malloc(BytePtr.LAYOUT)); }

    /// Allocates uninitialized `BytePtr.Buffer`.
    ///
    /// @param count the count of the allocated `BytePtr`
    /// @return the `BytePtr.Buffer`
    public BytePtr.Buffer allocBytePtr(long count) { return new BytePtr.Buffer(malloc(BytePtr.LAYOUT, count), count); }

    /// Allocates uninitialized `ShortPtr`.
    ///
    /// @return the `ShortPtr`
    public ShortPtr allocShortPtr() { return new ShortPtr(malloc(ShortPtr.LAYOUT)); }

    /// Allocates uninitialized `ShortPtr.Buffer`.
    ///
    /// @param count the count of the allocated `ShortPtr`
    /// @return the `ShortPtr.Buffer`
    public ShortPtr.Buffer allocShortPtr(long count) { return new ShortPtr.Buffer(malloc(ShortPtr.LAYOUT, count), count); }

    /// Allocates uninitialized `IntPtr`.
    ///
    /// @return the `IntPtr`
    public IntPtr allocIntPtr() { return new IntPtr(malloc(IntPtr.LAYOUT)); }

    /// Allocates uninitialized `IntPtr.Buffer`.
    ///
    /// @param count the count of the allocated `IntPtr`
    /// @return the `IntPtr.Buffer`
    public IntPtr.Buffer allocIntPtr(long count) { return new IntPtr.Buffer(malloc(IntPtr.LAYOUT, count), count); }

    /// Allocates uninitialized `LongPtr`.
    ///
    /// @return the `LongPtr`
    public LongPtr allocLongPtr() { return new LongPtr(malloc(LongPtr.LAYOUT)); }

    /// Allocates uninitialized `LongPtr.Buffer`.
    ///
    /// @param count the count of the allocated `LongPtr`
    /// @return the `LongPtr.Buffer`
    public LongPtr.Buffer allocLongPtr(long count) { return new LongPtr.Buffer(malloc(LongPtr.LAYOUT, count), count); }

    /// Allocates uninitialized `FloatPtr`.
    ///
    /// @return the `FloatPtr`
    public FloatPtr allocFloatPtr() { return new FloatPtr(malloc(FloatPtr.LAYOUT)); }

    /// Allocates uninitialized `FloatPtr.Buffer`.
    ///
    /// @param count the count of the allocated `FloatPtr`
    /// @return the `FloatPtr.Buffer`
    public FloatPtr.Buffer allocFloatPtr(long count) { return new FloatPtr.Buffer(malloc(FloatPtr.LAYOUT, count), count); }

    /// Allocates uninitialized `DoublePtr`.
    ///
    /// @return the `DoublePtr`
    public DoublePtr allocDoublePtr() { return new DoublePtr(malloc(DoublePtr.LAYOUT)); }

    /// Allocates uninitialized `DoublePtr.Buffer`.
    ///
    /// @param count the count of the allocated `DoublePtr`
    /// @return the `DoublePtr.Buffer`
    public DoublePtr.Buffer allocDoublePtr(long count) { return new DoublePtr.Buffer(malloc(DoublePtr.LAYOUT, count), count); }

    /// Allocates uninitialized `VoidPtr`.
    ///
    /// @return the `VoidPtr`
    public VoidPtr allocVoidPtr() { return new VoidPtr(malloc(VoidPtr.LAYOUT)); }

    /// Allocates uninitialized `VoidPtr.Buffer`.
    ///
    /// @param count the count of the allocated `VoidPtr`
    /// @return the `VoidPtr.Buffer`
    public VoidPtr.Buffer allocVoidPtr(long count) { return new VoidPtr.Buffer(malloc(VoidPtr.LAYOUT, count), count); }

    //@formatter:on
    //endregion ---[END GENERATOR END]---
}
