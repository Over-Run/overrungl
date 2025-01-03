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

public final class GLARBShaderSubroutine {
    public static final int GL_ACTIVE_SUBROUTINES = 0x8DE5;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
    public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
    public static final int GL_MAX_SUBROUTINES = 0x8DE7;
    public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
    public static final int GL_UNIFORM_SIZE = 0x8A38;
    public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
    public static final MethodHandle MH_glGetSubroutineUniformLocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSubroutineUniformLocation;
    public static final MethodHandle MH_glGetSubroutineIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSubroutineIndex;
    public static final MethodHandle MH_glGetActiveSubroutineUniformiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveSubroutineUniformiv;
    public static final MethodHandle MH_glGetActiveSubroutineUniformName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveSubroutineUniformName;
    public static final MethodHandle MH_glGetActiveSubroutineName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetActiveSubroutineName;
    public static final MethodHandle MH_glUniformSubroutinesuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformSubroutinesuiv;
    public static final MethodHandle MH_glGetUniformSubroutineuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformSubroutineuiv;
    public static final MethodHandle MH_glGetProgramStageiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramStageiv;

    public GLARBShaderSubroutine(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetSubroutineUniformLocation = func.invoke("glGetSubroutineUniformLocation");
        PFN_glGetSubroutineIndex = func.invoke("glGetSubroutineIndex");
        PFN_glGetActiveSubroutineUniformiv = func.invoke("glGetActiveSubroutineUniformiv");
        PFN_glGetActiveSubroutineUniformName = func.invoke("glGetActiveSubroutineUniformName");
        PFN_glGetActiveSubroutineName = func.invoke("glGetActiveSubroutineName");
        PFN_glUniformSubroutinesuiv = func.invoke("glUniformSubroutinesuiv");
        PFN_glGetUniformSubroutineuiv = func.invoke("glGetUniformSubroutineuiv");
        PFN_glGetProgramStageiv = func.invoke("glGetProgramStageiv");
    }

    public @CType("GLint") int GetSubroutineUniformLocation(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSubroutineUniformLocation))
            return (int) MH_glGetSubroutineUniformLocation.invokeExact(PFN_glGetSubroutineUniformLocation, program, shadertype, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSubroutineUniformLocation", e); }
    }

    public @CType("GLuint") int GetSubroutineIndex(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSubroutineIndex))
            return (int) MH_glGetSubroutineIndex.invokeExact(PFN_glGetSubroutineIndex, program, shadertype, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSubroutineIndex", e); }
    }

    public void GetActiveSubroutineUniformiv(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveSubroutineUniformiv))
            MH_glGetActiveSubroutineUniformiv.invokeExact(PFN_glGetActiveSubroutineUniformiv, program, shadertype, index, pname, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveSubroutineUniformiv", e); }
    }

    public void GetActiveSubroutineUniformName(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveSubroutineUniformName))
            MH_glGetActiveSubroutineUniformName.invokeExact(PFN_glGetActiveSubroutineUniformName, program, shadertype, index, bufSize, length, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveSubroutineUniformName", e); }
    }

    public void GetActiveSubroutineName(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetActiveSubroutineName))
            MH_glGetActiveSubroutineName.invokeExact(PFN_glGetActiveSubroutineName, program, shadertype, index, bufSize, length, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveSubroutineName", e); }
    }

    public void UniformSubroutinesuiv(@CType("GLenum") int shadertype, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment indices) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformSubroutinesuiv))
            MH_glUniformSubroutinesuiv.invokeExact(PFN_glUniformSubroutinesuiv, shadertype, count, indices);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformSubroutinesuiv", e); }
    }

    public void GetUniformSubroutineuiv(@CType("GLenum") int shadertype, @CType("GLint") int location, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformSubroutineuiv))
            MH_glGetUniformSubroutineuiv.invokeExact(PFN_glGetUniformSubroutineuiv, shadertype, location, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformSubroutineuiv", e); }
    }

    public void GetProgramStageiv(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramStageiv))
            MH_glGetProgramStageiv.invokeExact(PFN_glGetProgramStageiv, program, shadertype, pname, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramStageiv", e); }
    }

}
