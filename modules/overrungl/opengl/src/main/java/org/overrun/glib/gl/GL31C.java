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
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.checkAll;

/**
 * The OpenGL 3.1 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL31C extends GL30C permits GL32C {
    @Nullable
    public static MethodHandle
        glCopyBufferSubData, glDrawArraysInstanced, glDrawElementsInstanced, glGetActiveUniformBlockName,
        glGetActiveUniformBlockiv, glGetActiveUniformName, glGetActiveUniformsiv, glGetUniformBlockIndex,
        glGetUniformIndices, glPrimitiveRestartIndex, glTexBuffer, glUniformBlockBinding;

    static boolean isSupported() {
        return checkAll(glBindBufferBase, glBindBufferRange, glCopyBufferSubData, glDrawArraysInstanced,
            glDrawElementsInstanced, glGetActiveUniformBlockName, glGetActiveUniformBlockiv, glGetActiveUniformName,
            glGetActiveUniformsiv, glGetIntegeri_v, glGetUniformBlockIndex, glGetUniformIndices,
            glPrimitiveRestartIndex, glTexBuffer, glUniformBlockBinding);
    }

    static void load(GLLoadFunc load) {
        glBindBufferBase = load.invoke("glBindBufferBase", IIIV);
        glBindBufferRange = load.invoke("glBindBufferRange", IIIJJV);
        glCopyBufferSubData = load.invoke("glCopyBufferSubData", IIJJJV);
        glDrawArraysInstanced = load.invoke("glDrawArraysInstanced", IIIIV);
        glDrawElementsInstanced = load.invoke("glDrawElementsInstanced", IIIPIV);
        glGetActiveUniformBlockName = load.invoke("glGetActiveUniformBlockName", IIIPPV);
        glGetActiveUniformBlockiv = load.invoke("glGetActiveUniformBlockiv", IIIPV);
        glGetActiveUniformName = load.invoke("glGetActiveUniformName", IIIPPV);
        glGetActiveUniformsiv = load.invoke("glGetActiveUniformsiv", IIPIPV);
        glGetIntegeri_v = load.invoke("glGetIntegeri_v", IIPV);
        glGetUniformBlockIndex = load.invoke("glGetUniformBlockIndex", IPI);
        glGetUniformIndices = load.invoke("glGetUniformIndices", IIPPV);
        glPrimitiveRestartIndex = load.invoke("glPrimitiveRestartIndex", IV);
        glTexBuffer = load.invoke("glTexBuffer", IIIV);
        glUniformBlockBinding = load.invoke("glUniformBlockBinding", IIIV);
    }

    public static void copyBufferSubData(int readTarget, int writeTarget, long readOffset, long writeOffset, long size) {
        try {
            check(glCopyBufferSubData).invokeExact(readTarget, writeTarget, readOffset, writeOffset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawArraysInstanced(int mode, int first, int count, int instanceCount) {
        try {
            check(glDrawArraysInstanced).invokeExact(mode, first, count, instanceCount);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstanced(int mode, int count, int type, Addressable indices, int instanceCount) {
        try {
            check(glDrawElementsInstanced).invokeExact(mode, count, type, indices, instanceCount);
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

    public static void getActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, Addressable length, Addressable uniformBlockName) {
        try {
            check(glGetActiveUniformBlockName).invokeExact(program, uniformBlockIndex, bufSize, length, uniformBlockName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformBlockName(SegmentAllocator allocator, int program, int uniformBlockIndex, int bufSize, int @Nullable [] length, String[] uniformBlockName) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformBlockName(program, uniformBlockIndex, bufSize, pLen, pName);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        uniformBlockName[0] = pName.getUtf8String(0);
    }

    public static String getActiveUniformBlockName(SegmentAllocator allocator, int program, int uniformBlockIndex, int bufSize) {
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformBlockName(program, uniformBlockIndex, bufSize, MemoryAddress.NULL, pName);
        return pName.getUtf8String(0);
    }

    public static void getActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, Addressable params) {
        try {
            check(glGetActiveUniformBlockiv).invokeExact(program, uniformBlockIndex, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformBlockiv(SegmentAllocator allocator, int program, int uniformBlockIndex, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getActiveUniformBlockiv(program, uniformBlockIndex, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void getActiveUniformName(int program, int uniformIndex, int bufSize, Addressable length, Addressable uniformName) {
        try {
            check(glGetActiveUniformName).invokeExact(program, uniformIndex, bufSize, length, uniformName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getActiveUniformName(SegmentAllocator allocator, int program, int uniformIndex, int bufSize, int @Nullable [] length, String[] uniformName) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformName(program, uniformIndex, bufSize, pLen, pName);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        uniformName[0] = pName.getUtf8String(0);
    }

    public static String getActiveUniformName(SegmentAllocator allocator, int program, int uniformIndex, int bufSize) {
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getActiveUniformName(program, uniformIndex, bufSize, MemoryAddress.NULL, pName);
        return pName.getUtf8String(0);
    }

    public static void getActiveUniformsiv(int program, int uniformCount, Addressable uniformIndices, int pname, Addressable params) {
        try {
            check(glGetActiveUniformsiv).invokeExact(program, uniformCount, uniformIndices, pname, params);
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
            var seg = stack.calloc(JAVA_INT);
            var pi = stack.calloc(JAVA_INT);
            pi.set(JAVA_INT, 0, uniformIndex);
            getActiveUniformsiv(program, 1, pi, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getUniformBlockIndex(int program, Addressable uniformBlockName) {
        try {
            return (int) check(glGetUniformBlockIndex).invokeExact(program, uniformBlockName);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getUniformBlockIndex(SegmentAllocator allocator, int program, String uniformBlockName) {
        return getUniformBlockIndex(program, allocator.allocateUtf8String(uniformBlockName));
    }

    public static void getUniformIndices(int program, int uniformCount, Addressable uniformNames, Addressable uniformIndices) {
        try {
            check(glGetUniformIndices).invokeExact(program, uniformCount, uniformNames, uniformIndices);
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

    public static int getUniformIndex(SegmentAllocator allocator, int program, String uniformName) {
        var seg = allocator.allocate(JAVA_INT);
        getUniformIndices(program, 1, allocator.allocateUtf8String(uniformName), seg);
        return seg.get(JAVA_INT, 0);
    }

    public static void primitiveRestartIndex(int index) {
        try {
            check(glPrimitiveRestartIndex).invokeExact(index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texBuffer(int target, int internalFormat, int buffer) {
        try {
            check(glTexBuffer).invokeExact(target, internalFormat, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniformBlockBinding(int program, int uniformBlockIndex, int uniformBlockBinding) {
        try {
            check(glUniformBlockBinding).invokeExact(program, uniformBlockIndex, uniformBlockBinding);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
