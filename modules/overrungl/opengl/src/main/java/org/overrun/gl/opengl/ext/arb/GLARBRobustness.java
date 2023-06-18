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
 */

// this file is auto-generated. DO NOT EDIT!
package org.overrun.gl.opengl.ext.arb;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;

import java.lang.foreign.MemorySegment;

import static org.overrun.gl.FunctionDescriptors.*;

/**
 * {@code GL_ARB_robustness}
 */
public final class GLARBRobustness {
    public static final int GL_NO_RESET_NOTIFICATION_ARB = 0x8261;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_ARB = 0x8256;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT_ARB = 0x00000004;
    public static final int GL_UNKNOWN_CONTEXT_RESET_ARB = 0x8255;
    public static final int GL_LOSE_CONTEXT_ON_RESET_ARB = 0x8252;
    public static final int GL_INNOCENT_CONTEXT_RESET_ARB = 0x8254;
    public static final int GL_GUILTY_CONTEXT_RESET_ARB = 0x8253;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_robustness) return;
        ext.glGetGraphicsResetStatusARB = load.invoke("glGetGraphicsResetStatusARB", I);
        ext.glGetnCompressedTexImageARB = load.invoke("glGetnCompressedTexImageARB", IIIPV);
        ext.glGetnTexImageARB = load.invoke("glGetnTexImageARB", IIIIIPV);
        ext.glGetnUniformdvARB = load.invoke("glGetnUniformdvARB", IIIPV);
        ext.glGetnUniformfvARB = load.invoke("glGetnUniformfvARB", IIIPV);
        ext.glGetnUniformivARB = load.invoke("glGetnUniformivARB", IIIPV);
        ext.glGetnUniformuivARB = load.invoke("glGetnUniformuivARB", IIIPV);
        ext.glReadnPixelsARB = load.invoke("glReadnPixelsARB", IIIIIIIPV);
    }

    public static int glGetGraphicsResetStatusARB() {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glGetGraphicsResetStatusARB).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetnCompressedTexImageARB(int target, int lod, int bufSize, MemorySegment img) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetnCompressedTexImageARB).invokeExact(target, lod, bufSize, img);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetnTexImageARB(int target, int level, int format, int type, int bufSize, MemorySegment img) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetnTexImageARB).invokeExact(target, level, format, type, bufSize, img);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetnUniformdvARB(int program, int location, int bufSize, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetnUniformdvARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetnUniformfvARB(int program, int location, int bufSize, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetnUniformfvARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetnUniformivARB(int program, int location, int bufSize, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetnUniformivARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetnUniformuivARB(int program, int location, int bufSize, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetnUniformuivARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glReadnPixelsARB(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReadnPixelsARB).invokeExact(x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
