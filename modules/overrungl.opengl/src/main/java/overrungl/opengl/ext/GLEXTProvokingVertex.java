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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTProvokingVertex {
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION_EXT = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX_EXT = 0x8E4F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glProvokingVertexEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glProvokingVertexEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glProvokingVertexEXT = RuntimeHelper.downcall(Descriptors.FD_glProvokingVertexEXT);
        public final MemorySegment PFN_glProvokingVertexEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glProvokingVertexEXT = func.invoke("glProvokingVertexEXT", "glProvokingVertex");
        }
    }

    public GLEXTProvokingVertex(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ProvokingVertexEXT(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glProvokingVertexEXT)) throw new SymbolNotFoundError("Symbol not found: glProvokingVertexEXT");
        try { Handles.MH_glProvokingVertexEXT.invokeExact(handles.PFN_glProvokingVertexEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glProvokingVertexEXT", e); }
    }

}
