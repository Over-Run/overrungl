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

public final class GLSGIXFragmentLighting {
    public static final int GL_FRAGMENT_LIGHTING_SGIX = 0x8400;
    public static final int GL_FRAGMENT_COLOR_MATERIAL_SGIX = 0x8401;
    public static final int GL_FRAGMENT_COLOR_MATERIAL_FACE_SGIX = 0x8402;
    public static final int GL_FRAGMENT_COLOR_MATERIAL_PARAMETER_SGIX = 0x8403;
    public static final int GL_MAX_FRAGMENT_LIGHTS_SGIX = 0x8404;
    public static final int GL_MAX_ACTIVE_LIGHTS_SGIX = 0x8405;
    public static final int GL_CURRENT_RASTER_NORMAL_SGIX = 0x8406;
    public static final int GL_LIGHT_ENV_MODE_SGIX = 0x8407;
    public static final int GL_FRAGMENT_LIGHT_MODEL_LOCAL_VIEWER_SGIX = 0x8408;
    public static final int GL_FRAGMENT_LIGHT_MODEL_TWO_SIDE_SGIX = 0x8409;
    public static final int GL_FRAGMENT_LIGHT_MODEL_AMBIENT_SGIX = 0x840A;
    public static final int GL_FRAGMENT_LIGHT_MODEL_NORMAL_INTERPOLATION_SGIX = 0x840B;
    public static final int GL_FRAGMENT_LIGHT0_SGIX = 0x840C;
    public static final int GL_FRAGMENT_LIGHT1_SGIX = 0x840D;
    public static final int GL_FRAGMENT_LIGHT2_SGIX = 0x840E;
    public static final int GL_FRAGMENT_LIGHT3_SGIX = 0x840F;
    public static final int GL_FRAGMENT_LIGHT4_SGIX = 0x8410;
    public static final int GL_FRAGMENT_LIGHT5_SGIX = 0x8411;
    public static final int GL_FRAGMENT_LIGHT6_SGIX = 0x8412;
    public static final int GL_FRAGMENT_LIGHT7_SGIX = 0x8413;
    public static final MethodHandle MH_glFragmentColorMaterialSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFragmentLightfSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glFragmentLightfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFragmentLightiSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFragmentLightivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFragmentLightModelfSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glFragmentLightModelfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFragmentLightModeliSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFragmentLightModelivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFragmentMaterialfSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glFragmentMaterialfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glFragmentMaterialiSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glFragmentMaterialivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetFragmentLightfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetFragmentLightivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetFragmentMaterialfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetFragmentMaterialivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glLightEnviSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFragmentColorMaterialSGIX;
    public final MemorySegment PFN_glFragmentLightfSGIX;
    public final MemorySegment PFN_glFragmentLightfvSGIX;
    public final MemorySegment PFN_glFragmentLightiSGIX;
    public final MemorySegment PFN_glFragmentLightivSGIX;
    public final MemorySegment PFN_glFragmentLightModelfSGIX;
    public final MemorySegment PFN_glFragmentLightModelfvSGIX;
    public final MemorySegment PFN_glFragmentLightModeliSGIX;
    public final MemorySegment PFN_glFragmentLightModelivSGIX;
    public final MemorySegment PFN_glFragmentMaterialfSGIX;
    public final MemorySegment PFN_glFragmentMaterialfvSGIX;
    public final MemorySegment PFN_glFragmentMaterialiSGIX;
    public final MemorySegment PFN_glFragmentMaterialivSGIX;
    public final MemorySegment PFN_glGetFragmentLightfvSGIX;
    public final MemorySegment PFN_glGetFragmentLightivSGIX;
    public final MemorySegment PFN_glGetFragmentMaterialfvSGIX;
    public final MemorySegment PFN_glGetFragmentMaterialivSGIX;
    public final MemorySegment PFN_glLightEnviSGIX;

    public GLSGIXFragmentLighting(overrungl.opengl.GLLoadFunc func) {
        PFN_glFragmentColorMaterialSGIX = func.invoke("glFragmentColorMaterialSGIX");
        PFN_glFragmentLightfSGIX = func.invoke("glFragmentLightfSGIX");
        PFN_glFragmentLightfvSGIX = func.invoke("glFragmentLightfvSGIX");
        PFN_glFragmentLightiSGIX = func.invoke("glFragmentLightiSGIX");
        PFN_glFragmentLightivSGIX = func.invoke("glFragmentLightivSGIX");
        PFN_glFragmentLightModelfSGIX = func.invoke("glFragmentLightModelfSGIX");
        PFN_glFragmentLightModelfvSGIX = func.invoke("glFragmentLightModelfvSGIX");
        PFN_glFragmentLightModeliSGIX = func.invoke("glFragmentLightModeliSGIX");
        PFN_glFragmentLightModelivSGIX = func.invoke("glFragmentLightModelivSGIX");
        PFN_glFragmentMaterialfSGIX = func.invoke("glFragmentMaterialfSGIX");
        PFN_glFragmentMaterialfvSGIX = func.invoke("glFragmentMaterialfvSGIX");
        PFN_glFragmentMaterialiSGIX = func.invoke("glFragmentMaterialiSGIX");
        PFN_glFragmentMaterialivSGIX = func.invoke("glFragmentMaterialivSGIX");
        PFN_glGetFragmentLightfvSGIX = func.invoke("glGetFragmentLightfvSGIX");
        PFN_glGetFragmentLightivSGIX = func.invoke("glGetFragmentLightivSGIX");
        PFN_glGetFragmentMaterialfvSGIX = func.invoke("glGetFragmentMaterialfvSGIX");
        PFN_glGetFragmentMaterialivSGIX = func.invoke("glGetFragmentMaterialivSGIX");
        PFN_glLightEnviSGIX = func.invoke("glLightEnviSGIX");
    }

    public void FragmentColorMaterialSGIX(@CType("GLenum") int face, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(PFN_glFragmentColorMaterialSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentColorMaterialSGIX");
        try { MH_glFragmentColorMaterialSGIX.invokeExact(PFN_glFragmentColorMaterialSGIX, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentColorMaterialSGIX", e); }
    }

    public void FragmentLightfSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightfSGIX");
        try { MH_glFragmentLightfSGIX.invokeExact(PFN_glFragmentLightfSGIX, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightfSGIX", e); }
    }

    public void FragmentLightfvSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightfvSGIX");
        try { MH_glFragmentLightfvSGIX.invokeExact(PFN_glFragmentLightfvSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightfvSGIX", e); }
    }

    public void FragmentLightiSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightiSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightiSGIX");
        try { MH_glFragmentLightiSGIX.invokeExact(PFN_glFragmentLightiSGIX, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightiSGIX", e); }
    }

    public void FragmentLightivSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightivSGIX");
        try { MH_glFragmentLightivSGIX.invokeExact(PFN_glFragmentLightivSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightivSGIX", e); }
    }

    public void FragmentLightModelfSGIX(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightModelfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelfSGIX");
        try { MH_glFragmentLightModelfSGIX.invokeExact(PFN_glFragmentLightModelfSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModelfSGIX", e); }
    }

    public void FragmentLightModelfvSGIX(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightModelfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelfvSGIX");
        try { MH_glFragmentLightModelfvSGIX.invokeExact(PFN_glFragmentLightModelfvSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModelfvSGIX", e); }
    }

    public void FragmentLightModeliSGIX(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightModeliSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModeliSGIX");
        try { MH_glFragmentLightModeliSGIX.invokeExact(PFN_glFragmentLightModeliSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModeliSGIX", e); }
    }

    public void FragmentLightModelivSGIX(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glFragmentLightModelivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelivSGIX");
        try { MH_glFragmentLightModelivSGIX.invokeExact(PFN_glFragmentLightModelivSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModelivSGIX", e); }
    }

    public void FragmentMaterialfSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glFragmentMaterialfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialfSGIX");
        try { MH_glFragmentMaterialfSGIX.invokeExact(PFN_glFragmentMaterialfSGIX, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialfSGIX", e); }
    }

    public void FragmentMaterialfvSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glFragmentMaterialfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialfvSGIX");
        try { MH_glFragmentMaterialfvSGIX.invokeExact(PFN_glFragmentMaterialfvSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialfvSGIX", e); }
    }

    public void FragmentMaterialiSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glFragmentMaterialiSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialiSGIX");
        try { MH_glFragmentMaterialiSGIX.invokeExact(PFN_glFragmentMaterialiSGIX, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialiSGIX", e); }
    }

    public void FragmentMaterialivSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glFragmentMaterialivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialivSGIX");
        try { MH_glFragmentMaterialivSGIX.invokeExact(PFN_glFragmentMaterialivSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialivSGIX", e); }
    }

    public void GetFragmentLightfvSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetFragmentLightfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentLightfvSGIX");
        try { MH_glGetFragmentLightfvSGIX.invokeExact(PFN_glGetFragmentLightfvSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentLightfvSGIX", e); }
    }

    public void GetFragmentLightivSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetFragmentLightivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentLightivSGIX");
        try { MH_glGetFragmentLightivSGIX.invokeExact(PFN_glGetFragmentLightivSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentLightivSGIX", e); }
    }

    public void GetFragmentMaterialfvSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetFragmentMaterialfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentMaterialfvSGIX");
        try { MH_glGetFragmentMaterialfvSGIX.invokeExact(PFN_glGetFragmentMaterialfvSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentMaterialfvSGIX", e); }
    }

    public void GetFragmentMaterialivSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetFragmentMaterialivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentMaterialivSGIX");
        try { MH_glGetFragmentMaterialivSGIX.invokeExact(PFN_glGetFragmentMaterialivSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentMaterialivSGIX", e); }
    }

    public void LightEnviSGIX(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(PFN_glLightEnviSGIX)) throw new SymbolNotFoundError("Symbol not found: glLightEnviSGIX");
        try { MH_glLightEnviSGIX.invokeExact(PFN_glLightEnviSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightEnviSGIX", e); }
    }

}
