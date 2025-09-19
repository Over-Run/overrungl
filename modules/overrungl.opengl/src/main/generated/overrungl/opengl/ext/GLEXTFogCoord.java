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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_fog_coord`
public final class GLEXTFogCoord {
    public static final int GL_FOG_COORDINATE_SOURCE_EXT = 0x8450;
    public static final int GL_FOG_COORDINATE_EXT = 0x8451;
    public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE_EXT = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY_EXT = 0x8457;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFogCoordfEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glFogCoordfvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFogCoorddEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glFogCoorddvEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFogCoordPointerEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFogCoordfEXT;
        public final MemorySegment PFN_glFogCoordfvEXT;
        public final MemorySegment PFN_glFogCoorddEXT;
        public final MemorySegment PFN_glFogCoorddvEXT;
        public final MemorySegment PFN_glFogCoordPointerEXT;
        private Handles(GLLoadFunc func) {
            PFN_glFogCoordfEXT = func.invoke("glFogCoordfEXT", "glFogCoordf");
            PFN_glFogCoordfvEXT = func.invoke("glFogCoordfvEXT", "glFogCoordfv");
            PFN_glFogCoorddEXT = func.invoke("glFogCoorddEXT", "glFogCoordd");
            PFN_glFogCoorddvEXT = func.invoke("glFogCoorddvEXT", "glFogCoorddv");
            PFN_glFogCoordPointerEXT = func.invoke("glFogCoordPointerEXT", "glFogCoordPointer");
        }
    }

    public GLEXTFogCoord(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFogCoordfEXT`.
    /// ```
    /// void glFogCoordfEXT(((float) khronos_float_t) GLfloat coord);
    /// ```
    public void FogCoordfEXT(float coord) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordfEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordfEXT", coord); }
        Handles.MH_glFogCoordfEXT.invokeExact(handles.PFN_glFogCoordfEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordfEXT", e); }
    }

    /// Invokes `glFogCoordfvEXT`.
    /// ```
    /// void glFogCoordfvEXT(const GLfloat* coord);
    /// ```
    public void FogCoordfvEXT(@NonNull MemorySegment coord) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordfvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordfvEXT", coord); }
        Handles.MH_glFogCoordfvEXT.invokeExact(handles.PFN_glFogCoordfvEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordfvEXT", e); }
    }

    /// Invokes `glFogCoorddEXT`.
    /// ```
    /// void glFogCoorddEXT((double) GLdouble coord);
    /// ```
    public void FogCoorddEXT(double coord) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoorddEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoorddEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoorddEXT", coord); }
        Handles.MH_glFogCoorddEXT.invokeExact(handles.PFN_glFogCoorddEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoorddEXT", e); }
    }

    /// Invokes `glFogCoorddvEXT`.
    /// ```
    /// void glFogCoorddvEXT(const GLdouble* coord);
    /// ```
    public void FogCoorddvEXT(@NonNull MemorySegment coord) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoorddvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoorddvEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoorddvEXT", coord); }
        Handles.MH_glFogCoorddvEXT.invokeExact(handles.PFN_glFogCoorddvEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoorddvEXT", e); }
    }

    /// Invokes `glFogCoordPointerEXT`.
    /// ```
    /// void glFogCoordPointerEXT((unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void FogCoordPointerEXT(int type, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFogCoordPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFogCoordPointerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFogCoordPointerEXT", type, stride, pointer); }
        Handles.MH_glFogCoordPointerEXT.invokeExact(handles.PFN_glFogCoordPointerEXT, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in FogCoordPointerEXT", e); }
    }

}
