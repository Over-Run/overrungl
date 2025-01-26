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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBGlSpirv {
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;
    public static final int GL_SPIR_V_BINARY_ARB = 0x9552;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glSpecializeShaderARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glSpecializeShaderARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSpecializeShaderARB = func.invoke("glSpecializeShaderARB", "glSpecializeShader");
        }
    }

    public GLARBGlSpirv(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glSpecializeShaderARB(GLuint shader, const GLchar* pEntryPoint, GLuint numSpecializationConstants, const GLuint* pConstantIndex, const GLuint* pConstantValue);
    /// ```
    public void SpecializeShaderARB(int shader, MemorySegment pEntryPoint, int numSpecializationConstants, MemorySegment pConstantIndex, MemorySegment pConstantValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSpecializeShaderARB)) throw new SymbolNotFoundError("Symbol not found: glSpecializeShaderARB");
        try { Handles.MH_glSpecializeShaderARB.invokeExact(handles.PFN_glSpecializeShaderARB, shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue); }
        catch (Throwable e) { throw new RuntimeException("error in SpecializeShaderARB", e); }
    }

}
