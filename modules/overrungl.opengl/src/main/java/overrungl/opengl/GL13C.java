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

import overrungl.opengl.ext.arb.*;

import java.lang.foreign.MemorySegment;

import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

/**
 * The OpenGL 1.3 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBMultisample GL_ARB_multisample}</li>
 *     <li>{@linkplain GLARBMultitexture GL_ARB_multitexture}</li>
 *     <li>{@linkplain GLARBTextureBorderClamp GL_ARB_texture_border_clamp}</li>
 *     <li>{@linkplain GLARBTextureCompression GL_ARB_texture_compression}</li>
 *     <li>{@linkplain GLARBTextureCubeMap GL_ARB_texture_cube_map}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL13C extends GL12C permits GL13, GL14C {
    public static final int TEXTURE0 = 0x84C0;
    public static final int TEXTURE1 = 0x84C1;
    public static final int TEXTURE2 = 0x84C2;
    public static final int TEXTURE3 = 0x84C3;
    public static final int TEXTURE4 = 0x84C4;
    public static final int TEXTURE5 = 0x84C5;
    public static final int TEXTURE6 = 0x84C6;
    public static final int TEXTURE7 = 0x84C7;
    public static final int TEXTURE8 = 0x84C8;
    public static final int TEXTURE9 = 0x84C9;
    public static final int TEXTURE10 = 0x84CA;
    public static final int TEXTURE11 = 0x84CB;
    public static final int TEXTURE12 = 0x84CC;
    public static final int TEXTURE13 = 0x84CD;
    public static final int TEXTURE14 = 0x84CE;
    public static final int TEXTURE15 = 0x84CF;
    public static final int TEXTURE16 = 0x84D0;
    public static final int TEXTURE17 = 0x84D1;
    public static final int TEXTURE18 = 0x84D2;
    public static final int TEXTURE19 = 0x84D3;
    public static final int TEXTURE20 = 0x84D4;
    public static final int TEXTURE21 = 0x84D5;
    public static final int TEXTURE22 = 0x84D6;
    public static final int TEXTURE23 = 0x84D7;
    public static final int TEXTURE24 = 0x84D8;
    public static final int TEXTURE25 = 0x84D9;
    public static final int TEXTURE26 = 0x84DA;
    public static final int TEXTURE27 = 0x84DB;
    public static final int TEXTURE28 = 0x84DC;
    public static final int TEXTURE29 = 0x84DD;
    public static final int TEXTURE30 = 0x84DE;
    public static final int TEXTURE31 = 0x84DF;
    public static final int ACTIVE_TEXTURE = 0x84E0;
    public static final int MULTISAMPLE = 0x809D;
    public static final int SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int SAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int SAMPLE_COVERAGE = 0x80A0;
    public static final int SAMPLE_BUFFERS = 0x80A8;
    public static final int SAMPLES = 0x80A9;
    public static final int SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int TEXTURE_CUBE_MAP = 0x8513;
    public static final int TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int PROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int COMPRESSED_RGB = 0x84ED;
    public static final int COMPRESSED_RGBA = 0x84EE;
    public static final int TEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int TEXTURE_COMPRESSED = 0x86A1;
    public static final int NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int CLAMP_TO_BORDER = 0x812D;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glActiveTexture, caps.glCompressedTexImage1D, caps.glCompressedTexImage2D, caps.glCompressedTexImage3D, caps.glCompressedTexSubImage1D, caps.glCompressedTexSubImage2D,
            caps.glCompressedTexSubImage3D, caps.glGetCompressedTexImage, caps.glSampleCoverage);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glActiveTexture = load.invoke("glActiveTexture", IV);
        caps.glCompressedTexImage1D = load.invoke("glCompressedTexImage1D", IIIIIIPV);
        caps.glCompressedTexImage2D = load.invoke("glCompressedTexImage2D", IIIIIIIPV);
        caps.glCompressedTexImage3D = load.invoke("glCompressedTexImage3D", IIIIIIIIPV);
        caps.glCompressedTexSubImage1D = load.invoke("glCompressedTexSubImage1D", IIIIIIPV);
        caps.glCompressedTexSubImage2D = load.invoke("glCompressedTexSubImage2D", IIIIIIIIPV);
        caps.glCompressedTexSubImage3D = load.invoke("glCompressedTexSubImage3D", IIIIIIIIIIPV);
        caps.glGetCompressedTexImage = load.invoke("glGetCompressedTexImage", IIPV);
        caps.glSampleCoverage = load.invoke("glSampleCoverage", FZV);
    }

    public static void activeTexture(int texture) {
        var caps = getCapabilities();
        try {
            check(caps.glActiveTexture).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTexImage1D(int target, int level, int internalFormat, int width, int border, int imageSize, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glCompressedTexImage1D).invokeExact(target, level, internalFormat, width, border, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glCompressedTexImage2D).invokeExact(target, level, internalFormat, width, height, border, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glCompressedTexImage3D).invokeExact(target, level, internalFormat, width, height, depth, border, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glCompressedTexSubImage1D).invokeExact(target, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glCompressedTexSubImage2D).invokeExact(target, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glCompressedTexSubImage3D).invokeExact(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getCompressedTexImage(int target, int level, MemorySegment img) {
        var caps = getCapabilities();
        try {
            check(caps.glGetCompressedTexImage).invokeExact(target, level, img);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void sampleCoverage(float value, boolean invert) {
        var caps = getCapabilities();
        try {
            check(caps.glSampleCoverage).invokeExact(value, invert);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
