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

import overrungl.opengl.ext.arb.GLARBTextureCompressionBptc;
import overrungl.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

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
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL42C extends GL41C permits GL43C {
    public static final int COPY_READ_BUFFER_BINDING = 0x8F36;
    public static final int COPY_WRITE_BUFFER_BINDING = 0x8F37;
    public static final int TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;
    public static final int TRANSFORM_FEEDBACK_PAUSED = 0x8E23;
    public static final int UNPACK_COMPRESSED_BLOCK_WIDTH = 0x9127;
    public static final int UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128;
    public static final int UNPACK_COMPRESSED_BLOCK_DEPTH = 0x9129;
    public static final int UNPACK_COMPRESSED_BLOCK_SIZE = 0x912A;
    public static final int PACK_COMPRESSED_BLOCK_WIDTH = 0x912B;
    public static final int PACK_COMPRESSED_BLOCK_HEIGHT = 0x912C;
    public static final int PACK_COMPRESSED_BLOCK_DEPTH = 0x912D;
    public static final int PACK_COMPRESSED_BLOCK_SIZE = 0x912E;
    public static final int NUM_SAMPLE_COUNTS = 0x9380;
    public static final int MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;
    public static final int ATOMIC_COUNTER_BUFFER = 0x92C0;
    public static final int ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
    public static final int ATOMIC_COUNTER_BUFFER_START = 0x92C2;
    public static final int ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
    public static final int ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
    public static final int ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
    public static final int ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
    public static final int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
    public static final int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
    public static final int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
    public static final int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
    public static final int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
    public static final int MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
    public static final int MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
    public static final int MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
    public static final int MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
    public static final int MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
    public static final int MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
    public static final int MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
    public static final int MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
    public static final int MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
    public static final int MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
    public static final int MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
    public static final int MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
    public static final int MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
    public static final int MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
    public static final int ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
    public static final int UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
    public static final int UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
    public static final int VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
    public static final int ELEMENT_ARRAY_BARRIER_BIT = 0x00000002;
    public static final int UNIFORM_BARRIER_BIT = 0x00000004;
    public static final int TEXTURE_FETCH_BARRIER_BIT = 0x00000008;
    public static final int SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
    public static final int COMMAND_BARRIER_BIT = 0x00000040;
    public static final int PIXEL_BUFFER_BARRIER_BIT = 0x00000080;
    public static final int TEXTURE_UPDATE_BARRIER_BIT = 0x00000100;
    public static final int BUFFER_UPDATE_BARRIER_BIT = 0x00000200;
    public static final int FRAMEBUFFER_BARRIER_BIT = 0x00000400;
    public static final int TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
    public static final int ATOMIC_COUNTER_BARRIER_BIT = 0x00001000;
    public static final int ALL_BARRIER_BITS = 0xFFFFFFFF;
    public static final int MAX_IMAGE_UNITS = 0x8F38;
    public static final int MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
    public static final int IMAGE_BINDING_NAME = 0x8F3A;
    public static final int IMAGE_BINDING_LEVEL = 0x8F3B;
    public static final int IMAGE_BINDING_LAYERED = 0x8F3C;
    public static final int IMAGE_BINDING_LAYER = 0x8F3D;
    public static final int IMAGE_BINDING_ACCESS = 0x8F3E;
    public static final int IMAGE_1D = 0x904C;
    public static final int IMAGE_2D = 0x904D;
    public static final int IMAGE_3D = 0x904E;
    public static final int IMAGE_2D_RECT = 0x904F;
    public static final int IMAGE_CUBE = 0x9050;
    public static final int IMAGE_BUFFER = 0x9051;
    public static final int IMAGE_1D_ARRAY = 0x9052;
    public static final int IMAGE_2D_ARRAY = 0x9053;
    public static final int IMAGE_CUBE_MAP_ARRAY = 0x9054;
    public static final int IMAGE_2D_MULTISAMPLE = 0x9055;
    public static final int IMAGE_2D_MULTISAMPLE_ARRAY = 0x9056;
    public static final int INT_IMAGE_1D = 0x9057;
    public static final int INT_IMAGE_2D = 0x9058;
    public static final int INT_IMAGE_3D = 0x9059;
    public static final int INT_IMAGE_2D_RECT = 0x905A;
    public static final int INT_IMAGE_CUBE = 0x905B;
    public static final int INT_IMAGE_BUFFER = 0x905C;
    public static final int INT_IMAGE_1D_ARRAY = 0x905D;
    public static final int INT_IMAGE_2D_ARRAY = 0x905E;
    public static final int INT_IMAGE_CUBE_MAP_ARRAY = 0x905F;
    public static final int INT_IMAGE_2D_MULTISAMPLE = 0x9060;
    public static final int INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9061;
    public static final int UNSIGNED_INT_IMAGE_1D = 0x9062;
    public static final int UNSIGNED_INT_IMAGE_2D = 0x9063;
    public static final int UNSIGNED_INT_IMAGE_3D = 0x9064;
    public static final int UNSIGNED_INT_IMAGE_2D_RECT = 0x9065;
    public static final int UNSIGNED_INT_IMAGE_CUBE = 0x9066;
    public static final int UNSIGNED_INT_IMAGE_BUFFER = 0x9067;
    public static final int UNSIGNED_INT_IMAGE_1D_ARRAY = 0x9068;
    public static final int UNSIGNED_INT_IMAGE_2D_ARRAY = 0x9069;
    public static final int UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
    public static final int UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 0x906B;
    public static final int UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;
    public static final int MAX_IMAGE_SAMPLES = 0x906D;
    public static final int IMAGE_BINDING_FORMAT = 0x906E;
    public static final int IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
    public static final int IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
    public static final int IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
    public static final int MAX_VERTEX_IMAGE_UNIFORMS = 0x90CA;
    public static final int MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
    public static final int MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
    public static final int MAX_GEOMETRY_IMAGE_UNIFORMS = 0x90CD;
    public static final int MAX_FRAGMENT_IMAGE_UNIFORMS = 0x90CE;
    public static final int MAX_COMBINED_IMAGE_UNIFORMS = 0x90CF;
    public static final int COMPRESSED_RGBA_BPTC_UNORM = 0x8E8C;
    public static final int COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 0x8E8D;
    public static final int COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 0x8E8E;
    public static final int COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;
    public static final int TEXTURE_IMMUTABLE_FORMAT = 0x912F;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBindImageTexture, caps.glDrawArraysInstancedBaseInstance, caps.glDrawElementsInstancedBaseInstance, caps.glDrawElementsInstancedBaseVertexBaseInstance, caps.glDrawTransformFeedbackInstanced, caps.glDrawTransformFeedbackStreamInstanced,
            caps.glGetActiveAtomicCounterBufferiv, caps.glGetInternalformativ, caps.glMemoryBarrier, caps.glTexStorage1D, caps.glTexStorage2D, caps.glTexStorage3D);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindImageTexture = load.invoke("glBindImageTexture", IIIZIIIV);
        caps.glDrawArraysInstancedBaseInstance = load.invoke("glDrawArraysInstancedBaseInstance", IIIIIV);
        caps.glDrawElementsInstancedBaseInstance = load.invoke("glDrawElementsInstancedBaseInstance", IIIPIIV);
        caps.glDrawElementsInstancedBaseVertexBaseInstance = load.invoke("glDrawElementsInstancedBaseVertexBaseInstance", IIIPIIIV);
        caps.glDrawTransformFeedbackInstanced = load.invoke("glDrawTransformFeedbackInstanced", IIIV);
        caps.glDrawTransformFeedbackStreamInstanced = load.invoke("glDrawTransformFeedbackStreamInstanced", IIIIV);
        caps.glGetActiveAtomicCounterBufferiv = load.trivialHandle("glGetActiveAtomicCounterBufferiv", IIIPV);
        caps.glGetInternalformativ = load.trivialHandle("glGetInternalformativ", IIIIPV);
        caps.glMemoryBarrier = load.invoke("glMemoryBarrier", IV);
        caps.glTexStorage1D = load.invoke("glTexStorage1D", IIIIV);
        caps.glTexStorage2D = load.invoke("glTexStorage2D", IIIIIV);
        caps.glTexStorage3D = load.invoke("glTexStorage3D", IIIIIIV);
    }

    public static void bindImageTexture(int unit, int texture, int level, boolean layered, int layer, int access, int format) {
        var caps = getCapabilities();
        try {
            check(caps.glBindImageTexture).invokeExact(unit, texture, level, layered, layer, access, format);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawArraysInstancedBaseInstance(int mode, int first, int count, int instanceCount, int baseInstance) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawArraysInstancedBaseInstance).invokeExact(mode, first, count, instanceCount, baseInstance);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstancedBaseInstance(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseInstance) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawElementsInstancedBaseInstance).invokeExact(mode, count, type, indices, instanceCount, baseInstance);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), instanceCount, baseInstance);
    }

    public static void drawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), instanceCount, baseInstance);
    }

    public static void drawElementsInstancedBaseInstance(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseInstance) {
        drawElementsInstancedBaseInstance(mode, count, type, allocator.allocateArray(JAVA_INT, indices), instanceCount, baseInstance);
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseVertex, int baseInstance) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawElementsInstancedBaseVertexBaseInstance).invokeExact(mode, count, type, indices, instanceCount, baseVertex, baseInstance);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), instanceCount, baseVertex, baseInstance);
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), instanceCount, baseVertex, baseInstance);
    }

    public static void drawElementsInstancedBaseVertexBaseInstance(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex, int baseInstance) {
        drawElementsInstancedBaseVertexBaseInstance(mode, count, type, allocator.allocateArray(JAVA_INT, indices), instanceCount, baseVertex, baseInstance);
    }

    public static void drawTransformFeedbackInstanced(int mode, int id, int instanceCount) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawTransformFeedbackInstanced).invokeExact(mode, id, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawTransformFeedbackStreamInstanced(int mode, int id, int stream, int instanceCount) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawTransformFeedbackStreamInstanced).invokeExact(mode, id, stream, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveAtomicCounterBufferiv(int program, int bufferIndex, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetActiveAtomicCounterBufferiv).invokeExact(program, bufferIndex, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveAtomicCounterBufferiv(SegmentAllocator allocator, int program, int bufferIndex, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getActiveAtomicCounterBufferiv(program, bufferIndex, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getActiveAtomicCounterBufferi(int program, int bufferIndex, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getActiveAtomicCounterBufferiv(program, bufferIndex, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInternalformativ(int target, int internalFormat, int pname, int count, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetInternalformativ).invokeExact(target, internalFormat, pname, count, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInternalformativ(SegmentAllocator allocator, int target, int internalFormat, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getInternalformativ(target, internalFormat, pname, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getInternalformati(int target, int internalFormat, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getInternalformativ(target, internalFormat, pname, 1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void memoryBarrier(int barriers) {
        var caps = getCapabilities();
        try {
            check(caps.glMemoryBarrier).invokeExact(barriers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage1D(int target, int levels, int internalFormat, int width) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage1D).invokeExact(target, levels, internalFormat, width);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage2D(int target, int levels, int internalFormat, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage2D).invokeExact(target, levels, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage3D(int target, int levels, int internalFormat, int width, int height, int depth) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage3D).invokeExact(target, levels, internalFormat, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
