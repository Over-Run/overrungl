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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIElementArray {
    public static final int GL_ELEMENT_ARRAY_ATI = 0x8768;
    public static final int GL_ELEMENT_ARRAY_TYPE_ATI = 0x8769;
    public static final int GL_ELEMENT_ARRAY_POINTER_ATI = 0x876A;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glElementPointerATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDrawElementArrayATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawRangeElementArrayATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glElementPointerATI;
        public final MemorySegment PFN_glDrawElementArrayATI;
        public final MemorySegment PFN_glDrawRangeElementArrayATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glElementPointerATI = func.invoke("glElementPointerATI");
            PFN_glDrawElementArrayATI = func.invoke("glDrawElementArrayATI");
            PFN_glDrawRangeElementArrayATI = func.invoke("glDrawRangeElementArrayATI");
        }
    }

    public GLATIElementArray(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glElementPointerATI((unsigned int) GLenum type, const void* pointer);
    /// ```
    public void ElementPointerATI(int type, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glElementPointerATI)) throw new SymbolNotFoundError("Symbol not found: glElementPointerATI");
        try { Handles.MH_glElementPointerATI.invokeExact(handles.PFN_glElementPointerATI, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ElementPointerATI", e); }
    }

    /// ```
    /// void glDrawElementArrayATI((unsigned int) GLenum mode, (int) GLsizei count);
    /// ```
    public void DrawElementArrayATI(int mode, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementArrayATI)) throw new SymbolNotFoundError("Symbol not found: glDrawElementArrayATI");
        try { Handles.MH_glDrawElementArrayATI.invokeExact(handles.PFN_glDrawElementArrayATI, mode, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementArrayATI", e); }
    }

    /// ```
    /// void glDrawRangeElementArrayATI((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, (int) GLsizei count);
    /// ```
    public void DrawRangeElementArrayATI(int mode, int start, int end, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawRangeElementArrayATI)) throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementArrayATI");
        try { Handles.MH_glDrawRangeElementArrayATI.invokeExact(handles.PFN_glDrawRangeElementArrayATI, mode, start, end, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawRangeElementArrayATI", e); }
    }

}
