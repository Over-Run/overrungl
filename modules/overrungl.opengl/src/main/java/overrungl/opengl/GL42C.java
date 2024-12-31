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
import overrungl.opengl.ext.arb.GLARBTextureCompressionBptc;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

/**
 * The OpenGL 4.2 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_base_instance</li>
 *     <li>GL_ARB_internalformat_query</li>
 *     <li>GL_ARB_shader_atomic_counters</li>
 *     <li>GL_ARB_shader_image_load_store</li>
 *     <li>GL_ARB_texture_storage</li>
 *     <li>GL_ARB_transform_feedback_instanced</li>
 *     <li>{@linkplain GLARBTextureCompressionBptc GL_ARB_texture_compression_bptc}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL42C extends DirectAccess {
    int COPY_READ_BUFFER_BINDING = 0x8F36;
    int COPY_WRITE_BUFFER_BINDING = 0x8F37;
    int TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;
    int TRANSFORM_FEEDBACK_PAUSED = 0x8E23;
    int UNPACK_COMPRESSED_BLOCK_WIDTH = 0x9127;
    int UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128;
    int UNPACK_COMPRESSED_BLOCK_DEPTH = 0x9129;
    int UNPACK_COMPRESSED_BLOCK_SIZE = 0x912A;
    int PACK_COMPRESSED_BLOCK_WIDTH = 0x912B;
    int PACK_COMPRESSED_BLOCK_HEIGHT = 0x912C;
    int PACK_COMPRESSED_BLOCK_DEPTH = 0x912D;
    int PACK_COMPRESSED_BLOCK_SIZE = 0x912E;
    int NUM_SAMPLE_COUNTS = 0x9380;
    int MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;
    int ATOMIC_COUNTER_BUFFER = 0x92C0;
    int ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
    int ATOMIC_COUNTER_BUFFER_START = 0x92C2;
    int ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
    int ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
    int ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
    int ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
    int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
    int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
    int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
    int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
    int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
    int MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
    int MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
    int MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
    int MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
    int MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
    int MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
    int MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
    int MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
    int MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
    int MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
    int MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
    int MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
    int MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
    int MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
    int ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
    int UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
    int UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
    int VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
    int ELEMENT_ARRAY_BARRIER_BIT = 0x00000002;
    int UNIFORM_BARRIER_BIT = 0x00000004;
    int TEXTURE_FETCH_BARRIER_BIT = 0x00000008;
    int SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
    int COMMAND_BARRIER_BIT = 0x00000040;
    int PIXEL_BUFFER_BARRIER_BIT = 0x00000080;
    int TEXTURE_UPDATE_BARRIER_BIT = 0x00000100;
    int BUFFER_UPDATE_BARRIER_BIT = 0x00000200;
    int FRAMEBUFFER_BARRIER_BIT = 0x00000400;
    int TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
    int ATOMIC_COUNTER_BARRIER_BIT = 0x00001000;
    int ALL_BARRIER_BITS = 0xFFFFFFFF;
    int MAX_IMAGE_UNITS = 0x8F38;
    int MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
    int IMAGE_BINDING_NAME = 0x8F3A;
    int IMAGE_BINDING_LEVEL = 0x8F3B;
    int IMAGE_BINDING_LAYERED = 0x8F3C;
    int IMAGE_BINDING_LAYER = 0x8F3D;
    int IMAGE_BINDING_ACCESS = 0x8F3E;
    int IMAGE_1D = 0x904C;
    int IMAGE_2D = 0x904D;
    int IMAGE_3D = 0x904E;
    int IMAGE_2D_RECT = 0x904F;
    int IMAGE_CUBE = 0x9050;
    int IMAGE_BUFFER = 0x9051;
    int IMAGE_1D_ARRAY = 0x9052;
    int IMAGE_2D_ARRAY = 0x9053;
    int IMAGE_CUBE_MAP_ARRAY = 0x9054;
    int IMAGE_2D_MULTISAMPLE = 0x9055;
    int IMAGE_2D_MULTISAMPLE_ARRAY = 0x9056;
    int INT_IMAGE_1D = 0x9057;
    int INT_IMAGE_2D = 0x9058;
    int INT_IMAGE_3D = 0x9059;
    int INT_IMAGE_2D_RECT = 0x905A;
    int INT_IMAGE_CUBE = 0x905B;
    int INT_IMAGE_BUFFER = 0x905C;
    int INT_IMAGE_1D_ARRAY = 0x905D;
    int INT_IMAGE_2D_ARRAY = 0x905E;
    int INT_IMAGE_CUBE_MAP_ARRAY = 0x905F;
    int INT_IMAGE_2D_MULTISAMPLE = 0x9060;
    int INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9061;
    int UNSIGNED_INT_IMAGE_1D = 0x9062;
    int UNSIGNED_INT_IMAGE_2D = 0x9063;
    int UNSIGNED_INT_IMAGE_3D = 0x9064;
    int UNSIGNED_INT_IMAGE_2D_RECT = 0x9065;
    int UNSIGNED_INT_IMAGE_CUBE = 0x9066;
    int UNSIGNED_INT_IMAGE_BUFFER = 0x9067;
    int UNSIGNED_INT_IMAGE_1D_ARRAY = 0x9068;
    int UNSIGNED_INT_IMAGE_2D_ARRAY = 0x9069;
    int UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
    int UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 0x906B;
    int UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;
    int MAX_IMAGE_SAMPLES = 0x906D;
    int IMAGE_BINDING_FORMAT = 0x906E;
    int IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
    int IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
    int IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
    int MAX_VERTEX_IMAGE_UNIFORMS = 0x90CA;
    int MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
    int MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
    int MAX_GEOMETRY_IMAGE_UNIFORMS = 0x90CD;
    int MAX_FRAGMENT_IMAGE_UNIFORMS = 0x90CE;
    int MAX_COMBINED_IMAGE_UNIFORMS = 0x90CF;
    int COMPRESSED_RGBA_BPTC_UNORM = 0x8E8C;
    int COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 0x8E8D;
    int COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 0x8E8E;
    int COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;
    int TEXTURE_IMMUTABLE_FORMAT = 0x912F;

    @Entrypoint("glBindImageTexture")
    default void bindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        throw new ContextException();
    }

    @Entrypoint("glDrawArraysInstancedBaseInstance")
    default void drawArraysInstancedBaseInstance(int mode, int first, int count, int instanceCount, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseInstance")
    default void drawElementsInstancedBaseInstance(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseInstance")
    default void drawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseInstance")
    default void drawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseInstance")
    default void drawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertexBaseInstance")
    default void drawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseVertex, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertexBaseInstance")
    default void drawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertexBaseInstance")
    default void drawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawElementsInstancedBaseVertexBaseInstance")
    default void drawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex, int baseInstance) {
        throw new ContextException();
    }

    @Entrypoint("glDrawTransformFeedbackInstanced")
    default void drawTransformFeedbackInstanced(int mode, int id, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glDrawTransformFeedbackStreamInstanced")
    default void drawTransformFeedbackStreamInstanced(int mode, int id, int stream, int instanceCount) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveAtomicCounterBufferiv")
    default void getActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveAtomicCounterBufferiv")
    default void getActiveAtomicCounterBufferiv(SegmentAllocator allocator, int program, int bufferIndex, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(ValueLayout.JAVA_INT);
            getActiveAtomicCounterBufferiv(program, bufferIndex, pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetInternalformativ")
    default void getInternalformativ(int target, int internalFormat, int pname, int count, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getInternalformativ(SegmentAllocator allocator, int target, int internalFormat, int pname, @Ref int[] params) {
        var seg = Marshal.marshal(allocator, params);
        getInternalformativ(target, internalFormat, pname, params.length, seg);
        Unmarshal.copy(seg, params);
    }

    @Skip
    default int getInternalformativ(int target, int internalFormat, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(ValueLayout.JAVA_INT);
            getInternalformativ(target, internalFormat, pname, 1, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glMemoryBarrier")
    default void memoryBarrier(int barriers) {
        throw new ContextException();
    }

    @Entrypoint("glTexStorage1D")
    default void texStorage1D(int target, int levels, int internalFormat, int width) {
        throw new ContextException();
    }

    @Entrypoint("glTexStorage2D")
    default void texStorage2D(int target, int levels, int internalFormat, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glTexStorage3D")
    default void texStorage3D(int target, int levels, int internalFormat, int width, int height, int depth) {
        throw new ContextException();
    }
}
