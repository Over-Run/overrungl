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
 * {@code GL_ARB_imaging}
 */
public interface GLARBImaging {
    int GL_CONVOLUTION_BORDER_MODE = 0x8013;
    int GL_CONVOLUTION_FILTER_SCALE = 0x8014;
    int GL_CONVOLUTION_FILTER_BIAS = 0x8015;
    int GL_REDUCE = 0x8016;
    int GL_CONVOLUTION_FORMAT = 0x8017;
    int GL_CONVOLUTION_WIDTH = 0x8018;
    int GL_CONVOLUTION_HEIGHT = 0x8019;
    int GL_MAX_CONVOLUTION_WIDTH = 0x801A;
    int GL_MAX_CONVOLUTION_HEIGHT = 0x801B;
    int GL_POST_CONVOLUTION_RED_SCALE = 0x801C;
    int GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D;
    int GL_POST_CONVOLUTION_BLUE_SCALE = 0x801E;
    int GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F;
    int GL_POST_CONVOLUTION_RED_BIAS = 0x8020;
    int GL_POST_CONVOLUTION_GREEN_BIAS = 0x8021;
    int GL_POST_CONVOLUTION_BLUE_BIAS = 0x8022;
    int GL_POST_CONVOLUTION_ALPHA_BIAS = 0x8023;
    int GL_HISTOGRAM_WIDTH = 0x8026;
    int GL_HISTOGRAM_FORMAT = 0x8027;
    int GL_HISTOGRAM_RED_SIZE = 0x8028;
    int GL_HISTOGRAM_GREEN_SIZE = 0x8029;
    int GL_HISTOGRAM_BLUE_SIZE = 0x802A;
    int GL_HISTOGRAM_ALPHA_SIZE = 0x802B;
    int GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C;
    int GL_HISTOGRAM_SINK = 0x802D;
    int GL_MINMAX_FORMAT = 0x802F;
    int GL_MINMAX_SINK = 0x8030;
    int GL_TABLE_TOO_LARGE = 0x8031;
    int GL_COLOR_MATRIX = 0x80B1;
    int GL_COLOR_MATRIX_STACK_DEPTH = 0x80B2;
    int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;
    int GL_POST_COLOR_MATRIX_RED_SCALE = 0x80B4;
    int GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5;
    int GL_POST_COLOR_MATRIX_BLUE_SCALE = 0x80B6;
    int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7;
    int GL_POST_COLOR_MATRIX_RED_BIAS = 0x80B8;
    int GL_POST_COLOR_MATRIX_GREEN_BIAS = 0x80B9;
    int GL_POST_COLOR_MATRIX_BLUE_BIAS = 0x80BA;
    int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 0x80BB;
    int GL_COLOR_TABLE_SCALE = 0x80D6;
    int GL_COLOR_TABLE_BIAS = 0x80D7;
    int GL_COLOR_TABLE_FORMAT = 0x80D8;
    int GL_COLOR_TABLE_WIDTH = 0x80D9;
    int GL_COLOR_TABLE_RED_SIZE = 0x80DA;
    int GL_COLOR_TABLE_GREEN_SIZE = 0x80DB;
    int GL_COLOR_TABLE_BLUE_SIZE = 0x80DC;
    int GL_COLOR_TABLE_ALPHA_SIZE = 0x80DD;
    int GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE;
    int GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;
    int GL_CONSTANT_BORDER = 0x8151;
    int GL_REPLICATE_BORDER = 0x8153;
    int GL_CONVOLUTION_BORDER_COLOR = 0x8154;

    default void glColorTable(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment table) {
        throw new ContextException();
    }

    default void glColorTableParameterfv(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glColorTableParameteriv(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
        throw new ContextException();
    }

    default void glGetColorTable(int target, int format, int type, @NativeType("void *") MemorySegment table) {
        throw new ContextException();
    }

    default void glGetColorTableParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetColorTableParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glColorSubTable(int target, int start, int count, int format, int type, @NativeType("const void *") MemorySegment data) {
        throw new ContextException();
    }

    default void glCopyColorSubTable(int target, int start, int x, int y, int width) {
        throw new ContextException();
    }

    default void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment image) {
        throw new ContextException();
    }

    default void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment image) {
        throw new ContextException();
    }

    default void glConvolutionParameterf(int target, int pname, float params) {
        throw new ContextException();
    }

    default void glConvolutionParameterfv(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glConvolutionParameteri(int target, int pname, int params) {
        throw new ContextException();
    }

    default void glConvolutionParameteriv(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
        throw new ContextException();
    }

    default void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glGetConvolutionFilter(int target, int format, int type, @NativeType("void *") MemorySegment image) {
        throw new ContextException();
    }

    default void glGetConvolutionParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetConvolutionParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetSeparableFilter(int target, int format, int type, @NativeType("void *") MemorySegment row, @NativeType("void *") MemorySegment column, @NativeType("void *") MemorySegment span) {
        throw new ContextException();
    }

    default void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment row, @NativeType("const void *") MemorySegment column) {
        throw new ContextException();
    }

    default void glGetHistogram(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetHistogramParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetHistogramParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMinmax(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        throw new ContextException();
    }

    default void glGetMinmaxParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMinmaxParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glHistogram(int target, int width, int internalformat, boolean sink) {
        throw new ContextException();
    }

    default void glMinmax(int target, int internalformat, boolean sink) {
        throw new ContextException();
    }

    default void glResetHistogram(int target) {
        throw new ContextException();
    }

    default void glResetMinmax(int target) {
        throw new ContextException();
    }

}
