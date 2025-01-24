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
        public static final MethodHandle MH_glUnmapNamedBuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
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
        public static final MethodHandle MH_glTextureStorage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureStorage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
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
        public static final MethodHandle MH_glVertexArrayAttribFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
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

    /// ```
    /// void glCreateTransformFeedbacks(int n, GLuint* ids);
    /// ```
    public void CreateTransformFeedbacks(int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateTransformFeedbacks)) throw new SymbolNotFoundError("Symbol not found: glCreateTransformFeedbacks");
        try { Handles.MH_glCreateTransformFeedbacks.invokeExact(handles.PFN_glCreateTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in CreateTransformFeedbacks", e); }
    }

    /// ```
    /// void glTransformFeedbackBufferBase(unsigned int xfb, unsigned int index, unsigned int buffer);
    /// ```
    public void TransformFeedbackBufferBase(int xfb, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackBufferBase)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackBufferBase");
        try { Handles.MH_glTransformFeedbackBufferBase.invokeExact(handles.PFN_glTransformFeedbackBufferBase, xfb, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackBufferBase", e); }
    }

    /// ```
    /// void glTransformFeedbackBufferRange(unsigned int xfb, unsigned int index, unsigned int buffer, signed long long offset, signed long long size);
    /// ```
    public void TransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackBufferRange");
        try { Handles.MH_glTransformFeedbackBufferRange.invokeExact(handles.PFN_glTransformFeedbackBufferRange, xfb, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackBufferRange", e); }
    }

    /// ```
    /// void glGetTransformFeedbackiv(unsigned int xfb, unsigned int pname, GLint* param);
    /// ```
    public void GetTransformFeedbackiv(int xfb, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbackiv)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbackiv");
        try { Handles.MH_glGetTransformFeedbackiv.invokeExact(handles.PFN_glGetTransformFeedbackiv, xfb, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbackiv", e); }
    }

    /// ```
    /// void glGetTransformFeedbacki_v(unsigned int xfb, unsigned int pname, unsigned int index, GLint* param);
    /// ```
    public void GetTransformFeedbacki_v(int xfb, int pname, int index, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbacki_v)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki_v");
        try { Handles.MH_glGetTransformFeedbacki_v.invokeExact(handles.PFN_glGetTransformFeedbacki_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbacki_v", e); }
    }

    /// ```
    /// void glGetTransformFeedbacki64_v(unsigned int xfb, unsigned int pname, unsigned int index, GLint64* param);
    /// ```
    public void GetTransformFeedbacki64_v(int xfb, int pname, int index, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbacki64_v)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki64_v");
        try { Handles.MH_glGetTransformFeedbacki64_v.invokeExact(handles.PFN_glGetTransformFeedbacki64_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbacki64_v", e); }
    }

    /// ```
    /// void glCreateBuffers(int n, GLuint* buffers);
    /// ```
    public void CreateBuffers(int n, MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateBuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateBuffers");
        try { Handles.MH_glCreateBuffers.invokeExact(handles.PFN_glCreateBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateBuffers", e); }
    }

    /// ```
    /// void glNamedBufferStorage(unsigned int buffer, signed long long size, const void* data, unsigned int flags);
    /// ```
    public void NamedBufferStorage(int buffer, long size, MemorySegment data, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferStorage)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorage");
        try { Handles.MH_glNamedBufferStorage.invokeExact(handles.PFN_glNamedBufferStorage, buffer, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferStorage", e); }
    }

    /// ```
    /// void glNamedBufferData(unsigned int buffer, signed long long size, const void* data, unsigned int usage);
    /// ```
    public void NamedBufferData(int buffer, long size, MemorySegment data, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferData)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferData");
        try { Handles.MH_glNamedBufferData.invokeExact(handles.PFN_glNamedBufferData, buffer, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferData", e); }
    }

    /// ```
    /// void glNamedBufferSubData(unsigned int buffer, signed long long offset, signed long long size, const void* data);
    /// ```
    public void NamedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferSubData");
        try { Handles.MH_glNamedBufferSubData.invokeExact(handles.PFN_glNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferSubData", e); }
    }

    /// ```
    /// void glCopyNamedBufferSubData(unsigned int readBuffer, unsigned int writeBuffer, signed long long readOffset, signed long long writeOffset, signed long long size);
    /// ```
    public void CopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glCopyNamedBufferSubData");
        try { Handles.MH_glCopyNamedBufferSubData.invokeExact(handles.PFN_glCopyNamedBufferSubData, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in CopyNamedBufferSubData", e); }
    }

    /// ```
    /// void glClearNamedBufferData(unsigned int buffer, unsigned int internalformat, unsigned int format, unsigned int type, const void* data);
    /// ```
    public void ClearNamedBufferData(int buffer, int internalformat, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedBufferData)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferData");
        try { Handles.MH_glClearNamedBufferData.invokeExact(handles.PFN_glClearNamedBufferData, buffer, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedBufferData", e); }
    }

    /// ```
    /// void glClearNamedBufferSubData(unsigned int buffer, unsigned int internalformat, signed long long offset, signed long long size, unsigned int format, unsigned int type, const void* data);
    /// ```
    public void ClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferSubData");
        try { Handles.MH_glClearNamedBufferSubData.invokeExact(handles.PFN_glClearNamedBufferSubData, buffer, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedBufferSubData", e); }
    }

    /// ```
    /// void* glMapNamedBuffer(unsigned int buffer, unsigned int access);
    /// ```
    public MemorySegment MapNamedBuffer(int buffer, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapNamedBuffer)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBuffer");
        try { return (MemorySegment) Handles.MH_glMapNamedBuffer.invokeExact(handles.PFN_glMapNamedBuffer, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapNamedBuffer", e); }
    }

    /// ```
    /// void* glMapNamedBufferRange(unsigned int buffer, signed long long offset, signed long long length, unsigned int access);
    /// ```
    public MemorySegment MapNamedBufferRange(int buffer, long offset, long length, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapNamedBufferRange)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBufferRange");
        try { return (MemorySegment) Handles.MH_glMapNamedBufferRange.invokeExact(handles.PFN_glMapNamedBufferRange, buffer, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapNamedBufferRange", e); }
    }

    /// ```
    /// GLboolean glUnmapNamedBuffer(unsigned int buffer);
    /// ```
    public boolean UnmapNamedBuffer(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapNamedBuffer)) throw new SymbolNotFoundError("Symbol not found: glUnmapNamedBuffer");
        try { return (((byte) Handles.MH_glUnmapNamedBuffer.invokeExact(handles.PFN_glUnmapNamedBuffer, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapNamedBuffer", e); }
    }

    /// ```
    /// void glFlushMappedNamedBufferRange(unsigned int buffer, signed long long offset, signed long long length);
    /// ```
    public void FlushMappedNamedBufferRange(int buffer, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushMappedNamedBufferRange)) throw new SymbolNotFoundError("Symbol not found: glFlushMappedNamedBufferRange");
        try { Handles.MH_glFlushMappedNamedBufferRange.invokeExact(handles.PFN_glFlushMappedNamedBufferRange, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedNamedBufferRange", e); }
    }

    /// ```
    /// void glGetNamedBufferParameteriv(unsigned int buffer, unsigned int pname, GLint* params);
    /// ```
    public void GetNamedBufferParameteriv(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteriv");
        try { Handles.MH_glGetNamedBufferParameteriv.invokeExact(handles.PFN_glGetNamedBufferParameteriv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferParameteriv", e); }
    }

    /// ```
    /// void glGetNamedBufferParameteri64v(unsigned int buffer, unsigned int pname, GLint64* params);
    /// ```
    public void GetNamedBufferParameteri64v(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferParameteri64v)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteri64v");
        try { Handles.MH_glGetNamedBufferParameteri64v.invokeExact(handles.PFN_glGetNamedBufferParameteri64v, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferParameteri64v", e); }
    }

    /// ```
    /// void glGetNamedBufferPointerv(unsigned int buffer, unsigned int pname, void** params);
    /// ```
    public void GetNamedBufferPointerv(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferPointerv");
        try { Handles.MH_glGetNamedBufferPointerv.invokeExact(handles.PFN_glGetNamedBufferPointerv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferPointerv", e); }
    }

    /// ```
    /// void glGetNamedBufferSubData(unsigned int buffer, signed long long offset, signed long long size, void* data);
    /// ```
    public void GetNamedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferSubData");
        try { Handles.MH_glGetNamedBufferSubData.invokeExact(handles.PFN_glGetNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferSubData", e); }
    }

    /// ```
    /// void glCreateFramebuffers(int n, GLuint* framebuffers);
    /// ```
    public void CreateFramebuffers(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateFramebuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateFramebuffers");
        try { Handles.MH_glCreateFramebuffers.invokeExact(handles.PFN_glCreateFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateFramebuffers", e); }
    }

    /// ```
    /// void glNamedFramebufferRenderbuffer(unsigned int framebuffer, unsigned int attachment, unsigned int renderbuffertarget, unsigned int renderbuffer);
    /// ```
    public void NamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferRenderbuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferRenderbuffer");
        try { Handles.MH_glNamedFramebufferRenderbuffer.invokeExact(handles.PFN_glNamedFramebufferRenderbuffer, framebuffer, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferRenderbuffer", e); }
    }

    /// ```
    /// void glNamedFramebufferParameteri(unsigned int framebuffer, unsigned int pname, int param);
    /// ```
    public void NamedFramebufferParameteri(int framebuffer, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferParameteri)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferParameteri");
        try { Handles.MH_glNamedFramebufferParameteri.invokeExact(handles.PFN_glNamedFramebufferParameteri, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferParameteri", e); }
    }

    /// ```
    /// void glNamedFramebufferTexture(unsigned int framebuffer, unsigned int attachment, unsigned int texture, int level);
    /// ```
    public void NamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTexture)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTexture");
        try { Handles.MH_glNamedFramebufferTexture.invokeExact(handles.PFN_glNamedFramebufferTexture, framebuffer, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTexture", e); }
    }

    /// ```
    /// void glNamedFramebufferTextureLayer(unsigned int framebuffer, unsigned int attachment, unsigned int texture, int level, int layer);
    /// ```
    public void NamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTextureLayer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTextureLayer");
        try { Handles.MH_glNamedFramebufferTextureLayer.invokeExact(handles.PFN_glNamedFramebufferTextureLayer, framebuffer, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTextureLayer", e); }
    }

    /// ```
    /// void glNamedFramebufferDrawBuffer(unsigned int framebuffer, unsigned int buf);
    /// ```
    public void NamedFramebufferDrawBuffer(int framebuffer, int buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffer");
        try { Handles.MH_glNamedFramebufferDrawBuffer.invokeExact(handles.PFN_glNamedFramebufferDrawBuffer, framebuffer, buf); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferDrawBuffer", e); }
    }

    /// ```
    /// void glNamedFramebufferDrawBuffers(unsigned int framebuffer, int n, const GLenum* bufs);
    /// ```
    public void NamedFramebufferDrawBuffers(int framebuffer, int n, MemorySegment bufs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffers)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffers");
        try { Handles.MH_glNamedFramebufferDrawBuffers.invokeExact(handles.PFN_glNamedFramebufferDrawBuffers, framebuffer, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferDrawBuffers", e); }
    }

    /// ```
    /// void glNamedFramebufferReadBuffer(unsigned int framebuffer, unsigned int src);
    /// ```
    public void NamedFramebufferReadBuffer(int framebuffer, int src) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferReadBuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferReadBuffer");
        try { Handles.MH_glNamedFramebufferReadBuffer.invokeExact(handles.PFN_glNamedFramebufferReadBuffer, framebuffer, src); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferReadBuffer", e); }
    }

    /// ```
    /// void glInvalidateNamedFramebufferData(unsigned int framebuffer, int numAttachments, const GLenum* attachments);
    /// ```
    public void InvalidateNamedFramebufferData(int framebuffer, int numAttachments, MemorySegment attachments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateNamedFramebufferData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferData");
        try { Handles.MH_glInvalidateNamedFramebufferData.invokeExact(handles.PFN_glInvalidateNamedFramebufferData, framebuffer, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateNamedFramebufferData", e); }
    }

    /// ```
    /// void glInvalidateNamedFramebufferSubData(unsigned int framebuffer, int numAttachments, const GLenum* attachments, int x, int y, int width, int height);
    /// ```
    public void InvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateNamedFramebufferSubData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferSubData");
        try { Handles.MH_glInvalidateNamedFramebufferSubData.invokeExact(handles.PFN_glInvalidateNamedFramebufferSubData, framebuffer, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateNamedFramebufferSubData", e); }
    }

    /// ```
    /// void glClearNamedFramebufferiv(unsigned int framebuffer, unsigned int buffer, int drawbuffer, const GLint* value);
    /// ```
    public void ClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferiv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferiv");
        try { Handles.MH_glClearNamedFramebufferiv.invokeExact(handles.PFN_glClearNamedFramebufferiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferiv", e); }
    }

    /// ```
    /// void glClearNamedFramebufferuiv(unsigned int framebuffer, unsigned int buffer, int drawbuffer, const GLuint* value);
    /// ```
    public void ClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferuiv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferuiv");
        try { Handles.MH_glClearNamedFramebufferuiv.invokeExact(handles.PFN_glClearNamedFramebufferuiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferuiv", e); }
    }

    /// ```
    /// void glClearNamedFramebufferfv(unsigned int framebuffer, unsigned int buffer, int drawbuffer, const GLfloat* value);
    /// ```
    public void ClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferfv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferfv");
        try { Handles.MH_glClearNamedFramebufferfv.invokeExact(handles.PFN_glClearNamedFramebufferfv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferfv", e); }
    }

    /// ```
    /// void glClearNamedFramebufferfi(unsigned int framebuffer, unsigned int buffer, int drawbuffer, float depth, int stencil);
    /// ```
    public void ClearNamedFramebufferfi(int framebuffer, int buffer, int drawbuffer, float depth, int stencil) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferfi)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferfi");
        try { Handles.MH_glClearNamedFramebufferfi.invokeExact(handles.PFN_glClearNamedFramebufferfi, framebuffer, buffer, drawbuffer, depth, stencil); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferfi", e); }
    }

    /// ```
    /// void glBlitNamedFramebuffer(unsigned int readFramebuffer, unsigned int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, unsigned int mask, unsigned int filter);
    /// ```
    public void BlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitNamedFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glBlitNamedFramebuffer");
        try { Handles.MH_glBlitNamedFramebuffer.invokeExact(handles.PFN_glBlitNamedFramebuffer, readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitNamedFramebuffer", e); }
    }

    /// ```
    /// unsigned int glCheckNamedFramebufferStatus(unsigned int framebuffer, unsigned int target);
    /// ```
    public int CheckNamedFramebufferStatus(int framebuffer, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCheckNamedFramebufferStatus)) throw new SymbolNotFoundError("Symbol not found: glCheckNamedFramebufferStatus");
        try { return (int) Handles.MH_glCheckNamedFramebufferStatus.invokeExact(handles.PFN_glCheckNamedFramebufferStatus, framebuffer, target); }
        catch (Throwable e) { throw new RuntimeException("error in CheckNamedFramebufferStatus", e); }
    }

    /// ```
    /// void glGetNamedFramebufferParameteriv(unsigned int framebuffer, unsigned int pname, GLint* param);
    /// ```
    public void GetNamedFramebufferParameteriv(int framebuffer, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameteriv");
        try { Handles.MH_glGetNamedFramebufferParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferParameteriv, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferParameteriv", e); }
    }

    /// ```
    /// void glGetNamedFramebufferAttachmentParameteriv(unsigned int framebuffer, unsigned int attachment, unsigned int pname, GLint* params);
    /// ```
    public void GetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferAttachmentParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameteriv");
        try { Handles.MH_glGetNamedFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferAttachmentParameteriv, framebuffer, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferAttachmentParameteriv", e); }
    }

    /// ```
    /// void glCreateRenderbuffers(int n, GLuint* renderbuffers);
    /// ```
    public void CreateRenderbuffers(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateRenderbuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateRenderbuffers");
        try { Handles.MH_glCreateRenderbuffers.invokeExact(handles.PFN_glCreateRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateRenderbuffers", e); }
    }

    /// ```
    /// void glNamedRenderbufferStorage(unsigned int renderbuffer, unsigned int internalformat, int width, int height);
    /// ```
    public void NamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorage)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorage");
        try { Handles.MH_glNamedRenderbufferStorage.invokeExact(handles.PFN_glNamedRenderbufferStorage, renderbuffer, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorage", e); }
    }

    /// ```
    /// void glNamedRenderbufferStorageMultisample(unsigned int renderbuffer, int samples, unsigned int internalformat, int width, int height);
    /// ```
    public void NamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisample)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisample");
        try { Handles.MH_glNamedRenderbufferStorageMultisample.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisample, renderbuffer, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorageMultisample", e); }
    }

    /// ```
    /// void glGetNamedRenderbufferParameteriv(unsigned int renderbuffer, unsigned int pname, GLint* params);
    /// ```
    public void GetNamedRenderbufferParameteriv(int renderbuffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedRenderbufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameteriv");
        try { Handles.MH_glGetNamedRenderbufferParameteriv.invokeExact(handles.PFN_glGetNamedRenderbufferParameteriv, renderbuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedRenderbufferParameteriv", e); }
    }

    /// ```
    /// void glCreateTextures(unsigned int target, int n, GLuint* textures);
    /// ```
    public void CreateTextures(int target, int n, MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateTextures)) throw new SymbolNotFoundError("Symbol not found: glCreateTextures");
        try { Handles.MH_glCreateTextures.invokeExact(handles.PFN_glCreateTextures, target, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in CreateTextures", e); }
    }

    /// ```
    /// void glTextureBuffer(unsigned int texture, unsigned int internalformat, unsigned int buffer);
    /// ```
    public void TextureBuffer(int texture, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBuffer)) throw new SymbolNotFoundError("Symbol not found: glTextureBuffer");
        try { Handles.MH_glTextureBuffer.invokeExact(handles.PFN_glTextureBuffer, texture, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBuffer", e); }
    }

    /// ```
    /// void glTextureBufferRange(unsigned int texture, unsigned int internalformat, unsigned int buffer, signed long long offset, signed long long size);
    /// ```
    public void TextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTextureBufferRange");
        try { Handles.MH_glTextureBufferRange.invokeExact(handles.PFN_glTextureBufferRange, texture, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBufferRange", e); }
    }

    /// ```
    /// void glTextureStorage1D(unsigned int texture, int levels, unsigned int internalformat, int width);
    /// ```
    public void TextureStorage1D(int texture, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage1D)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage1D");
        try { Handles.MH_glTextureStorage1D.invokeExact(handles.PFN_glTextureStorage1D, texture, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage1D", e); }
    }

    /// ```
    /// void glTextureStorage2D(unsigned int texture, int levels, unsigned int internalformat, int width, int height);
    /// ```
    public void TextureStorage2D(int texture, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2D)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2D");
        try { Handles.MH_glTextureStorage2D.invokeExact(handles.PFN_glTextureStorage2D, texture, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2D", e); }
    }

    /// ```
    /// void glTextureStorage3D(unsigned int texture, int levels, unsigned int internalformat, int width, int height, int depth);
    /// ```
    public void TextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3D)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3D");
        try { Handles.MH_glTextureStorage3D.invokeExact(handles.PFN_glTextureStorage3D, texture, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3D", e); }
    }

    /// ```
    /// void glTextureStorage2DMultisample(unsigned int texture, int samples, unsigned int internalformat, int width, int height, GLboolean fixedsamplelocations);
    /// ```
    public void TextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2DMultisample");
        try { Handles.MH_glTextureStorage2DMultisample.invokeExact(handles.PFN_glTextureStorage2DMultisample, texture, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2DMultisample", e); }
    }

    /// ```
    /// void glTextureStorage3DMultisample(unsigned int texture, int samples, unsigned int internalformat, int width, int height, int depth, GLboolean fixedsamplelocations);
    /// ```
    public void TextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3DMultisample");
        try { Handles.MH_glTextureStorage3DMultisample.invokeExact(handles.PFN_glTextureStorage3DMultisample, texture, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3DMultisample", e); }
    }

    /// ```
    /// void glTextureSubImage1D(unsigned int texture, int level, int xoffset, int width, unsigned int format, unsigned int type, const void* pixels);
    /// ```
    public void TextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage1D");
        try { Handles.MH_glTextureSubImage1D.invokeExact(handles.PFN_glTextureSubImage1D, texture, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage1D", e); }
    }

    /// ```
    /// void glTextureSubImage2D(unsigned int texture, int level, int xoffset, int yoffset, int width, int height, unsigned int format, unsigned int type, const void* pixels);
    /// ```
    public void TextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage2D");
        try { Handles.MH_glTextureSubImage2D.invokeExact(handles.PFN_glTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage2D", e); }
    }

    /// ```
    /// void glTextureSubImage3D(unsigned int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, unsigned int format, unsigned int type, const void* pixels);
    /// ```
    public void TextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage3D");
        try { Handles.MH_glTextureSubImage3D.invokeExact(handles.PFN_glTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage3D", e); }
    }

    /// ```
    /// void glCompressedTextureSubImage1D(unsigned int texture, int level, int xoffset, int width, unsigned int format, int imageSize, const void* data);
    /// ```
    public void CompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1D");
        try { Handles.MH_glCompressedTextureSubImage1D.invokeExact(handles.PFN_glCompressedTextureSubImage1D, texture, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage1D", e); }
    }

    /// ```
    /// void glCompressedTextureSubImage2D(unsigned int texture, int level, int xoffset, int yoffset, int width, int height, unsigned int format, int imageSize, const void* data);
    /// ```
    public void CompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2D");
        try { Handles.MH_glCompressedTextureSubImage2D.invokeExact(handles.PFN_glCompressedTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage2D", e); }
    }

    /// ```
    /// void glCompressedTextureSubImage3D(unsigned int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, unsigned int format, int imageSize, const void* data);
    /// ```
    public void CompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage3D");
        try { Handles.MH_glCompressedTextureSubImage3D.invokeExact(handles.PFN_glCompressedTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage3D", e); }
    }

    /// ```
    /// void glCopyTextureSubImage1D(unsigned int texture, int level, int xoffset, int x, int y, int width);
    /// ```
    public void CopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage1D");
        try { Handles.MH_glCopyTextureSubImage1D.invokeExact(handles.PFN_glCopyTextureSubImage1D, texture, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage1D", e); }
    }

    /// ```
    /// void glCopyTextureSubImage2D(unsigned int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height);
    /// ```
    public void CopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage2D");
        try { Handles.MH_glCopyTextureSubImage2D.invokeExact(handles.PFN_glCopyTextureSubImage2D, texture, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage2D", e); }
    }

    /// ```
    /// void glCopyTextureSubImage3D(unsigned int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height);
    /// ```
    public void CopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage3D");
        try { Handles.MH_glCopyTextureSubImage3D.invokeExact(handles.PFN_glCopyTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage3D", e); }
    }

    /// ```
    /// void glTextureParameterf(unsigned int texture, unsigned int pname, float param);
    /// ```
    public void TextureParameterf(int texture, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterf)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterf");
        try { Handles.MH_glTextureParameterf.invokeExact(handles.PFN_glTextureParameterf, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterf", e); }
    }

    /// ```
    /// void glTextureParameterfv(unsigned int texture, unsigned int pname, const GLfloat* param);
    /// ```
    public void TextureParameterfv(int texture, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterfv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterfv");
        try { Handles.MH_glTextureParameterfv.invokeExact(handles.PFN_glTextureParameterfv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterfv", e); }
    }

    /// ```
    /// void glTextureParameteri(unsigned int texture, unsigned int pname, int param);
    /// ```
    public void TextureParameteri(int texture, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameteri)) throw new SymbolNotFoundError("Symbol not found: glTextureParameteri");
        try { Handles.MH_glTextureParameteri.invokeExact(handles.PFN_glTextureParameteri, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameteri", e); }
    }

    /// ```
    /// void glTextureParameterIiv(unsigned int texture, unsigned int pname, const GLint* params);
    /// ```
    public void TextureParameterIiv(int texture, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIiv");
        try { Handles.MH_glTextureParameterIiv.invokeExact(handles.PFN_glTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterIiv", e); }
    }

    /// ```
    /// void glTextureParameterIuiv(unsigned int texture, unsigned int pname, const GLuint* params);
    /// ```
    public void TextureParameterIuiv(int texture, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIuiv");
        try { Handles.MH_glTextureParameterIuiv.invokeExact(handles.PFN_glTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterIuiv", e); }
    }

    /// ```
    /// void glTextureParameteriv(unsigned int texture, unsigned int pname, const GLint* param);
    /// ```
    public void TextureParameteriv(int texture, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameteriv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameteriv");
        try { Handles.MH_glTextureParameteriv.invokeExact(handles.PFN_glTextureParameteriv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameteriv", e); }
    }

    /// ```
    /// void glGenerateTextureMipmap(unsigned int texture);
    /// ```
    public void GenerateTextureMipmap(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateTextureMipmap)) throw new SymbolNotFoundError("Symbol not found: glGenerateTextureMipmap");
        try { Handles.MH_glGenerateTextureMipmap.invokeExact(handles.PFN_glGenerateTextureMipmap, texture); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateTextureMipmap", e); }
    }

    /// ```
    /// void glBindTextureUnit(unsigned int unit, unsigned int texture);
    /// ```
    public void BindTextureUnit(int unit, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextureUnit)) throw new SymbolNotFoundError("Symbol not found: glBindTextureUnit");
        try { Handles.MH_glBindTextureUnit.invokeExact(handles.PFN_glBindTextureUnit, unit, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextureUnit", e); }
    }

    /// ```
    /// void glGetTextureImage(unsigned int texture, int level, unsigned int format, unsigned int type, int bufSize, void* pixels);
    /// ```
    public void GetTextureImage(int texture, int level, int format, int type, int bufSize, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureImage)) throw new SymbolNotFoundError("Symbol not found: glGetTextureImage");
        try { Handles.MH_glGetTextureImage.invokeExact(handles.PFN_glGetTextureImage, texture, level, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureImage", e); }
    }

    /// ```
    /// void glGetCompressedTextureImage(unsigned int texture, int level, int bufSize, void* pixels);
    /// ```
    public void GetCompressedTextureImage(int texture, int level, int bufSize, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedTextureImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureImage");
        try { Handles.MH_glGetCompressedTextureImage.invokeExact(handles.PFN_glGetCompressedTextureImage, texture, level, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedTextureImage", e); }
    }

    /// ```
    /// void glGetTextureLevelParameterfv(unsigned int texture, int level, unsigned int pname, GLfloat* params);
    /// ```
    public void GetTextureLevelParameterfv(int texture, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureLevelParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfv");
        try { Handles.MH_glGetTextureLevelParameterfv.invokeExact(handles.PFN_glGetTextureLevelParameterfv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureLevelParameterfv", e); }
    }

    /// ```
    /// void glGetTextureLevelParameteriv(unsigned int texture, int level, unsigned int pname, GLint* params);
    /// ```
    public void GetTextureLevelParameteriv(int texture, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureLevelParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameteriv");
        try { Handles.MH_glGetTextureLevelParameteriv.invokeExact(handles.PFN_glGetTextureLevelParameteriv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureLevelParameteriv", e); }
    }

    /// ```
    /// void glGetTextureParameterfv(unsigned int texture, unsigned int pname, GLfloat* params);
    /// ```
    public void GetTextureParameterfv(int texture, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterfv");
        try { Handles.MH_glGetTextureParameterfv.invokeExact(handles.PFN_glGetTextureParameterfv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterfv", e); }
    }

    /// ```
    /// void glGetTextureParameterIiv(unsigned int texture, unsigned int pname, GLint* params);
    /// ```
    public void GetTextureParameterIiv(int texture, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIiv");
        try { Handles.MH_glGetTextureParameterIiv.invokeExact(handles.PFN_glGetTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterIiv", e); }
    }

    /// ```
    /// void glGetTextureParameterIuiv(unsigned int texture, unsigned int pname, GLuint* params);
    /// ```
    public void GetTextureParameterIuiv(int texture, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIuiv");
        try { Handles.MH_glGetTextureParameterIuiv.invokeExact(handles.PFN_glGetTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterIuiv", e); }
    }

    /// ```
    /// void glGetTextureParameteriv(unsigned int texture, unsigned int pname, GLint* params);
    /// ```
    public void GetTextureParameteriv(int texture, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameteriv");
        try { Handles.MH_glGetTextureParameteriv.invokeExact(handles.PFN_glGetTextureParameteriv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameteriv", e); }
    }

    /// ```
    /// void glCreateVertexArrays(int n, GLuint* arrays);
    /// ```
    public void CreateVertexArrays(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateVertexArrays)) throw new SymbolNotFoundError("Symbol not found: glCreateVertexArrays");
        try { Handles.MH_glCreateVertexArrays.invokeExact(handles.PFN_glCreateVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in CreateVertexArrays", e); }
    }

    /// ```
    /// void glDisableVertexArrayAttrib(unsigned int vaobj, unsigned int index);
    /// ```
    public void DisableVertexArrayAttrib(int vaobj, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexArrayAttrib)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexArrayAttrib");
        try { Handles.MH_glDisableVertexArrayAttrib.invokeExact(handles.PFN_glDisableVertexArrayAttrib, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexArrayAttrib", e); }
    }

    /// ```
    /// void glEnableVertexArrayAttrib(unsigned int vaobj, unsigned int index);
    /// ```
    public void EnableVertexArrayAttrib(int vaobj, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexArrayAttrib)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexArrayAttrib");
        try { Handles.MH_glEnableVertexArrayAttrib.invokeExact(handles.PFN_glEnableVertexArrayAttrib, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexArrayAttrib", e); }
    }

    /// ```
    /// void glVertexArrayElementBuffer(unsigned int vaobj, unsigned int buffer);
    /// ```
    public void VertexArrayElementBuffer(int vaobj, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayElementBuffer)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayElementBuffer");
        try { Handles.MH_glVertexArrayElementBuffer.invokeExact(handles.PFN_glVertexArrayElementBuffer, vaobj, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayElementBuffer", e); }
    }

    /// ```
    /// void glVertexArrayVertexBuffer(unsigned int vaobj, unsigned int bindingindex, unsigned int buffer, signed long long offset, int stride);
    /// ```
    public void VertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexBuffer)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffer");
        try { Handles.MH_glVertexArrayVertexBuffer.invokeExact(handles.PFN_glVertexArrayVertexBuffer, vaobj, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexBuffer", e); }
    }

    /// ```
    /// void glVertexArrayVertexBuffers(unsigned int vaobj, unsigned int first, int count, const GLuint* buffers, const GLintptr* offsets, const GLsizei* strides);
    /// ```
    public void VertexArrayVertexBuffers(int vaobj, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexBuffers)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffers");
        try { Handles.MH_glVertexArrayVertexBuffers.invokeExact(handles.PFN_glVertexArrayVertexBuffers, vaobj, first, count, buffers, offsets, strides); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexBuffers", e); }
    }

    /// ```
    /// void glVertexArrayAttribBinding(unsigned int vaobj, unsigned int attribindex, unsigned int bindingindex);
    /// ```
    public void VertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribBinding)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribBinding");
        try { Handles.MH_glVertexArrayAttribBinding.invokeExact(handles.PFN_glVertexArrayAttribBinding, vaobj, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribBinding", e); }
    }

    /// ```
    /// void glVertexArrayAttribFormat(unsigned int vaobj, unsigned int attribindex, int size, unsigned int type, GLboolean normalized, unsigned int relativeoffset);
    /// ```
    public void VertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribFormat");
        try { Handles.MH_glVertexArrayAttribFormat.invokeExact(handles.PFN_glVertexArrayAttribFormat, vaobj, attribindex, size, type, ((normalized) ? (byte)1 : (byte)0), relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribFormat", e); }
    }

    /// ```
    /// void glVertexArrayAttribIFormat(unsigned int vaobj, unsigned int attribindex, int size, unsigned int type, unsigned int relativeoffset);
    /// ```
    public void VertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribIFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribIFormat");
        try { Handles.MH_glVertexArrayAttribIFormat.invokeExact(handles.PFN_glVertexArrayAttribIFormat, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribIFormat", e); }
    }

    /// ```
    /// void glVertexArrayAttribLFormat(unsigned int vaobj, unsigned int attribindex, int size, unsigned int type, unsigned int relativeoffset);
    /// ```
    public void VertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribLFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribLFormat");
        try { Handles.MH_glVertexArrayAttribLFormat.invokeExact(handles.PFN_glVertexArrayAttribLFormat, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribLFormat", e); }
    }

    /// ```
    /// void glVertexArrayBindingDivisor(unsigned int vaobj, unsigned int bindingindex, unsigned int divisor);
    /// ```
    public void VertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayBindingDivisor)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayBindingDivisor");
        try { Handles.MH_glVertexArrayBindingDivisor.invokeExact(handles.PFN_glVertexArrayBindingDivisor, vaobj, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayBindingDivisor", e); }
    }

    /// ```
    /// void glGetVertexArrayiv(unsigned int vaobj, unsigned int pname, GLint* param);
    /// ```
    public void GetVertexArrayiv(int vaobj, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayiv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayiv");
        try { Handles.MH_glGetVertexArrayiv.invokeExact(handles.PFN_glGetVertexArrayiv, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayiv", e); }
    }

    /// ```
    /// void glGetVertexArrayIndexediv(unsigned int vaobj, unsigned int index, unsigned int pname, GLint* param);
    /// ```
    public void GetVertexArrayIndexediv(int vaobj, int index, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayIndexediv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexediv");
        try { Handles.MH_glGetVertexArrayIndexediv.invokeExact(handles.PFN_glGetVertexArrayIndexediv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayIndexediv", e); }
    }

    /// ```
    /// void glGetVertexArrayIndexed64iv(unsigned int vaobj, unsigned int index, unsigned int pname, GLint64* param);
    /// ```
    public void GetVertexArrayIndexed64iv(int vaobj, int index, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayIndexed64iv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexed64iv");
        try { Handles.MH_glGetVertexArrayIndexed64iv.invokeExact(handles.PFN_glGetVertexArrayIndexed64iv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayIndexed64iv", e); }
    }

    /// ```
    /// void glCreateSamplers(int n, GLuint* samplers);
    /// ```
    public void CreateSamplers(int n, MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateSamplers)) throw new SymbolNotFoundError("Symbol not found: glCreateSamplers");
        try { Handles.MH_glCreateSamplers.invokeExact(handles.PFN_glCreateSamplers, n, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSamplers", e); }
    }

    /// ```
    /// void glCreateProgramPipelines(int n, GLuint* pipelines);
    /// ```
    public void CreateProgramPipelines(int n, MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glCreateProgramPipelines");
        try { Handles.MH_glCreateProgramPipelines.invokeExact(handles.PFN_glCreateProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateProgramPipelines", e); }
    }

    /// ```
    /// void glCreateQueries(unsigned int target, int n, GLuint* ids);
    /// ```
    public void CreateQueries(int target, int n, MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateQueries)) throw new SymbolNotFoundError("Symbol not found: glCreateQueries");
        try { Handles.MH_glCreateQueries.invokeExact(handles.PFN_glCreateQueries, target, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in CreateQueries", e); }
    }

    /// ```
    /// void glGetQueryBufferObjecti64v(unsigned int id, unsigned int buffer, unsigned int pname, signed long long offset);
    /// ```
    public void GetQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjecti64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjecti64v");
        try { Handles.MH_glGetQueryBufferObjecti64v.invokeExact(handles.PFN_glGetQueryBufferObjecti64v, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjecti64v", e); }
    }

    /// ```
    /// void glGetQueryBufferObjectiv(unsigned int id, unsigned int buffer, unsigned int pname, signed long long offset);
    /// ```
    public void GetQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjectiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectiv");
        try { Handles.MH_glGetQueryBufferObjectiv.invokeExact(handles.PFN_glGetQueryBufferObjectiv, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjectiv", e); }
    }

    /// ```
    /// void glGetQueryBufferObjectui64v(unsigned int id, unsigned int buffer, unsigned int pname, signed long long offset);
    /// ```
    public void GetQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjectui64v)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectui64v");
        try { Handles.MH_glGetQueryBufferObjectui64v.invokeExact(handles.PFN_glGetQueryBufferObjectui64v, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjectui64v", e); }
    }

    /// ```
    /// void glGetQueryBufferObjectuiv(unsigned int id, unsigned int buffer, unsigned int pname, signed long long offset);
    /// ```
    public void GetQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjectuiv)) throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectuiv");
        try { Handles.MH_glGetQueryBufferObjectuiv.invokeExact(handles.PFN_glGetQueryBufferObjectuiv, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjectuiv", e); }
    }

}
