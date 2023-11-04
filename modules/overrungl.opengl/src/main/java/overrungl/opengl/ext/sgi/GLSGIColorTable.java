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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGI_color_table}
 */
public final class GLSGIColorTable {
    public static final int GL_COLOR_TABLE_SGI = 0x80D0;
    public static final int GL_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D1;
    public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D2;
    public static final int GL_PROXY_COLOR_TABLE_SGI = 0x80D3;
    public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE_SGI = 0x80D4;
    public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE_SGI = 0x80D5;
    public static final int GL_COLOR_TABLE_SCALE_SGI = 0x80D6;
    public static final int GL_COLOR_TABLE_BIAS_SGI = 0x80D7;
    public static final int GL_COLOR_TABLE_FORMAT_SGI = 0x80D8;
    public static final int GL_COLOR_TABLE_WIDTH_SGI = 0x80D9;
    public static final int GL_COLOR_TABLE_RED_SIZE_SGI = 0x80DA;
    public static final int GL_COLOR_TABLE_GREEN_SIZE_SGI = 0x80DB;
    public static final int GL_COLOR_TABLE_BLUE_SIZE_SGI = 0x80DC;
    public static final int GL_COLOR_TABLE_ALPHA_SIZE_SGI = 0x80DD;
    public static final int GL_COLOR_TABLE_LUMINANCE_SIZE_SGI = 0x80DE;
    public static final int GL_COLOR_TABLE_INTENSITY_SIZE_SGI = 0x80DF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGI_color_table) return;
        ext.glColorTableSGI = load.invoke("glColorTableSGI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glColorTableParameterfvSGI = load.invoke("glColorTableParameterfvSGI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glColorTableParameterivSGI = load.invoke("glColorTableParameterivSGI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyColorTableSGI = load.invoke("glCopyColorTableSGI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetColorTableSGI = load.invoke("glGetColorTableSGI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableParameterfvSGI = load.invoke("glGetColorTableParameterfvSGI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableParameterivSGI = load.invoke("glGetColorTableParameterivSGI", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glColorTableSGI(int target, int internalformat, int width, int format, int type, @NativeType("const void *") MemorySegment table) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTableSGI).invokeExact(target, internalformat, width, format, type, table);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorTableParameterfvSGI(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTableParameterfvSGI).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorTableParameterivSGI(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTableParameterivSGI).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyColorTableSGI(int target, int internalformat, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyColorTableSGI).invokeExact(target, internalformat, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableSGI(int target, int format, int type, @NativeType("void *") MemorySegment table) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableSGI).invokeExact(target, format, type, table);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableParameterfvSGI(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableParameterfvSGI).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableParameterivSGI(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableParameterivSGI).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
