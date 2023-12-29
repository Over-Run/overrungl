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
 * {@code GL_EXT_texture_storage}
 */
public final class GLEXTTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 0x912F;
    public static final int GL_RGBA32F_EXT = 0x8814;
    public static final int GL_RGB32F_EXT = 0x8815;
    public static final int GL_ALPHA32F_EXT = 0x8816;
    public static final int GL_LUMINANCE32F_EXT = 0x8818;
    public static final int GL_LUMINANCE_ALPHA32F_EXT = 0x8819;
    public static final int GL_RGBA16F_EXT = 0x881A;
    public static final int GL_RGB16F_EXT = 0x881B;
    public static final int GL_ALPHA16F_EXT = 0x881C;
    public static final int GL_LUMINANCE16F_EXT = 0x881E;
    public static final int GL_LUMINANCE_ALPHA16F_EXT = 0x881F;
    public static final int GL_BGRA8_EXT = 0x93A1;
    public static final int GL_R8_EXT = 0x8229;
    public static final int GL_RG8_EXT = 0x822B;
    public static final int GL_R32F_EXT = 0x822E;
    public static final int GL_RG32F_EXT = 0x8230;
    public static final int GL_R16F_EXT = 0x822D;
    public static final int GL_RG16F_EXT = 0x822F;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_texture_storage) return;
        ext.glTexStorage1DEXT = load.invoke("glTexStorage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexStorage2DEXT = load.invoke("glTexStorage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTexStorage3DEXT = load.invoke("glTexStorage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glTexStorage1DEXT(int target, int levels, int internalformat, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorage1DEXT).invokeExact(target, levels, internalformat, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorage2DEXT(int target, int levels, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorage2DEXT).invokeExact(target, levels, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorage3DEXT(int target, int levels, int internalformat, int width, int height, int depth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorage3DEXT).invokeExact(target, levels, internalformat, width, height, depth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
