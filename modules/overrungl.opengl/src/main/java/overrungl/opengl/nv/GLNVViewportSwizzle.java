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

public final class GLNVViewportSwizzle {
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 0x9350;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 0x9351;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 0x9352;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 0x9353;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 0x9354;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 0x9355;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 0x9356;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 0x9357;
    public static final int GL_VIEWPORT_SWIZZLE_X_NV = 0x9358;
    public static final int GL_VIEWPORT_SWIZZLE_Y_NV = 0x9359;
    public static final int GL_VIEWPORT_SWIZZLE_Z_NV = 0x935A;
    public static final int GL_VIEWPORT_SWIZZLE_W_NV = 0x935B;
    public static final MethodHandle MH_glViewportSwizzleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glViewportSwizzleNV;

    public GLNVViewportSwizzle(overrungl.opengl.GLLoadFunc func) {
        PFN_glViewportSwizzleNV = func.invoke("glViewportSwizzleNV");
    }

    public void ViewportSwizzleNV(@CType("GLuint") int index, @CType("GLenum") int swizzlex, @CType("GLenum") int swizzley, @CType("GLenum") int swizzlez, @CType("GLenum") int swizzlew) {
        if (Unmarshal.isNullPointer(PFN_glViewportSwizzleNV)) throw new SymbolNotFoundError("Symbol not found: glViewportSwizzleNV");
        try { MH_glViewportSwizzleNV.invokeExact(PFN_glViewportSwizzleNV, index, swizzlex, swizzley, swizzlez, swizzlew); }
        catch (Throwable e) { throw new RuntimeException("error in glViewportSwizzleNV", e); }
    }

}
