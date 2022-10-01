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

package org.overrun.glib.stb;

import org.overrun.glib.GameLib;
import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

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
                                 MemoryLayout retLayout,
                                 MemoryLayout... argLayouts) {
        return RuntimeHelper.downcallThrow(lookup.lookup(name),
            FunctionDescriptor.of(retLayout, argLayouts));
    }

    static MethodHandle downcallI(String name,
                                  MemoryLayout... argLayouts) {
        return downcall(name, JAVA_INT, argLayouts);
    }

    static MethodHandle downcallP(String name,
                                  MemoryLayout... argLayouts) {
        return downcall(name, ADDRESS, argLayouts);
    }

    static MethodHandle downcallV(String name,
                                  MemoryLayout... argLayouts) {
        return RuntimeHelper.downcallThrow(lookup.lookup(name),
            FunctionDescriptor.ofVoid(argLayouts));
    }

    static MethodHandle downcallIV(String name) {
        return downcallV(name, JAVA_INT);
    }

    public static void initialize() {
        if (loaded) return;
        loaded = true;
        lookup = GameLib.load("stb",
            "stb",
            "0.1.0");
    }
}
