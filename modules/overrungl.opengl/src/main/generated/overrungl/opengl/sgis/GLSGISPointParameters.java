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
package overrungl.opengl.sgis;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_SGIS_point_parameters`
public final class GLSGISPointParameters {
    public static final int GL_POINT_SIZE_MIN_SGIS = 0x8126;
    public static final int GL_POINT_SIZE_MAX_SGIS = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_SGIS = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_SGIS = 0x8129;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPointParameterfSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPointParameterfvSGIS = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPointParameterfSGIS;
        public final MemorySegment PFN_glPointParameterfvSGIS;
        private Handles(GLLoadFunc func) {
            PFN_glPointParameterfSGIS = func.invoke("glPointParameterfSGIS", "glPointParameterf");
            PFN_glPointParameterfvSGIS = func.invoke("glPointParameterfvSGIS", "glPointParameterfv");
        }
    }

    public GLSGISPointParameters(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glPointParameterfSGIS`.
    /// ```
    /// void glPointParameterfSGIS((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void PointParameterfSGIS(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfSGIS", pname, param); }
        Handles.MH_glPointParameterfSGIS.invokeExact(handles.PFN_glPointParameterfSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfSGIS", e); }
    }

    /// Invokes `glPointParameterfvSGIS`.
    /// ```
    /// void glPointParameterfvSGIS((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void PointParameterfvSGIS(int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterfvSGIS)) throw new GLSymbolNotFoundError("Symbol not found: glPointParameterfvSGIS");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glPointParameterfvSGIS", pname, params); }
        Handles.MH_glPointParameterfvSGIS.invokeExact(handles.PFN_glPointParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterfvSGIS", e); }
    }

}
