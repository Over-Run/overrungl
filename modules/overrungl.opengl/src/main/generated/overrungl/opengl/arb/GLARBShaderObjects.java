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

public final class GLARBShaderObjects {
    public static final int GL_PROGRAM_OBJECT_ARB = 0x8B40;
    public static final int GL_SHADER_OBJECT_ARB = 0x8B48;
    public static final int GL_OBJECT_TYPE_ARB = 0x8B4E;
    public static final int GL_OBJECT_SUBTYPE_ARB = 0x8B4F;
    public static final int GL_FLOAT_VEC2_ARB = 0x8B50;
    public static final int GL_FLOAT_VEC3_ARB = 0x8B51;
    public static final int GL_FLOAT_VEC4_ARB = 0x8B52;
    public static final int GL_INT_VEC2_ARB = 0x8B53;
    public static final int GL_INT_VEC3_ARB = 0x8B54;
    public static final int GL_INT_VEC4_ARB = 0x8B55;
    public static final int GL_BOOL_ARB = 0x8B56;
    public static final int GL_BOOL_VEC2_ARB = 0x8B57;
    public static final int GL_BOOL_VEC3_ARB = 0x8B58;
    public static final int GL_BOOL_VEC4_ARB = 0x8B59;
    public static final int GL_FLOAT_MAT2_ARB = 0x8B5A;
    public static final int GL_FLOAT_MAT3_ARB = 0x8B5B;
    public static final int GL_FLOAT_MAT4_ARB = 0x8B5C;
    public static final int GL_SAMPLER_1D_ARB = 0x8B5D;
    public static final int GL_SAMPLER_2D_ARB = 0x8B5E;
    public static final int GL_SAMPLER_3D_ARB = 0x8B5F;
    public static final int GL_SAMPLER_CUBE_ARB = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW_ARB = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW_ARB = 0x8B62;
    public static final int GL_SAMPLER_2D_RECT_ARB = 0x8B63;
    public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;
    public static final int GL_OBJECT_DELETE_STATUS_ARB = 0x8B80;
    public static final int GL_OBJECT_COMPILE_STATUS_ARB = 0x8B81;
    public static final int GL_OBJECT_LINK_STATUS_ARB = 0x8B82;
    public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 0x8B83;
    public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 0x8B84;
    public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 0x8B85;
    public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 0x8B86;
    public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87;
    public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 0x8B88;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDeleteObjectARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetHandleARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDetachObjectARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShaderObjectARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderSourceARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompileShaderARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateProgramObjectARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glAttachObjectARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLinkProgramARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUseProgramObjectARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glValidateProgramARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform1fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform2fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform3fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform1iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform2iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform3iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform4iARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform1fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform1ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectParameterfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectParameterivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInfoLogARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetAttachedObjectsARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformLocationARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniformARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetShaderSourceARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDeleteObjectARB;
        public final MemorySegment PFN_glGetHandleARB;
        public final MemorySegment PFN_glDetachObjectARB;
        public final MemorySegment PFN_glCreateShaderObjectARB;
        public final MemorySegment PFN_glShaderSourceARB;
        public final MemorySegment PFN_glCompileShaderARB;
        public final MemorySegment PFN_glCreateProgramObjectARB;
        public final MemorySegment PFN_glAttachObjectARB;
        public final MemorySegment PFN_glLinkProgramARB;
        public final MemorySegment PFN_glUseProgramObjectARB;
        public final MemorySegment PFN_glValidateProgramARB;
        public final MemorySegment PFN_glUniform1fARB;
        public final MemorySegment PFN_glUniform2fARB;
        public final MemorySegment PFN_glUniform3fARB;
        public final MemorySegment PFN_glUniform4fARB;
        public final MemorySegment PFN_glUniform1iARB;
        public final MemorySegment PFN_glUniform2iARB;
        public final MemorySegment PFN_glUniform3iARB;
        public final MemorySegment PFN_glUniform4iARB;
        public final MemorySegment PFN_glUniform1fvARB;
        public final MemorySegment PFN_glUniform2fvARB;
        public final MemorySegment PFN_glUniform3fvARB;
        public final MemorySegment PFN_glUniform4fvARB;
        public final MemorySegment PFN_glUniform1ivARB;
        public final MemorySegment PFN_glUniform2ivARB;
        public final MemorySegment PFN_glUniform3ivARB;
        public final MemorySegment PFN_glUniform4ivARB;
        public final MemorySegment PFN_glUniformMatrix2fvARB;
        public final MemorySegment PFN_glUniformMatrix3fvARB;
        public final MemorySegment PFN_glUniformMatrix4fvARB;
        public final MemorySegment PFN_glGetObjectParameterfvARB;
        public final MemorySegment PFN_glGetObjectParameterivARB;
        public final MemorySegment PFN_glGetInfoLogARB;
        public final MemorySegment PFN_glGetAttachedObjectsARB;
        public final MemorySegment PFN_glGetUniformLocationARB;
        public final MemorySegment PFN_glGetActiveUniformARB;
        public final MemorySegment PFN_glGetUniformfvARB;
        public final MemorySegment PFN_glGetUniformivARB;
        public final MemorySegment PFN_glGetShaderSourceARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDeleteObjectARB = func.invoke("glDeleteObjectARB");
            PFN_glGetHandleARB = func.invoke("glGetHandleARB");
            PFN_glDetachObjectARB = func.invoke("glDetachObjectARB", "glDetachShader");
            PFN_glCreateShaderObjectARB = func.invoke("glCreateShaderObjectARB", "glCreateShader");
            PFN_glShaderSourceARB = func.invoke("glShaderSourceARB", "glShaderSource");
            PFN_glCompileShaderARB = func.invoke("glCompileShaderARB", "glCompileShader");
            PFN_glCreateProgramObjectARB = func.invoke("glCreateProgramObjectARB", "glCreateProgram");
            PFN_glAttachObjectARB = func.invoke("glAttachObjectARB", "glAttachShader");
            PFN_glLinkProgramARB = func.invoke("glLinkProgramARB", "glLinkProgram");
            PFN_glUseProgramObjectARB = func.invoke("glUseProgramObjectARB", "glUseProgram");
            PFN_glValidateProgramARB = func.invoke("glValidateProgramARB", "glValidateProgram");
            PFN_glUniform1fARB = func.invoke("glUniform1fARB", "glUniform1f");
            PFN_glUniform2fARB = func.invoke("glUniform2fARB", "glUniform2f");
            PFN_glUniform3fARB = func.invoke("glUniform3fARB", "glUniform3f");
            PFN_glUniform4fARB = func.invoke("glUniform4fARB", "glUniform4f");
            PFN_glUniform1iARB = func.invoke("glUniform1iARB", "glUniform1i");
            PFN_glUniform2iARB = func.invoke("glUniform2iARB", "glUniform2i");
            PFN_glUniform3iARB = func.invoke("glUniform3iARB", "glUniform3i");
            PFN_glUniform4iARB = func.invoke("glUniform4iARB", "glUniform4i");
            PFN_glUniform1fvARB = func.invoke("glUniform1fvARB", "glUniform1fv");
            PFN_glUniform2fvARB = func.invoke("glUniform2fvARB", "glUniform2fv");
            PFN_glUniform3fvARB = func.invoke("glUniform3fvARB", "glUniform3fv");
            PFN_glUniform4fvARB = func.invoke("glUniform4fvARB", "glUniform4fv");
            PFN_glUniform1ivARB = func.invoke("glUniform1ivARB", "glUniform1iv");
            PFN_glUniform2ivARB = func.invoke("glUniform2ivARB", "glUniform2iv");
            PFN_glUniform3ivARB = func.invoke("glUniform3ivARB", "glUniform3iv");
            PFN_glUniform4ivARB = func.invoke("glUniform4ivARB", "glUniform4iv");
            PFN_glUniformMatrix2fvARB = func.invoke("glUniformMatrix2fvARB", "glUniformMatrix2fv");
            PFN_glUniformMatrix3fvARB = func.invoke("glUniformMatrix3fvARB", "glUniformMatrix3fv");
            PFN_glUniformMatrix4fvARB = func.invoke("glUniformMatrix4fvARB", "glUniformMatrix4fv");
            PFN_glGetObjectParameterfvARB = func.invoke("glGetObjectParameterfvARB");
            PFN_glGetObjectParameterivARB = func.invoke("glGetObjectParameterivARB");
            PFN_glGetInfoLogARB = func.invoke("glGetInfoLogARB");
            PFN_glGetAttachedObjectsARB = func.invoke("glGetAttachedObjectsARB");
            PFN_glGetUniformLocationARB = func.invoke("glGetUniformLocationARB", "glGetUniformLocation");
            PFN_glGetActiveUniformARB = func.invoke("glGetActiveUniformARB", "glGetActiveUniform");
            PFN_glGetUniformfvARB = func.invoke("glGetUniformfvARB", "glGetUniformfv");
            PFN_glGetUniformivARB = func.invoke("glGetUniformivARB", "glGetUniformiv");
            PFN_glGetShaderSourceARB = func.invoke("glGetShaderSourceARB", "glGetShaderSource");
        }
    }

    public GLARBShaderObjects(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDeleteObjectARB((unsigned int) GLhandleARB obj);
    /// ```
    public void DeleteObjectARB(int obj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteObjectARB)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteObjectARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteObjectARB", obj); }
        Handles.MH_glDeleteObjectARB.invokeExact(handles.PFN_glDeleteObjectARB, obj); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteObjectARB", e); }
    }

    /// ```
    /// (unsigned int) GLhandleARB glGetHandleARB((unsigned int) GLenum pname);
    /// ```
    public int GetHandleARB(int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHandleARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetHandleARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetHandleARB", pname); }
        return (int) Handles.MH_glGetHandleARB.invokeExact(handles.PFN_glGetHandleARB, pname); }
        catch (Throwable e) { throw new RuntimeException("error in GetHandleARB", e); }
    }

    /// ```
    /// void glDetachObjectARB((unsigned int) GLhandleARB containerObj, (unsigned int) GLhandleARB attachedObj);
    /// ```
    public void DetachObjectARB(int containerObj, int attachedObj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDetachObjectARB)) throw new GLSymbolNotFoundError("Symbol not found: glDetachObjectARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDetachObjectARB", containerObj, attachedObj); }
        Handles.MH_glDetachObjectARB.invokeExact(handles.PFN_glDetachObjectARB, containerObj, attachedObj); }
        catch (Throwable e) { throw new RuntimeException("error in DetachObjectARB", e); }
    }

    /// ```
    /// (unsigned int) GLhandleARB glCreateShaderObjectARB((unsigned int) GLenum shaderType);
    /// ```
    public int CreateShaderObjectARB(int shaderType) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShaderObjectARB)) throw new GLSymbolNotFoundError("Symbol not found: glCreateShaderObjectARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateShaderObjectARB", shaderType); }
        return (int) Handles.MH_glCreateShaderObjectARB.invokeExact(handles.PFN_glCreateShaderObjectARB, shaderType); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderObjectARB", e); }
    }

    /// ```
    /// void glShaderSourceARB((unsigned int) GLhandleARB shaderObj, (int) GLsizei count, const GLcharARB** string, const GLint* length);
    /// ```
    public void ShaderSourceARB(int shaderObj, int count, MemorySegment string, MemorySegment length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderSourceARB)) throw new GLSymbolNotFoundError("Symbol not found: glShaderSourceARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderSourceARB", shaderObj, count, string, length); }
        Handles.MH_glShaderSourceARB.invokeExact(handles.PFN_glShaderSourceARB, shaderObj, count, string, length); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderSourceARB", e); }
    }

    /// ```
    /// void glCompileShaderARB((unsigned int) GLhandleARB shaderObj);
    /// ```
    public void CompileShaderARB(int shaderObj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileShaderARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompileShaderARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompileShaderARB", shaderObj); }
        Handles.MH_glCompileShaderARB.invokeExact(handles.PFN_glCompileShaderARB, shaderObj); }
        catch (Throwable e) { throw new RuntimeException("error in CompileShaderARB", e); }
    }

    /// ```
    /// (unsigned int) GLhandleARB glCreateProgramObjectARB();
    /// ```
    public int CreateProgramObjectARB() {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateProgramObjectARB)) throw new GLSymbolNotFoundError("Symbol not found: glCreateProgramObjectARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateProgramObjectARB"); }
        return (int) Handles.MH_glCreateProgramObjectARB.invokeExact(handles.PFN_glCreateProgramObjectARB); }
        catch (Throwable e) { throw new RuntimeException("error in CreateProgramObjectARB", e); }
    }

    /// ```
    /// void glAttachObjectARB((unsigned int) GLhandleARB containerObj, (unsigned int) GLhandleARB obj);
    /// ```
    public void AttachObjectARB(int containerObj, int obj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAttachObjectARB)) throw new GLSymbolNotFoundError("Symbol not found: glAttachObjectARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAttachObjectARB", containerObj, obj); }
        Handles.MH_glAttachObjectARB.invokeExact(handles.PFN_glAttachObjectARB, containerObj, obj); }
        catch (Throwable e) { throw new RuntimeException("error in AttachObjectARB", e); }
    }

    /// ```
    /// void glLinkProgramARB((unsigned int) GLhandleARB programObj);
    /// ```
    public void LinkProgramARB(int programObj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLinkProgramARB)) throw new GLSymbolNotFoundError("Symbol not found: glLinkProgramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLinkProgramARB", programObj); }
        Handles.MH_glLinkProgramARB.invokeExact(handles.PFN_glLinkProgramARB, programObj); }
        catch (Throwable e) { throw new RuntimeException("error in LinkProgramARB", e); }
    }

    /// ```
    /// void glUseProgramObjectARB((unsigned int) GLhandleARB programObj);
    /// ```
    public void UseProgramObjectARB(int programObj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseProgramObjectARB)) throw new GLSymbolNotFoundError("Symbol not found: glUseProgramObjectARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUseProgramObjectARB", programObj); }
        Handles.MH_glUseProgramObjectARB.invokeExact(handles.PFN_glUseProgramObjectARB, programObj); }
        catch (Throwable e) { throw new RuntimeException("error in UseProgramObjectARB", e); }
    }

    /// ```
    /// void glValidateProgramARB((unsigned int) GLhandleARB programObj);
    /// ```
    public void ValidateProgramARB(int programObj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glValidateProgramARB)) throw new GLSymbolNotFoundError("Symbol not found: glValidateProgramARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glValidateProgramARB", programObj); }
        Handles.MH_glValidateProgramARB.invokeExact(handles.PFN_glValidateProgramARB, programObj); }
        catch (Throwable e) { throw new RuntimeException("error in ValidateProgramARB", e); }
    }

    /// ```
    /// void glUniform1fARB((int) GLint location, ((float) khronos_float_t) GLfloat v0);
    /// ```
    public void Uniform1fARB(int location, float v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1fARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1fARB", location, v0); }
        Handles.MH_glUniform1fARB.invokeExact(handles.PFN_glUniform1fARB, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1fARB", e); }
    }

    /// ```
    /// void glUniform2fARB((int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1);
    /// ```
    public void Uniform2fARB(int location, float v0, float v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2fARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2fARB", location, v0, v1); }
        Handles.MH_glUniform2fARB.invokeExact(handles.PFN_glUniform2fARB, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2fARB", e); }
    }

    /// ```
    /// void glUniform3fARB((int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2);
    /// ```
    public void Uniform3fARB(int location, float v0, float v1, float v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3fARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3fARB", location, v0, v1, v2); }
        Handles.MH_glUniform3fARB.invokeExact(handles.PFN_glUniform3fARB, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3fARB", e); }
    }

    /// ```
    /// void glUniform4fARB((int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, ((float) khronos_float_t) GLfloat v3);
    /// ```
    public void Uniform4fARB(int location, float v0, float v1, float v2, float v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4fARB", location, v0, v1, v2, v3); }
        Handles.MH_glUniform4fARB.invokeExact(handles.PFN_glUniform4fARB, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4fARB", e); }
    }

    /// ```
    /// void glUniform1iARB((int) GLint location, (int) GLint v0);
    /// ```
    public void Uniform1iARB(int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1iARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1iARB", location, v0); }
        Handles.MH_glUniform1iARB.invokeExact(handles.PFN_glUniform1iARB, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1iARB", e); }
    }

    /// ```
    /// void glUniform2iARB((int) GLint location, (int) GLint v0, (int) GLint v1);
    /// ```
    public void Uniform2iARB(int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2iARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2iARB", location, v0, v1); }
        Handles.MH_glUniform2iARB.invokeExact(handles.PFN_glUniform2iARB, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2iARB", e); }
    }

    /// ```
    /// void glUniform3iARB((int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2);
    /// ```
    public void Uniform3iARB(int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3iARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3iARB", location, v0, v1, v2); }
        Handles.MH_glUniform3iARB.invokeExact(handles.PFN_glUniform3iARB, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3iARB", e); }
    }

    /// ```
    /// void glUniform4iARB((int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2, (int) GLint v3);
    /// ```
    public void Uniform4iARB(int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4iARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4iARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4iARB", location, v0, v1, v2, v3); }
        Handles.MH_glUniform4iARB.invokeExact(handles.PFN_glUniform4iARB, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4iARB", e); }
    }

    /// ```
    /// void glUniform1fvARB((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform1fvARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1fvARB", location, count, value); }
        Handles.MH_glUniform1fvARB.invokeExact(handles.PFN_glUniform1fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1fvARB", e); }
    }

    /// ```
    /// void glUniform2fvARB((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform2fvARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2fvARB", location, count, value); }
        Handles.MH_glUniform2fvARB.invokeExact(handles.PFN_glUniform2fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2fvARB", e); }
    }

    /// ```
    /// void glUniform3fvARB((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform3fvARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3fvARB", location, count, value); }
        Handles.MH_glUniform3fvARB.invokeExact(handles.PFN_glUniform3fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3fvARB", e); }
    }

    /// ```
    /// void glUniform4fvARB((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform4fvARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4fvARB", location, count, value); }
        Handles.MH_glUniform4fvARB.invokeExact(handles.PFN_glUniform4fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4fvARB", e); }
    }

    /// ```
    /// void glUniform1ivARB((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform1ivARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1ivARB", location, count, value); }
        Handles.MH_glUniform1ivARB.invokeExact(handles.PFN_glUniform1ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ivARB", e); }
    }

    /// ```
    /// void glUniform2ivARB((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform2ivARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2ivARB", location, count, value); }
        Handles.MH_glUniform2ivARB.invokeExact(handles.PFN_glUniform2ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ivARB", e); }
    }

    /// ```
    /// void glUniform3ivARB((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform3ivARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3ivARB", location, count, value); }
        Handles.MH_glUniform3ivARB.invokeExact(handles.PFN_glUniform3ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ivARB", e); }
    }

    /// ```
    /// void glUniform4ivARB((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform4ivARB(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4ivARB", location, count, value); }
        Handles.MH_glUniform4ivARB.invokeExact(handles.PFN_glUniform4ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ivARB", e); }
    }

    /// ```
    /// void glUniformMatrix2fvARB((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix2fvARB(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2fvARB", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2fvARB.invokeExact(handles.PFN_glUniformMatrix2fvARB, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2fvARB", e); }
    }

    /// ```
    /// void glUniformMatrix3fvARB((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix3fvARB(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3fvARB", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3fvARB.invokeExact(handles.PFN_glUniformMatrix3fvARB, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3fvARB", e); }
    }

    /// ```
    /// void glUniformMatrix4fvARB((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix4fvARB(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4fvARB", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4fvARB.invokeExact(handles.PFN_glUniformMatrix4fvARB, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4fvARB", e); }
    }

    /// ```
    /// void glGetObjectParameterfvARB((unsigned int) GLhandleARB obj, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetObjectParameterfvARB(int obj, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectParameterfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectParameterfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectParameterfvARB", obj, pname, params); }
        Handles.MH_glGetObjectParameterfvARB.invokeExact(handles.PFN_glGetObjectParameterfvARB, obj, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectParameterfvARB", e); }
    }

    /// ```
    /// void glGetObjectParameterivARB((unsigned int) GLhandleARB obj, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetObjectParameterivARB(int obj, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectParameterivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectParameterivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetObjectParameterivARB", obj, pname, params); }
        Handles.MH_glGetObjectParameterivARB.invokeExact(handles.PFN_glGetObjectParameterivARB, obj, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectParameterivARB", e); }
    }

    /// ```
    /// void glGetInfoLogARB((unsigned int) GLhandleARB obj, (int) GLsizei maxLength, GLsizei* length, GLcharARB* infoLog);
    /// ```
    public void GetInfoLogARB(int obj, int maxLength, MemorySegment length, MemorySegment infoLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInfoLogARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetInfoLogARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInfoLogARB", obj, maxLength, length, infoLog); }
        Handles.MH_glGetInfoLogARB.invokeExact(handles.PFN_glGetInfoLogARB, obj, maxLength, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetInfoLogARB", e); }
    }

    /// ```
    /// void glGetAttachedObjectsARB((unsigned int) GLhandleARB containerObj, (int) GLsizei maxCount, GLsizei* count, GLhandleARB* obj);
    /// ```
    public void GetAttachedObjectsARB(int containerObj, int maxCount, MemorySegment count, MemorySegment obj) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetAttachedObjectsARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetAttachedObjectsARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetAttachedObjectsARB", containerObj, maxCount, count, obj); }
        Handles.MH_glGetAttachedObjectsARB.invokeExact(handles.PFN_glGetAttachedObjectsARB, containerObj, maxCount, count, obj); }
        catch (Throwable e) { throw new RuntimeException("error in GetAttachedObjectsARB", e); }
    }

    /// ```
    /// (int) GLint glGetUniformLocationARB((unsigned int) GLhandleARB programObj, const GLcharARB* name);
    /// ```
    public int GetUniformLocationARB(int programObj, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformLocationARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformLocationARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformLocationARB", programObj, name); }
        return (int) Handles.MH_glGetUniformLocationARB.invokeExact(handles.PFN_glGetUniformLocationARB, programObj, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformLocationARB", e); }
    }

    /// ```
    /// void glGetActiveUniformARB((unsigned int) GLhandleARB programObj, (unsigned int) GLuint index, (int) GLsizei maxLength, GLsizei* length, GLint* size, GLenum* type, GLcharARB* name);
    /// ```
    public void GetActiveUniformARB(int programObj, int index, int maxLength, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveUniformARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveUniformARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveUniformARB", programObj, index, maxLength, length, size, type, name); }
        Handles.MH_glGetActiveUniformARB.invokeExact(handles.PFN_glGetActiveUniformARB, programObj, index, maxLength, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveUniformARB", e); }
    }

    /// ```
    /// void glGetUniformfvARB((unsigned int) GLhandleARB programObj, (int) GLint location, GLfloat* params);
    /// ```
    public void GetUniformfvARB(int programObj, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformfvARB", programObj, location, params); }
        Handles.MH_glGetUniformfvARB.invokeExact(handles.PFN_glGetUniformfvARB, programObj, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformfvARB", e); }
    }

    /// ```
    /// void glGetUniformivARB((unsigned int) GLhandleARB programObj, (int) GLint location, GLint* params);
    /// ```
    public void GetUniformivARB(int programObj, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformivARB", programObj, location, params); }
        Handles.MH_glGetUniformivARB.invokeExact(handles.PFN_glGetUniformivARB, programObj, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformivARB", e); }
    }

    /// ```
    /// void glGetShaderSourceARB((unsigned int) GLhandleARB obj, (int) GLsizei maxLength, GLsizei* length, GLcharARB* source);
    /// ```
    public void GetShaderSourceARB(int obj, int maxLength, MemorySegment length, MemorySegment source) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderSourceARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetShaderSourceARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShaderSourceARB", obj, maxLength, length, source); }
        Handles.MH_glGetShaderSourceARB.invokeExact(handles.PFN_glGetShaderSourceARB, obj, maxLength, length, source); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderSourceARB", e); }
    }

}
