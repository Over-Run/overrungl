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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTFramebufferBlitLayers {
    public static final MethodHandle MH_glBlitFramebufferLayersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlitFramebufferLayersEXT;
    public static final MethodHandle MH_glBlitFramebufferLayerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlitFramebufferLayerEXT;

    public GLEXTFramebufferBlitLayers(overrungl.opengl.GLLoadFunc func) {
        PFN_glBlitFramebufferLayersEXT = func.invoke("glBlitFramebufferLayersEXT");
        PFN_glBlitFramebufferLayerEXT = func.invoke("glBlitFramebufferLayerEXT");
    }

    public void BlitFramebufferLayersEXT(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (!Unmarshal.isNullPointer(PFN_glBlitFramebufferLayersEXT)) { try {
            MH_glBlitFramebufferLayersEXT.invokeExact(PFN_glBlitFramebufferLayersEXT, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) { throw new RuntimeException("error in glBlitFramebufferLayersEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlitFramebufferLayersEXT"); }
    }

    public void BlitFramebufferLayerEXT(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int srcLayer, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLint") int dstLayer, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (!Unmarshal.isNullPointer(PFN_glBlitFramebufferLayerEXT)) { try {
            MH_glBlitFramebufferLayerEXT.invokeExact(PFN_glBlitFramebufferLayerEXT, srcX0, srcY0, srcX1, srcY1, srcLayer, dstX0, dstY0, dstX1, dstY1, dstLayer, mask, filter);
        } catch (Throwable e) { throw new RuntimeException("error in glBlitFramebufferLayerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlitFramebufferLayerEXT"); }
    }

}
