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
import overrungl.opengl.*;

public final class GLEXTPolygonOffsetClamp {
    public static final int GL_POLYGON_OFFSET_CLAMP_EXT = 0x8E1B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPolygonOffsetClampEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glPolygonOffsetClampEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPolygonOffsetClampEXT = func.invoke("glPolygonOffsetClampEXT", "glPolygonOffsetClamp");
        }
    }

    public GLEXTPolygonOffsetClamp(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glPolygonOffsetClampEXT(((float) khronos_float_t) GLfloat factor, ((float) khronos_float_t) GLfloat units, ((float) khronos_float_t) GLfloat clamp);
    /// ```
    public void PolygonOffsetClampEXT(float factor, float units, float clamp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPolygonOffsetClampEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPolygonOffsetClampEXT");
        try { Handles.MH_glPolygonOffsetClampEXT.invokeExact(handles.PFN_glPolygonOffsetClampEXT, factor, units, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in PolygonOffsetClampEXT", e); }
    }

}
