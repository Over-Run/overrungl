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
package overrungl.opengl.sgis;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLSGISFogFunction {
    public static final int GL_FOG_FUNC_SGIS = 0x812A;
    public static final int GL_FOG_FUNC_POINTS_SGIS = 0x812B;
    public static final int GL_MAX_FOG_FUNC_POINTS_SGIS = 0x812C;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFogFuncSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFogFuncSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFogFuncSGIS;
        public final MemorySegment PFN_glGetFogFuncSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFogFuncSGIS = func.invoke("glFogFuncSGIS");
            PFN_glGetFogFuncSGIS = func.invoke("glGetFogFuncSGIS");
        }
    }

    public GLSGISFogFunction(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFogFuncSGIS((int) GLsizei n, const GLfloat* points);
    /// ```
    public void FogFuncSGIS(int n, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glFogFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogFuncSGIS", n, points); }
        Handles.MH_glFogFuncSGIS.invokeExact(handles.PFN_glFogFuncSGIS, n, points); }
        catch (Throwable e) { throw new RuntimeException("error in FogFuncSGIS", e); }
    }

    /// ```
    /// void glGetFogFuncSGIS(GLfloat* points);
    /// ```
    public void GetFogFuncSGIS(MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFogFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetFogFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFogFuncSGIS", points); }
        Handles.MH_glGetFogFuncSGIS.invokeExact(handles.PFN_glGetFogFuncSGIS, points); }
        catch (Throwable e) { throw new RuntimeException("error in GetFogFuncSGIS", e); }
    }

}
