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

public final class GLNVParameterBufferObject {
    public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV = 0x8DA0;
    public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV = 0x8DA1;
    public static final int GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA2;
    public static final int GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA3;
    public static final int GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA4;
    public static final MethodHandle MH_glProgramBufferParametersfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramBufferParametersfvNV;
    public static final MethodHandle MH_glProgramBufferParametersIivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramBufferParametersIivNV;
    public static final MethodHandle MH_glProgramBufferParametersIuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramBufferParametersIuivNV;

    public GLNVParameterBufferObject(overrungl.opengl.GLLoadFunc func) {
        PFN_glProgramBufferParametersfvNV = func.invoke("glProgramBufferParametersfvNV");
        PFN_glProgramBufferParametersIivNV = func.invoke("glProgramBufferParametersIivNV");
        PFN_glProgramBufferParametersIuivNV = func.invoke("glProgramBufferParametersIuivNV");
    }

    public void ProgramBufferParametersfvNV(@CType("GLenum") int target, @CType("GLuint") int bindingIndex, @CType("GLuint") int wordIndex, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramBufferParametersfvNV))
            MH_glProgramBufferParametersfvNV.invokeExact(PFN_glProgramBufferParametersfvNV, target, bindingIndex, wordIndex, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramBufferParametersfvNV", e); }
    }

    public void ProgramBufferParametersIivNV(@CType("GLenum") int target, @CType("GLuint") int bindingIndex, @CType("GLuint") int wordIndex, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramBufferParametersIivNV))
            MH_glProgramBufferParametersIivNV.invokeExact(PFN_glProgramBufferParametersIivNV, target, bindingIndex, wordIndex, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramBufferParametersIivNV", e); }
    }

    public void ProgramBufferParametersIuivNV(@CType("GLenum") int target, @CType("GLuint") int bindingIndex, @CType("GLuint") int wordIndex, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramBufferParametersIuivNV))
            MH_glProgramBufferParametersIuivNV.invokeExact(PFN_glProgramBufferParametersIuivNV, target, bindingIndex, wordIndex, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramBufferParametersIuivNV", e); }
    }

}
