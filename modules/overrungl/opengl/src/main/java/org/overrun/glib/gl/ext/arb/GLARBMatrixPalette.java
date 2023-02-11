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

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.MemorySegment;

import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_ARB_matrix_palette}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBMatrixPalette {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_matrix_palette) return;
        ext.glCurrentPaletteMatrixARB = load.invoke("glCurrentPaletteMatrixARB", IV);
        ext.glMatrixIndexPointerARB = load.invoke("glMatrixIndexPointerARB", IIIPV);
        ext.glMatrixIndexubvARB = load.invoke("glMatrixIndexubvARB", IPV);
        ext.glMatrixIndexuivARB = load.invoke("glMatrixIndexuivARB", IPV);
        ext.glMatrixIndexusvARB = load.invoke("glMatrixIndexusvARB", IPV);
    }

    public static void glCurrentPaletteMatrixARB(int index) {
        var ext = getExtCapabilities();
        try {
            check(ext.glCurrentPaletteMatrixARB).invokeExact(index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMatrixIndexPointerARB(int size, int type, int stride, MemorySegment pointer) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexPointerARB).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMatrixIndexubvARB(int size, MemorySegment indices) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexubvARB).invokeExact(size, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMatrixIndexuivARB(int size, MemorySegment indices) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexuivARB).invokeExact(size, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glMatrixIndexusvARB(int size, MemorySegment indices) {
        var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexusvARB).invokeExact(size, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
