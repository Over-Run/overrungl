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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVConditionalRender {
    public static final int GL_QUERY_WAIT_NV = 0x8E13;
    public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBeginConditionalRenderNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndConditionalRenderNV = FunctionDescriptor.ofVoid();
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBeginConditionalRenderNV,
            FD_glEndConditionalRenderNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBeginConditionalRenderNV = RuntimeHelper.downcall(Descriptors.FD_glBeginConditionalRenderNV);
        public static final MethodHandle MH_glEndConditionalRenderNV = RuntimeHelper.downcall(Descriptors.FD_glEndConditionalRenderNV);
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

    public void BeginConditionalRenderNV(@CType("GLuint") int id, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginConditionalRenderNV)) throw new SymbolNotFoundError("Symbol not found: glBeginConditionalRenderNV");
        try { Handles.MH_glBeginConditionalRenderNV.invokeExact(handles.PFN_glBeginConditionalRenderNV, id, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginConditionalRenderNV", e); }
    }

    public void EndConditionalRenderNV() {
        if (Unmarshal.isNullPointer(handles.PFN_glEndConditionalRenderNV)) throw new SymbolNotFoundError("Symbol not found: glEndConditionalRenderNV");
        try { Handles.MH_glEndConditionalRenderNV.invokeExact(handles.PFN_glEndConditionalRenderNV); }
        catch (Throwable e) { throw new RuntimeException("error in glEndConditionalRenderNV", e); }
    }

}
