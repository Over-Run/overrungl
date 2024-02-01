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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_bindless_texture}
 */
public interface GLARBBindlessTexture {
    int GL_UNSIGNED_INT64_ARB = 0x140F;

    long glGetTextureHandleARB(int texture);
    long glGetTextureSamplerHandleARB(int texture, int sampler);
    void glMakeTextureHandleResidentARB(long handle);
    void glMakeTextureHandleNonResidentARB(long handle);
    long glGetImageHandleARB(int texture, int level, boolean layered, int layer, int format);
    void glMakeImageHandleResidentARB(long handle, int access);
    void glMakeImageHandleNonResidentARB(long handle);
    void glUniformHandleui64ARB(int location, long value);
    void glUniformHandleui64vARB(int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glProgramUniformHandleui64ARB(int program, int location, long value);
    void glProgramUniformHandleui64vARB(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment values);
    boolean glIsTextureHandleResidentARB(long handle);
    boolean glIsImageHandleResidentARB(long handle);
    void glVertexAttribL1ui64ARB(int index, long x);
    void glVertexAttribL1ui64vARB(int index, @NativeType("const GLuint64EXT *") MemorySegment v);
    void glGetVertexAttribLui64vARB(int index, int pname, @NativeType("GLuint64EXT *") MemorySegment params);
}
