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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAPPLEVertexProgramEvaluators {
    public static final int GL_VERTEX_ATTRIB_MAP1_APPLE = 0x8A00;
    public static final int GL_VERTEX_ATTRIB_MAP2_APPLE = 0x8A01;
    public static final int GL_VERTEX_ATTRIB_MAP1_SIZE_APPLE = 0x8A02;
    public static final int GL_VERTEX_ATTRIB_MAP1_COEFF_APPLE = 0x8A03;
    public static final int GL_VERTEX_ATTRIB_MAP1_ORDER_APPLE = 0x8A04;
    public static final int GL_VERTEX_ATTRIB_MAP1_DOMAIN_APPLE = 0x8A05;
    public static final int GL_VERTEX_ATTRIB_MAP2_SIZE_APPLE = 0x8A06;
    public static final int GL_VERTEX_ATTRIB_MAP2_COEFF_APPLE = 0x8A07;
    public static final int GL_VERTEX_ATTRIB_MAP2_ORDER_APPLE = 0x8A08;
    public static final int GL_VERTEX_ATTRIB_MAP2_DOMAIN_APPLE = 0x8A09;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glEnableVertexAttribAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexAttribAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsVertexAttribEnabledAPPLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMapVertexAttrib1dAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapVertexAttrib1fAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapVertexAttrib2dAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapVertexAttrib2fAPPLE = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glEnableVertexAttribAPPLE;
        public final MemorySegment PFN_glDisableVertexAttribAPPLE;
        public final MemorySegment PFN_glIsVertexAttribEnabledAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib1dAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib1fAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib2dAPPLE;
        public final MemorySegment PFN_glMapVertexAttrib2fAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glEnableVertexAttribAPPLE = func.invoke("glEnableVertexAttribAPPLE");
            PFN_glDisableVertexAttribAPPLE = func.invoke("glDisableVertexAttribAPPLE");
            PFN_glIsVertexAttribEnabledAPPLE = func.invoke("glIsVertexAttribEnabledAPPLE");
            PFN_glMapVertexAttrib1dAPPLE = func.invoke("glMapVertexAttrib1dAPPLE");
            PFN_glMapVertexAttrib1fAPPLE = func.invoke("glMapVertexAttrib1fAPPLE");
            PFN_glMapVertexAttrib2dAPPLE = func.invoke("glMapVertexAttrib2dAPPLE");
            PFN_glMapVertexAttrib2fAPPLE = func.invoke("glMapVertexAttrib2fAPPLE");
        }
    }

    public GLAPPLEVertexProgramEvaluators(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glEnableVertexAttribAPPLE((unsigned int) GLuint index, (unsigned int) GLenum pname);
    /// ```
    public void EnableVertexAttribAPPLE(int index, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexAttribAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexAttribAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVertexAttribAPPLE", index, pname); }
        Handles.MH_glEnableVertexAttribAPPLE.invokeExact(handles.PFN_glEnableVertexAttribAPPLE, index, pname); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexAttribAPPLE", e); }
    }

    /// ```
    /// void glDisableVertexAttribAPPLE((unsigned int) GLuint index, (unsigned int) GLenum pname);
    /// ```
    public void DisableVertexAttribAPPLE(int index, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexAttribAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexAttribAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVertexAttribAPPLE", index, pname); }
        Handles.MH_glDisableVertexAttribAPPLE.invokeExact(handles.PFN_glDisableVertexAttribAPPLE, index, pname); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexAttribAPPLE", e); }
    }

    /// ```
    /// GLboolean glIsVertexAttribEnabledAPPLE((unsigned int) GLuint index, (unsigned int) GLenum pname);
    /// ```
    public boolean IsVertexAttribEnabledAPPLE(int index, int pname) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexAttribEnabledAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glIsVertexAttribEnabledAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsVertexAttribEnabledAPPLE", index, pname); }
        return (((byte) Handles.MH_glIsVertexAttribEnabledAPPLE.invokeExact(handles.PFN_glIsVertexAttribEnabledAPPLE, index, pname)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexAttribEnabledAPPLE", e); }
    }

    /// ```
    /// void glMapVertexAttrib1dAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, (double) GLdouble u1, (double) GLdouble u2, (int) GLint stride, (int) GLint order, const GLdouble* points);
    /// ```
    public void MapVertexAttrib1dAPPLE(int index, int size, double u1, double u2, int stride, int order, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib1dAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib1dAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib1dAPPLE", index, size, u1, u2, stride, order, points); }
        Handles.MH_glMapVertexAttrib1dAPPLE.invokeExact(handles.PFN_glMapVertexAttrib1dAPPLE, index, size, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib1dAPPLE", e); }
    }

    /// ```
    /// void glMapVertexAttrib1fAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, ((float) khronos_float_t) GLfloat u1, ((float) khronos_float_t) GLfloat u2, (int) GLint stride, (int) GLint order, const GLfloat* points);
    /// ```
    public void MapVertexAttrib1fAPPLE(int index, int size, float u1, float u2, int stride, int order, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib1fAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib1fAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib1fAPPLE", index, size, u1, u2, stride, order, points); }
        Handles.MH_glMapVertexAttrib1fAPPLE.invokeExact(handles.PFN_glMapVertexAttrib1fAPPLE, index, size, u1, u2, stride, order, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib1fAPPLE", e); }
    }

    /// ```
    /// void glMapVertexAttrib2dAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, (double) GLdouble u1, (double) GLdouble u2, (int) GLint ustride, (int) GLint uorder, (double) GLdouble v1, (double) GLdouble v2, (int) GLint vstride, (int) GLint vorder, const GLdouble* points);
    /// ```
    public void MapVertexAttrib2dAPPLE(int index, int size, double u1, double u2, int ustride, int uorder, double v1, double v2, int vstride, int vorder, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib2dAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib2dAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib2dAPPLE", index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        Handles.MH_glMapVertexAttrib2dAPPLE.invokeExact(handles.PFN_glMapVertexAttrib2dAPPLE, index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib2dAPPLE", e); }
    }

    /// ```
    /// void glMapVertexAttrib2fAPPLE((unsigned int) GLuint index, (unsigned int) GLuint size, ((float) khronos_float_t) GLfloat u1, ((float) khronos_float_t) GLfloat u2, (int) GLint ustride, (int) GLint uorder, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, (int) GLint vstride, (int) GLint vorder, const GLfloat* points);
    /// ```
    public void MapVertexAttrib2fAPPLE(int index, int size, float u1, float u2, int ustride, int uorder, float v1, float v2, int vstride, int vorder, MemorySegment points) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapVertexAttrib2fAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMapVertexAttrib2fAPPLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapVertexAttrib2fAPPLE", index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        Handles.MH_glMapVertexAttrib2fAPPLE.invokeExact(handles.PFN_glMapVertexAttrib2fAPPLE, index, size, u1, u2, ustride, uorder, v1, v2, vstride, vorder, points); }
        catch (Throwable e) { throw new RuntimeException("error in MapVertexAttrib2fAPPLE", e); }
    }

}
