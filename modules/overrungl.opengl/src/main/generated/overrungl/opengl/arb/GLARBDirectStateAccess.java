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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_direct_state_access`
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
        public static final MethodHandle MH_glCreateTransformFeedbacks = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTransformFeedbackBufferBase = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTransformFeedbackBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetTransformFeedbackiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTransformFeedbacki_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTransformFeedbacki64_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedBufferStorage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyNamedBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glClearNamedBufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapNamedBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMapNamedBufferRange = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapNamedBuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFlushMappedNamedBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetNamedBufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferParameteri64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferPointerv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateFramebuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferRenderbuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTexture = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTextureLayer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferDrawBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferDrawBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferReadBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateNamedFramebufferData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glInvalidateNamedFramebufferSubData = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearNamedFramebufferiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedFramebufferuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedFramebufferfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedFramebufferfi = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlitNamedFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCheckNamedFramebufferStatus = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedFramebufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateRenderbuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedRenderbufferStorage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedRenderbufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateTextures = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage2DMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureStorage3DMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureSubImage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyTextureSubImage1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureSubImage2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureSubImage3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterf = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTextureParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameteri = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameterIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenerateTextureMipmap = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindTextureUnit = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedTextureImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureLevelParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureLevelParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateVertexArrays = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDisableVertexArrayAttrib = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEnableVertexArrayAttrib = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayElementBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexBuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexArrayAttribBinding = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayAttribFormat = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayAttribIFormat = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayAttribLFormat = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayBindingDivisor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVertexArrayiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayIndexediv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayIndexed64iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateSamplers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateProgramPipelines = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCreateQueries = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetQueryBufferObjecti64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetQueryBufferObjectiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetQueryBufferObjectui64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetQueryBufferObjectuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
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
        private Handles(GLLoadFunc func) {
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

    public GLARBDirectStateAccess(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glCreateTransformFeedbacks`.
    /// ```
    /// void glCreateTransformFeedbacks((int) GLsizei n, GLuint* ids);
    /// ```
    public void CreateTransformFeedbacks(int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateTransformFeedbacks)) throw new GLSymbolNotFoundError("Symbol not found: glCreateTransformFeedbacks");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateTransformFeedbacks", n, ids); }
        Handles.MH_glCreateTransformFeedbacks.invokeExact(handles.PFN_glCreateTransformFeedbacks, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in CreateTransformFeedbacks", e); }
    }

    /// Invokes `glTransformFeedbackBufferBase`.
    /// ```
    /// void glTransformFeedbackBufferBase((unsigned int) GLuint xfb, (unsigned int) GLuint index, (unsigned int) GLuint buffer);
    /// ```
    public void TransformFeedbackBufferBase(int xfb, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackBufferBase)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackBufferBase");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackBufferBase", xfb, index, buffer); }
        Handles.MH_glTransformFeedbackBufferBase.invokeExact(handles.PFN_glTransformFeedbackBufferBase, xfb, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackBufferBase", e); }
    }

    /// Invokes `glTransformFeedbackBufferRange`.
    /// ```
    /// void glTransformFeedbackBufferRange((unsigned int) GLuint xfb, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void TransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackBufferRange", xfb, index, buffer, offset, size); }
        Handles.MH_glTransformFeedbackBufferRange.invokeExact(handles.PFN_glTransformFeedbackBufferRange, xfb, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackBufferRange", e); }
    }

    /// Invokes `glGetTransformFeedbackiv`.
    /// ```
    /// void glGetTransformFeedbackiv((unsigned int) GLuint xfb, (unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetTransformFeedbackiv(int xfb, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbackiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbackiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTransformFeedbackiv", xfb, pname, param); }
        Handles.MH_glGetTransformFeedbackiv.invokeExact(handles.PFN_glGetTransformFeedbackiv, xfb, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbackiv", e); }
    }

    /// Invokes `glGetTransformFeedbacki_v`.
    /// ```
    /// void glGetTransformFeedbacki_v((unsigned int) GLuint xfb, (unsigned int) GLenum pname, (unsigned int) GLuint index, GLint* param);
    /// ```
    public void GetTransformFeedbacki_v(int xfb, int pname, int index, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbacki_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbacki_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTransformFeedbacki_v", xfb, pname, index, param); }
        Handles.MH_glGetTransformFeedbacki_v.invokeExact(handles.PFN_glGetTransformFeedbacki_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbacki_v", e); }
    }

    /// Invokes `glGetTransformFeedbacki64_v`.
    /// ```
    /// void glGetTransformFeedbacki64_v((unsigned int) GLuint xfb, (unsigned int) GLenum pname, (unsigned int) GLuint index, GLint64* param);
    /// ```
    public void GetTransformFeedbacki64_v(int xfb, int pname, int index, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbacki64_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbacki64_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTransformFeedbacki64_v", xfb, pname, index, param); }
        Handles.MH_glGetTransformFeedbacki64_v.invokeExact(handles.PFN_glGetTransformFeedbacki64_v, xfb, pname, index, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbacki64_v", e); }
    }

    /// Invokes `glCreateBuffers`.
    /// ```
    /// void glCreateBuffers((int) GLsizei n, GLuint* buffers);
    /// ```
    public void CreateBuffers(int n, @NonNull MemorySegment buffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glCreateBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateBuffers", n, buffers); }
        Handles.MH_glCreateBuffers.invokeExact(handles.PFN_glCreateBuffers, n, buffers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateBuffers", e); }
    }

    /// Invokes `glNamedBufferStorage`.
    /// ```
    /// void glNamedBufferStorage((unsigned int) GLuint buffer, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data, (unsigned int) GLbitfield flags);
    /// ```
    public void NamedBufferStorage(int buffer, long size, @NonNull MemorySegment data, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferStorage)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferStorage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferStorage", buffer, size, data, flags); }
        Handles.MH_glNamedBufferStorage.invokeExact(handles.PFN_glNamedBufferStorage, buffer, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferStorage", e); }
    }

    /// Invokes `glNamedBufferData`.
    /// ```
    /// void glNamedBufferData((unsigned int) GLuint buffer, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data, (unsigned int) GLenum usage);
    /// ```
    public void NamedBufferData(int buffer, long size, @NonNull MemorySegment data, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferData)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferData", buffer, size, data, usage); }
        Handles.MH_glNamedBufferData.invokeExact(handles.PFN_glNamedBufferData, buffer, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferData", e); }
    }

    /// Invokes `glNamedBufferSubData`.
    /// ```
    /// void glNamedBufferSubData((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data);
    /// ```
    public void NamedBufferSubData(int buffer, long offset, long size, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedBufferSubData", buffer, offset, size, data); }
        Handles.MH_glNamedBufferSubData.invokeExact(handles.PFN_glNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferSubData", e); }
    }

    /// Invokes `glCopyNamedBufferSubData`.
    /// ```
    /// void glCopyNamedBufferSubData((unsigned int) GLuint readBuffer, (unsigned int) GLuint writeBuffer, ((signed long long) khronos_intptr_t) GLintptr readOffset, ((signed long long) khronos_intptr_t) GLintptr writeOffset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void CopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyNamedBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glCopyNamedBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyNamedBufferSubData", readBuffer, writeBuffer, readOffset, writeOffset, size); }
        Handles.MH_glCopyNamedBufferSubData.invokeExact(handles.PFN_glCopyNamedBufferSubData, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in CopyNamedBufferSubData", e); }
    }

    /// Invokes `glClearNamedBufferData`.
    /// ```
    /// void glClearNamedBufferData((unsigned int) GLuint buffer, (unsigned int) GLenum internalformat, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearNamedBufferData(int buffer, int internalformat, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedBufferData)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedBufferData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearNamedBufferData", buffer, internalformat, format, type, data); }
        Handles.MH_glClearNamedBufferData.invokeExact(handles.PFN_glClearNamedBufferData, buffer, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedBufferData", e); }
    }

    /// Invokes `glClearNamedBufferSubData`.
    /// ```
    /// void glClearNamedBufferSubData((unsigned int) GLuint buffer, (unsigned int) GLenum internalformat, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearNamedBufferSubData", buffer, internalformat, offset, size, format, type, data); }
        Handles.MH_glClearNamedBufferSubData.invokeExact(handles.PFN_glClearNamedBufferSubData, buffer, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedBufferSubData", e); }
    }

    /// Invokes `glMapNamedBuffer`.
    /// ```
    /// void* glMapNamedBuffer((unsigned int) GLuint buffer, (unsigned int) GLenum access);
    /// ```
    public @NonNull MemorySegment MapNamedBuffer(int buffer, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapNamedBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glMapNamedBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapNamedBuffer", buffer, access); }
        return (MemorySegment) Handles.MH_glMapNamedBuffer.invokeExact(handles.PFN_glMapNamedBuffer, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapNamedBuffer", e); }
    }

    /// Invokes `glMapNamedBufferRange`.
    /// ```
    /// void* glMapNamedBufferRange((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length, (unsigned int) GLbitfield access);
    /// ```
    public @NonNull MemorySegment MapNamedBufferRange(int buffer, long offset, long length, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapNamedBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glMapNamedBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapNamedBufferRange", buffer, offset, length, access); }
        return (MemorySegment) Handles.MH_glMapNamedBufferRange.invokeExact(handles.PFN_glMapNamedBufferRange, buffer, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapNamedBufferRange", e); }
    }

    /// Invokes `glUnmapNamedBuffer`.
    /// ```
    /// GLboolean glUnmapNamedBuffer((unsigned int) GLuint buffer);
    /// ```
    public boolean UnmapNamedBuffer(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapNamedBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glUnmapNamedBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUnmapNamedBuffer", buffer); }
        return (((byte) Handles.MH_glUnmapNamedBuffer.invokeExact(handles.PFN_glUnmapNamedBuffer, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapNamedBuffer", e); }
    }

    /// Invokes `glFlushMappedNamedBufferRange`.
    /// ```
    /// void glFlushMappedNamedBufferRange((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void FlushMappedNamedBufferRange(int buffer, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushMappedNamedBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glFlushMappedNamedBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushMappedNamedBufferRange", buffer, offset, length); }
        Handles.MH_glFlushMappedNamedBufferRange.invokeExact(handles.PFN_glFlushMappedNamedBufferRange, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedNamedBufferRange", e); }
    }

    /// Invokes `glGetNamedBufferParameteriv`.
    /// ```
    /// void glGetNamedBufferParameteriv((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedBufferParameteriv(int buffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedBufferParameteriv", buffer, pname, params); }
        Handles.MH_glGetNamedBufferParameteriv.invokeExact(handles.PFN_glGetNamedBufferParameteriv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferParameteriv", e); }
    }

    /// Invokes `glGetNamedBufferParameteri64v`.
    /// ```
    /// void glGetNamedBufferParameteri64v((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLint64* params);
    /// ```
    public void GetNamedBufferParameteri64v(int buffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferParameteri64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferParameteri64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedBufferParameteri64v", buffer, pname, params); }
        Handles.MH_glGetNamedBufferParameteri64v.invokeExact(handles.PFN_glGetNamedBufferParameteri64v, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferParameteri64v", e); }
    }

    /// Invokes `glGetNamedBufferPointerv`.
    /// ```
    /// void glGetNamedBufferPointerv((unsigned int) GLuint buffer, (unsigned int) GLenum pname, void** params);
    /// ```
    public void GetNamedBufferPointerv(int buffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferPointerv)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferPointerv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedBufferPointerv", buffer, pname, params); }
        Handles.MH_glGetNamedBufferPointerv.invokeExact(handles.PFN_glGetNamedBufferPointerv, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferPointerv", e); }
    }

    /// Invokes `glGetNamedBufferSubData`.
    /// ```
    /// void glGetNamedBufferSubData((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, void* data);
    /// ```
    public void GetNamedBufferSubData(int buffer, long offset, long size, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedBufferSubData", buffer, offset, size, data); }
        Handles.MH_glGetNamedBufferSubData.invokeExact(handles.PFN_glGetNamedBufferSubData, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferSubData", e); }
    }

    /// Invokes `glCreateFramebuffers`.
    /// ```
    /// void glCreateFramebuffers((int) GLsizei n, GLuint* framebuffers);
    /// ```
    public void CreateFramebuffers(int n, @NonNull MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateFramebuffers)) throw new GLSymbolNotFoundError("Symbol not found: glCreateFramebuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateFramebuffers", n, framebuffers); }
        Handles.MH_glCreateFramebuffers.invokeExact(handles.PFN_glCreateFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateFramebuffers", e); }
    }

    /// Invokes `glNamedFramebufferRenderbuffer`.
    /// ```
    /// void glNamedFramebufferRenderbuffer((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum renderbuffertarget, (unsigned int) GLuint renderbuffer);
    /// ```
    public void NamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferRenderbuffer", framebuffer, attachment, renderbuffertarget, renderbuffer); }
        Handles.MH_glNamedFramebufferRenderbuffer.invokeExact(handles.PFN_glNamedFramebufferRenderbuffer, framebuffer, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferRenderbuffer", e); }
    }

    /// Invokes `glNamedFramebufferParameteri`.
    /// ```
    /// void glNamedFramebufferParameteri((unsigned int) GLuint framebuffer, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void NamedFramebufferParameteri(int framebuffer, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferParameteri", framebuffer, pname, param); }
        Handles.MH_glNamedFramebufferParameteri.invokeExact(handles.PFN_glNamedFramebufferParameteri, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferParameteri", e); }
    }

    /// Invokes `glNamedFramebufferTexture`.
    /// ```
    /// void glNamedFramebufferTexture((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void NamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTexture)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTexture");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferTexture", framebuffer, attachment, texture, level); }
        Handles.MH_glNamedFramebufferTexture.invokeExact(handles.PFN_glNamedFramebufferTexture, framebuffer, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTexture", e); }
    }

    /// Invokes `glNamedFramebufferTextureLayer`.
    /// ```
    /// void glNamedFramebufferTextureLayer((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void NamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTextureLayer)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTextureLayer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferTextureLayer", framebuffer, attachment, texture, level, layer); }
        Handles.MH_glNamedFramebufferTextureLayer.invokeExact(handles.PFN_glNamedFramebufferTextureLayer, framebuffer, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTextureLayer", e); }
    }

    /// Invokes `glNamedFramebufferDrawBuffer`.
    /// ```
    /// void glNamedFramebufferDrawBuffer((unsigned int) GLuint framebuffer, (unsigned int) GLenum buf);
    /// ```
    public void NamedFramebufferDrawBuffer(int framebuffer, int buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferDrawBuffer", framebuffer, buf); }
        Handles.MH_glNamedFramebufferDrawBuffer.invokeExact(handles.PFN_glNamedFramebufferDrawBuffer, framebuffer, buf); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferDrawBuffer", e); }
    }

    /// Invokes `glNamedFramebufferDrawBuffers`.
    /// ```
    /// void glNamedFramebufferDrawBuffers((unsigned int) GLuint framebuffer, (int) GLsizei n, const GLenum* bufs);
    /// ```
    public void NamedFramebufferDrawBuffers(int framebuffer, int n, @NonNull MemorySegment bufs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferDrawBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferDrawBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferDrawBuffers", framebuffer, n, bufs); }
        Handles.MH_glNamedFramebufferDrawBuffers.invokeExact(handles.PFN_glNamedFramebufferDrawBuffers, framebuffer, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferDrawBuffers", e); }
    }

    /// Invokes `glNamedFramebufferReadBuffer`.
    /// ```
    /// void glNamedFramebufferReadBuffer((unsigned int) GLuint framebuffer, (unsigned int) GLenum src);
    /// ```
    public void NamedFramebufferReadBuffer(int framebuffer, int src) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferReadBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferReadBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferReadBuffer", framebuffer, src); }
        Handles.MH_glNamedFramebufferReadBuffer.invokeExact(handles.PFN_glNamedFramebufferReadBuffer, framebuffer, src); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferReadBuffer", e); }
    }

    /// Invokes `glInvalidateNamedFramebufferData`.
    /// ```
    /// void glInvalidateNamedFramebufferData((unsigned int) GLuint framebuffer, (int) GLsizei numAttachments, const GLenum* attachments);
    /// ```
    public void InvalidateNamedFramebufferData(int framebuffer, int numAttachments, @NonNull MemorySegment attachments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateNamedFramebufferData)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateNamedFramebufferData", framebuffer, numAttachments, attachments); }
        Handles.MH_glInvalidateNamedFramebufferData.invokeExact(handles.PFN_glInvalidateNamedFramebufferData, framebuffer, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateNamedFramebufferData", e); }
    }

    /// Invokes `glInvalidateNamedFramebufferSubData`.
    /// ```
    /// void glInvalidateNamedFramebufferSubData((unsigned int) GLuint framebuffer, (int) GLsizei numAttachments, const GLenum* attachments, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void InvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, @NonNull MemorySegment attachments, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateNamedFramebufferSubData)) throw new GLSymbolNotFoundError("Symbol not found: glInvalidateNamedFramebufferSubData");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glInvalidateNamedFramebufferSubData", framebuffer, numAttachments, attachments, x, y, width, height); }
        Handles.MH_glInvalidateNamedFramebufferSubData.invokeExact(handles.PFN_glInvalidateNamedFramebufferSubData, framebuffer, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateNamedFramebufferSubData", e); }
    }

    /// Invokes `glClearNamedFramebufferiv`.
    /// ```
    /// void glClearNamedFramebufferiv((unsigned int) GLuint framebuffer, (unsigned int) GLenum buffer, (int) GLint drawbuffer, const GLint* value);
    /// ```
    public void ClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferiv)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedFramebufferiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearNamedFramebufferiv", framebuffer, buffer, drawbuffer, value); }
        Handles.MH_glClearNamedFramebufferiv.invokeExact(handles.PFN_glClearNamedFramebufferiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferiv", e); }
    }

    /// Invokes `glClearNamedFramebufferuiv`.
    /// ```
    /// void glClearNamedFramebufferuiv((unsigned int) GLuint framebuffer, (unsigned int) GLenum buffer, (int) GLint drawbuffer, const GLuint* value);
    /// ```
    public void ClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferuiv)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedFramebufferuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearNamedFramebufferuiv", framebuffer, buffer, drawbuffer, value); }
        Handles.MH_glClearNamedFramebufferuiv.invokeExact(handles.PFN_glClearNamedFramebufferuiv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferuiv", e); }
    }

    /// Invokes `glClearNamedFramebufferfv`.
    /// ```
    /// void glClearNamedFramebufferfv((unsigned int) GLuint framebuffer, (unsigned int) GLenum buffer, (int) GLint drawbuffer, const GLfloat* value);
    /// ```
    public void ClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferfv)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedFramebufferfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearNamedFramebufferfv", framebuffer, buffer, drawbuffer, value); }
        Handles.MH_glClearNamedFramebufferfv.invokeExact(handles.PFN_glClearNamedFramebufferfv, framebuffer, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferfv", e); }
    }

    /// Invokes `glClearNamedFramebufferfi`.
    /// ```
    /// void glClearNamedFramebufferfi((unsigned int) GLuint framebuffer, (unsigned int) GLenum buffer, (int) GLint drawbuffer, ((float) khronos_float_t) GLfloat depth, (int) GLint stencil);
    /// ```
    public void ClearNamedFramebufferfi(int framebuffer, int buffer, int drawbuffer, float depth, int stencil) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedFramebufferfi)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedFramebufferfi");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearNamedFramebufferfi", framebuffer, buffer, drawbuffer, depth, stencil); }
        Handles.MH_glClearNamedFramebufferfi.invokeExact(handles.PFN_glClearNamedFramebufferfi, framebuffer, buffer, drawbuffer, depth, stencil); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedFramebufferfi", e); }
    }

    /// Invokes `glBlitNamedFramebuffer`.
    /// ```
    /// void glBlitNamedFramebuffer((unsigned int) GLuint readFramebuffer, (unsigned int) GLuint drawFramebuffer, (int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitNamedFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBlitNamedFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlitNamedFramebuffer", readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        Handles.MH_glBlitNamedFramebuffer.invokeExact(handles.PFN_glBlitNamedFramebuffer, readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitNamedFramebuffer", e); }
    }

    /// Invokes `glCheckNamedFramebufferStatus`.
    /// ```
    /// (unsigned int) GLenum glCheckNamedFramebufferStatus((unsigned int) GLuint framebuffer, (unsigned int) GLenum target);
    /// ```
    public int CheckNamedFramebufferStatus(int framebuffer, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCheckNamedFramebufferStatus)) throw new GLSymbolNotFoundError("Symbol not found: glCheckNamedFramebufferStatus");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCheckNamedFramebufferStatus", framebuffer, target); }
        return (int) Handles.MH_glCheckNamedFramebufferStatus.invokeExact(handles.PFN_glCheckNamedFramebufferStatus, framebuffer, target); }
        catch (Throwable e) { throw new RuntimeException("error in CheckNamedFramebufferStatus", e); }
    }

    /// Invokes `glGetNamedFramebufferParameteriv`.
    /// ```
    /// void glGetNamedFramebufferParameteriv((unsigned int) GLuint framebuffer, (unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetNamedFramebufferParameteriv(int framebuffer, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedFramebufferParameteriv", framebuffer, pname, param); }
        Handles.MH_glGetNamedFramebufferParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferParameteriv, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferParameteriv", e); }
    }

    /// Invokes `glGetNamedFramebufferAttachmentParameteriv`.
    /// ```
    /// void glGetNamedFramebufferAttachmentParameteriv((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferAttachmentParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedFramebufferAttachmentParameteriv", framebuffer, attachment, pname, params); }
        Handles.MH_glGetNamedFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetNamedFramebufferAttachmentParameteriv, framebuffer, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferAttachmentParameteriv", e); }
    }

    /// Invokes `glCreateRenderbuffers`.
    /// ```
    /// void glCreateRenderbuffers((int) GLsizei n, GLuint* renderbuffers);
    /// ```
    public void CreateRenderbuffers(int n, @NonNull MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateRenderbuffers)) throw new GLSymbolNotFoundError("Symbol not found: glCreateRenderbuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateRenderbuffers", n, renderbuffers); }
        Handles.MH_glCreateRenderbuffers.invokeExact(handles.PFN_glCreateRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateRenderbuffers", e); }
    }

    /// Invokes `glNamedRenderbufferStorage`.
    /// ```
    /// void glNamedRenderbufferStorage((unsigned int) GLuint renderbuffer, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void NamedRenderbufferStorage(int renderbuffer, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorage)) throw new GLSymbolNotFoundError("Symbol not found: glNamedRenderbufferStorage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedRenderbufferStorage", renderbuffer, internalformat, width, height); }
        Handles.MH_glNamedRenderbufferStorage.invokeExact(handles.PFN_glNamedRenderbufferStorage, renderbuffer, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorage", e); }
    }

    /// Invokes `glNamedRenderbufferStorageMultisample`.
    /// ```
    /// void glNamedRenderbufferStorageMultisample((unsigned int) GLuint renderbuffer, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void NamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedRenderbufferStorageMultisample", renderbuffer, samples, internalformat, width, height); }
        Handles.MH_glNamedRenderbufferStorageMultisample.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisample, renderbuffer, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorageMultisample", e); }
    }

    /// Invokes `glGetNamedRenderbufferParameteriv`.
    /// ```
    /// void glGetNamedRenderbufferParameteriv((unsigned int) GLuint renderbuffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedRenderbufferParameteriv(int renderbuffer, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedRenderbufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedRenderbufferParameteriv", renderbuffer, pname, params); }
        Handles.MH_glGetNamedRenderbufferParameteriv.invokeExact(handles.PFN_glGetNamedRenderbufferParameteriv, renderbuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedRenderbufferParameteriv", e); }
    }

    /// Invokes `glCreateTextures`.
    /// ```
    /// void glCreateTextures((unsigned int) GLenum target, (int) GLsizei n, GLuint* textures);
    /// ```
    public void CreateTextures(int target, int n, @NonNull MemorySegment textures) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateTextures)) throw new GLSymbolNotFoundError("Symbol not found: glCreateTextures");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateTextures", target, n, textures); }
        Handles.MH_glCreateTextures.invokeExact(handles.PFN_glCreateTextures, target, n, textures); }
        catch (Throwable e) { throw new RuntimeException("error in CreateTextures", e); }
    }

    /// Invokes `glTextureBuffer`.
    /// ```
    /// void glTextureBuffer((unsigned int) GLuint texture, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer);
    /// ```
    public void TextureBuffer(int texture, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureBuffer", texture, internalformat, buffer); }
        Handles.MH_glTextureBuffer.invokeExact(handles.PFN_glTextureBuffer, texture, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBuffer", e); }
    }

    /// Invokes `glTextureBufferRange`.
    /// ```
    /// void glTextureBufferRange((unsigned int) GLuint texture, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void TextureBufferRange(int texture, int internalformat, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureBufferRange", texture, internalformat, buffer, offset, size); }
        Handles.MH_glTextureBufferRange.invokeExact(handles.PFN_glTextureBufferRange, texture, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBufferRange", e); }
    }

    /// Invokes `glTextureStorage1D`.
    /// ```
    /// void glTextureStorage1D((unsigned int) GLuint texture, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width);
    /// ```
    public void TextureStorage1D(int texture, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage1D)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage1D", texture, levels, internalformat, width); }
        Handles.MH_glTextureStorage1D.invokeExact(handles.PFN_glTextureStorage1D, texture, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage1D", e); }
    }

    /// Invokes `glTextureStorage2D`.
    /// ```
    /// void glTextureStorage2D((unsigned int) GLuint texture, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void TextureStorage2D(int texture, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2D)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage2D", texture, levels, internalformat, width, height); }
        Handles.MH_glTextureStorage2D.invokeExact(handles.PFN_glTextureStorage2D, texture, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2D", e); }
    }

    /// Invokes `glTextureStorage3D`.
    /// ```
    /// void glTextureStorage3D((unsigned int) GLuint texture, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void TextureStorage3D(int texture, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3D)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage3D", texture, levels, internalformat, width, height, depth); }
        Handles.MH_glTextureStorage3D.invokeExact(handles.PFN_glTextureStorage3D, texture, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3D", e); }
    }

    /// Invokes `glTextureStorage2DMultisample`.
    /// ```
    /// void glTextureStorage2DMultisample((unsigned int) GLuint texture, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TextureStorage2DMultisample(int texture, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage2DMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage2DMultisample", texture, samples, internalformat, width, height, fixedsamplelocations); }
        Handles.MH_glTextureStorage2DMultisample.invokeExact(handles.PFN_glTextureStorage2DMultisample, texture, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2DMultisample", e); }
    }

    /// Invokes `glTextureStorage3DMultisample`.
    /// ```
    /// void glTextureStorage3DMultisample((unsigned int) GLuint texture, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TextureStorage3DMultisample(int texture, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3DMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage3DMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureStorage3DMultisample", texture, samples, internalformat, width, height, depth, fixedsamplelocations); }
        Handles.MH_glTextureStorage3DMultisample.invokeExact(handles.PFN_glTextureStorage3DMultisample, texture, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3DMultisample", e); }
    }

    /// Invokes `glTextureSubImage1D`.
    /// ```
    /// void glTextureSubImage1D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage1D)) throw new GLSymbolNotFoundError("Symbol not found: glTextureSubImage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureSubImage1D", texture, level, xoffset, width, format, type, pixels); }
        Handles.MH_glTextureSubImage1D.invokeExact(handles.PFN_glTextureSubImage1D, texture, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage1D", e); }
    }

    /// Invokes `glTextureSubImage2D`.
    /// ```
    /// void glTextureSubImage2D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage2D)) throw new GLSymbolNotFoundError("Symbol not found: glTextureSubImage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureSubImage2D", texture, level, xoffset, yoffset, width, height, format, type, pixels); }
        Handles.MH_glTextureSubImage2D.invokeExact(handles.PFN_glTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage2D", e); }
    }

    /// Invokes `glTextureSubImage3D`.
    /// ```
    /// void glTextureSubImage3D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage3D)) throw new GLSymbolNotFoundError("Symbol not found: glTextureSubImage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureSubImage3D", texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        Handles.MH_glTextureSubImage3D.invokeExact(handles.PFN_glTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage3D", e); }
    }

    /// Invokes `glCompressedTextureSubImage1D`.
    /// ```
    /// void glCompressedTextureSubImage1D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage1D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTextureSubImage1D", texture, level, xoffset, width, format, imageSize, data); }
        Handles.MH_glCompressedTextureSubImage1D.invokeExact(handles.PFN_glCompressedTextureSubImage1D, texture, level, xoffset, width, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage1D", e); }
    }

    /// Invokes `glCompressedTextureSubImage2D`.
    /// ```
    /// void glCompressedTextureSubImage2D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage2D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTextureSubImage2D", texture, level, xoffset, yoffset, width, height, format, imageSize, data); }
        Handles.MH_glCompressedTextureSubImage2D.invokeExact(handles.PFN_glCompressedTextureSubImage2D, texture, level, xoffset, yoffset, width, height, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage2D", e); }
    }

    /// Invokes `glCompressedTextureSubImage3D`.
    /// ```
    /// void glCompressedTextureSubImage3D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* data);
    /// ```
    public void CompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage3D)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureSubImage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompressedTextureSubImage3D", texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        Handles.MH_glCompressedTextureSubImage3D.invokeExact(handles.PFN_glCompressedTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage3D", e); }
    }

    /// Invokes `glCopyTextureSubImage1D`.
    /// ```
    /// void glCopyTextureSubImage1D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage1D)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureSubImage1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyTextureSubImage1D", texture, level, xoffset, x, y, width); }
        Handles.MH_glCopyTextureSubImage1D.invokeExact(handles.PFN_glCopyTextureSubImage1D, texture, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage1D", e); }
    }

    /// Invokes `glCopyTextureSubImage2D`.
    /// ```
    /// void glCopyTextureSubImage2D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage2D)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureSubImage2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyTextureSubImage2D", texture, level, xoffset, yoffset, x, y, width, height); }
        Handles.MH_glCopyTextureSubImage2D.invokeExact(handles.PFN_glCopyTextureSubImage2D, texture, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage2D", e); }
    }

    /// Invokes `glCopyTextureSubImage3D`.
    /// ```
    /// void glCopyTextureSubImage3D((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage3D)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureSubImage3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCopyTextureSubImage3D", texture, level, xoffset, yoffset, zoffset, x, y, width, height); }
        Handles.MH_glCopyTextureSubImage3D.invokeExact(handles.PFN_glCopyTextureSubImage3D, texture, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage3D", e); }
    }

    /// Invokes `glTextureParameterf`.
    /// ```
    /// void glTextureParameterf((unsigned int) GLuint texture, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void TextureParameterf(int texture, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterf)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterf");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureParameterf", texture, pname, param); }
        Handles.MH_glTextureParameterf.invokeExact(handles.PFN_glTextureParameterf, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterf", e); }
    }

    /// Invokes `glTextureParameterfv`.
    /// ```
    /// void glTextureParameterfv((unsigned int) GLuint texture, (unsigned int) GLenum pname, const GLfloat* param);
    /// ```
    public void TextureParameterfv(int texture, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureParameterfv", texture, pname, param); }
        Handles.MH_glTextureParameterfv.invokeExact(handles.PFN_glTextureParameterfv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterfv", e); }
    }

    /// Invokes `glTextureParameteri`.
    /// ```
    /// void glTextureParameteri((unsigned int) GLuint texture, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void TextureParameteri(int texture, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameteri)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameteri");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureParameteri", texture, pname, param); }
        Handles.MH_glTextureParameteri.invokeExact(handles.PFN_glTextureParameteri, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameteri", e); }
    }

    /// Invokes `glTextureParameterIiv`.
    /// ```
    /// void glTextureParameterIiv((unsigned int) GLuint texture, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void TextureParameterIiv(int texture, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureParameterIiv", texture, pname, params); }
        Handles.MH_glTextureParameterIiv.invokeExact(handles.PFN_glTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterIiv", e); }
    }

    /// Invokes `glTextureParameterIuiv`.
    /// ```
    /// void glTextureParameterIuiv((unsigned int) GLuint texture, (unsigned int) GLenum pname, const GLuint* params);
    /// ```
    public void TextureParameterIuiv(int texture, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureParameterIuiv", texture, pname, params); }
        Handles.MH_glTextureParameterIuiv.invokeExact(handles.PFN_glTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterIuiv", e); }
    }

    /// Invokes `glTextureParameteriv`.
    /// ```
    /// void glTextureParameteriv((unsigned int) GLuint texture, (unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void TextureParameteriv(int texture, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTextureParameteriv", texture, pname, param); }
        Handles.MH_glTextureParameteriv.invokeExact(handles.PFN_glTextureParameteriv, texture, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameteriv", e); }
    }

    /// Invokes `glGenerateTextureMipmap`.
    /// ```
    /// void glGenerateTextureMipmap((unsigned int) GLuint texture);
    /// ```
    public void GenerateTextureMipmap(int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateTextureMipmap)) throw new GLSymbolNotFoundError("Symbol not found: glGenerateTextureMipmap");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenerateTextureMipmap", texture); }
        Handles.MH_glGenerateTextureMipmap.invokeExact(handles.PFN_glGenerateTextureMipmap, texture); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateTextureMipmap", e); }
    }

    /// Invokes `glBindTextureUnit`.
    /// ```
    /// void glBindTextureUnit((unsigned int) GLuint unit, (unsigned int) GLuint texture);
    /// ```
    public void BindTextureUnit(int unit, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindTextureUnit)) throw new GLSymbolNotFoundError("Symbol not found: glBindTextureUnit");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindTextureUnit", unit, texture); }
        Handles.MH_glBindTextureUnit.invokeExact(handles.PFN_glBindTextureUnit, unit, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindTextureUnit", e); }
    }

    /// Invokes `glGetTextureImage`.
    /// ```
    /// void glGetTextureImage((unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum format, (unsigned int) GLenum type, (int) GLsizei bufSize, void* pixels);
    /// ```
    public void GetTextureImage(int texture, int level, int format, int type, int bufSize, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureImage)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureImage", texture, level, format, type, bufSize, pixels); }
        Handles.MH_glGetTextureImage.invokeExact(handles.PFN_glGetTextureImage, texture, level, format, type, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureImage", e); }
    }

    /// Invokes `glGetCompressedTextureImage`.
    /// ```
    /// void glGetCompressedTextureImage((unsigned int) GLuint texture, (int) GLint level, (int) GLsizei bufSize, void* pixels);
    /// ```
    public void GetCompressedTextureImage(int texture, int level, int bufSize, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedTextureImage)) throw new GLSymbolNotFoundError("Symbol not found: glGetCompressedTextureImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetCompressedTextureImage", texture, level, bufSize, pixels); }
        Handles.MH_glGetCompressedTextureImage.invokeExact(handles.PFN_glGetCompressedTextureImage, texture, level, bufSize, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedTextureImage", e); }
    }

    /// Invokes `glGetTextureLevelParameterfv`.
    /// ```
    /// void glGetTextureLevelParameterfv((unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetTextureLevelParameterfv(int texture, int level, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureLevelParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureLevelParameterfv", texture, level, pname, params); }
        Handles.MH_glGetTextureLevelParameterfv.invokeExact(handles.PFN_glGetTextureLevelParameterfv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureLevelParameterfv", e); }
    }

    /// Invokes `glGetTextureLevelParameteriv`.
    /// ```
    /// void glGetTextureLevelParameteriv((unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTextureLevelParameteriv(int texture, int level, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureLevelParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureLevelParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureLevelParameteriv", texture, level, pname, params); }
        Handles.MH_glGetTextureLevelParameteriv.invokeExact(handles.PFN_glGetTextureLevelParameteriv, texture, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureLevelParameteriv", e); }
    }

    /// Invokes `glGetTextureParameterfv`.
    /// ```
    /// void glGetTextureParameterfv((unsigned int) GLuint texture, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetTextureParameterfv(int texture, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureParameterfv", texture, pname, params); }
        Handles.MH_glGetTextureParameterfv.invokeExact(handles.PFN_glGetTextureParameterfv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterfv", e); }
    }

    /// Invokes `glGetTextureParameterIiv`.
    /// ```
    /// void glGetTextureParameterIiv((unsigned int) GLuint texture, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTextureParameterIiv(int texture, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureParameterIiv", texture, pname, params); }
        Handles.MH_glGetTextureParameterIiv.invokeExact(handles.PFN_glGetTextureParameterIiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterIiv", e); }
    }

    /// Invokes `glGetTextureParameterIuiv`.
    /// ```
    /// void glGetTextureParameterIuiv((unsigned int) GLuint texture, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetTextureParameterIuiv(int texture, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureParameterIuiv", texture, pname, params); }
        Handles.MH_glGetTextureParameterIuiv.invokeExact(handles.PFN_glGetTextureParameterIuiv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterIuiv", e); }
    }

    /// Invokes `glGetTextureParameteriv`.
    /// ```
    /// void glGetTextureParameteriv((unsigned int) GLuint texture, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTextureParameteriv(int texture, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTextureParameteriv", texture, pname, params); }
        Handles.MH_glGetTextureParameteriv.invokeExact(handles.PFN_glGetTextureParameteriv, texture, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameteriv", e); }
    }

    /// Invokes `glCreateVertexArrays`.
    /// ```
    /// void glCreateVertexArrays((int) GLsizei n, GLuint* arrays);
    /// ```
    public void CreateVertexArrays(int n, @NonNull MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateVertexArrays)) throw new GLSymbolNotFoundError("Symbol not found: glCreateVertexArrays");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateVertexArrays", n, arrays); }
        Handles.MH_glCreateVertexArrays.invokeExact(handles.PFN_glCreateVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in CreateVertexArrays", e); }
    }

    /// Invokes `glDisableVertexArrayAttrib`.
    /// ```
    /// void glDisableVertexArrayAttrib((unsigned int) GLuint vaobj, (unsigned int) GLuint index);
    /// ```
    public void DisableVertexArrayAttrib(int vaobj, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexArrayAttrib)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexArrayAttrib");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVertexArrayAttrib", vaobj, index); }
        Handles.MH_glDisableVertexArrayAttrib.invokeExact(handles.PFN_glDisableVertexArrayAttrib, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexArrayAttrib", e); }
    }

    /// Invokes `glEnableVertexArrayAttrib`.
    /// ```
    /// void glEnableVertexArrayAttrib((unsigned int) GLuint vaobj, (unsigned int) GLuint index);
    /// ```
    public void EnableVertexArrayAttrib(int vaobj, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexArrayAttrib)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexArrayAttrib");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVertexArrayAttrib", vaobj, index); }
        Handles.MH_glEnableVertexArrayAttrib.invokeExact(handles.PFN_glEnableVertexArrayAttrib, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexArrayAttrib", e); }
    }

    /// Invokes `glVertexArrayElementBuffer`.
    /// ```
    /// void glVertexArrayElementBuffer((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer);
    /// ```
    public void VertexArrayElementBuffer(int vaobj, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayElementBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayElementBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayElementBuffer", vaobj, buffer); }
        Handles.MH_glVertexArrayElementBuffer.invokeExact(handles.PFN_glVertexArrayElementBuffer, vaobj, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayElementBuffer", e); }
    }

    /// Invokes `glVertexArrayVertexBuffer`.
    /// ```
    /// void glVertexArrayVertexBuffer((unsigned int) GLuint vaobj, (unsigned int) GLuint bindingindex, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, (int) GLsizei stride);
    /// ```
    public void VertexArrayVertexBuffer(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexBuffer)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayVertexBuffer", vaobj, bindingindex, buffer, offset, stride); }
        Handles.MH_glVertexArrayVertexBuffer.invokeExact(handles.PFN_glVertexArrayVertexBuffer, vaobj, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexBuffer", e); }
    }

    /// Invokes `glVertexArrayVertexBuffers`.
    /// ```
    /// void glVertexArrayVertexBuffers((unsigned int) GLuint vaobj, (unsigned int) GLuint first, (int) GLsizei count, const GLuint* buffers, const GLintptr* offsets, const GLsizei* strides);
    /// ```
    public void VertexArrayVertexBuffers(int vaobj, int first, int count, @NonNull MemorySegment buffers, @NonNull MemorySegment offsets, @NonNull MemorySegment strides) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayVertexBuffers", vaobj, first, count, buffers, offsets, strides); }
        Handles.MH_glVertexArrayVertexBuffers.invokeExact(handles.PFN_glVertexArrayVertexBuffers, vaobj, first, count, buffers, offsets, strides); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexBuffers", e); }
    }

    /// Invokes `glVertexArrayAttribBinding`.
    /// ```
    /// void glVertexArrayAttribBinding((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (unsigned int) GLuint bindingindex);
    /// ```
    public void VertexArrayAttribBinding(int vaobj, int attribindex, int bindingindex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribBinding)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayAttribBinding");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayAttribBinding", vaobj, attribindex, bindingindex); }
        Handles.MH_glVertexArrayAttribBinding.invokeExact(handles.PFN_glVertexArrayAttribBinding, vaobj, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribBinding", e); }
    }

    /// Invokes `glVertexArrayAttribFormat`.
    /// ```
    /// void glVertexArrayAttribFormat((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexArrayAttribFormat(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayAttribFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayAttribFormat", vaobj, attribindex, size, type, normalized, relativeoffset); }
        Handles.MH_glVertexArrayAttribFormat.invokeExact(handles.PFN_glVertexArrayAttribFormat, vaobj, attribindex, size, type, ((normalized) ? (byte)1 : (byte)0), relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribFormat", e); }
    }

    /// Invokes `glVertexArrayAttribIFormat`.
    /// ```
    /// void glVertexArrayAttribIFormat((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexArrayAttribIFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribIFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayAttribIFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayAttribIFormat", vaobj, attribindex, size, type, relativeoffset); }
        Handles.MH_glVertexArrayAttribIFormat.invokeExact(handles.PFN_glVertexArrayAttribIFormat, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribIFormat", e); }
    }

    /// Invokes `glVertexArrayAttribLFormat`.
    /// ```
    /// void glVertexArrayAttribLFormat((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexArrayAttribLFormat(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayAttribLFormat)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayAttribLFormat");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayAttribLFormat", vaobj, attribindex, size, type, relativeoffset); }
        Handles.MH_glVertexArrayAttribLFormat.invokeExact(handles.PFN_glVertexArrayAttribLFormat, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayAttribLFormat", e); }
    }

    /// Invokes `glVertexArrayBindingDivisor`.
    /// ```
    /// void glVertexArrayBindingDivisor((unsigned int) GLuint vaobj, (unsigned int) GLuint bindingindex, (unsigned int) GLuint divisor);
    /// ```
    public void VertexArrayBindingDivisor(int vaobj, int bindingindex, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayBindingDivisor)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayBindingDivisor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexArrayBindingDivisor", vaobj, bindingindex, divisor); }
        Handles.MH_glVertexArrayBindingDivisor.invokeExact(handles.PFN_glVertexArrayBindingDivisor, vaobj, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayBindingDivisor", e); }
    }

    /// Invokes `glGetVertexArrayiv`.
    /// ```
    /// void glGetVertexArrayiv((unsigned int) GLuint vaobj, (unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetVertexArrayiv(int vaobj, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexArrayiv", vaobj, pname, param); }
        Handles.MH_glGetVertexArrayiv.invokeExact(handles.PFN_glGetVertexArrayiv, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayiv", e); }
    }

    /// Invokes `glGetVertexArrayIndexediv`.
    /// ```
    /// void glGetVertexArrayIndexediv((unsigned int) GLuint vaobj, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetVertexArrayIndexediv(int vaobj, int index, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayIndexediv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayIndexediv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexArrayIndexediv", vaobj, index, pname, param); }
        Handles.MH_glGetVertexArrayIndexediv.invokeExact(handles.PFN_glGetVertexArrayIndexediv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayIndexediv", e); }
    }

    /// Invokes `glGetVertexArrayIndexed64iv`.
    /// ```
    /// void glGetVertexArrayIndexed64iv((unsigned int) GLuint vaobj, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint64* param);
    /// ```
    public void GetVertexArrayIndexed64iv(int vaobj, int index, int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayIndexed64iv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayIndexed64iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexArrayIndexed64iv", vaobj, index, pname, param); }
        Handles.MH_glGetVertexArrayIndexed64iv.invokeExact(handles.PFN_glGetVertexArrayIndexed64iv, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayIndexed64iv", e); }
    }

    /// Invokes `glCreateSamplers`.
    /// ```
    /// void glCreateSamplers((int) GLsizei n, GLuint* samplers);
    /// ```
    public void CreateSamplers(int n, @NonNull MemorySegment samplers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateSamplers)) throw new GLSymbolNotFoundError("Symbol not found: glCreateSamplers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateSamplers", n, samplers); }
        Handles.MH_glCreateSamplers.invokeExact(handles.PFN_glCreateSamplers, n, samplers); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSamplers", e); }
    }

    /// Invokes `glCreateProgramPipelines`.
    /// ```
    /// void glCreateProgramPipelines((int) GLsizei n, GLuint* pipelines);
    /// ```
    public void CreateProgramPipelines(int n, @NonNull MemorySegment pipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateProgramPipelines)) throw new GLSymbolNotFoundError("Symbol not found: glCreateProgramPipelines");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateProgramPipelines", n, pipelines); }
        Handles.MH_glCreateProgramPipelines.invokeExact(handles.PFN_glCreateProgramPipelines, n, pipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateProgramPipelines", e); }
    }

    /// Invokes `glCreateQueries`.
    /// ```
    /// void glCreateQueries((unsigned int) GLenum target, (int) GLsizei n, GLuint* ids);
    /// ```
    public void CreateQueries(int target, int n, @NonNull MemorySegment ids) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateQueries)) throw new GLSymbolNotFoundError("Symbol not found: glCreateQueries");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateQueries", target, n, ids); }
        Handles.MH_glCreateQueries.invokeExact(handles.PFN_glCreateQueries, target, n, ids); }
        catch (Throwable e) { throw new RuntimeException("error in CreateQueries", e); }
    }

    /// Invokes `glGetQueryBufferObjecti64v`.
    /// ```
    /// void glGetQueryBufferObjecti64v((unsigned int) GLuint id, (unsigned int) GLuint buffer, (unsigned int) GLenum pname, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void GetQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjecti64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryBufferObjecti64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryBufferObjecti64v", id, buffer, pname, offset); }
        Handles.MH_glGetQueryBufferObjecti64v.invokeExact(handles.PFN_glGetQueryBufferObjecti64v, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjecti64v", e); }
    }

    /// Invokes `glGetQueryBufferObjectiv`.
    /// ```
    /// void glGetQueryBufferObjectiv((unsigned int) GLuint id, (unsigned int) GLuint buffer, (unsigned int) GLenum pname, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void GetQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjectiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryBufferObjectiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryBufferObjectiv", id, buffer, pname, offset); }
        Handles.MH_glGetQueryBufferObjectiv.invokeExact(handles.PFN_glGetQueryBufferObjectiv, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjectiv", e); }
    }

    /// Invokes `glGetQueryBufferObjectui64v`.
    /// ```
    /// void glGetQueryBufferObjectui64v((unsigned int) GLuint id, (unsigned int) GLuint buffer, (unsigned int) GLenum pname, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void GetQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjectui64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryBufferObjectui64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryBufferObjectui64v", id, buffer, pname, offset); }
        Handles.MH_glGetQueryBufferObjectui64v.invokeExact(handles.PFN_glGetQueryBufferObjectui64v, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjectui64v", e); }
    }

    /// Invokes `glGetQueryBufferObjectuiv`.
    /// ```
    /// void glGetQueryBufferObjectuiv((unsigned int) GLuint id, (unsigned int) GLuint buffer, (unsigned int) GLenum pname, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void GetQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetQueryBufferObjectuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetQueryBufferObjectuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetQueryBufferObjectuiv", id, buffer, pname, offset); }
        Handles.MH_glGetQueryBufferObjectuiv.invokeExact(handles.PFN_glGetQueryBufferObjectuiv, id, buffer, pname, offset); }
        catch (Throwable e) { throw new RuntimeException("error in GetQueryBufferObjectuiv", e); }
    }

}
