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

public final class GLARBFramebufferNoAttachments {
    public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
    public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
    public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
    public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
    public static final int GL_MAX_FRAMEBUFFER_WIDTH = 0x9315;
    public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 0x9316;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;
    public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;
    public static final MethodHandle MH_glFramebufferParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferParameteri;
    public static final MethodHandle MH_glGetFramebufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFramebufferParameteriv;

    public GLARBFramebufferNoAttachments(overrungl.opengl.GLLoadFunc func) {
        PFN_glFramebufferParameteri = func.invoke("glFramebufferParameteri");
        PFN_glGetFramebufferParameteriv = func.invoke("glGetFramebufferParameteriv");
    }

    public void FramebufferParameteri(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferParameteri)) { try {
            MH_glFramebufferParameteri.invokeExact(PFN_glFramebufferParameteri, target, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferParameteri", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferParameteri"); }
    }

    public void GetFramebufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetFramebufferParameteriv)) { try {
            MH_glGetFramebufferParameteriv.invokeExact(PFN_glGetFramebufferParameteriv, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFramebufferParameteriv"); }
    }

}
