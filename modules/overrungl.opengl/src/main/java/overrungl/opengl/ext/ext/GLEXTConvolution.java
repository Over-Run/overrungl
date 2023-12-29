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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_convolution}
 */
public final class GLEXTConvolution {
    public static final int GL_CONVOLUTION_1D_EXT = 0x8010;
    public static final int GL_CONVOLUTION_2D_EXT = 0x8011;
    public static final int GL_SEPARABLE_2D_EXT = 0x8012;
    public static final int GL_CONVOLUTION_BORDER_MODE_EXT = 0x8013;
    public static final int GL_CONVOLUTION_FILTER_SCALE_EXT = 0x8014;
    public static final int GL_CONVOLUTION_FILTER_BIAS_EXT = 0x8015;
    public static final int GL_REDUCE_EXT = 0x8016;
    public static final int GL_CONVOLUTION_FORMAT_EXT = 0x8017;
    public static final int GL_CONVOLUTION_WIDTH_EXT = 0x8018;
    public static final int GL_CONVOLUTION_HEIGHT_EXT = 0x8019;
    public static final int GL_MAX_CONVOLUTION_WIDTH_EXT = 0x801A;
    public static final int GL_MAX_CONVOLUTION_HEIGHT_EXT = 0x801B;
    public static final int GL_POST_CONVOLUTION_RED_SCALE_EXT = 0x801C;
    public static final int GL_POST_CONVOLUTION_GREEN_SCALE_EXT = 0x801D;
    public static final int GL_POST_CONVOLUTION_BLUE_SCALE_EXT = 0x801E;
    public static final int GL_POST_CONVOLUTION_ALPHA_SCALE_EXT = 0x801F;
    public static final int GL_POST_CONVOLUTION_RED_BIAS_EXT = 0x8020;
    public static final int GL_POST_CONVOLUTION_GREEN_BIAS_EXT = 0x8021;
    public static final int GL_POST_CONVOLUTION_BLUE_BIAS_EXT = 0x8022;
    public static final int GL_POST_CONVOLUTION_ALPHA_BIAS_EXT = 0x8023;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_convolution) return;
        ext.glConvolutionFilter1DEXT = load.invoke("glConvolutionFilter1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glConvolutionFilter2DEXT = load.invoke("glConvolutionFilter2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glConvolutionParameterfEXT = load.invoke("glConvolutionParameterfEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glConvolutionParameterfvEXT = load.invoke("glConvolutionParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glConvolutionParameteriEXT = load.invoke("glConvolutionParameteriEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glConvolutionParameterivEXT = load.invoke("glConvolutionParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyConvolutionFilter1DEXT = load.invoke("glCopyConvolutionFilter1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyConvolutionFilter2DEXT = load.invoke("glCopyConvolutionFilter2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetConvolutionFilterEXT = load.invoke("glGetConvolutionFilterEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetConvolutionParameterfvEXT = load.invoke("glGetConvolutionParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetConvolutionParameterivEXT = load.invoke("glGetConvolutionParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetSeparableFilterEXT = load.invoke("glGetSeparableFilterEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS));
        ext.glSeparableFilter2DEXT = load.invoke("glSeparableFilter2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glConvolutionFilter1DEXT(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment image) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionFilter1DEXT).invokeExact(target, internalformat, width, format, type, image);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionFilter2DEXT(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment image) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionFilter2DEXT).invokeExact(target, internalformat, width, height, format, type, image);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterfEXT(int target, int pname, float params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterfEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterfvEXT(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameteriEXT(int target, int pname, int params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameteriEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glConvolutionParameterivEXT(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glConvolutionParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyConvolutionFilter1DEXT(int target, int internalformat, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyConvolutionFilter1DEXT).invokeExact(target, internalformat, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyConvolutionFilter2DEXT(int target, int internalformat, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyConvolutionFilter2DEXT).invokeExact(target, internalformat, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionFilterEXT(int target, int format, int type, @NativeType("void *") MemorySegment image) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionFilterEXT).invokeExact(target, format, type, image);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetConvolutionParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetConvolutionParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetSeparableFilterEXT(int target, int format, int type, @NativeType("void *") MemorySegment row, @NativeType("void *") MemorySegment column, @NativeType("void *") MemorySegment span) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetSeparableFilterEXT).invokeExact(target, format, type, row, column, span);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSeparableFilter2DEXT(int target, int internalformat, int width, int height, int format, int type, @NativeType("const void *") MemorySegment row, @NativeType("const void *") MemorySegment column) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSeparableFilter2DEXT).invokeExact(target, internalformat, width, height, format, type, row, column);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
