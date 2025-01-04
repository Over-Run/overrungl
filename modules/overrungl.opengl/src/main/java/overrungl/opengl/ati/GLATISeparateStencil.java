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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATISeparateStencil {
    public static final int GL_STENCIL_BACK_FUNC_ATI = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL_ATI = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL_ATI = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS_ATI = 0x8803;
    public static final MethodHandle MH_glStencilOpSeparateATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glStencilOpSeparateATI;
    public static final MethodHandle MH_glStencilFuncSeparateATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glStencilFuncSeparateATI;

    public GLATISeparateStencil(overrungl.opengl.GLLoadFunc func) {
        PFN_glStencilOpSeparateATI = func.invoke("glStencilOpSeparateATI", "glStencilOpSeparate");
        PFN_glStencilFuncSeparateATI = func.invoke("glStencilFuncSeparateATI");
    }

    public void StencilOpSeparateATI(@CType("GLenum") int face, @CType("GLenum") int sfail, @CType("GLenum") int dpfail, @CType("GLenum") int dppass) {
        try { if (!Unmarshal.isNullPointer(PFN_glStencilOpSeparateATI))
            MH_glStencilOpSeparateATI.invokeExact(PFN_glStencilOpSeparateATI, face, sfail, dpfail, dppass);
        }
        catch (Throwable e) { throw new RuntimeException("error in glStencilOpSeparateATI", e); }
    }

    public void StencilFuncSeparateATI(@CType("GLenum") int frontfunc, @CType("GLenum") int backfunc, @CType("GLint") int ref, @CType("GLuint") int mask) {
        try { if (!Unmarshal.isNullPointer(PFN_glStencilFuncSeparateATI))
            MH_glStencilFuncSeparateATI.invokeExact(PFN_glStencilFuncSeparateATI, frontfunc, backfunc, ref, mask);
        }
        catch (Throwable e) { throw new RuntimeException("error in glStencilFuncSeparateATI", e); }
    }

}
