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
    public final MemorySegment PFN_glGenOcclusionQueriesNV;
    public static final MethodHandle MH_glDeleteOcclusionQueriesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteOcclusionQueriesNV;
    public static final MethodHandle MH_glIsOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsOcclusionQueryNV;
    public static final MethodHandle MH_glBeginOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginOcclusionQueryNV;
    public static final MethodHandle MH_glEndOcclusionQueryNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndOcclusionQueryNV;
    public static final MethodHandle MH_glGetOcclusionQueryivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetOcclusionQueryivNV;
    public static final MethodHandle MH_glGetOcclusionQueryuivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
        try { if (!Unmarshal.isNullPointer(PFN_glGenOcclusionQueriesNV))
            MH_glGenOcclusionQueriesNV.invokeExact(PFN_glGenOcclusionQueriesNV, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenOcclusionQueriesNV", e); }
    }

    public void DeleteOcclusionQueriesNV(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteOcclusionQueriesNV))
            MH_glDeleteOcclusionQueriesNV.invokeExact(PFN_glDeleteOcclusionQueriesNV, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteOcclusionQueriesNV", e); }
    }

    public @CType("GLboolean") boolean IsOcclusionQueryNV(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsOcclusionQueryNV))
            return (boolean) MH_glIsOcclusionQueryNV.invokeExact(PFN_glIsOcclusionQueryNV, id);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsOcclusionQueryNV", e); }
    }

    public void BeginOcclusionQueryNV(@CType("GLuint") int id) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginOcclusionQueryNV))
            MH_glBeginOcclusionQueryNV.invokeExact(PFN_glBeginOcclusionQueryNV, id);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginOcclusionQueryNV", e); }
    }

    public void EndOcclusionQueryNV() {
        try { if (!Unmarshal.isNullPointer(PFN_glEndOcclusionQueryNV))
            MH_glEndOcclusionQueryNV.invokeExact(PFN_glEndOcclusionQueryNV);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndOcclusionQueryNV", e); }
    }

    public void GetOcclusionQueryivNV(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetOcclusionQueryivNV))
            MH_glGetOcclusionQueryivNV.invokeExact(PFN_glGetOcclusionQueryivNV, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetOcclusionQueryivNV", e); }
    }

    public void GetOcclusionQueryuivNV(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetOcclusionQueryuivNV))
            MH_glGetOcclusionQueryuivNV.invokeExact(PFN_glGetOcclusionQueryuivNV, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetOcclusionQueryuivNV", e); }
    }

}
