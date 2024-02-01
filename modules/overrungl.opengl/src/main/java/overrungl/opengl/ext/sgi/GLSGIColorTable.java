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
package overrungl.opengl.ext.sgi;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SGI_color_table}
 */
public interface GLSGIColorTable {
    int GL_COLOR_TABLE_SGI = 0x80D0;
    int GL_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D1;
    int GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D2;
    int GL_PROXY_COLOR_TABLE_SGI = 0x80D3;
    int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D4;
    int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D5;
    int GL_COLOR_TABLE_SCALE_SGI = 0x80D6;
    int GL_COLOR_TABLE_BIAS_SGI = 0x80D7;
    int GL_COLOR_TABLE_FORMAT_SGI = 0x80D8;
    int GL_COLOR_TABLE_WIDTH_SGI = 0x80D9;
    int GL_COLOR_TABLE_RED_SIZE_SGI = 0x80DA;
    int GL_COLOR_TABLE_GREEN_SIZE_SGI = 0x80DB;
    int GL_COLOR_TABLE_BLUE_SIZE_SGI = 0x80DC;
    int GL_COLOR_TABLE_ALPHA_SIZE_SGI = 0x80DD;
    int GL_COLOR_TABLE_LUMINANCE_SIZE_SGI = 0x80DE;
    int GL_COLOR_TABLE_INTENSITY_SIZE_SGI = 0x80DF;

    default void glColorTableSGI(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment table) {
        throw new ContextException();
    }

    default void glColorTableParameterfvSGI(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glColorTableParameterivSGI(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glCopyColorTableSGI(int target, int internalformat, int x, int y, int width) {
        throw new ContextException();
    }

    default void glGetColorTableSGI(int target, int format, int type, @NativeType("void *") MemorySegment table) {
        throw new ContextException();
    }

    default void glGetColorTableParameterfvSGI(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetColorTableParameterivSGI(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

}
