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
 * {@code GL_EXT_gpu_shader4}
 */
public final class GLEXTGpuShader4 {
    public static final int GL_SAMPLER_1D_ARRAY_EXT = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY_EXT = 0x8DC1;
    public static final int GL_SAMPLER_BUFFER_EXT = 0x8DC2;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 0x8DC4;
    public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2_EXT = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3_EXT = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4_EXT = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D_EXT = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D_EXT = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D_EXT = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE_EXT = 0x8DCC;
    public static final int GL_INT_SAMPLER_2D_RECT_EXT = 0x8DCD;
    public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 0x8DCF;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 0x8DD8;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 0x8905;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_gpu_shader4) return;
        ext.glGetUniformuivEXT = load.invoke("glGetUniformuivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glBindFragDataLocationEXT = load.invoke("glBindFragDataLocationEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetFragDataLocationEXT = load.invoke("glGetFragDataLocationEXT", of(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform1uiEXT = load.invoke("glUniform1uiEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glUniform2uiEXT = load.invoke("glUniform2uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glUniform3uiEXT = load.invoke("glUniform3uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glUniform4uiEXT = load.invoke("glUniform4uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glUniform1uivEXT = load.invoke("glUniform1uivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2uivEXT = load.invoke("glUniform2uivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3uivEXT = load.invoke("glUniform3uivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4uivEXT = load.invoke("glUniform4uivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribI1iEXT = load.invoke("glVertexAttribI1iEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glVertexAttribI2iEXT = load.invoke("glVertexAttribI2iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribI3iEXT = load.invoke("glVertexAttribI3iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribI4iEXT = load.invoke("glVertexAttribI4iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribI1uiEXT = load.invoke("glVertexAttribI1uiEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glVertexAttribI2uiEXT = load.invoke("glVertexAttribI2uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribI3uiEXT = load.invoke("glVertexAttribI3uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribI4uiEXT = load.invoke("glVertexAttribI4uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexAttribI1ivEXT = load.invoke("glVertexAttribI1ivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI2ivEXT = load.invoke("glVertexAttribI2ivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI3ivEXT = load.invoke("glVertexAttribI3ivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI4ivEXT = load.invoke("glVertexAttribI4ivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI1uivEXT = load.invoke("glVertexAttribI1uivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI2uivEXT = load.invoke("glVertexAttribI2uivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI3uivEXT = load.invoke("glVertexAttribI3uivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI4uivEXT = load.invoke("glVertexAttribI4uivEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI4bvEXT = load.invoke("glVertexAttribI4bvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI4svEXT = load.invoke("glVertexAttribI4svEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI4ubvEXT = load.invoke("glVertexAttribI4ubvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribI4usvEXT = load.invoke("glVertexAttribI4usvEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribIPointerEXT = load.invoke("glVertexAttribIPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribIivEXT = load.invoke("glGetVertexAttribIivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexAttribIuivEXT = load.invoke("glGetVertexAttribIuivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glGetUniformuivEXT(int program, int location, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformuivEXT).invokeExact(program, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindFragDataLocationEXT(int program, int color, @NativeType("const GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindFragDataLocationEXT).invokeExact(program, color, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetFragDataLocationEXT(int program, @NativeType("const GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetFragDataLocationEXT).invokeExact(program, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1uiEXT(int location, int v0) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1uiEXT).invokeExact(location, v0);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2uiEXT(int location, int v0, int v1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2uiEXT).invokeExact(location, v0, v1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3uiEXT(int location, int v0, int v1, int v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3uiEXT).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4uiEXT).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1uivEXT).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2uivEXT).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3uivEXT).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4uivEXT).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI1iEXT(int index, int x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI1iEXT).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI2iEXT(int index, int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI2iEXT).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI3iEXT(int index, int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI3iEXT).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4iEXT(int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4iEXT).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI1uiEXT(int index, int x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI1uiEXT).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI2uiEXT(int index, int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI2uiEXT).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI3uiEXT(int index, int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI3uiEXT).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4uiEXT(int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4uiEXT).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI1ivEXT(int index, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI1ivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI2ivEXT(int index, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI2ivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI3ivEXT(int index, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI3ivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4ivEXT(int index, @NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4ivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI1uivEXT(int index, @NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI1uivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI2uivEXT(int index, @NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI2uivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI3uivEXT(int index, @NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI3uivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4uivEXT(int index, @NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4uivEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4bvEXT(int index, @NativeType("const GLbyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4bvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4svEXT(int index, @NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4svEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4ubvEXT(int index, @NativeType("const GLubyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4ubvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribI4usvEXT(int index, @NativeType("const GLushort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribI4usvEXT).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribIPointerEXT(int index, int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribIPointerEXT).invokeExact(index, size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribIivEXT(int index, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribIivEXT).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribIuivEXT(int index, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribIuivEXT).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
