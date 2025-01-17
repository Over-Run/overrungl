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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIElementArray {
    public static final int GL_ELEMENT_ARRAY_ATI = 0x8768;
    public static final int GL_ELEMENT_ARRAY_TYPE_ATI = 0x8769;
    public static final int GL_ELEMENT_ARRAY_POINTER_ATI = 0x876A;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glElementPointerATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDrawElementArrayATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawRangeElementArrayATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glElementPointerATI,
            FD_glDrawElementArrayATI,
            FD_glDrawRangeElementArrayATI
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glElementPointerATI = RuntimeHelper.downcall(Descriptors.FD_glElementPointerATI);
        public static final MethodHandle MH_glDrawElementArrayATI = RuntimeHelper.downcall(Descriptors.FD_glDrawElementArrayATI);
        public static final MethodHandle MH_glDrawRangeElementArrayATI = RuntimeHelper.downcall(Descriptors.FD_glDrawRangeElementArrayATI);
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

    public void ElementPointerATI(@CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glElementPointerATI)) throw new SymbolNotFoundError("Symbol not found: glElementPointerATI");
        try { Handles.MH_glElementPointerATI.invokeExact(handles.PFN_glElementPointerATI, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glElementPointerATI", e); }
    }

    public void DrawElementArrayATI(@CType("GLenum") int mode, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementArrayATI)) throw new SymbolNotFoundError("Symbol not found: glDrawElementArrayATI");
        try { Handles.MH_glDrawElementArrayATI.invokeExact(handles.PFN_glDrawElementArrayATI, mode, count); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementArrayATI", e); }
    }

    public void DrawRangeElementArrayATI(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawRangeElementArrayATI)) throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementArrayATI");
        try { Handles.MH_glDrawRangeElementArrayATI.invokeExact(handles.PFN_glDrawRangeElementArrayATI, mode, start, end, count); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElementArrayATI", e); }
    }

}
