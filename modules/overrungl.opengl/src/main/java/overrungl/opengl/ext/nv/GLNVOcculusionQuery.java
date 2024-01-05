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
 * {@code GL_NV_occlusion_query}
 */
public final class GLNVOcculusionQuery {
    public static final int GL_PIXEL_COUNTER_BITS_NV = 0x8864;
    public static final int GL_CURRENT_OCCLUSION_QUERY_ID_NV = 0x8865;
    public static final int GL_PIXEL_COUNT_NV = 0x8866;
    public static final int GL_PIXEL_COUNT_AVAILABLE_NV = 0x8867;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_occlusion_query) return;
        ext.glGenOcclusionQueriesNV = load.invoke("glGenOcclusionQueriesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteOcclusionQueriesNV = load.invoke("glDeleteOcclusionQueriesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsOcclusionQueryNV = load.invoke("glIsOcclusionQueryNV", of(JAVA_BYTE, JAVA_INT));
        ext.glBeginOcclusionQueryNV = load.invoke("glBeginOcclusionQueryNV", ofVoid(JAVA_INT));
        ext.glEndOcclusionQueryNV = load.invoke("glEndOcclusionQueryNV", ofVoid());
        ext.glGetOcclusionQueryivNV = load.invoke("glGetOcclusionQueryivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetOcclusionQueryuivNV = load.invoke("glGetOcclusionQueryuivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glGenOcclusionQueriesNV(int n, @NativeType("GLuint *") MemorySegment ids) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenOcclusionQueriesNV).invokeExact(n, ids);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteOcclusionQueriesNV(int n, @NativeType("const GLuint *") MemorySegment ids) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteOcclusionQueriesNV).invokeExact(n, ids);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsOcclusionQueryNV(int id) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsOcclusionQueryNV).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBeginOcclusionQueryNV(int id) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginOcclusionQueryNV).invokeExact(id);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndOcclusionQueryNV() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndOcclusionQueryNV).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetOcclusionQueryivNV(int id, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetOcclusionQueryivNV).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetOcclusionQueryuivNV(int id, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetOcclusionQueryuivNV).invokeExact(id, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
