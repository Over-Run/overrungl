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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAMDPerformanceMonitor {
    public static final int GL_COUNTER_TYPE_AMD = 0x8BC0;
    public static final int GL_COUNTER_RANGE_AMD = 0x8BC1;
    public static final int GL_UNSIGNED_INT64_AMD = 0x8BC2;
    public static final int GL_PERCENTAGE_AMD = 0x8BC3;
    public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
    public static final int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
    public static final int GL_PERFMON_RESULT_AMD = 0x8BC6;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetPerfMonitorGroupsAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfMonitorCountersAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfMonitorGroupStringAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfMonitorCounterStringAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPerfMonitorCounterInfoAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenPerfMonitorsAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeletePerfMonitorsAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSelectPerfMonitorCountersAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBeginPerfMonitorAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndPerfMonitorAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetPerfMonitorCounterDataAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetPerfMonitorGroupsAMD;
        public final MemorySegment PFN_glGetPerfMonitorCountersAMD;
        public final MemorySegment PFN_glGetPerfMonitorGroupStringAMD;
        public final MemorySegment PFN_glGetPerfMonitorCounterStringAMD;
        public final MemorySegment PFN_glGetPerfMonitorCounterInfoAMD;
        public final MemorySegment PFN_glGenPerfMonitorsAMD;
        public final MemorySegment PFN_glDeletePerfMonitorsAMD;
        public final MemorySegment PFN_glSelectPerfMonitorCountersAMD;
        public final MemorySegment PFN_glBeginPerfMonitorAMD;
        public final MemorySegment PFN_glEndPerfMonitorAMD;
        public final MemorySegment PFN_glGetPerfMonitorCounterDataAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetPerfMonitorGroupsAMD = func.invoke("glGetPerfMonitorGroupsAMD");
            PFN_glGetPerfMonitorCountersAMD = func.invoke("glGetPerfMonitorCountersAMD");
            PFN_glGetPerfMonitorGroupStringAMD = func.invoke("glGetPerfMonitorGroupStringAMD");
            PFN_glGetPerfMonitorCounterStringAMD = func.invoke("glGetPerfMonitorCounterStringAMD");
            PFN_glGetPerfMonitorCounterInfoAMD = func.invoke("glGetPerfMonitorCounterInfoAMD");
            PFN_glGenPerfMonitorsAMD = func.invoke("glGenPerfMonitorsAMD");
            PFN_glDeletePerfMonitorsAMD = func.invoke("glDeletePerfMonitorsAMD");
            PFN_glSelectPerfMonitorCountersAMD = func.invoke("glSelectPerfMonitorCountersAMD");
            PFN_glBeginPerfMonitorAMD = func.invoke("glBeginPerfMonitorAMD");
            PFN_glEndPerfMonitorAMD = func.invoke("glEndPerfMonitorAMD");
            PFN_glGetPerfMonitorCounterDataAMD = func.invoke("glGetPerfMonitorCounterDataAMD");
        }
    }

    public GLAMDPerformanceMonitor(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetPerfMonitorGroupsAMD(GLint* numGroups, (int) GLsizei groupsSize, GLuint* groups);
    /// ```
    public void GetPerfMonitorGroupsAMD(MemorySegment numGroups, int groupsSize, MemorySegment groups) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorGroupsAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupsAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorGroupsAMD", numGroups, groupsSize, groups); }
        Handles.MH_glGetPerfMonitorGroupsAMD.invokeExact(handles.PFN_glGetPerfMonitorGroupsAMD, numGroups, groupsSize, groups); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorGroupsAMD", e); }
    }

    /// ```
    /// void glGetPerfMonitorCountersAMD((unsigned int) GLuint group, GLint* numCounters, GLint* maxActiveCounters, (int) GLsizei counterSize, GLuint* counters);
    /// ```
    public void GetPerfMonitorCountersAMD(int group, MemorySegment numCounters, MemorySegment maxActiveCounters, int counterSize, MemorySegment counters) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCountersAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCountersAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCountersAMD", group, numCounters, maxActiveCounters, counterSize, counters); }
        Handles.MH_glGetPerfMonitorCountersAMD.invokeExact(handles.PFN_glGetPerfMonitorCountersAMD, group, numCounters, maxActiveCounters, counterSize, counters); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCountersAMD", e); }
    }

    /// ```
    /// void glGetPerfMonitorGroupStringAMD((unsigned int) GLuint group, (int) GLsizei bufSize, GLsizei* length, GLchar* groupString);
    /// ```
    public void GetPerfMonitorGroupStringAMD(int group, int bufSize, MemorySegment length, MemorySegment groupString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorGroupStringAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupStringAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorGroupStringAMD", group, bufSize, length, groupString); }
        Handles.MH_glGetPerfMonitorGroupStringAMD.invokeExact(handles.PFN_glGetPerfMonitorGroupStringAMD, group, bufSize, length, groupString); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorGroupStringAMD", e); }
    }

    /// ```
    /// void glGetPerfMonitorCounterStringAMD((unsigned int) GLuint group, (unsigned int) GLuint counter, (int) GLsizei bufSize, GLsizei* length, GLchar* counterString);
    /// ```
    public void GetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, MemorySegment length, MemorySegment counterString) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCounterStringAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterStringAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCounterStringAMD", group, counter, bufSize, length, counterString); }
        Handles.MH_glGetPerfMonitorCounterStringAMD.invokeExact(handles.PFN_glGetPerfMonitorCounterStringAMD, group, counter, bufSize, length, counterString); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCounterStringAMD", e); }
    }

    /// ```
    /// void glGetPerfMonitorCounterInfoAMD((unsigned int) GLuint group, (unsigned int) GLuint counter, (unsigned int) GLenum pname, void* data);
    /// ```
    public void GetPerfMonitorCounterInfoAMD(int group, int counter, int pname, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCounterInfoAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterInfoAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCounterInfoAMD", group, counter, pname, data); }
        Handles.MH_glGetPerfMonitorCounterInfoAMD.invokeExact(handles.PFN_glGetPerfMonitorCounterInfoAMD, group, counter, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCounterInfoAMD", e); }
    }

    /// ```
    /// void glGenPerfMonitorsAMD((int) GLsizei n, GLuint* monitors);
    /// ```
    public void GenPerfMonitorsAMD(int n, MemorySegment monitors) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenPerfMonitorsAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGenPerfMonitorsAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenPerfMonitorsAMD", n, monitors); }
        Handles.MH_glGenPerfMonitorsAMD.invokeExact(handles.PFN_glGenPerfMonitorsAMD, n, monitors); }
        catch (Throwable e) { throw new RuntimeException("error in GenPerfMonitorsAMD", e); }
    }

    /// ```
    /// void glDeletePerfMonitorsAMD((int) GLsizei n, GLuint* monitors);
    /// ```
    public void DeletePerfMonitorsAMD(int n, MemorySegment monitors) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeletePerfMonitorsAMD)) throw new GLSymbolNotFoundError("Symbol not found: glDeletePerfMonitorsAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeletePerfMonitorsAMD", n, monitors); }
        Handles.MH_glDeletePerfMonitorsAMD.invokeExact(handles.PFN_glDeletePerfMonitorsAMD, n, monitors); }
        catch (Throwable e) { throw new RuntimeException("error in DeletePerfMonitorsAMD", e); }
    }

    /// ```
    /// void glSelectPerfMonitorCountersAMD((unsigned int) GLuint monitor, GLboolean enable, (unsigned int) GLuint group, (int) GLint numCounters, GLuint* counterList);
    /// ```
    public void SelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, MemorySegment counterList) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSelectPerfMonitorCountersAMD)) throw new GLSymbolNotFoundError("Symbol not found: glSelectPerfMonitorCountersAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSelectPerfMonitorCountersAMD", monitor, enable, group, numCounters, counterList); }
        Handles.MH_glSelectPerfMonitorCountersAMD.invokeExact(handles.PFN_glSelectPerfMonitorCountersAMD, monitor, ((enable) ? (byte)1 : (byte)0), group, numCounters, counterList); }
        catch (Throwable e) { throw new RuntimeException("error in SelectPerfMonitorCountersAMD", e); }
    }

    /// ```
    /// void glBeginPerfMonitorAMD((unsigned int) GLuint monitor);
    /// ```
    public void BeginPerfMonitorAMD(int monitor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginPerfMonitorAMD)) throw new GLSymbolNotFoundError("Symbol not found: glBeginPerfMonitorAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginPerfMonitorAMD", monitor); }
        Handles.MH_glBeginPerfMonitorAMD.invokeExact(handles.PFN_glBeginPerfMonitorAMD, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in BeginPerfMonitorAMD", e); }
    }

    /// ```
    /// void glEndPerfMonitorAMD((unsigned int) GLuint monitor);
    /// ```
    public void EndPerfMonitorAMD(int monitor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndPerfMonitorAMD)) throw new GLSymbolNotFoundError("Symbol not found: glEndPerfMonitorAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndPerfMonitorAMD", monitor); }
        Handles.MH_glEndPerfMonitorAMD.invokeExact(handles.PFN_glEndPerfMonitorAMD, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in EndPerfMonitorAMD", e); }
    }

    /// ```
    /// void glGetPerfMonitorCounterDataAMD((unsigned int) GLuint monitor, (unsigned int) GLenum pname, (int) GLsizei dataSize, GLuint* data, GLint* bytesWritten);
    /// ```
    public void GetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, MemorySegment data, MemorySegment bytesWritten) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPerfMonitorCounterDataAMD)) throw new GLSymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterDataAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetPerfMonitorCounterDataAMD", monitor, pname, dataSize, data, bytesWritten); }
        Handles.MH_glGetPerfMonitorCounterDataAMD.invokeExact(handles.PFN_glGetPerfMonitorCounterDataAMD, monitor, pname, dataSize, data, bytesWritten); }
        catch (Throwable e) { throw new RuntimeException("error in GetPerfMonitorCounterDataAMD", e); }
    }

}
