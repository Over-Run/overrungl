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
    public static final MethodHandle MH_glClearDepthfOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glClearDepthfOES;
    public static final MethodHandle MH_glClipPlanefOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClipPlanefOES;
    public static final MethodHandle MH_glDepthRangefOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glDepthRangefOES;
    public static final MethodHandle MH_glFrustumfOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glFrustumfOES;
    public static final MethodHandle MH_glGetClipPlanefOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetClipPlanefOES;
    public static final MethodHandle MH_glOrthofOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glOrthofOES;

    public GLOESSinglePrecision(overrungl.opengl.GLLoadFunc func) {
        PFN_glClearDepthfOES = func.invoke("glClearDepthfOES", "glClearDepthf");
        PFN_glClipPlanefOES = func.invoke("glClipPlanefOES");
        PFN_glDepthRangefOES = func.invoke("glDepthRangefOES", "glDepthRangef");
        PFN_glFrustumfOES = func.invoke("glFrustumfOES");
        PFN_glGetClipPlanefOES = func.invoke("glGetClipPlanefOES");
        PFN_glOrthofOES = func.invoke("glOrthofOES");
    }

    public void ClearDepthfOES(@CType("GLclampf") float depth) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearDepthfOES))
            MH_glClearDepthfOES.invokeExact(PFN_glClearDepthfOES, depth);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepthfOES", e); }
    }

    public void ClipPlanefOES(@CType("GLenum") int plane, @CType("const GLfloat *") java.lang.foreign.MemorySegment equation) {
        try { if (!Unmarshal.isNullPointer(PFN_glClipPlanefOES))
            MH_glClipPlanefOES.invokeExact(PFN_glClipPlanefOES, plane, equation);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClipPlanefOES", e); }
    }

    public void DepthRangefOES(@CType("GLclampf") float n, @CType("GLclampf") float f) {
        try { if (!Unmarshal.isNullPointer(PFN_glDepthRangefOES))
            MH_glDepthRangefOES.invokeExact(PFN_glDepthRangefOES, n, f);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangefOES", e); }
    }

    public void FrustumfOES(@CType("GLfloat") float l, @CType("GLfloat") float r, @CType("GLfloat") float b, @CType("GLfloat") float t, @CType("GLfloat") float n, @CType("GLfloat") float f) {
        try { if (!Unmarshal.isNullPointer(PFN_glFrustumfOES))
            MH_glFrustumfOES.invokeExact(PFN_glFrustumfOES, l, r, b, t, n, f);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFrustumfOES", e); }
    }

    public void GetClipPlanefOES(@CType("GLenum") int plane, @CType("GLfloat *") java.lang.foreign.MemorySegment equation) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetClipPlanefOES))
            MH_glGetClipPlanefOES.invokeExact(PFN_glGetClipPlanefOES, plane, equation);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetClipPlanefOES", e); }
    }

    public void OrthofOES(@CType("GLfloat") float l, @CType("GLfloat") float r, @CType("GLfloat") float b, @CType("GLfloat") float t, @CType("GLfloat") float n, @CType("GLfloat") float f) {
        try { if (!Unmarshal.isNullPointer(PFN_glOrthofOES))
            MH_glOrthofOES.invokeExact(PFN_glOrthofOES, l, r, b, t, n, f);
        }
        catch (Throwable e) { throw new RuntimeException("error in glOrthofOES", e); }
    }

}
