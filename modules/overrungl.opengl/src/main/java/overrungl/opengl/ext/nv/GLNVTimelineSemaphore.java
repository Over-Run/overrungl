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
 * {@code GL_NV_timeline_semaphore}
 */
public interface GLNVTimelineSemaphore {
    int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;
    int GL_SEMAPHORE_TYPE_NV = 0x95B3;
    int GL_SEMAPHORE_TYPE_BINARY_NV = 0x95B4;
    int GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;
    int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;

    void glCreateSemaphoresNV(int n, @NativeType("GLuint *") MemorySegment semaphores);
    void glSemaphoreParameterivNV(int semaphore, int pname, @NativeType("const GLint *") MemorySegment params);
    void glGetSemaphoreParameterivNV(int semaphore, int pname, @NativeType("GLint *") MemorySegment params);
}
