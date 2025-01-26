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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTBlendColor {
    public static final int GL_CONSTANT_COLOR_EXT = 0x8001;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002;
    public static final int GL_CONSTANT_ALPHA_EXT = 0x8003;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;
    public static final int GL_BLEND_COLOR_EXT = 0x8005;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendColorEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glBlendColorEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlendColorEXT = func.invoke("glBlendColorEXT", "glBlendColor");
        }
    }

    public GLEXTBlendColor(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBlendColorEXT(((float) khronos_float_t) GLfloat red, ((float) khronos_float_t) GLfloat green, ((float) khronos_float_t) GLfloat blue, ((float) khronos_float_t) GLfloat alpha);
    /// ```
    public void BlendColorEXT(float red, float green, float blue, float alpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendColorEXT)) throw new SymbolNotFoundError("Symbol not found: glBlendColorEXT");
        try { Handles.MH_glBlendColorEXT.invokeExact(handles.PFN_glBlendColorEXT, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendColorEXT", e); }
    }

}
