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
 * {@code GL_EXT_secondary_color}
 */
public final class GLEXTSecondaryColor {
    public static final int GL_COLOR_SUM_EXT = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_secondary_color) return;
        ext.glSecondaryColor3bEXT = load.invoke("glSecondaryColor3bEXT", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glSecondaryColor3bvEXT = load.invoke("glSecondaryColor3bvEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3dEXT = load.invoke("glSecondaryColor3dEXT", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glSecondaryColor3dvEXT = load.invoke("glSecondaryColor3dvEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3fEXT = load.invoke("glSecondaryColor3fEXT", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glSecondaryColor3fvEXT = load.invoke("glSecondaryColor3fvEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3iEXT = load.invoke("glSecondaryColor3iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glSecondaryColor3ivEXT = load.invoke("glSecondaryColor3ivEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3sEXT = load.invoke("glSecondaryColor3sEXT", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glSecondaryColor3svEXT = load.invoke("glSecondaryColor3svEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3ubEXT = load.invoke("glSecondaryColor3ubEXT", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glSecondaryColor3ubvEXT = load.invoke("glSecondaryColor3ubvEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3uiEXT = load.invoke("glSecondaryColor3uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glSecondaryColor3uivEXT = load.invoke("glSecondaryColor3uivEXT", ofVoid(ADDRESS));
        ext.glSecondaryColor3usEXT = load.invoke("glSecondaryColor3usEXT", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glSecondaryColor3usvEXT = load.invoke("glSecondaryColor3usvEXT", ofVoid(ADDRESS));
        ext.glSecondaryColorPointerEXT = load.invoke("glSecondaryColorPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glSecondaryColor3bEXT(byte red, byte green, byte blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3bEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3bvEXT(@NativeType("const GLbyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3bvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3dEXT(double red, double green, double blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3dEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3dvEXT(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3dvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3fEXT(float red, float green, float blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3fEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3fvEXT(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3fvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3iEXT(int red, int green, int blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3iEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3ivEXT(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3ivEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3sEXT(short red, short green, short blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3sEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3svEXT(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3svEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3ubEXT(byte red, byte green, byte blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3ubEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3ubvEXT(@NativeType("const GLubyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3ubvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3uiEXT(int red, int green, int blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3uiEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3uivEXT(@NativeType("const GLuint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3uivEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3usEXT(short red, short green, short blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3usEXT).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3usvEXT(@NativeType("const GLushort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3usvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColorPointerEXT(int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColorPointerEXT).invokeExact(size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
