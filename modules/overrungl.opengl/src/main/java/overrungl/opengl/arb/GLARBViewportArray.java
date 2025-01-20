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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBViewportArray {
    public static final int GL_SCISSOR_BOX = 0x0C10;
    public static final int GL_VIEWPORT = 0x0BA2;
    public static final int GL_DEPTH_RANGE = 0x0B70;
    public static final int GL_SCISSOR_TEST = 0x0C11;
    public static final int GL_MAX_VIEWPORTS = 0x825B;
    public static final int GL_VIEWPORT_SUBPIXEL_BITS = 0x825C;
    public static final int GL_VIEWPORT_BOUNDS_RANGE = 0x825D;
    public static final int GL_LAYER_PROVOKING_VERTEX = 0x825E;
    public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
    public static final int GL_UNDEFINED_VERTEX = 0x8260;
    public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
    public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
    public static final int GL_PROVOKING_VERTEX = 0x8E4F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glViewportArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glViewportIndexedf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glViewportIndexedfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glScissorArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glScissorIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glScissorIndexedv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glGetFloati_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDoublei_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeArraydvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDepthRangeIndexeddNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public final MemorySegment PFN_glViewportArrayv;
        public final MemorySegment PFN_glViewportIndexedf;
        public final MemorySegment PFN_glViewportIndexedfv;
        public final MemorySegment PFN_glScissorArrayv;
        public final MemorySegment PFN_glScissorIndexed;
        public final MemorySegment PFN_glScissorIndexedv;
        public final MemorySegment PFN_glDepthRangeArrayv;
        public final MemorySegment PFN_glDepthRangeIndexed;
        public final MemorySegment PFN_glGetFloati_v;
        public final MemorySegment PFN_glGetDoublei_v;
        public final MemorySegment PFN_glDepthRangeArraydvNV;
        public final MemorySegment PFN_glDepthRangeIndexeddNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glViewportArrayv = func.invoke("glViewportArrayv");
            PFN_glViewportIndexedf = func.invoke("glViewportIndexedf");
            PFN_glViewportIndexedfv = func.invoke("glViewportIndexedfv");
            PFN_glScissorArrayv = func.invoke("glScissorArrayv");
            PFN_glScissorIndexed = func.invoke("glScissorIndexed");
            PFN_glScissorIndexedv = func.invoke("glScissorIndexedv");
            PFN_glDepthRangeArrayv = func.invoke("glDepthRangeArrayv");
            PFN_glDepthRangeIndexed = func.invoke("glDepthRangeIndexed");
            PFN_glGetFloati_v = func.invoke("glGetFloati_v");
            PFN_glGetDoublei_v = func.invoke("glGetDoublei_v");PFN_glDepthRangeArraydvNV = func.invoke("glDepthRangeArraydvNV");
            PFN_glDepthRangeIndexeddNV = func.invoke("glDepthRangeIndexeddNV");
        }
    }

    public GLARBViewportArray(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ViewportArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glViewportArrayv)) throw new SymbolNotFoundError("Symbol not found: glViewportArrayv");
        try { Handles.MH_glViewportArrayv.invokeExact(handles.PFN_glViewportArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportArrayv", e); }
    }

    public void ViewportIndexedf(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float w, @CType("GLfloat") float h) {
        if (Unmarshal.isNullPointer(handles.PFN_glViewportIndexedf)) throw new SymbolNotFoundError("Symbol not found: glViewportIndexedf");
        try { Handles.MH_glViewportIndexedf.invokeExact(handles.PFN_glViewportIndexedf, index, x, y, w, h); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportIndexedf", e); }
    }

    public void ViewportIndexedfv(@CType("GLuint") int index, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glViewportIndexedfv)) throw new SymbolNotFoundError("Symbol not found: glViewportIndexedfv");
        try { Handles.MH_glViewportIndexedfv.invokeExact(handles.PFN_glViewportIndexedfv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportIndexedfv", e); }
    }

    public void ScissorArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorArrayv)) throw new SymbolNotFoundError("Symbol not found: glScissorArrayv");
        try { Handles.MH_glScissorArrayv.invokeExact(handles.PFN_glScissorArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorArrayv", e); }
    }

    public void ScissorIndexed(@CType("GLuint") int index, @CType("GLint") int left, @CType("GLint") int bottom, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorIndexed)) throw new SymbolNotFoundError("Symbol not found: glScissorIndexed");
        try { Handles.MH_glScissorIndexed.invokeExact(handles.PFN_glScissorIndexed, index, left, bottom, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorIndexed", e); }
    }

    public void ScissorIndexedv(@CType("GLuint") int index, @CType("const GLint *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorIndexedv)) throw new SymbolNotFoundError("Symbol not found: glScissorIndexedv");
        try { Handles.MH_glScissorIndexedv.invokeExact(handles.PFN_glScissorIndexedv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorIndexedv", e); }
    }

    public void DepthRangeArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangeArrayv)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeArrayv");
        try { Handles.MH_glDepthRangeArrayv.invokeExact(handles.PFN_glDepthRangeArrayv, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangeArrayv", e); }
    }

    public void DepthRangeIndexed(@CType("GLuint") int index, @CType("GLdouble") double n, @CType("GLdouble") double f) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangeIndexed)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeIndexed");
        try { Handles.MH_glDepthRangeIndexed.invokeExact(handles.PFN_glDepthRangeIndexed, index, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangeIndexed", e); }
    }

    public void GetFloati_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFloati_v)) throw new SymbolNotFoundError("Symbol not found: glGetFloati_v");
        try { Handles.MH_glGetFloati_v.invokeExact(handles.PFN_glGetFloati_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloati_v", e); }
    }

    public void GetDoublei_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDoublei_v)) throw new SymbolNotFoundError("Symbol not found: glGetDoublei_v");
        try { Handles.MH_glGetDoublei_v.invokeExact(handles.PFN_glGetDoublei_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoublei_v", e); }
    }

    public void DepthRangeArraydvNV(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLdouble *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangeArraydvNV)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeArraydvNV");
        try { Handles.MH_glDepthRangeArraydvNV.invokeExact(handles.PFN_glDepthRangeArraydvNV, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangeArraydvNV", e); }
    }

    public void DepthRangeIndexeddNV(@CType("GLuint") int index, @CType("GLdouble") double n, @CType("GLdouble") double f) {
        if (Unmarshal.isNullPointer(handles.PFN_glDepthRangeIndexeddNV)) throw new SymbolNotFoundError("Symbol not found: glDepthRangeIndexeddNV");
        try { Handles.MH_glDepthRangeIndexeddNV.invokeExact(handles.PFN_glDepthRangeIndexeddNV, index, n, f); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthRangeIndexeddNV", e); }
    }

}
