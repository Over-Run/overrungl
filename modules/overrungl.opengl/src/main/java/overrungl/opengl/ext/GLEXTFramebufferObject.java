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
    public static final MethodHandle MH_glIsRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsRenderbufferEXT;
    public static final MethodHandle MH_glBindRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindRenderbufferEXT;
    public static final MethodHandle MH_glDeleteRenderbuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteRenderbuffersEXT;
    public static final MethodHandle MH_glGenRenderbuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenRenderbuffersEXT;
    public static final MethodHandle MH_glRenderbufferStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRenderbufferStorageEXT;
    public static final MethodHandle MH_glGetRenderbufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetRenderbufferParameterivEXT;
    public static final MethodHandle MH_glIsFramebufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsFramebufferEXT;
    public static final MethodHandle MH_glBindFramebufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindFramebufferEXT;
    public static final MethodHandle MH_glDeleteFramebuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteFramebuffersEXT;
    public static final MethodHandle MH_glGenFramebuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenFramebuffersEXT;
    public static final MethodHandle MH_glCheckFramebufferStatusEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCheckFramebufferStatusEXT;
    public static final MethodHandle MH_glFramebufferTexture1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture1DEXT;
    public static final MethodHandle MH_glFramebufferTexture2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture2DEXT;
    public static final MethodHandle MH_glFramebufferTexture3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture3DEXT;
    public static final MethodHandle MH_glFramebufferRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferRenderbufferEXT;
    public static final MethodHandle MH_glGetFramebufferAttachmentParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFramebufferAttachmentParameterivEXT;
    public static final MethodHandle MH_glGenerateMipmapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenerateMipmapEXT;

    public GLEXTFramebufferObject(overrungl.opengl.GLLoadFunc func) {
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

    public @CType("GLboolean") boolean IsRenderbufferEXT(@CType("GLuint") int renderbuffer) {
        if (!Unmarshal.isNullPointer(PFN_glIsRenderbufferEXT)) { try {
            return (boolean) MH_glIsRenderbufferEXT.invokeExact(PFN_glIsRenderbufferEXT, renderbuffer);
        } catch (Throwable e) { throw new RuntimeException("error in glIsRenderbufferEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsRenderbufferEXT"); }
    }

    public void BindRenderbufferEXT(@CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        if (!Unmarshal.isNullPointer(PFN_glBindRenderbufferEXT)) { try {
            MH_glBindRenderbufferEXT.invokeExact(PFN_glBindRenderbufferEXT, target, renderbuffer);
        } catch (Throwable e) { throw new RuntimeException("error in glBindRenderbufferEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindRenderbufferEXT"); }
    }

    public void DeleteRenderbuffersEXT(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteRenderbuffersEXT)) { try {
            MH_glDeleteRenderbuffersEXT.invokeExact(PFN_glDeleteRenderbuffersEXT, n, renderbuffers);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteRenderbuffersEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteRenderbuffersEXT"); }
    }

    public void GenRenderbuffersEXT(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (!Unmarshal.isNullPointer(PFN_glGenRenderbuffersEXT)) { try {
            MH_glGenRenderbuffersEXT.invokeExact(PFN_glGenRenderbuffersEXT, n, renderbuffers);
        } catch (Throwable e) { throw new RuntimeException("error in glGenRenderbuffersEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenRenderbuffersEXT"); }
    }

    public void RenderbufferStorageEXT(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glRenderbufferStorageEXT)) { try {
            MH_glRenderbufferStorageEXT.invokeExact(PFN_glRenderbufferStorageEXT, target, internalformat, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageEXT"); }
    }

    public void GetRenderbufferParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetRenderbufferParameterivEXT)) { try {
            MH_glGetRenderbufferParameterivEXT.invokeExact(PFN_glGetRenderbufferParameterivEXT, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetRenderbufferParameterivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetRenderbufferParameterivEXT"); }
    }

    public @CType("GLboolean") boolean IsFramebufferEXT(@CType("GLuint") int framebuffer) {
        if (!Unmarshal.isNullPointer(PFN_glIsFramebufferEXT)) { try {
            return (boolean) MH_glIsFramebufferEXT.invokeExact(PFN_glIsFramebufferEXT, framebuffer);
        } catch (Throwable e) { throw new RuntimeException("error in glIsFramebufferEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsFramebufferEXT"); }
    }

    public void BindFramebufferEXT(@CType("GLenum") int target, @CType("GLuint") int framebuffer) {
        if (!Unmarshal.isNullPointer(PFN_glBindFramebufferEXT)) { try {
            MH_glBindFramebufferEXT.invokeExact(PFN_glBindFramebufferEXT, target, framebuffer);
        } catch (Throwable e) { throw new RuntimeException("error in glBindFramebufferEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindFramebufferEXT"); }
    }

    public void DeleteFramebuffersEXT(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteFramebuffersEXT)) { try {
            MH_glDeleteFramebuffersEXT.invokeExact(PFN_glDeleteFramebuffersEXT, n, framebuffers);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteFramebuffersEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteFramebuffersEXT"); }
    }

    public void GenFramebuffersEXT(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (!Unmarshal.isNullPointer(PFN_glGenFramebuffersEXT)) { try {
            MH_glGenFramebuffersEXT.invokeExact(PFN_glGenFramebuffersEXT, n, framebuffers);
        } catch (Throwable e) { throw new RuntimeException("error in glGenFramebuffersEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenFramebuffersEXT"); }
    }

    public @CType("GLenum") int CheckFramebufferStatusEXT(@CType("GLenum") int target) {
        if (!Unmarshal.isNullPointer(PFN_glCheckFramebufferStatusEXT)) { try {
            return (int) MH_glCheckFramebufferStatusEXT.invokeExact(PFN_glCheckFramebufferStatusEXT, target);
        } catch (Throwable e) { throw new RuntimeException("error in glCheckFramebufferStatusEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCheckFramebufferStatusEXT"); }
    }

    public void FramebufferTexture1DEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture1DEXT)) { try {
            MH_glFramebufferTexture1DEXT.invokeExact(PFN_glFramebufferTexture1DEXT, target, attachment, textarget, texture, level);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture1DEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture1DEXT"); }
    }

    public void FramebufferTexture2DEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture2DEXT)) { try {
            MH_glFramebufferTexture2DEXT.invokeExact(PFN_glFramebufferTexture2DEXT, target, attachment, textarget, texture, level);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture2DEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture2DEXT"); }
    }

    public void FramebufferTexture3DEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int zoffset) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture3DEXT)) { try {
            MH_glFramebufferTexture3DEXT.invokeExact(PFN_glFramebufferTexture3DEXT, target, attachment, textarget, texture, level, zoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture3DEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferTexture3DEXT"); }
    }

    public void FramebufferRenderbufferEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        if (!Unmarshal.isNullPointer(PFN_glFramebufferRenderbufferEXT)) { try {
            MH_glFramebufferRenderbufferEXT.invokeExact(PFN_glFramebufferRenderbufferEXT, target, attachment, renderbuffertarget, renderbuffer);
        } catch (Throwable e) { throw new RuntimeException("error in glFramebufferRenderbufferEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFramebufferRenderbufferEXT"); }
    }

    public void GetFramebufferAttachmentParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetFramebufferAttachmentParameterivEXT)) { try {
            MH_glGetFramebufferAttachmentParameterivEXT.invokeExact(PFN_glGetFramebufferAttachmentParameterivEXT, target, attachment, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferAttachmentParameterivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetFramebufferAttachmentParameterivEXT"); }
    }

    public void GenerateMipmapEXT(@CType("GLenum") int target) {
        if (!Unmarshal.isNullPointer(PFN_glGenerateMipmapEXT)) { try {
            MH_glGenerateMipmapEXT.invokeExact(PFN_glGenerateMipmapEXT, target);
        } catch (Throwable e) { throw new RuntimeException("error in glGenerateMipmapEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenerateMipmapEXT"); }
    }

}
