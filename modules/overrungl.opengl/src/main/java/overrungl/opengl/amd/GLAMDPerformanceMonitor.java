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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDPerformanceMonitor {
    public static final int GL_COUNTER_TYPE_AMD = 0x8BC0;
    public static final int GL_COUNTER_RANGE_AMD = 0x8BC1;
    public static final int GL_UNSIGNED_INT64_AMD = 0x8BC2;
    public static final int GL_PERCENTAGE_AMD = 0x8BC3;
    public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
    public static final int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
    public static final int GL_PERFMON_RESULT_AMD = 0x8BC6;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetPerfMonitorGroupsAMD = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfMonitorCountersAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfMonitorGroupStringAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfMonitorCounterStringAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPerfMonitorCounterInfoAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenPerfMonitorsAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeletePerfMonitorsAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSelectPerfMonitorCountersAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glBeginPerfMonitorAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEndPerfMonitorAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetPerfMonitorCounterDataAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetPerfMonitorGroupsAMD = RuntimeHelper.downcall(Descriptors.FD_glGetPerfMonitorGroupsAMD);
        public static final MethodHandle MH_glGetPerfMonitorCountersAMD = RuntimeHelper.downcall(Descriptors.FD_glGetPerfMonitorCountersAMD);
        public static final MethodHandle MH_glGetPerfMonitorGroupStringAMD = RuntimeHelper.downcall(Descriptors.FD_glGetPerfMonitorGroupStringAMD);
        public static final MethodHandle MH_glGetPerfMonitorCounterStringAMD = RuntimeHelper.downcall(Descriptors.FD_glGetPerfMonitorCounterStringAMD);
        public static final MethodHandle MH_glGetPerfMonitorCounterInfoAMD = RuntimeHelper.downcall(Descriptors.FD_glGetPerfMonitorCounterInfoAMD);
        public static final MethodHandle MH_glGenPerfMonitorsAMD = RuntimeHelper.downcall(Descriptors.FD_glGenPerfMonitorsAMD);
        public static final MethodHandle MH_glDeletePerfMonitorsAMD = RuntimeHelper.downcall(Descriptors.FD_glDeletePerfMonitorsAMD);
        public static final MethodHandle MH_glSelectPerfMonitorCountersAMD = RuntimeHelper.downcall(Descriptors.FD_glSelectPerfMonitorCountersAMD);
        public static final MethodHandle MH_glBeginPerfMonitorAMD = RuntimeHelper.downcall(Descriptors.FD_glBeginPerfMonitorAMD);
        public static final MethodHandle MH_glEndPerfMonitorAMD = RuntimeHelper.downcall(Descriptors.FD_glEndPerfMonitorAMD);
        public static final MethodHandle MH_glGetPerfMonitorCounterDataAMD = RuntimeHelper.downcall(Descriptors.FD_glGetPerfMonitorCounterDataAMD);
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

    public void GetPerfMonitorGroupsAMD(@CType("GLint *") MemorySegment numGroups, @CType("GLsizei") int groupsSize, @CType("GLuint *") MemorySegment groups) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfMonitorGroupsAMD)) throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupsAMD");
        try { Handles.MH_glGetPerfMonitorGroupsAMD.invokeExact(handles.PFN_glGetPerfMonitorGroupsAMD, numGroups, groupsSize, groups); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorGroupsAMD", e); }
    }

    public void GetPerfMonitorCountersAMD(@CType("GLuint") int group, @CType("GLint *") MemorySegment numCounters, @CType("GLint *") MemorySegment maxActiveCounters, @CType("GLsizei") int counterSize, @CType("GLuint *") MemorySegment counters) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfMonitorCountersAMD)) throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCountersAMD");
        try { Handles.MH_glGetPerfMonitorCountersAMD.invokeExact(handles.PFN_glGetPerfMonitorCountersAMD, group, numCounters, maxActiveCounters, counterSize, counters); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCountersAMD", e); }
    }

    public void GetPerfMonitorGroupStringAMD(@CType("GLuint") int group, @CType("GLsizei") int bufSize, @CType("GLsizei *") MemorySegment length, @CType("GLchar *") MemorySegment groupString) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfMonitorGroupStringAMD)) throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupStringAMD");
        try { Handles.MH_glGetPerfMonitorGroupStringAMD.invokeExact(handles.PFN_glGetPerfMonitorGroupStringAMD, group, bufSize, length, groupString); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorGroupStringAMD", e); }
    }

    public void GetPerfMonitorCounterStringAMD(@CType("GLuint") int group, @CType("GLuint") int counter, @CType("GLsizei") int bufSize, @CType("GLsizei *") MemorySegment length, @CType("GLchar *") MemorySegment counterString) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfMonitorCounterStringAMD)) throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterStringAMD");
        try { Handles.MH_glGetPerfMonitorCounterStringAMD.invokeExact(handles.PFN_glGetPerfMonitorCounterStringAMD, group, counter, bufSize, length, counterString); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCounterStringAMD", e); }
    }

    public void GetPerfMonitorCounterInfoAMD(@CType("GLuint") int group, @CType("GLuint") int counter, @CType("GLenum") int pname, @CType("void*") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfMonitorCounterInfoAMD)) throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterInfoAMD");
        try { Handles.MH_glGetPerfMonitorCounterInfoAMD.invokeExact(handles.PFN_glGetPerfMonitorCounterInfoAMD, group, counter, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCounterInfoAMD", e); }
    }

    public void GenPerfMonitorsAMD(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment monitors) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenPerfMonitorsAMD)) throw new SymbolNotFoundError("Symbol not found: glGenPerfMonitorsAMD");
        try { Handles.MH_glGenPerfMonitorsAMD.invokeExact(handles.PFN_glGenPerfMonitorsAMD, n, monitors); }
        catch (Throwable e) { throw new RuntimeException("error in glGenPerfMonitorsAMD", e); }
    }

    public void DeletePerfMonitorsAMD(@CType("GLsizei") int n, @CType("GLuint *") MemorySegment monitors) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeletePerfMonitorsAMD)) throw new SymbolNotFoundError("Symbol not found: glDeletePerfMonitorsAMD");
        try { Handles.MH_glDeletePerfMonitorsAMD.invokeExact(handles.PFN_glDeletePerfMonitorsAMD, n, monitors); }
        catch (Throwable e) { throw new RuntimeException("error in glDeletePerfMonitorsAMD", e); }
    }

    public void SelectPerfMonitorCountersAMD(@CType("GLuint") int monitor, @CType("GLboolean") boolean enable, @CType("GLuint") int group, @CType("GLint") int numCounters, @CType("GLuint *") MemorySegment counterList) {
        if (Unmarshal.isNullPointer(handles.PFN_glSelectPerfMonitorCountersAMD)) throw new SymbolNotFoundError("Symbol not found: glSelectPerfMonitorCountersAMD");
        try { Handles.MH_glSelectPerfMonitorCountersAMD.invokeExact(handles.PFN_glSelectPerfMonitorCountersAMD, monitor, enable, group, numCounters, counterList); }
        catch (Throwable e) { throw new RuntimeException("error in glSelectPerfMonitorCountersAMD", e); }
    }

    public void BeginPerfMonitorAMD(@CType("GLuint") int monitor) {
        if (Unmarshal.isNullPointer(handles.PFN_glBeginPerfMonitorAMD)) throw new SymbolNotFoundError("Symbol not found: glBeginPerfMonitorAMD");
        try { Handles.MH_glBeginPerfMonitorAMD.invokeExact(handles.PFN_glBeginPerfMonitorAMD, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginPerfMonitorAMD", e); }
    }

    public void EndPerfMonitorAMD(@CType("GLuint") int monitor) {
        if (Unmarshal.isNullPointer(handles.PFN_glEndPerfMonitorAMD)) throw new SymbolNotFoundError("Symbol not found: glEndPerfMonitorAMD");
        try { Handles.MH_glEndPerfMonitorAMD.invokeExact(handles.PFN_glEndPerfMonitorAMD, monitor); }
        catch (Throwable e) { throw new RuntimeException("error in glEndPerfMonitorAMD", e); }
    }

    public void GetPerfMonitorCounterDataAMD(@CType("GLuint") int monitor, @CType("GLenum") int pname, @CType("GLsizei") int dataSize, @CType("GLuint *") MemorySegment data, @CType("GLint *") MemorySegment bytesWritten) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPerfMonitorCounterDataAMD)) throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterDataAMD");
        try { Handles.MH_glGetPerfMonitorCounterDataAMD.invokeExact(handles.PFN_glGetPerfMonitorCounterDataAMD, monitor, pname, dataSize, data, bytesWritten); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCounterDataAMD", e); }
    }

}
