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

package org.overrun.glib;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.os.OperatingSystem;
import org.overrun.glib.os.OperatingSystems;

import java.io.File;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.lang.foreign.ValueLayout.*;

/**
 * The runtime helper.
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
    private static final Consumer<String> DEFAULT_LOGGER = System.out::println;
    private static Consumer<String> apiLogger = DEFAULT_LOGGER;
    /**
     * The address of {@code NULL}.
     */
    public static final long NULL = 0x0L;
    /**
     * An unbounded address layout.
     */
    public static final ValueLayout.OfAddress ADDRESS_UNBOUNDED = ADDRESS.asUnbounded();

    /**
     * constructor
     */
    private RuntimeHelper() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * Creates an unbounded native segment with the given segment.
     *
     * @param segment the segment address.
     * @return an unbounded native segment with the given address
     */
    public static MemorySegment unbound(MemorySegment segment) {
        return MemorySegment.ofAddress(segment.address(), Long.MAX_VALUE);
    }

    /**
     * Creates a sized native segment with the given segment and size.
     * The returned segment is associated with the {@linkplain SegmentScope#global() global scope}.
     *
     * @param segment  the segment address.
     * @param byteSize the desired size.
     * @return a native segment with the given address and size.
     */
    public static MemorySegment sizedSegment(MemorySegment segment, long byteSize) {
        return MemorySegment.ofAddress(segment.address(), byteSize);
    }

    /**
     * Creates a sized native segment with the given segment, size and scope.
     *
     * @param segment  the segment address.
     * @param byteSize the desired size.
     * @param scope    the scope associated with the returned native segment.
     * @return a native segment with the given address, size and scope.
     */
    public static MemorySegment sizedSegment(MemorySegment segment, long byteSize, SegmentScope scope) {
        return MemorySegment.ofAddress(segment.address(), byteSize, scope);
    }

    /**
     * Make sure a method handle is returned as the specified type to deal with {@code MethodHandle::invokeExact}.
     *
     * @param t   the invoke method.
     * @param <T> the return type.
     */
    @SuppressWarnings("unused")
    public static <T> void consume(T t) {
    }

    /**
     * Sets the API logger.
     *
     * @param logger the logger. pass {@code null} to reset to the default logger
     */
    public static void setApiLogger(Consumer<String> logger) {
        apiLogger = Objects.requireNonNullElse(logger, DEFAULT_LOGGER);
    }

    /**
     * Gets the API logger. Defaults to {@link System#out}.
     *
     * @return the API logger
     */
    public static Consumer<String> apiLogger() {
        return apiLogger;
    }

    /**
     * Logs a message with the current {@linkplain #apiLogger() API logger}.
     *
     * @param message the message to be logged.
     */
    public static void apiLog(String message) {
        apiLogger.accept(message);
    }

    /**
     * Gets the length of the null-terminated string encoded in UTF8.
     *
     * @param s the string
     * @return the length
     */
    public static int utf8StringCLength(String s) {
        return s.getBytes(StandardCharsets.UTF_8).length + 1;
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
     * @return the string formatted in {@code \{description} [0x\{toHexString(token)}]}.
     */
    public static String unknownToken(String description, int token) {
        return description + " [0x" + Integer.toHexString(token) + ']';
    }

    /**
     * Loads a library from classpath or local.
     *
     * @param module   the module name. e.x. {@code glfw}
     * @param basename the basename of the library (without file extensions)
     * @param version  the version suffix
     * @return the {@link SymbolLookup}
     * @throws IllegalStateException if file not found
     */
    public static SymbolLookup load(String module, String basename, String version)
        throws IllegalStateException {
        final var os = OperatingSystem.current();
        final var suffix = os.getSharedLibrarySuffix();
        final var path = os.getSharedLibraryName(basename);
        URI uri;
        // 1. Load from classpath
        try {
            var file = new File(tmpdir, "overrungl" + System.getProperty("user.name"));
            if (!file.exists()) {
                // Create directory
                file.mkdir();
            } else if (file.isFile()) {
                // Remove
                file.delete();
                // Create directory
                file.mkdir();
            }
            var libFile = new File(file, basename + '-' + version + suffix);
            if (!libFile.exists()) {
                // Extract
                try (var is = RuntimeHelper.class.getClassLoader().getResourceAsStream(
                    module + '/' + os.getFamilyName() + '/' + OperatingSystems.getNativeLibArch() + '/' + path
                )) {
                    Files.copy(Objects.requireNonNull(is), Path.of(libFile.getAbsolutePath()));
                }
            }
            uri = libFile.toURI();
        } catch (Exception e) {
            // 2. Load from natives directory
            var file = new File(System.getProperty("overrungl.natives", ".") + '/' + path);
            if (!file.exists()) {
                var exception = new IllegalStateException("File not found: " + file + "; Try to set property -Doverrungl.natives to a valid path");
                exception.addSuppressed(e);
                throw exception;
            }
            uri = file.toURI();
        }
        // Load library by the path with the global segment scope
        return SymbolLookup.libraryLookup(Path.of(uri), SegmentScope.global());
    }

    /**
     * Creates a downcall handle or {@code null}.
     *
     * @param symbol   the address of the target function.
     * @param function the function descriptor of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemorySegment#NULL}
     */
    @Nullable
    public static MethodHandle downcallSafe(MemorySegment symbol, FunctionDescriptor function) {
        if (symbol.address() == NULL) return null;
        return LINKER.downcallHandle(symbol, function);
    }

    /**
     * Creates a downcall handle or throws exception.
     *
     * @param optional the optional contained the address of the target function.
     * @param function the function descriptor of the target function.
     * @return a downcall method handle.
     */
    public static MethodHandle downcallThrow(Optional<MemorySegment> optional, FunctionDescriptor function) {
        return LINKER.downcallHandle(optional.orElseThrow(), function);
    }

    /**
     * Creates a downcall handle or {@code null}.
     *
     * @param symbol   the address of the target function.
     * @param function the function descriptor of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemorySegment#NULL}
     */
    @Nullable
    public static MethodHandle downcallSafe(MemorySegment symbol, FunctionDescriptors function) {
        return downcallSafe(symbol, function.descriptor());
    }

    /**
     * Creates a downcall handle or throws exception.
     *
     * @param optional the optional contained the address of the target function.
     * @param function the function descriptor of the target function.
     * @return a downcall method handle.
     */
    public static MethodHandle downcallThrow(Optional<MemorySegment> optional, FunctionDescriptors function) {
        return downcallThrow(optional, function.descriptor());
    }

    /**
     * Gets the objects from an address array.
     *
     * @param <T>       the array type
     * @param seg       the memory segment contained objects. native type: {@code void**}
     * @param arr       the array to hold the result
     * @param generator the generator, to convert to the array type
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
     * @return arr
     */
    public static MemorySegment[] toArray(MemorySegment seg, MemorySegment[] arr) {
        return toArray(seg, arr, Function.identity());
    }

    public static String[] toArray(MemorySegment seg, String[] arr) {
        return toArray(seg, arr, p -> p.getUtf8String(0));
    }

    /**
     * Gets the strings from an unbounded address array.
     *
     * @param seg the memory segment contained strings. native type: {@code char**}
     * @param arr the array to hold the result
     * @return arr
     */
    public static String[] toUnboundedArray(MemorySegment seg, String[] arr) {
        return toArray(seg, arr, p -> unbound(p).getUtf8String(0));
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
