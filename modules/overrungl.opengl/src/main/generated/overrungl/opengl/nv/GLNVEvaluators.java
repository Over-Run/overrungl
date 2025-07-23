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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMapControlPointsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMapControlPointsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMapParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMapParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMapAttribParameterivNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMapAttribParameterfvNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEvalMapsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMapControlPointsNV;
        public final MemorySegment PFN_glMapParameterivNV;
        public final MemorySegment PFN_glMapParameterfvNV;
        public final MemorySegment PFN_glGetMapControlPointsNV;
        public final MemorySegment PFN_glGetMapParameterivNV;
        public final MemorySegment PFN_glGetMapParameterfvNV;
        public final MemorySegment PFN_glGetMapAttribParameterivNV;
        public final MemorySegment PFN_glGetMapAttribParameterfvNV;
        public final MemorySegment PFN_glEvalMapsNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLNVEvaluators(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMapControlPointsNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum type, (int) GLsizei ustride, (int) GLsizei vstride, (int) GLint uorder, (int) GLint vorder, GLboolean packed, const void* points);
    /// ```
    public void MapControlPointsNV(int target, int index, int type, int ustride, int vstride, int uorder, int vorder, boolean packed, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapControlPointsNV)) throw new GLSymbolNotFoundError("Symbol not found: glMapControlPointsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapControlPointsNV", target, index, type, ustride, vstride, uorder, vorder, packed, points); }
        Handles.MH_glMapControlPointsNV.invokeExact(handles.PFN_glMapControlPointsNV, target, index, type, ustride, vstride, uorder, vorder, ((packed) ? (byte)1 : (byte)0), points); }
        catch (Throwable e) { throw new RuntimeException("error in MapControlPointsNV", e); }
    }

    /// ```
    /// void glMapParameterivNV((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void MapParameterivNV(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glMapParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapParameterivNV", target, pname, params); }
        Handles.MH_glMapParameterivNV.invokeExact(handles.PFN_glMapParameterivNV, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MapParameterivNV", e); }
    }

    /// ```
    /// void glMapParameterfvNV((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void MapParameterfvNV(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glMapParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapParameterfvNV", target, pname, params); }
        Handles.MH_glMapParameterfvNV.invokeExact(handles.PFN_glMapParameterfvNV, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MapParameterfvNV", e); }
    }

    /// ```
    /// void glGetMapControlPointsNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum type, (int) GLsizei ustride, (int) GLsizei vstride, GLboolean packed, void* points);
    /// ```
    public void GetMapControlPointsNV(int target, int index, int type, int ustride, int vstride, boolean packed, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapControlPointsNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapControlPointsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMapControlPointsNV", target, index, type, ustride, vstride, packed, points); }
        Handles.MH_glGetMapControlPointsNV.invokeExact(handles.PFN_glGetMapControlPointsNV, target, index, type, ustride, vstride, ((packed) ? (byte)1 : (byte)0), points); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapControlPointsNV", e); }
    }

    /// ```
    /// void glGetMapParameterivNV((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMapParameterivNV(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMapParameterivNV", target, pname, params); }
        Handles.MH_glGetMapParameterivNV.invokeExact(handles.PFN_glGetMapParameterivNV, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapParameterivNV", e); }
    }

    /// ```
    /// void glGetMapParameterfvNV((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMapParameterfvNV(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMapParameterfvNV", target, pname, params); }
        Handles.MH_glGetMapParameterfvNV.invokeExact(handles.PFN_glGetMapParameterfvNV, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapParameterfvNV", e); }
    }

    /// ```
    /// void glGetMapAttribParameterivNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMapAttribParameterivNV(int target, int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapAttribParameterivNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapAttribParameterivNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMapAttribParameterivNV", target, index, pname, params); }
        Handles.MH_glGetMapAttribParameterivNV.invokeExact(handles.PFN_glGetMapAttribParameterivNV, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapAttribParameterivNV", e); }
    }

    /// ```
    /// void glGetMapAttribParameterfvNV((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMapAttribParameterfvNV(int target, int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMapAttribParameterfvNV)) throw new GLSymbolNotFoundError("Symbol not found: glGetMapAttribParameterfvNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetMapAttribParameterfvNV", target, index, pname, params); }
        Handles.MH_glGetMapAttribParameterfvNV.invokeExact(handles.PFN_glGetMapAttribParameterfvNV, target, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMapAttribParameterfvNV", e); }
    }

    /// ```
    /// void glEvalMapsNV((unsigned int) GLenum target, (unsigned int) GLenum mode);
    /// ```
    public void EvalMapsNV(int target, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEvalMapsNV)) throw new GLSymbolNotFoundError("Symbol not found: glEvalMapsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEvalMapsNV", target, mode); }
        Handles.MH_glEvalMapsNV.invokeExact(handles.PFN_glEvalMapsNV, target, mode); }
        catch (Throwable e) { throw new RuntimeException("error in EvalMapsNV", e); }
    }

}
