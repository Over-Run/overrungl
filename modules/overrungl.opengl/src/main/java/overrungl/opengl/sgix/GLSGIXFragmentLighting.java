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
    private final Handles handles;
    public static final class Handles {
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLSGIXFragmentLighting(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFragmentColorMaterialSGIX((unsigned int) GLenum face, (unsigned int) GLenum mode);
    /// ```
    public void FragmentColorMaterialSGIX(int face, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentColorMaterialSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentColorMaterialSGIX");
        try { Handles.MH_glFragmentColorMaterialSGIX.invokeExact(handles.PFN_glFragmentColorMaterialSGIX, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentColorMaterialSGIX", e); }
    }

    /// ```
    /// void glFragmentLightfSGIX((unsigned int) GLenum light, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void FragmentLightfSGIX(int light, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightfSGIX");
        try { Handles.MH_glFragmentLightfSGIX.invokeExact(handles.PFN_glFragmentLightfSGIX, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightfSGIX", e); }
    }

    /// ```
    /// void glFragmentLightfvSGIX((unsigned int) GLenum light, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void FragmentLightfvSGIX(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightfvSGIX");
        try { Handles.MH_glFragmentLightfvSGIX.invokeExact(handles.PFN_glFragmentLightfvSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightfvSGIX", e); }
    }

    /// ```
    /// void glFragmentLightiSGIX((unsigned int) GLenum light, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FragmentLightiSGIX(int light, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightiSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightiSGIX");
        try { Handles.MH_glFragmentLightiSGIX.invokeExact(handles.PFN_glFragmentLightiSGIX, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightiSGIX", e); }
    }

    /// ```
    /// void glFragmentLightivSGIX((unsigned int) GLenum light, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void FragmentLightivSGIX(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightivSGIX");
        try { Handles.MH_glFragmentLightivSGIX.invokeExact(handles.PFN_glFragmentLightivSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightivSGIX", e); }
    }

    /// ```
    /// void glFragmentLightModelfSGIX((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void FragmentLightModelfSGIX(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightModelfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelfSGIX");
        try { Handles.MH_glFragmentLightModelfSGIX.invokeExact(handles.PFN_glFragmentLightModelfSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightModelfSGIX", e); }
    }

    /// ```
    /// void glFragmentLightModelfvSGIX((unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void FragmentLightModelfvSGIX(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightModelfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelfvSGIX");
        try { Handles.MH_glFragmentLightModelfvSGIX.invokeExact(handles.PFN_glFragmentLightModelfvSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightModelfvSGIX", e); }
    }

    /// ```
    /// void glFragmentLightModeliSGIX((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FragmentLightModeliSGIX(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightModeliSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModeliSGIX");
        try { Handles.MH_glFragmentLightModeliSGIX.invokeExact(handles.PFN_glFragmentLightModeliSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightModeliSGIX", e); }
    }

    /// ```
    /// void glFragmentLightModelivSGIX((unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void FragmentLightModelivSGIX(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentLightModelivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelivSGIX");
        try { Handles.MH_glFragmentLightModelivSGIX.invokeExact(handles.PFN_glFragmentLightModelivSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentLightModelivSGIX", e); }
    }

    /// ```
    /// void glFragmentMaterialfSGIX((unsigned int) GLenum face, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void FragmentMaterialfSGIX(int face, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentMaterialfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialfSGIX");
        try { Handles.MH_glFragmentMaterialfSGIX.invokeExact(handles.PFN_glFragmentMaterialfSGIX, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentMaterialfSGIX", e); }
    }

    /// ```
    /// void glFragmentMaterialfvSGIX((unsigned int) GLenum face, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void FragmentMaterialfvSGIX(int face, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentMaterialfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialfvSGIX");
        try { Handles.MH_glFragmentMaterialfvSGIX.invokeExact(handles.PFN_glFragmentMaterialfvSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentMaterialfvSGIX", e); }
    }

    /// ```
    /// void glFragmentMaterialiSGIX((unsigned int) GLenum face, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FragmentMaterialiSGIX(int face, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentMaterialiSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialiSGIX");
        try { Handles.MH_glFragmentMaterialiSGIX.invokeExact(handles.PFN_glFragmentMaterialiSGIX, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentMaterialiSGIX", e); }
    }

    /// ```
    /// void glFragmentMaterialivSGIX((unsigned int) GLenum face, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void FragmentMaterialivSGIX(int face, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFragmentMaterialivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialivSGIX");
        try { Handles.MH_glFragmentMaterialivSGIX.invokeExact(handles.PFN_glFragmentMaterialivSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in FragmentMaterialivSGIX", e); }
    }

    /// ```
    /// void glGetFragmentLightfvSGIX((unsigned int) GLenum light, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetFragmentLightfvSGIX(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragmentLightfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentLightfvSGIX");
        try { Handles.MH_glGetFragmentLightfvSGIX.invokeExact(handles.PFN_glGetFragmentLightfvSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragmentLightfvSGIX", e); }
    }

    /// ```
    /// void glGetFragmentLightivSGIX((unsigned int) GLenum light, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFragmentLightivSGIX(int light, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragmentLightivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentLightivSGIX");
        try { Handles.MH_glGetFragmentLightivSGIX.invokeExact(handles.PFN_glGetFragmentLightivSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragmentLightivSGIX", e); }
    }

    /// ```
    /// void glGetFragmentMaterialfvSGIX((unsigned int) GLenum face, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetFragmentMaterialfvSGIX(int face, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragmentMaterialfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentMaterialfvSGIX");
        try { Handles.MH_glGetFragmentMaterialfvSGIX.invokeExact(handles.PFN_glGetFragmentMaterialfvSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragmentMaterialfvSGIX", e); }
    }

    /// ```
    /// void glGetFragmentMaterialivSGIX((unsigned int) GLenum face, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFragmentMaterialivSGIX(int face, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragmentMaterialivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentMaterialivSGIX");
        try { Handles.MH_glGetFragmentMaterialivSGIX.invokeExact(handles.PFN_glGetFragmentMaterialivSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragmentMaterialivSGIX", e); }
    }

    /// ```
    /// void glLightEnviSGIX((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void LightEnviSGIX(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLightEnviSGIX)) throw new SymbolNotFoundError("Symbol not found: glLightEnviSGIX");
        try { Handles.MH_glLightEnviSGIX.invokeExact(handles.PFN_glLightEnviSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in LightEnviSGIX", e); }
    }

}
