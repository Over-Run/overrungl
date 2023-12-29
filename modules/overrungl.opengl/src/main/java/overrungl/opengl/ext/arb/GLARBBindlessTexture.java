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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_bindless_texture}
 */
public final class GLARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_bindless_texture) return;
        ext.glGetTextureHandleARB = load.invoke("glGetTextureHandleARB", of(JAVA_LONG, JAVA_INT));
        ext.glGetTextureSamplerHandleARB = load.invoke("glGetTextureSamplerHandleARB", of(JAVA_LONG, JAVA_INT, JAVA_INT));
        ext.glMakeTextureHandleResidentARB = load.invoke("glMakeTextureHandleResidentARB", ofVoid(JAVA_LONG));
        ext.glMakeTextureHandleNonResidentARB = load.invoke("glMakeTextureHandleNonResidentARB", ofVoid(JAVA_LONG));
        ext.glGetImageHandleARB = load.invoke("glGetImageHandleARB", of(JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT));
        ext.glMakeImageHandleResidentARB = load.invoke("glMakeImageHandleResidentARB", ofVoid(JAVA_LONG, JAVA_INT));
        ext.glMakeImageHandleNonResidentARB = load.invoke("glMakeImageHandleNonResidentARB", ofVoid(JAVA_LONG));
        ext.glUniformHandleui64ARB = load.invoke("glUniformHandleui64ARB", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniformHandleui64vARB = load.invoke("glUniformHandleui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniformHandleui64ARB = load.invoke("glProgramUniformHandleui64ARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniformHandleui64vARB = load.invoke("glProgramUniformHandleui64vARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIsTextureHandleResidentARB = load.invoke("glIsTextureHandleResidentARB", of(JAVA_BYTE, JAVA_LONG));
        ext.glIsImageHandleResidentARB = load.invoke("glIsImageHandleResidentARB", of(JAVA_BYTE, JAVA_LONG));
        ext.glVertexAttribL1ui64ARB = load.invoke("glVertexAttribL1ui64ARB", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glVertexAttribL1ui64vARB = load.invoke("glVertexAttribL1ui64vARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetVertexAttribLui64vARB = load.invoke("glGetVertexAttribLui64vARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static long glGetTextureHandleARB(int texture) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetTextureHandleARB).invokeExact(texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glGetTextureSamplerHandleARB(int texture, int sampler) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetTextureSamplerHandleARB).invokeExact(texture, sampler);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeTextureHandleResidentARB(long handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeTextureHandleResidentARB).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeTextureHandleNonResidentARB(long handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeTextureHandleNonResidentARB).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glGetImageHandleARB(int texture, int level, boolean layered, int layer, int format) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetImageHandleARB).invokeExact(texture, level, layered, layer, format);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeImageHandleResidentARB(long handle, int access) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeImageHandleResidentARB).invokeExact(handle, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeImageHandleNonResidentARB(long handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeImageHandleNonResidentARB).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformHandleui64ARB(int location, long value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformHandleui64ARB).invokeExact(location, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformHandleui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformHandleui64vARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformHandleui64ARB(int program, int location, long value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformHandleui64ARB).invokeExact(program, location, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformHandleui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformHandleui64vARB).invokeExact(program, location, count, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsTextureHandleResidentARB(long handle) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsTextureHandleResidentARB).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsImageHandleResidentARB(long handle) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsImageHandleResidentARB).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL1ui64ARB(int index, long x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1ui64ARB).invokeExact(index, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexAttribL1ui64vARB(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexAttribL1ui64vARB).invokeExact(index, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexAttribLui64vARB(int index, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexAttribLui64vARB).invokeExact(index, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
