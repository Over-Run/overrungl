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

public final class GLNVDepthBufferFloat {
    public static final int GL_DEPTH_COMPONENT32F_NV = 0x8DAB;
    public static final int GL_DEPTH32F_STENCIL8_NV = 0x8DAC;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV_NV = 0x8DAD;
    public static final int GL_DEPTH_BUFFER_FLOAT_MODE_NV = 0x8DAF;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDepthRangedNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glClearDepthdNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glDepthBoundsdNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glDepthRangedNV,
            FD_glClearDepthdNV,
            FD_glDepthBoundsdNV
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glDepthRangedNV = RuntimeHelper.downcall(Descriptors.FD_glDepthRangedNV);
        public static final MethodHandle MH_glClearDepthdNV = RuntimeHelper.downcall(Descriptors.FD_glClearDepthdNV);
        public static final MethodHandle MH_glDepthBoundsdNV = RuntimeHelper.downcall(Descriptors.FD_glDepthBoundsdNV);
        public final MemorySegment PFN_glDepthRangedNV;
        public final MemorySegment PFN_glClearDepthdNV;
        public final MemorySegment PFN_glDepthBoundsdNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDepthRangedNV = func.invoke("glDepthRangedNV");
            PFN_glClearDepthdNV = func.invoke("glClearDepthdNV");
            PFN_glDepthBoundsdNV = func.invoke("glDepthBoundsdNV");
        }
    }

    public GLNVDepthBufferFloat(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DepthRangedNV(@CType("GLdouble") double zNear, @CType("GLdouble") double zFar) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangedNV)) throw new SymbolNotFoundError("Symbol not found: glDepthRangedNV");
        try { Handles.MH_glDepthRangedNV.invokeExact(handles.PFN_glDepthRangedNV, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangedNV", e); }
    }

    public void ClearDepthdNV(@CType("GLdouble") double depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearDepthdNV)) throw new SymbolNotFoundError("Symbol not found: glClearDepthdNV");
        try { Handles.MH_glClearDepthdNV.invokeExact(handles.PFN_glClearDepthdNV, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glClearDepthdNV", e); }
    }

    public void DepthBoundsdNV(@CType("GLdouble") double zmin, @CType("GLdouble") double zmax) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthBoundsdNV)) throw new SymbolNotFoundError("Symbol not found: glDepthBoundsdNV");
        try { Handles.MH_glDepthBoundsdNV.invokeExact(handles.PFN_glDepthBoundsdNV, zmin, zmax); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthBoundsdNV", e); }
    }

}
