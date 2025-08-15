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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_memory_object_win32`
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportMemoryWin32HandleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glImportMemoryWin32NameEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glImportMemoryWin32HandleEXT;
        public final MemorySegment PFN_glImportMemoryWin32NameEXT;
        private Handles(GLLoadFunc func) {
            PFN_glImportMemoryWin32HandleEXT = func.invoke("glImportMemoryWin32HandleEXT");
            PFN_glImportMemoryWin32NameEXT = func.invoke("glImportMemoryWin32NameEXT");
        }
    }

    public GLEXTMemoryObjectWin32(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glImportMemoryWin32HandleEXT`.
    /// ```
    /// void glImportMemoryWin32HandleEXT((unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 size, (unsigned int) GLenum handleType, void* handle);
    /// ```
    public void ImportMemoryWin32HandleEXT(int memory, long size, int handleType, @NonNull MemorySegment handle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportMemoryWin32HandleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportMemoryWin32HandleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportMemoryWin32HandleEXT", memory, size, handleType, handle); }
        Handles.MH_glImportMemoryWin32HandleEXT.invokeExact(handles.PFN_glImportMemoryWin32HandleEXT, memory, size, handleType, handle); }
        catch (Throwable e) { throw new RuntimeException("error in ImportMemoryWin32HandleEXT", e); }
    }

    /// Invokes `glImportMemoryWin32NameEXT`.
    /// ```
    /// void glImportMemoryWin32NameEXT((unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 size, (unsigned int) GLenum handleType, const void* name);
    /// ```
    public void ImportMemoryWin32NameEXT(int memory, long size, int handleType, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportMemoryWin32NameEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportMemoryWin32NameEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportMemoryWin32NameEXT", memory, size, handleType, name); }
        Handles.MH_glImportMemoryWin32NameEXT.invokeExact(handles.PFN_glImportMemoryWin32NameEXT, memory, size, handleType, name); }
        catch (Throwable e) { throw new RuntimeException("error in ImportMemoryWin32NameEXT", e); }
    }

}
