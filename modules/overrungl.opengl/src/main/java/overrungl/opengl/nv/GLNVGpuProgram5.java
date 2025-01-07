/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVGpuProgram5 {
    public static final int GL_MAX_GEOMETRY_PROGRAM_INVOCATIONS_NV = 0x8E5A;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5B;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET_NV = 0x8E5C;
    public static final int GL_FRAGMENT_PROGRAM_INTERPOLATION_OFFSET_BITS_NV = 0x8E5D;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5E;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_NV = 0x8E5F;
    public static final int GL_MAX_PROGRAM_SUBROUTINE_PARAMETERS_NV = 0x8F44;
    public static final int GL_MAX_PROGRAM_SUBROUTINE_NUM_NV = 0x8F45;
    public static final MethodHandle MH_glProgramSubroutineParametersuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramSubroutineParametersuivNV;
    public static final MethodHandle MH_glGetProgramSubroutineParameteruivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramSubroutineParameteruivNV;

    public GLNVGpuProgram5(overrungl.opengl.GLLoadFunc func) {
        PFN_glProgramSubroutineParametersuivNV = func.invoke("glProgramSubroutineParametersuivNV");
        PFN_glGetProgramSubroutineParameteruivNV = func.invoke("glGetProgramSubroutineParameteruivNV");
    }

    public void ProgramSubroutineParametersuivNV(@CType("GLenum") int target, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glProgramSubroutineParametersuivNV)) { try {
            MH_glProgramSubroutineParametersuivNV.invokeExact(PFN_glProgramSubroutineParametersuivNV, target, count, params);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramSubroutineParametersuivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramSubroutineParametersuivNV"); }
    }

    public void GetProgramSubroutineParameteruivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetProgramSubroutineParameteruivNV)) { try {
            MH_glGetProgramSubroutineParameteruivNV.invokeExact(PFN_glGetProgramSubroutineParameteruivNV, target, index, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetProgramSubroutineParameteruivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetProgramSubroutineParameteruivNV"); }
    }

}
