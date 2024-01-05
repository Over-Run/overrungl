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
 * {@code GL_EXT_paletted_texture}
 */
public final class GLEXTPalettedTexture {
    public static final int GL_COLOR_INDEX1_EXT = 0x80E2;
    public static final int GL_COLOR_INDEX2_EXT = 0x80E3;
    public static final int GL_COLOR_INDEX4_EXT = 0x80E4;
    public static final int GL_COLOR_INDEX8_EXT = 0x80E5;
    public static final int GL_COLOR_INDEX12_EXT = 0x80E6;
    public static final int GL_COLOR_INDEX16_EXT = 0x80E7;
    public static final int GL_TEXTURE_INDEX_SIZE_EXT = 0x80ED;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_paletted_texture) return;
        ext.glColorTableEXT = load.invoke("glColorTableEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableEXT = load.invoke("glGetColorTableEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableParameterivEXT = load.invoke("glGetColorTableParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetColorTableParameterfvEXT = load.invoke("glGetColorTableParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glColorTableEXT(int target, int internalFormat, int width, int format, int type, @NativeType("const void *") MemorySegment table) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorTableEXT).invokeExact(target, internalFormat, width, format, type, table);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableEXT(int target, int format, int type, @NativeType("void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableEXT).invokeExact(target, format, type, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetColorTableParameterfvEXT(int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetColorTableParameterfvEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
