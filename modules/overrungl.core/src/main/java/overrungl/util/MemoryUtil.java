/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.util.CanonicalTypes.SIZE_T;

/// Utilities of memory segment.
///
/// ## C memory allocator
///
/// This class supports C-style memory allocation via [malloc][#malloc(long)], [calloc][#calloc(long, long)]
/// and [free][#free(MemorySegment)].
///
/// ## Null-safe allocator
///
/// This class adds null-safe allocating methods for [String] and arrays.
/// For `null` values, those methods return [NULL][MemorySegment#NULL].
///
/// ## Reinterpreting string
///
/// This class provides `nativeString` methods to get a string from a zero-length memory segment.
///
/// ## Copying
///
/// This class provides `copy` methods to copy content from a memory segment to an array.
///
/// ## Widening and narrowing
///
/// This class adds `wideningTo*` and `narrowing*` methods to converts a value
/// whose byte size varies between platforms.
///
/// The memory layouts of those values are often canonical layouts defined in [CanonicalTypes].
///
/// @author squid233
/// @since 0.1.0
public final class MemoryUtil {
    //region C-standard memory allocator

    private static final long MAX_MALLOC_ALIGN = ADDRESS.byteSize() == 4 ? 8 : 16;

    public static final FunctionDescriptor
        FD_malloc = FunctionDescriptor.of(ADDRESS, SIZE_T),
        FD_calloc = FunctionDescriptor.of(ADDRESS, SIZE_T, SIZE_T),
        FD_realloc = FunctionDescriptor.of(ADDRESS, ADDRESS, SIZE_T),
        FD_free = FunctionDescriptor.ofVoid(ADDRESS),
        FD_memcpy = FunctionDescriptor.of(ADDRESS, ADDRESS, ADDRESS, SIZE_T),
        FD_memmove = FunctionDescriptor.of(ADDRESS, ADDRESS, ADDRESS, SIZE_T),
        FD_memset = FunctionDescriptor.of(ADDRESS, ADDRESS, JAVA_INT, SIZE_T),
        FD_aligned_alloc = FunctionDescriptor.of(ADDRESS, SIZE_T, SIZE_T),
        FD__aligned_malloc = FunctionDescriptor.of(ADDRESS, SIZE_T, SIZE_T),
        FD__aligned_realloc = FunctionDescriptor.of(ADDRESS, ADDRESS, SIZE_T, SIZE_T),
        FD__aligned_free = FunctionDescriptor.ofVoid(ADDRESS);

    private static final class Handles {
        private static final Linker LINKER = Linker.nativeLinker();
        private static final SymbolLookup LOOKUP = LINKER.defaultLookup();
        private static final MethodHandle
            m_malloc = downcall("malloc", FD_malloc),
            m_calloc = downcall("calloc", FD_calloc),
            m_realloc = downcall("realloc", FD_realloc),
            m_free = downcall("free", FD_free),
            m_memcpy = downcall("memcpy", FD_memcpy),
            m_memmove = downcall("memmove", FD_memmove),
            m_memset = downcall("memset", FD_memset);
        private static final MethodHandle MH_aligned_alloc = LINKER.downcallHandle(FD_aligned_alloc);
        private static final MethodHandle MH__aligned_malloc = LINKER.downcallHandle(FD__aligned_malloc);
        private static final MethodHandle MH__aligned_realloc = LINKER.downcallHandle(FD__aligned_realloc);
        private static final MethodHandle MH__aligned_free = LINKER.downcallHandle(FD__aligned_free);
        private static final MemorySegment PFN_aligned_alloc = LOOKUP.find("aligned_alloc").orElse(MemorySegment.NULL);
        private static final MemorySegment PFN__aligned_malloc = LOOKUP.find("_aligned_malloc").orElse(MemorySegment.NULL);
        private static final MemorySegment PFN__aligned_realloc = LOOKUP.find("_aligned_realloc").orElse(MemorySegment.NULL);
        private static final MemorySegment PFN__aligned_free = LOOKUP.find("_aligned_free").orElse(MemorySegment.NULL);

        private static MethodHandle downcall(String name, FunctionDescriptor function) {
            return LINKER.downcallHandle(LOOKUP.findOrThrow(name), function);
        }
    }

    private MemoryUtil() {
        throw new IllegalStateException("Do not construct instance");
    }

    /// Aligns a number to the specified byte alignment constraint.
    ///
    /// This method calculates the smallest aligned value that is greater than or equal to `n`
    /// and is a multiple of `byteAlignment`. The byte alignment must be a power of two.
    ///
    /// @param n             The number to be aligned
    /// @param byteAlignment the alignment constraint
    /// @return the smallest aligned value greater than or equal to `n` that is a multiple of `byteAlignment`
    /// @throws IllegalArgumentException if `byteAlignment <= 0` or `byteAlignment` is not a power of 2
    public static long alignUp(long n, long byteAlignment) {
        checkAlignment(byteAlignment);
        return (n + byteAlignment - 1) & -byteAlignment;
    }

    /**
     * Checks whether <i>{@code byteSize}</i> is greater than 0 or equals to 0.
     *
     * @param byteSize the size, in bytes.
     * @throws IllegalArgumentException if <i>{@code byteSize}</i> {@code < 0}.
     */
    public static void checkByteSize(long byteSize) throws IllegalArgumentException {
        if (byteSize < 0) {
            throw new IllegalArgumentException("byteSize must be >= 0.");
        }
    }

    /**
     * Checks whether <i>{@code alignment}</i> is greater than 0 and is a power-of-two value.
     *
     * @param alignment the alignment, in bytes.
     * @throws IllegalArgumentException if <i>{@code alignment}</i> {@code <= 0},
     *                                  or if <i>{@code alignment}</i> is not a power of 2.
     */
    public static void checkAlignment(long alignment) throws IllegalArgumentException {
        if (alignment <= 0) {
            throw new IllegalArgumentException("Alignment must be > 0.");
        }
        if (Long.bitCount(alignment) != 1) {
            throw new IllegalArgumentException("Alignment must be a power-of-two value.");
        }
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
     * @see #aligned_alloc(long, long)
     */
    public static @NonNull MemorySegment malloc(long size) {
        try {
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ -> (MemorySegment) Handles.m_malloc.invokeExact(Math.toIntExact(size));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_malloc.invokeExact(size);
                default -> throw new AssertionError();
            };
            return isNullPointer(segment) ? segment : segment.reinterpret(size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * The layout version of {@link #malloc(long)}.
     *
     * @param layout the memory layout.
     * @return the allocated space.
     * @see #malloc(long)
     */
    public static @NonNull MemorySegment malloc(@NonNull MemoryLayout layout) {
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
     * @see #aligned_alloc(long, long)
     */
    public static @NonNull MemorySegment calloc(long number, long size) {
        try {
            long byteSize = number * size;
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ ->
                    (MemorySegment) Handles.m_calloc.invokeExact(Math.toIntExact(number), Math.toIntExact(size));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_calloc.invokeExact(number, size);
                default -> throw new AssertionError();
            };
            return isNullPointer(segment) ? segment : segment.reinterpret(byteSize);
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
    public static @NonNull MemorySegment calloc(long number, @NonNull MemoryLayout layout) {
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
     * @return {@code realloc} returns a {@link MemorySegment} to the reallocated (and possibly moved) memory block.
     * <p>
     * If there is not enough available memory to expand the block to the given size,
     * the original block is left unchanged, and {@code NULL} is returned.
     * <p>
     * If <i>{@code size}</i> is zero, then the block pointed to by <i>{@code memblock}</i> is freed;
     * the return value is {@code NULL}, and <i>{@code memblock}</i> is left pointing at a freed block.
     * <p>
     * The return value points to a storage space that is suitably aligned for storage of any type of object.
     * @see #aligned_realloc(MemorySegment, long, long)
     */
    public static @NonNull MemorySegment realloc(@Nullable MemorySegment memblock, long size) {
        try {
            final MemorySegment mem = memblock != null ? memblock : MemorySegment.NULL;
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ -> (MemorySegment) Handles.m_realloc.invokeExact(mem, Math.toIntExact(size));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_realloc.invokeExact(mem, size);
                default -> throw new AssertionError();
            };
            return isNullPointer(segment) ? segment : segment.reinterpret(size);
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
     * @see #aligned_free(MemorySegment)
     */
    public static void free(@Nullable MemorySegment memblock) {
        if (isNullPointer(memblock)) return;
        try {
            Handles.m_free.invokeExact(memblock);
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
    public static @NonNull MemorySegment memcpy(@NonNull MemorySegment dest, @NonNull MemorySegment src, long count) {
        try {
            final var _ = switch (SIZE_T) {
                case ValueLayout.OfInt _ ->
                    (MemorySegment) Handles.m_memcpy.invokeExact(dest, src, Math.toIntExact(count));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_memcpy.invokeExact(dest, src, count);
                default -> throw new AssertionError();
            };
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
    public static @NonNull MemorySegment memmove(@NonNull MemorySegment dest, @NonNull MemorySegment src, long count) {
        try {
            final var _ = switch (SIZE_T) {
                case ValueLayout.OfInt _ ->
                    (MemorySegment) Handles.m_memmove.invokeExact(dest, src, Math.toIntExact(count));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_memmove.invokeExact(dest, src, count);
                default -> throw new AssertionError();
            };
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
    public static @NonNull MemorySegment memset(@NonNull MemorySegment dest, int c, long count) {
        try {
            final var _ = switch (SIZE_T) {
                case ValueLayout.OfInt _ ->
                    (MemorySegment) Handles.m_memset.invokeExact(dest, c, Math.toIntExact(count));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_memset.invokeExact(dest, c, count);
                default -> throw new AssertionError();
            };
            return dest;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Allocate {@code size} bytes of uninitialized storage whose alignment is specified by {@code alignment}.
     * The {@code size} parameter must be an integral multiple of {@code alignment}.
     *
     * <h4>Reference</h4>
     * <ul>
     *     <li><a href="https://en.cppreference.com/w/c/memory/aligned_alloc">{@code aligned_alloc}</a></li>
     *     <li><a href="https://learn.microsoft.com/en-us/cpp/c-runtime-library/reference/aligned-malloc?view=msvc-170">{@code _aligned_malloc}</a> for Windows</li>
     * </ul>
     *
     * <h4>Implementation Note</h4>
     * As an example of the "supported by the implementation" requirement,
     * POSIX function {@code posix_memalign} accepts any {@code alignment} that is a power of two and a multiple of {@code sizeof(void *)},
     * and POSIX-based implementations of {@code aligned_alloc} inherit these requirements.
     * For Windows, {@code alignment} must be an integer power of 2.
     *
     * @param alignment specifies the alignment. Must be a valid alignment <strong>supported by the implementation</strong>.
     * @param size      number of bytes to allocate. An integral multiple of {@code alignment}
     * @return On success, returns the pointer to the beginning of newly allocated memory.
     * To avoid a memory leak, the returned pointer must be deallocated with {@link #aligned_free(MemorySegment)}
     * or {@link #aligned_realloc(MemorySegment, long, long)}.
     * <p>
     * On failure, returns a {@linkplain MemorySegment#NULL null pointer}.
     * @see #malloc(long)
     * @see #calloc(long, long)
     */
    public static @NonNull MemorySegment aligned_alloc(long alignment, long size) {
        try {
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ -> !isNullPointer(Handles.PFN_aligned_alloc)
                    ? (MemorySegment) Handles.MH_aligned_alloc.invokeExact(Handles.PFN_aligned_alloc, Math.toIntExact(alignment), Math.toIntExact(size))
                    : (MemorySegment) Handles.MH__aligned_malloc.invokeExact(Handles.PFN__aligned_malloc, Math.toIntExact(size), Math.toIntExact(alignment));
                case ValueLayout.OfLong _ -> !isNullPointer(Handles.PFN_aligned_alloc)
                    ? (MemorySegment) Handles.MH_aligned_alloc.invokeExact(Handles.PFN_aligned_alloc, alignment, size)
                    : (MemorySegment) Handles.MH__aligned_malloc.invokeExact(Handles.PFN__aligned_malloc, size, alignment);
                default -> throw new AssertionError();
            };
            return isNullPointer(segment) ? segment : segment.reinterpret(size);
        } catch (Throwable e) {
            throw new RuntimeException("error in aligned_alloc", e);
        }
    }

    /**
     * Changes the size of a memory block that was allocated with {@linkplain #aligned_alloc(long, long) _aligned_malloc} or _aligned_offset_malloc.
     *
     * <h4>Reference</h4>
     * <ul>
     *     <li><a href="https://learn.microsoft.com/en-us/cpp/c-runtime-library/reference/aligned-realloc?view=msvc-170">{@code _aligned_realloc}</a> for Windows</li>
     * </ul>
     *
     * @param memblock  The current memory block pointer.
     * @param size      The size of the requested memory allocation.
     * @param alignment The alignment value, which must be an integer power of 2.
     * @return {@code _aligned_realloc} returns a void pointer to the reallocated (and possibly moved) memory block.
     * The return value is {@code NULL} if the size is zero and the buffer argument isn't {@code NULL},
     * or if there isn't enough available memory to expand the block to the given size.
     * In the first case, the original block is freed.
     * In the second, the original block is unchanged.
     * The return value points to a storage space that is suitably aligned for storage of any type of object.
     * To get a pointer to a type other than void, use a type cast on the return value.
     * <p>
     * It's an error to reallocate memory and change the alignment of a block.
     * @see #realloc(MemorySegment, long)
     */
    public static @NonNull MemorySegment aligned_realloc(@Nullable MemorySegment memblock, long size, long alignment) {
        try {
            MemorySegment mem = memblock != null ? memblock : MemorySegment.NULL;
            MemorySegment segment = !isNullPointer(Handles.PFN__aligned_realloc) ? switch (SIZE_T) {
                case ValueLayout.OfInt _ ->
                    (MemorySegment) Handles.MH__aligned_realloc.invokeExact(Handles.PFN__aligned_realloc, mem, Math.toIntExact(size), Math.toIntExact(alignment));
                case ValueLayout.OfLong _ ->
                    (MemorySegment) Handles.MH__aligned_realloc.invokeExact(Handles.PFN__aligned_realloc, mem, size, alignment);
                default -> throw new AssertionError();
            } : realloc(memblock, size);
            return isNullPointer(segment) ? segment : segment.reinterpret(size);
        } catch (Throwable e) {
            throw new RuntimeException("error in aligned_realloc", e);
        }
    }

    /// Frees a block of memory that was allocated with [_aligned_malloc][#aligned_alloc(long, long)] or _aligned_offset_malloc.
    ///
    /// #### Reference
    ///
    /// - [`_aligned_free`](https://learn.microsoft.com/en-us/cpp/c-runtime-library/reference/aligned-free?view=msvc-170) for Windows
    ///
    /// @param memblock A pointer to the memory block that was returned to the `_aligned_malloc` or `_aligned_offset_malloc` function.
    /// @see #free(MemorySegment)
    public static void aligned_free(@Nullable MemorySegment memblock) {
        if (isNullPointer(memblock)) return;
        if (isNullPointer(Handles.PFN__aligned_free)) {
            free(memblock);
        } else {
            try {
                Handles.MH__aligned_free.invokeExact(Handles.PFN__aligned_free, memblock);
            } catch (Throwable e) {
                throw new RuntimeException("error in aligned_free", e);
            }
        }
    }

    /**
     * Creates a segment allocator associated with the given arena,
     * which automatically {@linkplain #free(MemorySegment) releases} the allocated memory when the arena closes.
     *
     * @param arena the arena to be associated with
     * @return the segment allocator which allocates <strong>uninitialized</strong> memory
     * with {@link #malloc(long) malloc} whose address is aligned according the provided alignment constraint
     */
    public static @NonNull SegmentAllocator allocator(@NonNull Arena arena) {
        Objects.requireNonNull(arena);
        return (byteSize, byteAlignment) -> {
            checkByteSize(byteSize);
            checkAlignment(byteAlignment);
            long alignedSize = Math.max(1, byteAlignment > MAX_MALLOC_ALIGN ? byteSize + (byteAlignment - 1) : byteSize);
            MemorySegment segment = malloc(alignedSize);
            if (isNullPointer(segment)) {
                return segment;
            }
            segment = segment.reinterpret(arena, MemoryUtil::free);
            if (alignedSize != byteSize) {
                long address = segment.address();
                long alignedAddress = alignUp(address, byteAlignment);
                segment = segment.asSlice(alignedAddress - address, byteSize);
            }
            return segment;
        };
    }

    //endregion

    //region Downcall utils

    /// Allocates a string with the given segment allocator.
    ///
    /// @param allocator the allocator
    /// @param string    the string
    /// @param charset   the charset of the string; defaults to UTF-8
    /// @return the allocated segment; or `NULL` if _`string`_ is `null`
    public static @NonNull MemorySegment allocString(SegmentAllocator allocator, @Nullable String string, Charset charset) {
        if (string == null) return MemorySegment.NULL;
        return allocator.allocateFrom(string, charset);
    }

    /// Allocates a string with the given segment allocator.
    ///
    /// @param allocator the allocator
    /// @param string    the string
    /// @return the allocated segment; or `NULL` if _`string`_ is `null`
    public static @NonNull MemorySegment allocString(SegmentAllocator allocator, @Nullable String string) {
        if (string == null) return MemorySegment.NULL;
        return allocator.allocateFrom(string);
    }

    /// Allocates a string with the [auto arena][Arena#ofAuto()].
    ///
    /// The allocated segment is managed with the garbage collector,
    /// and you should only use it if its usage doesn't hold it.
    ///
    /// @param string  the string
    /// @param charset the charset of the string; defaults to UTF-8
    /// @return the allocated segment; or `NULL` if _`string`_ is `null`
    public static @NonNull MemorySegment allocString(@Nullable String string, Charset charset) {
        return allocString(Arena.ofAuto(), string, charset);
    }

    /// Allocates a string encoded with UTF-8 with the [auto arena][Arena#ofAuto()].
    ///
    /// The allocated segment is managed with the garbage collector,
    /// and you should only use it if its usage doesn't hold it.
    ///
    /// @param string the string
    /// @return the allocated segment; or `NULL` if _`string`_ is `null`
    public static @NonNull MemorySegment allocString(@Nullable String string) {
        return allocString(Arena.ofAuto(), string);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, char @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_CHAR, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, byte @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_BYTE, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, short @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_SHORT, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, int @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_INT, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, long @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_LONG, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, float @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_FLOAT, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, double @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_DOUBLE, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, MemorySegment @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        MemorySegment segment = allocator.allocate(ADDRESS, arr.length);
        for (int i = 0; i < arr.length; i++) {
            segment.setAtIndex(ADDRESS, i, arr[i]);
        }
        return segment;
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @param charset   the charset of the string
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, String @Nullable [] arr, Charset charset) {
        if (arr == null) return MemorySegment.NULL;
        MemorySegment segment = allocator.allocate(ADDRESS, arr.length);
        for (int i = 0; i < arr.length; i++) {
            segment.setAtIndex(ADDRESS, i, allocString(allocator, arr[i], charset));
        }
        return segment;
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static @NonNull MemorySegment allocArray(SegmentAllocator allocator, String @Nullable [] arr) {
        return allocArray(allocator, arr, StandardCharsets.UTF_8);
    }

    /// Converts a `long` to another type whose size might be smaller than `long`. This is usually used by `long` and `size_t`.
    ///
    /// @param layout the actual value layout of the result
    /// @param value  the value to be converted
    /// @return the result
    public static @NonNull Object narrowingLong(@NonNull ValueLayout layout, long value) {
        return switch (layout) {
            case OfByte _ -> (byte) value;
            case OfChar _ -> (char) value;
            case OfShort _ -> (short) value;
            case OfInt _ -> (int) value;
            case OfLong _ -> value;
            default -> throw new IllegalArgumentException("Not representing an integral type: " + layout);
        };
    }

    /// Converts a `int` to another type whose size might be smaller than `int`. This is usually used by `wchar_t`.
    ///
    /// @param layout the actual value layout of the result
    /// @param value  the value to be converted
    /// @return the result
    public static @NonNull Object narrowingInt(@NonNull ValueLayout layout, int value) {
        return switch (layout) {
            case OfByte _ -> (byte) value;
            case OfChar _ -> (char) value;
            case OfShort _ -> (short) value;
            case OfInt _ -> value;
            case OfLong _ -> (long) value;
            default -> throw new IllegalArgumentException("Not representing an integral type: " + layout);
        };
    }

    //endregion

    //region Upcall utils

    /**
     * The max string size.
     */
    public static final long STR_SIZE = Integer.MAX_VALUE - 8;
    /**
     * The address layout which dereferences a string with {@linkplain #STR_SIZE the max size}.
     */
    public static final AddressLayout STR_LAYOUT = ADDRESS.withTargetLayout(
        MemoryLayout.sequenceLayout(STR_SIZE, JAVA_BYTE)
    );

    /**
     * {@return {@code true} if the given segment is a null pointer; {@code false} otherwise}
     *
     * @param segment the native segment
     */
    public static boolean isNullPointer(@Nullable MemorySegment segment) {
        return segment == null || segment.equals(MemorySegment.NULL);
    }

    /// Gets the string from the given segment.
    ///
    /// The segment will be reinterpreted if it is a zero-length segment.
    ///
    /// @param segment the segment
    /// @param charset the charset of the string; defaults to UTF-8
    /// @return the string; or `null` if _`segment`_ is `NULL`
    public static @Nullable String nativeString(@Nullable MemorySegment segment, Charset charset) {
        if (isNullPointer(segment)) return null;
        return (segment.byteSize() == 0 ? segment.reinterpret(STR_SIZE) : segment)
            .getString(0, charset);
    }

    /// Gets the string encoded with UTF-8 from the given segment.
    ///
    /// The segment will be reinterpreted if it is a zero-length segment.
    ///
    /// @param segment the segment
    /// @return the string; or `null` if _`segment`_ is `NULL`
    public static @Nullable String nativeString(@Nullable MemorySegment segment) {
        return nativeString(segment, StandardCharsets.UTF_8);
    }

    /// Gets chars from the given segment.
    ///
    /// @param segment the segment
    /// @return the char array; or `null` if _`segment`_ is `NULL`
    public static char @Nullable [] asCharArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_CHAR);
    }

    /// Gets bytes from the given segment.
    ///
    /// @param segment the segment
    /// @return the byte array; or `null` if _`segment`_ is `NULL`
    public static byte @Nullable [] asByteArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_BYTE);
    }

    /// Gets shorts from the given segment.
    ///
    /// @param segment the segment
    /// @return the short array; or `null` if _`segment`_ is `NULL`
    public static short @Nullable [] asShortArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_SHORT);
    }

    /// Gets integers from the given segment.
    ///
    /// @param segment the segment
    /// @return the int array; or `null` if _`segment`_ is `NULL`
    public static int @Nullable [] asIntArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_INT);
    }

    /// Gets longs from the given segment.
    ///
    /// @param segment the segment
    /// @return the long array; or `null` if _`segment`_ is `NULL`
    public static long @Nullable [] asLongArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_LONG);
    }

    /// Gets floats from the given segment.
    ///
    /// @param segment the segment
    /// @return the float array; or `null` if _`segment`_ is `NULL`
    public static float @Nullable [] asFloatArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_FLOAT);
    }

    /// Gets doubles from the given segment.
    ///
    /// @param segment the segment
    /// @return the double array; or `null` if _`segment`_ is `NULL`
    public static double @Nullable [] asDoubleArray(@Nullable MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_DOUBLE);
    }

    /// Gets addresses from the given segment.
    ///
    /// The returned segments are zero-length segments.
    ///
    /// @param segment the segment
    /// @return the address array; or `null` if _`segment`_ is `NULL`
    public static MemorySegment @Nullable [] asAddressArray(@Nullable MemorySegment segment) {
        if (isNullPointer(segment)) return null;
        return segment.elements(ADDRESS)
            .map(s -> s.get(ADDRESS, 0))
            .toArray(MemorySegment[]::new);
    }

    /// Gets strings from the given segment.
    ///
    /// @param segment the segment
    /// @param charset the charset of the string; defaults to UTF-8
    /// @return the string array; or `null` if _`segment`_ is `NULL`
    public static String @Nullable [] asStringArray(@Nullable MemorySegment segment, Charset charset) {
        if (isNullPointer(segment)) return null;
        return segment.elements(ADDRESS)
            .map(s -> s.get(STR_LAYOUT, 0).getString(0L, charset))
            .toArray(String[]::new);
    }

    /// Gets strings encoded with UTF-8 from the given segment.
    ///
    /// @param segment the segment
    /// @return the string array; or `null` if _`segment`_ is `NULL`
    public static String @Nullable [] asStringArray(@Nullable MemorySegment segment) {
        return asStringArray(segment, StandardCharsets.UTF_8);
    }

    /// Converts an integer to `long`. This is usually used by `long` and `size_t`.
    ///
    /// @param layout the actual value layout of _`o`_
    /// @param o      the integer to be converted
    /// @return the result
    public static long wideningToLong(@NonNull ValueLayout layout, Object o) {
        return switch (layout) {
            case OfByte _ -> ((Byte) o).longValue();
            case OfChar _ -> (long) (Character) o;
            case OfShort _ -> ((Short) o).longValue();
            case OfInt _ -> ((Integer) o).longValue();
            case OfLong _ -> (Long) o;
            default -> throw new IllegalArgumentException("Not representing an integral type: " + layout);
        };
    }

    /// Converts an integer to `int`. This is usually used by `wchar_t`.
    ///
    /// @param layout the actual value layout of _`o`_
    /// @param o      the integer to be converted
    /// @return the result
    public static int wideningToInt(@NonNull ValueLayout layout, Object o) {
        return switch (layout) {
            case OfByte _ -> ((Byte) o).intValue();
            case OfChar _ -> (int) (Character) o;
            case OfShort _ -> ((Short) o).intValue();
            case OfInt _ -> (Integer) o;
            case OfLong _ -> ((Long) o).intValue();
            default -> throw new IllegalArgumentException("Not representing an integral type: " + layout);
        };
    }

    //endregion

    // other

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, char @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_CHAR, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, byte @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_BYTE, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, short @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_SHORT, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, int @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_INT, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, long @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_LONG, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, float @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_FLOAT, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, double @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        MemorySegment.copy(src, JAVA_DOUBLE, 0L, dst, 0, dst.length);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, String @Nullable [] dst) {
        copy(src, dst, StandardCharsets.UTF_8);
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src     the source segment
     * @param dst     the destination
     * @param charset the charset
     */
    public static void copy(MemorySegment src, String @Nullable [] dst, Charset charset) {
        if (isNullPointer(src) || dst == null) return;
        for (int i = 0; i < dst.length; i++) {
            dst[i] = nativeString(src.getAtIndex(STR_LAYOUT, i), charset);
        }
    }

    /**
     * Copies from the given segment to the destination.
     *
     * @param src the source segment
     * @param dst the destination
     */
    public static void copy(MemorySegment src, MemorySegment @Nullable [] dst) {
        if (isNullPointer(src) || dst == null) return;
        for (int i = 0; i < dst.length; i++) {
            dst[i] = src.getAtIndex(ADDRESS, i);
        }
    }
}
