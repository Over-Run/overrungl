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
 * {@code GL_EXT_texture_object}
 */
public final class GLEXTTextureObject {
    public static final int GL_TEXTURE_PRIORITY_EXT = 0x8066;
    public static final int GL_TEXTURE_RESIDENT_EXT = 0x8067;
    public static final int GL_TEXTURE_1D_BINDING_EXT = 0x8068;
    public static final int GL_TEXTURE_2D_BINDING_EXT = 0x8069;
    public static final int GL_TEXTURE_3D_BINDING_EXT = 0x806A;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_texture_object) return;
        ext.glAreTexturesResidentEXT = load.invoke("glAreTexturesResidentEXT", of(JAVA_BYTE, JAVA_INT, ADDRESS, ADDRESS));
        ext.glBindTextureEXT = load.invoke("glBindTextureEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteTexturesEXT = load.invoke("glDeleteTexturesEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenTexturesEXT = load.invoke("glGenTexturesEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsTextureEXT = load.invoke("glIsTextureEXT", of(JAVA_BYTE, JAVA_INT));
        ext.glPrioritizeTexturesEXT = load.invoke("glPrioritizeTexturesEXT", ofVoid(JAVA_INT, ADDRESS, ADDRESS));
    }

    public static boolean glAreTexturesResidentEXT(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("GLboolean *") MemorySegment residences) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glAreTexturesResidentEXT).invokeExact(n, textures, residences);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindTextureEXT(int target, int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindTextureEXT).invokeExact(target, texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteTexturesEXT(int n, @NativeType("const GLuint *") MemorySegment textures) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteTexturesEXT).invokeExact(n, textures);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenTexturesEXT(int n, @NativeType("GLuint *") MemorySegment textures) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenTexturesEXT).invokeExact(n, textures);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsTextureEXT(int texture) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsTextureEXT).invokeExact(texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPrioritizeTexturesEXT(int n, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLclampf *") MemorySegment priorities) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPrioritizeTexturesEXT).invokeExact(n, textures, priorities);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
