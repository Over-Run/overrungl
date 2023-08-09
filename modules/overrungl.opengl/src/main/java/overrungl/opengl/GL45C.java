/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl.opengl;

import overrungl.opengl.ext.arb.GLARBRobustness;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;

/**
 * The OpenGL 4.5 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_clip_control</li>
 *     <li>GL_ARB_direct_state_access</li>
 *     <li>GL_ARB_ES3_1_compatibility</li>
 *     <li>GL_ARB_get_texture_sub_image</li>
 *     <li>{@linkplain GLARBRobustness GL_ARB_robustness}</li>
 *     <li>GL_ARB_texture_barrier</li>
 *     <li>GL_KHR_robustness</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL45C extends GL44C permits GL46C {
    public static final int CONTEXT_LOST = 0x0507;
    public static final int NEGATIVE_ONE_TO_ONE = 0x935E;
    public static final int ZERO_TO_ONE = 0x935F;
    public static final int CLIP_ORIGIN = 0x935C;
    public static final int CLIP_DEPTH_MODE = 0x935D;
    public static final int QUERY_WAIT_INVERTED = 0x8E17;
    public static final int QUERY_NO_WAIT_INVERTED = 0x8E18;
    public static final int QUERY_BY_REGION_WAIT_INVERTED = 0x8E19;
    public static final int QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;
    public static final int MAX_CULL_DISTANCES = 0x82F9;
    public static final int MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;
    public static final int TEXTURE_TARGET = 0x1006;
    public static final int QUERY_TARGET = 0x82EA;
    public static final int GUILTY_CONTEXT_RESET = 0x8253;
    public static final int INNOCENT_CONTEXT_RESET = 0x8254;
    public static final int UNKNOWN_CONTEXT_RESET = 0x8255;
    public static final int RESET_NOTIFICATION_STRATEGY = 0x8256;
    public static final int LOSE_CONTEXT_ON_RESET = 0x8252;
    public static final int NO_RESET_NOTIFICATION = 0x8261;
    public static final int CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x00000004;
    public static final int CONTEXT_RELEASE_BEHAVIOR = 0x82FB;
    public static final int CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

    static boolean isSupported(GLCapabilities caps) {
        return GLLoader.checkAll(caps.glBindTextureUnit, caps.glBlitNamedFramebuffer, caps.glCheckNamedFramebufferStatus, caps.glClearNamedBufferData, caps.glClearNamedBufferSubData, caps.glClearNamedFramebufferfi,
            caps.glClearNamedFramebufferfv, caps.glClearNamedFramebufferiv, caps.glClearNamedFramebufferuiv, caps.glClipControl, caps.glCompressedTextureSubImage1D, caps.glCompressedTextureSubImage2D,
            caps.glCompressedTextureSubImage3D, caps.glCopyNamedBufferSubData, caps.glCopyTextureSubImage1D, caps.glCopyTextureSubImage2D, caps.glCopyTextureSubImage3D, caps.glCreateBuffers,
            caps.glCreateFramebuffers, caps.glCreateProgramPipelines, caps.glCreateQueries, caps.glCreateRenderbuffers, caps.glCreateSamplers, caps.glCreateTextures,
            caps.glCreateTransformFeedbacks, caps.glCreateVertexArrays, caps.glDisableVertexArrayAttrib, caps.glEnableVertexArrayAttrib, caps.glFlushMappedNamedBufferRange, caps.glGenerateTextureMipmap,
            caps.glGetCompressedTextureImage, caps.glGetCompressedTextureSubImage, caps.glGetGraphicsResetStatus, caps.glGetNamedBufferParameteri64v, caps.glGetNamedBufferParameteriv, caps.glGetNamedBufferPointerv,
            caps.glGetNamedBufferSubData, caps.glGetNamedFramebufferAttachmentParameteriv, caps.glGetNamedFramebufferParameteriv, caps.glGetNamedRenderbufferParameteriv, caps.glGetQueryBufferObjecti64v, caps.glGetQueryBufferObjectiv,
            caps.glGetQueryBufferObjectui64v, caps.glGetQueryBufferObjectuiv, caps.glGetTextureImage, caps.glGetTextureLevelParameterfv, caps.glGetTextureLevelParameteriv, caps.glGetTextureParameterIiv,
            caps.glGetTextureParameterIuiv, caps.glGetTextureParameterfv, caps.glGetTextureParameteriv, caps.glGetTextureSubImage, caps.glGetTransformFeedbacki64_v, caps.glGetTransformFeedbacki_v,
            caps.glGetTransformFeedbackiv, caps.glGetVertexArrayIndexed64iv, caps.glGetVertexArrayIndexediv, caps.glGetVertexArrayiv, caps.glGetnCompressedTexImage, caps.glGetnTexImage,
            caps.glGetnUniformdv, caps.glGetnUniformfv, caps.glGetnUniformiv, caps.glGetnUniformuiv, caps.glInvalidateNamedFramebufferData, caps.glInvalidateNamedFramebufferSubData,
            caps.glMapNamedBuffer, caps.glMapNamedBufferRange, caps.glMemoryBarrierByRegion, caps.glNamedBufferData, caps.glNamedBufferStorage, caps.glNamedBufferSubData,
            caps.glNamedFramebufferDrawBuffer, caps.glNamedFramebufferDrawBuffers, caps.glNamedFramebufferParameteri, caps.glNamedFramebufferReadBuffer, caps.glNamedFramebufferRenderbuffer, caps.glNamedFramebufferTexture,
            caps.glNamedFramebufferTextureLayer, caps.glNamedRenderbufferStorage, caps.glNamedRenderbufferStorageMultisample, caps.glReadnPixels, caps.glTextureBarrier, caps.glTextureBuffer,
            caps.glTextureBufferRange, caps.glTextureParameterIiv, caps.glTextureParameterIuiv, caps.glTextureParameterf, caps.glTextureParameterfv, caps.glTextureParameteri,
            caps.glTextureParameteriv, caps.glTextureStorage1D, caps.glTextureStorage2D, caps.glTextureStorage2DMultisample, caps.glTextureStorage3D, caps.glTextureStorage3DMultisample,
            caps.glTextureSubImage1D, caps.glTextureSubImage2D, caps.glTextureSubImage3D, caps.glTransformFeedbackBufferBase, caps.glTransformFeedbackBufferRange, caps.glUnmapNamedBuffer,
            caps.glVertexArrayAttribBinding, caps.glVertexArrayAttribFormat, caps.glVertexArrayAttribIFormat, caps.glVertexArrayAttribLFormat, caps.glVertexArrayBindingDivisor, caps.glVertexArrayElementBuffer,
            caps.glVertexArrayVertexBuffer, caps.glVertexArrayVertexBuffers);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindTextureUnit = load.invoke("glBindTextureUnit", IIV);
        caps.glBlitNamedFramebuffer = load.invoke("glBlitNamedFramebuffer", IIIIIIIIIIIIV);
        caps.glCheckNamedFramebufferStatus = load.invoke("glCheckNamedFramebufferStatus", III);
        caps.glClearNamedBufferData = load.invoke("glClearNamedBufferData", IIIIPV);
        caps.glClearNamedBufferSubData = load.invoke("glClearNamedBufferSubData", IIJJIIPV);
        caps.glClearNamedFramebufferfi = load.invoke("glClearNamedFramebufferfi", IIIFIV);
        caps.glClearNamedFramebufferfv = load.invoke("glClearNamedFramebufferfv", IIIPV);
        caps.glClearNamedFramebufferiv = load.invoke("glClearNamedFramebufferiv", IIIPV);
        caps.glClearNamedFramebufferuiv = load.invoke("glClearNamedFramebufferuiv", IIIPV);
        caps.glClipControl = load.invoke("glClipControl", IIV);
        caps.glCompressedTextureSubImage1D = load.invoke("glCompressedTextureSubImage1D", IIIIIIPV);
        caps.glCompressedTextureSubImage2D = load.invoke("glCompressedTextureSubImage2D", IIIIIIIIPV);
        caps.glCompressedTextureSubImage3D = load.invoke("glCompressedTextureSubImage3D", IIIIIIIIIIPV);
        caps.glCopyNamedBufferSubData = load.invoke("glCopyNamedBufferSubData", IIJJJV);
        caps.glCopyTextureSubImage1D = load.invoke("glCopyTextureSubImage1D", IIIIIIV);
        caps.glCopyTextureSubImage2D = load.invoke("glCopyTextureSubImage2D", IIIIIIIIV);
        caps.glCopyTextureSubImage3D = load.invoke("glCopyTextureSubImage3D", IIIIIIIIIV);
        caps.glCreateBuffers = load.trivialHandle("glCreateBuffers", IPV);
        caps.glCreateFramebuffers = load.trivialHandle("glCreateFramebuffers", IPV);
        caps.glCreateProgramPipelines = load.trivialHandle("glCreateProgramPipelines", IPV);
        caps.glCreateQueries = load.trivialHandle("glCreateQueries", IIPV);
        caps.glCreateRenderbuffers = load.trivialHandle("glCreateRenderbuffers", IPV);
        caps.glCreateSamplers = load.trivialHandle("glCreateSamplers", IPV);
        caps.glCreateTextures = load.trivialHandle("glCreateTextures", IIPV);
        caps.glCreateTransformFeedbacks = load.trivialHandle("glCreateTransformFeedbacks", IPV);
        caps.glCreateVertexArrays = load.trivialHandle("glCreateVertexArrays", IPV);
        caps.glDisableVertexArrayAttrib = load.trivialHandle("glDisableVertexArrayAttrib", IIV);
        caps.glEnableVertexArrayAttrib = load.trivialHandle("glEnableVertexArrayAttrib", IIV);
        caps.glFlushMappedNamedBufferRange = load.invoke("glFlushMappedNamedBufferRange", IJJV);
        caps.glGenerateTextureMipmap = load.invoke("glGenerateTextureMipmap", IV);
        caps.glGetCompressedTextureImage = load.invoke("glGetCompressedTextureImage", IIIPV);
        caps.glGetCompressedTextureSubImage = load.invoke("glGetCompressedTextureSubImage", IIIIIIIIIPV);
        caps.glGetGraphicsResetStatus = load.invoke("glGetGraphicsResetStatus", I);
        caps.glGetNamedBufferParameteri64v = load.trivialHandle("glGetNamedBufferParameteri64v", IIPV);
        caps.glGetNamedBufferParameteriv = load.trivialHandle("glGetNamedBufferParameteriv", IIPV);
        caps.glGetNamedBufferPointerv = load.trivialHandle("glGetNamedBufferPointerv", IIPV);
        caps.glGetNamedBufferSubData = load.invoke("glGetNamedBufferSubData", IJJPV);
        caps.glGetNamedFramebufferAttachmentParameteriv = load.trivialHandle("glGetNamedFramebufferAttachmentParameteriv", IIIPV);
        caps.glGetNamedFramebufferParameteriv = load.trivialHandle("glGetNamedFramebufferParameteriv", IIPV);
        caps.glGetNamedRenderbufferParameteriv = load.trivialHandle("glGetNamedRenderbufferParameteriv", IIPV);
        caps.glGetQueryBufferObjecti64v = load.trivialHandle("glGetQueryBufferObjecti64v", IIIJV);
        caps.glGetQueryBufferObjectiv = load.trivialHandle("glGetQueryBufferObjectiv", IIIJV);
        caps.glGetQueryBufferObjectui64v = load.trivialHandle("glGetQueryBufferObjectui64v", IIIJV);
        caps.glGetQueryBufferObjectuiv = load.trivialHandle("glGetQueryBufferObjectuiv", IIIJV);
        caps.glGetTextureImage = load.invoke("glGetTextureImage", IIIIIPV);
        caps.glGetTextureLevelParameterfv = load.trivialHandle("glGetTextureLevelParameterfv", IIIPV);
        caps.glGetTextureLevelParameteriv = load.trivialHandle("glGetTextureLevelParameteriv", IIIPV);
        caps.glGetTextureParameterIiv = load.trivialHandle("glGetTextureParameterIiv", IIPV);
        caps.glGetTextureParameterIuiv = load.trivialHandle("glGetTextureParameterIuiv", IIPV);
        caps.glGetTextureParameterfv = load.trivialHandle("glGetTextureParameterfv", IIPV);
        caps.glGetTextureParameteriv = load.trivialHandle("glGetTextureParameteriv", IIPV);
        caps.glGetTextureSubImage = load.invoke("glGetTextureSubImage", IIIIIIIIIIIPV);
        caps.glGetTransformFeedbacki64_v = load.trivialHandle("glGetTransformFeedbacki64_v", IIIPV);
        caps.glGetTransformFeedbacki_v = load.trivialHandle("glGetTransformFeedbacki_v", IIIPV);
        caps.glGetTransformFeedbackiv = load.trivialHandle("glGetTransformFeedbackiv", IIPV);
        caps.glGetVertexArrayIndexed64iv = load.trivialHandle("glGetVertexArrayIndexed64iv", IIIPV);
        caps.glGetVertexArrayIndexediv = load.trivialHandle("glGetVertexArrayIndexediv", IIIPV);
        caps.glGetVertexArrayiv = load.trivialHandle("glGetVertexArrayiv", IIPV);
        caps.glGetnCompressedTexImage = load.invoke("glGetnCompressedTexImage", IIIPV);
        caps.glGetnTexImage = load.invoke("glGetnTexImage", IIIIIPV);
        caps.glGetnUniformdv = load.invoke("glGetnUniformdv", IIIPV);
        caps.glGetnUniformfv = load.invoke("glGetnUniformfv", IIIPV);
        caps.glGetnUniformiv = load.invoke("glGetnUniformiv", IIIPV);
        caps.glGetnUniformuiv = load.invoke("glGetnUniformuiv", IIIPV);
        caps.glInvalidateNamedFramebufferData = load.invoke("glInvalidateNamedFramebufferData", IIPV);
        caps.glInvalidateNamedFramebufferSubData = load.invoke("glInvalidateNamedFramebufferSubData", IIPIIIIV);
        caps.glMapNamedBuffer = load.invoke("glMapNamedBuffer", IIP);
        caps.glMapNamedBufferRange = load.invoke("glMapNamedBufferRange", IJJIP);
        caps.glMemoryBarrierByRegion = load.invoke("glMemoryBarrierByRegion", IV);
        caps.glNamedBufferData = load.invoke("glNamedBufferData", IJPIV);
        caps.glNamedBufferStorage = load.invoke("glNamedBufferStorage", IJPIV);
        caps.glNamedBufferSubData = load.invoke("glNamedBufferSubData", IJJPV);
        caps.glNamedFramebufferDrawBuffer = load.invoke("glNamedFramebufferDrawBuffer", II);
        caps.glNamedFramebufferDrawBuffers = load.invoke("glNamedFramebufferDrawBuffers", IIPV);
        caps.glNamedFramebufferParameteri = load.invoke("glNamedFramebufferParameteri", IIIV);
        caps.glNamedFramebufferReadBuffer = load.invoke("glNamedFramebufferReadBuffer", IIV);
        caps.glNamedFramebufferRenderbuffer = load.invoke("glNamedFramebufferRenderbuffer", IIIIV);
        caps.glNamedFramebufferTexture = load.invoke("glNamedFramebufferTexture", IIIIV);
        caps.glNamedFramebufferTextureLayer = load.invoke("glNamedFramebufferTextureLayer", IIIIIV);
        caps.glNamedRenderbufferStorage = load.invoke("glNamedRenderbufferStorage", IIIIV);
        caps.glNamedRenderbufferStorageMultisample = load.invoke("glNamedRenderbufferStorageMultisample", IIIIIV);
        caps.glReadnPixels = load.invoke("glReadnPixels", IIIIIIIPV);
        caps.glTextureBarrier = load.invoke("glTextureBarrier", V);
        caps.glTextureBuffer = load.invoke("glTextureBuffer", IIIV);
        caps.glTextureBufferRange = load.invoke("glTextureBufferRange", IIIJJV);
        caps.glTextureParameterIiv = load.trivialHandle("glTextureParameterIiv", IIPV);
        caps.glTextureParameterIuiv = load.trivialHandle("glTextureParameterIuiv", IIPV);
        caps.glTextureParameterf = load.trivialHandle("glTextureParameterf", IIFV);
        caps.glTextureParameterfv = load.trivialHandle("glTextureParameterfv", IIPV);
        caps.glTextureParameteri = load.trivialHandle("glTextureParameteri", IIIV);
        caps.glTextureParameteriv = load.trivialHandle("glTextureParameteriv", IIPV);
        caps.glTextureStorage1D = load.invoke("glTextureStorage1D", IIIIV);
        caps.glTextureStorage2D = load.invoke("glTextureStorage2D", IIIIIV);
        caps.glTextureStorage2DMultisample = load.invoke("glTextureStorage2DMultisample", IIIIIZV);
        caps.glTextureStorage3D = load.invoke("glTextureStorage3D", IIIIIIV);
        caps.glTextureStorage3DMultisample = load.invoke("glTextureStorage3DMultisample", IIIIIIZV);
        caps.glTextureSubImage1D = load.invoke("glTextureSubImage1D", IIIIIIPV);
        caps.glTextureSubImage2D = load.invoke("glTextureSubImage2D", IIIIIIIIPV);
        caps.glTextureSubImage3D = load.invoke("glTextureSubImage3D", IIIIIIIIIIPV);
        caps.glTransformFeedbackBufferBase = load.invoke("glTransformFeedbackBufferBase", IIIV);
        caps.glTransformFeedbackBufferRange = load.invoke("glTransformFeedbackBufferRange", IIIJJV);
        caps.glUnmapNamedBuffer = load.invoke("glUnmapNamedBuffer", IZ);
        caps.glVertexArrayAttribBinding = load.invoke("glVertexArrayAttribBinding", IIIV);
        caps.glVertexArrayAttribFormat = load.invoke("glVertexArrayAttribFormat", IIIIZIV);
        caps.glVertexArrayAttribIFormat = load.invoke("glVertexArrayAttribIFormat", IIIIIV);
        caps.glVertexArrayAttribLFormat = load.invoke("glVertexArrayAttribLFormat", IIIIIV);
        caps.glVertexArrayBindingDivisor = load.invoke("glVertexArrayBindingDivisor", IIIV);
        caps.glVertexArrayElementBuffer = load.invoke("glVertexArrayElementBuffer", IIV);
        caps.glVertexArrayVertexBuffer = load.invoke("glVertexArrayVertexBuffer", IIIJIV);
        caps.glVertexArrayVertexBuffers = load.invoke("glVertexArrayVertexBuffers", IIIPPPV);
    }

    public static void bindTextureUnit(int unit, int texture) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glBindTextureUnit).invokeExact(unit, texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glBlitNamedFramebuffer).invokeExact(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int checkNamedFramebufferStatus(int framebuffer, int target) {
        var caps = GLLoader.getCapabilities();
        try {
            return (int) GLLoader.check(caps.glCheckNamedFramebufferStatus).invokeExact(framebuffer, target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedBufferData(int buffer, int internalFormat, int format, int type, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClearNamedBufferData).invokeExact(buffer, internalFormat, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedBufferSubData(int buffer, int internalFormat, long offset, long size, int format, int type, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClearNamedBufferSubData).invokeExact(buffer, internalFormat, offset, size, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferfi(int framebuffer, int buffer, int drawBuffer, float depth, int stencil) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClearNamedFramebufferfi).invokeExact(framebuffer, buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferfv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClearNamedFramebufferfv).invokeExact(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferfv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, float[] value) {
        clearNamedFramebufferfv(framebuffer, buffer, drawBuffer, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void clearNamedFramebufferiv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClearNamedFramebufferiv).invokeExact(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        clearNamedFramebufferiv(framebuffer, buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void clearNamedFramebufferuiv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClearNamedFramebufferuiv).invokeExact(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferuiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        clearNamedFramebufferuiv(framebuffer, buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void clipControl(int origin, int depth) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glClipControl).invokeExact(origin, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCompressedTextureSubImage1D).invokeExact(texture, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCompressedTextureSubImage2D).invokeExact(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCompressedTextureSubImage3D).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCopyNamedBufferSubData).invokeExact(readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCopyTextureSubImage1D).invokeExact(texture, level, xoffset, x, y, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCopyTextureSubImage2D).invokeExact(texture, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCopyTextureSubImage3D).invokeExact(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createBuffers(int n, MemorySegment buffers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateBuffers).invokeExact(n, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createBuffers(SegmentAllocator allocator, int[] buffers) {
        var seg = allocator.allocateArray(JAVA_INT, buffers.length);
        createBuffers(buffers.length, seg);
        RuntimeHelper.toArray(seg, buffers);
    }

    public static int createBuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createBuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createFramebuffers(int n, MemorySegment framebuffers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createFramebuffers(SegmentAllocator allocator, int[] framebuffers) {
        var seg = allocator.allocateArray(JAVA_INT, framebuffers.length);
        createFramebuffers(framebuffers.length, seg);
        RuntimeHelper.toArray(seg, framebuffers);
    }

    public static int createFramebuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createProgramPipelines(int n, MemorySegment pipelines) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateProgramPipelines).invokeExact(n, pipelines);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createProgramPipelines(SegmentAllocator allocator, int[] pipelines) {
        var seg = allocator.allocateArray(JAVA_INT, pipelines.length);
        createProgramPipelines(pipelines.length, seg);
        RuntimeHelper.toArray(seg, pipelines);
    }

    public static int createProgramPipeline() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createQueries(int target, int n, MemorySegment ids) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateQueries).invokeExact(target, n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createQueries(SegmentAllocator allocator, int target, int[] ids) {
        var seg = allocator.allocateArray(JAVA_INT, ids.length);
        createQueries(target, ids.length, seg);
        RuntimeHelper.toArray(seg, ids);
    }

    public static int createQuery(int target) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createQueries(target, 1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createRenderbuffers(int n, MemorySegment renderbuffers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createRenderbuffers(SegmentAllocator allocator, int[] renderbuffers) {
        var seg = allocator.allocateArray(JAVA_INT, renderbuffers.length);
        createRenderbuffers(renderbuffers.length, seg);
        RuntimeHelper.toArray(seg, renderbuffers);
    }

    public static int createRenderbuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createSamplers(int n, MemorySegment samplers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateSamplers).invokeExact(n, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createSamplers(SegmentAllocator allocator, int[] samplers) {
        var seg = allocator.allocateArray(JAVA_INT, samplers.length);
        createSamplers(samplers.length, seg);
        RuntimeHelper.toArray(seg, samplers);
    }

    public static int createSampler() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createSamplers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createTextures(int target, int n, MemorySegment textures) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateTextures).invokeExact(target, n, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createTextures(SegmentAllocator allocator, int target, int[] textures) {
        final int n = textures.length;
        var pTex = allocator.allocateArray(JAVA_INT, n);
        createTextures(target, n, pTex);
        RuntimeHelper.toArray(pTex, textures);
    }

    public static int createTexture(int target) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pTex = stack.callocInt();
            createTextures(target, 1, pTex);
            return pTex.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createTransformFeedbacks(int n, MemorySegment ids) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateTransformFeedbacks).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createTransformFeedbacks(SegmentAllocator allocator, int[] ids) {
        var seg = allocator.allocateArray(JAVA_INT, ids.length);
        createTransformFeedbacks(ids.length, seg);
        RuntimeHelper.toArray(seg, ids);
    }

    public static int createTransformFeedback() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createVertexArrays(int n, MemorySegment arrays) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCreateVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createVertexArrays(SegmentAllocator allocator, int[] arrays) {
        var seg = allocator.allocateArray(JAVA_INT, arrays.length);
        createVertexArrays(arrays.length, seg);
        RuntimeHelper.toArray(seg, arrays);
    }

    public static int createVertexArray() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            createVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void disableVertexArrayAttrib(int vaobj, int index) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDisableVertexArrayAttrib).invokeExact(vaobj, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enableVertexArrayAttrib(int vaobj, int index) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glEnableVertexArrayAttrib).invokeExact(vaobj, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flushMappedNamedBufferRange(int buffer, long offset, long length) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glFlushMappedNamedBufferRange).invokeExact(buffer, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void generateTextureMipmap(int texture) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGenerateTextureMipmap).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getCompressedTextureImage(int texture, int level, int bufSize, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetCompressedTextureImage).invokeExact(texture, level, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetCompressedTextureSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getGraphicsResetStatus() {
        var caps = GLLoader.getCapabilities();
        try {
            return (int) GLLoader.check(caps.glGetGraphicsResetStatus).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getNamedBufferParameteri64v(int buffer, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedBufferParameteri64v).invokeExact(buffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getNamedBufferParameteri64(int buffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocLong();
            getNamedBufferParameteri64v(buffer, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedBufferParameteriv(int buffer, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedBufferParameteriv).invokeExact(buffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getNamedBufferParameteri(int buffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getNamedBufferParameteriv(buffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedBufferPointerv(int target, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedBufferPointerv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment getNamedBufferPointer(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocPointer();
            getNamedBufferPointerv(target, pname, seg);
            return seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedBufferSubData).invokeExact(buffer, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, byte[] data) {
        var seg = allocator.allocateArray(JAVA_BYTE, data.length);
        getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length), seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, short[] data) {
        var seg = allocator.allocateArray(JAVA_SHORT, data.length);
        getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 1, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, int[] data) {
        var seg = allocator.allocateArray(JAVA_INT, data.length);
        getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, long[] data) {
        var seg = allocator.allocateArray(JAVA_LONG, data.length);
        getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, float[] data) {
        var seg = allocator.allocateArray(JAVA_FLOAT, data.length);
        getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, double[] data) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, data.length);
        getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedFramebufferAttachmentParameteriv).invokeExact(framebuffer, attachment, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedFramebufferParameteriv(int framebuffer, int pname, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedFramebufferParameteriv).invokeExact(framebuffer, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getNamedFramebufferParameteri(int framebuffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getNamedFramebufferParameteriv(framebuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedRenderbufferParameteriv(int renderbuffer, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetNamedRenderbufferParameteriv).invokeExact(renderbuffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getNamedRenderbufferParameteriv(renderbuffer, pname, seg);
            params[0] = seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getNamedRenderbufferParameteri(int renderbuffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getNamedRenderbufferParameteriv(renderbuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryBufferObjecti64v).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryBufferObjectiv).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryBufferObjectui64v).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryBufferObjectuiv).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureImage(int texture, int level, int format, int type, int bufSize, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureImage).invokeExact(texture, level, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureLevelParameterfv(int texture, int level, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureLevelParameterfv).invokeExact(texture, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureLevelParameterfv(SegmentAllocator allocator, int texture, int level, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTextureLevelParameterfv(texture, level, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTextureLevelParameterf(int texture, int level, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.callocFloat();
            getTextureLevelParameterfv(texture, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureLevelParameteriv(int texture, int level, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureLevelParameteriv).invokeExact(texture, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureLevelParameteriv(SegmentAllocator allocator, int texture, int level, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTextureLevelParameteriv(texture, level, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTextureLevelParameteri(int texture, int level, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.callocInt();
            getTextureLevelParameteriv(texture, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameterIiv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureParameterIiv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureParameterIiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getTextureParameterIiv(texture, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getTextureParameterIi(int texture, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getTextureParameterIiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameterIuiv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureParameterIuiv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureParameterIuiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getTextureParameterIuiv(texture, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getTextureParameterIui(int texture, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getTextureParameterIuiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameterfv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureParameterfv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureParameterfv(SegmentAllocator allocator, int texture, int pname, float[] params) {
        var pParams = allocator.allocateArray(JAVA_FLOAT, params.length);
        getTextureParameterfv(texture, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static float getTextureParameterf(int texture, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.callocFloat();
            getTextureParameterfv(texture, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameteriv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureParameteriv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureParameteriv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        var pParams = allocator.allocateArray(JAVA_INT, params.length);
        getTextureParameteriv(texture, pname, pParams);
        RuntimeHelper.toArray(pParams, params);
    }

    public static int getTextureParameteri(int texture, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pParams = stack.callocInt();
            getTextureParameteriv(texture, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTextureSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        var seg = allocator.allocateArray(JAVA_BYTE, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        var seg = allocator.allocateArray(JAVA_SHORT, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        var seg = allocator.allocateArray(JAVA_INT, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        var seg = allocator.allocateArray(JAVA_FLOAT, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTransformFeedbacki64_v(int xfb, int pname, int index, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTransformFeedbacki64_v).invokeExact(xfb, pname, index, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbacki64_v(SegmentAllocator allocator, int xfb, int pname, int index, long[] param) {
        var seg = allocator.allocateArray(JAVA_LONG, param.length);
        getTransformFeedbacki64_v(xfb, pname, index, seg);
        RuntimeHelper.toArray(seg, param);
    }

    public static void getTransformFeedbacki_v(int xfb, int pname, int index, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTransformFeedbacki_v).invokeExact(xfb, pname, index, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbacki_v(SegmentAllocator allocator, int xfb, int pname, int index, int[] param) {
        var seg = allocator.allocateArray(JAVA_INT, param.length);
        getTransformFeedbacki_v(xfb, pname, index, seg);
        RuntimeHelper.toArray(seg, param);
    }

    public static void getTransformFeedbackiv(int xfb, int pname, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetTransformFeedbackiv).invokeExact(xfb, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbackiv(SegmentAllocator allocator, int xfb, int pname, int[] param) {
        var seg = allocator.allocateArray(JAVA_INT, param.length);
        getTransformFeedbackiv(xfb, pname, seg);
        RuntimeHelper.toArray(seg, param);
    }

    public static void getVertexArrayIndexed64iv(int vaobj, int index, int pname, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetVertexArrayIndexed64iv).invokeExact(vaobj, index, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getVertexArrayIndexed64i(int vaobj, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocLong();
            getVertexArrayIndexed64iv(vaobj, index, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexArrayIndexediv(int vaobj, int index, int pname, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetVertexArrayIndexediv).invokeExact(vaobj, index, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getVertexArrayIndexedi(int vaobj, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getVertexArrayIndexediv(vaobj, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexArrayiv(int vaobj, int pname, MemorySegment param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetVertexArrayiv).invokeExact(vaobj, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getVertexArrayi(int vaobj, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getVertexArrayiv(vaobj, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getnCompressedTexImage(int target, int lod, int bufSize, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetnCompressedTexImage).invokeExact(target, lod, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnCompressedTexImage(int target, int lod, MemorySegment pixels) {
        getnCompressedTexImage(target, lod, (int) pixels.byteSize(), pixels);
    }

    public static void getnTexImage(int target, int level, int format, int type, int bufSize, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetnTexImage).invokeExact(target, level, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnTexImage(int target, int level, int format, int type, MemorySegment pixels) {
        getnTexImage(target, level, format, type, (int) pixels.byteSize(), pixels);
    }

    public static void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, byte[] pixels) {
        var seg = allocator.allocateArray(JAVA_BYTE, pixels.length);
        getnTexImage(target, level, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, short[] pixels) {
        var seg = allocator.allocateArray(JAVA_SHORT, pixels.length);
        getnTexImage(target, level, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, int[] pixels) {
        var seg = allocator.allocateArray(JAVA_INT, pixels.length);
        getnTexImage(target, level, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, float[] pixels) {
        var seg = allocator.allocateArray(JAVA_FLOAT, pixels.length);
        getnTexImage(target, level, format, type, pixels.length, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getnUniformdv(int program, int location, int bufSize, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetnUniformdv).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnUniformdv(int program, int location, MemorySegment params) {
        getnUniformdv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformdv(SegmentAllocator allocator, int program, int location, double[] params) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, params.length);
        getnUniformdv(program, location, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getnUniformfv(int program, int location, int bufSize, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetnUniformfv).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnUniformfv(int program, int location, MemorySegment params) {
        getnUniformfv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformfv(SegmentAllocator allocator, int program, int location, float[] params) {
        var seg = allocator.allocateArray(JAVA_FLOAT, params.length);
        getnUniformfv(program, location, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getnUniformiv(int program, int location, int bufSize, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetnUniformiv).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnUniformiv(int program, int location, MemorySegment params) {
        getnUniformiv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformiv(SegmentAllocator allocator, int program, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getnUniformiv(program, location, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getnUniformuiv(int program, int location, int bufSize, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetnUniformuiv).invokeExact(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnUniformuiv(int program, int location, MemorySegment params) {
        getnUniformuiv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformuiv(SegmentAllocator allocator, int program, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getnUniformuiv(program, location, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void invalidateNamedFramebufferData(int framebuffer, int numAttachments, MemorySegment attachments) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glInvalidateNamedFramebufferData).invokeExact(framebuffer, numAttachments, attachments);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateNamedFramebufferData(SegmentAllocator allocator, int framebuffer, int[] attachments) {
        invalidateNamedFramebufferData(framebuffer, attachments.length, allocator.allocateArray(JAVA_INT, attachments));
    }

    public static void invalidateNamedFramebufferData(int framebuffer, int attachment) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            invalidateNamedFramebufferData(framebuffer, 1, stack.ints(attachment));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateNamedFramebufferSubData(int framebuffer, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glInvalidateNamedFramebufferSubData).invokeExact(framebuffer, numAttachments, attachments, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateNamedFramebufferSubData(SegmentAllocator allocator, int framebuffer, int[] attachments, int x, int y, int width, int height) {
        invalidateNamedFramebufferSubData(framebuffer, attachments.length, allocator.allocateArray(JAVA_INT, attachments), x, y, width, height);
    }

    public static void invalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            invalidateNamedFramebufferSubData(framebuffer, 1, stack.ints(attachment), x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment mapNamedBuffer(int buffer, int access) {
        var caps = GLLoader.getCapabilities();
        try {
            final var seg = (MemorySegment) GLLoader.check(caps.glMapNamedBuffer).invokeExact(buffer, access);
            return access == READ_ONLY ? seg.asReadOnly() : seg;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment mapNamedBufferRange(int buffer, long offset, long length, int access) {
        var caps = GLLoader.getCapabilities();
        try {
            return ((MemorySegment) GLLoader.check(caps.glMapNamedBufferRange).invokeExact(buffer, offset, length, access)).reinterpret(length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void memoryBarrierByRegion(int barriers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glMemoryBarrierByRegion).invokeExact(barriers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferData(int buffer, long size, MemorySegment data, int usage) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedBufferData).invokeExact(buffer, size, data, usage);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferData(int buffer, MemorySegment data, int usage) {
        namedBufferData(buffer, data.byteSize(), data, usage);
    }

    public static void namedBufferData(int buffer, long size, int usage) {
        namedBufferData(buffer, size, MemorySegment.NULL, usage);
    }

    public static void namedBufferData(SegmentAllocator allocator, int buffer, byte[] data, int usage) {
        namedBufferData(buffer, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data), usage);
    }

    public static void namedBufferData(SegmentAllocator allocator, int buffer, short[] data, int usage) {
        namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data), usage);
    }

    public static void namedBufferData(SegmentAllocator allocator, int buffer, int[] data, int usage) {
        namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data), usage);
    }

    public static void namedBufferData(SegmentAllocator allocator, int buffer, long[] data, int usage) {
        namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data), usage);
    }

    public static void namedBufferData(SegmentAllocator allocator, int buffer, float[] data, int usage) {
        namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data), usage);
    }

    public static void namedBufferData(SegmentAllocator allocator, int buffer, double[] data, int usage) {
        namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data), usage);
    }

    public static void namedBufferStorage(int buffer, long size, MemorySegment data, int flags) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedBufferStorage).invokeExact(buffer, size, data, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferStorage(int buffer, long size, int flags) {
        namedBufferStorage(buffer, size, MemorySegment.NULL, flags);
    }

    public static void namedBufferStorage(SegmentAllocator allocator, int buffer, byte[] data, int flags) {
        namedBufferStorage(buffer, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data), flags);
    }

    public static void namedBufferStorage(SegmentAllocator allocator, int buffer, short[] data, int flags) {
        namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data), flags);
    }

    public static void namedBufferStorage(SegmentAllocator allocator, int buffer, int[] data, int flags) {
        namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data), flags);
    }

    public static void namedBufferStorage(SegmentAllocator allocator, int buffer, long[] data, int flags) {
        namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data), flags);
    }

    public static void namedBufferStorage(SegmentAllocator allocator, int buffer, float[] data, int flags) {
        namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data), flags);
    }

    public static void namedBufferStorage(SegmentAllocator allocator, int buffer, double[] data, int flags) {
        namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data), flags);
    }

    public static void namedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedBufferSubData).invokeExact(buffer, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferSubData(int buffer, long offset, MemorySegment data) {
        namedBufferSubData(buffer, offset, data.byteSize(), data);
    }

    public static void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, byte[] data) {
        namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data));
    }

    public static void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, short[] data) {
        namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data));
    }

    public static void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, int[] data) {
        namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data));
    }

    public static void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, long[] data) {
        namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data));
    }

    public static void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, float[] data) {
        namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data));
    }

    public static void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, double[] data) {
        namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data));
    }

    public static void namedFramebufferDrawBuffer(int framebuffer, int buf) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferDrawBuffer).invokeExact(framebuffer, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferDrawBuffers(int framebuffer, int n, MemorySegment bufs) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferDrawBuffers).invokeExact(framebuffer, n, bufs);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferDrawBuffers(SegmentAllocator allocator, int framebuffer, int[] bufs) {
        namedFramebufferDrawBuffers(framebuffer, bufs.length, allocator.allocateArray(JAVA_INT, bufs));
    }

    public static void namedFramebufferParameteri(int framebuffer, int pname, int param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferParameteri).invokeExact(framebuffer, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferReadBuffer(int framebuffer, int src) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferReadBuffer).invokeExact(framebuffer, src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbufferTarget, int renderbuffer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferRenderbuffer).invokeExact(framebuffer, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferTexture).invokeExact(framebuffer, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedFramebufferTextureLayer).invokeExact(framebuffer, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedRenderbufferStorage(int renderbuffer, int internalFormat, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedRenderbufferStorage).invokeExact(renderbuffer, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalFormat, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glNamedRenderbufferStorageMultisample).invokeExact(renderbuffer, samples, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glReadnPixels).invokeExact(x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, MemorySegment data) {
        readnPixels(x, y, width, height, format, type, (int) data.byteSize(), data);
    }

    public static void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, byte[] data) {
        var seg = allocator.allocateArray(JAVA_BYTE, data.length);
        readnPixels(x, y, width, height, format, type, data.length, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, short[] data) {
        var seg = allocator.allocateArray(JAVA_SHORT, data.length);
        readnPixels(x, y, width, height, format, type, data.length, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, int[] data) {
        var seg = allocator.allocateArray(JAVA_INT, data.length);
        readnPixels(x, y, width, height, format, type, data.length, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, float[] data) {
        var seg = allocator.allocateArray(JAVA_FLOAT, data.length);
        readnPixels(x, y, width, height, format, type, data.length, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void textureBarrier() {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureBarrier).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureBuffer(int texture, int internalFormat, int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureBuffer).invokeExact(texture, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureBufferRange(int texture, int internalFormat, int buffer, long offset, long size) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureBufferRange).invokeExact(texture, internalFormat, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterIiv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureParameterIiv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterIiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameterIiv(texture, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void textureParameterIuiv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureParameterIuiv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterIuiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameterIuiv(texture, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void textureParameterf(int texture, int pname, float param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureParameterf).invokeExact(texture, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterfv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureParameterfv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void textureParameterfv(SegmentAllocator allocator, int texture, int pname, float[] params) {
        textureParameterfv(texture, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void textureParameteri(int texture, int pname, int param) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureParameteri).invokeExact(texture, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameteriv(int texture, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureParameteriv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameteriv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameteriv(texture, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void textureStorage1D(int texture, int levels, int internalFormat, int width) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureStorage1D).invokeExact(texture, levels, internalFormat, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage2D(int texture, int levels, int internalFormat, int width, int height) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureStorage2D).invokeExact(texture, levels, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage2DMultisample(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureStorage2DMultisample).invokeExact(texture, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage3D(int texture, int levels, int internalFormat, int width, int height, int depth) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureStorage3D).invokeExact(texture, levels, internalFormat, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage3DMultisample(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureStorage3DMultisample).invokeExact(texture, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureSubImage1D).invokeExact(texture, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        textureSubImage1D(texture, level, xoffset, width, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
        textureSubImage1D(texture, level, xoffset, width, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
        textureSubImage1D(texture, level, xoffset, width, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
        textureSubImage1D(texture, level, xoffset, width, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureSubImage2D).invokeExact(texture, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTextureSubImage3D).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_BYTE, pixels));
    }

    public static void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_SHORT, pixels));
    }

    public static void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_INT, pixels));
    }

    public static void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, allocator.allocateArray(JAVA_FLOAT, pixels));
    }

    public static void transformFeedbackBufferBase(int xfb, int index, int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTransformFeedbackBufferBase).invokeExact(xfb, index, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void transformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTransformFeedbackBufferRange).invokeExact(xfb, index, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean unmapNamedBuffer(int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            return (boolean) GLLoader.check(caps.glUnmapNamedBuffer).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribBinding(int vaobj, int attribIndex, int bindingIndex) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayAttribBinding).invokeExact(vaobj, attribIndex, bindingIndex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribFormat(int vaobj, int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayAttribFormat).invokeExact(vaobj, attribIndex, size, type, normalized, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribIFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayAttribIFormat).invokeExact(vaobj, attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribLFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayAttribLFormat).invokeExact(vaobj, attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayBindingDivisor(int vaobj, int bindingIndex, int divisor) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayBindingDivisor).invokeExact(vaobj, bindingIndex, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayElementBuffer(int vaobj, int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayElementBuffer).invokeExact(vaobj, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayVertexBuffer(int vaobj, int bindingIndex, int buffer, long offset, int stride) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayVertexBuffer).invokeExact(vaobj, bindingIndex, buffer, offset, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayVertexBuffers(int vaobj, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glVertexArrayVertexBuffers).invokeExact(vaobj, first, count, buffers, offsets, strides);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayVertexBuffers(SegmentAllocator allocator, int vaobj, int first, int count, int[] buffers, long[] offsets, int[] strides) {
        vertexArrayVertexBuffers(vaobj, first, count, allocator.allocateArray(JAVA_INT, buffers), allocator.allocateArray(JAVA_LONG, offsets), allocator.allocateArray(JAVA_INT, strides));
    }
}
