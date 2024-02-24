/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_gpu_shader_int64}
 */
public interface GLARBGpuShaderInt64 extends overrun.marshal.DirectAccess {
    int GL_INT64_ARB = 0x140E;
    int GL_INT64_VEC2_ARB = 0x8FE9;
    int GL_INT64_VEC3_ARB = 0x8FEA;
    int GL_INT64_VEC4_ARB = 0x8FEB;
    int GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5;
    int GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6;
    int GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;

    default void glUniform1i64ARB(int location, long x) {
        throw new ContextException();
    }

    default void glUniform2i64ARB(int location, long x, long y) {
        throw new ContextException();
    }

    default void glUniform3i64ARB(int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glUniform4i64ARB(int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glUniform1i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform2i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform3i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform4i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform1ui64ARB(int location, long x) {
        throw new ContextException();
    }

    default void glUniform2ui64ARB(int location, long x, long y) {
        throw new ContextException();
    }

    default void glUniform3ui64ARB(int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glUniform4ui64ARB(int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glUniform1ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform2ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform3ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform4ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetUniformi64vARB(int program, int location, @NativeType("GLint64 *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetUniformui64vARB(int program, int location, @NativeType("GLuint64 *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetnUniformi64vARB(int program, int location, int bufSize, @NativeType("GLint64 *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetnUniformui64vARB(int program, int location, int bufSize, @NativeType("GLuint64 *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramUniform1i64ARB(int program, int location, long x) {
        throw new ContextException();
    }

    default void glProgramUniform2i64ARB(int program, int location, long x, long y) {
        throw new ContextException();
    }

    default void glProgramUniform3i64ARB(int program, int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glProgramUniform4i64ARB(int program, int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glProgramUniform1i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform1ui64ARB(int program, int location, long x) {
        throw new ContextException();
    }

    default void glProgramUniform2ui64ARB(int program, int location, long x, long y) {
        throw new ContextException();
    }

    default void glProgramUniform3ui64ARB(int program, int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glProgramUniform4ui64ARB(int program, int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glProgramUniform1ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

}
