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

public final class GLNVShaderBufferLoad {
    public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;
    public static final int GL_GPU_ADDRESS_NV = 0x8F34;
    public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMakeBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeBufferNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeNamedBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMakeNamedBufferNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsNamedBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetBufferParameterui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferParameterui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetIntegerui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glProgramUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glMakeBufferResidentNV;
        public final MemorySegment PFN_glMakeBufferNonResidentNV;
        public final MemorySegment PFN_glIsBufferResidentNV;
        public final MemorySegment PFN_glMakeNamedBufferResidentNV;
        public final MemorySegment PFN_glMakeNamedBufferNonResidentNV;
        public final MemorySegment PFN_glIsNamedBufferResidentNV;
        public final MemorySegment PFN_glGetBufferParameterui64vNV;
        public final MemorySegment PFN_glGetNamedBufferParameterui64vNV;
        public final MemorySegment PFN_glGetIntegerui64vNV;
        public final MemorySegment PFN_glUniformui64NV;
        public final MemorySegment PFN_glUniformui64vNV;
        public final MemorySegment PFN_glGetUniformui64vNV;
        public final MemorySegment PFN_glProgramUniformui64NV;
        public final MemorySegment PFN_glProgramUniformui64vNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMakeBufferResidentNV = func.invoke("glMakeBufferResidentNV");
            PFN_glMakeBufferNonResidentNV = func.invoke("glMakeBufferNonResidentNV");
            PFN_glIsBufferResidentNV = func.invoke("glIsBufferResidentNV");
            PFN_glMakeNamedBufferResidentNV = func.invoke("glMakeNamedBufferResidentNV");
            PFN_glMakeNamedBufferNonResidentNV = func.invoke("glMakeNamedBufferNonResidentNV");
            PFN_glIsNamedBufferResidentNV = func.invoke("glIsNamedBufferResidentNV");
            PFN_glGetBufferParameterui64vNV = func.invoke("glGetBufferParameterui64vNV");
            PFN_glGetNamedBufferParameterui64vNV = func.invoke("glGetNamedBufferParameterui64vNV");
            PFN_glGetIntegerui64vNV = func.invoke("glGetIntegerui64vNV");
            PFN_glUniformui64NV = func.invoke("glUniformui64NV");
            PFN_glUniformui64vNV = func.invoke("glUniformui64vNV");
            PFN_glGetUniformui64vNV = func.invoke("glGetUniformui64vNV");
            PFN_glProgramUniformui64NV = func.invoke("glProgramUniformui64NV");
            PFN_glProgramUniformui64vNV = func.invoke("glProgramUniformui64vNV");
        }
    }

    public GLNVShaderBufferLoad(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void MakeBufferResidentNV(@CType("GLenum") int target, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeBufferResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeBufferResidentNV");
        try { Handles.MH_glMakeBufferResidentNV.invokeExact(handles.PFN_glMakeBufferResidentNV, target, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeBufferResidentNV", e); }
    }

    public void MakeBufferNonResidentNV(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeBufferNonResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeBufferNonResidentNV");
        try { Handles.MH_glMakeBufferNonResidentNV.invokeExact(handles.PFN_glMakeBufferNonResidentNV, target); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeBufferNonResidentNV", e); }
    }

    public @CType("GLboolean") boolean IsBufferResidentNV(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsBufferResidentNV)) throw new SymbolNotFoundError("Symbol not found: glIsBufferResidentNV");
        try { return (boolean) Handles.MH_glIsBufferResidentNV.invokeExact(handles.PFN_glIsBufferResidentNV, target); }
        catch (Throwable e) { throw new RuntimeException("error in glIsBufferResidentNV", e); }
    }

    public void MakeNamedBufferResidentNV(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeNamedBufferResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeNamedBufferResidentNV");
        try { Handles.MH_glMakeNamedBufferResidentNV.invokeExact(handles.PFN_glMakeNamedBufferResidentNV, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeNamedBufferResidentNV", e); }
    }

    public void MakeNamedBufferNonResidentNV(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glMakeNamedBufferNonResidentNV)) throw new SymbolNotFoundError("Symbol not found: glMakeNamedBufferNonResidentNV");
        try { Handles.MH_glMakeNamedBufferNonResidentNV.invokeExact(handles.PFN_glMakeNamedBufferNonResidentNV, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glMakeNamedBufferNonResidentNV", e); }
    }

    public @CType("GLboolean") boolean IsNamedBufferResidentNV(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsNamedBufferResidentNV)) throw new SymbolNotFoundError("Symbol not found: glIsNamedBufferResidentNV");
        try { return (boolean) Handles.MH_glIsNamedBufferResidentNV.invokeExact(handles.PFN_glIsNamedBufferResidentNV, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glIsNamedBufferResidentNV", e); }
    }

    public void GetBufferParameterui64vNV(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint64EXT *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetBufferParameterui64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetBufferParameterui64vNV");
        try { Handles.MH_glGetBufferParameterui64vNV.invokeExact(handles.PFN_glGetBufferParameterui64vNV, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetBufferParameterui64vNV", e); }
    }

    public void GetNamedBufferParameterui64vNV(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLuint64EXT *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferParameterui64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameterui64vNV");
        try { Handles.MH_glGetNamedBufferParameterui64vNV.invokeExact(handles.PFN_glGetNamedBufferParameterui64vNV, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameterui64vNV", e); }
    }

    public void GetIntegerui64vNV(@CType("GLenum") int value, @CType("GLuint64EXT *") MemorySegment result) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetIntegerui64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetIntegerui64vNV");
        try { Handles.MH_glGetIntegerui64vNV.invokeExact(handles.PFN_glGetIntegerui64vNV, value, result); }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegerui64vNV", e); }
    }

    public void Uniformui64NV(@CType("GLint") int location, @CType("GLuint64EXT") long value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformui64NV)) throw new SymbolNotFoundError("Symbol not found: glUniformui64NV");
        try { Handles.MH_glUniformui64NV.invokeExact(handles.PFN_glUniformui64NV, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformui64NV", e); }
    }

    public void Uniformui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformui64vNV)) throw new SymbolNotFoundError("Symbol not found: glUniformui64vNV");
        try { Handles.MH_glUniformui64vNV.invokeExact(handles.PFN_glUniformui64vNV, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformui64vNV", e); }
    }

    public void GetUniformui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformui64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetUniformui64vNV");
        try { Handles.MH_glGetUniformui64vNV.invokeExact(handles.PFN_glGetUniformui64vNV, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformui64vNV", e); }
    }

    public void ProgramUniformui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT") long value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformui64NV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformui64NV");
        try { Handles.MH_glProgramUniformui64NV.invokeExact(handles.PFN_glProgramUniformui64NV, program, location, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformui64NV", e); }
    }

    public void ProgramUniformui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformui64vNV)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformui64vNV");
        try { Handles.MH_glProgramUniformui64vNV.invokeExact(handles.PFN_glProgramUniformui64vNV, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformui64vNV", e); }
    }

}
