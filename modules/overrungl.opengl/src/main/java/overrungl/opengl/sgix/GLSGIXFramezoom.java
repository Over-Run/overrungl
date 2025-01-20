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
package overrungl.opengl.sgix;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIXFramezoom {
    public static final int GL_FRAMEZOOM_SGIX = 0x818B;
    public static final int GL_FRAMEZOOM_FACTOR_SGIX = 0x818C;
    public static final int GL_MAX_FRAMEZOOM_FACTOR_SGIX = 0x818D;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFrameZoomSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glFrameZoomSGIX
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glFrameZoomSGIX = RuntimeHelper.downcall(Descriptors.FD_glFrameZoomSGIX);
        public final MemorySegment PFN_glFrameZoomSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFrameZoomSGIX = func.invoke("glFrameZoomSGIX");
        }
    }

    public GLSGIXFramezoom(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void FrameZoomSGIX(@CType("GLint") int factor) {
        if (Unmarshal.isNullPointer(handles.PFN_glFrameZoomSGIX)) throw new SymbolNotFoundError("Symbol not found: glFrameZoomSGIX");
        try { Handles.MH_glFrameZoomSGIX.invokeExact(handles.PFN_glFrameZoomSGIX, factor); }
        catch (Throwable e) { throw new RuntimeException("error in glFrameZoomSGIX", e); }
    }

}
