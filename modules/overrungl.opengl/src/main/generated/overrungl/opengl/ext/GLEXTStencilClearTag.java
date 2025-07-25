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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTStencilClearTag {
    public static final int GL_STENCIL_TAG_BITS_EXT = 0x88F2;
    public static final int GL_STENCIL_CLEAR_TAG_VALUE_EXT = 0x88F3;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glStencilClearTagEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glStencilClearTagEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glStencilClearTagEXT = func.invoke("glStencilClearTagEXT");
        }
    }

    public GLEXTStencilClearTag(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glStencilClearTagEXT((int) GLsizei stencilTagBits, (unsigned int) GLuint stencilClearTag);
    /// ```
    public void StencilClearTagEXT(int stencilTagBits, int stencilClearTag) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilClearTagEXT)) throw new GLSymbolNotFoundError("Symbol not found: glStencilClearTagEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilClearTagEXT", stencilTagBits, stencilClearTag); }
        Handles.MH_glStencilClearTagEXT.invokeExact(handles.PFN_glStencilClearTagEXT, stencilTagBits, stencilClearTag); }
        catch (Throwable e) { throw new RuntimeException("error in StencilClearTagEXT", e); }
    }

}
