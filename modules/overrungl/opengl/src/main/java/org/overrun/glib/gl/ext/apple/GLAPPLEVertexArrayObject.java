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

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_APPLE_vertex_array_object}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEVertexArrayObject {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_vertex_array_object) return;
        ext.glBindVertexArrayAPPLE = load.invoke("glBindVertexArrayAPPLE", IV);
        ext.glDeleteVertexArraysAPPLE = load.invoke("glDeleteVertexArraysAPPLE", IPV);
        ext.glGenVertexArraysAPPLE = load.invoke("glGenVertexArraysAPPLE", IPV);
        ext.glIsVertexArrayAPPLE = load.invoke("glIsVertexArrayAPPLE", IZ);
    }

    public static void glBindVertexArrayAPPLE(int array) {
        var ext = getExtCapabilities();
        try {
            check(ext.glBindVertexArrayAPPLE).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteVertexArraysAPPLE(int n, MemorySegment arrays) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDeleteVertexArraysAPPLE).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteVertexArraysAPPLE(SegmentAllocator allocator, int[] arrays) {
        glDeleteVertexArraysAPPLE(arrays.length, allocator.allocateArray(JAVA_INT, arrays));
    }

    public static void glDeleteVertexArrayAPPLE(SegmentAllocator allocator, int array) {
        glDeleteVertexArraysAPPLE(1, allocator.allocate(JAVA_INT, array));
    }

    public static void glGenVertexArraysAPPLE(int n, MemorySegment arrays) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGenVertexArraysAPPLE).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenVertexArraysAPPLE(SegmentAllocator allocator, int[] arrays) {
        var seg = allocator.allocateArray(JAVA_INT, arrays.length);
        glGenVertexArraysAPPLE(arrays.length, seg);
        RuntimeHelper.toArray(seg, arrays);
    }

    public static int glGenVertexArrayAPPLE() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGenVertexArraysAPPLE(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean glIsVertexArrayAPPLE(int array) {
        var ext = getExtCapabilities();
        try {
            return (boolean) check(ext.glIsVertexArrayAPPLE).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
