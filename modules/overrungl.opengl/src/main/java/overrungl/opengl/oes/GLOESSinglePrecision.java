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
package overrungl.opengl.oes;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLOESSinglePrecision {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClearDepthfOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glClipPlanefOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangefOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glFrustumfOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGetClipPlanefOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glOrthofOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glClearDepthfOES;
        public final MemorySegment PFN_glClipPlanefOES;
        public final MemorySegment PFN_glDepthRangefOES;
        public final MemorySegment PFN_glFrustumfOES;
        public final MemorySegment PFN_glGetClipPlanefOES;
        public final MemorySegment PFN_glOrthofOES;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glClearDepthfOES = func.invoke("glClearDepthfOES", "glClearDepthf");
            PFN_glClipPlanefOES = func.invoke("glClipPlanefOES");
            PFN_glDepthRangefOES = func.invoke("glDepthRangefOES", "glDepthRangef");
            PFN_glFrustumfOES = func.invoke("glFrustumfOES");
            PFN_glGetClipPlanefOES = func.invoke("glGetClipPlanefOES");
            PFN_glOrthofOES = func.invoke("glOrthofOES");
        }
    }

    public GLOESSinglePrecision(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glClearDepthfOES(GLclampf depth);
    /// ```
    public void ClearDepthfOES(float depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearDepthfOES)) throw new SymbolNotFoundError("Symbol not found: glClearDepthfOES");
        try { Handles.MH_glClearDepthfOES.invokeExact(handles.PFN_glClearDepthfOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in ClearDepthfOES", e); }
    }

    /// ```
    /// void glClipPlanefOES(GLenum plane, const GLfloat* equation);
    /// ```
    public void ClipPlanefOES(int plane, MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClipPlanefOES)) throw new SymbolNotFoundError("Symbol not found: glClipPlanefOES");
        try { Handles.MH_glClipPlanefOES.invokeExact(handles.PFN_glClipPlanefOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in ClipPlanefOES", e); }
    }

    /// ```
    /// void glDepthRangefOES(GLclampf n, GLclampf f);
    /// ```
    public void DepthRangefOES(float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDepthRangefOES)) throw new SymbolNotFoundError("Symbol not found: glDepthRangefOES");
        try { Handles.MH_glDepthRangefOES.invokeExact(handles.PFN_glDepthRangefOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in DepthRangefOES", e); }
    }

    /// ```
    /// void glFrustumfOES(GLfloat l, GLfloat r, GLfloat b, GLfloat t, GLfloat n, GLfloat f);
    /// ```
    public void FrustumfOES(float l, float r, float b, float t, float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFrustumfOES)) throw new SymbolNotFoundError("Symbol not found: glFrustumfOES");
        try { Handles.MH_glFrustumfOES.invokeExact(handles.PFN_glFrustumfOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in FrustumfOES", e); }
    }

    /// ```
    /// void glGetClipPlanefOES(GLenum plane, GLfloat* equation);
    /// ```
    public void GetClipPlanefOES(int plane, MemorySegment equation) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetClipPlanefOES)) throw new SymbolNotFoundError("Symbol not found: glGetClipPlanefOES");
        try { Handles.MH_glGetClipPlanefOES.invokeExact(handles.PFN_glGetClipPlanefOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in GetClipPlanefOES", e); }
    }

    /// ```
    /// void glOrthofOES(GLfloat l, GLfloat r, GLfloat b, GLfloat t, GLfloat n, GLfloat f);
    /// ```
    public void OrthofOES(float l, float r, float b, float t, float n, float f) {
        if (MemoryUtil.isNullPointer(handles.PFN_glOrthofOES)) throw new SymbolNotFoundError("Symbol not found: glOrthofOES");
        try { Handles.MH_glOrthofOES.invokeExact(handles.PFN_glOrthofOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in OrthofOES", e); }
    }

}
