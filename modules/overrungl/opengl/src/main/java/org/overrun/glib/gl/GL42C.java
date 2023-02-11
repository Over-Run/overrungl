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

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

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
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL42C extends GL41C permits GL43C {
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
        caps.glGetActiveAtomicCounterBufferiv = load.invoke("glGetActiveAtomicCounterBufferiv", IIIPV);
        caps.glGetInternalformativ = load.invoke("glGetInternalformativ", IIIIPV);
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
