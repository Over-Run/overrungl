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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVPointSprite {
    public static final int GL_POINT_SPRITE_NV = 0x8861;
    public static final int GL_COORD_REPLACE_NV = 0x8862;
    public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;
    public static final MethodHandle MH_glPointParameteriNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPointParameteriNV;
    public static final MethodHandle MH_glPointParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPointParameterivNV;

    public GLNVPointSprite(overrungl.opengl.GLLoadFunc func) {
        PFN_glPointParameteriNV = func.invoke("glPointParameteriNV", "glPointParameteri");
        PFN_glPointParameterivNV = func.invoke("glPointParameterivNV", "glPointParameteriv");
    }

    public void PointParameteriNV(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glPointParameteriNV)) { try {
            MH_glPointParameteriNV.invokeExact(PFN_glPointParameteriNV, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPointParameteriNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointParameteriNV"); }
    }

    public void PointParameterivNV(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glPointParameterivNV)) { try {
            MH_glPointParameterivNV.invokeExact(PFN_glPointParameterivNV, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glPointParameterivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointParameterivNV"); }
    }

}
