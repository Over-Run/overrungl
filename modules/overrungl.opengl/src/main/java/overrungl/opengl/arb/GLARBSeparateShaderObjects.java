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

public final class GLARBSeparateShaderObjects {
    public static final int GL_VERTEX_SHADER_BIT = 0x00000001;
    public static final int GL_FRAGMENT_SHADER_BIT = 0x00000002;
    public static final int GL_GEOMETRY_SHADER_BIT = 0x00000004;
    public static final int GL_TESS_CONTROL_SHADER_BIT = 0x00000008;
    public static final int GL_TESS_EVALUATION_SHADER_BIT = 0x00000010;
    public static final int GL_ALL_SHADER_BITS = 0xFFFFFFFF;
    public static final int GL_PROGRAM_SEPARABLE = 0x8258;
    public static final int GL_ACTIVE_PROGRAM = 0x8259;
    public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;
    public static final MethodHandle MH_glUseProgramStages = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUseProgramStages;
    public static final MethodHandle MH_glActiveShaderProgram = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glActiveShaderProgram;
    public static final MethodHandle MH_glCreateShaderProgramv = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateShaderProgramv;
    public static final MethodHandle MH_glBindProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindProgramPipeline;
    public static final MethodHandle MH_glDeleteProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteProgramPipelines;
    public static final MethodHandle MH_glGenProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenProgramPipelines;
    public static final MethodHandle MH_glIsProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsProgramPipeline;
    public static final MethodHandle MH_glGetProgramPipelineiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramPipelineiv;
    public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramParameteri;
    public static final MethodHandle MH_glProgramUniform1i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform1i;
    public static final MethodHandle MH_glProgramUniform1iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1iv;
    public static final MethodHandle MH_glProgramUniform1f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform1f;
    public static final MethodHandle MH_glProgramUniform1fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1fv;
    public static final MethodHandle MH_glProgramUniform1d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform1d;
    public static final MethodHandle MH_glProgramUniform1dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1dv;
    public static final MethodHandle MH_glProgramUniform1ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform1ui;
    public static final MethodHandle MH_glProgramUniform1uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1uiv;
    public static final MethodHandle MH_glProgramUniform2i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform2i;
    public static final MethodHandle MH_glProgramUniform2iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2iv;
    public static final MethodHandle MH_glProgramUniform2f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform2f;
    public static final MethodHandle MH_glProgramUniform2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2fv;
    public static final MethodHandle MH_glProgramUniform2d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform2d;
    public static final MethodHandle MH_glProgramUniform2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2dv;
    public static final MethodHandle MH_glProgramUniform2ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform2ui;
    public static final MethodHandle MH_glProgramUniform2uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2uiv;
    public static final MethodHandle MH_glProgramUniform3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform3i;
    public static final MethodHandle MH_glProgramUniform3iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3iv;
    public static final MethodHandle MH_glProgramUniform3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform3f;
    public static final MethodHandle MH_glProgramUniform3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3fv;
    public static final MethodHandle MH_glProgramUniform3d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform3d;
    public static final MethodHandle MH_glProgramUniform3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3dv;
    public static final MethodHandle MH_glProgramUniform3ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform3ui;
    public static final MethodHandle MH_glProgramUniform3uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3uiv;
    public static final MethodHandle MH_glProgramUniform4i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform4i;
    public static final MethodHandle MH_glProgramUniform4iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4iv;
    public static final MethodHandle MH_glProgramUniform4f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform4f;
    public static final MethodHandle MH_glProgramUniform4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4fv;
    public static final MethodHandle MH_glProgramUniform4d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform4d;
    public static final MethodHandle MH_glProgramUniform4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4dv;
    public static final MethodHandle MH_glProgramUniform4ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform4ui;
    public static final MethodHandle MH_glProgramUniform4uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4uiv;
    public static final MethodHandle MH_glProgramUniformMatrix2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2fv;
    public static final MethodHandle MH_glProgramUniformMatrix3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3fv;
    public static final MethodHandle MH_glProgramUniformMatrix4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4fv;
    public static final MethodHandle MH_glProgramUniformMatrix2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2dv;
    public static final MethodHandle MH_glProgramUniformMatrix3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3dv;
    public static final MethodHandle MH_glProgramUniformMatrix4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4dv;
    public static final MethodHandle MH_glProgramUniformMatrix2x3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x3fv;
    public static final MethodHandle MH_glProgramUniformMatrix3x2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x2fv;
    public static final MethodHandle MH_glProgramUniformMatrix2x4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x4fv;
    public static final MethodHandle MH_glProgramUniformMatrix4x2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x2fv;
    public static final MethodHandle MH_glProgramUniformMatrix3x4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x4fv;
    public static final MethodHandle MH_glProgramUniformMatrix4x3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x3fv;
    public static final MethodHandle MH_glProgramUniformMatrix2x3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x3dv;
    public static final MethodHandle MH_glProgramUniformMatrix3x2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x2dv;
    public static final MethodHandle MH_glProgramUniformMatrix2x4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x4dv;
    public static final MethodHandle MH_glProgramUniformMatrix4x2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x2dv;
    public static final MethodHandle MH_glProgramUniformMatrix3x4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x4dv;
    public static final MethodHandle MH_glProgramUniformMatrix4x3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x3dv;
    public static final MethodHandle MH_glValidateProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glValidateProgramPipeline;
    public static final MethodHandle MH_glGetProgramPipelineInfoLog = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetProgramPipelineInfoLog;

    public GLARBSeparateShaderObjects(overrungl.opengl.GLLoadFunc func) {
        PFN_glUseProgramStages = func.invoke("glUseProgramStages");
        PFN_glActiveShaderProgram = func.invoke("glActiveShaderProgram");
        PFN_glCreateShaderProgramv = func.invoke("glCreateShaderProgramv");
        PFN_glBindProgramPipeline = func.invoke("glBindProgramPipeline");
        PFN_glDeleteProgramPipelines = func.invoke("glDeleteProgramPipelines");
        PFN_glGenProgramPipelines = func.invoke("glGenProgramPipelines");
        PFN_glIsProgramPipeline = func.invoke("glIsProgramPipeline");
        PFN_glGetProgramPipelineiv = func.invoke("glGetProgramPipelineiv");
        PFN_glProgramParameteri = func.invoke("glProgramParameteri");
        PFN_glProgramUniform1i = func.invoke("glProgramUniform1i");
        PFN_glProgramUniform1iv = func.invoke("glProgramUniform1iv");
        PFN_glProgramUniform1f = func.invoke("glProgramUniform1f");
        PFN_glProgramUniform1fv = func.invoke("glProgramUniform1fv");
        PFN_glProgramUniform1d = func.invoke("glProgramUniform1d");
        PFN_glProgramUniform1dv = func.invoke("glProgramUniform1dv");
        PFN_glProgramUniform1ui = func.invoke("glProgramUniform1ui");
        PFN_glProgramUniform1uiv = func.invoke("glProgramUniform1uiv");
        PFN_glProgramUniform2i = func.invoke("glProgramUniform2i");
        PFN_glProgramUniform2iv = func.invoke("glProgramUniform2iv");
        PFN_glProgramUniform2f = func.invoke("glProgramUniform2f");
        PFN_glProgramUniform2fv = func.invoke("glProgramUniform2fv");
        PFN_glProgramUniform2d = func.invoke("glProgramUniform2d");
        PFN_glProgramUniform2dv = func.invoke("glProgramUniform2dv");
        PFN_glProgramUniform2ui = func.invoke("glProgramUniform2ui");
        PFN_glProgramUniform2uiv = func.invoke("glProgramUniform2uiv");
        PFN_glProgramUniform3i = func.invoke("glProgramUniform3i");
        PFN_glProgramUniform3iv = func.invoke("glProgramUniform3iv");
        PFN_glProgramUniform3f = func.invoke("glProgramUniform3f");
        PFN_glProgramUniform3fv = func.invoke("glProgramUniform3fv");
        PFN_glProgramUniform3d = func.invoke("glProgramUniform3d");
        PFN_glProgramUniform3dv = func.invoke("glProgramUniform3dv");
        PFN_glProgramUniform3ui = func.invoke("glProgramUniform3ui");
        PFN_glProgramUniform3uiv = func.invoke("glProgramUniform3uiv");
        PFN_glProgramUniform4i = func.invoke("glProgramUniform4i");
        PFN_glProgramUniform4iv = func.invoke("glProgramUniform4iv");
        PFN_glProgramUniform4f = func.invoke("glProgramUniform4f");
        PFN_glProgramUniform4fv = func.invoke("glProgramUniform4fv");
        PFN_glProgramUniform4d = func.invoke("glProgramUniform4d");
        PFN_glProgramUniform4dv = func.invoke("glProgramUniform4dv");
        PFN_glProgramUniform4ui = func.invoke("glProgramUniform4ui");
        PFN_glProgramUniform4uiv = func.invoke("glProgramUniform4uiv");
        PFN_glProgramUniformMatrix2fv = func.invoke("glProgramUniformMatrix2fv");
        PFN_glProgramUniformMatrix3fv = func.invoke("glProgramUniformMatrix3fv");
        PFN_glProgramUniformMatrix4fv = func.invoke("glProgramUniformMatrix4fv");
        PFN_glProgramUniformMatrix2dv = func.invoke("glProgramUniformMatrix2dv");
        PFN_glProgramUniformMatrix3dv = func.invoke("glProgramUniformMatrix3dv");
        PFN_glProgramUniformMatrix4dv = func.invoke("glProgramUniformMatrix4dv");
        PFN_glProgramUniformMatrix2x3fv = func.invoke("glProgramUniformMatrix2x3fv");
        PFN_glProgramUniformMatrix3x2fv = func.invoke("glProgramUniformMatrix3x2fv");
        PFN_glProgramUniformMatrix2x4fv = func.invoke("glProgramUniformMatrix2x4fv");
        PFN_glProgramUniformMatrix4x2fv = func.invoke("glProgramUniformMatrix4x2fv");
        PFN_glProgramUniformMatrix3x4fv = func.invoke("glProgramUniformMatrix3x4fv");
        PFN_glProgramUniformMatrix4x3fv = func.invoke("glProgramUniformMatrix4x3fv");
        PFN_glProgramUniformMatrix2x3dv = func.invoke("glProgramUniformMatrix2x3dv");
        PFN_glProgramUniformMatrix3x2dv = func.invoke("glProgramUniformMatrix3x2dv");
        PFN_glProgramUniformMatrix2x4dv = func.invoke("glProgramUniformMatrix2x4dv");
        PFN_glProgramUniformMatrix4x2dv = func.invoke("glProgramUniformMatrix4x2dv");
        PFN_glProgramUniformMatrix3x4dv = func.invoke("glProgramUniformMatrix3x4dv");
        PFN_glProgramUniformMatrix4x3dv = func.invoke("glProgramUniformMatrix4x3dv");
        PFN_glValidateProgramPipeline = func.invoke("glValidateProgramPipeline");
        PFN_glGetProgramPipelineInfoLog = func.invoke("glGetProgramPipelineInfoLog");
    }

    public void UseProgramStages(@CType("GLuint") int pipeline, @CType("GLbitfield") int stages, @CType("GLuint") int program) {
        if (!Unmarshal.isNullPointer(PFN_glUseProgramStages)) { try {
            MH_glUseProgramStages.invokeExact(PFN_glUseProgramStages, pipeline, stages, program);
        } catch (Throwable e) { throw new RuntimeException("error in glUseProgramStages", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUseProgramStages"); }
    }

    public void ActiveShaderProgram(@CType("GLuint") int pipeline, @CType("GLuint") int program) {
        if (!Unmarshal.isNullPointer(PFN_glActiveShaderProgram)) { try {
            MH_glActiveShaderProgram.invokeExact(PFN_glActiveShaderProgram, pipeline, program);
        } catch (Throwable e) { throw new RuntimeException("error in glActiveShaderProgram", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glActiveShaderProgram"); }
    }

    public @CType("GLuint") int CreateShaderProgramv(@CType("GLenum") int type, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment strings) {
        if (!Unmarshal.isNullPointer(PFN_glCreateShaderProgramv)) { try {
            return (int) MH_glCreateShaderProgramv.invokeExact(PFN_glCreateShaderProgramv, type, count, strings);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateShaderProgramv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateShaderProgramv"); }
    }

    public void BindProgramPipeline(@CType("GLuint") int pipeline) {
        if (!Unmarshal.isNullPointer(PFN_glBindProgramPipeline)) { try {
            MH_glBindProgramPipeline.invokeExact(PFN_glBindProgramPipeline, pipeline);
        } catch (Throwable e) { throw new RuntimeException("error in glBindProgramPipeline", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindProgramPipeline"); }
    }

    public void DeleteProgramPipelines(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteProgramPipelines)) { try {
            MH_glDeleteProgramPipelines.invokeExact(PFN_glDeleteProgramPipelines, n, pipelines);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramPipelines", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteProgramPipelines"); }
    }

    public void GenProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (!Unmarshal.isNullPointer(PFN_glGenProgramPipelines)) { try {
            MH_glGenProgramPipelines.invokeExact(PFN_glGenProgramPipelines, n, pipelines);
        } catch (Throwable e) { throw new RuntimeException("error in glGenProgramPipelines", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenProgramPipelines"); }
    }

    public @CType("GLboolean") boolean IsProgramPipeline(@CType("GLuint") int pipeline) {
        if (!Unmarshal.isNullPointer(PFN_glIsProgramPipeline)) { try {
            return (boolean) MH_glIsProgramPipeline.invokeExact(PFN_glIsProgramPipeline, pipeline);
        } catch (Throwable e) { throw new RuntimeException("error in glIsProgramPipeline", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsProgramPipeline"); }
    }

    public void GetProgramPipelineiv(@CType("GLuint") int pipeline, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetProgramPipelineiv)) { try {
            MH_glGetProgramPipelineiv.invokeExact(PFN_glGetProgramPipelineiv, pipeline, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineiv"); }
    }

    public void ProgramParameteri(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramParameteri)) { try {
            MH_glProgramParameteri.invokeExact(PFN_glProgramParameteri, program, pname, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramParameteri", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramParameteri"); }
    }

    public void ProgramUniform1i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1i)) { try {
            MH_glProgramUniform1i.invokeExact(PFN_glProgramUniform1i, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1i", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i"); }
    }

    public void ProgramUniform1iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1iv)) { try {
            MH_glProgramUniform1iv.invokeExact(PFN_glProgramUniform1iv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1iv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1iv"); }
    }

    public void ProgramUniform1f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1f)) { try {
            MH_glProgramUniform1f.invokeExact(PFN_glProgramUniform1f, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1f", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1f"); }
    }

    public void ProgramUniform1fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1fv)) { try {
            MH_glProgramUniform1fv.invokeExact(PFN_glProgramUniform1fv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fv"); }
    }

    public void ProgramUniform1d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1d)) { try {
            MH_glProgramUniform1d.invokeExact(PFN_glProgramUniform1d, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1d", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1d"); }
    }

    public void ProgramUniform1dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1dv)) { try {
            MH_glProgramUniform1dv.invokeExact(PFN_glProgramUniform1dv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1dv"); }
    }

    public void ProgramUniform1ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1ui)) { try {
            MH_glProgramUniform1ui.invokeExact(PFN_glProgramUniform1ui, program, location, v0);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ui", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui"); }
    }

    public void ProgramUniform1uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform1uiv)) { try {
            MH_glProgramUniform1uiv.invokeExact(PFN_glProgramUniform1uiv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uiv"); }
    }

    public void ProgramUniform2i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2i)) { try {
            MH_glProgramUniform2i.invokeExact(PFN_glProgramUniform2i, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2i", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i"); }
    }

    public void ProgramUniform2iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2iv)) { try {
            MH_glProgramUniform2iv.invokeExact(PFN_glProgramUniform2iv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2iv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2iv"); }
    }

    public void ProgramUniform2f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2f)) { try {
            MH_glProgramUniform2f.invokeExact(PFN_glProgramUniform2f, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2f", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2f"); }
    }

    public void ProgramUniform2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2fv)) { try {
            MH_glProgramUniform2fv.invokeExact(PFN_glProgramUniform2fv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fv"); }
    }

    public void ProgramUniform2d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2d)) { try {
            MH_glProgramUniform2d.invokeExact(PFN_glProgramUniform2d, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2d", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2d"); }
    }

    public void ProgramUniform2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2dv)) { try {
            MH_glProgramUniform2dv.invokeExact(PFN_glProgramUniform2dv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2dv"); }
    }

    public void ProgramUniform2ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2ui)) { try {
            MH_glProgramUniform2ui.invokeExact(PFN_glProgramUniform2ui, program, location, v0, v1);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ui", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui"); }
    }

    public void ProgramUniform2uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform2uiv)) { try {
            MH_glProgramUniform2uiv.invokeExact(PFN_glProgramUniform2uiv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uiv"); }
    }

    public void ProgramUniform3i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3i)) { try {
            MH_glProgramUniform3i.invokeExact(PFN_glProgramUniform3i, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3i", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i"); }
    }

    public void ProgramUniform3iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3iv)) { try {
            MH_glProgramUniform3iv.invokeExact(PFN_glProgramUniform3iv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3iv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3iv"); }
    }

    public void ProgramUniform3f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3f)) { try {
            MH_glProgramUniform3f.invokeExact(PFN_glProgramUniform3f, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3f", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3f"); }
    }

    public void ProgramUniform3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3fv)) { try {
            MH_glProgramUniform3fv.invokeExact(PFN_glProgramUniform3fv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fv"); }
    }

    public void ProgramUniform3d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1, @CType("GLdouble") double v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3d)) { try {
            MH_glProgramUniform3d.invokeExact(PFN_glProgramUniform3d, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3d", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3d"); }
    }

    public void ProgramUniform3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3dv)) { try {
            MH_glProgramUniform3dv.invokeExact(PFN_glProgramUniform3dv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3dv"); }
    }

    public void ProgramUniform3ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3ui)) { try {
            MH_glProgramUniform3ui.invokeExact(PFN_glProgramUniform3ui, program, location, v0, v1, v2);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ui", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui"); }
    }

    public void ProgramUniform3uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform3uiv)) { try {
            MH_glProgramUniform3uiv.invokeExact(PFN_glProgramUniform3uiv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uiv"); }
    }

    public void ProgramUniform4i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4i)) { try {
            MH_glProgramUniform4i.invokeExact(PFN_glProgramUniform4i, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4i", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i"); }
    }

    public void ProgramUniform4iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4iv)) { try {
            MH_glProgramUniform4iv.invokeExact(PFN_glProgramUniform4iv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4iv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4iv"); }
    }

    public void ProgramUniform4f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4f)) { try {
            MH_glProgramUniform4f.invokeExact(PFN_glProgramUniform4f, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4f", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4f"); }
    }

    public void ProgramUniform4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4fv)) { try {
            MH_glProgramUniform4fv.invokeExact(PFN_glProgramUniform4fv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fv"); }
    }

    public void ProgramUniform4d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1, @CType("GLdouble") double v2, @CType("GLdouble") double v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4d)) { try {
            MH_glProgramUniform4d.invokeExact(PFN_glProgramUniform4d, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4d", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4d"); }
    }

    public void ProgramUniform4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4dv)) { try {
            MH_glProgramUniform4dv.invokeExact(PFN_glProgramUniform4dv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4dv"); }
    }

    public void ProgramUniform4ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4ui)) { try {
            MH_glProgramUniform4ui.invokeExact(PFN_glProgramUniform4ui, program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ui", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui"); }
    }

    public void ProgramUniform4uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniform4uiv)) { try {
            MH_glProgramUniform4uiv.invokeExact(PFN_glProgramUniform4uiv, program, location, count, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uiv"); }
    }

    public void ProgramUniformMatrix2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2fv)) { try {
            MH_glProgramUniformMatrix2fv.invokeExact(PFN_glProgramUniformMatrix2fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fv"); }
    }

    public void ProgramUniformMatrix3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3fv)) { try {
            MH_glProgramUniformMatrix3fv.invokeExact(PFN_glProgramUniformMatrix3fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fv"); }
    }

    public void ProgramUniformMatrix4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4fv)) { try {
            MH_glProgramUniformMatrix4fv.invokeExact(PFN_glProgramUniformMatrix4fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fv"); }
    }

    public void ProgramUniformMatrix2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2dv)) { try {
            MH_glProgramUniformMatrix2dv.invokeExact(PFN_glProgramUniformMatrix2dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2dv"); }
    }

    public void ProgramUniformMatrix3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3dv)) { try {
            MH_glProgramUniformMatrix3dv.invokeExact(PFN_glProgramUniformMatrix3dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3dv"); }
    }

    public void ProgramUniformMatrix4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4dv)) { try {
            MH_glProgramUniformMatrix4dv.invokeExact(PFN_glProgramUniformMatrix4dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4dv"); }
    }

    public void ProgramUniformMatrix2x3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3fv)) { try {
            MH_glProgramUniformMatrix2x3fv.invokeExact(PFN_glProgramUniformMatrix2x3fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fv"); }
    }

    public void ProgramUniformMatrix3x2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2fv)) { try {
            MH_glProgramUniformMatrix3x2fv.invokeExact(PFN_glProgramUniformMatrix3x2fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fv"); }
    }

    public void ProgramUniformMatrix2x4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4fv)) { try {
            MH_glProgramUniformMatrix2x4fv.invokeExact(PFN_glProgramUniformMatrix2x4fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fv"); }
    }

    public void ProgramUniformMatrix4x2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2fv)) { try {
            MH_glProgramUniformMatrix4x2fv.invokeExact(PFN_glProgramUniformMatrix4x2fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fv"); }
    }

    public void ProgramUniformMatrix3x4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4fv)) { try {
            MH_glProgramUniformMatrix3x4fv.invokeExact(PFN_glProgramUniformMatrix3x4fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fv"); }
    }

    public void ProgramUniformMatrix4x3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3fv)) { try {
            MH_glProgramUniformMatrix4x3fv.invokeExact(PFN_glProgramUniformMatrix4x3fv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3fv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fv"); }
    }

    public void ProgramUniformMatrix2x3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3dv)) { try {
            MH_glProgramUniformMatrix2x3dv.invokeExact(PFN_glProgramUniformMatrix2x3dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3dv"); }
    }

    public void ProgramUniformMatrix3x2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2dv)) { try {
            MH_glProgramUniformMatrix3x2dv.invokeExact(PFN_glProgramUniformMatrix3x2dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2dv"); }
    }

    public void ProgramUniformMatrix2x4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4dv)) { try {
            MH_glProgramUniformMatrix2x4dv.invokeExact(PFN_glProgramUniformMatrix2x4dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4dv"); }
    }

    public void ProgramUniformMatrix4x2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2dv)) { try {
            MH_glProgramUniformMatrix4x2dv.invokeExact(PFN_glProgramUniformMatrix4x2dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2dv"); }
    }

    public void ProgramUniformMatrix3x4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4dv)) { try {
            MH_glProgramUniformMatrix3x4dv.invokeExact(PFN_glProgramUniformMatrix3x4dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4dv"); }
    }

    public void ProgramUniformMatrix4x3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3dv)) { try {
            MH_glProgramUniformMatrix4x3dv.invokeExact(PFN_glProgramUniformMatrix4x3dv, program, location, count, transpose, value);
        } catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3dv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3dv"); }
    }

    public void ValidateProgramPipeline(@CType("GLuint") int pipeline) {
        if (!Unmarshal.isNullPointer(PFN_glValidateProgramPipeline)) { try {
            MH_glValidateProgramPipeline.invokeExact(PFN_glValidateProgramPipeline, pipeline);
        } catch (Throwable e) { throw new RuntimeException("error in glValidateProgramPipeline", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glValidateProgramPipeline"); }
    }

    public void GetProgramPipelineInfoLog(@CType("GLuint") int pipeline, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment infoLog) {
        if (!Unmarshal.isNullPointer(PFN_glGetProgramPipelineInfoLog)) { try {
            MH_glGetProgramPipelineInfoLog.invokeExact(PFN_glGetProgramPipelineInfoLog, pipeline, bufSize, length, infoLog);
        } catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineInfoLog", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineInfoLog"); }
    }

}
