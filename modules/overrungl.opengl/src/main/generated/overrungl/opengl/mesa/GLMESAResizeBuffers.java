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
package overrungl.opengl.mesa;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLMESAResizeBuffers {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glResizeBuffersMESA = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glResizeBuffersMESA;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glResizeBuffersMESA = func.invoke("glResizeBuffersMESA");
        }
    }

    public GLMESAResizeBuffers(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glResizeBuffersMESA();
    /// ```
    public void ResizeBuffersMESA() {
        if (MemoryUtil.isNullPointer(handles.PFN_glResizeBuffersMESA)) throw new GLSymbolNotFoundError("Symbol not found: glResizeBuffersMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glResizeBuffersMESA"); }
        Handles.MH_glResizeBuffersMESA.invokeExact(handles.PFN_glResizeBuffersMESA); }
        catch (Throwable e) { throw new RuntimeException("error in ResizeBuffersMESA", e); }
    }

}
