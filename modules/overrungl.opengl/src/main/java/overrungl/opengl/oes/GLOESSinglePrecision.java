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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLOESSinglePrecision {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glClearDepthfOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glClipPlanefOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDepthRangefOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glFrustumfOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glGetClipPlanefOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glOrthofOES = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glClearDepthfOES = RuntimeHelper.downcall(Descriptors.FD_glClearDepthfOES);
        public static final MethodHandle MH_glClipPlanefOES = RuntimeHelper.downcall(Descriptors.FD_glClipPlanefOES);
        public static final MethodHandle MH_glDepthRangefOES = RuntimeHelper.downcall(Descriptors.FD_glDepthRangefOES);
        public static final MethodHandle MH_glFrustumfOES = RuntimeHelper.downcall(Descriptors.FD_glFrustumfOES);
        public static final MethodHandle MH_glGetClipPlanefOES = RuntimeHelper.downcall(Descriptors.FD_glGetClipPlanefOES);
        public static final MethodHandle MH_glOrthofOES = RuntimeHelper.downcall(Descriptors.FD_glOrthofOES);
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

    public void ClearDepthfOES(@CType("GLclampf") float depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearDepthfOES)) throw new SymbolNotFoundError("Symbol not found: glClearDepthfOES");
        try { Handles.MH_glClearDepthfOES.invokeExact(handles.PFN_glClearDepthfOES, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepthfOES", e); }
    }

    public void ClipPlanefOES(@CType("GLenum") int plane, @CType("const GLfloat *") MemorySegment equation) {
        if (Unmarshal.isNullPointer(handles.PFN_glClipPlanefOES)) throw new SymbolNotFoundError("Symbol not found: glClipPlanefOES");
        try { Handles.MH_glClipPlanefOES.invokeExact(handles.PFN_glClipPlanefOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in glClipPlanefOES", e); }
    }

    public void DepthRangefOES(@CType("GLclampf") float n, @CType("GLclampf") float f) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangefOES)) throw new SymbolNotFoundError("Symbol not found: glDepthRangefOES");
        try { Handles.MH_glDepthRangefOES.invokeExact(handles.PFN_glDepthRangefOES, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangefOES", e); }
    }

    public void FrustumfOES(@CType("GLfloat") float l, @CType("GLfloat") float r, @CType("GLfloat") float b, @CType("GLfloat") float t, @CType("GLfloat") float n, @CType("GLfloat") float f) {
        if (Unmarshal.isNullPointer(handles.PFN_glFrustumfOES)) throw new SymbolNotFoundError("Symbol not found: glFrustumfOES");
        try { Handles.MH_glFrustumfOES.invokeExact(handles.PFN_glFrustumfOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glFrustumfOES", e); }
    }

    public void GetClipPlanefOES(@CType("GLenum") int plane, @CType("GLfloat *") MemorySegment equation) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetClipPlanefOES)) throw new SymbolNotFoundError("Symbol not found: glGetClipPlanefOES");
        try { Handles.MH_glGetClipPlanefOES.invokeExact(handles.PFN_glGetClipPlanefOES, plane, equation); }
        catch (Throwable e) { throw new RuntimeException("error in glGetClipPlanefOES", e); }
    }

    public void OrthofOES(@CType("GLfloat") float l, @CType("GLfloat") float r, @CType("GLfloat") float b, @CType("GLfloat") float t, @CType("GLfloat") float n, @CType("GLfloat") float f) {
        if (Unmarshal.isNullPointer(handles.PFN_glOrthofOES)) throw new SymbolNotFoundError("Symbol not found: glOrthofOES");
        try { Handles.MH_glOrthofOES.invokeExact(handles.PFN_glOrthofOES, l, r, b, t, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glOrthofOES", e); }
    }

}
