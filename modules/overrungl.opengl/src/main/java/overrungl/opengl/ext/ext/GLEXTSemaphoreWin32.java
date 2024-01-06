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

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_semaphore_win32}
 */
public final class GLEXTSemaphoreWin32 {
    public static final int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 0x9594;
    public static final int GL_D3D12_FENCE_VALUE_EXT = 0x9595;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_semaphore_win32) return;
        ext.glImportSemaphoreWin32HandleEXT = load.invoke("glImportSemaphoreWin32HandleEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glImportSemaphoreWin32NameEXT = load.invoke("glImportSemaphoreWin32NameEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glImportSemaphoreWin32HandleEXT(int semaphore, int handleType, @NativeType("void * ") MemorySegment handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImportSemaphoreWin32HandleEXT).invokeExact(semaphore, handleType, handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glImportSemaphoreWin32NameEXT(int semaphore, int handleType, @NativeType("const void *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImportSemaphoreWin32NameEXT).invokeExact(semaphore, handleType, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
