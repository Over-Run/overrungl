/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import io.github.overrun.memstack.MemoryStack;
import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBRobustness;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

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
public interface GL45C extends DirectAccess {
    int CONTEXT_LOST = 0x0507;
    int NEGATIVE_ONE_TO_ONE = 0x935E;
    int ZERO_TO_ONE = 0x935F;
    int CLIP_ORIGIN = 0x935C;
    int CLIP_DEPTH_MODE = 0x935D;
    int QUERY_WAIT_INVERTED = 0x8E17;
    int QUERY_NO_WAIT_INVERTED = 0x8E18;
    int QUERY_BY_REGION_WAIT_INVERTED = 0x8E19;
    int QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;
    int MAX_CULL_DISTANCES = 0x82F9;
    int MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;
    int TEXTURE_TARGET = 0x1006;
    int QUERY_TARGET = 0x82EA;
    int GUILTY_CONTEXT_RESET = 0x8253;
    int INNOCENT_CONTEXT_RESET = 0x8254;
    int UNKNOWN_CONTEXT_RESET = 0x8255;
    int RESET_NOTIFICATION_STRATEGY = 0x8256;
    int LOSE_CONTEXT_ON_RESET = 0x8252;
    int NO_RESET_NOTIFICATION = 0x8261;
    int CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x00000004;
    int CONTEXT_RELEASE_BEHAVIOR = 0x82FB;
    int CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

    @Entrypoint("glBindTextureUnit")
    default void bindTextureUnit(int unit, int texture) {
        throw new ContextException();
    }

    @Entrypoint("glBlitNamedFramebuffer")
    default void blitNamedFramebuffer(int readFramebuffer, int drawFramebuffer, int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        throw new ContextException();
    }

    @Entrypoint("glCheckNamedFramebufferStatus")
    default int checkNamedFramebufferStatus(int framebuffer, int target) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedBufferData")
    default void clearNamedBufferData(int buffer, int internalFormat, int format, int type, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedBufferSubData")
    default void clearNamedBufferSubData(int buffer, int internalFormat, long offset, long size, int format, int type, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferfi")
    default void clearNamedFramebufferfi(int framebuffer, int buffer, int drawBuffer, float depth, int stencil) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferfv")
    default void clearNamedFramebufferfv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferfv")
    default void clearNamedFramebufferfv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, float[] value) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferiv")
    default void clearNamedFramebufferiv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferiv")
    default void clearNamedFramebufferiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferuiv")
    default void clearNamedFramebufferuiv(int framebuffer, int buffer, int drawBuffer, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glClearNamedFramebufferuiv")
    default void clearNamedFramebufferuiv(SegmentAllocator allocator, int framebuffer, int buffer, int drawBuffer, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glClipControl")
    default void clipControl(int origin, int depth) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTextureSubImage1D")
    default void compressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTextureSubImage2D")
    default void compressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCompressedTextureSubImage3D")
    default void compressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCopyNamedBufferSubData")
    default void copyNamedBufferSubData(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTextureSubImage1D")
    default void copyTextureSubImage1D(int texture, int level, int xoffset, int x, int y, int width) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTextureSubImage2D")
    default void copyTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glCopyTextureSubImage3D")
    default void copyTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glCreateBuffers")
    default void createBuffers(int n, MemorySegment buffers) {
        throw new ContextException();
    }

    @Skip
    default void createBuffers(SegmentAllocator allocator, @Ref int[] buffers) {
        var seg = Marshal.marshal(allocator, buffers);
        createBuffers(buffers.length, seg);
        Unmarshal.copy(seg, buffers);
    }

    @Skip
    default int createBuffers() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createBuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateFramebuffers")
    default void createFramebuffers(int n, MemorySegment framebuffers) {
        throw new ContextException();
    }

    @Skip
    default void createFramebuffers(SegmentAllocator allocator, @Ref int[] framebuffers) {
        var seg = Marshal.marshal(allocator, framebuffers);
        createFramebuffers(framebuffers.length, seg);
        Unmarshal.copy(seg, framebuffers);
    }

    @Skip
    default int createFramebuffers() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateProgramPipelines")
    default void createProgramPipelines(int n, MemorySegment pipelines) {
        throw new ContextException();
    }

    @Skip
    default void createProgramPipelines(SegmentAllocator allocator, @Ref int[] pipelines) {
        var seg = Marshal.marshal(allocator, pipelines);
        createProgramPipelines(pipelines.length, seg);
        Unmarshal.copy(seg, pipelines);
    }

    @Skip
    default int createProgramPipelines() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateQueries")
    default void createQueries(int target, int n, MemorySegment ids) {
        throw new ContextException();
    }

    @Skip
    default void createQueries(SegmentAllocator allocator, int target, @Ref int[] ids) {
        var seg = Marshal.marshal(allocator, ids);
        createQueries(target, ids.length, seg);
        Unmarshal.copy(seg, ids);
    }

    @Skip
    default int createQueries(int target) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createQueries(target, 1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateRenderbuffers")
    default void createRenderbuffers(int n, MemorySegment renderbuffers) {
        throw new ContextException();
    }

    @Skip
    default void createRenderbuffers(SegmentAllocator allocator, @Ref int[] renderbuffers) {
        var seg = Marshal.marshal(allocator, renderbuffers);
        createRenderbuffers(renderbuffers.length, seg);
        Unmarshal.copy(seg, renderbuffers);
    }

    @Skip
    default int createRenderbuffers() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateSamplers")
    default void createSamplers(int n, MemorySegment samplers) {
        throw new ContextException();
    }

    @Skip
    default void createSamplers(SegmentAllocator allocator, @Ref int[] samplers) {
        var seg = Marshal.marshal(allocator, samplers);
        createSamplers(samplers.length, seg);
        Unmarshal.copy(seg, samplers);
    }

    @Skip
    default int createSamplers() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createSamplers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateTextures")
    default void createTextures(int target, int n, MemorySegment textures) {
        throw new ContextException();
    }

    @Skip
    default void createTextures(SegmentAllocator allocator, int target, @Ref int[] textures) {
        var pTex = Marshal.marshal(allocator, textures);
        createTextures(target, textures.length, pTex);
        Unmarshal.copy(pTex, textures);
    }

    @Skip
    default int createTextures(int target) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pTex = stack.allocate(JAVA_INT);
            createTextures(target, 1, pTex);
            return pTex.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateTransformFeedbacks")
    default void createTransformFeedbacks(int n, MemorySegment ids) {
        throw new ContextException();
    }

    @Skip
    default void createTransformFeedbacks(SegmentAllocator allocator, @Ref int[] ids) {
        var seg = Marshal.marshal(allocator, ids);
        createTransformFeedbacks(ids.length, seg);
        Unmarshal.copy(seg, ids);
    }

    @Skip
    default int createTransformFeedbacks() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createTransformFeedbacks(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glCreateVertexArrays")
    default void createVertexArrays(int n, MemorySegment arrays) {
        throw new ContextException();
    }

    @Skip
    default void createVertexArrays(SegmentAllocator allocator, @Ref int[] arrays) {
        var seg = Marshal.marshal(allocator, arrays);
        createVertexArrays(arrays.length, seg);
        Unmarshal.copy(seg, arrays);
    }

    @Skip
    default int createVertexArrays() {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            createVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glDisableVertexArrayAttrib")
    default void disableVertexArrayAttrib(int vaobj, int index) {
        throw new ContextException();
    }

    @Entrypoint("glEnableVertexArrayAttrib")
    default void enableVertexArrayAttrib(int vaobj, int index) {
        throw new ContextException();
    }

    @Entrypoint("glFlushMappedNamedBufferRange")
    default void flushMappedNamedBufferRange(int buffer, long offset, long length) {
        throw new ContextException();
    }

    @Entrypoint("glGenerateTextureMipmap")
    default void generateTextureMipmap(int texture) {
        throw new ContextException();
    }

    @Entrypoint("glGetCompressedTextureImage")
    default void getCompressedTextureImage(int texture, int level, int bufSize, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glGetCompressedTextureSubImage")
    default void getCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glGetGraphicsResetStatus")
    default int getGraphicsResetStatus() {
        throw new ContextException();
    }

    @Entrypoint("glGetNamedBufferParameteri64v")
    default void getNamedBufferParameteri64v(int buffer, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default long getNamedBufferParameteri64v(int buffer, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_LONG);
            getNamedBufferParameteri64v(buffer, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetNamedBufferParameteriv")
    default void getNamedBufferParameteriv(int buffer, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getNamedBufferParameteriv(int buffer, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getNamedBufferParameteriv(buffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetNamedBufferPointerv")
    default void getNamedBufferPointerv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default MemorySegment getNamedBufferPointerv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(ADDRESS);
            getNamedBufferPointerv(target, pname, seg);
            return seg.get(ADDRESS, 0);
        }
    }

    @Entrypoint("glGetNamedBufferSubData")
    default void getNamedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        throw new ContextException();
    }

    @Skip
    default void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, @Ref byte[] data) {
        var seg = Marshal.marshal(allocator, data);
        getNamedBufferSubData(buffer, offset, seg.byteSize(), seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, @Ref short[] data) {
        var seg = Marshal.marshal(allocator, data);
        getNamedBufferSubData(buffer, offset, seg.byteSize(), seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, @Ref int[] data) {
        var seg = Marshal.marshal(allocator, data);
        getNamedBufferSubData(buffer, offset, seg.byteSize(), seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, @Ref long[] data) {
        var seg = Marshal.marshal(allocator, data);
        getNamedBufferSubData(buffer, offset, seg.byteSize(), seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, @Ref float[] data) {
        var seg = Marshal.marshal(allocator, data);
        getNamedBufferSubData(buffer, offset, seg.byteSize(), seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void getNamedBufferSubData(SegmentAllocator allocator, int buffer, long offset, @Ref double[] data) {
        var seg = Marshal.marshal(allocator, data);
        getNamedBufferSubData(buffer, offset, seg.byteSize(), seg);
        Unmarshal.copy(seg, data);
    }

    @Entrypoint("glGetNamedFramebufferAttachmentParameteriv")
    default void getNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetNamedFramebufferParameteriv")
    default void getNamedFramebufferParameteriv(int framebuffer, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Skip
    default int getNamedFramebufferParameteriv(int framebuffer, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getNamedFramebufferParameteriv(framebuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetNamedRenderbufferParameteriv")
    default void getNamedRenderbufferParameteriv(int renderbuffer, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetNamedRenderbufferParameteriv")
    default void getNamedRenderbufferParameteriv(int renderbuffer, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getNamedRenderbufferParameteriv(int renderbuffer, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getNamedRenderbufferParameteriv(renderbuffer, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetQueryBufferObjecti64v")
    default void getQueryBufferObjecti64v(int id, int buffer, int pname, long offset) {
        throw new ContextException();
    }

    @Entrypoint("glGetQueryBufferObjectiv")
    default void getQueryBufferObjectiv(int id, int buffer, int pname, long offset) {
        throw new ContextException();
    }

    @Entrypoint("glGetQueryBufferObjectui64v")
    default void getQueryBufferObjectui64v(int id, int buffer, int pname, long offset) {
        throw new ContextException();
    }

    @Entrypoint("glGetQueryBufferObjectuiv")
    default void getQueryBufferObjectuiv(int id, int buffer, int pname, long offset) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureImage")
    default void getTextureImage(int texture, int level, int format, int type, int bufSize, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureLevelParameterfv")
    default void getTextureLevelParameterfv(int texture, int level, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureLevelParameterfv")
    default void getTextureLevelParameterfv(SegmentAllocator allocator, int texture, int level, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getTextureLevelParameterfv(int texture, int level, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getTextureLevelParameterfv(texture, level, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetTextureLevelParameteriv")
    default void getTextureLevelParameteriv(int texture, int level, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureLevelParameteriv")
    default void getTextureLevelParameteriv(SegmentAllocator allocator, int texture, int level, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTextureLevelParameteriv(int texture, int level, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getTextureLevelParameteriv(texture, level, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTextureParameterIiv")
    default void getTextureParameterIiv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureParameterIiv")
    default void getTextureParameterIiv(SegmentAllocator allocator, int texture, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTextureParameterIiv(int texture, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getTextureParameterIiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTextureParameterIuiv")
    default void getTextureParameterIuiv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureParameterIuiv")
    default void getTextureParameterIuiv(SegmentAllocator allocator, int texture, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTextureParameterIuiv(int texture, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getTextureParameterIuiv(texture, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTextureParameterfv")
    default void getTextureParameterfv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureParameterfv")
    default void getTextureParameterfv(SegmentAllocator allocator, int texture, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getTextureParameterfv(int texture, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_FLOAT);
            getTextureParameterfv(texture, pname, pParams);
            return pParams.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetTextureParameteriv")
    default void getTextureParameteriv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTextureParameteriv")
    default void getTextureParameteriv(SegmentAllocator allocator, int texture, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTextureParameteriv(int texture, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var pParams = stack.allocate(JAVA_INT);
            getTextureParameteriv(texture, pname, pParams);
            return pParams.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTextureSubImage")
    default void getTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, MemorySegment pixels) {
        throw new ContextException();
    }

    @Skip
    default void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Ref byte[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Skip
    default void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Ref short[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Skip
    default void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Ref int[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Skip
    default void getTextureSubImage(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @Ref float[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Entrypoint("glGetTransformFeedbacki64_v")
    default void getTransformFeedbacki64_v(int xfb, int pname, int index, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glGetTransformFeedbacki64_v")
    default void getTransformFeedbacki64_v(SegmentAllocator allocator, int xfb, int pname, int index, @Ref long[] param) {
        throw new ContextException();
    }

    @Entrypoint("glGetTransformFeedbacki_v")
    default void getTransformFeedbacki_v(int xfb, int pname, int index, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glGetTransformFeedbacki_v")
    default void getTransformFeedbacki_v(SegmentAllocator allocator, int xfb, int pname, int index, @Ref int[] param) {
        throw new ContextException();
    }

    @Entrypoint("glGetTransformFeedbackiv")
    default void getTransformFeedbackiv(int xfb, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Entrypoint("glGetTransformFeedbackiv")
    default void getTransformFeedbackiv(SegmentAllocator allocator, int xfb, int pname, @Ref int[] param) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexArrayIndexed64iv")
    default void getVertexArrayIndexed64iv(int vaobj, int index, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Skip
    default long getVertexArrayIndexed64iv(int vaobj, int index, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_LONG);
            getVertexArrayIndexed64iv(vaobj, index, pname, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetVertexArrayIndexediv")
    default void getVertexArrayIndexediv(int vaobj, int index, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Skip
    default int getVertexArrayIndexediv(int vaobj, int index, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getVertexArrayIndexediv(vaobj, index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetVertexArrayiv")
    default void getVertexArrayiv(int vaobj, int pname, MemorySegment param) {
        throw new ContextException();
    }

    @Skip
    default int getVertexArrayiv(int vaobj, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getVertexArrayiv(vaobj, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetnCompressedTexImage")
    default void getnCompressedTexImage(int target, int lod, int bufSize, MemorySegment pixels) {
        throw new ContextException();
    }

    @Skip
    default void getnCompressedTexImage(int target, int lod, MemorySegment pixels) {
        getnCompressedTexImage(target, lod, Math.toIntExact(pixels.byteSize()), pixels);
    }

    @Entrypoint("glGetnTexImage")
    default void getnTexImage(int target, int level, int format, int type, int bufSize, MemorySegment pixels) {
        throw new ContextException();
    }

    @Skip
    default void getnTexImage(int target, int level, int format, int type, MemorySegment pixels) {
        getnTexImage(target, level, format, type, Math.toIntExact(pixels.byteSize()), pixels);
    }

    @Skip
    default void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, @Ref byte[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getnTexImage(target, level, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Skip
    default void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, @Ref short[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getnTexImage(target, level, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Skip
    default void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, @Ref int[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getnTexImage(target, level, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Skip
    default void getnTexImage(SegmentAllocator allocator, int target, int level, int format, int type, @Ref float[] pixels) {
        var seg = Marshal.marshal(allocator, pixels);
        getnTexImage(target, level, format, type, pixels.length, seg);
        Unmarshal.copy(seg, pixels);
    }

    @Entrypoint("glGetnUniformdv")
    default void getnUniformdv(int program, int location, int bufSize, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getnUniformdv(int program, int location, MemorySegment params) {
        getnUniformdv(program, location, Math.toIntExact(params.byteSize()), params);
    }

    @Skip
    default void getnUniformdv(SegmentAllocator allocator, int program, int location, @Ref double[] params) {
        var seg = Marshal.marshal(allocator, params);
        getnUniformdv(program, location, params.length, seg);
        Unmarshal.copy(seg, params);
    }

    @Entrypoint("glGetnUniformfv")
    default void getnUniformfv(int program, int location, int bufSize, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getnUniformfv(int program, int location, MemorySegment params) {
        getnUniformfv(program, location, Math.toIntExact(params.byteSize()), params);
    }

    @Skip
    default void getnUniformfv(SegmentAllocator allocator, int program, int location, @Ref float[] params) {
        var seg = Marshal.marshal(allocator, params);
        getnUniformfv(program, location, params.length, seg);
        Unmarshal.copy(seg, params);
    }

    @Entrypoint("glGetnUniformiv")
    default void getnUniformiv(int program, int location, int bufSize, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getnUniformiv(int program, int location, MemorySegment params) {
        getnUniformiv(program, location, Math.toIntExact(params.byteSize()), params);
    }

    @Skip
    default void getnUniformiv(SegmentAllocator allocator, int program, int location, @Ref int[] params) {
        var seg = Marshal.marshal(allocator, params);
        getnUniformiv(program, location, params.length, seg);
        Unmarshal.copy(seg, params);
    }

    @Entrypoint("glGetnUniformuiv")
    default void getnUniformuiv(int program, int location, int bufSize, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getnUniformuiv(int program, int location, MemorySegment params) {
        getnUniformuiv(program, location, Math.toIntExact(params.byteSize()), params);
    }

    @Skip
    default void getnUniformuiv(SegmentAllocator allocator, int program, int location, @Ref int[] params) {
        var seg = Marshal.marshal(allocator, params);
        getnUniformuiv(program, location, params.length, seg);
        Unmarshal.copy(seg, params);
    }

    @Entrypoint("glInvalidateNamedFramebufferData")
    default void invalidateNamedFramebufferData(int framebuffer, int numAttachments, MemorySegment attachments) {
        throw new ContextException();
    }

    @Skip
    default void invalidateNamedFramebufferData(SegmentAllocator allocator, int framebuffer, int[] attachments) {
        invalidateNamedFramebufferData(framebuffer, attachments.length, Marshal.marshal(allocator, attachments));
    }

    @Skip
    default void invalidateNamedFramebufferData(int framebuffer, int attachment) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            invalidateNamedFramebufferData(framebuffer, 1, stack.allocateFrom(JAVA_INT, attachment));
        }
    }

    @Entrypoint("glInvalidateNamedFramebufferSubData")
    default void invalidateNamedFramebufferSubData(int framebuffer, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Skip
    default void invalidateNamedFramebufferSubData(SegmentAllocator allocator, int framebuffer, int[] attachments, int x, int y, int width, int height) {
        invalidateNamedFramebufferSubData(framebuffer, attachments.length, Marshal.marshal(allocator, attachments), x, y, width, height);
    }

    @Skip
    default void invalidateNamedFramebufferSubData(int framebuffer, int attachment, int x, int y, int width, int height) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            invalidateNamedFramebufferSubData(framebuffer, 1, stack.allocateFrom(JAVA_INT, attachment), x, y, width, height);
        }
    }

    default MethodHandle glMapNamedBuffer() {
        throw new ContextException();
    }

    @Skip
    default MemorySegment mapNamedBuffer(int buffer, int access) {
        return mapNamedBuffer(buffer, access, getNamedBufferParameteri64v(buffer, GL15C.BUFFER_SIZE));
    }

    @Skip
    default MemorySegment mapNamedBuffer(int buffer, int access, long bufferSize) {
        try {
            final MemorySegment segment = ((MemorySegment) glMapNamedBuffer().invokeExact(buffer, access)).reinterpret(bufferSize);
            return access == GL15C.READ_ONLY ? segment.asReadOnly() : segment;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    default MethodHandle glMapNamedBufferRange() {
        throw new ContextException();
    }

    @Skip
    default MemorySegment mapNamedBufferRange(int buffer, long offset, long length, int access) {
        try {
            return ((MemorySegment) glMapNamedBufferRange().invokeExact(buffer, offset, length, access)).reinterpret(length);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Entrypoint("glMemoryBarrierByRegion")
    default void memoryBarrierByRegion(int barriers) {
        throw new ContextException();
    }

    @Entrypoint("glNamedBufferData")
    default void namedBufferData(int buffer, long size, MemorySegment data, int usage) {
        throw new ContextException();
    }

    @Skip
    default void namedBufferData(int buffer, MemorySegment data, int usage) {
        namedBufferData(buffer, data.byteSize(), data, usage);
    }

    @Skip
    default void namedBufferData(int buffer, long size, int usage) {
        namedBufferData(buffer, size, MemorySegment.NULL, usage);
    }

    @Skip
    default void namedBufferData(SegmentAllocator allocator, int buffer, byte[] data, int usage) {
        namedBufferData(buffer, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void namedBufferData(SegmentAllocator allocator, int buffer, short[] data, int usage) {
        namedBufferData(buffer, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void namedBufferData(SegmentAllocator allocator, int buffer, int[] data, int usage) {
        namedBufferData(buffer, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void namedBufferData(SegmentAllocator allocator, int buffer, long[] data, int usage) {
        namedBufferData(buffer, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void namedBufferData(SegmentAllocator allocator, int buffer, float[] data, int usage) {
        namedBufferData(buffer, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void namedBufferData(SegmentAllocator allocator, int buffer, double[] data, int usage) {
        namedBufferData(buffer, Marshal.marshal(allocator, data), usage);
    }

    @Entrypoint("glNamedBufferStorage")
    default void namedBufferStorage(int buffer, long size, MemorySegment data, int flags) {
        throw new ContextException();
    }

    @Skip
    default void namedBufferStorage(int buffer, long size, int flags) {
        namedBufferStorage(buffer, size, MemorySegment.NULL, flags);
    }

    @Skip
    default void namedBufferStorage(SegmentAllocator allocator, int buffer, byte[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        namedBufferStorage(buffer, segment.byteSize(), segment, flags);
    }

    @Skip
    default void namedBufferStorage(SegmentAllocator allocator, int buffer, short[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        namedBufferStorage(buffer, segment.byteSize(), segment, flags);
    }

    @Skip
    default void namedBufferStorage(SegmentAllocator allocator, int buffer, int[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        namedBufferStorage(buffer, segment.byteSize(), segment, flags);
    }

    @Skip
    default void namedBufferStorage(SegmentAllocator allocator, int buffer, long[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        namedBufferStorage(buffer, segment.byteSize(), segment, flags);
    }

    @Skip
    default void namedBufferStorage(SegmentAllocator allocator, int buffer, float[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        namedBufferStorage(buffer, segment.byteSize(), segment, flags);
    }

    @Skip
    default void namedBufferStorage(SegmentAllocator allocator, int buffer, double[] data, int flags) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        namedBufferStorage(buffer, segment.byteSize(), segment, flags);
    }

    @Entrypoint("glNamedBufferSubData")
    default void namedBufferSubData(int buffer, long offset, long size, MemorySegment data) {
        throw new ContextException();
    }

    @Skip
    default void namedBufferSubData(int buffer, long offset, MemorySegment data) {
        namedBufferSubData(buffer, offset, data.byteSize(), data);
    }

    @Skip
    default void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, byte[] data) {
        namedBufferSubData(buffer, offset, Marshal.marshal(allocator, data));
    }

    @Skip
    default void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, short[] data) {
        namedBufferSubData(buffer, offset, Marshal.marshal(allocator, data));
    }

    @Skip
    default void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, int[] data) {
        namedBufferSubData(buffer, offset, Marshal.marshal(allocator, data));
    }

    @Skip
    default void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, long[] data) {
        namedBufferSubData(buffer, offset, Marshal.marshal(allocator, data));
    }

    @Skip
    default void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, float[] data) {
        namedBufferSubData(buffer, offset, Marshal.marshal(allocator, data));
    }

    @Skip
    default void namedBufferSubData(SegmentAllocator allocator, int buffer, long offset, double[] data) {
        namedBufferSubData(buffer, offset, Marshal.marshal(allocator, data));
    }

    @Entrypoint("glNamedFramebufferDrawBuffer")
    default void namedFramebufferDrawBuffer(int framebuffer, int buf) {
        throw new ContextException();
    }

    @Entrypoint("glNamedFramebufferDrawBuffers")
    default void namedFramebufferDrawBuffers(int framebuffer, int n, MemorySegment bufs) {
        throw new ContextException();
    }

    @Skip
    default void namedFramebufferDrawBuffers(SegmentAllocator allocator, int framebuffer, int[] bufs) {
        namedFramebufferDrawBuffers(framebuffer, bufs.length, Marshal.marshal(allocator, bufs));
    }

    @Entrypoint("glNamedFramebufferParameteri")
    default void namedFramebufferParameteri(int framebuffer, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glNamedFramebufferReadBuffer")
    default void namedFramebufferReadBuffer(int framebuffer, int src) {
        throw new ContextException();
    }

    @Entrypoint("glNamedFramebufferRenderbuffer")
    default void namedFramebufferRenderbuffer(int framebuffer, int attachment, int renderbufferTarget, int renderbuffer) {
        throw new ContextException();
    }

    @Entrypoint("glNamedFramebufferTexture")
    default void namedFramebufferTexture(int framebuffer, int attachment, int texture, int level) {
        throw new ContextException();
    }

    @Entrypoint("glNamedFramebufferTextureLayer")
    default void namedFramebufferTextureLayer(int framebuffer, int attachment, int texture, int level, int layer) {
        throw new ContextException();
    }

    @Entrypoint("glNamedRenderbufferStorage")
    default void namedRenderbufferStorage(int renderbuffer, int internalFormat, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glNamedRenderbufferStorageMultisample")
    default void namedRenderbufferStorageMultisample(int renderbuffer, int samples, int internalFormat, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glReadnPixels")
    default void readnPixels(int x, int y, int width, int height, int format, int type, int bufSize, MemorySegment data) {
        throw new ContextException();
    }

    @Skip
    default void readnPixels(int x, int y, int width, int height, int format, int type, MemorySegment data) {
        readnPixels(x, y, width, height, format, type, Math.toIntExact(data.byteSize()), data);
    }

    @Skip
    default void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref byte[] data) {
        var seg = Marshal.marshal(allocator, data);
        readnPixels(x, y, width, height, format, type, seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref short[] data) {
        var seg = Marshal.marshal(allocator, data);
        readnPixels(x, y, width, height, format, type, seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref int[] data) {
        var seg = Marshal.marshal(allocator, data);
        readnPixels(x, y, width, height, format, type, seg);
        Unmarshal.copy(seg, data);
    }

    @Skip
    default void readnPixels(SegmentAllocator allocator, int x, int y, int width, int height, int format, int type, @Ref float[] data) {
        var seg = Marshal.marshal(allocator, data);
        readnPixels(x, y, width, height, format, type, seg);
        Unmarshal.copy(seg, data);
    }

    @Entrypoint("glTextureBarrier")
    default void textureBarrier() {
        throw new ContextException();
    }

    @Entrypoint("glTextureBuffer")
    default void textureBuffer(int texture, int internalFormat, int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glTextureBufferRange")
    default void textureBufferRange(int texture, int internalFormat, int buffer, long offset, long size) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterIiv")
    default void textureParameterIiv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterIiv")
    default void textureParameterIiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterIuiv")
    default void textureParameterIuiv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterIuiv")
    default void textureParameterIuiv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterf")
    default void textureParameterf(int texture, int pname, float param) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterfv")
    default void textureParameterfv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameterfv")
    default void textureParameterfv(SegmentAllocator allocator, int texture, int pname, float[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameteri")
    default void textureParameteri(int texture, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameteriv")
    default void textureParameteriv(int texture, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureParameteriv")
    default void textureParameteriv(SegmentAllocator allocator, int texture, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTextureStorage1D")
    default void textureStorage1D(int texture, int levels, int internalFormat, int width) {
        throw new ContextException();
    }

    @Entrypoint("glTextureStorage2D")
    default void textureStorage2D(int texture, int levels, int internalFormat, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glTextureStorage2DMultisample")
    default void textureStorage2DMultisample(int texture, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        throw new ContextException();
    }

    @Entrypoint("glTextureStorage3D")
    default void textureStorage3D(int texture, int levels, int internalFormat, int width, int height, int depth) {
        throw new ContextException();
    }

    @Entrypoint("glTextureStorage3DMultisample")
    default void textureStorage3DMultisample(int texture, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage1D")
    default void textureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage1D")
    default void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage1D")
    default void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage1D")
    default void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage1D")
    default void textureSubImage1D(SegmentAllocator allocator, int texture, int level, int xoffset, int width, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage2D")
    default void textureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage2D")
    default void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage2D")
    default void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage2D")
    default void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage2D")
    default void textureSubImage2D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage3D")
    default void textureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage3D")
    default void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, byte[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage3D")
    default void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage3D")
    default void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTextureSubImage3D")
    default void textureSubImage3D(SegmentAllocator allocator, int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] pixels) {
        throw new ContextException();
    }

    @Entrypoint("glTransformFeedbackBufferBase")
    default void transformFeedbackBufferBase(int xfb, int index, int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glTransformFeedbackBufferRange")
    default void transformFeedbackBufferRange(int xfb, int index, int buffer, long offset, long size) {
        throw new ContextException();
    }

    @Entrypoint("glUnmapNamedBuffer")
    default boolean unmapNamedBuffer(int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayAttribBinding")
    default void vertexArrayAttribBinding(int vaobj, int attribIndex, int bindingIndex) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayAttribFormat")
    default void vertexArrayAttribFormat(int vaobj, int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayAttribIFormat")
    default void vertexArrayAttribIFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayAttribLFormat")
    default void vertexArrayAttribLFormat(int vaobj, int attribIndex, int size, int type, int relativeOffset) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayBindingDivisor")
    default void vertexArrayBindingDivisor(int vaobj, int bindingIndex, int divisor) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayElementBuffer")
    default void vertexArrayElementBuffer(int vaobj, int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayVertexBuffer")
    default void vertexArrayVertexBuffer(int vaobj, int bindingIndex, int buffer, long offset, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayVertexBuffers")
    default void vertexArrayVertexBuffers(int vaobj, int first, int count, MemorySegment buffers, MemorySegment offsets, MemorySegment strides) {
        throw new ContextException();
    }

    @Entrypoint("glVertexArrayVertexBuffers")
    default void vertexArrayVertexBuffers(SegmentAllocator allocator, int vaobj, int first, int count, int[] buffers, long[] offsets, int[] strides) {
        throw new ContextException();
    }
}
