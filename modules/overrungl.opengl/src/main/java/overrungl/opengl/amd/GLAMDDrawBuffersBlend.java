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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDDrawBuffersBlend {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendFuncIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendFuncSeparateIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendEquationIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendEquationSeparateIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendFuncIndexedAMD;
        public final MemorySegment PFN_glBlendFuncSeparateIndexedAMD;
        public final MemorySegment PFN_glBlendEquationIndexedAMD;
        public final MemorySegment PFN_glBlendEquationSeparateIndexedAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlendFuncIndexedAMD = func.invoke("glBlendFuncIndexedAMD", "glBlendFunci");
            PFN_glBlendFuncSeparateIndexedAMD = func.invoke("glBlendFuncSeparateIndexedAMD", "glBlendFuncSeparatei");
            PFN_glBlendEquationIndexedAMD = func.invoke("glBlendEquationIndexedAMD", "glBlendEquationi");
            PFN_glBlendEquationSeparateIndexedAMD = func.invoke("glBlendEquationSeparateIndexedAMD", "glBlendEquationSeparatei");
        }
    }

    public GLAMDDrawBuffersBlend(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBlendFuncIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum src, (unsigned int) GLenum dst);
    /// ```
    public void BlendFuncIndexedAMD(int buf, int src, int dst) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncIndexedAMD)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncIndexedAMD");
        try { Handles.MH_glBlendFuncIndexedAMD.invokeExact(handles.PFN_glBlendFuncIndexedAMD, buf, src, dst); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncIndexedAMD", e); }
    }

    /// ```
    /// void glBlendFuncSeparateIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum srcRGB, (unsigned int) GLenum dstRGB, (unsigned int) GLenum srcAlpha, (unsigned int) GLenum dstAlpha);
    /// ```
    public void BlendFuncSeparateIndexedAMD(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparateIndexedAMD)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparateIndexedAMD");
        try { Handles.MH_glBlendFuncSeparateIndexedAMD.invokeExact(handles.PFN_glBlendFuncSeparateIndexedAMD, buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparateIndexedAMD", e); }
    }

    /// ```
    /// void glBlendEquationIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum mode);
    /// ```
    public void BlendEquationIndexedAMD(int buf, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationIndexedAMD)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationIndexedAMD");
        try { Handles.MH_glBlendEquationIndexedAMD.invokeExact(handles.PFN_glBlendEquationIndexedAMD, buf, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationIndexedAMD", e); }
    }

    /// ```
    /// void glBlendEquationSeparateIndexedAMD((unsigned int) GLuint buf, (unsigned int) GLenum modeRGB, (unsigned int) GLenum modeAlpha);
    /// ```
    public void BlendEquationSeparateIndexedAMD(int buf, int modeRGB, int modeAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationSeparateIndexedAMD)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationSeparateIndexedAMD");
        try { Handles.MH_glBlendEquationSeparateIndexedAMD.invokeExact(handles.PFN_glBlendEquationSeparateIndexedAMD, buf, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationSeparateIndexedAMD", e); }
    }

}
