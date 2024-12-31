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

import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBTextureRectangle;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

/**
 * The OpenGL 3.1 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_copy_buffer</li>
 *     <li>{@linkplain GLARBTextureRectangle GL_ARB_texture_rectangle}</li>
 *     <li>GL_ARB_uniform_buffer_object</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL31C extends DirectAccess {
    int SAMPLER_2D_RECT = 0x8B63;
    int SAMPLER_2D_RECT_SHADOW = 0x8B64;
    int SAMPLER_BUFFER = 0x8DC2;
    int INT_SAMPLER_2D_RECT = 0x8DCD;
    int INT_SAMPLER_BUFFER = 0x8DD0;
    int UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    int UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
    int TEXTURE_BUFFER = 0x8C2A;
    int MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
    int TEXTURE_BINDING_BUFFER = 0x8C2C;
    int TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
    int TEXTURE_RECTANGLE = 0x84F5;
    int TEXTURE_BINDING_RECTANGLE = 0x84F6;
    int PROXY_TEXTURE_RECTANGLE = 0x84F7;
    int MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
    int R8_SNORM = 0x8F94;
    int RG8_SNORM = 0x8F95;
    int RGB8_SNORM = 0x8F96;
    int RGBA8_SNORM = 0x8F97;
    int R16_SNORM = 0x8F98;
    int RG16_SNORM = 0x8F99;
    int RGB16_SNORM = 0x8F9A;
    int RGBA16_SNORM = 0x8F9B;
    int SIGNED_NORMALIZED = 0x8F9C;
    int PRIMITIVE_RESTART = 0x8F9D;
    int PRIMITIVE_RESTART_INDEX = 0x8F9E;
    int COPY_READ_BUFFER = 0x8F36;
    int COPY_WRITE_BUFFER = 0x8F37;
    int UNIFORM_BUFFER = 0x8A11;
    int UNIFORM_BUFFER_BINDING = 0x8A28;
    int UNIFORM_BUFFER_START = 0x8A29;
    int UNIFORM_BUFFER_SIZE = 0x8A2A;
    int MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    int MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    int MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    int MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    int MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    int MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    int MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    int MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    int MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    int UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    int ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    int ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    int UNIFORM_TYPE = 0x8A37;
    int UNIFORM_SIZE = 0x8A38;
    int UNIFORM_NAME_LENGTH = 0x8A39;
    int UNIFORM_BLOCK_INDEX = 0x8A3A;
    int UNIFORM_OFFSET = 0x8A3B;
    int UNIFORM_ARRAY_STRIDE = 0x8A3C;
    int UNIFORM_MATRIX_STRIDE = 0x8A3D;
    int UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    int UNIFORM_BLOCK_BINDING = 0x8A3F;
    int UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    int UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    int UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    int UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    int UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    int UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    int UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    int INVALID_INDEX = 0xFFFFFFFF;

    @Entrypoint("glCopyBufferSubData")
    default void copyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        throw new ContextException();
    }

    @Entrypoint("glDrawArraysInstanced")
    default void drawArraysInstanced(int mode, int first, int count, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstanced")
    default void drawElementsInstanced(int mode, int count, int type, MemorySegment indices, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstanced")
    default void drawElementsInstanced(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstanced")
    default void drawElementsInstanced(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstanced")
    default void drawElementsInstanced(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveUniformBlockName")
    default void getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, MemorySegment length, MemorySegment uniformBlockName) {
        throw new ContextException();
    }

    @Skip
    default String getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            final MemorySegment length = stack.allocate(ValueLayout.JAVA_INT);
            var pName = stack.allocate(ValueLayout.JAVA_BYTE, bufSize);
            getActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, pName);
            return Unmarshal.unmarshalAsString(pName.reinterpret(length.get(ValueLayout.JAVA_INT, 0L) + 1));
        }
    }

    @Entrypoint("glGetActiveUniformBlockiv")
    default void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveUniformBlockiv")
    default void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveUniformName")
    default void getActiveUniformName(int program, int uniformIndex, int bufSize, MemorySegment length, MemorySegment uniformName) {
        throw new ContextException();
    }

    @Skip
    default String getActiveUniformName(int program, int uniformIndex, int bufSize) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            final MemorySegment length = stack.allocate(ValueLayout.JAVA_INT);
            var pName = stack.allocate(ValueLayout.JAVA_BYTE, bufSize);
            getActiveUniformName(program, uniformIndex, bufSize, length, pName);
            return Unmarshal.unmarshalAsString(pName.reinterpret(length.get(ValueLayout.JAVA_INT, 0L) + 1));
        }
    }

    @Entrypoint("glGetActiveUniformsiv")
    default void getActiveUniformsiv(int program, int uniformCount, MemorySegment uniformIndices, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getActiveUniformsiv(SegmentAllocator allocator, int program, int[] uniformIndices, int pname, @Ref int[] params) {
        var seg = Marshal.marshal(allocator, params);
        getActiveUniformsiv(program, uniformIndices.length, Marshal.marshal(allocator, uniformIndices), pname, seg);
        Unmarshal.copy(seg, params);
    }

    @Skip
    default int getActiveUniformsiv(int program, int uniformIndex, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(ValueLayout.JAVA_INT);
            getActiveUniformsiv(program, 1, stack.allocateFrom(ValueLayout.JAVA_INT, uniformIndex), pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetUniformBlockIndex")
    default int getUniformBlockIndex(int program, MemorySegment uniformBlockName) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformBlockIndex")
    default int getUniformBlockIndex(int program, String uniformBlockName) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformIndices")
    default void getUniformIndices(int program, int uniformCount, MemorySegment uniformNames, MemorySegment uniformIndices) {
        throw new ContextException();
    }

    @Skip
    default void getUniformIndices(SegmentAllocator allocator, int program, String[] uniformNames, @Ref int[] uniformIndices) {
        var pIndices = allocator.allocate(ValueLayout.JAVA_INT, uniformNames.length);
        getUniformIndices(program, uniformNames.length, Marshal.marshal(allocator, uniformNames), pIndices);
        Unmarshal.copy(pIndices, uniformIndices);
    }

    @Skip
    default int getUniformIndices(int program, String uniformName) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(ValueLayout.JAVA_INT);
            getUniformIndices(program, 1, stack.allocateFrom(uniformName), seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glPrimitiveRestartIndex")
    default void primitiveRestartIndex(int index) {
        throw new ContextException();
    }

    @Entrypoint("glTexBuffer")
    default void texBuffer(int target, int internalFormat, int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glUniformBlockBinding")
    default void uniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        throw new ContextException();
    }
}
