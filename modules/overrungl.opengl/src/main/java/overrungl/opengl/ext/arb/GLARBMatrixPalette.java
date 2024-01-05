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
 * {@code GL_ARB_matrix_palette}
 */
public final class GLARBMatrixPalette {
    public static final int GL_MATRIX_PALETTE_ARB = 0x8840;
    public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841;
    public static final int GL_MAX_PALETTE_MATRICES_ARB = 0x8842;
    public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 0x8843;
    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;
    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;
    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 0x8846;
    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 0x8847;
    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_matrix_palette) return;
        ext.glCurrentPaletteMatrixARB = load.invoke("glCurrentPaletteMatrixARB", ofVoid(JAVA_INT));
        ext.glMatrixIndexubvARB = load.invoke("glMatrixIndexubvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixIndexusvARB = load.invoke("glMatrixIndexusvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixIndexuivARB = load.invoke("glMatrixIndexuivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixIndexPointerARB = load.invoke("glMatrixIndexPointerARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glCurrentPaletteMatrixARB(int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCurrentPaletteMatrixARB).invokeExact(index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixIndexubvARB(int size, @NativeType("const GLubyte *") MemorySegment indices) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexubvARB).invokeExact(size, indices);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixIndexusvARB(int size, @NativeType("const GLushort *") MemorySegment indices) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexusvARB).invokeExact(size, indices);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixIndexuivARB(int size, @NativeType("const GLuint *") MemorySegment indices) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexuivARB).invokeExact(size, indices);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixIndexPointerARB(int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixIndexPointerARB).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
