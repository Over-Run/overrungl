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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVQueryResourceTag {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenQueryResourceTagNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteQueryResourceTagNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glQueryResourceTagNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGenQueryResourceTagNV;
        public final MemorySegment PFN_glDeleteQueryResourceTagNV;
        public final MemorySegment PFN_glQueryResourceTagNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenQueryResourceTagNV = func.invoke("glGenQueryResourceTagNV");
            PFN_glDeleteQueryResourceTagNV = func.invoke("glDeleteQueryResourceTagNV");
            PFN_glQueryResourceTagNV = func.invoke("glQueryResourceTagNV");
        }
    }

    public GLNVQueryResourceTag(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGenQueryResourceTagNV((int) GLsizei n, GLint* tagIds);
    /// ```
    public void GenQueryResourceTagNV(int n, MemorySegment tagIds) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenQueryResourceTagNV)) throw new GLSymbolNotFoundError("Symbol not found: glGenQueryResourceTagNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenQueryResourceTagNV", n, tagIds); }
        Handles.MH_glGenQueryResourceTagNV.invokeExact(handles.PFN_glGenQueryResourceTagNV, n, tagIds); }
        catch (Throwable e) { throw new RuntimeException("error in GenQueryResourceTagNV", e); }
    }

    /// ```
    /// void glDeleteQueryResourceTagNV((int) GLsizei n, const GLint* tagIds);
    /// ```
    public void DeleteQueryResourceTagNV(int n, MemorySegment tagIds) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteQueryResourceTagNV)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteQueryResourceTagNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteQueryResourceTagNV", n, tagIds); }
        Handles.MH_glDeleteQueryResourceTagNV.invokeExact(handles.PFN_glDeleteQueryResourceTagNV, n, tagIds); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteQueryResourceTagNV", e); }
    }

    /// ```
    /// void glQueryResourceTagNV((int) GLint tagId, const GLchar* tagString);
    /// ```
    public void QueryResourceTagNV(int tagId, MemorySegment tagString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryResourceTagNV)) throw new GLSymbolNotFoundError("Symbol not found: glQueryResourceTagNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glQueryResourceTagNV", tagId, tagString); }
        Handles.MH_glQueryResourceTagNV.invokeExact(handles.PFN_glQueryResourceTagNV, tagId, tagString); }
        catch (Throwable e) { throw new RuntimeException("error in QueryResourceTagNV", e); }
    }

}
