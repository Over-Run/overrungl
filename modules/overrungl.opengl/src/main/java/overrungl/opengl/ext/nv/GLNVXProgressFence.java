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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NVX_progress_fence}
 */
public interface GLNVXProgressFence {

    default void glCreateProgressFenceNVX() {
        throw new ContextException();
    }

    default void glSignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, @NativeType("const GLuint *") MemorySegment semaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray) {
        throw new ContextException();
    }

    default void glWaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, @NativeType("const GLuint *") MemorySegment semaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray) {
        throw new ContextException();
    }

    default void glClientWaitSemaphoreui64NVX(int fenceObjectCount, @NativeType("const GLuint *") MemorySegment semaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray) {
        throw new ContextException();
    }

}
