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

package org.overrun.glib.gl.ext;

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_HP_image_transform}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLHPImageTransform {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_HP_image_transform) return;
        ext.glGetImageTransformParameterfvHP = load.invoke("glGetImageTransformParameterfvHP", IIPV);
        ext.glGetImageTransformParameterivHP = load.invoke("glGetImageTransformParameterivHP", IIPV);
        ext.glImageTransformParameterfHP = load.invoke("glImageTransformParameterfHP", IIFV);
        ext.glImageTransformParameterfvHP = load.invoke("glImageTransformParameterfvHP", IIPV);
        ext.glImageTransformParameteriHP = load.invoke("glImageTransformParameteriHP", IIIV);
        ext.glImageTransformParameterivHP = load.invoke("glImageTransformParameterivHP", IIPV);
    }

    public static void glGetImageTransformParameterfvHP(int target, int pname, Addressable params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetImageTransformParameterfvHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetImageTransformParameterfvHP(SegmentAllocator allocator, int target, int pname, float[] params) {
        var seg = allocator.allocateArray(ValueLayout.JAVA_FLOAT, params.length);
        glGetImageTransformParameterfvHP(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void glGetImageTransformParameterivHP(int target, int pname, Addressable params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetImageTransformParameterivHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetImageTransformParameterivHP(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(ValueLayout.JAVA_INT, params.length);
        glGetImageTransformParameterivHP(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void glImageTransformParameterfHP(int target, int pname, float param) {
        var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameterfHP).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterfvHP(int target, int pname, Addressable params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameterfvHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterfvHP(SegmentAllocator allocator, int target, int pname, float[] params) {
        glImageTransformParameterfvHP(target, pname, allocator.allocateArray(ValueLayout.JAVA_FLOAT, params));
    }

    public static void glImageTransformParameteriHP(int target, int pname, int param) {
        var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameteriHP).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterivHP(int target, int pname, Addressable params) {
        var ext = getExtCapabilities();
        try {
            check(ext.glImageTransformParameterivHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterivHP(SegmentAllocator allocator, int target, int pname, int[] params) {
        glImageTransformParameterivHP(target, pname, allocator.allocateArray(ValueLayout.JAVA_INT, params));
    }
}
