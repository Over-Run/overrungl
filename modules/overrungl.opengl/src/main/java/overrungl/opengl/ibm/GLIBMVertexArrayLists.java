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
package overrungl.opengl.ibm;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLIBMVertexArrayLists {
    public static final int GL_VERTEX_ARRAY_LIST_IBM = 103070;
    public static final int GL_NORMAL_ARRAY_LIST_IBM = 103071;
    public static final int GL_COLOR_ARRAY_LIST_IBM = 103072;
    public static final int GL_INDEX_ARRAY_LIST_IBM = 103073;
    public static final int GL_TEXTURE_COORD_ARRAY_LIST_IBM = 103074;
    public static final int GL_EDGE_FLAG_ARRAY_LIST_IBM = 103075;
    public static final int GL_FOG_COORDINATE_ARRAY_LIST_IBM = 103076;
    public static final int GL_SECONDARY_COLOR_ARRAY_LIST_IBM = 103077;
    public static final int GL_VERTEX_ARRAY_LIST_STRIDE_IBM = 103080;
    public static final int GL_NORMAL_ARRAY_LIST_STRIDE_IBM = 103081;
    public static final int GL_COLOR_ARRAY_LIST_STRIDE_IBM = 103082;
    public static final int GL_INDEX_ARRAY_LIST_STRIDE_IBM = 103083;
    public static final int GL_TEXTURE_COORD_ARRAY_LIST_STRIDE_IBM = 103084;
    public static final int GL_EDGE_FLAG_ARRAY_LIST_STRIDE_IBM = 103085;
    public static final int GL_FOG_COORDINATE_ARRAY_LIST_STRIDE_IBM = 103086;
    public static final int GL_SECONDARY_COLOR_ARRAY_LIST_STRIDE_IBM = 103087;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glColorPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSecondaryColorPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEdgeFlagPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFogCoordPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIndexPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNormalPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoordPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexPointerListIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glColorPointerListIBM,
            FD_glSecondaryColorPointerListIBM,
            FD_glEdgeFlagPointerListIBM,
            FD_glFogCoordPointerListIBM,
            FD_glIndexPointerListIBM,
            FD_glNormalPointerListIBM,
            FD_glTexCoordPointerListIBM,
            FD_glVertexPointerListIBM
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glColorPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glColorPointerListIBM);
        public static final MethodHandle MH_glSecondaryColorPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColorPointerListIBM);
        public static final MethodHandle MH_glEdgeFlagPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glEdgeFlagPointerListIBM);
        public static final MethodHandle MH_glFogCoordPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glFogCoordPointerListIBM);
        public static final MethodHandle MH_glIndexPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glIndexPointerListIBM);
        public static final MethodHandle MH_glNormalPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glNormalPointerListIBM);
        public static final MethodHandle MH_glTexCoordPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glTexCoordPointerListIBM);
        public static final MethodHandle MH_glVertexPointerListIBM = RuntimeHelper.downcall(Descriptors.FD_glVertexPointerListIBM);
        public final MemorySegment PFN_glColorPointerListIBM;
        public final MemorySegment PFN_glSecondaryColorPointerListIBM;
        public final MemorySegment PFN_glEdgeFlagPointerListIBM;
        public final MemorySegment PFN_glFogCoordPointerListIBM;
        public final MemorySegment PFN_glIndexPointerListIBM;
        public final MemorySegment PFN_glNormalPointerListIBM;
        public final MemorySegment PFN_glTexCoordPointerListIBM;
        public final MemorySegment PFN_glVertexPointerListIBM;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glColorPointerListIBM = func.invoke("glColorPointerListIBM");
            PFN_glSecondaryColorPointerListIBM = func.invoke("glSecondaryColorPointerListIBM");
            PFN_glEdgeFlagPointerListIBM = func.invoke("glEdgeFlagPointerListIBM");
            PFN_glFogCoordPointerListIBM = func.invoke("glFogCoordPointerListIBM");
            PFN_glIndexPointerListIBM = func.invoke("glIndexPointerListIBM");
            PFN_glNormalPointerListIBM = func.invoke("glNormalPointerListIBM");
            PFN_glTexCoordPointerListIBM = func.invoke("glTexCoordPointerListIBM");
            PFN_glVertexPointerListIBM = func.invoke("glVertexPointerListIBM");
        }
    }

    public GLIBMVertexArrayLists(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ColorPointerListIBM(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glColorPointerListIBM");
        try { Handles.MH_glColorPointerListIBM.invokeExact(handles.PFN_glColorPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glColorPointerListIBM", e); }
    }

    public void SecondaryColorPointerListIBM(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColorPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColorPointerListIBM");
        try { Handles.MH_glSecondaryColorPointerListIBM.invokeExact(handles.PFN_glSecondaryColorPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorPointerListIBM", e); }
    }

    public void EdgeFlagPointerListIBM(@CType("GLint") int stride, @CType("const GLboolean **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glEdgeFlagPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glEdgeFlagPointerListIBM");
        try { Handles.MH_glEdgeFlagPointerListIBM.invokeExact(handles.PFN_glEdgeFlagPointerListIBM, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glEdgeFlagPointerListIBM", e); }
    }

    public void FogCoordPointerListIBM(@CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glFogCoordPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glFogCoordPointerListIBM");
        try { Handles.MH_glFogCoordPointerListIBM.invokeExact(handles.PFN_glFogCoordPointerListIBM, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glFogCoordPointerListIBM", e); }
    }

    public void IndexPointerListIBM(@CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glIndexPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glIndexPointerListIBM");
        try { Handles.MH_glIndexPointerListIBM.invokeExact(handles.PFN_glIndexPointerListIBM, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexPointerListIBM", e); }
    }

    public void NormalPointerListIBM(@CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glNormalPointerListIBM");
        try { Handles.MH_glNormalPointerListIBM.invokeExact(handles.PFN_glNormalPointerListIBM, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalPointerListIBM", e); }
    }

    public void TexCoordPointerListIBM(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glTexCoordPointerListIBM");
        try { Handles.MH_glTexCoordPointerListIBM.invokeExact(handles.PFN_glTexCoordPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordPointerListIBM", e); }
    }

    public void VertexPointerListIBM(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLint") int stride, @CType("const void **") java.lang.foreign.MemorySegment pointer, @CType("GLint") int ptrstride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexPointerListIBM)) throw new SymbolNotFoundError("Symbol not found: glVertexPointerListIBM");
        try { Handles.MH_glVertexPointerListIBM.invokeExact(handles.PFN_glVertexPointerListIBM, size, type, stride, pointer, ptrstride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexPointerListIBM", e); }
    }

}
