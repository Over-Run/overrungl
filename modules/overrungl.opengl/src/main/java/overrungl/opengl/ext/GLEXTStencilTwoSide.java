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

public final class GLEXTStencilTwoSide {
    public static final int GL_STENCIL_TEST_TWO_SIDE_EXT = 0x8910;
    public static final int GL_ACTIVE_STENCIL_FACE_EXT = 0x8911;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glActiveStencilFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glActiveStencilFaceEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glActiveStencilFaceEXT = func.invoke("glActiveStencilFaceEXT");
        }
    }

    public GLEXTStencilTwoSide(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glActiveStencilFaceEXT(GLenum face);
    /// ```
    public void ActiveStencilFaceEXT(int face) {
        if (MemoryUtil.isNullPointer(handles.PFN_glActiveStencilFaceEXT)) throw new SymbolNotFoundError("Symbol not found: glActiveStencilFaceEXT");
        try { Handles.MH_glActiveStencilFaceEXT.invokeExact(handles.PFN_glActiveStencilFaceEXT, face); }
        catch (Throwable e) { throw new RuntimeException("error in ActiveStencilFaceEXT", e); }
    }

}
