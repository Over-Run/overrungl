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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL31 extends GL30 {
    public static final int GL_SAMPLER_2D_RECT = 0x8B63;
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;
    public static final int GL_SAMPLER_BUFFER = 0x8DC2;
    public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
    public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
    public static final int GL_TEXTURE_BUFFER = 0x8C2A;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
    public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
    public static final int GL_TEXTURE_RECTANGLE = 0x84F5;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
    public static final int GL_R8_SNORM = 0x8F94;
    public static final int GL_RG8_SNORM = 0x8F95;
    public static final int GL_RGB8_SNORM = 0x8F96;
    public static final int GL_RGBA8_SNORM = 0x8F97;
    public static final int GL_R16_SNORM = 0x8F98;
    public static final int GL_RG16_SNORM = 0x8F99;
    public static final int GL_RGB16_SNORM = 0x8F9A;
    public static final int GL_RGBA16_SNORM = 0x8F9B;
    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;
    public static final int GL_PRIMITIVE_RESTART = 0x8F9D;
    public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;
    public static final int GL_COPY_READ_BUFFER = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
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
        public static final MethodHandle MH_glDrawArraysInstanced = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstanced = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPrimitiveRestartIndex = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetUniformIndices = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformsiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformBlockIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformBlockiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformBlockName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformBlockBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawArraysInstanced;
        public final MemorySegment PFN_glDrawElementsInstanced;
        public final MemorySegment PFN_glTexBuffer;
        public final MemorySegment PFN_glPrimitiveRestartIndex;
        public final MemorySegment PFN_glCopyBufferSubData;
        public final MemorySegment PFN_glGetUniformIndices;
        public final MemorySegment PFN_glGetActiveUniformsiv;
        public final MemorySegment PFN_glGetActiveUniformName;
        public final MemorySegment PFN_glGetUniformBlockIndex;
        public final MemorySegment PFN_glGetActiveUniformBlockiv;
        public final MemorySegment PFN_glGetActiveUniformBlockName;
        public final MemorySegment PFN_glUniformBlockBinding;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysInstanced = func.invoke("glDrawArraysInstanced", "glDrawArraysInstancedANGLE", "glDrawArraysInstancedARB", "glDrawArraysInstancedEXT", "glDrawArraysInstancedNV");
            PFN_glDrawElementsInstanced = func.invoke("glDrawElementsInstanced", "glDrawElementsInstancedANGLE", "glDrawElementsInstancedARB", "glDrawElementsInstancedEXT", "glDrawElementsInstancedNV");
            PFN_glTexBuffer = func.invoke("glTexBuffer", "glTexBufferARB", "glTexBufferEXT", "glTexBufferOES");
            PFN_glPrimitiveRestartIndex = func.invoke("glPrimitiveRestartIndex");
            PFN_glCopyBufferSubData = func.invoke("glCopyBufferSubData", "glCopyBufferSubDataNV");
            PFN_glGetUniformIndices = func.invoke("glGetUniformIndices");
            PFN_glGetActiveUniformsiv = func.invoke("glGetActiveUniformsiv");
            PFN_glGetActiveUniformName = func.invoke("glGetActiveUniformName");
            PFN_glGetUniformBlockIndex = func.invoke("glGetUniformBlockIndex");
            PFN_glGetActiveUniformBlockiv = func.invoke("glGetActiveUniformBlockiv");
            PFN_glGetActiveUniformBlockName = func.invoke("glGetActiveUniformBlockName");
            PFN_glUniformBlockBinding = func.invoke("glUniformBlockBinding");
        }
    }

    public GL31(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void DrawArraysInstanced(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count, @CType("GLsizei") int instancecount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysInstanced)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstanced");
        try { Handles.MH_glDrawArraysInstanced.invokeExact(handles.PFN_glDrawArraysInstanced, mode, first, count, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysInstanced", e); }
    }

    public void DrawElementsInstanced(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") MemorySegment indices, @CType("GLsizei") int instancecount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsInstanced)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstanced");
        try { Handles.MH_glDrawElementsInstanced.invokeExact(handles.PFN_glDrawElementsInstanced, mode, count, type, indices, instancecount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstanced", e); }
    }

    public void TexBuffer(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexBuffer)) throw new SymbolNotFoundError("Symbol not found: glTexBuffer");
        try { Handles.MH_glTexBuffer.invokeExact(handles.PFN_glTexBuffer, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glTexBuffer", e); }
    }

    public void PrimitiveRestartIndex(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glPrimitiveRestartIndex)) throw new SymbolNotFoundError("Symbol not found: glPrimitiveRestartIndex");
        try { Handles.MH_glPrimitiveRestartIndex.invokeExact(handles.PFN_glPrimitiveRestartIndex, index); }
        catch (Throwable e) { throw new RuntimeException("error in glPrimitiveRestartIndex", e); }
    }

    public void CopyBufferSubData(@CType("GLenum") int readTarget, @CType("GLenum") int writeTarget, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glCopyBufferSubData");
        try { Handles.MH_glCopyBufferSubData.invokeExact(handles.PFN_glCopyBufferSubData, readTarget, writeTarget, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyBufferSubData", e); }
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

}
