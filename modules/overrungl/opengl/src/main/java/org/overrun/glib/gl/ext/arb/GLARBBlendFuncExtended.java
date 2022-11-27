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

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.gl.GL33C;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;

/**
 * {@code GL_ARB_blend_func_extended}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBBlendFuncExtended {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_blend_func_extended) return;
        ext.caps.glBindFragDataLocationIndexed = load.invoke("glBindFragDataLocationIndexed", FunctionDescriptors.IIIPV);
        ext.caps.glGetFragDataIndex = load.invoke("glGetFragDataIndex", FunctionDescriptors.IPI);
    }

    public static void glBindFragDataLocationIndexed(int program, int colorNumber, int index, Addressable name) {
        GL33C.bindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    public static void glBindFragDataLocationIndexed(SegmentAllocator allocator, int program, int colorNumber, int index, String name) {
        GL33C.bindFragDataLocationIndexed(allocator, program, colorNumber, index, name);
    }

    public static int glGetFragDataIndex(int program, Addressable name) {
        return GL33C.getFragDataIndex(program, name);
    }

    public static int glGetFragDataIndex(SegmentAllocator allocator, int program, String name) {
        return GL33C.getFragDataIndex(allocator, program, name);
    }
}
