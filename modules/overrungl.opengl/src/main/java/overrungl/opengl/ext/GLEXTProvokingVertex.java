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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTProvokingVertex {
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION_EXT = 0x8E4C;
    public static final int GL_FIRST_VERTEX_CONVENTION_EXT = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION_EXT = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX_EXT = 0x8E4F;
    public static final MethodHandle MH_glProvokingVertexEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProvokingVertexEXT;

    public GLEXTProvokingVertex(overrungl.opengl.GLLoadFunc func) {
        PFN_glProvokingVertexEXT = func.invoke("glProvokingVertexEXT", "glProvokingVertex");
    }

    public void ProvokingVertexEXT(@CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glProvokingVertexEXT))
            MH_glProvokingVertexEXT.invokeExact(PFN_glProvokingVertexEXT, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProvokingVertexEXT", e); }
    }

}
