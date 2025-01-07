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

public final class GLSGIXReferencePlane {
    public static final int GL_REFERENCE_PLANE_SGIX = 0x817D;
    public static final int GL_REFERENCE_PLANE_EQUATION_SGIX = 0x817E;
    public static final MethodHandle MH_glReferencePlaneSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReferencePlaneSGIX;

    public GLSGIXReferencePlane(overrungl.opengl.GLLoadFunc func) {
        PFN_glReferencePlaneSGIX = func.invoke("glReferencePlaneSGIX");
    }

    public void ReferencePlaneSGIX(@CType("const GLdouble *") java.lang.foreign.MemorySegment equation) {
        if (!Unmarshal.isNullPointer(PFN_glReferencePlaneSGIX)) { try {
            MH_glReferencePlaneSGIX.invokeExact(PFN_glReferencePlaneSGIX, equation);
        } catch (Throwable e) { throw new RuntimeException("error in glReferencePlaneSGIX", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReferencePlaneSGIX"); }
    }

}
