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
 * {@code GL_EXT_vertex_array}
 */
public final class GLEXTVertexArray {
    public static final int GL_VERTEX_ARRAY_EXT = 0x8074;
    public static final int GL_NORMAL_ARRAY_EXT = 0x8075;
    public static final int GL_COLOR_ARRAY_EXT = 0x8076;
    public static final int GL_INDEX_ARRAY_EXT = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY_EXT = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY_EXT = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE_EXT = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE_EXT = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE_EXT = 0x807C;
    public static final int GL_VERTEX_ARRAY_COUNT_EXT = 0x807D;
    public static final int GL_NORMAL_ARRAY_TYPE_EXT = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE_EXT = 0x807F;
    public static final int GL_NORMAL_ARRAY_COUNT_EXT = 0x8080;
    public static final int GL_COLOR_ARRAY_SIZE_EXT = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE_EXT = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE_EXT = 0x8083;
    public static final int GL_COLOR_ARRAY_COUNT_EXT = 0x8084;
    public static final int GL_INDEX_ARRAY_TYPE_EXT = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE_EXT = 0x8086;
    public static final int GL_INDEX_ARRAY_COUNT_EXT = 0x8087;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
    public static final int GL_TEXTURE_COORD_ARRAY_COUNT_EXT = 0x808B;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE_EXT = 0x808C;
    public static final int GL_EDGE_FLAG_ARRAY_COUNT_EXT = 0x808D;
    public static final int GL_VERTEX_ARRAY_POINTER_EXT = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER_EXT = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER_EXT = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER_EXT = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER_EXT = 0x8093;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_vertex_array) return;
        ext.glArrayElementEXT = load.invoke("glArrayElementEXT", ofVoid(JAVA_INT));
        ext.glColorPointerEXT = load.invoke("glColorPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDrawArraysEXT = load.invoke("glDrawArraysEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glEdgeFlagPointerEXT = load.invoke("glEdgeFlagPointerEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPointervEXT = load.invoke("glGetPointervEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glIndexPointerEXT = load.invoke("glIndexPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNormalPointerEXT = load.invoke("glNormalPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexCoordPointerEXT = load.invoke("glTexCoordPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVertexPointerEXT = load.invoke("glVertexPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glArrayElementEXT(int i) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glArrayElementEXT).invokeExact(i);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glColorPointerEXT(int size, int type, int stride, int count, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glColorPointerEXT).invokeExact(size, type, stride, count, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawArraysEXT(int mode, int first, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawArraysEXT).invokeExact(mode, first, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEdgeFlagPointerEXT(int stride, int count, @NativeType("const GLboolean *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEdgeFlagPointerEXT).invokeExact(stride, count, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPointervEXT(int pname, @NativeType("void **") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPointervEXT).invokeExact(pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glIndexPointerEXT(int type, int stride, int count, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glIndexPointerEXT).invokeExact(type, stride, count, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalPointerEXT(int type, int stride, int count, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalPointerEXT).invokeExact(type, stride, count, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoordPointerEXT(int size, int type, int stride, int count, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoordPointerEXT).invokeExact(size, type, stride, count, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexPointerEXT(int size, int type, int stride, int count, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexPointerEXT).invokeExact(size, type, stride, count, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
