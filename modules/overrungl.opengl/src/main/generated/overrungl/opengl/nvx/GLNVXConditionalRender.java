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
package overrungl.opengl.nvx;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVXConditionalRender {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBeginConditionalRenderNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndConditionalRenderNVX = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glBeginConditionalRenderNVX;
        public final MemorySegment PFN_glEndConditionalRenderNVX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBeginConditionalRenderNVX = func.invoke("glBeginConditionalRenderNVX");
            PFN_glEndConditionalRenderNVX = func.invoke("glEndConditionalRenderNVX", "glEndConditionalRender");
        }
    }

    public GLNVXConditionalRender(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBeginConditionalRenderNVX((unsigned int) GLuint id);
    /// ```
    public void BeginConditionalRenderNVX(int id) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginConditionalRenderNVX)) throw new GLSymbolNotFoundError("Symbol not found: glBeginConditionalRenderNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginConditionalRenderNVX", id); }
        Handles.MH_glBeginConditionalRenderNVX.invokeExact(handles.PFN_glBeginConditionalRenderNVX, id); }
        catch (Throwable e) { throw new RuntimeException("error in BeginConditionalRenderNVX", e); }
    }

    /// ```
    /// void glEndConditionalRenderNVX();
    /// ```
    public void EndConditionalRenderNVX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndConditionalRenderNVX)) throw new GLSymbolNotFoundError("Symbol not found: glEndConditionalRenderNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndConditionalRenderNVX"); }
        Handles.MH_glEndConditionalRenderNVX.invokeExact(handles.PFN_glEndConditionalRenderNVX); }
        catch (Throwable e) { throw new RuntimeException("error in EndConditionalRenderNVX", e); }
    }

}
