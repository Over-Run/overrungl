/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.amd;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_AMD_performance_monitor}
  */
public final class GLAMDPerformanceMonitor {
    public static final int GL_COUNTER_TYPE_AMD = 0x8BC0;
    public static final int GL_COUNTER_RANGE_AMD = 0x8BC1;
    public static final int GL_UNSIGNED_INT64_AMD = 0x8BC2;
    public static final int GL_PERCENTAGE_AMD = 0x8BC3;
    public static final int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
    public static final int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
    public static final int GL_PERFMON_RESULT_AMD = 0x8BC6;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_performance_monitor) return;
        ext.glGetPerfMonitorGroupsAMD = load.invoke("glGetPerfMonitorGroupsAMD", ofVoid(ADDRESS, JAVA_INT, ADDRESS));
        ext.glGetPerfMonitorCountersAMD = load.invoke("glGetPerfMonitorCountersAMD", ofVoid(JAVA_INT, ADDRESS, ADDRESS, JAVA_INT, ADDRESS));
        ext.glGetPerfMonitorGroupStringAMD = load.invoke("glGetPerfMonitorGroupStringAMD", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetPerfMonitorCounterStringAMD = load.invoke("glGetPerfMonitorCounterStringAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetPerfMonitorCounterInfoAMD = load.invoke("glGetPerfMonitorCounterInfoAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGenPerfMonitorsAMD = load.invoke("glGenPerfMonitorsAMD", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeletePerfMonitorsAMD = load.invoke("glDeletePerfMonitorsAMD", ofVoid(JAVA_INT, ADDRESS));
        ext.glSelectPerfMonitorCountersAMD = load.invoke("glSelectPerfMonitorCountersAMD", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glBeginPerfMonitorAMD = load.invoke("glBeginPerfMonitorAMD", ofVoid(JAVA_INT));
        ext.glEndPerfMonitorAMD = load.invoke("glEndPerfMonitorAMD", ofVoid(JAVA_INT));
        ext.glGetPerfMonitorCounterDataAMD = load.invoke("glGetPerfMonitorCounterDataAMD", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glGetPerfMonitorGroupsAMD(@NativeType("GLint *") MemorySegment numGroups, int groupsSize, @NativeType("GLuint *") MemorySegment groups) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfMonitorGroupsAMD).invokeExact(numGroups, groupsSize, groups);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfMonitorCountersAMD(int group, @NativeType("GLint *") MemorySegment numCounters, @NativeType("GLint *") MemorySegment maxActiveCounters, int counterSize, @NativeType("GLuint *") MemorySegment counters) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfMonitorCountersAMD).invokeExact(group, numCounters, maxActiveCounters, counterSize, counters);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfMonitorGroupStringAMD(int group, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLchar *") MemorySegment groupString) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfMonitorGroupStringAMD).invokeExact(group, bufSize, length, groupString);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLchar *") MemorySegment counterString) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfMonitorCounterStringAMD).invokeExact(group, counter, bufSize, length, counterString);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, @NativeType("void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfMonitorCounterInfoAMD).invokeExact(group, counter, pname, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenPerfMonitorsAMD(int n, @NativeType("GLuint *") MemorySegment monitors) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenPerfMonitorsAMD).invokeExact(n, monitors);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeletePerfMonitorsAMD(int n, @NativeType("GLuint *") MemorySegment monitors) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeletePerfMonitorsAMD).invokeExact(n, monitors);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, @NativeType("GLuint *") MemorySegment counterList) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSelectPerfMonitorCountersAMD).invokeExact(monitor, enable, group, numCounters, counterList);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBeginPerfMonitorAMD(int monitor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginPerfMonitorAMD).invokeExact(monitor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndPerfMonitorAMD(int monitor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndPerfMonitorAMD).invokeExact(monitor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, @NativeType("GLuint *") MemorySegment data, @NativeType("GLint *") MemorySegment bytesWritten) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPerfMonitorCounterDataAMD).invokeExact(monitor, pname, dataSize, data, bytesWritten);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
