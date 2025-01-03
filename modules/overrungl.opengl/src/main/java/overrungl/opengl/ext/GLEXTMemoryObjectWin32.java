/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glImportMemoryWin32HandleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glImportMemoryWin32HandleEXT;
    public static final MethodHandle MH_glImportMemoryWin32NameEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glImportMemoryWin32NameEXT;

    public GLEXTMemoryObjectWin32(overrungl.opengl.GLLoadFunc func) {
        PFN_glImportMemoryWin32HandleEXT = func.invoke("glImportMemoryWin32HandleEXT");
        PFN_glImportMemoryWin32NameEXT = func.invoke("glImportMemoryWin32NameEXT");
    }

    public void ImportMemoryWin32HandleEXT(@CType("GLuint") int memory, @CType("GLuint64") long size, @CType("GLenum") int handleType, @CType("void*") java.lang.foreign.MemorySegment handle) {
        try { if (!Unmarshal.isNullPointer(PFN_glImportMemoryWin32HandleEXT))
            MH_glImportMemoryWin32HandleEXT.invokeExact(PFN_glImportMemoryWin32HandleEXT, memory, size, handleType, handle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glImportMemoryWin32HandleEXT", e); }
    }

    public void ImportMemoryWin32NameEXT(@CType("GLuint") int memory, @CType("GLuint64") long size, @CType("GLenum") int handleType, @CType("const void *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glImportMemoryWin32NameEXT))
            MH_glImportMemoryWin32NameEXT.invokeExact(PFN_glImportMemoryWin32NameEXT, memory, size, handleType, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glImportMemoryWin32NameEXT", e); }
    }

}
