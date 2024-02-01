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

import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBPixelBufferObject;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * The OpenGL 2.1 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBPixelBufferObject GL_ARB_pixel_buffer_object}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL21C extends GL20C permits GL21, GL30C {
    int PIXEL_PACK_BUFFER = 0x88EB;
    int PIXEL_UNPACK_BUFFER = 0x88EC;
    int PIXEL_PACK_BUFFER_BINDING = 0x88ED;
    int PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
    int FLOAT_MAT2x3 = 0x8B65;
    int FLOAT_MAT2x4 = 0x8B66;
    int FLOAT_MAT3x2 = 0x8B67;
    int FLOAT_MAT3x4 = 0x8B68;
    int FLOAT_MAT4x2 = 0x8B69;
    int FLOAT_MAT4x3 = 0x8B6A;
    int SRGB = 0x8C40;
    int SRGB8 = 0x8C41;
    int SRGB_ALPHA = 0x8C42;
    int SRGB8_ALPHA8 = 0x8C43;
    int COMPRESSED_SRGB = 0x8C48;
    int COMPRESSED_SRGB_ALPHA = 0x8C49;

    @Entrypoint("glUniformMatrix2x3fv")
    default void uniformMatrix2x3fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix2x3fv")
    default void uniformMatrix2x3fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix2x3fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix2x3fv(allocator, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glUniformMatrix2x4fv")
    default void uniformMatrix2x4fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix2x4fv")
    default void uniformMatrix2x4fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix2x4fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix2x4fv(allocator, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glUniformMatrix3x2fv")
    default void uniformMatrix3x2fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix3x2fv")
    default void uniformMatrix3x2fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix3x2fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix3x2fv(allocator, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glUniformMatrix3x4fv")
    default void uniformMatrix3x4fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix3x4fv")
    default void uniformMatrix3x4fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix3x4fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix3x4fv(allocator, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glUniformMatrix4x2fv")
    default void uniformMatrix4x2fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix4x2fv")
    default void uniformMatrix4x2fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix4x2fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix4x2fv(allocator, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glUniformMatrix4x3fv")
    default void uniformMatrix4x3fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glUniformMatrix4x3fv")
    default void uniformMatrix4x3fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix4x3fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix4x3fv(allocator, location, value.length / 12, transpose, value);
    }
}
