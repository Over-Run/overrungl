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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_AMD_gpu_shader_int64}
 */
public final class GLAMDGpuShaderInt64 {
    public static final int GL_INT64_NV = 0x140E;
    public static final int GL_UNSIGNED_INT64_NV = 0x140F;
    public static final int GL_INT8_NV = 0x8FE0;
    public static final int GL_INT8_VEC2_NV = 0x8FE1;
    public static final int GL_INT8_VEC3_NV = 0x8FE2;
    public static final int GL_INT8_VEC4_NV = 0x8FE3;
    public static final int GL_INT16_NV = 0x8FE4;
    public static final int GL_INT16_VEC2_NV = 0x8FE5;
    public static final int GL_INT16_VEC3_NV = 0x8FE6;
    public static final int GL_INT16_VEC4_NV = 0x8FE7;
    public static final int GL_INT64_VEC2_NV = 0x8FE9;
    public static final int GL_INT64_VEC3_NV = 0x8FEA;
    public static final int GL_INT64_VEC4_NV = 0x8FEB;
    public static final int GL_UNSIGNED_INT8_NV = 0x8FEC;
    public static final int GL_UNSIGNED_INT8_VEC2_NV = 0x8FED;
    public static final int GL_UNSIGNED_INT8_VEC3_NV = 0x8FEE;
    public static final int GL_UNSIGNED_INT8_VEC4_NV = 0x8FEF;
    public static final int GL_UNSIGNED_INT16_NV = 0x8FF0;
    public static final int GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1;
    public static final int GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2;
    public static final int GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3;
    public static final int GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_gpu_shader_int64) return;
        ext.glUniform1i64NV = load.invoke("glUniform1i64NV", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniform2i64NV = load.invoke("glUniform2i64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glUniform3i64NV = load.invoke("glUniform3i64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform4i64NV = load.invoke("glUniform4i64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform1i64vNV = load.invoke("glUniform1i64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2i64vNV = load.invoke("glUniform2i64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3i64vNV = load.invoke("glUniform3i64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4i64vNV = load.invoke("glUniform4i64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform1ui64NV = load.invoke("glUniform1ui64NV", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniform2ui64NV = load.invoke("glUniform2ui64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glUniform3ui64NV = load.invoke("glUniform3ui64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform4ui64NV = load.invoke("glUniform4ui64NV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform1ui64vNV = load.invoke("glUniform1ui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2ui64vNV = load.invoke("glUniform2ui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3ui64vNV = load.invoke("glUniform3ui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4ui64vNV = load.invoke("glUniform4ui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetUniformi64vNV = load.invoke("glGetUniformi64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetUniformui64vNV = load.invoke("glGetUniformui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1i64NV = load.invoke("glProgramUniform1i64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniform2i64NV = load.invoke("glProgramUniform2i64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform3i64NV = load.invoke("glProgramUniform3i64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform4i64NV = load.invoke("glProgramUniform4i64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform1i64vNV = load.invoke("glProgramUniform1i64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2i64vNV = load.invoke("glProgramUniform2i64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3i64vNV = load.invoke("glProgramUniform3i64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4i64vNV = load.invoke("glProgramUniform4i64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1ui64NV = load.invoke("glProgramUniform1ui64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniform2ui64NV = load.invoke("glProgramUniform2ui64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform3ui64NV = load.invoke("glProgramUniform3ui64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform4ui64NV = load.invoke("glProgramUniform4ui64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform1ui64vNV = load.invoke("glProgramUniform1ui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2ui64vNV = load.invoke("glProgramUniform2ui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3ui64vNV = load.invoke("glProgramUniform3ui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4ui64vNV = load.invoke("glProgramUniform4ui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glUniform1i64NV(int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1i64NV).invokeExact(location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2i64NV(int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2i64NV).invokeExact(location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3i64NV(int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3i64NV).invokeExact(location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4i64NV(int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4i64NV).invokeExact(location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1i64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2i64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3i64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4i64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1ui64NV(int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ui64NV).invokeExact(location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2ui64NV(int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ui64NV).invokeExact(location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3ui64NV(int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ui64NV).invokeExact(location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4ui64NV(int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ui64NV).invokeExact(location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ui64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ui64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ui64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ui64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUniformi64vNV(int program, int location, @NativeType("GLint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformi64vNV).invokeExact(program, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUniformui64vNV(int program, int location, @NativeType("GLuint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformui64vNV).invokeExact(program, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1i64NV(int program, int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1i64NV).invokeExact(program, location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2i64NV(int program, int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2i64NV).invokeExact(program, location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3i64NV(int program, int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3i64NV).invokeExact(program, location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4i64NV).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1i64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2i64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3i64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4i64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1ui64NV(int program, int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ui64NV).invokeExact(program, location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2ui64NV(int program, int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ui64NV).invokeExact(program, location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ui64NV).invokeExact(program, location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ui64NV).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ui64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ui64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ui64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ui64vNV).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
