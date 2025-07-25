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
package overrungl.opengl.khr;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLKHRRobustness {
    public static final int GL_NO_ERROR = 0;
    public static final int GL_CONTEXT_ROBUST_ACCESS = 0x90F3;
    public static final int GL_LOSE_CONTEXT_ON_RESET = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION = 0x8261;
    public static final int GL_CONTEXT_LOST = 0x0507;
    public static final int GL_CONTEXT_ROBUST_ACCESS_KHR = 0x90F3;
    public static final int GL_LOSE_CONTEXT_ON_RESET_KHR = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_KHR = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_KHR = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_KHR = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_KHR = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_KHR = 0x8261;
    public static final int GL_CONTEXT_LOST_KHR = 0x0507;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetGraphicsResetStatus = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glReadnPixels = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetGraphicsResetStatusKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glReadnPixelsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformfvKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformivKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetnUniformuivKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetGraphicsResetStatus;
        public final MemorySegment PFN_glReadnPixels;
        public final MemorySegment PFN_glGetnUniformfv;
        public final MemorySegment PFN_glGetnUniformiv;
        public final MemorySegment PFN_glGetnUniformuiv;
        public final MemorySegment PFN_glGetGraphicsResetStatusKHR;
        public final MemorySegment PFN_glReadnPixelsKHR;
        public final MemorySegment PFN_glGetnUniformfvKHR;
        public final MemorySegment PFN_glGetnUniformivKHR;
        public final MemorySegment PFN_glGetnUniformuivKHR;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetGraphicsResetStatus = func.invoke("glGetGraphicsResetStatus");
            PFN_glReadnPixels = func.invoke("glReadnPixels");
            PFN_glGetnUniformfv = func.invoke("glGetnUniformfv");
            PFN_glGetnUniformiv = func.invoke("glGetnUniformiv");
            PFN_glGetnUniformuiv = func.invoke("glGetnUniformuiv");PFN_glGetGraphicsResetStatusKHR = func.invoke("glGetGraphicsResetStatusKHR", "glGetGraphicsResetStatus");
            PFN_glReadnPixelsKHR = func.invoke("glReadnPixelsKHR", "glReadnPixels");
            PFN_glGetnUniformfvKHR = func.invoke("glGetnUniformfvKHR", "glGetnUniformfv");
            PFN_glGetnUniformivKHR = func.invoke("glGetnUniformivKHR", "glGetnUniformiv");
            PFN_glGetnUniformuivKHR = func.invoke("glGetnUniformuivKHR", "glGetnUniformuiv");
        }
    }

    public GLKHRRobustness(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (unsigned int) GLenum glGetGraphicsResetStatus();
    /// ```
    public int GetGraphicsResetStatus() {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetGraphicsResetStatus)) throw new GLSymbolNotFoundError("Symbol not found: glGetGraphicsResetStatus");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetGraphicsResetStatus"); }
        return (int) Handles.MH_glGetGraphicsResetStatus.invokeExact(handles.PFN_glGetGraphicsResetStatus); }
        catch (Throwable e) { throw new RuntimeException("error in GetGraphicsResetStatus", e); }
    }

    /// ```
    /// void glReadnPixels((int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* data);
    /// ```
    public void ReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReadnPixels)) throw new GLSymbolNotFoundError("Symbol not found: glReadnPixels");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReadnPixels", x, y, width, height, format, type, bufSize, data); }
        Handles.MH_glReadnPixels.invokeExact(handles.PFN_glReadnPixels, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in ReadnPixels", e); }
    }

    /// ```
    /// void glGetnUniformfv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLfloat* params);
    /// ```
    public void GetnUniformfv(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformfv", program, location, bufSize, params); }
        Handles.MH_glGetnUniformfv.invokeExact(handles.PFN_glGetnUniformfv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformfv", e); }
    }

    /// ```
    /// void glGetnUniformiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLint* params);
    /// ```
    public void GetnUniformiv(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformiv", program, location, bufSize, params); }
        Handles.MH_glGetnUniformiv.invokeExact(handles.PFN_glGetnUniformiv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformiv", e); }
    }

    /// ```
    /// void glGetnUniformuiv((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLuint* params);
    /// ```
    public void GetnUniformuiv(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformuiv", program, location, bufSize, params); }
        Handles.MH_glGetnUniformuiv.invokeExact(handles.PFN_glGetnUniformuiv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformuiv", e); }
    }

    /// ```
    /// (unsigned int) GLenum glGetGraphicsResetStatusKHR();
    /// ```
    public int GetGraphicsResetStatusKHR() {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetGraphicsResetStatusKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetGraphicsResetStatusKHR"); }
        return (int) Handles.MH_glGetGraphicsResetStatusKHR.invokeExact(handles.PFN_glGetGraphicsResetStatusKHR); }
        catch (Throwable e) { throw new RuntimeException("error in GetGraphicsResetStatusKHR", e); }
    }

    /// ```
    /// void glReadnPixelsKHR((int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* data);
    /// ```
    public void ReadnPixelsKHR(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReadnPixelsKHR)) throw new GLSymbolNotFoundError("Symbol not found: glReadnPixelsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReadnPixelsKHR", x, y, width, height, format, type, bufSize, data); }
        Handles.MH_glReadnPixelsKHR.invokeExact(handles.PFN_glReadnPixelsKHR, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in ReadnPixelsKHR", e); }
    }

    /// ```
    /// void glGetnUniformfvKHR((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLfloat* params);
    /// ```
    public void GetnUniformfvKHR(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformfvKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformfvKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformfvKHR", program, location, bufSize, params); }
        Handles.MH_glGetnUniformfvKHR.invokeExact(handles.PFN_glGetnUniformfvKHR, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformfvKHR", e); }
    }

    /// ```
    /// void glGetnUniformivKHR((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLint* params);
    /// ```
    public void GetnUniformivKHR(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformivKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformivKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformivKHR", program, location, bufSize, params); }
        Handles.MH_glGetnUniformivKHR.invokeExact(handles.PFN_glGetnUniformivKHR, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformivKHR", e); }
    }

    /// ```
    /// void glGetnUniformuivKHR((unsigned int) GLuint program, (int) GLint location, (int) GLsizei bufSize, GLuint* params);
    /// ```
    public void GetnUniformuivKHR(int program, int location, int bufSize, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetnUniformuivKHR)) throw new GLSymbolNotFoundError("Symbol not found: glGetnUniformuivKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetnUniformuivKHR", program, location, bufSize, params); }
        Handles.MH_glGetnUniformuivKHR.invokeExact(handles.PFN_glGetnUniformuivKHR, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetnUniformuivKHR", e); }
    }

}
