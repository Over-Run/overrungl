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

public final class GLNVConditionalRender {
    public static final int GL_QUERY_WAIT_NV = 0x8E13;
    public static final int GL_QUERY_NO_WAIT_NV = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT_NV = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_NV = 0x8E16;
    public static final MethodHandle MH_glBeginConditionalRenderNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginConditionalRenderNV;
    public static final MethodHandle MH_glEndConditionalRenderNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndConditionalRenderNV;

    public GLNVConditionalRender(overrungl.opengl.GLLoadFunc func) {
        PFN_glBeginConditionalRenderNV = func.invoke("glBeginConditionalRenderNV", "glBeginConditionalRender");
        PFN_glEndConditionalRenderNV = func.invoke("glEndConditionalRenderNV", "glEndConditionalRender");
    }

    public void BeginConditionalRenderNV(@CType("GLuint") int id, @CType("GLenum") int mode) {
        if (!Unmarshal.isNullPointer(PFN_glBeginConditionalRenderNV)) { try {
            MH_glBeginConditionalRenderNV.invokeExact(PFN_glBeginConditionalRenderNV, id, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glBeginConditionalRenderNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBeginConditionalRenderNV"); }
    }

    public void EndConditionalRenderNV() {
        if (!Unmarshal.isNullPointer(PFN_glEndConditionalRenderNV)) { try {
            MH_glEndConditionalRenderNV.invokeExact(PFN_glEndConditionalRenderNV);
        } catch (Throwable e) { throw new RuntimeException("error in glEndConditionalRenderNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEndConditionalRenderNV"); }
    }

}
