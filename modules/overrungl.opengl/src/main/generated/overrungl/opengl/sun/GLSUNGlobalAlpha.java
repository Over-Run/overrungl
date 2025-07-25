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
package overrungl.opengl.sun;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLSUNGlobalAlpha {
    public static final int GL_GLOBAL_ALPHA_SUN = 0x81D9;
    public static final int GL_GLOBAL_ALPHA_FACTOR_SUN = 0x81DA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGlobalAlphaFactorbSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGlobalAlphaFactorsSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glGlobalAlphaFactoriSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGlobalAlphaFactorfSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGlobalAlphaFactordSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glGlobalAlphaFactorubSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGlobalAlphaFactorusSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glGlobalAlphaFactoruiSUN = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGlobalAlphaFactorbSUN;
        public final MemorySegment PFN_glGlobalAlphaFactorsSUN;
        public final MemorySegment PFN_glGlobalAlphaFactoriSUN;
        public final MemorySegment PFN_glGlobalAlphaFactorfSUN;
        public final MemorySegment PFN_glGlobalAlphaFactordSUN;
        public final MemorySegment PFN_glGlobalAlphaFactorubSUN;
        public final MemorySegment PFN_glGlobalAlphaFactorusSUN;
        public final MemorySegment PFN_glGlobalAlphaFactoruiSUN;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGlobalAlphaFactorbSUN = func.invoke("glGlobalAlphaFactorbSUN");
            PFN_glGlobalAlphaFactorsSUN = func.invoke("glGlobalAlphaFactorsSUN");
            PFN_glGlobalAlphaFactoriSUN = func.invoke("glGlobalAlphaFactoriSUN");
            PFN_glGlobalAlphaFactorfSUN = func.invoke("glGlobalAlphaFactorfSUN");
            PFN_glGlobalAlphaFactordSUN = func.invoke("glGlobalAlphaFactordSUN");
            PFN_glGlobalAlphaFactorubSUN = func.invoke("glGlobalAlphaFactorubSUN");
            PFN_glGlobalAlphaFactorusSUN = func.invoke("glGlobalAlphaFactorusSUN");
            PFN_glGlobalAlphaFactoruiSUN = func.invoke("glGlobalAlphaFactoruiSUN");
        }
    }

    public GLSUNGlobalAlpha(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGlobalAlphaFactorbSUN(((signed char) khronos_int8_t) GLbyte factor);
    /// ```
    public void GlobalAlphaFactorbSUN(byte factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactorbSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactorbSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactorbSUN", factor); }
        Handles.MH_glGlobalAlphaFactorbSUN.invokeExact(handles.PFN_glGlobalAlphaFactorbSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactorbSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactorsSUN(((signed short) khronos_int16_t) GLshort factor);
    /// ```
    public void GlobalAlphaFactorsSUN(short factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactorsSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactorsSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactorsSUN", factor); }
        Handles.MH_glGlobalAlphaFactorsSUN.invokeExact(handles.PFN_glGlobalAlphaFactorsSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactorsSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactoriSUN((int) GLint factor);
    /// ```
    public void GlobalAlphaFactoriSUN(int factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactoriSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactoriSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactoriSUN", factor); }
        Handles.MH_glGlobalAlphaFactoriSUN.invokeExact(handles.PFN_glGlobalAlphaFactoriSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactoriSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactorfSUN(((float) khronos_float_t) GLfloat factor);
    /// ```
    public void GlobalAlphaFactorfSUN(float factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactorfSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactorfSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactorfSUN", factor); }
        Handles.MH_glGlobalAlphaFactorfSUN.invokeExact(handles.PFN_glGlobalAlphaFactorfSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactorfSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactordSUN((double) GLdouble factor);
    /// ```
    public void GlobalAlphaFactordSUN(double factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactordSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactordSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactordSUN", factor); }
        Handles.MH_glGlobalAlphaFactordSUN.invokeExact(handles.PFN_glGlobalAlphaFactordSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactordSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactorubSUN(((unsigned char) khronos_uint8_t) GLubyte factor);
    /// ```
    public void GlobalAlphaFactorubSUN(byte factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactorubSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactorubSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactorubSUN", factor); }
        Handles.MH_glGlobalAlphaFactorubSUN.invokeExact(handles.PFN_glGlobalAlphaFactorubSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactorubSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactorusSUN(((unsigned short) khronos_uint16_t) GLushort factor);
    /// ```
    public void GlobalAlphaFactorusSUN(short factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactorusSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactorusSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactorusSUN", factor); }
        Handles.MH_glGlobalAlphaFactorusSUN.invokeExact(handles.PFN_glGlobalAlphaFactorusSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactorusSUN", e); }
    }

    /// ```
    /// void glGlobalAlphaFactoruiSUN((unsigned int) GLuint factor);
    /// ```
    public void GlobalAlphaFactoruiSUN(int factor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGlobalAlphaFactoruiSUN)) throw new GLSymbolNotFoundError("Symbol not found: glGlobalAlphaFactoruiSUN");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGlobalAlphaFactoruiSUN", factor); }
        Handles.MH_glGlobalAlphaFactoruiSUN.invokeExact(handles.PFN_glGlobalAlphaFactoruiSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in GlobalAlphaFactoruiSUN", e); }
    }

}
