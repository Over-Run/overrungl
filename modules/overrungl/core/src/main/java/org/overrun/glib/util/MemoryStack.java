/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package org.overrun.glib.util;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.Configurations;
import org.overrun.glib.Pointer;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.*;
import java.util.Arrays;

import static java.lang.foreign.ValueLayout.*;

/**
 * An off-heap memory stack.
 *
 * <p>This class should be used in a thread-local manner for stack allocations.</p>
 *
 * @author Spasi
 * @author lwjgl3
 * @author squid233
 * @see Configurations#STACK_SIZE
 * @see Configurations#STACK_FRAMES
 * @see Configurations#DEBUG_STACK
 * @since 0.1.0
 */
public class MemoryStack extends Pointer implements SegmentAllocator, AutoCloseable {
    private static final boolean CHECKS = Configurations.CHECKS.get();
    private static final boolean DEBUG = Configurations.DEBUG.get();
    private static final boolean DEBUG_STACK = Configurations.DEBUG_STACK.get();
    private static final long DEFAULT_STACK_SIZE = Configurations.STACK_SIZE.get() * 1024;
    private static final int DEFAULT_STACK_FRAMES = Configurations.STACK_FRAMES.get();
    private static final ThreadLocal<MemoryStack> TLS = ThreadLocal.withInitial(MemoryStack::create);

    static {
        if (DEFAULT_STACK_SIZE < 0) {
            throw new IllegalStateException("Invalid stack size.");
        }
        if (DEFAULT_STACK_FRAMES < 0) {
            throw new IllegalStateException("Invalid stack frames.");
        }
    }

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    @Nullable
    private final MemorySegment container;

    private final long size;

    private long pointer;

    private long[] frames;
    protected int frameIndex;

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory region.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param container the backing memory buffer, may be null
     * @param address   the backing memory address
     * @param size      the backing memory size
     * @param arena     the backing arena
     */
    protected MemoryStack(@Nullable MemorySegment container, MemorySegment address, long size, Arena arena) {
        super(address, arena);
        this.container = container;

        this.size = size;
        this.pointer = size;

        frames = new long[DEFAULT_STACK_FRAMES];
    }

    /**
     * Creates a new {@code MemoryStack} with the default size.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     */
    public static MemoryStack create() {
        return create(DEFAULT_STACK_SIZE);
    }

    /**
     * Creates a new {@code MemoryStack} with the specified size.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param capacity the maximum number of bytes that may be allocated on the stack
     */
    public static MemoryStack create(long capacity) {
        final Arena arena = RuntimeHelper.autoArena();
        return create(arena.allocate(capacity), capacity, arena);
    }

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory buffer.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param buffer the backing memory buffer
     * @param size   the memory buffer size
     * @param arena  the backing arena
     */
    public static MemoryStack create(MemorySegment buffer, long size, Arena arena) {
        return DEBUG_STACK
            ? new DebugMemoryStack(buffer, buffer, size, arena)
            : new MemoryStack(buffer, buffer, size, arena);
    }

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory region.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param address the backing memory address
     * @param size    the backing memory size
     * @param arena   the backing arena
     */
    public static MemoryStack ncreate(MemorySegment address, long size, Arena arena) {
        return DEBUG_STACK
            ? new DebugMemoryStack(null, address, size, arena)
            : new MemoryStack(null, address, size, arena);
    }

    /**
     * Stores the current stack pointer and pushes a new frame to the stack.
     *
     * <p>This method should be called when entering a method, before doing any stack allocations. When exiting a method, call the {@link #pop} method to
     * restore the previous stack frame.</p>
     *
     * <p>Pairs of push/pop calls may be nested. Care must be taken to:</p>
     * <ul>
     * <li>match every push with a pop</li>
     * <li>not call pop before push has been called at least once</li>
     * <li>not nest push calls to more than the maximum supported depth</li>
     * </ul>
     *
     * @return this stack
     */
    public MemoryStack push() {
        if (frameIndex == frames.length) {
            frameOverflow();
        }

        frames[frameIndex++] = pointer;
        return this;
    }

    private void frameOverflow() {
        if (DEBUG) {
            RuntimeHelper.apiLog("[WARNING] Out of frame stack space (" + frames.length + ") in thread: " + Thread.currentThread());
        }
        frames = Arrays.copyOf(frames, frames.length * 3 / 2);
    }

    /**
     * Pops the current stack frame and moves the stack pointer to the end of the previous stack frame.
     *
     * @return this stack
     */
    public MemoryStack pop() {
        pointer = frames[--frameIndex];
        return this;
    }

    /**
     * Calls {@link #pop} on this {@code MemoryStack}.
     *
     * <p>This method should not be used directly. It is called automatically when the {@code MemoryStack} is used as a resource in a try-with-resources
     * statement.</p>
     */
    @Override
    public void close() {
        this.pop();
    }

    /**
     * Stores the method that pushed a frame and checks if it is the same method when the frame is popped.
     *
     * @since 0.1.0
     */
    private static final class DebugMemoryStack extends MemoryStack {
        private Object[] debugFrames;

        DebugMemoryStack(@Nullable MemorySegment buffer, MemorySegment address, long size, Arena arena) {
            super(buffer, address, size, arena);
            debugFrames = new Object[DEFAULT_STACK_FRAMES];
        }

        @Override
        public MemoryStack push() {
            if (frameIndex == debugFrames.length) {
                frameOverflow();
            }

            debugFrames[frameIndex] = StackWalkUtil.stackWalkGetMethod(MemoryStack.class);

            return super.push();
        }

        private void frameOverflow() {
            debugFrames = Arrays.copyOf(debugFrames, debugFrames.length * 3 / 2);
        }

        @Override
        public MemoryStack pop() {
            Object pushed = debugFrames[frameIndex - 1];
            Object popped = StackWalkUtil.stackWalkCheckPop(MemoryStack.class, pushed);
            if (popped != null) {
                reportAsymmetricPop(pushed, popped);
            }

            debugFrames[frameIndex - 1] = null;
            return super.pop();
        }

        // No need to check pop in try-with-resources
        @Override
        public void close() {
            debugFrames[frameIndex - 1] = null;
            super.pop();
        }

        private static void reportAsymmetricPop(Object pushed, Object popped) {
            RuntimeHelper.apiLog(String.format(
                "[OverrunGL] Asymmetric pop detected:\n\tPUSHED: %s\n\tPOPPED: %s\n\tTHREAD: %s\n",
                pushed,
                popped,
                Thread.currentThread()
            ));
        }
    }

    /**
     * Returns the address of the backing off-heap memory.
     *
     * <p>The stack grows "downwards", so the bottom of the stack is at {@code address + size}, while the top is at {@code address}.</p>
     */
    @Override
    public MemorySegment address() {
        return super.address();
    }

    /**
     * Returns the size of the backing off-heap memory.
     *
     * <p>This is the maximum number of bytes that may be allocated on the stack.</p>
     */
    public long getSize() {
        return size;
    }

    /**
     * Returns the current frame index.
     *
     * <p>This is the current number of nested {@link #push} calls.</p>
     */
    public int getFrameIndex() {
        return frameIndex;
    }

    /**
     * Returns the memory address at the current stack pointer.
     */
    public MemorySegment getPointerAddress() {
        return address().asSlice(pointer);
    }

    /**
     * Returns the current stack pointer.
     *
     * <p>The stack grows "downwards", so when the stack is empty {@code pointer} is equal to {@code size}. On every allocation {@code pointer} is reduced by
     * the allocated size (after alignment) and {@code address + pointer} points to the first byte of the last allocation.</p>
     *
     * <p>Effectively, this methods returns how many more bytes may be allocated on the stack.</p>
     */
    public long getPointer() {
        return pointer;
    }

    /**
     * Sets the current stack pointer.
     *
     * <p>This method directly manipulates the stack pointer. Using it irresponsibly may break the internal state of the stack. It should only be used in rare
     * cases or in auto-generated code.</p>
     */
    public void setPointer(long pointer) {
        if (CHECKS) {
            checkPointer(pointer);
        }

        this.pointer = pointer;
    }

    private void checkPointer(long pointer) {
        if (pointer < 0 || size < pointer) {
            throw new IndexOutOfBoundsException("Invalid stack pointer");
        }
    }

    /**
     * Allocates a block of {@code size} bytes of memory on the stack. The content of the newly allocated block of memory is not initialized, remaining with
     * indeterminate values.
     *
     * @param alignment the required alignment
     * @param size      the allocation size
     * @return the memory address on the stack for the requested allocation
     */
    public MemorySegment nmalloc(long alignment, long size) {
        // Align address to the specified alignment
        long rawLong = address().address();
        long address = (rawLong + pointer - size) & -alignment;

        pointer = address - rawLong;
        if (CHECKS && pointer < 0) {
            throw new OutOfMemoryError("Out of stack space.");
        }

        return MemorySegment.ofAddress(address, size, arena.scope());
    }

    /**
     * Allocates a block of memory on the stack for an array of {@code num} elements, each of them {@code size} bytes long, and initializes all its bits to
     * zero.
     *
     * @param alignment the required element alignment
     * @param num       num  the number of elements to allocate
     * @param size      the size of each element
     * @return the memory address on the stack for the requested allocation
     */
    public MemorySegment ncalloc(long alignment, long num, long size) {
        long bytes = num * size;
        var address = nmalloc(alignment, bytes);
        MemoryUtil.memset(address, 0, bytes);
        return address;
    }

    // -------------------------------------------------

    /**
     * Allocates an aligned {@link MemorySegment} on the stack.
     *
     * @param alignment the required buffer alignment
     * @param size      the number of elements in the buffer
     * @return the allocated buffer
     */
    public MemorySegment malloc(long alignment, long size) {
        if (DEBUG) {
            RuntimeHelper.checkAlignment(alignment);
        }
        return nmalloc(alignment, size);
    }

    /**
     * Calloc version of {@link #malloc(long, long)}.
     */
    public MemorySegment calloc(long alignment, long size) {
        if (DEBUG) {
            RuntimeHelper.checkAlignment(alignment);
        }
        return ncalloc(alignment, 1, size);
    }

    /**
     * Allocates a {@link MemorySegment} on the stack with {@code alignment} equal to {@link ValueLayout#byteSize() POINTER_SIZE}.
     *
     * @param size the allocation size
     * @return the memory address on the stack for the requested allocation
     */
    public MemorySegment malloc(long size) {
        return nmalloc(ADDRESS.byteSize(), size);
    }

    public MemorySegment malloc(MemoryLayout layout) {
        return malloc(layout.byteSize());
    }

    /**
     * Calloc version of {@link #malloc(long)}.
     */
    public MemorySegment calloc(long size) {
        return ncalloc(ADDRESS.byteSize(), 1, size);
    }

    public MemorySegment calloc(MemoryLayout layout, long num) {
        return ncalloc(ADDRESS.byteSize(), num, layout.byteSize());
    }

    public MemorySegment calloc(MemoryLayout layout) {
        return calloc(layout, 1);
    }

    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment) throws IllegalArgumentException {
        RuntimeHelper.checkByteSize(byteSize);
        RuntimeHelper.checkAlignment(byteAlignment);
        return calloc(byteAlignment, byteSize);
    }

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment bytes(byte x) {
        MemorySegment segment = malloc(JAVA_BYTE.byteAlignment(), 1);
        segment.set(JAVA_BYTE, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment bytes(byte x, byte y) {
        MemorySegment segment = malloc(JAVA_BYTE.byteAlignment(), 2);
        segment.set(JAVA_BYTE, 0, x);
        segment.set(JAVA_BYTE, 1, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment bytes(byte x, byte y, byte z) {
        MemorySegment segment = malloc(JAVA_BYTE.byteAlignment(), 3);
        segment.set(JAVA_BYTE, 0, x);
        segment.set(JAVA_BYTE, 1, y);
        segment.set(JAVA_BYTE, 2, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment bytes(byte x, byte y, byte z, byte w) {
        MemorySegment segment = malloc(JAVA_BYTE.byteAlignment(), 4);
        segment.set(JAVA_BYTE, 0, x);
        segment.set(JAVA_BYTE, 1, y);
        segment.set(JAVA_BYTE, 2, z);
        segment.set(JAVA_BYTE, 3, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment bytes(byte... values) {
        MemorySegment segment = malloc(JAVA_BYTE.byteAlignment(), values.length);
        MemorySegment.copy(values, 0, segment, JAVA_BYTE, 0, values.length);
        return segment;
    }

    // -------------------------------------------------

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment shorts(short x) {
        MemorySegment segment = malloc(JAVA_SHORT.byteAlignment(), 2);
        segment.set(JAVA_SHORT, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment shorts(short x, short y) {
        MemorySegment segment = malloc(JAVA_SHORT.byteAlignment(), 4);
        segment.set(JAVA_SHORT, 0, x);
        segment.set(JAVA_SHORT, 2, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment shorts(short x, short y, short z) {
        MemorySegment segment = malloc(JAVA_SHORT.byteAlignment(), 6);
        segment.set(JAVA_SHORT, 0, x);
        segment.set(JAVA_SHORT, 2, y);
        segment.set(JAVA_SHORT, 4, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment shorts(short x, short y, short z, short w) {
        MemorySegment segment = malloc(JAVA_SHORT.byteAlignment(), 8);
        segment.set(JAVA_SHORT, 0, x);
        segment.set(JAVA_SHORT, 2, y);
        segment.set(JAVA_SHORT, 4, z);
        segment.set(JAVA_SHORT, 6, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment shorts(short... values) {
        MemorySegment segment = malloc(JAVA_SHORT.byteAlignment(), (long) values.length << 1);
        MemorySegment.copy(values, 0, segment, JAVA_SHORT, 0, values.length);
        return segment;
    }

    // -------------------------------------------------

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment ints(int x) {
        MemorySegment segment = malloc(JAVA_INT.byteAlignment(), 4);
        segment.set(JAVA_INT, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment ints(int x, int y) {
        MemorySegment segment = malloc(JAVA_INT.byteAlignment(), 8);
        segment.set(JAVA_INT, 0, x);
        segment.set(JAVA_INT, 4, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment ints(int x, int y, int z) {
        MemorySegment segment = malloc(JAVA_INT.byteAlignment(), 12);
        segment.set(JAVA_INT, 0, x);
        segment.set(JAVA_INT, 4, y);
        segment.set(JAVA_INT, 8, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment ints(int x, int y, int z, int w) {
        MemorySegment segment = malloc(JAVA_INT.byteAlignment(), 16);
        segment.set(JAVA_INT, 0, x);
        segment.set(JAVA_INT, 4, y);
        segment.set(JAVA_INT, 8, z);
        segment.set(JAVA_INT, 12, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment ints(int... values) {
        MemorySegment segment = malloc(JAVA_INT.byteAlignment(), (long) values.length << 2);
        MemorySegment.copy(values, 0, segment, JAVA_INT, 0, values.length);
        return segment;
    }

    // -------------------------------------------------

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment longs(long x) {
        MemorySegment segment = malloc(JAVA_LONG.byteAlignment(), 8);
        segment.set(JAVA_LONG, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment longs(long x, long y) {
        MemorySegment segment = malloc(JAVA_LONG.byteAlignment(), 16);
        segment.set(JAVA_LONG, 0, x);
        segment.set(JAVA_LONG, 8, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment longs(long x, long y, long z) {
        MemorySegment segment = malloc(JAVA_LONG.byteAlignment(), 24);
        segment.set(JAVA_LONG, 0, x);
        segment.set(JAVA_LONG, 8, y);
        segment.set(JAVA_LONG, 16, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment longs(long x, long y, long z, long w) {
        MemorySegment segment = malloc(JAVA_LONG.byteAlignment(), 32);
        segment.set(JAVA_LONG, 0, x);
        segment.set(JAVA_LONG, 8, y);
        segment.set(JAVA_LONG, 16, z);
        segment.set(JAVA_LONG, 24, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment longs(long... values) {
        MemorySegment segment = malloc(JAVA_LONG.byteAlignment(), (long) values.length << 3);
        MemorySegment.copy(values, 0, segment, JAVA_LONG, 0, values.length);
        return segment;
    }

    // -------------------------------------------------

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment floats(float x) {
        MemorySegment segment = malloc(JAVA_FLOAT.byteAlignment(), 4);
        segment.set(JAVA_FLOAT, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment floats(float x, float y) {
        MemorySegment segment = malloc(JAVA_FLOAT.byteAlignment(), 8);
        segment.set(JAVA_FLOAT, 0, x);
        segment.set(JAVA_FLOAT, 4, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment floats(float x, float y, float z) {
        MemorySegment segment = malloc(JAVA_FLOAT.byteAlignment(), 12);
        segment.set(JAVA_FLOAT, 0, x);
        segment.set(JAVA_FLOAT, 4, y);
        segment.set(JAVA_FLOAT, 8, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment floats(float x, float y, float z, float w) {
        MemorySegment segment = malloc(JAVA_FLOAT.byteAlignment(), 16);
        segment.set(JAVA_FLOAT, 0, x);
        segment.set(JAVA_FLOAT, 4, y);
        segment.set(JAVA_FLOAT, 8, z);
        segment.set(JAVA_FLOAT, 12, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment floats(float... values) {
        MemorySegment segment = malloc(JAVA_FLOAT.byteAlignment(), (long) values.length << 2);
        MemorySegment.copy(values, 0, segment, JAVA_FLOAT, 0, values.length);
        return segment;
    }

    // -------------------------------------------------

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment doubles(double x) {
        MemorySegment segment = malloc(JAVA_DOUBLE.byteAlignment(), 8);
        segment.set(JAVA_DOUBLE, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment doubles(double x, double y) {
        MemorySegment segment = malloc(JAVA_DOUBLE.byteAlignment(), 16);
        segment.set(JAVA_DOUBLE, 0, x);
        segment.set(JAVA_DOUBLE, 8, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment doubles(double x, double y, double z) {
        MemorySegment segment = malloc(JAVA_DOUBLE.byteAlignment(), 24);
        segment.set(JAVA_DOUBLE, 0, x);
        segment.set(JAVA_DOUBLE, 8, y);
        segment.set(JAVA_DOUBLE, 16, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment doubles(double x, double y, double z, double w) {
        MemorySegment segment = malloc(JAVA_DOUBLE.byteAlignment(), 32);
        segment.set(JAVA_DOUBLE, 0, x);
        segment.set(JAVA_DOUBLE, 8, y);
        segment.set(JAVA_DOUBLE, 16, z);
        segment.set(JAVA_DOUBLE, 24, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment doubles(double... values) {
        MemorySegment segment = malloc(JAVA_DOUBLE.byteAlignment(), (long) values.length << 3);
        MemorySegment.copy(values, 0, segment, JAVA_DOUBLE, 0, values.length);
        return segment;
    }

    // -------------------------------------------------

    /**
     * Single value version of {@link #malloc}.
     */
    public MemorySegment pointers(MemorySegment x) {
        MemorySegment segment = malloc(ADDRESS.byteAlignment(), ADDRESS.byteSize());
        segment.set(ADDRESS, 0, x);
        return segment;
    }

    /**
     * Two value version of {@link #malloc}.
     */
    public MemorySegment pointers(MemorySegment x, MemorySegment y) {
        MemorySegment segment = malloc(ADDRESS.byteAlignment(), ADDRESS.byteSize() * 2);
        segment.set(ADDRESS, 0, x);
        segment.setAtIndex(ADDRESS, 1, y);
        return segment;
    }

    /**
     * Three value version of {@link #malloc}.
     */
    public MemorySegment pointers(MemorySegment x, MemorySegment y, MemorySegment z) {
        MemorySegment segment = malloc(ADDRESS.byteAlignment(), ADDRESS.byteSize() * 3);
        segment.set(ADDRESS, 0, x);
        segment.setAtIndex(ADDRESS, 1, y);
        segment.setAtIndex(ADDRESS, 2, z);
        return segment;
    }

    /**
     * Four value version of {@link #malloc}.
     */
    public MemorySegment pointers(MemorySegment x, MemorySegment y, MemorySegment z, MemorySegment w) {
        MemorySegment segment = malloc(ADDRESS.byteAlignment(), ADDRESS.byteSize() * 4);
        segment.set(ADDRESS, 0, x);
        segment.setAtIndex(ADDRESS, 1, y);
        segment.setAtIndex(ADDRESS, 2, z);
        segment.setAtIndex(ADDRESS, 3, w);
        return segment;
    }

    /**
     * Vararg version of {@link #malloc}.
     */
    public MemorySegment pointers(MemorySegment... values) {
        MemorySegment segment = malloc(ADDRESS.byteAlignment(), ADDRESS.byteSize() * values.length);
        for (int i = 0; i < values.length; i++) {
            segment.setAtIndex(ADDRESS, i, values[i]);
        }
        return segment;
    }

    // -----------------------------------------------------
    // -----------------------------------------------------
    // -----------------------------------------------------

    /**
     * Returns the stack of the current thread.
     */
    public static MemoryStack stackGet() {
        return TLS.get();
    }

    /**
     * Calls {@link #push} on the stack of the current thread.
     *
     * @return the stack of the current thread.
     */
    public static MemoryStack stackPush() {
        return stackGet().push();
    }

    /**
     * Calls {@link #pop} on the stack of the current thread.
     *
     * @return the stack of the current thread.
     */
    public static MemoryStack stackPop() {
        return stackGet().pop();
    }

    /**
     * Thread-local version of {@link #nmalloc(long, long)}.
     */
    public static MemorySegment nstackMalloc(long alignment, long size) {
        return stackGet().nmalloc(alignment, size);
    }

    /**
     * Thread-local version of {@link #ncalloc}.
     */
    public static MemorySegment nstackCalloc(long alignment, long num, long size) {
        return stackGet().ncalloc(alignment, num, size);
    }

    // -------------------------------------------------

    /**
     * Thread-local version of {@link #malloc(long) malloc}.
     */
    public static MemorySegment stackMalloc(long size) {
        return stackGet().malloc(size);
    }

    /**
     * Thread-local version of {@link #calloc(long) calloc}.
     */
    public static MemorySegment stackCalloc(long size) {
        return stackGet().calloc(size);
    }
}
