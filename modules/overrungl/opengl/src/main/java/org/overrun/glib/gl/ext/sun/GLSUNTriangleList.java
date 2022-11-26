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

package org.overrun.glib.gl.ext.sun;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_SUN_triangle_list}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLSUNTriangleList {
    @Nullable
    public static MethodHandle glReplacementCodePointerSUN, glReplacementCodeubSUN, glReplacementCodeubvSUN,
        glReplacementCodeuiSUN, glReplacementCodeuivSUN, glReplacementCodeusSUN, glReplacementCodeusvSUN;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_SUN_triangle_list.no()) return;
        glReplacementCodePointerSUN = load.invoke("glReplacementCodePointerSUN", IIPV);
        glReplacementCodeubSUN = load.invoke("glReplacementCodeubSUN", BV);
        glReplacementCodeubvSUN = load.invoke("glReplacementCodeubvSUN", PV);
        glReplacementCodeuiSUN = load.invoke("glReplacementCodeuiSUN", IV);
        glReplacementCodeuivSUN = load.invoke("glReplacementCodeuivSUN", PV);
        glReplacementCodeusSUN = load.invoke("glReplacementCodeusSUN", SV);
        glReplacementCodeusvSUN = load.invoke("glReplacementCodeusvSUN", PV);
    }

    public static void glReplacementCodePointerSUN(int type, int stride, Addressable pointer) {
        try {
            check(glReplacementCodePointerSUN).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeubSUN(byte code) {
        try {
            check(glReplacementCodeubSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeubvSUN(Addressable code) {
        try {
            check(glReplacementCodeubvSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeubvSUN(SegmentAllocator allocator, byte[] code) {
        glReplacementCodeubvSUN(allocator.allocateArray(JAVA_BYTE, code));
    }

    public static void glReplacementCodeuiSUN(int code) {
        try {
            check(glReplacementCodeuiSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuivSUN(Addressable code) {
        try {
            check(glReplacementCodeuivSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuivSUN(SegmentAllocator allocator, int[] code) {
        glReplacementCodeuivSUN(allocator.allocateArray(JAVA_INT, code));
    }

    public static void glReplacementCodeusSUN(short code) {
        try {
            check(glReplacementCodeusSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeusvSUN(Addressable code) {
        try {
            check(glReplacementCodeusvSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeusvSUN(SegmentAllocator allocator, short[] code) {
        glReplacementCodeusvSUN(allocator.allocateArray(JAVA_SHORT, code));
    }
}
