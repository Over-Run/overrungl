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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTIndexFunc {
    public static final int GL_INDEX_TEST_EXT = 0x81B5;
    public static final int GL_INDEX_TEST_FUNC_EXT = 0x81B6;
    public static final int GL_INDEX_TEST_REF_EXT = 0x81B7;
    public static final MethodHandle MH_glIndexFuncEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glIndexFuncEXT;

    public GLEXTIndexFunc(overrungl.opengl.GLLoadFunc func) {
        PFN_glIndexFuncEXT = func.invoke("glIndexFuncEXT");
    }

    public void IndexFuncEXT(@CType("GLenum") int func, @CType("GLclampf") float ref) {
        if (Unmarshal.isNullPointer(PFN_glIndexFuncEXT)) throw new SymbolNotFoundError("Symbol not found: glIndexFuncEXT");
        try { MH_glIndexFuncEXT.invokeExact(PFN_glIndexFuncEXT, func, ref); }
        catch (Throwable e) { throw new RuntimeException("error in glIndexFuncEXT", e); }
    }

}
