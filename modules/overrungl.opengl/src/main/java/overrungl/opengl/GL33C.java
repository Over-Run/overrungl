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

import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBInstancedArrays;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 3.3 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_blend_func_extended</li>
 *     <li>{@linkplain GLARBInstancedArrays GL_ARB_instanced_arrays}</li>
 *     <li>GL_ARB_sampler_objects</li>
 *     <li>GL_ARB_timer_query</li>
 *     <li>GL_ARB_vertex_type_2_10_10_10_rev</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL33C extends DirectAccess {
    int VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;
    int SRC1_COLOR = 0x88F9;
    int ONE_MINUS_SRC1_COLOR = 0x88FA;
    int ONE_MINUS_SRC1_ALPHA = 0x88FB;
    int MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
    int ANY_SAMPLES_PASSED = 0x8C2F;
    int SAMPLER_BINDING = 0x8919;
    int RGB10_A2UI = 0x906F;
    int TEXTURE_SWIZZLE_R = 0x8E42;
    int TEXTURE_SWIZZLE_G = 0x8E43;
    int TEXTURE_SWIZZLE_B = 0x8E44;
    int TEXTURE_SWIZZLE_A = 0x8E45;
    int TEXTURE_SWIZZLE_RGBA = 0x8E46;
    int TIME_ELAPSED = 0x88BF;
    int TIMESTAMP = 0x8E28;
    int INT_2_10_10_10_REV = 0x8D9F;

    @Entrypoint("glBindFragDataLocationIndexed")
    default void bindFragDataLocationIndexed(int program, int colorNumber, int index, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glBindFragDataLocationIndexed")
    default void bindFragDataLocationIndexed(int program, int colorNumber, int index, String name) {
        throw new ContextException();
    }

    @Entrypoint("glBindSampler")
    default void bindSampler(int unit, int sampler) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteSamplers")
    default void deleteSamplers(int count, MemorySegment samplers) {
        throw new ContextException();
    }

    @Skip
    default void deleteSamplers(int... samplers) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            deleteSamplers(samplers.length, Marshal.marshal(stack, samplers));
        }
    }

    @Entrypoint("glGenSamplers")
    default void genSamplers(int count, MemorySegment samplers) {
        throw new ContextException();
    }

    @Skip
    default void genSamplers(SegmentAllocator allocator, @Ref int[] samplers) {
        final MemorySegment segment = Marshal.marshal(allocator, samplers);
        genSamplers(samplers.length, segment);
        Unmarshal.copy(segment, samplers);
    }

    @Skip
    default int genSamplers() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            genSamplers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetFragDataIndex")
    default int getFragDataIndex(int program, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetFragDataIndex")
    default int getFragDataIndex(int program, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetQueryObjecti64v")
    default void getQueryObjecti64v(int id, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default long getQueryObjecti64v(int id, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_LONG);
            getQueryObjecti64v(id, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetQueryObjectui64v")
    default void getQueryObjectui64v(int id, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default long getQueryObjectui64v(int id, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_LONG);
            getQueryObjectui64v(id, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetSamplerParameterIiv")
    default void getSamplerParameterIiv(int sampler, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetSamplerParameterIiv")
    default void getSamplerParameterIiv(SegmentAllocator allocator, int sampler, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getSamplerParameterIiv(int sampler, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getSamplerParameterIiv(sampler, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetSamplerParameterIuiv")
    default void getSamplerParameterIuiv(int sampler, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetSamplerParameterIuiv")
    default void getSamplerParameterIuiv(SegmentAllocator allocator, int sampler, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getSamplerParameterIuiv(int sampler, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getSamplerParameterIuiv(sampler, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetSamplerParameterfv")
    default void getSamplerParameterfv(int sampler, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetSamplerParameterfv")
    default void getSamplerParameterfv(SegmentAllocator allocator, int sampler, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getSamplerParameterf(int sampler, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_FLOAT);
            getSamplerParameterfv(sampler, pname, seg);
            return seg.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetSamplerParameteriv")
    default void getSamplerParameteriv(int sampler, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetSamplerParameteriv")
    default void getSamplerParameteriv(SegmentAllocator allocator, int sampler, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getSamplerParameteri(int sampler, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getSamplerParameteriv(sampler, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glIsSampler")
    default boolean isSampler(int sampler) {
        throw new ContextException();
    }

    @Entrypoint("glQueryCounter")
    default void queryCounter(int id, int target) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterIiv")
    default void samplerParameterIiv(int sampler, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterIiv")
    default void samplerParameterIiv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterIuiv")
    default void samplerParameterIuiv(int sampler, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterIuiv")
    default void samplerParameterIuiv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterf")
    default void samplerParameterf(int sampler, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterfv")
    default void samplerParameterfv(int sampler, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameterfv")
    default void samplerParameterfv(SegmentAllocator allocator, int sampler, int pname, float[] param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameteri")
    default void samplerParameteri(int sampler, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameteriv")
    default void samplerParameteriv(int sampler, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glSamplerParameteriv")
    default void samplerParameteriv(SegmentAllocator allocator, int sampler, int pname, int[] param) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribDivisor")
    default void vertexAttribDivisor(int index, int divisor) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP1ui")
    default void vertexAttribP1ui(int index, int type, boolean normalized, int value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP1uiv")
    default void vertexAttribP1uiv(int index, int type, boolean normalized, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP1uiv")
    default void vertexAttribP1uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP2ui")
    default void vertexAttribP2ui(int index, int type, boolean normalized, int value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP2uiv")
    default void vertexAttribP2uiv(int index, int type, boolean normalized, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP2uiv")
    default void vertexAttribP2uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP3ui")
    default void vertexAttribP3ui(int index, int type, boolean normalized, int value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP3uiv")
    default void vertexAttribP3uiv(int index, int type, boolean normalized, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP3uiv")
    default void vertexAttribP3uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP4ui")
    default void vertexAttribP4ui(int index, int type, boolean normalized, int value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP4uiv")
    default void vertexAttribP4uiv(int index, int type, boolean normalized, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribP4uiv")
    default void vertexAttribP4uiv(SegmentAllocator allocator, int index, int type, boolean normalized, int[] value) {
        throw new ContextException();
    }
}
