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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEElementArray {
    public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
    public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
    public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glElementPointerAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDrawElementArrayAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawRangeElementArrayAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiDrawElementArrayAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiDrawRangeElementArrayAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glElementPointerAPPLE = RuntimeHelper.downcall(Descriptors.FD_glElementPointerAPPLE);
        public static final MethodHandle MH_glDrawElementArrayAPPLE = RuntimeHelper.downcall(Descriptors.FD_glDrawElementArrayAPPLE);
        public static final MethodHandle MH_glDrawRangeElementArrayAPPLE = RuntimeHelper.downcall(Descriptors.FD_glDrawRangeElementArrayAPPLE);
        public static final MethodHandle MH_glMultiDrawElementArrayAPPLE = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawElementArrayAPPLE);
        public static final MethodHandle MH_glMultiDrawRangeElementArrayAPPLE = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawRangeElementArrayAPPLE);
        public final MemorySegment PFN_glElementPointerAPPLE;
        public final MemorySegment PFN_glDrawElementArrayAPPLE;
        public final MemorySegment PFN_glDrawRangeElementArrayAPPLE;
        public final MemorySegment PFN_glMultiDrawElementArrayAPPLE;
        public final MemorySegment PFN_glMultiDrawRangeElementArrayAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glElementPointerAPPLE = func.invoke("glElementPointerAPPLE");
            PFN_glDrawElementArrayAPPLE = func.invoke("glDrawElementArrayAPPLE");
            PFN_glDrawRangeElementArrayAPPLE = func.invoke("glDrawRangeElementArrayAPPLE");
            PFN_glMultiDrawElementArrayAPPLE = func.invoke("glMultiDrawElementArrayAPPLE");
            PFN_glMultiDrawRangeElementArrayAPPLE = func.invoke("glMultiDrawRangeElementArrayAPPLE");
        }
    }

    public GLAPPLEElementArray(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ElementPointerAPPLE(@CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glElementPointerAPPLE)) throw new SymbolNotFoundError("Symbol not found: glElementPointerAPPLE");
        try { Handles.MH_glElementPointerAPPLE.invokeExact(handles.PFN_glElementPointerAPPLE, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glElementPointerAPPLE", e); }
    }

    public void DrawElementArrayAPPLE(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glDrawElementArrayAPPLE");
        try { Handles.MH_glDrawElementArrayAPPLE.invokeExact(handles.PFN_glDrawElementArrayAPPLE, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementArrayAPPLE", e); }
    }

    public void DrawRangeElementArrayAPPLE(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawRangeElementArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glDrawRangeElementArrayAPPLE");
        try { Handles.MH_glDrawRangeElementArrayAPPLE.invokeExact(handles.PFN_glDrawRangeElementArrayAPPLE, mode, start, end, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawRangeElementArrayAPPLE", e); }
    }

    public void MultiDrawElementArrayAPPLE(@CType("GLenum") int mode, @CType("const GLint *") java.lang.foreign.MemorySegment first, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawElementArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementArrayAPPLE");
        try { Handles.MH_glMultiDrawElementArrayAPPLE.invokeExact(handles.PFN_glMultiDrawElementArrayAPPLE, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementArrayAPPLE", e); }
    }

    public void MultiDrawRangeElementArrayAPPLE(@CType("GLenum") int mode, @CType("GLuint") int start, @CType("GLuint") int end, @CType("const GLint *") java.lang.foreign.MemorySegment first, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawRangeElementArrayAPPLE)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawRangeElementArrayAPPLE");
        try { Handles.MH_glMultiDrawRangeElementArrayAPPLE.invokeExact(handles.PFN_glMultiDrawRangeElementArrayAPPLE, mode, start, end, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawRangeElementArrayAPPLE", e); }
    }

}
