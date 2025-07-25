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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTIndexFunc {
    public static final int GL_INDEX_TEST_EXT = 0x81B5;
    public static final int GL_INDEX_TEST_FUNC_EXT = 0x81B6;
    public static final int GL_INDEX_TEST_REF_EXT = 0x81B7;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glIndexFuncEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glIndexFuncEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glIndexFuncEXT = func.invoke("glIndexFuncEXT");
        }
    }

    public GLEXTIndexFunc(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glIndexFuncEXT((unsigned int) GLenum func, ((float) khronos_float_t) GLclampf ref);
    /// ```
    public void IndexFuncEXT(int func, float ref) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexFuncEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIndexFuncEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIndexFuncEXT", func, ref); }
        Handles.MH_glIndexFuncEXT.invokeExact(handles.PFN_glIndexFuncEXT, func, ref); }
        catch (Throwable e) { throw new RuntimeException("error in IndexFuncEXT", e); }
    }

}
