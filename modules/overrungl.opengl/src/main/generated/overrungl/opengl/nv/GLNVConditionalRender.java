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

public final class GLNVConditionalRender {
    public static final int GL_QUERY_WAIT_NV = 0x8E13;
    public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBeginConditionalRenderNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndConditionalRenderNV = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glBeginConditionalRenderNV;
        public final MemorySegment PFN_glEndConditionalRenderNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBeginConditionalRenderNV = func.invoke("glBeginConditionalRenderNV", "glBeginConditionalRender");
            PFN_glEndConditionalRenderNV = func.invoke("glEndConditionalRenderNV", "glEndConditionalRender");
        }
    }

    public GLNVConditionalRender(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBeginConditionalRenderNV((unsigned int) GLuint id, (unsigned int) GLenum mode);
    /// ```
    public void BeginConditionalRenderNV(int id, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginConditionalRenderNV)) throw new GLSymbolNotFoundError("Symbol not found: glBeginConditionalRenderNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginConditionalRenderNV", id, mode); }
        Handles.MH_glBeginConditionalRenderNV.invokeExact(handles.PFN_glBeginConditionalRenderNV, id, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginConditionalRenderNV", e); }
    }

    /// ```
    /// void glEndConditionalRenderNV();
    /// ```
    public void EndConditionalRenderNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndConditionalRenderNV)) throw new GLSymbolNotFoundError("Symbol not found: glEndConditionalRenderNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndConditionalRenderNV"); }
        Handles.MH_glEndConditionalRenderNV.invokeExact(handles.PFN_glEndConditionalRenderNV); }
        catch (Throwable e) { throw new RuntimeException("error in EndConditionalRenderNV", e); }
    }

}
