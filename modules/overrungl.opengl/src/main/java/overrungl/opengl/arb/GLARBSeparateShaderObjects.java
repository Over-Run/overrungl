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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glUseProgramStages = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glActiveShaderProgram = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShaderProgramv = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetProgramPipelineiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform1fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform1dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform2iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform2uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform3iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform3uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform4iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4f = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform4uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x2fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x4fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x3fv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glValidateProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetProgramPipelineInfoLog = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glUseProgramStages;
        public final MemorySegment PFN_glActiveShaderProgram;
        public final MemorySegment PFN_glCreateShaderProgramv;
        public final MemorySegment PFN_glBindProgramPipeline;
        public final MemorySegment PFN_glDeleteProgramPipelines;
        public final MemorySegment PFN_glGenProgramPipelines;
        public final MemorySegment PFN_glIsProgramPipeline;
        public final MemorySegment PFN_glGetProgramPipelineiv;
        public final MemorySegment PFN_glProgramParameteri;
        public final MemorySegment PFN_glProgramUniform1i;
        public final MemorySegment PFN_glProgramUniform1iv;
        public final MemorySegment PFN_glProgramUniform1f;
        public final MemorySegment PFN_glProgramUniform1fv;
        public final MemorySegment PFN_glProgramUniform1d;
        public final MemorySegment PFN_glProgramUniform1dv;
        public final MemorySegment PFN_glProgramUniform1ui;
        public final MemorySegment PFN_glProgramUniform1uiv;
        public final MemorySegment PFN_glProgramUniform2i;
        public final MemorySegment PFN_glProgramUniform2iv;
        public final MemorySegment PFN_glProgramUniform2f;
        public final MemorySegment PFN_glProgramUniform2fv;
        public final MemorySegment PFN_glProgramUniform2d;
        public final MemorySegment PFN_glProgramUniform2dv;
        public final MemorySegment PFN_glProgramUniform2ui;
        public final MemorySegment PFN_glProgramUniform2uiv;
        public final MemorySegment PFN_glProgramUniform3i;
        public final MemorySegment PFN_glProgramUniform3iv;
        public final MemorySegment PFN_glProgramUniform3f;
        public final MemorySegment PFN_glProgramUniform3fv;
        public final MemorySegment PFN_glProgramUniform3d;
        public final MemorySegment PFN_glProgramUniform3dv;
        public final MemorySegment PFN_glProgramUniform3ui;
        public final MemorySegment PFN_glProgramUniform3uiv;
        public final MemorySegment PFN_glProgramUniform4i;
        public final MemorySegment PFN_glProgramUniform4iv;
        public final MemorySegment PFN_glProgramUniform4f;
        public final MemorySegment PFN_glProgramUniform4fv;
        public final MemorySegment PFN_glProgramUniform4d;
        public final MemorySegment PFN_glProgramUniform4dv;
        public final MemorySegment PFN_glProgramUniform4ui;
        public final MemorySegment PFN_glProgramUniform4uiv;
        public final MemorySegment PFN_glProgramUniformMatrix2fv;
        public final MemorySegment PFN_glProgramUniformMatrix3fv;
        public final MemorySegment PFN_glProgramUniformMatrix4fv;
        public final MemorySegment PFN_glProgramUniformMatrix2dv;
        public final MemorySegment PFN_glProgramUniformMatrix3dv;
        public final MemorySegment PFN_glProgramUniformMatrix4dv;
        public final MemorySegment PFN_glProgramUniformMatrix2x3fv;
        public final MemorySegment PFN_glProgramUniformMatrix3x2fv;
        public final MemorySegment PFN_glProgramUniformMatrix2x4fv;
        public final MemorySegment PFN_glProgramUniformMatrix4x2fv;
        public final MemorySegment PFN_glProgramUniformMatrix3x4fv;
        public final MemorySegment PFN_glProgramUniformMatrix4x3fv;
        public final MemorySegment PFN_glProgramUniformMatrix2x3dv;
        public final MemorySegment PFN_glProgramUniformMatrix3x2dv;
        public final MemorySegment PFN_glProgramUniformMatrix2x4dv;
        public final MemorySegment PFN_glProgramUniformMatrix4x2dv;
        public final MemorySegment PFN_glProgramUniformMatrix3x4dv;
        public final MemorySegment PFN_glProgramUniformMatrix4x3dv;
        public final MemorySegment PFN_glValidateProgramPipeline;
        public final MemorySegment PFN_glGetProgramPipelineInfoLog;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLARBSeparateShaderObjects(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glUseProgramStages((unsigned int) GLuint pipeline, (unsigned int) GLbitfield stages, (unsigned int) GLuint program);
    /// ```
    public void UseProgramStages(int pipeline, int stages, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseProgramStages)) throw new SymbolNotFoundError("Symbol not found: glUseProgramStages");
        try { Handles.MH_glUseProgramStages.invokeExact(handles.PFN_glUseProgramStages, pipeline, stages, program); }
        catch (Throwable e) { throw new RuntimeException("error in UseProgramStages", e); }
    }

    /// ```
    /// void glActiveShaderProgram((unsigned int) GLuint pipeline, (unsigned int) GLuint program);
    /// ```
    public void ActiveShaderProgram(int pipeline, int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveShaderProgram)) throw new SymbolNotFoundError("Symbol not found: glActiveShaderProgram");
        try { Handles.MH_glActiveShaderProgram.invokeExact(handles.PFN_glActiveShaderProgram, pipeline, program); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveShaderProgram", e); }
    }

    /// ```
    /// (unsigned int) GLuint glCreateShaderProgramv((unsigned int) GLenum type, (int) GLsizei count, const GLchar* const * strings);
    /// ```
    public int CreateShaderProgramv(int type, int count, MemorySegment strings) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShaderProgramv)) throw new SymbolNotFoundError("Symbol not found: glCreateShaderProgramv");
        try { return (int) Handles.MH_glCreateShaderProgramv.invokeExact(handles.PFN_glCreateShaderProgramv, type, count, strings); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShaderProgramv", e); }
    }

    /// ```
    /// void glBindProgramPipeline((unsigned int) GLuint pipeline);
    /// ```
    public void BindProgramPipeline(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindProgramPipeline)) throw new SymbolNotFoundError("Symbol not found: glBindProgramPipeline");
        try { Handles.MH_glBindProgramPipeline.invokeExact(handles.PFN_glBindProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in BindProgramPipeline", e); }
    }

    /// ```
    /// void glDeleteProgramPipelines((int) GLsizei n, const GLuint* pipelines);
    /// ```
    public void DeleteProgramPipelines(int n, MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glDeleteProgramPipelines");
        try { Handles.MH_glDeleteProgramPipelines.invokeExact(handles.PFN_glDeleteProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgramPipelines", e); }
    }

    /// ```
    /// void glGenProgramPipelines((int) GLsizei n, GLuint* pipelines);
    /// ```
    public void GenProgramPipelines(int n, MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glGenProgramPipelines");
        try { Handles.MH_glGenProgramPipelines.invokeExact(handles.PFN_glGenProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in GenProgramPipelines", e); }
    }

    /// ```
    /// GLboolean glIsProgramPipeline((unsigned int) GLuint pipeline);
    /// ```
    public boolean IsProgramPipeline(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgramPipeline)) throw new SymbolNotFoundError("Symbol not found: glIsProgramPipeline");
        try { return (((byte) Handles.MH_glIsProgramPipeline.invokeExact(handles.PFN_glIsProgramPipeline, pipeline)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgramPipeline", e); }
    }

    /// ```
    /// void glGetProgramPipelineiv((unsigned int) GLuint pipeline, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramPipelineiv(int pipeline, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramPipelineiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineiv");
        try { Handles.MH_glGetProgramPipelineiv.invokeExact(handles.PFN_glGetProgramPipelineiv, pipeline, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramPipelineiv", e); }
    }

    /// ```
    /// void glProgramParameteri((unsigned int) GLuint program, (unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void ProgramParameteri(int program, int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramParameteri)) throw new SymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { Handles.MH_glProgramParameteri.invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramParameteri", e); }
    }

    /// ```
    /// void glProgramUniform1i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0);
    /// ```
    public void ProgramUniform1i(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i");
        try { Handles.MH_glProgramUniform1i.invokeExact(handles.PFN_glProgramUniform1i, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1i", e); }
    }

    /// ```
    /// void glProgramUniform1iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform1iv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1iv");
        try { Handles.MH_glProgramUniform1iv.invokeExact(handles.PFN_glProgramUniform1iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1iv", e); }
    }

    /// ```
    /// void glProgramUniform1f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0);
    /// ```
    public void ProgramUniform1f(int program, int location, float v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1f");
        try { Handles.MH_glProgramUniform1f.invokeExact(handles.PFN_glProgramUniform1f, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1f", e); }
    }

    /// ```
    /// void glProgramUniform1fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform1fv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fv");
        try { Handles.MH_glProgramUniform1fv.invokeExact(handles.PFN_glProgramUniform1fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1fv", e); }
    }

    /// ```
    /// void glProgramUniform1d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0);
    /// ```
    public void ProgramUniform1d(int program, int location, double v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1d");
        try { Handles.MH_glProgramUniform1d.invokeExact(handles.PFN_glProgramUniform1d, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1d", e); }
    }

    /// ```
    /// void glProgramUniform1dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform1dv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1dv");
        try { Handles.MH_glProgramUniform1dv.invokeExact(handles.PFN_glProgramUniform1dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1dv", e); }
    }

    /// ```
    /// void glProgramUniform1ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0);
    /// ```
    public void ProgramUniform1ui(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui");
        try { Handles.MH_glProgramUniform1ui.invokeExact(handles.PFN_glProgramUniform1ui, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ui", e); }
    }

    /// ```
    /// void glProgramUniform1uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform1uiv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uiv");
        try { Handles.MH_glProgramUniform1uiv.invokeExact(handles.PFN_glProgramUniform1uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1uiv", e); }
    }

    /// ```
    /// void glProgramUniform2i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1);
    /// ```
    public void ProgramUniform2i(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i");
        try { Handles.MH_glProgramUniform2i.invokeExact(handles.PFN_glProgramUniform2i, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2i", e); }
    }

    /// ```
    /// void glProgramUniform2iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform2iv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2iv");
        try { Handles.MH_glProgramUniform2iv.invokeExact(handles.PFN_glProgramUniform2iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2iv", e); }
    }

    /// ```
    /// void glProgramUniform2f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1);
    /// ```
    public void ProgramUniform2f(int program, int location, float v0, float v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2f");
        try { Handles.MH_glProgramUniform2f.invokeExact(handles.PFN_glProgramUniform2f, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2f", e); }
    }

    /// ```
    /// void glProgramUniform2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform2fv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fv");
        try { Handles.MH_glProgramUniform2fv.invokeExact(handles.PFN_glProgramUniform2fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2fv", e); }
    }

    /// ```
    /// void glProgramUniform2d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0, (double) GLdouble v1);
    /// ```
    public void ProgramUniform2d(int program, int location, double v0, double v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2d");
        try { Handles.MH_glProgramUniform2d.invokeExact(handles.PFN_glProgramUniform2d, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2d", e); }
    }

    /// ```
    /// void glProgramUniform2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform2dv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2dv");
        try { Handles.MH_glProgramUniform2dv.invokeExact(handles.PFN_glProgramUniform2dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2dv", e); }
    }

    /// ```
    /// void glProgramUniform2ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1);
    /// ```
    public void ProgramUniform2ui(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui");
        try { Handles.MH_glProgramUniform2ui.invokeExact(handles.PFN_glProgramUniform2ui, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ui", e); }
    }

    /// ```
    /// void glProgramUniform2uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform2uiv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uiv");
        try { Handles.MH_glProgramUniform2uiv.invokeExact(handles.PFN_glProgramUniform2uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2uiv", e); }
    }

    /// ```
    /// void glProgramUniform3i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2);
    /// ```
    public void ProgramUniform3i(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i");
        try { Handles.MH_glProgramUniform3i.invokeExact(handles.PFN_glProgramUniform3i, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3i", e); }
    }

    /// ```
    /// void glProgramUniform3iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform3iv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3iv");
        try { Handles.MH_glProgramUniform3iv.invokeExact(handles.PFN_glProgramUniform3iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3iv", e); }
    }

    /// ```
    /// void glProgramUniform3f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2);
    /// ```
    public void ProgramUniform3f(int program, int location, float v0, float v1, float v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3f");
        try { Handles.MH_glProgramUniform3f.invokeExact(handles.PFN_glProgramUniform3f, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3f", e); }
    }

    /// ```
    /// void glProgramUniform3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform3fv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fv");
        try { Handles.MH_glProgramUniform3fv.invokeExact(handles.PFN_glProgramUniform3fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3fv", e); }
    }

    /// ```
    /// void glProgramUniform3d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0, (double) GLdouble v1, (double) GLdouble v2);
    /// ```
    public void ProgramUniform3d(int program, int location, double v0, double v1, double v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3d");
        try { Handles.MH_glProgramUniform3d.invokeExact(handles.PFN_glProgramUniform3d, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3d", e); }
    }

    /// ```
    /// void glProgramUniform3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform3dv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3dv");
        try { Handles.MH_glProgramUniform3dv.invokeExact(handles.PFN_glProgramUniform3dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3dv", e); }
    }

    /// ```
    /// void glProgramUniform3ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2);
    /// ```
    public void ProgramUniform3ui(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui");
        try { Handles.MH_glProgramUniform3ui.invokeExact(handles.PFN_glProgramUniform3ui, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ui", e); }
    }

    /// ```
    /// void glProgramUniform3uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform3uiv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uiv");
        try { Handles.MH_glProgramUniform3uiv.invokeExact(handles.PFN_glProgramUniform3uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3uiv", e); }
    }

    /// ```
    /// void glProgramUniform4i((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2, (int) GLint v3);
    /// ```
    public void ProgramUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i");
        try { Handles.MH_glProgramUniform4i.invokeExact(handles.PFN_glProgramUniform4i, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4i", e); }
    }

    /// ```
    /// void glProgramUniform4iv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform4iv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4iv");
        try { Handles.MH_glProgramUniform4iv.invokeExact(handles.PFN_glProgramUniform4iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4iv", e); }
    }

    /// ```
    /// void glProgramUniform4f((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, ((float) khronos_float_t) GLfloat v3);
    /// ```
    public void ProgramUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4f");
        try { Handles.MH_glProgramUniform4f.invokeExact(handles.PFN_glProgramUniform4f, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4f", e); }
    }

    /// ```
    /// void glProgramUniform4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform4fv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fv");
        try { Handles.MH_glProgramUniform4fv.invokeExact(handles.PFN_glProgramUniform4fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4fv", e); }
    }

    /// ```
    /// void glProgramUniform4d((unsigned int) GLuint program, (int) GLint location, (double) GLdouble v0, (double) GLdouble v1, (double) GLdouble v2, (double) GLdouble v3);
    /// ```
    public void ProgramUniform4d(int program, int location, double v0, double v1, double v2, double v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4d");
        try { Handles.MH_glProgramUniform4d.invokeExact(handles.PFN_glProgramUniform4d, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4d", e); }
    }

    /// ```
    /// void glProgramUniform4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform4dv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4dv");
        try { Handles.MH_glProgramUniform4dv.invokeExact(handles.PFN_glProgramUniform4dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4dv", e); }
    }

    /// ```
    /// void glProgramUniform4ui((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2, (unsigned int) GLuint v3);
    /// ```
    public void ProgramUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui");
        try { Handles.MH_glProgramUniform4ui.invokeExact(handles.PFN_glProgramUniform4ui, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ui", e); }
    }

    /// ```
    /// void glProgramUniform4uiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform4uiv(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uiv");
        try { Handles.MH_glProgramUniform4uiv.invokeExact(handles.PFN_glProgramUniform4uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4uiv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fv");
        try { Handles.MH_glProgramUniformMatrix2fv.invokeExact(handles.PFN_glProgramUniformMatrix2fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fv");
        try { Handles.MH_glProgramUniformMatrix3fv.invokeExact(handles.PFN_glProgramUniformMatrix3fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fv");
        try { Handles.MH_glProgramUniformMatrix4fv.invokeExact(handles.PFN_glProgramUniformMatrix4fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2dv");
        try { Handles.MH_glProgramUniformMatrix2dv.invokeExact(handles.PFN_glProgramUniformMatrix2dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3dv");
        try { Handles.MH_glProgramUniformMatrix3dv.invokeExact(handles.PFN_glProgramUniformMatrix3dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4dv");
        try { Handles.MH_glProgramUniformMatrix4dv.invokeExact(handles.PFN_glProgramUniformMatrix4dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fv");
        try { Handles.MH_glProgramUniformMatrix2x3fv.invokeExact(handles.PFN_glProgramUniformMatrix2x3fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fv");
        try { Handles.MH_glProgramUniformMatrix3x2fv.invokeExact(handles.PFN_glProgramUniformMatrix3x2fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fv");
        try { Handles.MH_glProgramUniformMatrix2x4fv.invokeExact(handles.PFN_glProgramUniformMatrix2x4fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x2fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fv");
        try { Handles.MH_glProgramUniformMatrix4x2fv.invokeExact(handles.PFN_glProgramUniformMatrix4x2fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x4fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fv");
        try { Handles.MH_glProgramUniformMatrix3x4fv.invokeExact(handles.PFN_glProgramUniformMatrix3x4fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x3fv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fv");
        try { Handles.MH_glProgramUniformMatrix4x3fv.invokeExact(handles.PFN_glProgramUniformMatrix4x3fv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3fv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3dv");
        try { Handles.MH_glProgramUniformMatrix2x3dv.invokeExact(handles.PFN_glProgramUniformMatrix2x3dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2dv");
        try { Handles.MH_glProgramUniformMatrix3x2dv.invokeExact(handles.PFN_glProgramUniformMatrix3x2dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4dv");
        try { Handles.MH_glProgramUniformMatrix2x4dv.invokeExact(handles.PFN_glProgramUniformMatrix2x4dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x2dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2dv");
        try { Handles.MH_glProgramUniformMatrix4x2dv.invokeExact(handles.PFN_glProgramUniformMatrix4x2dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x4dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4dv");
        try { Handles.MH_glProgramUniformMatrix3x4dv.invokeExact(handles.PFN_glProgramUniformMatrix3x4dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4dv", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x3dv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3dv");
        try { Handles.MH_glProgramUniformMatrix4x3dv.invokeExact(handles.PFN_glProgramUniformMatrix4x3dv, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3dv", e); }
    }

    /// ```
    /// void glValidateProgramPipeline((unsigned int) GLuint pipeline);
    /// ```
    public void ValidateProgramPipeline(int pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_glValidateProgramPipeline)) throw new SymbolNotFoundError("Symbol not found: glValidateProgramPipeline");
        try { Handles.MH_glValidateProgramPipeline.invokeExact(handles.PFN_glValidateProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in ValidateProgramPipeline", e); }
    }

    /// ```
    /// void glGetProgramPipelineInfoLog((unsigned int) GLuint pipeline, (int) GLsizei bufSize, GLsizei* length, GLchar* infoLog);
    /// ```
    public void GetProgramPipelineInfoLog(int pipeline, int bufSize, MemorySegment length, MemorySegment infoLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramPipelineInfoLog)) throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineInfoLog");
        try { Handles.MH_glGetProgramPipelineInfoLog.invokeExact(handles.PFN_glGetProgramPipelineInfoLog, pipeline, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramPipelineInfoLog", e); }
    }

}
