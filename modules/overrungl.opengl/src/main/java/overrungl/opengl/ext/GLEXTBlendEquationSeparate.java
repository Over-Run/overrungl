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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTBlendEquationSeparate {
    public static final int GL_BLEND_EQUATION_RGB_EXT = 0x8009;
    public static final int GL_BLEND_EQUATION_ALPHA_EXT = 0x883D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendEquationSeparateEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlendEquationSeparateEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlendEquationSeparateEXT = func.invoke("glBlendEquationSeparateEXT", "glBlendEquationSeparate");
        }
    }

    public GLEXTBlendEquationSeparate(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BlendEquationSeparateEXT(@CType("GLenum") int modeRGB, @CType("GLenum") int modeAlpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendEquationSeparateEXT)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationSeparateEXT");
        try { Handles.MH_glBlendEquationSeparateEXT.invokeExact(handles.PFN_glBlendEquationSeparateEXT, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationSeparateEXT", e); }
    }

}
