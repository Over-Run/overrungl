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
    public static final MethodHandle MH_glGetPerfMonitorGroupsAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfMonitorGroupsAMD;
    public static final MethodHandle MH_glGetPerfMonitorCountersAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfMonitorCountersAMD;
    public static final MethodHandle MH_glGetPerfMonitorGroupStringAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfMonitorGroupStringAMD;
    public static final MethodHandle MH_glGetPerfMonitorCounterStringAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfMonitorCounterStringAMD;
    public static final MethodHandle MH_glGetPerfMonitorCounterInfoAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfMonitorCounterInfoAMD;
    public static final MethodHandle MH_glGenPerfMonitorsAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenPerfMonitorsAMD;
    public static final MethodHandle MH_glDeletePerfMonitorsAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeletePerfMonitorsAMD;
    public static final MethodHandle MH_glSelectPerfMonitorCountersAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSelectPerfMonitorCountersAMD;
    public static final MethodHandle MH_glBeginPerfMonitorAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginPerfMonitorAMD;
    public static final MethodHandle MH_glEndPerfMonitorAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEndPerfMonitorAMD;
    public static final MethodHandle MH_glGetPerfMonitorCounterDataAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPerfMonitorCounterDataAMD;

    public GLAMDPerformanceMonitor(overrungl.opengl.GLLoadFunc func) {
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

    public void GetPerfMonitorGroupsAMD(@CType("GLint *") java.lang.foreign.MemorySegment numGroups, @CType("GLsizei") int groupsSize, @CType("GLuint *") java.lang.foreign.MemorySegment groups) {
        if (!Unmarshal.isNullPointer(PFN_glGetPerfMonitorGroupsAMD)) { try {
            MH_glGetPerfMonitorGroupsAMD.invokeExact(PFN_glGetPerfMonitorGroupsAMD, numGroups, groupsSize, groups);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorGroupsAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupsAMD"); }
    }

    public void GetPerfMonitorCountersAMD(@CType("GLuint") int group, @CType("GLint *") java.lang.foreign.MemorySegment numCounters, @CType("GLint *") java.lang.foreign.MemorySegment maxActiveCounters, @CType("GLsizei") int counterSize, @CType("GLuint *") java.lang.foreign.MemorySegment counters) {
        if (!Unmarshal.isNullPointer(PFN_glGetPerfMonitorCountersAMD)) { try {
            MH_glGetPerfMonitorCountersAMD.invokeExact(PFN_glGetPerfMonitorCountersAMD, group, numCounters, maxActiveCounters, counterSize, counters);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCountersAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCountersAMD"); }
    }

    public void GetPerfMonitorGroupStringAMD(@CType("GLuint") int group, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment groupString) {
        if (!Unmarshal.isNullPointer(PFN_glGetPerfMonitorGroupStringAMD)) { try {
            MH_glGetPerfMonitorGroupStringAMD.invokeExact(PFN_glGetPerfMonitorGroupStringAMD, group, bufSize, length, groupString);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorGroupStringAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorGroupStringAMD"); }
    }

    public void GetPerfMonitorCounterStringAMD(@CType("GLuint") int group, @CType("GLuint") int counter, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment counterString) {
        if (!Unmarshal.isNullPointer(PFN_glGetPerfMonitorCounterStringAMD)) { try {
            MH_glGetPerfMonitorCounterStringAMD.invokeExact(PFN_glGetPerfMonitorCounterStringAMD, group, counter, bufSize, length, counterString);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCounterStringAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterStringAMD"); }
    }

    public void GetPerfMonitorCounterInfoAMD(@CType("GLuint") int group, @CType("GLuint") int counter, @CType("GLenum") int pname, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (!Unmarshal.isNullPointer(PFN_glGetPerfMonitorCounterInfoAMD)) { try {
            MH_glGetPerfMonitorCounterInfoAMD.invokeExact(PFN_glGetPerfMonitorCounterInfoAMD, group, counter, pname, data);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCounterInfoAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterInfoAMD"); }
    }

    public void GenPerfMonitorsAMD(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment monitors) {
        if (!Unmarshal.isNullPointer(PFN_glGenPerfMonitorsAMD)) { try {
            MH_glGenPerfMonitorsAMD.invokeExact(PFN_glGenPerfMonitorsAMD, n, monitors);
        } catch (Throwable e) { throw new RuntimeException("error in glGenPerfMonitorsAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGenPerfMonitorsAMD"); }
    }

    public void DeletePerfMonitorsAMD(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment monitors) {
        if (!Unmarshal.isNullPointer(PFN_glDeletePerfMonitorsAMD)) { try {
            MH_glDeletePerfMonitorsAMD.invokeExact(PFN_glDeletePerfMonitorsAMD, n, monitors);
        } catch (Throwable e) { throw new RuntimeException("error in glDeletePerfMonitorsAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeletePerfMonitorsAMD"); }
    }

    public void SelectPerfMonitorCountersAMD(@CType("GLuint") int monitor, @CType("GLboolean") boolean enable, @CType("GLuint") int group, @CType("GLint") int numCounters, @CType("GLuint *") java.lang.foreign.MemorySegment counterList) {
        if (!Unmarshal.isNullPointer(PFN_glSelectPerfMonitorCountersAMD)) { try {
            MH_glSelectPerfMonitorCountersAMD.invokeExact(PFN_glSelectPerfMonitorCountersAMD, monitor, enable, group, numCounters, counterList);
        } catch (Throwable e) { throw new RuntimeException("error in glSelectPerfMonitorCountersAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSelectPerfMonitorCountersAMD"); }
    }

    public void BeginPerfMonitorAMD(@CType("GLuint") int monitor) {
        if (!Unmarshal.isNullPointer(PFN_glBeginPerfMonitorAMD)) { try {
            MH_glBeginPerfMonitorAMD.invokeExact(PFN_glBeginPerfMonitorAMD, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glBeginPerfMonitorAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glBeginPerfMonitorAMD"); }
    }

    public void EndPerfMonitorAMD(@CType("GLuint") int monitor) {
        if (!Unmarshal.isNullPointer(PFN_glEndPerfMonitorAMD)) { try {
            MH_glEndPerfMonitorAMD.invokeExact(PFN_glEndPerfMonitorAMD, monitor);
        } catch (Throwable e) { throw new RuntimeException("error in glEndPerfMonitorAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEndPerfMonitorAMD"); }
    }

    public void GetPerfMonitorCounterDataAMD(@CType("GLuint") int monitor, @CType("GLenum") int pname, @CType("GLsizei") int dataSize, @CType("GLuint *") java.lang.foreign.MemorySegment data, @CType("GLint *") java.lang.foreign.MemorySegment bytesWritten) {
        if (!Unmarshal.isNullPointer(PFN_glGetPerfMonitorCounterDataAMD)) { try {
            MH_glGetPerfMonitorCounterDataAMD.invokeExact(PFN_glGetPerfMonitorCounterDataAMD, monitor, pname, dataSize, data, bytesWritten);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPerfMonitorCounterDataAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPerfMonitorCounterDataAMD"); }
    }

}
