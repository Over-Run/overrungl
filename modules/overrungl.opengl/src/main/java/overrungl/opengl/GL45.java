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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL45 extends GL44 permits GL46 {
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
    public static final MethodHandle MH_glClipControl = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClipControl;
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
    public static final MethodHandle MH_glMemoryBarrierByRegion = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMemoryBarrierByRegion;
    public static final MethodHandle MH_glGetTextureSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureSubImage;
    public static final MethodHandle MH_glGetCompressedTextureSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCompressedTextureSubImage;
    public static final MethodHandle MH_glGetGraphicsResetStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetGraphicsResetStatus;
    public static final MethodHandle MH_glGetnCompressedTexImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnCompressedTexImage;
    public static final MethodHandle MH_glGetnTexImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnTexImage;
    public static final MethodHandle MH_glGetnUniformdv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformdv;
    public static final MethodHandle MH_glGetnUniformfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformfv;
    public static final MethodHandle MH_glGetnUniformiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformiv;
    public static final MethodHandle MH_glGetnUniformuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetnUniformuiv;
    public static final MethodHandle MH_glReadnPixels = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glReadnPixels;
    public static final MethodHandle MH_glTextureBarrier = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glTextureBarrier;

    public GL45(GLLoadFunc func) {
        super(func);
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

    public void ClipControl(@CType("GLenum") int origin, @CType("GLenum") int depth) {
        if (!Unmarshal.isNullPointer(PFN_glClipControl)) { try {
            MH_glClipControl.invokeExact(PFN_glClipControl, origin, depth);
        } catch (Throwable e) { throw new RuntimeException("error in glClipControl", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClipControl"); }
    }

    public void CreateTransformFeedbacks(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (!Unmarshal.isNullPointer(PFN_glCreateTransformFeedbacks)) { try {
            MH_glCreateTransformFeedbacks.invokeExact(PFN_glCreateTransformFeedbacks, n, ids);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateTransformFeedbacks", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateTransformFeedbacks"); }
    }

    public void TransformFeedbackBufferBase(@CType("GLuint") int xfb, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glTransformFeedbackBufferBase)) { try {
            MH_glTransformFeedbackBufferBase.invokeExact(PFN_glTransformFeedbackBufferBase, xfb, index, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackBufferBase", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackBufferBase"); }
    }

    public void TransformFeedbackBufferRange(@CType("GLuint") int xfb, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (!Unmarshal.isNullPointer(PFN_glTransformFeedbackBufferRange)) { try {
            MH_glTransformFeedbackBufferRange.invokeExact(PFN_glTransformFeedbackBufferRange, xfb, index, buffer, offset, size);
        } catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackBufferRange", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTransformFeedbackBufferRange"); }
    }

    public void GetTransformFeedbackiv(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbackiv)) { try {
            MH_glGetTransformFeedbackiv.invokeExact(PFN_glGetTransformFeedbackiv, xfb, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbackiv"); }
    }

    public void GetTransformFeedbacki_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbacki_v)) { try {
            MH_glGetTransformFeedbacki_v.invokeExact(PFN_glGetTransformFeedbacki_v, xfb, pname, index, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki_v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki_v"); }
    }

    public void GetTransformFeedbacki64_v(@CType("GLuint") int xfb, @CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLint64 *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbacki64_v)) { try {
            MH_glGetTransformFeedbacki64_v.invokeExact(PFN_glGetTransformFeedbacki64_v, xfb, pname, index, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbacki64_v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTransformFeedbacki64_v"); }
    }

    public void CreateBuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment buffers) {
        if (!Unmarshal.isNullPointer(PFN_glCreateBuffers)) { try {
            MH_glCreateBuffers.invokeExact(PFN_glCreateBuffers, n, buffers);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateBuffers", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateBuffers"); }
    }

    public void NamedBufferStorage(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLbitfield") int flags) {
        if (!Unmarshal.isNullPointer(PFN_glNamedBufferStorage)) { try {
            MH_glNamedBufferStorage.invokeExact(PFN_glNamedBufferStorage, buffer, size, data, flags);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorage"); }
    }

    public void NamedBufferData(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        if (!Unmarshal.isNullPointer(PFN_glNamedBufferData)) { try {
            MH_glNamedBufferData.invokeExact(PFN_glNamedBufferData, buffer, size, data, usage);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedBufferData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedBufferData"); }
    }

    public void NamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glNamedBufferSubData)) { try {
            MH_glNamedBufferSubData.invokeExact(PFN_glNamedBufferSubData, buffer, offset, size, data);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedBufferSubData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedBufferSubData"); }
    }

    public void CopyNamedBufferSubData(@CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (!Unmarshal.isNullPointer(PFN_glCopyNamedBufferSubData)) { try {
            MH_glCopyNamedBufferSubData.invokeExact(PFN_glCopyNamedBufferSubData, readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) { throw new RuntimeException("error in glCopyNamedBufferSubData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCopyNamedBufferSubData"); }
    }

    public void ClearNamedBufferData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glClearNamedBufferData)) { try {
            MH_glClearNamedBufferData.invokeExact(PFN_glClearNamedBufferData, buffer, internalformat, format, type, data);
        } catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferData"); }
    }

    public void ClearNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glClearNamedBufferSubData)) { try {
            MH_glClearNamedBufferSubData.invokeExact(PFN_glClearNamedBufferSubData, buffer, internalformat, offset, size, format, type, data);
        } catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferSubData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferSubData"); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBuffer(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        if (!Unmarshal.isNullPointer(PFN_glMapNamedBuffer)) { try {
            return (java.lang.foreign.MemorySegment) MH_glMapNamedBuffer.invokeExact(PFN_glMapNamedBuffer, buffer, access);
        } catch (Throwable e) { throw new RuntimeException("error in glMapNamedBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapNamedBuffer"); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        if (!Unmarshal.isNullPointer(PFN_glMapNamedBufferRange)) { try {
            return (java.lang.foreign.MemorySegment) MH_glMapNamedBufferRange.invokeExact(PFN_glMapNamedBufferRange, buffer, offset, length, access);
        } catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferRange", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMapNamedBufferRange"); }
    }

    public @CType("GLboolean") boolean UnmapNamedBuffer(@CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glUnmapNamedBuffer)) { try {
            return (boolean) MH_glUnmapNamedBuffer.invokeExact(PFN_glUnmapNamedBuffer, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glUnmapNamedBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glUnmapNamedBuffer"); }
    }

    public void FlushMappedNamedBufferRange(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        if (!Unmarshal.isNullPointer(PFN_glFlushMappedNamedBufferRange)) { try {
            MH_glFlushMappedNamedBufferRange.invokeExact(PFN_glFlushMappedNamedBufferRange, buffer, offset, length);
        } catch (Throwable e) { throw new RuntimeException("error in glFlushMappedNamedBufferRange", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFlushMappedNamedBufferRange"); }
    }

    public void GetNamedBufferParameteriv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferParameteriv)) { try {
            MH_glGetNamedBufferParameteriv.invokeExact(PFN_glGetNamedBufferParameteriv, buffer, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteriv"); }
    }

    public void GetNamedBufferParameteri64v(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferParameteri64v)) { try {
            MH_glGetNamedBufferParameteri64v.invokeExact(PFN_glGetNamedBufferParameteri64v, buffer, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameteri64v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameteri64v"); }
    }

    public void GetNamedBufferPointerv(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferPointerv)) { try {
            MH_glGetNamedBufferPointerv.invokeExact(PFN_glGetNamedBufferPointerv, buffer, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferPointerv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferPointerv"); }
    }

    public void GetNamedBufferSubData(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferSubData)) { try {
            MH_glGetNamedBufferSubData.invokeExact(PFN_glGetNamedBufferSubData, buffer, offset, size, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferSubData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferSubData"); }
    }

    public void CreateFramebuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        if (!Unmarshal.isNullPointer(PFN_glCreateFramebuffers)) { try {
            MH_glCreateFramebuffers.invokeExact(PFN_glCreateFramebuffers, n, framebuffers);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateFramebuffers", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateFramebuffers"); }
    }

    public void NamedFramebufferRenderbuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferRenderbuffer)) { try {
            MH_glNamedFramebufferRenderbuffer.invokeExact(PFN_glNamedFramebufferRenderbuffer, framebuffer, attachment, renderbuffertarget, renderbuffer);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferRenderbuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferRenderbuffer"); }
    }

    public void NamedFramebufferParameteri(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferParameteri)) { try {
            MH_glNamedFramebufferParameteri.invokeExact(PFN_glNamedFramebufferParameteri, framebuffer, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferParameteri", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferParameteri"); }
    }

    public void NamedFramebufferTexture(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTexture)) { try {
            MH_glNamedFramebufferTexture.invokeExact(PFN_glNamedFramebufferTexture, framebuffer, attachment, texture, level);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTexture"); }
    }

    public void NamedFramebufferTextureLayer(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTextureLayer)) { try {
            MH_glNamedFramebufferTextureLayer.invokeExact(PFN_glNamedFramebufferTextureLayer, framebuffer, attachment, texture, level, layer);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureLayer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTextureLayer"); }
    }

    public void NamedFramebufferDrawBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int buf) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferDrawBuffer)) { try {
            MH_glNamedFramebufferDrawBuffer.invokeExact(PFN_glNamedFramebufferDrawBuffer, framebuffer, buf);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffer"); }
    }

    public void NamedFramebufferDrawBuffers(@CType("GLuint") int framebuffer, @CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferDrawBuffers)) { try {
            MH_glNamedFramebufferDrawBuffers.invokeExact(PFN_glNamedFramebufferDrawBuffers, framebuffer, n, bufs);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferDrawBuffers", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffers"); }
    }

    public void NamedFramebufferReadBuffer(@CType("GLuint") int framebuffer, @CType("GLenum") int src) {
        if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferReadBuffer)) { try {
            MH_glNamedFramebufferReadBuffer.invokeExact(PFN_glNamedFramebufferReadBuffer, framebuffer, src);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferReadBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferReadBuffer"); }
    }

    public void InvalidateNamedFramebufferData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments) {
        if (!Unmarshal.isNullPointer(PFN_glInvalidateNamedFramebufferData)) { try {
            MH_glInvalidateNamedFramebufferData.invokeExact(PFN_glInvalidateNamedFramebufferData, framebuffer, numAttachments, attachments);
        } catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferData"); }
    }

    public void InvalidateNamedFramebufferSubData(@CType("GLuint") int framebuffer, @CType("GLsizei") int numAttachments, @CType("const GLenum *") java.lang.foreign.MemorySegment attachments, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glInvalidateNamedFramebufferSubData)) { try {
            MH_glInvalidateNamedFramebufferSubData.invokeExact(PFN_glInvalidateNamedFramebufferSubData, framebuffer, numAttachments, attachments, x, y, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glInvalidateNamedFramebufferSubData", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferSubData"); }
    }

    public void ClearNamedFramebufferiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferiv)) { try {
            MH_glClearNamedFramebufferiv.invokeExact(PFN_glClearNamedFramebufferiv, framebuffer, buffer, drawbuffer, value);
        } catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferiv"); }
    }

    public void ClearNamedFramebufferuiv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferuiv)) { try {
            MH_glClearNamedFramebufferuiv.invokeExact(PFN_glClearNamedFramebufferuiv, framebuffer, buffer, drawbuffer, value);
        } catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferuiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferuiv"); }
    }

    public void ClearNamedFramebufferfv(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferfv)) { try {
            MH_glClearNamedFramebufferfv.invokeExact(PFN_glClearNamedFramebufferfv, framebuffer, buffer, drawbuffer, value);
        } catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferfv"); }
    }

    public void ClearNamedFramebufferfi(@CType("GLuint") int framebuffer, @CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("GLfloat") float depth, @CType("GLint") int stencil) {
        if (!Unmarshal.isNullPointer(PFN_glClearNamedFramebufferfi)) { try {
            MH_glClearNamedFramebufferfi.invokeExact(PFN_glClearNamedFramebufferfi, framebuffer, buffer, drawbuffer, depth, stencil);
        } catch (Throwable e) { throw new RuntimeException("error in glClearNamedFramebufferfi", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glClearNamedFramebufferfi"); }
    }

    public void BlitNamedFramebuffer(@CType("GLuint") int readFramebuffer, @CType("GLuint") int drawFramebuffer, @CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        if (!Unmarshal.isNullPointer(PFN_glBlitNamedFramebuffer)) { try {
            MH_glBlitNamedFramebuffer.invokeExact(PFN_glBlitNamedFramebuffer, readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) { throw new RuntimeException("error in glBlitNamedFramebuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBlitNamedFramebuffer"); }
    }

    public @CType("GLenum") int CheckNamedFramebufferStatus(@CType("GLuint") int framebuffer, @CType("GLenum") int target) {
        if (!Unmarshal.isNullPointer(PFN_glCheckNamedFramebufferStatus)) { try {
            return (int) MH_glCheckNamedFramebufferStatus.invokeExact(PFN_glCheckNamedFramebufferStatus, framebuffer, target);
        } catch (Throwable e) { throw new RuntimeException("error in glCheckNamedFramebufferStatus", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCheckNamedFramebufferStatus"); }
    }

    public void GetNamedFramebufferParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferParameteriv)) { try {
            MH_glGetNamedFramebufferParameteriv.invokeExact(PFN_glGetNamedFramebufferParameteriv, framebuffer, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameteriv"); }
    }

    public void GetNamedFramebufferAttachmentParameteriv(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferAttachmentParameteriv)) { try {
            MH_glGetNamedFramebufferAttachmentParameteriv.invokeExact(PFN_glGetNamedFramebufferAttachmentParameteriv, framebuffer, attachment, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferAttachmentParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameteriv"); }
    }

    public void CreateRenderbuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        if (!Unmarshal.isNullPointer(PFN_glCreateRenderbuffers)) { try {
            MH_glCreateRenderbuffers.invokeExact(PFN_glCreateRenderbuffers, n, renderbuffers);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateRenderbuffers", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateRenderbuffers"); }
    }

    public void NamedRenderbufferStorage(@CType("GLuint") int renderbuffer, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorage)) { try {
            MH_glNamedRenderbufferStorage.invokeExact(PFN_glNamedRenderbufferStorage, renderbuffer, internalformat, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorage"); }
    }

    public void NamedRenderbufferStorageMultisample(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorageMultisample)) { try {
            MH_glNamedRenderbufferStorageMultisample.invokeExact(PFN_glNamedRenderbufferStorageMultisample, renderbuffer, samples, internalformat, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisample"); }
    }

    public void GetNamedRenderbufferParameteriv(@CType("GLuint") int renderbuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedRenderbufferParameteriv)) { try {
            MH_glGetNamedRenderbufferParameteriv.invokeExact(PFN_glGetNamedRenderbufferParameteriv, renderbuffer, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedRenderbufferParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameteriv"); }
    }

    public void CreateTextures(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment textures) {
        if (!Unmarshal.isNullPointer(PFN_glCreateTextures)) { try {
            MH_glCreateTextures.invokeExact(PFN_glCreateTextures, target, n, textures);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateTextures", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateTextures"); }
    }

    public void TextureBuffer(@CType("GLuint") int texture, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glTextureBuffer)) { try {
            MH_glTextureBuffer.invokeExact(PFN_glTextureBuffer, texture, internalformat, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureBuffer"); }
    }

    public void TextureBufferRange(@CType("GLuint") int texture, @CType("GLenum") int internalformat, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (!Unmarshal.isNullPointer(PFN_glTextureBufferRange)) { try {
            MH_glTextureBufferRange.invokeExact(PFN_glTextureBufferRange, texture, internalformat, buffer, offset, size);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureBufferRange", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureBufferRange"); }
    }

    public void TextureStorage1D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        if (!Unmarshal.isNullPointer(PFN_glTextureStorage1D)) { try {
            MH_glTextureStorage1D.invokeExact(PFN_glTextureStorage1D, texture, levels, internalformat, width);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureStorage1D"); }
    }

    public void TextureStorage2D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glTextureStorage2D)) { try {
            MH_glTextureStorage2D.invokeExact(PFN_glTextureStorage2D, texture, levels, internalformat, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureStorage2D"); }
    }

    public void TextureStorage3D(@CType("GLuint") int texture, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (!Unmarshal.isNullPointer(PFN_glTextureStorage3D)) { try {
            MH_glTextureStorage3D.invokeExact(PFN_glTextureStorage3D, texture, levels, internalformat, width, height, depth);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureStorage3D"); }
    }

    public void TextureStorage2DMultisample(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (!Unmarshal.isNullPointer(PFN_glTextureStorage2DMultisample)) { try {
            MH_glTextureStorage2DMultisample.invokeExact(PFN_glTextureStorage2DMultisample, texture, samples, internalformat, width, height, fixedsamplelocations);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureStorage2DMultisample"); }
    }

    public void TextureStorage3DMultisample(@CType("GLuint") int texture, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (!Unmarshal.isNullPointer(PFN_glTextureStorage3DMultisample)) { try {
            MH_glTextureStorage3DMultisample.invokeExact(PFN_glTextureStorage3DMultisample, texture, samples, internalformat, width, height, depth, fixedsamplelocations);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DMultisample", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureStorage3DMultisample"); }
    }

    public void TextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glTextureSubImage1D)) { try {
            MH_glTextureSubImage1D.invokeExact(PFN_glTextureSubImage1D, texture, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage1D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureSubImage1D"); }
    }

    public void TextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glTextureSubImage2D)) { try {
            MH_glTextureSubImage2D.invokeExact(PFN_glTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage2D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureSubImage2D"); }
    }

    public void TextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glTextureSubImage3D)) { try {
            MH_glTextureSubImage3D.invokeExact(PFN_glTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage3D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureSubImage3D"); }
    }

    public void CompressedTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage1D)) { try {
            MH_glCompressedTextureSubImage1D.invokeExact(PFN_glCompressedTextureSubImage1D, texture, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage1D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1D"); }
    }

    public void CompressedTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage2D)) { try {
            MH_glCompressedTextureSubImage2D.invokeExact(PFN_glCompressedTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage2D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2D"); }
    }

    public void CompressedTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage3D)) { try {
            MH_glCompressedTextureSubImage3D.invokeExact(PFN_glCompressedTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage3D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage3D"); }
    }

    public void CopyTextureSubImage1D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage1D)) { try {
            MH_glCopyTextureSubImage1D.invokeExact(PFN_glCopyTextureSubImage1D, texture, level, xoffset, x, y, width);
        } catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage1D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage1D"); }
    }

    public void CopyTextureSubImage2D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage2D)) { try {
            MH_glCopyTextureSubImage2D.invokeExact(PFN_glCopyTextureSubImage2D, texture, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage2D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage2D"); }
    }

    public void CopyTextureSubImage3D(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage3D)) { try {
            MH_glCopyTextureSubImage3D.invokeExact(PFN_glCopyTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage3D", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage3D"); }
    }

    public void TextureParameterf(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (!Unmarshal.isNullPointer(PFN_glTextureParameterf)) { try {
            MH_glTextureParameterf.invokeExact(PFN_glTextureParameterf, texture, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureParameterf", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureParameterf"); }
    }

    public void TextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glTextureParameterfv)) { try {
            MH_glTextureParameterfv.invokeExact(PFN_glTextureParameterfv, texture, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureParameterfv"); }
    }

    public void TextureParameteri(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glTextureParameteri)) { try {
            MH_glTextureParameteri.invokeExact(PFN_glTextureParameteri, texture, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureParameteri", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureParameteri"); }
    }

    public void TextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glTextureParameterIiv)) { try {
            MH_glTextureParameterIiv.invokeExact(PFN_glTextureParameterIiv, texture, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureParameterIiv"); }
    }

    public void TextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glTextureParameterIuiv)) { try {
            MH_glTextureParameterIuiv.invokeExact(PFN_glTextureParameterIuiv, texture, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIuiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureParameterIuiv"); }
    }

    public void TextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glTextureParameteriv)) { try {
            MH_glTextureParameteriv.invokeExact(PFN_glTextureParameteriv, texture, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureParameteriv"); }
    }

    public void GenerateTextureMipmap(@CType("GLuint") int texture) {
        if (!Unmarshal.isNullPointer(PFN_glGenerateTextureMipmap)) { try {
            MH_glGenerateTextureMipmap.invokeExact(PFN_glGenerateTextureMipmap, texture);
        } catch (Throwable e) { throw new RuntimeException("error in glGenerateTextureMipmap", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenerateTextureMipmap"); }
    }

    public void BindTextureUnit(@CType("GLuint") int unit, @CType("GLuint") int texture) {
        if (!Unmarshal.isNullPointer(PFN_glBindTextureUnit)) { try {
            MH_glBindTextureUnit.invokeExact(PFN_glBindTextureUnit, unit, texture);
        } catch (Throwable e) { throw new RuntimeException("error in glBindTextureUnit", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBindTextureUnit"); }
    }

    public void GetTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureImage)) { try {
            MH_glGetTextureImage.invokeExact(PFN_glGetTextureImage, texture, level, format, type, bufSize, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureImage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureImage"); }
    }

    public void GetCompressedTextureImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glGetCompressedTextureImage)) { try {
            MH_glGetCompressedTextureImage.invokeExact(PFN_glGetCompressedTextureImage, texture, level, bufSize, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureImage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureImage"); }
    }

    public void GetTextureLevelParameterfv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureLevelParameterfv)) { try {
            MH_glGetTextureLevelParameterfv.invokeExact(PFN_glGetTextureLevelParameterfv, texture, level, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfv"); }
    }

    public void GetTextureLevelParameteriv(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureLevelParameteriv)) { try {
            MH_glGetTextureLevelParameteriv.invokeExact(PFN_glGetTextureLevelParameteriv, texture, level, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameteriv"); }
    }

    public void GetTextureParameterfv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterfv)) { try {
            MH_glGetTextureParameterfv.invokeExact(PFN_glGetTextureParameterfv, texture, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterfv"); }
    }

    public void GetTextureParameterIiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterIiv)) { try {
            MH_glGetTextureParameterIiv.invokeExact(PFN_glGetTextureParameterIiv, texture, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIiv"); }
    }

    public void GetTextureParameterIuiv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterIuiv)) { try {
            MH_glGetTextureParameterIuiv.invokeExact(PFN_glGetTextureParameterIuiv, texture, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIuiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIuiv"); }
    }

    public void GetTextureParameteriv(@CType("GLuint") int texture, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureParameteriv)) { try {
            MH_glGetTextureParameteriv.invokeExact(PFN_glGetTextureParameteriv, texture, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameteriv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureParameteriv"); }
    }

    public void CreateVertexArrays(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
        if (!Unmarshal.isNullPointer(PFN_glCreateVertexArrays)) { try {
            MH_glCreateVertexArrays.invokeExact(PFN_glCreateVertexArrays, n, arrays);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateVertexArrays", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateVertexArrays"); }
    }

    public void DisableVertexArrayAttrib(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        if (!Unmarshal.isNullPointer(PFN_glDisableVertexArrayAttrib)) { try {
            MH_glDisableVertexArrayAttrib.invokeExact(PFN_glDisableVertexArrayAttrib, vaobj, index);
        } catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayAttrib", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDisableVertexArrayAttrib"); }
    }

    public void EnableVertexArrayAttrib(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        if (!Unmarshal.isNullPointer(PFN_glEnableVertexArrayAttrib)) { try {
            MH_glEnableVertexArrayAttrib.invokeExact(PFN_glEnableVertexArrayAttrib, vaobj, index);
        } catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayAttrib", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEnableVertexArrayAttrib"); }
    }

    public void VertexArrayElementBuffer(@CType("GLuint") int vaobj, @CType("GLuint") int buffer) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayElementBuffer)) { try {
            MH_glVertexArrayElementBuffer.invokeExact(PFN_glVertexArrayElementBuffer, vaobj, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayElementBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayElementBuffer"); }
    }

    public void VertexArrayVertexBuffer(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizei") int stride) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexBuffer)) { try {
            MH_glVertexArrayVertexBuffer.invokeExact(PFN_glVertexArrayVertexBuffer, vaobj, bindingindex, buffer, offset, stride);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBuffer", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffer"); }
    }

    public void VertexArrayVertexBuffers(@CType("GLuint") int vaobj, @CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment buffers, @CType("const GLintptr *") java.lang.foreign.MemorySegment offsets, @CType("const GLsizei *") java.lang.foreign.MemorySegment strides) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexBuffers)) { try {
            MH_glVertexArrayVertexBuffers.invokeExact(PFN_glVertexArrayVertexBuffers, vaobj, first, count, buffers, offsets, strides);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBuffers", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffers"); }
    }

    public void VertexArrayAttribBinding(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLuint") int bindingindex) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribBinding)) { try {
            MH_glVertexArrayAttribBinding.invokeExact(PFN_glVertexArrayAttribBinding, vaobj, attribindex, bindingindex);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribBinding", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribBinding"); }
    }

    public void VertexArrayAttribFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int relativeoffset) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribFormat)) { try {
            MH_glVertexArrayAttribFormat.invokeExact(PFN_glVertexArrayAttribFormat, vaobj, attribindex, size, type, normalized, relativeoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribFormat"); }
    }

    public void VertexArrayAttribIFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribIFormat)) { try {
            MH_glVertexArrayAttribIFormat.invokeExact(PFN_glVertexArrayAttribIFormat, vaobj, attribindex, size, type, relativeoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribIFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribIFormat"); }
    }

    public void VertexArrayAttribLFormat(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayAttribLFormat)) { try {
            MH_glVertexArrayAttribLFormat.invokeExact(PFN_glVertexArrayAttribLFormat, vaobj, attribindex, size, type, relativeoffset);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayAttribLFormat", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayAttribLFormat"); }
    }

    public void VertexArrayBindingDivisor(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int divisor) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayBindingDivisor)) { try {
            MH_glVertexArrayBindingDivisor.invokeExact(PFN_glVertexArrayBindingDivisor, vaobj, bindingindex, divisor);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayBindingDivisor", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayBindingDivisor"); }
    }

    public void GetVertexArrayiv(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayiv)) { try {
            MH_glGetVertexArrayiv.invokeExact(PFN_glGetVertexArrayiv, vaobj, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayiv"); }
    }

    public void GetVertexArrayIndexediv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayIndexediv)) { try {
            MH_glGetVertexArrayIndexediv.invokeExact(PFN_glGetVertexArrayIndexediv, vaobj, index, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexediv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexediv"); }
    }

    public void GetVertexArrayIndexed64iv(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment param) {
        if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayIndexed64iv)) { try {
            MH_glGetVertexArrayIndexed64iv.invokeExact(PFN_glGetVertexArrayIndexed64iv, vaobj, index, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIndexed64iv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIndexed64iv"); }
    }

    public void CreateSamplers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment samplers) {
        if (!Unmarshal.isNullPointer(PFN_glCreateSamplers)) { try {
            MH_glCreateSamplers.invokeExact(PFN_glCreateSamplers, n, samplers);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateSamplers", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateSamplers"); }
    }

    public void CreateProgramPipelines(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment pipelines) {
        if (!Unmarshal.isNullPointer(PFN_glCreateProgramPipelines)) { try {
            MH_glCreateProgramPipelines.invokeExact(PFN_glCreateProgramPipelines, n, pipelines);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateProgramPipelines", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateProgramPipelines"); }
    }

    public void CreateQueries(@CType("GLenum") int target, @CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment ids) {
        if (!Unmarshal.isNullPointer(PFN_glCreateQueries)) { try {
            MH_glCreateQueries.invokeExact(PFN_glCreateQueries, target, n, ids);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateQueries", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateQueries"); }
    }

    public void GetQueryBufferObjecti64v(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjecti64v)) { try {
            MH_glGetQueryBufferObjecti64v.invokeExact(PFN_glGetQueryBufferObjecti64v, id, buffer, pname, offset);
        } catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjecti64v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjecti64v"); }
    }

    public void GetQueryBufferObjectiv(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjectiv)) { try {
            MH_glGetQueryBufferObjectiv.invokeExact(PFN_glGetQueryBufferObjectiv, id, buffer, pname, offset);
        } catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectiv"); }
    }

    public void GetQueryBufferObjectui64v(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjectui64v)) { try {
            MH_glGetQueryBufferObjectui64v.invokeExact(PFN_glGetQueryBufferObjectui64v, id, buffer, pname, offset);
        } catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectui64v", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectui64v"); }
    }

    public void GetQueryBufferObjectuiv(@CType("GLuint") int id, @CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLintptr") long offset) {
        if (!Unmarshal.isNullPointer(PFN_glGetQueryBufferObjectuiv)) { try {
            MH_glGetQueryBufferObjectuiv.invokeExact(PFN_glGetQueryBufferObjectuiv, id, buffer, pname, offset);
        } catch (Throwable e) { throw new RuntimeException("error in glGetQueryBufferObjectuiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetQueryBufferObjectuiv"); }
    }

    public void MemoryBarrierByRegion(@CType("GLbitfield") int barriers) {
        if (!Unmarshal.isNullPointer(PFN_glMemoryBarrierByRegion)) { try {
            MH_glMemoryBarrierByRegion.invokeExact(PFN_glMemoryBarrierByRegion, barriers);
        } catch (Throwable e) { throw new RuntimeException("error in glMemoryBarrierByRegion", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMemoryBarrierByRegion"); }
    }

    public void GetTextureSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glGetTextureSubImage)) { try {
            MH_glGetTextureSubImage.invokeExact(PFN_glGetTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glGetTextureSubImage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetTextureSubImage"); }
    }

    public void GetCompressedTextureSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glGetCompressedTextureSubImage)) { try {
            MH_glGetCompressedTextureSubImage.invokeExact(PFN_glGetCompressedTextureSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureSubImage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureSubImage"); }
    }

    public @CType("GLenum") int GetGraphicsResetStatus() {
        if (!Unmarshal.isNullPointer(PFN_glGetGraphicsResetStatus)) { try {
            return (int) MH_glGetGraphicsResetStatus.invokeExact(PFN_glGetGraphicsResetStatus);
        } catch (Throwable e) { throw new RuntimeException("error in glGetGraphicsResetStatus", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetGraphicsResetStatus"); }
    }

    public void GetnCompressedTexImage(@CType("GLenum") int target, @CType("GLint") int lod, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glGetnCompressedTexImage)) { try {
            MH_glGetnCompressedTexImage.invokeExact(PFN_glGetnCompressedTexImage, target, lod, bufSize, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnCompressedTexImage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnCompressedTexImage"); }
    }

    public void GetnTexImage(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (!Unmarshal.isNullPointer(PFN_glGetnTexImage)) { try {
            MH_glGetnTexImage.invokeExact(PFN_glGetnTexImage, target, level, format, type, bufSize, pixels);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnTexImage", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnTexImage"); }
    }

    public void GetnUniformdv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformdv)) { try {
            MH_glGetnUniformdv.invokeExact(PFN_glGetnUniformdv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformdv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformdv"); }
    }

    public void GetnUniformfv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformfv)) { try {
            MH_glGetnUniformfv.invokeExact(PFN_glGetnUniformfv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformfv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformfv"); }
    }

    public void GetnUniformiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformiv)) { try {
            MH_glGetnUniformiv.invokeExact(PFN_glGetnUniformiv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformiv"); }
    }

    public void GetnUniformuiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int bufSize, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetnUniformuiv)) { try {
            MH_glGetnUniformuiv.invokeExact(PFN_glGetnUniformuiv, program, location, bufSize, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetnUniformuiv", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetnUniformuiv"); }
    }

    public void ReadnPixels(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("GLsizei") int bufSize, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glReadnPixels)) { try {
            MH_glReadnPixels.invokeExact(PFN_glReadnPixels, x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) { throw new RuntimeException("error in glReadnPixels", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glReadnPixels"); }
    }

    public void TextureBarrier() {
        if (!Unmarshal.isNullPointer(PFN_glTextureBarrier)) { try {
            MH_glTextureBarrier.invokeExact(PFN_glTextureBarrier);
        } catch (Throwable e) { throw new RuntimeException("error in glTextureBarrier", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTextureBarrier"); }
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
