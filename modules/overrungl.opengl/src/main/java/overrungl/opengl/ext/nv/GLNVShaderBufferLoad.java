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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_shader_buffer_load}
 */
public interface GLNVShaderBufferLoad {
    int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
    int GL_GPU_ADDRESS_NV = 0x8F34;
    int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;

    void glMakeBufferResidentNV(int target, int access);
    void glMakeBufferNonResidentNV(int target);
    boolean glIsBufferResidentNV(int target);
    void glMakeNamedBufferResidentNV(int buffer, int access);
    void glMakeNamedBufferNonResidentNV(int buffer);
    boolean glIsNamedBufferResidentNV(int buffer);
    void glGetBufferParameterui64vNV(int target, int pname, @NativeType("GLuint64EXT *") MemorySegment params);
    void glGetNamedBufferParameterui64vNV(int buffer, int pname, @NativeType("GLuint64EXT *") MemorySegment params);
    void glGetIntegerui64vNV(int value, @NativeType("GLuint64EXT *") MemorySegment result);
    void glUniformui64NV(int location, long value);
    void glUniformui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value);
    void glProgramUniformui64NV(int program, int location, long value);
    void glProgramUniformui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value);
}
