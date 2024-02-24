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
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 3.2 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_draw_elements_base_vertex</li>
 *     <li>GL_ARB_provoking_vertex</li>
 *     <li>GL_ARB_sync</li>
 *     <li>GL_ARB_texture_multisample</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL32C extends DirectAccess {
    int CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    int CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    int LINES_ADJACENCY = 0x000A;
    int LINE_STRIP_ADJACENCY = 0x000B;
    int TRIANGLES_ADJACENCY = 0x000C;
    int TRIANGLE_STRIP_ADJACENCY = 0x000D;
    int PROGRAM_POINT_SIZE = 0x8642;
    int MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    int FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    int FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    int GEOMETRY_SHADER = 0x8DD9;
    int GEOMETRY_VERTICES_OUT = 0x8916;
    int GEOMETRY_INPUT_TYPE = 0x8917;
    int GEOMETRY_OUTPUT_TYPE = 0x8918;
    int MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    int MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    int MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    int MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    int MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    int MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    int MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    int CONTEXT_PROFILE_MASK = 0x9126;
    int DEPTH_CLAMP = 0x864F;
    int QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    int FIRST_VERTEX_CONVENTION = 0x8E4D;
    int LAST_VERTEX_CONVENTION = 0x8E4E;
    int PROVOKING_VERTEX = 0x8E4F;
    int TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    int MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    int OBJECT_TYPE = 0x9112;
    int SYNC_CONDITION = 0x9113;
    int SYNC_STATUS = 0x9114;
    int SYNC_FLAGS = 0x9115;
    int SYNC_FENCE = 0x9116;
    int SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    int UNSIGNALED = 0x9118;
    int SIGNALED = 0x9119;
    int ALREADY_SIGNALED = 0x911A;
    int TIMEOUT_EXPIRED = 0x911B;
    int CONDITION_SATISFIED = 0x911C;
    int WAIT_FAILED = 0x911D;
    long TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    int SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    int SAMPLE_POSITION = 0x8E50;
    int SAMPLE_MASK = 0x8E51;
    int SAMPLE_MASK_VALUE = 0x8E52;
    int MAX_SAMPLE_MASK_WORDS = 0x8E59;
    int TEXTURE_2D_MULTISAMPLE = 0x9100;
    int PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    int TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    int PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    int TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    int TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    int TEXTURE_SAMPLES = 0x9106;
    int TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    int SAMPLER_2D_MULTISAMPLE = 0x9108;
    int INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    int UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    int SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    int INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    int UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    int MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    int MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    int MAX_INTEGER_SAMPLES = 0x9110;

    @Entrypoint("glClientWaitSync")
    default int clientWaitSync(MemorySegment sync, int flags, long timeout) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteSync")
    default void deleteSync(MemorySegment sync) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsBaseVertex")
    default void drawElementsBaseVertex(int mode, int count, int type, MemorySegment indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsBaseVertex")
    default void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsBaseVertex")
    default void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsBaseVertex")
    default void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertex")
    default void drawElementsInstancedBaseVertex(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertex")
    default void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertex")
    default void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertex")
    default void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElementsBaseVertex")
    default void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, MemorySegment indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElementsBaseVertex")
    default void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, byte[] indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElementsBaseVertex")
    default void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, short[] indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElementsBaseVertex")
    default void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, int[] indices, int baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glFenceSync")
    default MemorySegment fenceSync(int condition, int flags) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferTexture")
    default void framebufferTexture(int target, int attachment, int texture, int level) {
        throw new ContextException();
    }

    @Entrypoint("glGetBufferParameteri64v")
    default void getBufferParameteri64v(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default long getBufferParameteri64v(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.longs(0L);
            getBufferParameteri64v(target, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetInteger64i_v")
    default void getInteger64i_v(int target, int index, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetInteger64i_v")
    default void getInteger64i_v(SegmentAllocator allocator, int target, int index, @Ref long[] data) {
        throw new ContextException();
    }

    @Skip
    default long getInteger64i_v(int target, int index) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.longs(0L);
            getInteger64i_v(target, index, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetInteger64v")
    default void getInteger64v(int pname, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetInteger64v")
    default void getInteger64v(SegmentAllocator allocator, int pname, @Ref long[] data) {
        throw new ContextException();
    }

    @Skip
    default long getInteger64v(int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pData = stack.longs(0L);
            getInteger64v(pname, pData);
            return pData.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetMultisamplefv")
    default void getMultisamplefv(int pname, int index, MemorySegment val) {
        throw new ContextException();
    }

    @Entrypoint("glGetMultisamplefv")
    default void getMultisamplefv(SegmentAllocator allocator, int pname, int index, @Ref float[] val) {
        throw new ContextException();
    }

    @Skip
    default float[] getMultisamplefv(int pname, int index) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            float[] val = new float[2];
            getMultisamplefv(stack, pname, index, val);
            return val;
        }
    }

    @Entrypoint("glGetSynciv")
    default void getSynciv(MemorySegment sync, int pname, int count, MemorySegment length, MemorySegment values) {
        throw new ContextException();
    }

    @Skip
    default void getSynciv(SegmentAllocator allocator, MemorySegment sync, int pname, @Ref int @Nullable [] length, @Ref int[] values) {
        var pLen = Marshal.marshal(allocator, length);
        var pVal = Marshal.marshal(allocator, values);
        getSynciv(sync, pname, values.length, pLen, pVal);
        Unmarshal.copy(pLen, length);
        Unmarshal.copy(pVal, values);
    }

    @Skip
    default int getSynciv(MemorySegment sync, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getSynciv(sync, pname, 1, MemorySegment.NULL, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glIsSync")
    default boolean isSync(MemorySegment sync) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawElementsBaseVertex")
    default void multiDrawElementsBaseVertex(int mode, MemorySegment count, int type, MemorySegment indices, int drawCount, MemorySegment baseVertex) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawElementsBaseVertex")
    default void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, MemorySegment[] indices, int drawCount, int[] baseVertex) {
        throw new ContextException();
    }

    @Skip
    default void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocate(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, Marshal.marshal(allocator, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, Marshal.marshal(allocator, count), type, seg, drawCount, Marshal.marshal(allocator, baseVertex));
    }

    @Skip
    default void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocate(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, Marshal.marshal(allocator, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, Marshal.marshal(allocator, count), type, seg, drawCount, Marshal.marshal(allocator, baseVertex));
    }

    @Skip
    default void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocate(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, Marshal.marshal(allocator, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, Marshal.marshal(allocator, count), type, seg, drawCount, Marshal.marshal(allocator, baseVertex));
    }

    @Entrypoint("glProvokingVertex")
    default void provokingVertex(int mode) {
        throw new ContextException();
    }

    @Entrypoint("glSampleMaski")
    default void sampleMaski(int maskNumber, int mask) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage2DMultisample")
    default void texImage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage3DMultisample")
    default void texImage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        throw new ContextException();
    }

    @Entrypoint("glWaitSync")
    default void waitSync(MemorySegment sync, int flags, long timeout) {
        throw new ContextException();
    }
}
