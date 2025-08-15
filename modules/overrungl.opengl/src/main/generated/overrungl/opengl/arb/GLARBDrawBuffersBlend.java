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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_draw_buffers_blend`
public final class GLARBDrawBuffersBlend {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendEquationiARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendEquationSeparateiARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendFunciARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlendFuncSeparateiARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendEquationiARB;
        public final MemorySegment PFN_glBlendEquationSeparateiARB;
        public final MemorySegment PFN_glBlendFunciARB;
        public final MemorySegment PFN_glBlendFuncSeparateiARB;
        private Handles(GLLoadFunc func) {
            PFN_glBlendEquationiARB = func.invoke("glBlendEquationiARB", "glBlendEquationi");
            PFN_glBlendEquationSeparateiARB = func.invoke("glBlendEquationSeparateiARB", "glBlendEquationSeparatei");
            PFN_glBlendFunciARB = func.invoke("glBlendFunciARB", "glBlendFunci");
            PFN_glBlendFuncSeparateiARB = func.invoke("glBlendFuncSeparateiARB", "glBlendFuncSeparatei");
        }
    }

    public GLARBDrawBuffersBlend(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendEquationiARB`.
    /// ```
    /// void glBlendEquationiARB((unsigned int) GLuint buf, (unsigned int) GLenum mode);
    /// ```
    public void BlendEquationiARB(int buf, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationiARB)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationiARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationiARB", buf, mode); }
        Handles.MH_glBlendEquationiARB.invokeExact(handles.PFN_glBlendEquationiARB, buf, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationiARB", e); }
    }

    /// Invokes `glBlendEquationSeparateiARB`.
    /// ```
    /// void glBlendEquationSeparateiARB((unsigned int) GLuint buf, (unsigned int) GLenum modeRGB, (unsigned int) GLenum modeAlpha);
    /// ```
    public void BlendEquationSeparateiARB(int buf, int modeRGB, int modeAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationSeparateiARB)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationSeparateiARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationSeparateiARB", buf, modeRGB, modeAlpha); }
        Handles.MH_glBlendEquationSeparateiARB.invokeExact(handles.PFN_glBlendEquationSeparateiARB, buf, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationSeparateiARB", e); }
    }

    /// Invokes `glBlendFunciARB`.
    /// ```
    /// void glBlendFunciARB((unsigned int) GLuint buf, (unsigned int) GLenum src, (unsigned int) GLenum dst);
    /// ```
    public void BlendFunciARB(int buf, int src, int dst) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFunciARB)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFunciARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFunciARB", buf, src, dst); }
        Handles.MH_glBlendFunciARB.invokeExact(handles.PFN_glBlendFunciARB, buf, src, dst); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFunciARB", e); }
    }

    /// Invokes `glBlendFuncSeparateiARB`.
    /// ```
    /// void glBlendFuncSeparateiARB((unsigned int) GLuint buf, (unsigned int) GLenum srcRGB, (unsigned int) GLenum dstRGB, (unsigned int) GLenum srcAlpha, (unsigned int) GLenum dstAlpha);
    /// ```
    public void BlendFuncSeparateiARB(int buf, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparateiARB)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncSeparateiARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendFuncSeparateiARB", buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        Handles.MH_glBlendFuncSeparateiARB.invokeExact(handles.PFN_glBlendFuncSeparateiARB, buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparateiARB", e); }
    }

}
