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
package overrungl.opengl.sunx;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLSUNXConstantData {
    public static final int GL_UNPACK_CONSTANT_DATA_SUNX = 0x81D5;
    public static final int GL_TEXTURE_CONSTANT_DATA_SUNX = 0x81D6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFinishTextureSUNX = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glFinishTextureSUNX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFinishTextureSUNX = func.invoke("glFinishTextureSUNX");
        }
    }

    public GLSUNXConstantData(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFinishTextureSUNX();
    /// ```
    public void FinishTextureSUNX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glFinishTextureSUNX)) throw new GLSymbolNotFoundError("Symbol not found: glFinishTextureSUNX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFinishTextureSUNX"); }
        Handles.MH_glFinishTextureSUNX.invokeExact(handles.PFN_glFinishTextureSUNX); }
        catch (Throwable e) { throw new RuntimeException("error in FinishTextureSUNX", e); }
    }

}
