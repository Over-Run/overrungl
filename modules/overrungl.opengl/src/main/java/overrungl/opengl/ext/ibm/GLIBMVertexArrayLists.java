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
package overrungl.opengl.ext.ibm;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_IBM_vertex_array_lists}
 */
public final class GLIBMVertexArrayLists {
    public static final int GL_VERTEX_ARRAY_LIST_IBM = 103070;
    public static final int GL_NORMAL_ARRAY_LIST_IBM = 103071;
    public static final int GL_COLOR_ARRAY_LIST_IBM = 103072;
    public static final int GL_INDEX_ARRAY_LIST_IBM = 103073;
    public static final int GL_TEXTURE_COORD_ARRAY_LIST_IBM = 103074;
    public static final int GL_EDGE_FLAG_ARRAY_LIST_IBM = 103075;
    public static final int GL_FOG_COORDINATE_ARRAY_LIST_IBM = 103076;
    public static final int GL_SECONDARY_COLOR_ARRAY_LIST_IBM = 103077;
    public static final int GL_VERTEX_ARRAY_LIST_STRIDE_IBM = 103080;
    public static final int GL_NORMAL_ARRAY_LIST_STRIDE_IBM = 103081;
    public static final int GL_COLOR_ARRAY_LIST_STRIDE_IBM = 103082;
    public static final int GL_INDEX_ARRAY_LIST_STRIDE_IBM = 103083;
    public static final int GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM = 103084;
    public static final int GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM = 103085;
    public static final int GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM = 103086;
    public static final int GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM = 103087;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_IBM_vertex_array_lists) return;
        ext.glColorPointerListIBM = load.invoke("glColorPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glSecondaryColorPointerListIBM = load.invoke("glSecondaryColorPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glEdgeFlagPointerListIBM = load.invoke("glEdgeFlagPointerListIBM", ofVoid(JAVA_INT, ADDRESS, JAVA_INT));
        ext.glFogCoordPointerListIBM = load.invoke("glFogCoordPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glIndexPointerListIBM = load.invoke("glIndexPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glNormalPointerListIBM = load.invoke("glNormalPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glTexCoordPointerListIBM = load.invoke("glTexCoordPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
        ext.glVertexPointerListIBM = load.invoke("glVertexPointerListIBM", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT));
    }

    public static void glColorPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorPointerListIBM).invokeExact(size, type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSecondaryColorPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSecondaryColorPointerListIBM).invokeExact(size, type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEdgeFlagPointerListIBM(int stride, @NativeType("const GLboolean **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEdgeFlagPointerListIBM).invokeExact(stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFogCoordPointerListIBM(int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFogCoordPointerListIBM).invokeExact(type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glIndexPointerListIBM(int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glIndexPointerListIBM).invokeExact(type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalPointerListIBM(int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalPointerListIBM).invokeExact(type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoordPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoordPointerListIBM).invokeExact(size, type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexPointerListIBM(int size, int type, int stride, @NativeType("const void **") MemorySegment pointer, int ptrstride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexPointerListIBM).invokeExact(size, type, stride, pointer, ptrstride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
