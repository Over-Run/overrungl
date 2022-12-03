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

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;

import static org.overrun.glib.gl.GL42C.*;

/**
 * {@code GL_ARB_base_instance}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBBaseInstance {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
    }

    public static void glDrawArraysInstancedBaseInstance(int mode, int first, int count, int instanceCount, int baseInstance) {
        drawArraysInstancedBaseInstance(mode, first, count, instanceCount, baseInstance);
    }

    public static void glDrawElementsInstancedBaseInstance(int mode, int count, int type, Addressable indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(mode, count, type, indices, instanceCount, baseInstance);
    }

    public static void glDrawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(allocator, mode, count, type, indices, instanceCount, baseInstance);
    }

    public static void glDrawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(allocator, mode, count, type, indices, instanceCount, baseInstance);
    }

    public static void glDrawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(allocator, mode, count, type, indices, instanceCount, baseInstance);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, Addressable indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, instanceCount, baseVertex, baseInstance);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(allocator, mode, count, type, indices, instanceCount, baseVertex, baseInstance);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(allocator, mode, count, type, indices, instanceCount, baseVertex, baseInstance);
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(allocator, mode, count, type, indices, instanceCount, baseVertex, baseInstance);
    }
}
