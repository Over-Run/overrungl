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

package org.overrun.glib;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.os.OperatingSystem;

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
     * constructor
     */
    private RuntimeHelper() {
        throw new IllegalStateException("Do not construct instance");
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
     * Log a message.
     *
     * @param message the message
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
     * Load a library from classpath or local.
     *
     * @param module   the module name like {@code glfw}
     * @param basename the basename of the library (without extensions)
     * @param version  the version suffix
     * @return the {@link SymbolLookup}
     * @throws RuntimeException if file not found
     */
    public static SymbolLookup load(String module, String basename, String version)
        throws RuntimeException {
        final var os = OperatingSystem.current();
        final var path = basename + os.getSharedLibrarySuffix();
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
            var libFile = new File(file, basename + "-" + version + os.getSharedLibrarySuffix());
            if (!libFile.exists()) {
                // Extract
                try (var is = ClassLoader.getSystemResourceAsStream(
                    module + "/" + os.getFamilyName() + "/" + os.getArch() + "/" + path
                )) {
                    Files.copy(Objects.requireNonNull(is), Path.of(libFile.getAbsolutePath()));
                }
            }
            uri = libFile.toURI();
        } catch (Exception e) {
            // 2. Load from natives directory
            var file = new File(System.getProperty("overrungl.natives", ".") + "/" + path);
            if (!file.exists()) {
                throw new RuntimeException("File not found: " + file + "; Try to set property -Doverrungl.natives to a valid path");
            }
            uri = file.toURI();
        }
        // Load library by the path with the global segment scope
        return SymbolLookup.libraryLookup(Path.of(uri), MemorySession.global());
    }

    /**
     * Creates a downcall handle or {@code null}.
     *
     * @param symbol   the address of the target function.
     * @param function the function descriptor of the target function.
     * @return a downcall method handle. or {@code null} if the symbol {@link MemorySegment#NULL}
     */
    @Nullable
    public static MethodHandle downcallSafe(Addressable symbol, FunctionDescriptor function) {
        if (symbol.address() == MemoryAddress.NULL) return null;
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
    public static MethodHandle downcallSafe(Addressable symbol, FunctionDescriptors function) {
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
     * @param addr      the memory address contains objects. native type: {@code void**}
     * @param arr       the array to hold the result
     * @param generator the generator, to convert to the array type
     * @return arr
     */
    public static <T> T[] toArray(Addressable addr, T[] arr,
                                  Function<MemoryAddress, T> generator) {
        if (addr instanceof MemorySegment pp) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = generator.apply(pp.getAtIndex(ADDRESS, i));
            }
        } else {
            var pp = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = generator.apply(pp.getAtIndex(ADDRESS, i));
            }
        }
        return arr;
    }

    /**
     * Gets the addresses from an address array.
     *
     * @param addr the memory address contains addresses. native type: {@code void**}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static MemoryAddress[] toArray(Addressable addr, MemoryAddress[] arr) {
        return toArray(addr, arr, Function.identity());
    }

    /**
     * Gets the strings from an address array.
     *
     * @param addr the memory address contains strings. native type: {@code char**}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static String[] toArray(Addressable addr, String[] arr) {
        return toArray(addr, arr, p -> p.getUtf8String(0));
    }

    /**
     * Gets the booleans from a boolean array.
     *
     * @param addr the memory address contains booleans. native type: {@code boolean*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static boolean[] toArray(Addressable addr, boolean[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.get(JAVA_BOOLEAN, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.get(JAVA_BOOLEAN, i);
            }
        }
        return arr;
    }

    /**
     * Gets the bytes from a byte array.
     *
     * @param addr the memory address contains bytes. native type: {@code byte*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static byte[] toArray(Addressable addr, byte[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.get(JAVA_BYTE, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.get(JAVA_BYTE, i);
            }
        }
        return arr;
    }

    /**
     * Gets the shorts from a short array.
     *
     * @param addr the memory address contains shorts. native type: {@code short*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static short[] toArray(Addressable addr, short[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_SHORT, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_SHORT, i);
            }
        }
        return arr;
    }

    /**
     * Gets the ints from an int array.
     *
     * @param addr the memory address contains ints. native type: {@code int*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static int[] toArray(Addressable addr, int[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_INT, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_INT, i);
            }
        }
        return arr;
    }

    /**
     * Gets the longs from a long array.
     *
     * @param addr the memory address contains longs. native type: {@code long*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static long[] toArray(Addressable addr, long[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_LONG, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_LONG, i);
            }
        }
        return arr;
    }

    /**
     * Gets the floats from a float array.
     *
     * @param addr the memory address contains floats. native type: {@code float*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static float[] toArray(Addressable addr, float[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_FLOAT, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_FLOAT, i);
            }
        }
        return arr;
    }

    /**
     * Gets the doubles from a double array.
     *
     * @param addr the memory address contains doubles. native type: {@code double*}
     * @param arr  the array to hold the result
     * @return arr
     */
    public static double[] toArray(Addressable addr, double[] arr) {
        if (addr instanceof MemorySegment p) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_DOUBLE, i);
            }
        } else {
            var p = addr.address();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = p.getAtIndex(JAVA_DOUBLE, i);
            }
        }
        return arr;
    }
}
