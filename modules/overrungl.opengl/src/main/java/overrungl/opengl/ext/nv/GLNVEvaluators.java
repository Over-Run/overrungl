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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_evaluators}
 */
public final class GLNVEvaluators {
    public static final int GL_EVAL_2D_NV = 0x86C0;
    public static final int GL_EVAL_TRIANGULAR_2D_NV = 0x86C1;
    public static final int GL_MAP_TESSELLATION_NV = 0x86C2;
    public static final int GL_MAP_ATTRIB_U_ORDER_NV = 0x86C3;
    public static final int GL_MAP_ATTRIB_V_ORDER_NV = 0x86C4;
    public static final int GL_EVAL_FRACTIONAL_TESSELLATION_NV = 0x86C5;
    public static final int GL_EVAL_VERTEX_ATTRIB0_NV = 0x86C6;
    public static final int GL_EVAL_VERTEX_ATTRIB1_NV = 0x86C7;
    public static final int GL_EVAL_VERTEX_ATTRIB2_NV = 0x86C8;
    public static final int GL_EVAL_VERTEX_ATTRIB3_NV = 0x86C9;
    public static final int GL_EVAL_VERTEX_ATTRIB4_NV = 0x86CA;
    public static final int GL_EVAL_VERTEX_ATTRIB5_NV = 0x86CB;
    public static final int GL_EVAL_VERTEX_ATTRIB6_NV = 0x86CC;
    public static final int GL_EVAL_VERTEX_ATTRIB7_NV = 0x86CD;
    public static final int GL_EVAL_VERTEX_ATTRIB8_NV = 0x86CE;
    public static final int GL_EVAL_VERTEX_ATTRIB9_NV = 0x86CF;
    public static final int GL_EVAL_VERTEX_ATTRIB10_NV = 0x86D0;
    public static final int GL_EVAL_VERTEX_ATTRIB11_NV = 0x86D1;
    public static final int GL_EVAL_VERTEX_ATTRIB12_NV = 0x86D2;
    public static final int GL_EVAL_VERTEX_ATTRIB13_NV = 0x86D3;
    public static final int GL_EVAL_VERTEX_ATTRIB14_NV = 0x86D4;
    public static final int GL_EVAL_VERTEX_ATTRIB15_NV = 0x86D5;
    public static final int GL_MAX_MAP_TESSELLATION_NV = 0x86D6;
    public static final int GL_MAX_RATIONAL_EVAL_ORDER_NV = 0x86D7;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_evaluators) return;
        ext.glMapControlPointsNV = load.invoke("glMapControlPointsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glMapParameterivNV = load.invoke("glMapParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMapParameterfvNV = load.invoke("glMapParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMapControlPointsNV = load.invoke("glGetMapControlPointsNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glGetMapParameterivNV = load.invoke("glGetMapParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMapParameterfvNV = load.invoke("glGetMapParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMapAttribParameterivNV = load.invoke("glGetMapAttribParameterivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMapAttribParameterfvNV = load.invoke("glGetMapAttribParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glEvalMapsNV = load.invoke("glEvalMapsNV", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glMapControlPointsNV(int target, int index, int type, int ustride, int vstride, int uorder, int vorder, boolean packed, @NativeType("const void *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapControlPointsNV).invokeExact(target, index, type, ustride, vstride, uorder, vorder, packed, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapParameterivNV(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapParameterivNV).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapParameterfvNV(int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapParameterfvNV).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMapControlPointsNV(int target, int index, int type, int ustride, int vstride, boolean packed, @NativeType("void *") MemorySegment points) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMapControlPointsNV).invokeExact(target, index, type, ustride, vstride, packed, points);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMapParameterivNV(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMapParameterivNV).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMapParameterfvNV(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMapParameterfvNV).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMapAttribParameterivNV(int target, int index, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMapAttribParameterivNV).invokeExact(target, index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMapAttribParameterfvNV(int target, int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMapAttribParameterfvNV).invokeExact(target, index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEvalMapsNV(int target, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEvalMapsNV).invokeExact(target, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
