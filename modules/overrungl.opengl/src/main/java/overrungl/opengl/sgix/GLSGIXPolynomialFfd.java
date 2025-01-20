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
package overrungl.opengl.sgix;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIXPolynomialFfd {
    public static final int GL_TEXTURE_DEFORMATION_BIT_SGIX = 0x00000001;
    public static final int GL_GEOMETRY_DEFORMATION_BIT_SGIX = 0x00000002;
    public static final int GL_GEOMETRY_DEFORMATION_SGIX = 0x8194;
    public static final int GL_TEXTURE_DEFORMATION_SGIX = 0x8195;
    public static final int GL_DEFORMATIONS_MASK_SGIX = 0x8196;
    public static final int GL_MAX_DEFORMATION_ORDER_SGIX = 0x8197;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDeformationMap3dSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeformationMap3fSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeformSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLoadIdentityDeformationMapSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDeformationMap3dSGIX;
        public final MemorySegment PFN_glDeformationMap3fSGIX;
        public final MemorySegment PFN_glDeformSGIX;
        public final MemorySegment PFN_glLoadIdentityDeformationMapSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDeformationMap3dSGIX = func.invoke("glDeformationMap3dSGIX");
            PFN_glDeformationMap3fSGIX = func.invoke("glDeformationMap3fSGIX");
            PFN_glDeformSGIX = func.invoke("glDeformSGIX");
            PFN_glLoadIdentityDeformationMapSGIX = func.invoke("glLoadIdentityDeformationMapSGIX");
        }
    }

    public GLSGIXPolynomialFfd(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DeformationMap3dSGIX(@CType("GLenum") int target, @CType("GLdouble") double u1, @CType("GLdouble") double u2, @CType("GLint") int ustride, @CType("GLint") int uorder, @CType("GLdouble") double v1, @CType("GLdouble") double v2, @CType("GLint") int vstride, @CType("GLint") int vorder, @CType("GLdouble") double w1, @CType("GLdouble") double w2, @CType("GLint") int wstride, @CType("GLint") int worder, @CType("const GLdouble *") MemorySegment points) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeformationMap3dSGIX)) throw new SymbolNotFoundError("Symbol not found: glDeformationMap3dSGIX");
        try { Handles.MH_glDeformationMap3dSGIX.invokeExact(handles.PFN_glDeformationMap3dSGIX, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points); }
        catch (Throwable e) { throw new RuntimeException("error in glDeformationMap3dSGIX", e); }
    }

    public void DeformationMap3fSGIX(@CType("GLenum") int target, @CType("GLfloat") float u1, @CType("GLfloat") float u2, @CType("GLint") int ustride, @CType("GLint") int uorder, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLint") int vstride, @CType("GLint") int vorder, @CType("GLfloat") float w1, @CType("GLfloat") float w2, @CType("GLint") int wstride, @CType("GLint") int worder, @CType("const GLfloat *") MemorySegment points) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeformationMap3fSGIX)) throw new SymbolNotFoundError("Symbol not found: glDeformationMap3fSGIX");
        try { Handles.MH_glDeformationMap3fSGIX.invokeExact(handles.PFN_glDeformationMap3fSGIX, target, u1, u2, ustride, uorder, v1, v2, vstride, vorder, w1, w2, wstride, worder, points); }
        catch (Throwable e) { throw new RuntimeException("error in glDeformationMap3fSGIX", e); }
    }

    public void DeformSGIX(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeformSGIX)) throw new SymbolNotFoundError("Symbol not found: glDeformSGIX");
        try { Handles.MH_glDeformSGIX.invokeExact(handles.PFN_glDeformSGIX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glDeformSGIX", e); }
    }

    public void LoadIdentityDeformationMapSGIX(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glLoadIdentityDeformationMapSGIX)) throw new SymbolNotFoundError("Symbol not found: glLoadIdentityDeformationMapSGIX");
        try { Handles.MH_glLoadIdentityDeformationMapSGIX.invokeExact(handles.PFN_glLoadIdentityDeformationMapSGIX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glLoadIdentityDeformationMapSGIX", e); }
    }

}
