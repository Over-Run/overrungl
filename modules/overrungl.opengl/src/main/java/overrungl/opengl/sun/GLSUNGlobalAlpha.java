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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSUNGlobalAlpha {
    public static final int GL_GLOBAL_ALPHA_SUN = 0x81D9;
    public static final int GL_GLOBAL_ALPHA_FACTOR_SUN = 0x81DA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGlobalAlphaFactorbSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGlobalAlphaFactorsSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glGlobalAlphaFactoriSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGlobalAlphaFactorfSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glGlobalAlphaFactordSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glGlobalAlphaFactorubSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGlobalAlphaFactorusSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glGlobalAlphaFactoruiSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
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

    public void GlobalAlphaFactorbSUN(@CType("GLbyte") byte factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactorbSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorbSUN");
        try { Handles.MH_glGlobalAlphaFactorbSUN.invokeExact(handles.PFN_glGlobalAlphaFactorbSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorbSUN", e); }
    }

    public void GlobalAlphaFactorsSUN(@CType("GLshort") short factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactorsSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorsSUN");
        try { Handles.MH_glGlobalAlphaFactorsSUN.invokeExact(handles.PFN_glGlobalAlphaFactorsSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorsSUN", e); }
    }

    public void GlobalAlphaFactoriSUN(@CType("GLint") int factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactoriSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactoriSUN");
        try { Handles.MH_glGlobalAlphaFactoriSUN.invokeExact(handles.PFN_glGlobalAlphaFactoriSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactoriSUN", e); }
    }

    public void GlobalAlphaFactorfSUN(@CType("GLfloat") float factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactorfSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorfSUN");
        try { Handles.MH_glGlobalAlphaFactorfSUN.invokeExact(handles.PFN_glGlobalAlphaFactorfSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorfSUN", e); }
    }

    public void GlobalAlphaFactordSUN(@CType("GLdouble") double factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactordSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactordSUN");
        try { Handles.MH_glGlobalAlphaFactordSUN.invokeExact(handles.PFN_glGlobalAlphaFactordSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactordSUN", e); }
    }

    public void GlobalAlphaFactorubSUN(@CType("GLubyte") byte factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactorubSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorubSUN");
        try { Handles.MH_glGlobalAlphaFactorubSUN.invokeExact(handles.PFN_glGlobalAlphaFactorubSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorubSUN", e); }
    }

    public void GlobalAlphaFactorusSUN(@CType("GLushort") short factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactorusSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorusSUN");
        try { Handles.MH_glGlobalAlphaFactorusSUN.invokeExact(handles.PFN_glGlobalAlphaFactorusSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorusSUN", e); }
    }

    public void GlobalAlphaFactoruiSUN(@CType("GLuint") int factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glGlobalAlphaFactoruiSUN)) throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactoruiSUN");
        try { Handles.MH_glGlobalAlphaFactoruiSUN.invokeExact(handles.PFN_glGlobalAlphaFactoruiSUN, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactoruiSUN", e); }
    }

}
