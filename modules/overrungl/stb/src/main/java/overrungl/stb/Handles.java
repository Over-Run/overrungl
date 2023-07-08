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

package overrungl.stb;

import overrungl.FunctionDescriptors;
import overrungl.RuntimeHelper;

import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

/**
 * The STB method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    private static boolean loaded = false;
    private static SymbolLookup lookup;

    static MethodHandle downcall(String name,
                                 FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function);
    }

    public static void initialize() {
        if (loaded) return;
        loaded = true;
        lookup = RuntimeHelper.load("stb", "stb", RuntimeHelper.VERSION);
    }
}
