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
    public static final class Handles {
        public static final MethodHandle MH_glIsRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteRenderbuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenRenderbuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRenderbufferStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetRenderbufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsFramebufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindFramebufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteFramebuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenFramebuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCheckFramebufferStatusEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferAttachmentParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenerateMipmapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
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

    /// ```
    /// GLboolean glIsRenderbufferEXT((unsigned int) GLuint renderbuffer);
    /// ```
    public boolean IsRenderbufferEXT(int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glIsRenderbufferEXT");
        try { return (((byte) Handles.MH_glIsRenderbufferEXT.invokeExact(handles.PFN_glIsRenderbufferEXT, renderbuffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsRenderbufferEXT", e); }
    }

    /// ```
    /// void glBindRenderbufferEXT((unsigned int) GLenum target, (unsigned int) GLuint renderbuffer);
    /// ```
    public void BindRenderbufferEXT(int target, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glBindRenderbufferEXT");
        try { Handles.MH_glBindRenderbufferEXT.invokeExact(handles.PFN_glBindRenderbufferEXT, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindRenderbufferEXT", e); }
    }

    /// ```
    /// void glDeleteRenderbuffersEXT((int) GLsizei n, const GLuint* renderbuffers);
    /// ```
    public void DeleteRenderbuffersEXT(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteRenderbuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteRenderbuffersEXT");
        try { Handles.MH_glDeleteRenderbuffersEXT.invokeExact(handles.PFN_glDeleteRenderbuffersEXT, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteRenderbuffersEXT", e); }
    }

    /// ```
    /// void glGenRenderbuffersEXT((int) GLsizei n, GLuint* renderbuffers);
    /// ```
    public void GenRenderbuffersEXT(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenRenderbuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glGenRenderbuffersEXT");
        try { Handles.MH_glGenRenderbuffersEXT.invokeExact(handles.PFN_glGenRenderbuffersEXT, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenRenderbuffersEXT", e); }
    }

    /// ```
    /// void glRenderbufferStorageEXT((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorageEXT(int target, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorageEXT)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageEXT");
        try { Handles.MH_glRenderbufferStorageEXT.invokeExact(handles.PFN_glRenderbufferStorageEXT, target, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorageEXT", e); }
    }

    /// ```
    /// void glGetRenderbufferParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetRenderbufferParameterivEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetRenderbufferParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetRenderbufferParameterivEXT");
        try { Handles.MH_glGetRenderbufferParameterivEXT.invokeExact(handles.PFN_glGetRenderbufferParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetRenderbufferParameterivEXT", e); }
    }

    /// ```
    /// GLboolean glIsFramebufferEXT((unsigned int) GLuint framebuffer);
    /// ```
    public boolean IsFramebufferEXT(int framebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFramebufferEXT)) throw new SymbolNotFoundError("Symbol not found: glIsFramebufferEXT");
        try { return (((byte) Handles.MH_glIsFramebufferEXT.invokeExact(handles.PFN_glIsFramebufferEXT, framebuffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFramebufferEXT", e); }
    }

    /// ```
    /// void glBindFramebufferEXT((unsigned int) GLenum target, (unsigned int) GLuint framebuffer);
    /// ```
    public void BindFramebufferEXT(int target, int framebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFramebufferEXT)) throw new SymbolNotFoundError("Symbol not found: glBindFramebufferEXT");
        try { Handles.MH_glBindFramebufferEXT.invokeExact(handles.PFN_glBindFramebufferEXT, target, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindFramebufferEXT", e); }
    }

    /// ```
    /// void glDeleteFramebuffersEXT((int) GLsizei n, const GLuint* framebuffers);
    /// ```
    public void DeleteFramebuffersEXT(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFramebuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glDeleteFramebuffersEXT");
        try { Handles.MH_glDeleteFramebuffersEXT.invokeExact(handles.PFN_glDeleteFramebuffersEXT, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFramebuffersEXT", e); }
    }

    /// ```
    /// void glGenFramebuffersEXT((int) GLsizei n, GLuint* framebuffers);
    /// ```
    public void GenFramebuffersEXT(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFramebuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glGenFramebuffersEXT");
        try { Handles.MH_glGenFramebuffersEXT.invokeExact(handles.PFN_glGenFramebuffersEXT, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenFramebuffersEXT", e); }
    }

    /// ```
    /// (unsigned int) GLenum glCheckFramebufferStatusEXT((unsigned int) GLenum target);
    /// ```
    public int CheckFramebufferStatusEXT(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCheckFramebufferStatusEXT)) throw new SymbolNotFoundError("Symbol not found: glCheckFramebufferStatusEXT");
        try { return (int) Handles.MH_glCheckFramebufferStatusEXT.invokeExact(handles.PFN_glCheckFramebufferStatusEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in CheckFramebufferStatusEXT", e); }
    }

    /// ```
    /// void glFramebufferTexture1DEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture1DEXT(int target, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture1DEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture1DEXT");
        try { Handles.MH_glFramebufferTexture1DEXT.invokeExact(handles.PFN_glFramebufferTexture1DEXT, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture1DEXT", e); }
    }

    /// ```
    /// void glFramebufferTexture2DEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture2DEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture2DEXT");
        try { Handles.MH_glFramebufferTexture2DEXT.invokeExact(handles.PFN_glFramebufferTexture2DEXT, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture2DEXT", e); }
    }

    /// ```
    /// void glFramebufferTexture3DEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level, (int) GLint zoffset);
    /// ```
    public void FramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture3DEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture3DEXT");
        try { Handles.MH_glFramebufferTexture3DEXT.invokeExact(handles.PFN_glFramebufferTexture3DEXT, target, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture3DEXT", e); }
    }

    /// ```
    /// void glFramebufferRenderbufferEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum renderbuffertarget, (unsigned int) GLuint renderbuffer);
    /// ```
    public void FramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferRenderbufferEXT");
        try { Handles.MH_glFramebufferRenderbufferEXT.invokeExact(handles.PFN_glFramebufferRenderbufferEXT, target, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferRenderbufferEXT", e); }
    }

    /// ```
    /// void glGetFramebufferAttachmentParameterivEXT((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferAttachmentParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferAttachmentParameterivEXT");
        try { Handles.MH_glGetFramebufferAttachmentParameterivEXT.invokeExact(handles.PFN_glGetFramebufferAttachmentParameterivEXT, target, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferAttachmentParameterivEXT", e); }
    }

    /// ```
    /// void glGenerateMipmapEXT((unsigned int) GLenum target);
    /// ```
    public void GenerateMipmapEXT(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateMipmapEXT)) throw new SymbolNotFoundError("Symbol not found: glGenerateMipmapEXT");
        try { Handles.MH_glGenerateMipmapEXT.invokeExact(handles.PFN_glGenerateMipmapEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateMipmapEXT", e); }
    }

}
