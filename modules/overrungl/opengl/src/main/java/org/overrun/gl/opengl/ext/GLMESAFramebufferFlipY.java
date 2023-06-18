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

package org.overrun.gl.opengl.ext;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;
import org.overrun.gl.FunctionDescriptors;
import org.overrun.gl.RuntimeHelper;
import org.overrun.gl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

/**
 * {@code GL_MESA_framebuffer_flip_y}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLMESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_X_MESA = 0x8BBC;
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;
    public static final int GL_FRAMEBUFFER_SWAP_XY_MESA = 0x8BBD;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_MESA_framebuffer_flip_y) return;
        ext.glFramebufferParameteriMESA = load.invoke("glFramebufferParameteriMESA", FunctionDescriptors.IIIV);
        ext.glGetFramebufferParameterivMESA = load.invoke("glGetFramebufferParameterivMESA", FunctionDescriptors.IIPV);
    }

    public static void glFramebufferParameteriMESA(int target, int pname, int param) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFramebufferParameteriMESA).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetFramebufferParameterivMESA(int target, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetFramebufferParameterivMESA).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetFramebufferParameterivMESA(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(ValueLayout.JAVA_INT, params.length);
        glGetFramebufferParameterivMESA(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int glGetFramebufferParameteriMESA(SegmentAllocator allocator, int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(ValueLayout.JAVA_INT);
            glGetFramebufferParameterivMESA(target, pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }
}
