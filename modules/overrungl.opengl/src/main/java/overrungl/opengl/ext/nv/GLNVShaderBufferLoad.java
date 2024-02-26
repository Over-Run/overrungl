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
package overrungl.opengl.ext.nv;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_shader_buffer_load}
 */
public interface GLNVShaderBufferLoad extends overrun.marshal.DirectAccess {
    int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
    int GL_GPU_ADDRESS_NV = 0x8F34;
    int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;

    default void glMakeBufferResidentNV(int target, int access) {
        throw new ContextException();
    }

    default void glMakeBufferNonResidentNV(int target) {
        throw new ContextException();
    }

    default boolean glIsBufferResidentNV(int target) {
        throw new ContextException();
    }

    default void glMakeNamedBufferResidentNV(int buffer, int access) {
        throw new ContextException();
    }

    default void glMakeNamedBufferNonResidentNV(int buffer) {
        throw new ContextException();
    }

    default boolean glIsNamedBufferResidentNV(int buffer) {
        throw new ContextException();
    }

    default void glGetBufferParameterui64vNV(int target, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedBufferParameterui64vNV(int buffer, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetIntegerui64vNV(int value, @NativeType("GLuint64EXT *") MemorySegment result) {
        throw new ContextException();
    }

    default void glUniformui64NV(int location, long value) {
        throw new ContextException();
    }

    default void glUniformui64vNV(int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformui64NV(int program, int location, long value) {
        throw new ContextException();
    }

    default void glProgramUniformui64vNV(int program, int location, int count, @NativeType("const GLuint64EXT *") MemorySegment value) {
        throw new ContextException();
    }

}
