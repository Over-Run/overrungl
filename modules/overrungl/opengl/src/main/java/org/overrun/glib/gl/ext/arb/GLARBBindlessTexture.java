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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_ARB_bindless_texture}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBBindlessTexture {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_bindless_texture) return;
        ext.glGetImageHandleARB = load.invoke("glGetImageHandleARB", IIZIIJ);
        ext.glGetTextureHandleARB = load.invoke("glGetTextureHandleARB", IJ);
        ext.glGetTextureSamplerHandleARB = load.invoke("glGetTextureSamplerHandleARB", IIJ);
        ext.glGetVertexAttribLui64vARB = load.invoke("glGetVertexAttribLui64vARB", IIPV);
        ext.glIsImageHandleResidentARB = load.invoke("glIsImageHandleResidentARB", JZ);
        ext.glIsTextureHandleResidentARB = load.invoke("glIsTextureHandleResidentARB", JZ);
        ext.glMakeImageHandleNonResidentARB = load.invoke("glMakeImageHandleNonResidentARB", JV);
        ext.glMakeImageHandleResidentARB = load.invoke("glMakeImageHandleResidentARB", JIV);
        ext.glMakeTextureHandleNonResidentARB = load.invoke("glMakeTextureHandleNonResidentARB", JV);
        ext.glMakeTextureHandleResidentARB = load.invoke("glMakeTextureHandleResidentARB", JV);
        ext.glProgramUniformHandleui64ARB = load.invoke("glProgramUniformHandleui64ARB", IIJV);
        ext.glProgramUniformHandleui64vARB = load.invoke("glProgramUniformHandleui64vARB", IIIPV);
        ext.glUniformHandleui64ARB = load.invoke("glUniformHandleui64ARB", IJV);
        ext.glUniformHandleui64vARB = load.invoke("glUniformHandleui64vARB", IIPV);
        ext.glVertexAttribL1ui64ARB = load.invoke("glVertexAttribL1ui64ARB", IJV);
        ext.glVertexAttribL1ui64vARB = load.invoke("glVertexAttribL1ui64vARB", IPV);
    }

    public static long glGetImageHandleARB(int texture, int level, boolean layered, int layer, int format) {
        var ext = getExtCapabilities();
        try {
            return (long) check(ext.glGetImageHandleARB).invokeExact(texture, level, layered, layer, format);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long glGetTextureHandleARB(int texture) {
        var ext = getExtCapabilities();
        try {
            return (long) check(ext.glGetTextureHandleARB).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long glGetTextureSamplerHandleARB(int texture, int sampler) {
        var ext = getExtCapabilities();
        try {
            return (long) check(ext.glGetTextureSamplerHandleARB).invokeExact(texture, sampler);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetVertexAttribLui64vARB(int index, int pname, Addressable params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribLui64vARB).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetVertexAttribLui64vARB(SegmentAllocator allocator, int index, int pname, long[] params) {
        var seg = allocator.allocateArray(JAVA_LONG, params.length);
        glGetVertexAttribLui64vARB(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static boolean glIsImageHandleResidentARB(long handle) {
        var ext = getExtCapabilities();
        try {
            return (boolean) check(ext.glIsImageHandleResidentARB).invokeExact(handle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glIsTextureHandleResidentARB(long handle) {
        var ext = getExtCapabilities();
        try {
            return (boolean) check(ext.glIsTextureHandleResidentARB).invokeExact(handle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMakeImageHandleNonResidentARB(long handle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMakeImageHandleNonResidentARB).invokeExact(handle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMakeImageHandleResidentARB(long handle, int access) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMakeImageHandleResidentARB).invokeExact(handle, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMakeTextureHandleNonResidentARB(long handle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMakeTextureHandleNonResidentARB).invokeExact(handle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMakeTextureHandleResidentARB(long handle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMakeTextureHandleResidentARB).invokeExact(handle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniformHandleui64ARB(int program, int location, long value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformHandleui64ARB).invokeExact(program, location, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniformHandleui64vARB(int program, int location, int count, Addressable values) {
        var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformHandleui64vARB).invokeExact(program, location, count, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramUniformHandleui64vARB(SegmentAllocator allocator, int program, int location, long[] values) {
        glProgramUniformHandleui64vARB(program, location, values.length, allocator.allocateArray(JAVA_LONG, values));
    }

    public static void glUniformHandleui64ARB(int location, long value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniformHandleui64ARB).invokeExact(location, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniformHandleui64vARB(int location, int count, Addressable value) {
        var ext = getExtCapabilities();
        try {
            check(ext.glUniformHandleui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUniformHandleui64vARB(SegmentAllocator allocator, int location, long[] value) {
        glUniformHandleui64vARB(location, value.length, allocator.allocateArray(JAVA_LONG, value));
    }

    public static void glVertexAttribL1ui64ARB(int index, long x) {
        var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1ui64ARB).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glVertexAttribL1ui64vARB(int index, Addressable v) {
        var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1ui64vARB).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glVertexAttribL1ui64vARB(SegmentAllocator allocator, int index, long[] v) {
        glVertexAttribL1ui64vARB(index, allocator.allocateArray(JAVA_LONG, v));
    }
}
