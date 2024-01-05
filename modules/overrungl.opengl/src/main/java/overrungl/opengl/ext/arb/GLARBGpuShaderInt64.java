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
 * {@code GL_ARB_gpu_shader_int64}
 */
public final class GLARBGpuShaderInt64 {
    public static final int GL_INT64_ARB = 0x140E;
    public static final int GL_INT64_VEC2_ARB = 0x8FE9;
    public static final int GL_INT64_VEC3_ARB = 0x8FEA;
    public static final int GL_INT64_VEC4_ARB = 0x8FEB;
    public static final int GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5;
    public static final int GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6;
    public static final int GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_gpu_shader_int64) return;
        ext.glUniform1i64ARB = load.invoke("glUniform1i64ARB", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniform2i64ARB = load.invoke("glUniform2i64ARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glUniform3i64ARB = load.invoke("glUniform3i64ARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform4i64ARB = load.invoke("glUniform4i64ARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform1i64vARB = load.invoke("glUniform1i64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2i64vARB = load.invoke("glUniform2i64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3i64vARB = load.invoke("glUniform3i64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4i64vARB = load.invoke("glUniform4i64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform1ui64ARB = load.invoke("glUniform1ui64ARB", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniform2ui64ARB = load.invoke("glUniform2ui64ARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glUniform3ui64ARB = load.invoke("glUniform3ui64ARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform4ui64ARB = load.invoke("glUniform4ui64ARB", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glUniform1ui64vARB = load.invoke("glUniform1ui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2ui64vARB = load.invoke("glUniform2ui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3ui64vARB = load.invoke("glUniform3ui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4ui64vARB = load.invoke("glUniform4ui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetUniformi64vARB = load.invoke("glGetUniformi64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetUniformui64vARB = load.invoke("glGetUniformui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnUniformi64vARB = load.invoke("glGetnUniformi64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetnUniformui64vARB = load.invoke("glGetnUniformui64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1i64ARB = load.invoke("glProgramUniform1i64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniform2i64ARB = load.invoke("glProgramUniform2i64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform3i64ARB = load.invoke("glProgramUniform3i64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform4i64ARB = load.invoke("glProgramUniform4i64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform1i64vARB = load.invoke("glProgramUniform1i64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2i64vARB = load.invoke("glProgramUniform2i64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3i64vARB = load.invoke("glProgramUniform3i64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4i64vARB = load.invoke("glProgramUniform4i64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1ui64ARB = load.invoke("glProgramUniform1ui64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniform2ui64ARB = load.invoke("glProgramUniform2ui64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform3ui64ARB = load.invoke("glProgramUniform3ui64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform4ui64ARB = load.invoke("glProgramUniform4ui64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glProgramUniform1ui64vARB = load.invoke("glProgramUniform1ui64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2ui64vARB = load.invoke("glProgramUniform2ui64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3ui64vARB = load.invoke("glProgramUniform3ui64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4ui64vARB = load.invoke("glProgramUniform4ui64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glUniform1i64ARB(int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1i64ARB).invokeExact(location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2i64ARB(int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2i64ARB).invokeExact(location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3i64ARB(int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3i64ARB).invokeExact(location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4i64ARB(int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4i64ARB).invokeExact(location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4i64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1ui64ARB(int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ui64ARB).invokeExact(location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2ui64ARB(int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ui64ARB).invokeExact(location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3ui64ARB(int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ui64ARB).invokeExact(location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4ui64ARB(int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ui64ARB).invokeExact(location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUniformi64vARB(int program, int location, @NativeType("GLint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformi64vARB).invokeExact(program, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUniformui64vARB(int program, int location, @NativeType("GLuint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformui64vARB).invokeExact(program, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnUniformi64vARB(int program, int location, int bufSize, @NativeType("GLint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformi64vARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetnUniformui64vARB(int program, int location, int bufSize, @NativeType("GLuint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetnUniformui64vARB).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1i64ARB(int program, int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1i64ARB).invokeExact(program, location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2i64ARB(int program, int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2i64ARB).invokeExact(program, location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3i64ARB(int program, int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3i64ARB).invokeExact(program, location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4i64ARB(int program, int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4i64ARB).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4i64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1ui64ARB(int program, int location, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ui64ARB).invokeExact(program, location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2ui64ARB(int program, int location, long x, long y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ui64ARB).invokeExact(program, location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3ui64ARB(int program, int location, long x, long y, long z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ui64ARB).invokeExact(program, location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4ui64ARB(int program, int location, long x, long y, long z, long w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ui64ARB).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ui64vARB).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
