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
 * {@code GL_EXT_memory_object_win32}
 */
public final class GLEXTMemoryObjectWin32 {
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;
    public static final int GL_DEVICE_LUID_EXT = 0x9599;
    public static final int GL_DEVICE_NODE_MASK_EXT = 0x959A;
    public static final int GL_LUID_SIZE_EXT = 8;
    public static final int GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT = 0x9589;
    public static final int GL_HANDLE_TYPE_D3D12_RESOURCE_EXT = 0x958A;
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_EXT = 0x958B;
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT = 0x958C;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_memory_object_win32) return;
        ext.glImportMemoryWin32HandleEXT = load.invoke("glImportMemoryWin32HandleEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_INT, ADDRESS));
        ext.glImportMemoryWin32NameEXT = load.invoke("glImportMemoryWin32NameEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_INT, ADDRESS));
    }

    public static void glImportMemoryWin32HandleEXT(int memory, long size, int handleType, @NativeType("void *") MemorySegment handle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImportMemoryWin32HandleEXT).invokeExact(memory, size, handleType, handle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glImportMemoryWin32NameEXT(int memory, long size, int handleType, @NativeType("const void *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glImportMemoryWin32NameEXT).invokeExact(memory, size, handleType, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
