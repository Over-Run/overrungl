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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

/**
 * The OpenGL 4.4 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_buffer_storage</li>
 *     <li>GL_ARB_clear_texture</li>
 *     <li>GL_ARB_multi_bind</li>
 * </ul>
 *
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL44C extends GL43C permits GL45C {
    public static final int MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;
    public static final int PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;
    public static final int TEXTURE_BUFFER_BINDING = 0x8C2A;
    public static final int MAP_PERSISTENT_BIT = 0x0040;
    public static final int MAP_COHERENT_BIT = 0x0080;
    public static final int DYNAMIC_STORAGE_BIT = 0x0100;
    public static final int CLIENT_STORAGE_BIT = 0x0200;
    public static final int CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
    public static final int BUFFER_IMMUTABLE_STORAGE = 0x821F;
    public static final int BUFFER_STORAGE_FLAGS = 0x8220;
    public static final int CLEAR_TEXTURE = 0x9365;
    public static final int LOCATION_COMPONENT = 0x934A;
    public static final int TRANSFORM_FEEDBACK_BUFFER_INDEX = 0x934B;
    public static final int TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;
    public static final int QUERY_BUFFER = 0x9192;
    public static final int QUERY_BUFFER_BARRIER_BIT = 0x00008000;
    public static final int QUERY_BUFFER_BINDING = 0x9193;
    public static final int QUERY_RESULT_NO_WAIT = 0x9194;
    public static final int MIRROR_CLAMP_TO_EDGE = 0x8743;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBindBuffersBase, caps.glBindBuffersRange, caps.glBindImageTextures, caps.glBindSamplers, caps.glBindTextures, caps.glBindVertexBuffers,
            caps.glBufferStorage, caps.glClearTexImage, caps.glClearTexSubImage);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindBuffersBase = load.invoke("glBindBuffersBase", IIIPV);
        caps.glBindBuffersRange = load.invoke("glBindBuffersRange", IIIPPPV);
        caps.glBindImageTextures = load.invoke("glBindImageTextures", IIPV);
        caps.glBindSamplers = load.invoke("glBindSamplers", IIPV);
        caps.glBindTextures = load.invoke("glBindTextures", IIPV);
        caps.glBindVertexBuffers = load.invoke("glBindVertexBuffers", IIPPPV);
        caps.glBufferStorage = load.invoke("glBufferStorage", IJPIV);
        caps.glClearTexImage = load.invoke("glClearTexImage", IIIIPV);
        caps.glClearTexSubImage = load.invoke("glClearTexSubImage", IIIIIIIIIIPV);
    }

    public static void bindBuffersBase(int target, int first, int count, MemorySegment buffers) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBuffersBase).invokeExact(target, first, count, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBuffersBase(SegmentAllocator allocator, int target, int first, int count, int[] buffers) {
        bindBuffersBase(target, first, count, allocator.allocateArray(JAVA_INT, buffers));
    }

    public static void bindBuffersRange(int target, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment sizes) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBuffersRange).invokeExact(target, first, count, buffers, offsets, sizes);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBuffersRange(SegmentAllocator allocator, int target, int first, int count, int[] buffers, long[] offsets, long[] sizes) {
        bindBuffersRange(target, first, count, allocator.allocateArray(JAVA_INT, buffers), allocator.allocateArray(JAVA_LONG, offsets), allocator.allocateArray(JAVA_LONG, sizes));
    }

    public static void bindImageTextures(int first, int count, MemorySegment textures) {
        var caps = getCapabilities();
        try {
            check(caps.glBindImageTextures).invokeExact(first, count, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindImageTextures(SegmentAllocator allocator, int first, int count, int[] textures) {
        bindImageTextures(first, count, allocator.allocateArray(JAVA_INT, textures));
    }

    public static void bindSamplers(int first, int count, MemorySegment samplers) {
        var caps = getCapabilities();
        try {
            check(caps.glBindSamplers).invokeExact(first, count, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindSamplers(SegmentAllocator allocator, int first, int count, int[] samplers) {
        bindSamplers(first, count, allocator.allocateArray(JAVA_INT, samplers));
    }

    public static void bindTextures(int first, int count, MemorySegment textures) {
        var caps = getCapabilities();
        try {
            check(caps.glBindTextures).invokeExact(first, count, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindTextures(SegmentAllocator allocator, int first, int count, int[] textures) {
        bindTextures(first, count, allocator.allocateArray(JAVA_INT, textures));
    }

    public static void bindVertexBuffers(int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        var caps = getCapabilities();
        try {
            check(caps.glBindVertexBuffers).invokeExact(first, count, buffers, offsets, strides);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindVertexBuffers(SegmentAllocator allocator, int first, int count, int[] buffers, long[] offsets, long[] strides) {
        bindVertexBuffers(first, count, allocator.allocateArray(JAVA_INT, buffers), allocator.allocateArray(JAVA_LONG, offsets), allocator.allocateArray(JAVA_LONG, strides));
    }

    public static void bufferStorage(int target, long size, MemorySegment data, int flags) {
        var caps = getCapabilities();
        try {
            check(caps.glBufferStorage).invokeExact(target, size, data, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferStorage(int target, long size, int flags) {
        bufferStorage(target, size, MemorySegment.NULL, flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, byte[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, short[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, int[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, long[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, float[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data), flags);
    }

    public static void bufferStorage(SegmentAllocator allocator, int target, double[] data, int flags) {
        bufferStorage(target, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data), flags);
    }

    public static void clearTexImage(int texture, int level, int format, int type, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glClearTexImage).invokeExact(texture, level, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glClearTexSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
