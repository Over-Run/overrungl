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
import org.overrun.glib.gl.GLLoader;

import java.lang.foreign.Addressable;

import static org.overrun.glib.FunctionDescriptors.IIPV;
import static org.overrun.glib.FunctionDescriptors.IV;

/**
 * {@code GL_INTEL_parallel_arrays}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLINTELParallelArrays {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_parallel_arrays) return;
        ext.glColorPointervINTEL = load.invoke("glColorPointervINTEL", IIPV);
        ext.glNormalPointervINTEL = load.invoke("glNormalPointervINTEL", IV);
        ext.glTexCoordPointervINTEL = load.invoke("glTexCoordPointervINTEL", IIPV);
        ext.glVertexPointervINTEL = load.invoke("glVertexPointervINTEL", IIPV);
    }

    public static void glColorPointervINTEL(int size, int type, Addressable pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glColorPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNormalPointervINTEL(int type, Addressable pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNormalPointervINTEL).invokeExact(type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoordPointervINTEL(int size, int type, Addressable pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTexCoordPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glVertexPointervINTEL(int size, int type, Addressable pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glVertexPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
