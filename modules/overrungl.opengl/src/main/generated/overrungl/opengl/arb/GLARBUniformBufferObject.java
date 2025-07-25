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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBUniformBufferObject {
    public static final int GL_UNIFORM_BUFFER = 0x8A11;
    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
    public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
    public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    public static final int GL_UNIFORM_TYPE = 0x8A37;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
    public static final int GL_UNIFORM_OFFSET = 0x8A3B;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    public static final int GL_INVALID_INDEX = 0xFFFFFFFF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetUniformIndices = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformsiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformName = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformBlockIndex = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformBlockiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformBlockName = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformBlockBinding = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindBufferBase = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetIntegeri_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetUniformIndices;
        public final MemorySegment PFN_glGetActiveUniformsiv;
        public final MemorySegment PFN_glGetActiveUniformName;
        public final MemorySegment PFN_glGetUniformBlockIndex;
        public final MemorySegment PFN_glGetActiveUniformBlockiv;
        public final MemorySegment PFN_glGetActiveUniformBlockName;
        public final MemorySegment PFN_glUniformBlockBinding;
        public final MemorySegment PFN_glBindBufferRange;
        public final MemorySegment PFN_glBindBufferBase;
        public final MemorySegment PFN_glGetIntegeri_v;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetUniformIndices = func.invoke("glGetUniformIndices");
            PFN_glGetActiveUniformsiv = func.invoke("glGetActiveUniformsiv");
            PFN_glGetActiveUniformName = func.invoke("glGetActiveUniformName");
            PFN_glGetUniformBlockIndex = func.invoke("glGetUniformBlockIndex");
            PFN_glGetActiveUniformBlockiv = func.invoke("glGetActiveUniformBlockiv");
            PFN_glGetActiveUniformBlockName = func.invoke("glGetActiveUniformBlockName");
            PFN_glUniformBlockBinding = func.invoke("glUniformBlockBinding");
            PFN_glBindBufferRange = func.invoke("glBindBufferRange");
            PFN_glBindBufferBase = func.invoke("glBindBufferBase");
            PFN_glGetIntegeri_v = func.invoke("glGetIntegeri_v");
        }
    }

    public GLARBUniformBufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetUniformIndices((unsigned int) GLuint program, (int) GLsizei uniformCount, const GLchar* const * uniformNames, GLuint* uniformIndices);
    /// ```
    public void GetUniformIndices(int program, int uniformCount, MemorySegment uniformNames, MemorySegment uniformIndices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformIndices)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformIndices");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformIndices", program, uniformCount, uniformNames, uniformIndices); }
        Handles.MH_glGetUniformIndices.invokeExact(handles.PFN_glGetUniformIndices, program, uniformCount, uniformNames, uniformIndices); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformIndices", e); }
    }

    /// ```
    /// void glGetActiveUniformsiv((unsigned int) GLuint program, (int) GLsizei uniformCount, const GLuint* uniformIndices, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetActiveUniformsiv(int program, int uniformCount, MemorySegment uniformIndices, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveUniformsiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveUniformsiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveUniformsiv", program, uniformCount, uniformIndices, pname, params); }
        Handles.MH_glGetActiveUniformsiv.invokeExact(handles.PFN_glGetActiveUniformsiv, program, uniformCount, uniformIndices, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveUniformsiv", e); }
    }

    /// ```
    /// void glGetActiveUniformName((unsigned int) GLuint program, (unsigned int) GLuint uniformIndex, (int) GLsizei bufSize, GLsizei* length, GLchar* uniformName);
    /// ```
    public void GetActiveUniformName(int program, int uniformIndex, int bufSize, MemorySegment length, MemorySegment uniformName) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveUniformName)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveUniformName");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveUniformName", program, uniformIndex, bufSize, length, uniformName); }
        Handles.MH_glGetActiveUniformName.invokeExact(handles.PFN_glGetActiveUniformName, program, uniformIndex, bufSize, length, uniformName); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveUniformName", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetUniformBlockIndex((unsigned int) GLuint program, const GLchar* uniformBlockName);
    /// ```
    public int GetUniformBlockIndex(int program, MemorySegment uniformBlockName) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformBlockIndex)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformBlockIndex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformBlockIndex", program, uniformBlockName); }
        return (int) Handles.MH_glGetUniformBlockIndex.invokeExact(handles.PFN_glGetUniformBlockIndex, program, uniformBlockName); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformBlockIndex", e); }
    }

    /// ```
    /// void glGetActiveUniformBlockiv((unsigned int) GLuint program, (unsigned int) GLuint uniformBlockIndex, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveUniformBlockiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveUniformBlockiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveUniformBlockiv", program, uniformBlockIndex, pname, params); }
        Handles.MH_glGetActiveUniformBlockiv.invokeExact(handles.PFN_glGetActiveUniformBlockiv, program, uniformBlockIndex, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveUniformBlockiv", e); }
    }

    /// ```
    /// void glGetActiveUniformBlockName((unsigned int) GLuint program, (unsigned int) GLuint uniformBlockIndex, (int) GLsizei bufSize, GLsizei* length, GLchar* uniformBlockName);
    /// ```
    public void GetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, MemorySegment length, MemorySegment uniformBlockName) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveUniformBlockName)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveUniformBlockName");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveUniformBlockName", program, uniformBlockIndex, bufSize, length, uniformBlockName); }
        Handles.MH_glGetActiveUniformBlockName.invokeExact(handles.PFN_glGetActiveUniformBlockName, program, uniformBlockIndex, bufSize, length, uniformBlockName); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveUniformBlockName", e); }
    }

    /// ```
    /// void glUniformBlockBinding((unsigned int) GLuint program, (unsigned int) GLuint uniformBlockIndex, (unsigned int) GLuint uniformBlockBinding);
    /// ```
    public void UniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformBlockBinding)) throw new GLSymbolNotFoundError("Symbol not found: glUniformBlockBinding");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformBlockBinding", program, uniformBlockIndex, uniformBlockBinding); }
        Handles.MH_glUniformBlockBinding.invokeExact(handles.PFN_glUniformBlockBinding, program, uniformBlockIndex, uniformBlockBinding); }
        catch (Throwable e) { throw new RuntimeException("error in UniformBlockBinding", e); }
    }

    /// ```
    /// void glBindBufferRange((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void BindBufferRange(int target, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferRange", target, index, buffer, offset, size); }
        Handles.MH_glBindBufferRange.invokeExact(handles.PFN_glBindBufferRange, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferRange", e); }
    }

    /// ```
    /// void glBindBufferBase((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer);
    /// ```
    public void BindBufferBase(int target, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferBase)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferBase");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferBase", target, index, buffer); }
        Handles.MH_glBindBufferBase.invokeExact(handles.PFN_glBindBufferBase, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferBase", e); }
    }

    /// ```
    /// void glGetIntegeri_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLint* data);
    /// ```
    public void GetIntegeri_v(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegeri_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegeri_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetIntegeri_v", target, index, data); }
        Handles.MH_glGetIntegeri_v.invokeExact(handles.PFN_glGetIntegeri_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegeri_v", e); }
    }

}
