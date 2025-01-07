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
package overrungl.opengl.sgis;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISTextureFilter4 {
    public static final int GL_FILTER4_SGIS = 0x8146;
    public static final int GL_TEXTURE_FILTER4_SIZE_SGIS = 0x8147;
    public static final MethodHandle MH_glGetTexFilterFuncSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexFilterFuncSGIS;
    public static final MethodHandle MH_glTexFilterFuncSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexFilterFuncSGIS;

    public GLSGISTextureFilter4(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetTexFilterFuncSGIS = func.invoke("glGetTexFilterFuncSGIS");
        PFN_glTexFilterFuncSGIS = func.invoke("glTexFilterFuncSGIS");
    }

    public void GetTexFilterFuncSGIS(@CType("GLenum") int target, @CType("GLenum") int filter, @CType("GLfloat *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glGetTexFilterFuncSGIS)) { try {
            MH_glGetTexFilterFuncSGIS.invokeExact(PFN_glGetTexFilterFuncSGIS, target, filter, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTexFilterFuncSGIS", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTexFilterFuncSGIS"); }
    }

    public void TexFilterFuncSGIS(@CType("GLenum") int target, @CType("GLenum") int filter, @CType("GLsizei") int n, @CType("const GLfloat *") java.lang.foreign.MemorySegment weights) {
        if (!Unmarshal.isNullPointer(PFN_glTexFilterFuncSGIS)) { try {
            MH_glTexFilterFuncSGIS.invokeExact(PFN_glTexFilterFuncSGIS, target, filter, n, weights);
        } catch (Throwable e) { throw new RuntimeException("error in glTexFilterFuncSGIS", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexFilterFuncSGIS"); }
    }

}
