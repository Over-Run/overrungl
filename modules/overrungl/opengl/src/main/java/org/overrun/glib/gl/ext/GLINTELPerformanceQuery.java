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

package org.overrun.glib.gl.ext;

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_INTEL_performance_query}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLINTELPerformanceQuery {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_performance_query) return;
        ext.glBeginPerfQueryINTEL = load.invoke("glBeginPerfQueryINTEL", IV);
        ext.glCreatePerfQueryINTEL = load.invoke("glCreatePerfQueryINTEL", IPV);
        ext.glDeletePerfQueryINTEL = load.invoke("glDeletePerfQueryINTEL", IV);
        ext.glEndPerfQueryINTEL = load.invoke("glEndPerfQueryINTEL", IV);
        ext.glGetFirstPerfQueryIdINTEL = load.invoke("glGetFirstPerfQueryIdINTEL", PV);
        ext.glGetNextPerfQueryIdINTEL = load.invoke("glGetNextPerfQueryIdINTEL", IPV);
        ext.glGetPerfCounterInfoINTEL = load.invoke("glGetPerfCounterInfoINTEL", IIIPIPPPPPPV);
        ext.glGetPerfQueryDataINTEL = load.invoke("glGetPerfQueryDataINTEL", IIIPPV);
        ext.glGetPerfQueryIdByNameINTEL = load.invoke("glGetPerfQueryIdByNameINTEL", PPV);
        ext.glGetPerfQueryInfoINTEL = load.invoke("glGetPerfQueryInfoINTEL", IIPPPPPV);
    }

    public static void glBeginPerfQueryINTEL(int queryHandle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glBeginPerfQueryINTEL).invokeExact(queryHandle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glCreatePerfQueryINTEL(int queryId, MemorySegment queryHandle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glCreatePerfQueryINTEL).invokeExact(queryId, queryHandle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glCreatePerfQueryINTEL(int queryId) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glCreatePerfQueryINTEL(queryId, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glDeletePerfQueryINTEL(int queryHandle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDeletePerfQueryINTEL).invokeExact(queryHandle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glEndPerfQueryINTEL(int queryHandle) {
        var ext = getExtCapabilities();
        try {
            check(ext.glEndPerfQueryINTEL).invokeExact(queryHandle);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetFirstPerfQueryIdINTEL(MemorySegment queryId) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetFirstPerfQueryIdINTEL).invokeExact(queryId);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glGetFirstPerfQueryIdINTEL() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGetFirstPerfQueryIdINTEL(seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGetNextPerfQueryIdINTEL(int queryId, MemorySegment nextQueryId) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetNextPerfQueryIdINTEL).invokeExact(queryId, nextQueryId);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glGetNextPerfQueryIdINTEL(int queryId) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGetNextPerfQueryIdINTEL(queryId, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGetPerfCounterInfoINTEL(int queryId, int counterId,
                                                 int counterNameLength, MemorySegment counterName,
                                                 int counterDescLength, MemorySegment counterDesc,
                                                 MemorySegment counterOffset, MemorySegment counterDataSize, MemorySegment counterTypeEnum,
                                                 MemorySegment counterDataTypeEnum, MemorySegment rawCounterMaxValue) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfCounterInfoINTEL).invokeExact(queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfCounterInfoINTEL(SegmentAllocator allocator,
                                                 int queryId, int counterId,
                                                 int counterNameLength, String[] counterName,
                                                 int counterDescLength, String[] counterDesc,
                                                 int[] counterOffset, int[] counterDataSize, int[] counterTypeEnum,
                                                 int[] counterDataTypeEnum, long[] rawCounterMaxValue) {
        var pn = allocator.allocateArray(JAVA_BYTE, counterNameLength);
        var pd = allocator.allocateArray(JAVA_BYTE, counterDescLength);
        var po = allocator.allocate(JAVA_INT);
        var ps = allocator.allocate(JAVA_INT);
        var pte = allocator.allocate(JAVA_INT);
        var pdte = allocator.allocate(JAVA_INT);
        var pv = allocator.allocate(JAVA_LONG);
        glGetPerfCounterInfoINTEL(queryId, counterId, counterNameLength, pn, counterDescLength, pd, po, ps, pte, pdte, pv);
        counterName[0] = pn.getUtf8String(0);
        counterDesc[0] = pd.getUtf8String(0);
        counterOffset[0] = po.get(JAVA_INT, 0);
        counterDataSize[0] = ps.get(JAVA_INT, 0);
        counterTypeEnum[0] = pte.get(JAVA_INT, 0);
        counterDataTypeEnum[0] = pdte.get(JAVA_INT, 0);
        rawCounterMaxValue[0] = pv.get(JAVA_LONG, 0);
    }

    public static void glGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, MemorySegment data, MemorySegment bytesWritten) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfQueryDataINTEL).invokeExact(queryHandle, flags, dataSize, data, bytesWritten);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfQueryDataINTEL(SegmentAllocator allocator, int queryHandle, int flags, int dataSize, MemorySegment data, int[] bytesWritten) {
        var seg = allocator.allocate(JAVA_INT);
        glGetPerfQueryDataINTEL(queryHandle, flags, dataSize, data, seg);
        bytesWritten[0] = seg.get(JAVA_INT, 0);
    }

    public static void glGetPerfQueryIdByNameINTEL(MemorySegment queryName, MemorySegment queryId) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfQueryIdByNameINTEL).invokeExact(queryName, queryId);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glGetPerfQueryIdByNameINTEL(SegmentAllocator allocator, String queryName) {
        var seg = allocator.allocate(JAVA_INT);
        glGetPerfQueryIdByNameINTEL(allocator.allocateUtf8String(queryName), seg);
        return seg.get(JAVA_INT, 0);
    }

    public static void glGetPerfQueryInfoINTEL(int queryId, int queryNameLength, MemorySegment queryName, MemorySegment dataSize, MemorySegment noCounters, MemorySegment noInstances, MemorySegment capsMask) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfQueryInfoINTEL).invokeExact(queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfQueryInfoINTEL(SegmentAllocator allocator, int queryId, int queryNameLength, String[] queryName, int[] dataSize, int[] noCounters, int[] noInstances, int[] capsMask) {
        var pn = allocator.allocateArray(JAVA_BYTE, queryNameLength);
        var ps = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var pi = allocator.allocate(JAVA_INT);
        var pm = allocator.allocate(JAVA_INT);
        glGetPerfQueryInfoINTEL(queryId, queryNameLength, pn, ps, pc, pi, pm);
        queryName[0] = pn.getUtf8String(0);
        dataSize[0] = ps.get(JAVA_INT, 0);
        noCounters[0] = pc.get(JAVA_INT, 0);
        noInstances[0] = pi.get(JAVA_INT, 0);
        capsMask[0] = pm.get(JAVA_INT, 0);
    }
}
