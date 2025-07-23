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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glViewportSwizzleNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glViewportSwizzleNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glViewportSwizzleNV = func.invoke("glViewportSwizzleNV");
        }
    }

    public GLNVViewportSwizzle(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glViewportSwizzleNV((unsigned int) GLuint index, (unsigned int) GLenum swizzlex, (unsigned int) GLenum swizzley, (unsigned int) GLenum swizzlez, (unsigned int) GLenum swizzlew);
    /// ```
    public void ViewportSwizzleNV(int index, int swizzlex, int swizzley, int swizzlez, int swizzlew) {
        if (MemoryUtil.isNullPointer(handles.PFN_glViewportSwizzleNV)) throw new GLSymbolNotFoundError("Symbol not found: glViewportSwizzleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glViewportSwizzleNV", index, swizzlex, swizzley, swizzlez, swizzlew); }
        Handles.MH_glViewportSwizzleNV.invokeExact(handles.PFN_glViewportSwizzleNV, index, swizzlex, swizzley, swizzlez, swizzlew); }
        catch (Throwable e) { throw new RuntimeException("error in ViewportSwizzleNV", e); }
    }

}
