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

package overrungl.stb;

import overrungl.Configurations;
import overrungl.FunctionDescriptors;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;
import java.util.function.Supplier;

/**
 * The STB method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    static final SymbolLookup lookup;

    static {
        final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("stb", "stb", OverrunGL.STB_VERSION);
        final var function = Configurations.STB_SYMBOL_LOOKUP.get();
        lookup = function != null ? function.apply(lib) : lib.get();
    }

    private Handles() {
        //no instance
    }

    static MethodHandle downcall(String name,
                                 FunctionDescriptors function,
                                 Linker.Option... options) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function, options);
    }

    static MethodHandle downcall(String name,
                                 FunctionDescriptor function,
                                 Linker.Option... options) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function, options);
    }

    static MethodHandle downcallTrivial(String name,
                                        FunctionDescriptors function) {
        return downcall(name, function, Linker.Option.critical(false));
    }
}
