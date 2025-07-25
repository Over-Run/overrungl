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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;

public class GL40 extends GL33 {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMinSampleShading = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glBlendEquationi = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendEquationSeparatei = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendFunci = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendFuncSeparatei = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawArraysIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDrawElementsIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform1d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform2d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform3d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform4d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glUniform1dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2x3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2x4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3x2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3x4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4x2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4x3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformdv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSubroutineUniformLocation = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSubroutineIndex = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveSubroutineUniformiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveSubroutineUniformName = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveSubroutineName = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformSubroutinesuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformSubroutineuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramStageiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPatchParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPatchParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteTransformFeedbacks = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenTransformFeedbacks = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsTransformFeedback = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPauseTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glResumeTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glDrawTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawTransformFeedbackStream = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginQueryIndexed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndQueryIndexed = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetQueryIndexediv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glMinSampleShading;
        public final MemorySegment PFN_glBlendEquationi;
        public final MemorySegment PFN_glBlendEquationSeparatei;
        public final MemorySegment PFN_glBlendFunci;
        public final MemorySegment PFN_glBlendFuncSeparatei;
        public final MemorySegment PFN_glDrawArraysIndirect;
        public final MemorySegment PFN_glDrawElementsIndirect;
        public final MemorySegment PFN_glUniform1d;
        public final MemorySegment PFN_glUniform2d;
        public final MemorySegment PFN_glUniform3d;
        public final MemorySegment PFN_glUniform4d;
        public final MemorySegment PFN_glUniform1dv;
        public final MemorySegment PFN_glUniform2dv;
        public final MemorySegment PFN_glUniform3dv;
        public final MemorySegment PFN_glUniform4dv;
        public final MemorySegment PFN_glUniformMatrix2dv;
        public final MemorySegment PFN_glUniformMatrix3dv;
        public final MemorySegment PFN_glUniformMatrix4dv;
        public final MemorySegment PFN_glUniformMatrix2x3dv;
        public final MemorySegment PFN_glUniformMatrix2x4dv;
        public final MemorySegment PFN_glUniformMatrix3x2dv;
        public final MemorySegment PFN_glUniformMatrix3x4dv;
        public final MemorySegment PFN_glUniformMatrix4x2dv;
        public final MemorySegment PFN_glUniformMatrix4x3dv;
        public final MemorySegment PFN_glGetUniformdv;
        public final MemorySegment PFN_glGetSubroutineUniformLocation;
        public final MemorySegment PFN_glGetSubroutineIndex;
        public final MemorySegment PFN_glGetActiveSubroutineUniformiv;
        public final MemorySegment PFN_glGetActiveSubroutineUniformName;
        public final MemorySegment PFN_glGetActiveSubroutineName;
        public final MemorySegment PFN_glUniformSubroutinesuiv;
        public final MemorySegment PFN_glGetUniformSubroutineuiv;
        public final MemorySegment PFN_glGetProgramStageiv;
        public final MemorySegment PFN_glPatchParameteri;
        public final MemorySegment PFN_glPatchParameterfv;
        public final MemorySegment PFN_glBindTransformFeedback;
        public final MemorySegment PFN_glDeleteTransformFeedbacks;
        public final MemorySegment PFN_glGenTransformFeedbacks;
        public final MemorySegment PFN_glIsTransformFeedback;
        public final MemorySegment PFN_glPauseTransformFeedback;
        public final MemorySegment PFN_glResumeTransformFeedback;
        public final MemorySegment PFN_glDrawTransformFeedback;
        public final MemorySegment PFN_glDrawTransformFeedbackStream;
        public final MemorySegment PFN_glBeginQueryIndexed;
        public final MemorySegment PFN_glEndQueryIndexed;
        public final MemorySegment PFN_glGetQueryIndexediv;
        private Handles(GLLoadFunc func) {
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
    }

    public GL40(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMinSampleShading(((float) khronos_float_t) GLfloat value);
    /// ```
    public void MinSampleShading(float value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMinSampleShading)) throw new GLSymbolNotFoundError("Symbol not found: glMinSampleShading");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMinSampleShading", value); }
        Handles.MH_glMinSampleShading.invokeExact(handles.PFN_glMinSampleShading, value); }
        catch (Throwable e) { throw new RuntimeException("error in MinSampleShading", e); }
    }

    /// ```
    /// void glBlendEquationi((unsigned int) GLuint buf, (unsigned int) GLenum mode);
    /// ```
    public void BlendEquationi(int buf, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationi)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationi");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationi", buf, mode); }
        Handles.MH_glBlendEquationi.invokeExact(handles.PFN_glBlendEquationi, buf, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationi", e); }
    }

    /// ```
    /// void glBlendEquationSeparatei((unsigned int) GLuint buf, (unsigned int) GLenum modeRGB, (unsigned int) GLenum modeAlpha);
    /// ```
    public void BlendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationSeparatei)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationSeparatei");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationSeparatei", buf, modeRGB, modeAlpha); }
        Handles.MH_glBlendEquationSeparatei.invokeExact(handles.PFN_glBlendEquationSeparatei, buf, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationSeparatei", e); }
    }

    /// ```
    /// void glBlendFunci((unsigned int) GLuint buf, (unsigned int) GLenum src, (unsigned int) GLenum dst);
    /// ```
    public void BlendFunci(int buf, int src, int dst) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFunci)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFunci");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFunci", buf, src, dst); }
        Handles.MH_glBlendFunci.invokeExact(handles.PFN_glBlendFunci, buf, src, dst); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFunci", e); }
    }

    /// ```
    /// void glBlendFuncSeparatei((unsigned int) GLuint buf, (unsigned int) GLenum srcRGB, (unsigned int) GLenum dstRGB, (unsigned int) GLenum srcAlpha, (unsigned int) GLenum dstAlpha);
    /// ```
    public void BlendFuncSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparatei)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncSeparatei");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFuncSeparatei", buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        Handles.MH_glBlendFuncSeparatei.invokeExact(handles.PFN_glBlendFuncSeparatei, buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparatei", e); }
    }

    /// ```
    /// void glDrawArraysIndirect((unsigned int) GLenum mode, const void* indirect);
    /// ```
    public void DrawArraysIndirect(int mode, MemorySegment indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysIndirect", mode, indirect); }
        Handles.MH_glDrawArraysIndirect.invokeExact(handles.PFN_glDrawArraysIndirect, mode, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysIndirect", e); }
    }

    /// ```
    /// void glDrawElementsIndirect((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect);
    /// ```
    public void DrawElementsIndirect(int mode, int type, MemorySegment indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsIndirect", mode, type, indirect); }
        Handles.MH_glDrawElementsIndirect.invokeExact(handles.PFN_glDrawElementsIndirect, mode, type, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsIndirect", e); }
    }

    /// ```
    /// void glUniform1d((int) GLint location, (double) GLdouble x);
    /// ```
    public void Uniform1d(int location, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1d", location, x); }
        Handles.MH_glUniform1d.invokeExact(handles.PFN_glUniform1d, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1d", e); }
    }

    /// ```
    /// void glUniform2d((int) GLint location, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void Uniform2d(int location, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2d", location, x, y); }
        Handles.MH_glUniform2d.invokeExact(handles.PFN_glUniform2d, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2d", e); }
    }

    /// ```
    /// void glUniform3d((int) GLint location, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void Uniform3d(int location, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3d", location, x, y, z); }
        Handles.MH_glUniform3d.invokeExact(handles.PFN_glUniform3d, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3d", e); }
    }

    /// ```
    /// void glUniform4d((int) GLint location, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void Uniform4d(int location, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4d)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4d", location, x, y, z, w); }
        Handles.MH_glUniform4d.invokeExact(handles.PFN_glUniform4d, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4d", e); }
    }

    /// ```
    /// void glUniform1dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform1dv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1dv", location, count, value); }
        Handles.MH_glUniform1dv.invokeExact(handles.PFN_glUniform1dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1dv", e); }
    }

    /// ```
    /// void glUniform2dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform2dv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2dv", location, count, value); }
        Handles.MH_glUniform2dv.invokeExact(handles.PFN_glUniform2dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2dv", e); }
    }

    /// ```
    /// void glUniform3dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform3dv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3dv", location, count, value); }
        Handles.MH_glUniform3dv.invokeExact(handles.PFN_glUniform3dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3dv", e); }
    }

    /// ```
    /// void glUniform4dv((int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void Uniform4dv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4dv", location, count, value); }
        Handles.MH_glUniform4dv.invokeExact(handles.PFN_glUniform4dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4dv", e); }
    }

    /// ```
    /// void glUniformMatrix2dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix2dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2dv.invokeExact(handles.PFN_glUniformMatrix2dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2dv", e); }
    }

    /// ```
    /// void glUniformMatrix3dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix3dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3dv.invokeExact(handles.PFN_glUniformMatrix3dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3dv", e); }
    }

    /// ```
    /// void glUniformMatrix4dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix4dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4dv.invokeExact(handles.PFN_glUniformMatrix4dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4dv", e); }
    }

    /// ```
    /// void glUniformMatrix2x3dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix2x3dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2x3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2x3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2x3dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2x3dv.invokeExact(handles.PFN_glUniformMatrix2x3dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2x3dv", e); }
    }

    /// ```
    /// void glUniformMatrix2x4dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix2x4dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2x4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2x4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2x4dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2x4dv.invokeExact(handles.PFN_glUniformMatrix2x4dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2x4dv", e); }
    }

    /// ```
    /// void glUniformMatrix3x2dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix3x2dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3x2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3x2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3x2dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3x2dv.invokeExact(handles.PFN_glUniformMatrix3x2dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3x2dv", e); }
    }

    /// ```
    /// void glUniformMatrix3x4dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix3x4dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3x4dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3x4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3x4dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3x4dv.invokeExact(handles.PFN_glUniformMatrix3x4dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3x4dv", e); }
    }

    /// ```
    /// void glUniformMatrix4x2dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix4x2dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4x2dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4x2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4x2dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4x2dv.invokeExact(handles.PFN_glUniformMatrix4x2dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4x2dv", e); }
    }

    /// ```
    /// void glUniformMatrix4x3dv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void UniformMatrix4x3dv(int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4x3dv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4x3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4x3dv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4x3dv.invokeExact(handles.PFN_glUniformMatrix4x3dv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4x3dv", e); }
    }

    /// ```
    /// void glGetUniformdv((unsigned int) GLuint program, (int) GLint location, GLdouble* params);
    /// ```
    public void GetUniformdv(int program, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformdv)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformdv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformdv", program, location, params); }
        Handles.MH_glGetUniformdv.invokeExact(handles.PFN_glGetUniformdv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformdv", e); }
    }

    /// ```
    /// (int) GLint glGetSubroutineUniformLocation((unsigned int) GLuint program, (unsigned int) GLenum shadertype, const GLchar* name);
    /// ```
    public int GetSubroutineUniformLocation(int program, int shadertype, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSubroutineUniformLocation)) throw new GLSymbolNotFoundError("Symbol not found: glGetSubroutineUniformLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSubroutineUniformLocation", program, shadertype, name); }
        return (int) Handles.MH_glGetSubroutineUniformLocation.invokeExact(handles.PFN_glGetSubroutineUniformLocation, program, shadertype, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetSubroutineUniformLocation", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetSubroutineIndex((unsigned int) GLuint program, (unsigned int) GLenum shadertype, const GLchar* name);
    /// ```
    public int GetSubroutineIndex(int program, int shadertype, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSubroutineIndex)) throw new GLSymbolNotFoundError("Symbol not found: glGetSubroutineIndex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSubroutineIndex", program, shadertype, name); }
        return (int) Handles.MH_glGetSubroutineIndex.invokeExact(handles.PFN_glGetSubroutineIndex, program, shadertype, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetSubroutineIndex", e); }
    }

    /// ```
    /// void glGetActiveSubroutineUniformiv((unsigned int) GLuint program, (unsigned int) GLenum shadertype, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* values);
    /// ```
    public void GetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveSubroutineUniformiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveSubroutineUniformiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveSubroutineUniformiv", program, shadertype, index, pname, values); }
        Handles.MH_glGetActiveSubroutineUniformiv.invokeExact(handles.PFN_glGetActiveSubroutineUniformiv, program, shadertype, index, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveSubroutineUniformiv", e); }
    }

    /// ```
    /// void glGetActiveSubroutineUniformName((unsigned int) GLuint program, (unsigned int) GLenum shadertype, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetActiveSubroutineUniformName(int program, int shadertype, int index, int bufSize, MemorySegment length, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveSubroutineUniformName)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveSubroutineUniformName");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveSubroutineUniformName", program, shadertype, index, bufSize, length, name); }
        Handles.MH_glGetActiveSubroutineUniformName.invokeExact(handles.PFN_glGetActiveSubroutineUniformName, program, shadertype, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveSubroutineUniformName", e); }
    }

    /// ```
    /// void glGetActiveSubroutineName((unsigned int) GLuint program, (unsigned int) GLenum shadertype, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetActiveSubroutineName(int program, int shadertype, int index, int bufSize, MemorySegment length, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveSubroutineName)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveSubroutineName");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveSubroutineName", program, shadertype, index, bufSize, length, name); }
        Handles.MH_glGetActiveSubroutineName.invokeExact(handles.PFN_glGetActiveSubroutineName, program, shadertype, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveSubroutineName", e); }
    }

    /// ```
    /// void glUniformSubroutinesuiv((unsigned int) GLenum shadertype, (int) GLsizei count, const GLuint* indices);
    /// ```
    public void UniformSubroutinesuiv(int shadertype, int count, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformSubroutinesuiv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformSubroutinesuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformSubroutinesuiv", shadertype, count, indices); }
        Handles.MH_glUniformSubroutinesuiv.invokeExact(handles.PFN_glUniformSubroutinesuiv, shadertype, count, indices); }
        catch (Throwable e) { throw new RuntimeException("error in UniformSubroutinesuiv", e); }
    }

    /// ```
    /// void glGetUniformSubroutineuiv((unsigned int) GLenum shadertype, (int) GLint location, GLuint* params);
    /// ```
    public void GetUniformSubroutineuiv(int shadertype, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformSubroutineuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformSubroutineuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformSubroutineuiv", shadertype, location, params); }
        Handles.MH_glGetUniformSubroutineuiv.invokeExact(handles.PFN_glGetUniformSubroutineuiv, shadertype, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformSubroutineuiv", e); }
    }

    /// ```
    /// void glGetProgramStageiv((unsigned int) GLuint program, (unsigned int) GLenum shadertype, (unsigned int) GLenum pname, GLint* values);
    /// ```
    public void GetProgramStageiv(int program, int shadertype, int pname, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramStageiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramStageiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramStageiv", program, shadertype, pname, values); }
        Handles.MH_glGetProgramStageiv.invokeExact(handles.PFN_glGetProgramStageiv, program, shadertype, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramStageiv", e); }
    }

    /// ```
    /// void glPatchParameteri((unsigned int) GLenum pname, (int) GLint value);
    /// ```
    public void PatchParameteri(int pname, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPatchParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glPatchParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPatchParameteri", pname, value); }
        Handles.MH_glPatchParameteri.invokeExact(handles.PFN_glPatchParameteri, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in PatchParameteri", e); }
    }

    /// ```
    /// void glPatchParameterfv((unsigned int) GLenum pname, const GLfloat* values);
    /// ```
    public void PatchParameterfv(int pname, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPatchParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glPatchParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPatchParameterfv", pname, values); }
        Handles.MH_glPatchParameterfv.invokeExact(handles.PFN_glPatchParameterfv, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in PatchParameterfv", e); }
    }

    /// ```
    /// void glBindTransformFeedback((unsigned int) GLenum target, (unsigned int) GLuint id);
    /// ```
    public void BindTransformFeedback(int target, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glBindTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTransformFeedback", target, id); }
        Handles.MH_glBindTransformFeedback.invokeExact(handles.PFN_glBindTransformFeedback, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in BindTransformFeedback", e); }
    }

    /// ```
    /// void glDeleteTransformFeedbacks((int) GLsizei n, const GLuint* ids);
    /// ```
    public void DeleteTransformFeedbacks(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteTransformFeedbacks)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacks");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteTransformFeedbacks", n, ids); }
        Handles.MH_glDeleteTransformFeedbacks.invokeExact(handles.PFN_glDeleteTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteTransformFeedbacks", e); }
    }

    /// ```
    /// void glGenTransformFeedbacks((int) GLsizei n, GLuint* ids);
    /// ```
    public void GenTransformFeedbacks(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenTransformFeedbacks)) throw new GLSymbolNotFoundError("Symbol not found: glGenTransformFeedbacks");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenTransformFeedbacks", n, ids); }
        Handles.MH_glGenTransformFeedbacks.invokeExact(handles.PFN_glGenTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenTransformFeedbacks", e); }
    }

    /// ```
    /// GLboolean glIsTransformFeedback((unsigned int) GLuint id);
    /// ```
    public boolean IsTransformFeedback(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glIsTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsTransformFeedback", id); }
        return (((byte) Handles.MH_glIsTransformFeedback.invokeExact(handles.PFN_glIsTransformFeedback, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsTransformFeedback", e); }
    }

    /// ```
    /// void glPauseTransformFeedback();
    /// ```
    public void PauseTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPauseTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glPauseTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPauseTransformFeedback"); }
        Handles.MH_glPauseTransformFeedback.invokeExact(handles.PFN_glPauseTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in PauseTransformFeedback", e); }
    }

    /// ```
    /// void glResumeTransformFeedback();
    /// ```
    public void ResumeTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResumeTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glResumeTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResumeTransformFeedback"); }
        Handles.MH_glResumeTransformFeedback.invokeExact(handles.PFN_glResumeTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in ResumeTransformFeedback", e); }
    }

    /// ```
    /// void glDrawTransformFeedback((unsigned int) GLenum mode, (unsigned int) GLuint id);
    /// ```
    public void DrawTransformFeedback(int mode, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedback", mode, id); }
        Handles.MH_glDrawTransformFeedback.invokeExact(handles.PFN_glDrawTransformFeedback, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedback", e); }
    }

    /// ```
    /// void glDrawTransformFeedbackStream((unsigned int) GLenum mode, (unsigned int) GLuint id, (unsigned int) GLuint stream);
    /// ```
    public void DrawTransformFeedbackStream(int mode, int id, int stream) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawTransformFeedbackStream)) throw new GLSymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStream");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawTransformFeedbackStream", mode, id, stream); }
        Handles.MH_glDrawTransformFeedbackStream.invokeExact(handles.PFN_glDrawTransformFeedbackStream, mode, id, stream); }
        catch (Throwable e) { throw new RuntimeException("error in DrawTransformFeedbackStream", e); }
    }

    /// ```
    /// void glBeginQueryIndexed((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint id);
    /// ```
    public void BeginQueryIndexed(int target, int index, int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginQueryIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glBeginQueryIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginQueryIndexed", target, index, id); }
        Handles.MH_glBeginQueryIndexed.invokeExact(handles.PFN_glBeginQueryIndexed, target, index, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginQueryIndexed", e); }
    }

    /// ```
    /// void glEndQueryIndexed((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void EndQueryIndexed(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndQueryIndexed)) throw new GLSymbolNotFoundError("Symbol not found: glEndQueryIndexed");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndQueryIndexed", target, index); }
        Handles.MH_glEndQueryIndexed.invokeExact(handles.PFN_glEndQueryIndexed, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in EndQueryIndexed", e); }
    }

    /// ```
    /// void glGetQueryIndexediv((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetQueryIndexediv(int target, int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryIndexediv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryIndexediv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryIndexediv", target, index, pname, params); }
        Handles.MH_glGetQueryIndexediv.invokeExact(handles.PFN_glGetQueryIndexediv, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryIndexediv", e); }
    }

}
