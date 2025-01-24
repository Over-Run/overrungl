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

public final class GLARBBlendFuncExtended {
    public static final int GL_SRC1_COLOR = 0x88F9;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBindFragDataLocationIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFragDataIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBindFragDataLocationIndexed;
        public final MemorySegment PFN_glGetFragDataIndex;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBindFragDataLocationIndexed = func.invoke("glBindFragDataLocationIndexed");
            PFN_glGetFragDataIndex = func.invoke("glGetFragDataIndex");
        }
    }

    public GLARBBlendFuncExtended(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBindFragDataLocationIndexed(unsigned int program, unsigned int colorNumber, unsigned int index, const GLchar* name);
    /// ```
    public void BindFragDataLocationIndexed(int program, int colorNumber, int index, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFragDataLocationIndexed)) throw new SymbolNotFoundError("Symbol not found: glBindFragDataLocationIndexed");
        try { Handles.MH_glBindFragDataLocationIndexed.invokeExact(handles.PFN_glBindFragDataLocationIndexed, program, colorNumber, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in BindFragDataLocationIndexed", e); }
    }

    /// ```
    /// int glGetFragDataIndex(unsigned int program, const GLchar* name);
    /// ```
    public int GetFragDataIndex(int program, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragDataIndex)) throw new SymbolNotFoundError("Symbol not found: glGetFragDataIndex");
        try { return (int) Handles.MH_glGetFragDataIndex.invokeExact(handles.PFN_glGetFragDataIndex, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragDataIndex", e); }
    }

}
