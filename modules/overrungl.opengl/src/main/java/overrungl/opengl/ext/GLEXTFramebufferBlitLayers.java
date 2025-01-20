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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBlitFramebufferLayersEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBlitFramebufferLayerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glBlitFramebufferLayersEXT = RuntimeHelper.downcall(Descriptors.FD_glBlitFramebufferLayersEXT);
        public static final MethodHandle MH_glBlitFramebufferLayerEXT = RuntimeHelper.downcall(Descriptors.FD_glBlitFramebufferLayerEXT);
        public final MemorySegment PFN_glBlitFramebufferLayersEXT;
        public final MemorySegment PFN_glBlitFramebufferLayerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlitFramebufferLayersEXT = func.invoke("glBlitFramebufferLayersEXT");
            PFN_glBlitFramebufferLayerEXT = func.invoke("glBlitFramebufferLayerEXT");
        }
    }

    public GLEXTFramebufferBlitLayers(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BlitFramebufferLayersEXT(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlitFramebufferLayersEXT)) throw new SymbolNotFoundError("Symbol not found: glBlitFramebufferLayersEXT");
        try { Handles.MH_glBlitFramebufferLayersEXT.invokeExact(handles.PFN_glBlitFramebufferLayersEXT, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in glBlitFramebufferLayersEXT", e); }
    }

    public void BlitFramebufferLayerEXT(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int srcLayer, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLint") int dstLayer, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlitFramebufferLayerEXT)) throw new SymbolNotFoundError("Symbol not found: glBlitFramebufferLayerEXT");
        try { Handles.MH_glBlitFramebufferLayerEXT.invokeExact(handles.PFN_glBlitFramebufferLayerEXT, srcX0, srcY0, srcX1, srcY1, srcLayer, dstX0, dstY0, dstX1, dstY1, dstLayer, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in glBlitFramebufferLayerEXT", e); }
    }

}
