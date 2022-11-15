/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.util;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.Configurations;
import org.overrun.glib.Pointer;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.util.Arrays;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static org.overrun.glib.Configurations.*;

/**
 * An off-heap memory stack.
 *
 * <p>This class should be used in a thread-local manner for stack allocations.</p>
 *
 * @author Spasi
 * @author lwjgl3
 * @author squid233
 * @see Configurations#STACK_SIZE
 * @see Configurations#DEBUG_STACK
 * @since 0.1.0
 */
public class MemoryStack extends Pointer implements AutoCloseable {
    private static final long DEFAULT_STACK_SIZE = STACK_SIZE.get() * 1024;
    private static final int DEFAULT_STACK_FRAMES = 8;
    private static final ThreadLocal<MemoryStack> TLS = ThreadLocal.withInitial(MemoryStack::create);

    static {
        if (DEFAULT_STACK_SIZE < 0) {
            throw new IllegalStateException("Invalid stack size.");
        }
    }

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    @Nullable
    private final MemoryAddress container;

    private final long size;

    // TODO: 2022/11/13 Long
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
     */
    protected MemoryStack(@Nullable MemoryAddress container, MemoryAddress address, long size) {
        super(address, null);
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
        return create(MemoryUtil.malloc(capacity), capacity);
    }

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory buffer.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param buffer the backing memory buffer
     * @param size   the memory buffer size
     */
    public static MemoryStack create(MemoryAddress buffer, long size) {
        var address = buffer.address();
        return DEBUG_STACK.get()
            ? new DebugMemoryStack(buffer, address, size)
            : new MemoryStack(buffer, address, size);
    }

    /**
     * Creates a new {@code MemoryStack} backed by the specified memory region.
     *
     * <p>In the initial state, there is no active stack frame. The {@link #push} method must be used before any allocations.</p>
     *
     * @param address the backing memory address
     * @param size    the backing memory size
     */
    public static MemoryStack ncreate(MemoryAddress address, long size) {
        return DEBUG_STACK.get()
            ? new DebugMemoryStack(null, address, size)
            : new MemoryStack(null, address, size);
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
        if (DEBUG.get()) {
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
     */
    private static final class DebugMemoryStack extends MemoryStack {
        private Object[] debugFrames;

        DebugMemoryStack(@Nullable MemoryAddress buffer, MemoryAddress address, long size) {
            super(buffer, address, size);
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
    public MemoryAddress address() {
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
    public MemoryAddress getPointerAddress() {
        return address().addOffset(pointer);
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
        if (CHECKS.get()) {
            checkPointer(pointer);
        }

        this.pointer = pointer;
    }

    private void checkPointer(long pointer) {
        if (pointer < 0 || size < pointer) {
            throw new IndexOutOfBoundsException("Invalid stack pointer");
        }
    }

    private static void checkAlignment(long alignment) {
        if (Long.bitCount(alignment) != 1) {
            throw new IllegalArgumentException("Alignment must be a power-of-two value.");
        }
    }

    /**
     * Calls {@link #nmalloc(long, long)} with {@code alignment} equal to {@link ValueLayout#byteSize() POINTER_SIZE}.
     *
     * @param size the allocation size
     * @return the memory address on the stack for the requested allocation
     */
    public MemoryAddress nmalloc(long size) {
        return nmalloc(ADDRESS.byteSize(), size);
    }

    /**
     * Allocates a block of {@code size} bytes of memory on the stack. The content of the newly allocated block of memory is not initialized, remaining with
     * indeterminate values.
     *
     * @param alignment the required alignment
     * @param size      the allocation size
     * @return the memory address on the stack for the requested allocation
     */
    public MemoryAddress nmalloc(long alignment, long size) {
        // Align address to the specified alignment
        long rawLong = address().toRawLongValue();
        long address = (rawLong + pointer - size) & -alignment;

        pointer = address - rawLong;
        if (CHECKS.get() && pointer < 0) {
            throw new OutOfMemoryError("Out of stack space.");
        }

        return MemoryAddress.ofLong(address);
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
    public MemoryAddress ncalloc(long alignment, long num, long size) {
        long bytes = num * size;
        var address = nmalloc(alignment, bytes);
        MemoryUtil.memset(address, 0, bytes);
        return address;
    }

    // -------------------------------------------------

    /**
     * Allocates an aligned {@link MemoryAddress} on the stack.
     *
     * @param alignment the required buffer alignment
     * @param size      the number of elements in the buffer
     * @return the allocated buffer
     */
    public MemoryAddress malloc(long alignment, long size) {
        if (DEBUG.get()) {
            checkAlignment(alignment);
        }
        return nmalloc(alignment, size);
    }

    /**
     * Calloc version of {@link #malloc(long, long)}.
     */
    public MemoryAddress calloc(long alignment, long size) {
        if (DEBUG.get()) {
            checkAlignment(alignment);
        }
        return ncalloc(alignment, size, 1);
    }

    /**
     * Allocates a {@link MemoryAddress} on the stack with {@code alignment} equal to {@link ValueLayout#byteSize() POINTER_SIZE}.
     *
     * @param size the number of elements in the buffer
     * @return the allocated buffer
     */
    public MemoryAddress malloc(long size) {
        return nmalloc(ADDRESS.byteSize(), size);
    }

    /**
     * Calloc version of {@link #malloc(long)}.
     */
    public MemoryAddress calloc(long size) {
        return ncalloc(ADDRESS.byteSize(), size, 1);
    }

    public MemoryAddress malloc(MemoryLayout layout) {
        return malloc(layout.byteSize());
    }

    public MemoryAddress calloc(MemoryLayout layout, long num) {
        return ncalloc(ADDRESS.byteSize(), num, layout.byteSize());
    }

    public MemoryAddress calloc(MemoryLayout layout) {
        return calloc(layout, 1);
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
     * Thread-local version of {@link #nmalloc(long)}.
     */
    public static MemoryAddress nstackMalloc(long size) {
        return stackGet().nmalloc(size);
    }

    /**
     * Thread-local version of {@link #nmalloc(long, long)}.
     */
    public static MemoryAddress nstackMalloc(long alignment, long size) {
        return stackGet().nmalloc(alignment, size);
    }

    /**
     * Thread-local version of {@link #ncalloc}.
     */
    public static MemoryAddress nstackCalloc(long alignment, long num, long size) {
        return stackGet().ncalloc(alignment, num, size);
    }

    // -------------------------------------------------

    /**
     * Thread-local version of {@link #malloc(long) malloc}.
     */
    public static MemoryAddress stackMalloc(long size) {
        return stackGet().malloc(size);
    }

    /**
     * Thread-local version of {@link #calloc(long) calloc}.
     */
    public static MemoryAddress stackCalloc(long size) {
        return stackGet().calloc(size);
    }
}
