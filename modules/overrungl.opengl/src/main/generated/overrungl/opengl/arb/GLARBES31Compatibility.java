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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBES31Compatibility {
    public static final int GL_BACK = 0x0405;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMemoryBarrierByRegion = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMemoryBarrierByRegion;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMemoryBarrierByRegion = func.invoke("glMemoryBarrierByRegion");
        }
    }

    public GLARBES31Compatibility(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMemoryBarrierByRegion((unsigned int) GLbitfield barriers);
    /// ```
    public void MemoryBarrierByRegion(int barriers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMemoryBarrierByRegion)) throw new GLSymbolNotFoundError("Symbol not found: glMemoryBarrierByRegion");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMemoryBarrierByRegion", barriers); }
        Handles.MH_glMemoryBarrierByRegion.invokeExact(handles.PFN_glMemoryBarrierByRegion, barriers); }
        catch (Throwable e) { throw new RuntimeException("error in MemoryBarrierByRegion", e); }
    }

}
