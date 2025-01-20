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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glIsRenderbuffer = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindRenderbuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteRenderbuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenRenderbuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glRenderbufferStorage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetRenderbufferParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsFramebuffer = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindFramebuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteFramebuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenFramebuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCheckFramebufferStatus = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTexture1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTexture2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTexture3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferRenderbuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFramebufferAttachmentParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenerateMipmap = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBlitFramebuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glRenderbufferStorageMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTextureLayer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glIsRenderbuffer,
            FD_glBindRenderbuffer,
            FD_glDeleteRenderbuffers,
            FD_glGenRenderbuffers,
            FD_glRenderbufferStorage,
            FD_glGetRenderbufferParameteriv,
            FD_glIsFramebuffer,
            FD_glBindFramebuffer,
            FD_glDeleteFramebuffers,
            FD_glGenFramebuffers,
            FD_glCheckFramebufferStatus,
            FD_glFramebufferTexture1D,
            FD_glFramebufferTexture2D,
            FD_glFramebufferTexture3D,
            FD_glFramebufferRenderbuffer,
            FD_glGetFramebufferAttachmentParameteriv,
            FD_glGenerateMipmap,
            FD_glBlitFramebuffer,
            FD_glRenderbufferStorageMultisample,
            FD_glFramebufferTextureLayer
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glIsRenderbuffer = RuntimeHelper.downcall(Descriptors.FD_glIsRenderbuffer);
        public static final MethodHandle MH_glBindRenderbuffer = RuntimeHelper.downcall(Descriptors.FD_glBindRenderbuffer);
        public static final MethodHandle MH_glDeleteRenderbuffers = RuntimeHelper.downcall(Descriptors.FD_glDeleteRenderbuffers);
        public static final MethodHandle MH_glGenRenderbuffers = RuntimeHelper.downcall(Descriptors.FD_glGenRenderbuffers);
        public static final MethodHandle MH_glRenderbufferStorage = RuntimeHelper.downcall(Descriptors.FD_glRenderbufferStorage);
        public static final MethodHandle MH_glGetRenderbufferParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetRenderbufferParameteriv);
        public static final MethodHandle MH_glIsFramebuffer = RuntimeHelper.downcall(Descriptors.FD_glIsFramebuffer);
        public static final MethodHandle MH_glBindFramebuffer = RuntimeHelper.downcall(Descriptors.FD_glBindFramebuffer);
        public static final MethodHandle MH_glDeleteFramebuffers = RuntimeHelper.downcall(Descriptors.FD_glDeleteFramebuffers);
        public static final MethodHandle MH_glGenFramebuffers = RuntimeHelper.downcall(Descriptors.FD_glGenFramebuffers);
        public static final MethodHandle MH_glCheckFramebufferStatus = RuntimeHelper.downcall(Descriptors.FD_glCheckFramebufferStatus);
        public static final MethodHandle MH_glFramebufferTexture1D = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture1D);
        public static final MethodHandle MH_glFramebufferTexture2D = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture2D);
        public static final MethodHandle MH_glFramebufferTexture3D = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture3D);
        public static final MethodHandle MH_glFramebufferRenderbuffer = RuntimeHelper.downcall(Descriptors.FD_glFramebufferRenderbuffer);
        public static final MethodHandle MH_glGetFramebufferAttachmentParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetFramebufferAttachmentParameteriv);
        public static final MethodHandle MH_glGenerateMipmap = RuntimeHelper.downcall(Descriptors.FD_glGenerateMipmap);
        public static final MethodHandle MH_glBlitFramebuffer = RuntimeHelper.downcall(Descriptors.FD_glBlitFramebuffer);
        public static final MethodHandle MH_glRenderbufferStorageMultisample = RuntimeHelper.downcall(Descriptors.FD_glRenderbufferStorageMultisample);
        public static final MethodHandle MH_glFramebufferTextureLayer = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTextureLayer);
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

    public @CType("GLboolean") boolean IsRenderbuffer(@CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsRenderbuffer)) throw new SymbolNotFoundError("Symbol not found: glIsRenderbuffer");
        try { return (boolean) Handles.MH_glIsRenderbuffer.invokeExact(handles.PFN_glIsRenderbuffer, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glIsRenderbuffer", e); }
    }

    public void BindRenderbuffer(@CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindRenderbuffer)) throw new SymbolNotFoundError("Symbol not found: glBindRenderbuffer");
        try { Handles.MH_glBindRenderbuffer.invokeExact(handles.PFN_glBindRenderbuffer, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindRenderbuffer", e); }
    }

    public void DeleteRenderbuffers(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteRenderbuffers)) throw new SymbolNotFoundError("Symbol not found: glDeleteRenderbuffers");
        try { Handles.MH_glDeleteRenderbuffers.invokeExact(handles.PFN_glDeleteRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteRenderbuffers", e); }
    }

    public void GenRenderbuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenRenderbuffers)) throw new SymbolNotFoundError("Symbol not found: glGenRenderbuffers");
        try { Handles.MH_glGenRenderbuffers.invokeExact(handles.PFN_glGenRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glGenRenderbuffers", e); }
    }

    public void RenderbufferStorage(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderbufferStorage)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorage");
        try { Handles.MH_glRenderbufferStorage.invokeExact(handles.PFN_glRenderbufferStorage, target, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorage", e); }
    }

    public void GetRenderbufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetRenderbufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetRenderbufferParameteriv");
        try { Handles.MH_glGetRenderbufferParameteriv.invokeExact(handles.PFN_glGetRenderbufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetRenderbufferParameteriv", e); }
    }

    public @CType("GLboolean") boolean IsFramebuffer(@CType("GLuint") int framebuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glIsFramebuffer");
        try { return (boolean) Handles.MH_glIsFramebuffer.invokeExact(handles.PFN_glIsFramebuffer, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glIsFramebuffer", e); }
    }

    public void BindFramebuffer(@CType("GLenum") int target, @CType("GLuint") int framebuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glBindFramebuffer");
        try { Handles.MH_glBindFramebuffer.invokeExact(handles.PFN_glBindFramebuffer, target, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindFramebuffer", e); }
    }

    public void DeleteFramebuffers(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteFramebuffers)) throw new SymbolNotFoundError("Symbol not found: glDeleteFramebuffers");
        try { Handles.MH_glDeleteFramebuffers.invokeExact(handles.PFN_glDeleteFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteFramebuffers", e); }
    }

    public void GenFramebuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenFramebuffers)) throw new SymbolNotFoundError("Symbol not found: glGenFramebuffers");
        try { Handles.MH_glGenFramebuffers.invokeExact(handles.PFN_glGenFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glGenFramebuffers", e); }
    }

    public @CType("GLenum") int CheckFramebufferStatus(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glCheckFramebufferStatus)) throw new SymbolNotFoundError("Symbol not found: glCheckFramebufferStatus");
        try { return (int) Handles.MH_glCheckFramebufferStatus.invokeExact(handles.PFN_glCheckFramebufferStatus, target); }
        catch (Throwable e) { throw new RuntimeException("error in glCheckFramebufferStatus", e); }
    }

    public void FramebufferTexture1D(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture1D)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture1D");
        try { Handles.MH_glFramebufferTexture1D.invokeExact(handles.PFN_glFramebufferTexture1D, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture1D", e); }
    }

    public void FramebufferTexture2D(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture2D)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture2D");
        try { Handles.MH_glFramebufferTexture2D.invokeExact(handles.PFN_glFramebufferTexture2D, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture2D", e); }
    }

    public void FramebufferTexture3D(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int zoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture3D)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture3D");
        try { Handles.MH_glFramebufferTexture3D.invokeExact(handles.PFN_glFramebufferTexture3D, target, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture3D", e); }
    }

    public void FramebufferRenderbuffer(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferRenderbuffer)) throw new SymbolNotFoundError("Symbol not found: glFramebufferRenderbuffer");
        try { Handles.MH_glFramebufferRenderbuffer.invokeExact(handles.PFN_glFramebufferRenderbuffer, target, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferRenderbuffer", e); }
    }

    public void GetFramebufferAttachmentParameteriv(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFramebufferAttachmentParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferAttachmentParameteriv");
        try { Handles.MH_glGetFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetFramebufferAttachmentParameteriv, target, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferAttachmentParameteriv", e); }
    }

    public void GenerateMipmap(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenerateMipmap)) throw new SymbolNotFoundError("Symbol not found: glGenerateMipmap");
        try { Handles.MH_glGenerateMipmap.invokeExact(handles.PFN_glGenerateMipmap, target); }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateMipmap", e); }
    }

    public void BlitFramebuffer(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlitFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glBlitFramebuffer");
        try { Handles.MH_glBlitFramebuffer.invokeExact(handles.PFN_glBlitFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in glBlitFramebuffer", e); }
    }

    public void RenderbufferStorageMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderbufferStorageMultisample)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisample");
        try { Handles.MH_glRenderbufferStorageMultisample.invokeExact(handles.PFN_glRenderbufferStorageMultisample, target, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageMultisample", e); }
    }

    public void FramebufferTextureLayer(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTextureLayer)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTextureLayer");
        try { Handles.MH_glFramebufferTextureLayer.invokeExact(handles.PFN_glFramebufferTextureLayer, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTextureLayer", e); }
    }

}
