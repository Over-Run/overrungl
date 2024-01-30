/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import overrungl.Configurations;
import overrungl.OverrunGL;
import overrungl.Pointer;
import overrungl.internal.RuntimeHelper;

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
@Deprecated(since = "0.1.0")
public sealed class MemoryStack extends Pointer implements Arena {
    private static final boolean DEBUG = Configurations.DEBUG.get();
    private static final boolean DEBUG_STACK = Configurations.DEBUG_STACK.get();
    private static final long DEFAULT_STACK_SIZE = Configurations.STACK_SIZE.get() * 1024;
    private static final int DEFAULT_STACK_FRAMES = Configurations.STACK_FRAMES.get();
    private static final ThreadLocal<MemoryStack> TLS = ThreadLocal.withInitial(MemoryStack::create);

    static {
        CheckUtil.check(DEFAULT_STACK_SIZE > 0, "Invalid stack size.");
        CheckUtil.check(DEFAULT_STACK_FRAMES > 0, "Invalid stack frames.");
    }

    private final long size;

    private long pointer;

    private long[] frames;
    protected int frameIndex;

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory region.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param address the backing memory address
     * @param size    the backing memory size
     */
    protected MemoryStack(MemorySegment address, long size) {
        super(address);

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
        return create(capacity, Arena.ofAuto());
    }

    /**
     * Creates a new {@code MemoryStack} with the specified size and arena.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param capacity the maximum number of bytes that may be allocated on the stack
     * @param arena    the arena for allocating buffer
     */
    public static MemoryStack create(long capacity, Arena arena) {
        return create(arena.allocate(capacity), capacity);
    }

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory buffer.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param buffer the backing memory buffer
     * @param size   the memory buffer size
     */
    public static MemoryStack create(MemorySegment buffer, long size) {
        return DEBUG_STACK
            ? new DebugMemoryStack(buffer, size)
            : new MemoryStack(buffer, size);
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
            OverrunGL.apiLog(STR."[WARNING] Out of frame stack space (\{frames.length}) in thread: \{Thread.currentThread()}");
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

    @Override
    public MemorySegment.Scope scope() {
        return address().scope();
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

        DebugMemoryStack(MemorySegment address, long size) {
            super(address, size);
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
            OverrunGL.apiLog(String.format(
                "[OverrunGL] Asymmetric pop detected:\n\tPUSHED: %s\n\tPOPPED: %s\n\tTHREAD: %s\n",
                pushed,
                popped,
                Thread.currentThread()
            ));
        }
    }

    /**
     * {@return the address of the backing off-heap memory}
     *
     * <p>The stack grows "downwards", so the bottom of the stack is at {@code address + size}, while the top is at {@code address}.</p>
     */
    @Override
    public MemorySegment address() {
        return super.address();
    }

    /**
     * {@return the size of the backing off-heap memory}
     *
     * <p>This is the maximum number of bytes that may be allocated on the stack.</p>
     */
    public long getSize() {
        return size;
    }

    /**
     * {@return the current frame index}
     *
     * <p>This is the current number of nested {@link #push} calls.</p>
     */
    public int getFrameIndex() {
        return frameIndex;
    }

    /**
     * {@return the memory address at the current stack pointer}
     */
    public MemorySegment getPointerAddress() {
        return address().asSlice(pointer);
    }

    /**
     * {@return the current stack pointer}
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
        if (RuntimeHelper.CHECKS) {
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
    public MemorySegment malloc(long alignment, long size) {
        if (DEBUG) {
            MemoryUtil.checkAlignment(alignment);
        }

        // Align address to the specified alignment
        long rawLong = address().address();
        long address = (rawLong + pointer - size) & -alignment;

        pointer = address - rawLong;
        if (RuntimeHelper.CHECKS && pointer < 0) {
            throw new OutOfMemoryError("Out of stack space.");
        }

        return address().asSlice(pointer, size);
    }

    /**
     * Allocates a block of memory on the stack for an array of {@code num} elements, each of them {@code size} bytes long, and initializes all its bits to
     * zero.
     *
     * @param alignment the required element alignment
     * @param num       the number of elements to allocate
     * @param size      the size of each element
     * @return the memory address on the stack for the requested allocation
     */
    public MemorySegment ncalloc(long alignment, long num, long size) {
        if (DEBUG) {
            MemoryUtil.checkAlignment(alignment);
        }

        long bytes = num * size;
        var address = malloc(alignment, bytes);
        address.fill((byte) 0);
        return address;
    }

    // -------------------------------------------------

    /**
     * Calloc version of {@link #malloc(long, long)}.
     */
    public MemorySegment calloc(long alignment, long size) {
        return ncalloc(alignment, 1, size);
    }

    /**
     * Allocates a {@link MemorySegment} on the stack with {@code alignment} equal to {@link ValueLayout#byteSize() POINTER_SIZE}.
     *
     * @param size the allocation size
     * @return the memory address on the stack for the requested allocation
     */
    public MemorySegment malloc(long size) {
        return malloc(ADDRESS.byteAlignment(), size);
    }

    public MemorySegment malloc(MemoryLayout layout, long num) {
        return malloc(layout.byteAlignment(), num * layout.byteSize());
    }

    public MemorySegment malloc(MemoryLayout layout) {
        return malloc(layout.byteAlignment(), layout.byteSize());
    }

    /**
     * Calloc version of {@link #malloc(long)}.
     */
    public MemorySegment calloc(long size) {
        return ncalloc(ADDRESS.byteAlignment(), 1, size);
    }

    public MemorySegment calloc(MemoryLayout layout, long num) {
        return ncalloc(layout.byteAlignment(), num, layout.byteSize());
    }

    public MemorySegment calloc(MemoryLayout layout) {
        return calloc(layout, 1);
    }

    /**
     * Short version of {@link #malloc(long)}.
     */
    public MemorySegment mallocShort(long size) {
        return malloc(JAVA_SHORT, size);
    }

    /**
     * Short version of {@link #calloc(long)}.
     */
    public MemorySegment callocShort(long size) {
        return calloc(JAVA_SHORT, size);
    }

    /**
     * Int version of {@link #malloc(long)}.
     */
    public MemorySegment mallocInt(long size) {
        return malloc(JAVA_INT, size);
    }

    /**
     * Int version of {@link #calloc(long)}.
     */
    public MemorySegment callocInt(long size) {
        return calloc(JAVA_INT, size);
    }

    /**
     * Long version of {@link #malloc(long)}.
     */
    public MemorySegment mallocLong(long size) {
        return malloc(JAVA_LONG, size);
    }

    /**
     * Long version of {@link #calloc(long)}.
     */
    public MemorySegment callocLong(long size) {
        return calloc(JAVA_LONG, size);
    }

    /**
     * Float version of {@link #malloc(long)}.
     */
    public MemorySegment mallocFloat(long size) {
        return malloc(JAVA_FLOAT, size);
    }

    /**
     * Float version of {@link #calloc(long)}.
     */
    public MemorySegment callocFloat(long size) {
        return calloc(JAVA_FLOAT, size);
    }

    /**
     * Double version of {@link #malloc(long)}.
     */
    public MemorySegment mallocDouble(long size) {
        return malloc(JAVA_DOUBLE, size);
    }

    /**
     * Double version of {@link #calloc(long)}.
     */
    public MemorySegment callocDouble(long size) {
        return calloc(JAVA_DOUBLE, size);
    }

    /**
     * Pointer version of {@link #malloc(long)}.
     */
    public MemorySegment mallocPointer(long size) {
        return malloc(ADDRESS, size);
    }

    /**
     * Pointer version of {@link #calloc(long)}.
     */
    public MemorySegment callocPointer(long size) {
        return calloc(ADDRESS, size);
    }

    /**
     * Short version of {@link #malloc(long)}.
     */
    public MemorySegment mallocShort() {
        return malloc(JAVA_SHORT, 1);
    }

    /**
     * Short version of {@link #calloc(long)}.
     */
    public MemorySegment callocShort() {
        return calloc(JAVA_SHORT, 1);
    }

    /**
     * Int version of {@link #malloc(long)}.
     */
    public MemorySegment mallocInt() {
        return malloc(JAVA_INT, 1);
    }

    /**
     * Int version of {@link #calloc(long)}.
     */
    public MemorySegment callocInt() {
        return calloc(JAVA_INT, 1);
    }

    /**
     * Long version of {@link #malloc(long)}.
     */
    public MemorySegment mallocLong() {
        return malloc(JAVA_LONG, 1);
    }

    /**
     * Long version of {@link #calloc(long)}.
     */
    public MemorySegment callocLong() {
        return calloc(JAVA_LONG, 1);
    }

    /**
     * Float version of {@link #malloc(long)}.
     */
    public MemorySegment mallocFloat() {
        return malloc(JAVA_FLOAT, 1);
    }

    /**
     * Float version of {@link #calloc(long)}.
     */
    public MemorySegment callocFloat() {
        return calloc(JAVA_FLOAT, 1);
    }

    /**
     * Double version of {@link #malloc(long)}.
     */
    public MemorySegment mallocDouble() {
        return malloc(JAVA_DOUBLE, 1);
    }

    /**
     * Double version of {@link #calloc(long)}.
     */
    public MemorySegment callocDouble() {
        return calloc(JAVA_DOUBLE, 1);
    }

    /**
     * Pointer version of {@link #malloc(long)}.
     */
    public MemorySegment mallocPointer() {
        return malloc(ADDRESS, 1);
    }

    /**
     * Pointer version of {@link #calloc(long)}.
     */
    public MemorySegment callocPointer() {
        return calloc(ADDRESS, 1);
    }

    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment) throws IllegalArgumentException {
        MemoryUtil.checkByteSize(byteSize);
        MemoryUtil.checkAlignment(byteAlignment);
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
     * {@return the stack of the current thread}
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
     * Thread-local version of {@link #malloc(long, long)}.
     */
    public static MemorySegment stackMalloc(long alignment, long size) {
        return stackGet().malloc(alignment, size);
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
