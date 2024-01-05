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
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NVX_progress_fence}
 */
public final class GLNVXProgressFence {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NVX_progress_fence) return;
        ext.glCreateProgressFenceNVX = load.invoke("glCreateProgressFenceNVX", ofVoid());
        ext.glSignalSemaphoreui64NVX = load.invoke("glSignalSemaphoreui64NVX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glWaitSemaphoreui64NVX = load.invoke("glWaitSemaphoreui64NVX", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glClientWaitSemaphoreui64NVX = load.invoke("glClientWaitSemaphoreui64NVX", ofVoid(JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glCreateProgressFenceNVX() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCreateProgressFenceNVX).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSignalSemaphoreui64NVX(int signalGpu, int fenceObjectCount, @NativeType("const GLuint *") MemorySegment semaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSignalSemaphoreui64NVX).invokeExact(signalGpu, fenceObjectCount, semaphoreArray, fenceValueArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWaitSemaphoreui64NVX(int waitGpu, int fenceObjectCount, @NativeType("const GLuint *") MemorySegment semaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWaitSemaphoreui64NVX).invokeExact(waitGpu, fenceObjectCount, semaphoreArray, fenceValueArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClientWaitSemaphoreui64NVX(int fenceObjectCount, @NativeType("const GLuint *") MemorySegment semaphoreArray, @NativeType("const GLuint64 *") MemorySegment fenceValueArray) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClientWaitSemaphoreui64NVX).invokeExact(fenceObjectCount, semaphoreArray, fenceValueArray);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
