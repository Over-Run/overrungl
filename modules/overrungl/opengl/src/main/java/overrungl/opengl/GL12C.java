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

/**
 * The OpenGL 1.2 forward compatible functions.
 *
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL12C extends GL11C permits GL12, GL13C {
    public static final int UNSIGNED_BYTE_3_3_2 = 0x8032;
    public static final int UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int UNSIGNED_INT_8_8_8_8 = 0x8035;
    public static final int UNSIGNED_INT_10_10_10_2 = 0x8036;
    public static final int TEXTURE_BINDING_3D = 0x806A;
    public static final int PACK_SKIP_IMAGES = 0x806B;
    public static final int PACK_IMAGE_HEIGHT = 0x806C;
    public static final int UNPACK_SKIP_IMAGES = 0x806D;
    public static final int UNPACK_IMAGE_HEIGHT = 0x806E;
    public static final int TEXTURE_3D = 0x806F;
    public static final int PROXY_TEXTURE_3D = 0x8070;
    public static final int TEXTURE_DEPTH = 0x8071;
    public static final int TEXTURE_WRAP_R = 0x8072;
    public static final int MAX_3D_TEXTURE_SIZE = 0x8073;
    public static final int UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    public static final int UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    public static final int UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    public static final int UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    public static final int UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    public static final int UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int BGR = 0x80E0;
    public static final int BGRA = 0x80E1;
    public static final int MAX_ELEMENTS_VERTICES = 0x80E8;
    public static final int MAX_ELEMENTS_INDICES = 0x80E9;
    public static final int CLAMP_TO_EDGE = 0x812F;
    public static final int TEXTURE_MIN_LOD = 0x813A;
    public static final int TEXTURE_MAX_LOD = 0x813B;
    public static final int TEXTURE_BASE_LEVEL = 0x813C;
    public static final int TEXTURE_MAX_LEVEL = 0x813D;
    public static final int SMOOTH_POINT_SIZE_RANGE = 0x0B12;
    public static final int SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
    public static final int SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
    public static final int SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
    public static final int ALIASED_LINE_WIDTH_RANGE = 0x846E;

    static boolean isSupported(GLCapabilities caps) {
        return GLLoader.checkAll(caps.glCopyTexSubImage3D, caps.glDrawRangeElements, caps.glTexImage3D, caps.glTexSubImage3D);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glCopyTexSubImage3D = load.invoke("glCopyTexSubImage3D", IIIIIIIIIV);
        caps.glDrawRangeElements = load.invoke("glDrawRangeElements", IIIIIPV);
        caps.glTexImage3D = load.invoke("glTexImage3D", IIIIIIIIIPV);
        caps.glTexSubImage3D = load.invoke("glTexSubImage3D", IIIIIIIIIIPV);
    }

    public static void copyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCopyTexSubImage3D).invokeExact(target, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawRangeElements(int mode, int start, int end, int count, int type, MemorySegment indices) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDrawRangeElements).invokeExact(mode, start, end, count, type, indices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawRangeElements(SegmentAllocator allocator, int mode, int start, int end, int count, int type, byte[] indices) {
        drawRangeElements(mode, start, end, count, type, allocator.allocateArray(JAVA_BYTE, indices));
    }

    public static void drawRangeElements(SegmentAllocator allocator, int mode, int start, int end, int count, int type, short[] indices) {
        drawRangeElements(mode, start, end, count, type, allocator.allocateArray(JAVA_SHORT, indices));
    }

    public static void drawRangeElements(SegmentAllocator allocator, int mode, int start, int end, int count, int type, int[] indices) {
        drawRangeElements(mode, start, end, count, type, allocator.allocateArray(JAVA_INT, indices));
    }

    public static void texImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTexImage3D).invokeExact(target, level, internalFormat, width, height, depth, border, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, byte[] pixels) {
        texImage3D(target, level, internalFormat, width, height, depth, border, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, short[] pixels) {
        texImage3D(target, level, internalFormat, width, height, depth, border, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, int[] pixels) {
        texImage3D(target, level, internalFormat, width, height, depth, border, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texImage3D(SegmentAllocator allocator, int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, float[] pixels) {
        texImage3D(target, level, internalFormat, width, height, depth, border, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void texSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTexSubImage3D).invokeExact(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void texSubImage3D(SegmentAllocator allocator, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        texSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }
}
