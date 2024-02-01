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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_gpu_shader_int64}
 */
public interface GLARBGpuShaderInt64 {
    int GL_INT64_ARB = 0x140E;
    int GL_INT64_VEC2_ARB = 0x8FE9;
    int GL_INT64_VEC3_ARB = 0x8FEA;
    int GL_INT64_VEC4_ARB = 0x8FEB;
    int GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5;
    int GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6;
    int GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;

    void glUniform1i64ARB(int location, long x);
    void glUniform2i64ARB(int location, long x, long y);
    void glUniform3i64ARB(int location, long x, long y, long z);
    void glUniform4i64ARB(int location, long x, long y, long z, long w);
    void glUniform1i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glUniform2i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glUniform3i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glUniform4i64vARB(int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glUniform1ui64ARB(int location, long x);
    void glUniform2ui64ARB(int location, long x, long y);
    void glUniform3ui64ARB(int location, long x, long y, long z);
    void glUniform4ui64ARB(int location, long x, long y, long z, long w);
    void glUniform1ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glUniform2ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glUniform3ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glUniform4ui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glGetUniformi64vARB(int program, int location, @NativeType("GLint64 *") MemorySegment params);
    void glGetUniformui64vARB(int program, int location, @NativeType("GLuint64 *") MemorySegment params);
    void glGetnUniformi64vARB(int program, int location, int bufSize, @NativeType("GLint64 *") MemorySegment params);
    void glGetnUniformui64vARB(int program, int location, int bufSize, @NativeType("GLuint64 *") MemorySegment params);
    void glProgramUniform1i64ARB(int program, int location, long x);
    void glProgramUniform2i64ARB(int program, int location, long x, long y);
    void glProgramUniform3i64ARB(int program, int location, long x, long y, long z);
    void glProgramUniform4i64ARB(int program, int location, long x, long y, long z, long w);
    void glProgramUniform1i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glProgramUniform2i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glProgramUniform3i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glProgramUniform4i64vARB(int program, int location, int count, @NativeType("const GLint64 *") MemorySegment value);
    void glProgramUniform1ui64ARB(int program, int location, long x);
    void glProgramUniform2ui64ARB(int program, int location, long x, long y);
    void glProgramUniform3ui64ARB(int program, int location, long x, long y, long z);
    void glProgramUniform4ui64ARB(int program, int location, long x, long y, long z, long w);
    void glProgramUniform1ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glProgramUniform2ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glProgramUniform3ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glProgramUniform4ui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
}
