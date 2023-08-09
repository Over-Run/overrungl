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

import org.jetbrains.annotations.Nullable;
import overrungl.opengl.ext.arb.GLARBTextureRectangle;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;

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
public sealed class GL31C extends GL30C permits GL32C {
    public static final int SAMPLER_2D_RECT = 0x8B63;
    public static final int SAMPLER_2D_RECT_SHADOW = 0x8B64;
    public static final int SAMPLER_BUFFER = 0x8DC2;
    public static final int INT_SAMPLER_2D_RECT = 0x8DCD;
    public static final int INT_SAMPLER_BUFFER = 0x8DD0;
    public static final int UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    public static final int UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
    public static final int TEXTURE_BUFFER = 0x8C2A;
    public static final int MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
    public static final int TEXTURE_BINDING_BUFFER = 0x8C2C;
    public static final int TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
    public static final int TEXTURE_RECTANGLE = 0x84F5;
    public static final int TEXTURE_BINDING_RECTANGLE = 0x84F6;
    public static final int PROXY_TEXTURE_RECTANGLE = 0x84F7;
    public static final int MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
    public static final int R8_SNORM = 0x8F94;
    public static final int RG8_SNORM = 0x8F95;
    public static final int RGB8_SNORM = 0x8F96;
    public static final int RGBA8_SNORM = 0x8F97;
    public static final int R16_SNORM = 0x8F98;
    public static final int RG16_SNORM = 0x8F99;
    public static final int RGB16_SNORM = 0x8F9A;
    public static final int RGBA16_SNORM = 0x8F9B;
    public static final int SIGNED_NORMALIZED = 0x8F9C;
    public static final int PRIMITIVE_RESTART = 0x8F9D;
    public static final int PRIMITIVE_RESTART_INDEX = 0x8F9E;
    public static final int COPY_READ_BUFFER = 0x8F36;
    public static final int COPY_WRITE_BUFFER = 0x8F37;
    public static final int UNIFORM_BUFFER = 0x8A11;
    public static final int UNIFORM_BUFFER_BINDING = 0x8A28;
    public static final int UNIFORM_BUFFER_START = 0x8A29;
    public static final int UNIFORM_BUFFER_SIZE = 0x8A2A;
    public static final int MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
    public static final int MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
    public static final int MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
    public static final int MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
    public static final int MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
    public static final int MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
    public static final int MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
    public static final int MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
    public static final int MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
    public static final int UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
    public static final int ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
    public static final int ACTIVE_UNIFORM_BLOCKS = 0x8A36;
    public static final int UNIFORM_TYPE = 0x8A37;
    public static final int UNIFORM_SIZE = 0x8A38;
    public static final int UNIFORM_NAME_LENGTH = 0x8A39;
    public static final int UNIFORM_BLOCK_INDEX = 0x8A3A;
    public static final int UNIFORM_OFFSET = 0x8A3B;
    public static final int UNIFORM_ARRAY_STRIDE = 0x8A3C;
    public static final int UNIFORM_MATRIX_STRIDE = 0x8A3D;
    public static final int UNIFORM_IS_ROW_MAJOR = 0x8A3E;
    public static final int UNIFORM_BLOCK_BINDING = 0x8A3F;
    public static final int UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
    public static final int UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
    public static final int UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
    public static final int UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
    public static final int UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
    public static final int UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
    public static final int UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
    public static final int INVALID_INDEX = 0xFFFFFFFF;

    static boolean isSupported(GLCapabilities caps) {
        return GLLoader.checkAll(caps.glBindBufferBase, caps.glBindBufferRange, caps.glCopyBufferSubData, caps.glDrawArraysInstanced, caps.glDrawElementsInstanced, caps.glGetActiveUniformBlockName,
            caps.glGetActiveUniformBlockiv, caps.glGetActiveUniformName, caps.glGetActiveUniformsiv, caps.glGetIntegeri_v, caps.glGetUniformBlockIndex, caps.glGetUniformIndices,
            caps.glPrimitiveRestartIndex, caps.glTexBuffer, caps.glUniformBlockBinding);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindBufferBase = load.invoke("glBindBufferBase", IIIV);
        caps.glBindBufferRange = load.invoke("glBindBufferRange", IIIJJV);
        caps.glCopyBufferSubData = load.invoke("glCopyBufferSubData", IIJJJV);
        caps.glDrawArraysInstanced = load.invoke("glDrawArraysInstanced", IIIIV);
        caps.glDrawElementsInstanced = load.invoke("glDrawElementsInstanced", IIIPIV);
        caps.glGetActiveUniformBlockName = load.trivialHandle("glGetActiveUniformBlockName", IIIPPV);
        caps.glGetActiveUniformBlockiv = load.trivialHandle("glGetActiveUniformBlockiv", IIIPV);
        caps.glGetActiveUniformName = load.trivialHandle("glGetActiveUniformName", IIIPPV);
        caps.glGetActiveUniformsiv = load.trivialHandle("glGetActiveUniformsiv", IIPIPV);
        caps.glGetIntegeri_v = load.trivialHandle("glGetIntegeri_v", IIPV);
        caps.glGetUniformBlockIndex = load.trivialHandle("glGetUniformBlockIndex", IPI);
        caps.glGetUniformIndices = load.trivialHandle("glGetUniformIndices", IIPPV);
        caps.glPrimitiveRestartIndex = load.trivialHandle("glPrimitiveRestartIndex", IV);
        caps.glTexBuffer = load.invoke("glTexBuffer", IIIV);
        caps.glUniformBlockBinding = load.invoke("glUniformBlockBinding", IIIV);
    }

    public static void copyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glCopyBufferSubData).invokeExact(readTarget, writeTarget, readOffset, writeOffset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawArraysInstanced(int mode, int first, int count, int instanceCount) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDrawArraysInstanced).invokeExact(mode, first, count, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, MemorySegment indices, int instanceCount) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDrawElementsInstanced).invokeExact(mode, count, type, indices, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstanced(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount) {
        drawElementsInstanced(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), instanceCount);
    }

    public static void drawElementsInstanced(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount) {
        drawElementsInstanced(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), instanceCount);
    }

    public static void drawElementsInstanced(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount) {
        drawElementsInstanced(mode, count, type, allocator.allocateArray(JAVA_INT, indices), instanceCount);
    }

    public static void getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, MemorySegment length, MemorySegment uniformBlockName) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetActiveUniformBlockName).invokeExact(program, uniformBlockIndex, bufSize, length, uniformBlockName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformBlockName(SegmentAllocator allocator, int program, int uniformBlockIndex, int bufSize, int @Nullable [] length, String[] uniformBlockName) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformBlockName(program, uniformBlockIndex, bufSize, pLen, pName);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        uniformBlockName[0] = pName.getUtf8String(0);
    }

    public static String getActiveUniformBlockName(SegmentAllocator allocator, int program, int uniformBlockIndex, int bufSize) {
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformBlockName(program, uniformBlockIndex, bufSize, MemorySegment.NULL, pName);
        return pName.getUtf8String(0);
    }

    public static void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetActiveUniformBlockiv).invokeExact(program, uniformBlockIndex, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformBlockiv(SegmentAllocator allocator, int program, int uniformBlockIndex, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getActiveUniformBlockiv(program, uniformBlockIndex, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getActiveUniformName(int program, int uniformIndex, int bufSize, MemorySegment length, MemorySegment uniformName) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetActiveUniformName).invokeExact(program, uniformIndex, bufSize, length, uniformName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformName(SegmentAllocator allocator, int program, int uniformIndex, int bufSize, int @Nullable [] length, String[] uniformName) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformName(program, uniformIndex, bufSize, pLen, pName);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        uniformName[0] = pName.getUtf8String(0);
    }

    public static String getActiveUniformName(SegmentAllocator allocator, int program, int uniformIndex, int bufSize) {
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformName(program, uniformIndex, bufSize, MemorySegment.NULL, pName);
        return pName.getUtf8String(0);
    }

    public static void getActiveUniformsiv(int program, int uniformCount, MemorySegment uniformIndices, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetActiveUniformsiv).invokeExact(program, uniformCount, uniformIndices, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformsiv(SegmentAllocator allocator, int program, int[] uniformIndices, int pname, int[] params) {
        final int count = uniformIndices.length;
        var seg = allocator.allocateArray(JAVA_INT, count);
        getActiveUniformsiv(program, count, allocator.allocateArray(JAVA_INT, uniformIndices), pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getActiveUniformi(int program, int uniformIndex, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.callocInt();
            getActiveUniformsiv(program, 1, stack.ints(uniformIndex), pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getUniformBlockIndex(int program, MemorySegment uniformBlockName) {
        var caps = GLLoader.getCapabilities();
        try {
            return (int) GLLoader.check(caps.glGetUniformBlockIndex).invokeExact(program, uniformBlockName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getUniformBlockIndex(int program, String uniformBlockName) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return getUniformBlockIndex(program, stack.allocateUtf8String(uniformBlockName));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getUniformIndices(int program, int uniformCount, MemorySegment uniformNames, MemorySegment uniformIndices) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetUniformIndices).invokeExact(program, uniformCount, uniformNames, uniformIndices);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformIndices(SegmentAllocator allocator, int program, String[] uniformNames, int[] uniformIndices) {
        final int count = uniformNames.length;
        var pNames = allocator.allocateArray(ADDRESS, count);
        for (int i = 0; i < count; i++) {
            pNames.setAtIndex(ADDRESS, i, allocator.allocateUtf8String(uniformNames[i]));
        }
        var pIndices = allocator.allocateArray(JAVA_INT, count);
        getUniformIndices(program, count, pNames, pIndices);
        RuntimeHelper.toArray(pIndices, uniformIndices);
    }

    public static int getUniformIndex(int program, String uniformName) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            var seg = stack.allocate(JAVA_INT);
            getUniformIndices(program, 1, stack.allocateUtf8String(uniformName), seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void primitiveRestartIndex(int index) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glPrimitiveRestartIndex).invokeExact(index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texBuffer(int target, int internalFormat, int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glTexBuffer).invokeExact(target, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glUniformBlockBinding).invokeExact(program, uniformBlockIndex, uniformBlockBinding);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
