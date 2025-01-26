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
    public static final class Handles {
        public static final MethodHandle MH_glReleaseShaderCompiler = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glShaderBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetShaderPrecisionFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangef = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glClearDepthf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGetProgramBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramBinary = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUseProgramStages = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glActiveShaderProgram = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShaderProgramv = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgramPipeline = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetProgramPipelineiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
        public static final MethodHandle MH_glVertexAttribL1d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL2d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL3d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL4d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttribL1dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribL4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribLPointer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribLdv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glViewportArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glViewportIndexedf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glViewportIndexedfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glScissorArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glScissorIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glScissorIndexedv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glGetFloati_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDoublei_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// void glReleaseShaderCompiler();
    /// ```
    public void ReleaseShaderCompiler() {
        if (MemoryUtil.isNullPointer(handles.PFN_glReleaseShaderCompiler)) throw new SymbolNotFoundError("Symbol not found: glReleaseShaderCompiler");
        try { Handles.MH_glReleaseShaderCompiler.invokeExact(handles.PFN_glReleaseShaderCompiler); }
        catch (Throwable e) { throw new RuntimeException("error in ReleaseShaderCompiler", e); }
    }

    /// ```
    /// void glShaderBinary((int) GLsizei count, const GLuint* shaders, (unsigned int) GLenum binaryFormat, const void* binary, (int) GLsizei length);
    /// ```
    public void ShaderBinary(int count, MemorySegment shaders, int binaryFormat, MemorySegment binary, int length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderBinary)) throw new SymbolNotFoundError("Symbol not found: glShaderBinary");
        try { Handles.MH_glShaderBinary.invokeExact(handles.PFN_glShaderBinary, count, shaders, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderBinary", e); }
    }

    /// ```
    /// void glGetShaderPrecisionFormat((unsigned int) GLenum shadertype, (unsigned int) GLenum precisiontype, GLint* range, GLint* precision);
    /// ```
    public void GetShaderPrecisionFormat(int shadertype, int precisiontype, MemorySegment range, MemorySegment precision) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderPrecisionFormat)) throw new SymbolNotFoundError("Symbol not found: glGetShaderPrecisionFormat");
        try { Handles.MH_glGetShaderPrecisionFormat.invokeExact(handles.PFN_glGetShaderPrecisionFormat, shadertype, precisiontype, range, precision); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderPrecisionFormat", e); }
    }

    /// ```
    /// void glDepthRangef(((float) khronos_float_t) GLfloat n, ((float) khronos_float_t) GLfloat f);
    /// ```
    public void DepthRangef(float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangef)) throw new SymbolNotFoundError("Symbol not found: glDepthRangef");
        try { Handles.MH_glDepthRangef.invokeExact(handles.PFN_glDepthRangef, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangef", e); }
    }

    /// ```
    /// void glClearDepthf(((float) khronos_float_t) GLfloat d);
    /// ```
    public void ClearDepthf(float d) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthf)) throw new SymbolNotFoundError("Symbol not found: glClearDepthf");
        try { Handles.MH_glClearDepthf.invokeExact(handles.PFN_glClearDepthf, d); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthf", e); }
    }

    /// ```
    /// void glGetProgramBinary((unsigned int) GLuint program, (int) GLsizei bufSize, GLsizei* length, GLenum* binaryFormat, void* binary);
    /// ```
    public void GetProgramBinary(int program, int bufSize, MemorySegment length, MemorySegment binaryFormat, MemorySegment binary) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramBinary)) throw new SymbolNotFoundError("Symbol not found: glGetProgramBinary");
        try { Handles.MH_glGetProgramBinary.invokeExact(handles.PFN_glGetProgramBinary, program, bufSize, length, binaryFormat, binary); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramBinary", e); }
    }

    /// ```
    /// void glProgramBinary((unsigned int) GLuint program, (unsigned int) GLenum binaryFormat, const void* binary, (int) GLsizei length);
    /// ```
    public void ProgramBinary(int program, int binaryFormat, MemorySegment binary, int length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramBinary)) throw new SymbolNotFoundError("Symbol not found: glProgramBinary");
        try { Handles.MH_glProgramBinary.invokeExact(handles.PFN_glProgramBinary, program, binaryFormat, binary, length); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramBinary", e); }
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

    /// ```
    /// void glVertexAttribL1d((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttribL1d(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1d");
        try { Handles.MH_glVertexAttribL1d.invokeExact(handles.PFN_glVertexAttribL1d, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1d", e); }
    }

    /// ```
    /// void glVertexAttribL2d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttribL2d(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2d");
        try { Handles.MH_glVertexAttribL2d.invokeExact(handles.PFN_glVertexAttribL2d, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2d", e); }
    }

    /// ```
    /// void glVertexAttribL3d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttribL3d(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3d");
        try { Handles.MH_glVertexAttribL3d.invokeExact(handles.PFN_glVertexAttribL3d, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3d", e); }
    }

    /// ```
    /// void glVertexAttribL4d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttribL4d(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4d");
        try { Handles.MH_glVertexAttribL4d.invokeExact(handles.PFN_glVertexAttribL4d, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4d", e); }
    }

    /// ```
    /// void glVertexAttribL1dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL1dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL1dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL1dv");
        try { Handles.MH_glVertexAttribL1dv.invokeExact(handles.PFN_glVertexAttribL1dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL1dv", e); }
    }

    /// ```
    /// void glVertexAttribL2dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL2dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL2dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL2dv");
        try { Handles.MH_glVertexAttribL2dv.invokeExact(handles.PFN_glVertexAttribL2dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL2dv", e); }
    }

    /// ```
    /// void glVertexAttribL3dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL3dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL3dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL3dv");
        try { Handles.MH_glVertexAttribL3dv.invokeExact(handles.PFN_glVertexAttribL3dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL3dv", e); }
    }

    /// ```
    /// void glVertexAttribL4dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttribL4dv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribL4dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribL4dv");
        try { Handles.MH_glVertexAttribL4dv.invokeExact(handles.PFN_glVertexAttribL4dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribL4dv", e); }
    }

    /// ```
    /// void glVertexAttribLPointer((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribLPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLPointer)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribLPointer");
        try { Handles.MH_glVertexAttribLPointer.invokeExact(handles.PFN_glVertexAttribLPointer, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLPointer", e); }
    }

    /// ```
    /// void glGetVertexAttribLdv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribLdv(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribLdv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribLdv");
        try { Handles.MH_glGetVertexAttribLdv.invokeExact(handles.PFN_glGetVertexAttribLdv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribLdv", e); }
    }

    /// ```
    /// void glViewportArrayv((unsigned int) GLuint first, (int) GLsizei count, const GLfloat* v);
    /// ```
    public void ViewportArrayv(int first, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportArrayv)) throw new SymbolNotFoundError("Symbol not found: glViewportArrayv");
        try { Handles.MH_glViewportArrayv.invokeExact(handles.PFN_glViewportArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportArrayv", e); }
    }

    /// ```
    /// void glViewportIndexedf((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat w, ((float) khronos_float_t) GLfloat h);
    /// ```
    public void ViewportIndexedf(int index, float x, float y, float w, float h) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportIndexedf)) throw new SymbolNotFoundError("Symbol not found: glViewportIndexedf");
        try { Handles.MH_glViewportIndexedf.invokeExact(handles.PFN_glViewportIndexedf, index, x, y, w, h); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportIndexedf", e); }
    }

    /// ```
    /// void glViewportIndexedfv((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void ViewportIndexedfv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportIndexedfv)) throw new SymbolNotFoundError("Symbol not found: glViewportIndexedfv");
        try { Handles.MH_glViewportIndexedfv.invokeExact(handles.PFN_glViewportIndexedfv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportIndexedfv", e); }
    }

    /// ```
    /// void glScissorArrayv((unsigned int) GLuint first, (int) GLsizei count, const GLint* v);
    /// ```
    public void ScissorArrayv(int first, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorArrayv)) throw new SymbolNotFoundError("Symbol not found: glScissorArrayv");
        try { Handles.MH_glScissorArrayv.invokeExact(handles.PFN_glScissorArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorArrayv", e); }
    }

    /// ```
    /// void glScissorIndexed((unsigned int) GLuint index, (int) GLint left, (int) GLint bottom, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void ScissorIndexed(int index, int left, int bottom, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorIndexed)) throw new SymbolNotFoundError("Symbol not found: glScissorIndexed");
        try { Handles.MH_glScissorIndexed.invokeExact(handles.PFN_glScissorIndexed, index, left, bottom, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorIndexed", e); }
    }

    /// ```
    /// void glScissorIndexedv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void ScissorIndexedv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glScissorIndexedv)) throw new SymbolNotFoundError("Symbol not found: glScissorIndexedv");
        try { Handles.MH_glScissorIndexedv.invokeExact(handles.PFN_glScissorIndexedv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in ScissorIndexedv", e); }
    }

    /// ```
    /// void glDepthRangeArrayv((unsigned int) GLuint first, (int) GLsizei count, const GLdouble* v);
    /// ```
    public void DepthRangeArrayv(int first, int count, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangeArrayv)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeArrayv");
        try { Handles.MH_glDepthRangeArrayv.invokeExact(handles.PFN_glDepthRangeArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangeArrayv", e); }
    }

    /// ```
    /// void glDepthRangeIndexed((unsigned int) GLuint index, (double) GLdouble n, (double) GLdouble f);
    /// ```
    public void DepthRangeIndexed(int index, double n, double f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangeIndexed)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeIndexed");
        try { Handles.MH_glDepthRangeIndexed.invokeExact(handles.PFN_glDepthRangeIndexed, index, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangeIndexed", e); }
    }

    /// ```
    /// void glGetFloati_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* data);
    /// ```
    public void GetFloati_v(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFloati_v)) throw new SymbolNotFoundError("Symbol not found: glGetFloati_v");
        try { Handles.MH_glGetFloati_v.invokeExact(handles.PFN_glGetFloati_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetFloati_v", e); }
    }

    /// ```
    /// void glGetDoublei_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* data);
    /// ```
    public void GetDoublei_v(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDoublei_v)) throw new SymbolNotFoundError("Symbol not found: glGetDoublei_v");
        try { Handles.MH_glGetDoublei_v.invokeExact(handles.PFN_glGetDoublei_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetDoublei_v", e); }
    }

}
