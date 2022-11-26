/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.BufferBuilder;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;

/**
 * The OpenGL 4.5 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL45C extends GL44C permits GL46C {
    @Nullable
    public static MethodHandle
        glBindTextureUnit, glBlitNamedFramebuffer, glCheckNamedFramebufferStatus, glClearNamedBufferData,
        glClearNamedBufferSubData, glClearNamedFramebufferfi, glClearNamedFramebufferfv, glClearNamedFramebufferiv,
        glClearNamedFramebufferuiv, glClipControl, glCompressedTextureSubImage1D, glCompressedTextureSubImage2D,
        glCompressedTextureSubImage3D, glCopyNamedBufferSubData, glCopyTextureSubImage1D, glCopyTextureSubImage2D,
        glCopyTextureSubImage3D, glCreateBuffers, glCreateFramebuffers, glCreateProgramPipelines, glCreateQueries,
        glCreateRenderbuffers, glCreateSamplers, glCreateTextures, glCreateTransformFeedbacks, glCreateVertexArrays,
        glDisableVertexArrayAttrib, glEnableVertexArrayAttrib, glFlushMappedNamedBufferRange, glGenerateTextureMipmap,
        glGetCompressedTextureImage, glGetCompressedTextureSubImage, glGetGraphicsResetStatus,
        glGetNamedBufferParameteri64v, glGetNamedBufferParameteriv, glGetNamedBufferPointerv, glGetNamedBufferSubData,
        glGetNamedFramebufferAttachmentParameteriv, glGetNamedFramebufferParameteriv, glGetNamedRenderbufferParameteriv,
        glGetQueryBufferObjecti64v, glGetQueryBufferObjectiv, glGetQueryBufferObjectui64v, glGetQueryBufferObjectuiv,
        glGetTextureImage, glGetTextureLevelParameterfv, glGetTextureLevelParameteriv, glGetTextureParameterIiv,
        glGetTextureParameterIuiv, glGetTextureParameterfv, glGetTextureParameteriv, glGetTextureSubImage,
        glGetTransformFeedbacki64_v, glGetTransformFeedbacki_v, glGetTransformFeedbackiv, glGetVertexArrayIndexed64iv,
        glGetVertexArrayIndexediv, glGetVertexArrayiv, glGetnCompressedTexImage, glGetnTexImage, glGetnUniformdv,
        glGetnUniformfv, glGetnUniformiv, glGetnUniformuiv, glInvalidateNamedFramebufferData,
        glInvalidateNamedFramebufferSubData, glMapNamedBuffer, glMapNamedBufferRange, glMemoryBarrierByRegion,
        glNamedBufferData, glNamedBufferStorage, glNamedBufferSubData, glNamedFramebufferDrawBuffer,
        glNamedFramebufferDrawBuffers, glNamedFramebufferParameteri, glNamedFramebufferReadBuffer,
        glNamedFramebufferRenderbuffer, glNamedFramebufferTexture, glNamedFramebufferTextureLayer,
        glNamedRenderbufferStorage, glNamedRenderbufferStorageMultisample, glReadnPixels, glTextureBarrier,
        glTextureBuffer, glTextureBufferRange, glTextureParameterIiv, glTextureParameterIuiv, glTextureParameterf,
        glTextureParameterfv, glTextureParameteri, glTextureParameteriv, glTextureStorage1D, glTextureStorage2D,
        glTextureStorage2DMultisample, glTextureStorage3D, glTextureStorage3DMultisample, glTextureSubImage1D,
        glTextureSubImage2D, glTextureSubImage3D, glTransformFeedbackBufferBase, glTransformFeedbackBufferRange,
        glUnmapNamedBuffer, glVertexArrayAttribBinding, glVertexArrayAttribFormat, glVertexArrayAttribIFormat,
        glVertexArrayAttribLFormat, glVertexArrayBindingDivisor, glVertexArrayElementBuffer, glVertexArrayVertexBuffer,
        glVertexArrayVertexBuffers;

    static boolean isSupported() {
        return GLLoader.checkAll(glBindTextureUnit, glBlitNamedFramebuffer, glCheckNamedFramebufferStatus,
            glClearNamedBufferData, glClearNamedBufferSubData, glClearNamedFramebufferfi, glClearNamedFramebufferfv,
            glClearNamedFramebufferiv, glClearNamedFramebufferuiv, glClipControl, glCompressedTextureSubImage1D,
            glCompressedTextureSubImage2D, glCompressedTextureSubImage3D, glCopyNamedBufferSubData,
            glCopyTextureSubImage1D, glCopyTextureSubImage2D, glCopyTextureSubImage3D, glCreateBuffers,
            glCreateFramebuffers, glCreateProgramPipelines, glCreateQueries, glCreateRenderbuffers, glCreateSamplers,
            glCreateTextures, glCreateTransformFeedbacks, glCreateVertexArrays, glDisableVertexArrayAttrib,
            glEnableVertexArrayAttrib, glFlushMappedNamedBufferRange, glGenerateTextureMipmap,
            glGetCompressedTextureImage, glGetCompressedTextureSubImage, glGetGraphicsResetStatus,
            glGetNamedBufferParameteri64v, glGetNamedBufferParameteriv, glGetNamedBufferPointerv,
            glGetNamedBufferSubData, glGetNamedFramebufferAttachmentParameteriv, glGetNamedFramebufferParameteriv,
            glGetNamedRenderbufferParameteriv, glGetQueryBufferObjecti64v, glGetQueryBufferObjectiv,
            glGetQueryBufferObjectui64v, glGetQueryBufferObjectuiv, glGetTextureImage, glGetTextureLevelParameterfv,
            glGetTextureLevelParameteriv, glGetTextureParameterIiv, glGetTextureParameterIuiv, glGetTextureParameterfv,
            glGetTextureParameteriv, glGetTextureSubImage, glGetTransformFeedbacki64_v, glGetTransformFeedbacki_v,
            glGetTransformFeedbackiv, glGetVertexArrayIndexed64iv, glGetVertexArrayIndexediv, glGetVertexArrayiv,
            glGetnCompressedTexImage, glGetnTexImage, glGetnUniformdv, glGetnUniformfv, glGetnUniformiv,
            glGetnUniformuiv, glInvalidateNamedFramebufferData, glInvalidateNamedFramebufferSubData, glMapNamedBuffer,
            glMapNamedBufferRange, glMemoryBarrierByRegion, glNamedBufferData, glNamedBufferStorage,
            glNamedBufferSubData, glNamedFramebufferDrawBuffer, glNamedFramebufferDrawBuffers,
            glNamedFramebufferParameteri, glNamedFramebufferReadBuffer, glNamedFramebufferRenderbuffer,
            glNamedFramebufferTexture, glNamedFramebufferTextureLayer, glNamedRenderbufferStorage,
            glNamedRenderbufferStorageMultisample, glReadnPixels, glTextureBarrier, glTextureBuffer,
            glTextureBufferRange, glTextureParameterIiv, glTextureParameterIuiv, glTextureParameterf,
            glTextureParameterfv, glTextureParameteri, glTextureParameteriv, glTextureStorage1D, glTextureStorage2D,
            glTextureStorage2DMultisample, glTextureStorage3D, glTextureStorage3DMultisample, glTextureSubImage1D,
            glTextureSubImage2D, glTextureSubImage3D, glTransformFeedbackBufferBase, glTransformFeedbackBufferRange,
            glUnmapNamedBuffer, glVertexArrayAttribBinding, glVertexArrayAttribFormat, glVertexArrayAttribIFormat,
            glVertexArrayAttribLFormat, glVertexArrayBindingDivisor, glVertexArrayElementBuffer,
            glVertexArrayVertexBuffer, glVertexArrayVertexBuffers);
    }

    static void load(GLLoadFunc load) {
        glBindTextureUnit = load.invoke("glBindTextureUnit", IIV);
        glBlitNamedFramebuffer = load.invoke("glBlitNamedFramebuffer", IIIIIIIIIIIIV);
        glCheckNamedFramebufferStatus = load.invoke("glCheckNamedFramebufferStatus", III);
        glClearNamedBufferData = load.invoke("glClearNamedBufferData", IIIIPV);
        glClearNamedBufferSubData = load.invoke("glClearNamedBufferSubData", IIJJIIPV);
        glClearNamedFramebufferfi = load.invoke("glClearNamedFramebufferfi", IIIFIV);
        glClearNamedFramebufferfv = load.invoke("glClearNamedFramebufferfv", IIIPV);
        glClearNamedFramebufferiv = load.invoke("glClearNamedFramebufferiv", IIIPV);
        glClearNamedFramebufferuiv = load.invoke("glClearNamedFramebufferuiv", IIIPV);
        glClipControl = load.invoke("glClipControl", IIV);
        glCompressedTextureSubImage1D = load.invoke("glCompressedTextureSubImage1D", IIIIIIPV);
        glCompressedTextureSubImage2D = load.invoke("glCompressedTextureSubImage2D", IIIIIIIIPV);
        glCompressedTextureSubImage3D = load.invoke("glCompressedTextureSubImage3D", IIIIIIIIIIPV);
        glCopyNamedBufferSubData = load.invoke("glCopyNamedBufferSubData", IIJJJV);
        glCopyTextureSubImage1D = load.invoke("glCopyTextureSubImage1D", IIIIIIV);
        glCopyTextureSubImage2D = load.invoke("glCopyTextureSubImage2D", IIIIIIIIV);
        glCopyTextureSubImage3D = load.invoke("glCopyTextureSubImage3D", IIIIIIIIIV);
        glCreateBuffers = load.invoke("glCreateBuffers", IPV);
        glCreateFramebuffers = load.invoke("glCreateFramebuffers", IPV);
        glCreateProgramPipelines = load.invoke("glCreateProgramPipelines", IPV);
        glCreateQueries = load.invoke("glCreateQueries", IIPV);
        glCreateRenderbuffers = load.invoke("glCreateRenderbuffers", IPV);
        glCreateSamplers = load.invoke("glCreateSamplers", IPV);
        glCreateTextures = load.invoke("glCreateTextures", IIPV);
        glCreateTransformFeedbacks = load.invoke("glCreateTransformFeedbacks", IPV);
        glCreateVertexArrays = load.invoke("glCreateVertexArrays", IPV);
        glDisableVertexArrayAttrib = load.invoke("glDisableVertexArrayAttrib", IIV);
        glEnableVertexArrayAttrib = load.invoke("glEnableVertexArrayAttrib", IIV);
        glFlushMappedNamedBufferRange = load.invoke("glFlushMappedNamedBufferRange", IJJV);
        glGenerateTextureMipmap = load.invoke("glGenerateTextureMipmap", IV);
        glGetCompressedTextureImage = load.invoke("glGetCompressedTextureImage", IIIPV);
        glGetCompressedTextureSubImage = load.invoke("glGetCompressedTextureSubImage", IIIIIIIIIPV);
        glGetGraphicsResetStatus = load.invoke("glGetGraphicsResetStatus", I);
        glGetNamedBufferParameteri64v = load.invoke("glGetNamedBufferParameteri64v", IIPV);
        glGetNamedBufferParameteriv = load.invoke("glGetNamedBufferParameteriv", IIPV);
        glGetNamedBufferPointerv = load.invoke("glGetNamedBufferPointerv", IIPV);
        glGetNamedBufferSubData = load.invoke("glGetNamedBufferSubData", IJJPV);
        glGetNamedFramebufferAttachmentParameteriv = load.invoke("glGetNamedFramebufferAttachmentParameteriv", IIIPV);
        glGetNamedFramebufferParameteriv = load.invoke("glGetNamedFramebufferParameteriv", IIPV);
        glGetNamedRenderbufferParameteriv = load.invoke("glGetNamedRenderbufferParameteriv", IIPV);
        glGetQueryBufferObjecti64v = load.invoke("glGetQueryBufferObjecti64v", IIIJV);
        glGetQueryBufferObjectiv = load.invoke("glGetQueryBufferObjectiv", IIIJV);
        glGetQueryBufferObjectui64v = load.invoke("glGetQueryBufferObjectui64v", IIIJV);
        glGetQueryBufferObjectuiv = load.invoke("glGetQueryBufferObjectuiv", IIIJV);
        glGetTextureImage = load.invoke("glGetTextureImage", IIIIIPV);
        glGetTextureLevelParameterfv = load.invoke("glGetTextureLevelParameterfv", IIIPV);
        glGetTextureLevelParameteriv = load.invoke("glGetTextureLevelParameteriv", IIIPV);
        glGetTextureParameterIiv = load.invoke("glGetTextureParameterIiv", IIPV);
        glGetTextureParameterIuiv = load.invoke("glGetTextureParameterIuiv", IIPV);
        glGetTextureParameterfv = load.invoke("glGetTextureParameterfv", IIPV);
        glGetTextureParameteriv = load.invoke("glGetTextureParameteriv", IIPV);
        glGetTextureSubImage = load.invoke("glGetTextureSubImage", IIIIIIIIIIIPV);
        glGetTransformFeedbacki64_v = load.invoke("glGetTransformFeedbacki64_v", IIIPV);
        glGetTransformFeedbacki_v = load.invoke("glGetTransformFeedbacki_v", IIIPV);
        glGetTransformFeedbackiv = load.invoke("glGetTransformFeedbackiv", IIPV);
        glGetVertexArrayIndexed64iv = load.invoke("glGetVertexArrayIndexed64iv", IIIPV);
        glGetVertexArrayIndexediv = load.invoke("glGetVertexArrayIndexediv", IIIPV);
        glGetVertexArrayiv = load.invoke("glGetVertexArrayiv", IIPV);
        glGetnCompressedTexImage = load.invoke("glGetnCompressedTexImage", IIIPV);
        glGetnTexImage = load.invoke("glGetnTexImage", IIIIIPV);
        glGetnUniformdv = load.invoke("glGetnUniformdv", IIIPV);
        glGetnUniformfv = load.invoke("glGetnUniformfv", IIIPV);
        glGetnUniformiv = load.invoke("glGetnUniformiv", IIIPV);
        glGetnUniformuiv = load.invoke("glGetnUniformuiv", IIIPV);
        glInvalidateNamedFramebufferData = load.invoke("glInvalidateNamedFramebufferData", IIPV);
        glInvalidateNamedFramebufferSubData = load.invoke("glInvalidateNamedFramebufferSubData", IIPIIIIV);
        glMapNamedBuffer = load.invoke("glMapNamedBuffer", IIP);
        glMapNamedBufferRange = load.invoke("glMapNamedBufferRange", IJJIP);
        glMemoryBarrierByRegion = load.invoke("glMemoryBarrierByRegion", IV);
        glNamedBufferData = load.invoke("glNamedBufferData", IJPIV);
        glNamedBufferStorage = load.invoke("glNamedBufferStorage", IJPIV);
        glNamedBufferSubData = load.invoke("glNamedBufferSubData", IJJPV);
        glNamedFramebufferDrawBuffer = load.invoke("glNamedFramebufferDrawBuffer", II);
        glNamedFramebufferDrawBuffers = load.invoke("glNamedFramebufferDrawBuffers", IIPV);
        glNamedFramebufferParameteri = load.invoke("glNamedFramebufferParameteri", IIIV);
        glNamedFramebufferReadBuffer = load.invoke("glNamedFramebufferReadBuffer", IIV);
        glNamedFramebufferRenderbuffer = load.invoke("glNamedFramebufferRenderbuffer", IIIIV);
        glNamedFramebufferTexture = load.invoke("glNamedFramebufferTexture", IIIIV);
        glNamedFramebufferTextureLayer = load.invoke("glNamedFramebufferTextureLayer", IIIIIV);
        glNamedRenderbufferStorage = load.invoke("glNamedRenderbufferStorage", IIIIV);
        glNamedRenderbufferStorageMultisample = load.invoke("glNamedRenderbufferStorageMultisample", IIIIIV);
        glReadnPixels = load.invoke("glReadnPixels", IIIIIIIPV);
        glTextureBarrier = load.invoke("glTextureBarrier", V);
        glTextureBuffer = load.invoke("glTextureBuffer", IIIV);
        glTextureBufferRange = load.invoke("glTextureBufferRange", IIIJJV);
        glTextureParameterIiv = load.invoke("glTextureParameterIiv", IIPV);
        glTextureParameterIuiv = load.invoke("glTextureParameterIuiv", IIPV);
        glTextureParameterf = load.invoke("glTextureParameterf", IIFV);
        glTextureParameterfv = load.invoke("glTextureParameterfv", IIPV);
        glTextureParameteri = load.invoke("glTextureParameteri", IIIV);
        glTextureParameteriv = load.invoke("glTextureParameteriv", IIPV);
        glTextureStorage1D = load.invoke("glTextureStorage1D", IIIIV);
        glTextureStorage2D = load.invoke("glTextureStorage2D", IIIIIV);
        glTextureStorage2DMultisample = load.invoke("glTextureStorage2DMultisample", IIIIIZV);
        glTextureStorage3D = load.invoke("glTextureStorage3D", IIIIIIV);
        glTextureStorage3DMultisample = load.invoke("glTextureStorage3DMultisample", IIIIIIZV);
        glTextureSubImage1D = load.invoke("glTextureSubImage1D", IIIIIIPV);
        glTextureSubImage2D = load.invoke("glTextureSubImage2D", IIIIIIIIPV);
        glTextureSubImage3D = load.invoke("glTextureSubImage3D", IIIIIIIIIIPV);
        glTransformFeedbackBufferBase = load.invoke("glTransformFeedbackBufferBase", IIIV);
        glTransformFeedbackBufferRange = load.invoke("glTransformFeedbackBufferRange", IIIJJV);
        glUnmapNamedBuffer = load.invoke("glUnmapNamedBuffer", IZ);
        glVertexArrayAttribBinding = load.invoke("glVertexArrayAttribBinding", IIIV);
        glVertexArrayAttribFormat = load.invoke("glVertexArrayAttribFormat", IIIIZIV);
        glVertexArrayAttribIFormat = load.invoke("glVertexArrayAttribIFormat", IIIIIV);
        glVertexArrayAttribLFormat = load.invoke("glVertexArrayAttribLFormat", IIIIIV);
        glVertexArrayBindingDivisor = load.invoke("glVertexArrayBindingDivisor", IIIV);
        glVertexArrayElementBuffer = load.invoke("glVertexArrayElementBuffer", IIV);
        glVertexArrayVertexBuffer = load.invoke("glVertexArrayVertexBuffer", IIIJIV);
        glVertexArrayVertexBuffers = load.invoke("glVertexArrayVertexBuffers", IIIPPPV);
    }

    public static void bindTextureUnit(int unit, int texture) {
        try {
            check(glBindTextureUnit).invokeExact(unit, texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        try {
            check(glBlitNamedFramebuffer).invokeExact(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int checkNamedFramebufferStatus(int framebuffer, int target) {
        try {
            return (int) check(glCheckNamedFramebufferStatus).invokeExact(framebuffer, target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedBufferData(int buffer, int internalFormat, int format, int type, Addressable data) {
        try {
            check(glClearNamedBufferData).invokeExact(buffer, internalFormat, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedBufferSubData(int buffer, int internalFormat, long offset, long size, int format, int type, Addressable data) {
        try {
            check(glClearNamedBufferSubData).invokeExact(buffer, internalFormat, offset, size, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferfi(int framebuffer, int buffer, int drawBuffer, float depth, int stencil) {
        try {
            check(glClearNamedFramebufferfi).invokeExact(framebuffer, buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferfv(int framebuffer, int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearNamedFramebufferfv).invokeExact(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferfv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, float[] value) {
        clearNamedFramebufferfv(framebuffer, buffer, drawBuffer, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void clearNamedFramebufferiv(int framebuffer, int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearNamedFramebufferiv).invokeExact(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        clearNamedFramebufferiv(framebuffer, buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void clearNamedFramebufferuiv(int framebuffer, int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearNamedFramebufferuiv).invokeExact(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearNamedFramebufferuiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        clearNamedFramebufferuiv(framebuffer, buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void clipControl(int origin, int depth) {
        try {
            check(glClipControl).invokeExact(origin, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTextureSubImage1D).invokeExact(texture, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTextureSubImage2D).invokeExact(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void compressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTextureSubImage3D).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        try {
            check(glCopyNamedBufferSubData).invokeExact(readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        try {
            check(glCopyTextureSubImage1D).invokeExact(texture, level, xoffset, x, y, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTextureSubImage2D).invokeExact(texture, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTextureSubImage3D).invokeExact(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void createBuffers(int n, Addressable buffers) {
        try {
            check(glCreateBuffers).invokeExact(n, buffers);
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
            var seg = stack.calloc(JAVA_INT);
            createBuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createFramebuffers(int n, Addressable framebuffers) {
        try {
            check(glCreateFramebuffers).invokeExact(n, framebuffers);
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
            var seg = stack.calloc(JAVA_INT);
            createFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createProgramPipelines(int n, Addressable pipelines) {
        try {
            check(glCreateProgramPipelines).invokeExact(n, pipelines);
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
            var seg = stack.calloc(JAVA_INT);
            createProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createQueries(int target, int n, Addressable ids) {
        try {
            check(glCreateQueries).invokeExact(target, n, ids);
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
            var seg = stack.calloc(JAVA_INT);
            createQueries(target, 1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createRenderbuffers(int n, Addressable renderbuffers) {
        try {
            check(glCreateRenderbuffers).invokeExact(n, renderbuffers);
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
            var seg = stack.calloc(JAVA_INT);
            createRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createSamplers(int n, Addressable samplers) {
        try {
            check(glCreateSamplers).invokeExact(n, samplers);
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
            var seg = stack.calloc(JAVA_INT);
            createSamplers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createTextures(int target, int n, Addressable textures) {
        try {
            check(glCreateTextures).invokeExact(target, n, textures);
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
            var pTex = stack.calloc(JAVA_INT);
            createTextures(target, 1, pTex);
            return pTex.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createTransformFeedbacks(int n, Addressable ids) {
        try {
            check(glCreateTransformFeedbacks).invokeExact(n, ids);
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
            var seg = stack.calloc(JAVA_INT);
            createTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void createVertexArrays(int n, Addressable arrays) {
        try {
            check(glCreateVertexArrays).invokeExact(n, arrays);
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
            var seg = stack.calloc(JAVA_INT);
            createVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void disableVertexArrayAttrib(int vaobj, int index) {
        try {
            check(glDisableVertexArrayAttrib).invokeExact(vaobj, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enableVertexArrayAttrib(int vaobj, int index) {
        try {
            check(glEnableVertexArrayAttrib).invokeExact(vaobj, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flushMappedNamedBufferRange(int buffer, long offset, long length) {
        try {
            check(glFlushMappedNamedBufferRange).invokeExact(buffer, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void generateTextureMipmap(int texture) {
        try {
            check(glGenerateTextureMipmap).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getCompressedTextureImage(int texture, int level, int bufSize, Addressable pixels) {
        try {
            check(glGetCompressedTextureImage).invokeExact(texture, level, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, Addressable pixels) {
        try {
            check(glGetCompressedTextureSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getGraphicsResetStatus() {
        try {
            return (int) check(glGetGraphicsResetStatus).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getNamedBufferParameteri64v(int buffer, int pname, Addressable params) {
        try {
            check(glGetNamedBufferParameteri64v).invokeExact(buffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getNamedBufferParameteri64(int buffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getNamedBufferParameteri64v(buffer, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedBufferParameteriv(int buffer, int pname, Addressable params) {
        try {
            check(glGetNamedBufferParameteriv).invokeExact(buffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getNamedBufferParameteri(int buffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getNamedBufferParameteriv(buffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedBufferPointerv(int target, int pname, Addressable params) {
        try {
            check(glGetNamedBufferPointerv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress getNamedBufferPointer(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(ADDRESS);
            getNamedBufferPointerv(target, pname, seg);
            return seg.get(ADDRESS, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, long size, Addressable data) {
        try {
            check(glGetNamedBufferSubData).invokeExact(buffer, offset, size, data);
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

    public static void getNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, Addressable params) {
        try {
            check(glGetNamedFramebufferAttachmentParameteriv).invokeExact(framebuffer, attachment, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedFramebufferParameteriv(int framebuffer, int pname, Addressable param) {
        try {
            check(glGetNamedFramebufferParameteriv).invokeExact(framebuffer, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getNamedFramebufferParameteri(int framebuffer, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getNamedFramebufferParameteriv(framebuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getNamedRenderbufferParameteriv(int renderbuffer, int pname, Addressable params) {
        try {
            check(glGetNamedRenderbufferParameteriv).invokeExact(renderbuffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
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
            var seg = stack.calloc(JAVA_INT);
            getNamedRenderbufferParameteriv(renderbuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjecti64v).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjectiv).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjectui64v).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjectuiv).invokeExact(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureImage(int texture, int level, int format, int type, int bufSize, Addressable pixels) {
        try {
            check(glGetTextureImage).invokeExact(texture, level, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureLevelParameterfv(int texture, int level, int pname, Addressable params) {
        try {
            check(glGetTextureLevelParameterfv).invokeExact(texture, level, pname, params);
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
            var pParams = stack.calloc(JAVA_FLOAT);
            getTextureLevelParameterfv(texture, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureLevelParameteriv(int texture, int level, int pname, Addressable params) {
        try {
            check(glGetTextureLevelParameteriv).invokeExact(texture, level, pname, params);
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
            var pParams = stack.calloc(JAVA_INT);
            getTextureLevelParameteriv(texture, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameterIiv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameterIiv).invokeExact(texture, pname, params);
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
            var seg = stack.calloc(JAVA_INT);
            getTextureParameterIiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameterIuiv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameterIuiv).invokeExact(texture, pname, params);
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
            var seg = stack.calloc(JAVA_INT);
            getTextureParameterIuiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameterfv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameterfv).invokeExact(texture, pname, params);
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
            var pParams = stack.calloc(JAVA_FLOAT);
            getTextureParameterfv(texture, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureParameteriv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameteriv).invokeExact(texture, pname, params);
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
            var pParams = stack.calloc(JAVA_INT);
            getTextureParameteriv(texture, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, Addressable pixels) {
        try {
            check(glGetTextureSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, byte[] pixels) {
        var seg = allocator.allocateArray(JAVA_BYTE, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, short[] pixels) {
        var seg = allocator.allocateArray(JAVA_SHORT, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, int[] pixels) {
        var seg = allocator.allocateArray(JAVA_INT, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, float[] pixels) {
        var seg = allocator.allocateArray(JAVA_FLOAT, pixels.length);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
        RuntimeHelper.toArray(seg, pixels);
    }

    public static void getTransformFeedbacki64_v(int xfb, int pname, int index, Addressable param) {
        try {
            check(glGetTransformFeedbacki64_v).invokeExact(xfb, pname, index, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbacki64_v(SegmentAllocator allocator, int xfb, int pname, int index, long[] param) {
        var seg = allocator.allocateArray(JAVA_LONG, param.length);
        getTransformFeedbacki64_v(xfb, pname, index, seg);
        RuntimeHelper.toArray(seg, param);
    }

    public static void getTransformFeedbacki_v(int xfb, int pname, int index, Addressable param) {
        try {
            check(glGetTransformFeedbacki_v).invokeExact(xfb, pname, index, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbacki_v(SegmentAllocator allocator, int xfb, int pname, int index, int[] param) {
        var seg = allocator.allocateArray(JAVA_INT, param.length);
        getTransformFeedbacki_v(xfb, pname, index, seg);
        RuntimeHelper.toArray(seg, param);
    }

    public static void getTransformFeedbackiv(int xfb, int pname, Addressable param) {
        try {
            check(glGetTransformFeedbackiv).invokeExact(xfb, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbackiv(SegmentAllocator allocator, int xfb, int pname, int[] param) {
        var seg = allocator.allocateArray(JAVA_INT, param.length);
        getTransformFeedbackiv(xfb, pname, seg);
        RuntimeHelper.toArray(seg, param);
    }

    public static void getVertexArrayIndexed64iv(int vaobj, int index, int pname, Addressable param) {
        try {
            check(glGetVertexArrayIndexed64iv).invokeExact(vaobj, index, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getVertexArrayIndexed64i(int vaobj, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getVertexArrayIndexed64iv(vaobj, index, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexArrayIndexediv(int vaobj, int index, int pname, Addressable param) {
        try {
            check(glGetVertexArrayIndexediv).invokeExact(vaobj, index, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getVertexArrayIndexedi(int vaobj, int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexArrayIndexediv(vaobj, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexArrayiv(int vaobj, int pname, Addressable param) {
        try {
            check(glGetVertexArrayiv).invokeExact(vaobj, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getVertexArrayi(int vaobj, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexArrayiv(vaobj, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getnCompressedTexImage(int target, int lod, int bufSize, Addressable pixels) {
        try {
            check(glGetnCompressedTexImage).invokeExact(target, lod, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getnCompressedTexImage(int target, int lod, MemorySegment pixels) {
        getnCompressedTexImage(target, lod, (int) pixels.byteSize(), pixels);
    }

    public static void getnTexImage(int target, int level, int format, int type, int bufSize, Addressable pixels) {
        try {
            check(glGetnTexImage).invokeExact(target, level, format, type, bufSize, pixels);
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

    public static void getnUniformdv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformdv).invokeExact(program, location, bufSize, params);
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

    public static void getnUniformfv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformfv).invokeExact(program, location, bufSize, params);
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

    public static void getnUniformiv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformiv).invokeExact(program, location, bufSize, params);
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

    public static void getnUniformuiv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformuiv).invokeExact(program, location, bufSize, params);
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

    public static void invalidateNamedFramebufferData(int framebuffer, int numAttachments, Addressable attachments) {
        try {
            check(glInvalidateNamedFramebufferData).invokeExact(framebuffer, numAttachments, attachments);
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
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, attachment);
            invalidateNamedFramebufferData(framebuffer, 1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateNamedFramebufferSubData(int framebuffer, int numAttachments, Addressable attachments, int x, int y, int width, int height) {
        try {
            check(glInvalidateNamedFramebufferSubData).invokeExact(framebuffer, numAttachments, attachments, x, y, width, height);
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
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, attachment);
            invalidateNamedFramebufferSubData(framebuffer, 1, mem, x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress mapNamedBuffer(int buffer, int access) {
        try {
            return (MemoryAddress) check(glMapNamedBuffer).invokeExact(buffer, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress mapNamedBufferRange(int buffer, long offset, long length, int access) {
        try {
            return (MemoryAddress) check(glMapNamedBufferRange).invokeExact(buffer, offset, length, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void memoryBarrierByRegion(int barriers) {
        try {
            check(glMemoryBarrierByRegion).invokeExact(barriers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferData(int buffer, long size, Addressable data, int usage) {
        try {
            check(glNamedBufferData).invokeExact(buffer, size, data, usage);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferData(int buffer, MemorySegment data, int usage) {
        namedBufferData(buffer, data.byteSize(), data, usage);
    }

    public static void namedBufferData(int buffer, BufferBuilder data, int usage) {
        namedBufferData(buffer, data.offset(), data.address(), usage);
    }

    public static void namedBufferData(int buffer, long size, int usage) {
        namedBufferData(buffer, size, MemoryAddress.NULL, usage);
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

    public static void namedBufferStorage(int buffer, long size, Addressable data, int flags) {
        try {
            check(glNamedBufferStorage).invokeExact(buffer, size, data, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferStorage(int buffer, long size, int flags) {
        namedBufferStorage(buffer, size, MemoryAddress.NULL, flags);
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

    public static void namedBufferSubData(int buffer, long offset, long size, Addressable data) {
        try {
            check(glNamedBufferSubData).invokeExact(buffer, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedBufferSubData(int buffer, long offset, MemorySegment data) {
        namedBufferSubData(buffer, offset, data.byteSize(), data);
    }

    public static void namedBufferSubData(int buffer, long offset, BufferBuilder data) {
        namedBufferSubData(buffer, offset, data.offset(), data.address());
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
        try {
            check(glNamedFramebufferDrawBuffer).invokeExact(framebuffer, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferDrawBuffers(int framebuffer, int n, Addressable bufs) {
        try {
            check(glNamedFramebufferDrawBuffers).invokeExact(framebuffer, n, bufs);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferDrawBuffers(SegmentAllocator allocator, int framebuffer, int[] bufs) {
        namedFramebufferDrawBuffers(framebuffer, bufs.length, allocator.allocateArray(JAVA_INT, bufs));
    }

    public static void namedFramebufferParameteri(int framebuffer, int pname, int param) {
        try {
            check(glNamedFramebufferParameteri).invokeExact(framebuffer, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferReadBuffer(int framebuffer, int src) {
        try {
            check(glNamedFramebufferReadBuffer).invokeExact(framebuffer, src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbufferTarget, int renderbuffer) {
        try {
            check(glNamedFramebufferRenderbuffer).invokeExact(framebuffer, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        try {
            check(glNamedFramebufferTexture).invokeExact(framebuffer, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        try {
            check(glNamedFramebufferTextureLayer).invokeExact(framebuffer, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedRenderbufferStorage(int renderbuffer, int internalFormat, int width, int height) {
        try {
            check(glNamedRenderbufferStorage).invokeExact(renderbuffer, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void namedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalFormat, int width, int height) {
        try {
            check(glNamedRenderbufferStorageMultisample).invokeExact(renderbuffer, samples, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, int bufSize, Addressable data) {
        try {
            check(glReadnPixels).invokeExact(x, y, width, height, format, type, bufSize, data);
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
        try {
            check(glTextureBarrier).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureBuffer(int texture, int internalFormat, int buffer) {
        try {
            check(glTextureBuffer).invokeExact(texture, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureBufferRange(int texture, int internalFormat, int buffer, long offset, long size) {
        try {
            check(glTextureBufferRange).invokeExact(texture, internalFormat, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterIiv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameterIiv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterIiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameterIiv(texture, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void textureParameterIuiv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameterIuiv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterIuiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameterIuiv(texture, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void textureParameterf(int texture, int pname, float param) {
        try {
            check(glTextureParameterf).invokeExact(texture, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameterfv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameterfv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void textureParameterfv(SegmentAllocator allocator, int texture, int pname, float[] params) {
        textureParameterfv(texture, pname, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void textureParameteri(int texture, int pname, int param) {
        try {
            check(glTextureParameteri).invokeExact(texture, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameteriv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameteriv).invokeExact(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureParameteriv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameteriv(texture, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void textureStorage1D(int texture, int levels, int internalFormat, int width) {
        try {
            check(glTextureStorage1D).invokeExact(texture, levels, internalFormat, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage2D(int texture, int levels, int internalFormat, int width, int height) {
        try {
            check(glTextureStorage2D).invokeExact(texture, levels, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage2DMultisample(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        try {
            check(glTextureStorage2DMultisample).invokeExact(texture, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage3D(int texture, int levels, int internalFormat, int width, int height, int depth) {
        try {
            check(glTextureStorage3D).invokeExact(texture, levels, internalFormat, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureStorage3DMultisample(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        try {
            check(glTextureStorage3DMultisample).invokeExact(texture, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, Addressable pixels) {
        try {
            check(glTextureSubImage1D).invokeExact(texture, level, xoffset, width, format, type, pixels);
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

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glTextureSubImage2D).invokeExact(texture, level, xoffset, yoffset, width, height, format, type, pixels);
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

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Addressable pixels) {
        try {
            check(glTextureSubImage3D).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
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
        try {
            check(glTransformFeedbackBufferBase).invokeExact(xfb, index, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void transformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        try {
            check(glTransformFeedbackBufferRange).invokeExact(xfb, index, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean unmapNamedBuffer(int buffer) {
        try {
            return (boolean) check(glUnmapNamedBuffer).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribBinding(int vaobj, int attribIndex, int bindingIndex) {
        try {
            check(glVertexArrayAttribBinding).invokeExact(vaobj, attribIndex, bindingIndex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribFormat(int vaobj, int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        try {
            check(glVertexArrayAttribFormat).invokeExact(vaobj, attribIndex, size, type, normalized, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribIFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        try {
            check(glVertexArrayAttribIFormat).invokeExact(vaobj, attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayAttribLFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        try {
            check(glVertexArrayAttribLFormat).invokeExact(vaobj, attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayBindingDivisor(int vaobj, int bindingIndex, int divisor) {
        try {
            check(glVertexArrayBindingDivisor).invokeExact(vaobj, bindingIndex, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayElementBuffer(int vaobj, int buffer) {
        try {
            check(glVertexArrayElementBuffer).invokeExact(vaobj, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayVertexBuffer(int vaobj, int bindingIndex, int buffer, long offset, int stride) {
        try {
            check(glVertexArrayVertexBuffer).invokeExact(vaobj, bindingIndex, buffer, offset, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayVertexBuffers(int vaobj, int first, int count, Addressable buffers, Addressable offsets, Addressable strides) {
        try {
            check(glVertexArrayVertexBuffers).invokeExact(vaobj, first, count, buffers, offsets, strides);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexArrayVertexBuffers(SegmentAllocator allocator, int vaobj, int first, int count, int[] buffers, long[] offsets, int[] strides) {
        vertexArrayVertexBuffers(vaobj, first, count, allocator.allocateArray(JAVA_INT, buffers), allocator.allocateArray(JAVA_LONG, offsets), allocator.allocateArray(JAVA_INT, strides));
    }
}
