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
 * {@code GL_NV_gpu_program5}
 */
public interface GLNVGpuProgram5 {
    int GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV = 0x8E5A;
    int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5B;
    int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5C;
    int GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV = 0x8E5D;
    int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5E;
    int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5F;
    int GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV = 0x8F44;
    int GL_MAX_PROGRAM_SUBROUTINE_NUM_NV = 0x8F45;

    default void glProgramSubroutineParametersuivNV(int target, int count, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramSubroutineParameteruivNV(int target, int index, @NativeType("GLuint *") MemorySegment param) {
        throw new ContextException();
    }

}
