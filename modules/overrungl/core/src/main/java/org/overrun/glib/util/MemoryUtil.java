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
import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import static org.overrun.glib.FunctionDescriptors.*;

/**
 * The standard-C memory allocator.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class MemoryUtil {
    private static final SymbolLookup LOOKUP = RuntimeHelper.LINKER.defaultLookup();
    private static final MethodHandle
        m_malloc = downcall("malloc", JP),
        m_calloc = downcall("calloc", JJP),
        m_realloc = downcall("realloc", PJP),
        m_free = downcall("free", PV),
        m_memcpy = downcall("memcpy", PPJP),
        m_memmove = downcall("memmove", PPJP),
        m_memset = downcall("memset", PIJP);
    private static final boolean DEBUG = Configurations.DEBUG_MEM_UTIL.get();

    private static MethodHandle downcall(String name, FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(LOOKUP.find(name), function);
    }

    /**
     * constructor
     */
    private MemoryUtil() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * Allocates memory blocks.
     * <p>
     * The {@code malloc} function allocates a memory block of at least <i>{@code size}</i> bytes. The block may be
     * larger than <i>{@code size}</i> bytes because of the space that's required for alignment and maintenance
     * information.
     *
     * @param size Bytes to allocate.
     * @return {@code malloc} returns a void pointer to the allocated space, or {@link MemorySegment#NULL NULL}
     * if there is insufficient memory available. The storage space pointed to by the return value is suitably aligned
     * for storage of any type of object that has an alignment requirement less than or equal to that of the fundamental
     * alignment.
     * @see #malloc(MemoryLayout)
     */
    public static MemorySegment malloc(long size) {
        try {
            long address = ((MemorySegment) m_malloc.invokeExact(size)).address();
            MemorySegment segment = MemorySegment.ofAddress(address, size);
            if (DEBUG) DebugAllocator.track(address, size);
            return segment;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Allocates memory blocks.
     * <p>
     * The {@code malloc} function allocates a memory block of at least <i>{@code size}</i> bytes. The block may be
     * larger than <i>{@code size}</i> bytes because of the space that's required for alignment and maintenance
     * information.
     *
     * @param layout Bytes to allocate.
     * @return {@code malloc} returns a void pointer to the allocated space, or {@link MemorySegment#NULL NULL}
     * if there is insufficient memory available. The storage space pointed to by the return value is suitably aligned
     * for storage of any type of object that has an alignment requirement less than or equal to that of the fundamental
     * alignment.
     * @see #malloc(long)
     */
    public static MemorySegment malloc(MemoryLayout layout) {
        return malloc(layout.byteSize());
    }

    /**
     * Allocates an array in memory with elements initialized to 0.
     * <p>
     * The {@code calloc} function allocates storage space for an array of <i>{@code number}</i>
     * elements, each of length <i>{@code size}</i> bytes. Each element is initialized to 0.
     *
     * @param number Number of elements.
     * @param size   Length in bytes of each element.
     * @return {@code calloc} returns a pointer to the allocated space. The storage space pointed to by the
     * return value is suitably aligned for storage of any type of object.
     * @see #calloc(long, MemoryLayout)
     */
    public static MemorySegment calloc(long number, long size) {
        try {
            long address = ((MemorySegment) m_calloc.invokeExact(number, size)).address();
            long bytesSize = number * size;
            MemorySegment segment = MemorySegment.ofAddress(address, bytesSize);
            if (DEBUG) DebugAllocator.track(address, bytesSize);
            return segment;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Allocates an array in memory with elements initialized to 0.
     * <p>
     * The {@code calloc} function allocates storage space for an array of <i>{@code number}</i>
     * elements, each of length <i>{@code size}</i> bytes. Each element is initialized to 0.
     *
     * @param number Number of elements.
     * @param layout Length in bytes of each element.
     * @return {@code calloc} returns a pointer to the allocated space. The storage space pointed to by the
     * return value is suitably aligned for storage of any type of object.
     * @see #calloc(long, long)
     */
    public static MemorySegment calloc(long number, MemoryLayout layout) {
        return calloc(number, layout.byteSize());
    }

    /**
     * Reallocate memory blocks.
     * <p>
     * The {@code realloc} function changes the size of an allocated memory block.
     * The <i>{@code memblock}</i> argument points to the beginning of the memory block.
     * If <i>{@code memblock}</i> is {@code NULL}, {@code realloc} behaves the same way as {@code malloc}
     * and allocates a new block of <i>{@code size}</i> bytes. If <i>{@code memblock}</i> is not {@code NULL},
     * it should be a pointer returned by a previous call to {@code calloc}, {@code malloc}, or {@code realloc}.
     * <p>
     * The <i>{@code size}</i> argument gives the new size of the block, in bytes.
     * The contents of the block are unchanged up to the shorter of the new and old sizes,
     * although the new block can be in a different location. Because the new block can be in a new memory location,
     * the pointer returned by {@code realloc} is not guaranteed to be the pointer passed
     * through the <i>{@code memblock}</i> argument. {@code realloc} does not zero newly allocated memory
     * in the case of buffer growth.
     *
     * @param memblock Pointer to previously allocated memory block.
     * @param size     New size in bytes.
     * @return {@code realloc} returns a {@code void} pointer to the reallocated (and possibly moved) memory block.
     * <p>
     * If there is not enough available memory to expand the block to the given size,
     * the original block is left unchanged, and {@code NULL} is returned.
     * <p>
     * If <i>{@code size}</i> is zero, then the block pointed to by <i>{@code memblock}</i> is freed;
     * the return value is {@code NULL}, and <i>{@code memblock}</i> is left pointing at a freed block.
     * <p>
     * The return value points to a storage space that is suitably aligned for storage of any type of object.
     */
    public static MemorySegment realloc(@Nullable MemorySegment memblock, long size) {
        long ptr = RuntimeHelper.NULL;
        long oldSize = 0;
        if (DEBUG) {
            ptr = memblock != null ? memblock.address() : RuntimeHelper.NULL;
            oldSize = DebugAllocator.untrack(ptr);
        }
        try {
            MemorySegment segment = RuntimeHelper.sizedSegment((MemorySegment) m_realloc.invokeExact(
                Objects.requireNonNullElse(memblock, MemorySegment.NULL),
                size), size);
            if (DEBUG) {
                if (segment.address() != RuntimeHelper.NULL) {
                    DebugAllocator.track(segment.address(), size);
                } else if (size != 0L) {
                    DebugAllocator.track(ptr, oldSize);
                }
            }
            return segment;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Deallocates or frees a memory block.
     * <p>
     * The {@code free} function deallocates a memory block (<i>{@code memblock}</i>) that was
     * previously allocated by a call to {@code calloc}, {@code malloc}, or {@code realloc}.
     * The number of freed bytes is equivalent to the number of bytes requested when the block
     * was allocated (or reallocated, in the case of {@code realloc}).
     * If <i>{@code memblock}</i> is {@code NULL}, the pointer is ignored and free immediately returns.
     * Attempting to free an invalid pointer (a pointer to a memory block that wasn't allocated by {@code calloc},
     * {@code malloc}, or {@code realloc}) may affect subsequent allocation requests and cause errors.
     *
     * @param memblock Previously allocated memory block to be freed.
     */
    public static void free(@Nullable MemorySegment memblock) {
        if (DEBUG) DebugAllocator.untrack(memblock != null ? memblock.address() : RuntimeHelper.NULL);
        if (memblock == null || memblock.address() == RuntimeHelper.NULL) return;
        try {
            m_free.invokeExact(memblock);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Copies bytes between buffers.
     * <p>
     * {@code memcpy} copies <i>{@code count}</i> bytes from <i>{@code src}</i> to <i>{@code dest}</i>.
     * If the source and destination overlap, the behavior of {@code memcpy} is undefined.
     * Use {@code memmove} to handle overlapping regions.
     * <p>
     * Make sure that the destination buffer is the same size or larger than the source buffer.
     *
     * @param dest  New buffer.
     * @param src   Buffer to copy from.
     * @param count Number of characters to copy.
     * @return The value of <i>{@code dest}</i>.
     */
    public static MemorySegment memcpy(MemorySegment dest, MemorySegment src, long count) {
        try {
            RuntimeHelper.consume((MemorySegment) m_memcpy.invokeExact(dest, src, count));
            return dest;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Moves one buffer to another.
     * <p>
     * Copies <i>{@code count}</i> bytes from <i>{@code src}</i> to <i>{@code dest}</i>.
     * If some regions of the source area and the destination overlap,
     * both functions ensure that the original source bytes in the overlapping region
     * are copied before being overwritten.
     * <p>
     * <b>Security Note</b> Make sure that the destination buffer is the same size
     * or larger than the source buffer.
     *
     * @param dest  Destination object.
     * @param src   Source object.
     * @param count Number of bytes to copy.
     * @return The value of <i>{@code dest}</i>.
     */
    public static MemorySegment memmove(MemorySegment dest, MemorySegment src, long count) {
        try {
            RuntimeHelper.consume((MemorySegment) m_memmove.invokeExact(dest, src, count));
            return dest;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Sets a buffer to a specified character.
     * <p>
     * Sets the first <i>{@code count}</i> characters of <i>{@code dest}</i>
     * to the character <i>{@code c}</i>.
     * <p>
     * <b>Security Note</b> Make sure that the destination buffer has enough room
     * for at least <i>{@code count}</i> characters.
     *
     * @param dest  Pointer to destination.
     * @param c     Character to set.
     * @param count Number of characters.
     * @return The value of <i>{@code dest}</i>.
     */
    public static MemorySegment memset(MemorySegment dest, int c, long count) {
        try {
            RuntimeHelper.consume((MemorySegment) m_memset.invokeExact(dest, c, count));
            return dest;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
