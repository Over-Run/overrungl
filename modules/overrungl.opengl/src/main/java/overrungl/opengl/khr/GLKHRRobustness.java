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
    public static final MethodHandle MH_glGetGraphicsResetStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetGraphicsResetStatus;
    public static final MethodHandle MH_glReadnPixels = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReadnPixels;
    public static final MethodHandle MH_glGetnUniformfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformfv;
    public static final MethodHandle MH_glGetnUniformiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformiv;
    public static final MethodHandle MH_glGetnUniformuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformuiv;
    public static final int GL_CONTEXT_ROBUST_ACCESS_KHR = 0x90F3;
    public static final int GL_LOSE_CONTEXT_ON_RESET_KHR = 0x8252;
    public static final int GL_GUILTY_CONTEXT_RESET_KHR = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET_KHR = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET_KHR = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY_KHR = 0x8256;
    public static final int GL_NO_RESET_NOTIFICATION_KHR = 0x8261;
    public static final int GL_CONTEXT_LOST_KHR = 0x0507;
    public static final MethodHandle MH_glGetGraphicsResetStatusKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetGraphicsResetStatusKHR;
    public static final MethodHandle MH_glReadnPixelsKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReadnPixelsKHR;
    public static final MethodHandle MH_glGetnUniformfvKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformfvKHR;
    public static final MethodHandle MH_glGetnUniformivKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformivKHR;
    public static final MethodHandle MH_glGetnUniformuivKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformuivKHR;

    public GLKHRRobustness(overrungl.opengl.GLLoadFunc func) {
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

    public @CType("GLenum") int GetGraphicsResetStatus() {
        if (!Unmarshal.isNullPointer(PFN_glGetGraphicsResetStatus)) { try {
            return (int) MH_glGetGraphicsResetStatus.invokeExact(PFN_glGetGraphicsResetStatus);
        } catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatus", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatus"); }
    }

    public void ReadnPixels(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glReadnPixels)) { try {
            MH_glReadnPixels.invokeExact(PFN_glReadnPixels, x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) { throw new RuntimeException("error in glReadnPixels", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReadnPixels"); }
    }

    public void GetnUniformfv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformfv)) { try {
            MH_glGetnUniformfv.invokeExact(PFN_glGetnUniformfv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformfv"); }
    }

    public void GetnUniformiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformiv)) { try {
            MH_glGetnUniformiv.invokeExact(PFN_glGetnUniformiv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformiv"); }
    }

    public void GetnUniformuiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformuiv)) { try {
            MH_glGetnUniformuiv.invokeExact(PFN_glGetnUniformuiv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformuiv"); }
    }

    public @CType("GLenum") int GetGraphicsResetStatusKHR() {
        if (!Unmarshal.isNullPointer(PFN_glGetGraphicsResetStatusKHR)) { try {
            return (int) MH_glGetGraphicsResetStatusKHR.invokeExact(PFN_glGetGraphicsResetStatusKHR);
        } catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatusKHR", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatusKHR"); }
    }

    public void ReadnPixelsKHR(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glReadnPixelsKHR)) { try {
            MH_glReadnPixelsKHR.invokeExact(PFN_glReadnPixelsKHR, x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) { throw new RuntimeException("error in glReadnPixelsKHR", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReadnPixelsKHR"); }
    }

    public void GetnUniformfvKHR(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformfvKHR)) { try {
            MH_glGetnUniformfvKHR.invokeExact(PFN_glGetnUniformfvKHR, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfvKHR", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformfvKHR"); }
    }

    public void GetnUniformivKHR(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformivKHR)) { try {
            MH_glGetnUniformivKHR.invokeExact(PFN_glGetnUniformivKHR, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformivKHR", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformivKHR"); }
    }

    public void GetnUniformuivKHR(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformuivKHR)) { try {
            MH_glGetnUniformuivKHR.invokeExact(PFN_glGetnUniformuivKHR, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuivKHR", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformuivKHR"); }
    }

}
