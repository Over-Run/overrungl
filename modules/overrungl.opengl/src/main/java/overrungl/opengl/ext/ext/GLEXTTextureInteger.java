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
 * {@code GL_EXT_texture_integer}
 */
public interface GLEXTTextureInteger {
    int GL_RGBA32UI_EXT = 0x8D70;
    int GL_RGB32UI_EXT = 0x8D71;
    int GL_ALPHA32UI_EXT = 0x8D72;
    int GL_INTENSITY32UI_EXT = 0x8D73;
    int GL_LUMINANCE32UI_EXT = 0x8D74;
    int GL_LUMINANCE_ALPHA32UI_EXT = 0x8D75;
    int GL_RGBA16UI_EXT = 0x8D76;
    int GL_RGB16UI_EXT = 0x8D77;
    int GL_ALPHA16UI_EXT = 0x8D78;
    int GL_INTENSITY16UI_EXT = 0x8D79;
    int GL_LUMINANCE16UI_EXT = 0x8D7A;
    int GL_LUMINANCE_ALPHA16UI_EXT = 0x8D7B;
    int GL_RGBA8UI_EXT = 0x8D7C;
    int GL_RGB8UI_EXT = 0x8D7D;
    int GL_ALPHA8UI_EXT = 0x8D7E;
    int GL_INTENSITY8UI_EXT = 0x8D7F;
    int GL_LUMINANCE8UI_EXT = 0x8D80;
    int GL_LUMINANCE_ALPHA8UI_EXT = 0x8D81;
    int GL_RGBA32I_EXT = 0x8D82;
    int GL_RGB32I_EXT = 0x8D83;
    int GL_ALPHA32I_EXT = 0x8D84;
    int GL_INTENSITY32I_EXT = 0x8D85;
    int GL_LUMINANCE32I_EXT = 0x8D86;
    int GL_LUMINANCE_ALPHA32I_EXT = 0x8D87;
    int GL_RGBA16I_EXT = 0x8D88;
    int GL_RGB16I_EXT = 0x8D89;
    int GL_ALPHA16I_EXT = 0x8D8A;
    int GL_INTENSITY16I_EXT = 0x8D8B;
    int GL_LUMINANCE16I_EXT = 0x8D8C;
    int GL_LUMINANCE_ALPHA16I_EXT = 0x8D8D;
    int GL_RGBA8I_EXT = 0x8D8E;
    int GL_RGB8I_EXT = 0x8D8F;
    int GL_ALPHA8I_EXT = 0x8D90;
    int GL_INTENSITY8I_EXT = 0x8D91;
    int GL_LUMINANCE8I_EXT = 0x8D92;
    int GL_LUMINANCE_ALPHA8I_EXT = 0x8D93;
    int GL_RED_INTEGER_EXT = 0x8D94;
    int GL_GREEN_INTEGER_EXT = 0x8D95;
    int GL_BLUE_INTEGER_EXT = 0x8D96;
    int GL_ALPHA_INTEGER_EXT = 0x8D97;
    int GL_RGB_INTEGER_EXT = 0x8D98;
    int GL_RGBA_INTEGER_EXT = 0x8D99;
    int GL_BGR_INTEGER_EXT = 0x8D9A;
    int GL_BGRA_INTEGER_EXT = 0x8D9B;
    int GL_LUMINANCE_INTEGER_EXT = 0x8D9C;
    int GL_LUMINANCE_ALPHA_INTEGER_EXT = 0x8D9D;
    int GL_RGBA_INTEGER_MODE_EXT = 0x8D9E;

    default void glTexParameterIivEXT(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTexParameterIuivEXT(int target, int pname, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTexParameterIivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTexParameterIuivEXT(int target, int pname, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glClearColorIiEXT(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

    default void glClearColorIuiEXT(int red, int green, int blue, int alpha) {
        throw new ContextException();
    }

}
