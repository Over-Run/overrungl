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
package overrungl.opengl;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL45 extends GL44 {
    public static final int GL_CONTEXT_LOST = 0x0507;
    public static final int GL_NEGATIVE_ONE_TO_ONE = 0x935E;
    public static final int GL_ZERO_TO_ONE = 0x935F;
    public static final int GL_CLIP_ORIGIN = 0x935C;
    public static final int GL_CLIP_DEPTH_MODE = 0x935D;
    public static final int GL_QUERY_WAIT_INVERTED = 0x8E17;
    public static final int GL_QUERY_NO_WAIT_INVERTED = 0x8E18;
    public static final int GL_QUERY_BY_REGION_WAIT_INVERTED = 0x8E19;
    public static final int GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;
    public static final int GL_MAX_CULL_DISTANCES = 0x82F9;
    public static final int GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;
    public static final int GL_TEXTURE_TARGET = 0x1006;
    public static final int GL_QUERY_TARGET = 0x82EA;
    public static final int GL_GUILTY_CONTEXT_RESET = 0x8253;
    public static final int GL_INNOCENT_CONTEXT_RESET = 0x8254;
    public static final int GL_UNKNOWN_CONTEXT_RESET = 0x8255;
    public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;
    public static final int GL_LOSE_CONTEXT_ON_RESET = 0x8252;
    public static final int GL_NO_RESET_NOTIFICATION = 0x8261;
    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x00000004;
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;
    public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glClipControl = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateTransformFeedbacks = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTransformFeedbackBufferBase = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTransformFeedbackBufferRange = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetTransformFeedbackiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTransformFeedbacki_v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTransformFeedbacki64_v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedBufferStorage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedBufferData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedBufferSubData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyNamedBufferSubData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glClearNamedBufferData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearNamedBufferSubData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMapNamedBuffer = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMapNamedBufferRange = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUnmapNamedBuffer = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFlushMappedNamedBufferRange = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetNamedBufferParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedBufferParameteri64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedBufferPointerv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedBufferSubData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateFramebuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedFramebufferRenderbuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTexture = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTextureLayer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferDrawBuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferDrawBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedFramebufferReadBuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glInvalidateNamedFramebufferData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glInvalidateNamedFramebufferSubData = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearNamedFramebufferiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearNamedFramebufferuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearNamedFramebufferfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearNamedFramebufferfi = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBlitNamedFramebuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCheckNamedFramebufferStatus = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetNamedFramebufferParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedFramebufferAttachmentParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateRenderbuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedRenderbufferStorage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedRenderbufferStorageMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetNamedRenderbufferParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateTextures = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureBuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureBufferRange = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorage1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage2DMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureStorage3DMultisample = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureSubImage1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureSubImage2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureSubImage3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureSubImage1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureSubImage2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureSubImage3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyTextureSubImage1D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTextureSubImage2D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTextureSubImage3D = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureParameterf = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTextureParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureParameteri = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureParameterIiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureParameterIuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenerateTextureMipmap = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindTextureUnit = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetTextureImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetCompressedTextureImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureLevelParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureLevelParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterIiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterIuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameteriv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateVertexArrays = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDisableVertexArrayAttrib = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEnableVertexArrayAttrib = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayElementBuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexBuffer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexArrayAttribBinding = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayAttribFormat = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayAttribIFormat = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayAttribLFormat = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayBindingDivisor = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetVertexArrayiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexArrayIndexediv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexArrayIndexed64iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateSamplers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateProgramPipelines = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCreateQueries = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetQueryBufferObjecti64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetQueryBufferObjectiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetQueryBufferObjectui64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetQueryBufferObjectuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glMemoryBarrierByRegion = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetTextureSubImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetCompressedTextureSubImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetGraphicsResetStatus = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetnCompressedTexImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnTexImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformdv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetnUniformuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReadnPixels = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureBarrier = FunctionDescriptor.ofVoid();
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glClipControl,
            FD_glCreateTransformFeedbacks,
            FD_glTransformFeedbackBufferBase,
            FD_glTransformFeedbackBufferRange,
            FD_glGetTransformFeedbackiv,
            FD_glGetTransformFeedbacki_v,
            FD_glGetTransformFeedbacki64_v,
            FD_glCreateBuffers,
            FD_glNamedBufferStorage,
            FD_glNamedBufferData,
            FD_glNamedBufferSubData,
            FD_glCopyNamedBufferSubData,
            FD_glClearNamedBufferData,
            FD_glClearNamedBufferSubData,
            FD_glMapNamedBuffer,
            FD_glMapNamedBufferRange,
            FD_glUnmapNamedBuffer,
            FD_glFlushMappedNamedBufferRange,
            FD_glGetNamedBufferParameteriv,
            FD_glGetNamedBufferParameteri64v,
            FD_glGetNamedBufferPointerv,
            FD_glGetNamedBufferSubData,
            FD_glCreateFramebuffers,
            FD_glNamedFramebufferRenderbuffer,
            FD_glNamedFramebufferParameteri,
            FD_glNamedFramebufferTexture,
            FD_glNamedFramebufferTextureLayer,
            FD_glNamedFramebufferDrawBuffer,
            FD_glNamedFramebufferDrawBuffers,
            FD_glNamedFramebufferReadBuffer,
            FD_glInvalidateNamedFramebufferData,
            FD_glInvalidateNamedFramebufferSubData,
            FD_glClearNamedFramebufferiv,
            FD_glClearNamedFramebufferuiv,
            FD_glClearNamedFramebufferfv,
            FD_glClearNamedFramebufferfi,
            FD_glBlitNamedFramebuffer,
            FD_glCheckNamedFramebufferStatus,
            FD_glGetNamedFramebufferParameteriv,
            FD_glGetNamedFramebufferAttachmentParameteriv,
            FD_glCreateRenderbuffers,
            FD_glNamedRenderbufferStorage,
            FD_glNamedRenderbufferStorageMultisample,
            FD_glGetNamedRenderbufferParameteriv,
            FD_glCreateTextures,
            FD_glTextureBuffer,
            FD_glTextureBufferRange,
            FD_glTextureStorage1D,
            FD_glTextureStorage2D,
            FD_glTextureStorage3D,
            FD_glTextureStorage2DMultisample,
            FD_glTextureStorage3DMultisample,
            FD_glTextureSubImage1D,
            FD_glTextureSubImage2D,
            FD_glTextureSubImage3D,
            FD_glCompressedTextureSubImage1D,
            FD_glCompressedTextureSubImage2D,
            FD_glCompressedTextureSubImage3D,
            FD_glCopyTextureSubImage1D,
            FD_glCopyTextureSubImage2D,
            FD_glCopyTextureSubImage3D,
            FD_glTextureParameterf,
            FD_glTextureParameterfv,
            FD_glTextureParameteri,
            FD_glTextureParameterIiv,
            FD_glTextureParameterIuiv,
            FD_glTextureParameteriv,
            FD_glGenerateTextureMipmap,
            FD_glBindTextureUnit,
            FD_glGetTextureImage,
            FD_glGetCompressedTextureImage,
            FD_glGetTextureLevelParameterfv,
            FD_glGetTextureLevelParameteriv,
            FD_glGetTextureParameterfv,
            FD_glGetTextureParameterIiv,
            FD_glGetTextureParameterIuiv,
            FD_glGetTextureParameteriv,
            FD_glCreateVertexArrays,
            FD_glDisableVertexArrayAttrib,
            FD_glEnableVertexArrayAttrib,
            FD_glVertexArrayElementBuffer,
            FD_glVertexArrayVertexBuffer,
            FD_glVertexArrayVertexBuffers,
            FD_glVertexArrayAttribBinding,
            FD_glVertexArrayAttribFormat,
            FD_glVertexArrayAttribIFormat,
            FD_glVertexArrayAttribLFormat,
            FD_glVertexArrayBindingDivisor,
            FD_glGetVertexArrayiv,
            FD_glGetVertexArrayIndexediv,
            FD_glGetVertexArrayIndexed64iv,
            FD_glCreateSamplers,
            FD_glCreateProgramPipelines,
            FD_glCreateQueries,
            FD_glGetQueryBufferObjecti64v,
            FD_glGetQueryBufferObjectiv,
            FD_glGetQueryBufferObjectui64v,
            FD_glGetQueryBufferObjectuiv,
            FD_glMemoryBarrierByRegion,
            FD_glGetTextureSubImage,
            FD_glGetCompressedTextureSubImage,
            FD_glGetGraphicsResetStatus,
            FD_glGetnCompressedTexImage,
            FD_glGetnTexImage,
            FD_glGetnUniformdv,
            FD_glGetnUniformfv,
            FD_glGetnUniformiv,
            FD_glGetnUniformuiv,
            FD_glReadnPixels,
            FD_glTextureBarrier
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glClipControl = RuntimeHelper.downcall(Descriptors.FD_glClipControl);
        public static final MethodHandle MH_glCreateTransformFeedbacks = RuntimeHelper.downcall(Descriptors.FD_glCreateTransformFeedbacks);
        public static final MethodHandle MH_glTransformFeedbackBufferBase = RuntimeHelper.downcall(Descriptors.FD_glTransformFeedbackBufferBase);
        public static final MethodHandle MH_glTransformFeedbackBufferRange = RuntimeHelper.downcall(Descriptors.FD_glTransformFeedbackBufferRange);
        public static final MethodHandle MH_glGetTransformFeedbackiv = RuntimeHelper.downcall(Descriptors.FD_glGetTransformFeedbackiv);
        public static final MethodHandle MH_glGetTransformFeedbacki_v = RuntimeHelper.downcall(Descriptors.FD_glGetTransformFeedbacki_v);
        public static final MethodHandle MH_glGetTransformFeedbacki64_v = RuntimeHelper.downcall(Descriptors.FD_glGetTransformFeedbacki64_v);
        public static final MethodHandle MH_glCreateBuffers = RuntimeHelper.downcall(Descriptors.FD_glCreateBuffers);
        public static final MethodHandle MH_glNamedBufferStorage = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferStorage);
        public static final MethodHandle MH_glNamedBufferData = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferData);
        public static final MethodHandle MH_glNamedBufferSubData = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferSubData);
        public static final MethodHandle MH_glCopyNamedBufferSubData = RuntimeHelper.downcall(Descriptors.FD_glCopyNamedBufferSubData);
        public static final MethodHandle MH_glClearNamedBufferData = RuntimeHelper.downcall(Descriptors.FD_glClearNamedBufferData);
        public static final MethodHandle MH_glClearNamedBufferSubData = RuntimeHelper.downcall(Descriptors.FD_glClearNamedBufferSubData);
        public static final MethodHandle MH_glMapNamedBuffer = RuntimeHelper.downcall(Descriptors.FD_glMapNamedBuffer);
        public static final MethodHandle MH_glMapNamedBufferRange = RuntimeHelper.downcall(Descriptors.FD_glMapNamedBufferRange);
        public static final MethodHandle MH_glUnmapNamedBuffer = RuntimeHelper.downcall(Descriptors.FD_glUnmapNamedBuffer);
        public static final MethodHandle MH_glFlushMappedNamedBufferRange = RuntimeHelper.downcall(Descriptors.FD_glFlushMappedNamedBufferRange);
        public static final MethodHandle MH_glGetNamedBufferParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferParameteriv);
        public static final MethodHandle MH_glGetNamedBufferParameteri64v = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferParameteri64v);
        public static final MethodHandle MH_glGetNamedBufferPointerv = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferPointerv);
        public static final MethodHandle MH_glGetNamedBufferSubData = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferSubData);
        public static final MethodHandle MH_glCreateFramebuffers = RuntimeHelper.downcall(Descriptors.FD_glCreateFramebuffers);
        public static final MethodHandle MH_glNamedFramebufferRenderbuffer = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferRenderbuffer);
        public static final MethodHandle MH_glNamedFramebufferParameteri = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferParameteri);
        public static final MethodHandle MH_glNamedFramebufferTexture = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTexture);
        public static final MethodHandle MH_glNamedFramebufferTextureLayer = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTextureLayer);
        public static final MethodHandle MH_glNamedFramebufferDrawBuffer = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferDrawBuffer);
        public static final MethodHandle MH_glNamedFramebufferDrawBuffers = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferDrawBuffers);
        public static final MethodHandle MH_glNamedFramebufferReadBuffer = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferReadBuffer);
        public static final MethodHandle MH_glInvalidateNamedFramebufferData = RuntimeHelper.downcall(Descriptors.FD_glInvalidateNamedFramebufferData);
        public static final MethodHandle MH_glInvalidateNamedFramebufferSubData = RuntimeHelper.downcall(Descriptors.FD_glInvalidateNamedFramebufferSubData);
        public static final MethodHandle MH_glClearNamedFramebufferiv = RuntimeHelper.downcall(Descriptors.FD_glClearNamedFramebufferiv);
        public static final MethodHandle MH_glClearNamedFramebufferuiv = RuntimeHelper.downcall(Descriptors.FD_glClearNamedFramebufferuiv);
        public static final MethodHandle MH_glClearNamedFramebufferfv = RuntimeHelper.downcall(Descriptors.FD_glClearNamedFramebufferfv);
        public static final MethodHandle MH_glClearNamedFramebufferfi = RuntimeHelper.downcall(Descriptors.FD_glClearNamedFramebufferfi);
        public static final MethodHandle MH_glBlitNamedFramebuffer = RuntimeHelper.downcall(Descriptors.FD_glBlitNamedFramebuffer);
        public static final MethodHandle MH_glCheckNamedFramebufferStatus = RuntimeHelper.downcall(Descriptors.FD_glCheckNamedFramebufferStatus);
        public static final MethodHandle MH_glGetNamedFramebufferParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetNamedFramebufferParameteriv);
        public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetNamedFramebufferAttachmentParameteriv);
        public static final MethodHandle MH_glCreateRenderbuffers = RuntimeHelper.downcall(Descriptors.FD_glCreateRenderbuffers);
        public static final MethodHandle MH_glNamedRenderbufferStorage = RuntimeHelper.downcall(Descriptors.FD_glNamedRenderbufferStorage);
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisample = RuntimeHelper.downcall(Descriptors.FD_glNamedRenderbufferStorageMultisample);
        public static final MethodHandle MH_glGetNamedRenderbufferParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetNamedRenderbufferParameteriv);
        public static final MethodHandle MH_glCreateTextures = RuntimeHelper.downcall(Descriptors.FD_glCreateTextures);
        public static final MethodHandle MH_glTextureBuffer = RuntimeHelper.downcall(Descriptors.FD_glTextureBuffer);
        public static final MethodHandle MH_glTextureBufferRange = RuntimeHelper.downcall(Descriptors.FD_glTextureBufferRange);
        public static final MethodHandle MH_glTextureStorage1D = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage1D);
        public static final MethodHandle MH_glTextureStorage2D = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage2D);
        public static final MethodHandle MH_glTextureStorage3D = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage3D);
        public static final MethodHandle MH_glTextureStorage2DMultisample = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage2DMultisample);
        public static final MethodHandle MH_glTextureStorage3DMultisample = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage3DMultisample);
        public static final MethodHandle MH_glTextureSubImage1D = RuntimeHelper.downcall(Descriptors.FD_glTextureSubImage1D);
        public static final MethodHandle MH_glTextureSubImage2D = RuntimeHelper.downcall(Descriptors.FD_glTextureSubImage2D);
        public static final MethodHandle MH_glTextureSubImage3D = RuntimeHelper.downcall(Descriptors.FD_glTextureSubImage3D);
        public static final MethodHandle MH_glCompressedTextureSubImage1D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureSubImage1D);
        public static final MethodHandle MH_glCompressedTextureSubImage2D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureSubImage2D);
        public static final MethodHandle MH_glCompressedTextureSubImage3D = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureSubImage3D);
        public static final MethodHandle MH_glCopyTextureSubImage1D = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureSubImage1D);
        public static final MethodHandle MH_glCopyTextureSubImage2D = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureSubImage2D);
        public static final MethodHandle MH_glCopyTextureSubImage3D = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureSubImage3D);
        public static final MethodHandle MH_glTextureParameterf = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterf);
        public static final MethodHandle MH_glTextureParameterfv = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterfv);
        public static final MethodHandle MH_glTextureParameteri = RuntimeHelper.downcall(Descriptors.FD_glTextureParameteri);
        public static final MethodHandle MH_glTextureParameterIiv = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterIiv);
        public static final MethodHandle MH_glTextureParameterIuiv = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterIuiv);
        public static final MethodHandle MH_glTextureParameteriv = RuntimeHelper.downcall(Descriptors.FD_glTextureParameteriv);
        public static final MethodHandle MH_glGenerateTextureMipmap = RuntimeHelper.downcall(Descriptors.FD_glGenerateTextureMipmap);
        public static final MethodHandle MH_glBindTextureUnit = RuntimeHelper.downcall(Descriptors.FD_glBindTextureUnit);
        public static final MethodHandle MH_glGetTextureImage = RuntimeHelper.downcall(Descriptors.FD_glGetTextureImage);
        public static final MethodHandle MH_glGetCompressedTextureImage = RuntimeHelper.downcall(Descriptors.FD_glGetCompressedTextureImage);
        public static final MethodHandle MH_glGetTextureLevelParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetTextureLevelParameterfv);
        public static final MethodHandle MH_glGetTextureLevelParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetTextureLevelParameteriv);
        public static final MethodHandle MH_glGetTextureParameterfv = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterfv);
        public static final MethodHandle MH_glGetTextureParameterIiv = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterIiv);
        public static final MethodHandle MH_glGetTextureParameterIuiv = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterIuiv);
        public static final MethodHandle MH_glGetTextureParameteriv = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameteriv);
        public static final MethodHandle MH_glCreateVertexArrays = RuntimeHelper.downcall(Descriptors.FD_glCreateVertexArrays);
        public static final MethodHandle MH_glDisableVertexArrayAttrib = RuntimeHelper.downcall(Descriptors.FD_glDisableVertexArrayAttrib);
        public static final MethodHandle MH_glEnableVertexArrayAttrib = RuntimeHelper.downcall(Descriptors.FD_glEnableVertexArrayAttrib);
        public static final MethodHandle MH_glVertexArrayElementBuffer = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayElementBuffer);
        public static final MethodHandle MH_glVertexArrayVertexBuffer = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexBuffer);
        public static final MethodHandle MH_glVertexArrayVertexBuffers = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexBuffers);
        public static final MethodHandle MH_glVertexArrayAttribBinding = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayAttribBinding);
        public static final MethodHandle MH_glVertexArrayAttribFormat = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayAttribFormat);
        public static final MethodHandle MH_glVertexArrayAttribIFormat = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayAttribIFormat);
        public static final MethodHandle MH_glVertexArrayAttribLFormat = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayAttribLFormat);
        public static final MethodHandle MH_glVertexArrayBindingDivisor = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayBindingDivisor);
        public static final MethodHandle MH_glGetVertexArrayiv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayiv);
        public static final MethodHandle MH_glGetVertexArrayIndexediv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayIndexediv);
        public static final MethodHandle MH_glGetVertexArrayIndexed64iv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayIndexed64iv);
        public static final MethodHandle MH_glCreateSamplers = RuntimeHelper.downcall(Descriptors.FD_glCreateSamplers);
        public static final MethodHandle MH_glCreateProgramPipelines = RuntimeHelper.downcall(Descriptors.FD_glCreateProgramPipelines);
        public static final MethodHandle MH_glCreateQueries = RuntimeHelper.downcall(Descriptors.FD_glCreateQueries);
        public static final MethodHandle MH_glGetQueryBufferObjecti64v = RuntimeHelper.downcall(Descriptors.FD_glGetQueryBufferObjecti64v);
        public static final MethodHandle MH_glGetQueryBufferObjectiv = RuntimeHelper.downcall(Descriptors.FD_glGetQueryBufferObjectiv);
        public static final MethodHandle MH_glGetQueryBufferObjectui64v = RuntimeHelper.downcall(Descriptors.FD_glGetQueryBufferObjectui64v);
        public static final MethodHandle MH_glGetQueryBufferObjectuiv = RuntimeHelper.downcall(Descriptors.FD_glGetQueryBufferObjectuiv);
        public static final MethodHandle MH_glMemoryBarrierByRegion = RuntimeHelper.downcall(Descriptors.FD_glMemoryBarrierByRegion);
        public static final MethodHandle MH_glGetTextureSubImage = RuntimeHelper.downcall(Descriptors.FD_glGetTextureSubImage);
        public static final MethodHandle MH_glGetCompressedTextureSubImage = RuntimeHelper.downcall(Descriptors.FD_glGetCompressedTextureSubImage);
        public static final MethodHandle MH_glGetGraphicsResetStatus = RuntimeHelper.downcall(Descriptors.FD_glGetGraphicsResetStatus);
        public static final MethodHandle MH_glGetnCompressedTexImage = RuntimeHelper.downcall(Descriptors.FD_glGetnCompressedTexImage);
        public static final MethodHandle MH_glGetnTexImage = RuntimeHelper.downcall(Descriptors.FD_glGetnTexImage);
        public static final MethodHandle MH_glGetnUniformdv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformdv);
        public static final MethodHandle MH_glGetnUniformfv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformfv);
        public static final MethodHandle MH_glGetnUniformiv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformiv);
        public static final MethodHandle MH_glGetnUniformuiv = RuntimeHelper.downcall(Descriptors.FD_glGetnUniformuiv);
        public static final MethodHandle MH_glReadnPixels = RuntimeHelper.downcall(Descriptors.FD_glReadnPixels);
        public static final MethodHandle MH_glTextureBarrier = RuntimeHelper.downcall(Descriptors.FD_glTextureBarrier);
        public final MemorySegment PFN_glClipControl;
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
        public final MemorySegment PFN_glMemoryBarrierByRegion;
        public final MemorySegment PFN_glGetTextureSubImage;
        public final MemorySegment PFN_glGetCompressedTextureSubImage;
        public final MemorySegment PFN_glGetGraphicsResetStatus;
        public final MemorySegment PFN_glGetnCompressedTexImage;
        public final MemorySegment PFN_glGetnTexImage;
        public final MemorySegment PFN_glGetnUniformdv;
        public final MemorySegment PFN_glGetnUniformfv;
        public final MemorySegment PFN_glGetnUniformiv;
        public final MemorySegment PFN_glGetnUniformuiv;
        public final MemorySegment PFN_glReadnPixels;
        public final MemorySegment PFN_glTextureBarrier;
        private Handles(GLLoadFunc func) {
            PFN_glClipControl = func.invoke("glClipControl", "glClipControlEXT");
            PFN_glCreateTransformFeedbacks = func.invoke("glCreateTransformFeedbacks");
            PFN_glTransformFeedbackBufferBase = func.invoke("glTransformFeedbackBufferBase");
            PFN_glTransformFeedbackBufferRange = func.invoke("glTransformFeedbackBufferRange");
            PFN_glGetTransformFeedbackiv = func.invoke("glGetTransformFeedbackiv");
            PFN_glGetTransformFeedbacki_v = func.invoke("glGetTransformFeedbacki_v");
            PFN_glGetTransformFeedbacki64_v = func.invoke("glGetTransformFeedbacki64_v");
            PFN_glCreateBuffers = func.invoke("glCreateBuffers");
            PFN_glNamedBufferStorage = func.invoke("glNamedBufferStorage", "glNamedBufferStorageEXT");
            PFN_glNamedBufferData = func.invoke("glNamedBufferData");
            PFN_glNamedBufferSubData = func.invoke("glNamedBufferSubData", "glNamedBufferSubDataEXT");
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
            PFN_glGetNamedBufferSubData = func.invoke("glGetNamedBufferSubData");
            PFN_glCreateFramebuffers = func.invoke("glCreateFramebuffers");
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
            PFN_glGetNamedFramebufferAttachmentParameteriv = func.invoke("glGetNamedFramebufferAttachmentParameteriv");
            PFN_glCreateRenderbuffers = func.invoke("glCreateRenderbuffers");
            PFN_glNamedRenderbufferStorage = func.invoke("glNamedRenderbufferStorage");
            PFN_glNamedRenderbufferStorageMultisample = func.invoke("glNamedRenderbufferStorageMultisample");
            PFN_glGetNamedRenderbufferParameteriv = func.invoke("glGetNamedRenderbufferParameteriv");
            PFN_glCreateTextures = func.invoke("glCreateTextures");
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
            PFN_glGetTextureParameteriv = func.invoke("glGetTextureParameteriv");
            PFN_glCreateVertexArrays = func.invoke("glCreateVertexArrays");
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
            PFN_glGetVertexArrayIndexed64iv = func.invoke("glGetVertexArrayIndexed64iv");
            PFN_glCreateSamplers = func.invoke("glCreateSamplers");
            PFN_glCreateProgramPipelines = func.invoke("glCreateProgramPipelines");
            PFN_glCreateQueries = func.invoke("glCreateQueries");
            PFN_glGetQueryBufferObjecti64v = func.invoke("glGetQueryBufferObjecti64v");
            PFN_glGetQueryBufferObjectiv = func.invoke("glGetQueryBufferObjectiv");
            PFN_glGetQueryBufferObjectui64v = func.invoke("glGetQueryBufferObjectui64v");
            PFN_glGetQueryBufferObjectuiv = func.invoke("glGetQueryBufferObjectuiv");
            PFN_glMemoryBarrierByRegion = func.invoke("glMemoryBarrierByRegion");
            PFN_glGetTextureSubImage = func.invoke("glGetTextureSubImage");
            PFN_glGetCompressedTextureSubImage = func.invoke("glGetCompressedTextureSubImage");
            PFN_glGetGraphicsResetStatus = func.invoke("glGetGraphicsResetStatus", "glGetGraphicsResetStatusEXT", "glGetGraphicsResetStatusKHR");
            PFN_glGetnCompressedTexImage = func.invoke("glGetnCompressedTexImage");
            PFN_glGetnTexImage = func.invoke("glGetnTexImage");
            PFN_glGetnUniformdv = func.invoke("glGetnUniformdv");
            PFN_glGetnUniformfv = func.invoke("glGetnUniformfv", "glGetnUniformfvEXT", "glGetnUniformfvKHR");
            PFN_glGetnUniformiv = func.invoke("glGetnUniformiv", "glGetnUniformivEXT", "glGetnUniformivKHR");
            PFN_glGetnUniformuiv = func.invoke("glGetnUniformuiv", "glGetnUniformuivKHR");
            PFN_glReadnPixels = func.invoke("glReadnPixels", "glReadnPixelsARB", "glReadnPixelsEXT", "glReadnPixelsKHR");
            PFN_glTextureBarrier = func.invoke("glTextureBarrier");
        }
    }

    public GL45(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    public void ClipControl(@CType("GLenum") int origin, @CType("GLenum") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glClipControl)) throw new SymbolNotFoundError("Symbol not found: glClipControl");
        try { Handles.MH_glClipControl.invokeExact(handles.PFN_glClipControl, origin, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glClipControl", e); }
    }

    public void CreateTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
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

    public void GetTransformFeedbackiv(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbackiv)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbackiv");
        try { Handles.MH_glGetTransformFeedbackiv.invokeExact(handles.PFN_glGetTransformFeedbackiv, xfb, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackiv", e); }
    }

    public void GetTransformFeedbacki_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbacki_v)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki_v");
        try { Handles.MH_glGetTransformFeedbacki_v.invokeExact(handles.PFN_glGetTransformFeedbacki_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki_v", e); }
    }

    public void GetTransformFeedbacki64_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint64 *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTransformFeedbacki64_v)) throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki64_v");
        try { Handles.MH_glGetTransformFeedbacki64_v.invokeExact(handles.PFN_glGetTransformFeedbacki64_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki64_v", e); }
    }

    public void CreateBuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment buffers) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateBuffers)) throw new SymbolNotFoundError("Symbol not found: glCreateBuffers");
        try { Handles.MH_glCreateBuffers.invokeExact(handles.PFN_glCreateBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateBuffers", e); }
    }

    public void NamedBufferStorage(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferStorage)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorage");
        try { Handles.MH_glNamedBufferStorage.invokeExact(handles.PFN_glNamedBufferStorage, buffer, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorage", e); }
    }

    public void NamedBufferData(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferData)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferData");
        try { Handles.MH_glNamedBufferData.invokeExact(handles.PFN_glNamedBufferData, buffer, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferData", e); }
    }

    public void NamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferSubData");
        try { Handles.MH_glNamedBufferSubData.invokeExact(handles.PFN_glNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferSubData", e); }
    }

    public void CopyNamedBufferSubData(@CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glCopyNamedBufferSubData");
        try { Handles.MH_glCopyNamedBufferSubData.invokeExact(handles.PFN_glCopyNamedBufferSubData, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyNamedBufferSubData", e); }
    }

    public void ClearNamedBufferData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedBufferData)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferData");
        try { Handles.MH_glClearNamedBufferData.invokeExact(handles.PFN_glClearNamedBufferData, buffer, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferData", e); }
    }

    public void ClearNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferSubData");
        try { Handles.MH_glClearNamedBufferSubData.invokeExact(handles.PFN_glClearNamedBufferSubData, buffer, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferSubData", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBuffer(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapNamedBuffer)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBuffer");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glMapNamedBuffer.invokeExact(handles.PFN_glMapNamedBuffer, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBuffer", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapNamedBufferRange)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBufferRange");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glMapNamedBufferRange.invokeExact(handles.PFN_glMapNamedBufferRange, buffer, offset, length, access); }
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

    public void GetNamedBufferParameteriv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteriv");
        try { Handles.MH_glGetNamedBufferParameteriv.invokeExact(handles.PFN_glGetNamedBufferParameteriv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteriv", e); }
    }

    public void GetNamedBufferParameteri64v(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferParameteri64v)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteri64v");
        try { Handles.MH_glGetNamedBufferParameteri64v.invokeExact(handles.PFN_glGetNamedBufferParameteri64v, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteri64v", e); }
    }

    public void GetNamedBufferPointerv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferPointerv");
        try { Handles.MH_glGetNamedBufferPointerv.invokeExact(handles.PFN_glGetNamedBufferPointerv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferPointerv", e); }
    }

    public void GetNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferSubData");
        try { Handles.MH_glGetNamedBufferSubData.invokeExact(handles.PFN_glGetNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferSubData", e); }
    }

    public void CreateFramebuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
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

    public void NamedFramebufferDrawBuffers(@CType("GLuint") int framebuffer, @CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffers)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffers");
        try { Handles.MH_glNamedFramebufferDrawBuffers.invokeExact(handles.PFN_glNamedFramebufferDrawBuffers, framebuffer, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffers", e); }
    }

    public void NamedFramebufferReadBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int src) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferReadBuffer)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferReadBuffer");
        try { Handles.MH_glNamedFramebufferReadBuffer.invokeExact(handles.PFN_glNamedFramebufferReadBuffer, framebuffer, src); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferReadBuffer", e); }
    }

    public void InvalidateNamedFramebufferData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateNamedFramebufferData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferData");
        try { Handles.MH_glInvalidateNamedFramebufferData.invokeExact(handles.PFN_glInvalidateNamedFramebufferData, framebuffer, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferData", e); }
    }

    public void InvalidateNamedFramebufferSubData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glInvalidateNamedFramebufferSubData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferSubData");
        try { Handles.MH_glInvalidateNamedFramebufferSubData.invokeExact(handles.PFN_glInvalidateNamedFramebufferSubData, framebuffer, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferSubData", e); }
    }

    public void ClearNamedFramebufferiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedFramebufferiv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferiv");
        try { Handles.MH_glClearNamedFramebufferiv.invokeExact(handles.PFN_glClearNamedFramebufferiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferiv", e); }
    }

    public void ClearNamedFramebufferuiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedFramebufferuiv)) throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferuiv");
        try { Handles.MH_glClearNamedFramebufferuiv.invokeExact(handles.PFN_glClearNamedFramebufferuiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferuiv", e); }
    }

    public void ClearNamedFramebufferfv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
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

    public void GetNamedFramebufferParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedFramebufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameteriv");
        try { Handles.MH_glGetNamedFramebufferParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferParameteriv, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameteriv", e); }
    }

    public void GetNamedFramebufferAttachmentParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedFramebufferAttachmentParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameteriv");
        try { Handles.MH_glGetNamedFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferAttachmentParameteriv, framebuffer, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferAttachmentParameteriv", e); }
    }

    public void CreateRenderbuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
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

    public void GetNamedRenderbufferParameteriv(@CType("GLuint") int renderbuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedRenderbufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameteriv");
        try { Handles.MH_glGetNamedRenderbufferParameteriv.invokeExact(handles.PFN_glGetNamedRenderbufferParameteriv, renderbuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedRenderbufferParameteriv", e); }
    }

    public void CreateTextures(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment textures) {
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

    public void TextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage1D");
        try { Handles.MH_glTextureSubImage1D.invokeExact(handles.PFN_glTextureSubImage1D, texture, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage1D", e); }
    }

    public void TextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage2D");
        try { Handles.MH_glTextureSubImage2D.invokeExact(handles.PFN_glTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage2D", e); }
    }

    public void TextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage3D)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage3D");
        try { Handles.MH_glTextureSubImage3D.invokeExact(handles.PFN_glTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage3D", e); }
    }

    public void CompressedTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage1D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1D");
        try { Handles.MH_glCompressedTextureSubImage1D.invokeExact(handles.PFN_glCompressedTextureSubImage1D, texture, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage1D", e); }
    }

    public void CompressedTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage2D)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2D");
        try { Handles.MH_glCompressedTextureSubImage2D.invokeExact(handles.PFN_glCompressedTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage2D", e); }
    }

    public void CompressedTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
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

    public void TextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterfv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterfv");
        try { Handles.MH_glTextureParameterfv.invokeExact(handles.PFN_glTextureParameterfv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfv", e); }
    }

    public void TextureParameteri(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameteri)) throw new SymbolNotFoundError("Symbol not found: glTextureParameteri");
        try { Handles.MH_glTextureParameteri.invokeExact(handles.PFN_glTextureParameteri, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteri", e); }
    }

    public void TextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIiv");
        try { Handles.MH_glTextureParameterIiv.invokeExact(handles.PFN_glTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIiv", e); }
    }

    public void TextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIuiv");
        try { Handles.MH_glTextureParameterIuiv.invokeExact(handles.PFN_glTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIuiv", e); }
    }

    public void TextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
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

    public void GetTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureImage)) throw new SymbolNotFoundError("Symbol not found: glGetTextureImage");
        try { Handles.MH_glGetTextureImage.invokeExact(handles.PFN_glGetTextureImage, texture, level, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureImage", e); }
    }

    public void GetCompressedTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedTextureImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureImage");
        try { Handles.MH_glGetCompressedTextureImage.invokeExact(handles.PFN_glGetCompressedTextureImage, texture, level, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureImage", e); }
    }

    public void GetTextureLevelParameterfv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureLevelParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfv");
        try { Handles.MH_glGetTextureLevelParameterfv.invokeExact(handles.PFN_glGetTextureLevelParameterfv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterfv", e); }
    }

    public void GetTextureLevelParameteriv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureLevelParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameteriv");
        try { Handles.MH_glGetTextureLevelParameteriv.invokeExact(handles.PFN_glGetTextureLevelParameteriv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameteriv", e); }
    }

    public void GetTextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterfv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterfv");
        try { Handles.MH_glGetTextureParameterfv.invokeExact(handles.PFN_glGetTextureParameterfv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterfv", e); }
    }

    public void GetTextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterIiv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIiv");
        try { Handles.MH_glGetTextureParameterIiv.invokeExact(handles.PFN_glGetTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIiv", e); }
    }

    public void GetTextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterIuiv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIuiv");
        try { Handles.MH_glGetTextureParameterIuiv.invokeExact(handles.PFN_glGetTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIuiv", e); }
    }

    public void GetTextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameteriv");
        try { Handles.MH_glGetTextureParameteriv.invokeExact(handles.PFN_glGetTextureParameteriv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameteriv", e); }
    }

    public void CreateVertexArrays(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
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

    public void VertexArrayVertexBuffers(@CType("GLuint") int vaobj, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizei *") java.lang.foreign.MemorySegment strides) {
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

    public void GetVertexArrayiv(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayiv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayiv");
        try { Handles.MH_glGetVertexArrayiv.invokeExact(handles.PFN_glGetVertexArrayiv, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayiv", e); }
    }

    public void GetVertexArrayIndexediv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayIndexediv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexediv");
        try { Handles.MH_glGetVertexArrayIndexediv.invokeExact(handles.PFN_glGetVertexArrayIndexediv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexediv", e); }
    }

    public void GetVertexArrayIndexed64iv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayIndexed64iv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexed64iv");
        try { Handles.MH_glGetVertexArrayIndexed64iv.invokeExact(handles.PFN_glGetVertexArrayIndexed64iv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexed64iv", e); }
    }

    public void CreateSamplers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateSamplers)) throw new SymbolNotFoundError("Symbol not found: glCreateSamplers");
        try { Handles.MH_glCreateSamplers.invokeExact(handles.PFN_glCreateSamplers, n, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateSamplers", e); }
    }

    public void CreateProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateProgramPipelines)) throw new SymbolNotFoundError("Symbol not found: glCreateProgramPipelines");
        try { Handles.MH_glCreateProgramPipelines.invokeExact(handles.PFN_glCreateProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateProgramPipelines", e); }
    }

    public void CreateQueries(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
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

    public void MemoryBarrierByRegion(@CType("GLbitfield") int barriers) {
        if (Unmarshal.isNullPointer(handles.PFN_glMemoryBarrierByRegion)) throw new SymbolNotFoundError("Symbol not found: glMemoryBarrierByRegion");
        try { Handles.MH_glMemoryBarrierByRegion.invokeExact(handles.PFN_glMemoryBarrierByRegion, barriers); }
        catch (Throwable e) { throw new RuntimeException("error in glMemoryBarrierByRegion", e); }
    }

    public void GetTextureSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureSubImage)) throw new SymbolNotFoundError("Symbol not found: glGetTextureSubImage");
        try { Handles.MH_glGetTextureSubImage.invokeExact(handles.PFN_glGetTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureSubImage", e); }
    }

    public void GetCompressedTextureSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedTextureSubImage)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureSubImage");
        try { Handles.MH_glGetCompressedTextureSubImage.invokeExact(handles.PFN_glGetCompressedTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureSubImage", e); }
    }

    public @CType("GLenum") int GetGraphicsResetStatus() {
        if (Unmarshal.isNullPointer(handles.PFN_glGetGraphicsResetStatus)) throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatus");
        try { return (int) Handles.MH_glGetGraphicsResetStatus.invokeExact(handles.PFN_glGetGraphicsResetStatus); }
        catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatus", e); }
    }

    public void GetnCompressedTexImage(@CType("GLenum") int target, @CType("GLint") int lod, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnCompressedTexImage)) throw new SymbolNotFoundError("Symbol not found: glGetnCompressedTexImage");
        try { Handles.MH_glGetnCompressedTexImage.invokeExact(handles.PFN_glGetnCompressedTexImage, target, lod, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnCompressedTexImage", e); }
    }

    public void GetnTexImage(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnTexImage)) throw new SymbolNotFoundError("Symbol not found: glGetnTexImage");
        try { Handles.MH_glGetnTexImage.invokeExact(handles.PFN_glGetnTexImage, target, level, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnTexImage", e); }
    }

    public void GetnUniformdv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformdv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformdv");
        try { Handles.MH_glGetnUniformdv.invokeExact(handles.PFN_glGetnUniformdv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformdv", e); }
    }

    public void GetnUniformfv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformfv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformfv");
        try { Handles.MH_glGetnUniformfv.invokeExact(handles.PFN_glGetnUniformfv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfv", e); }
    }

    public void GetnUniformiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformiv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformiv");
        try { Handles.MH_glGetnUniformiv.invokeExact(handles.PFN_glGetnUniformiv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformiv", e); }
    }

    public void GetnUniformuiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetnUniformuiv)) throw new SymbolNotFoundError("Symbol not found: glGetnUniformuiv");
        try { Handles.MH_glGetnUniformuiv.invokeExact(handles.PFN_glGetnUniformuiv, program, location, bufSize, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuiv", e); }
    }

    public void ReadnPixels(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glReadnPixels)) throw new SymbolNotFoundError("Symbol not found: glReadnPixels");
        try { Handles.MH_glReadnPixels.invokeExact(handles.PFN_glReadnPixels, x, y, width, height, format, type, bufSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in glReadnPixels", e); }
    }

    public void TextureBarrier() {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureBarrier)) throw new SymbolNotFoundError("Symbol not found: glTextureBarrier");
        try { Handles.MH_glTextureBarrier.invokeExact(handles.PFN_glTextureBarrier); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBarrier", e); }
    }

    // --- OverrunGL custom code ---
    public int CreateTransformFeedbacks() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateTransformFeedbacks(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateBuffers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateBuffers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void NamedBufferData(@CType("GLuint") int buffer, @CType("const void *") MemorySegment data, @CType("GLenum") int usage) { NamedBufferData(buffer, data.byteSize(), data, usage); }
    public int GetNamedBufferParameteriv(@CType("GLuint") int buffer, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetNamedBufferParameteriv(buffer, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public long GetNamedBufferParameteri64v(@CType("GLuint") int buffer, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.longs(0); GetNamedBufferParameteri64v(buffer, pname, p); return p.get(ValueLayout.JAVA_LONG, 0); } }
    public int CreateFramebuffers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateFramebuffers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateRenderbuffers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateRenderbuffers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateTextures(@CType("GLenum") int target) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateTextures(target, 1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateVertexArrays() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateVertexArrays(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateSamplers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateSamplers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateProgramPipelines() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateProgramPipelines(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int CreateQueries(@CType("GLenum") int target) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); CreateQueries(target, 1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}
