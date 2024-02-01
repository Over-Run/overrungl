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
 * {@code GL_NV_fence}
 */
public interface GLNVFence {
    int GL_ALL_COMPLETED_NV = 0x84F2;
    int GL_FENCE_STATUS_NV = 0x84F3;
    int GL_FENCE_CONDITION_NV = 0x84F4;

    void glDeleteFencesNV(int n, @NativeType("const GLuint *") MemorySegment fences);
    void glGenFencesNV(int n, @NativeType("GLuint *") MemorySegment fences);
    boolean glIsFenceNV(int fence);
    boolean glTestFenceNV(int fence);
    void glGetFenceivNV(int fence, int pname, @NativeType("GLint *") MemorySegment params);
    void glFinishFenceNV(int fence);
    void glSetFenceNV(int fence, int condition);
}
