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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_framebuffer_object}
 */
public interface GLEXTFramebufferObject {
    int GL_INVALID_FRAMEBUFFER_OPERATION_EXT = 0x0506;
    int GL_MAX_RENDERBUFFER_SIZE_EXT = 0x84E8;
    int GL_FRAMEBUFFER_BINDING_EXT = 0x8CA6;
    int GL_RENDERBUFFER_BINDING_EXT = 0x8CA7;
    int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_EXT = 0x8CD0;
    int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_EXT = 0x8CD1;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_EXT = 0x8CD2;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_EXT = 0x8CD3;
    int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_3D_ZOFFSET_EXT = 0x8CD4;
    int GL_FRAMEBUFFER_COMPLETE_EXT = 0x8CD5;
    int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_EXT = 0x8CD6;
    int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_EXT = 0x8CD7;
    int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_EXT = 0x8CD9;
    int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_EXT = 0x8CDA;
    int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER_EXT = 0x8CDB;
    int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER_EXT = 0x8CDC;
    int GL_FRAMEBUFFER_UNSUPPORTED_EXT = 0x8CDD;
    int GL_MAX_COLOR_ATTACHMENTS_EXT = 0x8CDF;
    int GL_COLOR_ATTACHMENT0_EXT = 0x8CE0;
    int GL_COLOR_ATTACHMENT1_EXT = 0x8CE1;
    int GL_COLOR_ATTACHMENT2_EXT = 0x8CE2;
    int GL_COLOR_ATTACHMENT3_EXT = 0x8CE3;
    int GL_COLOR_ATTACHMENT4_EXT = 0x8CE4;
    int GL_COLOR_ATTACHMENT5_EXT = 0x8CE5;
    int GL_COLOR_ATTACHMENT6_EXT = 0x8CE6;
    int GL_COLOR_ATTACHMENT7_EXT = 0x8CE7;
    int GL_COLOR_ATTACHMENT8_EXT = 0x8CE8;
    int GL_COLOR_ATTACHMENT9_EXT = 0x8CE9;
    int GL_COLOR_ATTACHMENT10_EXT = 0x8CEA;
    int GL_COLOR_ATTACHMENT11_EXT = 0x8CEB;
    int GL_COLOR_ATTACHMENT12_EXT = 0x8CEC;
    int GL_COLOR_ATTACHMENT13_EXT = 0x8CED;
    int GL_COLOR_ATTACHMENT14_EXT = 0x8CEE;
    int GL_COLOR_ATTACHMENT15_EXT = 0x8CEF;
    int GL_DEPTH_ATTACHMENT_EXT = 0x8D00;
    int GL_STENCIL_ATTACHMENT_EXT = 0x8D20;
    int GL_FRAMEBUFFER_EXT = 0x8D40;
    int GL_RENDERBUFFER_EXT = 0x8D41;
    int GL_RENDERBUFFER_WIDTH_EXT = 0x8D42;
    int GL_RENDERBUFFER_HEIGHT_EXT = 0x8D43;
    int GL_RENDERBUFFER_INTERNAL_FORMAT_EXT = 0x8D44;
    int GL_STENCIL_INDEX1_EXT = 0x8D46;
    int GL_STENCIL_INDEX4_EXT = 0x8D47;
    int GL_STENCIL_INDEX8_EXT = 0x8D48;
    int GL_STENCIL_INDEX16_EXT = 0x8D49;
    int GL_RENDERBUFFER_RED_SIZE_EXT = 0x8D50;
    int GL_RENDERBUFFER_GREEN_SIZE_EXT = 0x8D51;
    int GL_RENDERBUFFER_BLUE_SIZE_EXT = 0x8D52;
    int GL_RENDERBUFFER_ALPHA_SIZE_EXT = 0x8D53;
    int GL_RENDERBUFFER_DEPTH_SIZE_EXT = 0x8D54;
    int GL_RENDERBUFFER_STENCIL_SIZE_EXT = 0x8D55;

    default boolean glIsRenderbufferEXT(int renderbuffer) {
        throw new ContextException();
    }

    default void glBindRenderbufferEXT(int target, int renderbuffer) {
        throw new ContextException();
    }

    default void glDeleteRenderbuffersEXT(int n, @NativeType("const GLuint *") MemorySegment renderbuffers) {
        throw new ContextException();
    }

    default void glGenRenderbuffersEXT(int n, @NativeType("GLuint *") MemorySegment renderbuffers) {
        throw new ContextException();
    }

    default void glRenderbufferStorageEXT(int target, int internalformat, int width, int height) {
        throw new ContextException();
    }

    default void glGetRenderbufferParameterivEXT(int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default boolean glIsFramebufferEXT(int framebuffer) {
        throw new ContextException();
    }

    default void glBindFramebufferEXT(int target, int framebuffer) {
        throw new ContextException();
    }

    default void glDeleteFramebuffersEXT(int n, @NativeType("const GLuint *") MemorySegment framebuffers) {
        throw new ContextException();
    }

    default void glGenFramebuffersEXT(int n, @NativeType("GLuint *") MemorySegment framebuffers) {
        throw new ContextException();
    }

    default int glCheckFramebufferStatusEXT(int target) {
        throw new ContextException();
    }

    default void glFramebufferTexture1DEXT(int target, int attachment, int textarget, int texture, int level) {
        throw new ContextException();
    }

    default void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
        throw new ContextException();
    }

    default void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
        throw new ContextException();
    }

    default void glFramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        throw new ContextException();
    }

    default void glGetFramebufferAttachmentParameterivEXT(int target, int attachment, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGenerateMipmapEXT(int target) {
        throw new ContextException();
    }

}
