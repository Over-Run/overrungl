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
package overrungl.opengl.mesa;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLMESAFramebufferFlipY {
    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferParameteriMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferParameterivMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFramebufferParameteriMESA;
        public final MemorySegment PFN_glGetFramebufferParameterivMESA;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferParameteriMESA = func.invoke("glFramebufferParameteriMESA");
            PFN_glGetFramebufferParameterivMESA = func.invoke("glGetFramebufferParameterivMESA");
        }
    }

    public GLMESAFramebufferFlipY(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void FramebufferParameteriMESA(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferParameteriMESA)) throw new SymbolNotFoundError("Symbol not found: glFramebufferParameteriMESA");
        try { Handles.MH_glFramebufferParameteriMESA.invokeExact(handles.PFN_glFramebufferParameteriMESA, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferParameteriMESA", e); }
    }

    public void GetFramebufferParameterivMESA(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFramebufferParameterivMESA)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferParameterivMESA");
        try { Handles.MH_glGetFramebufferParameterivMESA.invokeExact(handles.PFN_glGetFramebufferParameterivMESA, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferParameterivMESA", e); }
    }

}
