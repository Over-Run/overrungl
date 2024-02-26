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
import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBOcclusionQuery;
import overrungl.opengl.ext.arb.GLARBVertexBufferObject;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * The OpenGL 1.5 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBOcclusionQuery GL_ARB_occlusion_query}</li>
 *     <li>{@linkplain GLARBVertexBufferObject GL_ARB_vertex_buffer_object}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL15C extends DirectAccess {
    int BUFFER_SIZE = 0x8764;
    int BUFFER_USAGE = 0x8765;
    int QUERY_COUNTER_BITS = 0x8864;
    int CURRENT_QUERY = 0x8865;
    int QUERY_RESULT = 0x8866;
    int QUERY_RESULT_AVAILABLE = 0x8867;
    int ARRAY_BUFFER = 0x8892;
    int ELEMENT_ARRAY_BUFFER = 0x8893;
    int ARRAY_BUFFER_BINDING = 0x8894;
    int ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    int READ_ONLY = 0x88B8;
    int WRITE_ONLY = 0x88B9;
    int READ_WRITE = 0x88BA;
    int BUFFER_ACCESS = 0x88BB;
    int BUFFER_MAPPED = 0x88BC;
    int BUFFER_MAP_POINTER = 0x88BD;
    int STREAM_DRAW = 0x88E0;
    int STREAM_READ = 0x88E1;
    int STREAM_COPY = 0x88E2;
    int STATIC_DRAW = 0x88E4;
    int STATIC_READ = 0x88E5;
    int STATIC_COPY = 0x88E6;
    int DYNAMIC_DRAW = 0x88E8;
    int DYNAMIC_READ = 0x88E9;
    int DYNAMIC_COPY = 0x88EA;
    int SAMPLES_PASSED = 0x8914;
    int SRC1_ALPHA = 0x8589;

    @Entrypoint("glBeginQuery")
    default void beginQuery(int target, int id) {
        throw new ContextException();
    }

    @Entrypoint("glBindBuffer")
    default void bindBuffer(int target, int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glBufferData")
    default void bufferData(int target, long size, MemorySegment data, int usage) {
        throw new ContextException();
    }

    @Skip
    default void bufferData(int target, MemorySegment data, int usage) {
        bufferData(target, data.byteSize(), data, usage);
    }

    @Skip
    default void bufferData(int target, long size, int usage) {
        bufferData(target, size, MemorySegment.NULL, usage);
    }

    @Skip
    default void bufferData(SegmentAllocator allocator, int target, byte[] data, int usage) {
        bufferData(target, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void bufferData(SegmentAllocator allocator, int target, short[] data, int usage) {
        bufferData(target, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void bufferData(SegmentAllocator allocator, int target, int[] data, int usage) {
        bufferData(target, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void bufferData(SegmentAllocator allocator, int target, long[] data, int usage) {
        bufferData(target, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void bufferData(SegmentAllocator allocator, int target, float[] data, int usage) {
        bufferData(target, Marshal.marshal(allocator, data), usage);
    }

    @Skip
    default void bufferData(SegmentAllocator allocator, int target, double[] data, int usage) {
        bufferData(target, Marshal.marshal(allocator, data), usage);
    }

    @Entrypoint("glBufferSubData")
    default void bufferSubData(int target, long offset, long size, MemorySegment data) {
        throw new ContextException();
    }

    @Skip
    default void bufferSubData(int target, long offset, MemorySegment data) {
        bufferSubData(target, offset, data.byteSize(), data);
    }

    @Skip
    default void bufferSubData(SegmentAllocator allocator, int target, long offset, byte[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferSubData(target, offset, segment.byteSize(), segment);
    }

    @Skip
    default void bufferSubData(SegmentAllocator allocator, int target, long offset, short[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferSubData(target, offset, segment.byteSize(), segment);
    }

    @Skip
    default void bufferSubData(SegmentAllocator allocator, int target, long offset, int[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferSubData(target, offset, segment.byteSize(), segment);
    }

    @Skip
    default void bufferSubData(SegmentAllocator allocator, int target, long offset, long[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferSubData(target, offset, segment.byteSize(), segment);
    }

    @Skip
    default void bufferSubData(SegmentAllocator allocator, int target, long offset, float[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferSubData(target, offset, segment.byteSize(), segment);
    }

    @Skip
    default void bufferSubData(SegmentAllocator allocator, int target, long offset, double[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        bufferSubData(target, offset, segment.byteSize(), segment);
    }

    @Entrypoint("glDeleteBuffers")
    default void deleteBuffers(int n, MemorySegment buffers) {
        throw new ContextException();
    }

    @Skip
    default void deleteBuffers(int... buffers) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteBuffers(buffers.length, Marshal.marshal(stack, buffers));
        }
    }

    @Entrypoint("glDeleteQueries")
    default void deleteQueries(int n, MemorySegment ids) {
        throw new ContextException();
    }

    @Skip
    default void deleteQueries(int... ids) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteQueries(ids.length, Marshal.marshal(stack, ids));
        }
    }

    @Entrypoint("glEndQuery")
    default void endQuery(int target) {
        throw new ContextException();
    }

    @Entrypoint("glGenBuffers")
    default void genBuffers(int n, MemorySegment buffers) {
        throw new ContextException();
    }

    @Skip
    default void genBuffers(SegmentAllocator allocator, @Ref int[] buffers) {
        var seg = Marshal.marshal(allocator, buffers);
        genBuffers(buffers.length, seg);
        Unmarshal.copy(seg, buffers);
    }

    @Skip
    default int genBuffers() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genBuffers(1, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGenQueries")
    default void genQueries(int n, MemorySegment ids) {
        throw new ContextException();
    }

    @Skip
    default void genQueries(SegmentAllocator allocator, @Ref int[] ids) {
        var seg = Marshal.marshal(allocator, ids);
        genQueries(ids.length, seg);
        Unmarshal.copy(seg, ids);
    }

    @Skip
    default int genQueries() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genQueries(1, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetBufferParameteriv")
    default void getBufferParameteriv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getBufferParameteriv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getBufferParameteriv(target, pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetBufferPointerv")
    default void getBufferPointerv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default MemorySegment getBufferPointerv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.segments(MemorySegment.NULL);
            getBufferPointerv(target, pname, seg);
            return seg.get(ValueLayout.ADDRESS, 0);
        }
    }

    @Entrypoint("glGetBufferSubData")
    default void getBufferSubData(int target, long offset, long size, MemorySegment data) {
        throw new ContextException();
    }

    @Skip
    default void getBufferSubData(SegmentAllocator allocator, int target, long offset, @Ref byte[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        getBufferSubData(target, offset, segment.byteSize(), segment);
        Unmarshal.copy(segment, data);
    }

    @Skip
    default void getBufferSubData(SegmentAllocator allocator, int target, long offset, @Ref short[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        getBufferSubData(target, offset, segment.byteSize(), segment);
        Unmarshal.copy(segment, data);
    }

    @Skip
    default void getBufferSubData(SegmentAllocator allocator, int target, long offset, @Ref int[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        getBufferSubData(target, offset, segment.byteSize(), segment);
        Unmarshal.copy(segment, data);
    }

    @Skip
    default void getBufferSubData(SegmentAllocator allocator, int target, long offset, @Ref long[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        getBufferSubData(target, offset, segment.byteSize(), segment);
        Unmarshal.copy(segment, data);
    }

    @Skip
    default void getBufferSubData(SegmentAllocator allocator, int target, long offset, @Ref float[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        getBufferSubData(target, offset, segment.byteSize(), segment);
        Unmarshal.copy(segment, data);
    }

    @Skip
    default void getBufferSubData(SegmentAllocator allocator, int target, long offset, @Ref double[] data) {
        final MemorySegment segment = Marshal.marshal(allocator, data);
        getBufferSubData(target, offset, segment.byteSize(), segment);
        Unmarshal.copy(segment, data);
    }

    @Entrypoint("glGetQueryObjectiv")
    default void getQueryObjectiv(int id, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getQueryObjectiv(int id, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getQueryObjectiv(id, pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetQueryObjectuiv")
    default void getQueryObjectuiv(int id, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getQueryObjectuiv(int id, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getQueryObjectuiv(id, pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetQueryiv")
    default void getQueryiv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getQueryiv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getQueryiv(target, pname, seg);
            return seg.get(ValueLayout.JAVA_INT, 0);
        }
    }

    @Entrypoint("glIsBuffer")
    default boolean isBuffer(int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glIsQuery")
    default boolean isQuery(int buffer) {
        throw new ContextException();
    }

    default MethodHandle glMapBuffer() {
        throw new ContextException();
    }

    @Skip
    default MemorySegment mapBuffer(int target, int access) {
        long size = 0;
        if (this instanceof GL32C gl32C) {
            try {
                size = gl32C.getBufferParameteri64v(target, BUFFER_SIZE);
            } catch (ContextException e) {
                size = getBufferParameteriv(target, BUFFER_SIZE);
            }
        }
        return mapBuffer(target, access, size);
    }

    @Skip
    default MemorySegment mapBuffer(int target, int access, long bufferSize) {
        try {
            final MemorySegment segment = ((MemorySegment) glMapBuffer().invokeExact(target, access)).reinterpret(bufferSize);
            return access == READ_ONLY ? segment.asReadOnly() : segment;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Entrypoint("glUnmapBuffer")
    default boolean unmapBuffer(int target) {
        throw new ContextException();
    }
}
