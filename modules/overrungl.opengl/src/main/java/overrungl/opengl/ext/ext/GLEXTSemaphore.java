/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
 * {@code GL_EXT_semaphore}
 */
public interface GLEXTSemaphore extends overrun.marshal.DirectAccess {
    int GL_LAYOUT_GENERAL_EXT = 0x958D;
    int GL_LAYOUT_COLOR_ATTACHMENT_EXT = 0x958E;
    int GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT = 0x958F;
    int GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT = 0x9590;
    int GL_LAYOUT_SHADER_READ_ONLY_EXT = 0x9591;
    int GL_LAYOUT_TRANSFER_SRC_EXT = 0x9592;
    int GL_LAYOUT_TRANSFER_DST_EXT = 0x9593;
    int GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 0x9530;
    int GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 0x9531;

    default void glGenSemaphoresEXT(int n, @NativeType("GLuint *") MemorySegment semaphores) {
        throw new ContextException();
    }

    default void glDeleteSemaphoresEXT(int n, @NativeType("const GLuint *") MemorySegment semaphores) {
        throw new ContextException();
    }

    default boolean glIsSemaphoreEXT(int semaphore) {
        throw new ContextException();
    }

    default void glSemaphoreParameterui64vEXT(int semaphore, int pname, @NativeType("const GLuint64 *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetSemaphoreParameterui64vEXT(int semaphore, int pname, @NativeType("GLuint64 *") MemorySegment params) {
        throw new ContextException();
    }

    default void glWaitSemaphoreEXT(int semaphore, int numBufferBarriers, @NativeType("const GLuint *") MemorySegment buffers, int numTextureBarriers, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLenum *") MemorySegment srcLayouts) {
        throw new ContextException();
    }

    default void glSignalSemaphoreEXT(int semaphore, int numBufferBarriers, @NativeType("const GLuint *") MemorySegment buffers, int numTextureBarriers, @NativeType("const GLuint *") MemorySegment textures, @NativeType("const GLenum *") MemorySegment dstLayouts) {
        throw new ContextException();
    }

}
