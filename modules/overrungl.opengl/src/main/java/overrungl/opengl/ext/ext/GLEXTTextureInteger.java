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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_texture_integer}
 */
public final class GLEXTTextureInteger {
    public static final int GL_RGBA32UI_EXT = 0x8D70;
    public static final int GL_RGB32UI_EXT = 0x8D71;
    public static final int GL_ALPHA32UI_EXT = 0x8D72;
    public static final int GL_INTENSITY32UI_EXT = 0x8D73;
    public static final int GL_LUMINANCE32UI_EXT = 0x8D74;
    public static final int GL_LUMINANCE_ALPHA32UI_EXT = 0x8D75;
    public static final int GL_RGBA16UI_EXT = 0x8D76;
    public static final int GL_RGB16UI_EXT = 0x8D77;
    public static final int GL_ALPHA16UI_EXT = 0x8D78;
    public static final int GL_INTENSITY16UI_EXT = 0x8D79;
    public static final int GL_LUMINANCE16UI_EXT = 0x8D7A;
    public static final int GL_LUMINANCE_ALPHA16UI_EXT = 0x8D7B;
    public static final int GL_RGBA8UI_EXT = 0x8D7C;
    public static final int GL_RGB8UI_EXT = 0x8D7D;
    public static final int GL_ALPHA8UI_EXT = 0x8D7E;
    public static final int GL_INTENSITY8UI_EXT = 0x8D7F;
    public static final int GL_LUMINANCE8UI_EXT = 0x8D80;
    public static final int GL_LUMINANCE_ALPHA8UI_EXT = 0x8D81;
    public static final int GL_RGBA32I_EXT = 0x8D82;
    public static final int GL_RGB32I_EXT = 0x8D83;
    public static final int GL_ALPHA32I_EXT = 0x8D84;
    public static final int GL_INTENSITY32I_EXT = 0x8D85;
    public static final int GL_LUMINANCE32I_EXT = 0x8D86;
    public static final int GL_LUMINANCE_ALPHA32I_EXT = 0x8D87;
    public static final int GL_RGBA16I_EXT = 0x8D88;
    public static final int GL_RGB16I_EXT = 0x8D89;
    public static final int GL_ALPHA16I_EXT = 0x8D8A;
    public static final int GL_INTENSITY16I_EXT = 0x8D8B;
    public static final int GL_LUMINANCE16I_EXT = 0x8D8C;
    public static final int GL_LUMINANCE_ALPHA16I_EXT = 0x8D8D;
    public static final int GL_RGBA8I_EXT = 0x8D8E;
    public static final int GL_RGB8I_EXT = 0x8D8F;
    public static final int GL_ALPHA8I_EXT = 0x8D90;
    public static final int GL_INTENSITY8I_EXT = 0x8D91;
    public static final int GL_LUMINANCE8I_EXT = 0x8D92;
    public static final int GL_LUMINANCE_ALPHA8I_EXT = 0x8D93;
    public static final int GL_RED_INTEGER_EXT = 0x8D94;
    public static final int GL_GREEN_INTEGER_EXT = 0x8D95;
    public static final int GL_BLUE_INTEGER_EXT = 0x8D96;
    public static final int GL_ALPHA_INTEGER_EXT = 0x8D97;
    public static final int GL_RGB_INTEGER_EXT = 0x8D98;
    public static final int GL_RGBA_INTEGER_EXT = 0x8D99;
    public static final int GL_BGR_INTEGER_EXT = 0x8D9A;
    public static final int GL_BGRA_INTEGER_EXT = 0x8D9B;
    public static final int GL_LUMINANCE_INTEGER_EXT = 0x8D9C;
    public static final int GL_LUMINANCE_ALPHA_INTEGER_EXT = 0x8D9D;
    public static final int GL_RGBA_INTEGER_MODE_EXT = 0x8D9E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_texture_integer) return;
        ext.glTexParameterIivEXT = load.invoke("glTexParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexParameterIuivEXT = load.invoke("glTexParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTexParameterIivEXT = load.invoke("glGetTexParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTexParameterIuivEXT = load.invoke("glGetTexParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glClearColorIiEXT = load.invoke("glClearColorIiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glClearColorIuiEXT = load.invoke("glClearColorIuiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glTexParameterIivEXT(int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexParameterIivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexParameterIuivEXT(int target, int pname, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexParameterIuivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexParameterIivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexParameterIivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTexParameterIuivEXT(int target, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTexParameterIuivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearColorIiEXT(int red, int green, int blue, int alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearColorIiEXT).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearColorIuiEXT(int red, int green, int blue, int alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearColorIuiEXT).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
