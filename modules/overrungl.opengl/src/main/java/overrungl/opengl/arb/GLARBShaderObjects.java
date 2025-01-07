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
    public static final MethodHandle MH_glDeleteObjectARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDeleteObjectARB;
    public static final MethodHandle MH_glGetHandleARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetHandleARB;
    public static final MethodHandle MH_glDetachObjectARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDetachObjectARB;
    public static final MethodHandle MH_glCreateShaderObjectARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCreateShaderObjectARB;
    public static final MethodHandle MH_glShaderSourceARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glShaderSourceARB;
    public static final MethodHandle MH_glCompileShaderARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCompileShaderARB;
    public static final MethodHandle MH_glCreateProgramObjectARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCreateProgramObjectARB;
    public static final MethodHandle MH_glAttachObjectARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glAttachObjectARB;
    public static final MethodHandle MH_glLinkProgramARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glLinkProgramARB;
    public static final MethodHandle MH_glUseProgramObjectARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUseProgramObjectARB;
    public static final MethodHandle MH_glValidateProgramARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glValidateProgramARB;
    public static final MethodHandle MH_glUniform1fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glUniform1fARB;
    public static final MethodHandle MH_glUniform2fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glUniform2fARB;
    public static final MethodHandle MH_glUniform3fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glUniform3fARB;
    public static final MethodHandle MH_glUniform4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glUniform4fARB;
    public static final MethodHandle MH_glUniform1iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform1iARB;
    public static final MethodHandle MH_glUniform2iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform2iARB;
    public static final MethodHandle MH_glUniform3iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform3iARB;
    public static final MethodHandle MH_glUniform4iARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform4iARB;
    public static final MethodHandle MH_glUniform1fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1fvARB;
    public static final MethodHandle MH_glUniform2fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2fvARB;
    public static final MethodHandle MH_glUniform3fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3fvARB;
    public static final MethodHandle MH_glUniform4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4fvARB;
    public static final MethodHandle MH_glUniform1ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1ivARB;
    public static final MethodHandle MH_glUniform2ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2ivARB;
    public static final MethodHandle MH_glUniform3ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3ivARB;
    public static final MethodHandle MH_glUniform4ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4ivARB;
    public static final MethodHandle MH_glUniformMatrix2fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix2fvARB;
    public static final MethodHandle MH_glUniformMatrix3fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix3fvARB;
    public static final MethodHandle MH_glUniformMatrix4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix4fvARB;
    public static final MethodHandle MH_glGetObjectParameterfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetObjectParameterfvARB;
    public static final MethodHandle MH_glGetObjectParameterivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetObjectParameterivARB;
    public static final MethodHandle MH_glGetInfoLogARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInfoLogARB;
    public static final MethodHandle MH_glGetAttachedObjectsARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetAttachedObjectsARB;
    public static final MethodHandle MH_glGetUniformLocationARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformLocationARB;
    public static final MethodHandle MH_glGetActiveUniformARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveUniformARB;
    public static final MethodHandle MH_glGetUniformfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformfvARB;
    public static final MethodHandle MH_glGetUniformivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformivARB;
    public static final MethodHandle MH_glGetShaderSourceARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetShaderSourceARB;

    public GLARBShaderObjects(overrungl.opengl.GLLoadFunc func) {
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

    public void DeleteObjectARB(@CType("GLhandleARB") int obj) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteObjectARB)) { try {
            MH_glDeleteObjectARB.invokeExact(PFN_glDeleteObjectARB, obj);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteObjectARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteObjectARB"); }
    }

    public @CType("GLhandleARB") int GetHandleARB(@CType("GLenum") int pname) {
        if (!Unmarshal.isNullPointer(PFN_glGetHandleARB)) { try {
            return (int) MH_glGetHandleARB.invokeExact(PFN_glGetHandleARB, pname);
        } catch (Throwable e) { throw new RuntimeException("error in glGetHandleARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetHandleARB"); }
    }

    public void DetachObjectARB(@CType("GLhandleARB") int containerObj, @CType("GLhandleARB") int attachedObj) {
        if (!Unmarshal.isNullPointer(PFN_glDetachObjectARB)) { try {
            MH_glDetachObjectARB.invokeExact(PFN_glDetachObjectARB, containerObj, attachedObj);
        } catch (Throwable e) { throw new RuntimeException("error in glDetachObjectARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDetachObjectARB"); }
    }

    public @CType("GLhandleARB") int CreateShaderObjectARB(@CType("GLenum") int shaderType) {
        if (!Unmarshal.isNullPointer(PFN_glCreateShaderObjectARB)) { try {
            return (int) MH_glCreateShaderObjectARB.invokeExact(PFN_glCreateShaderObjectARB, shaderType);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateShaderObjectARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateShaderObjectARB"); }
    }

    public void ShaderSourceARB(@CType("GLhandleARB") int shaderObj, @CType("GLsizei") int count, @CType("const GLcharARB **") java.lang.foreign.MemorySegment string, @CType("const GLint *") java.lang.foreign.MemorySegment length) {
        if (!Unmarshal.isNullPointer(PFN_glShaderSourceARB)) { try {
            MH_glShaderSourceARB.invokeExact(PFN_glShaderSourceARB, shaderObj, count, string, length);
        } catch (Throwable e) { throw new RuntimeException("error in glShaderSourceARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glShaderSourceARB"); }
    }

    public void CompileShaderARB(@CType("GLhandleARB") int shaderObj) {
        if (!Unmarshal.isNullPointer(PFN_glCompileShaderARB)) { try {
            MH_glCompileShaderARB.invokeExact(PFN_glCompileShaderARB, shaderObj);
        } catch (Throwable e) { throw new RuntimeException("error in glCompileShaderARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCompileShaderARB"); }
    }

    public @CType("GLhandleARB") int CreateProgramObjectARB() {
        if (!Unmarshal.isNullPointer(PFN_glCreateProgramObjectARB)) { try {
            return (int) MH_glCreateProgramObjectARB.invokeExact(PFN_glCreateProgramObjectARB);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateProgramObjectARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateProgramObjectARB"); }
    }

    public void AttachObjectARB(@CType("GLhandleARB") int containerObj, @CType("GLhandleARB") int obj) {
        if (!Unmarshal.isNullPointer(PFN_glAttachObjectARB)) { try {
            MH_glAttachObjectARB.invokeExact(PFN_glAttachObjectARB, containerObj, obj);
        } catch (Throwable e) { throw new RuntimeException("error in glAttachObjectARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glAttachObjectARB"); }
    }

    public void LinkProgramARB(@CType("GLhandleARB") int programObj) {
        if (!Unmarshal.isNullPointer(PFN_glLinkProgramARB)) { try {
            MH_glLinkProgramARB.invokeExact(PFN_glLinkProgramARB, programObj);
        } catch (Throwable e) { throw new RuntimeException("error in glLinkProgramARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glLinkProgramARB"); }
    }

    public void UseProgramObjectARB(@CType("GLhandleARB") int programObj) {
        if (!Unmarshal.isNullPointer(PFN_glUseProgramObjectARB)) { try {
            MH_glUseProgramObjectARB.invokeExact(PFN_glUseProgramObjectARB, programObj);
        } catch (Throwable e) { throw new RuntimeException("error in glUseProgramObjectARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUseProgramObjectARB"); }
    }

    public void ValidateProgramARB(@CType("GLhandleARB") int programObj) {
        if (!Unmarshal.isNullPointer(PFN_glValidateProgramARB)) { try {
            MH_glValidateProgramARB.invokeExact(PFN_glValidateProgramARB, programObj);
        } catch (Throwable e) { throw new RuntimeException("error in glValidateProgramARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glValidateProgramARB"); }
    }

    public void Uniform1fARB(@CType("GLint") int location, @CType("GLfloat") float v0) {
        if (!Unmarshal.isNullPointer(PFN_glUniform1fARB)) { try {
            MH_glUniform1fARB.invokeExact(PFN_glUniform1fARB, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform1fARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform1fARB"); }
    }

    public void Uniform2fARB(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (!Unmarshal.isNullPointer(PFN_glUniform2fARB)) { try {
            MH_glUniform2fARB.invokeExact(PFN_glUniform2fARB, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform2fARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform2fARB"); }
    }

    public void Uniform3fARB(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (!Unmarshal.isNullPointer(PFN_glUniform3fARB)) { try {
            MH_glUniform3fARB.invokeExact(PFN_glUniform3fARB, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform3fARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform3fARB"); }
    }

    public void Uniform4fARB(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (!Unmarshal.isNullPointer(PFN_glUniform4fARB)) { try {
            MH_glUniform4fARB.invokeExact(PFN_glUniform4fARB, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform4fARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform4fARB"); }
    }

    public void Uniform1iARB(@CType("GLint") int location, @CType("GLint") int v0) {
        if (!Unmarshal.isNullPointer(PFN_glUniform1iARB)) { try {
            MH_glUniform1iARB.invokeExact(PFN_glUniform1iARB, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform1iARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform1iARB"); }
    }

    public void Uniform2iARB(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (!Unmarshal.isNullPointer(PFN_glUniform2iARB)) { try {
            MH_glUniform2iARB.invokeExact(PFN_glUniform2iARB, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform2iARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform2iARB"); }
    }

    public void Uniform3iARB(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glUniform3iARB)) { try {
            MH_glUniform3iARB.invokeExact(PFN_glUniform3iARB, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform3iARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform3iARB"); }
    }

    public void Uniform4iARB(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (!Unmarshal.isNullPointer(PFN_glUniform4iARB)) { try {
            MH_glUniform4iARB.invokeExact(PFN_glUniform4iARB, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform4iARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform4iARB"); }
    }

    public void Uniform1fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform1fvARB)) { try {
            MH_glUniform1fvARB.invokeExact(PFN_glUniform1fvARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform1fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform1fvARB"); }
    }

    public void Uniform2fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform2fvARB)) { try {
            MH_glUniform2fvARB.invokeExact(PFN_glUniform2fvARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform2fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform2fvARB"); }
    }

    public void Uniform3fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform3fvARB)) { try {
            MH_glUniform3fvARB.invokeExact(PFN_glUniform3fvARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform3fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform3fvARB"); }
    }

    public void Uniform4fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform4fvARB)) { try {
            MH_glUniform4fvARB.invokeExact(PFN_glUniform4fvARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform4fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform4fvARB"); }
    }

    public void Uniform1ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform1ivARB)) { try {
            MH_glUniform1ivARB.invokeExact(PFN_glUniform1ivARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform1ivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform1ivARB"); }
    }

    public void Uniform2ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform2ivARB)) { try {
            MH_glUniform2ivARB.invokeExact(PFN_glUniform2ivARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform2ivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform2ivARB"); }
    }

    public void Uniform3ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform3ivARB)) { try {
            MH_glUniform3ivARB.invokeExact(PFN_glUniform3ivARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform3ivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform3ivARB"); }
    }

    public void Uniform4ivARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniform4ivARB)) { try {
            MH_glUniform4ivARB.invokeExact(PFN_glUniform4ivARB, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniform4ivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniform4ivARB"); }
    }

    public void UniformMatrix2fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformMatrix2fvARB)) { try {
            MH_glUniformMatrix2fvARB.invokeExact(PFN_glUniformMatrix2fvARB, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2fvARB"); }
    }

    public void UniformMatrix3fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformMatrix3fvARB)) { try {
            MH_glUniformMatrix3fvARB.invokeExact(PFN_glUniformMatrix3fvARB, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3fvARB"); }
    }

    public void UniformMatrix4fvARB(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glUniformMatrix4fvARB)) { try {
            MH_glUniformMatrix4fvARB.invokeExact(PFN_glUniformMatrix4fvARB, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4fvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4fvARB"); }
    }

    public void GetObjectParameterfvARB(@CType("GLhandleARB") int obj, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetObjectParameterfvARB)) { try {
            MH_glGetObjectParameterfvARB.invokeExact(PFN_glGetObjectParameterfvARB, obj, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetObjectParameterfvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetObjectParameterfvARB"); }
    }

    public void GetObjectParameterivARB(@CType("GLhandleARB") int obj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetObjectParameterivARB)) { try {
            MH_glGetObjectParameterivARB.invokeExact(PFN_glGetObjectParameterivARB, obj, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetObjectParameterivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetObjectParameterivARB"); }
    }

    public void GetInfoLogARB(@CType("GLhandleARB") int obj, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLcharARB *") java.lang.foreign.MemorySegment infoLog) {
        if (!Unmarshal.isNullPointer(PFN_glGetInfoLogARB)) { try {
            MH_glGetInfoLogARB.invokeExact(PFN_glGetInfoLogARB, obj, maxLength, length, infoLog);
        } catch (Throwable e) { throw new RuntimeException("error in glGetInfoLogARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetInfoLogARB"); }
    }

    public void GetAttachedObjectsARB(@CType("GLhandleARB") int containerObj, @CType("GLsizei") int maxCount, @CType("GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLhandleARB *") java.lang.foreign.MemorySegment obj) {
        if (!Unmarshal.isNullPointer(PFN_glGetAttachedObjectsARB)) { try {
            MH_glGetAttachedObjectsARB.invokeExact(PFN_glGetAttachedObjectsARB, containerObj, maxCount, count, obj);
        } catch (Throwable e) { throw new RuntimeException("error in glGetAttachedObjectsARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetAttachedObjectsARB"); }
    }

    public @CType("GLint") int GetUniformLocationARB(@CType("GLhandleARB") int programObj, @CType("const GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformLocationARB)) { try {
            return (int) MH_glGetUniformLocationARB.invokeExact(PFN_glGetUniformLocationARB, programObj, name);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformLocationARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformLocationARB"); }
    }

    public void GetActiveUniformARB(@CType("GLhandleARB") int programObj, @CType("GLuint") int index, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glGetActiveUniformARB)) { try {
            MH_glGetActiveUniformARB.invokeExact(PFN_glGetActiveUniformARB, programObj, index, maxLength, length, size, type, name);
        } catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniformARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetActiveUniformARB"); }
    }

    public void GetUniformfvARB(@CType("GLhandleARB") int programObj, @CType("GLint") int location, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformfvARB)) { try {
            MH_glGetUniformfvARB.invokeExact(PFN_glGetUniformfvARB, programObj, location, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformfvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformfvARB"); }
    }

    public void GetUniformivARB(@CType("GLhandleARB") int programObj, @CType("GLint") int location, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetUniformivARB)) { try {
            MH_glGetUniformivARB.invokeExact(PFN_glGetUniformivARB, programObj, location, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetUniformivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetUniformivARB"); }
    }

    public void GetShaderSourceARB(@CType("GLhandleARB") int obj, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLcharARB *") java.lang.foreign.MemorySegment source) {
        if (!Unmarshal.isNullPointer(PFN_glGetShaderSourceARB)) { try {
            MH_glGetShaderSourceARB.invokeExact(PFN_glGetShaderSourceARB, obj, maxLength, length, source);
        } catch (Throwable e) { throw new RuntimeException("error in glGetShaderSourceARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetShaderSourceARB"); }
    }

}
