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
import java.lang.foreign.SegmentAllocator;

import static org.overrun.glib.gl.GL45C.*;

/**
 * {@code GL_KHR_robustness}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLKHRRobustness {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
    }

    public static int glGetGraphicsResetStatus() {
        return getGraphicsResetStatus();
    }

    public static void glGetnUniformfv(int program, int location, int bufSize, MemorySegment params) {
        getnUniformfv(program, location, bufSize, params);
    }

    public static void glGetnUniformfv(int program, int location, MemorySegment params) {
        getnUniformfv(program, location, params);
    }

    public static void glGetnUniformfv(SegmentAllocator allocator, int program, int location, float[] params) {
        getnUniformfv(allocator, program, location, params);
    }

    public static void glGetnUniformiv(int program, int location, int bufSize, MemorySegment params) {
        getnUniformiv(program, location, bufSize, params);
    }

    public static void glGetnUniformiv(int program, int location, MemorySegment params) {
        getnUniformiv(program, location, params);
    }

    public static void glGetnUniformiv(SegmentAllocator allocator, int program, int location, int[] params) {
        getnUniformiv(allocator, program, location, params);
    }

    public static void glGetnUniformuiv(int program, int location, int bufSize, MemorySegment params) {
        getnUniformuiv(program, location, bufSize, params);
    }

    public static void glGetnUniformuiv(int program, int location, MemorySegment params) {
        getnUniformuiv(program, location, params);
    }

    public static void glGetnUniformuiv(SegmentAllocator allocator, int program, int location, int[] params) {
        getnUniformuiv(allocator, program, location, params);
    }

    public static void glReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        readnPixels(x, y, width, height, format, type, bufSize, data);
    }

    public static void glReadnPixels(int x, int y, int width, int height, int format, int type, MemorySegment data) {
        readnPixels(x, y, width, height, format, type, data);
    }

    public static void glReadnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, byte[] data) {
        readnPixels(allocator, x, y, width, height, format, type, data);
    }

    public static void glReadnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, short[] data) {
        readnPixels(allocator, x, y, width, height, format, type, data);
    }

    public static void glReadnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, int[] data) {
        readnPixels(allocator, x, y, width, height, format, type, data);
    }

    public static void glReadnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, float[] data) {
        readnPixels(allocator, x, y, width, height, format, type, data);
    }
}
