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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL40 extends GL33 permits GL41 {
    public static final int GL_SAMPLE_SHADING = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;
    public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
    public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 0x900C;
    public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 0x900D;
    public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900E;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;
    public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
    public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
    public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
    public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
    public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
    public static final int GL_DOUBLE_VEC2 = 0x8FFC;
    public static final int GL_DOUBLE_VEC3 = 0x8FFD;
    public static final int GL_DOUBLE_VEC4 = 0x8FFE;
    public static final int GL_DOUBLE_MAT2 = 0x8F46;
    public static final int GL_DOUBLE_MAT3 = 0x8F47;
    public static final int GL_DOUBLE_MAT4 = 0x8F48;
    public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
    public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
    public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
    public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
    public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
    public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
    public static final int GL_ACTIVE_SUBROUTINES = 0x8DE5;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
    public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
    public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
    public static final int GL_MAX_SUBROUTINES = 0x8DE7;
    public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
    public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
    public static final int GL_PATCHES = 0x000E;
    public static final int GL_PATCH_VERTICES = 0x8E72;
    public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
    public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
    public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
    public static final int GL_TESS_GEN_MODE = 0x8E76;
    public static final int GL_TESS_GEN_SPACING = 0x8E77;
    public static final int GL_TESS_GEN_VERTEX_ORDER = 0x8E78;
    public static final int GL_TESS_GEN_POINT_MODE = 0x8E79;
    public static final int GL_ISOLINES = 0x8E7A;
    public static final int GL_QUADS = 0x0007;
    public static final int GL_FRACTIONAL_ODD = 0x8E7B;
    public static final int GL_FRACTIONAL_EVEN = 0x8E7C;
    public static final int GL_MAX_PATCH_VERTICES = 0x8E7D;
    public static final int GL_MAX_TESS_GEN_LEVEL = 0x8E7E;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
    public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
    public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
    public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
    public static final int GL_MAX_TESS_PATCH_COMPONENTS = 0x8E84;
    public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
    public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
    public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
    public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
    public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
    public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
    public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
    public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
    public static final int GL_TESS_EVALUATION_SHADER = 0x8E87;
    public static final int GL_TESS_CONTROL_SHADER = 0x8E88;
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
    public static final MethodHandle MH_glMinSampleShading = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMinSampleShading;
    public static final MethodHandle MH_glBlendEquationi = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendEquationi;
    public static final MethodHandle MH_glBlendEquationSeparatei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendEquationSeparatei;
    public static final MethodHandle MH_glBlendFunci = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendFunci;
    public static final MethodHandle MH_glBlendFuncSeparatei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendFuncSeparatei;
    public static final MethodHandle MH_glDrawArraysIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDrawArraysIndirect;
    public static final MethodHandle MH_glDrawElementsIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDrawElementsIndirect;
    public static final MethodHandle MH_glUniform1d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glUniform1d;
    public static final MethodHandle MH_glUniform2d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glUniform2d;
    public static final MethodHandle MH_glUniform3d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glUniform3d;
    public static final MethodHandle MH_glUniform4d = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glUniform4d;
    public static final MethodHandle MH_glUniform1dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1dv;
    public static final MethodHandle MH_glUniform2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2dv;
    public static final MethodHandle MH_glUniform3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3dv;
    public static final MethodHandle MH_glUniform4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4dv;
    public static final MethodHandle MH_glUniformMatrix2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix2dv;
    public static final MethodHandle MH_glUniformMatrix3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix3dv;
    public static final MethodHandle MH_glUniformMatrix4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix4dv;
    public static final MethodHandle MH_glUniformMatrix2x3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix2x3dv;
    public static final MethodHandle MH_glUniformMatrix2x4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix2x4dv;
    public static final MethodHandle MH_glUniformMatrix3x2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix3x2dv;
    public static final MethodHandle MH_glUniformMatrix3x4dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix3x4dv;
    public static final MethodHandle MH_glUniformMatrix4x2dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix4x2dv;
    public static final MethodHandle MH_glUniformMatrix4x3dv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniformMatrix4x3dv;
    public static final MethodHandle MH_glGetUniformdv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformdv;
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
    public static final MethodHandle MH_glPatchParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPatchParameteri;
    public static final MethodHandle MH_glPatchParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPatchParameterfv;
    public static final MethodHandle MH_glBindTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindTransformFeedback;
    public static final MethodHandle MH_glDeleteTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteTransformFeedbacks;
    public static final MethodHandle MH_glGenTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenTransformFeedbacks;
    public static final MethodHandle MH_glIsTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsTransformFeedback;
    public static final MethodHandle MH_glPauseTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glPauseTransformFeedback;
    public static final MethodHandle MH_glResumeTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glResumeTransformFeedback;
    public static final MethodHandle MH_glDrawTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawTransformFeedback;
    public static final MethodHandle MH_glDrawTransformFeedbackStream = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawTransformFeedbackStream;
    public static final MethodHandle MH_glBeginQueryIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginQueryIndexed;
    public static final MethodHandle MH_glEndQueryIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEndQueryIndexed;
    public static final MethodHandle MH_glGetQueryIndexediv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryIndexediv;

    public GL40(GLLoadFunc func) {
        super(func);
        PFN_glMinSampleShading = func.invoke("glMinSampleShading", "glMinSampleShadingARB", "glMinSampleShadingOES");
        PFN_glBlendEquationi = func.invoke("glBlendEquationi", "glBlendEquationIndexedAMD", "glBlendEquationiARB", "glBlendEquationiEXT", "glBlendEquationiOES");
        PFN_glBlendEquationSeparatei = func.invoke("glBlendEquationSeparatei", "glBlendEquationSeparateIndexedAMD", "glBlendEquationSeparateiARB", "glBlendEquationSeparateiEXT", "glBlendEquationSeparateiOES");
        PFN_glBlendFunci = func.invoke("glBlendFunci", "glBlendFuncIndexedAMD", "glBlendFunciARB", "glBlendFunciEXT", "glBlendFunciOES");
        PFN_glBlendFuncSeparatei = func.invoke("glBlendFuncSeparatei", "glBlendFuncSeparateIndexedAMD", "glBlendFuncSeparateiARB", "glBlendFuncSeparateiEXT", "glBlendFuncSeparateiOES");
        PFN_glDrawArraysIndirect = func.invoke("glDrawArraysIndirect");
        PFN_glDrawElementsIndirect = func.invoke("glDrawElementsIndirect");
        PFN_glUniform1d = func.invoke("glUniform1d");
        PFN_glUniform2d = func.invoke("glUniform2d");
        PFN_glUniform3d = func.invoke("glUniform3d");
        PFN_glUniform4d = func.invoke("glUniform4d");
        PFN_glUniform1dv = func.invoke("glUniform1dv");
        PFN_glUniform2dv = func.invoke("glUniform2dv");
        PFN_glUniform3dv = func.invoke("glUniform3dv");
        PFN_glUniform4dv = func.invoke("glUniform4dv");
        PFN_glUniformMatrix2dv = func.invoke("glUniformMatrix2dv");
        PFN_glUniformMatrix3dv = func.invoke("glUniformMatrix3dv");
        PFN_glUniformMatrix4dv = func.invoke("glUniformMatrix4dv");
        PFN_glUniformMatrix2x3dv = func.invoke("glUniformMatrix2x3dv");
        PFN_glUniformMatrix2x4dv = func.invoke("glUniformMatrix2x4dv");
        PFN_glUniformMatrix3x2dv = func.invoke("glUniformMatrix3x2dv");
        PFN_glUniformMatrix3x4dv = func.invoke("glUniformMatrix3x4dv");
        PFN_glUniformMatrix4x2dv = func.invoke("glUniformMatrix4x2dv");
        PFN_glUniformMatrix4x3dv = func.invoke("glUniformMatrix4x3dv");
        PFN_glGetUniformdv = func.invoke("glGetUniformdv");
        PFN_glGetSubroutineUniformLocation = func.invoke("glGetSubroutineUniformLocation");
        PFN_glGetSubroutineIndex = func.invoke("glGetSubroutineIndex");
        PFN_glGetActiveSubroutineUniformiv = func.invoke("glGetActiveSubroutineUniformiv");
        PFN_glGetActiveSubroutineUniformName = func.invoke("glGetActiveSubroutineUniformName");
        PFN_glGetActiveSubroutineName = func.invoke("glGetActiveSubroutineName");
        PFN_glUniformSubroutinesuiv = func.invoke("glUniformSubroutinesuiv");
        PFN_glGetUniformSubroutineuiv = func.invoke("glGetUniformSubroutineuiv");
        PFN_glGetProgramStageiv = func.invoke("glGetProgramStageiv");
        PFN_glPatchParameteri = func.invoke("glPatchParameteri", "glPatchParameteriEXT", "glPatchParameteriOES");
        PFN_glPatchParameterfv = func.invoke("glPatchParameterfv");
        PFN_glBindTransformFeedback = func.invoke("glBindTransformFeedback");
        PFN_glDeleteTransformFeedbacks = func.invoke("glDeleteTransformFeedbacks", "glDeleteTransformFeedbacksNV");
        PFN_glGenTransformFeedbacks = func.invoke("glGenTransformFeedbacks", "glGenTransformFeedbacksNV");
        PFN_glIsTransformFeedback = func.invoke("glIsTransformFeedback", "glIsTransformFeedbackNV");
        PFN_glPauseTransformFeedback = func.invoke("glPauseTransformFeedback", "glPauseTransformFeedbackNV");
        PFN_glResumeTransformFeedback = func.invoke("glResumeTransformFeedback", "glResumeTransformFeedbackNV");
        PFN_glDrawTransformFeedback = func.invoke("glDrawTransformFeedback", "glDrawTransformFeedbackEXT", "glDrawTransformFeedbackNV");
        PFN_glDrawTransformFeedbackStream = func.invoke("glDrawTransformFeedbackStream");
        PFN_glBeginQueryIndexed = func.invoke("glBeginQueryIndexed");
        PFN_glEndQueryIndexed = func.invoke("glEndQueryIndexed");
        PFN_glGetQueryIndexediv = func.invoke("glGetQueryIndexediv");
    }

    public void MinSampleShading(@CType("GLfloat") float value) {
        try { if (!Unmarshal.isNullPointer(PFN_glMinSampleShading))
            MH_glMinSampleShading.invokeExact(PFN_glMinSampleShading, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMinSampleShading", e); }
    }

    public void BlendEquationi(@CType("GLuint") int buf, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlendEquationi))
            MH_glBlendEquationi.invokeExact(PFN_glBlendEquationi, buf, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationi", e); }
    }

    public void BlendEquationSeparatei(@CType("GLuint") int buf, @CType("GLenum") int modeRGB, @CType("GLenum") int modeAlpha) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlendEquationSeparatei))
            MH_glBlendEquationSeparatei.invokeExact(PFN_glBlendEquationSeparatei, buf, modeRGB, modeAlpha);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationSeparatei", e); }
    }

    public void BlendFunci(@CType("GLuint") int buf, @CType("GLenum") int src, @CType("GLenum") int dst) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlendFunci))
            MH_glBlendFunci.invokeExact(PFN_glBlendFunci, buf, src, dst);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFunci", e); }
    }

    public void BlendFuncSeparatei(@CType("GLuint") int buf, @CType("GLenum") int srcRGB, @CType("GLenum") int dstRGB, @CType("GLenum") int srcAlpha, @CType("GLenum") int dstAlpha) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlendFuncSeparatei))
            MH_glBlendFuncSeparatei.invokeExact(PFN_glBlendFuncSeparatei, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFuncSeparatei", e); }
    }

    public void DrawArraysIndirect(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawArraysIndirect))
            MH_glDrawArraysIndirect.invokeExact(PFN_glDrawArraysIndirect, mode, indirect);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysIndirect", e); }
    }

    public void DrawElementsIndirect(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawElementsIndirect))
            MH_glDrawElementsIndirect.invokeExact(PFN_glDrawElementsIndirect, mode, type, indirect);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsIndirect", e); }
    }

    public void Uniform1d(@CType("GLint") int location, @CType("GLdouble") double x) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1d))
            MH_glUniform1d.invokeExact(PFN_glUniform1d, location, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1d", e); }
    }

    public void Uniform2d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2d))
            MH_glUniform2d.invokeExact(PFN_glUniform2d, location, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2d", e); }
    }

    public void Uniform3d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3d))
            MH_glUniform3d.invokeExact(PFN_glUniform3d, location, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3d", e); }
    }

    public void Uniform4d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4d))
            MH_glUniform4d.invokeExact(PFN_glUniform4d, location, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4d", e); }
    }

    public void Uniform1dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1dv))
            MH_glUniform1dv.invokeExact(PFN_glUniform1dv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1dv", e); }
    }

    public void Uniform2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2dv))
            MH_glUniform2dv.invokeExact(PFN_glUniform2dv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2dv", e); }
    }

    public void Uniform3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3dv))
            MH_glUniform3dv.invokeExact(PFN_glUniform3dv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3dv", e); }
    }

    public void Uniform4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4dv))
            MH_glUniform4dv.invokeExact(PFN_glUniform4dv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4dv", e); }
    }

    public void UniformMatrix2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix2dv))
            MH_glUniformMatrix2dv.invokeExact(PFN_glUniformMatrix2dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2dv", e); }
    }

    public void UniformMatrix3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix3dv))
            MH_glUniformMatrix3dv.invokeExact(PFN_glUniformMatrix3dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3dv", e); }
    }

    public void UniformMatrix4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix4dv))
            MH_glUniformMatrix4dv.invokeExact(PFN_glUniformMatrix4dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4dv", e); }
    }

    public void UniformMatrix2x3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix2x3dv))
            MH_glUniformMatrix2x3dv.invokeExact(PFN_glUniformMatrix2x3dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x3dv", e); }
    }

    public void UniformMatrix2x4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix2x4dv))
            MH_glUniformMatrix2x4dv.invokeExact(PFN_glUniformMatrix2x4dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x4dv", e); }
    }

    public void UniformMatrix3x2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix3x2dv))
            MH_glUniformMatrix3x2dv.invokeExact(PFN_glUniformMatrix3x2dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x2dv", e); }
    }

    public void UniformMatrix3x4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix3x4dv))
            MH_glUniformMatrix3x4dv.invokeExact(PFN_glUniformMatrix3x4dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x4dv", e); }
    }

    public void UniformMatrix4x2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix4x2dv))
            MH_glUniformMatrix4x2dv.invokeExact(PFN_glUniformMatrix4x2dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x2dv", e); }
    }

    public void UniformMatrix4x3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniformMatrix4x3dv))
            MH_glUniformMatrix4x3dv.invokeExact(PFN_glUniformMatrix4x3dv, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x3dv", e); }
    }

    public void GetUniformdv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformdv))
            MH_glGetUniformdv.invokeExact(PFN_glGetUniformdv, program, location, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformdv", e); }
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

    public void PatchParameteri(@CType("GLenum") int pname, @CType("GLint") int value) {
        try { if (!Unmarshal.isNullPointer(PFN_glPatchParameteri))
            MH_glPatchParameteri.invokeExact(PFN_glPatchParameteri, pname, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPatchParameteri", e); }
    }

    public void PatchParameterfv(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glPatchParameterfv))
            MH_glPatchParameterfv.invokeExact(PFN_glPatchParameterfv, pname, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPatchParameterfv", e); }
    }

    public void BindTransformFeedback(@CType("GLenum") int target, @CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindTransformFeedback))
            MH_glBindTransformFeedback.invokeExact(PFN_glBindTransformFeedback, target, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindTransformFeedback", e); }
    }

    public void DeleteTransformFeedbacks(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteTransformFeedbacks))
            MH_glDeleteTransformFeedbacks.invokeExact(PFN_glDeleteTransformFeedbacks, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteTransformFeedbacks", e); }
    }

    public void GenTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenTransformFeedbacks))
            MH_glGenTransformFeedbacks.invokeExact(PFN_glGenTransformFeedbacks, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenTransformFeedbacks", e); }
    }

    public @CType("GLboolean") boolean IsTransformFeedback(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsTransformFeedback))
            return (boolean) MH_glIsTransformFeedback.invokeExact(PFN_glIsTransformFeedback, id);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsTransformFeedback", e); }
    }

    public void PauseTransformFeedback() {
        try { if (!Unmarshal.isNullPointer(PFN_glPauseTransformFeedback))
            MH_glPauseTransformFeedback.invokeExact(PFN_glPauseTransformFeedback);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPauseTransformFeedback", e); }
    }

    public void ResumeTransformFeedback() {
        try { if (!Unmarshal.isNullPointer(PFN_glResumeTransformFeedback))
            MH_glResumeTransformFeedback.invokeExact(PFN_glResumeTransformFeedback);
        }
        catch (Throwable e) { throw new RuntimeException("error in glResumeTransformFeedback", e); }
    }

    public void DrawTransformFeedback(@CType("GLenum") int mode, @CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawTransformFeedback))
            MH_glDrawTransformFeedback.invokeExact(PFN_glDrawTransformFeedback, mode, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedback", e); }
    }

    public void DrawTransformFeedbackStream(@CType("GLenum") int mode, @CType("GLuint") int id, @CType("GLuint") int stream) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawTransformFeedbackStream))
            MH_glDrawTransformFeedbackStream.invokeExact(PFN_glDrawTransformFeedbackStream, mode, id, stream);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackStream", e); }
    }

    public void BeginQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginQueryIndexed))
            MH_glBeginQueryIndexed.invokeExact(PFN_glBeginQueryIndexed, target, index, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginQueryIndexed", e); }
    }

    public void EndQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEndQueryIndexed))
            MH_glEndQueryIndexed.invokeExact(PFN_glEndQueryIndexed, target, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndQueryIndexed", e); }
    }

    public void GetQueryIndexediv(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryIndexediv))
            MH_glGetQueryIndexediv.invokeExact(PFN_glGetQueryIndexediv, target, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryIndexediv", e); }
    }

    // --- OverrunGL custom code ---
    public int GetSubroutineUniformLocation(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetSubroutineUniformLocation(program, shadertype, Marshal.marshal(__stack, name)); } }
    public int GetSubroutineIndex(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetSubroutineIndex(program, shadertype, Marshal.marshal(__stack, name)); } }
    public void DeleteTransformFeedbacks(int id) { try (var __stack = MemoryStack.pushLocal()) { DeleteTransformFeedbacks(1, __stack.ints(id)); } }
    public int GenTransformFeedbacks() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenTransformFeedbacks(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}
