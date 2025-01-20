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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDeleteObjectARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetHandleARB = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDetachObjectARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateShaderObjectARB = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glShaderSourceARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompileShaderARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateProgramObjectARB = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glAttachObjectARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glLinkProgramARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUseProgramObjectARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glValidateProgramARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform1fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform2fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform3fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform4fARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform1iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform2iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform3iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform4iARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform1fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform1ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4ivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4fvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetObjectParameterfvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetObjectParameterivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetInfoLogARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetAttachedObjectsARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformLocationARB = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveUniformARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformfvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetShaderSourceARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDeleteObjectARB = RuntimeHelper.downcall(Descriptors.FD_glDeleteObjectARB);
        public static final MethodHandle MH_glGetHandleARB = RuntimeHelper.downcall(Descriptors.FD_glGetHandleARB);
        public static final MethodHandle MH_glDetachObjectARB = RuntimeHelper.downcall(Descriptors.FD_glDetachObjectARB);
        public static final MethodHandle MH_glCreateShaderObjectARB = RuntimeHelper.downcall(Descriptors.FD_glCreateShaderObjectARB);
        public static final MethodHandle MH_glShaderSourceARB = RuntimeHelper.downcall(Descriptors.FD_glShaderSourceARB);
        public static final MethodHandle MH_glCompileShaderARB = RuntimeHelper.downcall(Descriptors.FD_glCompileShaderARB);
        public static final MethodHandle MH_glCreateProgramObjectARB = RuntimeHelper.downcall(Descriptors.FD_glCreateProgramObjectARB);
        public static final MethodHandle MH_glAttachObjectARB = RuntimeHelper.downcall(Descriptors.FD_glAttachObjectARB);
        public static final MethodHandle MH_glLinkProgramARB = RuntimeHelper.downcall(Descriptors.FD_glLinkProgramARB);
        public static final MethodHandle MH_glUseProgramObjectARB = RuntimeHelper.downcall(Descriptors.FD_glUseProgramObjectARB);
        public static final MethodHandle MH_glValidateProgramARB = RuntimeHelper.downcall(Descriptors.FD_glValidateProgramARB);
        public static final MethodHandle MH_glUniform1fARB = RuntimeHelper.downcall(Descriptors.FD_glUniform1fARB);
        public static final MethodHandle MH_glUniform2fARB = RuntimeHelper.downcall(Descriptors.FD_glUniform2fARB);
        public static final MethodHandle MH_glUniform3fARB = RuntimeHelper.downcall(Descriptors.FD_glUniform3fARB);
        public static final MethodHandle MH_glUniform4fARB = RuntimeHelper.downcall(Descriptors.FD_glUniform4fARB);
        public static final MethodHandle MH_glUniform1iARB = RuntimeHelper.downcall(Descriptors.FD_glUniform1iARB);
        public static final MethodHandle MH_glUniform2iARB = RuntimeHelper.downcall(Descriptors.FD_glUniform2iARB);
        public static final MethodHandle MH_glUniform3iARB = RuntimeHelper.downcall(Descriptors.FD_glUniform3iARB);
        public static final MethodHandle MH_glUniform4iARB = RuntimeHelper.downcall(Descriptors.FD_glUniform4iARB);
        public static final MethodHandle MH_glUniform1fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniform1fvARB);
        public static final MethodHandle MH_glUniform2fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniform2fvARB);
        public static final MethodHandle MH_glUniform3fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniform3fvARB);
        public static final MethodHandle MH_glUniform4fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniform4fvARB);
        public static final MethodHandle MH_glUniform1ivARB = RuntimeHelper.downcall(Descriptors.FD_glUniform1ivARB);
        public static final MethodHandle MH_glUniform2ivARB = RuntimeHelper.downcall(Descriptors.FD_glUniform2ivARB);
        public static final MethodHandle MH_glUniform3ivARB = RuntimeHelper.downcall(Descriptors.FD_glUniform3ivARB);
        public static final MethodHandle MH_glUniform4ivARB = RuntimeHelper.downcall(Descriptors.FD_glUniform4ivARB);
        public static final MethodHandle MH_glUniformMatrix2fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2fvARB);
        public static final MethodHandle MH_glUniformMatrix3fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3fvARB);
        public static final MethodHandle MH_glUniformMatrix4fvARB = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4fvARB);
        public static final MethodHandle MH_glGetObjectParameterfvARB = RuntimeHelper.downcall(Descriptors.FD_glGetObjectParameterfvARB);
        public static final MethodHandle MH_glGetObjectParameterivARB = RuntimeHelper.downcall(Descriptors.FD_glGetObjectParameterivARB);
        public static final MethodHandle MH_glGetInfoLogARB = RuntimeHelper.downcall(Descriptors.FD_glGetInfoLogARB);
        public static final MethodHandle MH_glGetAttachedObjectsARB = RuntimeHelper.downcall(Descriptors.FD_glGetAttachedObjectsARB);
        public static final MethodHandle MH_glGetUniformLocationARB = RuntimeHelper.downcall(Descriptors.FD_glGetUniformLocationARB);
        public static final MethodHandle MH_glGetActiveUniformARB = RuntimeHelper.downcall(Descriptors.FD_glGetActiveUniformARB);
        public static final MethodHandle MH_glGetUniformfvARB = RuntimeHelper.downcall(Descriptors.FD_glGetUniformfvARB);
        public static final MethodHandle MH_glGetUniformivARB = RuntimeHelper.downcall(Descriptors.FD_glGetUniformivARB);
        public static final MethodHandle MH_glGetShaderSourceARB = RuntimeHelper.downcall(Descriptors.FD_glGetShaderSourceARB);
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

    public void DeleteObjectARB(@CType("GLhandleARB") int obj) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteObjectARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteObjectARB");
        try { Handles.MH_glDeleteObjectARB.invokeExact(handles.PFN_glDeleteObjectARB, obj); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteObjectARB", e); }
    }

    public @CType("GLhandleARB") int GetHandleARB(@CType("GLenum") int pname) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetHandleARB)) throw new SymbolNotFoundError("Symbol not found: glGetHandleARB");
        try { return (int) Handles.MH_glGetHandleARB.invokeExact(handles.PFN_glGetHandleARB, pname); }
        catch (Throwable e) { throw new RuntimeException("error in glGetHandleARB", e); }
    }

    public void DetachObjectARB(@CType("GLhandleARB") int containerObj, @CType("GLhandleARB") int attachedObj) {
        if (Unmarshal.isNullPointer(handles.PFN_glDetachObjectARB)) throw new SymbolNotFoundError("Symbol not found: glDetachObjectARB");
        try { Handles.MH_glDetachObjectARB.invokeExact(handles.PFN_glDetachObjectARB, containerObj, attachedObj); }
        catch (Throwable e) { throw new RuntimeException("error in glDetachObjectARB", e); }
    }

    public @CType("GLhandleARB") int CreateShaderObjectARB(@CType("GLenum") int shaderType) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateShaderObjectARB)) throw new SymbolNotFoundError("Symbol not found: glCreateShaderObjectARB");
        try { return (int) Handles.MH_glCreateShaderObjectARB.invokeExact(handles.PFN_glCreateShaderObjectARB, shaderType); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateShaderObjectARB", e); }
    }

    public void ShaderSourceARB(@CType("GLhandleARB") int shaderObj, @CType("GLsizei") int count, @CType("const GLcharARB **") java.lang.foreign.MemorySegment string, @CType("const GLint *") java.lang.foreign.MemorySegment length) {
        if (Unmarshal.isNullPointer(handles.PFN_glShaderSourceARB)) throw new SymbolNotFoundError("Symbol not found: glShaderSourceARB");
        try { Handles.MH_glShaderSourceARB.invokeExact(handles.PFN_glShaderSourceARB, shaderObj, count, string, length); }
        catch (Throwable e) { throw new RuntimeException("error in glShaderSourceARB", e); }
    }

    public void CompileShaderARB(@CType("GLhandleARB") int shaderObj) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompileShaderARB)) throw new SymbolNotFoundError("Symbol not found: glCompileShaderARB");
        try { Handles.MH_glCompileShaderARB.invokeExact(handles.PFN_glCompileShaderARB, shaderObj); }
        catch (Throwable e) { throw new RuntimeException("error in glCompileShaderARB", e); }
    }

    public @CType("GLhandleARB") int CreateProgramObjectARB() {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateProgramObjectARB)) throw new SymbolNotFoundError("Symbol not found: glCreateProgramObjectARB");
        try { return (int) Handles.MH_glCreateProgramObjectARB.invokeExact(handles.PFN_glCreateProgramObjectARB); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateProgramObjectARB", e); }
    }

    public void AttachObjectARB(@CType("GLhandleARB") int containerObj, @CType("GLhandleARB") int obj) {
        if (Unmarshal.isNullPointer(handles.PFN_glAttachObjectARB)) throw new SymbolNotFoundError("Symbol not found: glAttachObjectARB");
        try { Handles.MH_glAttachObjectARB.invokeExact(handles.PFN_glAttachObjectARB, containerObj, obj); }
        catch (Throwable e) { throw new RuntimeException("error in glAttachObjectARB", e); }
    }

    public void LinkProgramARB(@CType("GLhandleARB") int programObj) {
        if (Unmarshal.isNullPointer(handles.PFN_glLinkProgramARB)) throw new SymbolNotFoundError("Symbol not found: glLinkProgramARB");
        try { Handles.MH_glLinkProgramARB.invokeExact(handles.PFN_glLinkProgramARB, programObj); }
        catch (Throwable e) { throw new RuntimeException("error in glLinkProgramARB", e); }
    }

    public void UseProgramObjectARB(@CType("GLhandleARB") int programObj) {
        if (Unmarshal.isNullPointer(handles.PFN_glUseProgramObjectARB)) throw new SymbolNotFoundError("Symbol not found: glUseProgramObjectARB");
        try { Handles.MH_glUseProgramObjectARB.invokeExact(handles.PFN_glUseProgramObjectARB, programObj); }
        catch (Throwable e) { throw new RuntimeException("error in glUseProgramObjectARB", e); }
    }

    public void ValidateProgramARB(@CType("GLhandleARB") int programObj) {
        if (Unmarshal.isNullPointer(handles.PFN_glValidateProgramARB)) throw new SymbolNotFoundError("Symbol not found: glValidateProgramARB");
        try { Handles.MH_glValidateProgramARB.invokeExact(handles.PFN_glValidateProgramARB, programObj); }
        catch (Throwable e) { throw new RuntimeException("error in glValidateProgramARB", e); }
    }

    public void Uniform1fARB(@CType("GLint") int location, @CType("GLfloat") float v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1fARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1fARB");
        try { Handles.MH_glUniform1fARB.invokeExact(handles.PFN_glUniform1fARB, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1fARB", e); }
    }

    public void Uniform2fARB(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2fARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2fARB");
        try { Handles.MH_glUniform2fARB.invokeExact(handles.PFN_glUniform2fARB, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2fARB", e); }
    }

    public void Uniform3fARB(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3fARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3fARB");
        try { Handles.MH_glUniform3fARB.invokeExact(handles.PFN_glUniform3fARB, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3fARB", e); }
    }

    public void Uniform4fARB(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4fARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4fARB");
        try { Handles.MH_glUniform4fARB.invokeExact(handles.PFN_glUniform4fARB, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4fARB", e); }
    }

    public void Uniform1iARB(@CType("GLint") int location, @CType("GLint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1iARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1iARB");
        try { Handles.MH_glUniform1iARB.invokeExact(handles.PFN_glUniform1iARB, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1iARB", e); }
    }

    public void Uniform2iARB(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2iARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2iARB");
        try { Handles.MH_glUniform2iARB.invokeExact(handles.PFN_glUniform2iARB, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2iARB", e); }
    }

    public void Uniform3iARB(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3iARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3iARB");
        try { Handles.MH_glUniform3iARB.invokeExact(handles.PFN_glUniform3iARB, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3iARB", e); }
    }

    public void Uniform4iARB(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4iARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4iARB");
        try { Handles.MH_glUniform4iARB.invokeExact(handles.PFN_glUniform4iARB, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4iARB", e); }
    }

    public void Uniform1fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1fvARB");
        try { Handles.MH_glUniform1fvARB.invokeExact(handles.PFN_glUniform1fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1fvARB", e); }
    }

    public void Uniform2fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2fvARB");
        try { Handles.MH_glUniform2fvARB.invokeExact(handles.PFN_glUniform2fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2fvARB", e); }
    }

    public void Uniform3fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3fvARB");
        try { Handles.MH_glUniform3fvARB.invokeExact(handles.PFN_glUniform3fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3fvARB", e); }
    }

    public void Uniform4fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4fvARB");
        try { Handles.MH_glUniform4fvARB.invokeExact(handles.PFN_glUniform4fvARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4fvARB", e); }
    }

    public void Uniform1ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1ivARB)) throw new SymbolNotFoundError("Symbol not found: glUniform1ivARB");
        try { Handles.MH_glUniform1ivARB.invokeExact(handles.PFN_glUniform1ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1ivARB", e); }
    }

    public void Uniform2ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2ivARB)) throw new SymbolNotFoundError("Symbol not found: glUniform2ivARB");
        try { Handles.MH_glUniform2ivARB.invokeExact(handles.PFN_glUniform2ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2ivARB", e); }
    }

    public void Uniform3ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3ivARB)) throw new SymbolNotFoundError("Symbol not found: glUniform3ivARB");
        try { Handles.MH_glUniform3ivARB.invokeExact(handles.PFN_glUniform3ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3ivARB", e); }
    }

    public void Uniform4ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4ivARB)) throw new SymbolNotFoundError("Symbol not found: glUniform4ivARB");
        try { Handles.MH_glUniform4ivARB.invokeExact(handles.PFN_glUniform4ivARB, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4ivARB", e); }
    }

    public void UniformMatrix2fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2fvARB");
        try { Handles.MH_glUniformMatrix2fvARB.invokeExact(handles.PFN_glUniformMatrix2fvARB, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2fvARB", e); }
    }

    public void UniformMatrix3fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3fvARB");
        try { Handles.MH_glUniformMatrix3fvARB.invokeExact(handles.PFN_glUniformMatrix3fvARB, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3fvARB", e); }
    }

    public void UniformMatrix4fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4fvARB)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4fvARB");
        try { Handles.MH_glUniformMatrix4fvARB.invokeExact(handles.PFN_glUniformMatrix4fvARB, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4fvARB", e); }
    }

    public void GetObjectParameterfvARB(@CType("GLhandleARB") int obj, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetObjectParameterfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetObjectParameterfvARB");
        try { Handles.MH_glGetObjectParameterfvARB.invokeExact(handles.PFN_glGetObjectParameterfvARB, obj, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectParameterfvARB", e); }
    }

    public void GetObjectParameterivARB(@CType("GLhandleARB") int obj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetObjectParameterivARB)) throw new SymbolNotFoundError("Symbol not found: glGetObjectParameterivARB");
        try { Handles.MH_glGetObjectParameterivARB.invokeExact(handles.PFN_glGetObjectParameterivARB, obj, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectParameterivARB", e); }
    }

    public void GetInfoLogARB(@CType("GLhandleARB") int obj, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLcharARB *") java.lang.foreign.MemorySegment infoLog) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInfoLogARB)) throw new SymbolNotFoundError("Symbol not found: glGetInfoLogARB");
        try { Handles.MH_glGetInfoLogARB.invokeExact(handles.PFN_glGetInfoLogARB, obj, maxLength, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInfoLogARB", e); }
    }

    public void GetAttachedObjectsARB(@CType("GLhandleARB") int containerObj, @CType("GLsizei") int maxCount, @CType("GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLhandleARB *") java.lang.foreign.MemorySegment obj) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetAttachedObjectsARB)) throw new SymbolNotFoundError("Symbol not found: glGetAttachedObjectsARB");
        try { Handles.MH_glGetAttachedObjectsARB.invokeExact(handles.PFN_glGetAttachedObjectsARB, containerObj, maxCount, count, obj); }
        catch (Throwable e) { throw new RuntimeException("error in glGetAttachedObjectsARB", e); }
    }

    public @CType("GLint") int GetUniformLocationARB(@CType("GLhandleARB") int programObj, @CType("const GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformLocationARB)) throw new SymbolNotFoundError("Symbol not found: glGetUniformLocationARB");
        try { return (int) Handles.MH_glGetUniformLocationARB.invokeExact(handles.PFN_glGetUniformLocationARB, programObj, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformLocationARB", e); }
    }

    public void GetActiveUniformARB(@CType("GLhandleARB") int programObj, @CType("GLuint") int index, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveUniformARB)) throw new SymbolNotFoundError("Symbol not found: glGetActiveUniformARB");
        try { Handles.MH_glGetActiveUniformARB.invokeExact(handles.PFN_glGetActiveUniformARB, programObj, index, maxLength, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformARB", e); }
    }

    public void GetUniformfvARB(@CType("GLhandleARB") int programObj, @CType("GLint") int location, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetUniformfvARB");
        try { Handles.MH_glGetUniformfvARB.invokeExact(handles.PFN_glGetUniformfvARB, programObj, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformfvARB", e); }
    }

    public void GetUniformivARB(@CType("GLhandleARB") int programObj, @CType("GLint") int location, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformivARB)) throw new SymbolNotFoundError("Symbol not found: glGetUniformivARB");
        try { Handles.MH_glGetUniformivARB.invokeExact(handles.PFN_glGetUniformivARB, programObj, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformivARB", e); }
    }

    public void GetShaderSourceARB(@CType("GLhandleARB") int obj, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLcharARB *") java.lang.foreign.MemorySegment source) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetShaderSourceARB)) throw new SymbolNotFoundError("Symbol not found: glGetShaderSourceARB");
        try { Handles.MH_glGetShaderSourceARB.invokeExact(handles.PFN_glGetShaderSourceARB, obj, maxLength, length, source); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShaderSourceARB", e); }
    }

}
