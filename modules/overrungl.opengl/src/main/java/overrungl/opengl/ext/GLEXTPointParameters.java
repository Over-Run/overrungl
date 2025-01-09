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

public final class GLEXTPointParameters {
    public static final int GL_POINT_SIZE_MIN_EXT = 0x8126;
    public static final int GL_POINT_SIZE_MAX_EXT = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128;
    public static final int GL_DISTANCE_ATTENUATION_EXT = 0x8129;
    public static final MethodHandle MH_glPointParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public static final MethodHandle MH_glPointParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPointParameterfEXT;
    public final MemorySegment PFN_glPointParameterfvEXT;

    public GLEXTPointParameters(overrungl.opengl.GLLoadFunc func) {
        PFN_glPointParameterfEXT = func.invoke("glPointParameterfEXT", "glPointParameterf");
        PFN_glPointParameterfvEXT = func.invoke("glPointParameterfvEXT", "glPointParameterfv");
    }

    public void PointParameterfEXT(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(PFN_glPointParameterfEXT)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfEXT");
        try { MH_glPointParameterfEXT.invokeExact(PFN_glPointParameterfEXT, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfEXT", e); }
    }

    public void PointParameterfvEXT(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glPointParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfvEXT");
        try { MH_glPointParameterfvEXT.invokeExact(PFN_glPointParameterfvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfvEXT", e); }
    }

}
