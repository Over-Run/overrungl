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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTSeparateShaderObjects {
    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8B8D;
    public static final MethodHandle MH_glUseShaderProgramEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUseShaderProgramEXT;
    public static final MethodHandle MH_glActiveProgramEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glActiveProgramEXT;
    public static final MethodHandle MH_glCreateShaderProgramEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateShaderProgramEXT;
    public static final int GL_VERTEX_SHADER_BIT_EXT = 0x00000001;
    public static final int GL_FRAGMENT_SHADER_BIT_EXT = 0x00000002;
    public static final int GL_ALL_SHADER_BITS_EXT = 0xFFFFFFFF;
    public static final int GL_PROGRAM_SEPARABLE_EXT = 0x8258;
    public static final int GL_PROGRAM_PIPELINE_BINDING_EXT = 0x825A;
    public static final MethodHandle MH_glActiveShaderProgramEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glActiveShaderProgramEXT;
    public static final MethodHandle MH_glBindProgramPipelineEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindProgramPipelineEXT;
    public static final MethodHandle MH_glCreateShaderProgramvEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateShaderProgramvEXT;
    public static final MethodHandle MH_glDeleteProgramPipelinesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteProgramPipelinesEXT;
    public static final MethodHandle MH_glGenProgramPipelinesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenProgramPipelinesEXT;
    public static final MethodHandle MH_glGetProgramPipelineInfoLogEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramPipelineInfoLogEXT;
    public static final MethodHandle MH_glGetProgramPipelineivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramPipelineivEXT;
    public static final MethodHandle MH_glIsProgramPipelineEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsProgramPipelineEXT;
    public static final MethodHandle MH_glProgramParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramParameteriEXT;
    public static final MethodHandle MH_glProgramUniform1fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform1fEXT;
    public static final MethodHandle MH_glProgramUniform1fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1fvEXT;
    public static final MethodHandle MH_glProgramUniform1iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform1iEXT;
    public static final MethodHandle MH_glProgramUniform1ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1ivEXT;
    public static final MethodHandle MH_glProgramUniform2fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform2fEXT;
    public static final MethodHandle MH_glProgramUniform2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2fvEXT;
    public static final MethodHandle MH_glProgramUniform2iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform2iEXT;
    public static final MethodHandle MH_glProgramUniform2ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2ivEXT;
    public static final MethodHandle MH_glProgramUniform3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform3fEXT;
    public static final MethodHandle MH_glProgramUniform3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3fvEXT;
    public static final MethodHandle MH_glProgramUniform3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform3iEXT;
    public static final MethodHandle MH_glProgramUniform3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3ivEXT;
    public static final MethodHandle MH_glProgramUniform4fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform4fEXT;
    public static final MethodHandle MH_glProgramUniform4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4fvEXT;
    public static final MethodHandle MH_glProgramUniform4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform4iEXT;
    public static final MethodHandle MH_glProgramUniform4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4ivEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4fvEXT;
    public static final MethodHandle MH_glUseProgramStagesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUseProgramStagesEXT;
    public static final MethodHandle MH_glValidateProgramPipelineEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glValidateProgramPipelineEXT;
    public static final MethodHandle MH_glProgramUniform1uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform1uiEXT;
    public static final MethodHandle MH_glProgramUniform2uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform2uiEXT;
    public static final MethodHandle MH_glProgramUniform3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform3uiEXT;
    public static final MethodHandle MH_glProgramUniform4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform4uiEXT;
    public static final MethodHandle MH_glProgramUniform1uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1uivEXT;
    public static final MethodHandle MH_glProgramUniform2uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2uivEXT;
    public static final MethodHandle MH_glProgramUniform3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3uivEXT;
    public static final MethodHandle MH_glProgramUniform4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4uivEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2x3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x3fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3x2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x2fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2x4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x4fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4x2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x2fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3x4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x4fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4x3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x3fvEXT;

    public GLEXTSeparateShaderObjects(overrungl.opengl.GLLoadFunc func) {
        PFN_glUseShaderProgramEXT = func.invoke("glUseShaderProgramEXT");
        PFN_glActiveProgramEXT = func.invoke("glActiveProgramEXT");
        PFN_glCreateShaderProgramEXT = func.invoke("glCreateShaderProgramEXT");PFN_glActiveShaderProgramEXT = func.invoke("glActiveShaderProgramEXT");
        PFN_glBindProgramPipelineEXT = func.invoke("glBindProgramPipelineEXT");
        PFN_glCreateShaderProgramvEXT = func.invoke("glCreateShaderProgramvEXT");
        PFN_glDeleteProgramPipelinesEXT = func.invoke("glDeleteProgramPipelinesEXT");
        PFN_glGenProgramPipelinesEXT = func.invoke("glGenProgramPipelinesEXT");
        PFN_glGetProgramPipelineInfoLogEXT = func.invoke("glGetProgramPipelineInfoLogEXT");
        PFN_glGetProgramPipelineivEXT = func.invoke("glGetProgramPipelineivEXT");
        PFN_glIsProgramPipelineEXT = func.invoke("glIsProgramPipelineEXT");
        PFN_glProgramParameteriEXT = func.invoke("glProgramParameteriEXT", "glProgramParameteri");
        PFN_glProgramUniform1fEXT = func.invoke("glProgramUniform1fEXT", "glProgramUniform1f");
        PFN_glProgramUniform1fvEXT = func.invoke("glProgramUniform1fvEXT", "glProgramUniform1fv");
        PFN_glProgramUniform1iEXT = func.invoke("glProgramUniform1iEXT", "glProgramUniform1i");
        PFN_glProgramUniform1ivEXT = func.invoke("glProgramUniform1ivEXT", "glProgramUniform1iv");
        PFN_glProgramUniform2fEXT = func.invoke("glProgramUniform2fEXT", "glProgramUniform2f");
        PFN_glProgramUniform2fvEXT = func.invoke("glProgramUniform2fvEXT", "glProgramUniform2fv");
        PFN_glProgramUniform2iEXT = func.invoke("glProgramUniform2iEXT", "glProgramUniform2i");
        PFN_glProgramUniform2ivEXT = func.invoke("glProgramUniform2ivEXT", "glProgramUniform2iv");
        PFN_glProgramUniform3fEXT = func.invoke("glProgramUniform3fEXT", "glProgramUniform3f");
        PFN_glProgramUniform3fvEXT = func.invoke("glProgramUniform3fvEXT", "glProgramUniform3fv");
        PFN_glProgramUniform3iEXT = func.invoke("glProgramUniform3iEXT", "glProgramUniform3i");
        PFN_glProgramUniform3ivEXT = func.invoke("glProgramUniform3ivEXT", "glProgramUniform3iv");
        PFN_glProgramUniform4fEXT = func.invoke("glProgramUniform4fEXT", "glProgramUniform4f");
        PFN_glProgramUniform4fvEXT = func.invoke("glProgramUniform4fvEXT", "glProgramUniform4fv");
        PFN_glProgramUniform4iEXT = func.invoke("glProgramUniform4iEXT", "glProgramUniform4i");
        PFN_glProgramUniform4ivEXT = func.invoke("glProgramUniform4ivEXT", "glProgramUniform4iv");
        PFN_glProgramUniformMatrix2fvEXT = func.invoke("glProgramUniformMatrix2fvEXT", "glProgramUniformMatrix2fv");
        PFN_glProgramUniformMatrix3fvEXT = func.invoke("glProgramUniformMatrix3fvEXT", "glProgramUniformMatrix3fv");
        PFN_glProgramUniformMatrix4fvEXT = func.invoke("glProgramUniformMatrix4fvEXT", "glProgramUniformMatrix4fv");
        PFN_glUseProgramStagesEXT = func.invoke("glUseProgramStagesEXT");
        PFN_glValidateProgramPipelineEXT = func.invoke("glValidateProgramPipelineEXT");PFN_glProgramUniform1uiEXT = func.invoke("glProgramUniform1uiEXT", "glProgramUniform1ui");
        PFN_glProgramUniform2uiEXT = func.invoke("glProgramUniform2uiEXT", "glProgramUniform2ui");
        PFN_glProgramUniform3uiEXT = func.invoke("glProgramUniform3uiEXT", "glProgramUniform3ui");
        PFN_glProgramUniform4uiEXT = func.invoke("glProgramUniform4uiEXT", "glProgramUniform4ui");
        PFN_glProgramUniform1uivEXT = func.invoke("glProgramUniform1uivEXT", "glProgramUniform1uiv");
        PFN_glProgramUniform2uivEXT = func.invoke("glProgramUniform2uivEXT", "glProgramUniform2uiv");
        PFN_glProgramUniform3uivEXT = func.invoke("glProgramUniform3uivEXT", "glProgramUniform3uiv");
        PFN_glProgramUniform4uivEXT = func.invoke("glProgramUniform4uivEXT", "glProgramUniform4uiv");
        PFN_glProgramUniformMatrix2x3fvEXT = func.invoke("glProgramUniformMatrix2x3fvEXT", "glProgramUniformMatrix2x3fv");
        PFN_glProgramUniformMatrix3x2fvEXT = func.invoke("glProgramUniformMatrix3x2fvEXT", "glProgramUniformMatrix3x2fv");
        PFN_glProgramUniformMatrix2x4fvEXT = func.invoke("glProgramUniformMatrix2x4fvEXT", "glProgramUniformMatrix2x4fv");
        PFN_glProgramUniformMatrix4x2fvEXT = func.invoke("glProgramUniformMatrix4x2fvEXT", "glProgramUniformMatrix4x2fv");
        PFN_glProgramUniformMatrix3x4fvEXT = func.invoke("glProgramUniformMatrix3x4fvEXT", "glProgramUniformMatrix3x4fv");
        PFN_glProgramUniformMatrix4x3fvEXT = func.invoke("glProgramUniformMatrix4x3fvEXT", "glProgramUniformMatrix4x3fv");
    }

    public void UseShaderProgramEXT(@CType("GLenum") int type, @CType("GLuint") int program) {
        if (!Unmarshal.isNullPointer(PFN_glUseShaderProgramEXT)) { try {
            MH_glUseShaderProgramEXT.invokeExact(PFN_glUseShaderProgramEXT, type, program);
        } catch (Throwable e) { throw new RuntimeException("error in glUseShaderProgramEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUseShaderProgramEXT"); }
    }

    public void ActiveProgramEXT(@CType("GLuint") int program) {
        if (!Unmarshal.isNullPointer(PFN_glActiveProgramEXT)) { try {
            MH_glActiveProgramEXT.invokeExact(PFN_glActiveProgramEXT, program);
        } catch (Throwable e) { throw new RuntimeException("error in glActiveProgramEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glActiveProgramEXT"); }
    }

    public @CType("GLuint") int CreateShaderProgramEXT(@CType("GLenum") int type, @CType("const GLchar *") java.lang.foreign.MemorySegment string) {
        if (!Unmarshal.isNullPointer(PFN_glCreateShaderProgramEXT)) { try {
            return (int) MH_glCreateShaderProgramEXT.invokeExact(PFN_glCreateShaderProgramEXT, type, string);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateShaderProgramEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateShaderProgramEXT"); }
    }

    public void ActiveShaderProgramEXT(@CType("GLuint") int pipeline, @CType("GLuint") int program) {
        if (!Unmarshal.isNullPointer(PFN_glActiveShaderProgramEXT)) { try {
            MH_glActiveShaderProgramEXT.invokeExact(PFN_glActiveShaderProgramEXT, pipeline, program);
        } catch (Throwable e) { throw new RuntimeException("error in glActiveShaderProgramEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glActiveShaderProgramEXT"); }
    }

    public void BindProgramPipelineEXT(@CType("GLuint") int pipeline) {
        if (!Unmarshal.isNullPointer(PFN_glBindProgramPipelineEXT)) { try {
            MH_glBindProgramPipelineEXT.invokeExact(PFN_glBindProgramPipelineEXT, pipeline);
        } catch (Throwable e) { throw new RuntimeException("error in glBindProgramPipelineEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindProgramPipelineEXT"); }
    }

    public @CType("GLuint") int CreateShaderProgramvEXT(@CType("GLenum") int type, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment strings) {
        if (!Unmarshal.isNullPointer(PFN_glCreateShaderProgramvEXT)) { try {
            return (int) MH_glCreateShaderProgramvEXT.invokeExact(PFN_glCreateShaderProgramvEXT, type, count, strings);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateShaderProgramvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateShaderProgramvEXT"); }
    }

    public void DeleteProgramPipelinesEXT(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteProgramPipelinesEXT)) { try {
            MH_glDeleteProgramPipelinesEXT.invokeExact(PFN_glDeleteProgramPipelinesEXT, n, pipelines);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramPipelinesEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteProgramPipelinesEXT"); }
    }

    public void GenProgramPipelinesEXT(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (!Unmarshal.isNullPointer(PFN_glGenProgramPipelinesEXT)) { try {
            MH_glGenProgramPipelinesEXT.invokeExact(PFN_glGenProgramPipelinesEXT, n, pipelines);
        } catch (Throwable e) { throw new RuntimeException("error in glGenProgramPipelinesEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenProgramPipelinesEXT"); }
    }

    public void GetProgramPipelineInfoLogEXT(@CType("GLuint") int pipeline, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment infoLog) {
        if (!Unmarshal.isNullPointer(PFN_glGetProgramPipelineInfoLogEXT)) { try {
            MH_glGetProgramPipelineInfoLogEXT.invokeExact(PFN_glGetProgramPipelineInfoLogEXT, pipeline, bufSize, length, infoLog);
        } catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineInfoLogEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineInfoLogEXT"); }
    }

    public void GetProgramPipelineivEXT(@CType("GLuint") int pipeline, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetProgramPipelineivEXT)) { try {
            MH_glGetProgramPipelineivEXT.invokeExact(PFN_glGetProgramPipelineivEXT, pipeline, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineivEXT"); }
    }

    public @CType("GLboolean") boolean IsProgramPipelineEXT(@CType("GLuint") int pipeline) {
        if (!Unmarshal.isNullPointer(PFN_glIsProgramPipelineEXT)) { try {
            return (boolean) MH_glIsProgramPipelineEXT.invokeExact(PFN_glIsProgramPipelineEXT, pipeline);
        } catch (Throwable e) { throw new RuntimeException("error in glIsProgramPipelineEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsProgramPipelineEXT"); }
    }

    public void ProgramParameteriEXT(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramParameteriEXT)) { try {
            MH_glProgramParameteriEXT.invokeExact(PFN_glProgramParameteriEXT, program, pname, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramParameteriEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramParameteriEXT"); }
    }

    public void ProgramUniform1fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1fEXT)) { try {
            MH_glProgramUniform1fEXT.invokeExact(PFN_glProgramUniform1fEXT, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fEXT"); }
    }

    public void ProgramUniform1fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1fvEXT)) { try {
            MH_glProgramUniform1fvEXT.invokeExact(PFN_glProgramUniform1fvEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fvEXT"); }
    }

    public void ProgramUniform1iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1iEXT)) { try {
            MH_glProgramUniform1iEXT.invokeExact(PFN_glProgramUniform1iEXT, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1iEXT"); }
    }

    public void ProgramUniform1ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1ivEXT)) { try {
            MH_glProgramUniform1ivEXT.invokeExact(PFN_glProgramUniform1ivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ivEXT"); }
    }

    public void ProgramUniform2fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2fEXT)) { try {
            MH_glProgramUniform2fEXT.invokeExact(PFN_glProgramUniform2fEXT, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fEXT"); }
    }

    public void ProgramUniform2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2fvEXT)) { try {
            MH_glProgramUniform2fvEXT.invokeExact(PFN_glProgramUniform2fvEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fvEXT"); }
    }

    public void ProgramUniform2iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2iEXT)) { try {
            MH_glProgramUniform2iEXT.invokeExact(PFN_glProgramUniform2iEXT, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2iEXT"); }
    }

    public void ProgramUniform2ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2ivEXT)) { try {
            MH_glProgramUniform2ivEXT.invokeExact(PFN_glProgramUniform2ivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ivEXT"); }
    }

    public void ProgramUniform3fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3fEXT)) { try {
            MH_glProgramUniform3fEXT.invokeExact(PFN_glProgramUniform3fEXT, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fEXT"); }
    }

    public void ProgramUniform3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3fvEXT)) { try {
            MH_glProgramUniform3fvEXT.invokeExact(PFN_glProgramUniform3fvEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fvEXT"); }
    }

    public void ProgramUniform3iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3iEXT)) { try {
            MH_glProgramUniform3iEXT.invokeExact(PFN_glProgramUniform3iEXT, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3iEXT"); }
    }

    public void ProgramUniform3ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3ivEXT)) { try {
            MH_glProgramUniform3ivEXT.invokeExact(PFN_glProgramUniform3ivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ivEXT"); }
    }

    public void ProgramUniform4fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4fEXT)) { try {
            MH_glProgramUniform4fEXT.invokeExact(PFN_glProgramUniform4fEXT, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fEXT"); }
    }

    public void ProgramUniform4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4fvEXT)) { try {
            MH_glProgramUniform4fvEXT.invokeExact(PFN_glProgramUniform4fvEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fvEXT"); }
    }

    public void ProgramUniform4iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4iEXT)) { try {
            MH_glProgramUniform4iEXT.invokeExact(PFN_glProgramUniform4iEXT, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4iEXT"); }
    }

    public void ProgramUniform4ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4ivEXT)) { try {
            MH_glProgramUniform4ivEXT.invokeExact(PFN_glProgramUniform4ivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ivEXT"); }
    }

    public void ProgramUniformMatrix2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2fvEXT)) { try {
            MH_glProgramUniformMatrix2fvEXT.invokeExact(PFN_glProgramUniformMatrix2fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fvEXT"); }
    }

    public void ProgramUniformMatrix3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3fvEXT)) { try {
            MH_glProgramUniformMatrix3fvEXT.invokeExact(PFN_glProgramUniformMatrix3fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fvEXT"); }
    }

    public void ProgramUniformMatrix4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4fvEXT)) { try {
            MH_glProgramUniformMatrix4fvEXT.invokeExact(PFN_glProgramUniformMatrix4fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fvEXT"); }
    }

    public void UseProgramStagesEXT(@CType("GLuint") int pipeline, @CType("GLbitfield") int stages, @CType("GLuint") int program) {
        if (!Unmarshal.isNullPointer(PFN_glUseProgramStagesEXT)) { try {
            MH_glUseProgramStagesEXT.invokeExact(PFN_glUseProgramStagesEXT, pipeline, stages, program);
        } catch (Throwable e) { throw new RuntimeException("error in glUseProgramStagesEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUseProgramStagesEXT"); }
    }

    public void ValidateProgramPipelineEXT(@CType("GLuint") int pipeline) {
        if (!Unmarshal.isNullPointer(PFN_glValidateProgramPipelineEXT)) { try {
            MH_glValidateProgramPipelineEXT.invokeExact(PFN_glValidateProgramPipelineEXT, pipeline);
        } catch (Throwable e) { throw new RuntimeException("error in glValidateProgramPipelineEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glValidateProgramPipelineEXT"); }
    }

    public void ProgramUniform1uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1uiEXT)) { try {
            MH_glProgramUniform1uiEXT.invokeExact(PFN_glProgramUniform1uiEXT, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uiEXT"); }
    }

    public void ProgramUniform2uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2uiEXT)) { try {
            MH_glProgramUniform2uiEXT.invokeExact(PFN_glProgramUniform2uiEXT, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uiEXT"); }
    }

    public void ProgramUniform3uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3uiEXT)) { try {
            MH_glProgramUniform3uiEXT.invokeExact(PFN_glProgramUniform3uiEXT, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uiEXT"); }
    }

    public void ProgramUniform4uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4uiEXT)) { try {
            MH_glProgramUniform4uiEXT.invokeExact(PFN_glProgramUniform4uiEXT, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uiEXT"); }
    }

    public void ProgramUniform1uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1uivEXT)) { try {
            MH_glProgramUniform1uivEXT.invokeExact(PFN_glProgramUniform1uivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uivEXT"); }
    }

    public void ProgramUniform2uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2uivEXT)) { try {
            MH_glProgramUniform2uivEXT.invokeExact(PFN_glProgramUniform2uivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uivEXT"); }
    }

    public void ProgramUniform3uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3uivEXT)) { try {
            MH_glProgramUniform3uivEXT.invokeExact(PFN_glProgramUniform3uivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uivEXT"); }
    }

    public void ProgramUniform4uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4uivEXT)) { try {
            MH_glProgramUniform4uivEXT.invokeExact(PFN_glProgramUniform4uivEXT, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uivEXT"); }
    }

    public void ProgramUniformMatrix2x3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3fvEXT)) { try {
            MH_glProgramUniformMatrix2x3fvEXT.invokeExact(PFN_glProgramUniformMatrix2x3fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fvEXT"); }
    }

    public void ProgramUniformMatrix3x2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2fvEXT)) { try {
            MH_glProgramUniformMatrix3x2fvEXT.invokeExact(PFN_glProgramUniformMatrix3x2fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fvEXT"); }
    }

    public void ProgramUniformMatrix2x4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4fvEXT)) { try {
            MH_glProgramUniformMatrix2x4fvEXT.invokeExact(PFN_glProgramUniformMatrix2x4fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fvEXT"); }
    }

    public void ProgramUniformMatrix4x2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2fvEXT)) { try {
            MH_glProgramUniformMatrix4x2fvEXT.invokeExact(PFN_glProgramUniformMatrix4x2fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fvEXT"); }
    }

    public void ProgramUniformMatrix3x4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4fvEXT)) { try {
            MH_glProgramUniformMatrix3x4fvEXT.invokeExact(PFN_glProgramUniformMatrix3x4fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fvEXT"); }
    }

    public void ProgramUniformMatrix4x3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3fvEXT)) { try {
            MH_glProgramUniformMatrix4x3fvEXT.invokeExact(PFN_glProgramUniformMatrix4x3fvEXT, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fvEXT"); }
    }

}
