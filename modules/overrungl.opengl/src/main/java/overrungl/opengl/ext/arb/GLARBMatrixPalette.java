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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_matrix_palette}
 */
public interface GLARBMatrixPalette {
    int GL_MATRIX_PALETTE_ARB = 0x8840;
    int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 0x8841;
    int GL_MAX_PALETTE_MATRICES_ARB = 0x8842;
    int GL_CURRENT_PALETTE_MATRIX_ARB = 0x8843;
    int GL_MATRIX_INDEX_ARRAY_ARB = 0x8844;
    int GL_CURRENT_MATRIX_INDEX_ARB = 0x8845;
    int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 0x8846;
    int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 0x8847;
    int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 0x8848;
    int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 0x8849;

    default void glCurrentPaletteMatrixARB(int index) {
        throw new ContextException();
    }

    default void glMatrixIndexubvARB(int size, @NativeType("const GLubyte *") MemorySegment indices) {
        throw new ContextException();
    }

    default void glMatrixIndexusvARB(int size, @NativeType("const GLushort *") MemorySegment indices) {
        throw new ContextException();
    }

    default void glMatrixIndexuivARB(int size, @NativeType("const GLuint *") MemorySegment indices) {
        throw new ContextException();
    }

    default void glMatrixIndexPointerARB(int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

}
