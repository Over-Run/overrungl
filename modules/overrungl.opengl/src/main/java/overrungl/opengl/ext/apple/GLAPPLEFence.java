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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_APPLE_fence}
  */
public final class GLAPPLEFence {
    public static final int GL_DRAW_PIXELS_APPLE = 0x8A0A;
    public static final int GL_FENCE_APPLE = 0x8A0B;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_fence) return;
        ext.glGenFencesAPPLE = load.invoke("glGenFencesAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteFencesAPPLE = load.invoke("glDeleteFencesAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glSetFenceAPPLE = load.invoke("glSetFenceAPPLE", ofVoid(JAVA_INT));
        ext.glIsFenceAPPLE = load.invoke("glIsFenceAPPLE", of(JAVA_BYTE, JAVA_INT));
        ext.glTestFenceAPPLE = load.invoke("glTestFenceAPPLE", of(JAVA_BYTE, JAVA_INT));
        ext.glFinishFenceAPPLE = load.invoke("glFinishFenceAPPLE", ofVoid(JAVA_INT));
        ext.glTestObjectAPPLE = load.invoke("glTestObjectAPPLE", of(JAVA_BYTE, JAVA_INT, JAVA_INT));
        ext.glFinishObjectAPPLE = load.invoke("glFinishObjectAPPLE", ofVoid(JAVA_INT, JAVA_INT));
    }

    public static void glGenFencesAPPLE(int n, @NativeType("GLuint *") MemorySegment fences) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenFencesAPPLE).invokeExact(n, fences);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteFencesAPPLE(int n, @NativeType("const GLuint *") MemorySegment fences) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteFencesAPPLE).invokeExact(n, fences);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSetFenceAPPLE(int fence) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSetFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsFenceAPPLE(int fence) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glTestFenceAPPLE(int fence) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glTestFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFinishFenceAPPLE(int fence) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFinishFenceAPPLE).invokeExact(fence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glTestObjectAPPLE(int object, int name) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glTestObjectAPPLE).invokeExact(object, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFinishObjectAPPLE(int object, int name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFinishObjectAPPLE).invokeExact(object, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
