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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_INTEL_performance_query`
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
        public static final MethodHandle MH_glBeginPerfQueryINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreatePerfQueryINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeletePerfQueryINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndPerfQueryINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFirstPerfQueryIdINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNextPerfQueryIdINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfCounterInfoINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfQueryDataINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfQueryIdByNameINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfQueryInfoINTEL = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
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
        private Handles(GLLoadFunc func) {
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

    public GLINTELPerformanceQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glBeginPerfQueryINTEL`.
    /// ```
    /// void glBeginPerfQueryINTEL((unsigned int) GLuint queryHandle);
    /// ```
    public void BeginPerfQueryINTEL(int queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginPerfQueryINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glBeginPerfQueryINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginPerfQueryINTEL", queryHandle); }
        Handles.MH_glBeginPerfQueryINTEL.invokeExact(handles.PFN_glBeginPerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in BeginPerfQueryINTEL", e); }
    }

    /// Invokes `glCreatePerfQueryINTEL`.
    /// ```
    /// void glCreatePerfQueryINTEL((unsigned int) GLuint queryId, GLuint* queryHandle);
    /// ```
    public void CreatePerfQueryINTEL(int queryId, @NonNull MemorySegment queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreatePerfQueryINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glCreatePerfQueryINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreatePerfQueryINTEL", queryId, queryHandle); }
        Handles.MH_glCreatePerfQueryINTEL.invokeExact(handles.PFN_glCreatePerfQueryINTEL, queryId, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in CreatePerfQueryINTEL", e); }
    }

    /// Invokes `glDeletePerfQueryINTEL`.
    /// ```
    /// void glDeletePerfQueryINTEL((unsigned int) GLuint queryHandle);
    /// ```
    public void DeletePerfQueryINTEL(int queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeletePerfQueryINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glDeletePerfQueryINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeletePerfQueryINTEL", queryHandle); }
        Handles.MH_glDeletePerfQueryINTEL.invokeExact(handles.PFN_glDeletePerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in DeletePerfQueryINTEL", e); }
    }

    /// Invokes `glEndPerfQueryINTEL`.
    /// ```
    /// void glEndPerfQueryINTEL((unsigned int) GLuint queryHandle);
    /// ```
    public void EndPerfQueryINTEL(int queryHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndPerfQueryINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glEndPerfQueryINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndPerfQueryINTEL", queryHandle); }
        Handles.MH_glEndPerfQueryINTEL.invokeExact(handles.PFN_glEndPerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in EndPerfQueryINTEL", e); }
    }

    /// Invokes `glGetFirstPerfQueryIdINTEL`.
    /// ```
    /// void glGetFirstPerfQueryIdINTEL(GLuint* queryId);
    /// ```
    public void GetFirstPerfQueryIdINTEL(@NonNull MemorySegment queryId) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFirstPerfQueryIdINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glGetFirstPerfQueryIdINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFirstPerfQueryIdINTEL", queryId); }
        Handles.MH_glGetFirstPerfQueryIdINTEL.invokeExact(handles.PFN_glGetFirstPerfQueryIdINTEL, queryId); }
        catch (Throwable e) { throw new RuntimeException("error in GetFirstPerfQueryIdINTEL", e); }
    }

    /// Invokes `glGetNextPerfQueryIdINTEL`.
    /// ```
    /// void glGetNextPerfQueryIdINTEL((unsigned int) GLuint queryId, GLuint* nextQueryId);
    /// ```
    public void GetNextPerfQueryIdINTEL(int queryId, @NonNull MemorySegment nextQueryId) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNextPerfQueryIdINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glGetNextPerfQueryIdINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNextPerfQueryIdINTEL", queryId, nextQueryId); }
        Handles.MH_glGetNextPerfQueryIdINTEL.invokeExact(handles.PFN_glGetNextPerfQueryIdINTEL, queryId, nextQueryId); }
        catch (Throwable e) { throw new RuntimeException("error in GetNextPerfQueryIdINTEL", e); }
    }

    /// Invokes `glGetPerfCounterInfoINTEL`.
    /// ```
    /// void glGetPerfCounterInfoINTEL((unsigned int) GLuint queryId, (unsigned int) GLuint counterId, (unsigned int) GLuint counterNameLength, GLchar* counterName, (unsigned int) GLuint counterDescLength, GLchar* counterDesc, GLuint* counterOffset, GLuint* counterDataSize, GLuint* counterTypeEnum, GLuint* counterDataTypeEnum, GLuint64* rawCounterMaxValue);
    /// ```
    public void GetPerfCounterInfoINTEL(int queryId, int counterId, int counterNameLength, @NonNull MemorySegment counterName, int counterDescLength, @NonNull MemorySegment counterDesc, @NonNull MemorySegment counterOffset, @NonNull MemorySegment counterDataSize, @NonNull MemorySegment counterTypeEnum, @NonNull MemorySegment counterDataTypeEnum, @NonNull MemorySegment rawCounterMaxValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfCounterInfoINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfCounterInfoINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfCounterInfoINTEL", queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue); }
        Handles.MH_glGetPerfCounterInfoINTEL.invokeExact(handles.PFN_glGetPerfCounterInfoINTEL, queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfCounterInfoINTEL", e); }
    }

    /// Invokes `glGetPerfQueryDataINTEL`.
    /// ```
    /// void glGetPerfQueryDataINTEL((unsigned int) GLuint queryHandle, (unsigned int) GLuint flags, (int) GLsizei dataSize, void* data, GLuint* bytesWritten);
    /// ```
    public void GetPerfQueryDataINTEL(int queryHandle, int flags, int dataSize, @NonNull MemorySegment data, @NonNull MemorySegment bytesWritten) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfQueryDataINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfQueryDataINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfQueryDataINTEL", queryHandle, flags, dataSize, data, bytesWritten); }
        Handles.MH_glGetPerfQueryDataINTEL.invokeExact(handles.PFN_glGetPerfQueryDataINTEL, queryHandle, flags, dataSize, data, bytesWritten); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfQueryDataINTEL", e); }
    }

    /// Invokes `glGetPerfQueryIdByNameINTEL`.
    /// ```
    /// void glGetPerfQueryIdByNameINTEL(GLchar* queryName, GLuint* queryId);
    /// ```
    public void GetPerfQueryIdByNameINTEL(@NonNull MemorySegment queryName, @NonNull MemorySegment queryId) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfQueryIdByNameINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfQueryIdByNameINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfQueryIdByNameINTEL", queryName, queryId); }
        Handles.MH_glGetPerfQueryIdByNameINTEL.invokeExact(handles.PFN_glGetPerfQueryIdByNameINTEL, queryName, queryId); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfQueryIdByNameINTEL", e); }
    }

    /// Invokes `glGetPerfQueryInfoINTEL`.
    /// ```
    /// void glGetPerfQueryInfoINTEL((unsigned int) GLuint queryId, (unsigned int) GLuint queryNameLength, GLchar* queryName, GLuint* dataSize, GLuint* noCounters, GLuint* noInstances, GLuint* capsMask);
    /// ```
    public void GetPerfQueryInfoINTEL(int queryId, int queryNameLength, @NonNull MemorySegment queryName, @NonNull MemorySegment dataSize, @NonNull MemorySegment noCounters, @NonNull MemorySegment noInstances, @NonNull MemorySegment capsMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfQueryInfoINTEL)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfQueryInfoINTEL");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfQueryInfoINTEL", queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask); }
        Handles.MH_glGetPerfQueryInfoINTEL.invokeExact(handles.PFN_glGetPerfQueryInfoINTEL, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfQueryInfoINTEL", e); }
    }

}
