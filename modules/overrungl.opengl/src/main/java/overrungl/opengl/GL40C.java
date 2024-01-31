/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.opengl;

import overrun.marshal.Marshal;
import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBDrawBuffersBlend;
import overrungl.opengl.ext.arb.GLARBSampleShading;
import overrungl.opengl.ext.arb.GLARBTextureCubeMapArray;
import overrungl.opengl.ext.arb.GLARBTextureGather;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 4.0 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBDrawBuffersBlend GL_ARB_draw_buffers_blend}</li>
 *     <li>GL_ARB_draw_indirect</li>
 *     <li>GL_ARB_gpu_shader_fp64</li>
 *     <li>GL_ARB_shader_subroutine</li>
 *     <li>GL_ARB_tessellation_shader</li>
 *     <li>GL_ARB_transform_feedback2</li>
 *     <li>GL_ARB_transform_feedback3</li>
 *     <li>{@linkplain GLARBSampleShading GL_ARB_sample_shading}</li>
 *     <li>{@linkplain GLARBTextureCubeMapArray GL_ARB_texture_cube_map_array}</li>
 *     <li>{@linkplain GLARBTextureGather GL_ARB_texture_gather}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL40C extends GL33C permits GL41C {
    int SAMPLE_SHADING = 0x8C36;
    int MIN_SAMPLE_SHADING_VALUE = 0x8C37;
    int MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
    int MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
    int TEXTURE_CUBE_MAP_ARRAY = 0x9009;
    int TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
    int PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;
    int SAMPLER_CUBE_MAP_ARRAY = 0x900C;
    int SAMPLER_CUBE_MAP_ARRAY_SHADOW = 0x900D;
    int INT_SAMPLER_CUBE_MAP_ARRAY = 0x900E;
    int UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
    int DRAW_INDIRECT_BUFFER = 0x8F3F;
    int DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
    int GEOMETRY_SHADER_INVOCATIONS = 0x887F;
    int MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
    int MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
    int MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
    int FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
    int MAX_VERTEX_STREAMS = 0x8E71;
    int DOUBLE_VEC2 = 0x8FFC;
    int DOUBLE_VEC3 = 0x8FFD;
    int DOUBLE_VEC4 = 0x8FFE;
    int DOUBLE_MAT2 = 0x8F46;
    int DOUBLE_MAT3 = 0x8F47;
    int DOUBLE_MAT4 = 0x8F48;
    int DOUBLE_MAT2x3 = 0x8F49;
    int DOUBLE_MAT2x4 = 0x8F4A;
    int DOUBLE_MAT3x2 = 0x8F4B;
    int DOUBLE_MAT3x4 = 0x8F4C;
    int DOUBLE_MAT4x2 = 0x8F4D;
    int DOUBLE_MAT4x3 = 0x8F4E;
    int ACTIVE_SUBROUTINES = 0x8DE5;
    int ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
    int ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
    int ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
    int ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
    int MAX_SUBROUTINES = 0x8DE7;
    int MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
    int NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
    int COMPATIBLE_SUBROUTINES = 0x8E4B;
    int PATCHES = 0x000E;
    int PATCH_VERTICES = 0x8E72;
    int PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
    int PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
    int TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
    int TESS_GEN_MODE = 0x8E76;
    int TESS_GEN_SPACING = 0x8E77;
    int TESS_GEN_VERTEX_ORDER = 0x8E78;
    int TESS_GEN_POINT_MODE = 0x8E79;
    int ISOLINES = 0x8E7A;
    int FRACTIONAL_ODD = 0x8E7B;
    int FRACTIONAL_EVEN = 0x8E7C;
    int MAX_PATCH_VERTICES = 0x8E7D;
    int MAX_TESS_GEN_LEVEL = 0x8E7E;
    int MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
    int MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
    int MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
    int MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
    int MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
    int MAX_TESS_PATCH_COMPONENTS = 0x8E84;
    int MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
    int MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
    int MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
    int MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
    int MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
    int MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
    int MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
    int MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
    int UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
    int UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
    int TESS_EVALUATION_SHADER = 0x8E87;
    int TESS_CONTROL_SHADER = 0x8E88;
    int TRANSFORM_FEEDBACK = 0x8E22;
    int TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
    int TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
    int TRANSFORM_FEEDBACK_BINDING = 0x8E25;
    int MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;

    @Entrypoint("glBeginQueryIndexed")
    default void beginQueryIndexed(int target, int index, int id) {
        throw new ContextException();
    }

    @Entrypoint("glBindTransformFeedback")
    default void bindTransformFeedback(int target, int id) {
        throw new ContextException();
    }

    @Entrypoint("glBlendEquationSeparatei")
    default void blendEquationSeparatei(int buf, int modeRGB, int modeAlpha) {
        throw new ContextException();
    }

    @Entrypoint("glBlendEquationi")
    default void blendEquationi(int buf, int mode) {
        throw new ContextException();
    }

    @Entrypoint("glBlendEquationSeparatei")
    default void blendEquationSeparatei(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        throw new ContextException();
    }

    @Entrypoint("glBlendFunci")
    default void blendFunci(int buf, int src, int dst) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteTransformFeedbacks")
    default void deleteTransformFeedbacks(int n, MemorySegment ids) {
        throw new ContextException();
    }

    @Skip
    default void deleteTransformFeedbacks(int... ids) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteTransformFeedbacks(ids.length, Marshal.marshal(stack, ids));
        }
    }

    @Entrypoint("glDrawArraysIndirect")
    default void drawArraysIndirect(int mode, MemorySegment indirect) {
        throw new ContextException();
    }

    @Entrypoint("glDrawArraysIndirect")
    default void drawArraysIndirect(int mode, DrawArraysIndirectCommand indirect) {
        throw new ContextException();
    }

    @Entrypoint("glDrawArraysIndirect")
    default void drawArraysIndirect(SegmentAllocator allocator, int mode, int[] indirect) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsIndirect")
    default void drawElementsIndirect(int mode, int type, MemorySegment indirect) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsIndirect")
    default void drawElementsIndirect(int mode, int type, DrawElementsIndirectCommand indirect) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsIndirect")
    default void drawElementsIndirect(SegmentAllocator allocator, int mode, int type, int[] indirect) {
        throw new ContextException();
    }

    @Entrypoint("glDrawTransformFeedback")
    default void drawTransformFeedback(int mode, int id) {
        throw new ContextException();
    }

    @Entrypoint("glDrawTransformFeedbackStream")
    default void drawTransformFeedbackStream(int mode, int id, int stream) {
        throw new ContextException();
    }

    @Entrypoint("glEndQueryIndexed")
    default void endQueryIndexed(int target, int index) {
        throw new ContextException();
    }

    @Entrypoint("glGenTransformFeedbacks")
    default void genTransformFeedbacks(int n, MemorySegment ids) {
        throw new ContextException();
    }

    @Skip
    default void genTransformFeedbacks(SegmentAllocator allocator, @Ref int[] ids) {
        var seg = Marshal.marshal(allocator, ids);
        genTransformFeedbacks(ids.length, seg);
        Unmarshal.copy(seg, ids);
    }

    @Skip
    default int genTransformFeedbacks() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetActiveSubroutineName")
    default void getActiveSubroutineName(int program, int shaderType, int index, int bufSize, MemorySegment length, MemorySegment name) {
        throw new ContextException();
    }

    @Skip
    default String getActiveSubroutineName(int program, int shaderType, int index, int bufSize) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment length = stack.ints(0);
            var seg = stack.allocate(JAVA_BYTE, bufSize);
            getActiveSubroutineName(program, shaderType, index, bufSize, length, seg);
            return seg.reinterpret(length.get(JAVA_INT, 0L) + 1).getString(0);
        }
    }

    @Entrypoint("glGetActiveSubroutineUniformName")
    default void getActiveSubroutineUniformName(int program, int shaderType, int index, int bufSize, MemorySegment length, MemorySegment name) {
        throw new ContextException();
    }

    @Skip
    default String getActiveSubroutineUniformName(int program, int shaderType, int index, int bufSize) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            final MemorySegment length = stack.ints(0);
            var seg = stack.allocate(JAVA_BYTE, bufSize);
            getActiveSubroutineUniformName(program, shaderType, index, bufSize, length, seg);
            return seg.reinterpret(length.get(JAVA_INT, 0L) + 1).getString(0);
        }
    }

    @Entrypoint("glGetActiveSubroutineUniformiv")
    default void getActiveSubroutineUniformiv(int program, int shaderType, int index, int pname, MemorySegment values) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveSubroutineUniformiv")
    default void getActiveSubroutineUniformiv(SegmentAllocator allocator, int program, int shaderType, int index, int pname, @Ref int[] values) {
        throw new ContextException();
    }

    @Skip
    default int getActiveSubroutineUniformiv(int program, int shaderType, int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getActiveSubroutineUniformiv(program, shaderType, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetProgramStageiv")
    default void getProgramStageiv(int program, int shaderType, int pname, MemorySegment values) {
        throw new ContextException();
    }

    @Skip
    default int getProgramStageiv(int program, int shaderType, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getProgramStageiv(program, shaderType, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetQueryIndexediv")
    default void getQueryIndexediv(int target, int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getQueryIndexediv(int target, int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getQueryIndexediv(target, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetSubroutineIndex")
    default int getSubroutineIndex(int program, int shaderType, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetSubroutineIndex")
    default int getSubroutineIndex(int program, int shaderType, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetSubroutineUniformLocation")
    default int getSubroutineUniformLocation(int program, int shaderType, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetSubroutineUniformLocation")
    default int getSubroutineUniformLocation(int program, int shaderType, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformSubroutineuiv")
    default void getUniformSubroutineuiv(int shaderType, int location, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformSubroutineuiv")
    default void getUniformSubroutineuiv(SegmentAllocator allocator, int shaderType, int location, @Ref int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformdv")
    default void getUniformdv(int program, int location, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformdv")
    default void getUniformdv(SegmentAllocator allocator, int program, int location, @Ref double[] params) {
        throw new ContextException();
    }

    @Skip
    default double getUniformd(int program, int location) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.doubles(0D);
            getUniformdv(program, location, seg);
            return seg.get(JAVA_DOUBLE, 0);
        }
    }

    @Entrypoint("glIsTransformFeedback")
    default boolean isTransformFeedback(int id) {
        throw new ContextException();
    }

    @Entrypoint("glMinSampleShading")
    default void minSampleShading(float value) {
        throw new ContextException();
    }

    @Entrypoint("glPatchParameterfv")
    default void patchParameterfv(int pname, MemorySegment values) {
        throw new ContextException();
    }

    @Entrypoint("glPatchParameterfv")
    default void patchParameterfv(SegmentAllocator allocator, int pname, float[] values) {
        throw new ContextException();
    }

    @Entrypoint("glPatchParameteri")
    default void patchParameteri(int pname, int value) {
        throw new ContextException();
    }

    @Entrypoint("glPauseTransformFeedback")
    default void pauseTransformFeedback() {
        throw new ContextException();
    }

    @Entrypoint("glResumeTransformFeedback")
    default void resumeTransformFeedback() {
        throw new ContextException();
    }

    @Entrypoint("glUniform1d")
    default void uniform1d(int location, double x) {
        throw new ContextException();
    }

    @Entrypoint("glUniform1dv")
    default void uniform1dv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform1dv(SegmentAllocator allocator, int location, double[] value) {
        uniform1dv(location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform2d")
    default void uniform2d(int location, double x, double y) {
        throw new ContextException();
    }

    @Entrypoint("glUniform2dv")
    default void uniform2dv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform2dv(SegmentAllocator allocator, int location, double[] value) {
        uniform2dv(location, value.length >> 1, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform3d")
    default void uniform3d(int location, double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glUniform3dv")
    default void uniform3dv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform3dv(SegmentAllocator allocator, int location, double[] value) {
        uniform3dv(location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform4d")
    default void uniform4d(int location, double x, double y, double z, double w) {
        throw new ContextException();
    }

    @Entrypoint("glUniform4dv")
    default void uniform4dv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform4dv(SegmentAllocator allocator, int location, double[] value) {
        uniform4dv(location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniformMatrix2dv")
    default void uniformMatrix2dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix2dv")
    default void uniformMatrix2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2dv(allocator, location, value.length >> 2, transpose, value);
    }

    @Entrypoint("glUniformMatrix2x3dv")
    default void uniformMatrix2x3dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix2x3dv")
    default void uniformMatrix2x3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix2x3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2x3dv(allocator, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glUniformMatrix2x4dv")
    default void uniformMatrix2x4dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix2x4dv")
    default void uniformMatrix2x4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix2x4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix2x4dv(allocator, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glUniformMatrix3dv")
    default void uniformMatrix3dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix3dv")
    default void uniformMatrix3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3dv(allocator, location, value.length / 9, transpose, value);
    }

    @Entrypoint("glUniformMatrix3x2dv")
    default void uniformMatrix3x2dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix3x2dv")
    default void uniformMatrix3x2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix3x2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3x2dv(allocator, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glUniformMatrix3x4dv")
    default void uniformMatrix3x4dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix3x4dv")
    default void uniformMatrix3x4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix3x4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix3x4dv(allocator, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glUniformMatrix4dv")
    default void uniformMatrix4dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix4dv")
    default void uniformMatrix4dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix4dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4dv(allocator, location, value.length >> 4, transpose, value);
    }

    @Entrypoint("glUniformMatrix4x2dv")
    default void uniformMatrix4x2dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix4x2dv")
    default void uniformMatrix4x2dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix4x2dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4x2dv(allocator, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glUniformMatrix4x3dv")
    default void uniformMatrix4x3dv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix4x3dv")
    default void uniformMatrix4x3dv(SegmentAllocator allocator, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix4x3dv(SegmentAllocator allocator, int location, boolean transpose, double[] value) {
        uniformMatrix4x3dv(allocator, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glUniformSubroutinesuiv")
    default void uniformSubroutinesuiv(int shaderType, int count, MemorySegment indices) {
        throw new ContextException();
    }

    @Skip
    default void uniformSubroutinesuiv(SegmentAllocator allocator, int shaderType, int[] indices) {
        uniformSubroutinesuiv(shaderType, indices.length, Marshal.marshal(allocator, indices));
    }
}
