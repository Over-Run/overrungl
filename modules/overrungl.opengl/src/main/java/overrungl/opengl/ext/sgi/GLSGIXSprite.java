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
package overrungl.opengl.ext.sgi;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SGIX_sprite}
 */
public final class GLSGIXSprite {
    public static final int GL_SPRITE_SGIX = 0x8148;
    public static final int GL_SPRITE_MODE_SGIX = 0x8149;
    public static final int GL_SPRITE_AXIS_SGIX = 0x814A;
    public static final int GL_SPRITE_TRANSLATION_SGIX = 0x814B;
    public static final int GL_SPRITE_AXIAL_SGIX = 0x814C;
    public static final int GL_SPRITE_OBJECT_ALIGNED_SGIX = 0x814D;
    public static final int GL_SPRITE_EYE_ALIGNED_SGIX = 0x814E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SGIX_sprite) return;
        ext.glSpriteParameterfSGIX = load.invoke("glSpriteParameterfSGIX", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glSpriteParameterfvSGIX = load.invoke("glSpriteParameterfvSGIX", ofVoid(JAVA_INT, ADDRESS));
        ext.glSpriteParameteriSGIX = load.invoke("glSpriteParameteriSGIX", ofVoid(JAVA_INT, JAVA_INT));
        ext.glSpriteParameterivSGIX = load.invoke("glSpriteParameterivSGIX", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glSpriteParameterfSGIX(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSpriteParameterfSGIX).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSpriteParameterfvSGIX(int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSpriteParameterfvSGIX).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSpriteParameteriSGIX(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSpriteParameteriSGIX).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSpriteParameterivSGIX(int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSpriteParameterivSGIX).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
