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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMinSampleShading = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glBlendEquationi = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBlendEquationSeparatei = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBlendFunci = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBlendFuncSeparatei = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawArraysIndirect = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDrawElementsIndirect = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform1d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform2d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform3d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform4d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glUniform1dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2x3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2x4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3x2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3x4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4x2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4x3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformdv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSubroutineUniformLocation = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSubroutineIndex = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveSubroutineUniformiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveSubroutineUniformName = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveSubroutineName = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformSubroutinesuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformSubroutineuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetProgramStageiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPatchParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPatchParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBindTransformFeedback = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteTransformFeedbacks = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenTransformFeedbacks = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsTransformFeedback = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPauseTransformFeedback = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glResumeTransformFeedback = FunctionDescriptor.ofVoid();
        public static final FunctionDescriptor FD_glDrawTransformFeedback = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawTransformFeedbackStream = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBeginQueryIndexed = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndQueryIndexed = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetQueryIndexediv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glMinSampleShading = RuntimeHelper.downcall(Descriptors.FD_glMinSampleShading);
        public static final MethodHandle MH_glBlendEquationi = RuntimeHelper.downcall(Descriptors.FD_glBlendEquationi);
        public static final MethodHandle MH_glBlendEquationSeparatei = RuntimeHelper.downcall(Descriptors.FD_glBlendEquationSeparatei);
        public static final MethodHandle MH_glBlendFunci = RuntimeHelper.downcall(Descriptors.FD_glBlendFunci);
        public static final MethodHandle MH_glBlendFuncSeparatei = RuntimeHelper.downcall(Descriptors.FD_glBlendFuncSeparatei);
        public static final MethodHandle MH_glDrawArraysIndirect = RuntimeHelper.downcall(Descriptors.FD_glDrawArraysIndirect);
        public static final MethodHandle MH_glDrawElementsIndirect = RuntimeHelper.downcall(Descriptors.FD_glDrawElementsIndirect);
        public static final MethodHandle MH_glUniform1d = RuntimeHelper.downcall(Descriptors.FD_glUniform1d);
        public static final MethodHandle MH_glUniform2d = RuntimeHelper.downcall(Descriptors.FD_glUniform2d);
        public static final MethodHandle MH_glUniform3d = RuntimeHelper.downcall(Descriptors.FD_glUniform3d);
        public static final MethodHandle MH_glUniform4d = RuntimeHelper.downcall(Descriptors.FD_glUniform4d);
        public static final MethodHandle MH_glUniform1dv = RuntimeHelper.downcall(Descriptors.FD_glUniform1dv);
        public static final MethodHandle MH_glUniform2dv = RuntimeHelper.downcall(Descriptors.FD_glUniform2dv);
        public static final MethodHandle MH_glUniform3dv = RuntimeHelper.downcall(Descriptors.FD_glUniform3dv);
        public static final MethodHandle MH_glUniform4dv = RuntimeHelper.downcall(Descriptors.FD_glUniform4dv);
        public static final MethodHandle MH_glUniformMatrix2dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2dv);
        public static final MethodHandle MH_glUniformMatrix3dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3dv);
        public static final MethodHandle MH_glUniformMatrix4dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4dv);
        public static final MethodHandle MH_glUniformMatrix2x3dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2x3dv);
        public static final MethodHandle MH_glUniformMatrix2x4dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2x4dv);
        public static final MethodHandle MH_glUniformMatrix3x2dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3x2dv);
        public static final MethodHandle MH_glUniformMatrix3x4dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3x4dv);
        public static final MethodHandle MH_glUniformMatrix4x2dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4x2dv);
        public static final MethodHandle MH_glUniformMatrix4x3dv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4x3dv);
        public static final MethodHandle MH_glGetUniformdv = RuntimeHelper.downcall(Descriptors.FD_glGetUniformdv);
        public static final MethodHandle MH_glGetSubroutineUniformLocation = RuntimeHelper.downcall(Descriptors.FD_glGetSubroutineUniformLocation);
        public static final MethodHandle MH_glGetSubroutineIndex = RuntimeHelper.downcall(Descriptors.FD_glGetSubroutineIndex);
        public static final MethodHandle MH_glGetActiveSubroutineUniformiv = RuntimeHelper.downcall(Descriptors.FD_glGetActiveSubroutineUniformiv);
        public static final MethodHandle MH_glGetActiveSubroutineUniformName = RuntimeHelper.downcall(Descriptors.FD_glGetActiveSubroutineUniformName);
        public static final MethodHandle MH_glGetActiveSubroutineName = RuntimeHelper.downcall(Descriptors.FD_glGetActiveSubroutineName);
        public static final MethodHandle MH_glUniformSubroutinesuiv = RuntimeHelper.downcall(Descriptors.FD_glUniformSubroutinesuiv);
        public static final MethodHandle MH_glGetUniformSubroutineuiv = RuntimeHelper.downcall(Descriptors.FD_glGetUniformSubroutineuiv);
        public static final MethodHandle MH_glGetProgramStageiv = RuntimeHelper.downcall(Descriptors.FD_glGetProgramStageiv);
        public static final MethodHandle MH_glPatchParameteri = RuntimeHelper.downcall(Descriptors.FD_glPatchParameteri);
        public static final MethodHandle MH_glPatchParameterfv = RuntimeHelper.downcall(Descriptors.FD_glPatchParameterfv);
        public static final MethodHandle MH_glBindTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glBindTransformFeedback);
        public static final MethodHandle MH_glDeleteTransformFeedbacks = RuntimeHelper.downcall(Descriptors.FD_glDeleteTransformFeedbacks);
        public static final MethodHandle MH_glGenTransformFeedbacks = RuntimeHelper.downcall(Descriptors.FD_glGenTransformFeedbacks);
        public static final MethodHandle MH_glIsTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glIsTransformFeedback);
        public static final MethodHandle MH_glPauseTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glPauseTransformFeedback);
        public static final MethodHandle MH_glResumeTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glResumeTransformFeedback);
        public static final MethodHandle MH_glDrawTransformFeedback = RuntimeHelper.downcall(Descriptors.FD_glDrawTransformFeedback);
        public static final MethodHandle MH_glDrawTransformFeedbackStream = RuntimeHelper.downcall(Descriptors.FD_glDrawTransformFeedbackStream);
        public static final MethodHandle MH_glBeginQueryIndexed = RuntimeHelper.downcall(Descriptors.FD_glBeginQueryIndexed);
        public static final MethodHandle MH_glEndQueryIndexed = RuntimeHelper.downcall(Descriptors.FD_glEndQueryIndexed);
        public static final MethodHandle MH_glGetQueryIndexediv = RuntimeHelper.downcall(Descriptors.FD_glGetQueryIndexediv);
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

    public void MinSampleShading(@CType("GLfloat") float value) {
        if (Unmarshal.isNullPointer(handles.PFN_glMinSampleShading)) throw new SymbolNotFoundError("Symbol not found: glMinSampleShading");
        try { Handles.MH_glMinSampleShading.invokeExact(handles.PFN_glMinSampleShading, value); }
        catch (Throwable e) { throw new RuntimeException("error in glMinSampleShading", e); }
    }

    public void BlendEquationi(@CType("GLuint") int buf, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendEquationi)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationi");
        try { Handles.MH_glBlendEquationi.invokeExact(handles.PFN_glBlendEquationi, buf, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationi", e); }
    }

    public void BlendEquationSeparatei(@CType("GLuint") int buf, @CType("GLenum") int modeRGB, @CType("GLenum") int modeAlpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendEquationSeparatei)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationSeparatei");
        try { Handles.MH_glBlendEquationSeparatei.invokeExact(handles.PFN_glBlendEquationSeparatei, buf, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationSeparatei", e); }
    }

    public void BlendFunci(@CType("GLuint") int buf, @CType("GLenum") int src, @CType("GLenum") int dst) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendFunci)) throw new SymbolNotFoundError("Symbol not found: glBlendFunci");
        try { Handles.MH_glBlendFunci.invokeExact(handles.PFN_glBlendFunci, buf, src, dst); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFunci", e); }
    }

    public void BlendFuncSeparatei(@CType("GLuint") int buf, @CType("GLenum") int srcRGB, @CType("GLenum") int dstRGB, @CType("GLenum") int srcAlpha, @CType("GLenum") int dstAlpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendFuncSeparatei)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparatei");
        try { Handles.MH_glBlendFuncSeparatei.invokeExact(handles.PFN_glBlendFuncSeparatei, buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFuncSeparatei", e); }
    }

    public void DrawArraysIndirect(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysIndirect)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysIndirect");
        try { Handles.MH_glDrawArraysIndirect.invokeExact(handles.PFN_glDrawArraysIndirect, mode, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysIndirect", e); }
    }

    public void DrawElementsIndirect(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsIndirect)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsIndirect");
        try { Handles.MH_glDrawElementsIndirect.invokeExact(handles.PFN_glDrawElementsIndirect, mode, type, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsIndirect", e); }
    }

    public void Uniform1d(@CType("GLint") int location, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1d)) throw new SymbolNotFoundError("Symbol not found: glUniform1d");
        try { Handles.MH_glUniform1d.invokeExact(handles.PFN_glUniform1d, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1d", e); }
    }

    public void Uniform2d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2d)) throw new SymbolNotFoundError("Symbol not found: glUniform2d");
        try { Handles.MH_glUniform2d.invokeExact(handles.PFN_glUniform2d, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2d", e); }
    }

    public void Uniform3d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3d)) throw new SymbolNotFoundError("Symbol not found: glUniform3d");
        try { Handles.MH_glUniform3d.invokeExact(handles.PFN_glUniform3d, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3d", e); }
    }

    public void Uniform4d(@CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4d)) throw new SymbolNotFoundError("Symbol not found: glUniform4d");
        try { Handles.MH_glUniform4d.invokeExact(handles.PFN_glUniform4d, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4d", e); }
    }

    public void Uniform1dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1dv)) throw new SymbolNotFoundError("Symbol not found: glUniform1dv");
        try { Handles.MH_glUniform1dv.invokeExact(handles.PFN_glUniform1dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1dv", e); }
    }

    public void Uniform2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2dv)) throw new SymbolNotFoundError("Symbol not found: glUniform2dv");
        try { Handles.MH_glUniform2dv.invokeExact(handles.PFN_glUniform2dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2dv", e); }
    }

    public void Uniform3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3dv)) throw new SymbolNotFoundError("Symbol not found: glUniform3dv");
        try { Handles.MH_glUniform3dv.invokeExact(handles.PFN_glUniform3dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3dv", e); }
    }

    public void Uniform4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4dv)) throw new SymbolNotFoundError("Symbol not found: glUniform4dv");
        try { Handles.MH_glUniform4dv.invokeExact(handles.PFN_glUniform4dv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4dv", e); }
    }

    public void UniformMatrix2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2dv");
        try { Handles.MH_glUniformMatrix2dv.invokeExact(handles.PFN_glUniformMatrix2dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2dv", e); }
    }

    public void UniformMatrix3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3dv");
        try { Handles.MH_glUniformMatrix3dv.invokeExact(handles.PFN_glUniformMatrix3dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3dv", e); }
    }

    public void UniformMatrix4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4dv");
        try { Handles.MH_glUniformMatrix4dv.invokeExact(handles.PFN_glUniformMatrix4dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4dv", e); }
    }

    public void UniformMatrix2x3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2x3dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2x3dv");
        try { Handles.MH_glUniformMatrix2x3dv.invokeExact(handles.PFN_glUniformMatrix2x3dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x3dv", e); }
    }

    public void UniformMatrix2x4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2x4dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2x4dv");
        try { Handles.MH_glUniformMatrix2x4dv.invokeExact(handles.PFN_glUniformMatrix2x4dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2x4dv", e); }
    }

    public void UniformMatrix3x2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3x2dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3x2dv");
        try { Handles.MH_glUniformMatrix3x2dv.invokeExact(handles.PFN_glUniformMatrix3x2dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x2dv", e); }
    }

    public void UniformMatrix3x4dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3x4dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3x4dv");
        try { Handles.MH_glUniformMatrix3x4dv.invokeExact(handles.PFN_glUniformMatrix3x4dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3x4dv", e); }
    }

    public void UniformMatrix4x2dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4x2dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4x2dv");
        try { Handles.MH_glUniformMatrix4x2dv.invokeExact(handles.PFN_glUniformMatrix4x2dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x2dv", e); }
    }

    public void UniformMatrix4x3dv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4x3dv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4x3dv");
        try { Handles.MH_glUniformMatrix4x3dv.invokeExact(handles.PFN_glUniformMatrix4x3dv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4x3dv", e); }
    }

    public void GetUniformdv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformdv)) throw new SymbolNotFoundError("Symbol not found: glGetUniformdv");
        try { Handles.MH_glGetUniformdv.invokeExact(handles.PFN_glGetUniformdv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformdv", e); }
    }

    public @CType("GLint") int GetSubroutineUniformLocation(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSubroutineUniformLocation)) throw new SymbolNotFoundError("Symbol not found: glGetSubroutineUniformLocation");
        try { return (int) Handles.MH_glGetSubroutineUniformLocation.invokeExact(handles.PFN_glGetSubroutineUniformLocation, program, shadertype, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSubroutineUniformLocation", e); }
    }

    public @CType("GLuint") int GetSubroutineIndex(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSubroutineIndex)) throw new SymbolNotFoundError("Symbol not found: glGetSubroutineIndex");
        try { return (int) Handles.MH_glGetSubroutineIndex.invokeExact(handles.PFN_glGetSubroutineIndex, program, shadertype, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSubroutineIndex", e); }
    }

    public void GetActiveSubroutineUniformiv(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveSubroutineUniformiv)) throw new SymbolNotFoundError("Symbol not found: glGetActiveSubroutineUniformiv");
        try { Handles.MH_glGetActiveSubroutineUniformiv.invokeExact(handles.PFN_glGetActiveSubroutineUniformiv, program, shadertype, index, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveSubroutineUniformiv", e); }
    }

    public void GetActiveSubroutineUniformName(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveSubroutineUniformName)) throw new SymbolNotFoundError("Symbol not found: glGetActiveSubroutineUniformName");
        try { Handles.MH_glGetActiveSubroutineUniformName.invokeExact(handles.PFN_glGetActiveSubroutineUniformName, program, shadertype, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveSubroutineUniformName", e); }
    }

    public void GetActiveSubroutineName(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveSubroutineName)) throw new SymbolNotFoundError("Symbol not found: glGetActiveSubroutineName");
        try { Handles.MH_glGetActiveSubroutineName.invokeExact(handles.PFN_glGetActiveSubroutineName, program, shadertype, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveSubroutineName", e); }
    }

    public void UniformSubroutinesuiv(@CType("GLenum") int shadertype, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment indices) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformSubroutinesuiv)) throw new SymbolNotFoundError("Symbol not found: glUniformSubroutinesuiv");
        try { Handles.MH_glUniformSubroutinesuiv.invokeExact(handles.PFN_glUniformSubroutinesuiv, shadertype, count, indices); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformSubroutinesuiv", e); }
    }

    public void GetUniformSubroutineuiv(@CType("GLenum") int shadertype, @CType("GLint") int location, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformSubroutineuiv)) throw new SymbolNotFoundError("Symbol not found: glGetUniformSubroutineuiv");
        try { Handles.MH_glGetUniformSubroutineuiv.invokeExact(handles.PFN_glGetUniformSubroutineuiv, shadertype, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformSubroutineuiv", e); }
    }

    public void GetProgramStageiv(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramStageiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramStageiv");
        try { Handles.MH_glGetProgramStageiv.invokeExact(handles.PFN_glGetProgramStageiv, program, shadertype, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramStageiv", e); }
    }

    public void PatchParameteri(@CType("GLenum") int pname, @CType("GLint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glPatchParameteri)) throw new SymbolNotFoundError("Symbol not found: glPatchParameteri");
        try { Handles.MH_glPatchParameteri.invokeExact(handles.PFN_glPatchParameteri, pname, value); }
        catch (Throwable e) { throw new RuntimeException("error in glPatchParameteri", e); }
    }

    public void PatchParameterfv(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glPatchParameterfv)) throw new SymbolNotFoundError("Symbol not found: glPatchParameterfv");
        try { Handles.MH_glPatchParameterfv.invokeExact(handles.PFN_glPatchParameterfv, pname, values); }
        catch (Throwable e) { throw new RuntimeException("error in glPatchParameterfv", e); }
    }

    public void BindTransformFeedback(@CType("GLenum") int target, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glBindTransformFeedback");
        try { Handles.MH_glBindTransformFeedback.invokeExact(handles.PFN_glBindTransformFeedback, target, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTransformFeedback", e); }
    }

    public void DeleteTransformFeedbacks(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glDeleteTransformFeedbacks");
        try { Handles.MH_glDeleteTransformFeedbacks.invokeExact(handles.PFN_glDeleteTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteTransformFeedbacks", e); }
    }

    public void GenTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glGenTransformFeedbacks");
        try { Handles.MH_glGenTransformFeedbacks.invokeExact(handles.PFN_glGenTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glGenTransformFeedbacks", e); }
    }

    public @CType("GLboolean") boolean IsTransformFeedback(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glIsTransformFeedback");
        try { return (boolean) Handles.MH_glIsTransformFeedback.invokeExact(handles.PFN_glIsTransformFeedback, id); }
        catch (Throwable e) { throw new RuntimeException("error in glIsTransformFeedback", e); }
    }

    public void PauseTransformFeedback() {
        if (Unmarshal.isNullPointer(handles.PFN_glPauseTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glPauseTransformFeedback");
        try { Handles.MH_glPauseTransformFeedback.invokeExact(handles.PFN_glPauseTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in glPauseTransformFeedback", e); }
    }

    public void ResumeTransformFeedback() {
        if (Unmarshal.isNullPointer(handles.PFN_glResumeTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glResumeTransformFeedback");
        try { Handles.MH_glResumeTransformFeedback.invokeExact(handles.PFN_glResumeTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in glResumeTransformFeedback", e); }
    }

    public void DrawTransformFeedback(@CType("GLenum") int mode, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedback)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedback");
        try { Handles.MH_glDrawTransformFeedback.invokeExact(handles.PFN_glDrawTransformFeedback, mode, id); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedback", e); }
    }

    public void DrawTransformFeedbackStream(@CType("GLenum") int mode, @CType("GLuint") int id, @CType("GLuint") int stream) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawTransformFeedbackStream)) throw new SymbolNotFoundError("Symbol not found: glDrawTransformFeedbackStream");
        try { Handles.MH_glDrawTransformFeedbackStream.invokeExact(handles.PFN_glDrawTransformFeedbackStream, mode, id, stream); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTransformFeedbackStream", e); }
    }

    public void BeginQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginQueryIndexed)) throw new SymbolNotFoundError("Symbol not found: glBeginQueryIndexed");
        try { Handles.MH_glBeginQueryIndexed.invokeExact(handles.PFN_glBeginQueryIndexed, target, index, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginQueryIndexed", e); }
    }

    public void EndQueryIndexed(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEndQueryIndexed)) throw new SymbolNotFoundError("Symbol not found: glEndQueryIndexed");
        try { Handles.MH_glEndQueryIndexed.invokeExact(handles.PFN_glEndQueryIndexed, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEndQueryIndexed", e); }
    }

    public void GetQueryIndexediv(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryIndexediv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryIndexediv");
        try { Handles.MH_glGetQueryIndexediv.invokeExact(handles.PFN_glGetQueryIndexediv, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryIndexediv", e); }
    }

    // --- OverrunGL custom code ---
    public int GetSubroutineUniformLocation(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetSubroutineUniformLocation(program, shadertype, Marshal.marshal(__stack, name)); } }
    public int GetSubroutineIndex(@CType("GLuint") int program, @CType("GLenum") int shadertype, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetSubroutineIndex(program, shadertype, Marshal.marshal(__stack, name)); } }
    public void DeleteTransformFeedbacks(int id) { try (var __stack = MemoryStack.pushLocal()) { DeleteTransformFeedbacks(1, __stack.ints(id)); } }
    public int GenTransformFeedbacks() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenTransformFeedbacks(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}
