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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 3.2 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL32C extends GL31C permits GL33C {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glClientWaitSync, caps.glDeleteSync, caps.glDrawElementsBaseVertex, caps.glDrawElementsInstancedBaseVertex, caps.glDrawRangeElementsBaseVertex, caps.glFenceSync,
            caps.glFramebufferTexture, caps.glGetBufferParameteri64v, caps.glGetInteger64i_v, caps.glGetInteger64v, caps.glGetMultisamplefv, caps.glGetSynciv,
            caps.glIsSync, caps.glMultiDrawElementsBaseVertex, caps.glProvokingVertex, caps.glSampleMaski, caps.glTexImage2DMultisample, caps.glTexImage3DMultisample,
            caps.glWaitSync);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glClientWaitSync = load.invoke("glClientWaitSync", PIJI);
        caps.glDeleteSync = load.invoke("glDeleteSync", PV);
        caps.glDrawElementsBaseVertex = load.invoke("glDrawElementsBaseVertex", IIIPIV);
        caps.glDrawElementsInstancedBaseVertex = load.invoke("glDrawElementsInstancedBaseVertex", IIIPIIV);
        caps.glDrawRangeElementsBaseVertex = load.invoke("glDrawRangeElementsBaseVertex", IIIIIPIV);
        caps.glFenceSync = load.invoke("glFenceSync", IIP);
        caps.glFramebufferTexture = load.invoke("glFramebufferTexture", IIIIV);
        caps.glGetBufferParameteri64v = load.invoke("glGetBufferParameteri64v", IIPV);
        caps.glGetInteger64i_v = load.invoke("glGetInteger64i_v", IIPV);
        caps.glGetInteger64v = load.invoke("glGetInteger64v", IPV);
        caps.glGetMultisamplefv = load.invoke("glGetMultisamplefv", IIPV);
        caps.glGetSynciv = load.invoke("glGetSynciv", PIIPPV);
        caps.glIsSync = load.invoke("glIsSync", PZ);
        caps.glMultiDrawElementsBaseVertex = load.invoke("glMultiDrawElementsBaseVertex", IPIPIPV);
        caps.glProvokingVertex = load.invoke("glProvokingVertex", IV);
        caps.glSampleMaski = load.invoke("glSampleMaski", IIV);
        caps.glTexImage2DMultisample = load.invoke("glTexImage2DMultisample", IIIIIZV);
        caps.glTexImage3DMultisample = load.invoke("glTexImage3DMultisample", IIIIIIZV);
        caps.glWaitSync = load.invoke("glWaitSync", PIJV);
    }

    public static int clientWaitSync(MemorySegment sync, int flags, long timeout) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glClientWaitSync).invokeExact(sync, flags, timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteSync(MemorySegment sync) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteSync).invokeExact(sync);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsBaseVertex(int mode, int count, int type, MemorySegment indices, int baseVertex) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawElementsBaseVertex).invokeExact(mode, count, type, indices, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), baseVertex);
    }

    public static void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), baseVertex);
    }

    public static void drawElementsBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int baseVertex) {
        drawElementsBaseVertex(mode, count, type, allocator.allocateArray(JAVA_INT, indices), baseVertex);
    }

    public static void drawElementsInstancedBaseVertex(int mode, int count, int type, MemorySegment indices, int instanceCount, int baseVertex) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawElementsInstancedBaseVertex).invokeExact(mode, count, type, indices, instanceCount, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, byte[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, allocator.allocateArray(JAVA_BYTE, indices), instanceCount, baseVertex);
    }

    public static void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, short[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, allocator.allocateArray(JAVA_SHORT, indices), instanceCount, baseVertex);
    }

    public static void drawElementsInstancedBaseVertex(SegmentAllocator allocator, int mode, int count, int type, int[] indices, int instanceCount, int baseVertex) {
        drawElementsInstancedBaseVertex(mode, count, type, allocator.allocateArray(JAVA_INT, indices), instanceCount, baseVertex);
    }

    public static void drawRangeElementsBaseVertex(int mode, int start, int end, int count, int type, MemorySegment indices, int baseVertex) {
        var caps = getCapabilities();
        try {
            check(caps.glDrawRangeElementsBaseVertex).invokeExact(mode, start, end, count, type, indices, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, byte[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, allocator.allocateArray(JAVA_BYTE, indices), baseVertex);
    }

    public static void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, short[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, allocator.allocateArray(JAVA_SHORT, indices), baseVertex);
    }

    public static void drawRangeElementsBaseVertex(SegmentAllocator allocator, int mode, int start, int end, int count, int type, int[] indices, int baseVertex) {
        drawRangeElementsBaseVertex(mode, start, end, count, type, allocator.allocateArray(JAVA_INT, indices), baseVertex);
    }

    public static MemorySegment fenceSync(int condition, int flags) {
        var caps = getCapabilities();
        try {
            return (MemorySegment) check(caps.glFenceSync).invokeExact(condition, flags);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture(int target, int attachment, int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture).invokeExact(target, attachment, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBufferParameteri64v(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBufferParameteri64v).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static long getBufferParameteri64(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getBufferParameteri64v(target, pname, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInteger64i_v(int target, int index, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetInteger64i_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInteger64i_v(SegmentAllocator allocator, int target, int index, long[] data) {
        var seg = allocator.allocateArray(JAVA_LONG, data.length);
        getInteger64i_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static long getInteger64i(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getInteger64i_v(target, index, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInteger64v(int pname, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetInteger64v).invokeExact(pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInteger64v(SegmentAllocator allocator, int pname, long[] data) {
        var pData = allocator.allocateArray(JAVA_LONG, data.length);
        getInteger64v(pname, pData);
        RuntimeHelper.toArray(pData, data);
    }

    public static long getInteger64(int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pData = stack.calloc(JAVA_LONG);
            getInteger64v(pname, pData);
            return pData.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getMultisamplefv(int pname, int index, MemorySegment val) {
        var caps = getCapabilities();
        try {
            check(caps.glGetMultisamplefv).invokeExact(pname, index, val);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getMultisamplefv(SegmentAllocator allocator, int pname, int index, float[] val) {
        var seg = allocator.allocateArray(JAVA_FLOAT, val.length);
        getMultisamplefv(pname, index, seg);
        RuntimeHelper.toArray(seg, val);
    }

    public static float[] getMultisamplefv(SegmentAllocator allocator, int pname, int index) {
        var seg = allocator.allocateArray(JAVA_FLOAT, 2);
        getMultisamplefv(pname, index, seg);
        return new float[]{seg.get(JAVA_FLOAT, 0), seg.getAtIndex(JAVA_FLOAT, 1)};
    }

    public static void getSynciv(MemorySegment sync, int pname, int count, MemorySegment length, MemorySegment values) {
        var caps = getCapabilities();
        try {
            check(caps.glGetSynciv).invokeExact(sync, pname, count, length, values);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getSynciv(SegmentAllocator allocator, MemorySegment sync, int pname, int @Nullable [] length, int[] values) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        var pVal = allocator.allocateArray(JAVA_INT, values.length);
        getSynciv(sync, pname, values.length, pLen, pVal);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        RuntimeHelper.toArray(pVal, values);
    }

    public static int getSynci(MemorySegment sync, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getSynciv(sync, pname, 1, MemorySegment.NULL, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isSync(MemorySegment sync) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsSync).invokeExact(sync);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsBaseVertex(int mode, MemorySegment count, int type, MemorySegment indices, int drawCount, MemorySegment baseVertex) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawElementsBaseVertex).invokeExact(mode, count, type, indices, drawCount, baseVertex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, MemorySegment[] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, indices[i]);
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, byte[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_BYTE, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, short[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_SHORT, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void multiDrawElementsBaseVertex(SegmentAllocator allocator, int mode, int[] count, int type, int[][] indices, int drawCount, int[] baseVertex) {
        var seg = allocator.allocateArray(ADDRESS, indices.length);
        for (int i = 0; i < indices.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateArray(JAVA_INT, indices[i]));
        }
        multiDrawElementsBaseVertex(mode, allocator.allocateArray(JAVA_INT, count), type, seg, drawCount, allocator.allocateArray(JAVA_INT, baseVertex));
    }

    public static void provokingVertex(int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glProvokingVertex).invokeExact(mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void sampleMaski(int maskNumber, int mask) {
        var caps = getCapabilities();
        try {
            check(caps.glSampleMaski).invokeExact(maskNumber, mask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        var caps = getCapabilities();
        try {
            check(caps.glTexImage2DMultisample).invokeExact(target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texImage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        var caps = getCapabilities();
        try {
            check(caps.glTexImage3DMultisample).invokeExact(target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void waitSync(MemorySegment sync, int flags, long timeout) {
        var caps = getCapabilities();
        try {
            check(caps.glWaitSync).invokeExact(sync, flags, timeout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
