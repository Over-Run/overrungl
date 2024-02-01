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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_transpose_matrix}
 */
public interface GLARBTransposeMatrix {
    int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 0x84E3;
    int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 0x84E4;
    int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 0x84E5;
    int GL_TRANSPOSE_COLOR_MATRIX_ARB = 0x84E6;

    void glLoadTransposeMatrixfARB(@NativeType("const GLfloat*") MemorySegment m);
    void glLoadTransposeMatrixdARB(@NativeType("const GLdouble*") MemorySegment m);
    void glMultTransposeMatrixfARB(@NativeType("const GLfloat*") MemorySegment m);
    void glMultTransposeMatrixdARB(@NativeType("const GLdouble*") MemorySegment m);
}
