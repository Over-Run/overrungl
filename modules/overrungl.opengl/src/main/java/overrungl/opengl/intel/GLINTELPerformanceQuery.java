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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBeginPerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreatePerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeletePerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndPerfQueryINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFirstPerfQueryIdINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNextPerfQueryIdINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfCounterInfoINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfQueryDataINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfQueryIdByNameINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfQueryInfoINTEL = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBeginPerfQueryINTEL;
        public final MemorySegment PFN_glCreatePerfQueryINTEL;
        public final MemorySegment PFN_glDeletePerfQueryINTEL;
        public final MemorySegment PFN_glEndPerfQueryINTEL;
        public final MemorySegment PFN_glGetFirstPerfQueryIdINTEL;
        public final MemorySegment PFN_glGetNextPerfQueryIdINTEL;
        public final MemorySegment PFN_glGetPerfCounterInfoINTEL;
        public final MemorySegment PFN_glGetPerfQueryDataINTEL;
        public final MemorySegment PFN_glGetPerfQueryIdByNameINTEL;
        public final MemorySegment PFN_glGetPerfQueryInfoINTEL;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLINTELPerformanceQuery(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBeginPerfQueryINTEL(unsigned int queryHandle);
    /// ```
    public void BeginPerfQueryINTEL(int queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginPerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glBeginPerfQueryINTEL");
        try { Handles.MH_glBeginPerfQueryINTEL.invokeExact(handles.PFN_glBeginPerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in BeginPerfQueryINTEL", e); }
    }

    /// ```
    /// void glCreatePerfQueryINTEL(unsigned int queryId, GLuint* queryHandle);
    /// ```
    public void CreatePerfQueryINTEL(int queryId, MemorySegment queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreatePerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glCreatePerfQueryINTEL");
        try { Handles.MH_glCreatePerfQueryINTEL.invokeExact(handles.PFN_glCreatePerfQueryINTEL, queryId, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in CreatePerfQueryINTEL", e); }
    }

    /// ```
    /// void glDeletePerfQueryINTEL(unsigned int queryHandle);
    /// ```
    public void DeletePerfQueryINTEL(int queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeletePerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glDeletePerfQueryINTEL");
        try { Handles.MH_glDeletePerfQueryINTEL.invokeExact(handles.PFN_glDeletePerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in DeletePerfQueryINTEL", e); }
    }

    /// ```
    /// void glEndPerfQueryINTEL(unsigned int queryHandle);
    /// ```
    public void EndPerfQueryINTEL(int queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndPerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glEndPerfQueryINTEL");
        try { Handles.MH_glEndPerfQueryINTEL.invokeExact(handles.PFN_glEndPerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in EndPerfQueryINTEL", e); }
    }

    /// ```
    /// void glGetFirstPerfQueryIdINTEL(GLuint* queryId);
    /// ```
    public void GetFirstPerfQueryIdINTEL(MemorySegment queryId) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFirstPerfQueryIdINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetFirstPerfQueryIdINTEL");
        try { Handles.MH_glGetFirstPerfQueryIdINTEL.invokeExact(handles.PFN_glGetFirstPerfQueryIdINTEL, queryId); }
        catch (Throwable e) { throw new RuntimeException("error in GetFirstPerfQueryIdINTEL", e); }
    }

    /// ```
    /// void glGetNextPerfQueryIdINTEL(unsigned int queryId, GLuint* nextQueryId);
    /// ```
    public void GetNextPerfQueryIdINTEL(int queryId, MemorySegment nextQueryId) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNextPerfQueryIdINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetNextPerfQueryIdINTEL");
        try { Handles.MH_glGetNextPerfQueryIdINTEL.invokeExact(handles.PFN_glGetNextPerfQueryIdINTEL, queryId, nextQueryId); }
        catch (Throwable e) { throw new RuntimeException("error in GetNextPerfQueryIdINTEL", e); }
    }

    /// ```
    /// void glGetPerfCounterInfoINTEL(unsigned int queryId, unsigned int counterId, unsigned int counterNameLength, GLchar* counterName, unsigned int counterDescLength, GLchar* counterDesc, GLuint* counterOffset, GLuint* counterDataSize, GLuint* counterTypeEnum, GLuint* counterDataTypeEnum, GLuint64* rawCounterMaxValue);
    /// ```
    public void GetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, MemorySegment counterName, int counterDescLength, MemorySegment counterDesc, MemorySegment counterOffset, MemorySegment counterDataSize, MemorySegment counterTypeEnum, MemorySegment counterDataTypeEnum, MemorySegment rawCounterMaxValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfCounterInfoINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfCounterInfoINTEL");
        try { Handles.MH_glGetPerfCounterInfoINTEL.invokeExact(handles.PFN_glGetPerfCounterInfoINTEL, queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfCounterInfoINTEL", e); }
    }

    /// ```
    /// void glGetPerfQueryDataINTEL(unsigned int queryHandle, unsigned int flags, int dataSize, void* data, GLuint* bytesWritten);
    /// ```
    public void GetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, MemorySegment data, MemorySegment bytesWritten) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfQueryDataINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfQueryDataINTEL");
        try { Handles.MH_glGetPerfQueryDataINTEL.invokeExact(handles.PFN_glGetPerfQueryDataINTEL, queryHandle, flags, dataSize, data, bytesWritten); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfQueryDataINTEL", e); }
    }

    /// ```
    /// void glGetPerfQueryIdByNameINTEL(GLchar* queryName, GLuint* queryId);
    /// ```
    public void GetPerfQueryIdByNameINTEL(MemorySegment queryName, MemorySegment queryId) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfQueryIdByNameINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfQueryIdByNameINTEL");
        try { Handles.MH_glGetPerfQueryIdByNameINTEL.invokeExact(handles.PFN_glGetPerfQueryIdByNameINTEL, queryName, queryId); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfQueryIdByNameINTEL", e); }
    }

    /// ```
    /// void glGetPerfQueryInfoINTEL(unsigned int queryId, unsigned int queryNameLength, GLchar* queryName, GLuint* dataSize, GLuint* noCounters, GLuint* noInstances, GLuint* capsMask);
    /// ```
    public void GetPerfQueryInfoINTEL(int queryId, int queryNameLength, MemorySegment queryName, MemorySegment dataSize, MemorySegment noCounters, MemorySegment noInstances, MemorySegment capsMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfQueryInfoINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfQueryInfoINTEL");
        try { Handles.MH_glGetPerfQueryInfoINTEL.invokeExact(handles.PFN_glGetPerfQueryInfoINTEL, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfQueryInfoINTEL", e); }
    }

}
