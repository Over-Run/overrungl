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
import overrungl.opengl.*;

public final class GLARBPolygonOffsetClamp {
    public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPolygonOffsetClamp = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glPolygonOffsetClamp;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPolygonOffsetClamp = func.invoke("glPolygonOffsetClamp");
        }
    }

    public GLARBPolygonOffsetClamp(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glPolygonOffsetClamp(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat units, ((float) khronos_float_t) GLfloat clamp);
    /// ```
    public void PolygonOffsetClamp(float factor, float units, float clamp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetClamp)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetClamp");
        try { Handles.MH_glPolygonOffsetClamp.invokeExact(handles.PFN_glPolygonOffsetClamp, factor, units, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetClamp", e); }
    }

}
