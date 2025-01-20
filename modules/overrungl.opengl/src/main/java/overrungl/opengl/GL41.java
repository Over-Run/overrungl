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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL41 extends GL40 {
    public static final int GL_FIXED = 0x140C;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
    public static final int GL_LOW_FLOAT = 0x8DF0;
    public static final int GL_MEDIUM_FLOAT = 0x8DF1;
    public static final int GL_HIGH_FLOAT = 0x8DF2;
    public static final int GL_LOW_INT = 0x8DF3;
    public static final int GL_MEDIUM_INT = 0x8DF4;
    public static final int GL_HIGH_INT = 0x8DF5;
    public static final int GL_SHADER_COMPILER = 0x8DFA;
    public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
    public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
    public static final int GL_RGB565 = 0x8D62;
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
    public static final int GL_VERTEX_SHADER_BIT = 0x00000001;
    public static final int GL_FRAGMENT_SHADER_BIT = 0x00000002;
    public static final int GL_GEOMETRY_SHADER_BIT = 0x00000004;
    public static final int GL_TESS_CONTROL_SHADER_BIT = 0x00000008;
    public static final int GL_TESS_EVALUATION_SHADER_BIT = 0x00000010;
    public static final int GL_ALL_SHADER_BITS = 0xFFFFFFFF;
    public static final int GL_PROGRAM_SEPARABLE = 0x8258;
    public static final int GL_ACTIVE_PROGRAM = 0x8259;
    public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;
    public static final int GL_MAX_VIEWPORTS = 0x825B;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS = 0x825C;
    public static final int GL_VIEWPORT_BOUNDS_RANGE = 0x825D;
    public static final int GL_LAYER_PROVOKING_VERTEX = 0x825E;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
    public static final int GL_UNDEFINED_VERTEX = 0x8260;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glReleaseShaderCompiler = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glShaderBinary = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetShaderPrecisionFormat = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDepthRangef = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glClearDepthf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glGetProgramBinary = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramBinary = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUseProgramStages = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glActiveShaderProgram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateShaderProgramv = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindProgramPipeline = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteProgramPipelines = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenProgramPipelines = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsProgramPipeline = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetProgramPipelineiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
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
        public static final FunctionDescriptor FD_glVertexAttribL1d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL2d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL3d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL4d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttribL1dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribL4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribLPointer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribLdv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glViewportArrayv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glViewportIndexedf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glViewportIndexedfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glScissorArrayv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glScissorIndexed = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glScissorIndexedv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDepthRangeArrayv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDepthRangeIndexed = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glGetFloati_v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetDoublei_v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glReleaseShaderCompiler,
            FD_glShaderBinary,
            FD_glGetShaderPrecisionFormat,
            FD_glDepthRangef,
            FD_glClearDepthf,
            FD_glGetProgramBinary,
            FD_glProgramBinary,
            FD_glProgramParameteri,
            FD_glUseProgramStages,
            FD_glActiveShaderProgram,
            FD_glCreateShaderProgramv,
            FD_glBindProgramPipeline,
            FD_glDeleteProgramPipelines,
            FD_glGenProgramPipelines,
            FD_glIsProgramPipeline,
            FD_glGetProgramPipelineiv,
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
            FD_glGetProgramPipelineInfoLog,
            FD_glVertexAttribL1d,
            FD_glVertexAttribL2d,
            FD_glVertexAttribL3d,
            FD_glVertexAttribL4d,
            FD_glVertexAttribL1dv,
            FD_glVertexAttribL2dv,
            FD_glVertexAttribL3dv,
            FD_glVertexAttribL4dv,
            FD_glVertexAttribLPointer,
            FD_glGetVertexAttribLdv,
            FD_glViewportArrayv,
            FD_glViewportIndexedf,
            FD_glViewportIndexedfv,
            FD_glScissorArrayv,
            FD_glScissorIndexed,
            FD_glScissorIndexedv,
            FD_glDepthRangeArrayv,
            FD_glDepthRangeIndexed,
            FD_glGetFloati_v,
            FD_glGetDoublei_v
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glReleaseShaderCompiler = RuntimeHelper.downcall(Descriptors.FD_glReleaseShaderCompiler);
        public static final MethodHandle MH_glShaderBinary = RuntimeHelper.downcall(Descriptors.FD_glShaderBinary);
        public static final MethodHandle MH_glGetShaderPrecisionFormat = RuntimeHelper.downcall(Descriptors.FD_glGetShaderPrecisionFormat);
        public static final MethodHandle MH_glDepthRangef = RuntimeHelper.downcall(Descriptors.FD_glDepthRangef);
        public static final MethodHandle MH_glClearDepthf = RuntimeHelper.downcall(Descriptors.FD_glClearDepthf);
        public static final MethodHandle MH_glGetProgramBinary = RuntimeHelper.downcall(Descriptors.FD_glGetProgramBinary);
        public static final MethodHandle MH_glProgramBinary = RuntimeHelper.downcall(Descriptors.FD_glProgramBinary);
        public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(Descriptors.FD_glProgramParameteri);
        public static final MethodHandle MH_glUseProgramStages = RuntimeHelper.downcall(Descriptors.FD_glUseProgramStages);
        public static final MethodHandle MH_glActiveShaderProgram = RuntimeHelper.downcall(Descriptors.FD_glActiveShaderProgram);
        public static final MethodHandle MH_glCreateShaderProgramv = RuntimeHelper.downcall(Descriptors.FD_glCreateShaderProgramv);
        public static final MethodHandle MH_glBindProgramPipeline = RuntimeHelper.downcall(Descriptors.FD_glBindProgramPipeline);
        public static final MethodHandle MH_glDeleteProgramPipelines = RuntimeHelper.downcall(Descriptors.FD_glDeleteProgramPipelines);
        public static final MethodHandle MH_glGenProgramPipelines = RuntimeHelper.downcall(Descriptors.FD_glGenProgramPipelines);
        public static final MethodHandle MH_glIsProgramPipeline = RuntimeHelper.downcall(Descriptors.FD_glIsProgramPipeline);
        public static final MethodHandle MH_glGetProgramPipelineiv = RuntimeHelper.downcall(Descriptors.FD_glGetProgramPipelineiv);
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
        public static final MethodHandle MH_glVertexAttribL1d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1d);
        public static final MethodHandle MH_glVertexAttribL2d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2d);
        public static final MethodHandle MH_glVertexAttribL3d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3d);
        public static final MethodHandle MH_glVertexAttribL4d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4d);
        public static final MethodHandle MH_glVertexAttribL1dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL1dv);
        public static final MethodHandle MH_glVertexAttribL2dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL2dv);
        public static final MethodHandle MH_glVertexAttribL3dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL3dv);
        public static final MethodHandle MH_glVertexAttribL4dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribL4dv);
        public static final MethodHandle MH_glVertexAttribLPointer = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribLPointer);
        public static final MethodHandle MH_glGetVertexAttribLdv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribLdv);
        public static final MethodHandle MH_glViewportArrayv = RuntimeHelper.downcall(Descriptors.FD_glViewportArrayv);
        public static final MethodHandle MH_glViewportIndexedf = RuntimeHelper.downcall(Descriptors.FD_glViewportIndexedf);
        public static final MethodHandle MH_glViewportIndexedfv = RuntimeHelper.downcall(Descriptors.FD_glViewportIndexedfv);
        public static final MethodHandle MH_glScissorArrayv = RuntimeHelper.downcall(Descriptors.FD_glScissorArrayv);
        public static final MethodHandle MH_glScissorIndexed = RuntimeHelper.downcall(Descriptors.FD_glScissorIndexed);
        public static final MethodHandle MH_glScissorIndexedv = RuntimeHelper.downcall(Descriptors.FD_glScissorIndexedv);
        public static final MethodHandle MH_glDepthRangeArrayv = RuntimeHelper.downcall(Descriptors.FD_glDepthRangeArrayv);
        public static final MethodHandle MH_glDepthRangeIndexed = RuntimeHelper.downcall(Descriptors.FD_glDepthRangeIndexed);
        public static final MethodHandle MH_glGetFloati_v = RuntimeHelper.downcall(Descriptors.FD_glGetFloati_v);
        public static final MethodHandle MH_glGetDoublei_v = RuntimeHelper.downcall(Descriptors.FD_glGetDoublei_v);
        public final MemorySegment PFN_glReleaseShaderCompiler;
        public final MemorySegment PFN_glShaderBinary;
        public final MemorySegment PFN_glGetShaderPrecisionFormat;
        public final MemorySegment PFN_glDepthRangef;
        public final MemorySegment PFN_glClearDepthf;
        public final MemorySegment PFN_glGetProgramBinary;
        public final MemorySegment PFN_glProgramBinary;
        public final MemorySegment PFN_glProgramParameteri;
        public final MemorySegment PFN_glUseProgramStages;
        public final MemorySegment PFN_glActiveShaderProgram;
        public final MemorySegment PFN_glCreateShaderProgramv;
        public final MemorySegment PFN_glBindProgramPipeline;
        public final MemorySegment PFN_glDeleteProgramPipelines;
        public final MemorySegment PFN_glGenProgramPipelines;
        public final MemorySegment PFN_glIsProgramPipeline;
        public final MemorySegment PFN_glGetProgramPipelineiv;
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
        public final MemorySegment PFN_glVertexAttribL1d;
        public final MemorySegment PFN_glVertexAttribL2d;
        public final MemorySegment PFN_glVertexAttribL3d;
        public final MemorySegment PFN_glVertexAttribL4d;
        public final MemorySegment PFN_glVertexAttribL1dv;
        public final MemorySegment PFN_glVertexAttribL2dv;
        public final MemorySegment PFN_glVertexAttribL3dv;
        public final MemorySegment PFN_glVertexAttribL4dv;
        public final MemorySegment PFN_glVertexAttribLPointer;
        public final MemorySegment PFN_glGetVertexAttribLdv;
        public final MemorySegment PFN_glViewportArrayv;
        public final MemorySegment PFN_glViewportIndexedf;
        public final MemorySegment PFN_glViewportIndexedfv;
        public final MemorySegment PFN_glScissorArrayv;
        public final MemorySegment PFN_glScissorIndexed;
        public final MemorySegment PFN_glScissorIndexedv;
        public final MemorySegment PFN_glDepthRangeArrayv;
        public final MemorySegment PFN_glDepthRangeIndexed;
        public final MemorySegment PFN_glGetFloati_v;
        public final MemorySegment PFN_glGetDoublei_v;
        private Handles(GLLoadFunc func) {
            PFN_glReleaseShaderCompiler = func.invoke("glReleaseShaderCompiler");
            PFN_glShaderBinary = func.invoke("glShaderBinary");
            PFN_glGetShaderPrecisionFormat = func.invoke("glGetShaderPrecisionFormat");
            PFN_glDepthRangef = func.invoke("glDepthRangef", "glDepthRangefOES");
            PFN_glClearDepthf = func.invoke("glClearDepthf", "glClearDepthfOES");
            PFN_glGetProgramBinary = func.invoke("glGetProgramBinary", "glGetProgramBinaryOES");
            PFN_glProgramBinary = func.invoke("glProgramBinary", "glProgramBinaryOES");
            PFN_glProgramParameteri = func.invoke("glProgramParameteri", "glProgramParameteriARB", "glProgramParameteriEXT");
            PFN_glUseProgramStages = func.invoke("glUseProgramStages");
            PFN_glActiveShaderProgram = func.invoke("glActiveShaderProgram");
            PFN_glCreateShaderProgramv = func.invoke("glCreateShaderProgramv");
            PFN_glBindProgramPipeline = func.invoke("glBindProgramPipeline");
            PFN_glDeleteProgramPipelines = func.invoke("glDeleteProgramPipelines");
            PFN_glGenProgramPipelines = func.invoke("glGenProgramPipelines");
            PFN_glIsProgramPipeline = func.invoke("glIsProgramPipeline");
            PFN_glGetProgramPipelineiv = func.invoke("glGetProgramPipelineiv");
            PFN_glProgramUniform1i = func.invoke("glProgramUniform1i", "glProgramUniform1iEXT");
            PFN_glProgramUniform1iv = func.invoke("glProgramUniform1iv", "glProgramUniform1ivEXT");
            PFN_glProgramUniform1f = func.invoke("glProgramUniform1f", "glProgramUniform1fEXT");
            PFN_glProgramUniform1fv = func.invoke("glProgramUniform1fv", "glProgramUniform1fvEXT");
            PFN_glProgramUniform1d = func.invoke("glProgramUniform1d");
            PFN_glProgramUniform1dv = func.invoke("glProgramUniform1dv");
            PFN_glProgramUniform1ui = func.invoke("glProgramUniform1ui", "glProgramUniform1uiEXT");
            PFN_glProgramUniform1uiv = func.invoke("glProgramUniform1uiv", "glProgramUniform1uivEXT");
            PFN_glProgramUniform2i = func.invoke("glProgramUniform2i", "glProgramUniform2iEXT");
            PFN_glProgramUniform2iv = func.invoke("glProgramUniform2iv", "glProgramUniform2ivEXT");
            PFN_glProgramUniform2f = func.invoke("glProgramUniform2f", "glProgramUniform2fEXT");
            PFN_glProgramUniform2fv = func.invoke("glProgramUniform2fv", "glProgramUniform2fvEXT");
            PFN_glProgramUniform2d = func.invoke("glProgramUniform2d");
            PFN_glProgramUniform2dv = func.invoke("glProgramUniform2dv");
            PFN_glProgramUniform2ui = func.invoke("glProgramUniform2ui", "glProgramUniform2uiEXT");
            PFN_glProgramUniform2uiv = func.invoke("glProgramUniform2uiv", "glProgramUniform2uivEXT");
            PFN_glProgramUniform3i = func.invoke("glProgramUniform3i", "glProgramUniform3iEXT");
            PFN_glProgramUniform3iv = func.invoke("glProgramUniform3iv", "glProgramUniform3ivEXT");
            PFN_glProgramUniform3f = func.invoke("glProgramUniform3f", "glProgramUniform3fEXT");
            PFN_glProgramUniform3fv = func.invoke("glProgramUniform3fv", "glProgramUniform3fvEXT");
            PFN_glProgramUniform3d = func.invoke("glProgramUniform3d");
            PFN_glProgramUniform3dv = func.invoke("glProgramUniform3dv");
            PFN_glProgramUniform3ui = func.invoke("glProgramUniform3ui", "glProgramUniform3uiEXT");
            PFN_glProgramUniform3uiv = func.invoke("glProgramUniform3uiv", "glProgramUniform3uivEXT");
            PFN_glProgramUniform4i = func.invoke("glProgramUniform4i", "glProgramUniform4iEXT");
            PFN_glProgramUniform4iv = func.invoke("glProgramUniform4iv", "glProgramUniform4ivEXT");
            PFN_glProgramUniform4f = func.invoke("glProgramUniform4f", "glProgramUniform4fEXT");
            PFN_glProgramUniform4fv = func.invoke("glProgramUniform4fv", "glProgramUniform4fvEXT");
            PFN_glProgramUniform4d = func.invoke("glProgramUniform4d");
            PFN_glProgramUniform4dv = func.invoke("glProgramUniform4dv");
            PFN_glProgramUniform4ui = func.invoke("glProgramUniform4ui", "glProgramUniform4uiEXT");
            PFN_glProgramUniform4uiv = func.invoke("glProgramUniform4uiv", "glProgramUniform4uivEXT");
            PFN_glProgramUniformMatrix2fv = func.invoke("glProgramUniformMatrix2fv", "glProgramUniformMatrix2fvEXT");
            PFN_glProgramUniformMatrix3fv = func.invoke("glProgramUniformMatrix3fv", "glProgramUniformMatrix3fvEXT");
            PFN_glProgramUniformMatrix4fv = func.invoke("glProgramUniformMatrix4fv", "glProgramUniformMatrix4fvEXT");
            PFN_glProgramUniformMatrix2dv = func.invoke("glProgramUniformMatrix2dv");
            PFN_glProgramUniformMatrix3dv = func.invoke("glProgramUniformMatrix3dv");
            PFN_glProgramUniformMatrix4dv = func.invoke("glProgramUniformMatrix4dv");
            PFN_glProgramUniformMatrix2x3fv = func.invoke("glProgramUniformMatrix2x3fv", "glProgramUniformMatrix2x3fvEXT");
            PFN_glProgramUniformMatrix3x2fv = func.invoke("glProgramUniformMatrix3x2fv", "glProgramUniformMatrix3x2fvEXT");
            PFN_glProgramUniformMatrix2x4fv = func.invoke("glProgramUniformMatrix2x4fv", "glProgramUniformMatrix2x4fvEXT");
            PFN_glProgramUniformMatrix4x2fv = func.invoke("glProgramUniformMatrix4x2fv", "glProgramUniformMatrix4x2fvEXT");
            PFN_glProgramUniformMatrix3x4fv = func.invoke("glProgramUniformMatrix3x4fv", "glProgramUniformMatrix3x4fvEXT");
            PFN_glProgramUniformMatrix4x3fv = func.invoke("glProgramUniformMatrix4x3fv", "glProgramUniformMatrix4x3fvEXT");
            PFN_glProgramUniformMatrix2x3dv = func.invoke("glProgramUniformMatrix2x3dv");
            PFN_glProgramUniformMatrix3x2dv = func.invoke("glProgramUniformMatrix3x2dv");
            PFN_glProgramUniformMatrix2x4dv = func.invoke("glProgramUniformMatrix2x4dv");
            PFN_glProgramUniformMatrix4x2dv = func.invoke("glProgramUniformMatrix4x2dv");
            PFN_glProgramUniformMatrix3x4dv = func.invoke("glProgramUniformMatrix3x4dv");
            PFN_glProgramUniformMatrix4x3dv = func.invoke("glProgramUniformMatrix4x3dv");
            PFN_glValidateProgramPipeline = func.invoke("glValidateProgramPipeline");
            PFN_glGetProgramPipelineInfoLog = func.invoke("glGetProgramPipelineInfoLog");
            PFN_glVertexAttribL1d = func.invoke("glVertexAttribL1d", "glVertexAttribL1dEXT");
            PFN_glVertexAttribL2d = func.invoke("glVertexAttribL2d", "glVertexAttribL2dEXT");
            PFN_glVertexAttribL3d = func.invoke("glVertexAttribL3d", "glVertexAttribL3dEXT");
            PFN_glVertexAttribL4d = func.invoke("glVertexAttribL4d", "glVertexAttribL4dEXT");
            PFN_glVertexAttribL1dv = func.invoke("glVertexAttribL1dv", "glVertexAttribL1dvEXT");
            PFN_glVertexAttribL2dv = func.invoke("glVertexAttribL2dv", "glVertexAttribL2dvEXT");
            PFN_glVertexAttribL3dv = func.invoke("glVertexAttribL3dv", "glVertexAttribL3dvEXT");
            PFN_glVertexAttribL4dv = func.invoke("glVertexAttribL4dv", "glVertexAttribL4dvEXT");
            PFN_glVertexAttribLPointer = func.invoke("glVertexAttribLPointer", "glVertexAttribLPointerEXT");
            PFN_glGetVertexAttribLdv = func.invoke("glGetVertexAttribLdv", "glGetVertexAttribLdvEXT");
            PFN_glViewportArrayv = func.invoke("glViewportArrayv", "glViewportArrayvNV", "glViewportArrayvOES");
            PFN_glViewportIndexedf = func.invoke("glViewportIndexedf", "glViewportIndexedfOES", "glViewportIndexedfNV");
            PFN_glViewportIndexedfv = func.invoke("glViewportIndexedfv", "glViewportIndexedfvOES", "glViewportIndexedfvNV");
            PFN_glScissorArrayv = func.invoke("glScissorArrayv", "glScissorArrayvNV", "glScissorArrayvOES");
            PFN_glScissorIndexed = func.invoke("glScissorIndexed", "glScissorIndexedNV", "glScissorIndexedOES");
            PFN_glScissorIndexedv = func.invoke("glScissorIndexedv", "glScissorIndexedvNV", "glScissorIndexedvOES");
            PFN_glDepthRangeArrayv = func.invoke("glDepthRangeArrayv");
            PFN_glDepthRangeIndexed = func.invoke("glDepthRangeIndexed");
            PFN_glGetFloati_v = func.invoke("glGetFloati_v", "glGetFloatIndexedvEXT", "glGetFloati_vEXT", "glGetFloati_vNV", "glGetFloati_vOES");
            PFN_glGetDoublei_v = func.invoke("glGetDoublei_v", "glGetDoubleIndexedvEXT", "glGetDoublei_vEXT");
        }
    }

    public GL41(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void ReleaseShaderCompiler() {
        if (Unmarshal.isNullPointer(handles.PFN_glReleaseShaderCompiler)) throw new SymbolNotFoundError("Symbol not found: glReleaseShaderCompiler");
        try { Handles.MH_glReleaseShaderCompiler.invokeExact(handles.PFN_glReleaseShaderCompiler); }
        catch (Throwable e) { throw new RuntimeException("error in glReleaseShaderCompiler", e); }
    }

    public void ShaderBinary(@CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment shaders, @CType("GLenum") int binaryFormat, @CType("const void *") java.lang.foreign.MemorySegment binary, @CType("GLsizei") int length) {
        if (Unmarshal.isNullPointer(handles.PFN_glShaderBinary)) throw new SymbolNotFoundError("Symbol not found: glShaderBinary");
        try { Handles.MH_glShaderBinary.invokeExact(handles.PFN_glShaderBinary, count, shaders, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in glShaderBinary", e); }
    }

    public void GetShaderPrecisionFormat(@CType("GLenum") int shadertype, @CType("GLenum") int precisiontype, @CType("GLint *") java.lang.foreign.MemorySegment range, @CType("GLint *") java.lang.foreign.MemorySegment precision) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetShaderPrecisionFormat)) throw new SymbolNotFoundError("Symbol not found: glGetShaderPrecisionFormat");
        try { Handles.MH_glGetShaderPrecisionFormat.invokeExact(handles.PFN_glGetShaderPrecisionFormat, shadertype, precisiontype, range, precision); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShaderPrecisionFormat", e); }
    }

    public void DepthRangef(@CType("GLfloat") float n, @CType("GLfloat") float f) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangef)) throw new SymbolNotFoundError("Symbol not found: glDepthRangef");
        try { Handles.MH_glDepthRangef.invokeExact(handles.PFN_glDepthRangef, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangef", e); }
    }

    public void ClearDepthf(@CType("GLfloat") float d) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearDepthf)) throw new SymbolNotFoundError("Symbol not found: glClearDepthf");
        try { Handles.MH_glClearDepthf.invokeExact(handles.PFN_glClearDepthf, d); }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepthf", e); }
    }

    public void GetProgramBinary(@CType("GLuint") int program, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLenum *") java.lang.foreign.MemorySegment binaryFormat, @CType("void*") java.lang.foreign.MemorySegment binary) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramBinary)) throw new SymbolNotFoundError("Symbol not found: glGetProgramBinary");
        try { Handles.MH_glGetProgramBinary.invokeExact(handles.PFN_glGetProgramBinary, program, bufSize, length, binaryFormat, binary); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramBinary", e); }
    }

    public void ProgramBinary(@CType("GLuint") int program, @CType("GLenum") int binaryFormat, @CType("const void *") java.lang.foreign.MemorySegment binary, @CType("GLsizei") int length) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramBinary)) throw new SymbolNotFoundError("Symbol not found: glProgramBinary");
        try { Handles.MH_glProgramBinary.invokeExact(handles.PFN_glProgramBinary, program, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramBinary", e); }
    }

    public void ProgramParameteri(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramParameteri)) throw new SymbolNotFoundError("Symbol not found: glProgramParameteri");
        try { Handles.MH_glProgramParameteri.invokeExact(handles.PFN_glProgramParameteri, program, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramParameteri", e); }
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

    public void VertexAttribL1d(@CType("GLuint") int index, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1d");
        try { Handles.MH_glVertexAttribL1d.invokeExact(handles.PFN_glVertexAttribL1d, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1d", e); }
    }

    public void VertexAttribL2d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2d");
        try { Handles.MH_glVertexAttribL2d.invokeExact(handles.PFN_glVertexAttribL2d, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2d", e); }
    }

    public void VertexAttribL3d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3d");
        try { Handles.MH_glVertexAttribL3d.invokeExact(handles.PFN_glVertexAttribL3d, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3d", e); }
    }

    public void VertexAttribL4d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4d");
        try { Handles.MH_glVertexAttribL4d.invokeExact(handles.PFN_glVertexAttribL4d, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4d", e); }
    }

    public void VertexAttribL1dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL1dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dv");
        try { Handles.MH_glVertexAttribL1dv.invokeExact(handles.PFN_glVertexAttribL1dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL1dv", e); }
    }

    public void VertexAttribL2dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL2dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dv");
        try { Handles.MH_glVertexAttribL2dv.invokeExact(handles.PFN_glVertexAttribL2dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL2dv", e); }
    }

    public void VertexAttribL3dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL3dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dv");
        try { Handles.MH_glVertexAttribL3dv.invokeExact(handles.PFN_glVertexAttribL3dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL3dv", e); }
    }

    public void VertexAttribL4dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribL4dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dv");
        try { Handles.MH_glVertexAttribL4dv.invokeExact(handles.PFN_glVertexAttribL4dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribL4dv", e); }
    }

    public void VertexAttribLPointer(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribLPointer)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribLPointer");
        try { Handles.MH_glVertexAttribLPointer.invokeExact(handles.PFN_glVertexAttribLPointer, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribLPointer", e); }
    }

    public void GetVertexAttribLdv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribLdv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLdv");
        try { Handles.MH_glGetVertexAttribLdv.invokeExact(handles.PFN_glGetVertexAttribLdv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribLdv", e); }
    }

    public void ViewportArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glViewportArrayv)) throw new SymbolNotFoundError("Symbol not found: glViewportArrayv");
        try { Handles.MH_glViewportArrayv.invokeExact(handles.PFN_glViewportArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportArrayv", e); }
    }

    public void ViewportIndexedf(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float w, @CType("GLfloat") float h) {
        if (Unmarshal.isNullPointer(handles.PFN_glViewportIndexedf)) throw new SymbolNotFoundError("Symbol not found: glViewportIndexedf");
        try { Handles.MH_glViewportIndexedf.invokeExact(handles.PFN_glViewportIndexedf, index, x, y, w, h); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportIndexedf", e); }
    }

    public void ViewportIndexedfv(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glViewportIndexedfv)) throw new SymbolNotFoundError("Symbol not found: glViewportIndexedfv");
        try { Handles.MH_glViewportIndexedfv.invokeExact(handles.PFN_glViewportIndexedfv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportIndexedfv", e); }
    }

    public void ScissorArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorArrayv)) throw new SymbolNotFoundError("Symbol not found: glScissorArrayv");
        try { Handles.MH_glScissorArrayv.invokeExact(handles.PFN_glScissorArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorArrayv", e); }
    }

    public void ScissorIndexed(@CType("GLuint") int index, @CType("GLint") int left, @CType("GLint") int bottom, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorIndexed)) throw new SymbolNotFoundError("Symbol not found: glScissorIndexed");
        try { Handles.MH_glScissorIndexed.invokeExact(handles.PFN_glScissorIndexed, index, left, bottom, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorIndexed", e); }
    }

    public void ScissorIndexedv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorIndexedv)) throw new SymbolNotFoundError("Symbol not found: glScissorIndexedv");
        try { Handles.MH_glScissorIndexedv.invokeExact(handles.PFN_glScissorIndexedv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorIndexedv", e); }
    }

    public void DepthRangeArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangeArrayv)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeArrayv");
        try { Handles.MH_glDepthRangeArrayv.invokeExact(handles.PFN_glDepthRangeArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangeArrayv", e); }
    }

    public void DepthRangeIndexed(@CType("GLuint") int index, @CType("GLdouble") double n, @CType("GLdouble") double f) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangeIndexed)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeIndexed");
        try { Handles.MH_glDepthRangeIndexed.invokeExact(handles.PFN_glDepthRangeIndexed, index, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangeIndexed", e); }
    }

    public void GetFloati_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFloati_v)) throw new SymbolNotFoundError("Symbol not found: glGetFloati_v");
        try { Handles.MH_glGetFloati_v.invokeExact(handles.PFN_glGetFloati_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloati_v", e); }
    }

    public void GetDoublei_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDoublei_v)) throw new SymbolNotFoundError("Symbol not found: glGetDoublei_v");
        try { Handles.MH_glGetDoublei_v.invokeExact(handles.PFN_glGetDoublei_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoublei_v", e); }
    }

    // --- OverrunGL custom code ---
    public void DeleteProgramPipelines(int pipeline) { try (var __stack = MemoryStack.pushLocal()) { DeleteProgramPipelines(1, __stack.ints(pipeline)); } }
    public int GenProgramPipelines() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenProgramPipelines(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public float GetFloati_v(@CType("GLenum") int target, @CType("GLuint") int index) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.floats(0); GetFloati_v(target, index, p); return p.get(ValueLayout.JAVA_FLOAT, 0); } }
    public double GetDoublei_v(@CType("GLenum") int target, @CType("GLuint") int index) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.doubles(0); GetDoublei_v(target, index, p); return p.get(ValueLayout.JAVA_DOUBLE, 0); } }
}
