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

public final class GLARBMultiDrawIndirect {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiDrawArraysIndirect;
        public final MemorySegment PFN_glMultiDrawElementsIndirect;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirect = func.invoke("glMultiDrawArraysIndirect");
            PFN_glMultiDrawElementsIndirect = func.invoke("glMultiDrawElementsIndirect");
        }
    }

    public GLARBMultiDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMultiDrawArraysIndirect((unsigned int) GLenum mode, const void* indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirect(int mode, MemorySegment indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawArraysIndirect", mode, indirect, drawcount, stride); }
        Handles.MH_glMultiDrawArraysIndirect.invokeExact(handles.PFN_glMultiDrawArraysIndirect, mode, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirect", e); }
    }

    /// ```
    /// void glMultiDrawElementsIndirect((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirect(int mode, int type, MemorySegment indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiDrawElementsIndirect", mode, type, indirect, drawcount, stride); }
        Handles.MH_glMultiDrawElementsIndirect.invokeExact(handles.PFN_glMultiDrawElementsIndirect, mode, type, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirect", e); }
    }

}
