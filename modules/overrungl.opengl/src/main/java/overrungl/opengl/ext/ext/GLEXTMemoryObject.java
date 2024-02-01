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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_memory_object}
 */
public interface GLEXTMemoryObject {
    int GL_TEXTURE_TILING_EXT = 0x9580;
    int GL_DEDICATED_MEMORY_OBJECT_EXT = 0x9581;
    int GL_PROTECTED_MEMORY_OBJECT_EXT = 0x959B;
    int GL_NUM_TILING_TYPES_EXT = 0x9582;
    int GL_TILING_TYPES_EXT = 0x9583;
    int GL_OPTIMAL_TILING_EXT = 0x9584;
    int GL_LINEAR_TILING_EXT = 0x9585;
    int GL_NUM_DEVICE_UUIDS_EXT = 0x9596;
    int GL_DEVICE_UUID_EXT = 0x9597;
    int GL_DRIVER_UUID_EXT = 0x9598;
    int GL_UUID_SIZE_EXT = 16;

    default void glGetUnsignedBytevEXT(int pname, @NativeType("GLubyte *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetUnsignedBytei_vEXT(int target, int index, @NativeType("GLubyte *") MemorySegment data) {
        throw new ContextException();
    }

    default void glDeleteMemoryObjectsEXT(int n, @NativeType("const GLuint *") MemorySegment memoryObjects) {
        throw new ContextException();
    }

    default boolean glIsMemoryObjectEXT(int memoryObject) {
        throw new ContextException();
    }

    default void glCreateMemoryObjectsEXT(int n, @NativeType("GLuint *") MemorySegment memoryObjects) {
        throw new ContextException();
    }

    default void glMemoryObjectParameterivEXT(int memoryObject, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMemoryObjectParameterivEXT(int memoryObject, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTexStorageMem2DEXT(int target, int levels, int internalFormat, int width, int height, int memory, long offset) {
        throw new ContextException();
    }

    default void glTexStorageMem2DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        throw new ContextException();
    }

    default void glTexStorageMem3DEXT(int target, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        throw new ContextException();
    }

    default void glTexStorageMem3DMultisampleEXT(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        throw new ContextException();
    }

    default void glBufferStorageMemEXT(int target, long size, int memory, long offset) {
        throw new ContextException();
    }

    default void glTextureStorageMem2DEXT(int texture, int levels, int internalFormat, int width, int height, int memory, long offset) {
        throw new ContextException();
    }

    default void glTextureStorageMem2DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations, int memory, long offset) {
        throw new ContextException();
    }

    default void glTextureStorageMem3DEXT(int texture, int levels, int internalFormat, int width, int height, int depth, int memory, long offset) {
        throw new ContextException();
    }

    default void glTextureStorageMem3DMultisampleEXT(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations, int memory, long offset) {
        throw new ContextException();
    }

    default void glNamedBufferStorageMemEXT(int buffer, long size, int memory, long offset) {
        throw new ContextException();
    }

    default void glTexStorageMem1DEXT(int target, int levels, int internalFormat, int width, int memory, long offset) {
        throw new ContextException();
    }

    default void glTextureStorageMem1DEXT(int texture, int levels, int internalFormat, int width, int memory, long offset) {
        throw new ContextException();
    }

}
