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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_provoking_vertex`
public final class GLARBProvokingVertex {
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glProvokingVertex = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glProvokingVertex;
        private Handles(GLLoadFunc func) {
            PFN_glProvokingVertex = func.invoke("glProvokingVertex");
        }
    }

    public GLARBProvokingVertex(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glProvokingVertex`.
    /// ```
    /// void glProvokingVertex((unsigned int) GLenum mode);
    /// ```
    public void ProvokingVertex(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProvokingVertex)) throw new GLSymbolNotFoundError("Symbol not found: glProvokingVertex");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glProvokingVertex", mode); }
        Handles.MH_glProvokingVertex.invokeExact(handles.PFN_glProvokingVertex, mode); }
        catch (Throwable e) { throw new RuntimeException("error in ProvokingVertex", e); }
    }

}
