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
package overrungl.opengl.ext.amd;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_gpu_shader_int64}
 */
public interface GLAMDGpuShaderInt64 extends overrun.marshal.DirectAccess {
    int GL_INT64_NV = 0x140E;
    int GL_UNSIGNED_INT64_NV = 0x140F;
    int GL_INT8_NV = 0x8FE0;
    int GL_INT8_VEC2_NV = 0x8FE1;
    int GL_INT8_VEC3_NV = 0x8FE2;
    int GL_INT8_VEC4_NV = 0x8FE3;
    int GL_INT16_NV = 0x8FE4;
    int GL_INT16_VEC2_NV = 0x8FE5;
    int GL_INT16_VEC3_NV = 0x8FE6;
    int GL_INT16_VEC4_NV = 0x8FE7;
    int GL_INT64_VEC2_NV = 0x8FE9;
    int GL_INT64_VEC3_NV = 0x8FEA;
    int GL_INT64_VEC4_NV = 0x8FEB;
    int GL_UNSIGNED_INT8_NV = 0x8FEC;
    int GL_UNSIGNED_INT8_VEC2_NV = 0x8FED;
    int GL_UNSIGNED_INT8_VEC3_NV = 0x8FEE;
    int GL_UNSIGNED_INT8_VEC4_NV = 0x8FEF;
    int GL_UNSIGNED_INT16_NV = 0x8FF0;
    int GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1;
    int GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2;
    int GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3;
    int GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5;
    int GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6;
    int GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7;

    default void glUniform1i64NV(int location, long x) {
        throw new ContextException();
    }

    default void glUniform2i64NV(int location, long x, long y) {
        throw new ContextException();
    }

    default void glUniform3i64NV(int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glUniform4i64NV(int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glUniform1i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform2i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform3i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform4i64vNV(int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform1ui64NV(int location, long x) {
        throw new ContextException();
    }

    default void glUniform2ui64NV(int location, long x, long y) {
        throw new ContextException();
    }

    default void glUniform3ui64NV(int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glUniform4ui64NV(int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glUniform1ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform2ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform3ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glUniform4ui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glGetUniformi64vNV(int program, int location, @NativeType("GLint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetUniformui64vNV(int program, int location, @NativeType("GLuint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramUniform1i64NV(int program, int location, long x) {
        throw new ContextException();
    }

    default void glProgramUniform2i64NV(int program, int location, long x, long y) {
        throw new ContextException();
    }

    default void glProgramUniform3i64NV(int program, int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glProgramUniform4i64NV(int program, int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glProgramUniform1i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4i64vNV(int program, int location, int count, @NativeType("const GLint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform1ui64NV(int program, int location, long x) {
        throw new ContextException();
    }

    default void glProgramUniform2ui64NV(int program, int location, long x, long y) {
        throw new ContextException();
    }

    default void glProgramUniform3ui64NV(int program, int location, long x, long y, long z) {
        throw new ContextException();
    }

    default void glProgramUniform4ui64NV(int program, int location, long x, long y, long z, long w) {
        throw new ContextException();
    }

    default void glProgramUniform1ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4ui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

}
