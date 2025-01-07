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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVClipSpaceWScaling {
    public static final int GL_VIEWPORT_POSITION_W_SCALE_NV = 0x937C;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_X_COEFF_NV = 0x937D;
    public static final int GL_VIEWPORT_POSITION_W_SCALE_Y_COEFF_NV = 0x937E;
    public static final MethodHandle MH_glViewportPositionWScaleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glViewportPositionWScaleNV;

    public GLNVClipSpaceWScaling(overrungl.opengl.GLLoadFunc func) {
        PFN_glViewportPositionWScaleNV = func.invoke("glViewportPositionWScaleNV");
    }

    public void ViewportPositionWScaleNV(@CType("GLuint") int index, @CType("GLfloat") float xcoeff, @CType("GLfloat") float ycoeff) {
        try { if (!Unmarshal.isNullPointer(PFN_glViewportPositionWScaleNV))
            MH_glViewportPositionWScaleNV.invokeExact(PFN_glViewportPositionWScaleNV, index, xcoeff, ycoeff);
        }
        catch (Throwable e) { throw new RuntimeException("error in glViewportPositionWScaleNV", e); }
    }

}