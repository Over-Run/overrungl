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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBInvalidateSubdata {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glInvalidateTexSubImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glInvalidateTexImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glInvalidateBufferSubData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glInvalidateBufferData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glInvalidateFramebuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glInvalidateSubFramebuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glInvalidateTexSubImage,
            FD_glInvalidateTexImage,
            FD_glInvalidateBufferSubData,
            FD_glInvalidateBufferData,
            FD_glInvalidateFramebuffer,
            FD_glInvalidateSubFramebuffer
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glInvalidateTexSubImage = RuntimeHelper.downcall(Descriptors.FD_glInvalidateTexSubImage);
        public static final MethodHandle MH_glInvalidateTexImage = RuntimeHelper.downcall(Descriptors.FD_glInvalidateTexImage);
        public static final MethodHandle MH_glInvalidateBufferSubData = RuntimeHelper.downcall(Descriptors.FD_glInvalidateBufferSubData);
        public static final MethodHandle MH_glInvalidateBufferData = RuntimeHelper.downcall(Descriptors.FD_glInvalidateBufferData);
        public static final MethodHandle MH_glInvalidateFramebuffer = RuntimeHelper.downcall(Descriptors.FD_glInvalidateFramebuffer);
        public static final MethodHandle MH_glInvalidateSubFramebuffer = RuntimeHelper.downcall(Descriptors.FD_glInvalidateSubFramebuffer);
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

    public void InvalidateTexSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateTexSubImage)) throw new SymbolNotFoundError("Symbol not found: glInvalidateTexSubImage");
        try { Handles.MH_glInvalidateTexSubImage.invokeExact(handles.PFN_glInvalidateTexSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateTexSubImage", e); }
    }

    public void InvalidateTexImage(@CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateTexImage)) throw new SymbolNotFoundError("Symbol not found: glInvalidateTexImage");
        try { Handles.MH_glInvalidateTexImage.invokeExact(handles.PFN_glInvalidateTexImage, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateTexImage", e); }
    }

    public void InvalidateBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateBufferSubData");
        try { Handles.MH_glInvalidateBufferSubData.invokeExact(handles.PFN_glInvalidateBufferSubData, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateBufferSubData", e); }
    }

    public void InvalidateBufferData(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateBufferData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateBufferData");
        try { Handles.MH_glInvalidateBufferData.invokeExact(handles.PFN_glInvalidateBufferData, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateBufferData", e); }
    }

    public void InvalidateFramebuffer(@CType("GLenum") int target, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glInvalidateFramebuffer");
        try { Handles.MH_glInvalidateFramebuffer.invokeExact(handles.PFN_glInvalidateFramebuffer, target, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateFramebuffer", e); }
    }

    public void InvalidateSubFramebuffer(@CType("GLenum") int target, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateSubFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glInvalidateSubFramebuffer");
        try { Handles.MH_glInvalidateSubFramebuffer.invokeExact(handles.PFN_glInvalidateSubFramebuffer, target, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateSubFramebuffer", e); }
    }

}
