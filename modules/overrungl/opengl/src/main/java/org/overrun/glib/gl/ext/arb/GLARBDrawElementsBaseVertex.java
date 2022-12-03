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

import static org.overrun.glib.gl.GL32C.*;

/**
 * {@code GL_ARB_draw_elements_base_vertex}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBDrawElementsBaseVertex {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
    }

    public static void glDrawElementsBaseVertex(int mode, int count, int type, Addressable indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, indices, baseVertex);
    }

    public static void glDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int baseVertex) {
        drawElementsBaseVertex(allocator, mode, count, type, indices, baseVertex);
    }

    public static void glDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int baseVertex) {
        drawElementsBaseVertex(allocator, mode, count, type, indices, baseVertex);
    }

    public static void glDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int baseVertex) {
        drawElementsBaseVertex(allocator, mode, count, type, indices, baseVertex);
    }

    public static void glDrawElementsInstancedBaseVertex(int mode, int count, int type, Addressable indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, indices, instanceCount, baseVertex);
    }

    public static void glDrawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(allocator, mode, count, type, indices, instanceCount, baseVertex);
    }

    public static void glDrawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(allocator, mode, count, type, indices, instanceCount, baseVertex);
    }

    public static void glDrawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(allocator, mode, count, type, indices, instanceCount, baseVertex);
    }

    public static void glDrawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, Addressable indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, indices, baseVertex);
    }

    public static void glDrawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, byte[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(allocator, mode, start, end, count, type, indices, baseVertex);
    }

    public static void glDrawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, short[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(allocator, mode, start, end, count, type, indices, baseVertex);
    }

    public static void glDrawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, int[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(allocator, mode, start, end, count, type, indices, baseVertex);
    }

    public static void glMultiDrawElementsBaseVertex(int mode, Addressable count, int type, Addressable indices, int drawCount, Addressable baseVertex) {
        multiDrawElementsBaseVertex(mode, count, type, indices, drawCount, baseVertex);
    }

    public static void glMultiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, Addressable[] indices, int drawCount, int[] baseVertex) {
        multiDrawElementsBaseVertex(allocator, mode, count, type, indices, drawCount, baseVertex);
    }

    public static void glMultiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices, int drawCount, int[] baseVertex) {
        multiDrawElementsBaseVertex(allocator, mode, count, type, indices, drawCount, baseVertex);
    }

    public static void glMultiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices, int drawCount, int[] baseVertex) {
        multiDrawElementsBaseVertex(allocator, mode, count, type, indices, drawCount, baseVertex);
    }

    public static void glMultiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices, int drawCount, int[] baseVertex) {
        multiDrawElementsBaseVertex(allocator, mode, count, type, indices, drawCount, baseVertex);
    }
}
