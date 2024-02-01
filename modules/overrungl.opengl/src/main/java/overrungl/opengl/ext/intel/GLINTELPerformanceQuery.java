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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_INTEL_performance_query}
 */
public interface GLINTELPerformanceQuery {
    int GL_PERFQUERY_SINGLE_CONTEXT_INTEL = 0x00000000;
    int GL_PERFQUERY_GLOBAL_CONTEXT_INTEL = 0x00000001;
    int GL_PERFQUERY_WAIT_INTEL = 0x83FB;
    int GL_PERFQUERY_FLUSH_INTEL = 0x83FA;
    int GL_PERFQUERY_DONOT_FLUSH_INTEL = 0x83F9;
    int GL_PERFQUERY_COUNTER_EVENT_INTEL = 0x94F0;
    int GL_PERFQUERY_COUNTER_DURATION_NORM_INTEL = 0x94F1;
    int GL_PERFQUERY_COUNTER_DURATION_RAW_INTEL = 0x94F2;
    int GL_PERFQUERY_COUNTER_THROUGHPUT_INTEL = 0x94F3;
    int GL_PERFQUERY_COUNTER_RAW_INTEL = 0x94F4;
    int GL_PERFQUERY_COUNTER_TIMESTAMP_INTEL = 0x94F5;
    int GL_PERFQUERY_COUNTER_DATA_UINT32_INTEL = 0x94F8;
    int GL_PERFQUERY_COUNTER_DATA_UINT64_INTEL = 0x94F9;
    int GL_PERFQUERY_COUNTER_DATA_FLOAT_INTEL = 0x94FA;
    int GL_PERFQUERY_COUNTER_DATA_DOUBLE_INTEL = 0x94FB;
    int GL_PERFQUERY_COUNTER_DATA_BOOL32_INTEL = 0x94FC;
    int GL_PERFQUERY_QUERY_NAME_LENGTH_MAX_INTEL = 0x94FD;
    int GL_PERFQUERY_COUNTER_NAME_LENGTH_MAX_INTEL = 0x94FE;
    int GL_PERFQUERY_COUNTER_DESC_LENGTH_MAX_INTEL = 0x94FF;
    int GL_PERFQUERY_GPA_EXTENDED_COUNTERS_INTEL = 0x9500;

    void glBeginPerfQueryINTEL(int queryHandle);
    void glCreatePerfQueryINTEL(int queryId, @NativeType("GLuint *") MemorySegment queryHandle);
    void glDeletePerfQueryINTEL(int queryHandle);
    void glEndPerfQueryINTEL(int queryHandle);
    void glGetFirstPerfQueryIdINTEL(@NativeType("GLuint *") MemorySegment queryId);
    void glGetNextPerfQueryIdINTEL(int queryId, @NativeType("GLuint *") MemorySegment nextQueryId);
    void glGetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, @NativeType("GLchar *") MemorySegment counterName, int counterDescLength, @NativeType("GLchar *") MemorySegment counterDesc, @NativeType("GLuint *") MemorySegment counterOffset, @NativeType("GLuint *") MemorySegment counterDataSize, @NativeType("GLuint *") MemorySegment counterTypeEnum, @NativeType("GLuint *") MemorySegment counterDataTypeEnum, @NativeType("GLuint64 *") MemorySegment rawCounterMaxValue);
    void glGetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, @NativeType("void *") MemorySegment data, @NativeType("GLuint *") MemorySegment bytesWritten);
    void glGetPerfQueryIdByNameINTEL(@NativeType("GLchar *") MemorySegment queryName, @NativeType("GLuint *") MemorySegment queryId);
    void glGetPerfQueryInfoINTEL(int queryId, int queryNameLength, @NativeType("GLchar *") MemorySegment queryName, @NativeType("GLuint *") MemorySegment dataSize, @NativeType("GLuint *") MemorySegment noCounters, @NativeType("GLuint *") MemorySegment noInstances, @NativeType("GLuint *") MemorySegment capsMask);
}
