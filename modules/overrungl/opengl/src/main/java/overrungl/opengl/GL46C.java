/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
import overrungl.opengl.ext.arb.GLARBGLSpirv;
import overrungl.opengl.ext.arb.GLARBIndirectParameters;
import overrungl.opengl.ext.arb.GLARBPipelineStatisticsQuery;
import overrungl.opengl.ext.arb.GLARBTransformFeedbackOverflowQuery;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

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
public sealed class GL46C extends GL45C permits GL {
    public static final int SHADER_BINARY_FORMAT_SPIR_V = 0x9551;
    public static final int SPIR_V_BINARY = 0x9552;
    public static final int PARAMETER_BUFFER = 0x80EE;
    public static final int PARAMETER_BUFFER_BINDING = 0x80EF;
    public static final int CONTEXT_FLAG_NO_ERROR_BIT = 0x00000008;
    public static final int VERTICES_SUBMITTED = 0x82EE;
    public static final int PRIMITIVES_SUBMITTED = 0x82EF;
    public static final int VERTEX_SHADER_INVOCATIONS = 0x82F0;
    public static final int TESS_CONTROL_SHADER_PATCHES = 0x82F1;
    public static final int TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2;
    public static final int GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3;
    public static final int FRAGMENT_SHADER_INVOCATIONS = 0x82F4;
    public static final int COMPUTE_SHADER_INVOCATIONS = 0x82F5;
    public static final int CLIPPING_INPUT_PRIMITIVES = 0x82F6;
    public static final int CLIPPING_OUTPUT_PRIMITIVES = 0x82F7;
    public static final int POLYGON_OFFSET_CLAMP = 0x8E1B;
    public static final int SPIR_V_EXTENSIONS = 0x9553;
    public static final int NUM_SPIR_V_EXTENSIONS = 0x9554;
    public static final int TEXTURE_MAX_ANISOTROPY = 0x84FE;
    public static final int MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;
    public static final int TRANSFORM_FEEDBACK_OVERFLOW = 0x82EC;
    public static final int TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glMultiDrawArraysIndirectCount, caps.glMultiDrawElementsIndirectCount, caps.glPolygonOffsetClamp, caps.glSpecializeShader);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glMultiDrawArraysIndirectCount = load.invoke("glMultiDrawArraysIndirectCount", IPJIIV);
        caps.glMultiDrawElementsIndirectCount = load.invoke("glMultiDrawElementsIndirectCount", IIPJIIV);
        caps.glPolygonOffsetClamp = load.invoke("glPolygonOffsetClamp", FFFV);
        caps.glSpecializeShader = load.invoke("glSpecializeShader", IPIPPV);
    }

    public static void multiDrawArraysIndirectCount(int mode, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawArraysIndirectCount).invokeExact(mode, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsIndirectCount(int mode, int type, MemorySegment indirect, long drawCount, int maxDrawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawElementsIndirectCount).invokeExact(mode, type, indirect, drawCount, maxDrawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void polygonOffsetClamp(float factor, float units, float clamp) {
        var caps = getCapabilities();
        try {
            check(caps.glPolygonOffsetClamp).invokeExact(factor, units, clamp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void specializeShader(int shader, MemorySegment pEntryPoint, int numSpecializationConstants, MemorySegment pConstantIndex, MemorySegment pConstantValue) {
        var caps = getCapabilities();
        try {
            check(caps.glSpecializeShader).invokeExact(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void specializeShader(SegmentAllocator allocator, int shader, @Nullable String pEntryPoint, int @Nullable [] pConstantIndex, int @Nullable [] pConstantValue) {
        specializeShader(shader,
            pEntryPoint != null ? allocator.allocateUtf8String(pEntryPoint) : MemorySegment.NULL,
            pConstantIndex != null ? pConstantIndex.length : (pConstantValue != null ? pConstantValue.length : 0),
            pConstantIndex != null ? allocator.allocateArray(ValueLayout.JAVA_INT, pConstantIndex) : MemorySegment.NULL,
            pConstantValue != null ? allocator.allocateArray(ValueLayout.JAVA_INT, pConstantValue) : MemorySegment.NULL);
    }

    public static void specializeShader(SegmentAllocator allocator, int shader, @Nullable String pEntryPoint) {
        specializeShader(shader,
            pEntryPoint != null ? allocator.allocateUtf8String(pEntryPoint) : MemorySegment.NULL,
            0,
            MemorySegment.NULL,
            MemorySegment.NULL);
    }
}
