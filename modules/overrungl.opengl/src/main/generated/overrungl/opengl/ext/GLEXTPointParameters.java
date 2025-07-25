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

public final class GLEXTPointParameters {
    public static final int GL_POINT_SIZE_MIN_EXT = 0x8126;
    public static final int GL_POINT_SIZE_MAX_EXT = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_EXT = 0x8129;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPointParameterfEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPointParameterfvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPointParameterfEXT;
        public final MemorySegment PFN_glPointParameterfvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPointParameterfEXT = func.invoke("glPointParameterfEXT", "glPointParameterf");
            PFN_glPointParameterfvEXT = func.invoke("glPointParameterfvEXT", "glPointParameterfv");
        }
    }

    public GLEXTPointParameters(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glPointParameterfEXT((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PointParameterfEXT(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfEXT", pname, param); }
        Handles.MH_glPointParameterfEXT.invokeExact(handles.PFN_glPointParameterfEXT, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfEXT", e); }
    }

    /// ```
    /// void glPointParameterfvEXT((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PointParameterfvEXT(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfvEXT", pname, params); }
        Handles.MH_glPointParameterfvEXT.invokeExact(handles.PFN_glPointParameterfvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfvEXT", e); }
    }

}
