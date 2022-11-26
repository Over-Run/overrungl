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

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.gl.GLLoader;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_APPLE_vertex_program_evaluators}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEVertexProgramEvaluators {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_vertex_program_evaluators) return;
        ext.glDisableVertexAttribAPPLE = load.invoke("glDisableVertexAttribAPPLE", IIV);
        ext.glEnableVertexAttribAPPLE = load.invoke("glEnableVertexAttribAPPLE", IIV);
        ext.glIsVertexAttribEnabledAPPLE = load.invoke("glIsVertexAttribEnabledAPPLE", IIZ);
        ext.glMapVertexAttrib1dAPPLE = load.invoke("glMapVertexAttrib1dAPPLE", IIDDIIPV);
        ext.glMapVertexAttrib1fAPPLE = load.invoke("glMapVertexAttrib1fAPPLE", IIFFIIPV);
        ext.glMapVertexAttrib2dAPPLE = load.invoke("glMapVertexAttrib2dAPPLE", IIDDIIDDIIPV);
        ext.glMapVertexAttrib2fAPPLE = load.invoke("glMapVertexAttrib2fAPPLE", IIFFIIFFIIPV);
    }

    public static void glDisableVertexAttribAPPLE(int index, int pname) {
        var ext = GLLoader.getExtCapabilities();
        try {
            check(ext.glDisableVertexAttribAPPLE).invokeExact(index, pname);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glEnableVertexAttribAPPLE(int index, int pname) {
        var ext = GLLoader.getExtCapabilities();
        try {
            check(ext.glEnableVertexAttribAPPLE).invokeExact(index, pname);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glIsVertexAttribEnabledAPPLE(int index, int pname) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) check(ext.glIsVertexAttribEnabledAPPLE).invokeExact(index, pname);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, Addressable points) {
        var ext = GLLoader.getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib1dAPPLE).invokeExact(index, size, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMapVertexAttrib1dAPPLE(SegmentAllocator allocator, int index, int size, double u1, double u2, int stride, int order, double[] points) {
        glMapVertexAttrib1dAPPLE(index, size, u1, u2, stride, order, allocator.allocateArray(JAVA_DOUBLE, points));
    }

    public static void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, Addressable points) {
        var ext = GLLoader.getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib1fAPPLE).invokeExact(index, size, u1, u2, stride, order, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMapVertexAttrib1fAPPLE(SegmentAllocator allocator, int index, int size, float u1, float u2, int stride, int order, float[] points) {
        glMapVertexAttrib1fAPPLE(index, size, u1, u2, stride, order, allocator.allocateArray(JAVA_FLOAT, points));
    }

    public static void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, Addressable points) {
        var ext = GLLoader.getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib2dAPPLE).invokeExact(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMapVertexAttrib2dAPPLE(SegmentAllocator allocator, int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, double[] points) {
        glMapVertexAttrib2dAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, allocator.allocateArray(JAVA_DOUBLE, points));
    }

    public static void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, Addressable points) {
        var ext = GLLoader.getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib2fAPPLE).invokeExact(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMapVertexAttrib2fAPPLE(SegmentAllocator allocator, int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, float[] points) {
        glMapVertexAttrib2fAPPLE(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, allocator.allocateArray(JAVA_FLOAT, points));
    }
}
