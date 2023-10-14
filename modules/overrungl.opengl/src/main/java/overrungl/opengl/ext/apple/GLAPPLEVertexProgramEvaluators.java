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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_APPLE_vertex_program_evaluators}
  */
public final class GLAPPLEVertexProgramEvaluators {
    public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = 0x8A00;
    public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = 0x8A01;
    public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 0x8A02;
    public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 0x8A03;
    public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 0x8A04;
    public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 0x8A05;
    public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 0x8A06;
    public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 0x8A07;
    public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 0x8A08;
    public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 0x8A09;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_vertex_program_evaluators) return;
        ext.glEnableVertexAttribAPPLE = load.invoke("glEnableVertexAttribAPPLE", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDisableVertexAttribAPPLE = load.invoke("glDisableVertexAttribAPPLE", ofVoid(JAVA_INT, JAVA_INT));
        ext.glIsVertexAttribEnabledAPPLE = load.invoke("glIsVertexAttribEnabledAPPLE", of(JAVA_BYTE, JAVA_INT, JAVA_INT));
        ext.glMapVertexAttrib1dAPPLE = load.invoke("glMapVertexAttrib1dAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMapVertexAttrib1fAPPLE = load.invoke("glMapVertexAttrib1fAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMapVertexAttrib2dAPPLE = load.invoke("glMapVertexAttrib2dAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMapVertexAttrib2fAPPLE = load.invoke("glMapVertexAttrib2fAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glEnableVertexAttribAPPLE(int index, int pname) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableVertexAttribAPPLE).invokeExact(index, pname);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableVertexAttribAPPLE(int index, int pname) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableVertexAttribAPPLE).invokeExact(index, pname);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsVertexAttribEnabledAPPLE(int index, int pname) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsVertexAttribEnabledAPPLE).invokeExact(index, pname);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, @NativeType("const GLdouble *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib1dAPPLE).invokeExact(index, size, u1, u2, stride, order, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, @NativeType("const GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib1fAPPLE).invokeExact(index, size, u1, u2, stride, order, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, @NativeType("const GLdouble *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib2dAPPLE).invokeExact(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, @NativeType("const GLfloat *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapVertexAttrib2fAPPLE).invokeExact(index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
