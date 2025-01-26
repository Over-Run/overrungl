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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBClearBufferObject {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClearBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glClearBufferData;
        public final MemorySegment PFN_glClearBufferSubData;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glClearBufferData = func.invoke("glClearBufferData");
            PFN_glClearBufferSubData = func.invoke("glClearBufferSubData");
        }
    }

    public GLARBClearBufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glClearBufferData((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearBufferData(int target, int internalformat, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferData)) throw new SymbolNotFoundError("Symbol not found: glClearBufferData");
        try { Handles.MH_glClearBufferData.invokeExact(handles.PFN_glClearBufferData, target, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferData", e); }
    }

    /// ```
    /// void glClearBufferSubData((unsigned int) GLenum target, (unsigned int) GLenum internalformat, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glClearBufferSubData");
        try { Handles.MH_glClearBufferSubData.invokeExact(handles.PFN_glClearBufferSubData, target, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferSubData", e); }
    }

}
