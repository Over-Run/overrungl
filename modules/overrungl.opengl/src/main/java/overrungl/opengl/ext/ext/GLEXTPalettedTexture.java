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
 * {@code GL_EXT_paletted_texture}
 */
public interface GLEXTPalettedTexture {
    int GL_COLOR_INDEX1_EXT = 0x80E2;
    int GL_COLOR_INDEX2_EXT = 0x80E3;
    int GL_COLOR_INDEX4_EXT = 0x80E4;
    int GL_COLOR_INDEX8_EXT = 0x80E5;
    int GL_COLOR_INDEX12_EXT = 0x80E6;
    int GL_COLOR_INDEX16_EXT = 0x80E7;
    int GL_TEXTURE_INDEX_SIZE_EXT = 0x80ED;

    void glColorTableEXT(int target, int internalFormat, int width, int format, int type, @NativeType("const void *") MemorySegment table);
    void glGetColorTableEXT(int target, int format, int type, @NativeType("void *") MemorySegment data);
    void glGetColorTableParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetColorTableParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params);
}
