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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTFramebufferObject {
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 0x0506;
    public static final int GL_MAX_RENDERBUFFER_SIZE_EXT = 0x84E8;
    public static final int GL_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING_EXT = 0x8CA7;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT = 0x8CD4;
    public static final int GL_FRAMEBUFFER_COMPLETE_EXT = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT = 0x8CD9;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT = 0x8CDA;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED_EXT = 0x8CDD;
    public static final int GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF;
    public static final int GL_COLOR_ATTACHMENT0_EXT = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1_EXT = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2_EXT = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3_EXT = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4_EXT = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5_EXT = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6_EXT = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7_EXT = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8_EXT = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9_EXT = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10_EXT = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11_EXT = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12_EXT = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13_EXT = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14_EXT = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15_EXT = 0x8CEF;
    public static final int GL_DEPTH_ATTACHMENT_EXT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT_EXT = 0x8D20;
    public static final int GL_FRAMEBUFFER_EXT = 0x8D40;
    public static final int GL_RENDERBUFFER_EXT = 0x8D41;
    public static final int GL_RENDERBUFFER_WIDTH_EXT = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT_EXT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = 0x8D44;
    public static final int GL_STENCIL_INDEX1_EXT = 0x8D46;
    public static final int GL_STENCIL_INDEX4_EXT = 0x8D47;
    public static final int GL_STENCIL_INDEX8_EXT = 0x8D48;
    public static final int GL_STENCIL_INDEX16_EXT = 0x8D49;
    public static final int GL_RENDERBUFFER_RED_SIZE_EXT = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE_EXT = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE_EXT = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE_EXT = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE_EXT = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE_EXT = 0x8D55;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glIsRenderbufferEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindRenderbufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteRenderbuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenRenderbuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glRenderbufferStorageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetRenderbufferParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsFramebufferEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindFramebufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteFramebuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenFramebuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCheckFramebufferStatusEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTexture1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTexture2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferTexture3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferRenderbufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFramebufferAttachmentParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenerateMipmapEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glIsRenderbufferEXT,
            FD_glBindRenderbufferEXT,
            FD_glDeleteRenderbuffersEXT,
            FD_glGenRenderbuffersEXT,
            FD_glRenderbufferStorageEXT,
            FD_glGetRenderbufferParameterivEXT,
            FD_glIsFramebufferEXT,
            FD_glBindFramebufferEXT,
            FD_glDeleteFramebuffersEXT,
            FD_glGenFramebuffersEXT,
            FD_glCheckFramebufferStatusEXT,
            FD_glFramebufferTexture1DEXT,
            FD_glFramebufferTexture2DEXT,
            FD_glFramebufferTexture3DEXT,
            FD_glFramebufferRenderbufferEXT,
            FD_glGetFramebufferAttachmentParameterivEXT,
            FD_glGenerateMipmapEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glIsRenderbufferEXT = RuntimeHelper.downcall(Descriptors.FD_glIsRenderbufferEXT);
        public static final MethodHandle MH_glBindRenderbufferEXT = RuntimeHelper.downcall(Descriptors.FD_glBindRenderbufferEXT);
        public static final MethodHandle MH_glDeleteRenderbuffersEXT = RuntimeHelper.downcall(Descriptors.FD_glDeleteRenderbuffersEXT);
        public static final MethodHandle MH_glGenRenderbuffersEXT = RuntimeHelper.downcall(Descriptors.FD_glGenRenderbuffersEXT);
        public static final MethodHandle MH_glRenderbufferStorageEXT = RuntimeHelper.downcall(Descriptors.FD_glRenderbufferStorageEXT);
        public static final MethodHandle MH_glGetRenderbufferParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetRenderbufferParameterivEXT);
        public static final MethodHandle MH_glIsFramebufferEXT = RuntimeHelper.downcall(Descriptors.FD_glIsFramebufferEXT);
        public static final MethodHandle MH_glBindFramebufferEXT = RuntimeHelper.downcall(Descriptors.FD_glBindFramebufferEXT);
        public static final MethodHandle MH_glDeleteFramebuffersEXT = RuntimeHelper.downcall(Descriptors.FD_glDeleteFramebuffersEXT);
        public static final MethodHandle MH_glGenFramebuffersEXT = RuntimeHelper.downcall(Descriptors.FD_glGenFramebuffersEXT);
        public static final MethodHandle MH_glCheckFramebufferStatusEXT = RuntimeHelper.downcall(Descriptors.FD_glCheckFramebufferStatusEXT);
        public static final MethodHandle MH_glFramebufferTexture1DEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture1DEXT);
        public static final MethodHandle MH_glFramebufferTexture2DEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture2DEXT);
        public static final MethodHandle MH_glFramebufferTexture3DEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferTexture3DEXT);
        public static final MethodHandle MH_glFramebufferRenderbufferEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferRenderbufferEXT);
        public static final MethodHandle MH_glGetFramebufferAttachmentParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetFramebufferAttachmentParameterivEXT);
        public static final MethodHandle MH_glGenerateMipmapEXT = RuntimeHelper.downcall(Descriptors.FD_glGenerateMipmapEXT);
        public final MemorySegment PFN_glIsRenderbufferEXT;
        public final MemorySegment PFN_glBindRenderbufferEXT;
        public final MemorySegment PFN_glDeleteRenderbuffersEXT;
        public final MemorySegment PFN_glGenRenderbuffersEXT;
        public final MemorySegment PFN_glRenderbufferStorageEXT;
        public final MemorySegment PFN_glGetRenderbufferParameterivEXT;
        public final MemorySegment PFN_glIsFramebufferEXT;
        public final MemorySegment PFN_glBindFramebufferEXT;
        public final MemorySegment PFN_glDeleteFramebuffersEXT;
        public final MemorySegment PFN_glGenFramebuffersEXT;
        public final MemorySegment PFN_glCheckFramebufferStatusEXT;
        public final MemorySegment PFN_glFramebufferTexture1DEXT;
        public final MemorySegment PFN_glFramebufferTexture2DEXT;
        public final MemorySegment PFN_glFramebufferTexture3DEXT;
        public final MemorySegment PFN_glFramebufferRenderbufferEXT;
        public final MemorySegment PFN_glGetFramebufferAttachmentParameterivEXT;
        public final MemorySegment PFN_glGenerateMipmapEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glIsRenderbufferEXT = func.invoke("glIsRenderbufferEXT", "glIsRenderbuffer");
            PFN_glBindRenderbufferEXT = func.invoke("glBindRenderbufferEXT");
            PFN_glDeleteRenderbuffersEXT = func.invoke("glDeleteRenderbuffersEXT", "glDeleteRenderbuffers");
            PFN_glGenRenderbuffersEXT = func.invoke("glGenRenderbuffersEXT", "glGenRenderbuffers");
            PFN_glRenderbufferStorageEXT = func.invoke("glRenderbufferStorageEXT", "glRenderbufferStorage");
            PFN_glGetRenderbufferParameterivEXT = func.invoke("glGetRenderbufferParameterivEXT", "glGetRenderbufferParameteriv");
            PFN_glIsFramebufferEXT = func.invoke("glIsFramebufferEXT", "glIsFramebuffer");
            PFN_glBindFramebufferEXT = func.invoke("glBindFramebufferEXT");
            PFN_glDeleteFramebuffersEXT = func.invoke("glDeleteFramebuffersEXT", "glDeleteFramebuffers");
            PFN_glGenFramebuffersEXT = func.invoke("glGenFramebuffersEXT", "glGenFramebuffers");
            PFN_glCheckFramebufferStatusEXT = func.invoke("glCheckFramebufferStatusEXT", "glCheckFramebufferStatus");
            PFN_glFramebufferTexture1DEXT = func.invoke("glFramebufferTexture1DEXT", "glFramebufferTexture1D");
            PFN_glFramebufferTexture2DEXT = func.invoke("glFramebufferTexture2DEXT", "glFramebufferTexture2D");
            PFN_glFramebufferTexture3DEXT = func.invoke("glFramebufferTexture3DEXT", "glFramebufferTexture3D");
            PFN_glFramebufferRenderbufferEXT = func.invoke("glFramebufferRenderbufferEXT", "glFramebufferRenderbuffer");
            PFN_glGetFramebufferAttachmentParameterivEXT = func.invoke("glGetFramebufferAttachmentParameterivEXT", "glGetFramebufferAttachmentParameteriv");
            PFN_glGenerateMipmapEXT = func.invoke("glGenerateMipmapEXT", "glGenerateMipmap");
        }
    }

    public GLEXTFramebufferObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLboolean") boolean IsRenderbufferEXT(@CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glIsRenderbufferEXT");
        try { return (boolean) Handles.MH_glIsRenderbufferEXT.invokeExact(handles.PFN_glIsRenderbufferEXT, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glIsRenderbufferEXT", e); }
    }

    public void BindRenderbufferEXT(@CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glBindRenderbufferEXT");
        try { Handles.MH_glBindRenderbufferEXT.invokeExact(handles.PFN_glBindRenderbufferEXT, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindRenderbufferEXT", e); }
    }

    public void DeleteRenderbuffersEXT(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteRenderbuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteRenderbuffersEXT");
        try { Handles.MH_glDeleteRenderbuffersEXT.invokeExact(handles.PFN_glDeleteRenderbuffersEXT, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteRenderbuffersEXT", e); }
    }

    public void GenRenderbuffersEXT(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenRenderbuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glGenRenderbuffersEXT");
        try { Handles.MH_glGenRenderbuffersEXT.invokeExact(handles.PFN_glGenRenderbuffersEXT, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glGenRenderbuffersEXT", e); }
    }

    public void RenderbufferStorageEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderbufferStorageEXT)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageEXT");
        try { Handles.MH_glRenderbufferStorageEXT.invokeExact(handles.PFN_glRenderbufferStorageEXT, target, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageEXT", e); }
    }

    public void GetRenderbufferParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetRenderbufferParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetRenderbufferParameterivEXT");
        try { Handles.MH_glGetRenderbufferParameterivEXT.invokeExact(handles.PFN_glGetRenderbufferParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetRenderbufferParameterivEXT", e); }
    }

    public @CType("GLboolean") boolean IsFramebufferEXT(@CType("GLuint") int framebuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsFramebufferEXT)) throw new SymbolNotFoundError("Symbol not found: glIsFramebufferEXT");
        try { return (boolean) Handles.MH_glIsFramebufferEXT.invokeExact(handles.PFN_glIsFramebufferEXT, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glIsFramebufferEXT", e); }
    }

    public void BindFramebufferEXT(@CType("GLenum") int target, @CType("GLuint") int framebuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindFramebufferEXT)) throw new SymbolNotFoundError("Symbol not found: glBindFramebufferEXT");
        try { Handles.MH_glBindFramebufferEXT.invokeExact(handles.PFN_glBindFramebufferEXT, target, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glBindFramebufferEXT", e); }
    }

    public void DeleteFramebuffersEXT(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteFramebuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteFramebuffersEXT");
        try { Handles.MH_glDeleteFramebuffersEXT.invokeExact(handles.PFN_glDeleteFramebuffersEXT, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteFramebuffersEXT", e); }
    }

    public void GenFramebuffersEXT(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenFramebuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glGenFramebuffersEXT");
        try { Handles.MH_glGenFramebuffersEXT.invokeExact(handles.PFN_glGenFramebuffersEXT, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glGenFramebuffersEXT", e); }
    }

    public @CType("GLenum") int CheckFramebufferStatusEXT(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glCheckFramebufferStatusEXT)) throw new SymbolNotFoundError("Symbol not found: glCheckFramebufferStatusEXT");
        try { return (int) Handles.MH_glCheckFramebufferStatusEXT.invokeExact(handles.PFN_glCheckFramebufferStatusEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in glCheckFramebufferStatusEXT", e); }
    }

    public void FramebufferTexture1DEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture1DEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture1DEXT");
        try { Handles.MH_glFramebufferTexture1DEXT.invokeExact(handles.PFN_glFramebufferTexture1DEXT, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture1DEXT", e); }
    }

    public void FramebufferTexture2DEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture2DEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture2DEXT");
        try { Handles.MH_glFramebufferTexture2DEXT.invokeExact(handles.PFN_glFramebufferTexture2DEXT, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture2DEXT", e); }
    }

    public void FramebufferTexture3DEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int zoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferTexture3DEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture3DEXT");
        try { Handles.MH_glFramebufferTexture3DEXT.invokeExact(handles.PFN_glFramebufferTexture3DEXT, target, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture3DEXT", e); }
    }

    public void FramebufferRenderbufferEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferRenderbufferEXT");
        try { Handles.MH_glFramebufferRenderbufferEXT.invokeExact(handles.PFN_glFramebufferRenderbufferEXT, target, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferRenderbufferEXT", e); }
    }

    public void GetFramebufferAttachmentParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFramebufferAttachmentParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferAttachmentParameterivEXT");
        try { Handles.MH_glGetFramebufferAttachmentParameterivEXT.invokeExact(handles.PFN_glGetFramebufferAttachmentParameterivEXT, target, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferAttachmentParameterivEXT", e); }
    }

    public void GenerateMipmapEXT(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenerateMipmapEXT)) throw new SymbolNotFoundError("Symbol not found: glGenerateMipmapEXT");
        try { Handles.MH_glGenerateMipmapEXT.invokeExact(handles.PFN_glGenerateMipmapEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateMipmapEXT", e); }
    }

}
