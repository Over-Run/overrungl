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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * The OpenGL 1.2 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL12C extends GL11C permits GL12, GL13C {
    int UNSIGNED_BYTE_3_3_2 = 0x8032;
    int UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    int UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    int UNSIGNED_INT_8_8_8_8 = 0x8035;
    int UNSIGNED_INT_10_10_10_2 = 0x8036;
    int TEXTURE_BINDING_3D = 0x806A;
    int PACK_SKIP_IMAGES = 0x806B;
    int PACK_IMAGE_HEIGHT = 0x806C;
    int UNPACK_SKIP_IMAGES = 0x806D;
    int UNPACK_IMAGE_HEIGHT = 0x806E;
    int TEXTURE_3D = 0x806F;
    int PROXY_TEXTURE_3D = 0x8070;
    int TEXTURE_DEPTH = 0x8071;
    int TEXTURE_WRAP_R = 0x8072;
    int MAX_3D_TEXTURE_SIZE = 0x8073;
    int UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    int UNSIGNED_SHORT_5_6_5 = 0x8363;
    int UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    int UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    int UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    int UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    int UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    int BGR = 0x80E0;
    int BGRA = 0x80E1;
    int MAX_ELEMENTS_VERTICES = 0x80E8;
    int MAX_ELEMENTS_INDICES = 0x80E9;
    int CLAMP_TO_EDGE = 0x812F;
    int TEXTURE_MIN_LOD = 0x813A;
    int TEXTURE_MAX_LOD = 0x813B;
    int TEXTURE_BASE_LEVEL = 0x813C;
    int TEXTURE_MAX_LEVEL = 0x813D;
    int SMOOTH_POINT_SIZE_RANGE = 0x0B12;
    int SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
    int SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
    int SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
    int ALIASED_LINE_WIDTH_RANGE = 0x846E;

    @Entrypoint("glCopyTexSubImage3D")
    default void copyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElements")
    default void drawRangeElements(int mode, int start, int end, int count, int type, MemorySegment indices) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElements")
    default void drawRangeElements(SegmentAllocator allocator, int mode, int start, int end, int count, int type, byte[] indices) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElements")
    default void drawRangeElements(SegmentAllocator allocator, int mode, int start, int end, int count, int type, short[] indices) {
        throw new ContextException();
    }

    @Entrypoint("glDrawRangeElements")
    default void drawRangeElements(SegmentAllocator allocator, int mode, int start, int end, int count, int type, int[] indices) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage3D")
    default void texImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage3D")
    default void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage3D")
    default void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage3D")
    default void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexImage3D")
    default void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage3D")
    default void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage3D")
    default void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage3D")
    default void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage3D")
    default void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTexSubImage3D")
    default void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        throw new ContextException();
    }
}
