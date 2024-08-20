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

package overrungl.internal;

import io.github.overrun.platform.Architecture;
import io.github.overrun.platform.Platform;
import overrungl.Configurations;
import overrungl.OverrunGL;

import java.io.IOException;
import java.lang.foreign.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

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
    private static final Linker LINKER = Linker.nativeLinker();
    private static final Path tmpdir = Path.of(System.getProperty("java.io.tmpdir"))
        .resolve("overrungl" + System.getProperty("user.name"));
    private static final StackWalker STACK_WALKER = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
    private static final Map<String, MemoryLayout> CANONICAL_LAYOUTS = LINKER.canonicalLayouts();
    /**
     * Some canonical layouts
     */
    public static final MemoryLayout LONG = CANONICAL_LAYOUTS.get("long"),
        SIZE_T = CANONICAL_LAYOUTS.get("size_t"),
        WCHAR_T = CANONICAL_LAYOUTS.get("wchar_t");
    /**
     * Is {@code size_t} of {@code long}?
     */
    public static final boolean SIZE_T_LONG = SIZE_T instanceof ValueLayout.OfLong;

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
        Path uri;
        // 1. Load from natives directory
        var localFile = Path.of(System.getProperty("overrungl.natives", "."), path);
        if (Files.exists(localFile)) {
            uri = localFile;
        } else {
            // 2. Load from classpath
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
                throw new IllegalStateException("Couldn't create directory: " + tmpdir + "; try setting -Doverrungl.natives to a valid path", e);
            }
            var libFile = tmpdir.resolve(basename + "-" + version + suffix);
            if (!Files.exists(libFile)) {
                // Extract
                final String fromPath = module + "/" + os.familyName() + "-" + Architecture.current() + "/" + path;
                try (var is = STACK_WALKER.getCallerClass().getClassLoader().getResourceAsStream(fromPath)) {
                    Files.copy(Objects.requireNonNull(is, "File not found in classpath: " + fromPath), libFile);
                } catch (Exception e) {
                    throw new IllegalStateException("Couldn't load file: " + libFile + " or " + localFile + "; try setting -Doverrungl.natives to a valid path", e);
                }
            }
            uri = libFile;
        }
        if (Configurations.DEBUG.get()) {
            OverrunGL.apiLog("[OverrunGL] Loading native library from: " + uri);
        }
        // Load the library by the path with the global arena
        return SymbolLookup.libraryLookup(uri, Arena.global());
    }
}
