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

package overrungl.internal;

import org.jetbrains.annotations.Nullable;
import overrungl.Configurations;
import overrungl.FunctionDescriptors;
import overrungl.os.OperatingSystem;
import overrungl.os.OperatingSystems;
import overrungl.util.MemoryUtil;

import java.io.File;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

import static java.lang.foreign.ValueLayout.*;

/**
 * The runtime helper, for internal use.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class RuntimeHelper {
    /**
     * The native linker.
     */
    public static final Linker LINKER = Linker.nativeLinker();
    private static final File tmpdir = new File(System.getProperty("java.io.tmpdir"));
    /**
     * An unbounded address layout.
     */
    public static final AddressLayout ADDRESS_UNBOUNDED = MemoryUtil.ADDRESS_UNBOUNDED;
    /**
     * @see Configurations#CHECKS
     */
    public static final boolean CHECKS = Configurations.CHECKS.get();

    /**
     * constructor
     */
    private RuntimeHelper() {
        throw new IllegalStateException("Do not construct instance");
    }

    @Deprecated(since = "22")
    public static MemorySegment allocateUtf16LEString(SegmentAllocator allocator, String str) {
        Objects.requireNonNull(allocator);
        Objects.requireNonNull(str);
        final byte[] bytes = str.getBytes(StandardCharsets.UTF_16LE);
        final MemorySegment seg = allocator.allocate(bytes.length + 2);
        MemorySegment.copy(bytes, 0, seg, JAVA_BYTE, 0, bytes.length);
        return seg;
    }

    @Deprecated(since = "22")
    public static String getUtf16LEString(MemorySegment segment, long offset) {
        long len = strlen(segment, offset);
        byte[] bytes = new byte[(int) len];
        MemorySegment.copy(segment, JAVA_BYTE, offset, bytes, 0, (int) len);
        return new String(bytes, StandardCharsets.UTF_16LE);
    }

    private static int strlen(MemorySegment segment, long start) {
        for (int offset = 0; offset >= 0; offset += 2) {
            short curr = segment.get(JAVA_SHORT, start + offset);
            if (curr == 0) {
                return offset;
            }
        }
        throw new IllegalArgumentException("String too large");
    }

    /**
     * Gets a string from the given pointer of a string.
     *
     * @param segment the memory segment.
     * @return the string.
     */
    public static String unboundPointerString(MemorySegment segment) {
        return segment.get(ADDRESS_UNBOUNDED, 0).getUtf8String(0);
    }

    /**
     * Gets a string from the given pointer of a string at the given index.
     *
     * @param segment the memory segment.
     * @param index   the index.
     * @return the string.
     */
    public static String unboundPointerString(MemorySegment segment, int index) {
        return segment.getAtIndex(ADDRESS_UNBOUNDED, index).getUtf8String(0);
    }

    /**
     * Make sure a method handle is returned as the specified type to deal with {@code MethodHandle::invokeExact}.
     *
     * @param t   the invoking method.
     * @param <T> the return type.
     */
    @SuppressWarnings("unused")
    public static <T> void consume(T t) {
    }

    /**
     * Generates a string for unknown token.
     *
     * @param token the token.
     * @return the string formatted in {@code Unknown [0x\{toHexString(token)}]}.
     */
    public static String unknownToken(int token) {
        return unknownToken("Unknown", token);
    }

    /**
     * Generates a string for unknown token.
     *
     * @param description the description. default to {@code Unknown}
     * @param token       the token.
     * @return the string is formatted in {@code STR."\{description} [0x\{toHexString(token)}]"}.
     */
    public static String unknownToken(String description, int token) {
        return STR."\{description} [0x\{Integer.toHexString(token)}]";
    }

    /**
     * Loads a library from classpath or local.
     *
     * @param module   the module name. e.x. {@code glfw}
     * @param basename the basename of the library (without file extensions)
     * @param version  the version suffix
     * @return the {@link SymbolLookup}
     * @throws IllegalStateException if file isn't found
     */
    public static SymbolLookup load(String module, String basename, String version)
        throws IllegalStateException {
        final var os = OperatingSystem.current();
        final var suffix = os.getSharedLibrarySuffix();
        final var path = os.getSharedLibraryName(basename);
        URI uri;
        // 1. Load from classpath
        try {
            var file = new File(tmpdir, STR."overrungl\{System.getProperty("user.name")}");
            if (!file.exists()) {
                // Create directory
                file.mkdir();
            } else if (file.isFile()) {
                // Remove
                file.delete();
                // Create directory
                file.mkdir();
            }
            var libFile = new File(file, STR."\{basename}-\{version}\{suffix}");
            if (!libFile.exists()) {
                // Extract
                try (var is = RuntimeHelper.class.getClassLoader().getResourceAsStream(
                    STR."\{module}/\{os.getFamilyName()}/\{OperatingSystems.getNativeLibArch()}/\{path}"
                )) {
                    Files.copy(Objects.requireNonNull(is), Path.of(libFile.getAbsolutePath()));
                }
            }
            uri = libFile.toURI();
        } catch (Exception e) {
            // 2. Load from natives directory
            var file = new File(STR."\{System.getProperty("overrungl.natives", ".")}/\{path}");
            if (!file.exists()) {
                var exception = new IllegalStateException(STR."File not found: \{file}; Try to set property -Doverrungl.natives to a valid path");
                exception.addSuppressed(e);
                throw exception;
            }
            uri = file.toURI();
        }
        // Load the library by the path with the global arena
        return SymbolLookup.libraryLookup(Path.of(uri), Arena.global());
    }

    /**
     * {@return {@code true} if <i>{@code segment}</i> is a null pointer}
     *
     * @param segment the segment.
     */
    public static boolean isNullptr(@Nullable MemorySegment segment) {
        return MemoryUtil.isNullptr(segment);
    }

    /**
     * Creates a downcall handle or {@code null}.
     *
     * @param symbol   the address of the target function.
     * @param function the function descriptor of the target function.
     * @param options  the linker options associated with this linkage request.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemorySegment#NULL}
     */
    @Nullable
    public static MethodHandle downcallSafe(@Nullable MemorySegment symbol, FunctionDescriptor function, Linker.Option... options) {
        return isNullptr(symbol) ? null : LINKER.downcallHandle(symbol, function, options);
    }

    /**
     * Creates a downcall handle or throws exception.
     *
     * @param optional the optional contained the address of the target function.
     * @param function the function descriptor of the target function.
     * @param options  the linker options associated with this linkage request.
     * @return a downcall method handle.
     */
    public static MethodHandle downcallThrow(Optional<MemorySegment> optional, FunctionDescriptor function, Linker.Option... options) {
        return LINKER.downcallHandle(optional.orElseThrow(), function, options);
    }

    /**
     * Creates a downcall handle or {@code null}.
     *
     * @param symbol   the address of the target function.
     * @param function the function descriptor of the target function.
     * @param options  the linker options associated with this linkage request.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemorySegment#NULL}
     */
    @Nullable
    public static MethodHandle downcallSafe(@Nullable MemorySegment symbol, FunctionDescriptors function, Linker.Option... options) {
        return downcallSafe(symbol, function.descriptor(), options);
    }

    /**
     * Creates a downcall handle or throws exception.
     *
     * @param optional the optional contained the address of the target function.
     * @param function the function descriptor of the target function.
     * @param options  the linker options associated with this linkage request.
     * @return a downcall method handle.
     */
    public static MethodHandle downcallThrow(Optional<MemorySegment> optional, FunctionDescriptors function, Linker.Option... options) {
        return downcallThrow(optional, function.descriptor(), options);
    }

    /**
     * Gets the objects from an address array.
     *
     * @param <T>       the array type
     * @param seg       the memory segment contained objects. native type: {@code void**}
     * @param arr       the array to hold the result
     * @param generator the generator, from a zero-length address to the array type
     * @return arr
     */
    public static <T> T[] toArray(MemorySegment seg, T[] arr,
                                  Function<MemorySegment, T> generator) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.apply(seg.getAtIndex(ADDRESS, i));
        }
        return arr;
    }

    /**
     * Gets the objects from an address array.
     *
     * @param <T>       the array type
     * @param seg       the memory segment contained objects. native type: {@code void**}
     * @param arr       the array to hold the result
     * @param generator the generator, from an unbounded address to the array type
     * @return arr
     */
    public static <T> T[] toUnboundedArray(MemorySegment seg, T[] arr,
                                           Function<MemorySegment, T> generator) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.apply(seg.getAtIndex(ADDRESS_UNBOUNDED, i));
        }
        return arr;
    }

    /**
     * Gets the addresses from an address array.
     *
     * @param seg the memory segment contained addresses. native type: {@code void**}
     * @param arr the array to hold the result
     * @return an array of the zero-length addresses.
     */
    public static MemorySegment[] toArray(MemorySegment seg, MemorySegment[] arr) {
        return toArray(seg, arr, Function.identity());
    }

    /**
     * Gets the strings from an unbounded address array.
     *
     * @param seg the memory segment contained strings. native type: {@code char**}
     * @param arr the array to hold the result
     * @return arr
     */
    public static String[] toUnboundedArray(MemorySegment seg, String[] arr) {
        return toUnboundedArray(seg, arr, p -> p.getUtf8String(0));
    }

    /**
     * Gets the booleans from a boolean array.
     *
     * @param seg the memory segment contained booleans. native type: {@code boolean*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static boolean[] toArray(MemorySegment seg, boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = seg.get(JAVA_BOOLEAN, i);
        }
        return arr;
    }

    /**
     * Gets the bytes from a byte array.
     *
     * @param seg the memory segment contained bytes. native type: {@code byte*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static byte[] toArray(MemorySegment seg, byte[] arr) {
        MemorySegment.copy(seg, JAVA_BYTE, 0, arr, 0, arr.length);
        return arr;
    }

    /**
     * Gets the shorts from a short array.
     *
     * @param seg the memory segment contained shorts. native type: {@code short*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static short[] toArray(MemorySegment seg, short[] arr) {
        MemorySegment.copy(seg, JAVA_SHORT, 0, arr, 0, arr.length);
        return arr;
    }

    /**
     * Gets the ints from an int array.
     *
     * @param seg the memory segment contained ints. native type: {@code int*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static int[] toArray(MemorySegment seg, int[] arr) {
        MemorySegment.copy(seg, JAVA_INT, 0, arr, 0, arr.length);
        return arr;
    }

    /**
     * Gets the longs from a long array.
     *
     * @param seg the memory segment contained longs. native type: {@code long*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static long[] toArray(MemorySegment seg, long[] arr) {
        MemorySegment.copy(seg, JAVA_LONG, 0, arr, 0, arr.length);
        return arr;
    }

    /**
     * Gets the floats from a float array.
     *
     * @param seg the memory segment contained floats. native type: {@code float*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static float[] toArray(MemorySegment seg, float[] arr) {
        MemorySegment.copy(seg, JAVA_FLOAT, 0, arr, 0, arr.length);
        return arr;
    }

    /**
     * Gets the doubles from a double array.
     *
     * @param seg the memory segment contained doubles. native type: {@code double*}
     * @param arr the array to hold the result
     * @return arr
     */
    public static double[] toArray(MemorySegment seg, double[] arr) {
        MemorySegment.copy(seg, JAVA_DOUBLE, 0, arr, 0, arr.length);
        return arr;
    }
}
