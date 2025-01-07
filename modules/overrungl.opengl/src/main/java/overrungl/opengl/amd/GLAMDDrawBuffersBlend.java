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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDDrawBuffersBlend {
    public static final MethodHandle MH_glBlendFuncIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendFuncIndexedAMD;
    public static final MethodHandle MH_glBlendFuncSeparateIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendFuncSeparateIndexedAMD;
    public static final MethodHandle MH_glBlendEquationIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendEquationIndexedAMD;
    public static final MethodHandle MH_glBlendEquationSeparateIndexedAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlendEquationSeparateIndexedAMD;

    public GLAMDDrawBuffersBlend(overrungl.opengl.GLLoadFunc func) {
        PFN_glBlendFuncIndexedAMD = func.invoke("glBlendFuncIndexedAMD", "glBlendFunci");
        PFN_glBlendFuncSeparateIndexedAMD = func.invoke("glBlendFuncSeparateIndexedAMD", "glBlendFuncSeparatei");
        PFN_glBlendEquationIndexedAMD = func.invoke("glBlendEquationIndexedAMD", "glBlendEquationi");
        PFN_glBlendEquationSeparateIndexedAMD = func.invoke("glBlendEquationSeparateIndexedAMD", "glBlendEquationSeparatei");
    }

    public void BlendFuncIndexedAMD(@CType("GLuint") int buf, @CType("GLenum") int src, @CType("GLenum") int dst) {
        if (!Unmarshal.isNullPointer(PFN_glBlendFuncIndexedAMD)) { try {
            MH_glBlendFuncIndexedAMD.invokeExact(PFN_glBlendFuncIndexedAMD, buf, src, dst);
        } catch (Throwable e) { throw new RuntimeException("error in glBlendFuncIndexedAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlendFuncIndexedAMD"); }
    }

    public void BlendFuncSeparateIndexedAMD(@CType("GLuint") int buf, @CType("GLenum") int srcRGB, @CType("GLenum") int dstRGB, @CType("GLenum") int srcAlpha, @CType("GLenum") int dstAlpha) {
        if (!Unmarshal.isNullPointer(PFN_glBlendFuncSeparateIndexedAMD)) { try {
            MH_glBlendFuncSeparateIndexedAMD.invokeExact(PFN_glBlendFuncSeparateIndexedAMD, buf, srcRGB, dstRGB, srcAlpha, dstAlpha);
        } catch (Throwable e) { throw new RuntimeException("error in glBlendFuncSeparateIndexedAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparateIndexedAMD"); }
    }

    public void BlendEquationIndexedAMD(@CType("GLuint") int buf, @CType("GLenum") int mode) {
        if (!Unmarshal.isNullPointer(PFN_glBlendEquationIndexedAMD)) { try {
            MH_glBlendEquationIndexedAMD.invokeExact(PFN_glBlendEquationIndexedAMD, buf, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glBlendEquationIndexedAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlendEquationIndexedAMD"); }
    }

    public void BlendEquationSeparateIndexedAMD(@CType("GLuint") int buf, @CType("GLenum") int modeRGB, @CType("GLenum") int modeAlpha) {
        if (!Unmarshal.isNullPointer(PFN_glBlendEquationSeparateIndexedAMD)) { try {
            MH_glBlendEquationSeparateIndexedAMD.invokeExact(PFN_glBlendEquationSeparateIndexedAMD, buf, modeRGB, modeAlpha);
        } catch (Throwable e) { throw new RuntimeException("error in glBlendEquationSeparateIndexedAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlendEquationSeparateIndexedAMD"); }
    }

}
