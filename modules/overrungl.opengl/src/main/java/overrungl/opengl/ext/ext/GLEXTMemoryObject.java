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
 * {@code GL_EXT_memory_object}
 */
public final class GLEXTMemoryObject {
    public static final int GL_TEXTURE_TILING_EXT = 0x9580;
    public static final int GL_DEDICATED_MEMORY_OBJECT_EXT = 0x9581;
    public static final int GL_PROTECTED_MEMORY_OBJECT_EXT = 0x959B;
    public static final int GL_NUM_TILING_TYPES_EXT = 0x9582;
    public static final int GL_TILING_TYPES_EXT = 0x9583;
    public static final int GL_OPTIMAL_TILING_EXT = 0x9584;
    public static final int GL_LINEAR_TILING_EXT = 0x9585;
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 0x9596;
    public static final int GL_DEVICE_UUID_EXT = 0x9597;
    public static final int GL_DRIVER_UUID_EXT = 0x9598;
    public static final int GL_UUID_SIZE_EXT = 16;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_memory_object) return;
        ext.glGetUnsignedBytevEXT = load.invoke("glGetUnsignedBytevEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetUnsignedBytei_vEXT = load.invoke("glGetUnsignedBytei_vEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDeleteMemoryObjectsEXT = load.invoke("glDeleteMemoryObjectsEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsMemoryObjectEXT = load.invoke("glIsMemoryObjectEXT", of(JAVA_BYTE, JAVA_INT));
        ext.glCreateMemoryObjectsEXT = load.invoke("glCreateMemoryObjectsEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMemoryObjectParameterivEXT = load.invoke("glMemoryObjectParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMemoryObjectParameterivEXT = load.invoke("glGetMemoryObjectParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTexStorageMem2DEXT = load.invoke("glTexStorageMem2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTexStorageMem2DMultisampleEXT = load.invoke("glTexStorageMem2DMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_LONG));
        ext.glTexStorageMem3DEXT = load.invoke("glTexStorageMem3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTexStorageMem3DMultisampleEXT = load.invoke("glTexStorageMem3DMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_LONG));
        ext.glBufferStorageMemEXT = load.invoke("glBufferStorageMemEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_LONG));
        ext.glTextureStorageMem2DEXT = load.invoke("glTextureStorageMem2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTextureStorageMem2DMultisampleEXT = load.invoke("glTextureStorageMem2DMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_LONG));
        ext.glTextureStorageMem3DEXT = load.invoke("glTextureStorageMem3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTextureStorageMem3DMultisampleEXT = load.invoke("glTextureStorageMem3DMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_LONG));
        ext.glNamedBufferStorageMemEXT = load.invoke("glNamedBufferStorageMemEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_LONG));
        ext.glTexStorageMem1DEXT = load.invoke("glTexStorageMem1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTextureStorageMem1DEXT = load.invoke("glTextureStorageMem1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
    }

    public static void glGetUnsignedBytevEXT(int pname, @NativeType("GLubyte *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUnsignedBytevEXT).invokeExact(pname, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUnsignedBytei_vEXT(int target, int index, @NativeType("GLubyte *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUnsignedBytei_vEXT).invokeExact(target, index, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteMemoryObjectsEXT(int n, @NativeType("const GLuint *") MemorySegment memoryObjects) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteMemoryObjectsEXT).invokeExact(n, memoryObjects);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsMemoryObjectEXT(int memoryObject) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsMemoryObjectEXT).invokeExact(memoryObject);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCreateMemoryObjectsEXT(int n, @NativeType("GLuint *") MemorySegment memoryObjects) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCreateMemoryObjectsEXT).invokeExact(n, memoryObjects);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMemoryObjectParameterivEXT(int memoryObject, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMemoryObjectParameterivEXT).invokeExact(memoryObject, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMemoryObjectParameterivEXT(int memoryObject, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMemoryObjectParameterivEXT).invokeExact(memoryObject, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorageMem2DEXT(int target, int levels, int internalFormat, int width, int height, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorageMem2DEXT).invokeExact(target, levels, internalFormat, width, height, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorageMem2DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorageMem2DMultisampleEXT).invokeExact(target, samples, internalFormat, width, height, fixedSampleLocations, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorageMem3DEXT(int target, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorageMem3DEXT).invokeExact(target, levels, internalFormat, width, height, depth, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorageMem3DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorageMem3DMultisampleEXT).invokeExact(target, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBufferStorageMemEXT(int target, long size, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferStorageMemEXT).invokeExact(target, size, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorageMem2DEXT(int texture, int levels, int internalFormat, int width, int height, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorageMem2DEXT).invokeExact(texture, levels, internalFormat, width, height, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorageMem2DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorageMem2DMultisampleEXT).invokeExact(texture, samples, internalFormat, width, height, fixedSampleLocations, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorageMem3DEXT(int texture, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorageMem3DEXT).invokeExact(texture, levels, internalFormat, width, height, depth, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorageMem3DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorageMem3DMultisampleEXT).invokeExact(texture, samples, internalFormat, width, height, depth, fixedSampleLocations, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferStorageMemEXT(int buffer, long size, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferStorageMemEXT).invokeExact(buffer, size, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexStorageMem1DEXT(int target, int levels, int internalFormat, int width, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexStorageMem1DEXT).invokeExact(target, levels, internalFormat, width, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorageMem1DEXT(int texture, int levels, int internalFormat, int width, int memory, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorageMem1DEXT).invokeExact(texture, levels, internalFormat, width, memory, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
