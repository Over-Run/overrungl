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
/// `GL_ARB_ES3_2_compatibility`
public final class GLARBES32Compatibility {
    public static final int GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB = 0x9381;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPrimitiveBoundingBoxARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glPrimitiveBoundingBoxARB;
        private Handles(GLLoadFunc func) {
            PFN_glPrimitiveBoundingBoxARB = func.invoke("glPrimitiveBoundingBoxARB", "glPrimitiveBoundingBox");
        }
    }

    public GLARBES32Compatibility(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPrimitiveBoundingBoxARB`.
    /// ```
    /// void glPrimitiveBoundingBoxARB(((float) khronos_float_t) GLfloat minX, ((float) khronos_float_t) GLfloat minY, ((float) khronos_float_t) GLfloat minZ, ((float) khronos_float_t) GLfloat minW, ((float) khronos_float_t) GLfloat maxX, ((float) khronos_float_t) GLfloat maxY, ((float) khronos_float_t) GLfloat maxZ, ((float) khronos_float_t) GLfloat maxW);
    /// ```
    public void PrimitiveBoundingBoxARB(float minX, float minY, float minZ, float minW, float maxX, float maxY, float maxZ, float maxW) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPrimitiveBoundingBoxARB)) throw new GLSymbolNotFoundError("Symbol not found: glPrimitiveBoundingBoxARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPrimitiveBoundingBoxARB", minX, minY, minZ, minW, maxX, maxY, maxZ, maxW); }
        Handles.MH_glPrimitiveBoundingBoxARB.invokeExact(handles.PFN_glPrimitiveBoundingBoxARB, minX, minY, minZ, minW, maxX, maxY, maxZ, maxW); }
        catch (Throwable e) { throw new RuntimeException("error in PrimitiveBoundingBoxARB", e); }
    }

}
