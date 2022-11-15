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

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 1.4 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL14C extends GL13C permits GL14, GL15C {
    @Nullable
    public static MethodHandle
        glBlendColor, glBlendEquation, glBlendFuncSeparate, glMultiDrawArrays, glMultiDrawElements, glPointParameterf,
        glPointParameterfv, glPointParameteri, glPointParameteriv;

    static boolean isSupported() {
        return checkAll(glBlendColor, glBlendEquation, glBlendFuncSeparate, glMultiDrawArrays, glMultiDrawElements,
            glPointParameterf, glPointParameterfv, glPointParameteri, glPointParameteriv);
    }

    static void load(GLLoadFunc load) {
        glBlendColor = load.invoke("glBlendColor", FFFFV);
        glBlendEquation = load.invoke("glBlendEquation", IV);
        glBlendFuncSeparate = load.invoke("glBlendFuncSeparate", IIIIV);
        glMultiDrawArrays = load.invoke("glMultiDrawArrays", IPPIV);
        glMultiDrawElements = load.invoke("glMultiDrawElements", IPIPIV);
        glPointParameterf = load.invoke("glPointParameterf", IFV);
        glPointParameterfv = load.invoke("glPointParameterfv", IPV);
        glPointParameteri = load.invoke("glPointParameteri", IIV);
        glPointParameteriv = load.invoke("glPointParameteriv", IPV);
    }

    public static void blendColor(float red, float green, float blue, float alpha) {
        try {
            check(glBlendColor).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquation(int mode) {
        try {
            check(glBlendEquation).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        try {
            check(glBlendFuncSeparate).invokeExact(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArrays(int mode, Addressable first, Addressable count, int drawCount) {
        try {
            check(glMultiDrawArrays).invokeExact(mode, first, count, drawCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArrays(SegmentAllocator session, int mode, int[] first, int[] count, int drawCount) {
        multiDrawArrays(mode, session.allocateArray(JAVA_INT, first), session.allocateArray(JAVA_INT, count), drawCount);
    }

    public static void multiDrawArrays(SegmentAllocator session, int mode, int[] first, int[] count) {
        multiDrawArrays(session, mode, first, count, first.length);
    }

    public static void multiDrawElements(int mode, Addressable count, int type, Addressable indices, int drawCount) {
        try {
            check(glMultiDrawElements).invokeExact(mode, count, type, indices, drawCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElements(SegmentAllocator session, int mode, int[] count, int type, byte[][] indices, int drawCount) {
        var seg = session.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, session.allocateArray(JAVA_BYTE, indices[i]));
        }
        multiDrawElements(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount);
    }

    public static void multiDrawElements(SegmentAllocator session, int mode, int[] count, int type, byte[][] indices) {
        multiDrawElements(session, mode, count, type, indices, count.length);
    }

    public static void multiDrawElements(SegmentAllocator session, int mode, int[] count, int type, short[][] indices, int drawCount) {
        var seg = session.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, session.allocateArray(JAVA_SHORT, indices[i]));
        }
        multiDrawElements(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount);
    }

    public static void multiDrawElements(SegmentAllocator session, int mode, int[] count, int type, short[][] indices) {
        multiDrawElements(session, mode, count, type, indices, count.length);
    }

    public static void multiDrawElements(SegmentAllocator session, int mode, int[] count, int type, int[][] indices, int drawCount) {
        var seg = session.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, session.allocateArray(JAVA_INT, indices[i]));
        }
        multiDrawElements(mode, session.allocateArray(JAVA_INT, count), type, seg, drawCount);
    }

    public static void multiDrawElements(SegmentAllocator session, int mode, int[] count, int type, int[][] indices) {
        multiDrawElements(session, mode, count, type, indices, count.length);
    }

    public static void pointParameterf(int pname, float param) {
        try {
            check(glPointParameterf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointParameterfv(int pname, Addressable params) {
        try {
            check(glPointParameterfv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointParameterfv(SegmentAllocator session, int pname, float[] params) {
        pointParameterfv(pname, session.allocateArray(JAVA_FLOAT, params));
    }

    public static void pointParameteri(int pname, int param) {
        try {
            check(glPointParameteri).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointParameteriv(int pname, Addressable params) {
        try {
            check(glPointParameteriv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointParameteriv(SegmentAllocator session, int pname, int[] params) {
        pointParameteriv(pname, session.allocateArray(JAVA_INT, params));
    }
}
