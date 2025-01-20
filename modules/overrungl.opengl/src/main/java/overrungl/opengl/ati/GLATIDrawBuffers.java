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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIDrawBuffers {
    public static final int GL_MAX_DRAW_BUFFERS_ATI = 0x8824;
    public static final int GL_DRAW_BUFFER0_ATI = 0x8825;
    public static final int GL_DRAW_BUFFER1_ATI = 0x8826;
    public static final int GL_DRAW_BUFFER2_ATI = 0x8827;
    public static final int GL_DRAW_BUFFER3_ATI = 0x8828;
    public static final int GL_DRAW_BUFFER4_ATI = 0x8829;
    public static final int GL_DRAW_BUFFER5_ATI = 0x882A;
    public static final int GL_DRAW_BUFFER6_ATI = 0x882B;
    public static final int GL_DRAW_BUFFER7_ATI = 0x882C;
    public static final int GL_DRAW_BUFFER8_ATI = 0x882D;
    public static final int GL_DRAW_BUFFER9_ATI = 0x882E;
    public static final int GL_DRAW_BUFFER10_ATI = 0x882F;
    public static final int GL_DRAW_BUFFER11_ATI = 0x8830;
    public static final int GL_DRAW_BUFFER12_ATI = 0x8831;
    public static final int GL_DRAW_BUFFER13_ATI = 0x8832;
    public static final int GL_DRAW_BUFFER14_ATI = 0x8833;
    public static final int GL_DRAW_BUFFER15_ATI = 0x8834;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDrawBuffersATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDrawBuffersATI = RuntimeHelper.downcall(Descriptors.FD_glDrawBuffersATI);
        public final MemorySegment PFN_glDrawBuffersATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawBuffersATI = func.invoke("glDrawBuffersATI", "glDrawBuffers");
        }
    }

    public GLATIDrawBuffers(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DrawBuffersATI(@CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawBuffersATI)) throw new SymbolNotFoundError("Symbol not found: glDrawBuffersATI");
        try { Handles.MH_glDrawBuffersATI.invokeExact(handles.PFN_glDrawBuffersATI, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawBuffersATI", e); }
    }

}
