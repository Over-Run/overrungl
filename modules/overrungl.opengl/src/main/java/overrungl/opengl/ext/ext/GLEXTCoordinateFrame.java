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
 * {@code GL_EXT_coordinate_frame}
 */
public final class GLEXTCoordinateFrame {
    public static final int GL_TANGENT_ARRAY_EXT = 0x8439;
    public static final int GL_BINORMAL_ARRAY_EXT = 0x843A;
    public static final int GL_CURRENT_TANGENT_EXT = 0x843B;
    public static final int GL_CURRENT_BINORMAL_EXT = 0x843C;
    public static final int GL_TANGENT_ARRAY_TYPE_EXT = 0x843E;
    public static final int GL_TANGENT_ARRAY_STRIDE_EXT = 0x843F;
    public static final int GL_BINORMAL_ARRAY_TYPE_EXT = 0x8440;
    public static final int GL_BINORMAL_ARRAY_STRIDE_EXT = 0x8441;
    public static final int GL_TANGENT_ARRAY_POINTER_EXT = 0x8442;
    public static final int GL_BINORMAL_ARRAY_POINTER_EXT = 0x8443;
    public static final int GL_MAP1_TANGENT_EXT = 0x8444;
    public static final int GL_MAP2_TANGENT_EXT = 0x8445;
    public static final int GL_MAP1_BINORMAL_EXT = 0x8446;
    public static final int GL_MAP2_BINORMAL_EXT = 0x8447;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_coordinate_frame) return;
        ext.glTangent3bEXT = load.invoke("glTangent3bEXT", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glTangent3bvEXT = load.invoke("glTangent3bvEXT", ofVoid(ADDRESS));
        ext.glTangent3dEXT = load.invoke("glTangent3dEXT", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glTangent3dvEXT = load.invoke("glTangent3dvEXT", ofVoid(ADDRESS));
        ext.glTangent3fEXT = load.invoke("glTangent3fEXT", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTangent3fvEXT = load.invoke("glTangent3fvEXT", ofVoid(ADDRESS));
        ext.glTangent3iEXT = load.invoke("glTangent3iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTangent3ivEXT = load.invoke("glTangent3ivEXT", ofVoid(ADDRESS));
        ext.glTangent3sEXT = load.invoke("glTangent3sEXT", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glTangent3svEXT = load.invoke("glTangent3svEXT", ofVoid(ADDRESS));
        ext.glBinormal3bEXT = load.invoke("glBinormal3bEXT", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glBinormal3bvEXT = load.invoke("glBinormal3bvEXT", ofVoid(ADDRESS));
        ext.glBinormal3dEXT = load.invoke("glBinormal3dEXT", ofVoid(JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glBinormal3dvEXT = load.invoke("glBinormal3dvEXT", ofVoid(ADDRESS));
        ext.glBinormal3fEXT = load.invoke("glBinormal3fEXT", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glBinormal3fvEXT = load.invoke("glBinormal3fvEXT", ofVoid(ADDRESS));
        ext.glBinormal3iEXT = load.invoke("glBinormal3iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBinormal3ivEXT = load.invoke("glBinormal3ivEXT", ofVoid(ADDRESS));
        ext.glBinormal3sEXT = load.invoke("glBinormal3sEXT", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glBinormal3svEXT = load.invoke("glBinormal3svEXT", ofVoid(ADDRESS));
        ext.glTangentPointerEXT = load.invoke("glTangentPointerEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glBinormalPointerEXT = load.invoke("glBinormalPointerEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glTangent3bEXT(byte tx, byte ty, byte tz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3bEXT).invokeExact(tx, ty, tz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3bvEXT(@NativeType("const GLbyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3bvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3dEXT(double tx, double ty, double tz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3dEXT).invokeExact(tx, ty, tz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3dvEXT(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3dvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3fEXT(float tx, float ty, float tz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3fEXT).invokeExact(tx, ty, tz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3fvEXT(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3fvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3iEXT(int tx, int ty, int tz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3iEXT).invokeExact(tx, ty, tz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3ivEXT(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3ivEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3sEXT(short tx, short ty, short tz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3sEXT).invokeExact(tx, ty, tz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangent3svEXT(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangent3svEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3bEXT(byte bx, byte by, byte bz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3bEXT).invokeExact(bx, by, bz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3bvEXT(@NativeType("const GLbyte *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3bvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3dEXT(double bx, double by, double bz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3dEXT).invokeExact(bx, by, bz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3dvEXT(@NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3dvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3fEXT(float bx, float by, float bz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3fEXT).invokeExact(bx, by, bz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3fvEXT(@NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3fvEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3iEXT(int bx, int by, int bz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3iEXT).invokeExact(bx, by, bz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3ivEXT(@NativeType("const GLint *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3ivEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3sEXT(short bx, short by, short bz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3sEXT).invokeExact(bx, by, bz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormal3svEXT(@NativeType("const GLshort *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormal3svEXT).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTangentPointerEXT(int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTangentPointerEXT).invokeExact(type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBinormalPointerEXT(int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBinormalPointerEXT).invokeExact(type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
