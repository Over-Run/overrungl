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
    public static final MethodHandle MH_glMakeBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMakeBufferResidentNV;
    public static final MethodHandle MH_glMakeBufferNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMakeBufferNonResidentNV;
    public static final MethodHandle MH_glIsBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsBufferResidentNV;
    public static final MethodHandle MH_glMakeNamedBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMakeNamedBufferResidentNV;
    public static final MethodHandle MH_glMakeNamedBufferNonResidentNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMakeNamedBufferNonResidentNV;
    public static final MethodHandle MH_glIsNamedBufferResidentNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsNamedBufferResidentNV;
    public static final MethodHandle MH_glGetBufferParameterui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBufferParameterui64vNV;
    public static final MethodHandle MH_glGetNamedBufferParameterui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferParameterui64vNV;
    public static final MethodHandle MH_glGetIntegerui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetIntegerui64vNV;
    public static final MethodHandle MH_glUniformui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glUniformui64NV;
    public static final MethodHandle MH_glUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformui64vNV;
    public static final MethodHandle MH_glGetUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformui64vNV;
    public static final MethodHandle MH_glProgramUniformui64NV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glProgramUniformui64NV;
    public static final MethodHandle MH_glProgramUniformui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformui64vNV;

    public GLNVShaderBufferLoad(overrungl.opengl.GLLoadFunc func) {
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

    public void MakeBufferResidentNV(@CType("GLenum") int target, @CType("GLenum") int access) {
        if (!Unmarshal.isNullPointer(PFN_glMakeBufferResidentNV)) { try {
            MH_glMakeBufferResidentNV.invokeExact(PFN_glMakeBufferResidentNV, target, access);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeBufferResidentNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeBufferResidentNV"); }
    }

    public void MakeBufferNonResidentNV(@CType("GLenum") int target) {
        if (!Unmarshal.isNullPointer(PFN_glMakeBufferNonResidentNV)) { try {
            MH_glMakeBufferNonResidentNV.invokeExact(PFN_glMakeBufferNonResidentNV, target);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeBufferNonResidentNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeBufferNonResidentNV"); }
    }

    public @CType("GLboolean") boolean IsBufferResidentNV(@CType("GLenum") int target) {
        if (!Unmarshal.isNullPointer(PFN_glIsBufferResidentNV)) { try {
            return (boolean) MH_glIsBufferResidentNV.invokeExact(PFN_glIsBufferResidentNV, target);
        } catch (Throwable e) { throw new RuntimeException("error in glIsBufferResidentNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsBufferResidentNV"); }
    }

    public void MakeNamedBufferResidentNV(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        if (!Unmarshal.isNullPointer(PFN_glMakeNamedBufferResidentNV)) { try {
            MH_glMakeNamedBufferResidentNV.invokeExact(PFN_glMakeNamedBufferResidentNV, buffer, access);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeNamedBufferResidentNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeNamedBufferResidentNV"); }
    }

    public void MakeNamedBufferNonResidentNV(@CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glMakeNamedBufferNonResidentNV)) { try {
            MH_glMakeNamedBufferNonResidentNV.invokeExact(PFN_glMakeNamedBufferNonResidentNV, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glMakeNamedBufferNonResidentNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMakeNamedBufferNonResidentNV"); }
    }

    public @CType("GLboolean") boolean IsNamedBufferResidentNV(@CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glIsNamedBufferResidentNV)) { try {
            return (boolean) MH_glIsNamedBufferResidentNV.invokeExact(PFN_glIsNamedBufferResidentNV, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glIsNamedBufferResidentNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsNamedBufferResidentNV"); }
    }

    public void GetBufferParameterui64vNV(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetBufferParameterui64vNV)) { try {
            MH_glGetBufferParameterui64vNV.invokeExact(PFN_glGetBufferParameterui64vNV, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetBufferParameterui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetBufferParameterui64vNV"); }
    }

    public void GetNamedBufferParameterui64vNV(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferParameterui64vNV)) { try {
            MH_glGetNamedBufferParameterui64vNV.invokeExact(PFN_glGetNamedBufferParameterui64vNV, buffer, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameterui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameterui64vNV"); }
    }

    public void GetIntegerui64vNV(@CType("GLenum") int value, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment result) {
        if (!Unmarshal.isNullPointer(PFN_glGetIntegerui64vNV)) { try {
            MH_glGetIntegerui64vNV.invokeExact(PFN_glGetIntegerui64vNV, value, result);
        } catch (Throwable e) { throw new RuntimeException("error in glGetIntegerui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetIntegerui64vNV"); }
    }

    public void Uniformui64NV(@CType("GLint") int location, @CType("GLuint64EXT") long value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformui64NV)) { try {
            MH_glUniformui64NV.invokeExact(PFN_glUniformui64NV, location, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformui64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformui64NV"); }
    }

    public void Uniformui64vNV(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformui64vNV)) { try {
            MH_glUniformui64vNV.invokeExact(PFN_glUniformui64vNV, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformui64vNV"); }
    }

    public void GetUniformui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformui64vNV)) { try {
            MH_glGetUniformui64vNV.invokeExact(PFN_glGetUniformui64vNV, program, location, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformui64vNV"); }
    }

    public void ProgramUniformui64NV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint64EXT") long value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformui64NV)) { try {
            MH_glProgramUniformui64NV.invokeExact(PFN_glProgramUniformui64NV, program, location, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformui64NV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformui64NV"); }
    }

    public void ProgramUniformui64vNV(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint64EXT *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformui64vNV)) { try {
            MH_glProgramUniformui64vNV.invokeExact(PFN_glProgramUniformui64vNV, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformui64vNV"); }
    }

}
