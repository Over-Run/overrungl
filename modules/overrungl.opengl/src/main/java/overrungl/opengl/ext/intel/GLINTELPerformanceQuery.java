/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.intel;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_INTEL_performance_query}
 */
public final class GLINTELPerformanceQuery {
    public static final int GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0x00000000;
    public static final int GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 0x00000001;
    public static final int GL_PERFQUERY_WAIT_INTEL = 0x83FB;
    public static final int GL_PERFQUERY_FLUSH_INTEL = 0x83FA;
    public static final int GL_PERFQUERY_DONOT_FLUSH_INTEL = 0x83F9;
    public static final int GL_PERFQUERY_COUNTER_EVENT_INTEL = 0x94F0;
    public static final int GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 0x94F1;
    public static final int GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL = 0x94F2;
    public static final int GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL = 0x94F3;
    public static final int GL_PERFQUERY_COUNTER_RAW_INTEL = 0x94F4;
    public static final int GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL = 0x94F5;
    public static final int GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 0x94F8;
    public static final int GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 0x94F9;
    public static final int GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL = 0x94FA;
    public static final int GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 0x94FB;
    public static final int GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 0x94FC;
    public static final int GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL = 0x94FD;
    public static final int GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 0x94FE;
    public static final int GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 0x94FF;
    public static final int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 0x9500;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_performance_query) return;
        ext.glBeginPerfQueryINTEL = load.invoke("glBeginPerfQueryINTEL", ofVoid(JAVA_INT));
        ext.glCreatePerfQueryINTEL = load.invoke("glCreatePerfQueryINTEL", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeletePerfQueryINTEL = load.invoke("glDeletePerfQueryINTEL", ofVoid(JAVA_INT));
        ext.glEndPerfQueryINTEL = load.invoke("glEndPerfQueryINTEL", ofVoid(JAVA_INT));
        ext.glGetFirstPerfQueryIdINTEL = load.invoke("glGetFirstPerfQueryIdINTEL", ofVoid(ADDRESS));
        ext.glGetNextPerfQueryIdINTEL = load.invoke("glGetNextPerfQueryIdINTEL", ofVoid(JAVA_INT, ADDRESS));
        ext.glGetPerfCounterInfoINTEL = load.invoke("glGetPerfCounterInfoINTEL", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glGetPerfQueryDataINTEL = load.invoke("glGetPerfQueryDataINTEL", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetPerfQueryIdByNameINTEL = load.invoke("glGetPerfQueryIdByNameINTEL", ofVoid(ADDRESS, ADDRESS));
        ext.glGetPerfQueryInfoINTEL = load.invoke("glGetPerfQueryInfoINTEL", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
    }

    public static void glBeginPerfQueryINTEL(int queryHandle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginPerfQueryINTEL).invokeExact(queryHandle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCreatePerfQueryINTEL(int queryId, @NativeType("GLuint *") MemorySegment queryHandle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCreatePerfQueryINTEL).invokeExact(queryId, queryHandle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeletePerfQueryINTEL(int queryHandle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeletePerfQueryINTEL).invokeExact(queryHandle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndPerfQueryINTEL(int queryHandle) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndPerfQueryINTEL).invokeExact(queryHandle);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFirstPerfQueryIdINTEL(@NativeType("GLuint *") MemorySegment queryId) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFirstPerfQueryIdINTEL).invokeExact(queryId);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNextPerfQueryIdINTEL(int queryId, @NativeType("GLuint *") MemorySegment nextQueryId) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNextPerfQueryIdINTEL).invokeExact(queryId, nextQueryId);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, @NativeType("GLchar *") MemorySegment counterName, int counterDescLength, @NativeType("GLchar *") MemorySegment counterDesc, @NativeType("GLuint *") MemorySegment counterOffset, @NativeType("GLuint *") MemorySegment counterDataSize, @NativeType("GLuint *") MemorySegment counterTypeEnum, @NativeType("GLuint *") MemorySegment counterDataTypeEnum, @NativeType("GLuint64 *") MemorySegment rawCounterMaxValue) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfCounterInfoINTEL).invokeExact(queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, @NativeType("void *") MemorySegment data, @NativeType("GLuint *") MemorySegment bytesWritten) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfQueryDataINTEL).invokeExact(queryHandle, flags, dataSize, data, bytesWritten);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") MemorySegment queryName, @NativeType("GLuint *") MemorySegment queryId) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfQueryIdByNameINTEL).invokeExact(queryName, queryId);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfQueryInfoINTEL(int queryId, int queryNameLength, @NativeType("GLchar *") MemorySegment queryName, @NativeType("GLuint *") MemorySegment dataSize, @NativeType("GLuint *") MemorySegment noCounters, @NativeType("GLuint *") MemorySegment noInstances, @NativeType("GLuint *") MemorySegment capsMask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfQueryInfoINTEL).invokeExact(queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
