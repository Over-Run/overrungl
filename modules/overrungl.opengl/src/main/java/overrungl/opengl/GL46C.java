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

import org.jetbrains.annotations.Nullable;
import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.MemoryStack;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBGLSpirv;
import overrungl.opengl.ext.arb.GLARBIndirectParameters;
import overrungl.opengl.ext.arb.GLARBPipelineStatisticsQuery;
import overrungl.opengl.ext.arb.GLARBTransformFeedbackOverflowQuery;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * The OpenGL 4.6 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBGLSpirv GL_ARB_gl_spirv}</li>
 *     <li>{@linkplain GLARBIndirectParameters GL_ARB_indirect_parameters}</li>
 *     <li>{@linkplain GLARBPipelineStatisticsQuery GL_ARB_pipeline_statistics_query}</li>
 *     <li>GL_ARB_polygon_offset_clamp</li>
 *     <li>{@linkplain GLARBTransformFeedbackOverflowQuery GL_ARB_transform_feedback_overflow_query}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL46C extends DirectAccess {
    int SHADER_BINARY_FORMAT_SPIR_V = 0x9551;
    int SPIR_V_BINARY = 0x9552;
    int PARAMETER_BUFFER = 0x80EE;
    int PARAMETER_BUFFER_BINDING = 0x80EF;
    int CONTEXT_FLAG_NO_ERROR_BIT = 0x00000008;
    int VERTICES_SUBMITTED = 0x82EE;
    int PRIMITIVES_SUBMITTED = 0x82EF;
    int VERTEX_SHADER_INVOCATIONS = 0x82F0;
    int TESS_CONTROL_SHADER_PATCHES = 0x82F1;
    int TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2;
    int GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3;
    int FRAGMENT_SHADER_INVOCATIONS = 0x82F4;
    int COMPUTE_SHADER_INVOCATIONS = 0x82F5;
    int CLIPPING_INPUT_PRIMITIVES = 0x82F6;
    int CLIPPING_OUTPUT_PRIMITIVES = 0x82F7;
    int POLYGON_OFFSET_CLAMP = 0x8E1B;
    int SPIR_V_EXTENSIONS = 0x9553;
    int NUM_SPIR_V_EXTENSIONS = 0x9554;
    int TEXTURE_MAX_ANISOTROPY = 0x84FE;
    int MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;
    int TRANSFORM_FEEDBACK_OVERFLOW = 0x82EC;
    int TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;

    @Entrypoint("glMultiDrawArraysIndirectCount")
    default void multiDrawArraysIndirectCount(int mode, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawElementsIndirectCount")
    default void multiDrawElementsIndirectCount(int mode, int type, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glPolygonOffsetClamp")
    default void polygonOffsetClamp(float factor, float units, float clamp) {
        throw new ContextException();
    }

    @Entrypoint("glSpecializeShader")
    default void specializeShader(int shader, MemorySegment pEntryPoint, int numSpecializationConstants, MemorySegment pConstantIndex, MemorySegment pConstantValue) {
        throw new ContextException();
    }

    @Entrypoint("glSpecializeShader")
    default void specializeShader(SegmentAllocator allocator, int shader, @Nullable String pEntryPoint, int numSpecializationConstants, int @Nullable [] pConstantIndex, int @Nullable [] pConstantValue) {
        throw new ContextException();
    }

    @Skip
    default void specializeShader(int shader, @Nullable String pEntryPoint) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            specializeShader(shader,
                Marshal.marshal(stack, pEntryPoint),
                0,
                MemorySegment.NULL,
                MemorySegment.NULL);
        }
    }
}
