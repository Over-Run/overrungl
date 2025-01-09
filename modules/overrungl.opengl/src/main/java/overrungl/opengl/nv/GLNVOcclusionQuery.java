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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVOcclusionQuery {
    public static final int GL_PIXEL_COUNTER_BITS_NV = 0x8864;
    public static final int GL_CURRENT_OCCLUSION_QUERY_ID_NV = 0x8865;
    public static final int GL_PIXEL_COUNT_NV = 0x8866;
    public static final int GL_PIXEL_COUNT_AVAILABLE_NV = 0x8867;
    public static final MethodHandle MH_glGenOcclusionQueriesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glDeleteOcclusionQueriesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glIsOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
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

    public GLNVOcclusionQuery(overrungl.opengl.GLLoadFunc func) {
        PFN_glGenOcclusionQueriesNV = func.invoke("glGenOcclusionQueriesNV");
        PFN_glDeleteOcclusionQueriesNV = func.invoke("glDeleteOcclusionQueriesNV");
        PFN_glIsOcclusionQueryNV = func.invoke("glIsOcclusionQueryNV");
        PFN_glBeginOcclusionQueryNV = func.invoke("glBeginOcclusionQueryNV");
        PFN_glEndOcclusionQueryNV = func.invoke("glEndOcclusionQueryNV");
        PFN_glGetOcclusionQueryivNV = func.invoke("glGetOcclusionQueryivNV");
        PFN_glGetOcclusionQueryuivNV = func.invoke("glGetOcclusionQueryuivNV");
    }

    public void GenOcclusionQueriesNV(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(PFN_glGenOcclusionQueriesNV)) throw new SymbolNotFoundError("Symbol not found: glGenOcclusionQueriesNV");
        try { MH_glGenOcclusionQueriesNV.invokeExact(PFN_glGenOcclusionQueriesNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glGenOcclusionQueriesNV", e); }
    }

    public void DeleteOcclusionQueriesNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        if (Unmarshal.isNullPointer(PFN_glDeleteOcclusionQueriesNV)) throw new SymbolNotFoundError("Symbol not found: glDeleteOcclusionQueriesNV");
        try { MH_glDeleteOcclusionQueriesNV.invokeExact(PFN_glDeleteOcclusionQueriesNV, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteOcclusionQueriesNV", e); }
    }

    public @CType("GLboolean") boolean IsOcclusionQueryNV(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(PFN_glIsOcclusionQueryNV)) throw new SymbolNotFoundError("Symbol not found: glIsOcclusionQueryNV");
        try { return (boolean) MH_glIsOcclusionQueryNV.invokeExact(PFN_glIsOcclusionQueryNV, id); }
        catch (Throwable e) { throw new RuntimeException("error in glIsOcclusionQueryNV", e); }
    }

    public void BeginOcclusionQueryNV(@CType("GLuint") int id) {
        if (Unmarshal.isNullPointer(PFN_glBeginOcclusionQueryNV)) throw new SymbolNotFoundError("Symbol not found: glBeginOcclusionQueryNV");
        try { MH_glBeginOcclusionQueryNV.invokeExact(PFN_glBeginOcclusionQueryNV, id); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginOcclusionQueryNV", e); }
    }

    public void EndOcclusionQueryNV() {
        if (Unmarshal.isNullPointer(PFN_glEndOcclusionQueryNV)) throw new SymbolNotFoundError("Symbol not found: glEndOcclusionQueryNV");
        try { MH_glEndOcclusionQueryNV.invokeExact(PFN_glEndOcclusionQueryNV); }
        catch (Throwable e) { throw new RuntimeException("error in glEndOcclusionQueryNV", e); }
    }

    public void GetOcclusionQueryivNV(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetOcclusionQueryivNV)) throw new SymbolNotFoundError("Symbol not found: glGetOcclusionQueryivNV");
        try { MH_glGetOcclusionQueryivNV.invokeExact(PFN_glGetOcclusionQueryivNV, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetOcclusionQueryivNV", e); }
    }

    public void GetOcclusionQueryuivNV(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetOcclusionQueryuivNV)) throw new SymbolNotFoundError("Symbol not found: glGetOcclusionQueryuivNV");
        try { MH_glGetOcclusionQueryuivNV.invokeExact(PFN_glGetOcclusionQueryuivNV, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetOcclusionQueryuivNV", e); }
    }

}
