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
 * {@code GL_EXT_histogram}
 */
public final class GLEXTHistogram {
    public static final int GL_HISTOGRAM_EXT = 0x8024;
    public static final int GL_PROXY_HISTOGRAM_EXT = 0x8025;
    public static final int GL_HISTOGRAM_WIDTH_EXT = 0x8026;
    public static final int GL_HISTOGRAM_FORMAT_EXT = 0x8027;
    public static final int GL_HISTOGRAM_RED_SIZE_EXT = 0x8028;
    public static final int GL_HISTOGRAM_GREEN_SIZE_EXT = 0x8029;
    public static final int GL_HISTOGRAM_BLUE_SIZE_EXT = 0x802A;
    public static final int GL_HISTOGRAM_ALPHA_SIZE_EXT = 0x802B;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE_EXT = 0x802C;
    public static final int GL_HISTOGRAM_SINK_EXT = 0x802D;
    public static final int GL_MINMAX_EXT = 0x802E;
    public static final int GL_MINMAX_FORMAT_EXT = 0x802F;
    public static final int GL_MINMAX_SINK_EXT = 0x8030;
    public static final int GL_TABLE_TOO_LARGE_EXT = 0x8031;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_histogram) return;
        ext.glGetHistogramEXT = load.invoke("glGetHistogramEXT", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetHistogramParameterfvEXT = load.invoke("glGetHistogramParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetHistogramParameterivEXT = load.invoke("glGetHistogramParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMinmaxEXT = load.invoke("glGetMinmaxEXT", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMinmaxParameterfvEXT = load.invoke("glGetMinmaxParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMinmaxParameterivEXT = load.invoke("glGetMinmaxParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glHistogramEXT = load.invoke("glHistogramEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glMinmaxEXT = load.invoke("glMinmaxEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glResetHistogramEXT = load.invoke("glResetHistogramEXT", ofVoid(JAVA_INT));
        ext.glResetMinmaxEXT = load.invoke("glResetMinmaxEXT", ofVoid(JAVA_INT));
    }

    public static void glGetHistogramEXT(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogramEXT).invokeExact(target, reset, format, type, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetHistogramParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogramParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetHistogramParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetHistogramParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMinmaxEXT(int target, boolean reset, int format, int type, @NativeType("void *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMinmaxEXT).invokeExact(target, reset, format, type, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMinmaxParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMinmaxParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMinmaxParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMinmaxParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glHistogramEXT(int target, int width, int internalformat, boolean sink) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glHistogramEXT).invokeExact(target, width, internalformat, sink);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMinmaxEXT(int target, int internalformat, boolean sink) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMinmaxEXT).invokeExact(target, internalformat, sink);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glResetHistogramEXT(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResetHistogramEXT).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glResetMinmaxEXT(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glResetMinmaxEXT).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
