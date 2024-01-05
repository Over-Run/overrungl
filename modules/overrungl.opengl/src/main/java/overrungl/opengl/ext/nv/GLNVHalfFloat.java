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
 * {@code GL_NV_half_float}
 */
public final class GLNVHalfFloat {
    public static final int GL_HALF_FLOAT_NV = 0x140B;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_half_float) return;
        ext.glVertex2hNV = load.invoke("glVertex2hNV", ofVoid(JAVA_SHORT, JAVA_SHORT));
        ext.glVertex2hvNV = load.invoke("glVertex2hvNV", ofVoid(ADDRESS));
        ext.glVertex3hNV = load.invoke("glVertex3hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertex3hvNV = load.invoke("glVertex3hvNV", ofVoid(ADDRESS));
        ext.glVertex4hNV = load.invoke("glVertex4hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertex4hvNV = load.invoke("glVertex4hvNV", ofVoid(ADDRESS));
        ext.glNormal3hNV = load.invoke("glNormal3hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glNormal3hvNV = load.invoke("glNormal3hvNV", ofVoid(ADDRESS));
        ext.glColor3hNV = load.invoke("glColor3hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glColor3hvNV = load.invoke("glColor3hvNV", ofVoid(ADDRESS));
        ext.glColor4hNV = load.invoke("glColor4hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glColor4hvNV = load.invoke("glColor4hvNV", ofVoid(ADDRESS));
        ext.glTexCoord1hNV = load.invoke("glTexCoord1hNV", ofVoid(JAVA_SHORT));
        ext.glTexCoord1hvNV = load.invoke("glTexCoord1hvNV", ofVoid(ADDRESS));
        ext.glTexCoord2hNV = load.invoke("glTexCoord2hNV", ofVoid(JAVA_SHORT, JAVA_SHORT));
        ext.glTexCoord2hvNV = load.invoke("glTexCoord2hvNV", ofVoid(ADDRESS));
        ext.glTexCoord3hNV = load.invoke("glTexCoord3hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glTexCoord3hvNV = load.invoke("glTexCoord3hvNV", ofVoid(ADDRESS));
        ext.glTexCoord4hNV = load.invoke("glTexCoord4hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glTexCoord4hvNV = load.invoke("glTexCoord4hvNV", ofVoid(ADDRESS));
        ext.glMultiTexCoord1hNV = load.invoke("glMultiTexCoord1hNV", ofVoid(JAVA_INT, JAVA_SHORT));
        ext.glMultiTexCoord1hvNV = load.invoke("glMultiTexCoord1hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord2hNV = load.invoke("glMultiTexCoord2hNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT));
        ext.glMultiTexCoord2hvNV = load.invoke("glMultiTexCoord2hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord3hNV = load.invoke("glMultiTexCoord3hNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glMultiTexCoord3hvNV = load.invoke("glMultiTexCoord3hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord4hNV = load.invoke("glMultiTexCoord4hNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glMultiTexCoord4hvNV = load.invoke("glMultiTexCoord4hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib1hNV = load.invoke("glVertexAttrib1hNV", ofVoid(JAVA_INT, JAVA_SHORT));
        ext.glVertexAttrib1hvNV = load.invoke("glVertexAttrib1hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib2hNV = load.invoke("glVertexAttrib2hNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib2hvNV = load.invoke("glVertexAttrib2hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib3hNV = load.invoke("glVertexAttrib3hNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib3hvNV = load.invoke("glVertexAttrib3hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttrib4hNV = load.invoke("glVertexAttrib4hNV", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexAttrib4hvNV = load.invoke("glVertexAttrib4hvNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexAttribs1hvNV = load.invoke("glVertexAttribs1hvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs2hvNV = load.invoke("glVertexAttribs2hvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs3hvNV = load.invoke("glVertexAttribs3hvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexAttribs4hvNV = load.invoke("glVertexAttribs4hvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFogCoordhNV = load.invoke("glFogCoordhNV", ofVoid(JAVA_SHORT));
        ext.glFogCoordhvNV = load.invoke("glFogCoordhvNV", ofVoid(ADDRESS));
        ext.glSecondaryColor3hNV = load.invoke("glSecondaryColor3hNV", ofVoid(JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glSecondaryColor3hvNV = load.invoke("glSecondaryColor3hvNV", ofVoid(ADDRESS));
        ext.glVertexWeighthNV = load.invoke("glVertexWeighthNV", ofVoid(JAVA_SHORT));
        ext.glVertexWeighthvNV = load.invoke("glVertexWeighthvNV", ofVoid(ADDRESS));
    }

    public static void glVertex2hNV(short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex2hNV).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex2hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex2hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex3hNV(short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex3hNV).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex3hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex4hNV(short x, short y, short z, short w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex4hNV).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex4hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex4hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormal3hNV(short nx, short ny, short nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormal3hNV).invokeExact(nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormal3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormal3hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor3hNV(short red, short green, short blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor3hNV).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor3hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4hNV(short red, short green, short blue, short alpha) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4hNV).invokeExact(red, green, blue, alpha);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColor4hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColor4hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord1hNV(short s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord1hNV).invokeExact(s);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord1hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord1hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2hNV(short s, short t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2hNV).invokeExact(s, t);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord3hNV(short s, short t, short r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord3hNV).invokeExact(s, t, r);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord3hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4hNV(short s, short t, short r, short q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4hNV).invokeExact(s, t, r, q);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord1hNV(int target, short s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1hNV).invokeExact(target, s);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord1hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1hvNV).invokeExact(target, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord2hNV(int target, short s, short t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2hNV).invokeExact(target, s, t);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord2hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2hvNV).invokeExact(target, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord3hNV(int target, short s, short t, short r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3hNV).invokeExact(target, s, t, r);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord3hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3hvNV).invokeExact(target, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord4hNV(int target, short s, short t, short r, short q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4hNV).invokeExact(target, s, t, r, q);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord4hvNV(int target, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4hvNV).invokeExact(target, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1hNV(int index, short x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1hNV).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib1hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib1hvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2hNV(int index, short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2hNV).invokeExact(index, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib2hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib2hvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3hNV(int index, short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3hNV).invokeExact(index, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib3hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib3hvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4hNV(int index, short x, short y, short z, short w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4hNV).invokeExact(index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttrib4hvNV(int index, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttrib4hvNV).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs1hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs1hvNV).invokeExact(index, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs2hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs2hvNV).invokeExact(index, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs3hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs3hvNV).invokeExact(index, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribs4hvNV(int index, int n, @NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribs4hvNV).invokeExact(index, n, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoordhNV(short fog) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordhNV).invokeExact(fog);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoordhvNV(@NativeType("const GLhalfNV *") MemorySegment fog) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordhvNV).invokeExact(fog);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3hNV(short red, short green, short blue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3hNV).invokeExact(red, green, blue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColor3hvNV(@NativeType("const GLhalfNV *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColor3hvNV).invokeExact(v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexWeighthNV(short weight) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexWeighthNV).invokeExact(weight);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexWeighthvNV(@NativeType("const GLhalfNV *") MemorySegment weight) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexWeighthvNV).invokeExact(weight);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
