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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVPointSprite {
    public static final int GL_POINT_SPRITE_NV = 0x8861;
    public static final int GL_COORD_REPLACE_NV = 0x8862;
    public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPointParameteriNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPointParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPointParameteriNV;
        public final MemorySegment PFN_glPointParameterivNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPointParameteriNV = func.invoke("glPointParameteriNV", "glPointParameteri");
            PFN_glPointParameterivNV = func.invoke("glPointParameterivNV", "glPointParameteriv");
        }
    }

    public GLNVPointSprite(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glPointParameteriNV(unsigned int pname, int param);
    /// ```
    public void PointParameteriNV(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameteriNV)) throw new SymbolNotFoundError("Symbol not found: glPointParameteriNV");
        try { Handles.MH_glPointParameteriNV.invokeExact(handles.PFN_glPointParameteriNV, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameteriNV", e); }
    }

    /// ```
    /// void glPointParameterivNV(unsigned int pname, const GLint* params);
    /// ```
    public void PointParameterivNV(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPointParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glPointParameterivNV");
        try { Handles.MH_glPointParameterivNV.invokeExact(handles.PFN_glPointParameterivNV, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in PointParameterivNV", e); }
    }

}
