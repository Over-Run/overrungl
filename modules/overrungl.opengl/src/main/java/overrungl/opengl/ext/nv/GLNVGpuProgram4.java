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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_gpu_program4}
 */
public interface GLNVGpuProgram4 {
    int GL_MIN_PROGRAM_TEXEL_OFFSET_NV = 0x8904;
    int GL_MAX_PROGRAM_TEXEL_OFFSET_NV = 0x8905;
    int GL_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8906;
    int GL_PROGRAM_RESULT_COMPONENTS_NV = 0x8907;
    int GL_MAX_PROGRAM_ATTRIB_COMPONENTS_NV = 0x8908;
    int GL_MAX_PROGRAM_RESULT_COMPONENTS_NV = 0x8909;
    int GL_MAX_PROGRAM_GENERIC_ATTRIBS_NV = 0x8DA5;
    int GL_MAX_PROGRAM_GENERIC_RESULTS_NV = 0x8DA6;

    default void glProgramLocalParameterI4iNV(int target, int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glProgramLocalParameterI4ivNV(int target, int index, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramLocalParametersI4ivNV(int target, int index, int count, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramLocalParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glProgramLocalParameterI4uivNV(int target, int index, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramLocalParametersI4uivNV(int target, int index, int count, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramEnvParameterI4iNV(int target, int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glProgramEnvParameterI4ivNV(int target, int index, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramEnvParametersI4ivNV(int target, int index, int count, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramEnvParameterI4uiNV(int target, int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glProgramEnvParameterI4uivNV(int target, int index, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramEnvParametersI4uivNV(int target, int index, int count, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramLocalParameterIivNV(int target, int index, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramLocalParameterIuivNV(int target, int index, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramEnvParameterIivNV(int target, int index, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramEnvParameterIuivNV(int target, int index, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

}
