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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBPointParameters {
    public static final int GL_POINT_SIZE_MIN_ARB = 0x8126;
    public static final int GL_POINT_SIZE_MAX_ARB = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 0x8128;
    public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;
    public static final MethodHandle MH_glPointParameterfARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glPointParameterfARB;
    public static final MethodHandle MH_glPointParameterfvARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPointParameterfvARB;

    public GLARBPointParameters(overrungl.opengl.GLLoadFunc func) {
        PFN_glPointParameterfARB = func.invoke("glPointParameterfARB", "glPointParameterf");
        PFN_glPointParameterfvARB = func.invoke("glPointParameterfvARB", "glPointParameterfv");
    }

    public void PointParameterfARB(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (!Unmarshal.isNullPointer(PFN_glPointParameterfARB)) { try {
            MH_glPointParameterfARB.invokeExact(PFN_glPointParameterfARB, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPointParameterfARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointParameterfARB"); }
    }

    public void PointParameterfvARB(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glPointParameterfvARB)) { try {
            MH_glPointParameterfvARB.invokeExact(PFN_glPointParameterfvARB, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glPointParameterfvARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPointParameterfvARB"); }
    }

}
