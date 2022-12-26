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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.util.GrowableBuffer;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static org.overrun.glib.gl.GL45C.*;

/**
 * {@code GL_ARB_direct_state_access}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBDirectStateAccess {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
    }

    public static void glBindTextureUnit(int unit, int texture) {
        bindTextureUnit(unit, texture);
    }

    public static void glBlitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        blitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    public static int glCheckNamedFramebufferStatus(int framebuffer, int target) {
        return checkNamedFramebufferStatus(framebuffer, target);
    }

    public static void glClearNamedBufferData(int buffer, int internalFormat, int format, int type, MemorySegment data) {
        clearNamedBufferData(buffer, internalFormat, format, type, data);
    }

    public static void glClearNamedBufferSubData(int buffer, int internalFormat, long offset, long size, int format, int type, MemorySegment data) {
        clearNamedBufferSubData(buffer, internalFormat, offset, size, format, type, data);
    }

    public static void glClearNamedFramebufferfi(int framebuffer, int buffer, int drawBuffer, float depth, int stencil) {
        clearNamedFramebufferfi(framebuffer, buffer, drawBuffer, depth, stencil);
    }

    public static void glClearNamedFramebufferfv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        clearNamedFramebufferfv(framebuffer, buffer, drawBuffer, value);
    }

    public static void glClearNamedFramebufferfv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, float[] value) {
        clearNamedFramebufferfv(allocator, framebuffer, buffer, drawBuffer, value);
    }

    public static void glClearNamedFramebufferiv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        clearNamedFramebufferiv(framebuffer, buffer, drawBuffer, value);
    }

    public static void glClearNamedFramebufferiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        clearNamedFramebufferiv(allocator, framebuffer, buffer, drawBuffer, value);
    }

    public static void glClearNamedFramebufferuiv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        clearNamedFramebufferuiv(framebuffer, buffer, drawBuffer, value);
    }

    public static void glClearNamedFramebufferuiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        clearNamedFramebufferuiv(allocator, framebuffer, buffer, drawBuffer, value);
    }

    public static void glCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        compressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        compressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    public static void glCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        compressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCopyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        copyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
    }

    public static void glCopyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        copyTextureSubImage1D(texture, level, xoffset, x, y, width);
    }

    public static void glCopyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        copyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
    }

    public static void glCopyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        copyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    public static void glCreateBuffers(int n, MemorySegment buffers) {
        createBuffers(n, buffers);
    }

    public static void glCreateBuffers(SegmentAllocator allocator, int[] buffers) {
        createBuffers(allocator, buffers);
    }

    public static int glCreateBuffer() {
        return createBuffer();
    }

    public static void glCreateFramebuffers(int n, MemorySegment framebuffers) {
        createFramebuffers(n, framebuffers);
    }

    public static void glCreateFramebuffers(SegmentAllocator allocator, int[] framebuffers) {
        createFramebuffers(allocator, framebuffers);
    }

    public static int glCreateFramebuffer() {
        return createFramebuffer();
    }

    public static void glCreateProgramPipelines(int n, MemorySegment pipelines) {
        createProgramPipelines(n, pipelines);
    }

    public static void glCreateProgramPipelines(SegmentAllocator allocator, int[] pipelines) {
        createProgramPipelines(allocator, pipelines);
    }

    public static int glCreateProgramPipeline() {
        return createProgramPipeline();
    }

    public static void glCreateQueries(int target, int n, MemorySegment ids) {
        createQueries(target, n, ids);
    }

    public static void glCreateQueries(SegmentAllocator allocator, int target, int[] ids) {
        createQueries(allocator, target, ids);
    }

    public static int glCreateQuery(int target) {
        return createQuery(target);
    }

    public static void glCreateRenderbuffers(int n, MemorySegment renderbuffers) {
        createRenderbuffers(n, renderbuffers);
    }

    public static void glCreateRenderbuffers(SegmentAllocator allocator, int[] renderbuffers) {
        createRenderbuffers(allocator, renderbuffers);
    }

    public static int glCreateRenderbuffer() {
        return createRenderbuffer();
    }

    public static void glCreateSamplers(int n, MemorySegment samplers) {
        createSamplers(n, samplers);
    }

    public static void glCreateSamplers(SegmentAllocator allocator, int[] samplers) {
        createSamplers(allocator, samplers);
    }

    public static int glCreateSampler() {
        return createSampler();
    }

    public static void glCreateTextures(int target, int n, MemorySegment textures) {
        createTextures(target, n, textures);
    }

    public static void glCreateTextures(SegmentAllocator allocator, int target, int[] textures) {
        createTextures(allocator, target, textures);
    }

    public static int glCreateTexture(int target) {
        return createTexture(target);
    }

    public static void glCreateTransformFeedbacks(int n, MemorySegment ids) {
        createTransformFeedbacks(n, ids);
    }

    public static void glCreateTransformFeedbacks(SegmentAllocator allocator, int[] ids) {
        createTransformFeedbacks(allocator, ids);
    }

    public static int glCreateTransformFeedback() {
        return createTransformFeedback();
    }

    public static void glCreateVertexArrays(int n, MemorySegment arrays) {
        createVertexArrays(n, arrays);
    }

    public static void glCreateVertexArrays(SegmentAllocator allocator, int[] arrays) {
        createVertexArrays(allocator, arrays);
    }

    public static int glCreateVertexArray() {
        return createVertexArray();
    }

    public static void glDisableVertexArrayAttrib(int vaobj, int index) {
        disableVertexArrayAttrib(vaobj, index);
    }

    public static void glEnableVertexArrayAttrib(int vaobj, int index) {
        enableVertexArrayAttrib(vaobj, index);
    }

    public static void glFlushMappedNamedBufferRange(int buffer, long offset, long length) {
        flushMappedNamedBufferRange(buffer, offset, length);
    }

    public static void glGenerateTextureMipmap(int texture) {
        generateTextureMipmap(texture);
    }

    public static void glGetCompressedTextureImage(int texture, int level, int bufSize, MemorySegment pixels) {
        getCompressedTextureImage(texture, level, bufSize, pixels);
    }

    public static void glGetNamedBufferParameteri64v(int buffer, int pname, MemorySegment params) {
        getNamedBufferParameteri64v(buffer, pname, params);
    }

    public static long glGetNamedBufferParameteri64(int buffer, int pname) {
        return getNamedBufferParameteri64(buffer, pname);
    }

    public static void glGetNamedBufferParameteriv(int buffer, int pname, MemorySegment params) {
        getNamedBufferParameteriv(buffer, pname, params);
    }

    public static int glGetNamedBufferParameteri(int buffer, int pname) {
        return getNamedBufferParameteri(buffer, pname);
    }

    public static void glGetNamedBufferPointerv(int target, int pname, MemorySegment params) {
        getNamedBufferPointerv(target, pname, params);
    }

    public static MemorySegment glGetNamedBufferPointer(int target, int pname) {
        return getNamedBufferPointer(target, pname);
    }

    public static void glGetNamedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        getNamedBufferSubData(buffer, offset, size, data);
    }

    public static void glGetNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, byte[] data) {
        getNamedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glGetNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, short[] data) {
        getNamedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glGetNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, int[] data) {
        getNamedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glGetNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, long[] data) {
        getNamedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glGetNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, float[] data) {
        getNamedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glGetNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, double[] data) {
        getNamedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, MemorySegment params) {
        getNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    public static int glGetNamedFramebufferAttachmentParameteri(int framebuffer, int attachment, int pname) {
        return getNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
    }

    public static void glGetNamedFramebufferParameteriv(int framebuffer, int pname, MemorySegment param) {
        getNamedFramebufferParameteriv(framebuffer, pname, param);
    }

    public static int glGetNamedFramebufferParameteri(int framebuffer, int pname) {
        return getNamedFramebufferParameteri(framebuffer, pname);
    }

    public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, MemorySegment params) {
        getNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    public static void glGetNamedRenderbufferParameteriv(int renderbuffer, int pname, int[] params) {
        getNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    public static int glGetNamedRenderbufferParameteri(int renderbuffer, int pname) {
        return getNamedRenderbufferParameteri(renderbuffer, pname);
    }

    public static void glGetQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        getQueryBufferObjecti64v(id, buffer, pname, offset);
    }

    public static void glGetQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        getQueryBufferObjectiv(id, buffer, pname, offset);
    }

    public static void glGetQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        getQueryBufferObjectui64v(id, buffer, pname, offset);
    }

    public static void glGetQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        getQueryBufferObjectuiv(id, buffer, pname, offset);
    }

    public static void glGetTextureImage(int texture, int level, int format, int type, int bufSize, MemorySegment pixels) {
        getTextureImage(texture, level, format, type, bufSize, pixels);
    }

    public static void glGetTextureLevelParameterfv(int texture, int level, int pname, MemorySegment params) {
        getTextureLevelParameterfv(texture, level, pname, params);
    }

    public static void glGetTextureLevelParameterfv(SegmentAllocator allocator, int texture, int level, int pname, float[] params) {
        getTextureLevelParameterfv(allocator, texture, level, pname, params);
    }

    public static float glGetTextureLevelParameterf(int texture, int level, int pname) {
        return getTextureLevelParameterf(texture, level, pname);
    }

    public static void glGetTextureLevelParameteriv(int texture, int level, int pname, MemorySegment params) {
        getTextureLevelParameteriv(texture, level, pname, params);
    }

    public static void glGetTextureLevelParameteriv(SegmentAllocator allocator, int texture, int level, int pname, int[] params) {
        getTextureLevelParameteriv(allocator, texture, level, pname, params);
    }

    public static int glGetTextureLevelParameteri(int texture, int level, int pname) {
        return getTextureLevelParameteri(texture, level, pname);
    }

    public static void glGetTextureParameterIiv(int texture, int pname, MemorySegment params) {
        getTextureParameterIiv(texture, pname, params);
    }

    public static void glGetTextureParameterIiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        getTextureParameterIiv(allocator, texture, pname, params);
    }

    public static int glGetTextureParameterIi(int texture, int pname) {
        return getTextureParameterIi(texture, pname);
    }

    public static void glGetTextureParameterIuiv(int texture, int pname, MemorySegment params) {
        getTextureParameterIuiv(texture, pname, params);
    }

    public static void glGetTextureParameterIuiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        getTextureParameterIuiv(allocator, texture, pname, params);
    }

    public static int glGetTextureParameterIui(int texture, int pname) {
        return getTextureParameterIui(texture, pname);
    }

    public static void glGetTextureParameterfv(int texture, int pname, MemorySegment params) {
        getTextureParameterfv(texture, pname, params);
    }

    public static void glGetTextureParameterfv(SegmentAllocator allocator, int texture, int pname, float[] params) {
        getTextureParameterfv(allocator, texture, pname, params);
    }

    public static float glGetTextureParameterf(int texture, int pname) {
        return getTextureParameterf(texture, pname);
    }

    public static void glGetTextureParameteriv(int texture, int pname, MemorySegment params) {
        getTextureParameteriv(texture, pname, params);
    }

    public static void glGetTextureParameteriv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        getTextureParameteriv(allocator, texture, pname, params);
    }

    public static int glGetTextureParameteri(int texture, int pname) {
        return getTextureParameteri(texture, pname);
    }

    public static void glGetTransformFeedbacki64_v(int xfb, int pname, int index, MemorySegment param) {
        getTransformFeedbacki64_v(xfb, pname, index, param);
    }

    public static void glGetTransformFeedbacki64_v(SegmentAllocator allocator, int xfb, int pname, int index, long[] param) {
        getTransformFeedbacki64_v(allocator, xfb, pname, index, param);
    }

    public static void glGetTransformFeedbacki_v(int xfb, int pname, int index, MemorySegment param) {
        getTransformFeedbacki_v(xfb, pname, index, param);
    }

    public static void glGetTransformFeedbacki_v(SegmentAllocator allocator, int xfb, int pname, int index, int[] param) {
        getTransformFeedbacki_v(allocator, xfb, pname, index, param);
    }

    public static void glGetTransformFeedbackiv(int xfb, int pname, MemorySegment param) {
        getTransformFeedbackiv(xfb, pname, param);
    }

    public static void glGetTransformFeedbackiv(SegmentAllocator allocator, int xfb, int pname, int[] param) {
        getTransformFeedbackiv(allocator, xfb, pname, param);
    }

    public static void glGetVertexArrayIndexed64iv(int vaobj, int index, int pname, MemorySegment param) {
        getVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    public static long glGetVertexArrayIndexed64i(int vaobj, int index, int pname) {
        return getVertexArrayIndexed64i(vaobj, index, pname);
    }

    public static void glGetVertexArrayIndexediv(int vaobj, int index, int pname, MemorySegment param) {
        getVertexArrayIndexediv(vaobj, index, pname, param);
    }

    public static int glGetVertexArrayIndexedi(int vaobj, int index, int pname) {
        return getVertexArrayIndexedi(vaobj, index, pname);
    }

    public static void glGetVertexArrayiv(int vaobj, int pname, MemorySegment param) {
        getVertexArrayiv(vaobj, pname, param);
    }

    public static int glGetVertexArrayi(int vaobj, int pname) {
        return getVertexArrayi(vaobj, pname);
    }

    public static void glInvalidateNamedFramebufferData(int framebuffer, int numAttachments, MemorySegment attachments) {
        invalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
    }

    public static void glInvalidateNamedFramebufferData(SegmentAllocator allocator, int framebuffer, int[] attachments) {
        invalidateNamedFramebufferData(allocator, framebuffer, attachments);
    }

    public static void glInvalidateNamedFramebufferData(int framebuffer, int attachment) {
        invalidateNamedFramebufferData(framebuffer, attachment);
    }

    public static void glInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        invalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
    }

    public static void glInvalidateNamedFramebufferSubData(SegmentAllocator allocator, int framebuffer, int[] attachments, int x, int y, int width, int height) {
        invalidateNamedFramebufferSubData(allocator, framebuffer, attachments, x, y, width, height);
    }

    public static void glInvalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
        invalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
    }

    public static MemorySegment glMapNamedBuffer(int buffer, int access) {
        return mapNamedBuffer(buffer, access);
    }

    public static MemorySegment glMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return mapNamedBufferRange(buffer, offset, length, access);
    }

    public static void glNamedBufferData(int buffer, long size, MemorySegment data, int usage) {
        namedBufferData(buffer, size, data, usage);
    }

    public static void glNamedBufferData(int buffer, MemorySegment data, int usage) {
        namedBufferData(buffer, data, usage);
    }

    public static void glNamedBufferData(int buffer, GrowableBuffer data, int usage) {
        namedBufferData(buffer, data, usage);
    }

    public static void glNamedBufferData(int buffer, long size, int usage) {
        namedBufferData(buffer, size, usage);
    }

    public static void glNamedBufferData(SegmentAllocator allocator, int buffer, byte[] data, int usage) {
        namedBufferData(allocator, buffer, data, usage);
    }

    public static void glNamedBufferData(SegmentAllocator allocator, int buffer, short[] data, int usage) {
        namedBufferData(allocator, buffer, data, usage);
    }

    public static void glNamedBufferData(SegmentAllocator allocator, int buffer, int[] data, int usage) {
        namedBufferData(allocator, buffer, data, usage);
    }

    public static void glNamedBufferData(SegmentAllocator allocator, int buffer, long[] data, int usage) {
        namedBufferData(allocator, buffer, data, usage);
    }

    public static void glNamedBufferData(SegmentAllocator allocator, int buffer, float[] data, int usage) {
        namedBufferData(allocator, buffer, data, usage);
    }

    public static void glNamedBufferData(SegmentAllocator allocator, int buffer, double[] data, int usage) {
        namedBufferData(allocator, buffer, data, usage);
    }

    public static void glNamedBufferStorage(int buffer, long size, MemorySegment data, int flags) {
        namedBufferStorage(buffer, size, data, flags);
    }

    public static void glNamedBufferStorage(int buffer, long size, int flags) {
        namedBufferStorage(buffer, size, flags);
    }

    public static void glNamedBufferStorage(SegmentAllocator allocator, int buffer, byte[] data, int flags) {
        namedBufferStorage(allocator, buffer, data, flags);
    }

    public static void glNamedBufferStorage(SegmentAllocator allocator, int buffer, short[] data, int flags) {
        namedBufferStorage(allocator, buffer, data, flags);
    }

    public static void glNamedBufferStorage(SegmentAllocator allocator, int buffer, int[] data, int flags) {
        namedBufferStorage(allocator, buffer, data, flags);
    }

    public static void glNamedBufferStorage(SegmentAllocator allocator, int buffer, long[] data, int flags) {
        namedBufferStorage(allocator, buffer, data, flags);
    }

    public static void glNamedBufferStorage(SegmentAllocator allocator, int buffer, float[] data, int flags) {
        namedBufferStorage(allocator, buffer, data, flags);
    }

    public static void glNamedBufferStorage(SegmentAllocator allocator, int buffer, double[] data, int flags) {
        namedBufferStorage(allocator, buffer, data, flags);
    }

    public static void glNamedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        namedBufferSubData(buffer, offset, size, data);
    }

    public static void glNamedBufferSubData(int buffer, long offset, MemorySegment data) {
        namedBufferSubData(buffer, offset, data);
    }

    public static void glNamedBufferSubData(int buffer, long offset, GrowableBuffer data) {
        namedBufferSubData(buffer, offset, data);
    }

    public static void glNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, byte[] data) {
        namedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, short[] data) {
        namedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, int[] data) {
        namedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, long[] data) {
        namedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, float[] data) {
        namedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, double[] data) {
        namedBufferSubData(allocator, buffer, offset, data);
    }

    public static void glNamedFramebufferDrawBuffer(int framebuffer, int buf) {
        namedFramebufferDrawBuffer(framebuffer, buf);
    }

    public static void glNamedFramebufferDrawBuffers(int framebuffer, int n, MemorySegment bufs) {
        namedFramebufferDrawBuffers(framebuffer, n, bufs);
    }

    public static void glNamedFramebufferDrawBuffers(SegmentAllocator allocator, int framebuffer, int[] bufs) {
        namedFramebufferDrawBuffers(allocator, framebuffer, bufs);
    }

    public static void glNamedFramebufferParameteri(int framebuffer, int pname, int param) {
        namedFramebufferParameteri(framebuffer, pname, param);
    }

    public static void glNamedFramebufferReadBuffer(int framebuffer, int src) {
        namedFramebufferReadBuffer(framebuffer, src);
    }

    public static void glNamedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbufferTarget, int renderbuffer) {
        namedFramebufferRenderbuffer(framebuffer, attachment, renderbufferTarget, renderbuffer);
    }

    public static void glNamedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        namedFramebufferTexture(framebuffer, attachment, texture, level);
    }

    public static void glNamedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        namedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
    }

    public static void glNamedRenderbufferStorage(int renderbuffer, int internalFormat, int width, int height) {
        namedRenderbufferStorage(renderbuffer, internalFormat, width, height);
    }

    public static void glNamedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalFormat, int width, int height) {
        namedRenderbufferStorageMultisample(renderbuffer, samples, internalFormat, width, height);
    }

    public static void glTextureBuffer(int texture, int internalFormat, int buffer) {
        textureBuffer(texture, internalFormat, buffer);
    }

    public static void glTextureBufferRange(int texture, int internalFormat, int buffer, long offset, long size) {
        textureBufferRange(texture, internalFormat, buffer, offset, size);
    }

    public static void glTextureParameterIiv(int texture, int pname, MemorySegment params) {
        textureParameterIiv(texture, pname, params);
    }

    public static void glTextureParameterIiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameterIiv(allocator, texture, pname, params);
    }

    public static void glTextureParameterIuiv(int texture, int pname, MemorySegment params) {
        textureParameterIuiv(texture, pname, params);
    }

    public static void glTextureParameterIuiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameterIuiv(allocator, texture, pname, params);
    }

    public static void glTextureParameterf(int texture, int pname, float param) {
        textureParameterf(texture, pname, param);
    }

    public static void glTextureParameterfv(int texture, int pname, MemorySegment params) {
        textureParameterfv(texture, pname, params);
    }

    public static void glTextureParameterfv(SegmentAllocator allocator, int texture, int pname, float[] params) {
        textureParameterfv(allocator, texture, pname, params);
    }

    public static void glTextureParameteri(int texture, int pname, int param) {
        textureParameteri(texture, pname, param);
    }

    public static void glTextureParameteriv(int texture, int pname, MemorySegment params) {
        textureParameteriv(texture, pname, params);
    }

    public static void glTextureParameteriv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        textureParameteriv(allocator, texture, pname, params);
    }

    public static void glTextureStorage1D(int texture, int levels, int internalFormat, int width) {
        textureStorage1D(texture, levels, internalFormat, width);
    }

    public static void glTextureStorage2D(int texture, int levels, int internalFormat, int width, int height) {
        textureStorage2D(texture, levels, internalFormat, width, height);
    }

    public static void glTextureStorage2DMultisample(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        textureStorage2DMultisample(texture, samples, internalFormat, width, height, fixedSampleLocations);
    }

    public static void glTextureStorage3D(int texture, int levels, int internalFormat, int width, int height, int depth) {
        textureStorage3D(texture, levels, internalFormat, width, height, depth);
    }

    public static void glTextureStorage3DMultisample(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        textureStorage3DMultisample(texture, samples, internalFormat, width, height, depth, fixedSampleLocations);
    }

    public static void glTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        textureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        textureSubImage1D(allocator, texture, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
        textureSubImage1D(allocator, texture, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
        textureSubImage1D(allocator, texture, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
        textureSubImage1D(allocator, texture, level, xoffset, width, format, type, pixels);
    }

    public static void glTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        textureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        textureSubImage2D(allocator, texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        textureSubImage2D(allocator, texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        textureSubImage2D(allocator, texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        textureSubImage2D(allocator, texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    public static void glTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        textureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTextureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        textureSubImage3D(allocator, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTextureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        textureSubImage3D(allocator, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTextureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        textureSubImage3D(allocator, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTextureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        textureSubImage3D(allocator, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTransformFeedbackBufferBase(int xfb, int index, int buffer) {
        transformFeedbackBufferBase(xfb, index, buffer);
    }

    public static void glTransformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        transformFeedbackBufferRange(xfb, index, buffer, offset, size);
    }

    public static boolean glUnmapNamedBuffer(int buffer) {
        return unmapNamedBuffer(buffer);
    }

    public static void glVertexArrayAttribBinding(int vaobj, int attribIndex, int bindingIndex) {
        vertexArrayAttribBinding(vaobj, attribIndex, bindingIndex);
    }

    public static void glVertexArrayAttribFormat(int vaobj, int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        vertexArrayAttribFormat(vaobj, attribIndex, size, type, normalized, relativeOffset);
    }

    public static void glVertexArrayAttribIFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        vertexArrayAttribIFormat(vaobj, attribIndex, size, type, relativeOffset);
    }

    public static void glVertexArrayAttribLFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        vertexArrayAttribLFormat(vaobj, attribIndex, size, type, relativeOffset);
    }

    public static void glVertexArrayBindingDivisor(int vaobj, int bindingIndex, int divisor) {
        vertexArrayBindingDivisor(vaobj, bindingIndex, divisor);
    }

    public static void glVertexArrayElementBuffer(int vaobj, int buffer) {
        vertexArrayElementBuffer(vaobj, buffer);
    }

    public static void glVertexArrayVertexBuffer(int vaobj, int bindingIndex, int buffer, long offset, int stride) {
        vertexArrayVertexBuffer(vaobj, bindingIndex, buffer, offset, stride);
    }

    public static void glVertexArrayVertexBuffers(int vaobj, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        vertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
    }

    public static void glVertexArrayVertexBuffers(SegmentAllocator allocator, int vaobj, int first, int count, int[] buffers, long[] offsets, int[] strides) {
        vertexArrayVertexBuffers(allocator, vaobj, first, count, buffers, offsets, strides);
    }
}
