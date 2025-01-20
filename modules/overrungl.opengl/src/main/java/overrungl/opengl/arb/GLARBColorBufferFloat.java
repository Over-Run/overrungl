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

public final class GLARBColorBufferFloat {
    public static final int GL_RGBA_FLOAT_MODE_ARB = 0x8820;
    public static final int GL_CLAMP_VERTEX_COLOR_ARB = 0x891A;
    public static final int GL_CLAMP_FRAGMENT_COLOR_ARB = 0x891B;
    public static final int GL_CLAMP_READ_COLOR_ARB = 0x891C;
    public static final int GL_FIXED_ONLY_ARB = 0x891D;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glClampColorARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glClampColorARB = RuntimeHelper.downcall(Descriptors.FD_glClampColorARB);
        public final MemorySegment PFN_glClampColorARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glClampColorARB = func.invoke("glClampColorARB", "glClampColor");
        }
    }

    public GLARBColorBufferFloat(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ClampColorARB(@CType("GLenum") int target, @CType("GLenum") int clamp) {
        if (Unmarshal.isNullPointer(handles.PFN_glClampColorARB)) throw new SymbolNotFoundError("Symbol not found: glClampColorARB");
        try { Handles.MH_glClampColorARB.invokeExact(handles.PFN_glClampColorARB, target, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in glClampColorARB", e); }
    }

}
