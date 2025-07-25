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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLNVClipSpaceWScaling {
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV = 0x937D;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV = 0x937E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glViewportPositionWScaleNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glViewportPositionWScaleNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glViewportPositionWScaleNV = func.invoke("glViewportPositionWScaleNV");
        }
    }

    public GLNVClipSpaceWScaling(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glViewportPositionWScaleNV((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat xcoeff, ((float) khronos_float_t) GLfloat ycoeff);
    /// ```
    public void ViewportPositionWScaleNV(int index, float xcoeff, float ycoeff) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportPositionWScaleNV)) throw new GLSymbolNotFoundError("Symbol not found: glViewportPositionWScaleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glViewportPositionWScaleNV", index, xcoeff, ycoeff); }
        Handles.MH_glViewportPositionWScaleNV.invokeExact(handles.PFN_glViewportPositionWScaleNV, index, xcoeff, ycoeff); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportPositionWScaleNV", e); }
    }

}
