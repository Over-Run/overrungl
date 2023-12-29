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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_gpu_program5}
 */
public final class GLNVGpuProgram5 {
    public static final int GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV = 0x8E5A;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5B;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5C;
    public static final int GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV = 0x8E5D;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5E;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5F;
    public static final int GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV = 0x8F44;
    public static final int GL_MAX_PROGRAM_SUBROUTINE_NUM_NV = 0x8F45;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_gpu_program5) return;
        ext.glProgramSubroutineParametersuivNV = load.invoke("glProgramSubroutineParametersuivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetProgramSubroutineParameteruivNV = load.invoke("glGetProgramSubroutineParameteruivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glProgramSubroutineParametersuivNV(int target, int count, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramSubroutineParametersuivNV).invokeExact(target, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetProgramSubroutineParameteruivNV(int target, int index, @NativeType("GLuint *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetProgramSubroutineParameteruivNV).invokeExact(target, index, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
