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
package overrungl.opengl.sgix;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIX_tag_sample_buffer`
public final class GLSGIXTagSampleBuffer {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTagSampleBufferSGIX = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glTagSampleBufferSGIX;
        private Handles(GLLoadFunc func) {
            PFN_glTagSampleBufferSGIX = func.invoke("glTagSampleBufferSGIX");
        }
    }

    public GLSGIXTagSampleBuffer(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTagSampleBufferSGIX`.
    /// ```
    /// void glTagSampleBufferSGIX();
    /// ```
    public void TagSampleBufferSGIX() {
        if (MemoryUtil.isNullPointer(handles.PFN_glTagSampleBufferSGIX)) throw new GLSymbolNotFoundError("Symbol not found: glTagSampleBufferSGIX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTagSampleBufferSGIX"); }
        Handles.MH_glTagSampleBufferSGIX.invokeExact(handles.PFN_glTagSampleBufferSGIX); }
        catch (Throwable e) { throw new RuntimeException("error in TagSampleBufferSGIX", e); }
    }

}
