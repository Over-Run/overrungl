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

public final class GLARBFramebufferNoAttachments {
    public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
    public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
    public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
    public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
    public static final int GL_MAX_FRAMEBUFFER_WIDTH = 0x9315;
    public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 0x9316;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;
    public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFramebufferParameteri;
        public final MemorySegment PFN_glGetFramebufferParameteriv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferParameteri = func.invoke("glFramebufferParameteri");
            PFN_glGetFramebufferParameteriv = func.invoke("glGetFramebufferParameteriv");
        }
    }

    public GLARBFramebufferNoAttachments(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFramebufferParameteri((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FramebufferParameteri(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferParameteri", target, pname, param); }
        Handles.MH_glFramebufferParameteri.invokeExact(handles.PFN_glFramebufferParameteri, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferParameteri", e); }
    }

    /// ```
    /// void glGetFramebufferParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferParameteriv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFramebufferParameteriv", target, pname, params); }
        Handles.MH_glGetFramebufferParameteriv.invokeExact(handles.PFN_glGetFramebufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameteriv", e); }
    }

}
