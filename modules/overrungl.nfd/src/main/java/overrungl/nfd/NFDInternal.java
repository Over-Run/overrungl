/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.nfd;

import io.github.overrun.platform.Platform;
import overrungl.OverrunGLConfigurations;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;
import overrungl.util.CanonicalTypes;

import java.lang.foreign.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/**
 * internal
 *
 * @author squid233
 * @since 0.1.0
 */
final class NFDInternal {
    private static volatile SymbolLookup lookup;

    static final Platform os = Platform.current();
    static final boolean isOsWin = os instanceof Platform.Windows;
    static final Charset nfdCharset = isOsWin ? StandardCharsets.UTF_16LE : StandardCharsets.UTF_8;
    static final MemoryLayout nfdnchar_t = isOsWin ? CanonicalTypes.WCHAR_T : ValueLayout.JAVA_BYTE;
    static final MemoryLayout nfdpathsetsize_t = (os instanceof Platform.Windows || os instanceof Platform.MacOS)
        ? CanonicalTypes.C_LONG
        : ValueLayout.JAVA_INT;

    private NFDInternal() {
    }

    static SymbolLookup lookup() {
        if (lookup == null) {
            synchronized (NFDInternal.class) {
                if (lookup == null) {
                    final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("nfd", "nfd", OverrunGL.NFD_VERSION);
                    final var function = OverrunGLConfigurations.NFD_SYMBOL_LOOKUP.get();
                    lookup = function != null ? function.apply(lib) : lib.get();
                }
            }
        }
        return lookup;
    }
}
