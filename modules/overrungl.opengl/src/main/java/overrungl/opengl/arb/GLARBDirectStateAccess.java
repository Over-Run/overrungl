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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBDirectStateAccess {
    public static final int GL_TEXTURE_TARGET = 0x1006;
    public static final int GL_QUERY_TARGET = 0x82EA;
    public static final int GL_TEXTURE_BINDING_1D = 0x8068;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D = 0x8069;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
    public static final int GL_TEXTURE_BINDING_3D = 0x806A;
    public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
    public static final MethodHandle MH_glCreateTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateTransformFeedbacks;
    public static final MethodHandle MH_glTransformFeedbackBufferBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTransformFeedbackBufferBase;
    public static final MethodHandle MH_glTransformFeedbackBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glTransformFeedbackBufferRange;
    public static final MethodHandle MH_glGetTransformFeedbackiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTransformFeedbackiv;
    public static final MethodHandle MH_glGetTransformFeedbacki_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTransformFeedbacki_v;
    public static final MethodHandle MH_glGetTransformFeedbacki64_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTransformFeedbacki64_v;
    public static final MethodHandle MH_glCreateBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateBuffers;
    public static final MethodHandle MH_glNamedBufferStorage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedBufferStorage;
    public static final MethodHandle MH_glNamedBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedBufferData;
    public static final MethodHandle MH_glNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedBufferSubData;
    public static final MethodHandle MH_glCopyNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glCopyNamedBufferSubData;
    public static final MethodHandle MH_glClearNamedBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedBufferData;
    public static final MethodHandle MH_glClearNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedBufferSubData;
    public static final MethodHandle MH_glMapNamedBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapNamedBuffer;
    public static final MethodHandle MH_glMapNamedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapNamedBufferRange;
    public static final MethodHandle MH_glUnmapNamedBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUnmapNamedBuffer;
    public static final MethodHandle MH_glFlushMappedNamedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glFlushMappedNamedBufferRange;
    public static final MethodHandle MH_glGetNamedBufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferParameteriv;
    public static final MethodHandle MH_glGetNamedBufferParameteri64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferParameteri64v;
    public static final MethodHandle MH_glGetNamedBufferPointerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferPointerv;
    public static final MethodHandle MH_glGetNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferSubData;
    public static final MethodHandle MH_glCreateFramebuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateFramebuffers;
    public static final MethodHandle MH_glNamedFramebufferRenderbuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferRenderbuffer;
    public static final MethodHandle MH_glNamedFramebufferParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferParameteri;
    public static final MethodHandle MH_glNamedFramebufferTexture = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTexture;
    public static final MethodHandle MH_glNamedFramebufferTextureLayer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTextureLayer;
    public static final MethodHandle MH_glNamedFramebufferDrawBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferDrawBuffer;
    public static final MethodHandle MH_glNamedFramebufferDrawBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedFramebufferDrawBuffers;
    public static final MethodHandle MH_glNamedFramebufferReadBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferReadBuffer;
    public static final MethodHandle MH_glInvalidateNamedFramebufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glInvalidateNamedFramebufferData;
    public static final MethodHandle MH_glInvalidateNamedFramebufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glInvalidateNamedFramebufferSubData;
    public static final MethodHandle MH_glClearNamedFramebufferiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedFramebufferiv;
    public static final MethodHandle MH_glClearNamedFramebufferuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedFramebufferuiv;
    public static final MethodHandle MH_glClearNamedFramebufferfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedFramebufferfv;
    public static final MethodHandle MH_glClearNamedFramebufferfi = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClearNamedFramebufferfi;
    public static final MethodHandle MH_glBlitNamedFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlitNamedFramebuffer;
    public static final MethodHandle MH_glCheckNamedFramebufferStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCheckNamedFramebufferStatus;
    public static final MethodHandle MH_glGetNamedFramebufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedFramebufferParameteriv;
    public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedFramebufferAttachmentParameteriv;
    public static final MethodHandle MH_glCreateRenderbuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateRenderbuffers;
    public static final MethodHandle MH_glNamedRenderbufferStorage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedRenderbufferStorage;
    public static final MethodHandle MH_glNamedRenderbufferStorageMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedRenderbufferStorageMultisample;
    public static final MethodHandle MH_glGetNamedRenderbufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedRenderbufferParameteriv;
    public static final MethodHandle MH_glCreateTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateTextures;
    public static final MethodHandle MH_glTextureBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureBuffer;
    public static final MethodHandle MH_glTextureBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glTextureBufferRange;
    public static final MethodHandle MH_glTextureStorage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage1D;
    public static final MethodHandle MH_glTextureStorage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage2D;
    public static final MethodHandle MH_glTextureStorage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage3D;
    public static final MethodHandle MH_glTextureStorage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureStorage2DMultisample;
    public static final MethodHandle MH_glTextureStorage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureStorage3DMultisample;
    public static final MethodHandle MH_glTextureSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureSubImage1D;
    public static final MethodHandle MH_glTextureSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureSubImage2D;
    public static final MethodHandle MH_glTextureSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureSubImage3D;
    public static final MethodHandle MH_glCompressedTextureSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureSubImage1D;
    public static final MethodHandle MH_glCompressedTextureSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureSubImage2D;
    public static final MethodHandle MH_glCompressedTextureSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureSubImage3D;
    public static final MethodHandle MH_glCopyTextureSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureSubImage1D;
    public static final MethodHandle MH_glCopyTextureSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureSubImage2D;
    public static final MethodHandle MH_glCopyTextureSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureSubImage3D;
    public static final MethodHandle MH_glTextureParameterf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTextureParameterf;
    public static final MethodHandle MH_glTextureParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterfv;
    public static final MethodHandle MH_glTextureParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureParameteri;
    public static final MethodHandle MH_glTextureParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterIiv;
    public static final MethodHandle MH_glTextureParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterIuiv;
    public static final MethodHandle MH_glTextureParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameteriv;
    public static final MethodHandle MH_glGenerateTextureMipmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenerateTextureMipmap;
    public static final MethodHandle MH_glBindTextureUnit = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindTextureUnit;
    public static final MethodHandle MH_glGetTextureImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureImage;
    public static final MethodHandle MH_glGetCompressedTextureImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCompressedTextureImage;
    public static final MethodHandle MH_glGetTextureLevelParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureLevelParameterfv;
    public static final MethodHandle MH_glGetTextureLevelParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureLevelParameteriv;
    public static final MethodHandle MH_glGetTextureParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterfv;
    public static final MethodHandle MH_glGetTextureParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterIiv;
    public static final MethodHandle MH_glGetTextureParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterIuiv;
    public static final MethodHandle MH_glGetTextureParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameteriv;
    public static final MethodHandle MH_glCreateVertexArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateVertexArrays;
    public static final MethodHandle MH_glDisableVertexArrayAttrib = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableVertexArrayAttrib;
    public static final MethodHandle MH_glEnableVertexArrayAttrib = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableVertexArrayAttrib;
    public static final MethodHandle MH_glVertexArrayElementBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayElementBuffer;
    public static final MethodHandle MH_glVertexArrayVertexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexBuffer;
    public static final MethodHandle MH_glVertexArrayVertexBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexArrayVertexBuffers;
    public static final MethodHandle MH_glVertexArrayAttribBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayAttribBinding;
    public static final MethodHandle MH_glVertexArrayAttribFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayAttribFormat;
    public static final MethodHandle MH_glVertexArrayAttribIFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayAttribIFormat;
    public static final MethodHandle MH_glVertexArrayAttribLFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayAttribLFormat;
    public static final MethodHandle MH_glVertexArrayBindingDivisor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayBindingDivisor;
    public static final MethodHandle MH_glGetVertexArrayiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayiv;
    public static final MethodHandle MH_glGetVertexArrayIndexediv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayIndexediv;
    public static final MethodHandle MH_glGetVertexArrayIndexed64iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayIndexed64iv;
    public static final MethodHandle MH_glCreateSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateSamplers;
    public static final MethodHandle MH_glCreateProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateProgramPipelines;
    public static final MethodHandle MH_glCreateQueries = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreateQueries;
    public static final MethodHandle MH_glGetQueryBufferObjecti64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glGetQueryBufferObjecti64v;
    public static final MethodHandle MH_glGetQueryBufferObjectiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glGetQueryBufferObjectiv;
    public static final MethodHandle MH_glGetQueryBufferObjectui64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glGetQueryBufferObjectui64v;
    public static final MethodHandle MH_glGetQueryBufferObjectuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glGetQueryBufferObjectuiv;

    public GLARBDirectStateAccess(overrungl.opengl.GLLoadFunc func) {
        PFN_glCreateTransformFeedbacks = func.invoke("glCreateTransformFeedbacks");
        PFN_glTransformFeedbackBufferBase = func.invoke("glTransformFeedbackBufferBase");
        PFN_glTransformFeedbackBufferRange = func.invoke("glTransformFeedbackBufferRange");
        PFN_glGetTransformFeedbackiv = func.invoke("glGetTransformFeedbackiv");
        PFN_glGetTransformFeedbacki_v = func.invoke("glGetTransformFeedbacki_v");
        PFN_glGetTransformFeedbacki64_v = func.invoke("glGetTransformFeedbacki64_v");PFN_glCreateBuffers = func.invoke("glCreateBuffers");
        PFN_glNamedBufferStorage = func.invoke("glNamedBufferStorage");
        PFN_glNamedBufferData = func.invoke("glNamedBufferData");
        PFN_glNamedBufferSubData = func.invoke("glNamedBufferSubData");
        PFN_glCopyNamedBufferSubData = func.invoke("glCopyNamedBufferSubData");
        PFN_glClearNamedBufferData = func.invoke("glClearNamedBufferData");
        PFN_glClearNamedBufferSubData = func.invoke("glClearNamedBufferSubData");
        PFN_glMapNamedBuffer = func.invoke("glMapNamedBuffer");
        PFN_glMapNamedBufferRange = func.invoke("glMapNamedBufferRange");
        PFN_glUnmapNamedBuffer = func.invoke("glUnmapNamedBuffer");
        PFN_glFlushMappedNamedBufferRange = func.invoke("glFlushMappedNamedBufferRange");
        PFN_glGetNamedBufferParameteriv = func.invoke("glGetNamedBufferParameteriv");
        PFN_glGetNamedBufferParameteri64v = func.invoke("glGetNamedBufferParameteri64v");
        PFN_glGetNamedBufferPointerv = func.invoke("glGetNamedBufferPointerv");
        PFN_glGetNamedBufferSubData = func.invoke("glGetNamedBufferSubData");PFN_glCreateFramebuffers = func.invoke("glCreateFramebuffers");
        PFN_glNamedFramebufferRenderbuffer = func.invoke("glNamedFramebufferRenderbuffer");
        PFN_glNamedFramebufferParameteri = func.invoke("glNamedFramebufferParameteri");
        PFN_glNamedFramebufferTexture = func.invoke("glNamedFramebufferTexture");
        PFN_glNamedFramebufferTextureLayer = func.invoke("glNamedFramebufferTextureLayer");
        PFN_glNamedFramebufferDrawBuffer = func.invoke("glNamedFramebufferDrawBuffer");
        PFN_glNamedFramebufferDrawBuffers = func.invoke("glNamedFramebufferDrawBuffers");
        PFN_glNamedFramebufferReadBuffer = func.invoke("glNamedFramebufferReadBuffer");
        PFN_glInvalidateNamedFramebufferData = func.invoke("glInvalidateNamedFramebufferData");
        PFN_glInvalidateNamedFramebufferSubData = func.invoke("glInvalidateNamedFramebufferSubData");
        PFN_glClearNamedFramebufferiv = func.invoke("glClearNamedFramebufferiv");
        PFN_glClearNamedFramebufferuiv = func.invoke("glClearNamedFramebufferuiv");
        PFN_glClearNamedFramebufferfv = func.invoke("glClearNamedFramebufferfv");
        PFN_glClearNamedFramebufferfi = func.invoke("glClearNamedFramebufferfi");
        PFN_glBlitNamedFramebuffer = func.invoke("glBlitNamedFramebuffer");
        PFN_glCheckNamedFramebufferStatus = func.invoke("glCheckNamedFramebufferStatus");
        PFN_glGetNamedFramebufferParameteriv = func.invoke("glGetNamedFramebufferParameteriv");
        PFN_glGetNamedFramebufferAttachmentParameteriv = func.invoke("glGetNamedFramebufferAttachmentParameteriv");PFN_glCreateRenderbuffers = func.invoke("glCreateRenderbuffers");
        PFN_glNamedRenderbufferStorage = func.invoke("glNamedRenderbufferStorage");
        PFN_glNamedRenderbufferStorageMultisample = func.invoke("glNamedRenderbufferStorageMultisample");
        PFN_glGetNamedRenderbufferParameteriv = func.invoke("glGetNamedRenderbufferParameteriv");PFN_glCreateTextures = func.invoke("glCreateTextures");
        PFN_glTextureBuffer = func.invoke("glTextureBuffer");
        PFN_glTextureBufferRange = func.invoke("glTextureBufferRange");
        PFN_glTextureStorage1D = func.invoke("glTextureStorage1D");
        PFN_glTextureStorage2D = func.invoke("glTextureStorage2D");
        PFN_glTextureStorage3D = func.invoke("glTextureStorage3D");
        PFN_glTextureStorage2DMultisample = func.invoke("glTextureStorage2DMultisample");
        PFN_glTextureStorage3DMultisample = func.invoke("glTextureStorage3DMultisample");
        PFN_glTextureSubImage1D = func.invoke("glTextureSubImage1D");
        PFN_glTextureSubImage2D = func.invoke("glTextureSubImage2D");
        PFN_glTextureSubImage3D = func.invoke("glTextureSubImage3D");
        PFN_glCompressedTextureSubImage1D = func.invoke("glCompressedTextureSubImage1D");
        PFN_glCompressedTextureSubImage2D = func.invoke("glCompressedTextureSubImage2D");
        PFN_glCompressedTextureSubImage3D = func.invoke("glCompressedTextureSubImage3D");
        PFN_glCopyTextureSubImage1D = func.invoke("glCopyTextureSubImage1D");
        PFN_glCopyTextureSubImage2D = func.invoke("glCopyTextureSubImage2D");
        PFN_glCopyTextureSubImage3D = func.invoke("glCopyTextureSubImage3D");
        PFN_glTextureParameterf = func.invoke("glTextureParameterf");
        PFN_glTextureParameterfv = func.invoke("glTextureParameterfv");
        PFN_glTextureParameteri = func.invoke("glTextureParameteri");
        PFN_glTextureParameterIiv = func.invoke("glTextureParameterIiv");
        PFN_glTextureParameterIuiv = func.invoke("glTextureParameterIuiv");
        PFN_glTextureParameteriv = func.invoke("glTextureParameteriv");
        PFN_glGenerateTextureMipmap = func.invoke("glGenerateTextureMipmap");
        PFN_glBindTextureUnit = func.invoke("glBindTextureUnit");
        PFN_glGetTextureImage = func.invoke("glGetTextureImage");
        PFN_glGetCompressedTextureImage = func.invoke("glGetCompressedTextureImage");
        PFN_glGetTextureLevelParameterfv = func.invoke("glGetTextureLevelParameterfv");
        PFN_glGetTextureLevelParameteriv = func.invoke("glGetTextureLevelParameteriv");
        PFN_glGetTextureParameterfv = func.invoke("glGetTextureParameterfv");
        PFN_glGetTextureParameterIiv = func.invoke("glGetTextureParameterIiv");
        PFN_glGetTextureParameterIuiv = func.invoke("glGetTextureParameterIuiv");
        PFN_glGetTextureParameteriv = func.invoke("glGetTextureParameteriv");PFN_glCreateVertexArrays = func.invoke("glCreateVertexArrays");
        PFN_glDisableVertexArrayAttrib = func.invoke("glDisableVertexArrayAttrib");
        PFN_glEnableVertexArrayAttrib = func.invoke("glEnableVertexArrayAttrib");
        PFN_glVertexArrayElementBuffer = func.invoke("glVertexArrayElementBuffer");
        PFN_glVertexArrayVertexBuffer = func.invoke("glVertexArrayVertexBuffer");
        PFN_glVertexArrayVertexBuffers = func.invoke("glVertexArrayVertexBuffers");
        PFN_glVertexArrayAttribBinding = func.invoke("glVertexArrayAttribBinding");
        PFN_glVertexArrayAttribFormat = func.invoke("glVertexArrayAttribFormat");
        PFN_glVertexArrayAttribIFormat = func.invoke("glVertexArrayAttribIFormat");
        PFN_glVertexArrayAttribLFormat = func.invoke("glVertexArrayAttribLFormat");
        PFN_glVertexArrayBindingDivisor = func.invoke("glVertexArrayBindingDivisor");
        PFN_glGetVertexArrayiv = func.invoke("glGetVertexArrayiv");
        PFN_glGetVertexArrayIndexediv = func.invoke("glGetVertexArrayIndexediv");
        PFN_glGetVertexArrayIndexed64iv = func.invoke("glGetVertexArrayIndexed64iv");PFN_glCreateSamplers = func.invoke("glCreateSamplers");PFN_glCreateProgramPipelines = func.invoke("glCreateProgramPipelines");PFN_glCreateQueries = func.invoke("glCreateQueries");
        PFN_glGetQueryBufferObjecti64v = func.invoke("glGetQueryBufferObjecti64v");
        PFN_glGetQueryBufferObjectiv = func.invoke("glGetQueryBufferObjectiv");
        PFN_glGetQueryBufferObjectui64v = func.invoke("glGetQueryBufferObjectui64v");
        PFN_glGetQueryBufferObjectuiv = func.invoke("glGetQueryBufferObjectuiv");
    }

    public void CreateTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateTransformFeedbacks))
            MH_glCreateTransformFeedbacks.invokeExact(PFN_glCreateTransformFeedbacks, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateTransformFeedbacks", e); }
    }

    public void TransformFeedbackBufferBase(@CType("GLuint") int xfb, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glTransformFeedbackBufferBase))
            MH_glTransformFeedbackBufferBase.invokeExact(PFN_glTransformFeedbackBufferBase, xfb, index, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackBufferBase", e); }
    }

    public void TransformFeedbackBufferRange(@CType("GLuint") int xfb, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glTransformFeedbackBufferRange))
            MH_glTransformFeedbackBufferRange.invokeExact(PFN_glTransformFeedbackBufferRange, xfb, index, buffer, offset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackBufferRange", e); }
    }

    public void GetTransformFeedbackiv(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbackiv))
            MH_glGetTransformFeedbackiv.invokeExact(PFN_glGetTransformFeedbackiv, xfb, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackiv", e); }
    }

    public void GetTransformFeedbacki_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbacki_v))
            MH_glGetTransformFeedbacki_v.invokeExact(PFN_glGetTransformFeedbacki_v, xfb, pname, index, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki_v", e); }
    }

    public void GetTransformFeedbacki64_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint64 *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbacki64_v))
            MH_glGetTransformFeedbacki64_v.invokeExact(PFN_glGetTransformFeedbacki64_v, xfb, pname, index, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki64_v", e); }
    }

    public void CreateBuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment buffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateBuffers))
            MH_glCreateBuffers.invokeExact(PFN_glCreateBuffers, n, buffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateBuffers", e); }
    }

    public void NamedBufferStorage(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLbitfield") int flags) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferStorage))
            MH_glNamedBufferStorage.invokeExact(PFN_glNamedBufferStorage, buffer, size, data, flags);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorage", e); }
    }

    public void NamedBufferData(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferData))
            MH_glNamedBufferData.invokeExact(PFN_glNamedBufferData, buffer, size, data, usage);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferData", e); }
    }

    public void NamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferSubData))
            MH_glNamedBufferSubData.invokeExact(PFN_glNamedBufferSubData, buffer, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferSubData", e); }
    }

    public void CopyNamedBufferSubData(@CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyNamedBufferSubData))
            MH_glCopyNamedBufferSubData.invokeExact(PFN_glCopyNamedBufferSubData, readBuffer, writeBuffer, readOffset, writeOffset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyNamedBufferSubData", e); }
    }

    public void ClearNamedBufferData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedBufferData))
            MH_glClearNamedBufferData.invokeExact(PFN_glClearNamedBufferData, buffer, internalformat, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferData", e); }
    }

    public void ClearNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedBufferSubData))
            MH_glClearNamedBufferSubData.invokeExact(PFN_glClearNamedBufferSubData, buffer, internalformat, offset, size, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferSubData", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBuffer(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapNamedBuffer))
            return (java.lang.foreign.MemorySegment) MH_glMapNamedBuffer.invokeExact(PFN_glMapNamedBuffer, buffer, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBuffer", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapNamedBufferRange))
            return (java.lang.foreign.MemorySegment) MH_glMapNamedBufferRange.invokeExact(PFN_glMapNamedBufferRange, buffer, offset, length, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferRange", e); }
    }

    public @CType("GLboolean") boolean UnmapNamedBuffer(@CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glUnmapNamedBuffer))
            return (boolean) MH_glUnmapNamedBuffer.invokeExact(PFN_glUnmapNamedBuffer, buffer);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapNamedBuffer", e); }
    }

    public void FlushMappedNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        try { if (!Unmarshal.isNullPointer(PFN_glFlushMappedNamedBufferRange))
            MH_glFlushMappedNamedBufferRange.invokeExact(PFN_glFlushMappedNamedBufferRange, buffer, offset, length);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedNamedBufferRange", e); }
    }

    public void GetNamedBufferParameteriv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferParameteriv))
            MH_glGetNamedBufferParameteriv.invokeExact(PFN_glGetNamedBufferParameteriv, buffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteriv", e); }
    }

    public void GetNamedBufferParameteri64v(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferParameteri64v))
            MH_glGetNamedBufferParameteri64v.invokeExact(PFN_glGetNamedBufferParameteri64v, buffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteri64v", e); }
    }

    public void GetNamedBufferPointerv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferPointerv))
            MH_glGetNamedBufferPointerv.invokeExact(PFN_glGetNamedBufferPointerv, buffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferPointerv", e); }
    }

    public void GetNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferSubData))
            MH_glGetNamedBufferSubData.invokeExact(PFN_glGetNamedBufferSubData, buffer, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferSubData", e); }
    }

    public void CreateFramebuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateFramebuffers))
            MH_glCreateFramebuffers.invokeExact(PFN_glCreateFramebuffers, n, framebuffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateFramebuffers", e); }
    }

    public void NamedFramebufferRenderbuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferRenderbuffer))
            MH_glNamedFramebufferRenderbuffer.invokeExact(PFN_glNamedFramebufferRenderbuffer, framebuffer, attachment, renderbuffertarget, renderbuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferRenderbuffer", e); }
    }

    public void NamedFramebufferParameteri(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferParameteri))
            MH_glNamedFramebufferParameteri.invokeExact(PFN_glNamedFramebufferParameteri, framebuffer, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferParameteri", e); }
    }

    public void NamedFramebufferTexture(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTexture))
            MH_glNamedFramebufferTexture.invokeExact(PFN_glNamedFramebufferTexture, framebuffer, attachment, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture", e); }
    }

    public void NamedFramebufferTextureLayer(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTextureLayer))
            MH_glNamedFramebufferTextureLayer.invokeExact(PFN_glNamedFramebufferTextureLayer, framebuffer, attachment, texture, level, layer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureLayer", e); }
    }

    public void NamedFramebufferDrawBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int buf) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferDrawBuffer))
            MH_glNamedFramebufferDrawBuffer.invokeExact(PFN_glNamedFramebufferDrawBuffer, framebuffer, buf);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffer", e); }
    }

    public void NamedFramebufferDrawBuffers(@CType("GLuint") int framebuffer, @CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferDrawBuffers))
            MH_glNamedFramebufferDrawBuffers.invokeExact(PFN_glNamedFramebufferDrawBuffers, framebuffer, n, bufs);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffers", e); }
    }

    public void NamedFramebufferReadBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int src) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferReadBuffer))
            MH_glNamedFramebufferReadBuffer.invokeExact(PFN_glNamedFramebufferReadBuffer, framebuffer, src);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferReadBuffer", e); }
    }

    public void InvalidateNamedFramebufferData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments) {
        try { if (!Unmarshal.isNullPointer(PFN_glInvalidateNamedFramebufferData))
            MH_glInvalidateNamedFramebufferData.invokeExact(PFN_glInvalidateNamedFramebufferData, framebuffer, numAttachments, attachments);
        }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferData", e); }
    }

    public void InvalidateNamedFramebufferSubData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glInvalidateNamedFramebufferSubData))
            MH_glInvalidateNamedFramebufferSubData.invokeExact(PFN_glInvalidateNamedFramebufferSubData, framebuffer, numAttachments, attachments, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferSubData", e); }
    }

    public void ClearNamedFramebufferiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferiv))
            MH_glClearNamedFramebufferiv.invokeExact(PFN_glClearNamedFramebufferiv, framebuffer, buffer, drawbuffer, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferiv", e); }
    }

    public void ClearNamedFramebufferuiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferuiv))
            MH_glClearNamedFramebufferuiv.invokeExact(PFN_glClearNamedFramebufferuiv, framebuffer, buffer, drawbuffer, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferuiv", e); }
    }

    public void ClearNamedFramebufferfv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferfv))
            MH_glClearNamedFramebufferfv.invokeExact(PFN_glClearNamedFramebufferfv, framebuffer, buffer, drawbuffer, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferfv", e); }
    }

    public void ClearNamedFramebufferfi(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("GLfloat") float depth, @CType("GLint") int stencil) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferfi))
            MH_glClearNamedFramebufferfi.invokeExact(PFN_glClearNamedFramebufferfi, framebuffer, buffer, drawbuffer, depth, stencil);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferfi", e); }
    }

    public void BlitNamedFramebuffer(@CType("GLuint") int readFramebuffer, @CType("GLuint") int drawFramebuffer, @CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlitNamedFramebuffer))
            MH_glBlitNamedFramebuffer.invokeExact(PFN_glBlitNamedFramebuffer, readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlitNamedFramebuffer", e); }
    }

    public @CType("GLenum") int CheckNamedFramebufferStatus(@CType("GLuint") int framebuffer, @CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glCheckNamedFramebufferStatus))
            return (int) MH_glCheckNamedFramebufferStatus.invokeExact(PFN_glCheckNamedFramebufferStatus, framebuffer, target);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glCheckNamedFramebufferStatus", e); }
    }

    public void GetNamedFramebufferParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferParameteriv))
            MH_glGetNamedFramebufferParameteriv.invokeExact(PFN_glGetNamedFramebufferParameteriv, framebuffer, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameteriv", e); }
    }

    public void GetNamedFramebufferAttachmentParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferAttachmentParameteriv))
            MH_glGetNamedFramebufferAttachmentParameteriv.invokeExact(PFN_glGetNamedFramebufferAttachmentParameteriv, framebuffer, attachment, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferAttachmentParameteriv", e); }
    }

    public void CreateRenderbuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateRenderbuffers))
            MH_glCreateRenderbuffers.invokeExact(PFN_glCreateRenderbuffers, n, renderbuffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateRenderbuffers", e); }
    }

    public void NamedRenderbufferStorage(@CType("GLuint") int renderbuffer, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorage))
            MH_glNamedRenderbufferStorage.invokeExact(PFN_glNamedRenderbufferStorage, renderbuffer, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorage", e); }
    }

    public void NamedRenderbufferStorageMultisample(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorageMultisample))
            MH_glNamedRenderbufferStorageMultisample.invokeExact(PFN_glNamedRenderbufferStorageMultisample, renderbuffer, samples, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisample", e); }
    }

    public void GetNamedRenderbufferParameteriv(@CType("GLuint") int renderbuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedRenderbufferParameteriv))
            MH_glGetNamedRenderbufferParameteriv.invokeExact(PFN_glGetNamedRenderbufferParameteriv, renderbuffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedRenderbufferParameteriv", e); }
    }

    public void CreateTextures(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment textures) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateTextures))
            MH_glCreateTextures.invokeExact(PFN_glCreateTextures, target, n, textures);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateTextures", e); }
    }

    public void TextureBuffer(@CType("GLuint") int texture, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureBuffer))
            MH_glTextureBuffer.invokeExact(PFN_glTextureBuffer, texture, internalformat, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBuffer", e); }
    }

    public void TextureBufferRange(@CType("GLuint") int texture, @CType("GLenum") int internalformat, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureBufferRange))
            MH_glTextureBufferRange.invokeExact(PFN_glTextureBufferRange, texture, internalformat, buffer, offset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBufferRange", e); }
    }

    public void TextureStorage1D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage1D))
            MH_glTextureStorage1D.invokeExact(PFN_glTextureStorage1D, texture, levels, internalformat, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1D", e); }
    }

    public void TextureStorage2D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage2D))
            MH_glTextureStorage2D.invokeExact(PFN_glTextureStorage2D, texture, levels, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2D", e); }
    }

    public void TextureStorage3D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage3D))
            MH_glTextureStorage3D.invokeExact(PFN_glTextureStorage3D, texture, levels, internalformat, width, height, depth);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3D", e); }
    }

    public void TextureStorage2DMultisample(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage2DMultisample))
            MH_glTextureStorage2DMultisample.invokeExact(PFN_glTextureStorage2DMultisample, texture, samples, internalformat, width, height, fixedsamplelocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DMultisample", e); }
    }

    public void TextureStorage3DMultisample(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage3DMultisample))
            MH_glTextureStorage3DMultisample.invokeExact(PFN_glTextureStorage3DMultisample, texture, samples, internalformat, width, height, depth, fixedsamplelocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DMultisample", e); }
    }

    public void TextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureSubImage1D))
            MH_glTextureSubImage1D.invokeExact(PFN_glTextureSubImage1D, texture, level, xoffset, width, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage1D", e); }
    }

    public void TextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureSubImage2D))
            MH_glTextureSubImage2D.invokeExact(PFN_glTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage2D", e); }
    }

    public void TextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureSubImage3D))
            MH_glTextureSubImage3D.invokeExact(PFN_glTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage3D", e); }
    }

    public void CompressedTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage1D))
            MH_glCompressedTextureSubImage1D.invokeExact(PFN_glCompressedTextureSubImage1D, texture, level, xoffset, width, format, imageSize, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage1D", e); }
    }

    public void CompressedTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage2D))
            MH_glCompressedTextureSubImage2D.invokeExact(PFN_glCompressedTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, imageSize, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage2D", e); }
    }

    public void CompressedTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage3D))
            MH_glCompressedTextureSubImage3D.invokeExact(PFN_glCompressedTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage3D", e); }
    }

    public void CopyTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage1D))
            MH_glCopyTextureSubImage1D.invokeExact(PFN_glCopyTextureSubImage1D, texture, level, xoffset, x, y, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage1D", e); }
    }

    public void CopyTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage2D))
            MH_glCopyTextureSubImage2D.invokeExact(PFN_glCopyTextureSubImage2D, texture, level, xoffset, yoffset, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage2D", e); }
    }

    public void CopyTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage3D))
            MH_glCopyTextureSubImage3D.invokeExact(PFN_glCopyTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage3D", e); }
    }

    public void TextureParameterf(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterf))
            MH_glTextureParameterf.invokeExact(PFN_glTextureParameterf, texture, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterf", e); }
    }

    public void TextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterfv))
            MH_glTextureParameterfv.invokeExact(PFN_glTextureParameterfv, texture, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfv", e); }
    }

    public void TextureParameteri(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameteri))
            MH_glTextureParameteri.invokeExact(PFN_glTextureParameteri, texture, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteri", e); }
    }

    public void TextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterIiv))
            MH_glTextureParameterIiv.invokeExact(PFN_glTextureParameterIiv, texture, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIiv", e); }
    }

    public void TextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterIuiv))
            MH_glTextureParameterIuiv.invokeExact(PFN_glTextureParameterIuiv, texture, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIuiv", e); }
    }

    public void TextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameteriv))
            MH_glTextureParameteriv.invokeExact(PFN_glTextureParameteriv, texture, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteriv", e); }
    }

    public void GenerateTextureMipmap(@CType("GLuint") int texture) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenerateTextureMipmap))
            MH_glGenerateTextureMipmap.invokeExact(PFN_glGenerateTextureMipmap, texture);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateTextureMipmap", e); }
    }

    public void BindTextureUnit(@CType("GLuint") int unit, @CType("GLuint") int texture) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindTextureUnit))
            MH_glBindTextureUnit.invokeExact(PFN_glBindTextureUnit, unit, texture);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindTextureUnit", e); }
    }

    public void GetTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureImage))
            MH_glGetTextureImage.invokeExact(PFN_glGetTextureImage, texture, level, format, type, bufSize, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureImage", e); }
    }

    public void GetCompressedTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetCompressedTextureImage))
            MH_glGetCompressedTextureImage.invokeExact(PFN_glGetCompressedTextureImage, texture, level, bufSize, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureImage", e); }
    }

    public void GetTextureLevelParameterfv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureLevelParameterfv))
            MH_glGetTextureLevelParameterfv.invokeExact(PFN_glGetTextureLevelParameterfv, texture, level, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterfv", e); }
    }

    public void GetTextureLevelParameteriv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureLevelParameteriv))
            MH_glGetTextureLevelParameteriv.invokeExact(PFN_glGetTextureLevelParameteriv, texture, level, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameteriv", e); }
    }

    public void GetTextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterfv))
            MH_glGetTextureParameterfv.invokeExact(PFN_glGetTextureParameterfv, texture, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterfv", e); }
    }

    public void GetTextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterIiv))
            MH_glGetTextureParameterIiv.invokeExact(PFN_glGetTextureParameterIiv, texture, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIiv", e); }
    }

    public void GetTextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterIuiv))
            MH_glGetTextureParameterIuiv.invokeExact(PFN_glGetTextureParameterIuiv, texture, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIuiv", e); }
    }

    public void GetTextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameteriv))
            MH_glGetTextureParameteriv.invokeExact(PFN_glGetTextureParameteriv, texture, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameteriv", e); }
    }

    public void CreateVertexArrays(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateVertexArrays))
            MH_glCreateVertexArrays.invokeExact(PFN_glCreateVertexArrays, n, arrays);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateVertexArrays", e); }
    }

    public void DisableVertexArrayAttrib(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableVertexArrayAttrib))
            MH_glDisableVertexArrayAttrib.invokeExact(PFN_glDisableVertexArrayAttrib, vaobj, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayAttrib", e); }
    }

    public void EnableVertexArrayAttrib(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableVertexArrayAttrib))
            MH_glEnableVertexArrayAttrib.invokeExact(PFN_glEnableVertexArrayAttrib, vaobj, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayAttrib", e); }
    }

    public void VertexArrayElementBuffer(@CType("GLuint") int vaobj, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayElementBuffer))
            MH_glVertexArrayElementBuffer.invokeExact(PFN_glVertexArrayElementBuffer, vaobj, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayElementBuffer", e); }
    }

    public void VertexArrayVertexBuffer(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexBuffer))
            MH_glVertexArrayVertexBuffer.invokeExact(PFN_glVertexArrayVertexBuffer, vaobj, bindingindex, buffer, offset, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBuffer", e); }
    }

    public void VertexArrayVertexBuffers(@CType("GLuint") int vaobj, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizei *") java.lang.foreign.MemorySegment strides) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexBuffers))
            MH_glVertexArrayVertexBuffers.invokeExact(PFN_glVertexArrayVertexBuffers, vaobj, first, count, buffers, offsets, strides);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBuffers", e); }
    }

    public void VertexArrayAttribBinding(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLuint") int bindingindex) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribBinding))
            MH_glVertexArrayAttribBinding.invokeExact(PFN_glVertexArrayAttribBinding, vaobj, attribindex, bindingindex);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribBinding", e); }
    }

    public void VertexArrayAttribFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int relativeoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribFormat))
            MH_glVertexArrayAttribFormat.invokeExact(PFN_glVertexArrayAttribFormat, vaobj, attribindex, size, type, normalized, relativeoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribFormat", e); }
    }

    public void VertexArrayAttribIFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribIFormat))
            MH_glVertexArrayAttribIFormat.invokeExact(PFN_glVertexArrayAttribIFormat, vaobj, attribindex, size, type, relativeoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribIFormat", e); }
    }

    public void VertexArrayAttribLFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribLFormat))
            MH_glVertexArrayAttribLFormat.invokeExact(PFN_glVertexArrayAttribLFormat, vaobj, attribindex, size, type, relativeoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribLFormat", e); }
    }

    public void VertexArrayBindingDivisor(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int divisor) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayBindingDivisor))
            MH_glVertexArrayBindingDivisor.invokeExact(PFN_glVertexArrayBindingDivisor, vaobj, bindingindex, divisor);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayBindingDivisor", e); }
    }

    public void GetVertexArrayiv(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayiv))
            MH_glGetVertexArrayiv.invokeExact(PFN_glGetVertexArrayiv, vaobj, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayiv", e); }
    }

    public void GetVertexArrayIndexediv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayIndexediv))
            MH_glGetVertexArrayIndexediv.invokeExact(PFN_glGetVertexArrayIndexediv, vaobj, index, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexediv", e); }
    }

    public void GetVertexArrayIndexed64iv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayIndexed64iv))
            MH_glGetVertexArrayIndexed64iv.invokeExact(PFN_glGetVertexArrayIndexed64iv, vaobj, index, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexed64iv", e); }
    }

    public void CreateSamplers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment samplers) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateSamplers))
            MH_glCreateSamplers.invokeExact(PFN_glCreateSamplers, n, samplers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateSamplers", e); }
    }

    public void CreateProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateProgramPipelines))
            MH_glCreateProgramPipelines.invokeExact(PFN_glCreateProgramPipelines, n, pipelines);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateProgramPipelines", e); }
    }

    public void CreateQueries(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreateQueries))
            MH_glCreateQueries.invokeExact(PFN_glCreateQueries, target, n, ids);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreateQueries", e); }
    }

    public void GetQueryBufferObjecti64v(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjecti64v))
            MH_glGetQueryBufferObjecti64v.invokeExact(PFN_glGetQueryBufferObjecti64v, id, buffer, pname, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjecti64v", e); }
    }

    public void GetQueryBufferObjectiv(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjectiv))
            MH_glGetQueryBufferObjectiv.invokeExact(PFN_glGetQueryBufferObjectiv, id, buffer, pname, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectiv", e); }
    }

    public void GetQueryBufferObjectui64v(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjectui64v))
            MH_glGetQueryBufferObjectui64v.invokeExact(PFN_glGetQueryBufferObjectui64v, id, buffer, pname, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectui64v", e); }
    }

    public void GetQueryBufferObjectuiv(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjectuiv))
            MH_glGetQueryBufferObjectuiv.invokeExact(PFN_glGetQueryBufferObjectuiv, id, buffer, pname, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectuiv", e); }
    }

}
