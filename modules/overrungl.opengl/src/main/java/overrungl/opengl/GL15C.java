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

import overrungl.opengl.ext.arb.GLARBOcclusionQuery;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;

/**
 * The OpenGL 1.5 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBOcclusionQuery GL_ARB_occlusion_query}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL15C extends GL14C permits GL20C {
    public static final int BUFFER_SIZE = 0x8764;
    public static final int BUFFER_USAGE = 0x8765;
    public static final int QUERY_COUNTER_BITS = 0x8864;
    public static final int CURRENT_QUERY = 0x8865;
    public static final int QUERY_RESULT = 0x8866;
    public static final int QUERY_RESULT_AVAILABLE = 0x8867;
    public static final int ARRAY_BUFFER = 0x8892;
    public static final int ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int ARRAY_BUFFER_BINDING = 0x8894;
    public static final int ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int READ_ONLY = 0x88B8;
    public static final int WRITE_ONLY = 0x88B9;
    public static final int READ_WRITE = 0x88BA;
    public static final int BUFFER_ACCESS = 0x88BB;
    public static final int BUFFER_MAPPED = 0x88BC;
    public static final int BUFFER_MAP_POINTER = 0x88BD;
    public static final int STREAM_DRAW = 0x88E0;
    public static final int STREAM_READ = 0x88E1;
    public static final int STREAM_COPY = 0x88E2;
    public static final int STATIC_DRAW = 0x88E4;
    public static final int STATIC_READ = 0x88E5;
    public static final int STATIC_COPY = 0x88E6;
    public static final int DYNAMIC_DRAW = 0x88E8;
    public static final int DYNAMIC_READ = 0x88E9;
    public static final int DYNAMIC_COPY = 0x88EA;
    public static final int SAMPLES_PASSED = 0x8914;
    public static final int SRC1_ALPHA = 0x8589;

    static boolean isSupported(GLCapabilities caps) {
        return GLLoader.checkAll(caps.glBeginQuery, caps.glBindBuffer, caps.glBufferData, caps.glBufferSubData, caps.glDeleteBuffers, caps.glDeleteQueries,
            caps.glEndQuery, caps.glGenBuffers, caps.glGenQueries, caps.glGetBufferParameteriv, caps.glGetBufferPointerv, caps.glGetBufferSubData,
            caps.glGetQueryObjectiv, caps.glGetQueryObjectuiv, caps.glGetQueryiv, caps.glIsBuffer, caps.glIsQuery, caps.glMapBuffer,
            caps.glUnmapBuffer);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBeginQuery = load.invoke("glBeginQuery", IIV);
        caps.glBindBuffer = load.invoke("glBindBuffer", IIV);
        caps.glBufferData = load.invoke("glBufferData", IJPIV);
        caps.glBufferSubData = load.invoke("glBufferSubData", IJJPV);
        caps.glDeleteBuffers = load.trivialHandle("glDeleteBuffers", IPV);
        caps.glDeleteQueries = load.trivialHandle("glDeleteQueries", IPV);
        caps.glEndQuery = load.invoke("glEndQuery", IV);
        caps.glGenBuffers = load.trivialHandle("glGenBuffers", IPV);
        caps.glGenQueries = load.trivialHandle("glGenQueries", IPV);
        caps.glGetBufferParameteriv = load.trivialHandle("glGetBufferParameteriv", IIPV);
        caps.glGetBufferPointerv = load.trivialHandle("glGetBufferPointerv", IIPV);
        caps.glGetBufferSubData = load.invoke("glGetBufferSubData", IJJPV);
        caps.glGetQueryObjectiv = load.trivialHandle("glGetQueryObjectiv", IIPV);
        caps.glGetQueryObjectuiv = load.trivialHandle("glGetQueryObjectuiv", IIPV);
        caps.glGetQueryiv = load.trivialHandle("glGetQueryiv", IIPV);
        caps.glIsBuffer = load.trivialHandle("glIsBuffer", IZ);
        caps.glIsQuery = load.trivialHandle("glIsQuery", IZ);
        caps.glMapBuffer = load.invoke("glMapBuffer", IIp);
        caps.glUnmapBuffer = load.invoke("glUnmapBuffer", IZ);
    }

    public static void beginQuery(int target, int id) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glBeginQuery).invokeExact(target, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBuffer(int target, int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glBindBuffer).invokeExact(target, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferData(int target, long size, MemorySegment data, int usage) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glBufferData).invokeExact(target, size, data, usage);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferData(int target, MemorySegment data, int usage) {
        bufferData(target, data.byteSize(), data, usage);
    }

    public static void bufferData(int target, long size, int usage) {
        bufferData(target, size, MemorySegment.NULL, usage);
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

    public static void bufferSubData(int target, long offset, long size, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glBufferSubData).invokeExact(target, offset, size, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bufferSubData(int target, long offset, MemorySegment data) {
        bufferSubData(target, offset, data.byteSize(), data);
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

    public static void deleteBuffers(int n, MemorySegment buffers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDeleteBuffers).invokeExact(n, buffers);
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
            deleteBuffers(1, stack.ints(buffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteQueries(int n, MemorySegment ids) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glDeleteQueries).invokeExact(n, ids);
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
            deleteQueries(1, stack.ints(id));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void endQuery(int target) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glEndQuery).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genBuffers(int n, MemorySegment buffers) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGenBuffers).invokeExact(n, buffers);
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

    public static void genQueries(int n, MemorySegment ids) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGenQueries).invokeExact(n, ids);
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

    public static void getBufferParameteriv(int target, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetBufferParameteriv).invokeExact(target, pname, params);
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

    public static void getBufferPointerv(int target, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetBufferPointerv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment getBufferPointer(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(ADDRESS);
            getBufferPointerv(target, pname, seg);
            return seg.get(RuntimeHelper.ADDRESS_UNBOUNDED, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getBufferSubData(int target, long offset, long size, MemorySegment data) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetBufferSubData).invokeExact(target, offset, size, data);
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

    public static void getQueryObjectiv(int id, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryObjectiv).invokeExact(id, pname, params);
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

    public static void getQueryObjectuiv(int id, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryObjectuiv).invokeExact(id, pname, params);
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

    public static void getQueryiv(int target, int pname, MemorySegment params) {
        var caps = GLLoader.getCapabilities();
        try {
            GLLoader.check(caps.glGetQueryiv).invokeExact(target, pname, params);
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
        var caps = GLLoader.getCapabilities();
        try {
            return (boolean) GLLoader.check(caps.glIsBuffer).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isQuery(int buffer) {
        var caps = GLLoader.getCapabilities();
        try {
            return (boolean) GLLoader.check(caps.glIsQuery).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment mapBuffer(int target, int access) {
        var caps = GLLoader.getCapabilities();
        try {
            final var seg = (MemorySegment) GLLoader.check(caps.glMapBuffer).invokeExact(target, access);
            return access == READ_ONLY ? seg.asReadOnly() : seg;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean unmapBuffer(int target) {
        var caps = GLLoader.getCapabilities();
        try {
            return (boolean) GLLoader.check(caps.glUnmapBuffer).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
