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
package overrungl.opengl.sgix;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIXFramezoom {
    public static final int GL_FRAMEZOOM_SGIX = 0x818B;
    public static final int GL_FRAMEZOOM_FACTOR_SGIX = 0x818C;
    public static final int GL_MAX_FRAMEZOOM_FACTOR_SGIX = 0x818D;
    public static final MethodHandle MH_glFrameZoomSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFrameZoomSGIX;

    public GLSGIXFramezoom(overrungl.opengl.GLLoadFunc func) {
        PFN_glFrameZoomSGIX = func.invoke("glFrameZoomSGIX");
    }

    public void FrameZoomSGIX(@CType("GLint") int factor) {
        try { if (!Unmarshal.isNullPointer(PFN_glFrameZoomSGIX))
            MH_glFrameZoomSGIX.invokeExact(PFN_glFrameZoomSGIX, factor);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFrameZoomSGIX", e); }
    }

}