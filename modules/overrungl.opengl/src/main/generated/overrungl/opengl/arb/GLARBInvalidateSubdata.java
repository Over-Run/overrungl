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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBInvalidateSubdata {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glInvalidateTexSubImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateTexImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glInvalidateBufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glInvalidateSubFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glInvalidateTexSubImage;
        public final MemorySegment PFN_glInvalidateTexImage;
        public final MemorySegment PFN_glInvalidateBufferSubData;
        public final MemorySegment PFN_glInvalidateBufferData;
        public final MemorySegment PFN_glInvalidateFramebuffer;
        public final MemorySegment PFN_glInvalidateSubFramebuffer;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glInvalidateTexSubImage = func.invoke("glInvalidateTexSubImage");
            PFN_glInvalidateTexImage = func.invoke("glInvalidateTexImage");
            PFN_glInvalidateBufferSubData = func.invoke("glInvalidateBufferSubData");
            PFN_glInvalidateBufferData = func.invoke("glInvalidateBufferData");
            PFN_glInvalidateFramebuffer = func.invoke("glInvalidateFramebuffer");
            PFN_glInvalidateSubFramebuffer = func.invoke("glInvalidateSubFramebuffer");
        }
    }

    public GLARBInvalidateSubdata(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glInvalidateTexSubImage((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void InvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateTexSubImage)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateTexSubImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateTexSubImage", texture, level, xoffset, yoffset, zoffset, width, height, depth); }
        Handles.MH_glInvalidateTexSubImage.invokeExact(handles.PFN_glInvalidateTexSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateTexSubImage", e); }
    }

    /// ```
    /// void glInvalidateTexImage((unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void InvalidateTexImage(int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateTexImage)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateTexImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateTexImage", texture, level); }
        Handles.MH_glInvalidateTexImage.invokeExact(handles.PFN_glInvalidateTexImage, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateTexImage", e); }
    }

    /// ```
    /// void glInvalidateBufferSubData((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void InvalidateBufferSubData(int buffer, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateBufferSubData", buffer, offset, length); }
        Handles.MH_glInvalidateBufferSubData.invokeExact(handles.PFN_glInvalidateBufferSubData, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateBufferSubData", e); }
    }

    /// ```
    /// void glInvalidateBufferData((unsigned int) GLuint buffer);
    /// ```
    public void InvalidateBufferData(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateBufferData)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateBufferData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateBufferData", buffer); }
        Handles.MH_glInvalidateBufferData.invokeExact(handles.PFN_glInvalidateBufferData, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateBufferData", e); }
    }

    /// ```
    /// void glInvalidateFramebuffer((unsigned int) GLenum target, (int) GLsizei numAttachments, const GLenum* attachments);
    /// ```
    public void InvalidateFramebuffer(int target, int numAttachments, MemorySegment attachments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateFramebuffer", target, numAttachments, attachments); }
        Handles.MH_glInvalidateFramebuffer.invokeExact(handles.PFN_glInvalidateFramebuffer, target, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateFramebuffer", e); }
    }

    /// ```
    /// void glInvalidateSubFramebuffer((unsigned int) GLenum target, (int) GLsizei numAttachments, const GLenum* attachments, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void InvalidateSubFramebuffer(int target, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateSubFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateSubFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateSubFramebuffer", target, numAttachments, attachments, x, y, width, height); }
        Handles.MH_glInvalidateSubFramebuffer.invokeExact(handles.PFN_glInvalidateSubFramebuffer, target, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateSubFramebuffer", e); }
    }

}
