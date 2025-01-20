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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFragmentColorMaterialSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFragmentLightfSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glFragmentLightfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFragmentLightiSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFragmentLightivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFragmentLightModelfSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glFragmentLightModelfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFragmentLightModeliSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFragmentLightModelivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFragmentMaterialfSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glFragmentMaterialfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFragmentMaterialiSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFragmentMaterialivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetFragmentLightfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetFragmentLightivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetFragmentMaterialfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetFragmentMaterialivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glLightEnviSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glFragmentColorMaterialSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentColorMaterialSGIX);
        public static final MethodHandle MH_glFragmentLightfSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightfSGIX);
        public static final MethodHandle MH_glFragmentLightfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightfvSGIX);
        public static final MethodHandle MH_glFragmentLightiSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightiSGIX);
        public static final MethodHandle MH_glFragmentLightivSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightivSGIX);
        public static final MethodHandle MH_glFragmentLightModelfSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightModelfSGIX);
        public static final MethodHandle MH_glFragmentLightModelfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightModelfvSGIX);
        public static final MethodHandle MH_glFragmentLightModeliSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightModeliSGIX);
        public static final MethodHandle MH_glFragmentLightModelivSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentLightModelivSGIX);
        public static final MethodHandle MH_glFragmentMaterialfSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentMaterialfSGIX);
        public static final MethodHandle MH_glFragmentMaterialfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentMaterialfvSGIX);
        public static final MethodHandle MH_glFragmentMaterialiSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentMaterialiSGIX);
        public static final MethodHandle MH_glFragmentMaterialivSGIX = RuntimeHelper.downcall(Descriptors.FD_glFragmentMaterialivSGIX);
        public static final MethodHandle MH_glGetFragmentLightfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetFragmentLightfvSGIX);
        public static final MethodHandle MH_glGetFragmentLightivSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetFragmentLightivSGIX);
        public static final MethodHandle MH_glGetFragmentMaterialfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetFragmentMaterialfvSGIX);
        public static final MethodHandle MH_glGetFragmentMaterialivSGIX = RuntimeHelper.downcall(Descriptors.FD_glGetFragmentMaterialivSGIX);
        public static final MethodHandle MH_glLightEnviSGIX = RuntimeHelper.downcall(Descriptors.FD_glLightEnviSGIX);
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

    public void FragmentColorMaterialSGIX(@CType("GLenum") int face, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentColorMaterialSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentColorMaterialSGIX");
        try { Handles.MH_glFragmentColorMaterialSGIX.invokeExact(handles.PFN_glFragmentColorMaterialSGIX, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentColorMaterialSGIX", e); }
    }

    public void FragmentLightfSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightfSGIX");
        try { Handles.MH_glFragmentLightfSGIX.invokeExact(handles.PFN_glFragmentLightfSGIX, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightfSGIX", e); }
    }

    public void FragmentLightfvSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightfvSGIX");
        try { Handles.MH_glFragmentLightfvSGIX.invokeExact(handles.PFN_glFragmentLightfvSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightfvSGIX", e); }
    }

    public void FragmentLightiSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightiSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightiSGIX");
        try { Handles.MH_glFragmentLightiSGIX.invokeExact(handles.PFN_glFragmentLightiSGIX, light, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightiSGIX", e); }
    }

    public void FragmentLightivSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightivSGIX");
        try { Handles.MH_glFragmentLightivSGIX.invokeExact(handles.PFN_glFragmentLightivSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightivSGIX", e); }
    }

    public void FragmentLightModelfSGIX(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightModelfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelfSGIX");
        try { Handles.MH_glFragmentLightModelfSGIX.invokeExact(handles.PFN_glFragmentLightModelfSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModelfSGIX", e); }
    }

    public void FragmentLightModelfvSGIX(@CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightModelfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelfvSGIX");
        try { Handles.MH_glFragmentLightModelfvSGIX.invokeExact(handles.PFN_glFragmentLightModelfvSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModelfvSGIX", e); }
    }

    public void FragmentLightModeliSGIX(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightModeliSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModeliSGIX");
        try { Handles.MH_glFragmentLightModeliSGIX.invokeExact(handles.PFN_glFragmentLightModeliSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModeliSGIX", e); }
    }

    public void FragmentLightModelivSGIX(@CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentLightModelivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentLightModelivSGIX");
        try { Handles.MH_glFragmentLightModelivSGIX.invokeExact(handles.PFN_glFragmentLightModelivSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentLightModelivSGIX", e); }
    }

    public void FragmentMaterialfSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentMaterialfSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialfSGIX");
        try { Handles.MH_glFragmentMaterialfSGIX.invokeExact(handles.PFN_glFragmentMaterialfSGIX, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialfSGIX", e); }
    }

    public void FragmentMaterialfvSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentMaterialfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialfvSGIX");
        try { Handles.MH_glFragmentMaterialfvSGIX.invokeExact(handles.PFN_glFragmentMaterialfvSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialfvSGIX", e); }
    }

    public void FragmentMaterialiSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentMaterialiSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialiSGIX");
        try { Handles.MH_glFragmentMaterialiSGIX.invokeExact(handles.PFN_glFragmentMaterialiSGIX, face, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialiSGIX", e); }
    }

    public void FragmentMaterialivSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glFragmentMaterialivSGIX)) throw new SymbolNotFoundError("Symbol not found: glFragmentMaterialivSGIX");
        try { Handles.MH_glFragmentMaterialivSGIX.invokeExact(handles.PFN_glFragmentMaterialivSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glFragmentMaterialivSGIX", e); }
    }

    public void GetFragmentLightfvSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFragmentLightfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentLightfvSGIX");
        try { Handles.MH_glGetFragmentLightfvSGIX.invokeExact(handles.PFN_glGetFragmentLightfvSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentLightfvSGIX", e); }
    }

    public void GetFragmentLightivSGIX(@CType("GLenum") int light, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFragmentLightivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentLightivSGIX");
        try { Handles.MH_glGetFragmentLightivSGIX.invokeExact(handles.PFN_glGetFragmentLightivSGIX, light, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentLightivSGIX", e); }
    }

    public void GetFragmentMaterialfvSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFragmentMaterialfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentMaterialfvSGIX");
        try { Handles.MH_glGetFragmentMaterialfvSGIX.invokeExact(handles.PFN_glGetFragmentMaterialfvSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentMaterialfvSGIX", e); }
    }

    public void GetFragmentMaterialivSGIX(@CType("GLenum") int face, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFragmentMaterialivSGIX)) throw new SymbolNotFoundError("Symbol not found: glGetFragmentMaterialivSGIX");
        try { Handles.MH_glGetFragmentMaterialivSGIX.invokeExact(handles.PFN_glGetFragmentMaterialivSGIX, face, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragmentMaterialivSGIX", e); }
    }

    public void LightEnviSGIX(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glLightEnviSGIX)) throw new SymbolNotFoundError("Symbol not found: glLightEnviSGIX");
        try { Handles.MH_glLightEnviSGIX.invokeExact(handles.PFN_glLightEnviSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glLightEnviSGIX", e); }
    }

}
