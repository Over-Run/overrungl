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

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

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
        m_malloc = downcall("malloc", IP),
        m_calloc = downcall("calloc", IIP),
        m_realloc = downcall("realloc", PIP),
        m_free = downcall("free", PV);

    private static MethodHandle downcall(String name, FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(LOOKUP.lookup(name), function);
    }

    /**
     * Allocates memory blocks.
     *
     * @param size Bytes to allocate.
     * @return {@code malloc} returns a void pointer to the allocated space, or {@link MemoryAddress#NULL NULL}
     * if there is insufficient memory available.
     */
    public static MemoryAddress malloc(int size) {
        try {
            return (MemoryAddress) m_malloc.invoke(size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
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
     */
    public static MemoryAddress calloc(int number, int size) {
        try {
            return (MemoryAddress) m_calloc.invoke(number, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
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
    public static MemoryAddress realloc(MemoryAddress memblock, int size) {
        try {
            return (MemoryAddress) m_realloc.invoke(memblock, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
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
    public static void free(MemoryAddress memblock) {
        try {
            m_free.invoke(memblock);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}
