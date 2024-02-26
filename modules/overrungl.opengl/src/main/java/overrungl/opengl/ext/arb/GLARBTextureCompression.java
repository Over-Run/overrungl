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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_texture_compression}
 */
public interface GLARBTextureCompression extends overrun.marshal.DirectAccess {
    int GL_COMPRESSED_ALPHA_ARB = 0x84E9;
    int GL_COMPRESSED_LUMINANCE_ARB = 0x84EA;
    int GL_COMPRESSED_LUMINANCE_ALPHA_ARB = 0x84EB;
    int GL_COMPRESSED_INTENSITY_ARB = 0x84EC;
    int GL_COMPRESSED_RGB_ARB = 0x84ED;
    int GL_COMPRESSED_RGBA_ARB = 0x84EE;
    int GL_TEXTURE_COMPRESSION_HINT_ARB = 0x84EF;
    int GL_TEXTURE_COMPRESSED_IMAGE_SIZE_ARB = 0x86A0;
    int GL_TEXTURE_COMPRESSED_ARB = 0x86A1;
    int GL_NUM_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A2;
    int GL_COMPRESSED_TEXTURE_FORMATS_ARB = 0x86A3;

    default void glCompressedTexImage3DARB(int target, int level, int internalFormat, int width, int height, int depth, int border, int imageSize, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glCompressedTexImage2DARB(int target, int level, int internalFormat, int width, int height, int border, int imageSize, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glCompressedTexImage1DARB(int target, int level, int internalFormat, int width, int border, int imageSize, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glCompressedTexSubImage3DARB(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glCompressedTexSubImage2DARB(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glCompressedTexSubImage1DARB(int target, int level, int xoffset, int width, int format, int imageSize, @NativeType("const void*") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetCompressedTexImageARB(int target, int level, @NativeType("void*") MemorySegment img) {
        throw new ContextException();
    }

}
