/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.mesa;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_MESA_window_pos}
  */
public final class GLMESAWindowPos {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_MESA_window_pos) return;
        ext.glWindowPos2dMESA = load.invoke("glWindowPos2dMESA", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glWindowPos2dvMESA = load.invoke("glWindowPos2dvMESA", ofVoid(ADDRESS));
        ext.glWindowPos2fMESA = load.invoke("glWindowPos2fMESA", ofVoid(JAVA_FLOAT, JAVA_FLOAT));
        ext.glWindowPos2fvMESA = load.invoke("glWindowPos2fvMESA", ofVoid(ADDRESS));
        ext.glWindowPos2iMESA = load.invoke("glWindowPos2iMESA", ofVoid(JAVA_INT, JAVA_INT));
        ext.glWindowPos2ivMESA = load.invoke("glWindowPos2ivMESA", ofVoid(ADDRESS));
        ext.glWindowPos2sMESA = load.invoke("glWindowPos2sMESA", ofVoid(JAVA_SHORT, JAVA_SHORT));
        ext.glWindowPos2svMESA = load.invoke("glWindowPos2svMESA", ofVoid(ADDRESS));
        ext.glWindowPos3dMESA = load.invoke("glWindowPos3dMESA", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glWindowPos3dvMESA = load.invoke("glWindowPos3dvMESA", ofVoid(ADDRESS));
        ext.glWindowPos3fMESA = load.invoke("glWindowPos3fMESA", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glWindowPos3fvMESA = load.invoke("glWindowPos3fvMESA", ofVoid(ADDRESS));
        ext.glWindowPos3iMESA = load.invoke("glWindowPos3iMESA", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glWindowPos3ivMESA = load.invoke("glWindowPos3ivMESA", ofVoid(ADDRESS));
        ext.glWindowPos3sMESA = load.invoke("glWindowPos3sMESA", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glWindowPos3svMESA = load.invoke("glWindowPos3svMESA", ofVoid(ADDRESS));
        ext.glWindowPos4dMESA = load.invoke("glWindowPos4dMESA", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glWindowPos4dvMESA = load.invoke("glWindowPos4dvMESA", ofVoid(ADDRESS));
        ext.glWindowPos4fMESA = load.invoke("glWindowPos4fMESA", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glWindowPos4fvMESA = load.invoke("glWindowPos4fvMESA", ofVoid(ADDRESS));
        ext.glWindowPos4iMESA = load.invoke("glWindowPos4iMESA", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glWindowPos4ivMESA = load.invoke("glWindowPos4ivMESA", ofVoid(ADDRESS));
        ext.glWindowPos4sMESA = load.invoke("glWindowPos4sMESA", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glWindowPos4svMESA = load.invoke("glWindowPos4svMESA", ofVoid(ADDRESS));
    }

    public static void glWindowPos2dMESA(double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2dMESA).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2dvMESA(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2dvMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2fMESA(float x, float y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2fMESA).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2fvMESA(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2fvMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2iMESA(int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2iMESA).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2ivMESA(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2ivMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2sMESA(short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2sMESA).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos2svMESA(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos2svMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3dMESA(double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3dMESA).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3dvMESA(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3dvMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3fMESA(float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3fMESA).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3fvMESA(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3fvMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3iMESA(int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3iMESA).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3ivMESA(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3ivMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3sMESA(short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3sMESA).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos3svMESA(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos3svMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4dMESA(double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4dMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4dvMESA(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4dvMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4fMESA(float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4fMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4fvMESA(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4fvMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4iMESA(int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4iMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4ivMESA(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4ivMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4sMESA(short x, short y, short z, short w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4sMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWindowPos4svMESA(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWindowPos4svMESA).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
