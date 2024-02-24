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
import overrun.marshal.gen.Entrypoint;
import overrungl.opengl.ext.arb.*;

import java.lang.foreign.MemorySegment;

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
public interface GL13C extends DirectAccess {
    int TEXTURE0 = 0x84C0;
    int TEXTURE1 = 0x84C1;
    int TEXTURE2 = 0x84C2;
    int TEXTURE3 = 0x84C3;
    int TEXTURE4 = 0x84C4;
    int TEXTURE5 = 0x84C5;
    int TEXTURE6 = 0x84C6;
    int TEXTURE7 = 0x84C7;
    int TEXTURE8 = 0x84C8;
    int TEXTURE9 = 0x84C9;
    int TEXTURE10 = 0x84CA;
    int TEXTURE11 = 0x84CB;
    int TEXTURE12 = 0x84CC;
    int TEXTURE13 = 0x84CD;
    int TEXTURE14 = 0x84CE;
    int TEXTURE15 = 0x84CF;
    int TEXTURE16 = 0x84D0;
    int TEXTURE17 = 0x84D1;
    int TEXTURE18 = 0x84D2;
    int TEXTURE19 = 0x84D3;
    int TEXTURE20 = 0x84D4;
    int TEXTURE21 = 0x84D5;
    int TEXTURE22 = 0x84D6;
    int TEXTURE23 = 0x84D7;
    int TEXTURE24 = 0x84D8;
    int TEXTURE25 = 0x84D9;
    int TEXTURE26 = 0x84DA;
    int TEXTURE27 = 0x84DB;
    int TEXTURE28 = 0x84DC;
    int TEXTURE29 = 0x84DD;
    int TEXTURE30 = 0x84DE;
    int TEXTURE31 = 0x84DF;
    int ACTIVE_TEXTURE = 0x84E0;
    int MULTISAMPLE = 0x809D;
    int SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    int SAMPLE_ALPHA_TO_ONE = 0x809F;
    int SAMPLE_COVERAGE = 0x80A0;
    int SAMPLE_BUFFERS = 0x80A8;
    int SAMPLES = 0x80A9;
    int SAMPLE_COVERAGE_VALUE = 0x80AA;
    int SAMPLE_COVERAGE_INVERT = 0x80AB;
    int TEXTURE_CUBE_MAP = 0x8513;
    int TEXTURE_BINDING_CUBE_MAP = 0x8514;
    int TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    int TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    int TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    int TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    int TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    int TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    int PROXY_TEXTURE_CUBE_MAP = 0x851B;
    int MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    int COMPRESSED_RGB = 0x84ED;
    int COMPRESSED_RGBA = 0x84EE;
    int TEXTURE_COMPRESSION_HINT = 0x84EF;
    int TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    int TEXTURE_COMPRESSED = 0x86A1;
    int NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    int COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    int CLAMP_TO_BORDER = 0x812D;

    @Entrypoint("glActiveTexture")
    default void activeTexture(int texture) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTexImage1D")
    default void compressedTexImage1D(int target, int level, int internalFormat, int width, int border, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTexImage2D")
    default void compressedTexImage2D(int target, int level, int internalFormat, int width, int height, int border, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTexImage3D")
    default void compressedTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTexSubImage1D")
    default void compressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTexSubImage2D")
    default void compressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTexSubImage3D")
    default void compressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetCompressedTexImage")
    default void getCompressedTexImage(int target, int level, MemorySegment img) {
        throw new ContextException();
    }

    @Entrypoint("glSampleCoverage")
    default void sampleCoverage(float value, boolean invert) {
        throw new ContextException();
    }
}
