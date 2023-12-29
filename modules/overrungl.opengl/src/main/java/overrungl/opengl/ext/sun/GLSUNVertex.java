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
package overrungl.opengl.ext.sun;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_SUN_vertex}
 */
public final class GLSUNVertex {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SUN_vertex) return;
        ext.glColor4ubVertex2fSUN = load.invoke("glColor4ubVertex2fSUN", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_FLOAT, JAVA_FLOAT));
        ext.glColor4ubVertex2fvSUN = load.invoke("glColor4ubVertex2fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glColor4ubVertex3fSUN = load.invoke("glColor4ubVertex3fSUN", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glColor4ubVertex3fvSUN = load.invoke("glColor4ubVertex3fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glColor3fVertex3fSUN = load.invoke("glColor3fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glColor3fVertex3fvSUN = load.invoke("glColor3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glNormal3fVertex3fSUN = load.invoke("glNormal3fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glNormal3fVertex3fvSUN = load.invoke("glNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glColor4fNormal3fVertex3fSUN = load.invoke("glColor4fNormal3fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glColor4fNormal3fVertex3fvSUN = load.invoke("glColor4fNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glTexCoord2fVertex3fSUN = load.invoke("glTexCoord2fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord2fVertex3fvSUN = load.invoke("glTexCoord2fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glTexCoord4fVertex4fSUN = load.invoke("glTexCoord4fVertex4fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord4fVertex4fvSUN = load.invoke("glTexCoord4fVertex4fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glTexCoord2fColor4ubVertex3fSUN = load.invoke("glTexCoord2fColor4ubVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord2fColor4ubVertex3fvSUN = load.invoke("glTexCoord2fColor4ubVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glTexCoord2fColor3fVertex3fSUN = load.invoke("glTexCoord2fColor3fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord2fColor3fVertex3fvSUN = load.invoke("glTexCoord2fColor3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glTexCoord2fNormal3fVertex3fSUN = load.invoke("glTexCoord2fNormal3fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord2fNormal3fVertex3fvSUN = load.invoke("glTexCoord2fNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glTexCoord2fColor4fNormal3fVertex3fSUN = load.invoke("glTexCoord2fColor4fNormal3fVertex3fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord2fColor4fNormal3fVertex3fvSUN = load.invoke("glTexCoord2fColor4fNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glTexCoord4fColor4fNormal3fVertex4fSUN = load.invoke("glTexCoord4fColor4fNormal3fVertex4fSUN", ofVoid(JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glTexCoord4fColor4fNormal3fVertex4fvSUN = load.invoke("glTexCoord4fColor4fNormal3fVertex4fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiVertex3fSUN = load.invoke("glReplacementCodeuiVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiVertex3fvSUN = load.invoke("glReplacementCodeuiVertex3fvSUN", ofVoid(ADDRESS, ADDRESS));
        ext.glReplacementCodeuiColor4ubVertex3fSUN = load.invoke("glReplacementCodeuiColor4ubVertex3fSUN", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiColor4ubVertex3fvSUN = load.invoke("glReplacementCodeuiColor4ubVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiColor3fVertex3fSUN = load.invoke("glReplacementCodeuiColor3fVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiColor3fVertex3fvSUN = load.invoke("glReplacementCodeuiColor3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiNormal3fVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiColor4fNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiColor4fNormal3fVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiColor4fNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiColor4fNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiTexCoord2fVertex3fSUN = load.invoke("glReplacementCodeuiTexCoord2fVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiTexCoord2fVertex3fvSUN = load.invoke("glReplacementCodeuiTexCoord2fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = load.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = load.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", ofVoid(ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
    }

    public static void glColor4ubVertex2fSUN(byte r, byte g, byte b, byte a, float x, float y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4ubVertex2fSUN).invokeExact(r, g, b, a, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4ubVertex2fvSUN(@NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4ubVertex2fvSUN).invokeExact(c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4ubVertex3fSUN(byte r, byte g, byte b, byte a, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4ubVertex3fSUN).invokeExact(r, g, b, a, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4ubVertex3fvSUN(@NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4ubVertex3fvSUN).invokeExact(c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor3fVertex3fSUN).invokeExact(r, g, b, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor3fVertex3fvSUN).invokeExact(c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormal3fVertex3fSUN(float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormal3fVertex3fSUN).invokeExact(nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormal3fVertex3fvSUN).invokeExact(n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4fNormal3fVertex3fSUN(float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4fNormal3fVertex3fSUN).invokeExact(r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4fNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4fNormal3fVertex3fvSUN).invokeExact(c, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fVertex3fSUN(float s, float t, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fVertex3fSUN).invokeExact(s, t, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fVertex3fvSUN).invokeExact(tc, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4fVertex4fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4fVertex4fSUN).invokeExact(s, t, p, q, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4fVertex4fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4fVertex4fvSUN).invokeExact(tc, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fColor4ubVertex3fSUN(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fColor4ubVertex3fSUN).invokeExact(s, t, r, g, b, a, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fColor4ubVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fColor4ubVertex3fvSUN).invokeExact(tc, c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fColor3fVertex3fSUN(float s, float t, float r, float g, float b, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fColor3fVertex3fSUN).invokeExact(s, t, r, g, b, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fColor3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fColor3fVertex3fvSUN).invokeExact(tc, c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fNormal3fVertex3fSUN(float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fNormal3fVertex3fSUN).invokeExact(s, t, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fNormal3fVertex3fvSUN).invokeExact(tc, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fColor4fNormal3fVertex3fSUN(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fColor4fNormal3fVertex3fSUN).invokeExact(s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2fColor4fNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2fColor4fNormal3fVertex3fvSUN).invokeExact(tc, c, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4fColor4fNormal3fVertex4fSUN(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4fColor4fNormal3fVertex4fSUN).invokeExact(s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4fColor4fNormal3fVertex4fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4fColor4fNormal3fVertex4fvSUN).invokeExact(tc, c, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiVertex3fSUN(int rc, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiVertex3fSUN).invokeExact(rc, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiVertex3fvSUN).invokeExact(rc, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiColor4ubVertex3fSUN(int rc, byte r, byte g, byte b, byte a, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiColor4ubVertex3fSUN).invokeExact(rc, r, g, b, a, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiColor4ubVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiColor4ubVertex3fvSUN).invokeExact(rc, c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiColor3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiColor3fVertex3fSUN).invokeExact(rc, r, g, b, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiColor3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiColor3fVertex3fvSUN).invokeExact(rc, c, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiNormal3fVertex3fSUN(int rc, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiNormal3fVertex3fSUN).invokeExact(rc, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiNormal3fVertex3fvSUN).invokeExact(rc, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiColor4fNormal3fVertex3fSUN(int rc, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiColor4fNormal3fVertex3fSUN).invokeExact(rc, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiColor4fNormal3fVertex3fvSUN).invokeExact(rc, c, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiTexCoord2fVertex3fSUN(int rc, float s, float t, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiTexCoord2fVertex3fSUN).invokeExact(rc, s, t, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiTexCoord2fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiTexCoord2fVertex3fvSUN).invokeExact(rc, tc, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(int rc, float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN).invokeExact(rc, s, t, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN).invokeExact(rc, tc, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(int rc, float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN).invokeExact(rc, s, t, r, g, b, a, nx, ny, nz, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN).invokeExact(rc, tc, c, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
