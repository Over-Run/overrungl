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

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;

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
        return GLCaps.checkAll(glBindTextureUnit, glBlitNamedFramebuffer, glCheckNamedFramebufferStatus,
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
            check(glBindTextureUnit).invoke(unit, texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void blitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        try {
            check(glBlitNamedFramebuffer).invoke(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int checkNamedFramebufferStatus(int framebuffer, int target) {
        try {
            return (int) check(glCheckNamedFramebufferStatus).invoke(framebuffer, target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedBufferData(int buffer, int internalFormat, int format, int type, Addressable data) {
        try {
            check(glClearNamedBufferData).invoke(buffer, internalFormat, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedBufferSubData(int buffer, int internalFormat, long offset, long size, int format, int type, Addressable data) {
        try {
            check(glClearNamedBufferSubData).invoke(buffer, internalFormat, offset, size, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedFramebufferfi(int framebuffer, int buffer, int drawBuffer, float depth, int stencil) {
        try {
            check(glClearNamedFramebufferfi).invoke(framebuffer, buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedFramebufferfv(int framebuffer, int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearNamedFramebufferfv).invoke(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedFramebufferfv(int framebuffer, int buffer, int drawBuffer, float[] value) {
        try (var session = MemorySession.openShared()) {
            clearNamedFramebufferfv(framebuffer, buffer, drawBuffer, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void clearNamedFramebufferiv(int framebuffer, int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearNamedFramebufferiv).invoke(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedFramebufferiv(int framebuffer, int buffer, int drawBuffer, int[] value) {
        try (var session = MemorySession.openShared()) {
            clearNamedFramebufferiv(framebuffer, buffer, drawBuffer, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void clearNamedFramebufferuiv(int framebuffer, int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearNamedFramebufferuiv).invoke(framebuffer, buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void clearNamedFramebufferuiv(int framebuffer, int buffer, int drawBuffer, int[] value) {
        try (var session = MemorySession.openShared()) {
            clearNamedFramebufferuiv(framebuffer, buffer, drawBuffer, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void clipControl(int origin, int depth) {
        try {
            check(glClipControl).invoke(origin, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void compressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTextureSubImage1D).invoke(texture, level, xoffset, width, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void compressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTextureSubImage2D).invoke(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void compressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, Addressable data) {
        try {
            check(glCompressedTextureSubImage3D).invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void copyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        try {
            check(glCopyNamedBufferSubData).invoke(readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void copyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        try {
            check(glCopyTextureSubImage1D).invoke(texture, level, xoffset, x, y, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void copyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTextureSubImage2D).invoke(texture, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void copyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        try {
            check(glCopyTextureSubImage3D).invoke(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createBuffers(int n, Addressable buffers) {
        try {
            check(glCreateBuffers).invoke(n, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createBuffers(int[] buffers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, buffers.length);
            createBuffers(buffers.length, seg);
            RuntimeHelper.toArray(seg, buffers);
        }
    }

    public static int createBuffer() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createBuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createFramebuffers(int n, Addressable framebuffers) {
        try {
            check(glCreateFramebuffers).invoke(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createFramebuffers(int[] framebuffers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, framebuffers.length);
            createFramebuffers(framebuffers.length, seg);
            RuntimeHelper.toArray(seg, framebuffers);
        }
    }

    public static int createFramebuffer() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createProgramPipelines(int n, Addressable pipelines) {
        try {
            check(glCreateProgramPipelines).invoke(n, pipelines);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createProgramPipelines(int[] pipelines) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, pipelines.length);
            createProgramPipelines(pipelines.length, seg);
            RuntimeHelper.toArray(seg, pipelines);
        }
    }

    public static int createProgramPipeline() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createQueries(int target, int n, Addressable ids) {
        try {
            check(glCreateQueries).invoke(target, n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createQueries(int target, int[] ids) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, ids.length);
            createQueries(target, ids.length, seg);
            RuntimeHelper.toArray(seg, ids);
        }
    }

    public static int createQuery(int target) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createQueries(target, 1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createRenderbuffers(int n, Addressable renderbuffers) {
        try {
            check(glCreateRenderbuffers).invoke(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createRenderbuffers(int[] renderbuffers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, renderbuffers.length);
            createRenderbuffers(renderbuffers.length, seg);
            RuntimeHelper.toArray(seg, renderbuffers);
        }
    }

    public static int createRenderbuffer() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createSamplers(int n, Addressable samplers) {
        try {
            check(glCreateSamplers).invoke(n, samplers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createSamplers(int[] samplers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, samplers.length);
            createSamplers(samplers.length, seg);
            RuntimeHelper.toArray(seg, samplers);
        }
    }

    public static int createSampler() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createSamplers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createTextures(int target, int n, Addressable textures) {
        try {
            check(glCreateTextures).invoke(target, n, textures);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createTextures(int target, int[] textures) {
        try (var session = MemorySession.openShared()) {
            final int n = textures.length;
            var pTex = session.allocateArray(JAVA_INT, n);
            createTextures(target, n, pTex);
            RuntimeHelper.toArray(pTex, textures);
        }
    }

    public static int createTexture(int target) {
        try (var session = MemorySession.openShared()) {
            var pTex = session.allocate(JAVA_INT);
            createTextures(target, 1, pTex);
            return pTex.get(JAVA_INT, 0);
        }
    }

    public static void createTransformFeedbacks(int n, Addressable ids) {
        try {
            check(glCreateTransformFeedbacks).invoke(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createTransformFeedbacks(int[] ids) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, ids.length);
            createTransformFeedbacks(ids.length, seg);
            RuntimeHelper.toArray(seg, ids);
        }
    }

    public static int createTransformFeedback() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void createVertexArrays(int n, Addressable arrays) {
        try {
            check(glCreateVertexArrays).invoke(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void createVertexArrays(int[] arrays) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, arrays.length);
            createVertexArrays(arrays.length, seg);
            RuntimeHelper.toArray(seg, arrays);
        }
    }

    public static int createVertexArray() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            createVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void disableVertexArrayAttrib(int vaobj, int index) {
        try {
            check(glDisableVertexArrayAttrib).invoke(vaobj, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void enableVertexArrayAttrib(int vaobj, int index) {
        try {
            check(glEnableVertexArrayAttrib).invoke(vaobj, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void flushMappedNamedBufferRange(int buffer, long offset, long length) {
        try {
            check(glFlushMappedNamedBufferRange).invoke(buffer, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void generateTextureMipmap(int texture) {
        try {
            check(glGenerateTextureMipmap).invoke(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getCompressedTextureImage(int texture, int level, int bufSize, Addressable pixels) {
        try {
            check(glGetCompressedTextureImage).invoke(texture, level, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, Addressable pixels) {
        try {
            check(glGetCompressedTextureSubImage).invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getGraphicsResetStatus() {
        try {
            return (int) check(glGetGraphicsResetStatus).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedBufferParameteri64v(int buffer, int pname, Addressable params) {
        try {
            check(glGetNamedBufferParameteri64v).invoke(buffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedBufferParameteri64v(int buffer, int pname, long[] params) {
        params[0] = getNamedBufferParameteri64(buffer, pname);
    }

    public static long getNamedBufferParameteri64(int buffer, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_LONG);
            getNamedBufferParameteri64v(buffer, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    public static void getNamedBufferParameteriv(int buffer, int pname, Addressable params) {
        try {
            check(glGetNamedBufferParameteriv).invoke(buffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedBufferParameteriv(int buffer, int pname, int[] params) {
        params[0] = getNamedBufferParameteri(buffer, pname);
    }

    public static int getNamedBufferParameteri(int buffer, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getNamedBufferParameteriv(buffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getNamedBufferPointerv(int target, int pname, Addressable params) {
        try {
            check(glGetNamedBufferPointerv).invoke(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedBufferPointerv(int target, int pname, MemoryAddress[] params) {
        params[0] = getNamedBufferPointer(target, pname);
    }

    public static MemoryAddress getNamedBufferPointer(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(ADDRESS);
            getNamedBufferPointerv(target, pname, seg);
            return seg.get(ADDRESS, 0);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, long size, Addressable data) {
        try {
            check(glGetNamedBufferSubData).invoke(buffer, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, byte[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, data.length);
            getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length), seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, short[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, data.length);
            getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 1, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, int[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, data.length);
            getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, long[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_LONG, data.length);
            getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, float[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, data.length);
            getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void getNamedBufferSubData(int buffer, long offset, double[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, data.length);
            getNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void getNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, Addressable params) {
        try {
            check(glGetNamedFramebufferAttachmentParameteriv).invoke(framebuffer, attachment, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, seg);
            params[0] = seg.get(JAVA_INT, 0);
        }
    }

    public static int getNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getNamedFramebufferParameteriv(int framebuffer, int pname, Addressable param) {
        try {
            check(glGetNamedFramebufferParameteriv).invoke(framebuffer, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getNamedFramebufferParameteri(int framebuffer, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getNamedFramebufferParameteriv(framebuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getNamedRenderbufferParameteriv(int renderbuffer, int pname, Addressable params) {
        try {
            check(glGetNamedRenderbufferParameteriv).invoke(renderbuffer, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getNamedRenderbufferParameteriv(renderbuffer, pname, seg);
            params[0] = seg.get(JAVA_INT, 0);
        }
    }

    public static int getNamedRenderbufferParameteri(int renderbuffer, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getNamedRenderbufferParameteriv(renderbuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjecti64v).invoke(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjectiv).invoke(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjectui64v).invoke(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        try {
            check(glGetQueryBufferObjectuiv).invoke(id, buffer, pname, offset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureImage(int texture, int level, int format, int type, int bufSize, Addressable pixels) {
        try {
            check(glGetTextureImage).invoke(texture, level, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureLevelParameterfv(int texture, int level, int pname, Addressable params) {
        try {
            check(glGetTextureLevelParameterfv).invoke(texture, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureLevelParameterfv(int texture, int level, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTextureLevelParameterfv(texture, level, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getTextureLevelParameterf(int texture, int level, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getTextureLevelParameterfv(texture, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getTextureLevelParameteriv(int texture, int level, int pname, Addressable params) {
        try {
            check(glGetTextureLevelParameteriv).invoke(texture, level, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureLevelParameteriv(int texture, int level, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTextureLevelParameteriv(texture, level, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getTextureLevelParameteri(int texture, int level, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getTextureLevelParameteriv(texture, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void getTextureParameterIiv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameterIiv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureParameterIiv(int texture, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getTextureParameterIiv(texture, pname, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static int getTextureParameterIi(int texture, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getTextureParameterIiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getTextureParameterIuiv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameterIuiv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureParameterIuiv(int texture, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getTextureParameterIuiv(texture, pname, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static int getTextureParameterIui(int texture, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getTextureParameterIuiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getTextureParameterfv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameterfv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureParameterfv(int texture, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_FLOAT, params.length);
            getTextureParameterfv(texture, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static float getTextureParameterf(int texture, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_FLOAT);
            getTextureParameterfv(texture, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    public static void getTextureParameteriv(int texture, int pname, Addressable params) {
        try {
            check(glGetTextureParameteriv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureParameteriv(int texture, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocateArray(JAVA_INT, params.length);
            getTextureParameteriv(texture, pname, pParams);
            RuntimeHelper.toArray(pParams, params);
        }
    }

    public static int getTextureParameteri(int texture, int pname) {
        try (var session = MemorySession.openShared()) {
            var pParams = session.allocate(JAVA_INT);
            getTextureParameteriv(texture, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, Addressable pixels) {
        try {
            check(glGetTextureSubImage).invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, pixels.length);
            getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, pixels.length);
            getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, pixels.length);
            getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, pixels.length);
            getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getTransformFeedbacki64_v(int xfb, int pname, int index, Addressable param) {
        try {
            check(glGetTransformFeedbacki64_v).invoke(xfb, pname, index, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTransformFeedbacki64_v(int xfb, int pname, int index, long[] param) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_LONG, param.length);
            getTransformFeedbacki64_v(xfb, pname, index, seg);
            RuntimeHelper.toArray(seg, param);
        }
    }

    public static void getTransformFeedbacki_v(int xfb, int pname, int index, Addressable param) {
        try {
            check(glGetTransformFeedbacki_v).invoke(xfb, pname, index, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTransformFeedbacki_v(int xfb, int pname, int index, int[] param) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, param.length);
            getTransformFeedbacki_v(xfb, pname, index, seg);
            RuntimeHelper.toArray(seg, param);
        }
    }

    public static void getTransformFeedbackiv(int xfb, int pname, Addressable param) {
        try {
            check(glGetTransformFeedbackiv).invoke(xfb, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getTransformFeedbackiv(int xfb, int pname, int[] param) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, param.length);
            getTransformFeedbackiv(xfb, pname, seg);
            RuntimeHelper.toArray(seg, param);
        }
    }

    public static void getVertexArrayIndexed64iv(int vaobj, int index, int pname, Addressable param) {
        try {
            check(glGetVertexArrayIndexed64iv).invoke(vaobj, index, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static long getVertexArrayIndexed64i(int vaobj, int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_LONG);
            getVertexArrayIndexed64iv(vaobj, index, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    public static void getVertexArrayIndexediv(int vaobj, int index, int pname, Addressable param) {
        try {
            check(glGetVertexArrayIndexediv).invoke(vaobj, index, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getVertexArrayIndexedi(int vaobj, int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getVertexArrayIndexediv(vaobj, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getVertexArrayiv(int vaobj, int pname, Addressable param) {
        try {
            check(glGetVertexArrayiv).invoke(vaobj, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getVertexArrayi(int vaobj, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getVertexArrayiv(vaobj, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    public static void getnCompressedTexImage(int target, int lod, int bufSize, Addressable pixels) {
        try {
            check(glGetnCompressedTexImage).invoke(target, lod, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getnCompressedTexImage(int target, int lod, MemorySegment pixels) {
        getnCompressedTexImage(target, lod, (int) pixels.byteSize(), pixels);
    }

    public static void getnTexImage(int target, int level, int format, int type, int bufSize, Addressable pixels) {
        try {
            check(glGetnTexImage).invoke(target, level, format, type, bufSize, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getnTexImage(int target, int level, int format, int type, MemorySegment pixels) {
        getnTexImage(target, level, format, type, (int) pixels.byteSize(), pixels);
    }

    public static void getnTexImage(int target, int level, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, pixels.length);
            getnTexImage(target, level, format, type, pixels.length, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getnTexImage(int target, int level, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, pixels.length);
            getnTexImage(target, level, format, type, pixels.length, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getnTexImage(int target, int level, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, pixels.length);
            getnTexImage(target, level, format, type, pixels.length, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getnTexImage(int target, int level, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, pixels.length);
            getnTexImage(target, level, format, type, pixels.length, seg);
            RuntimeHelper.toArray(seg, pixels);
        }
    }

    public static void getnUniformdv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformdv).invoke(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getnUniformdv(int program, int location, MemorySegment params) {
        getnUniformdv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformdv(int program, int location, double[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, params.length);
            getnUniformdv(program, location, params.length, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static void getnUniformfv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformfv).invoke(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getnUniformfv(int program, int location, MemorySegment params) {
        getnUniformfv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformfv(int program, int location, float[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, params.length);
            getnUniformfv(program, location, params.length, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static void getnUniformiv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformiv).invoke(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getnUniformiv(int program, int location, MemorySegment params) {
        getnUniformiv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformiv(int program, int location, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getnUniformiv(program, location, params.length, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static void getnUniformuiv(int program, int location, int bufSize, Addressable params) {
        try {
            check(glGetnUniformuiv).invoke(program, location, bufSize, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void getnUniformuiv(int program, int location, MemorySegment params) {
        getnUniformuiv(program, location, (int) params.byteSize(), params);
    }

    public static void getnUniformuiv(int program, int location, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getnUniformuiv(program, location, params.length, seg);
            RuntimeHelper.toArray(seg, params);
        }
    }

    public static void invalidateNamedFramebufferData(int framebuffer, int numAttachments, Addressable attachments) {
        try {
            check(glInvalidateNamedFramebufferData).invoke(framebuffer, numAttachments, attachments);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void invalidateNamedFramebufferData(int framebuffer, int[] attachments) {
        try (var session = MemorySession.openShared()) {
            invalidateNamedFramebufferData(framebuffer, attachments.length, session.allocateArray(JAVA_INT, attachments));
        }
    }

    public static void invalidateNamedFramebufferData(int framebuffer, int attachment) {
        try (var session = MemorySession.openShared()) {
            invalidateNamedFramebufferData(framebuffer, 1, session.allocate(JAVA_INT, attachment));
        }
    }

    public static void invalidateNamedFramebufferSubData(int framebuffer, int numAttachments, Addressable attachments, int x, int y, int width, int height) {
        try {
            check(glInvalidateNamedFramebufferSubData).invoke(framebuffer, numAttachments, attachments, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void invalidateNamedFramebufferSubData(int framebuffer, int[] attachments, int x, int y, int width, int height) {
        try (var session = MemorySession.openShared()) {
            invalidateNamedFramebufferSubData(framebuffer, attachments.length, session.allocateArray(JAVA_INT, attachments), x, y, width, height);
        }
    }

    public static void invalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
        try (var session = MemorySession.openShared()) {
            invalidateNamedFramebufferSubData(framebuffer, 1, session.allocate(JAVA_INT, attachment), x, y, width, height);
        }
    }

    public static MemoryAddress mapNamedBuffer(int buffer, int access) {
        try {
            return (MemoryAddress) check(glMapNamedBuffer).invoke(buffer, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress mapNamedBufferRange(int buffer, long offset, long length, int access) {
        try {
            return (MemoryAddress) check(glMapNamedBufferRange).invoke(buffer, offset, length, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void memoryBarrierByRegion(int barriers) {
        try {
            check(glMemoryBarrierByRegion).invoke(barriers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedBufferData(int buffer, long size, Addressable data, int usage) {
        try {
            check(glNamedBufferData).invoke(buffer, size, data, usage);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedBufferData(int buffer, long size, int usage) {
        namedBufferData(buffer, size, MemoryAddress.NULL, usage);
    }

    public static void namedBufferData(int buffer, byte[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            namedBufferData(buffer, Integer.toUnsignedLong(data.length), session.allocateArray(JAVA_BYTE, data), usage);
        }
    }

    public static void namedBufferData(int buffer, short[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 1, session.allocateArray(JAVA_SHORT, data), usage);
        }
    }

    public static void namedBufferData(int buffer, int[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_INT, data), usage);
        }
    }

    public static void namedBufferData(int buffer, long[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_LONG, data), usage);
        }
    }

    public static void namedBufferData(int buffer, float[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_FLOAT, data), usage);
        }
    }

    public static void namedBufferData(int buffer, double[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            namedBufferData(buffer, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_DOUBLE, data), usage);
        }
    }

    public static void namedBufferStorage(int buffer, long size, Addressable data, int flags) {
        try {
            check(glNamedBufferStorage).invoke(buffer, size, data, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedBufferStorage(int buffer, long size, int flags) {
        namedBufferStorage(buffer, size, MemoryAddress.NULL, flags);
    }

    public static void namedBufferStorage(int buffer, byte[] data, int flags) {
        try (var session = MemorySession.openShared()) {
            namedBufferStorage(buffer, Integer.toUnsignedLong(data.length), session.allocateArray(JAVA_BYTE, data), flags);
        }
    }

    public static void namedBufferStorage(int buffer, short[] data, int flags) {
        try (var session = MemorySession.openShared()) {
            namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 1, session.allocateArray(JAVA_SHORT, data), flags);
        }
    }

    public static void namedBufferStorage(int buffer, int[] data, int flags) {
        try (var session = MemorySession.openShared()) {
            namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_INT, data), flags);
        }
    }

    public static void namedBufferStorage(int buffer, long[] data, int flags) {
        try (var session = MemorySession.openShared()) {
            namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_LONG, data), flags);
        }
    }

    public static void namedBufferStorage(int buffer, float[] data, int flags) {
        try (var session = MemorySession.openShared()) {
            namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_FLOAT, data), flags);
        }
    }

    public static void namedBufferStorage(int buffer, double[] data, int flags) {
        try (var session = MemorySession.openShared()) {
            namedBufferStorage(buffer, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_DOUBLE, data), flags);
        }
    }

    public static void namedBufferSubData(int buffer, long offset, long size, Addressable data) {
        try {
            check(glNamedBufferSubData).invoke(buffer, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedBufferSubData(int buffer, long offset, byte[] data) {
        try (var session = MemorySession.openShared()) {
            namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length), session.allocateArray(JAVA_BYTE, data));
        }
    }

    public static void namedBufferSubData(int buffer, long offset, short[] data) {
        try (var session = MemorySession.openShared()) {
            namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 1, session.allocateArray(JAVA_SHORT, data));
        }
    }

    public static void namedBufferSubData(int buffer, long offset, int[] data) {
        try (var session = MemorySession.openShared()) {
            namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_INT, data));
        }
    }

    public static void namedBufferSubData(int buffer, long offset, long[] data) {
        try (var session = MemorySession.openShared()) {
            namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_LONG, data));
        }
    }

    public static void namedBufferSubData(int buffer, long offset, float[] data) {
        try (var session = MemorySession.openShared()) {
            namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_FLOAT, data));
        }
    }

    public static void namedBufferSubData(int buffer, long offset, double[] data) {
        try (var session = MemorySession.openShared()) {
            namedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_DOUBLE, data));
        }
    }

    public static void namedFramebufferDrawBuffer(int framebuffer, int buf) {
        try {
            check(glNamedFramebufferDrawBuffer).invoke(framebuffer, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedFramebufferDrawBuffers(int framebuffer, int n, Addressable bufs) {
        try {
            check(glNamedFramebufferDrawBuffers).invoke(framebuffer, n, bufs);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedFramebufferDrawBuffers(int framebuffer, int[] bufs) {
        try (var session = MemorySession.openShared()) {
            namedFramebufferDrawBuffers(framebuffer, bufs.length, session.allocateArray(JAVA_INT, bufs));
        }
    }

    public static void namedFramebufferParameteri(int framebuffer, int pname, int param) {
        try {
            check(glNamedFramebufferParameteri).invoke(framebuffer, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedFramebufferReadBuffer(int framebuffer, int src) {
        try {
            check(glNamedFramebufferReadBuffer).invoke(framebuffer, src);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbufferTarget, int renderbuffer) {
        try {
            check(glNamedFramebufferRenderbuffer).invoke(framebuffer, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        try {
            check(glNamedFramebufferTexture).invoke(framebuffer, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        try {
            check(glNamedFramebufferTextureLayer).invoke(framebuffer, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedRenderbufferStorage(int renderbuffer, int internalFormat, int width, int height) {
        try {
            check(glNamedRenderbufferStorage).invoke(renderbuffer, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void namedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalFormat, int width, int height) {
        try {
            check(glNamedRenderbufferStorageMultisample).invoke(renderbuffer, samples, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, int bufSize, Addressable data) {
        try {
            check(glReadnPixels).invoke(x, y, width, height, format, type, bufSize, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, MemorySegment data) {
        readnPixels(x, y, width, height, format, type, (int) data.byteSize(), data);
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, byte[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, data.length);
            readnPixels(x, y, width, height, format, type, data.length, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, short[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, data.length);
            readnPixels(x, y, width, height, format, type, data.length, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, int[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, data.length);
            readnPixels(x, y, width, height, format, type, data.length, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void readnPixels(int x, int y, int width, int height, int format, int type, float[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, data.length);
            readnPixels(x, y, width, height, format, type, data.length, seg);
            RuntimeHelper.toArray(seg, data);
        }
    }

    public static void textureBarrier() {
        try {
            check(glTextureBarrier).invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureBuffer(int texture, int internalFormat, int buffer) {
        try {
            check(glTextureBuffer).invoke(texture, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureBufferRange(int texture, int internalFormat, int buffer, long offset, long size) {
        try {
            check(glTextureBufferRange).invoke(texture, internalFormat, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureParameterIiv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameterIiv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureParameterIiv(int texture, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            textureParameterIiv(texture, pname, session.allocateArray(JAVA_INT, params));
        }
    }

    public static void textureParameterIuiv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameterIuiv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureParameterIuiv(int texture, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            textureParameterIuiv(texture, pname, session.allocateArray(JAVA_INT, params));
        }
    }

    public static void textureParameterf(int texture, int pname, float param) {
        try {
            check(glTextureParameterf).invoke(texture, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureParameterfv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameterfv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void textureParameterfv(int texture, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            textureParameterfv(texture, pname, session.allocateArray(JAVA_FLOAT, params));
        }
    }

    public static void textureParameteri(int texture, int pname, int param) {
        try {
            check(glTextureParameteri).invoke(texture, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureParameteriv(int texture, int pname, Addressable params) {
        try {
            check(glTextureParameteriv).invoke(texture, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureParameteriv(int texture, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            textureParameteriv(texture, pname, session.allocateArray(JAVA_INT, params));
        }
    }

    public static void textureStorage1D(int texture, int levels, int internalFormat, int width) {
        try {
            check(glTextureStorage1D).invoke(texture, levels, internalFormat, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureStorage2D(int texture, int levels, int internalFormat, int width, int height) {
        try {
            check(glTextureStorage2D).invoke(texture, levels, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureStorage2DMultisample(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        try {
            check(glTextureStorage2DMultisample).invoke(texture, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureStorage3D(int texture, int levels, int internalFormat, int width, int height, int depth) {
        try {
            check(glTextureStorage3D).invoke(texture, levels, internalFormat, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureStorage3DMultisample(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        try {
            check(glTextureStorage3DMultisample).invoke(texture, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, Addressable pixels) {
        try {
            check(glTextureSubImage1D).invoke(texture, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage1D(texture, level, xoffset, width, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage1D(texture, level, xoffset, width, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage1D(texture, level, xoffset, width, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }

    public static void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage1D(texture, level, xoffset, width, format, type, session.allocateArray(JAVA_FLOAT, pixels));
        }
    }

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, Addressable pixels) {
        try {
            check(glTextureSubImage2D).invoke(texture, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }

    public static void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, session.allocateArray(JAVA_FLOAT, pixels));
        }
    }

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, Addressable pixels) {
        try {
            check(glTextureSubImage3D).invoke(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_BYTE, pixels));
        }
    }

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_SHORT, pixels));
        }
    }

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_INT, pixels));
        }
    }

    public static void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        try (var session = MemorySession.openShared()) {
            textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, session.allocateArray(JAVA_FLOAT, pixels));
        }
    }

    public static void transformFeedbackBufferBase(int xfb, int index, int buffer) {
        try {
            check(glTransformFeedbackBufferBase).invoke(xfb, index, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void transformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        try {
            check(glTransformFeedbackBufferRange).invoke(xfb, index, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean unmapNamedBuffer(int buffer) {
        try {
            return (boolean) check(glUnmapNamedBuffer).invoke(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayAttribBinding(int vaobj, int attribIndex, int bindingIndex) {
        try {
            check(glVertexArrayAttribBinding).invoke(vaobj, attribIndex, bindingIndex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayAttribFormat(int vaobj, int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        try {
            check(glVertexArrayAttribFormat).invoke(vaobj, attribIndex, size, type, normalized, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayAttribIFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        try {
            check(glVertexArrayAttribIFormat).invoke(vaobj, attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayAttribLFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        try {
            check(glVertexArrayAttribLFormat).invoke(vaobj, attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayBindingDivisor(int vaobj, int bindingIndex, int divisor) {
        try {
            check(glVertexArrayBindingDivisor).invoke(vaobj, bindingIndex, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayElementBuffer(int vaobj, int buffer) {
        try {
            check(glVertexArrayElementBuffer).invoke(vaobj, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayVertexBuffer(int vaobj, int bindingIndex, int buffer, long offset, int stride) {
        try {
            check(glVertexArrayVertexBuffer).invoke(vaobj, bindingIndex, buffer, offset, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayVertexBuffers(int vaobj, int first, int count, Addressable buffers, Addressable offsets, Addressable strides) {
        try {
            check(glVertexArrayVertexBuffers).invoke(vaobj, first, count, buffers, offsets, strides);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void vertexArrayVertexBuffers(int vaobj, int first, int count, int[] buffers, long[] offsets, int[] strides) {
        try (var session = MemorySession.openShared()) {
            vertexArrayVertexBuffers(vaobj, first, count, session.allocateArray(JAVA_INT, buffers), session.allocateArray(JAVA_LONG, offsets), session.allocateArray(JAVA_INT, strides));
        }
    }
}
