/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
 */

package org.overrun.gl.opengl.ext.apple;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;
import org.overrun.gl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.gl.FunctionDescriptors.*;

/**
 * {@code GL_APPLE_fence}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEFence {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_fence) return;
        ext.glDeleteFencesAPPLE = load.invoke("glDeleteFencesAPPLE", IPV);
        ext.glFinishFenceAPPLE = load.invoke("glFinishFenceAPPLE", IV);
        ext.glFinishObjectAPPLE = load.invoke("glFinishObjectAPPLE", IIV);
        ext.glGenFencesAPPLE = load.invoke("glGenFencesAPPLE", IPV);
        ext.glIsFenceAPPLE = load.invoke("glIsFenceAPPLE", IZ);
        ext.glSetFenceAPPLE = load.invoke("glSetFenceAPPLE", IV);
        ext.glTestFenceAPPLE = load.invoke("glTestFenceAPPLE", IZ);
        ext.glTestObjectAPPLE = load.invoke("glTestObjectAPPLE", IIZ);
    }

    public static void glDeleteFencesAPPLE(int n, MemorySegment fences) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeleteFencesAPPLE).invokeExact(n, fences);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteFencesAPPLE(SegmentAllocator allocator, int[] fences) {
        glDeleteFencesAPPLE(fences.length, allocator.allocateArray(JAVA_INT, fences));
    }

    public static void glFinishFenceAPPLE(int fence) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFinishFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFinishObjectAPPLE(int object, int name) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFinishObjectAPPLE).invokeExact(object, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenFencesAPPLE(int n, MemorySegment fences) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGenFencesAPPLE).invokeExact(n, fences);
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
        var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) GLLoader.check(ext.glIsFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glSetFenceAPPLE(int fence) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glSetFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glTestFenceAPPLE(int fence) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) GLLoader.check(ext.glTestFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glTestObjectAPPLE(int object, int name) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) GLLoader.check(ext.glTestObjectAPPLE).invokeExact(object, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
