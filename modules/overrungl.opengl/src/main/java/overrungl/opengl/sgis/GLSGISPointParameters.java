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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISPointParameters {
    public static final int GL_POINT_SIZE_MIN_SGIS = 0x8126;
    public static final int GL_POINT_SIZE_MAX_SGIS = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_SGIS = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_SGIS = 0x8129;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPointParameterfSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glPointParameterfvSGIS = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glPointParameterfSGIS,
            FD_glPointParameterfvSGIS
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glPointParameterfSGIS = RuntimeHelper.downcall(Descriptors.FD_glPointParameterfSGIS);
        public static final MethodHandle MH_glPointParameterfvSGIS = RuntimeHelper.downcall(Descriptors.FD_glPointParameterfvSGIS);
        public final MemorySegment PFN_glPointParameterfSGIS;
        public final MemorySegment PFN_glPointParameterfvSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPointParameterfSGIS = func.invoke("glPointParameterfSGIS", "glPointParameterf");
            PFN_glPointParameterfvSGIS = func.invoke("glPointParameterfvSGIS", "glPointParameterfv");
        }
    }

    public GLSGISPointParameters(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PointParameterfSGIS(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterfSGIS)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfSGIS");
        try { Handles.MH_glPointParameterfSGIS.invokeExact(handles.PFN_glPointParameterfSGIS, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfSGIS", e); }
    }

    public void PointParameterfvSGIS(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterfvSGIS)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfvSGIS");
        try { Handles.MH_glPointParameterfvSGIS.invokeExact(handles.PFN_glPointParameterfvSGIS, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfvSGIS", e); }
    }

}
