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

package org.overrun.gl.opengl;

import org.jetbrains.annotations.Nullable;
import org.overrun.gl.RuntimeHelper;
import org.overrun.gl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.gl.FunctionDescriptors.*;

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
public sealed class GL32C extends GL31C permits GL33C {
    public static final int CONTEXT_CORE_PROFILE_BIT = 0x00000001;
    public static final int CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
    public static final int LINES_ADJACENCY = 0x000A;
    public static final int LINE_STRIP_ADJACENCY = 0x000B;
    public static final int TRIANGLES_ADJACENCY = 0x000C;
    public static final int TRIANGLE_STRIP_ADJACENCY = 0x000D;
    public static final int PROGRAM_POINT_SIZE = 0x8642;
    public static final int MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
    public static final int FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
    public static final int FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
    public static final int GEOMETRY_SHADER = 0x8DD9;
    public static final int GEOMETRY_VERTICES_OUT = 0x8916;
    public static final int GEOMETRY_INPUT_TYPE = 0x8917;
    public static final int GEOMETRY_OUTPUT_TYPE = 0x8918;
    public static final int MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
    public static final int MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
    public static final int MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
    public static final int MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
    public static final int MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
    public static final int MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
    public static final int MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
    public static final int CONTEXT_PROFILE_MASK = 0x9126;
    public static final int DEPTH_CLAMP = 0x864F;
    public static final int QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int PROVOKING_VERTEX = 0x8E4F;
    public static final int TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
    public static final int MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int OBJECT_TYPE = 0x9112;
    public static final int SYNC_CONDITION = 0x9113;
    public static final int SYNC_STATUS = 0x9114;
    public static final int SYNC_FLAGS = 0x9115;
    public static final int SYNC_FENCE = 0x9116;
    public static final int SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int UNSIGNALED = 0x9118;
    public static final int SIGNALED = 0x9119;
    public static final int ALREADY_SIGNALED = 0x911A;
    public static final int TIMEOUT_EXPIRED = 0x911B;
    public static final int CONDITION_SATISFIED = 0x911C;
    public static final int WAIT_FAILED = 0x911D;
    public static final long TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    public static final int SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final int SAMPLE_POSITION = 0x8E50;
    public static final int SAMPLE_MASK = 0x8E51;
    public static final int SAMPLE_MASK_VALUE = 0x8E52;
    public static final int MAX_SAMPLE_MASK_WORDS = 0x8E59;
    public static final int TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
    public static final int TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
    public static final int TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int TEXTURE_SAMPLES = 0x9106;
    public static final int TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
    public static final int SAMPLER_2D_MULTISAMPLE = 0x9108;
    public static final int INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
    public static final int UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
    public static final int SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
    public static final int INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
    public static final int UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
    public static final int MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
    public static final int MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
    public static final int MAX_INTEGER_SAMPLES = 0x9110;

    static boolean isSupported(GLCapabilities caps) {
        return GLLoader.checkAll(caps.glClientWaitSync, caps.glDeleteSync, caps.glDrawElementsBaseVertex, caps.glDrawElementsInstancedBaseVertex, caps.glDrawRangeElementsBaseVertex, caps.glFenceSync,
            caps.glFramebufferTexture, caps.glGetBufferParameteri64v, caps.glGetInteger64i_v, caps.glGetInteger64v, caps.glGetMultisamplefv, caps.glGetSynciv,
            caps.glIsSync, caps.glMultiDrawElementsBaseVertex, caps.glProvokingVertex, caps.glSampleMaski, caps.glTexImage2DMultisample, caps.glTexImage3DMultisample,
            caps.glWaitSync);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glClientWaitSync = load.invoke("glClientWaitSync", PIJI);
        caps.glDeleteSync = load.invoke("glDeleteSync", PV);
        caps.glDrawElementsBaseVertex = load.invoke("glDrawElementsBaseVertex", IIIPIV);
        caps.glDrawElementsInstancedBaseVertex = load.invoke("glDrawElementsInstancedBaseVertex", IIIPIIV);
        caps.glDrawRangeElementsBaseVertex = load.invoke("glDrawRangeElementsBaseVertex", IIIIIPIV);
        caps.glFenceSync = load.invoke("glFenceSync", IIP);
        caps.glFramebufferTexture = load.invoke("glFramebufferTexture", IIIIV);
        caps.glGetBufferParameteri64v = load.invoke("glGetBufferParameteri64v", IIPV);
        caps.glGetInteger64i_v = load.invoke("glGetInteger64i_v", IIPV);
        caps.glGetInteger64v = load.invoke("glGetInteger64v", IPV);
        caps.glGetMultisamplefv = load.invoke("glGetMultisamplefv", IIPV);
        caps.glGetSynciv = load.invoke("glGetSynciv", PIIPPV);
        caps.glIsSync = load.invoke("glIsSync", PZ);
        caps.glMultiDrawElementsBaseVertex = load.invoke("glMultiDrawElementsBaseVertex", IPIPIPV);
        caps.glProvokingVertex = load.invoke("glProvokingVertex", IV);
        caps.glSampleMaski = load.invoke("glSampleMaski", IIV);
        caps.glTexImage2DMultisample = load.invoke("glTexImage2DMultisample", IIIIIZV);
        caps.glTexImage3DMultisample = load.invoke("glTexImage3DMultisample", IIIIIIZV);
        caps.glWaitSync = load.invoke("glWaitSync", PIJV);
    }

    public static int clientWaitSync(MemorySegment sync, int flags, long timeout) {
        var caps = GLLoader.getCapabilities();
        try {
            return (int) GLLoader.check(caps.glClientWaitSync).invokeExact(sync, flags, timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteSync(MemorySegment sync) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDeleteSync).invokeExact(sync);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsBaseVertex(int mode, int count, int type, MemorySegment indices, int baseVertex) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDrawElementsBaseVertex).invokeExact(mode, count, type, indices, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), baseVertex);
    }

    public static void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), baseVertex);
    }

    public static void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, allocator.allocateArray(JAVA_INT, indices), baseVertex);
    }

    public static void drawElementsInstancedBaseVertex(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseVertex) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDrawElementsInstancedBaseVertex).invokeExact(mode, count, type, indices, instanceCount, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), instanceCount, baseVertex);
    }

    public static void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), instanceCount, baseVertex);
    }

    public static void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, allocator.allocateArray(JAVA_INT, indices), instanceCount, baseVertex);
    }

    public static void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, MemorySegment indices, int baseVertex) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDrawRangeElementsBaseVertex).invokeExact(mode, start, end, count, type, indices, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, byte[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, allocator.allocateArray(JAVA_BYTE, indices), baseVertex);
    }

    public static void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, short[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, allocator.allocateArray(JAVA_SHORT, indices), baseVertex);
    }

    public static void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, int[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, allocator.allocateArray(JAVA_INT, indices), baseVertex);
    }

    public static MemorySegment fenceSync(int condition, int flags) {
        var caps = GLLoader.getCapabilities();
        try {
            return (MemorySegment) GLLoader.check(caps.glFenceSync).invokeExact(condition, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture(int target, int attachment, int texture, int level) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glFramebufferTexture).invokeExact(target, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBufferParameteri64v(int target, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetBufferParameteri64v).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getBufferParameteri64(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getBufferParameteri64v(target, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInteger64i_v(int target, int index, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetInteger64i_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInteger64i_v(SegmentAllocator allocator, int target, int index, long[] data) {
        var seg = allocator.allocateArray(JAVA_LONG, data.length);
        getInteger64i_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static long getInteger64i(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getInteger64i_v(target, index, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInteger64v(int pname, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetInteger64v).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInteger64v(SegmentAllocator allocator, int pname, long[] data) {
        var pData = allocator.allocateArray(JAVA_LONG, data.length);
        getInteger64v(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static long getInteger64(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_LONG);
            getInteger64v(pname, pData);
            return pData.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMultisamplefv(int pname, int index, MemorySegment val) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetMultisamplefv).invokeExact(pname, index, val);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMultisamplefv(SegmentAllocator allocator, int pname, int index, float[] val) {
        var seg = allocator.allocateArray(JAVA_FLOAT, val.length);
        getMultisamplefv(pname, index, seg);
        RuntimeHelper.toArray(seg, val);
    }

    public static float[] getMultisamplefv(SegmentAllocator allocator, int pname, int index) {
        var seg = allocator.allocateArray(JAVA_FLOAT, 2);
        getMultisamplefv(pname, index, seg);
        return new float[]{seg.get(JAVA_FLOAT, 0), seg.getAtIndex(JAVA_FLOAT, 1)};
    }

    public static void getSynciv(MemorySegment sync, int pname, int count, MemorySegment length, MemorySegment values) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetSynciv).invokeExact(sync, pname, count, length, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSynciv(SegmentAllocator allocator, MemorySegment sync, int pname, int @Nullable [] length, int[] values) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        var pVal = allocator.allocateArray(JAVA_INT, values.length);
        getSynciv(sync, pname, values.length, pLen, pVal);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        RuntimeHelper.toArray(pVal, values);
    }

    public static int getSynci(MemorySegment sync, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getSynciv(sync, pname, 1, MemorySegment.NULL, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isSync(MemorySegment sync) {
        var caps = GLLoader.getCapabilities();
        try {
            return (boolean) GLLoader.check(caps.glIsSync).invokeExact(sync);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, MemorySegment count, int type, MemorySegment indices, int drawCount, MemorySegment baseVertex) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glMultiDrawElementsBaseVertex).invokeExact(mode, count, type, indices, drawCount, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, MemorySegment[] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, indices[i]);
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_BYTE, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_SHORT, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_INT, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void provokingVertex(int mode) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glProvokingVertex).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void sampleMaski(int maskNumber, int mask) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glSampleMaski).invokeExact(maskNumber, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTexImage2DMultisample).invokeExact(target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTexImage3DMultisample).invokeExact(target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void waitSync(MemorySegment sync, int flags, long timeout) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glWaitSync).invokeExact(sync, flags, timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
