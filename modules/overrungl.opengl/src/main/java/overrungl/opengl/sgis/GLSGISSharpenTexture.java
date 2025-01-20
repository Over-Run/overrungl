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

public final class GLSGISSharpenTexture {
    public static final int GL_LINEAR_SHARPEN_SGIS = 0x80AD;
    public static final int GL_LINEAR_SHARPEN_ALPHA_SGIS = 0x80AE;
    public static final int GL_LINEAR_SHARPEN_COLOR_SGIS = 0x80AF;
    public static final int GL_SHARPEN_TEXTURE_FUNC_POINTS_SGIS = 0x80B0;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glSharpenTexFuncSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSharpenTexFuncSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glSharpenTexFuncSGIS = RuntimeHelper.downcall(Descriptors.FD_glSharpenTexFuncSGIS);
        public static final MethodHandle MH_glGetSharpenTexFuncSGIS = RuntimeHelper.downcall(Descriptors.FD_glGetSharpenTexFuncSGIS);
        public final MemorySegment PFN_glSharpenTexFuncSGIS;
        public final MemorySegment PFN_glGetSharpenTexFuncSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSharpenTexFuncSGIS = func.invoke("glSharpenTexFuncSGIS");
            PFN_glGetSharpenTexFuncSGIS = func.invoke("glGetSharpenTexFuncSGIS");
        }
    }

    public GLSGISSharpenTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void SharpenTexFuncSGIS(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("const GLfloat *") java.lang.foreign.MemorySegment points) {
        if (Unmarshal.isNullPointer(handles.PFN_glSharpenTexFuncSGIS)) throw new SymbolNotFoundError("Symbol not found: glSharpenTexFuncSGIS");
        try { Handles.MH_glSharpenTexFuncSGIS.invokeExact(handles.PFN_glSharpenTexFuncSGIS, target, n, points); }
        catch (Throwable e) { throw new RuntimeException("error in glSharpenTexFuncSGIS", e); }
    }

    public void GetSharpenTexFuncSGIS(@CType("GLenum") int target, @CType("GLfloat *") java.lang.foreign.MemorySegment points) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSharpenTexFuncSGIS)) throw new SymbolNotFoundError("Symbol not found: glGetSharpenTexFuncSGIS");
        try { Handles.MH_glGetSharpenTexFuncSGIS.invokeExact(handles.PFN_glGetSharpenTexFuncSGIS, target, points); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSharpenTexFuncSGIS", e); }
    }

}
