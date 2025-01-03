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
        try { if (!Unmarshal.isNullPointer(PFN_glUseProgramStages))
            MH_glUseProgramStages.invokeExact(PFN_glUseProgramStages, pipeline, stages, program);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUseProgramStages", e); }
    }

    public void ActiveShaderProgram(@CType("GLuint") int pipeline, @CType("GLuint") int program) {
        try { if (!Unmarshal.isNullPointer(PFN_glActiveShaderProgram))
            MH_glActiveShaderProgram.invokeExact(PFN_glActiveShaderProgram, pipeline, program);
        }
        catch (Throwable e) { throw new RuntimeException("error in glActiveShaderProgram", e); }
    }

    public @CType("GLuint") int CreateShaderProgramv(@CType("GLenum") int type, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment strings) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateShaderProgramv))
            return (int) MH_glCreateShaderProgramv.invokeExact(PFN_glCreateShaderProgramv, type, count, strings);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateShaderProgramv", e); }
    }

    public void BindProgramPipeline(@CType("GLuint") int pipeline) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindProgramPipeline))
            MH_glBindProgramPipeline.invokeExact(PFN_glBindProgramPipeline, pipeline);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindProgramPipeline", e); }
    }

    public void DeleteProgramPipelines(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment pipelines) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteProgramPipelines))
            MH_glDeleteProgramPipelines.invokeExact(PFN_glDeleteProgramPipelines, n, pipelines);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramPipelines", e); }
    }

    public void GenProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenProgramPipelines))
            MH_glGenProgramPipelines.invokeExact(PFN_glGenProgramPipelines, n, pipelines);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenProgramPipelines", e); }
    }

    public @CType("GLboolean") boolean IsProgramPipeline(@CType("GLuint") int pipeline) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsProgramPipeline))
            return (boolean) MH_glIsProgramPipeline.invokeExact(PFN_glIsProgramPipeline, pipeline);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsProgramPipeline", e); }
    }

    public void GetProgramPipelineiv(@CType("GLuint") int pipeline, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramPipelineiv))
            MH_glGetProgramPipelineiv.invokeExact(PFN_glGetProgramPipelineiv, pipeline, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineiv", e); }
    }

    public void ProgramParameteri(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramParameteri))
            MH_glProgramParameteri.invokeExact(PFN_glProgramParameteri, program, pname, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameteri", e); }
    }

    public void ProgramUniform1i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1i))
            MH_glProgramUniform1i.invokeExact(PFN_glProgramUniform1i, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1i", e); }
    }

    public void ProgramUniform1iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1iv))
            MH_glProgramUniform1iv.invokeExact(PFN_glProgramUniform1iv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1iv", e); }
    }

    public void ProgramUniform1f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1f))
            MH_glProgramUniform1f.invokeExact(PFN_glProgramUniform1f, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1f", e); }
    }

    public void ProgramUniform1fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1fv))
            MH_glProgramUniform1fv.invokeExact(PFN_glProgramUniform1fv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fv", e); }
    }

    public void ProgramUniform1d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1d))
            MH_glProgramUniform1d.invokeExact(PFN_glProgramUniform1d, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1d", e); }
    }

    public void ProgramUniform1dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1dv))
            MH_glProgramUniform1dv.invokeExact(PFN_glProgramUniform1dv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dv", e); }
    }

    public void ProgramUniform1ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1ui))
            MH_glProgramUniform1ui.invokeExact(PFN_glProgramUniform1ui, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ui", e); }
    }

    public void ProgramUniform1uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1uiv))
            MH_glProgramUniform1uiv.invokeExact(PFN_glProgramUniform1uiv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uiv", e); }
    }

    public void ProgramUniform2i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2i))
            MH_glProgramUniform2i.invokeExact(PFN_glProgramUniform2i, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2i", e); }
    }

    public void ProgramUniform2iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2iv))
            MH_glProgramUniform2iv.invokeExact(PFN_glProgramUniform2iv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2iv", e); }
    }

    public void ProgramUniform2f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2f))
            MH_glProgramUniform2f.invokeExact(PFN_glProgramUniform2f, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2f", e); }
    }

    public void ProgramUniform2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2fv))
            MH_glProgramUniform2fv.invokeExact(PFN_glProgramUniform2fv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fv", e); }
    }

    public void ProgramUniform2d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2d))
            MH_glProgramUniform2d.invokeExact(PFN_glProgramUniform2d, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2d", e); }
    }

    public void ProgramUniform2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2dv))
            MH_glProgramUniform2dv.invokeExact(PFN_glProgramUniform2dv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dv", e); }
    }

    public void ProgramUniform2ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2ui))
            MH_glProgramUniform2ui.invokeExact(PFN_glProgramUniform2ui, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ui", e); }
    }

    public void ProgramUniform2uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2uiv))
            MH_glProgramUniform2uiv.invokeExact(PFN_glProgramUniform2uiv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uiv", e); }
    }

    public void ProgramUniform3i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3i))
            MH_glProgramUniform3i.invokeExact(PFN_glProgramUniform3i, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3i", e); }
    }

    public void ProgramUniform3iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3iv))
            MH_glProgramUniform3iv.invokeExact(PFN_glProgramUniform3iv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3iv", e); }
    }

    public void ProgramUniform3f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3f))
            MH_glProgramUniform3f.invokeExact(PFN_glProgramUniform3f, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3f", e); }
    }

    public void ProgramUniform3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3fv))
            MH_glProgramUniform3fv.invokeExact(PFN_glProgramUniform3fv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fv", e); }
    }

    public void ProgramUniform3d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1, @CType("GLdouble") double v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3d))
            MH_glProgramUniform3d.invokeExact(PFN_glProgramUniform3d, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3d", e); }
    }

    public void ProgramUniform3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3dv))
            MH_glProgramUniform3dv.invokeExact(PFN_glProgramUniform3dv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dv", e); }
    }

    public void ProgramUniform3ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3ui))
            MH_glProgramUniform3ui.invokeExact(PFN_glProgramUniform3ui, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ui", e); }
    }

    public void ProgramUniform3uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3uiv))
            MH_glProgramUniform3uiv.invokeExact(PFN_glProgramUniform3uiv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uiv", e); }
    }

    public void ProgramUniform4i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4i))
            MH_glProgramUniform4i.invokeExact(PFN_glProgramUniform4i, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4i", e); }
    }

    public void ProgramUniform4iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4iv))
            MH_glProgramUniform4iv.invokeExact(PFN_glProgramUniform4iv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4iv", e); }
    }

    public void ProgramUniform4f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4f))
            MH_glProgramUniform4f.invokeExact(PFN_glProgramUniform4f, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4f", e); }
    }

    public void ProgramUniform4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4fv))
            MH_glProgramUniform4fv.invokeExact(PFN_glProgramUniform4fv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fv", e); }
    }

    public void ProgramUniform4d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1, @CType("GLdouble") double v2, @CType("GLdouble") double v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4d))
            MH_glProgramUniform4d.invokeExact(PFN_glProgramUniform4d, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4d", e); }
    }

    public void ProgramUniform4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4dv))
            MH_glProgramUniform4dv.invokeExact(PFN_glProgramUniform4dv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dv", e); }
    }

    public void ProgramUniform4ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4ui))
            MH_glProgramUniform4ui.invokeExact(PFN_glProgramUniform4ui, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ui", e); }
    }

    public void ProgramUniform4uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4uiv))
            MH_glProgramUniform4uiv.invokeExact(PFN_glProgramUniform4uiv, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uiv", e); }
    }

    public void ProgramUniformMatrix2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2fv))
            MH_glProgramUniformMatrix2fv.invokeExact(PFN_glProgramUniformMatrix2fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2fv", e); }
    }

    public void ProgramUniformMatrix3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3fv))
            MH_glProgramUniformMatrix3fv.invokeExact(PFN_glProgramUniformMatrix3fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3fv", e); }
    }

    public void ProgramUniformMatrix4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4fv))
            MH_glProgramUniformMatrix4fv.invokeExact(PFN_glProgramUniformMatrix4fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4fv", e); }
    }

    public void ProgramUniformMatrix2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2dv))
            MH_glProgramUniformMatrix2dv.invokeExact(PFN_glProgramUniformMatrix2dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2dv", e); }
    }

    public void ProgramUniformMatrix3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3dv))
            MH_glProgramUniformMatrix3dv.invokeExact(PFN_glProgramUniformMatrix3dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3dv", e); }
    }

    public void ProgramUniformMatrix4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4dv))
            MH_glProgramUniformMatrix4dv.invokeExact(PFN_glProgramUniformMatrix4dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4dv", e); }
    }

    public void ProgramUniformMatrix2x3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3fv))
            MH_glProgramUniformMatrix2x3fv.invokeExact(PFN_glProgramUniformMatrix2x3fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3fv", e); }
    }

    public void ProgramUniformMatrix3x2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2fv))
            MH_glProgramUniformMatrix3x2fv.invokeExact(PFN_glProgramUniformMatrix3x2fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2fv", e); }
    }

    public void ProgramUniformMatrix2x4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4fv))
            MH_glProgramUniformMatrix2x4fv.invokeExact(PFN_glProgramUniformMatrix2x4fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4fv", e); }
    }

    public void ProgramUniformMatrix4x2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2fv))
            MH_glProgramUniformMatrix4x2fv.invokeExact(PFN_glProgramUniformMatrix4x2fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2fv", e); }
    }

    public void ProgramUniformMatrix3x4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4fv))
            MH_glProgramUniformMatrix3x4fv.invokeExact(PFN_glProgramUniformMatrix3x4fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4fv", e); }
    }

    public void ProgramUniformMatrix4x3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3fv))
            MH_glProgramUniformMatrix4x3fv.invokeExact(PFN_glProgramUniformMatrix4x3fv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3fv", e); }
    }

    public void ProgramUniformMatrix2x3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3dv))
            MH_glProgramUniformMatrix2x3dv.invokeExact(PFN_glProgramUniformMatrix2x3dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3dv", e); }
    }

    public void ProgramUniformMatrix3x2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2dv))
            MH_glProgramUniformMatrix3x2dv.invokeExact(PFN_glProgramUniformMatrix3x2dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2dv", e); }
    }

    public void ProgramUniformMatrix2x4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4dv))
            MH_glProgramUniformMatrix2x4dv.invokeExact(PFN_glProgramUniformMatrix2x4dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4dv", e); }
    }

    public void ProgramUniformMatrix4x2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2dv))
            MH_glProgramUniformMatrix4x2dv.invokeExact(PFN_glProgramUniformMatrix4x2dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2dv", e); }
    }

    public void ProgramUniformMatrix3x4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4dv))
            MH_glProgramUniformMatrix3x4dv.invokeExact(PFN_glProgramUniformMatrix3x4dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4dv", e); }
    }

    public void ProgramUniformMatrix4x3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3dv))
            MH_glProgramUniformMatrix4x3dv.invokeExact(PFN_glProgramUniformMatrix4x3dv, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3dv", e); }
    }

    public void ValidateProgramPipeline(@CType("GLuint") int pipeline) {
        try { if (!Unmarshal.isNullPointer(PFN_glValidateProgramPipeline))
            MH_glValidateProgramPipeline.invokeExact(PFN_glValidateProgramPipeline, pipeline);
        }
        catch (Throwable e) { throw new RuntimeException("error in glValidateProgramPipeline", e); }
    }

    public void GetProgramPipelineInfoLog(@CType("GLuint") int pipeline, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment infoLog) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetProgramPipelineInfoLog))
            MH_glGetProgramPipelineInfoLog.invokeExact(PFN_glGetProgramPipelineInfoLog, pipeline, bufSize, length, infoLog);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineInfoLog", e); }
    }

}
