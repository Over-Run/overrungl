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
/// `GL_ARB_sample_shading`
public final class GLARBSampleShading {
    public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMinSampleShadingARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glMinSampleShadingARB;
        private Handles(GLLoadFunc func) {
            PFN_glMinSampleShadingARB = func.invoke("glMinSampleShadingARB", "glMinSampleShading");
        }
    }

    public GLARBSampleShading(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glMinSampleShadingARB`.
    /// ```
    /// void glMinSampleShadingARB(((float) khronos_float_t) GLfloat value);
    /// ```
    public void MinSampleShadingARB(float value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMinSampleShadingARB)) throw new GLSymbolNotFoundError("Symbol not found: glMinSampleShadingARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMinSampleShadingARB", value); }
        Handles.MH_glMinSampleShadingARB.invokeExact(handles.PFN_glMinSampleShadingARB, value); }
        catch (Throwable e) { throw new RuntimeException("error in MinSampleShadingARB", e); }
    }

}
