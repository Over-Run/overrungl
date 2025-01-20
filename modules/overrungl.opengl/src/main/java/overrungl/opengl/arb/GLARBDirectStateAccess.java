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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCreateTransformFeedbacks = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTransformFeedbackBufferBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTransformFeedbackBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetTransformFeedbackiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTransformFeedbacki_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTransformFeedbacki64_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedBufferStorage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glClearNamedBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapNamedBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMapNamedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapNamedBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFlushMappedNamedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetNamedBufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferParameteri64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferPointerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateFramebuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferRenderbuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTexture = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTextureLayer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferDrawBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferDrawBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferReadBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateNamedFramebufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glInvalidateNamedFramebufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearNamedFramebufferiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedFramebufferuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedFramebufferfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedFramebufferfi = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlitNamedFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCheckNamedFramebufferStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedFramebufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateRenderbuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedRenderbufferStorage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedRenderbufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateTextures = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
        public static final MethodHandle MH_glTextureStorage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
        public static final MethodHandle MH_glTextureSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyTextureSubImage1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureSubImage2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureSubImage3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterf = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTextureParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenerateTextureMipmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindTextureUnit = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedTextureImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureLevelParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureLevelParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateVertexArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDisableVertexArrayAttrib = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEnableVertexArrayAttrib = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayElementBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexBuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexArrayAttribBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayAttribFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayAttribIFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayAttribLFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayBindingDivisor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVertexArrayiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayIndexediv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayIndexed64iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateSamplers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateProgramPipelines = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateQueries = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryBufferObjecti64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetQueryBufferObjectiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetQueryBufferObjectui64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetQueryBufferObjectuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glCreateTransformFeedbacks;
        public final MemorySegment PFN_glTransformFeedbackBufferBase;
        public final MemorySegment PFN_glTransformFeedbackBufferRange;
        public final MemorySegment PFN_glGetTransformFeedbackiv;
        public final MemorySegment PFN_glGetTransformFeedbacki_v;
        public final MemorySegment PFN_glGetTransformFeedbacki64_v;
        public final MemorySegment PFN_glCreateBuffers;
        public final MemorySegment PFN_glNamedBufferStorage;
        public final MemorySegment PFN_glNamedBufferData;
        public final MemorySegment PFN_glNamedBufferSubData;
        public final MemorySegment PFN_glCopyNamedBufferSubData;
        public final MemorySegment PFN_glClearNamedBufferData;
        public final MemorySegment PFN_glClearNamedBufferSubData;
        public final MemorySegment PFN_glMapNamedBuffer;
        public final MemorySegment PFN_glMapNamedBufferRange;
        public final MemorySegment PFN_glUnmapNamedBuffer;
        public final MemorySegment PFN_glFlushMappedNamedBufferRange;
        public final MemorySegment PFN_glGetNamedBufferParameteriv;
        public final MemorySegment PFN_glGetNamedBufferParameteri64v;
        public final MemorySegment PFN_glGetNamedBufferPointerv;
        public final MemorySegment PFN_glGetNamedBufferSubData;
        public final MemorySegment PFN_glCreateFramebuffers;
        public final MemorySegment PFN_glNamedFramebufferRenderbuffer;
        public final MemorySegment PFN_glNamedFramebufferParameteri;
        public final MemorySegment PFN_glNamedFramebufferTexture;
        public final MemorySegment PFN_glNamedFramebufferTextureLayer;
        public final MemorySegment PFN_glNamedFramebufferDrawBuffer;
        public final MemorySegment PFN_glNamedFramebufferDrawBuffers;
        public final MemorySegment PFN_glNamedFramebufferReadBuffer;
        public final MemorySegment PFN_glInvalidateNamedFramebufferData;
        public final MemorySegment PFN_glInvalidateNamedFramebufferSubData;
        public final MemorySegment PFN_glClearNamedFramebufferiv;
        public final MemorySegment PFN_glClearNamedFramebufferuiv;
        public final MemorySegment PFN_glClearNamedFramebufferfv;
        public final MemorySegment PFN_glClearNamedFramebufferfi;
        public final MemorySegment PFN_glBlitNamedFramebuffer;
        public final MemorySegment PFN_glCheckNamedFramebufferStatus;
        public final MemorySegment PFN_glGetNamedFramebufferParameteriv;
        public final MemorySegment PFN_glGetNamedFramebufferAttachmentParameteriv;
        public final MemorySegment PFN_glCreateRenderbuffers;
        public final MemorySegment PFN_glNamedRenderbufferStorage;
        public final MemorySegment PFN_glNamedRenderbufferStorageMultisample;
        public final MemorySegment PFN_glGetNamedRenderbufferParameteriv;
        public final MemorySegment PFN_glCreateTextures;
        public final MemorySegment PFN_glTextureBuffer;
        public final MemorySegment PFN_glTextureBufferRange;
        public final MemorySegment PFN_glTextureStorage1D;
        public final MemorySegment PFN_glTextureStorage2D;
        public final MemorySegment PFN_glTextureStorage3D;
        public final MemorySegment PFN_glTextureStorage2DMultisample;
        public final MemorySegment PFN_glTextureStorage3DMultisample;
        public final MemorySegment PFN_glTextureSubImage1D;
        public final MemorySegment PFN_glTextureSubImage2D;
        public final MemorySegment PFN_glTextureSubImage3D;
        public final MemorySegment PFN_glCompressedTextureSubImage1D;
        public final MemorySegment PFN_glCompressedTextureSubImage2D;
        public final MemorySegment PFN_glCompressedTextureSubImage3D;
        public final MemorySegment PFN_glCopyTextureSubImage1D;
        public final MemorySegment PFN_glCopyTextureSubImage2D;
        public final MemorySegment PFN_glCopyTextureSubImage3D;
        public final MemorySegment PFN_glTextureParameterf;
        public final MemorySegment PFN_glTextureParameterfv;
        public final MemorySegment PFN_glTextureParameteri;
        public final MemorySegment PFN_glTextureParameterIiv;
        public final MemorySegment PFN_glTextureParameterIuiv;
        public final MemorySegment PFN_glTextureParameteriv;
        public final MemorySegment PFN_glGenerateTextureMipmap;
        public final MemorySegment PFN_glBindTextureUnit;
        public final MemorySegment PFN_glGetTextureImage;
        public final MemorySegment PFN_glGetCompressedTextureImage;
        public final MemorySegment PFN_glGetTextureLevelParameterfv;
        public final MemorySegment PFN_glGetTextureLevelParameteriv;
        public final MemorySegment PFN_glGetTextureParameterfv;
        public final MemorySegment PFN_glGetTextureParameterIiv;
        public final MemorySegment PFN_glGetTextureParameterIuiv;
        public final MemorySegment PFN_glGetTextureParameteriv;
        public final MemorySegment PFN_glCreateVertexArrays;
        public final MemorySegment PFN_glDisableVertexArrayAttrib;
        public final MemorySegment PFN_glEnableVertexArrayAttrib;
        public final MemorySegment PFN_glVertexArrayElementBuffer;
        public final MemorySegment PFN_glVertexArrayVertexBuffer;
        public final MemorySegment PFN_glVertexArrayVertexBuffers;
        public final MemorySegment PFN_glVertexArrayAttribBinding;
        public final MemorySegment PFN_glVertexArrayAttribFormat;
        public final MemorySegment PFN_glVertexArrayAttribIFormat;
        public final MemorySegment PFN_glVertexArrayAttribLFormat;
        public final MemorySegment PFN_glVertexArrayBindingDivisor;
        public final MemorySegment PFN_glGetVertexArrayiv;
        public final MemorySegment PFN_glGetVertexArrayIndexediv;
        public final MemorySegment PFN_glGetVertexArrayIndexed64iv;
        public final MemorySegment PFN_glCreateSamplers;
        public final MemorySegment PFN_glCreateProgramPipelines;
        public final MemorySegment PFN_glCreateQueries;
        public final MemorySegment PFN_glGetQueryBufferObjecti64v;
        public final MemorySegment PFN_glGetQueryBufferObjectiv;
        public final MemorySegment PFN_glGetQueryBufferObjectui64v;
        public final MemorySegment PFN_glGetQueryBufferObjectuiv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLARBDirectStateAccess(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void CreateTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glCreateTransformFeedbacks");
        try { Handles.MH_glCreateTransformFeedbacks.invokeExact(handles.PFN_glCreateTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateTransformFeedbacks", e); }
    }

    public void TransformFeedbackBufferBase(@CType("GLuint") int xfb, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTransformFeedbackBufferBase)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackBufferBase");
        try { Handles.MH_glTransformFeedbackBufferBase.invokeExact(handles.PFN_glTransformFeedbackBufferBase, xfb, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackBufferBase", e); }
    }

    public void TransformFeedbackBufferRange(@CType("GLuint") int xfb, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glTransformFeedbackBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackBufferRange");
        try { Handles.MH_glTransformFeedbackBufferRange.invokeExact(handles.PFN_glTransformFeedbackBufferRange, xfb, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackBufferRange", e); }
    }

    public void GetTransformFeedbackiv(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbackiv)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbackiv");
        try { Handles.MH_glGetTransformFeedbackiv.invokeExact(handles.PFN_glGetTransformFeedbackiv, xfb, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackiv", e); }
    }

    public void GetTransformFeedbacki_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbacki_v)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki_v");
        try { Handles.MH_glGetTransformFeedbacki_v.invokeExact(handles.PFN_glGetTransformFeedbacki_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki_v", e); }
    }

    public void GetTransformFeedbacki64_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint64 *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbacki64_v)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki64_v");
        try { Handles.MH_glGetTransformFeedbacki64_v.invokeExact(handles.PFN_glGetTransformFeedbacki64_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki64_v", e); }
    }

    public void CreateBuffers(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment buffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateBuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateBuffers");
        try { Handles.MH_glCreateBuffers.invokeExact(handles.PFN_glCreateBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateBuffers", e); }
    }

    public void NamedBufferStorage(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") MemorySegment data, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferStorage)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorage");
        try { Handles.MH_glNamedBufferStorage.invokeExact(handles.PFN_glNamedBufferStorage, buffer, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorage", e); }
    }

    public void NamedBufferData(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") MemorySegment data, @CType("GLenum") int usage) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferData)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferData");
        try { Handles.MH_glNamedBufferData.invokeExact(handles.PFN_glNamedBufferData, buffer, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferData", e); }
    }

    public void NamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferSubData");
        try { Handles.MH_glNamedBufferSubData.invokeExact(handles.PFN_glNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferSubData", e); }
    }

    public void CopyNamedBufferSubData(@CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glCopyNamedBufferSubData");
        try { Handles.MH_glCopyNamedBufferSubData.invokeExact(handles.PFN_glCopyNamedBufferSubData, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyNamedBufferSubData", e); }
    }

    public void ClearNamedBufferData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedBufferData)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferData");
        try { Handles.MH_glClearNamedBufferData.invokeExact(handles.PFN_glClearNamedBufferData, buffer, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferData", e); }
    }

    public void ClearNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferSubData");
        try { Handles.MH_glClearNamedBufferSubData.invokeExact(handles.PFN_glClearNamedBufferSubData, buffer, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferSubData", e); }
    }

    public @CType("void*") MemorySegment MapNamedBuffer(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapNamedBuffer)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBuffer");
        try { return (MemorySegment) Handles.MH_glMapNamedBuffer.invokeExact(handles.PFN_glMapNamedBuffer, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBuffer", e); }
    }

    public @CType("void*") MemorySegment MapNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapNamedBufferRange)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBufferRange");
        try { return (MemorySegment) Handles.MH_glMapNamedBufferRange.invokeExact(handles.PFN_glMapNamedBufferRange, buffer, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferRange", e); }
    }

    public @CType("GLboolean") boolean UnmapNamedBuffer(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glUnmapNamedBuffer)) throw new SymbolNotFoundError("Symbol not found: glUnmapNamedBuffer");
        try { return (boolean) Handles.MH_glUnmapNamedBuffer.invokeExact(handles.PFN_glUnmapNamedBuffer, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapNamedBuffer", e); }
    }

    public void FlushMappedNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        if (Unmarshal.isNullPointer(handles.PFN_glFlushMappedNamedBufferRange)) throw new SymbolNotFoundError("Symbol not found: glFlushMappedNamedBufferRange");
        try { Handles.MH_glFlushMappedNamedBufferRange.invokeExact(handles.PFN_glFlushMappedNamedBufferRange, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedNamedBufferRange", e); }
    }

    public void GetNamedBufferParameteriv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteriv");
        try { Handles.MH_glGetNamedBufferParameteriv.invokeExact(handles.PFN_glGetNamedBufferParameteriv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteriv", e); }
    }

    public void GetNamedBufferParameteri64v(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint64 *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferParameteri64v)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteri64v");
        try { Handles.MH_glGetNamedBufferParameteri64v.invokeExact(handles.PFN_glGetNamedBufferParameteri64v, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteri64v", e); }
    }

    public void GetNamedBufferPointerv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("void **") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferPointerv");
        try { Handles.MH_glGetNamedBufferPointerv.invokeExact(handles.PFN_glGetNamedBufferPointerv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferPointerv", e); }
    }

    public void GetNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferSubData");
        try { Handles.MH_glGetNamedBufferSubData.invokeExact(handles.PFN_glGetNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferSubData", e); }
    }

    public void CreateFramebuffers(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment framebuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateFramebuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateFramebuffers");
        try { Handles.MH_glCreateFramebuffers.invokeExact(handles.PFN_glCreateFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateFramebuffers", e); }
    }

    public void NamedFramebufferRenderbuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferRenderbuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferRenderbuffer");
        try { Handles.MH_glNamedFramebufferRenderbuffer.invokeExact(handles.PFN_glNamedFramebufferRenderbuffer, framebuffer, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferRenderbuffer", e); }
    }

    public void NamedFramebufferParameteri(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferParameteri)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferParameteri");
        try { Handles.MH_glNamedFramebufferParameteri.invokeExact(handles.PFN_glNamedFramebufferParameteri, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferParameteri", e); }
    }

    public void NamedFramebufferTexture(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTexture)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTexture");
        try { Handles.MH_glNamedFramebufferTexture.invokeExact(handles.PFN_glNamedFramebufferTexture, framebuffer, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture", e); }
    }

    public void NamedFramebufferTextureLayer(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTextureLayer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTextureLayer");
        try { Handles.MH_glNamedFramebufferTextureLayer.invokeExact(handles.PFN_glNamedFramebufferTextureLayer, framebuffer, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureLayer", e); }
    }

    public void NamedFramebufferDrawBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int buf) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffer");
        try { Handles.MH_glNamedFramebufferDrawBuffer.invokeExact(handles.PFN_glNamedFramebufferDrawBuffer, framebuffer, buf); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffer", e); }
    }

    public void NamedFramebufferDrawBuffers(@CType("GLuint") int framebuffer, @CType("GLsizei") int n, @CType("const GLenum *") MemorySegment bufs) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffers)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffers");
        try { Handles.MH_glNamedFramebufferDrawBuffers.invokeExact(handles.PFN_glNamedFramebufferDrawBuffers, framebuffer, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffers", e); }
    }

    public void NamedFramebufferReadBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int src) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferReadBuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferReadBuffer");
        try { Handles.MH_glNamedFramebufferReadBuffer.invokeExact(handles.PFN_glNamedFramebufferReadBuffer, framebuffer, src); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferReadBuffer", e); }
    }

    public void InvalidateNamedFramebufferData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") MemorySegment attachments) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateNamedFramebufferData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferData");
        try { Handles.MH_glInvalidateNamedFramebufferData.invokeExact(handles.PFN_glInvalidateNamedFramebufferData, framebuffer, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferData", e); }
    }

    public void InvalidateNamedFramebufferSubData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") MemorySegment attachments, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateNamedFramebufferSubData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferSubData");
        try { Handles.MH_glInvalidateNamedFramebufferSubData.invokeExact(handles.PFN_glInvalidateNamedFramebufferSubData, framebuffer, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferSubData", e); }
    }

    public void ClearNamedFramebufferiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedFramebufferiv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferiv");
        try { Handles.MH_glClearNamedFramebufferiv.invokeExact(handles.PFN_glClearNamedFramebufferiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferiv", e); }
    }

    public void ClearNamedFramebufferuiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedFramebufferuiv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferuiv");
        try { Handles.MH_glClearNamedFramebufferuiv.invokeExact(handles.PFN_glClearNamedFramebufferuiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferuiv", e); }
    }

    public void ClearNamedFramebufferfv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLfloat *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedFramebufferfv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferfv");
        try { Handles.MH_glClearNamedFramebufferfv.invokeExact(handles.PFN_glClearNamedFramebufferfv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferfv", e); }
    }

    public void ClearNamedFramebufferfi(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("GLfloat") float depth, @CType("GLint") int stencil) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedFramebufferfi)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferfi");
        try { Handles.MH_glClearNamedFramebufferfi.invokeExact(handles.PFN_glClearNamedFramebufferfi, framebuffer, buffer, drawbuffer, depth, stencil); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferfi", e); }
    }

    public void BlitNamedFramebuffer(@CType("GLuint") int readFramebuffer, @CType("GLuint") int drawFramebuffer, @CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlitNamedFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glBlitNamedFramebuffer");
        try { Handles.MH_glBlitNamedFramebuffer.invokeExact(handles.PFN_glBlitNamedFramebuffer, readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in glBlitNamedFramebuffer", e); }
    }

    public @CType("GLenum") int CheckNamedFramebufferStatus(@CType("GLuint") int framebuffer, @CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glCheckNamedFramebufferStatus)) throw new SymbolNotFoundError("Symbol not found: glCheckNamedFramebufferStatus");
        try { return (int) Handles.MH_glCheckNamedFramebufferStatus.invokeExact(handles.PFN_glCheckNamedFramebufferStatus, framebuffer, target); }
        catch (Throwable e) { throw new RuntimeException("error in glCheckNamedFramebufferStatus", e); }
    }

    public void GetNamedFramebufferParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedFramebufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameteriv");
        try { Handles.MH_glGetNamedFramebufferParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferParameteriv, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameteriv", e); }
    }

    public void GetNamedFramebufferAttachmentParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedFramebufferAttachmentParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameteriv");
        try { Handles.MH_glGetNamedFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferAttachmentParameteriv, framebuffer, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferAttachmentParameteriv", e); }
    }

    public void CreateRenderbuffers(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment renderbuffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateRenderbuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateRenderbuffers");
        try { Handles.MH_glCreateRenderbuffers.invokeExact(handles.PFN_glCreateRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateRenderbuffers", e); }
    }

    public void NamedRenderbufferStorage(@CType("GLuint") int renderbuffer, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedRenderbufferStorage)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorage");
        try { Handles.MH_glNamedRenderbufferStorage.invokeExact(handles.PFN_glNamedRenderbufferStorage, renderbuffer, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorage", e); }
    }

    public void NamedRenderbufferStorageMultisample(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisample)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisample");
        try { Handles.MH_glNamedRenderbufferStorageMultisample.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisample, renderbuffer, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisample", e); }
    }

    public void GetNamedRenderbufferParameteriv(@CType("GLuint") int renderbuffer, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedRenderbufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameteriv");
        try { Handles.MH_glGetNamedRenderbufferParameteriv.invokeExact(handles.PFN_glGetNamedRenderbufferParameteriv, renderbuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedRenderbufferParameteriv", e); }
    }

    public void CreateTextures(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") MemorySegment textures) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateTextures)) throw new SymbolNotFoundError("Symbol not found: glCreateTextures");
        try { Handles.MH_glCreateTextures.invokeExact(handles.PFN_glCreateTextures, target, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateTextures", e); }
    }

    public void TextureBuffer(@CType("GLuint") int texture, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureBuffer)) throw new SymbolNotFoundError("Symbol not found: glTextureBuffer");
        try { Handles.MH_glTextureBuffer.invokeExact(handles.PFN_glTextureBuffer, texture, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBuffer", e); }
    }

    public void TextureBufferRange(@CType("GLuint") int texture, @CType("GLenum") int internalformat, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTextureBufferRange");
        try { Handles.MH_glTextureBufferRange.invokeExact(handles.PFN_glTextureBufferRange, texture, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBufferRange", e); }
    }

    public void TextureStorage1D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage1D)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage1D");
        try { Handles.MH_glTextureStorage1D.invokeExact(handles.PFN_glTextureStorage1D, texture, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1D", e); }
    }

    public void TextureStorage2D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage2D)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2D");
        try { Handles.MH_glTextureStorage2D.invokeExact(handles.PFN_glTextureStorage2D, texture, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2D", e); }
    }

    public void TextureStorage3D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage3D)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3D");
        try { Handles.MH_glTextureStorage3D.invokeExact(handles.PFN_glTextureStorage3D, texture, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3D", e); }
    }

    public void TextureStorage2DMultisample(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage2DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2DMultisample");
        try { Handles.MH_glTextureStorage2DMultisample.invokeExact(handles.PFN_glTextureStorage2DMultisample, texture, samples, internalformat, width, height, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DMultisample", e); }
    }

    public void TextureStorage3DMultisample(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage3DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3DMultisample");
        try { Handles.MH_glTextureStorage3DMultisample.invokeExact(handles.PFN_glTextureStorage3DMultisample, texture, samples, internalformat, width, height, depth, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DMultisample", e); }
    }

    public void TextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage1D");
        try { Handles.MH_glTextureSubImage1D.invokeExact(handles.PFN_glTextureSubImage1D, texture, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage1D", e); }
    }

    public void TextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage2D");
        try { Handles.MH_glTextureSubImage2D.invokeExact(handles.PFN_glTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage2D", e); }
    }

    public void TextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage3D");
        try { Handles.MH_glTextureSubImage3D.invokeExact(handles.PFN_glTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage3D", e); }
    }

    public void CompressedTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1D");
        try { Handles.MH_glCompressedTextureSubImage1D.invokeExact(handles.PFN_glCompressedTextureSubImage1D, texture, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage1D", e); }
    }

    public void CompressedTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2D");
        try { Handles.MH_glCompressedTextureSubImage2D.invokeExact(handles.PFN_glCompressedTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage2D", e); }
    }

    public void CompressedTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage3D");
        try { Handles.MH_glCompressedTextureSubImage3D.invokeExact(handles.PFN_glCompressedTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage3D", e); }
    }

    public void CopyTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage1D");
        try { Handles.MH_glCopyTextureSubImage1D.invokeExact(handles.PFN_glCopyTextureSubImage1D, texture, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage1D", e); }
    }

    public void CopyTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage2D");
        try { Handles.MH_glCopyTextureSubImage2D.invokeExact(handles.PFN_glCopyTextureSubImage2D, texture, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage2D", e); }
    }

    public void CopyTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage3D");
        try { Handles.MH_glCopyTextureSubImage3D.invokeExact(handles.PFN_glCopyTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage3D", e); }
    }

    public void TextureParameterf(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterf)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterf");
        try { Handles.MH_glTextureParameterf.invokeExact(handles.PFN_glTextureParameterf, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterf", e); }
    }

    public void TextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterfv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterfv");
        try { Handles.MH_glTextureParameterfv.invokeExact(handles.PFN_glTextureParameterfv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfv", e); }
    }

    public void TextureParameteri(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameteri)) throw new SymbolNotFoundError("Symbol not found: glTextureParameteri");
        try { Handles.MH_glTextureParameteri.invokeExact(handles.PFN_glTextureParameteri, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteri", e); }
    }

    public void TextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIiv");
        try { Handles.MH_glTextureParameterIiv.invokeExact(handles.PFN_glTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIiv", e); }
    }

    public void TextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLuint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIuiv");
        try { Handles.MH_glTextureParameterIuiv.invokeExact(handles.PFN_glTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIuiv", e); }
    }

    public void TextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameteriv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameteriv");
        try { Handles.MH_glTextureParameteriv.invokeExact(handles.PFN_glTextureParameteriv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteriv", e); }
    }

    public void GenerateTextureMipmap(@CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenerateTextureMipmap)) throw new SymbolNotFoundError("Symbol not found: glGenerateTextureMipmap");
        try { Handles.MH_glGenerateTextureMipmap.invokeExact(handles.PFN_glGenerateTextureMipmap, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateTextureMipmap", e); }
    }

    public void BindTextureUnit(@CType("GLuint") int unit, @CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindTextureUnit)) throw new SymbolNotFoundError("Symbol not found: glBindTextureUnit");
        try { Handles.MH_glBindTextureUnit.invokeExact(handles.PFN_glBindTextureUnit, unit, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glBindTextureUnit", e); }
    }

    public void GetTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureImage)) throw new SymbolNotFoundError("Symbol not found: glGetTextureImage");
        try { Handles.MH_glGetTextureImage.invokeExact(handles.PFN_glGetTextureImage, texture, level, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureImage", e); }
    }

    public void GetCompressedTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLsizei") int bufSize, @CType("void*") MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedTextureImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureImage");
        try { Handles.MH_glGetCompressedTextureImage.invokeExact(handles.PFN_glGetCompressedTextureImage, texture, level, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureImage", e); }
    }

    public void GetTextureLevelParameterfv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureLevelParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfv");
        try { Handles.MH_glGetTextureLevelParameterfv.invokeExact(handles.PFN_glGetTextureLevelParameterfv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterfv", e); }
    }

    public void GetTextureLevelParameteriv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureLevelParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameteriv");
        try { Handles.MH_glGetTextureLevelParameteriv.invokeExact(handles.PFN_glGetTextureLevelParameteriv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameteriv", e); }
    }

    public void GetTextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterfv");
        try { Handles.MH_glGetTextureParameterfv.invokeExact(handles.PFN_glGetTextureParameterfv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterfv", e); }
    }

    public void GetTextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIiv");
        try { Handles.MH_glGetTextureParameterIiv.invokeExact(handles.PFN_glGetTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIiv", e); }
    }

    public void GetTextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLuint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIuiv");
        try { Handles.MH_glGetTextureParameterIuiv.invokeExact(handles.PFN_glGetTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIuiv", e); }
    }

    public void GetTextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameteriv");
        try { Handles.MH_glGetTextureParameteriv.invokeExact(handles.PFN_glGetTextureParameteriv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameteriv", e); }
    }

    public void CreateVertexArrays(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment arrays) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateVertexArrays)) throw new SymbolNotFoundError("Symbol not found: glCreateVertexArrays");
        try { Handles.MH_glCreateVertexArrays.invokeExact(handles.PFN_glCreateVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateVertexArrays", e); }
    }

    public void DisableVertexArrayAttrib(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableVertexArrayAttrib)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexArrayAttrib");
        try { Handles.MH_glDisableVertexArrayAttrib.invokeExact(handles.PFN_glDisableVertexArrayAttrib, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayAttrib", e); }
    }

    public void EnableVertexArrayAttrib(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableVertexArrayAttrib)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexArrayAttrib");
        try { Handles.MH_glEnableVertexArrayAttrib.invokeExact(handles.PFN_glEnableVertexArrayAttrib, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayAttrib", e); }
    }

    public void VertexArrayElementBuffer(@CType("GLuint") int vaobj, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayElementBuffer)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayElementBuffer");
        try { Handles.MH_glVertexArrayElementBuffer.invokeExact(handles.PFN_glVertexArrayElementBuffer, vaobj, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayElementBuffer", e); }
    }

    public void VertexArrayVertexBuffer(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexBuffer)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffer");
        try { Handles.MH_glVertexArrayVertexBuffer.invokeExact(handles.PFN_glVertexArrayVertexBuffer, vaobj, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBuffer", e); }
    }

    public void VertexArrayVertexBuffers(@CType("GLuint") int vaobj, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") MemorySegment buffers, @CType("const GLintptr *") MemorySegment offsets, @CType("const GLsizei *") MemorySegment strides) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffers");
        try { Handles.MH_glVertexArrayVertexBuffers.invokeExact(handles.PFN_glVertexArrayVertexBuffers, vaobj, first, count, buffers, offsets, strides); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBuffers", e); }
    }

    public void VertexArrayAttribBinding(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLuint") int bindingindex) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayAttribBinding)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribBinding");
        try { Handles.MH_glVertexArrayAttribBinding.invokeExact(handles.PFN_glVertexArrayAttribBinding, vaobj, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribBinding", e); }
    }

    public void VertexArrayAttribFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int relativeoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayAttribFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribFormat");
        try { Handles.MH_glVertexArrayAttribFormat.invokeExact(handles.PFN_glVertexArrayAttribFormat, vaobj, attribindex, size, type, normalized, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribFormat", e); }
    }

    public void VertexArrayAttribIFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayAttribIFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribIFormat");
        try { Handles.MH_glVertexArrayAttribIFormat.invokeExact(handles.PFN_glVertexArrayAttribIFormat, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribIFormat", e); }
    }

    public void VertexArrayAttribLFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayAttribLFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribLFormat");
        try { Handles.MH_glVertexArrayAttribLFormat.invokeExact(handles.PFN_glVertexArrayAttribLFormat, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribLFormat", e); }
    }

    public void VertexArrayBindingDivisor(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int divisor) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayBindingDivisor)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayBindingDivisor");
        try { Handles.MH_glVertexArrayBindingDivisor.invokeExact(handles.PFN_glVertexArrayBindingDivisor, vaobj, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayBindingDivisor", e); }
    }

    public void GetVertexArrayiv(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayiv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayiv");
        try { Handles.MH_glGetVertexArrayiv.invokeExact(handles.PFN_glGetVertexArrayiv, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayiv", e); }
    }

    public void GetVertexArrayIndexediv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayIndexediv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexediv");
        try { Handles.MH_glGetVertexArrayIndexediv.invokeExact(handles.PFN_glGetVertexArrayIndexediv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexediv", e); }
    }

    public void GetVertexArrayIndexed64iv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint64 *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayIndexed64iv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexed64iv");
        try { Handles.MH_glGetVertexArrayIndexed64iv.invokeExact(handles.PFN_glGetVertexArrayIndexed64iv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexed64iv", e); }
    }

    public void CreateSamplers(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment samplers) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateSamplers)) throw new SymbolNotFoundError("Symbol not found: glCreateSamplers");
        try { Handles.MH_glCreateSamplers.invokeExact(handles.PFN_glCreateSamplers, n, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateSamplers", e); }
    }

    public void CreateProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment pipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glCreateProgramPipelines");
        try { Handles.MH_glCreateProgramPipelines.invokeExact(handles.PFN_glCreateProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateProgramPipelines", e); }
    }

    public void CreateQueries(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") MemorySegment ids) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateQueries)) throw new SymbolNotFoundError("Symbol not found: glCreateQueries");
        try { Handles.MH_glCreateQueries.invokeExact(handles.PFN_glCreateQueries, target, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateQueries", e); }
    }

    public void GetQueryBufferObjecti64v(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryBufferObjecti64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjecti64v");
        try { Handles.MH_glGetQueryBufferObjecti64v.invokeExact(handles.PFN_glGetQueryBufferObjecti64v, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjecti64v", e); }
    }

    public void GetQueryBufferObjectiv(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryBufferObjectiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectiv");
        try { Handles.MH_glGetQueryBufferObjectiv.invokeExact(handles.PFN_glGetQueryBufferObjectiv, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectiv", e); }
    }

    public void GetQueryBufferObjectui64v(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryBufferObjectui64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectui64v");
        try { Handles.MH_glGetQueryBufferObjectui64v.invokeExact(handles.PFN_glGetQueryBufferObjectui64v, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectui64v", e); }
    }

    public void GetQueryBufferObjectuiv(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryBufferObjectuiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectuiv");
        try { Handles.MH_glGetQueryBufferObjectuiv.invokeExact(handles.PFN_glGetQueryBufferObjectuiv, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectuiv", e); }
    }

}
