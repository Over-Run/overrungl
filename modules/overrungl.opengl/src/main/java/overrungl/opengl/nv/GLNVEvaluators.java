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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVEvaluators {
    public static final int GL_EVAL_2D_NV = 0x86C0;
    public static final int GL_EVAL_TRIANGULAR_2D_NV = 0x86C1;
    public static final int GL_MAP_TESSELLATION_NV = 0x86C2;
    public static final int GL_MAP_ATTRIB_U_ORDER_NV = 0x86C3;
    public static final int GL_MAP_ATTRIB_V_ORDER_NV = 0x86C4;
    public static final int GL_EVAL_FRACTIONAL_TESSELLATION_NV = 0x86C5;
    public static final int GL_EVAL_VERTEX_ATTRIB0_NV = 0x86C6;
    public static final int GL_EVAL_VERTEX_ATTRIB1_NV = 0x86C7;
    public static final int GL_EVAL_VERTEX_ATTRIB2_NV = 0x86C8;
    public static final int GL_EVAL_VERTEX_ATTRIB3_NV = 0x86C9;
    public static final int GL_EVAL_VERTEX_ATTRIB4_NV = 0x86CA;
    public static final int GL_EVAL_VERTEX_ATTRIB5_NV = 0x86CB;
    public static final int GL_EVAL_VERTEX_ATTRIB6_NV = 0x86CC;
    public static final int GL_EVAL_VERTEX_ATTRIB7_NV = 0x86CD;
    public static final int GL_EVAL_VERTEX_ATTRIB8_NV = 0x86CE;
    public static final int GL_EVAL_VERTEX_ATTRIB9_NV = 0x86CF;
    public static final int GL_EVAL_VERTEX_ATTRIB10_NV = 0x86D0;
    public static final int GL_EVAL_VERTEX_ATTRIB11_NV = 0x86D1;
    public static final int GL_EVAL_VERTEX_ATTRIB12_NV = 0x86D2;
    public static final int GL_EVAL_VERTEX_ATTRIB13_NV = 0x86D3;
    public static final int GL_EVAL_VERTEX_ATTRIB14_NV = 0x86D4;
    public static final int GL_EVAL_VERTEX_ATTRIB15_NV = 0x86D5;
    public static final int GL_MAX_MAP_TESSELLATION_NV = 0x86D6;
    public static final int GL_MAX_RATIONAL_EVAL_ORDER_NV = 0x86D7;
    public static final MethodHandle MH_glMapControlPointsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMapControlPointsNV;
    public static final MethodHandle MH_glMapParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMapParameterivNV;
    public static final MethodHandle MH_glMapParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMapParameterfvNV;
    public static final MethodHandle MH_glGetMapControlPointsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMapControlPointsNV;
    public static final MethodHandle MH_glGetMapParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMapParameterivNV;
    public static final MethodHandle MH_glGetMapParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMapParameterfvNV;
    public static final MethodHandle MH_glGetMapAttribParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMapAttribParameterivNV;
    public static final MethodHandle MH_glGetMapAttribParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMapAttribParameterfvNV;
    public static final MethodHandle MH_glEvalMapsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEvalMapsNV;

    public GLNVEvaluators(overrungl.opengl.GLLoadFunc func) {
        PFN_glMapControlPointsNV = func.invoke("glMapControlPointsNV");
        PFN_glMapParameterivNV = func.invoke("glMapParameterivNV");
        PFN_glMapParameterfvNV = func.invoke("glMapParameterfvNV");
        PFN_glGetMapControlPointsNV = func.invoke("glGetMapControlPointsNV");
        PFN_glGetMapParameterivNV = func.invoke("glGetMapParameterivNV");
        PFN_glGetMapParameterfvNV = func.invoke("glGetMapParameterfvNV");
        PFN_glGetMapAttribParameterivNV = func.invoke("glGetMapAttribParameterivNV");
        PFN_glGetMapAttribParameterfvNV = func.invoke("glGetMapAttribParameterfvNV");
        PFN_glEvalMapsNV = func.invoke("glEvalMapsNV");
    }

    public void MapControlPointsNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int type, @CType("GLsizei") int ustride, @CType("GLsizei") int vstride, @CType("GLint") int uorder, @CType("GLint") int vorder, @CType("GLboolean") boolean packed, @CType("const void *") java.lang.foreign.MemorySegment points) {
        if (!Unmarshal.isNullPointer(PFN_glMapControlPointsNV)) { try {
            MH_glMapControlPointsNV.invokeExact(PFN_glMapControlPointsNV, target, index, type, ustride, vstride, uorder, vorder, packed, points);
        } catch (Throwable e) { throw new RuntimeException("error in glMapControlPointsNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapControlPointsNV"); }
    }

    public void MapParameterivNV(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glMapParameterivNV)) { try {
            MH_glMapParameterivNV.invokeExact(PFN_glMapParameterivNV, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glMapParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapParameterivNV"); }
    }

    public void MapParameterfvNV(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glMapParameterfvNV)) { try {
            MH_glMapParameterfvNV.invokeExact(PFN_glMapParameterfvNV, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glMapParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapParameterfvNV"); }
    }

    public void GetMapControlPointsNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int type, @CType("GLsizei") int ustride, @CType("GLsizei") int vstride, @CType("GLboolean") boolean packed, @CType("void*") java.lang.foreign.MemorySegment points) {
        if (!Unmarshal.isNullPointer(PFN_glGetMapControlPointsNV)) { try {
            MH_glGetMapControlPointsNV.invokeExact(PFN_glGetMapControlPointsNV, target, index, type, ustride, vstride, packed, points);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMapControlPointsNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMapControlPointsNV"); }
    }

    public void GetMapParameterivNV(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetMapParameterivNV)) { try {
            MH_glGetMapParameterivNV.invokeExact(PFN_glGetMapParameterivNV, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMapParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMapParameterivNV"); }
    }

    public void GetMapParameterfvNV(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetMapParameterfvNV)) { try {
            MH_glGetMapParameterfvNV.invokeExact(PFN_glGetMapParameterfvNV, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMapParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMapParameterfvNV"); }
    }

    public void GetMapAttribParameterivNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetMapAttribParameterivNV)) { try {
            MH_glGetMapAttribParameterivNV.invokeExact(PFN_glGetMapAttribParameterivNV, target, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMapAttribParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMapAttribParameterivNV"); }
    }

    public void GetMapAttribParameterfvNV(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetMapAttribParameterfvNV)) { try {
            MH_glGetMapAttribParameterfvNV.invokeExact(PFN_glGetMapAttribParameterfvNV, target, index, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetMapAttribParameterfvNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetMapAttribParameterfvNV"); }
    }

    public void EvalMapsNV(@CType("GLenum") int target, @CType("GLenum") int mode) {
        if (!Unmarshal.isNullPointer(PFN_glEvalMapsNV)) { try {
            MH_glEvalMapsNV.invokeExact(PFN_glEvalMapsNV, target, mode);
        } catch (Throwable e) { throw new RuntimeException("error in glEvalMapsNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEvalMapsNV"); }
    }

}
