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
        glGetVertexArrayIndexediv, glGetVertexArrayiv;

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
            glGetTransformFeedbackiv, glGetVertexArrayIndexed64iv, glGetVertexArrayIndexediv, glGetVertexArrayiv);
    }

    static void load(GLLoadFunc load) {
        // TODO: 58/110 functions
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
}
