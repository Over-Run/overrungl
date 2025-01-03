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

public final class GLARBBlendFuncExtended {
    public static final int GL_SRC1_COLOR = 0x88F9;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
    public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
    public static final MethodHandle MH_glBindFragDataLocationIndexed = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindFragDataLocationIndexed;
    public static final MethodHandle MH_glGetFragDataIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFragDataIndex;

    public GLARBBlendFuncExtended(overrungl.opengl.GLLoadFunc func) {
        PFN_glBindFragDataLocationIndexed = func.invoke("glBindFragDataLocationIndexed");
        PFN_glGetFragDataIndex = func.invoke("glGetFragDataIndex");
    }

    public void BindFragDataLocationIndexed(@CType("GLuint") int program, @CType("GLuint") int colorNumber, @CType("GLuint") int index, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindFragDataLocationIndexed))
            MH_glBindFragDataLocationIndexed.invokeExact(PFN_glBindFragDataLocationIndexed, program, colorNumber, index, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindFragDataLocationIndexed", e); }
    }

    public @CType("GLint") int GetFragDataIndex(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFragDataIndex))
            return (int) MH_glGetFragDataIndex.invokeExact(PFN_glGetFragDataIndex, program, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragDataIndex", e); }
    }

}
