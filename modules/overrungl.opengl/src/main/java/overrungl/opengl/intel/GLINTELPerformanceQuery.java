/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.intel;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glBeginPerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginPerfQueryINTEL;
    public static final MethodHandle MH_glCreatePerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCreatePerfQueryINTEL;
    public static final MethodHandle MH_glDeletePerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDeletePerfQueryINTEL;
    public static final MethodHandle MH_glEndPerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEndPerfQueryINTEL;
    public static final MethodHandle MH_glGetFirstPerfQueryIdINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFirstPerfQueryIdINTEL;
    public static final MethodHandle MH_glGetNextPerfQueryIdINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNextPerfQueryIdINTEL;
    public static final MethodHandle MH_glGetPerfCounterInfoINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfCounterInfoINTEL;
    public static final MethodHandle MH_glGetPerfQueryDataINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfQueryDataINTEL;
    public static final MethodHandle MH_glGetPerfQueryIdByNameINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfQueryIdByNameINTEL;
    public static final MethodHandle MH_glGetPerfQueryInfoINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfQueryInfoINTEL;

    public GLINTELPerformanceQuery(overrungl.opengl.GLLoadFunc func) {
        PFN_glBeginPerfQueryINTEL = func.invoke("glBeginPerfQueryINTEL");
        PFN_glCreatePerfQueryINTEL = func.invoke("glCreatePerfQueryINTEL");
        PFN_glDeletePerfQueryINTEL = func.invoke("glDeletePerfQueryINTEL");
        PFN_glEndPerfQueryINTEL = func.invoke("glEndPerfQueryINTEL");
        PFN_glGetFirstPerfQueryIdINTEL = func.invoke("glGetFirstPerfQueryIdINTEL");
        PFN_glGetNextPerfQueryIdINTEL = func.invoke("glGetNextPerfQueryIdINTEL");
        PFN_glGetPerfCounterInfoINTEL = func.invoke("glGetPerfCounterInfoINTEL");
        PFN_glGetPerfQueryDataINTEL = func.invoke("glGetPerfQueryDataINTEL");
        PFN_glGetPerfQueryIdByNameINTEL = func.invoke("glGetPerfQueryIdByNameINTEL");
        PFN_glGetPerfQueryInfoINTEL = func.invoke("glGetPerfQueryInfoINTEL");
    }

    public void BeginPerfQueryINTEL(@CType("GLuint") int queryHandle) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginPerfQueryINTEL))
            MH_glBeginPerfQueryINTEL.invokeExact(PFN_glBeginPerfQueryINTEL, queryHandle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginPerfQueryINTEL", e); }
    }

    public void CreatePerfQueryINTEL(@CType("GLuint") int queryId, @CType("GLuint *") java.lang.foreign.MemorySegment queryHandle) {
        try { if (!Unmarshal.isNullPointer(PFN_glCreatePerfQueryINTEL))
            MH_glCreatePerfQueryINTEL.invokeExact(PFN_glCreatePerfQueryINTEL, queryId, queryHandle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCreatePerfQueryINTEL", e); }
    }

    public void DeletePerfQueryINTEL(@CType("GLuint") int queryHandle) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeletePerfQueryINTEL))
            MH_glDeletePerfQueryINTEL.invokeExact(PFN_glDeletePerfQueryINTEL, queryHandle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeletePerfQueryINTEL", e); }
    }

    public void EndPerfQueryINTEL(@CType("GLuint") int queryHandle) {
        try { if (!Unmarshal.isNullPointer(PFN_glEndPerfQueryINTEL))
            MH_glEndPerfQueryINTEL.invokeExact(PFN_glEndPerfQueryINTEL, queryHandle);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndPerfQueryINTEL", e); }
    }

    public void GetFirstPerfQueryIdINTEL(@CType("GLuint *") java.lang.foreign.MemorySegment queryId) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFirstPerfQueryIdINTEL))
            MH_glGetFirstPerfQueryIdINTEL.invokeExact(PFN_glGetFirstPerfQueryIdINTEL, queryId);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFirstPerfQueryIdINTEL", e); }
    }

    public void GetNextPerfQueryIdINTEL(@CType("GLuint") int queryId, @CType("GLuint *") java.lang.foreign.MemorySegment nextQueryId) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNextPerfQueryIdINTEL))
            MH_glGetNextPerfQueryIdINTEL.invokeExact(PFN_glGetNextPerfQueryIdINTEL, queryId, nextQueryId);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNextPerfQueryIdINTEL", e); }
    }

    public void GetPerfCounterInfoINTEL(@CType("GLuint") int queryId, @CType("GLuint") int counterId, @CType("GLuint") int counterNameLength, @CType("GLchar *") java.lang.foreign.MemorySegment counterName, @CType("GLuint") int counterDescLength, @CType("GLchar *") java.lang.foreign.MemorySegment counterDesc, @CType("GLuint *") java.lang.foreign.MemorySegment counterOffset, @CType("GLuint *") java.lang.foreign.MemorySegment counterDataSize, @CType("GLuint *") java.lang.foreign.MemorySegment counterTypeEnum, @CType("GLuint *") java.lang.foreign.MemorySegment counterDataTypeEnum, @CType("GLuint64 *") java.lang.foreign.MemorySegment rawCounterMaxValue) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetPerfCounterInfoINTEL))
            MH_glGetPerfCounterInfoINTEL.invokeExact(PFN_glGetPerfCounterInfoINTEL, queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfCounterInfoINTEL", e); }
    }

    public void GetPerfQueryDataINTEL(@CType("GLuint") int queryHandle, @CType("GLuint") int flags, @CType("GLsizei") int dataSize, @CType("void*") java.lang.foreign.MemorySegment data, @CType("GLuint *") java.lang.foreign.MemorySegment bytesWritten) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetPerfQueryDataINTEL))
            MH_glGetPerfQueryDataINTEL.invokeExact(PFN_glGetPerfQueryDataINTEL, queryHandle, flags, dataSize, data, bytesWritten);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfQueryDataINTEL", e); }
    }

    public void GetPerfQueryIdByNameINTEL(@CType("GLchar *") java.lang.foreign.MemorySegment queryName, @CType("GLuint *") java.lang.foreign.MemorySegment queryId) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetPerfQueryIdByNameINTEL))
            MH_glGetPerfQueryIdByNameINTEL.invokeExact(PFN_glGetPerfQueryIdByNameINTEL, queryName, queryId);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfQueryIdByNameINTEL", e); }
    }

    public void GetPerfQueryInfoINTEL(@CType("GLuint") int queryId, @CType("GLuint") int queryNameLength, @CType("GLchar *") java.lang.foreign.MemorySegment queryName, @CType("GLuint *") java.lang.foreign.MemorySegment dataSize, @CType("GLuint *") java.lang.foreign.MemorySegment noCounters, @CType("GLuint *") java.lang.foreign.MemorySegment noInstances, @CType("GLuint *") java.lang.foreign.MemorySegment capsMask) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetPerfQueryInfoINTEL))
            MH_glGetPerfQueryInfoINTEL.invokeExact(PFN_glGetPerfQueryInfoINTEL, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfQueryInfoINTEL", e); }
    }

}
