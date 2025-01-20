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

public final class GLSGISDetailTexture {
    public static final int GL_DETAIL_TEXTURE_2D_SGIS = 0x8095;
    public static final int GL_DETAIL_TEXTURE_2D_BINDING_SGIS = 0x8096;
    public static final int GL_LINEAR_DETAIL_SGIS = 0x8097;
    public static final int GL_LINEAR_DETAIL_ALPHA_SGIS = 0x8098;
    public static final int GL_LINEAR_DETAIL_COLOR_SGIS = 0x8099;
    public static final int GL_DETAIL_TEXTURE_LEVEL_SGIS = 0x809A;
    public static final int GL_DETAIL_TEXTURE_MODE_SGIS = 0x809B;
    public static final int GL_DETAIL_TEXTURE_FUNC_POINTS_SGIS = 0x809C;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDetailTexFuncSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetDetailTexFuncSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDetailTexFuncSGIS = RuntimeHelper.downcall(Descriptors.FD_glDetailTexFuncSGIS);
        public static final MethodHandle MH_glGetDetailTexFuncSGIS = RuntimeHelper.downcall(Descriptors.FD_glGetDetailTexFuncSGIS);
        public final MemorySegment PFN_glDetailTexFuncSGIS;
        public final MemorySegment PFN_glGetDetailTexFuncSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDetailTexFuncSGIS = func.invoke("glDetailTexFuncSGIS");
            PFN_glGetDetailTexFuncSGIS = func.invoke("glGetDetailTexFuncSGIS");
        }
    }

    public GLSGISDetailTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DetailTexFuncSGIS(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("const GLfloat *") MemorySegment points) {
        if (Unmarshal.isNullPointer(handles.PFN_glDetailTexFuncSGIS)) throw new SymbolNotFoundError("Symbol not found: glDetailTexFuncSGIS");
        try { Handles.MH_glDetailTexFuncSGIS.invokeExact(handles.PFN_glDetailTexFuncSGIS, target, n, points); }
        catch (Throwable e) { throw new RuntimeException("error in glDetailTexFuncSGIS", e); }
    }

    public void GetDetailTexFuncSGIS(@CType("GLenum") int target, @CType("GLfloat *") MemorySegment points) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDetailTexFuncSGIS)) throw new SymbolNotFoundError("Symbol not found: glGetDetailTexFuncSGIS");
        try { Handles.MH_glGetDetailTexFuncSGIS.invokeExact(handles.PFN_glGetDetailTexFuncSGIS, target, points); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDetailTexFuncSGIS", e); }
    }

}
