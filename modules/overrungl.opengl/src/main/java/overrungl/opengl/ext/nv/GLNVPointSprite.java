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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_point_sprite}
 */
public final class GLNVPointSprite {
    public static final int GL_POINT_SPRITE_NV = 0x8861;
    public static final int GL_COORD_REPLACE_NV = 0x8862;
    public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_point_sprite) return;
        ext.glPointParameteriNV = load.invoke("glPointParameteriNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glPointParameterivNV = load.invoke("glPointParameterivNV", ofVoid(JAVA_INT, ADDRESS));
    }

    public static void glPointParameteriNV(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameteriNV).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPointParameterivNV(int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPointParameterivNV).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
