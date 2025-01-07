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
    public static final MethodHandle MH_glViewportArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glViewportArrayv;
    public static final MethodHandle MH_glViewportIndexedf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glViewportIndexedf;
    public static final MethodHandle MH_glViewportIndexedfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glViewportIndexedfv;
    public static final MethodHandle MH_glScissorArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glScissorArrayv;
    public static final MethodHandle MH_glScissorIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glScissorIndexed;
    public static final MethodHandle MH_glScissorIndexedv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glScissorIndexedv;
    public static final MethodHandle MH_glDepthRangeArrayv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDepthRangeArrayv;
    public static final MethodHandle MH_glDepthRangeIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glDepthRangeIndexed;
    public static final MethodHandle MH_glGetFloati_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFloati_v;
    public static final MethodHandle MH_glGetDoublei_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetDoublei_v;
    public static final MethodHandle MH_glDepthRangeArraydvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDepthRangeArraydvNV;
    public static final MethodHandle MH_glDepthRangeIndexeddNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glDepthRangeIndexeddNV;

    public GLARBViewportArray(overrungl.opengl.GLLoadFunc func) {
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

    public void ViewportArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glViewportArrayv)) { try {
            MH_glViewportArrayv.invokeExact(PFN_glViewportArrayv, first, count, v);
        } catch (Throwable e) { throw new RuntimeException("error in glViewportArrayv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glViewportArrayv"); }
    }

    public void ViewportIndexedf(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float w, @CType("GLfloat") float h) {
        if (!Unmarshal.isNullPointer(PFN_glViewportIndexedf)) { try {
            MH_glViewportIndexedf.invokeExact(PFN_glViewportIndexedf, index, x, y, w, h);
        } catch (Throwable e) { throw new RuntimeException("error in glViewportIndexedf", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glViewportIndexedf"); }
    }

    public void ViewportIndexedfv(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glViewportIndexedfv)) { try {
            MH_glViewportIndexedfv.invokeExact(PFN_glViewportIndexedfv, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glViewportIndexedfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glViewportIndexedfv"); }
    }

    public void ScissorArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glScissorArrayv)) { try {
            MH_glScissorArrayv.invokeExact(PFN_glScissorArrayv, first, count, v);
        } catch (Throwable e) { throw new RuntimeException("error in glScissorArrayv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glScissorArrayv"); }
    }

    public void ScissorIndexed(@CType("GLuint") int index, @CType("GLint") int left, @CType("GLint") int bottom, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glScissorIndexed)) { try {
            MH_glScissorIndexed.invokeExact(PFN_glScissorIndexed, index, left, bottom, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glScissorIndexed", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glScissorIndexed"); }
    }

    public void ScissorIndexedv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glScissorIndexedv)) { try {
            MH_glScissorIndexedv.invokeExact(PFN_glScissorIndexedv, index, v);
        } catch (Throwable e) { throw new RuntimeException("error in glScissorIndexedv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glScissorIndexedv"); }
    }

    public void DepthRangeArrayv(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glDepthRangeArrayv)) { try {
            MH_glDepthRangeArrayv.invokeExact(PFN_glDepthRangeArrayv, first, count, v);
        } catch (Throwable e) { throw new RuntimeException("error in glDepthRangeArrayv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDepthRangeArrayv"); }
    }

    public void DepthRangeIndexed(@CType("GLuint") int index, @CType("GLdouble") double n, @CType("GLdouble") double f) {
        if (!Unmarshal.isNullPointer(PFN_glDepthRangeIndexed)) { try {
            MH_glDepthRangeIndexed.invokeExact(PFN_glDepthRangeIndexed, index, n, f);
        } catch (Throwable e) { throw new RuntimeException("error in glDepthRangeIndexed", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDepthRangeIndexed"); }
    }

    public void GetFloati_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetFloati_v)) { try {
            MH_glGetFloati_v.invokeExact(PFN_glGetFloati_v, target, index, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFloati_v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFloati_v"); }
    }

    public void GetDoublei_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetDoublei_v)) { try {
            MH_glGetDoublei_v.invokeExact(PFN_glGetDoublei_v, target, index, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetDoublei_v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetDoublei_v"); }
    }

    public void DepthRangeArraydvNV(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glDepthRangeArraydvNV)) { try {
            MH_glDepthRangeArraydvNV.invokeExact(PFN_glDepthRangeArraydvNV, first, count, v);
        } catch (Throwable e) { throw new RuntimeException("error in glDepthRangeArraydvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDepthRangeArraydvNV"); }
    }

    public void DepthRangeIndexeddNV(@CType("GLuint") int index, @CType("GLdouble") double n, @CType("GLdouble") double f) {
        if (!Unmarshal.isNullPointer(PFN_glDepthRangeIndexeddNV)) { try {
            MH_glDepthRangeIndexeddNV.invokeExact(PFN_glDepthRangeIndexeddNV, index, n, f);
        } catch (Throwable e) { throw new RuntimeException("error in glDepthRangeIndexeddNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDepthRangeIndexeddNV"); }
    }

}
