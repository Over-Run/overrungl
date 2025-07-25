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

public final class GLNVRegisterCombiners2 {
    public static final int GL_PER_STAGE_CONSTANTS_NV = 0x8535;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCombinerStageParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCombinerStageParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glCombinerStageParameterfvNV;
        public final MemorySegment PFN_glGetCombinerStageParameterfvNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCombinerStageParameterfvNV = func.invoke("glCombinerStageParameterfvNV");
            PFN_glGetCombinerStageParameterfvNV = func.invoke("glGetCombinerStageParameterfvNV");
        }
    }

    public GLNVRegisterCombiners2(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glCombinerStageParameterfvNV((unsigned int) GLenum stage, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void CombinerStageParameterfvNV(int stage, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCombinerStageParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glCombinerStageParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCombinerStageParameterfvNV", stage, pname, params); }
        Handles.MH_glCombinerStageParameterfvNV.invokeExact(handles.PFN_glCombinerStageParameterfvNV, stage, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in CombinerStageParameterfvNV", e); }
    }

    /// ```
    /// void glGetCombinerStageParameterfvNV((unsigned int) GLenum stage, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetCombinerStageParameterfvNV(int stage, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCombinerStageParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetCombinerStageParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCombinerStageParameterfvNV", stage, pname, params); }
        Handles.MH_glGetCombinerStageParameterfvNV.invokeExact(handles.PFN_glGetCombinerStageParameterfvNV, stage, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetCombinerStageParameterfvNV", e); }
    }

}
