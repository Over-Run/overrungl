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

package overrungl.stb;

import overrungl.OverrunGLConfigurations;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.util.function.Supplier;

/**
 * The STB method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class STBInternal {
    private static volatile SymbolLookup lookup;

    private STBInternal() {
        //no instance
    }

    static MemorySegment findIntOrThrow(String name) {
        return lookup().findOrThrow(name).reinterpret(ValueLayout.JAVA_INT.byteSize());
    }

    static SymbolLookup lookup() {
        if (lookup == null) {
            synchronized (STBInternal.class) {
                if (lookup == null) {
                    final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("stb", "stb", OverrunGL.STB_VERSION);
                    final var function = OverrunGLConfigurations.STB_SYMBOL_LOOKUP.get();
                    lookup = function != null ? function.apply(lib) : lib.get();
                }
            }
        }
        return lookup;
    }
}
