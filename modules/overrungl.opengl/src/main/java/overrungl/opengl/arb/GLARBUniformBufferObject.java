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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetUniformIndices = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveUniformsiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveUniformName = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformBlockIndex = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveUniformBlockiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveUniformBlockName = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformBlockBinding = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindBufferRange = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glBindBufferBase = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetIntegeri_v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetUniformIndices = RuntimeHelper.downcall(Descriptors.FD_glGetUniformIndices);
        public static final MethodHandle MH_glGetActiveUniformsiv = RuntimeHelper.downcall(Descriptors.FD_glGetActiveUniformsiv);
        public static final MethodHandle MH_glGetActiveUniformName = RuntimeHelper.downcall(Descriptors.FD_glGetActiveUniformName);
        public static final MethodHandle MH_glGetUniformBlockIndex = RuntimeHelper.downcall(Descriptors.FD_glGetUniformBlockIndex);
        public static final MethodHandle MH_glGetActiveUniformBlockiv = RuntimeHelper.downcall(Descriptors.FD_glGetActiveUniformBlockiv);
        public static final MethodHandle MH_glGetActiveUniformBlockName = RuntimeHelper.downcall(Descriptors.FD_glGetActiveUniformBlockName);
        public static final MethodHandle MH_glUniformBlockBinding = RuntimeHelper.downcall(Descriptors.FD_glUniformBlockBinding);
        public static final MethodHandle MH_glBindBufferRange = RuntimeHelper.downcall(Descriptors.FD_glBindBufferRange);
        public static final MethodHandle MH_glBindBufferBase = RuntimeHelper.downcall(Descriptors.FD_glBindBufferBase);
        public static final MethodHandle MH_glGetIntegeri_v = RuntimeHelper.downcall(Descriptors.FD_glGetIntegeri_v);
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

    public void GetUniformIndices(@CType("GLuint") int program, @CType("GLsizei") int uniformCount, @CType("const GLchar *const*") MemorySegment uniformNames, @CType("GLuint *") MemorySegment uniformIndices) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformIndices)) throw new SymbolNotFoundError("Symbol not found: glGetUniformIndices");
        try { Handles.MH_glGetUniformIndices.invokeExact(handles.PFN_glGetUniformIndices, program, uniformCount, uniformNames, uniformIndices); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformIndices", e); }
    }

    public void GetActiveUniformsiv(@CType("GLuint") int program, @CType("GLsizei") int uniformCount, @CType("const GLuint *") MemorySegment uniformIndices, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveUniformsiv)) throw new SymbolNotFoundError("Symbol not found: glGetActiveUniformsiv");
        try { Handles.MH_glGetActiveUniformsiv.invokeExact(handles.PFN_glGetActiveUniformsiv, program, uniformCount, uniformIndices, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformsiv", e); }
    }

    public void GetActiveUniformName(@CType("GLuint") int program, @CType("GLuint") int uniformIndex, @CType("GLsizei") int bufSize, @CType("GLsizei *") MemorySegment length, @CType("GLchar *") MemorySegment uniformName) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveUniformName)) throw new SymbolNotFoundError("Symbol not found: glGetActiveUniformName");
        try { Handles.MH_glGetActiveUniformName.invokeExact(handles.PFN_glGetActiveUniformName, program, uniformIndex, bufSize, length, uniformName); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformName", e); }
    }

    public @CType("GLuint") int GetUniformBlockIndex(@CType("GLuint") int program, @CType("const GLchar *") MemorySegment uniformBlockName) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformBlockIndex)) throw new SymbolNotFoundError("Symbol not found: glGetUniformBlockIndex");
        try { return (int) Handles.MH_glGetUniformBlockIndex.invokeExact(handles.PFN_glGetUniformBlockIndex, program, uniformBlockName); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformBlockIndex", e); }
    }

    public void GetActiveUniformBlockiv(@CType("GLuint") int program, @CType("GLuint") int uniformBlockIndex, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveUniformBlockiv)) throw new SymbolNotFoundError("Symbol not found: glGetActiveUniformBlockiv");
        try { Handles.MH_glGetActiveUniformBlockiv.invokeExact(handles.PFN_glGetActiveUniformBlockiv, program, uniformBlockIndex, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformBlockiv", e); }
    }

    public void GetActiveUniformBlockName(@CType("GLuint") int program, @CType("GLuint") int uniformBlockIndex, @CType("GLsizei") int bufSize, @CType("GLsizei *") MemorySegment length, @CType("GLchar *") MemorySegment uniformBlockName) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveUniformBlockName)) throw new SymbolNotFoundError("Symbol not found: glGetActiveUniformBlockName");
        try { Handles.MH_glGetActiveUniformBlockName.invokeExact(handles.PFN_glGetActiveUniformBlockName, program, uniformBlockIndex, bufSize, length, uniformBlockName); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformBlockName", e); }
    }

    public void UniformBlockBinding(@CType("GLuint") int program, @CType("GLuint") int uniformBlockIndex, @CType("GLuint") int uniformBlockBinding) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformBlockBinding)) throw new SymbolNotFoundError("Symbol not found: glUniformBlockBinding");
        try { Handles.MH_glUniformBlockBinding.invokeExact(handles.PFN_glUniformBlockBinding, program, uniformBlockIndex, uniformBlockBinding); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformBlockBinding", e); }
    }

    public void BindBufferRange(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferRange)) throw new SymbolNotFoundError("Symbol not found: glBindBufferRange");
        try { Handles.MH_glBindBufferRange.invokeExact(handles.PFN_glBindBufferRange, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferRange", e); }
    }

    public void BindBufferBase(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindBufferBase)) throw new SymbolNotFoundError("Symbol not found: glBindBufferBase");
        try { Handles.MH_glBindBufferBase.invokeExact(handles.PFN_glBindBufferBase, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferBase", e); }
    }

    public void GetIntegeri_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetIntegeri_v)) throw new SymbolNotFoundError("Symbol not found: glGetIntegeri_v");
        try { Handles.MH_glGetIntegeri_v.invokeExact(handles.PFN_glGetIntegeri_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegeri_v", e); }
    }

}
