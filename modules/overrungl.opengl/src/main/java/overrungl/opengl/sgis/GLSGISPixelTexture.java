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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISPixelTexture {
    public static final int GL_PIXEL_TEXTURE_SGIS = 0x8353;
    public static final int GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS = 0x8354;
    public static final int GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS = 0x8355;
    public static final int GL_PIXEL_GROUP_COLOR_SGIS = 0x8356;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPixelTexGenParameteriSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPixelTexGenParameterivSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPixelTexGenParameterfSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glPixelTexGenParameterfvSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPixelTexGenParameterivSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPixelTexGenParameterfvSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glPixelTexGenParameteriSGIS = RuntimeHelper.downcall(Descriptors.FD_glPixelTexGenParameteriSGIS);
        public static final MethodHandle MH_glPixelTexGenParameterivSGIS = RuntimeHelper.downcall(Descriptors.FD_glPixelTexGenParameterivSGIS);
        public static final MethodHandle MH_glPixelTexGenParameterfSGIS = RuntimeHelper.downcall(Descriptors.FD_glPixelTexGenParameterfSGIS);
        public static final MethodHandle MH_glPixelTexGenParameterfvSGIS = RuntimeHelper.downcall(Descriptors.FD_glPixelTexGenParameterfvSGIS);
        public static final MethodHandle MH_glGetPixelTexGenParameterivSGIS = RuntimeHelper.downcall(Descriptors.FD_glGetPixelTexGenParameterivSGIS);
        public static final MethodHandle MH_glGetPixelTexGenParameterfvSGIS = RuntimeHelper.downcall(Descriptors.FD_glGetPixelTexGenParameterfvSGIS);
        public final MemorySegment PFN_glPixelTexGenParameteriSGIS;
        public final MemorySegment PFN_glPixelTexGenParameterivSGIS;
        public final MemorySegment PFN_glPixelTexGenParameterfSGIS;
        public final MemorySegment PFN_glPixelTexGenParameterfvSGIS;
        public final MemorySegment PFN_glGetPixelTexGenParameterivSGIS;
        public final MemorySegment PFN_glGetPixelTexGenParameterfvSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPixelTexGenParameteriSGIS = func.invoke("glPixelTexGenParameteriSGIS");
            PFN_glPixelTexGenParameterivSGIS = func.invoke("glPixelTexGenParameterivSGIS");
            PFN_glPixelTexGenParameterfSGIS = func.invoke("glPixelTexGenParameterfSGIS");
            PFN_glPixelTexGenParameterfvSGIS = func.invoke("glPixelTexGenParameterfvSGIS");
            PFN_glGetPixelTexGenParameterivSGIS = func.invoke("glGetPixelTexGenParameterivSGIS");
            PFN_glGetPixelTexGenParameterfvSGIS = func.invoke("glGetPixelTexGenParameterfvSGIS");
        }
    }

    public GLSGISPixelTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PixelTexGenParameteriSGIS(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTexGenParameteriSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameteriSGIS");
        try { Handles.MH_glPixelTexGenParameteriSGIS.invokeExact(handles.PFN_glPixelTexGenParameteriSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTexGenParameteriSGIS", e); }
    }

    public void PixelTexGenParameterivSGIS(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTexGenParameterivSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameterivSGIS");
        try { Handles.MH_glPixelTexGenParameterivSGIS.invokeExact(handles.PFN_glPixelTexGenParameterivSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTexGenParameterivSGIS", e); }
    }

    public void PixelTexGenParameterfSGIS(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTexGenParameterfSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameterfSGIS");
        try { Handles.MH_glPixelTexGenParameterfSGIS.invokeExact(handles.PFN_glPixelTexGenParameterfSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTexGenParameterfSGIS", e); }
    }

    public void PixelTexGenParameterfvSGIS(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTexGenParameterfvSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameterfvSGIS");
        try { Handles.MH_glPixelTexGenParameterfvSGIS.invokeExact(handles.PFN_glPixelTexGenParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTexGenParameterfvSGIS", e); }
    }

    public void GetPixelTexGenParameterivSGIS(@CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPixelTexGenParameterivSGIS)) throw new SymbolNotFoundError("Symbol not found: glGetPixelTexGenParameterivSGIS");
        try { Handles.MH_glGetPixelTexGenParameterivSGIS.invokeExact(handles.PFN_glGetPixelTexGenParameterivSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPixelTexGenParameterivSGIS", e); }
    }

    public void GetPixelTexGenParameterfvSGIS(@CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPixelTexGenParameterfvSGIS)) throw new SymbolNotFoundError("Symbol not found: glGetPixelTexGenParameterfvSGIS");
        try { Handles.MH_glGetPixelTexGenParameterfvSGIS.invokeExact(handles.PFN_glGetPixelTexGenParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPixelTexGenParameterfvSGIS", e); }
    }

}
