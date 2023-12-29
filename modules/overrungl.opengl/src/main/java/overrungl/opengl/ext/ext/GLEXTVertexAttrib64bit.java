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
 * {@code GL_EXT_vertex_attrib_64bit}
 */
public final class GLEXTVertexAttrib64bit {
    public static final int GL_DOUBLE_VEC2_EXT = 0x8FFC;
    public static final int GL_DOUBLE_VEC3_EXT = 0x8FFD;
    public static final int GL_DOUBLE_VEC4_EXT = 0x8FFE;
    public static final int GL_DOUBLE_MAT2_EXT = 0x8F46;
    public static final int GL_DOUBLE_MAT3_EXT = 0x8F47;
    public static final int GL_DOUBLE_MAT4_EXT = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3_EXT = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4_EXT = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2_EXT = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4_EXT = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2_EXT = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3_EXT = 0x8F4E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_vertex_attrib_64bit) return;
        ext.glVertexAttribL1dEXT = load.invoke("glVertexAttribL1dEXT", ofVoid(JAVA_INT, JAVA_DOUBLE));
        ext.glVertexAttribL2dEXT = load.invoke("glVertexAttribL2dEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttribL3dEXT = load.invoke("glVertexAttribL3dEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttribL4dEXT = load.invoke("glVertexAttribL4dEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttribL1dvEXT = load.invoke("glVertexAttribL1dvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL2dvEXT = load.invoke("glVertexAttribL2dvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL3dvEXT = load.invoke("glVertexAttribL3dvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL4dvEXT = load.invoke("glVertexAttribL4dvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribLPointerEXT = load.invoke("glVertexAttribLPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribLdvEXT = load.invoke("glGetVertexAttribLdvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glVertexAttribL1dEXT(int index, double x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1dEXT).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL2dEXT(int index, double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL2dEXT).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL3dEXT(int index, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL3dEXT).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL4dEXT(int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL4dEXT).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL1dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1dvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL2dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL2dvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL3dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL3dvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL4dvEXT(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL4dvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribLPointerEXT(int index, int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribLPointerEXT).invokeExact(index, size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribLdvEXT(int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribLdvEXT).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
