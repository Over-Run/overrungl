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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBDrawBuffers {
    public static final int GL_MAX_DRAW_BUFFERS_ARB = 0x8824;
    public static final int GL_DRAW_BUFFER0_ARB = 0x8825;
    public static final int GL_DRAW_BUFFER1_ARB = 0x8826;
    public static final int GL_DRAW_BUFFER2_ARB = 0x8827;
    public static final int GL_DRAW_BUFFER3_ARB = 0x8828;
    public static final int GL_DRAW_BUFFER4_ARB = 0x8829;
    public static final int GL_DRAW_BUFFER5_ARB = 0x882A;
    public static final int GL_DRAW_BUFFER6_ARB = 0x882B;
    public static final int GL_DRAW_BUFFER7_ARB = 0x882C;
    public static final int GL_DRAW_BUFFER8_ARB = 0x882D;
    public static final int GL_DRAW_BUFFER9_ARB = 0x882E;
    public static final int GL_DRAW_BUFFER10_ARB = 0x882F;
    public static final int GL_DRAW_BUFFER11_ARB = 0x8830;
    public static final int GL_DRAW_BUFFER12_ARB = 0x8831;
    public static final int GL_DRAW_BUFFER13_ARB = 0x8832;
    public static final int GL_DRAW_BUFFER14_ARB = 0x8833;
    public static final int GL_DRAW_BUFFER15_ARB = 0x8834;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawBuffersARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glDrawBuffersARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawBuffersARB = func.invoke("glDrawBuffersARB", "glDrawBuffers");
        }
    }

    public GLARBDrawBuffers(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawBuffersARB((int) GLsizei n, const GLenum* bufs);
    /// ```
    public void DrawBuffersARB(int n, MemorySegment bufs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawBuffersARB)) throw new GLSymbolNotFoundError("Symbol not found: glDrawBuffersARB");
        try { Handles.MH_glDrawBuffersARB.invokeExact(handles.PFN_glDrawBuffersARB, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in DrawBuffersARB", e); }
    }

}
