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

public final class GLARBClipControl {
    public static final int GL_LOWER_LEFT = 0x8CA1;
    public static final int GL_UPPER_LEFT = 0x8CA2;
    public static final int GL_NEGATIVE_ONE_TO_ONE = 0x935E;
    public static final int GL_ZERO_TO_ONE = 0x935F;
    public static final int GL_CLIP_ORIGIN = 0x935C;
    public static final int GL_CLIP_DEPTH_MODE = 0x935D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClipControl = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glClipControl;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glClipControl = func.invoke("glClipControl");
        }
    }

    public GLARBClipControl(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glClipControl(unsigned int origin, unsigned int depth);
    /// ```
    public void ClipControl(int origin, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClipControl)) throw new SymbolNotFoundError("Symbol not found: glClipControl");
        try { Handles.MH_glClipControl.invokeExact(handles.PFN_glClipControl, origin, depth); }
        catch (Throwable e) { throw new RuntimeException("error in ClipControl", e); }
    }

}
