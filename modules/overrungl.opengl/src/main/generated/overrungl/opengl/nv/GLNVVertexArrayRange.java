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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_NV_vertex_array_range`
public final class GLNVVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_NV = 0x851D;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_NV = 0x851E;
    public static final int GL_VERTEX_ARRAY_RANGE_VALID_NV = 0x851F;
    public static final int GL_MAX_VERTEX_ARRAY_RANGE_ELEMENT_NV = 0x8520;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_NV = 0x8521;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFlushVertexArrayRangeNV = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glVertexArrayRangeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFlushVertexArrayRangeNV;
        public final MemorySegment PFN_glVertexArrayRangeNV;
        private Handles(GLLoadFunc func) {
            PFN_glFlushVertexArrayRangeNV = func.invoke("glFlushVertexArrayRangeNV");
            PFN_glVertexArrayRangeNV = func.invoke("glVertexArrayRangeNV");
        }
    }

    public GLNVVertexArrayRange(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFlushVertexArrayRangeNV`.
    /// ```
    /// void glFlushVertexArrayRangeNV();
    /// ```
    public void FlushVertexArrayRangeNV() {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushVertexArrayRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glFlushVertexArrayRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushVertexArrayRangeNV"); }
        Handles.MH_glFlushVertexArrayRangeNV.invokeExact(handles.PFN_glFlushVertexArrayRangeNV); }
        catch (Throwable e) { throw new RuntimeException("error in FlushVertexArrayRangeNV", e); }
    }

    /// Invokes `glVertexArrayRangeNV`.
    /// ```
    /// void glVertexArrayRangeNV((int) GLsizei length, const void* pointer);
    /// ```
    public void VertexArrayRangeNV(int length, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayRangeNV)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayRangeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayRangeNV", length, pointer); }
        Handles.MH_glVertexArrayRangeNV.invokeExact(handles.PFN_glVertexArrayRangeNV, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayRangeNV", e); }
    }

}
