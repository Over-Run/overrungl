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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAPPLEElementArray {
    public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
    public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
    public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glElementPointerAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDrawElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawRangeElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawRangeElementArrayAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
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

    /// ```
    /// void glElementPointerAPPLE((unsigned int) GLenum type, const void* pointer);
    /// ```
    public void ElementPointerAPPLE(int type, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glElementPointerAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glElementPointerAPPLE");
        try { Handles.MH_glElementPointerAPPLE.invokeExact(handles.PFN_glElementPointerAPPLE, type, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ElementPointerAPPLE", e); }
    }

    /// ```
    /// void glDrawElementArrayAPPLE((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawElementArrayAPPLE(int mode, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementArrayAPPLE");
        try { Handles.MH_glDrawElementArrayAPPLE.invokeExact(handles.PFN_glDrawElementArrayAPPLE, mode, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementArrayAPPLE", e); }
    }

    /// ```
    /// void glDrawRangeElementArrayAPPLE((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, (int) GLint first, (int) GLsizei count);
    /// ```
    public void DrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawRangeElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glDrawRangeElementArrayAPPLE");
        try { Handles.MH_glDrawRangeElementArrayAPPLE.invokeExact(handles.PFN_glDrawRangeElementArrayAPPLE, mode, start, end, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in DrawRangeElementArrayAPPLE", e); }
    }

    /// ```
    /// void glMultiDrawElementArrayAPPLE((unsigned int) GLenum mode, const GLint* first, const GLsizei* count, (int) GLsizei primcount);
    /// ```
    public void MultiDrawElementArrayAPPLE(int mode, MemorySegment first, MemorySegment count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawElementArrayAPPLE");
        try { Handles.MH_glMultiDrawElementArrayAPPLE.invokeExact(handles.PFN_glMultiDrawElementArrayAPPLE, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementArrayAPPLE", e); }
    }

    /// ```
    /// void glMultiDrawRangeElementArrayAPPLE((unsigned int) GLenum mode, (unsigned int) GLuint start, (unsigned int) GLuint end, const GLint* first, const GLsizei* count, (int) GLsizei primcount);
    /// ```
    public void MultiDrawRangeElementArrayAPPLE(int mode, int start, int end, MemorySegment first, MemorySegment count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawRangeElementArrayAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glMultiDrawRangeElementArrayAPPLE");
        try { Handles.MH_glMultiDrawRangeElementArrayAPPLE.invokeExact(handles.PFN_glMultiDrawRangeElementArrayAPPLE, mode, start, end, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawRangeElementArrayAPPLE", e); }
    }

}
