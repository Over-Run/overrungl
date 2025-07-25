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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLATIMapObjectBuffer {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMapObjectBufferATI = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapObjectBufferATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMapObjectBufferATI;
        public final MemorySegment PFN_glUnmapObjectBufferATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMapObjectBufferATI = func.invoke("glMapObjectBufferATI");
            PFN_glUnmapObjectBufferATI = func.invoke("glUnmapObjectBufferATI");
        }
    }

    public GLATIMapObjectBuffer(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void* glMapObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public MemorySegment MapObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glMapObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapObjectBufferATI", buffer); }
        return (MemorySegment) Handles.MH_glMapObjectBufferATI.invokeExact(handles.PFN_glMapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in MapObjectBufferATI", e); }
    }

    /// ```
    /// void glUnmapObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public void UnmapObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glUnmapObjectBufferATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUnmapObjectBufferATI", buffer); }
        Handles.MH_glUnmapObjectBufferATI.invokeExact(handles.PFN_glUnmapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapObjectBufferATI", e); }
    }

}
