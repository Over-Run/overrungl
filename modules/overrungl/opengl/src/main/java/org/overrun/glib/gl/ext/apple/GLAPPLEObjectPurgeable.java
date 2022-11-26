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

package org.overrun.glib.gl.ext.apple;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_APPLE_object_purgeable}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEObjectPurgeable {
    @Nullable
    public static MethodHandle glGetObjectParameterivAPPLE, glObjectPurgeableAPPLE, glObjectUnpurgeableAPPLE;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_APPLE_object_purgeable.no()) return;
        glGetObjectParameterivAPPLE = load.invoke("glGetObjectParameterivAPPLE", FunctionDescriptors.IIIPV);
        glObjectPurgeableAPPLE = load.invoke("glObjectPurgeableAPPLE", FunctionDescriptors.IIII);
        glObjectUnpurgeableAPPLE = load.invoke("glObjectUnpurgeableAPPLE", FunctionDescriptors.IIII);
    }

    public static void glGetObjectParameterivAPPLE(int objectType, int name, int pname, Addressable params) {
        try {
            check(glGetObjectParameterivAPPLE).invokeExact(objectType, name, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetObjectParameterivAPPLE(SegmentAllocator allocator, int objectType, int name, int pname, int[] params) {
        glGetObjectParameterivAPPLE(objectType, name, pname, allocator.allocateArray(ValueLayout.JAVA_INT, params));
    }

    public static int glObjectPurgeableAPPLE(int objectType, int name, int option) {
        try {
            return (int) check(glObjectPurgeableAPPLE).invokeExact(objectType, name, option);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glObjectUnpurgeableAPPLE(int objectType, int name, int option) {
        try {
            return (int) check(glObjectUnpurgeableAPPLE).invokeExact(objectType, name, option);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
