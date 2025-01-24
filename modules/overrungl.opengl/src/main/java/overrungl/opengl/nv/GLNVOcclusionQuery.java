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

public final class GLNVOcclusionQuery {
    public static final int GL_PIXEL_COUNTER_BITS_NV = 0x8864;
    public static final int GL_CURRENT_OCCLUSION_QUERY_ID_NV = 0x8865;
    public static final int GL_PIXEL_COUNT_NV = 0x8866;
    public static final int GL_PIXEL_COUNT_AVAILABLE_NV = 0x8867;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGenOcclusionQueriesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteOcclusionQueriesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glGetOcclusionQueryivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetOcclusionQueryuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGenOcclusionQueriesNV;
        public final MemorySegment PFN_glDeleteOcclusionQueriesNV;
        public final MemorySegment PFN_glIsOcclusionQueryNV;
        public final MemorySegment PFN_glBeginOcclusionQueryNV;
        public final MemorySegment PFN_glEndOcclusionQueryNV;
        public final MemorySegment PFN_glGetOcclusionQueryivNV;
        public final MemorySegment PFN_glGetOcclusionQueryuivNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenOcclusionQueriesNV = func.invoke("glGenOcclusionQueriesNV");
            PFN_glDeleteOcclusionQueriesNV = func.invoke("glDeleteOcclusionQueriesNV");
            PFN_glIsOcclusionQueryNV = func.invoke("glIsOcclusionQueryNV");
            PFN_glBeginOcclusionQueryNV = func.invoke("glBeginOcclusionQueryNV");
            PFN_glEndOcclusionQueryNV = func.invoke("glEndOcclusionQueryNV");
            PFN_glGetOcclusionQueryivNV = func.invoke("glGetOcclusionQueryivNV");
            PFN_glGetOcclusionQueryuivNV = func.invoke("glGetOcclusionQueryuivNV");
        }
    }

    public GLNVOcclusionQuery(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGenOcclusionQueriesNV(int n, GLuint* ids);
    /// ```
    public void GenOcclusionQueriesNV(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenOcclusionQueriesNV)) throw new SymbolNotFoundError("Symbol not found: glGenOcclusionQueriesNV");
        try { Handles.MH_glGenOcclusionQueriesNV.invokeExact(handles.PFN_glGenOcclusionQueriesNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in GenOcclusionQueriesNV", e); }
    }

    /// ```
    /// void glDeleteOcclusionQueriesNV(int n, const GLuint* ids);
    /// ```
    public void DeleteOcclusionQueriesNV(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteOcclusionQueriesNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteOcclusionQueriesNV");
        try { Handles.MH_glDeleteOcclusionQueriesNV.invokeExact(handles.PFN_glDeleteOcclusionQueriesNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteOcclusionQueriesNV", e); }
    }

    /// ```
    /// GLboolean glIsOcclusionQueryNV(unsigned int id);
    /// ```
    public boolean IsOcclusionQueryNV(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsOcclusionQueryNV)) throw new SymbolNotFoundError("Symbol not found: glIsOcclusionQueryNV");
        try { return (((byte) Handles.MH_glIsOcclusionQueryNV.invokeExact(handles.PFN_glIsOcclusionQueryNV, id)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsOcclusionQueryNV", e); }
    }

    /// ```
    /// void glBeginOcclusionQueryNV(unsigned int id);
    /// ```
    public void BeginOcclusionQueryNV(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginOcclusionQueryNV)) throw new SymbolNotFoundError("Symbol not found: glBeginOcclusionQueryNV");
        try { Handles.MH_glBeginOcclusionQueryNV.invokeExact(handles.PFN_glBeginOcclusionQueryNV, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginOcclusionQueryNV", e); }
    }

    /// ```
    /// void glEndOcclusionQueryNV();
    /// ```
    public void EndOcclusionQueryNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndOcclusionQueryNV)) throw new SymbolNotFoundError("Symbol not found: glEndOcclusionQueryNV");
        try { Handles.MH_glEndOcclusionQueryNV.invokeExact(handles.PFN_glEndOcclusionQueryNV); }
        catch (Throwable e) { throw new RuntimeException("error in EndOcclusionQueryNV", e); }
    }

    /// ```
    /// void glGetOcclusionQueryivNV(unsigned int id, unsigned int pname, GLint* params);
    /// ```
    public void GetOcclusionQueryivNV(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetOcclusionQueryivNV)) throw new SymbolNotFoundError("Symbol not found: glGetOcclusionQueryivNV");
        try { Handles.MH_glGetOcclusionQueryivNV.invokeExact(handles.PFN_glGetOcclusionQueryivNV, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetOcclusionQueryivNV", e); }
    }

    /// ```
    /// void glGetOcclusionQueryuivNV(unsigned int id, unsigned int pname, GLuint* params);
    /// ```
    public void GetOcclusionQueryuivNV(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetOcclusionQueryuivNV)) throw new SymbolNotFoundError("Symbol not found: glGetOcclusionQueryuivNV");
        try { Handles.MH_glGetOcclusionQueryuivNV.invokeExact(handles.PFN_glGetOcclusionQueryuivNV, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetOcclusionQueryuivNV", e); }
    }

}
