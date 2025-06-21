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
package overrungl.opengl.ingr;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLINGRBlendFuncSeparate {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendFuncSeparateINGR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendFuncSeparateINGR;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlendFuncSeparateINGR = func.invoke("glBlendFuncSeparateINGR", "glBlendFuncSeparate");
        }
    }

    public GLINGRBlendFuncSeparate(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBlendFuncSeparateINGR((unsigned int) GLenum sfactorRGB, (unsigned int) GLenum dfactorRGB, (unsigned int) GLenum sfactorAlpha, (unsigned int) GLenum dfactorAlpha);
    /// ```
    public void BlendFuncSeparateINGR(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendFuncSeparateINGR)) throw new GLSymbolNotFoundError("Symbol not found: glBlendFuncSeparateINGR");
        try { Handles.MH_glBlendFuncSeparateINGR.invokeExact(handles.PFN_glBlendFuncSeparateINGR, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendFuncSeparateINGR", e); }
    }

}
