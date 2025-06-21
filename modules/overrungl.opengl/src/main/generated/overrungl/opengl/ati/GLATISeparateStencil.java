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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLATISeparateStencil {
    public static final int GL_STENCIL_BACK_FUNC_ATI = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL_ATI = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 0x8803;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glStencilOpSeparateATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilFuncSeparateATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glStencilOpSeparateATI;
        public final MemorySegment PFN_glStencilFuncSeparateATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glStencilOpSeparateATI = func.invoke("glStencilOpSeparateATI", "glStencilOpSeparate");
            PFN_glStencilFuncSeparateATI = func.invoke("glStencilFuncSeparateATI");
        }
    }

    public GLATISeparateStencil(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glStencilOpSeparateATI((unsigned int) GLenum face, (unsigned int) GLenum sfail, (unsigned int) GLenum dpfail, (unsigned int) GLenum dppass);
    /// ```
    public void StencilOpSeparateATI(int face, int sfail, int dpfail, int dppass) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilOpSeparateATI)) throw new GLSymbolNotFoundError("Symbol not found: glStencilOpSeparateATI");
        try { Handles.MH_glStencilOpSeparateATI.invokeExact(handles.PFN_glStencilOpSeparateATI, face, sfail, dpfail, dppass); }
        catch (Throwable e) { throw new RuntimeException("error in StencilOpSeparateATI", e); }
    }

    /// ```
    /// void glStencilFuncSeparateATI((unsigned int) GLenum frontfunc, (unsigned int) GLenum backfunc, (int) GLint ref, (unsigned int) GLuint mask);
    /// ```
    public void StencilFuncSeparateATI(int frontfunc, int backfunc, int ref, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilFuncSeparateATI)) throw new GLSymbolNotFoundError("Symbol not found: glStencilFuncSeparateATI");
        try { Handles.MH_glStencilFuncSeparateATI.invokeExact(handles.PFN_glStencilFuncSeparateATI, frontfunc, backfunc, ref, mask); }
        catch (Throwable e) { throw new RuntimeException("error in StencilFuncSeparateATI", e); }
    }

}
