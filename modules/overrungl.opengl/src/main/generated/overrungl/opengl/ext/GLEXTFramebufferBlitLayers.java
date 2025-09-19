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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_framebuffer_blit_layers`
public final class GLEXTFramebufferBlitLayers {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlitFramebufferLayersEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlitFramebufferLayerEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlitFramebufferLayersEXT;
        public final MemorySegment PFN_glBlitFramebufferLayerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glBlitFramebufferLayersEXT = func.invoke("glBlitFramebufferLayersEXT");
            PFN_glBlitFramebufferLayerEXT = func.invoke("glBlitFramebufferLayerEXT");
        }
    }

    public GLEXTFramebufferBlitLayers(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBlitFramebufferLayersEXT`.
    /// ```
    /// void glBlitFramebufferLayersEXT((int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitFramebufferLayersEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitFramebufferLayersEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlitFramebufferLayersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlitFramebufferLayersEXT", srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        Handles.MH_glBlitFramebufferLayersEXT.invokeExact(handles.PFN_glBlitFramebufferLayersEXT, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitFramebufferLayersEXT", e); }
    }

    /// Invokes `glBlitFramebufferLayerEXT`.
    /// ```
    /// void glBlitFramebufferLayerEXT((int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint srcLayer, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (int) GLint dstLayer, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitFramebufferLayerEXT(int srcX0, int srcY0, int srcX1, int srcY1, int srcLayer, int dstX0, int dstY0, int dstX1, int dstY1, int dstLayer, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitFramebufferLayerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBlitFramebufferLayerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlitFramebufferLayerEXT", srcX0, srcY0, srcX1, srcY1, srcLayer, dstX0, dstY0, dstX1, dstY1, dstLayer, mask, filter); }
        Handles.MH_glBlitFramebufferLayerEXT.invokeExact(handles.PFN_glBlitFramebufferLayerEXT, srcX0, srcY0, srcX1, srcY1, srcLayer, dstX0, dstY0, dstX1, dstY1, dstLayer, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitFramebufferLayerEXT", e); }
    }

}
