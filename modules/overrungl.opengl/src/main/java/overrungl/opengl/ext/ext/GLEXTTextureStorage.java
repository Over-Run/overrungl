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

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_texture_storage}
 */
public interface GLEXTTextureStorage {
    int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 0x912F;
    int GL_RGBA32F_EXT = 0x8814;
    int GL_RGB32F_EXT = 0x8815;
    int GL_ALPHA32F_EXT = 0x8816;
    int GL_LUMINANCE32F_EXT = 0x8818;
    int GL_LUMINANCE_ALPHA32F_EXT = 0x8819;
    int GL_RGBA16F_EXT = 0x881A;
    int GL_RGB16F_EXT = 0x881B;
    int GL_ALPHA16F_EXT = 0x881C;
    int GL_LUMINANCE16F_EXT = 0x881E;
    int GL_LUMINANCE_ALPHA16F_EXT = 0x881F;
    int GL_BGRA8_EXT = 0x93A1;
    int GL_R8_EXT = 0x8229;
    int GL_RG8_EXT = 0x822B;
    int GL_R32F_EXT = 0x822E;
    int GL_RG32F_EXT = 0x8230;
    int GL_R16F_EXT = 0x822D;
    int GL_RG16F_EXT = 0x822F;

    void glTexStorage1DEXT(int target, int levels, int internalformat, int width);
    void glTexStorage2DEXT(int target, int levels, int internalformat, int width, int height);
    void glTexStorage3DEXT(int target, int levels, int internalformat, int width, int height, int depth);
}
