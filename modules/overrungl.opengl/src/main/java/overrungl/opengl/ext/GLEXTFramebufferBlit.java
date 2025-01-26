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

public final class GLEXTFramebufferBlit {
    public static final int GL_READ_FRAMEBUFFER_EXT = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
    public static final int GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlitFramebufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBlitFramebufferEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlitFramebufferEXT = func.invoke("glBlitFramebufferEXT", "glBlitFramebuffer");
        }
    }

    public GLEXTFramebufferBlit(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBlitFramebufferEXT((int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitFramebufferEXT(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitFramebufferEXT)) throw new SymbolNotFoundError("Symbol not found: glBlitFramebufferEXT");
        try { Handles.MH_glBlitFramebufferEXT.invokeExact(handles.PFN_glBlitFramebufferEXT, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitFramebufferEXT", e); }
    }

}
