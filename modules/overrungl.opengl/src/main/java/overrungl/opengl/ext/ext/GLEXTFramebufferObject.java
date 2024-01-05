/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_framebuffer_object}
 */
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
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_framebuffer_object) return;
        ext.glIsRenderbufferEXT = load.invoke("glIsRenderbufferEXT", of(JAVA_BYTE, JAVA_INT));
        ext.glBindRenderbufferEXT = load.invoke("glBindRenderbufferEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteRenderbuffersEXT = load.invoke("glDeleteRenderbuffersEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenRenderbuffersEXT = load.invoke("glGenRenderbuffersEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glRenderbufferStorageEXT = load.invoke("glRenderbufferStorageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetRenderbufferParameterivEXT = load.invoke("glGetRenderbufferParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glIsFramebufferEXT = load.invoke("glIsFramebufferEXT", of(JAVA_BYTE, JAVA_INT));
        ext.glBindFramebufferEXT = load.invoke("glBindFramebufferEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDeleteFramebuffersEXT = load.invoke("glDeleteFramebuffersEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glGenFramebuffersEXT = load.invoke("glGenFramebuffersEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glCheckFramebufferStatusEXT = load.invoke("glCheckFramebufferStatusEXT", of(JAVA_INT, JAVA_INT));
        ext.glFramebufferTexture1DEXT = load.invoke("glFramebufferTexture1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferTexture2DEXT = load.invoke("glFramebufferTexture2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferTexture3DEXT = load.invoke("glFramebufferTexture3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFramebufferRenderbufferEXT = load.invoke("glFramebufferRenderbufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetFramebufferAttachmentParameterivEXT = load.invoke("glGetFramebufferAttachmentParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGenerateMipmapEXT = load.invoke("glGenerateMipmapEXT", ofVoid(JAVA_INT));
    }

    public static boolean glIsRenderbufferEXT(int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsRenderbufferEXT).invokeExact(renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindRenderbufferEXT(int target, int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindRenderbufferEXT).invokeExact(target, renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteRenderbuffersEXT(int n, @NativeType("const GLuint *") MemorySegment renderbuffers) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteRenderbuffersEXT).invokeExact(n, renderbuffers);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenRenderbuffersEXT(int n, @NativeType("GLuint *") MemorySegment renderbuffers) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenRenderbuffersEXT).invokeExact(n, renderbuffers);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glRenderbufferStorageEXT(int target, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glRenderbufferStorageEXT).invokeExact(target, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetRenderbufferParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetRenderbufferParameterivEXT).invokeExact(target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsFramebufferEXT(int framebuffer) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsFramebufferEXT).invokeExact(framebuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindFramebufferEXT(int target, int framebuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindFramebufferEXT).invokeExact(target, framebuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteFramebuffersEXT(int n, @NativeType("const GLuint *") MemorySegment framebuffers) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteFramebuffersEXT).invokeExact(n, framebuffers);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenFramebuffersEXT(int n, @NativeType("GLuint *") MemorySegment framebuffers) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenFramebuffersEXT).invokeExact(n, framebuffers);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glCheckFramebufferStatusEXT(int target) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glCheckFramebufferStatusEXT).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTexture1DEXT(int target, int attachment, int textarget, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTexture1DEXT).invokeExact(target, attachment, textarget, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTexture2DEXT).invokeExact(target, attachment, textarget, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferTexture3DEXT).invokeExact(target, attachment, textarget, texture, level, zoffset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferRenderbufferEXT).invokeExact(target, attachment, renderbuffertarget, renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFramebufferAttachmentParameterivEXT).invokeExact(target, attachment, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenerateMipmapEXT(int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenerateMipmapEXT).invokeExact(target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
