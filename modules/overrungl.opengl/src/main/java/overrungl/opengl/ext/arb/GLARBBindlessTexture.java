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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_bindless_texture}
 */
public interface GLARBBindlessTexture {
    int GL_UNSIGNED_INT64_ARB = 0x140F;

    default long glGetTextureHandleARB(int texture) {
        throw new ContextException();
    }

    default long glGetTextureSamplerHandleARB(int texture, int sampler) {
        throw new ContextException();
    }

    default void glMakeTextureHandleResidentARB(long handle) {
        throw new ContextException();
    }

    default void glMakeTextureHandleNonResidentARB(long handle) {
        throw new ContextException();
    }

    default long glGetImageHandleARB(int texture, int level, boolean layered, int layer, int format) {
        throw new ContextException();
    }

    default void glMakeImageHandleResidentARB(long handle, int access) {
        throw new ContextException();
    }

    default void glMakeImageHandleNonResidentARB(long handle) {
        throw new ContextException();
    }

    default void glUniformHandleui64ARB(int location, long value) {
        throw new ContextException();
    }

    default void glUniformHandleui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformHandleui64ARB(int program, int location, long value) {
        throw new ContextException();
    }

    default void glProgramUniformHandleui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment values) {
        throw new ContextException();
    }

    default boolean glIsTextureHandleResidentARB(long handle) {
        throw new ContextException();
    }

    default boolean glIsImageHandleResidentARB(long handle) {
        throw new ContextException();
    }

    default void glVertexAttribL1ui64ARB(int index, long x) {
        throw new ContextException();
    }

    default void glVertexAttribL1ui64vARB(int index, @NativeType("const GLuint64EXT *") MemorySegment v) {
        throw new ContextException();
    }

    default void glGetVertexAttribLui64vARB(int index, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

}
