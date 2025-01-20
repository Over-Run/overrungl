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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTFogCoord {
    public static final int GL_FOG_COORDINATE_SOURCE_EXT = 0x8450;
    public static final int GL_FOG_COORDINATE_EXT = 0x8451;
    public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE_EXT = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY_EXT = 0x8457;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFogCoordfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glFogCoordfvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFogCoorddEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glFogCoorddvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFogCoordPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glFogCoordfEXT,
            FD_glFogCoordfvEXT,
            FD_glFogCoorddEXT,
            FD_glFogCoorddvEXT,
            FD_glFogCoordPointerEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glFogCoordfEXT = RuntimeHelper.downcall(Descriptors.FD_glFogCoordfEXT);
        public static final MethodHandle MH_glFogCoordfvEXT = RuntimeHelper.downcall(Descriptors.FD_glFogCoordfvEXT);
        public static final MethodHandle MH_glFogCoorddEXT = RuntimeHelper.downcall(Descriptors.FD_glFogCoorddEXT);
        public static final MethodHandle MH_glFogCoorddvEXT = RuntimeHelper.downcall(Descriptors.FD_glFogCoorddvEXT);
        public static final MethodHandle MH_glFogCoordPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glFogCoordPointerEXT);
        public final MemorySegment PFN_glFogCoordfEXT;
        public final MemorySegment PFN_glFogCoordfvEXT;
        public final MemorySegment PFN_glFogCoorddEXT;
        public final MemorySegment PFN_glFogCoorddvEXT;
        public final MemorySegment PFN_glFogCoordPointerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFogCoordfEXT = func.invoke("glFogCoordfEXT", "glFogCoordf");
            PFN_glFogCoordfvEXT = func.invoke("glFogCoordfvEXT", "glFogCoordfv");
            PFN_glFogCoorddEXT = func.invoke("glFogCoorddEXT", "glFogCoordd");
            PFN_glFogCoorddvEXT = func.invoke("glFogCoorddvEXT", "glFogCoorddv");
            PFN_glFogCoordPointerEXT = func.invoke("glFogCoordPointerEXT", "glFogCoordPointer");
        }
    }

    public GLEXTFogCoord(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void FogCoordfEXT(@CType("GLfloat") float coord) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoordfEXT)) throw new SymbolNotFoundError("Symbol not found: glFogCoordfEXT");
        try { Handles.MH_glFogCoordfEXT.invokeExact(handles.PFN_glFogCoordfEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoordfEXT", e); }
    }

    public void FogCoordfvEXT(@CType("const GLfloat *") java.lang.foreign.MemorySegment coord) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoordfvEXT)) throw new SymbolNotFoundError("Symbol not found: glFogCoordfvEXT");
        try { Handles.MH_glFogCoordfvEXT.invokeExact(handles.PFN_glFogCoordfvEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoordfvEXT", e); }
    }

    public void FogCoorddEXT(@CType("GLdouble") double coord) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoorddEXT)) throw new SymbolNotFoundError("Symbol not found: glFogCoorddEXT");
        try { Handles.MH_glFogCoorddEXT.invokeExact(handles.PFN_glFogCoorddEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoorddEXT", e); }
    }

    public void FogCoorddvEXT(@CType("const GLdouble *") java.lang.foreign.MemorySegment coord) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoorddvEXT)) throw new SymbolNotFoundError("Symbol not found: glFogCoorddvEXT");
        try { Handles.MH_glFogCoorddvEXT.invokeExact(handles.PFN_glFogCoorddvEXT, coord); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoorddvEXT", e); }
    }

    public void FogCoordPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoordPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glFogCoordPointerEXT");
        try { Handles.MH_glFogCoordPointerEXT.invokeExact(handles.PFN_glFogCoordPointerEXT, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoordPointerEXT", e); }
    }

}
