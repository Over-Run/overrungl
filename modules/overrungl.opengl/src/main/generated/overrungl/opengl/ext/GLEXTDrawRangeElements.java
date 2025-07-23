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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTDrawRangeElements {
    public static final int GL_MAX_ELEMENTS_VERTICES_EXT = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES_EXT = 0x80E9;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawRangeElementsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDrawRangeElementsEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawRangeElementsEXT = func.invoke("glDrawRangeElementsEXT", "glDrawRangeElements");
        }
    }

    public GLEXTDrawRangeElements(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawRangeElementsEXT((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, (int) GLsizei count, (unsigned int) GLenum type, const void* indices);
    /// ```
    public void DrawRangeElementsEXT(int mode, int start, int end, int count, int type, MemorySegment indices) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawRangeElementsEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDrawRangeElementsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawRangeElementsEXT", mode, start, end, count, type, indices); }
        Handles.MH_glDrawRangeElementsEXT.invokeExact(handles.PFN_glDrawRangeElementsEXT, mode, start, end, count, type, indices); }
        catch (Throwable e) { throw new RuntimeException("error in DrawRangeElementsEXT", e); }
    }

}
