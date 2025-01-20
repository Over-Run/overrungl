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
import java.util.*;
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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glUseProgramStages = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glActiveShaderProgram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateShaderProgramv = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindProgramPipeline = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteProgramPipelines = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenProgramPipelines = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsProgramPipeline = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetProgramPipelineiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform1i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform1iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform1fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform1dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform1uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform2iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform2uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform3iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform4iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glValidateProgramPipeline = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetProgramPipelineInfoLog = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glUseProgramStages,
            FD_glActiveShaderProgram,
            FD_glCreateShaderProgramv,
            FD_glBindProgramPipeline,
            FD_glDeleteProgramPipelines,
            FD_glGenProgramPipelines,
            FD_glIsProgramPipeline,
            FD_glGetProgramPipelineiv,
            FD_glProgramParameteri,
            FD_glProgramUniform1i,
            FD_glProgramUniform1iv,
            FD_glProgramUniform1f,
            FD_glProgramUniform1fv,
            FD_glProgramUniform1d,
            FD_glProgramUniform1dv,
            FD_glProgramUniform1ui,
            FD_glProgramUniform1uiv,
            FD_glProgramUniform2i,
            FD_glProgramUniform2iv,
            FD_glProgramUniform2f,
            FD_glProgramUniform2fv,
            FD_glProgramUniform2d,
            FD_glProgramUniform2dv,
            FD_glProgramUniform2ui,
            FD_glProgramUniform2uiv,
            FD_glProgramUniform3i,
            FD_glProgramUniform3iv,
            FD_glProgramUniform3f,
            FD_glProgramUniform3fv,
            FD_glProgramUniform3d,
            FD_glProgramUniform3dv,
            FD_glProgramUniform3ui,
            FD_glProgramUniform3uiv,
            FD_glProgramUniform4i,
            FD_glProgramUniform4iv,
            FD_glProgramUniform4f,
            FD_glProgramUniform4fv,
            FD_glProgramUniform4d,
            FD_glProgramUniform4dv,
            FD_glProgramUniform4ui,
            FD_glProgramUniform4uiv,
            FD_glProgramUniformMatrix2fv,
            FD_glProgramUniformMatrix3fv,
            FD_glProgramUniformMatrix4fv,
            FD_glProgramUniformMatrix2dv,
            FD_glProgramUniformMatrix3dv,
            FD_glProgramUniformMatrix4dv,
            FD_glProgramUniformMatrix2x3fv,
            FD_glProgramUniformMatrix3x2fv,
            FD_glProgramUniformMatrix2x4fv,
            FD_glProgramUniformMatrix4x2fv,
            FD_glProgramUniformMatrix3x4fv,
            FD_glProgramUniformMatrix4x3fv,
            FD_glProgramUniformMatrix2x3dv,
            FD_glProgramUniformMatrix3x2dv,
            FD_glProgramUniformMatrix2x4dv,
            FD_glProgramUniformMatrix4x2dv,
            FD_glProgramUniformMatrix3x4dv,
            FD_glProgramUniformMatrix4x3dv,
            FD_glValidateProgramPipeline,
            FD_glGetProgramPipelineInfoLog
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glUseProgramStages = RuntimeHelper.downcall(Descriptors.FD_glUseProgramStages);
        public static final MethodHandle MH_glActiveShaderProgram = RuntimeHelper.downcall(Descriptors.FD_glActiveShaderProgram);
        public static final MethodHandle MH_glCreateShaderProgramv = RuntimeHelper.downcall(Descriptors.FD_glCreateShaderProgramv);
        public static final MethodHandle MH_glBindProgramPipeline = RuntimeHelper.downcall(Descriptors.FD_glBindProgramPipeline);
        public static final MethodHandle MH_glDeleteProgramPipelines = RuntimeHelper.downcall(Descriptors.FD_glDeleteProgramPipelines);
        public static final MethodHandle MH_glGenProgramPipelines = RuntimeHelper.downcall(Descriptors.FD_glGenProgramPipelines);
        public static final MethodHandle MH_glIsProgramPipeline = RuntimeHelper.downcall(Descriptors.FD_glIsProgramPipeline);
        public static final MethodHandle MH_glGetProgramPipelineiv = RuntimeHelper.downcall(Descriptors.FD_glGetProgramPipelineiv);
        public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(Descriptors.FD_glProgramParameteri);
        public static final MethodHandle MH_glProgramUniform1i = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1i);
        public static final MethodHandle MH_glProgramUniform1iv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1iv);
        public static final MethodHandle MH_glProgramUniform1f = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1f);
        public static final MethodHandle MH_glProgramUniform1fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1fv);
        public static final MethodHandle MH_glProgramUniform1d = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1d);
        public static final MethodHandle MH_glProgramUniform1dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1dv);
        public static final MethodHandle MH_glProgramUniform1ui = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1ui);
        public static final MethodHandle MH_glProgramUniform1uiv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1uiv);
        public static final MethodHandle MH_glProgramUniform2i = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2i);
        public static final MethodHandle MH_glProgramUniform2iv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2iv);
        public static final MethodHandle MH_glProgramUniform2f = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2f);
        public static final MethodHandle MH_glProgramUniform2fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2fv);
        public static final MethodHandle MH_glProgramUniform2d = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2d);
        public static final MethodHandle MH_glProgramUniform2dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2dv);
        public static final MethodHandle MH_glProgramUniform2ui = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2ui);
        public static final MethodHandle MH_glProgramUniform2uiv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2uiv);
        public static final MethodHandle MH_glProgramUniform3i = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3i);
        public static final MethodHandle MH_glProgramUniform3iv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3iv);
        public static final MethodHandle MH_glProgramUniform3f = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3f);
        public static final MethodHandle MH_glProgramUniform3fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3fv);
        public static final MethodHandle MH_glProgramUniform3d = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3d);
        public static final MethodHandle MH_glProgramUniform3dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3dv);
        public static final MethodHandle MH_glProgramUniform3ui = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3ui);
        public static final MethodHandle MH_glProgramUniform3uiv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3uiv);
        public static final MethodHandle MH_glProgramUniform4i = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4i);
        public static final MethodHandle MH_glProgramUniform4iv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4iv);
        public static final MethodHandle MH_glProgramUniform4f = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4f);
        public static final MethodHandle MH_glProgramUniform4fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4fv);
        public static final MethodHandle MH_glProgramUniform4d = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4d);
        public static final MethodHandle MH_glProgramUniform4dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4dv);
        public static final MethodHandle MH_glProgramUniform4ui = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4ui);
        public static final MethodHandle MH_glProgramUniform4uiv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4uiv);
        public static final MethodHandle MH_glProgramUniformMatrix2fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2fv);
        public static final MethodHandle MH_glProgramUniformMatrix3fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3fv);
        public static final MethodHandle MH_glProgramUniformMatrix4fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4fv);
        public static final MethodHandle MH_glProgramUniformMatrix2dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2dv);
        public static final MethodHandle MH_glProgramUniformMatrix3dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3dv);
        public static final MethodHandle MH_glProgramUniformMatrix4dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4dv);
        public static final MethodHandle MH_glProgramUniformMatrix2x3fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x3fv);
        public static final MethodHandle MH_glProgramUniformMatrix3x2fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x2fv);
        public static final MethodHandle MH_glProgramUniformMatrix2x4fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x4fv);
        public static final MethodHandle MH_glProgramUniformMatrix4x2fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x2fv);
        public static final MethodHandle MH_glProgramUniformMatrix3x4fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x4fv);
        public static final MethodHandle MH_glProgramUniformMatrix4x3fv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x3fv);
        public static final MethodHandle MH_glProgramUniformMatrix2x3dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x3dv);
        public static final MethodHandle MH_glProgramUniformMatrix3x2dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x2dv);
        public static final MethodHandle MH_glProgramUniformMatrix2x4dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x4dv);
        public static final MethodHandle MH_glProgramUniformMatrix4x2dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x2dv);
        public static final MethodHandle MH_glProgramUniformMatrix3x4dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x4dv);
        public static final MethodHandle MH_glProgramUniformMatrix4x3dv = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x3dv);
        public static final MethodHandle MH_glValidateProgramPipeline = RuntimeHelper.downcall(Descriptors.FD_glValidateProgramPipeline);
        public static final MethodHandle MH_glGetProgramPipelineInfoLog = RuntimeHelper.downcall(Descriptors.FD_glGetProgramPipelineInfoLog);
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

    public void UseProgramStages(@CType("GLuint") int pipeline, @CType("GLbitfield") int stages, @CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glUseProgramStages)) throw new SymbolNotFoundError("Symbol not found: glUseProgramStages");
        try { Handles.MH_glUseProgramStages.invokeExact(handles.PFN_glUseProgramStages, pipeline, stages, program); }
        catch (Throwable e) { throw new RuntimeException("error in glUseProgramStages", e); }
    }

    public void ActiveShaderProgram(@CType("GLuint") int pipeline, @CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glActiveShaderProgram)) throw new SymbolNotFoundError("Symbol not found: glActiveShaderProgram");
        try { Handles.MH_glActiveShaderProgram.invokeExact(handles.PFN_glActiveShaderProgram, pipeline, program); }
        catch (Throwable e) { throw new RuntimeException("error in glActiveShaderProgram", e); }
    }

    public @CType("GLuint") int CreateShaderProgramv(@CType("GLenum") int type, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment strings) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateShaderProgramv)) throw new SymbolNotFoundError("Symbol not found: glCreateShaderProgramv");
        try { return (int) Handles.MH_glCreateShaderProgramv.invokeExact(handles.PFN_glCreateShaderProgramv, type, count, strings); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateShaderProgramv", e); }
    }

    public void BindProgramPipeline(@CType("GLuint") int pipeline) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindProgramPipeline)) throw new SymbolNotFoundError("Symbol not found: glBindProgramPipeline");
        try { Handles.MH_glBindProgramPipeline.invokeExact(handles.PFN_glBindProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in glBindProgramPipeline", e); }
    }

    public void DeleteProgramPipelines(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glDeleteProgramPipelines");
        try { Handles.MH_glDeleteProgramPipelines.invokeExact(handles.PFN_glDeleteProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteProgramPipelines", e); }
    }

    public void GenProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glGenProgramPipelines");
        try { Handles.MH_glGenProgramPipelines.invokeExact(handles.PFN_glGenProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in glGenProgramPipelines", e); }
    }

    public @CType("GLboolean") boolean IsProgramPipeline(@CType("GLuint") int pipeline) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsProgramPipeline)) throw new SymbolNotFoundError("Symbol not found: glIsProgramPipeline");
        try { return (boolean) Handles.MH_glIsProgramPipeline.invokeExact(handles.PFN_glIsProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in glIsProgramPipeline", e); }
    }

    public void GetProgramPipelineiv(@CType("GLuint") int pipeline, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramPipelineiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineiv");
        try { Handles.MH_glGetProgramPipelineiv.invokeExact(handles.PFN_glGetProgramPipelineiv, pipeline, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineiv", e); }
    }

    public void ProgramParameteri(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramParameteri)) throw new SymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { Handles.MH_glProgramParameteri.invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameteri", e); }
    }

    public void ProgramUniform1i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1i");
        try { Handles.MH_glProgramUniform1i.invokeExact(handles.PFN_glProgramUniform1i, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1i", e); }
    }

    public void ProgramUniform1iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1iv");
        try { Handles.MH_glProgramUniform1iv.invokeExact(handles.PFN_glProgramUniform1iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1iv", e); }
    }

    public void ProgramUniform1f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1f");
        try { Handles.MH_glProgramUniform1f.invokeExact(handles.PFN_glProgramUniform1f, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1f", e); }
    }

    public void ProgramUniform1fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fv");
        try { Handles.MH_glProgramUniform1fv.invokeExact(handles.PFN_glProgramUniform1fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fv", e); }
    }

    public void ProgramUniform1d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1d");
        try { Handles.MH_glProgramUniform1d.invokeExact(handles.PFN_glProgramUniform1d, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1d", e); }
    }

    public void ProgramUniform1dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1dv");
        try { Handles.MH_glProgramUniform1dv.invokeExact(handles.PFN_glProgramUniform1dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dv", e); }
    }

    public void ProgramUniform1ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ui");
        try { Handles.MH_glProgramUniform1ui.invokeExact(handles.PFN_glProgramUniform1ui, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ui", e); }
    }

    public void ProgramUniform1uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uiv");
        try { Handles.MH_glProgramUniform1uiv.invokeExact(handles.PFN_glProgramUniform1uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uiv", e); }
    }

    public void ProgramUniform2i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2i");
        try { Handles.MH_glProgramUniform2i.invokeExact(handles.PFN_glProgramUniform2i, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2i", e); }
    }

    public void ProgramUniform2iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2iv");
        try { Handles.MH_glProgramUniform2iv.invokeExact(handles.PFN_glProgramUniform2iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2iv", e); }
    }

    public void ProgramUniform2f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2f");
        try { Handles.MH_glProgramUniform2f.invokeExact(handles.PFN_glProgramUniform2f, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2f", e); }
    }

    public void ProgramUniform2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fv");
        try { Handles.MH_glProgramUniform2fv.invokeExact(handles.PFN_glProgramUniform2fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fv", e); }
    }

    public void ProgramUniform2d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2d");
        try { Handles.MH_glProgramUniform2d.invokeExact(handles.PFN_glProgramUniform2d, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2d", e); }
    }

    public void ProgramUniform2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2dv");
        try { Handles.MH_glProgramUniform2dv.invokeExact(handles.PFN_glProgramUniform2dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dv", e); }
    }

    public void ProgramUniform2ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ui");
        try { Handles.MH_glProgramUniform2ui.invokeExact(handles.PFN_glProgramUniform2ui, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ui", e); }
    }

    public void ProgramUniform2uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uiv");
        try { Handles.MH_glProgramUniform2uiv.invokeExact(handles.PFN_glProgramUniform2uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uiv", e); }
    }

    public void ProgramUniform3i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3i");
        try { Handles.MH_glProgramUniform3i.invokeExact(handles.PFN_glProgramUniform3i, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3i", e); }
    }

    public void ProgramUniform3iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3iv");
        try { Handles.MH_glProgramUniform3iv.invokeExact(handles.PFN_glProgramUniform3iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3iv", e); }
    }

    public void ProgramUniform3f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3f");
        try { Handles.MH_glProgramUniform3f.invokeExact(handles.PFN_glProgramUniform3f, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3f", e); }
    }

    public void ProgramUniform3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fv");
        try { Handles.MH_glProgramUniform3fv.invokeExact(handles.PFN_glProgramUniform3fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fv", e); }
    }

    public void ProgramUniform3d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1, @CType("GLdouble") double v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3d");
        try { Handles.MH_glProgramUniform3d.invokeExact(handles.PFN_glProgramUniform3d, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3d", e); }
    }

    public void ProgramUniform3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3dv");
        try { Handles.MH_glProgramUniform3dv.invokeExact(handles.PFN_glProgramUniform3dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dv", e); }
    }

    public void ProgramUniform3ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ui");
        try { Handles.MH_glProgramUniform3ui.invokeExact(handles.PFN_glProgramUniform3ui, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ui", e); }
    }

    public void ProgramUniform3uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uiv");
        try { Handles.MH_glProgramUniform3uiv.invokeExact(handles.PFN_glProgramUniform3uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uiv", e); }
    }

    public void ProgramUniform4i(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4i)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4i");
        try { Handles.MH_glProgramUniform4i.invokeExact(handles.PFN_glProgramUniform4i, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4i", e); }
    }

    public void ProgramUniform4iv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4iv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4iv");
        try { Handles.MH_glProgramUniform4iv.invokeExact(handles.PFN_glProgramUniform4iv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4iv", e); }
    }

    public void ProgramUniform4f(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4f)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4f");
        try { Handles.MH_glProgramUniform4f.invokeExact(handles.PFN_glProgramUniform4f, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4f", e); }
    }

    public void ProgramUniform4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fv");
        try { Handles.MH_glProgramUniform4fv.invokeExact(handles.PFN_glProgramUniform4fv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fv", e); }
    }

    public void ProgramUniform4d(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double v0, @CType("GLdouble") double v1, @CType("GLdouble") double v2, @CType("GLdouble") double v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4d)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4d");
        try { Handles.MH_glProgramUniform4d.invokeExact(handles.PFN_glProgramUniform4d, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4d", e); }
    }

    public void ProgramUniform4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4dv");
        try { Handles.MH_glProgramUniform4dv.invokeExact(handles.PFN_glProgramUniform4dv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dv", e); }
    }

    public void ProgramUniform4ui(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4ui)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ui");
        try { Handles.MH_glProgramUniform4ui.invokeExact(handles.PFN_glProgramUniform4ui, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ui", e); }
    }

    public void ProgramUniform4uiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4uiv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uiv");
        try { Handles.MH_glProgramUniform4uiv.invokeExact(handles.PFN_glProgramUniform4uiv, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uiv", e); }
    }

    public void ProgramUniformMatrix2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fv");
        try { Handles.MH_glProgramUniformMatrix2fv.invokeExact(handles.PFN_glProgramUniformMatrix2fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2fv", e); }
    }

    public void ProgramUniformMatrix3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fv");
        try { Handles.MH_glProgramUniformMatrix3fv.invokeExact(handles.PFN_glProgramUniformMatrix3fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3fv", e); }
    }

    public void ProgramUniformMatrix4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fv");
        try { Handles.MH_glProgramUniformMatrix4fv.invokeExact(handles.PFN_glProgramUniformMatrix4fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4fv", e); }
    }

    public void ProgramUniformMatrix2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2dv");
        try { Handles.MH_glProgramUniformMatrix2dv.invokeExact(handles.PFN_glProgramUniformMatrix2dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2dv", e); }
    }

    public void ProgramUniformMatrix3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3dv");
        try { Handles.MH_glProgramUniformMatrix3dv.invokeExact(handles.PFN_glProgramUniformMatrix3dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3dv", e); }
    }

    public void ProgramUniformMatrix4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4dv");
        try { Handles.MH_glProgramUniformMatrix4dv.invokeExact(handles.PFN_glProgramUniformMatrix4dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4dv", e); }
    }

    public void ProgramUniformMatrix2x3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fv");
        try { Handles.MH_glProgramUniformMatrix2x3fv.invokeExact(handles.PFN_glProgramUniformMatrix2x3fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3fv", e); }
    }

    public void ProgramUniformMatrix3x2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fv");
        try { Handles.MH_glProgramUniformMatrix3x2fv.invokeExact(handles.PFN_glProgramUniformMatrix3x2fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2fv", e); }
    }

    public void ProgramUniformMatrix2x4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fv");
        try { Handles.MH_glProgramUniformMatrix2x4fv.invokeExact(handles.PFN_glProgramUniformMatrix2x4fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4fv", e); }
    }

    public void ProgramUniformMatrix4x2fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x2fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fv");
        try { Handles.MH_glProgramUniformMatrix4x2fv.invokeExact(handles.PFN_glProgramUniformMatrix4x2fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2fv", e); }
    }

    public void ProgramUniformMatrix3x4fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x4fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fv");
        try { Handles.MH_glProgramUniformMatrix3x4fv.invokeExact(handles.PFN_glProgramUniformMatrix3x4fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4fv", e); }
    }

    public void ProgramUniformMatrix4x3fv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x3fv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fv");
        try { Handles.MH_glProgramUniformMatrix4x3fv.invokeExact(handles.PFN_glProgramUniformMatrix4x3fv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3fv", e); }
    }

    public void ProgramUniformMatrix2x3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3dv");
        try { Handles.MH_glProgramUniformMatrix2x3dv.invokeExact(handles.PFN_glProgramUniformMatrix2x3dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3dv", e); }
    }

    public void ProgramUniformMatrix3x2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2dv");
        try { Handles.MH_glProgramUniformMatrix3x2dv.invokeExact(handles.PFN_glProgramUniformMatrix3x2dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2dv", e); }
    }

    public void ProgramUniformMatrix2x4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4dv");
        try { Handles.MH_glProgramUniformMatrix2x4dv.invokeExact(handles.PFN_glProgramUniformMatrix2x4dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4dv", e); }
    }

    public void ProgramUniformMatrix4x2dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x2dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2dv");
        try { Handles.MH_glProgramUniformMatrix4x2dv.invokeExact(handles.PFN_glProgramUniformMatrix4x2dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2dv", e); }
    }

    public void ProgramUniformMatrix3x4dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x4dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4dv");
        try { Handles.MH_glProgramUniformMatrix3x4dv.invokeExact(handles.PFN_glProgramUniformMatrix3x4dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4dv", e); }
    }

    public void ProgramUniformMatrix4x3dv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x3dv)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3dv");
        try { Handles.MH_glProgramUniformMatrix4x3dv.invokeExact(handles.PFN_glProgramUniformMatrix4x3dv, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3dv", e); }
    }

    public void ValidateProgramPipeline(@CType("GLuint") int pipeline) {
        if (Unmarshal.isNullPointer(handles.PFN_glValidateProgramPipeline)) throw new SymbolNotFoundError("Symbol not found: glValidateProgramPipeline");
        try { Handles.MH_glValidateProgramPipeline.invokeExact(handles.PFN_glValidateProgramPipeline, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in glValidateProgramPipeline", e); }
    }

    public void GetProgramPipelineInfoLog(@CType("GLuint") int pipeline, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment infoLog) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramPipelineInfoLog)) throw new SymbolNotFoundError("Symbol not found: glGetProgramPipelineInfoLog");
        try { Handles.MH_glGetProgramPipelineInfoLog.invokeExact(handles.PFN_glGetProgramPipelineInfoLog, pipeline, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramPipelineInfoLog", e); }
    }

}
