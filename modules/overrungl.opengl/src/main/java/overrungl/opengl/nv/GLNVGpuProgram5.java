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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glProgramSubroutineParametersuivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetProgramSubroutineParameteruivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glProgramSubroutineParametersuivNV = RuntimeHelper.downcall(Descriptors.FD_glProgramSubroutineParametersuivNV);
        public static final MethodHandle MH_glGetProgramSubroutineParameteruivNV = RuntimeHelper.downcall(Descriptors.FD_glGetProgramSubroutineParameteruivNV);
        public final MemorySegment PFN_glProgramSubroutineParametersuivNV;
        public final MemorySegment PFN_glGetProgramSubroutineParameteruivNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramSubroutineParametersuivNV = func.invoke("glProgramSubroutineParametersuivNV");
            PFN_glGetProgramSubroutineParameteruivNV = func.invoke("glGetProgramSubroutineParameteruivNV");
        }
    }

    public GLNVGpuProgram5(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ProgramSubroutineParametersuivNV(@CType("GLenum") int target, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramSubroutineParametersuivNV)) throw new SymbolNotFoundError("Symbol not found: glProgramSubroutineParametersuivNV");
        try { Handles.MH_glProgramSubroutineParametersuivNV.invokeExact(handles.PFN_glProgramSubroutineParametersuivNV, target, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramSubroutineParametersuivNV", e); }
    }

    public void GetProgramSubroutineParameteruivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramSubroutineParameteruivNV)) throw new SymbolNotFoundError("Symbol not found: glGetProgramSubroutineParameteruivNV");
        try { Handles.MH_glGetProgramSubroutineParameteruivNV.invokeExact(handles.PFN_glGetProgramSubroutineParameteruivNV, target, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramSubroutineParameteruivNV", e); }
    }

}
