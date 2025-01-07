/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.openal;

import overrungl.OverrunGL;
import overrungl.OverrunGLConfigurations;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.SymbolLookup;
import java.util.function.Supplier;

/**
 * OpenAL internal
 *
 * @author squid233
 * @since 0.1.0
 */
final class ALInternal {
    private static volatile SymbolLookup lookup;

    private ALInternal() {
    }

    static SymbolLookup lookup() {
        if (lookup == null) {
            synchronized (ALInternal.class) {
                if (lookup == null) {
                    Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("openal", "openal", OverrunGL.OPENAL_VERSION);
                    var function = OverrunGLConfigurations.OPENAL_SYMBOL_LOOKUP.get();
                    lookup = function != null ? function.apply(lib) : lib.get();
                }
            }
        }
        return lookup;
    }
}
