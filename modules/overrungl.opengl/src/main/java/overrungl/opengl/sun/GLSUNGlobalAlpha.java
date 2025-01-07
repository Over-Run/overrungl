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
    public static final MethodHandle MH_glGlobalAlphaFactorbSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glGlobalAlphaFactorbSUN;
    public static final MethodHandle MH_glGlobalAlphaFactorsSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glGlobalAlphaFactorsSUN;
    public static final MethodHandle MH_glGlobalAlphaFactoriSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGlobalAlphaFactoriSUN;
    public static final MethodHandle MH_glGlobalAlphaFactorfSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glGlobalAlphaFactorfSUN;
    public static final MethodHandle MH_glGlobalAlphaFactordSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glGlobalAlphaFactordSUN;
    public static final MethodHandle MH_glGlobalAlphaFactorubSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glGlobalAlphaFactorubSUN;
    public static final MethodHandle MH_glGlobalAlphaFactorusSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glGlobalAlphaFactorusSUN;
    public static final MethodHandle MH_glGlobalAlphaFactoruiSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGlobalAlphaFactoruiSUN;

    public GLSUNGlobalAlpha(overrungl.opengl.GLLoadFunc func) {
        PFN_glGlobalAlphaFactorbSUN = func.invoke("glGlobalAlphaFactorbSUN");
        PFN_glGlobalAlphaFactorsSUN = func.invoke("glGlobalAlphaFactorsSUN");
        PFN_glGlobalAlphaFactoriSUN = func.invoke("glGlobalAlphaFactoriSUN");
        PFN_glGlobalAlphaFactorfSUN = func.invoke("glGlobalAlphaFactorfSUN");
        PFN_glGlobalAlphaFactordSUN = func.invoke("glGlobalAlphaFactordSUN");
        PFN_glGlobalAlphaFactorubSUN = func.invoke("glGlobalAlphaFactorubSUN");
        PFN_glGlobalAlphaFactorusSUN = func.invoke("glGlobalAlphaFactorusSUN");
        PFN_glGlobalAlphaFactoruiSUN = func.invoke("glGlobalAlphaFactoruiSUN");
    }

    public void GlobalAlphaFactorbSUN(@CType("GLbyte") byte factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactorbSUN)) { try {
            MH_glGlobalAlphaFactorbSUN.invokeExact(PFN_glGlobalAlphaFactorbSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorbSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorbSUN"); }
    }

    public void GlobalAlphaFactorsSUN(@CType("GLshort") short factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactorsSUN)) { try {
            MH_glGlobalAlphaFactorsSUN.invokeExact(PFN_glGlobalAlphaFactorsSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorsSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorsSUN"); }
    }

    public void GlobalAlphaFactoriSUN(@CType("GLint") int factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactoriSUN)) { try {
            MH_glGlobalAlphaFactoriSUN.invokeExact(PFN_glGlobalAlphaFactoriSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactoriSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactoriSUN"); }
    }

    public void GlobalAlphaFactorfSUN(@CType("GLfloat") float factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactorfSUN)) { try {
            MH_glGlobalAlphaFactorfSUN.invokeExact(PFN_glGlobalAlphaFactorfSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorfSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorfSUN"); }
    }

    public void GlobalAlphaFactordSUN(@CType("GLdouble") double factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactordSUN)) { try {
            MH_glGlobalAlphaFactordSUN.invokeExact(PFN_glGlobalAlphaFactordSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactordSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactordSUN"); }
    }

    public void GlobalAlphaFactorubSUN(@CType("GLubyte") byte factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactorubSUN)) { try {
            MH_glGlobalAlphaFactorubSUN.invokeExact(PFN_glGlobalAlphaFactorubSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorubSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorubSUN"); }
    }

    public void GlobalAlphaFactorusSUN(@CType("GLushort") short factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactorusSUN)) { try {
            MH_glGlobalAlphaFactorusSUN.invokeExact(PFN_glGlobalAlphaFactorusSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactorusSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactorusSUN"); }
    }

    public void GlobalAlphaFactoruiSUN(@CType("GLuint") int factor) {
        if (!Unmarshal.isNullPointer(PFN_glGlobalAlphaFactoruiSUN)) { try {
            MH_glGlobalAlphaFactoruiSUN.invokeExact(PFN_glGlobalAlphaFactoruiSUN, factor);
        } catch (Throwable e) { throw new RuntimeException("error in glGlobalAlphaFactoruiSUN", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGlobalAlphaFactoruiSUN"); }
    }

}
