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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVParameterBufferObject {
    public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV = 0x8DA0;
    public static final int GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV = 0x8DA1;
    public static final int GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA2;
    public static final int GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA3;
    public static final int GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA4;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProgramBufferParametersfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramBufferParametersIivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramBufferParametersIuivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glProgramBufferParametersfvNV;
        public final MemorySegment PFN_glProgramBufferParametersIivNV;
        public final MemorySegment PFN_glProgramBufferParametersIuivNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProgramBufferParametersfvNV = func.invoke("glProgramBufferParametersfvNV");
            PFN_glProgramBufferParametersIivNV = func.invoke("glProgramBufferParametersIivNV");
            PFN_glProgramBufferParametersIuivNV = func.invoke("glProgramBufferParametersIuivNV");
        }
    }

    public GLNVParameterBufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glProgramBufferParametersfvNV((unsigned int) GLenum target, (unsigned int) GLuint bindingIndex, (unsigned int) GLuint wordIndex, (int) GLsizei count, const GLfloat* params);
    /// ```
    public void ProgramBufferParametersfvNV(int target, int bindingIndex, int wordIndex, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramBufferParametersfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramBufferParametersfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramBufferParametersfvNV", target, bindingIndex, wordIndex, count, params); }
        Handles.MH_glProgramBufferParametersfvNV.invokeExact(handles.PFN_glProgramBufferParametersfvNV, target, bindingIndex, wordIndex, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramBufferParametersfvNV", e); }
    }

    /// ```
    /// void glProgramBufferParametersIivNV((unsigned int) GLenum target, (unsigned int) GLuint bindingIndex, (unsigned int) GLuint wordIndex, (int) GLsizei count, const GLint* params);
    /// ```
    public void ProgramBufferParametersIivNV(int target, int bindingIndex, int wordIndex, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramBufferParametersIivNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramBufferParametersIivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramBufferParametersIivNV", target, bindingIndex, wordIndex, count, params); }
        Handles.MH_glProgramBufferParametersIivNV.invokeExact(handles.PFN_glProgramBufferParametersIivNV, target, bindingIndex, wordIndex, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramBufferParametersIivNV", e); }
    }

    /// ```
    /// void glProgramBufferParametersIuivNV((unsigned int) GLenum target, (unsigned int) GLuint bindingIndex, (unsigned int) GLuint wordIndex, (int) GLsizei count, const GLuint* params);
    /// ```
    public void ProgramBufferParametersIuivNV(int target, int bindingIndex, int wordIndex, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramBufferParametersIuivNV)) throw new GLSymbolNotFoundError("Symbol not found: glProgramBufferParametersIuivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProgramBufferParametersIuivNV", target, bindingIndex, wordIndex, count, params); }
        Handles.MH_glProgramBufferParametersIuivNV.invokeExact(handles.PFN_glProgramBufferParametersIuivNV, target, bindingIndex, wordIndex, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramBufferParametersIuivNV", e); }
    }

}
