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

public final class GLNVTextureBarrier {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTextureBarrierNV = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glTextureBarrierNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTextureBarrierNV = func.invoke("glTextureBarrierNV");
        }
    }

    public GLNVTextureBarrier(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glTextureBarrierNV();
    /// ```
    public void TextureBarrierNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBarrierNV)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBarrierNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureBarrierNV"); }
        Handles.MH_glTextureBarrierNV.invokeExact(handles.PFN_glTextureBarrierNV); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBarrierNV", e); }
    }

}
