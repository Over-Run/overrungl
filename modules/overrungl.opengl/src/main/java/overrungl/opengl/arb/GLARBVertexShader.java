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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glVertexAttrib1fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glVertexAttrib1sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
    public static final MethodHandle MH_glVertexAttrib1dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glVertexAttrib2fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glVertexAttrib2sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public static final MethodHandle MH_glVertexAttrib2dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glVertexAttrib3fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glVertexAttrib3sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public static final MethodHandle MH_glVertexAttrib3dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glVertexAttrib4fARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glVertexAttrib4sARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public static final MethodHandle MH_glVertexAttrib4dARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public static final MethodHandle MH_glVertexAttrib4NubARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public static final MethodHandle MH_glVertexAttrib1fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib1svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib1dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib2fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib2svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib2dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib3fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib3svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib3dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4fvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4svARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4dvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4ivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4bvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4ubvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4usvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4uivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4NbvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4NsvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4NivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4NubvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4NusvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttrib4NuivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVertexAttribPointerARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glEnableVertexAttribArrayARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glDisableVertexAttribArrayARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBindAttribLocationARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetActiveAttribARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetAttribLocationARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVertexAttribdvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVertexAttribfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVertexAttribivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVertexAttribPointervARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    public GLARBVertexShader(overrungl.opengl.GLLoadFunc func) {
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

    public void VertexAttrib1fARB(@CType("GLuint") int index, @CType("GLfloat") float x) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib1fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fARB");
        try { MH_glVertexAttrib1fARB.invokeExact(PFN_glVertexAttrib1fARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fARB", e); }
    }

    public void VertexAttrib1sARB(@CType("GLuint") int index, @CType("GLshort") short x) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib1sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1sARB");
        try { MH_glVertexAttrib1sARB.invokeExact(PFN_glVertexAttrib1sARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1sARB", e); }
    }

    public void VertexAttrib1dARB(@CType("GLuint") int index, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib1dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dARB");
        try { MH_glVertexAttrib1dARB.invokeExact(PFN_glVertexAttrib1dARB, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dARB", e); }
    }

    public void VertexAttrib2fARB(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib2fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fARB");
        try { MH_glVertexAttrib2fARB.invokeExact(PFN_glVertexAttrib2fARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fARB", e); }
    }

    public void VertexAttrib2sARB(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib2sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2sARB");
        try { MH_glVertexAttrib2sARB.invokeExact(PFN_glVertexAttrib2sARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2sARB", e); }
    }

    public void VertexAttrib2dARB(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib2dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dARB");
        try { MH_glVertexAttrib2dARB.invokeExact(PFN_glVertexAttrib2dARB, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dARB", e); }
    }

    public void VertexAttrib3fARB(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib3fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fARB");
        try { MH_glVertexAttrib3fARB.invokeExact(PFN_glVertexAttrib3fARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fARB", e); }
    }

    public void VertexAttrib3sARB(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib3sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3sARB");
        try { MH_glVertexAttrib3sARB.invokeExact(PFN_glVertexAttrib3sARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3sARB", e); }
    }

    public void VertexAttrib3dARB(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib3dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dARB");
        try { MH_glVertexAttrib3dARB.invokeExact(PFN_glVertexAttrib3dARB, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dARB", e); }
    }

    public void VertexAttrib4fARB(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4fARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fARB");
        try { MH_glVertexAttrib4fARB.invokeExact(PFN_glVertexAttrib4fARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fARB", e); }
    }

    public void VertexAttrib4sARB(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4sARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4sARB");
        try { MH_glVertexAttrib4sARB.invokeExact(PFN_glVertexAttrib4sARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4sARB", e); }
    }

    public void VertexAttrib4dARB(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4dARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dARB");
        try { MH_glVertexAttrib4dARB.invokeExact(PFN_glVertexAttrib4dARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dARB", e); }
    }

    public void VertexAttrib4NubARB(@CType("GLuint") int index, @CType("GLubyte") byte x, @CType("GLubyte") byte y, @CType("GLubyte") byte z, @CType("GLubyte") byte w) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NubARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NubARB");
        try { MH_glVertexAttrib4NubARB.invokeExact(PFN_glVertexAttrib4NubARB, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NubARB", e); }
    }

    public void VertexAttrib1fvARB(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib1fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fvARB");
        try { MH_glVertexAttrib1fvARB.invokeExact(PFN_glVertexAttrib1fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fvARB", e); }
    }

    public void VertexAttrib1svARB(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib1svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1svARB");
        try { MH_glVertexAttrib1svARB.invokeExact(PFN_glVertexAttrib1svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1svARB", e); }
    }

    public void VertexAttrib1dvARB(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib1dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dvARB");
        try { MH_glVertexAttrib1dvARB.invokeExact(PFN_glVertexAttrib1dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dvARB", e); }
    }

    public void VertexAttrib2fvARB(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib2fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fvARB");
        try { MH_glVertexAttrib2fvARB.invokeExact(PFN_glVertexAttrib2fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fvARB", e); }
    }

    public void VertexAttrib2svARB(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib2svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2svARB");
        try { MH_glVertexAttrib2svARB.invokeExact(PFN_glVertexAttrib2svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2svARB", e); }
    }

    public void VertexAttrib2dvARB(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib2dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dvARB");
        try { MH_glVertexAttrib2dvARB.invokeExact(PFN_glVertexAttrib2dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dvARB", e); }
    }

    public void VertexAttrib3fvARB(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib3fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fvARB");
        try { MH_glVertexAttrib3fvARB.invokeExact(PFN_glVertexAttrib3fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fvARB", e); }
    }

    public void VertexAttrib3svARB(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib3svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3svARB");
        try { MH_glVertexAttrib3svARB.invokeExact(PFN_glVertexAttrib3svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3svARB", e); }
    }

    public void VertexAttrib3dvARB(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib3dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dvARB");
        try { MH_glVertexAttrib3dvARB.invokeExact(PFN_glVertexAttrib3dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dvARB", e); }
    }

    public void VertexAttrib4fvARB(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4fvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fvARB");
        try { MH_glVertexAttrib4fvARB.invokeExact(PFN_glVertexAttrib4fvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fvARB", e); }
    }

    public void VertexAttrib4svARB(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4svARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4svARB");
        try { MH_glVertexAttrib4svARB.invokeExact(PFN_glVertexAttrib4svARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4svARB", e); }
    }

    public void VertexAttrib4dvARB(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4dvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dvARB");
        try { MH_glVertexAttrib4dvARB.invokeExact(PFN_glVertexAttrib4dvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dvARB", e); }
    }

    public void VertexAttrib4ivARB(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4ivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ivARB");
        try { MH_glVertexAttrib4ivARB.invokeExact(PFN_glVertexAttrib4ivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ivARB", e); }
    }

    public void VertexAttrib4bvARB(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4bvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4bvARB");
        try { MH_glVertexAttrib4bvARB.invokeExact(PFN_glVertexAttrib4bvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4bvARB", e); }
    }

    public void VertexAttrib4ubvARB(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4ubvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ubvARB");
        try { MH_glVertexAttrib4ubvARB.invokeExact(PFN_glVertexAttrib4ubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ubvARB", e); }
    }

    public void VertexAttrib4usvARB(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4usvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4usvARB");
        try { MH_glVertexAttrib4usvARB.invokeExact(PFN_glVertexAttrib4usvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4usvARB", e); }
    }

    public void VertexAttrib4uivARB(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4uivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4uivARB");
        try { MH_glVertexAttrib4uivARB.invokeExact(PFN_glVertexAttrib4uivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4uivARB", e); }
    }

    public void VertexAttrib4NbvARB(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NbvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NbvARB");
        try { MH_glVertexAttrib4NbvARB.invokeExact(PFN_glVertexAttrib4NbvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NbvARB", e); }
    }

    public void VertexAttrib4NsvARB(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NsvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NsvARB");
        try { MH_glVertexAttrib4NsvARB.invokeExact(PFN_glVertexAttrib4NsvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NsvARB", e); }
    }

    public void VertexAttrib4NivARB(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NivARB");
        try { MH_glVertexAttrib4NivARB.invokeExact(PFN_glVertexAttrib4NivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NivARB", e); }
    }

    public void VertexAttrib4NubvARB(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NubvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NubvARB");
        try { MH_glVertexAttrib4NubvARB.invokeExact(PFN_glVertexAttrib4NubvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NubvARB", e); }
    }

    public void VertexAttrib4NusvARB(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NusvARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NusvARB");
        try { MH_glVertexAttrib4NusvARB.invokeExact(PFN_glVertexAttrib4NusvARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NusvARB", e); }
    }

    public void VertexAttrib4NuivARB(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttrib4NuivARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4NuivARB");
        try { MH_glVertexAttrib4NuivARB.invokeExact(PFN_glVertexAttrib4NuivARB, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4NuivARB", e); }
    }

    public void VertexAttribPointerARB(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(PFN_glVertexAttribPointerARB)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribPointerARB");
        try { MH_glVertexAttribPointerARB.invokeExact(PFN_glVertexAttribPointerARB, index, size, type, normalized, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribPointerARB", e); }
    }

    public void EnableVertexAttribArrayARB(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(PFN_glEnableVertexAttribArrayARB)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexAttribArrayARB");
        try { MH_glEnableVertexAttribArrayARB.invokeExact(PFN_glEnableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexAttribArrayARB", e); }
    }

    public void DisableVertexAttribArrayARB(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(PFN_glDisableVertexAttribArrayARB)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexAttribArrayARB");
        try { MH_glDisableVertexAttribArrayARB.invokeExact(PFN_glDisableVertexAttribArrayARB, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexAttribArrayARB", e); }
    }

    public void BindAttribLocationARB(@CType("GLhandleARB") int programObj, @CType("GLuint") int index, @CType("const GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(PFN_glBindAttribLocationARB)) throw new SymbolNotFoundError("Symbol not found: glBindAttribLocationARB");
        try { MH_glBindAttribLocationARB.invokeExact(PFN_glBindAttribLocationARB, programObj, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in glBindAttribLocationARB", e); }
    }

    public void GetActiveAttribARB(@CType("GLhandleARB") int programObj, @CType("GLuint") int index, @CType("GLsizei") int maxLength, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(PFN_glGetActiveAttribARB)) throw new SymbolNotFoundError("Symbol not found: glGetActiveAttribARB");
        try { MH_glGetActiveAttribARB.invokeExact(PFN_glGetActiveAttribARB, programObj, index, maxLength, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveAttribARB", e); }
    }

    public @CType("GLint") int GetAttribLocationARB(@CType("GLhandleARB") int programObj, @CType("const GLcharARB *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(PFN_glGetAttribLocationARB)) throw new SymbolNotFoundError("Symbol not found: glGetAttribLocationARB");
        try { return (int) MH_glGetAttribLocationARB.invokeExact(PFN_glGetAttribLocationARB, programObj, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetAttribLocationARB", e); }
    }

    public void GetVertexAttribdvARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVertexAttribdvARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribdvARB");
        try { MH_glGetVertexAttribdvARB.invokeExact(PFN_glGetVertexAttribdvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribdvARB", e); }
    }

    public void GetVertexAttribfvARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVertexAttribfvARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribfvARB");
        try { MH_glGetVertexAttribfvARB.invokeExact(PFN_glGetVertexAttribfvARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribfvARB", e); }
    }

    public void GetVertexAttribivARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVertexAttribivARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribivARB");
        try { MH_glGetVertexAttribivARB.invokeExact(PFN_glGetVertexAttribivARB, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribivARB", e); }
    }

    public void GetVertexAttribPointervARB(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(PFN_glGetVertexAttribPointervARB)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribPointervARB");
        try { MH_glGetVertexAttribPointervARB.invokeExact(PFN_glGetVertexAttribPointervARB, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribPointervARB", e); }
    }

}
