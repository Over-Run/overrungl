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

public final class GLEXTFogCoord {
    public static final int GL_FOG_COORDINATE_SOURCE_EXT = 0x8450;
    public static final int GL_FOG_COORDINATE_EXT = 0x8451;
    public static final int GL_FRAGMENT_DEPTH_EXT = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE_EXT = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE_EXT = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE_EXT = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER_EXT = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY_EXT = 0x8457;
    public static final MethodHandle MH_glFogCoordfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glFogCoordfEXT;
    public static final MethodHandle MH_glFogCoordfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFogCoordfvEXT;
    public static final MethodHandle MH_glFogCoorddEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glFogCoorddEXT;
    public static final MethodHandle MH_glFogCoorddvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFogCoorddvEXT;
    public static final MethodHandle MH_glFogCoordPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFogCoordPointerEXT;

    public GLEXTFogCoord(overrungl.opengl.GLLoadFunc func) {
        PFN_glFogCoordfEXT = func.invoke("glFogCoordfEXT", "glFogCoordf");
        PFN_glFogCoordfvEXT = func.invoke("glFogCoordfvEXT", "glFogCoordfv");
        PFN_glFogCoorddEXT = func.invoke("glFogCoorddEXT", "glFogCoordd");
        PFN_glFogCoorddvEXT = func.invoke("glFogCoorddvEXT", "glFogCoorddv");
        PFN_glFogCoordPointerEXT = func.invoke("glFogCoordPointerEXT", "glFogCoordPointer");
    }

    public void FogCoordfEXT(@CType("GLfloat") float coord) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoordfEXT)) { try {
            MH_glFogCoordfEXT.invokeExact(PFN_glFogCoordfEXT, coord);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoordfEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoordfEXT"); }
    }

    public void FogCoordfvEXT(@CType("const GLfloat *") java.lang.foreign.MemorySegment coord) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoordfvEXT)) { try {
            MH_glFogCoordfvEXT.invokeExact(PFN_glFogCoordfvEXT, coord);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoordfvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoordfvEXT"); }
    }

    public void FogCoorddEXT(@CType("GLdouble") double coord) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoorddEXT)) { try {
            MH_glFogCoorddEXT.invokeExact(PFN_glFogCoorddEXT, coord);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoorddEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoorddEXT"); }
    }

    public void FogCoorddvEXT(@CType("const GLdouble *") java.lang.foreign.MemorySegment coord) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoorddvEXT)) { try {
            MH_glFogCoorddvEXT.invokeExact(PFN_glFogCoorddvEXT, coord);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoorddvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoorddvEXT"); }
    }

    public void FogCoordPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glFogCoordPointerEXT)) { try {
            MH_glFogCoordPointerEXT.invokeExact(PFN_glFogCoordPointerEXT, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glFogCoordPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFogCoordPointerEXT"); }
    }

}
