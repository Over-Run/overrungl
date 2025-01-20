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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetGraphicsResetStatus = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glReadnPixels = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetGraphicsResetStatusKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glReadnPixelsKHR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformfvKHR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformivKHR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformuivKHR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGetGraphicsResetStatus,
            FD_glReadnPixels,
            FD_glGetnUniformfv,
            FD_glGetnUniformiv,
            FD_glGetnUniformuiv,
            FD_glGetGraphicsResetStatusKHR,
            FD_glReadnPixelsKHR,
            FD_glGetnUniformfvKHR,
            FD_glGetnUniformivKHR,
            FD_glGetnUniformuivKHR
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetGraphicsResetStatus = RuntimeHelper.downcall(Descriptors.FD_glGetGraphicsResetStatus);
        public static final MethodHandle MH_glReadnPixels = RuntimeHelper.downcall(Descriptors.FD_glReadnPixels);
        public static final MethodHandle MH_glGetnUniformfv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformfv);
        public static final MethodHandle MH_glGetnUniformiv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformiv);
        public static final MethodHandle MH_glGetnUniformuiv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformuiv);
        public static final MethodHandle MH_glGetGraphicsResetStatusKHR = RuntimeHelper.downcall(Descriptors.FD_glGetGraphicsResetStatusKHR);
        public static final MethodHandle MH_glReadnPixelsKHR = RuntimeHelper.downcall(Descriptors.FD_glReadnPixelsKHR);
        public static final MethodHandle MH_glGetnUniformfvKHR = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformfvKHR);
        public static final MethodHandle MH_glGetnUniformivKHR = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformivKHR);
        public static final MethodHandle MH_glGetnUniformuivKHR = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformuivKHR);
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

    public @CType("GLenum") int GetGraphicsResetStatus() {
        if (Unmarshal.isNullPointer(handles.PFN_glGetGraphicsResetStatus)) throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatus");
        try { return (int) Handles.MH_glGetGraphicsResetStatus.invokeExact(handles.PFN_glGetGraphicsResetStatus); }
        catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatus", e); }
    }

    public void ReadnPixels(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glReadnPixels)) throw new SymbolNotFoundError("Symbol not found: glReadnPixels");
        try { Handles.MH_glReadnPixels.invokeExact(handles.PFN_glReadnPixels, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glReadnPixels", e); }
    }

    public void GetnUniformfv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformfv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformfv");
        try { Handles.MH_glGetnUniformfv.invokeExact(handles.PFN_glGetnUniformfv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfv", e); }
    }

    public void GetnUniformiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformiv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformiv");
        try { Handles.MH_glGetnUniformiv.invokeExact(handles.PFN_glGetnUniformiv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformiv", e); }
    }

    public void GetnUniformuiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformuiv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformuiv");
        try { Handles.MH_glGetnUniformuiv.invokeExact(handles.PFN_glGetnUniformuiv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuiv", e); }
    }

    public @CType("GLenum") int GetGraphicsResetStatusKHR() {
        if (Unmarshal.isNullPointer(handles.PFN_glGetGraphicsResetStatusKHR)) throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusKHR");
        try { return (int) Handles.MH_glGetGraphicsResetStatusKHR.invokeExact(handles.PFN_glGetGraphicsResetStatusKHR); }
        catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatusKHR", e); }
    }

    public void ReadnPixelsKHR(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glReadnPixelsKHR)) throw new SymbolNotFoundError("Symbol not found: glReadnPixelsKHR");
        try { Handles.MH_glReadnPixelsKHR.invokeExact(handles.PFN_glReadnPixelsKHR, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glReadnPixelsKHR", e); }
    }

    public void GetnUniformfvKHR(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformfvKHR)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformfvKHR");
        try { Handles.MH_glGetnUniformfvKHR.invokeExact(handles.PFN_glGetnUniformfvKHR, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfvKHR", e); }
    }

    public void GetnUniformivKHR(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformivKHR)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformivKHR");
        try { Handles.MH_glGetnUniformivKHR.invokeExact(handles.PFN_glGetnUniformivKHR, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformivKHR", e); }
    }

    public void GetnUniformuivKHR(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformuivKHR)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformuivKHR");
        try { Handles.MH_glGetnUniformuivKHR.invokeExact(handles.PFN_glGetnUniformuivKHR, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuivKHR", e); }
    }

}
