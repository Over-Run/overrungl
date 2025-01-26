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
package overrungl.opengl.ibm;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLIBMMultimodeDrawArrays {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiModeDrawArraysIBM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiModeDrawElementsIBM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiModeDrawArraysIBM;
        public final MemorySegment PFN_glMultiModeDrawElementsIBM;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiModeDrawArraysIBM = func.invoke("glMultiModeDrawArraysIBM");
            PFN_glMultiModeDrawElementsIBM = func.invoke("glMultiModeDrawElementsIBM");
        }
    }

    public GLIBMMultimodeDrawArrays(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMultiModeDrawArraysIBM(const GLenum* mode, const GLint* first, const GLsizei* count, (int) GLsizei primcount, (int) GLint modestride);
    /// ```
    public void MultiModeDrawArraysIBM(MemorySegment mode, MemorySegment first, MemorySegment count, int primcount, int modestride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiModeDrawArraysIBM)) throw new SymbolNotFoundError("Symbol not found: glMultiModeDrawArraysIBM");
        try { Handles.MH_glMultiModeDrawArraysIBM.invokeExact(handles.PFN_glMultiModeDrawArraysIBM, mode, first, count, primcount, modestride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiModeDrawArraysIBM", e); }
    }

    /// ```
    /// void glMultiModeDrawElementsIBM(const GLenum* mode, const GLsizei* count, (unsigned int) GLenum type, const void* const * indices, (int) GLsizei primcount, (int) GLint modestride);
    /// ```
    public void MultiModeDrawElementsIBM(MemorySegment mode, MemorySegment count, int type, MemorySegment indices, int primcount, int modestride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiModeDrawElementsIBM)) throw new SymbolNotFoundError("Symbol not found: glMultiModeDrawElementsIBM");
        try { Handles.MH_glMultiModeDrawElementsIBM.invokeExact(handles.PFN_glMultiModeDrawElementsIBM, mode, count, type, indices, primcount, modestride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiModeDrawElementsIBM", e); }
    }

}
