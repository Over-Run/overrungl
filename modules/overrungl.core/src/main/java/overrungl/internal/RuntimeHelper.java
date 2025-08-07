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

package overrungl.internal;

import io.github.overrun.platform.Architecture;
import io.github.overrun.platform.Platform;
import overrungl.OverrunGL;
import overrungl.OverrunGLConfigurations;

import java.io.IOException;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * The runtime helper, for internal use.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class RuntimeHelper {
    private static final Path tmpdir = Path.of(System.getProperty("java.io.tmpdir"))
        .resolve("overrungl-" + System.getProperty("user.name"));
    private static final Linker LINKER = Linker.nativeLinker();
    /// Trace downcall invocation and print a debug message with [OverrunGL#apiLogger()].
    ///
    /// Specify with -D{@systemProperty overrungl.trace.downcalls}=true
    public static final boolean TRACE_DOWNCALLS = Boolean.getBoolean("overrungl.trace.downcalls");

    /**
     * constructor
     */
    private RuntimeHelper() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * Generates a string for unknown token.
     *
     * @param token the token.
     * @return the string formatted in {@code Unknown [0xHex(token)]}.
     * @see #unknownToken(String, int)
     */
    public static String unknownToken(int token) {
        return unknownToken("Unknown", token);
    }

    /**
     * Generates a string for unknown token.
     *
     * @param description the description. default to {@code Unknown}
     * @param token       the token.
     * @return the string is formatted in {@code description [0xHex(token)]}.
     */
    public static String unknownToken(String description, int token) {
        return description + " [0x" + Integer.toHexString(token) + "]";
    }

    /**
     * Loads a library from classpath or local.
     *
     * @param module   the module name. e.g. {@code glfw}
     * @param basename the basename of the library (without file extensions)
     * @param version  the version suffix
     * @return the {@link SymbolLookup}
     * @throws IllegalStateException if file isn't found
     */
    public static SymbolLookup load(String module, String basename, String version)
        throws IllegalStateException {
        boolean debug = OverrunGLConfigurations.DEBUG.get();
        final Platform os = Platform.current();
        final var suffix = os.sharedLibrarySuffix();
        final var path = os.sharedLibraryName(basename);

        // 1. Load from natives directory
        var localFile = Path.of(System.getProperty("overrungl.natives", "."), path);
        if (Files.exists(localFile)) {
            if (debug) {
                OverrunGL.apiLog("[OverrunGL] Loading native library from overrungl.natives: " + localFile);
            }
            return SymbolLookup.libraryLookup(localFile, Arena.global());
        }

        // 2. Load from java.library.path with System::loadLibrary
        try {
            System.loadLibrary(basename);
            if (debug) {
                OverrunGL.apiLog("[OverrunGL] Loading native library from java.library.path: " + System.mapLibraryName(basename));
            }
            return SymbolLookup.loaderLookup();
        } catch (UnsatisfiedLinkError _) {
        }

        // 3. Load from classpath (copy)
        try {
            if (!Files.exists(tmpdir)) {
                // Create directory
                Files.createDirectories(tmpdir);
            } else if (!Files.isDirectory(tmpdir)) {
                // Remove
                Files.delete(tmpdir);
                // Create directory
                Files.createDirectories(tmpdir);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Couldn't create temporary directory to store native libraries: " + tmpdir + "; try setting -Doverrungl.natives or -Djava.library.path to a valid path", e);
        }
        var libFile = tmpdir.resolve(basename + "-" + version + suffix);
        if (!Files.exists(libFile)) {
            // Extract
            final String fromPath = "overrungl." + module + "/" + os.familyName() + "-" + Architecture.current() + "/" + path;
            try (var is = ClassLoader.getSystemResourceAsStream(fromPath)) {
                Files.copy(Objects.requireNonNull(is, "File not found in classpath: " + fromPath), libFile);
            } catch (Exception e) {
                throw new IllegalStateException("Couldn't load native library from: " + libFile.toAbsolutePath().normalize() + " or " + localFile.toAbsolutePath().normalize() + "; try setting -Doverrungl.natives or -Djava.library.path to a valid path", e);
            }
        }
        if (debug) {
            OverrunGL.apiLog("[OverrunGL] Loading native library from classpath: " + libFile);
        }
        return SymbolLookup.libraryLookup(libFile, Arena.global());
    }

    /// Creates a method handle without binding to a specific address.
    ///
    /// @param descriptor the function descriptor
    /// @return the method handle
    public static MethodHandle downcallHandle(FunctionDescriptor descriptor) {
        return LINKER.downcallHandle(descriptor);
    }

    /// Converts upcall target name
    ///
    /// @param name       the original name
    /// @param descriptor the descriptor
    /// @return the converted name
    public static String upcallTarget(String name, FunctionDescriptor descriptor) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(descriptor.returnLayout().map(RuntimeHelper::descriptorLayoutToChar).orElse('V'));
        for (MemoryLayout argumentLayout : descriptor.argumentLayouts()) {
            builder.append(descriptorLayoutToChar(argumentLayout));
        }
        return builder.toString();
    }

    private static char descriptorLayoutToChar(MemoryLayout layout) {
        if (!(layout instanceof ValueLayout valueLayout)) {
            throw new IllegalArgumentException("Not a value layout: " + layout);
        }
        return switch (valueLayout) {
            case AddressLayout _ -> 'P';
            case ValueLayout.OfBoolean _ -> 'Z';
            case ValueLayout.OfChar _ -> 'C';
            case ValueLayout.OfByte _ -> 'B';
            case ValueLayout.OfShort _ -> 'S';
            case ValueLayout.OfInt _ -> 'I';
            case ValueLayout.OfLong _ -> 'J';
            case ValueLayout.OfFloat _ -> 'F';
            case ValueLayout.OfDouble _ -> 'D';
        };
    }

    /// Prints a message indicating that a downcall method is being invoked.
    ///
    /// @param name the name of the downcall method
    /// @param args the arguments passed to the method
    public static void traceDowncall(String name, Object... args) {
        OverrunGL.apiLog(name + "(" + Arrays.stream(args).map(String::valueOf).collect(Collectors.joining(", ")) + ")");
    }
}
