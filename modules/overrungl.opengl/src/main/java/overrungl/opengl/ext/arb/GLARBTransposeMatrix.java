/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_transpose_matrix}
 */
public final class GLARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_transpose_matrix) return;
        ext.glLoadTransposeMatrixfARB = load.invoke("glLoadTransposeMatrixfARB", ofVoid(ADDRESS));
        ext.glLoadTransposeMatrixdARB = load.invoke("glLoadTransposeMatrixdARB", ofVoid(ADDRESS));
        ext.glMultTransposeMatrixfARB = load.invoke("glMultTransposeMatrixfARB", ofVoid(ADDRESS));
        ext.glMultTransposeMatrixdARB = load.invoke("glMultTransposeMatrixdARB", ofVoid(ADDRESS));
    }

    public static void glLoadTransposeMatrixfARB(@NativeType("const GLfloat*") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLoadTransposeMatrixfARB).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLoadTransposeMatrixdARB(@NativeType("const GLdouble*") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLoadTransposeMatrixdARB).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultTransposeMatrixfARB(@NativeType("const GLfloat*") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultTransposeMatrixfARB).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultTransposeMatrixdARB(@NativeType("const GLdouble*") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultTransposeMatrixdARB).invokeExact(m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
