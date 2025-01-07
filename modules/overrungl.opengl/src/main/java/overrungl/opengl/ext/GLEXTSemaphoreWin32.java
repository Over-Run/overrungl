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

public final class GLEXTSemaphoreWin32 {
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;
    public static final int GL_DEVICE_LUID_EXT = 0x9599;
    public static final int GL_DEVICE_NODE_MASK_EXT = 0x959A;
    public static final int GL_LUID_SIZE_EXT = 8;
    public static final int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 0x9594;
    public static final int GL_D3D12_FENCE_VALUE_EXT = 0x9595;
    public static final MethodHandle MH_glImportSemaphoreWin32HandleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glImportSemaphoreWin32HandleEXT;
    public static final MethodHandle MH_glImportSemaphoreWin32NameEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glImportSemaphoreWin32NameEXT;

    public GLEXTSemaphoreWin32(overrungl.opengl.GLLoadFunc func) {
        PFN_glImportSemaphoreWin32HandleEXT = func.invoke("glImportSemaphoreWin32HandleEXT");
        PFN_glImportSemaphoreWin32NameEXT = func.invoke("glImportSemaphoreWin32NameEXT");
    }

    public void ImportSemaphoreWin32HandleEXT(@CType("GLuint") int semaphore, @CType("GLenum") int handleType, @CType("void*") java.lang.foreign.MemorySegment handle) {
        if (!Unmarshal.isNullPointer(PFN_glImportSemaphoreWin32HandleEXT)) { try {
            MH_glImportSemaphoreWin32HandleEXT.invokeExact(PFN_glImportSemaphoreWin32HandleEXT, semaphore, handleType, handle);
        } catch (Throwable e) { throw new RuntimeException("error in glImportSemaphoreWin32HandleEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glImportSemaphoreWin32HandleEXT"); }
    }

    public void ImportSemaphoreWin32NameEXT(@CType("GLuint") int semaphore, @CType("GLenum") int handleType, @CType("const void *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glImportSemaphoreWin32NameEXT)) { try {
            MH_glImportSemaphoreWin32NameEXT.invokeExact(PFN_glImportSemaphoreWin32NameEXT, semaphore, handleType, name);
        } catch (Throwable e) { throw new RuntimeException("error in glImportSemaphoreWin32NameEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glImportSemaphoreWin32NameEXT"); }
    }

}
