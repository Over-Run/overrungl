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
 * {@code GL_ARB_imaging}
 */
public final class GLARBImaging {
    public static final int GL_CONVOLUTION_BORDER_MODE = 0x8013;
    public static final int GL_CONVOLUTION_FILTER_SCALE = 0x8014;
    public static final int GL_CONVOLUTION_FILTER_BIAS = 0x8015;
    public static final int GL_REDUCE = 0x8016;
    public static final int GL_CONVOLUTION_FORMAT = 0x8017;
    public static final int GL_CONVOLUTION_WIDTH = 0x8018;
    public static final int GL_CONVOLUTION_HEIGHT = 0x8019;
    public static final int GL_MAX_CONVOLUTION_WIDTH = 0x801A;
    public static final int GL_MAX_CONVOLUTION_HEIGHT = 0x801B;
    public static final int GL_POST_CONVOLUTION_RED_SCALE = 0x801C;
    public static final int GL_POST_CONVOLUTION_GREEN_SCALE = 0x801D;
    public static final int GL_POST_CONVOLUTION_BLUE_SCALE = 0x801E;
    public static final int GL_POST_CONVOLUTION_ALPHA_SCALE = 0x801F;
    public static final int GL_POST_CONVOLUTION_RED_BIAS = 0x8020;
    public static final int GL_POST_CONVOLUTION_GREEN_BIAS = 0x8021;
    public static final int GL_POST_CONVOLUTION_BLUE_BIAS = 0x8022;
    public static final int GL_POST_CONVOLUTION_ALPHA_BIAS = 0x8023;
    public static final int GL_HISTOGRAM_WIDTH = 0x8026;
    public static final int GL_HISTOGRAM_FORMAT = 0x8027;
    public static final int GL_HISTOGRAM_RED_SIZE = 0x8028;
    public static final int GL_HISTOGRAM_GREEN_SIZE = 0x8029;
    public static final int GL_HISTOGRAM_BLUE_SIZE = 0x802A;
    public static final int GL_HISTOGRAM_ALPHA_SIZE = 0x802B;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE = 0x802C;
    public static final int GL_HISTOGRAM_SINK = 0x802D;
    public static final int GL_MINMAX_FORMAT = 0x802F;
    public static final int GL_MINMAX_SINK = 0x8030;
    public static final int GL_TABLE_TOO_LARGE = 0x8031;
    public static final int GL_COLOR_MATRIX = 0x80B1;
    public static final int GL_COLOR_MATRIX_STACK_DEPTH = 0x80B2;
    public static final int GL_MAX_COLOR_MATRIX_STACK_DEPTH = 0x80B3;
    public static final int GL_POST_COLOR_MATRIX_RED_SCALE = 0x80B4;
    public static final int GL_POST_COLOR_MATRIX_GREEN_SCALE = 0x80B5;
    public static final int GL_POST_COLOR_MATRIX_BLUE_SCALE = 0x80B6;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_SCALE = 0x80B7;
    public static final int GL_POST_COLOR_MATRIX_RED_BIAS = 0x80B8;
    public static final int GL_POST_COLOR_MATRIX_GREEN_BIAS = 0x80B9;
    public static final int GL_POST_COLOR_MATRIX_BLUE_BIAS = 0x80BA;
    public static final int GL_POST_COLOR_MATRIX_ALPHA_BIAS = 0x80BB;
    public static final int GL_COLOR_TABLE_SCALE = 0x80D6;
    public static final int GL_COLOR_TABLE_BIAS = 0x80D7;
    public static final int GL_COLOR_TABLE_FORMAT = 0x80D8;
    public static final int GL_COLOR_TABLE_WIDTH = 0x80D9;
    public static final int GL_COLOR_TABLE_RED_SIZE = 0x80DA;
    public static final int GL_COLOR_TABLE_GREEN_SIZE = 0x80DB;
    public static final int GL_COLOR_TABLE_BLUE_SIZE = 0x80DC;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE = 0x80DD;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE = 0x80DE;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE = 0x80DF;
    public static final int GL_CONSTANT_BORDER = 0x8151;
    public static final int GL_REPLICATE_BORDER = 0x8153;
    public static final int GL_CONVOLUTION_BORDER_COLOR = 0x8154;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_imaging) return;
        ext.glColorTable = load.invoke("glColorTable", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glColorTableParameterfv = load.invoke("glColorTableParameterfv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glColorTableParameteriv = load.invoke("glColorTableParameteriv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyColorTable = load.invoke("glCopyColorTable", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetColorTable = load.invoke("glGetColorTable", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableParameterfv = load.invoke("glGetColorTableParameterfv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableParameteriv = load.invoke("glGetColorTableParameteriv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glColorSubTable = load.invoke("glColorSubTable", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyColorSubTable = load.invoke("glCopyColorSubTable", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glConvolutionFilter1D = load.invoke("glConvolutionFilter1D", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glConvolutionFilter2D = load.invoke("glConvolutionFilter2D", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glConvolutionParameterf = load.invoke("glConvolutionParameterf", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glConvolutionParameterfv = load.invoke("glConvolutionParameterfv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glConvolutionParameteri = load.invoke("glConvolutionParameteri", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glConvolutionParameteriv = load.invoke("glConvolutionParameteriv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyConvolutionFilter1D = load.invoke("glCopyConvolutionFilter1D", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyConvolutionFilter2D = load.invoke("glCopyConvolutionFilter2D", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetConvolutionFilter = load.invoke("glGetConvolutionFilter", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetConvolutionParameterfv = load.invoke("glGetConvolutionParameterfv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetConvolutionParameteriv = load.invoke("glGetConvolutionParameteriv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetSeparableFilter = load.invoke("glGetSeparableFilter", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS));
        ext.glSeparableFilter2D = load.invoke("glSeparableFilter2D", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetHistogram = load.invoke("glGetHistogram", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetHistogramParameterfv = load.invoke("glGetHistogramParameterfv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetHistogramParameteriv = load.invoke("glGetHistogramParameteriv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMinmax = load.invoke("glGetMinmax", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMinmaxParameterfv = load.invoke("glGetMinmaxParameterfv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMinmaxParameteriv = load.invoke("glGetMinmaxParameteriv", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glHistogram = load.invoke("glHistogram", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glMinmax = load.invoke("glMinmax", ofVoid(JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glResetHistogram = load.invoke("glResetHistogram", ofVoid(JAVA_INT));
        ext.glResetMinmax = load.invoke("glResetMinmax", ofVoid(JAVA_INT));
    }

    public static void glColorTable(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment table) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTable).invokeExact(target, internalformat, width, format, type, table);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorTableParameterfv(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTableParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorTableParameteriv(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTableParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyColorTable(int target, int internalformat, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyColorTable).invokeExact(target, internalformat, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTable(int target, int format, int type, @NativeType("void *") MemorySegment table) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTable).invokeExact(target, format, type, table);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorSubTable(int target, int start, int count, int format, int type, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorSubTable).invokeExact(target, start, count, format, type, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyColorSubTable(int target, int start, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyColorSubTable).invokeExact(target, start, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionFilter1D(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment image) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionFilter1D).invokeExact(target, internalformat, width, format, type, image);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionFilter2D(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment image) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionFilter2D).invokeExact(target, internalformat, width, height, format, type, image);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterf(int target, int pname, float params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterf).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterfv(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameteri(int target, int pname, int params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameteri).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameteriv(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyConvolutionFilter1D(int target, int internalformat, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyConvolutionFilter1D).invokeExact(target, internalformat, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyConvolutionFilter2D(int target, int internalformat, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyConvolutionFilter2D).invokeExact(target, internalformat, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionFilter(int target, int format, int type, @NativeType("void *") MemorySegment image) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionFilter).invokeExact(target, format, type, image);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetSeparableFilter(int target, int format, int type, @NativeType("void *") MemorySegment row, @NativeType("void *") MemorySegment column, @NativeType("void *") MemorySegment span) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetSeparableFilter).invokeExact(target, format, type, row, column, span);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSeparableFilter2D(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment row, @NativeType("const void *") MemorySegment column) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSeparableFilter2D).invokeExact(target, internalformat, width, height, format, type, row, column);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetHistogram(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogram).invokeExact(target, reset, format, type, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetHistogramParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogramParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetHistogramParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogramParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMinmax(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMinmax).invokeExact(target, reset, format, type, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMinmaxParameterfv(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMinmaxParameterfv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMinmaxParameteriv(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMinmaxParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glHistogram(int target, int width, int internalformat, boolean sink) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glHistogram).invokeExact(target, width, internalformat, sink);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMinmax(int target, int internalformat, boolean sink) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMinmax).invokeExact(target, internalformat, sink);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glResetHistogram(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResetHistogram).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glResetMinmax(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResetMinmax).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
