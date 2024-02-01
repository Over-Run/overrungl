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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_bindless_texture}
 */
public interface GLNVBindlessTexture {

    long glGetTextureHandleNV(int texture);
    long glGetTextureSamplerHandleNV(int texture, int sampler);
    void glMakeTextureHandleResidentNV(long handle);
    void glMakeTextureHandleNonResidentNV(long handle);
    long glGetImageHandleNV(int texture, int level, boolean layered, int layer, int format);
    void glMakeImageHandleResidentNV(long handle, int access);
    void glMakeImageHandleNonResidentNV(long handle);
    void glUniformHandleui64NV(int location, long value);
    void glUniformHandleui64vNV(int location, int count, @NativeType("const GLuint64 *") MemorySegment value);
    void glProgramUniformHandleui64NV(int program, int location, long value);
    void glProgramUniformHandleui64vNV(int program, int location, int count, @NativeType("const GLuint64 *") MemorySegment values);
    boolean glIsTextureHandleResidentNV(long handle);
    boolean glIsImageHandleResidentNV(long handle);
}
