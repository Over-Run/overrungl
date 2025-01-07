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

public final class GLNVVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 0x851E;
    public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 0x851F;
    public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;
    public static final MethodHandle MH_glFlushVertexArrayRangeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glFlushVertexArrayRangeNV;
    public static final MethodHandle MH_glVertexArrayRangeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexArrayRangeNV;

    public GLNVVertexArrayRange(overrungl.opengl.GLLoadFunc func) {
        PFN_glFlushVertexArrayRangeNV = func.invoke("glFlushVertexArrayRangeNV");
        PFN_glVertexArrayRangeNV = func.invoke("glVertexArrayRangeNV");
    }

    public void FlushVertexArrayRangeNV() {
        if (!Unmarshal.isNullPointer(PFN_glFlushVertexArrayRangeNV)) { try {
            MH_glFlushVertexArrayRangeNV.invokeExact(PFN_glFlushVertexArrayRangeNV);
        } catch (Throwable e) { throw new RuntimeException("error in glFlushVertexArrayRangeNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFlushVertexArrayRangeNV"); }
    }

    public void VertexArrayRangeNV(@CType("GLsizei") int length, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayRangeNV)) { try {
            MH_glVertexArrayRangeNV.invokeExact(PFN_glVertexArrayRangeNV, length, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayRangeNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayRangeNV"); }
    }

}
