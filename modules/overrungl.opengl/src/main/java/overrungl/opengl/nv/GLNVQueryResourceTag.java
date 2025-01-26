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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVQueryResourceTag {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenQueryResourceTagNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteQueryResourceTagNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glQueryResourceTagNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
    /// void glGenQueryResourceTagNV(GLsizei n, GLint* tagIds);
    /// ```
    public void GenQueryResourceTagNV(int n, MemorySegment tagIds) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenQueryResourceTagNV)) throw new SymbolNotFoundError("Symbol not found: glGenQueryResourceTagNV");
        try { Handles.MH_glGenQueryResourceTagNV.invokeExact(handles.PFN_glGenQueryResourceTagNV, n, tagIds); }
        catch (Throwable e) { throw new RuntimeException("error in GenQueryResourceTagNV", e); }
    }

    /// ```
    /// void glDeleteQueryResourceTagNV(GLsizei n, const GLint* tagIds);
    /// ```
    public void DeleteQueryResourceTagNV(int n, MemorySegment tagIds) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteQueryResourceTagNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteQueryResourceTagNV");
        try { Handles.MH_glDeleteQueryResourceTagNV.invokeExact(handles.PFN_glDeleteQueryResourceTagNV, n, tagIds); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteQueryResourceTagNV", e); }
    }

    /// ```
    /// void glQueryResourceTagNV(GLint tagId, const GLchar* tagString);
    /// ```
    public void QueryResourceTagNV(int tagId, MemorySegment tagString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glQueryResourceTagNV)) throw new SymbolNotFoundError("Symbol not found: glQueryResourceTagNV");
        try { Handles.MH_glQueryResourceTagNV.invokeExact(handles.PFN_glQueryResourceTagNV, tagId, tagString); }
        catch (Throwable e) { throw new RuntimeException("error in QueryResourceTagNV", e); }
    }

}
