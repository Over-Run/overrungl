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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBDrawBuffersBlend {
    public static final MethodHandle MH_glBlendEquationiARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBlendEquationSeparateiARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBlendFunciARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBlendFuncSeparateiARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendEquationiARB;
    public final MemorySegment PFN_glBlendEquationSeparateiARB;
    public final MemorySegment PFN_glBlendFunciARB;
    public final MemorySegment PFN_glBlendFuncSeparateiARB;

    public GLARBDrawBuffersBlend(overrungl.opengl.GLLoadFunc func) {
        PFN_glBlendEquationiARB = func.invoke("glBlendEquationiARB", "glBlendEquationi");
        PFN_glBlendEquationSeparateiARB = func.invoke("glBlendEquationSeparateiARB", "glBlendEquationSeparatei");
        PFN_glBlendFunciARB = func.invoke("glBlendFunciARB", "glBlendFunci");
        PFN_glBlendFuncSeparateiARB = func.invoke("glBlendFuncSeparateiARB", "glBlendFuncSeparatei");
    }

    public void BlendEquationiARB(@CType("GLuint") int buf, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glBlendEquationiARB)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationiARB");
        try { MH_glBlendEquationiARB.invokeExact(PFN_glBlendEquationiARB, buf, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationiARB", e); }
    }

    public void BlendEquationSeparateiARB(@CType("GLuint") int buf, @CType("GLenum") int modeRGB, @CType("GLenum") int modeAlpha) {
        if (Unmarshal.isNullPointer(PFN_glBlendEquationSeparateiARB)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationSeparateiARB");
        try { MH_glBlendEquationSeparateiARB.invokeExact(PFN_glBlendEquationSeparateiARB, buf, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationSeparateiARB", e); }
    }

    public void BlendFunciARB(@CType("GLuint") int buf, @CType("GLenum") int src, @CType("GLenum") int dst) {
        if (Unmarshal.isNullPointer(PFN_glBlendFunciARB)) throw new SymbolNotFoundError("Symbol not found: glBlendFunciARB");
        try { MH_glBlendFunciARB.invokeExact(PFN_glBlendFunciARB, buf, src, dst); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFunciARB", e); }
    }

    public void BlendFuncSeparateiARB(@CType("GLuint") int buf, @CType("GLenum") int srcRGB, @CType("GLenum") int dstRGB, @CType("GLenum") int srcAlpha, @CType("GLenum") int dstAlpha) {
        if (Unmarshal.isNullPointer(PFN_glBlendFuncSeparateiARB)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparateiARB");
        try { MH_glBlendFuncSeparateiARB.invokeExact(PFN_glBlendFuncSeparateiARB, buf, srcRGB, dstRGB, srcAlpha, dstAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFuncSeparateiARB", e); }
    }

}
