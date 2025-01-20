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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBPointParameters {
    public static final int GL_POINT_SIZE_MIN_ARB = 0x8126;
    public static final int GL_POINT_SIZE_MAX_ARB = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 0x8128;
    public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPointParameterfARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glPointParameterfvARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glPointParameterfARB,
            FD_glPointParameterfvARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glPointParameterfARB = RuntimeHelper.downcall(Descriptors.FD_glPointParameterfARB);
        public static final MethodHandle MH_glPointParameterfvARB = RuntimeHelper.downcall(Descriptors.FD_glPointParameterfvARB);
        public final MemorySegment PFN_glPointParameterfARB;
        public final MemorySegment PFN_glPointParameterfvARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPointParameterfARB = func.invoke("glPointParameterfARB", "glPointParameterf");
            PFN_glPointParameterfvARB = func.invoke("glPointParameterfvARB", "glPointParameterfv");
        }
    }

    public GLARBPointParameters(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PointParameterfARB(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterfARB)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfARB");
        try { Handles.MH_glPointParameterfARB.invokeExact(handles.PFN_glPointParameterfARB, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfARB", e); }
    }

    public void PointParameterfvARB(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPointParameterfvARB)) throw new SymbolNotFoundError("Symbol not found: glPointParameterfvARB");
        try { Handles.MH_glPointParameterfvARB.invokeExact(handles.PFN_glPointParameterfvARB, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPointParameterfvARB", e); }
    }

}
