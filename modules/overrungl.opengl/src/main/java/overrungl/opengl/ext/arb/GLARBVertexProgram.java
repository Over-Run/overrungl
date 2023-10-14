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
  * {@code GL_ARB_vertex_program}
  */
public final class GLARBVertexProgram {
    public static final int GL_COLOR_SUM_ARB = 0x8458;
    public static final int GL_VERTEX_PROGRAM_ARB = 0x8620;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 0x8625;
    public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = 0x8626;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 0x8643;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;
    public static final int GL_MAX_VERTEX_ATTRIBS_ARB = 0x8869;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A;
    public static final int GL_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B0;
    public static final int GL_MAX_PROGRAM_ADDRESS_REGISTERS_ARB = 0x88B1;
    public static final int GL_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B2;
    public static final int GL_MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB = 0x88B3;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_vertex_program) return;
        ext.glVertexAttrib1dARB = load.invoke("glVertexAttrib1dARB", ofVoid(JAVA_INT, JAVA_DOUBLE));
        ext.glVertexAttrib1dvARB = load.invoke("glVertexAttrib1dvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib1fARB = load.invoke("glVertexAttrib1fARB", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glVertexAttrib1fvARB = load.invoke("glVertexAttrib1fvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib1sARB = load.invoke("glVertexAttrib1sARB", ofVoid(JAVA_INT, JAVA_SHORT));
        ext.glVertexAttrib1svARB = load.invoke("glVertexAttrib1svARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2dARB = load.invoke("glVertexAttrib2dARB", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttrib2dvARB = load.invoke("glVertexAttrib2dvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2fARB = load.invoke("glVertexAttrib2fARB", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexAttrib2fvARB = load.invoke("glVertexAttrib2fvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2sARB = load.invoke("glVertexAttrib2sARB", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib2svARB = load.invoke("glVertexAttrib2svARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3dARB = load.invoke("glVertexAttrib3dARB", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttrib3dvARB = load.invoke("glVertexAttrib3dvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3fARB = load.invoke("glVertexAttrib3fARB", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexAttrib3fvARB = load.invoke("glVertexAttrib3fvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3sARB = load.invoke("glVertexAttrib3sARB", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib3svARB = load.invoke("glVertexAttrib3svARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4NbvARB = load.invoke("glVertexAttrib4NbvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4NivARB = load.invoke("glVertexAttrib4NivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4NsvARB = load.invoke("glVertexAttrib4NsvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4NubARB = load.invoke("glVertexAttrib4NubARB", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glVertexAttrib4NubvARB = load.invoke("glVertexAttrib4NubvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4NuivARB = load.invoke("glVertexAttrib4NuivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4NusvARB = load.invoke("glVertexAttrib4NusvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4bvARB = load.invoke("glVertexAttrib4bvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4dARB = load.invoke("glVertexAttrib4dARB", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexAttrib4dvARB = load.invoke("glVertexAttrib4dvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4fARB = load.invoke("glVertexAttrib4fARB", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexAttrib4fvARB = load.invoke("glVertexAttrib4fvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4ivARB = load.invoke("glVertexAttrib4ivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4sARB = load.invoke("glVertexAttrib4sARB", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib4svARB = load.invoke("glVertexAttrib4svARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4ubvARB = load.invoke("glVertexAttrib4ubvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4uivARB = load.invoke("glVertexAttrib4uivARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4usvARB = load.invoke("glVertexAttrib4usvARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribPointerARB = load.invoke("glVertexAttribPointerARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, ADDRESS));
        ext.glEnableVertexAttribArrayARB = load.invoke("glEnableVertexAttribArrayARB", ofVoid(JAVA_INT));
        ext.glDisableVertexAttribArrayARB = load.invoke("glDisableVertexAttribArrayARB", ofVoid(JAVA_INT));
        ext.glGetVertexAttribdvARB = load.invoke("glGetVertexAttribdvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribfvARB = load.invoke("glGetVertexAttribfvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribivARB = load.invoke("glGetVertexAttribivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribPointervARB = load.invoke("glGetVertexAttribPointervARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glVertexAttrib1dARB(int index, double x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1dARB).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1dvARB(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1dvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1fARB(int index, float x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1fARB).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1fvARB(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1fvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1sARB(int index, short x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1sARB).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1svARB(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1svARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2dARB(int index, double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2dARB).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2dvARB(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2dvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2fARB(int index, float x, float y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2fARB).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2fvARB(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2fvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2sARB(int index, short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2sARB).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2svARB(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2svARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3dARB(int index, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3dARB).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3dvARB(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3dvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3fARB(int index, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3fARB).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3fvARB(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3fvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3sARB(int index, short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3sARB).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3svARB(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3svARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NbvARB(int index, @NativeType("const GLbyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NbvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NivARB(int index, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NivARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NsvARB(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NsvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NubARB).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NubvARB(int index, @NativeType("const GLubyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NubvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NuivARB(int index, @NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NuivARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4NusvARB(int index, @NativeType("const GLushort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4NusvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4bvARB(int index, @NativeType("const GLbyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4bvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4dARB(int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4dARB).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4dvARB(int index, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4dvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4fARB(int index, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4fARB).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4fvARB(int index, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4fvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4ivARB(int index, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4ivARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4sARB(int index, short x, short y, short z, short w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4sARB).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4svARB(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4svARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4ubvARB(int index, @NativeType("const GLubyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4ubvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4uivARB(int index, @NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4uivARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4usvARB(int index, @NativeType("const GLushort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4usvARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribPointerARB).invokeExact(index, size, type, normalized, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableVertexAttribArrayARB(int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableVertexAttribArrayARB).invokeExact(index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableVertexAttribArrayARB(int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableVertexAttribArrayARB).invokeExact(index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribdvARB(int index, int pname, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribdvARB).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribfvARB(int index, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribfvARB).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribivARB(int index, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribivARB).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribPointervARB(int index, int pname, @NativeType("void **") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribPointervARB).invokeExact(index, pname, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
