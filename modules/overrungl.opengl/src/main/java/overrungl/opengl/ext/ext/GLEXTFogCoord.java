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
 * {@code GL_EXT_fog_coord}
 */
public final class GLEXTFogCoord {
    public static final int GL_FOG_COORDINATE_SOURCE_EXT = 0x8450;
    public static final int GL_FOG_COORDINATE_EXT = 0x8451;
    public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE_EXT = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY_EXT = 0x8457;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_fog_coord) return;
        ext.glFogCoordfEXT = load.invoke("glFogCoordfEXT", ofVoid(JAVA_FLOAT));
        ext.glFogCoordfvEXT = load.invoke("glFogCoordfvEXT", ofVoid(ADDRESS));
        ext.glFogCoorddEXT = load.invoke("glFogCoorddEXT", ofVoid(JAVA_DOUBLE));
        ext.glFogCoorddvEXT = load.invoke("glFogCoorddvEXT", ofVoid(ADDRESS));
        ext.glFogCoordPointerEXT = load.invoke("glFogCoordPointerEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glFogCoordfEXT(float coord) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordfEXT).invokeExact(coord);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoordfvEXT(@NativeType("const GLfloat *") MemorySegment coord) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordfvEXT).invokeExact(coord);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoorddEXT(double coord) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoorddEXT).invokeExact(coord);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoorddvEXT(@NativeType("const GLdouble *") MemorySegment coord) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoorddvEXT).invokeExact(coord);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoordPointerEXT(int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordPointerEXT).invokeExact(type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
