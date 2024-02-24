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
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Skip;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

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
 * @author squid233
 * @since 0.1.0
 */
public interface GL44C extends DirectAccess {
    int MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;
    int PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;
    int TEXTURE_BUFFER_BINDING = 0x8C2A;
    int MAP_PERSISTENT_BIT = 0x0040;
    int MAP_COHERENT_BIT = 0x0080;
    int DYNAMIC_STORAGE_BIT = 0x0100;
    int CLIENT_STORAGE_BIT = 0x0200;
    int CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
    int BUFFER_IMMUTABLE_STORAGE = 0x821F;
    int BUFFER_STORAGE_FLAGS = 0x8220;
    int CLEAR_TEXTURE = 0x9365;
    int LOCATION_COMPONENT = 0x934A;
    int TRANSFORM_FEEDBACK_BUFFER_INDEX = 0x934B;
    int TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;
    int QUERY_BUFFER = 0x9192;
    int QUERY_BUFFER_BARRIER_BIT = 0x00008000;
    int QUERY_BUFFER_BINDING = 0x9193;
    int QUERY_RESULT_NO_WAIT = 0x9194;
    int MIRROR_CLAMP_TO_EDGE = 0x8743;

    @Entrypoint("glBindBuffersBase")
    default void bindBuffersBase(int target, int first, int count, MemorySegment buffers) {
        throw new ContextException();
    }

    @Entrypoint("glBindBuffersBase")
    default void bindBuffersBase(SegmentAllocator allocator, int target, int first, int count, int[] buffers) {
        throw new ContextException();
    }

    @Entrypoint("glBindBuffersRange")
    default void bindBuffersRange(int target, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment sizes) {
        throw new ContextException();
    }

    @Entrypoint("glBindBuffersRange")
    default void bindBuffersRange(SegmentAllocator allocator, int target, int first, int count, int[] buffers, long[] offsets, long[] sizes) {
        throw new ContextException();
    }

    @Entrypoint("glBindImageTextures")
    default void bindImageTextures(int first, int count, MemorySegment textures) {
        throw new ContextException();
    }

    @Entrypoint("glBindImageTextures")
    default void bindImageTextures(SegmentAllocator allocator, int first, int count, int[] textures) {
        throw new ContextException();
    }

    @Entrypoint("glBindSamplers")
    default void bindSamplers(int first, int count, MemorySegment samplers) {
        throw new ContextException();
    }

    @Entrypoint("glBindSamplers")
    default void bindSamplers(SegmentAllocator allocator, int first, int count, int[] samplers) {
        throw new ContextException();
    }

    @Entrypoint("glBindTextures")
    default void bindTextures(int first, int count, MemorySegment textures) {
        throw new ContextException();
    }

    @Entrypoint("glBindTextures")
    default void bindTextures(SegmentAllocator allocator, int first, int count, int[] textures) {
        throw new ContextException();
    }

    @Entrypoint("glBindVertexBuffers")
    default void bindVertexBuffers(int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        throw new ContextException();
    }

    @Entrypoint("glBindVertexBuffers")
    default void bindVertexBuffers(SegmentAllocator allocator, int first, int count, int[] buffers, long[] offsets, long[] strides) {
        throw new ContextException();
    }

    @Entrypoint("glBufferStorage")
    default void bufferStorage(int target, long size, MemorySegment data, int flags) {
        throw new ContextException();
    }

    @Skip
    default void bufferStorage(int target, long size, int flags) {
        bufferStorage(target, size, MemorySegment.NULL, flags);
    }

    @Skip
    default void bufferStorage(SegmentAllocator allocator, int target, byte[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferStorage(target, segment.byteSize(), segment, flags);
    }

    @Skip
    default void bufferStorage(SegmentAllocator allocator, int target, short[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferStorage(target, segment.byteSize(), segment, flags);
    }

    @Skip
    default void bufferStorage(SegmentAllocator allocator, int target, int[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferStorage(target, segment.byteSize(), segment, flags);
    }

    @Skip
    default void bufferStorage(SegmentAllocator allocator, int target, long[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferStorage(target, segment.byteSize(), segment, flags);
    }

    @Skip
    default void bufferStorage(SegmentAllocator allocator, int target, float[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferStorage(target, segment.byteSize(), segment, flags);
    }

    @Skip
    default void bufferStorage(SegmentAllocator allocator, int target, double[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferStorage(target, segment.byteSize(), segment, flags);
    }

    @Entrypoint("glClearTexImage")
    default void clearTexImage(int texture, int level, int format, int type, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glClearTexSubImage")
    default void clearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment data) {
        throw new ContextException();
    }
}
