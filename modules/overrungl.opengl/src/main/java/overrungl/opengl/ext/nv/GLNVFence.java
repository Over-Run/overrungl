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
 * {@code GL_NV_fence}
 */
public final class GLNVFence {
    public static final int GL_ALL_COMPLETED_NV = 0x84F2;
    public static final int GL_FENCE_STATUS_NV = 0x84F3;
    public static final int GL_FENCE_CONDITION_NV = 0x84F4;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_fence) return;
        ext.glDeleteFencesNV = load.invoke("glDeleteFencesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenFencesNV = load.invoke("glGenFencesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsFenceNV = load.invoke("glIsFenceNV", of(JAVA_BYTE, JAVA_INT));
        ext.glTestFenceNV = load.invoke("glTestFenceNV", of(JAVA_BYTE, JAVA_INT));
        ext.glGetFenceivNV = load.invoke("glGetFenceivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFinishFenceNV = load.invoke("glFinishFenceNV", ofVoid(JAVA_INT));
        ext.glSetFenceNV = load.invoke("glSetFenceNV", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glDeleteFencesNV(int n, @NativeType("const GLuint *") MemorySegment fences) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteFencesNV).invokeExact(n, fences);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenFencesNV(int n, @NativeType("GLuint *") MemorySegment fences) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenFencesNV).invokeExact(n, fences);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsFenceNV(int fence) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsFenceNV).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glTestFenceNV(int fence) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glTestFenceNV).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFenceivNV(int fence, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFenceivNV).invokeExact(fence, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFinishFenceNV(int fence) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFinishFenceNV).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSetFenceNV(int fence, int condition) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSetFenceNV).invokeExact(fence, condition);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
