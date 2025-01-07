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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVPrimitiveRestart {
    public static final int GL_PRIMITIVE_RESTART_NV = 0x8558;
    public static final int GL_PRIMITIVE_RESTART_INDEX_NV = 0x8559;
    public static final MethodHandle MH_glPrimitiveRestartNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glPrimitiveRestartNV;
    public static final MethodHandle MH_glPrimitiveRestartIndexNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPrimitiveRestartIndexNV;

    public GLNVPrimitiveRestart(overrungl.opengl.GLLoadFunc func) {
        PFN_glPrimitiveRestartNV = func.invoke("glPrimitiveRestartNV");
        PFN_glPrimitiveRestartIndexNV = func.invoke("glPrimitiveRestartIndexNV");
    }

    public void PrimitiveRestartNV() {
        if (!Unmarshal.isNullPointer(PFN_glPrimitiveRestartNV)) { try {
            MH_glPrimitiveRestartNV.invokeExact(PFN_glPrimitiveRestartNV);
        } catch (Throwable e) { throw new RuntimeException("error in glPrimitiveRestartNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPrimitiveRestartNV"); }
    }

    public void PrimitiveRestartIndexNV(@CType("GLuint") int index) {
        if (!Unmarshal.isNullPointer(PFN_glPrimitiveRestartIndexNV)) { try {
            MH_glPrimitiveRestartIndexNV.invokeExact(PFN_glPrimitiveRestartIndexNV, index);
        } catch (Throwable e) { throw new RuntimeException("error in glPrimitiveRestartIndexNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPrimitiveRestartIndexNV"); }
    }

}
