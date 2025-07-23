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

public final class GLMESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferParameteriMESA = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferParameterivMESA = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFramebufferParameteriMESA;
        public final MemorySegment PFN_glGetFramebufferParameterivMESA;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferParameteriMESA = func.invoke("glFramebufferParameteriMESA");
            PFN_glGetFramebufferParameterivMESA = func.invoke("glGetFramebufferParameterivMESA");
        }
    }

    public GLMESAFramebufferFlipY(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFramebufferParameteriMESA((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FramebufferParameteriMESA(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferParameteriMESA)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferParameteriMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferParameteriMESA", target, pname, param); }
        Handles.MH_glFramebufferParameteriMESA.invokeExact(handles.PFN_glFramebufferParameteriMESA, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferParameteriMESA", e); }
    }

    /// ```
    /// void glGetFramebufferParameterivMESA((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferParameterivMESA(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameterivMESA)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferParameterivMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFramebufferParameterivMESA", target, pname, params); }
        Handles.MH_glGetFramebufferParameterivMESA.invokeExact(handles.PFN_glGetFramebufferParameterivMESA, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameterivMESA", e); }
    }

}
