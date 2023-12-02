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
 * {@code GL_NV_vertex_attrib_integer_64bit}
 */
public final class GLNVVertexAttribInteger64bit {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_vertex_attrib_integer_64bit) return;
        ext.glVertexAttribL1i64NV = load.invoke("glVertexAttribL1i64NV", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glVertexAttribL2i64NV = load.invoke("glVertexAttribL2i64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glVertexAttribL3i64NV = load.invoke("glVertexAttribL3i64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glVertexAttribL4i64NV = load.invoke("glVertexAttribL4i64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glVertexAttribL1i64vNV = load.invoke("glVertexAttribL1i64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL2i64vNV = load.invoke("glVertexAttribL2i64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL3i64vNV = load.invoke("glVertexAttribL3i64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL4i64vNV = load.invoke("glVertexAttribL4i64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL1ui64NV = load.invoke("glVertexAttribL1ui64NV", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glVertexAttribL2ui64NV = load.invoke("glVertexAttribL2ui64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glVertexAttribL3ui64NV = load.invoke("glVertexAttribL3ui64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glVertexAttribL4ui64NV = load.invoke("glVertexAttribL4ui64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glVertexAttribL1ui64vNV = load.invoke("glVertexAttribL1ui64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL2ui64vNV = load.invoke("glVertexAttribL2ui64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL3ui64vNV = load.invoke("glVertexAttribL3ui64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribL4ui64vNV = load.invoke("glVertexAttribL4ui64vNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetVertexAttribLi64vNV = load.invoke("glGetVertexAttribLi64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribLui64vNV = load.invoke("glGetVertexAttribLui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribLFormatNV = load.invoke("glVertexAttribLFormatNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glVertexAttribL1i64NV(int index, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1i64NV).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL2i64NV(int index, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL2i64NV).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL3i64NV(int index, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL3i64NV).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL4i64NV(int index, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL4i64NV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL1i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1i64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL2i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL2i64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL3i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL3i64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL4i64vNV(int index, @NativeType("const GLint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL4i64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL1ui64NV(int index, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1ui64NV).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL2ui64NV(int index, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL2ui64NV).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL3ui64NV(int index, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL3ui64NV).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL4ui64NV(int index, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL4ui64NV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL1ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1ui64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL2ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL2ui64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL3ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL3ui64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL4ui64vNV(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL4ui64vNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribLi64vNV(int index, int pname, @NativeType("GLint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribLi64vNV).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribLui64vNV(int index, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribLui64vNV).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribLFormatNV(int index, int size, int type, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribLFormatNV).invokeExact(index, size, type, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
