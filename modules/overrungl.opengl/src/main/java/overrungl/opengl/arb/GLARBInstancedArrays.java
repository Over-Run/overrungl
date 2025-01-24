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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBInstancedArrays {
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR_ARB = 0x88FE;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribDivisorARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glVertexAttribDivisorARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexAttribDivisorARB = func.invoke("glVertexAttribDivisorARB", "glVertexAttribDivisor");
        }
    }

    public GLARBInstancedArrays(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glVertexAttribDivisorARB(unsigned int index, unsigned int divisor);
    /// ```
    public void VertexAttribDivisorARB(int index, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribDivisorARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribDivisorARB");
        try { Handles.MH_glVertexAttribDivisorARB.invokeExact(handles.PFN_glVertexAttribDivisorARB, index, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribDivisorARB", e); }
    }

}
