/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
package overrungl.opengl.ext.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_convolution}
 */
public interface GLEXTConvolution extends overrun.marshal.DirectAccess {
    int GL_CONVOLUTION_1D_EXT = 0x8010;
    int GL_CONVOLUTION_2D_EXT = 0x8011;
    int GL_SEPARABLE_2D_EXT = 0x8012;
    int GL_CONVOLUTION_BORDER_MODE_EXT = 0x8013;
    int GL_CONVOLUTION_FILTER_SCALE_EXT = 0x8014;
    int GL_CONVOLUTION_FILTER_BIAS_EXT = 0x8015;
    int GL_REDUCE_EXT = 0x8016;
    int GL_CONVOLUTION_FORMAT_EXT = 0x8017;
    int GL_CONVOLUTION_WIDTH_EXT = 0x8018;
    int GL_CONVOLUTION_HEIGHT_EXT = 0x8019;
    int GL_MAX_CONVOLUTION_WIDTH_EXT = 0x801A;
    int GL_MAX_CONVOLUTION_HEIGHT_EXT = 0x801B;
    int GL_POST_CONVOLUTION_RED_SCALE_EXT = 0x801C;
    int GL_POST_CONVOLUTION_GREEN_SCALE_EXT = 0x801D;
    int GL_POST_CONVOLUTION_BLUE_SCALE_EXT = 0x801E;
    int GL_POST_CONVOLUTION_ALPHA_SCALE_EXT = 0x801F;
    int GL_POST_CONVOLUTION_RED_BIAS_EXT = 0x8020;
    int GL_POST_CONVOLUTION_GREEN_BIAS_EXT = 0x8021;
    int GL_POST_CONVOLUTION_BLUE_BIAS_EXT = 0x8022;
    int GL_POST_CONVOLUTION_ALPHA_BIAS_EXT = 0x8023;

    default void glConvolutionFilter1DEXT(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment image) {
        throw new ContextException();
    }

    default void glConvolutionFilter2DEXT(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment image) {
        throw new ContextException();
    }

    default void glConvolutionParameterfEXT(int target, int pname, float params) {
        throw new ContextException();
    }

    default void glConvolutionParameterfvEXT(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glConvolutionParameteriEXT(int target, int pname, int params) {
        throw new ContextException();
    }

    default void glConvolutionParameterivEXT(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glCopyConvolutionFilter1DEXT(int target, int internalformat, int x, int y, int width) {
        throw new ContextException();
    }

    default void glCopyConvolutionFilter2DEXT(int target, int internalformat, int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glGetConvolutionFilterEXT(int target, int format, int type, @NativeType("void *") MemorySegment image) {
        throw new ContextException();
    }

    default void glGetConvolutionParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetConvolutionParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetSeparableFilterEXT(int target, int format, int type, @NativeType("void *") MemorySegment row, @NativeType("void *") MemorySegment column, @NativeType("void *") MemorySegment span) {
        throw new ContextException();
    }

    default void glSeparableFilter2DEXT(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment row, @NativeType("const void *") MemorySegment column) {
        throw new ContextException();
    }

}
