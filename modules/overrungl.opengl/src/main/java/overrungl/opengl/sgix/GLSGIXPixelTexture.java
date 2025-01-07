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

public final class GLSGIXPixelTexture {
    public static final int GL_PIXEL_TEX_GEN_SGIX = 0x8139;
    public static final int GL_PIXEL_TEX_GEN_MODE_SGIX = 0x832B;
    public static final MethodHandle MH_glPixelTexGenSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPixelTexGenSGIX;

    public GLSGIXPixelTexture(overrungl.opengl.GLLoadFunc func) {
        PFN_glPixelTexGenSGIX = func.invoke("glPixelTexGenSGIX");
    }

    public void PixelTexGenSGIX(@CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glPixelTexGenSGIX))
            MH_glPixelTexGenSGIX.invokeExact(PFN_glPixelTexGenSGIX, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTexGenSGIX", e); }
    }

}