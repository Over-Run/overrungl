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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTFramebufferBlit {
    public static final int GL_READ_FRAMEBUFFER_EXT = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER_EXT = 0x8CA9;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
    public static final int GL_READ_FRAMEBUFFER_BINDING_EXT = 0x8CAA;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBlitFramebufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBlitFramebufferEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBlitFramebufferEXT = RuntimeHelper.downcall(Descriptors.FD_glBlitFramebufferEXT);
        public final MemorySegment PFN_glBlitFramebufferEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlitFramebufferEXT = func.invoke("glBlitFramebufferEXT", "glBlitFramebuffer");
        }
    }

    public GLEXTFramebufferBlit(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BlitFramebufferEXT(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlitFramebufferEXT)) throw new SymbolNotFoundError("Symbol not found: glBlitFramebufferEXT");
        try { Handles.MH_glBlitFramebufferEXT.invokeExact(handles.PFN_glBlitFramebufferEXT, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in glBlitFramebufferEXT", e); }
    }

}
