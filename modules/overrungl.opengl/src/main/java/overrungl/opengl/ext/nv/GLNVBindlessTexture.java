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
 * {@code GL_NV_bindless_texture}
 */
public final class GLNVBindlessTexture {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_bindless_texture) return;
        ext.glGetTextureHandleNV = load.invoke("glGetTextureHandleNV", of(JAVA_LONG, JAVA_INT));
        ext.glGetTextureSamplerHandleNV = load.invoke("glGetTextureSamplerHandleNV", of(JAVA_LONG, JAVA_INT, JAVA_INT));
        ext.glMakeTextureHandleResidentNV = load.invoke("glMakeTextureHandleResidentNV", ofVoid(JAVA_LONG));
        ext.glMakeTextureHandleNonResidentNV = load.invoke("glMakeTextureHandleNonResidentNV", ofVoid(JAVA_LONG));
        ext.glGetImageHandleNV = load.invoke("glGetImageHandleNV", of(JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT));
        ext.glMakeImageHandleResidentNV = load.invoke("glMakeImageHandleResidentNV", ofVoid(JAVA_LONG, JAVA_INT));
        ext.glMakeImageHandleNonResidentNV = load.invoke("glMakeImageHandleNonResidentNV", ofVoid(JAVA_LONG));
        ext.glUniformHandleui64NV = load.invoke("glUniformHandleui64NV", ofVoid(JAVA_INT, JAVA_LONG));
        ext.glUniformHandleui64vNV = load.invoke("glUniformHandleui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniformHandleui64NV = load.invoke("glProgramUniformHandleui64NV", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glProgramUniformHandleui64vNV = load.invoke("glProgramUniformHandleui64vNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIsTextureHandleResidentNV = load.invoke("glIsTextureHandleResidentNV", of(JAVA_BYTE, JAVA_LONG));
        ext.glIsImageHandleResidentNV = load.invoke("glIsImageHandleResidentNV", of(JAVA_BYTE, JAVA_LONG));
    }

    public static long glGetTextureHandleNV(int texture) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetTextureHandleNV).invokeExact(texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glGetTextureSamplerHandleNV(int texture, int sampler) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetTextureSamplerHandleNV).invokeExact(texture, sampler);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeTextureHandleResidentNV(long handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeTextureHandleResidentNV).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeTextureHandleNonResidentNV(long handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeTextureHandleNonResidentNV).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static long glGetImageHandleNV(int texture, int level, boolean layered, int layer, int format) {
        final var ext = getExtCapabilities();
        try {
            return (long)
            check(ext.glGetImageHandleNV).invokeExact(texture, level, layered, layer, format);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeImageHandleResidentNV(long handle, int access) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeImageHandleResidentNV).invokeExact(handle, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMakeImageHandleNonResidentNV(long handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMakeImageHandleNonResidentNV).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformHandleui64NV(int location, long value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformHandleui64NV).invokeExact(location, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformHandleui64vNV(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformHandleui64vNV).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformHandleui64NV(int program, int location, long value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformHandleui64NV).invokeExact(program, location, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformHandleui64vNV(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment values) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformHandleui64vNV).invokeExact(program, location, count, values);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsTextureHandleResidentNV(long handle) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsTextureHandleResidentNV).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsImageHandleResidentNV(long handle) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsImageHandleResidentNV).invokeExact(handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
