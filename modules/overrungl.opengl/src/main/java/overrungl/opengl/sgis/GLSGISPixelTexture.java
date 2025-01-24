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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISPixelTexture {
    public static final int GL_PIXEL_TEXTURE_SGIS = 0x8353;
    public static final int GL_PIXEL_FRAGMENT_RGB_SOURCE_SGIS = 0x8354;
    public static final int GL_PIXEL_FRAGMENT_ALPHA_SOURCE_SGIS = 0x8355;
    public static final int GL_PIXEL_GROUP_COLOR_SGIS = 0x8356;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPixelTexGenParameteriSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPixelTexGenParameterivSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPixelTexGenParameterfSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glPixelTexGenParameterfvSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPixelTexGenParameterivSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPixelTexGenParameterfvSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    /// ```
    /// void glPixelTexGenParameteriSGIS(unsigned int pname, int param);
    /// ```
    public void PixelTexGenParameteriSGIS(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameteriSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameteriSGIS");
        try { Handles.MH_glPixelTexGenParameteriSGIS.invokeExact(handles.PFN_glPixelTexGenParameteriSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameteriSGIS", e); }
    }

    /// ```
    /// void glPixelTexGenParameterivSGIS(unsigned int pname, const GLint* params);
    /// ```
    public void PixelTexGenParameterivSGIS(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameterivSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameterivSGIS");
        try { Handles.MH_glPixelTexGenParameterivSGIS.invokeExact(handles.PFN_glPixelTexGenParameterivSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameterivSGIS", e); }
    }

    /// ```
    /// void glPixelTexGenParameterfSGIS(unsigned int pname, float param);
    /// ```
    public void PixelTexGenParameterfSGIS(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameterfSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameterfSGIS");
        try { Handles.MH_glPixelTexGenParameterfSGIS.invokeExact(handles.PFN_glPixelTexGenParameterfSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameterfSGIS", e); }
    }

    /// ```
    /// void glPixelTexGenParameterfvSGIS(unsigned int pname, const GLfloat* params);
    /// ```
    public void PixelTexGenParameterfvSGIS(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPixelTexGenParameterfvSGIS)) throw new SymbolNotFoundError("Symbol not found: glPixelTexGenParameterfvSGIS");
        try { Handles.MH_glPixelTexGenParameterfvSGIS.invokeExact(handles.PFN_glPixelTexGenParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PixelTexGenParameterfvSGIS", e); }
    }

    /// ```
    /// void glGetPixelTexGenParameterivSGIS(unsigned int pname, GLint* params);
    /// ```
    public void GetPixelTexGenParameterivSGIS(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelTexGenParameterivSGIS)) throw new SymbolNotFoundError("Symbol not found: glGetPixelTexGenParameterivSGIS");
        try { Handles.MH_glGetPixelTexGenParameterivSGIS.invokeExact(handles.PFN_glGetPixelTexGenParameterivSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelTexGenParameterivSGIS", e); }
    }

    /// ```
    /// void glGetPixelTexGenParameterfvSGIS(unsigned int pname, GLfloat* params);
    /// ```
    public void GetPixelTexGenParameterfvSGIS(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPixelTexGenParameterfvSGIS)) throw new SymbolNotFoundError("Symbol not found: glGetPixelTexGenParameterfvSGIS");
        try { Handles.MH_glGetPixelTexGenParameterfvSGIS.invokeExact(handles.PFN_glGetPixelTexGenParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPixelTexGenParameterfvSGIS", e); }
    }

}
