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
 * {@code GL_EXT_semaphore}
 */
public final class GLEXTSemaphore {
    public static final int GL_LAYOUT_GENERAL_EXT = 0x958D;
    public static final int GL_LAYOUT_COLOR_ATTACHMENT_EXT = 0x958E;
    public static final int GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT = 0x958F;
    public static final int GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT = 0x9590;
    public static final int GL_LAYOUT_SHADER_READ_ONLY_EXT = 0x9591;
    public static final int GL_LAYOUT_TRANSFER_SRC_EXT = 0x9592;
    public static final int GL_LAYOUT_TRANSFER_DST_EXT = 0x9593;
    public static final int GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 0x9530;
    public static final int GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 0x9531;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_semaphore) return;
        ext.glGenSemaphoresEXT = load.invoke("glGenSemaphoresEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteSemaphoresEXT = load.invoke("glDeleteSemaphoresEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsSemaphoreEXT = load.invoke("glIsSemaphoreEXT", of(JAVA_BYTE, JAVA_INT));
        ext.glSemaphoreParameterui64vEXT = load.invoke("glSemaphoreParameterui64vEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetSemaphoreParameterui64vEXT = load.invoke("glGetSemaphoreParameterui64vEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glWaitSemaphoreEXT = load.invoke("glWaitSemaphoreEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, ADDRESS, ADDRESS));
        ext.glSignalSemaphoreEXT = load.invoke("glSignalSemaphoreEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glGenSemaphoresEXT(int n, @NativeType("GLuint *") MemorySegment semaphores) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenSemaphoresEXT).invokeExact(n, semaphores);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteSemaphoresEXT(int n, @NativeType("const GLuint *") MemorySegment semaphores) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteSemaphoresEXT).invokeExact(n, semaphores);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsSemaphoreEXT(int semaphore) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsSemaphoreEXT).invokeExact(semaphore);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSemaphoreParameterui64vEXT(int semaphore, int pname, @NativeType("const GLuint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSemaphoreParameterui64vEXT).invokeExact(semaphore, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetSemaphoreParameterui64vEXT(int semaphore, int pname, @NativeType("GLuint64 *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetSemaphoreParameterui64vEXT).invokeExact(semaphore, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWaitSemaphoreEXT(int semaphore, int numBufferBarriers, @NativeType("const GLuint *") MemorySegment buffers, int numTextureBarriers, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLenum *") MemorySegment srcLayouts) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWaitSemaphoreEXT).invokeExact(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, srcLayouts);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSignalSemaphoreEXT(int semaphore, int numBufferBarriers, @NativeType("const GLuint *") MemorySegment buffers, int numTextureBarriers, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLenum *") MemorySegment dstLayouts) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSignalSemaphoreEXT).invokeExact(semaphore, numBufferBarriers, buffers, numTextureBarriers, textures, dstLayouts);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
