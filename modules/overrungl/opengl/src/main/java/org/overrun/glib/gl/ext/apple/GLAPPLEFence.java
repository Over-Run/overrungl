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

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Addressable;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * {@code GL_APPLE_fence}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEFence {
    @Nullable
    public static MethodHandle glDeleteFencesAPPLE, glFinishFenceAPPLE, glFinishObjectAPPLE, glGenFencesAPPLE,
        glIsFenceAPPLE, glSetFenceAPPLE, glTestFenceAPPLE, glTestObjectAPPLE;

    public static void load(GLLoadFunc load) {
        if (GLExtCaps.Flags.GL_APPLE_fence.no()) return;
        glDeleteFencesAPPLE = load.invoke("glDeleteFencesAPPLE", IPV);
        glFinishFenceAPPLE = load.invoke("glFinishFenceAPPLE", IV);
        glFinishObjectAPPLE = load.invoke("glFinishObjectAPPLE", IIV);
        glGenFencesAPPLE = load.invoke("glGenFencesAPPLE", IPV);
        glIsFenceAPPLE = load.invoke("glIsFenceAPPLE", IZ);
        glSetFenceAPPLE = load.invoke("glSetFenceAPPLE", IV);
        glTestFenceAPPLE = load.invoke("glTestFenceAPPLE", IZ);
        glTestObjectAPPLE = load.invoke("glTestObjectAPPLE", IIZ);
    }

    public static void glDeleteFencesAPPLE(int n, Addressable fences) {
        try {
            check(glDeleteFencesAPPLE).invokeExact(n, fences);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteFencesAPPLE(SegmentAllocator allocator, int[] fences) {
        glDeleteFencesAPPLE(fences.length, allocator.allocateArray(JAVA_INT, fences));
    }

    public static void glFinishFenceAPPLE(int fence) {
        try {
            check(glFinishFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFinishObjectAPPLE(int object, int name) {
        try {
            check(glFinishObjectAPPLE).invokeExact(object, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenFencesAPPLE(int n, Addressable fences) {
        try {
            check(glGenFencesAPPLE).invokeExact(n, fences);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenFencesAPPLE(SegmentAllocator allocator, int[] fences) {
        glGenFencesAPPLE(fences.length, allocator.allocateArray(JAVA_INT, fences));
    }

    public static int glGenFenceAPPLE() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGenFencesAPPLE(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean glIsFenceAPPLE(int fence) {
        try {
            return (boolean) check(glIsFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glSetFenceAPPLE(int fence) {
        try {
            check(glSetFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glTestFenceAPPLE(int fence) {
        try {
            return (boolean) check(glTestFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glTestObjectAPPLE(int object, int name) {
        try {
            return (boolean) check(glTestObjectAPPLE).invokeExact(object, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
