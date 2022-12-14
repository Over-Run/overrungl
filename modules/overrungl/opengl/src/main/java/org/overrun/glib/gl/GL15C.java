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

import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.BufferBuilder;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 1.5 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL15C extends GL14C permits GL20C {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBeginQuery, caps.glBindBuffer, caps.glBufferData, caps.glBufferSubData, caps.glDeleteBuffers, caps.glDeleteQueries,
            caps.glEndQuery, caps.glGenBuffers, caps.glGenQueries, caps.glGetBufferParameteriv, caps.glGetBufferPointerv, caps.glGetBufferSubData,
            caps.glGetQueryObjectiv, caps.glGetQueryObjectuiv, caps.glGetQueryiv, caps.glIsBuffer, caps.glIsQuery, caps.glMapBuffer,
            caps.glUnmapBuffer);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBeginQuery = load.invoke("glBeginQuery", IIV);
        caps.glBindBuffer = load.invoke("glBindBuffer", IIV);
        caps.glBufferData = load.invoke("glBufferData", IJPIV);
        caps.glBufferSubData = load.invoke("glBufferSubData", IJJPV);
        caps.glDeleteBuffers = load.invoke("glDeleteBuffers", IPV);
        caps.glDeleteQueries = load.invoke("glDeleteQueries", IPV);
        caps.glEndQuery = load.invoke("glEndQuery", IV);
        caps.glGenBuffers = load.invoke("glGenBuffers", IPV);
        caps.glGenQueries = load.invoke("glGenQueries", IPV);
        caps.glGetBufferParameteriv = load.invoke("glGetBufferParameteriv", IIPV);
        caps.glGetBufferPointerv = load.invoke("glGetBufferPointerv", IIPV);
        caps.glGetBufferSubData = load.invoke("glGetBufferSubData", IJJPV);
        caps.glGetQueryObjectiv = load.invoke("glGetQueryObjectiv", IIPV);
        caps.glGetQueryObjectuiv = load.invoke("glGetQueryObjectuiv", IIPV);
        caps.glGetQueryiv = load.invoke("glGetQueryiv", IIPV);
        caps.glIsBuffer = load.invoke("glIsBuffer", IZ);
        caps.glIsQuery = load.invoke("glIsQuery", IZ);
        caps.glMapBuffer = load.invoke("glMapBuffer", IIP);
        caps.glUnmapBuffer = load.invoke("glUnmapBuffer", IZ);
    }

    public static void beginQuery(int target, int id) {
        var caps = getCapabilities();
        try {
            check(caps.glBeginQuery).invokeExact(target, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBuffer(int target, int buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBuffer).invokeExact(target, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferData(int target, long size, Addressable data, int usage) {
        var caps = getCapabilities();
        try {
            check(caps.glBufferData).invokeExact(target, size, data, usage);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferData(int target, MemorySegment data, int usage) {
        bufferData(target, data.byteSize(), data, usage);
    }

    public static void bufferData(int target, BufferBuilder data, int usage) {
        bufferData(target, data.offset(), data.address(), usage);
    }

    public static void bufferData(int target, long size, int usage) {
        bufferData(target, size, MemoryAddress.NULL, usage);
    }

    public static void bufferData(SegmentAllocator allocator, int target, byte[] data, int usage) {
        bufferData(target, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data), usage);
    }

    public static void bufferData(SegmentAllocator allocator, int target, short[] data, int usage) {
        bufferData(target, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data), usage);
    }

    public static void bufferData(SegmentAllocator allocator, int target, int[] data, int usage) {
        bufferData(target, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data), usage);
    }

    public static void bufferData(SegmentAllocator allocator, int target, long[] data, int usage) {
        bufferData(target, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data), usage);
    }

    public static void bufferData(SegmentAllocator allocator, int target, float[] data, int usage) {
        bufferData(target, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data), usage);
    }

    public static void bufferData(SegmentAllocator allocator, int target, double[] data, int usage) {
        bufferData(target, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data), usage);
    }

    public static void bufferSubData(int target, long offset, long size, Addressable data) {
        var caps = getCapabilities();
        try {
            check(caps.glBufferSubData).invokeExact(target, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferSubData(int target, long offset, MemorySegment data) {
        bufferSubData(target, offset, data.byteSize(), data);
    }

    public static void bufferSubData(int target, long offset, BufferBuilder data) {
        bufferSubData(target, offset, data.offset(), data.address());
    }

    public static void bufferSubData(SegmentAllocator allocator, int target, long offset, byte[] data) {
        bufferSubData(target, offset, Integer.toUnsignedLong(data.length), allocator.allocateArray(JAVA_BYTE, data));
    }

    public static void bufferSubData(SegmentAllocator allocator, int target, long offset, short[] data) {
        bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 1, allocator.allocateArray(JAVA_SHORT, data));
    }

    public static void bufferSubData(SegmentAllocator allocator, int target, long offset, int[] data) {
        bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_INT, data));
    }

    public static void bufferSubData(SegmentAllocator allocator, int target, long offset, long[] data) {
        bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_LONG, data));
    }

    public static void bufferSubData(SegmentAllocator allocator, int target, long offset, float[] data) {
        bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, allocator.allocateArray(JAVA_FLOAT, data));
    }

    public static void bufferSubData(SegmentAllocator allocator, int target, long offset, double[] data) {
        bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, allocator.allocateArray(JAVA_DOUBLE, data));
    }

    public static void deleteBuffers(int n, Addressable buffers) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteBuffers).invokeExact(n, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteBuffers(SegmentAllocator allocator, int[] buffers) {
        deleteBuffers(buffers.length, allocator.allocateArray(JAVA_INT, buffers));
    }

    public static void deleteBuffer(int buffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, buffer);
            deleteBuffers(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteQueries(int n, Addressable ids) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteQueries).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteQueries(SegmentAllocator allocator, int[] ids) {
        deleteQueries(ids.length, allocator.allocateArray(JAVA_INT, ids));
    }

    public static void deleteQuery(int id) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, id);
            deleteQueries(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void endQuery(int target) {
        var caps = getCapabilities();
        try {
            check(caps.glEndQuery).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genBuffers(int n, Addressable buffers) {
        var caps = getCapabilities();
        try {
            check(caps.glGenBuffers).invokeExact(n, buffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genBuffers(SegmentAllocator allocator, int[] buffers) {
        var seg = allocator.allocateArray(JAVA_INT, buffers.length);
        genBuffers(buffers.length, seg);
        RuntimeHelper.toArray(seg, buffers);
    }

    public static int genBuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genBuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void genQueries(int n, Addressable ids) {
        var caps = getCapabilities();
        try {
            check(caps.glGenQueries).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genQueries(SegmentAllocator allocator, int[] ids) {
        var seg = allocator.allocateArray(JAVA_INT, ids.length);
        genQueries(ids.length, seg);
        RuntimeHelper.toArray(seg, ids);
    }

    public static int genQuery() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genQueries(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getBufferParameteriv(int target, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBufferParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getBufferParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getBufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getBufferPointerv(int target, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBufferPointerv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress getBufferPointer(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(ADDRESS);
            getBufferPointerv(target, pname, seg);
            return seg.get(ADDRESS, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getBufferSubData(int target, long offset, long size, Addressable data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBufferSubData).invokeExact(target, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBufferSubData(SegmentAllocator allocator, int target, long offset, byte[] data) {
        var seg = allocator.allocateArray(JAVA_BYTE, data.length);
        getBufferSubData(target, offset, Integer.toUnsignedLong(data.length), seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getBufferSubData(SegmentAllocator allocator, int target, long offset, short[] data) {
        var seg = allocator.allocateArray(JAVA_SHORT, data.length);
        getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 1, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getBufferSubData(SegmentAllocator allocator, int target, long offset, int[] data) {
        var seg = allocator.allocateArray(JAVA_INT, data.length);
        getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getBufferSubData(SegmentAllocator allocator, int target, long offset, long[] data) {
        var seg = allocator.allocateArray(JAVA_LONG, data.length);
        getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getBufferSubData(SegmentAllocator allocator, int target, long offset, float[] data) {
        var seg = allocator.allocateArray(JAVA_FLOAT, data.length);
        getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getBufferSubData(SegmentAllocator allocator, int target, long offset, double[] data) {
        var seg = allocator.allocateArray(JAVA_DOUBLE, data.length);
        getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static void getQueryObjectiv(int id, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetQueryObjectiv).invokeExact(id, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getQueryObjecti(int id, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getQueryObjectiv(id, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryObjectuiv(int id, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetQueryObjectuiv).invokeExact(id, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getQueryObjectui(int id, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getQueryObjectuiv(id, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getQueryiv(int target, int pname, Addressable params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetQueryiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getQueryi(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getQueryiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isBuffer(int buffer) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsBuffer).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isQuery(int buffer) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsQuery).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress mapBuffer(int target, int access) {
        var caps = getCapabilities();
        try {
            return (MemoryAddress) check(caps.glMapBuffer).invokeExact(target, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean unmapBuffer(int target) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glUnmapBuffer).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
