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
/// `GL_ARB_vertex_shader`
public final class GLARBVertexShader {
    public static final int GL_VERTEX_SHADER_ARB = 0x8B31;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS_ARB = 0x8B4B;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 0x8B4D;
    public static final int GL_OBJECT_ACTIVE_ATTRIBUTES_ARB = 0x8B89;
    public static final int GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 0x8B8A;
    public static final int GL_MAX_VERTEX_ATTRIBS_ARB = 0x8869;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS_ARB = 0x8872;
    public static final int GL_MAX_TEXTURE_COORDS_ARB = 0x8871;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE_ARB = 0x8643;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB = 0x8625;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A;
    public static final int GL_CURRENT_VERTEX_ATTRIB_ARB = 0x8626;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;
    public static final int GL_FLOAT = 0x1406;
    public static final int GL_FLOAT_VEC2_ARB = 0x8B50;
    public static final int GL_FLOAT_VEC3_ARB = 0x8B51;
    public static final int GL_FLOAT_VEC4_ARB = 0x8B52;
    public static final int GL_FLOAT_MAT2_ARB = 0x8B5A;
    public static final int GL_FLOAT_MAT3_ARB = 0x8B5B;
    public static final int GL_FLOAT_MAT4_ARB = 0x8B5C;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttrib1fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib1sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib1dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib2fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib2sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib2dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib3fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib3sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib3dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib4fARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib4sARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib4dARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib4NubARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexAttrib1fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4fvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4svARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4dvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4bvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ubvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4usvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4uivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NbvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NsvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NubvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NusvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4NuivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribPointerARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableVertexAttribArrayARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexAttribArrayARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindAttribLocationARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveAttribARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetAttribLocationARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribdvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribfvARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribPointervARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexAttrib1fARB;
        public final MemorySegment PFN_glVertexAttrib1sARB;
        public final MemorySegment PFN_glVertexAttrib1dARB;
        public final MemorySegment PFN_glVertexAttrib2fARB;
        public final MemorySegment PFN_glVertexAttrib2sARB;
        public final MemorySegment PFN_glVertexAttrib2dARB;
        public final MemorySegment PFN_glVertexAttrib3fARB;
        public final MemorySegment PFN_glVertexAttrib3sARB;
        public final MemorySegment PFN_glVertexAttrib3dARB;
        public final MemorySegment PFN_glVertexAttrib4fARB;
        public final MemorySegment PFN_glVertexAttrib4sARB;
        public final MemorySegment PFN_glVertexAttrib4dARB;
        public final MemorySegment PFN_glVertexAttrib4NubARB;
        public final MemorySegment PFN_glVertexAttrib1fvARB;
        public final MemorySegment PFN_glVertexAttrib1svARB;
        public final MemorySegment PFN_glVertexAttrib1dvARB;
        public final MemorySegment PFN_glVertexAttrib2fvARB;
        public final MemorySegment PFN_glVertexAttrib2svARB;
        public final MemorySegment PFN_glVertexAttrib2dvARB;
        public final MemorySegment PFN_glVertexAttrib3fvARB;
        public final MemorySegment PFN_glVertexAttrib3svARB;
        public final MemorySegment PFN_glVertexAttrib3dvARB;
        public final MemorySegment PFN_glVertexAttrib4fvARB;
        public final MemorySegment PFN_glVertexAttrib4svARB;
        public final MemorySegment PFN_glVertexAttrib4dvARB;
        public final MemorySegment PFN_glVertexAttrib4ivARB;
        public final MemorySegment PFN_glVertexAttrib4bvARB;
        public final MemorySegment PFN_glVertexAttrib4ubvARB;
        public final MemorySegment PFN_glVertexAttrib4usvARB;
        public final MemorySegment PFN_glVertexAttrib4uivARB;
        public final MemorySegment PFN_glVertexAttrib4NbvARB;
        public final MemorySegment PFN_glVertexAttrib4NsvARB;
        public final MemorySegment PFN_glVertexAttrib4NivARB;
        public final MemorySegment PFN_glVertexAttrib4NubvARB;
        public final MemorySegment PFN_glVertexAttrib4NusvARB;
        public final MemorySegment PFN_glVertexAttrib4NuivARB;
        public final MemorySegment PFN_glVertexAttribPointerARB;
        public final MemorySegment PFN_glEnableVertexAttribArrayARB;
        public final MemorySegment PFN_glDisableVertexAttribArrayARB;
        public final MemorySegment PFN_glBindAttribLocationARB;
        public final MemorySegment PFN_glGetActiveAttribARB;
        public final MemorySegment PFN_glGetAttribLocationARB;
        public final MemorySegment PFN_glGetVertexAttribdvARB;
        public final MemorySegment PFN_glGetVertexAttribfvARB;
        public final MemorySegment PFN_glGetVertexAttribivARB;
        public final MemorySegment PFN_glGetVertexAttribPointervARB;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttrib1fARB = func.invoke("glVertexAttrib1fARB", "glVertexAttrib1f");
            PFN_glVertexAttrib1sARB = func.invoke("glVertexAttrib1sARB", "glVertexAttrib1s");
            PFN_glVertexAttrib1dARB = func.invoke("glVertexAttrib1dARB", "glVertexAttrib1d");
            PFN_glVertexAttrib2fARB = func.invoke("glVertexAttrib2fARB", "glVertexAttrib2f");
            PFN_glVertexAttrib2sARB = func.invoke("glVertexAttrib2sARB", "glVertexAttrib2s");
            PFN_glVertexAttrib2dARB = func.invoke("glVertexAttrib2dARB", "glVertexAttrib2d");
            PFN_glVertexAttrib3fARB = func.invoke("glVertexAttrib3fARB", "glVertexAttrib3f");
            PFN_glVertexAttrib3sARB = func.invoke("glVertexAttrib3sARB", "glVertexAttrib3s");
            PFN_glVertexAttrib3dARB = func.invoke("glVertexAttrib3dARB", "glVertexAttrib3d");
            PFN_glVertexAttrib4fARB = func.invoke("glVertexAttrib4fARB", "glVertexAttrib4f");
            PFN_glVertexAttrib4sARB = func.invoke("glVertexAttrib4sARB", "glVertexAttrib4s");
            PFN_glVertexAttrib4dARB = func.invoke("glVertexAttrib4dARB", "glVertexAttrib4d");
            PFN_glVertexAttrib4NubARB = func.invoke("glVertexAttrib4NubARB", "glVertexAttrib4Nub");
            PFN_glVertexAttrib1fvARB = func.invoke("glVertexAttrib1fvARB", "glVertexAttrib1fv");
            PFN_glVertexAttrib1svARB = func.invoke("glVertexAttrib1svARB", "glVertexAttrib1sv");
            PFN_glVertexAttrib1dvARB = func.invoke("glVertexAttrib1dvARB", "glVertexAttrib1dv");
            PFN_glVertexAttrib2fvARB = func.invoke("glVertexAttrib2fvARB", "glVertexAttrib2fv");
            PFN_glVertexAttrib2svARB = func.invoke("glVertexAttrib2svARB", "glVertexAttrib2sv");
            PFN_glVertexAttrib2dvARB = func.invoke("glVertexAttrib2dvARB", "glVertexAttrib2dv");
            PFN_glVertexAttrib3fvARB = func.invoke("glVertexAttrib3fvARB", "glVertexAttrib3fv");
            PFN_glVertexAttrib3svARB = func.invoke("glVertexAttrib3svARB", "glVertexAttrib3sv");
            PFN_glVertexAttrib3dvARB = func.invoke("glVertexAttrib3dvARB", "glVertexAttrib3dv");
            PFN_glVertexAttrib4fvARB = func.invoke("glVertexAttrib4fvARB", "glVertexAttrib4fv");
            PFN_glVertexAttrib4svARB = func.invoke("glVertexAttrib4svARB", "glVertexAttrib4sv");
            PFN_glVertexAttrib4dvARB = func.invoke("glVertexAttrib4dvARB", "glVertexAttrib4dv");
            PFN_glVertexAttrib4ivARB = func.invoke("glVertexAttrib4ivARB", "glVertexAttrib4iv");
            PFN_glVertexAttrib4bvARB = func.invoke("glVertexAttrib4bvARB", "glVertexAttrib4bv");
            PFN_glVertexAttrib4ubvARB = func.invoke("glVertexAttrib4ubvARB", "glVertexAttrib4ubv");
            PFN_glVertexAttrib4usvARB = func.invoke("glVertexAttrib4usvARB", "glVertexAttrib4usv");
            PFN_glVertexAttrib4uivARB = func.invoke("glVertexAttrib4uivARB", "glVertexAttrib4uiv");
            PFN_glVertexAttrib4NbvARB = func.invoke("glVertexAttrib4NbvARB", "glVertexAttrib4Nbv");
            PFN_glVertexAttrib4NsvARB = func.invoke("glVertexAttrib4NsvARB", "glVertexAttrib4Nsv");
            PFN_glVertexAttrib4NivARB = func.invoke("glVertexAttrib4NivARB", "glVertexAttrib4Niv");
            PFN_glVertexAttrib4NubvARB = func.invoke("glVertexAttrib4NubvARB", "glVertexAttrib4Nubv");
            PFN_glVertexAttrib4NusvARB = func.invoke("glVertexAttrib4NusvARB", "glVertexAttrib4Nusv");
            PFN_glVertexAttrib4NuivARB = func.invoke("glVertexAttrib4NuivARB", "glVertexAttrib4Nuiv");
            PFN_glVertexAttribPointerARB = func.invoke("glVertexAttribPointerARB", "glVertexAttribPointer");
            PFN_glEnableVertexAttribArrayARB = func.invoke("glEnableVertexAttribArrayARB", "glEnableVertexAttribArray");
            PFN_glDisableVertexAttribArrayARB = func.invoke("glDisableVertexAttribArrayARB", "glDisableVertexAttribArray");
            PFN_glBindAttribLocationARB = func.invoke("glBindAttribLocationARB", "glBindAttribLocation");
            PFN_glGetActiveAttribARB = func.invoke("glGetActiveAttribARB", "glGetActiveAttrib");
            PFN_glGetAttribLocationARB = func.invoke("glGetAttribLocationARB", "glGetAttribLocation");
            PFN_glGetVertexAttribdvARB = func.invoke("glGetVertexAttribdvARB", "glGetVertexAttribdv");
            PFN_glGetVertexAttribfvARB = func.invoke("glGetVertexAttribfvARB", "glGetVertexAttribfv");
            PFN_glGetVertexAttribivARB = func.invoke("glGetVertexAttribivARB", "glGetVertexAttribiv");
            PFN_glGetVertexAttribPointervARB = func.invoke("glGetVertexAttribPointervARB", "glGetVertexAttribPointerv");
        }
    }

    public GLARBVertexShader(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttrib1fARB`.
    /// ```
    /// void glVertexAttrib1fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x);
    /// ```
    public void VertexAttrib1fARB(int index, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fARB", index, x); }
        Handles.MH_glVertexAttrib1fARB.invokeExact(handles.PFN_glVertexAttrib1fARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fARB", e); }
    }

    /// Invokes `glVertexAttrib1sARB`.
    /// ```
    /// void glVertexAttrib1sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x);
    /// ```
    public void VertexAttrib1sARB(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1sARB", index, x); }
        Handles.MH_glVertexAttrib1sARB.invokeExact(handles.PFN_glVertexAttrib1sARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1sARB", e); }
    }

    /// Invokes `glVertexAttrib1dARB`.
    /// ```
    /// void glVertexAttrib1dARB((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttrib1dARB(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dARB", index, x); }
        Handles.MH_glVertexAttrib1dARB.invokeExact(handles.PFN_glVertexAttrib1dARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dARB", e); }
    }

    /// Invokes `glVertexAttrib2fARB`.
    /// ```
    /// void glVertexAttrib2fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void VertexAttrib2fARB(int index, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fARB", index, x, y); }
        Handles.MH_glVertexAttrib2fARB.invokeExact(handles.PFN_glVertexAttrib2fARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fARB", e); }
    }

    /// Invokes `glVertexAttrib2sARB`.
    /// ```
    /// void glVertexAttrib2sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void VertexAttrib2sARB(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2sARB", index, x, y); }
        Handles.MH_glVertexAttrib2sARB.invokeExact(handles.PFN_glVertexAttrib2sARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2sARB", e); }
    }

    /// Invokes `glVertexAttrib2dARB`.
    /// ```
    /// void glVertexAttrib2dARB((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttrib2dARB(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dARB", index, x, y); }
        Handles.MH_glVertexAttrib2dARB.invokeExact(handles.PFN_glVertexAttrib2dARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dARB", e); }
    }

    /// Invokes `glVertexAttrib3fARB`.
    /// ```
    /// void glVertexAttrib3fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void VertexAttrib3fARB(int index, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fARB", index, x, y, z); }
        Handles.MH_glVertexAttrib3fARB.invokeExact(handles.PFN_glVertexAttrib3fARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fARB", e); }
    }

    /// Invokes `glVertexAttrib3sARB`.
    /// ```
    /// void glVertexAttrib3sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void VertexAttrib3sARB(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3sARB", index, x, y, z); }
        Handles.MH_glVertexAttrib3sARB.invokeExact(handles.PFN_glVertexAttrib3sARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3sARB", e); }
    }

    /// Invokes `glVertexAttrib3dARB`.
    /// ```
    /// void glVertexAttrib3dARB((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttrib3dARB(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dARB", index, x, y, z); }
        Handles.MH_glVertexAttrib3dARB.invokeExact(handles.PFN_glVertexAttrib3dARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dARB", e); }
    }

    /// Invokes `glVertexAttrib4fARB`.
    /// ```
    /// void glVertexAttrib4fARB((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void VertexAttrib4fARB(int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4fARB.invokeExact(handles.PFN_glVertexAttrib4fARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fARB", e); }
    }

    /// Invokes `glVertexAttrib4sARB`.
    /// ```
    /// void glVertexAttrib4sARB((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void VertexAttrib4sARB(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4sARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4sARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4sARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4sARB.invokeExact(handles.PFN_glVertexAttrib4sARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4sARB", e); }
    }

    /// Invokes `glVertexAttrib4dARB`.
    /// ```
    /// void glVertexAttrib4dARB((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttrib4dARB(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4dARB.invokeExact(handles.PFN_glVertexAttrib4dARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dARB", e); }
    }

    /// Invokes `glVertexAttrib4NubARB`.
    /// ```
    /// void glVertexAttrib4NubARB((unsigned int) GLuint index, ((unsigned char) khronos_uint8_t) GLubyte x, ((unsigned char) khronos_uint8_t) GLubyte y, ((unsigned char) khronos_uint8_t) GLubyte z, ((unsigned char) khronos_uint8_t) GLubyte w);
    /// ```
    public void VertexAttrib4NubARB(int index, byte x, byte y, byte z, byte w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NubARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NubARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NubARB", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4NubARB.invokeExact(handles.PFN_glVertexAttrib4NubARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NubARB", e); }
    }

    /// Invokes `glVertexAttrib1fvARB`.
    /// ```
    /// void glVertexAttrib1fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib1fvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fvARB", index, v); }
        Handles.MH_glVertexAttrib1fvARB.invokeExact(handles.PFN_glVertexAttrib1fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fvARB", e); }
    }

    /// Invokes `glVertexAttrib1svARB`.
    /// ```
    /// void glVertexAttrib1svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib1svARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1svARB", index, v); }
        Handles.MH_glVertexAttrib1svARB.invokeExact(handles.PFN_glVertexAttrib1svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1svARB", e); }
    }

    /// Invokes `glVertexAttrib1dvARB`.
    /// ```
    /// void glVertexAttrib1dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib1dvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dvARB", index, v); }
        Handles.MH_glVertexAttrib1dvARB.invokeExact(handles.PFN_glVertexAttrib1dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dvARB", e); }
    }

    /// Invokes `glVertexAttrib2fvARB`.
    /// ```
    /// void glVertexAttrib2fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib2fvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fvARB", index, v); }
        Handles.MH_glVertexAttrib2fvARB.invokeExact(handles.PFN_glVertexAttrib2fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fvARB", e); }
    }

    /// Invokes `glVertexAttrib2svARB`.
    /// ```
    /// void glVertexAttrib2svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib2svARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2svARB", index, v); }
        Handles.MH_glVertexAttrib2svARB.invokeExact(handles.PFN_glVertexAttrib2svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2svARB", e); }
    }

    /// Invokes `glVertexAttrib2dvARB`.
    /// ```
    /// void glVertexAttrib2dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib2dvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dvARB", index, v); }
        Handles.MH_glVertexAttrib2dvARB.invokeExact(handles.PFN_glVertexAttrib2dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dvARB", e); }
    }

    /// Invokes `glVertexAttrib3fvARB`.
    /// ```
    /// void glVertexAttrib3fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib3fvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fvARB", index, v); }
        Handles.MH_glVertexAttrib3fvARB.invokeExact(handles.PFN_glVertexAttrib3fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fvARB", e); }
    }

    /// Invokes `glVertexAttrib3svARB`.
    /// ```
    /// void glVertexAttrib3svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib3svARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3svARB", index, v); }
        Handles.MH_glVertexAttrib3svARB.invokeExact(handles.PFN_glVertexAttrib3svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3svARB", e); }
    }

    /// Invokes `glVertexAttrib3dvARB`.
    /// ```
    /// void glVertexAttrib3dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib3dvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dvARB", index, v); }
        Handles.MH_glVertexAttrib3dvARB.invokeExact(handles.PFN_glVertexAttrib3dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dvARB", e); }
    }

    /// Invokes `glVertexAttrib4fvARB`.
    /// ```
    /// void glVertexAttrib4fvARB((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib4fvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fvARB", index, v); }
        Handles.MH_glVertexAttrib4fvARB.invokeExact(handles.PFN_glVertexAttrib4fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fvARB", e); }
    }

    /// Invokes `glVertexAttrib4svARB`.
    /// ```
    /// void glVertexAttrib4svARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4svARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4svARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4svARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4svARB", index, v); }
        Handles.MH_glVertexAttrib4svARB.invokeExact(handles.PFN_glVertexAttrib4svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4svARB", e); }
    }

    /// Invokes `glVertexAttrib4dvARB`.
    /// ```
    /// void glVertexAttrib4dvARB((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib4dvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dvARB", index, v); }
        Handles.MH_glVertexAttrib4dvARB.invokeExact(handles.PFN_glVertexAttrib4dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dvARB", e); }
    }

    /// Invokes `glVertexAttrib4ivARB`.
    /// ```
    /// void glVertexAttrib4ivARB((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttrib4ivARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ivARB", index, v); }
        Handles.MH_glVertexAttrib4ivARB.invokeExact(handles.PFN_glVertexAttrib4ivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ivARB", e); }
    }

    /// Invokes `glVertexAttrib4bvARB`.
    /// ```
    /// void glVertexAttrib4bvARB((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttrib4bvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4bvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4bvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4bvARB", index, v); }
        Handles.MH_glVertexAttrib4bvARB.invokeExact(handles.PFN_glVertexAttrib4bvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4bvARB", e); }
    }

    /// Invokes `glVertexAttrib4ubvARB`.
    /// ```
    /// void glVertexAttrib4ubvARB((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4ubvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ubvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ubvARB", index, v); }
        Handles.MH_glVertexAttrib4ubvARB.invokeExact(handles.PFN_glVertexAttrib4ubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubvARB", e); }
    }

    /// Invokes `glVertexAttrib4usvARB`.
    /// ```
    /// void glVertexAttrib4usvARB((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttrib4usvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4usvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4usvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4usvARB", index, v); }
        Handles.MH_glVertexAttrib4usvARB.invokeExact(handles.PFN_glVertexAttrib4usvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4usvARB", e); }
    }

    /// Invokes `glVertexAttrib4uivARB`.
    /// ```
    /// void glVertexAttrib4uivARB((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttrib4uivARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4uivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4uivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4uivARB", index, v); }
        Handles.MH_glVertexAttrib4uivARB.invokeExact(handles.PFN_glVertexAttrib4uivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4uivARB", e); }
    }

    /// Invokes `glVertexAttrib4NbvARB`.
    /// ```
    /// void glVertexAttrib4NbvARB((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttrib4NbvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NbvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NbvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NbvARB", index, v); }
        Handles.MH_glVertexAttrib4NbvARB.invokeExact(handles.PFN_glVertexAttrib4NbvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NbvARB", e); }
    }

    /// Invokes `glVertexAttrib4NsvARB`.
    /// ```
    /// void glVertexAttrib4NsvARB((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4NsvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NsvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NsvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NsvARB", index, v); }
        Handles.MH_glVertexAttrib4NsvARB.invokeExact(handles.PFN_glVertexAttrib4NsvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NsvARB", e); }
    }

    /// Invokes `glVertexAttrib4NivARB`.
    /// ```
    /// void glVertexAttrib4NivARB((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttrib4NivARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NivARB", index, v); }
        Handles.MH_glVertexAttrib4NivARB.invokeExact(handles.PFN_glVertexAttrib4NivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NivARB", e); }
    }

    /// Invokes `glVertexAttrib4NubvARB`.
    /// ```
    /// void glVertexAttrib4NubvARB((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4NubvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NubvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NubvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NubvARB", index, v); }
        Handles.MH_glVertexAttrib4NubvARB.invokeExact(handles.PFN_glVertexAttrib4NubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NubvARB", e); }
    }

    /// Invokes `glVertexAttrib4NusvARB`.
    /// ```
    /// void glVertexAttrib4NusvARB((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttrib4NusvARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NusvARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NusvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NusvARB", index, v); }
        Handles.MH_glVertexAttrib4NusvARB.invokeExact(handles.PFN_glVertexAttrib4NusvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NusvARB", e); }
    }

    /// Invokes `glVertexAttrib4NuivARB`.
    /// ```
    /// void glVertexAttrib4NuivARB((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttrib4NuivARB(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4NuivARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4NuivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4NuivARB", index, v); }
        Handles.MH_glVertexAttrib4NuivARB.invokeExact(handles.PFN_glVertexAttrib4NuivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4NuivARB", e); }
    }

    /// Invokes `glVertexAttribPointerARB`.
    /// ```
    /// void glVertexAttribPointerARB((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribPointerARB)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribPointerARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribPointerARB", index, size, type, normalized, stride, pointer); }
        Handles.MH_glVertexAttribPointerARB.invokeExact(handles.PFN_glVertexAttribPointerARB, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribPointerARB", e); }
    }

    /// Invokes `glEnableVertexAttribArrayARB`.
    /// ```
    /// void glEnableVertexAttribArrayARB((unsigned int) GLuint index);
    /// ```
    public void EnableVertexAttribArrayARB(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexAttribArrayARB)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexAttribArrayARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVertexAttribArrayARB", index); }
        Handles.MH_glEnableVertexAttribArrayARB.invokeExact(handles.PFN_glEnableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexAttribArrayARB", e); }
    }

    /// Invokes `glDisableVertexAttribArrayARB`.
    /// ```
    /// void glDisableVertexAttribArrayARB((unsigned int) GLuint index);
    /// ```
    public void DisableVertexAttribArrayARB(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexAttribArrayARB)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexAttribArrayARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVertexAttribArrayARB", index); }
        Handles.MH_glDisableVertexAttribArrayARB.invokeExact(handles.PFN_glDisableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexAttribArrayARB", e); }
    }

    /// Invokes `glBindAttribLocationARB`.
    /// ```
    /// void glBindAttribLocationARB((unsigned int) GLhandleARB programObj, (unsigned int) GLuint index, const GLcharARB* name);
    /// ```
    public void BindAttribLocationARB(int programObj, int index, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindAttribLocationARB)) throw new GLSymbolNotFoundError("Symbol not found: glBindAttribLocationARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindAttribLocationARB", programObj, index, name); }
        Handles.MH_glBindAttribLocationARB.invokeExact(handles.PFN_glBindAttribLocationARB, programObj, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in BindAttribLocationARB", e); }
    }

    /// Invokes `glGetActiveAttribARB`.
    /// ```
    /// void glGetActiveAttribARB((unsigned int) GLhandleARB programObj, (unsigned int) GLuint index, (int) GLsizei maxLength, GLsizei* length, GLint* size, GLenum* type, GLcharARB* name);
    /// ```
    public void GetActiveAttribARB(int programObj, int index, int maxLength, @NonNull MemorySegment length, @NonNull MemorySegment size, @NonNull MemorySegment type, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveAttribARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveAttribARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveAttribARB", programObj, index, maxLength, length, size, type, name); }
        Handles.MH_glGetActiveAttribARB.invokeExact(handles.PFN_glGetActiveAttribARB, programObj, index, maxLength, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveAttribARB", e); }
    }

    /// Invokes `glGetAttribLocationARB`.
    /// ```
    /// (int) GLint glGetAttribLocationARB((unsigned int) GLhandleARB programObj, const GLcharARB* name);
    /// ```
    public int GetAttribLocationARB(int programObj, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetAttribLocationARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetAttribLocationARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetAttribLocationARB", programObj, name); }
        return (int) Handles.MH_glGetAttribLocationARB.invokeExact(handles.PFN_glGetAttribLocationARB, programObj, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetAttribLocationARB", e); }
    }

    /// Invokes `glGetVertexAttribdvARB`.
    /// ```
    /// void glGetVertexAttribdvARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribdvARB(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribdvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribdvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribdvARB", index, pname, params); }
        Handles.MH_glGetVertexAttribdvARB.invokeExact(handles.PFN_glGetVertexAttribdvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribdvARB", e); }
    }

    /// Invokes `glGetVertexAttribfvARB`.
    /// ```
    /// void glGetVertexAttribfvARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribfvARB(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribfvARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribfvARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribfvARB", index, pname, params); }
        Handles.MH_glGetVertexAttribfvARB.invokeExact(handles.PFN_glGetVertexAttribfvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribfvARB", e); }
    }

    /// Invokes `glGetVertexAttribivARB`.
    /// ```
    /// void glGetVertexAttribivARB((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribivARB(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribivARB", index, pname, params); }
        Handles.MH_glGetVertexAttribivARB.invokeExact(handles.PFN_glGetVertexAttribivARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribivARB", e); }
    }

    /// Invokes `glGetVertexAttribPointervARB`.
    /// ```
    /// void glGetVertexAttribPointervARB((unsigned int) GLuint index, (unsigned int) GLenum pname, void** pointer);
    /// ```
    public void GetVertexAttribPointervARB(int index, int pname, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribPointervARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribPointervARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribPointervARB", index, pname, pointer); }
        Handles.MH_glGetVertexAttribPointervARB.invokeExact(handles.PFN_glGetVertexAttribPointervARB, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribPointervARB", e); }
    }

}
