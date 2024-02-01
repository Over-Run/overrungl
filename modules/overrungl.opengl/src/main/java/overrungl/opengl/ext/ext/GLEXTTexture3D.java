/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_texture3D}
 */
public interface GLEXTTexture3D {
    int GL_PACK_SKIP_IMAGES_EXT = 0x806B;
    int GL_PACK_IMAGE_HEIGHT_EXT = 0x806C;
    int GL_UNPACK_SKIP_IMAGES_EXT = 0x806D;
    int GL_UNPACK_IMAGE_HEIGHT_EXT = 0x806E;
    int GL_TEXTURE_3D_EXT = 0x806F;
    int GL_PROXY_TEXTURE_3D_EXT = 0x8070;
    int GL_TEXTURE_DEPTH_EXT = 0x8071;
    int GL_TEXTURE_WRAP_R_EXT = 0x8072;
    int GL_MAX_3D_TEXTURE_SIZE_EXT = 0x8073;

    default void glTexImage3DEXT(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glTexSubImage3DEXT(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

}
