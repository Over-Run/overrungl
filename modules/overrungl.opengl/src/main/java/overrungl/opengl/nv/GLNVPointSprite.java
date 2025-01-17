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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVPointSprite {
    public static final int GL_POINT_SPRITE_NV = 0x8861;
    public static final int GL_COORD_REPLACE_NV = 0x8862;
    public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPointParameteriNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPointParameterivNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glPointParameteriNV,
            FD_glPointParameterivNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glPointParameteriNV = RuntimeHelper.downcall(Descriptors.FD_glPointParameteriNV);
        public static final MethodHandle MH_glPointParameterivNV = RuntimeHelper.downcall(Descriptors.FD_glPointParameterivNV);
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

    public void PointParameteriNV(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameteriNV)) throw new SymbolNotFoundError("Symbol not found: glPointParameteriNV");
        try { Handles.MH_glPointParameteriNV.invokeExact(handles.PFN_glPointParameteriNV, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameteriNV", e); }
    }

    public void PointParameterivNV(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glPointParameterivNV");
        try { Handles.MH_glPointParameterivNV.invokeExact(handles.PFN_glPointParameterivNV, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterivNV", e); }
    }

}
