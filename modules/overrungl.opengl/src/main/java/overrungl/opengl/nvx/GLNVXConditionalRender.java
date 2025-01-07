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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVXConditionalRender {
    public static final MethodHandle MH_glBeginConditionalRenderNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginConditionalRenderNVX;
    public static final MethodHandle MH_glEndConditionalRenderNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndConditionalRenderNVX;

    public GLNVXConditionalRender(overrungl.opengl.GLLoadFunc func) {
        PFN_glBeginConditionalRenderNVX = func.invoke("glBeginConditionalRenderNVX");
        PFN_glEndConditionalRenderNVX = func.invoke("glEndConditionalRenderNVX", "glEndConditionalRender");
    }

    public void BeginConditionalRenderNVX(@CType("GLuint") int id) {
        if (!Unmarshal.isNullPointer(PFN_glBeginConditionalRenderNVX)) { try {
            MH_glBeginConditionalRenderNVX.invokeExact(PFN_glBeginConditionalRenderNVX, id);
        } catch (Throwable e) { throw new RuntimeException("error in glBeginConditionalRenderNVX", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBeginConditionalRenderNVX"); }
    }

    public void EndConditionalRenderNVX() {
        if (!Unmarshal.isNullPointer(PFN_glEndConditionalRenderNVX)) { try {
            MH_glEndConditionalRenderNVX.invokeExact(PFN_glEndConditionalRenderNVX);
        } catch (Throwable e) { throw new RuntimeException("error in glEndConditionalRenderNVX", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEndConditionalRenderNVX"); }
    }

}
