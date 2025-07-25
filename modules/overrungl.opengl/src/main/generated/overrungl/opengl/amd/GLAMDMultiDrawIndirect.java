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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAMDMultiDrawIndirect {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirectAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirectAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiDrawArraysIndirectAMD;
        public final MemorySegment PFN_glMultiDrawElementsIndirectAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirectAMD = func.invoke("glMultiDrawArraysIndirectAMD", "glMultiDrawArraysIndirect");
            PFN_glMultiDrawElementsIndirectAMD = func.invoke("glMultiDrawElementsIndirectAMD", "glMultiDrawElementsIndirect");
        }
    }

    public GLAMDMultiDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMultiDrawArraysIndirectAMD((unsigned int) GLenum mode, const void* indirect, (int) GLsizei primcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirectAMD(int mode, MemorySegment indirect, int primcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirectAMD)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysIndirectAMD", mode, indirect, primcount, stride); }
        Handles.MH_glMultiDrawArraysIndirectAMD.invokeExact(handles.PFN_glMultiDrawArraysIndirectAMD, mode, indirect, primcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirectAMD", e); }
    }

    /// ```
    /// void glMultiDrawElementsIndirectAMD((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, (int) GLsizei primcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirectAMD(int mode, int type, MemorySegment indirect, int primcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirectAMD)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsIndirectAMD", mode, type, indirect, primcount, stride); }
        Handles.MH_glMultiDrawElementsIndirectAMD.invokeExact(handles.PFN_glMultiDrawElementsIndirectAMD, mode, type, indirect, primcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirectAMD", e); }
    }

}
