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
import overrungl.FunctionDescriptors;
import overrungl.NativeType;
import overrungl.os.Architecture;
import overrungl.os.Platform;
import overrungl.util.MemoryUtil;

import java.io.File;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.ToLongFunction;

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
    public static final AddressLayout ADDRESS_UNBOUNDED = ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(Long.MAX_VALUE, JAVA_BYTE));
    private static final StackWalker STACK_WALKER = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
    private static final Map<String, MemoryLayout> CANONICAL_LAYOUTS = LINKER.canonicalLayouts();
    public static final MemoryLayout LONG = CANONICAL_LAYOUTS.get("long"),
        SIZE_T = CANONICAL_LAYOUTS.get("size_t"),
        WCHAR_T = CANONICAL_LAYOUTS.get("wchar_t");

    /**
     * constructor
     */
    private RuntimeHelper() {
        throw new IllegalStateException("Do not construct instance");
    }

    private static MemorySegment reinterpreting(MemorySegment pointerToPointer, int index, ToLongFunction<MemorySegment> size) {
        final MemorySegment seg = pointerToPointer.getAtIndex(ADDRESS, index);
        return seg.reinterpret(size.applyAsLong(seg));
    }

    /**
     * Gets a UTF-8 string from the given pointer of a string.
     *
     * @param segment the memory segment.
     * @return the string.
     */
    public static String unboundPointerString(MemorySegment segment) {
        return reinterpreting(segment, 0, MemoryUtil::strlen).getString(0);
    }

    /**
     * Gets a UTF-8 string from the given pointer of a string at the given index.
     *
     * @param segment the memory segment.
     * @param index   the index.
     * @return the string.
     */
    public static String unboundPointerString(MemorySegment segment, int index) {
        return reinterpreting(segment, index, MemoryUtil::strlen).getString(0);
    }

    /**
     * Converts the segment into a string.
     *
     * @param segment the segment
     * @return the string
     */
    public static String getString(MemorySegment segment) {
        return segment.reinterpret(MemoryUtil.strlen(segment)).getString(0);
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
        return STR. "\{ description } [0x\{ Integer.toHexString(token) }]" ;
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
        final Platform os = Platform.current();
        final var suffix = os.sharedLibrarySuffix();
        final var path = os.sharedLibraryName(basename);
        URI uri;
        // 1. Load from natives directory
        var localFile = new File(System.getProperty("overrungl.natives", "."), path);
        if (localFile.exists()) {
            uri = localFile.toURI();
        } else {
            // 2. Load from classpath
            var file = new File(tmpdir, STR. "overrungl\{ System.getProperty("user.name") }" );
            if (!file.exists()) {
                // Create directory
                file.mkdir();
            } else if (file.isFile()) {
                // Remove
                file.delete();
                // Create directory
                file.mkdir();
            }
            var libFile = new File(file, STR. "\{ basename }-\{ version }\{ suffix }" );
            if (!libFile.exists()) {
                // Extract
                final String fromPath = STR. "\{ module }/\{ os.familyName() }/\{ Architecture.current() }/\{ path }" ;
                try (var is = STACK_WALKER.getCallerClass().getClassLoader().getResourceAsStream(fromPath)) {
                    Files.copy(Objects.requireNonNull(is, STR. "File not found: \{ fromPath }" ),
                        Path.of(libFile.getAbsolutePath()));
                } catch (Exception e) {
                    throw new IllegalStateException(STR. "File not found: \{ file }; try setting property -Doverrungl.natives to a valid path" , e);
                }
            }
            uri = libFile.toURI();
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
        return segment == null || segment.equals(MemorySegment.NULL);
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
    public static String[] toUnboundedArray(@NativeType("const char* const* const") MemorySegment seg, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = unboundPointerString(seg, i);
        }
        return arr;
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
