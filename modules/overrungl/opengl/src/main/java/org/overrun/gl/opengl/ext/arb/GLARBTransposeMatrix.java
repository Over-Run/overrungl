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

import static org.overrun.gl.FunctionDescriptors.PV;

/**
 * {@code GL_ARB_transpose_matrix}
 */
public final class GLARBTransposeMatrix {
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_transpose_matrix) return;
        ext.glLoadTransposeMatrixfARB = load.invoke("glLoadTransposeMatrixfARB", PV);
        ext.glLoadTransposeMatrixdARB = load.invoke("glLoadTransposeMatrixdARB", PV);
        ext.glMultTransposeMatrixfARB = load.invoke("glMultTransposeMatrixfARB", PV);
        ext.glMultTransposeMatrixdARB = load.invoke("glMultTransposeMatrixdARB", PV);
    }

    public static void glLoadTransposeMatrixfARB(MemorySegment m) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glLoadTransposeMatrixfARB).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glLoadTransposeMatrixdARB(MemorySegment m) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glLoadTransposeMatrixdARB).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glMultTransposeMatrixfARB(MemorySegment m) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultTransposeMatrixfARB).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glMultTransposeMatrixdARB(MemorySegment m) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMultTransposeMatrixdARB).invokeExact(m);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
