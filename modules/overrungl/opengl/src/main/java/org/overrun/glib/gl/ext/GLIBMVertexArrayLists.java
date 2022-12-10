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

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.MemorySegment;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_IBM_vertex_array_lists}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLIBMVertexArrayLists {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_IBM_vertex_array_lists) return;
        ext.glColorPointerListIBM = load.invoke("glColorPointerListIBM", IIIPIV);
        ext.glEdgeFlagPointerListIBM = load.invoke("glEdgeFlagPointerListIBM", IPIV);
        ext.glFogCoordPointerListIBM = load.invoke("glFogCoordPointerListIBM", IIPIV);
        ext.glIndexPointerListIBM = load.invoke("glIndexPointerListIBM", IIPIV);
        ext.glNormalPointerListIBM = load.invoke("glNormalPointerListIBM", IIPIV);
        ext.glSecondaryColorPointerListIBM = load.invoke("glSecondaryColorPointerListIBM", IIIPIV);
        ext.glTexCoordPointerListIBM = load.invoke("glTexCoordPointerListIBM", IIIPIV);
        ext.glVertexPointerListIBM = load.invoke("glVertexPointerListIBM", IIIPIV);
    }

    public static void glColorPointerListIBM(int size, int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glColorPointerListIBM).invokeExact(size, type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glEdgeFlagPointerListIBM(int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glEdgeFlagPointerListIBM).invokeExact(stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFogCoordPointerListIBM(int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordPointerListIBM).invokeExact(type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glIndexPointerListIBM(int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glIndexPointerListIBM).invokeExact(type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNormalPointerListIBM(int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glNormalPointerListIBM).invokeExact(type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glSecondaryColorPointerListIBM(int size, int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColorPointerListIBM).invokeExact(size, type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoordPointerListIBM(int size, int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glTexCoordPointerListIBM).invokeExact(size, type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glVertexPointerListIBM(int size, int type, int stride, MemorySegment pointer, int ptrStride) {
        var ext = getExtCapabilities();
        try {
            check(ext.glVertexPointerListIBM).invokeExact(size, type, stride, pointer, ptrStride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
