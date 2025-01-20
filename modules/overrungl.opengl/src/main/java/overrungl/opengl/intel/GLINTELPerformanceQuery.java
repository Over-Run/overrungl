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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBeginPerfQueryINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreatePerfQueryINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeletePerfQueryINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndPerfQueryINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFirstPerfQueryIdINTEL = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNextPerfQueryIdINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfCounterInfoINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfQueryDataINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfQueryIdByNameINTEL = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfQueryInfoINTEL = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glBeginPerfQueryINTEL = RuntimeHelper.downcall(Descriptors.FD_glBeginPerfQueryINTEL);
        public static final MethodHandle MH_glCreatePerfQueryINTEL = RuntimeHelper.downcall(Descriptors.FD_glCreatePerfQueryINTEL);
        public static final MethodHandle MH_glDeletePerfQueryINTEL = RuntimeHelper.downcall(Descriptors.FD_glDeletePerfQueryINTEL);
        public static final MethodHandle MH_glEndPerfQueryINTEL = RuntimeHelper.downcall(Descriptors.FD_glEndPerfQueryINTEL);
        public static final MethodHandle MH_glGetFirstPerfQueryIdINTEL = RuntimeHelper.downcall(Descriptors.FD_glGetFirstPerfQueryIdINTEL);
        public static final MethodHandle MH_glGetNextPerfQueryIdINTEL = RuntimeHelper.downcall(Descriptors.FD_glGetNextPerfQueryIdINTEL);
        public static final MethodHandle MH_glGetPerfCounterInfoINTEL = RuntimeHelper.downcall(Descriptors.FD_glGetPerfCounterInfoINTEL);
        public static final MethodHandle MH_glGetPerfQueryDataINTEL = RuntimeHelper.downcall(Descriptors.FD_glGetPerfQueryDataINTEL);
        public static final MethodHandle MH_glGetPerfQueryIdByNameINTEL = RuntimeHelper.downcall(Descriptors.FD_glGetPerfQueryIdByNameINTEL);
        public static final MethodHandle MH_glGetPerfQueryInfoINTEL = RuntimeHelper.downcall(Descriptors.FD_glGetPerfQueryInfoINTEL);
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

    public void BeginPerfQueryINTEL(@CType("GLuint") int queryHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginPerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glBeginPerfQueryINTEL");
        try { Handles.MH_glBeginPerfQueryINTEL.invokeExact(handles.PFN_glBeginPerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginPerfQueryINTEL", e); }
    }

    public void CreatePerfQueryINTEL(@CType("GLuint") int queryId, @CType("GLuint *") MemorySegment queryHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreatePerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glCreatePerfQueryINTEL");
        try { Handles.MH_glCreatePerfQueryINTEL.invokeExact(handles.PFN_glCreatePerfQueryINTEL, queryId, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in glCreatePerfQueryINTEL", e); }
    }

    public void DeletePerfQueryINTEL(@CType("GLuint") int queryHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeletePerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glDeletePerfQueryINTEL");
        try { Handles.MH_glDeletePerfQueryINTEL.invokeExact(handles.PFN_glDeletePerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in glDeletePerfQueryINTEL", e); }
    }

    public void EndPerfQueryINTEL(@CType("GLuint") int queryHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_glEndPerfQueryINTEL)) throw new SymbolNotFoundError("Symbol not found: glEndPerfQueryINTEL");
        try { Handles.MH_glEndPerfQueryINTEL.invokeExact(handles.PFN_glEndPerfQueryINTEL, queryHandle); }
        catch (Throwable e) { throw new RuntimeException("error in glEndPerfQueryINTEL", e); }
    }

    public void GetFirstPerfQueryIdINTEL(@CType("GLuint *") MemorySegment queryId) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFirstPerfQueryIdINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetFirstPerfQueryIdINTEL");
        try { Handles.MH_glGetFirstPerfQueryIdINTEL.invokeExact(handles.PFN_glGetFirstPerfQueryIdINTEL, queryId); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFirstPerfQueryIdINTEL", e); }
    }

    public void GetNextPerfQueryIdINTEL(@CType("GLuint") int queryId, @CType("GLuint *") MemorySegment nextQueryId) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNextPerfQueryIdINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetNextPerfQueryIdINTEL");
        try { Handles.MH_glGetNextPerfQueryIdINTEL.invokeExact(handles.PFN_glGetNextPerfQueryIdINTEL, queryId, nextQueryId); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNextPerfQueryIdINTEL", e); }
    }

    public void GetPerfCounterInfoINTEL(@CType("GLuint") int queryId, @CType("GLuint") int counterId, @CType("GLuint") int counterNameLength, @CType("GLchar *") MemorySegment counterName, @CType("GLuint") int counterDescLength, @CType("GLchar *") MemorySegment counterDesc, @CType("GLuint *") MemorySegment counterOffset, @CType("GLuint *") MemorySegment counterDataSize, @CType("GLuint *") MemorySegment counterTypeEnum, @CType("GLuint *") MemorySegment counterDataTypeEnum, @CType("GLuint64 *") MemorySegment rawCounterMaxValue) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfCounterInfoINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfCounterInfoINTEL");
        try { Handles.MH_glGetPerfCounterInfoINTEL.invokeExact(handles.PFN_glGetPerfCounterInfoINTEL, queryId, counterId, counterNameLength, counterName, counterDescLength, counterDesc, counterOffset, counterDataSize, counterTypeEnum, counterDataTypeEnum, rawCounterMaxValue); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfCounterInfoINTEL", e); }
    }

    public void GetPerfQueryDataINTEL(@CType("GLuint") int queryHandle, @CType("GLuint") int flags, @CType("GLsizei") int dataSize, @CType("void*") MemorySegment data, @CType("GLuint *") MemorySegment bytesWritten) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfQueryDataINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfQueryDataINTEL");
        try { Handles.MH_glGetPerfQueryDataINTEL.invokeExact(handles.PFN_glGetPerfQueryDataINTEL, queryHandle, flags, dataSize, data, bytesWritten); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfQueryDataINTEL", e); }
    }

    public void GetPerfQueryIdByNameINTEL(@CType("GLchar *") MemorySegment queryName, @CType("GLuint *") MemorySegment queryId) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfQueryIdByNameINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfQueryIdByNameINTEL");
        try { Handles.MH_glGetPerfQueryIdByNameINTEL.invokeExact(handles.PFN_glGetPerfQueryIdByNameINTEL, queryName, queryId); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfQueryIdByNameINTEL", e); }
    }

    public void GetPerfQueryInfoINTEL(@CType("GLuint") int queryId, @CType("GLuint") int queryNameLength, @CType("GLchar *") MemorySegment queryName, @CType("GLuint *") MemorySegment dataSize, @CType("GLuint *") MemorySegment noCounters, @CType("GLuint *") MemorySegment noInstances, @CType("GLuint *") MemorySegment capsMask) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfQueryInfoINTEL)) throw new SymbolNotFoundError("Symbol not found: glGetPerfQueryInfoINTEL");
        try { Handles.MH_glGetPerfQueryInfoINTEL.invokeExact(handles.PFN_glGetPerfQueryInfoINTEL, queryId, queryNameLength, queryName, dataSize, noCounters, noInstances, capsMask); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfQueryInfoINTEL", e); }
    }

}
