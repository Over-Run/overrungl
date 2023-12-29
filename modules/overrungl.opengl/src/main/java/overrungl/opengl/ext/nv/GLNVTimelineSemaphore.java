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
 * {@code GL_NV_timeline_semaphore}
 */
public final class GLNVTimelineSemaphore {
    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;
    public static final int GL_SEMAPHORE_TYPE_NV = 0x95B3;
    public static final int GL_SEMAPHORE_TYPE_BINARY_NV = 0x95B4;
    public static final int GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;
    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_timeline_semaphore) return;
        ext.glCreateSemaphoresNV = load.invoke("glCreateSemaphoresNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glSemaphoreParameterivNV = load.invoke("glSemaphoreParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetSemaphoreParameterivNV = load.invoke("glGetSemaphoreParameterivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glCreateSemaphoresNV(int n, @NativeType("GLuint *") MemorySegment semaphores) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCreateSemaphoresNV).invokeExact(n, semaphores);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSemaphoreParameterivNV(int semaphore, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSemaphoreParameterivNV).invokeExact(semaphore, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetSemaphoreParameterivNV(int semaphore, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetSemaphoreParameterivNV).invokeExact(semaphore, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
