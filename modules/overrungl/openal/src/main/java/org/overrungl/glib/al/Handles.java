/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrungl.glib.al;

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.FunctionDescriptors.IV;
import static org.overrun.glib.FunctionDescriptors.IZ;

/**
 * The OpenAL method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    private static boolean initialized;
    static SymbolLookup lookup;
    static MethodHandle
        alEnable, alDisable, alIsEnabled;

    private static MethodHandle downcall(String name,
                                         FunctionDescriptor function) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function);
    }

    private static MethodHandle downcall(String name,
                                         FunctionDescriptors function) {
        return RuntimeHelper.downcallThrow(lookup.find(name), function);
    }

    private static MethodHandle downcallNative(String name,
                                               FunctionDescriptors function) {
        return RuntimeHelper.downcallSafe(lookup.find(name).orElse(MemorySegment.NULL), function);
    }

    static void create() {
        if (initialized) return;
        initialized = true;

        lookup = RuntimeHelper.load("openal", "openal", RuntimeHelper.VERSION);
        alEnable = downcallNative("alEnable", IV);
        alDisable = downcallNative("alDisable", IV);
        alIsEnabled = downcallNative("alIsEnabled", IZ);
    }
}
