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

import overrungl.opengl.ext.arb.GLARBPointParameters;
import overrungl.opengl.ext.arb.GLARBShadow;
import overrungl.opengl.ext.arb.GLARBTextureMirroredRepeat;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

/**
 * The OpenGL 1.4 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_imaging</li>
 *     <li>{@linkplain GLARBPointParameters GL_ARB_point_parameters}</li>
 *     <li>{@linkplain GLARBShadow GL_ARB_shadow}</li>
 *     <li>{@linkplain GLARBTextureMirroredRepeat GL_ARB_texture_mirrored_repeat}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL14C extends GL13C permits GL14, GL15C {
    public static final int BLEND_DST_RGB = 0x80C8;
    public static final int BLEND_SRC_RGB = 0x80C9;
    public static final int BLEND_DST_ALPHA = 0x80CA;
    public static final int BLEND_SRC_ALPHA = 0x80CB;
    public static final int POINT_FADE_THRESHOLD_SIZE = 0x8128;
    public static final int DEPTH_COMPONENT16 = 0x81A5;
    public static final int DEPTH_COMPONENT24 = 0x81A6;
    public static final int DEPTH_COMPONENT32 = 0x81A7;
    public static final int MIRRORED_REPEAT = 0x8370;
    public static final int MAX_TEXTURE_LOD_BIAS = 0x84FD;
    public static final int TEXTURE_LOD_BIAS = 0x8501;
    public static final int INCR_WRAP = 0x8507;
    public static final int DECR_WRAP = 0x8508;
    public static final int TEXTURE_DEPTH_SIZE = 0x884A;
    public static final int TEXTURE_COMPARE_MODE = 0x884C;
    public static final int TEXTURE_COMPARE_FUNC = 0x884D;
    public static final int BLEND_COLOR = 0x8005;
    public static final int BLEND_EQUATION = 0x8009;
    public static final int CONSTANT_COLOR = 0x8001;
    public static final int ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int CONSTANT_ALPHA = 0x8003;
    public static final int ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int FUNC_ADD = 0x8006;
    public static final int FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int FUNC_SUBTRACT = 0x800A;
    public static final int MIN = 0x8007;
    public static final int MAX = 0x8008;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBlendColor, caps.glBlendEquation, caps.glBlendFuncSeparate, caps.glMultiDrawArrays, caps.glMultiDrawElements, caps.glPointParameterf,
            caps.glPointParameterfv, caps.glPointParameteri, caps.glPointParameteriv);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBlendColor = load.invoke("glBlendColor", FFFFV);
        caps.glBlendEquation = load.invoke("glBlendEquation", IV);
        caps.glBlendFuncSeparate = load.invoke("glBlendFuncSeparate", IIIIV);
        caps.glMultiDrawArrays = load.invoke("glMultiDrawArrays", IPPIV);
        caps.glMultiDrawElements = load.invoke("glMultiDrawElements", IPIPIV);
        caps.glPointParameterf = load.invoke("glPointParameterf", IFV);
        caps.glPointParameterfv = load.invoke("glPointParameterfv", IPV);
        caps.glPointParameteri = load.invoke("glPointParameteri", IIV);
        caps.glPointParameteriv = load.invoke("glPointParameteriv", IPV);
    }

    public static void blendColor(float red, float green, float blue, float alpha) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendColor).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendEquation(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendEquation).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        var caps = getCapabilities();
        try {
            check(caps.glBlendFuncSeparate).invokeExact(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArrays(int mode, MemorySegment first, MemorySegment count, int drawCount) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawArrays).invokeExact(mode, first, count, drawCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArrays(SegmentAllocator allocator, int mode, int[] first, int[] count, int drawCount) {
        multiDrawArrays(mode, allocator.allocateArray(JAVA_INT, first), allocator.allocateArray(JAVA_INT, count), drawCount);
    }

    public static void multiDrawArrays(SegmentAllocator allocator, int mode, int[] first, int[] count) {
        multiDrawArrays(allocator, mode, first, count, first.length);
    }

    public static void multiDrawElements(int mode, MemorySegment count, int type, MemorySegment indices, int drawCount) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawElements).invokeExact(mode, count, type, indices, drawCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices, int drawCount) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_BYTE, indices[i]));
        }
        multiDrawElements(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount);
    }

    public static void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices) {
        multiDrawElements(allocator, mode, count, type, indices, count.length);
    }

    public static void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices, int drawCount) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_SHORT, indices[i]));
        }
        multiDrawElements(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount);
    }

    public static void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices) {
        multiDrawElements(allocator, mode, count, type, indices, count.length);
    }

    public static void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices, int drawCount) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_INT, indices[i]));
        }
        multiDrawElements(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount);
    }

    public static void multiDrawElements(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices) {
        multiDrawElements(allocator, mode, count, type, indices, count.length);
    }

    public static void pointParameterf(int pname, float param) {
        var caps = getCapabilities();
        try {
            check(caps.glPointParameterf).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointParameterfv(int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glPointParameterfv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointParameterfv(SegmentAllocator allocator, int pname, float[] params) {
        pointParameterfv(pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void pointParameteri(int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glPointParameteri).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void pointParameteriv(int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glPointParameteriv).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pointParameteriv(SegmentAllocator allocator, int pname, int[] params) {
        pointParameteriv(pname, allocator.allocateArray(JAVA_INT, params));
    }
}
