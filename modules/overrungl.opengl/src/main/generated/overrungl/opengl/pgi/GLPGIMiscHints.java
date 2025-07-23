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
package overrungl.opengl.pgi;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLPGIMiscHints {
    public static final int GL_PREFER_DOUBLEBUFFER_HINT_PGI = 0x1A1F8;
    public static final int GL_CONSERVE_MEMORY_HINT_PGI = 0x1A1FD;
    public static final int GL_RECLAIM_MEMORY_HINT_PGI = 0x1A1FE;
    public static final int GL_NATIVE_GRAPHICS_HANDLE_PGI = 0x1A202;
    public static final int GL_NATIVE_GRAPHICS_BEGIN_HINT_PGI = 0x1A203;
    public static final int GL_NATIVE_GRAPHICS_END_HINT_PGI = 0x1A204;
    public static final int GL_ALWAYS_FAST_HINT_PGI = 0x1A20C;
    public static final int GL_ALWAYS_SOFT_HINT_PGI = 0x1A20D;
    public static final int GL_ALLOW_DRAW_OBJ_HINT_PGI = 0x1A20E;
    public static final int GL_ALLOW_DRAW_WIN_HINT_PGI = 0x1A20F;
    public static final int GL_ALLOW_DRAW_FRG_HINT_PGI = 0x1A210;
    public static final int GL_ALLOW_DRAW_MEM_HINT_PGI = 0x1A211;
    public static final int GL_STRICT_DEPTHFUNC_HINT_PGI = 0x1A216;
    public static final int GL_STRICT_LIGHTING_HINT_PGI = 0x1A217;
    public static final int GL_STRICT_SCISSOR_HINT_PGI = 0x1A218;
    public static final int GL_FULL_STIPPLE_HINT_PGI = 0x1A219;
    public static final int GL_CLIP_NEAR_HINT_PGI = 0x1A220;
    public static final int GL_CLIP_FAR_HINT_PGI = 0x1A221;
    public static final int GL_WIDE_LINE_HINT_PGI = 0x1A222;
    public static final int GL_BACK_NORMALS_HINT_PGI = 0x1A223;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glHintPGI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glHintPGI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glHintPGI = func.invoke("glHintPGI");
        }
    }

    public GLPGIMiscHints(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glHintPGI((unsigned int) GLenum target, (int) GLint mode);
    /// ```
    public void HintPGI(int target, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glHintPGI)) throw new GLSymbolNotFoundError("Symbol not found: glHintPGI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glHintPGI", target, mode); }
        Handles.MH_glHintPGI.invokeExact(handles.PFN_glHintPGI, target, mode); }
        catch (Throwable e) { throw new RuntimeException("error in HintPGI", e); }
    }

}
