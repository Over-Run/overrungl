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

public final class GLARBFramebufferObject {
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int GL_DEPTH_STENCIL = 0x84F9;
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
    public static final int GL_FRAMEBUFFER = 0x8D40;
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int GL_STENCIL_INDEX1 = 0x8D46;
    public static final int GL_STENCIL_INDEX4 = 0x8D47;
    public static final int GL_STENCIL_INDEX8 = 0x8D48;
    public static final int GL_STENCIL_INDEX16 = 0x8D49;
    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    public static final int GL_MAX_SAMPLES = 0x8D57;
    public static final int GL_INDEX = 0x8222;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glIsRenderbuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindRenderbuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteRenderbuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenRenderbuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRenderbufferStorage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetRenderbufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsFramebuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteFramebuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenFramebuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCheckFramebufferStatus = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferRenderbuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferAttachmentParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenerateMipmap = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlitFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRenderbufferStorageMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureLayer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glIsRenderbuffer;
        public final MemorySegment PFN_glBindRenderbuffer;
        public final MemorySegment PFN_glDeleteRenderbuffers;
        public final MemorySegment PFN_glGenRenderbuffers;
        public final MemorySegment PFN_glRenderbufferStorage;
        public final MemorySegment PFN_glGetRenderbufferParameteriv;
        public final MemorySegment PFN_glIsFramebuffer;
        public final MemorySegment PFN_glBindFramebuffer;
        public final MemorySegment PFN_glDeleteFramebuffers;
        public final MemorySegment PFN_glGenFramebuffers;
        public final MemorySegment PFN_glCheckFramebufferStatus;
        public final MemorySegment PFN_glFramebufferTexture1D;
        public final MemorySegment PFN_glFramebufferTexture2D;
        public final MemorySegment PFN_glFramebufferTexture3D;
        public final MemorySegment PFN_glFramebufferRenderbuffer;
        public final MemorySegment PFN_glGetFramebufferAttachmentParameteriv;
        public final MemorySegment PFN_glGenerateMipmap;
        public final MemorySegment PFN_glBlitFramebuffer;
        public final MemorySegment PFN_glRenderbufferStorageMultisample;
        public final MemorySegment PFN_glFramebufferTextureLayer;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glIsRenderbuffer = func.invoke("glIsRenderbuffer");
            PFN_glBindRenderbuffer = func.invoke("glBindRenderbuffer");
            PFN_glDeleteRenderbuffers = func.invoke("glDeleteRenderbuffers");
            PFN_glGenRenderbuffers = func.invoke("glGenRenderbuffers");
            PFN_glRenderbufferStorage = func.invoke("glRenderbufferStorage");
            PFN_glGetRenderbufferParameteriv = func.invoke("glGetRenderbufferParameteriv");
            PFN_glIsFramebuffer = func.invoke("glIsFramebuffer");
            PFN_glBindFramebuffer = func.invoke("glBindFramebuffer");
            PFN_glDeleteFramebuffers = func.invoke("glDeleteFramebuffers");
            PFN_glGenFramebuffers = func.invoke("glGenFramebuffers");
            PFN_glCheckFramebufferStatus = func.invoke("glCheckFramebufferStatus");
            PFN_glFramebufferTexture1D = func.invoke("glFramebufferTexture1D");
            PFN_glFramebufferTexture2D = func.invoke("glFramebufferTexture2D");
            PFN_glFramebufferTexture3D = func.invoke("glFramebufferTexture3D");
            PFN_glFramebufferRenderbuffer = func.invoke("glFramebufferRenderbuffer");
            PFN_glGetFramebufferAttachmentParameteriv = func.invoke("glGetFramebufferAttachmentParameteriv");
            PFN_glGenerateMipmap = func.invoke("glGenerateMipmap");
            PFN_glBlitFramebuffer = func.invoke("glBlitFramebuffer");
            PFN_glRenderbufferStorageMultisample = func.invoke("glRenderbufferStorageMultisample");
            PFN_glFramebufferTextureLayer = func.invoke("glFramebufferTextureLayer");
        }
    }

    public GLARBFramebufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// GLboolean glIsRenderbuffer((unsigned int) GLuint renderbuffer);
    /// ```
    public boolean IsRenderbuffer(int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glIsRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsRenderbuffer", renderbuffer); }
        return (((byte) Handles.MH_glIsRenderbuffer.invokeExact(handles.PFN_glIsRenderbuffer, renderbuffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsRenderbuffer", e); }
    }

    /// ```
    /// void glBindRenderbuffer((unsigned int) GLenum target, (unsigned int) GLuint renderbuffer);
    /// ```
    public void BindRenderbuffer(int target, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindRenderbuffer", target, renderbuffer); }
        Handles.MH_glBindRenderbuffer.invokeExact(handles.PFN_glBindRenderbuffer, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindRenderbuffer", e); }
    }

    /// ```
    /// void glDeleteRenderbuffers((int) GLsizei n, const GLuint* renderbuffers);
    /// ```
    public void DeleteRenderbuffers(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteRenderbuffers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteRenderbuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteRenderbuffers", n, renderbuffers); }
        Handles.MH_glDeleteRenderbuffers.invokeExact(handles.PFN_glDeleteRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteRenderbuffers", e); }
    }

    /// ```
    /// void glGenRenderbuffers((int) GLsizei n, GLuint* renderbuffers);
    /// ```
    public void GenRenderbuffers(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenRenderbuffers)) throw new GLSymbolNotFoundError("Symbol not found: glGenRenderbuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenRenderbuffers", n, renderbuffers); }
        Handles.MH_glGenRenderbuffers.invokeExact(handles.PFN_glGenRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenRenderbuffers", e); }
    }

    /// ```
    /// void glRenderbufferStorage((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorage(int target, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorage)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorage", target, internalformat, width, height); }
        Handles.MH_glRenderbufferStorage.invokeExact(handles.PFN_glRenderbufferStorage, target, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorage", e); }
    }

    /// ```
    /// void glGetRenderbufferParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetRenderbufferParameteriv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetRenderbufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetRenderbufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetRenderbufferParameteriv", target, pname, params); }
        Handles.MH_glGetRenderbufferParameteriv.invokeExact(handles.PFN_glGetRenderbufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetRenderbufferParameteriv", e); }
    }

    /// ```
    /// GLboolean glIsFramebuffer((unsigned int) GLuint framebuffer);
    /// ```
    public boolean IsFramebuffer(int framebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glIsFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsFramebuffer", framebuffer); }
        return (((byte) Handles.MH_glIsFramebuffer.invokeExact(handles.PFN_glIsFramebuffer, framebuffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFramebuffer", e); }
    }

    /// ```
    /// void glBindFramebuffer((unsigned int) GLenum target, (unsigned int) GLuint framebuffer);
    /// ```
    public void BindFramebuffer(int target, int framebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindFramebuffer", target, framebuffer); }
        Handles.MH_glBindFramebuffer.invokeExact(handles.PFN_glBindFramebuffer, target, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindFramebuffer", e); }
    }

    /// ```
    /// void glDeleteFramebuffers((int) GLsizei n, const GLuint* framebuffers);
    /// ```
    public void DeleteFramebuffers(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFramebuffers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteFramebuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteFramebuffers", n, framebuffers); }
        Handles.MH_glDeleteFramebuffers.invokeExact(handles.PFN_glDeleteFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFramebuffers", e); }
    }

    /// ```
    /// void glGenFramebuffers((int) GLsizei n, GLuint* framebuffers);
    /// ```
    public void GenFramebuffers(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFramebuffers)) throw new GLSymbolNotFoundError("Symbol not found: glGenFramebuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenFramebuffers", n, framebuffers); }
        Handles.MH_glGenFramebuffers.invokeExact(handles.PFN_glGenFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenFramebuffers", e); }
    }

    /// ```
    /// (unsigned int) GLenum glCheckFramebufferStatus((unsigned int) GLenum target);
    /// ```
    public int CheckFramebufferStatus(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCheckFramebufferStatus)) throw new GLSymbolNotFoundError("Symbol not found: glCheckFramebufferStatus");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCheckFramebufferStatus", target); }
        return (int) Handles.MH_glCheckFramebufferStatus.invokeExact(handles.PFN_glCheckFramebufferStatus, target); }
        catch (Throwable e) { throw new RuntimeException("error in CheckFramebufferStatus", e); }
    }

    /// ```
    /// void glFramebufferTexture1D((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture1D)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture1D", target, attachment, textarget, texture, level); }
        Handles.MH_glFramebufferTexture1D.invokeExact(handles.PFN_glFramebufferTexture1D, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture1D", e); }
    }

    /// ```
    /// void glFramebufferTexture2D((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture2D)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture2D", target, attachment, textarget, texture, level); }
        Handles.MH_glFramebufferTexture2D.invokeExact(handles.PFN_glFramebufferTexture2D, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture2D", e); }
    }

    /// ```
    /// void glFramebufferTexture3D((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level, (int) GLint zoffset);
    /// ```
    public void FramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int zoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture3D)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture3D", target, attachment, textarget, texture, level, zoffset); }
        Handles.MH_glFramebufferTexture3D.invokeExact(handles.PFN_glFramebufferTexture3D, target, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture3D", e); }
    }

    /// ```
    /// void glFramebufferRenderbuffer((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum renderbuffertarget, (unsigned int) GLuint renderbuffer);
    /// ```
    public void FramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferRenderbuffer", target, attachment, renderbuffertarget, renderbuffer); }
        Handles.MH_glFramebufferRenderbuffer.invokeExact(handles.PFN_glFramebufferRenderbuffer, target, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferRenderbuffer", e); }
    }

    /// ```
    /// void glGetFramebufferAttachmentParameteriv((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferAttachmentParameteriv(int target, int attachment, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferAttachmentParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferAttachmentParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFramebufferAttachmentParameteriv", target, attachment, pname, params); }
        Handles.MH_glGetFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetFramebufferAttachmentParameteriv, target, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferAttachmentParameteriv", e); }
    }

    /// ```
    /// void glGenerateMipmap((unsigned int) GLenum target);
    /// ```
    public void GenerateMipmap(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateMipmap)) throw new GLSymbolNotFoundError("Symbol not found: glGenerateMipmap");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenerateMipmap", target); }
        Handles.MH_glGenerateMipmap.invokeExact(handles.PFN_glGenerateMipmap, target); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateMipmap", e); }
    }

    /// ```
    /// void glBlitFramebuffer((int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBlitFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlitFramebuffer", srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        Handles.MH_glBlitFramebuffer.invokeExact(handles.PFN_glBlitFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitFramebuffer", e); }
    }

    /// ```
    /// void glRenderbufferStorageMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorageMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorageMultisample", target, samples, internalformat, width, height); }
        Handles.MH_glRenderbufferStorageMultisample.invokeExact(handles.PFN_glRenderbufferStorageMultisample, target, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorageMultisample", e); }
    }

    /// ```
    /// void glFramebufferTextureLayer((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void FramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureLayer)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureLayer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureLayer", target, attachment, texture, level, layer); }
        Handles.MH_glFramebufferTextureLayer.invokeExact(handles.PFN_glFramebufferTextureLayer, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureLayer", e); }
    }

}
