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

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.util.CanonicalTypes.SIZE_T;

/// Utilities of memory segment.
///
/// TODO: Add documentation
///
/// @author squid233
/// @since 0.1.0
public final class MemoryUtil {
    //region C-standard memory allocator

    public static final FunctionDescriptor
        FD_malloc = FunctionDescriptor.of(ADDRESS, SIZE_T),
        FD_calloc = FunctionDescriptor.of(ADDRESS, SIZE_T, SIZE_T),
        FD_realloc = FunctionDescriptor.of(ADDRESS, ADDRESS, SIZE_T),
        FD_free = FunctionDescriptor.ofVoid(ADDRESS),
        FD_memcpy = FunctionDescriptor.of(ADDRESS, ADDRESS, ADDRESS, SIZE_T),
        FD_memmove = FunctionDescriptor.of(ADDRESS, ADDRESS, ADDRESS, SIZE_T),
        FD_memset = FunctionDescriptor.of(ADDRESS, ADDRESS, JAVA_INT, SIZE_T);

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

        private static MethodHandle downcall(String name, FunctionDescriptor function) {
            return LINKER.downcallHandle(LOOKUP.findOrThrow(name), function);
        }
    }

    private MemoryUtil() {
        throw new IllegalStateException("Do not construct instance");
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
     */
    public static MemorySegment malloc(long size) {
        try {
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ -> (MemorySegment) Handles.m_malloc.invokeExact(Math.toIntExact(size));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_malloc.invokeExact(size);
                default -> throw new AssertionError();
            };
            return segment.reinterpret(size);
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
            long byteSize = number * size;
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ ->
                    (MemorySegment) Handles.m_calloc.invokeExact(Math.toIntExact(number), Math.toIntExact(size));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_calloc.invokeExact(number, size);
                default -> throw new AssertionError();
            };
            return segment.reinterpret(byteSize);
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
     * @return {@code realloc} returns a {@link MemorySegment} to the reallocated (and possibly moved) memory block.
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
        try {
            final MemorySegment mem = memblock != null ? memblock : MemorySegment.NULL;
            MemorySegment segment = switch (SIZE_T) {
                case ValueLayout.OfInt _ -> (MemorySegment) Handles.m_realloc.invokeExact(mem, Math.toIntExact(size));
                case ValueLayout.OfLong _ -> (MemorySegment) Handles.m_realloc.invokeExact(mem, size);
                default -> throw new AssertionError();
            };
            return segment.reinterpret(size);
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
    public static MemorySegment memcpy(MemorySegment dest, MemorySegment src, long count) {
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
    public static MemorySegment memmove(MemorySegment dest, MemorySegment src, long count) {
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
    public static MemorySegment memset(MemorySegment dest, int c, long count) {
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
     * Creates a segment allocator associated with the given arena,
     * which automatically releases the allocated memory when the arena closes.
     *
     * @param arena the arena to be associated with
     * @return the segment allocator
     */
    public static SegmentAllocator allocator(Arena arena) {
        return (byteSize, byteAlignment) -> {
            checkByteSize(byteSize);
            checkAlignment(byteAlignment);
            return calloc(byteSize, 1).reinterpret(arena, MemoryUtil::free);
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
    public static MemorySegment allocString(SegmentAllocator allocator, String string, Charset charset) {
        if (string == null) return MemorySegment.NULL;
        return allocator.allocateFrom(string, charset);
    }

    /// Allocates a string with the given segment allocator.
    ///
    /// @param allocator the allocator
    /// @param string    the string
    /// @return the allocated segment; or `NULL` if _`string`_ is `null`
    public static MemorySegment allocString(SegmentAllocator allocator, String string) {
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
    public static MemorySegment allocString(String string, Charset charset) {
        return allocString(Arena.ofAuto(), string, charset);
    }

    /// Allocates a string encoded with UTF-8 with the [auto arena][Arena#ofAuto()].
    ///
    /// The allocated segment is managed with the garbage collector,
    /// and you should only use it if its usage doesn't hold it.
    ///
    /// @param string the string
    /// @return the allocated segment; or `NULL` if _`string`_ is `null`
    public static MemorySegment allocString(String string) {
        return allocString(Arena.ofAuto(), string);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, char[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_CHAR, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, byte[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_BYTE, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, short[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_SHORT, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, int[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_INT, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, long[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_LONG, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, float[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_FLOAT, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, double[] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_DOUBLE, arr);
    }

    /// Allocates an array with the given allocator.
    ///
    /// @param allocator the allocator
    /// @param arr       the array
    /// @return the allocated segment; or `NULL` if _`arr`_ is `null`
    public static MemorySegment allocArray(SegmentAllocator allocator, MemorySegment[] arr) {
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
    public static MemorySegment allocArray(SegmentAllocator allocator, String[] arr, Charset charset) {
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
    public static MemorySegment allocArray(SegmentAllocator allocator, String[] arr) {
        return allocArray(allocator, arr, StandardCharsets.UTF_8);
    }

    /// Converts a `long` to another type whose size might be smaller than `long`. This is usually used by `long` and `size_t`.
    ///
    /// @param layout the actual value layout of the result
    /// @param value  the value to be converted
    /// @return the result
    public static Object narrowingLong(MemoryLayout layout, long value) {
        if (!(layout instanceof ValueLayout valueLayout)) {
            throw notValueLayout(layout);
        }
        return switch (valueLayout) {
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
    public static Object narrowingInt(MemoryLayout layout, int value) {
        if (!(layout instanceof ValueLayout valueLayout)) {
            throw notValueLayout(layout);
        }
        return switch (valueLayout) {
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
    public static String nativeString(MemorySegment segment, Charset charset) {
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
    public static String nativeString(MemorySegment segment) {
        return nativeString(segment, StandardCharsets.UTF_8);
    }

    /// Gets chars from the given segment.
    ///
    /// @param segment the segment
    /// @return the char array; or `null` if _`segment`_ is `NULL`
    public static char[] asCharArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_CHAR);
    }

    /// Gets bytes from the given segment.
    ///
    /// @param segment the segment
    /// @return the byte array; or `null` if _`segment`_ is `NULL`
    public static byte[] asByteArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_BYTE);
    }

    /// Gets shorts from the given segment.
    ///
    /// @param segment the segment
    /// @return the short array; or `null` if _`segment`_ is `NULL`
    public static short[] asShortArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_SHORT);
    }

    /// Gets integers from the given segment.
    ///
    /// @param segment the segment
    /// @return the int array; or `null` if _`segment`_ is `NULL`
    public static int[] asIntArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_INT);
    }

    /// Gets longs from the given segment.
    ///
    /// @param segment the segment
    /// @return the long array; or `null` if _`segment`_ is `NULL`
    public static long[] asLongArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_LONG);
    }

    /// Gets floats from the given segment.
    ///
    /// @param segment the segment
    /// @return the float array; or `null` if _`segment`_ is `NULL`
    public static float[] asFloatArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_FLOAT);
    }

    /// Gets doubles from the given segment.
    ///
    /// @param segment the segment
    /// @return the double array; or `null` if _`segment`_ is `NULL`
    public static double[] asDoubleArray(MemorySegment segment) {
        return isNullPointer(segment) ? null : segment.toArray(JAVA_DOUBLE);
    }

    private static int checkArraySize(MemorySegment segment, String typeName, int elemSize) {
        long length = segment.byteSize();
        if ((length & (elemSize - 1)) != 0) {
            throw new IllegalStateException(String.format("Segment size is not a multiple of %d. Size: %d", elemSize, length));
        }
        long arraySize = length / elemSize;
        if (arraySize > (Integer.MAX_VALUE - 8)) {
            throw new IllegalStateException(String.format("Segment is too large to wrap as %s. Size: %d", typeName, length));
        }
        return (int) arraySize;
    }

    /// Gets addresses from the given segment.
    ///
    /// The returned segments are zero-length segments.
    ///
    /// @param segment the segment
    /// @return the address array; or `null` if _`segment`_ is `NULL`
    public static MemorySegment[] asAddressArray(MemorySegment segment) {
        if (isNullPointer(segment)) return null;
        int size = checkArraySize(segment, MemorySegment[].class.getSimpleName(), (int) ADDRESS.byteSize());
        var arr = new MemorySegment[size];
        for (int i = 0; i < size; i++) {
            arr[i] = segment.getAtIndex(ADDRESS, i);
        }
        return arr;
    }

    /// Gets strings from the given segment.
    ///
    /// @param segment the segment
    /// @param charset the charset of the string; defaults to UTF-8
    /// @return the string array; or `null` if _`segment`_ is `NULL`
    public static String[] asStringArray(MemorySegment segment, Charset charset) {
        if (isNullPointer(segment)) return null;
        int size = checkArraySize(segment, String[].class.getSimpleName(), (int) ADDRESS.byteSize());
        var arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = segment.getAtIndex(STR_LAYOUT, i).getString(0L, charset);
        }
        return arr;
    }

    /// Gets strings encoded with UTF-8 from the given segment.
    ///
    /// @param segment the segment
    /// @return the string array; or `null` if _`segment`_ is `NULL`
    public static String[] asStringArray(MemorySegment segment) {
        return asStringArray(segment, StandardCharsets.UTF_8);
    }

    /// Converts an integer to `long`. This is usually used by `long` and `size_t`.
    ///
    /// @param layout the actual value layout of _`o`_
    /// @param o      the integer to be converted
    /// @return the result
    public static long wideningToLong(MemoryLayout layout, Object o) {
        if (!(layout instanceof ValueLayout valueLayout)) {
            throw notValueLayout(layout);
        }
        return switch (valueLayout) {
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
    public static int wideningToInt(MemoryLayout layout, Object o) {
        if (!(layout instanceof ValueLayout valueLayout)) {
            throw notValueLayout(layout);
        }
        return switch (valueLayout) {
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

    private static IllegalArgumentException notValueLayout(MemoryLayout layout) {
        return new IllegalArgumentException("Not a value layout: " + layout);
    }
}
