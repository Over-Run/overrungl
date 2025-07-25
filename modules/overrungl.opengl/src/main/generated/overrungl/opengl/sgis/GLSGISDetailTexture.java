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

public final class GLSGISDetailTexture {
    public static final int GL_DETAIL_TEXTURE_2D_SGIS = 0x8095;
    public static final int GL_DETAIL_TEXTURE_2D_BINDING_SGIS = 0x8096;
    public static final int GL_LINEAR_DETAIL_SGIS = 0x8097;
    public static final int GL_LINEAR_DETAIL_ALPHA_SGIS = 0x8098;
    public static final int GL_LINEAR_DETAIL_COLOR_SGIS = 0x8099;
    public static final int GL_DETAIL_TEXTURE_LEVEL_SGIS = 0x809A;
    public static final int GL_DETAIL_TEXTURE_MODE_SGIS = 0x809B;
    public static final int GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS = 0x809C;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDetailTexFuncSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDetailTexFuncSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDetailTexFuncSGIS;
        public final MemorySegment PFN_glGetDetailTexFuncSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDetailTexFuncSGIS = func.invoke("glDetailTexFuncSGIS");
            PFN_glGetDetailTexFuncSGIS = func.invoke("glGetDetailTexFuncSGIS");
        }
    }

    public GLSGISDetailTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDetailTexFuncSGIS((unsigned int) GLenum target, (int) GLsizei n, const GLfloat* points);
    /// ```
    public void DetailTexFuncSGIS(int target, int n, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDetailTexFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glDetailTexFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDetailTexFuncSGIS", target, n, points); }
        Handles.MH_glDetailTexFuncSGIS.invokeExact(handles.PFN_glDetailTexFuncSGIS, target, n, points); }
        catch (Throwable e) { throw new RuntimeException("error in DetailTexFuncSGIS", e); }
    }

    /// ```
    /// void glGetDetailTexFuncSGIS((unsigned int) GLenum target, GLfloat* points);
    /// ```
    public void GetDetailTexFuncSGIS(int target, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDetailTexFuncSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glGetDetailTexFuncSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetDetailTexFuncSGIS", target, points); }
        Handles.MH_glGetDetailTexFuncSGIS.invokeExact(handles.PFN_glGetDetailTexFuncSGIS, target, points); }
        catch (Throwable e) { throw new RuntimeException("error in GetDetailTexFuncSGIS", e); }
    }

}
