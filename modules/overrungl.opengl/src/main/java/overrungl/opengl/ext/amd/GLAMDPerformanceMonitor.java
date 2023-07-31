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

package overrungl.opengl.ext.amd;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_BYTE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static overrungl.FunctionDescriptors.*;

/**
 * {@code GL_AMD_performance_monitor}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDPerformanceMonitor {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_performance_monitor) return;
        ext.glBeginPerfMonitorAMD = load.invoke("glBeginPerfMonitorAMD", IV);
        ext.glDeletePerfMonitorsAMD = load.invoke("glDeletePerfMonitorsAMD", IPV);
        ext.glEndPerfMonitorAMD = load.invoke("glEndPerfMonitorAMD", IV);
        ext.glGenPerfMonitorsAMD = load.invoke("glGenPerfMonitorsAMD", IPV);
        ext.glGetPerfMonitorCounterDataAMD = load.invoke("glGetPerfMonitorCounterDataAMD", IIIPPV);
        ext.glGetPerfMonitorCounterInfoAMD = load.invoke("glGetPerfMonitorCounterInfoAMD", IIIPV);
        ext.glGetPerfMonitorCounterStringAMD = load.invoke("glGetPerfMonitorCounterStringAMD", IIIPPV);
        ext.glGetPerfMonitorCountersAMD = load.invoke("glGetPerfMonitorCountersAMD", IPPIPV);
        ext.glGetPerfMonitorGroupStringAMD = load.invoke("glGetPerfMonitorGroupStringAMD", IIPPV);
        ext.glGetPerfMonitorGroupsAMD = load.invoke("glGetPerfMonitorGroupsAMD", PIPV);
        ext.glSelectPerfMonitorCountersAMD = load.invoke("glSelectPerfMonitorCountersAMD", IZIIPV);
    }

    public static void glBeginPerfMonitorAMD(int monitor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glBeginPerfMonitorAMD).invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeletePerfMonitorsAMD(int n, MemorySegment monitors) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeletePerfMonitorsAMD).invokeExact(n, monitors);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeletePerfMonitorsAMD(SegmentAllocator allocator, int[] monitors) {
        glDeletePerfMonitorsAMD(monitors.length, allocator.allocateArray(JAVA_INT, monitors));
    }

    public static void glDeletePerfMonitorAMD(int monitor) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            glDeletePerfMonitorsAMD(1, stack.ints(monitor));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glEndPerfMonitorAMD(int monitor) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glEndPerfMonitorAMD).invokeExact(monitor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenPerfMonitorsAMD(int n, MemorySegment monitors) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGenPerfMonitorsAMD).invokeExact(n, monitors);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenPerfMonitorsAMD(SegmentAllocator allocator, int[] monitors) {
        var seg = allocator.allocateArray(JAVA_INT, monitors.length);
        glGenPerfMonitorsAMD(monitors.length, seg);
        RuntimeHelper.toArray(seg, monitors);
    }

    public static int glGenPerfMonitorAMD() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGenPerfMonitorsAMD(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, MemorySegment data, MemorySegment bytesWritten) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetPerfMonitorCounterDataAMD).invokeExact(monitor, pname, dataSize, data, bytesWritten);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfMonitorCounterDataAMD(SegmentAllocator allocator, int monitor, int pname, int[] data, int @Nullable [] bytesWritten) {
        var pData = allocator.allocateArray(JAVA_INT, data.length);
        var pNum = bytesWritten != null ? allocator.allocateArray(JAVA_INT, bytesWritten.length) : MemorySegment.NULL;
        glGetPerfMonitorCounterDataAMD(monitor, pname, data.length, pData, pNum);
        RuntimeHelper.toArray(pData, data);
        if (bytesWritten != null && bytesWritten.length > 0) {
            bytesWritten[0] = pNum.get(JAVA_INT, 0);
        }
    }

    public static void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, MemorySegment data) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetPerfMonitorCounterInfoAMD).invokeExact(group, counter, pname, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, MemorySegment length, MemorySegment counterString) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetPerfMonitorCounterStringAMD).invokeExact(group, counter, bufSize, length, counterString);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String glGetPerfMonitorCounterStringAMD(SegmentAllocator allocator, int group, int counter, int bufSize) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        glGetPerfMonitorCounterStringAMD(group, counter, bufSize, MemorySegment.NULL, seg);
        return seg.getUtf8String(0);
    }

    public static void glGetPerfMonitorCountersAMD(int group, MemorySegment numCounters, MemorySegment maxActiveCounters, int counterSize, MemorySegment counters) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetPerfMonitorCountersAMD).invokeExact(group, numCounters, maxActiveCounters, counterSize, counters);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfMonitorCountersAMD(SegmentAllocator allocator, int group, int @Nullable [] numCounters, int @Nullable [] maxActiveCounters, int counterSize, int @Nullable [] counters) {
        var pNum = numCounters != null ? allocator.allocateArray(JAVA_INT, numCounters.length) : MemorySegment.NULL;
        var pMax = maxActiveCounters != null ? allocator.allocateArray(JAVA_INT, maxActiveCounters.length) : MemorySegment.NULL;
        var pc = counters != null ? allocator.allocateArray(JAVA_INT, counters.length) : MemorySegment.NULL;
        glGetPerfMonitorCountersAMD(group, pNum, pMax, counters != null ? counters.length : counterSize, pc);
    }

    public static void glGetPerfMonitorCountersAMD(SegmentAllocator allocator, int group, int @Nullable [] numCounters, int @Nullable [] maxActiveCounters, int @NotNull [] counters) {
        glGetPerfMonitorCountersAMD(allocator, group, numCounters, maxActiveCounters, counters.length, counters);
    }

    public static void glGetPerfMonitorGroupStringAMD(int group, int bufSize, MemorySegment length, MemorySegment groupString) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetPerfMonitorGroupStringAMD).invokeExact(group, bufSize, length, groupString);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static String glGetPerfMonitorGroupStringAMD(SegmentAllocator allocator, int group, int bufSize) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        glGetPerfMonitorGroupStringAMD(group, bufSize, MemorySegment.NULL, seg);
        return seg.getUtf8String(0);
    }

    public static void glGetPerfMonitorGroupsAMD(MemorySegment numGroups, int groupsSize, MemorySegment groups) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetPerfMonitorGroupsAMD).invokeExact(numGroups, groupsSize, groups);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetPerfMonitorGroupsAMD(SegmentAllocator allocator, int @Nullable [] numGroups, int @Nullable [] groups) {
        var pn = numGroups != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        final boolean hasGroups = groups != null;
        var pg = groups != null ? allocator.allocateArray(JAVA_INT, groups.length) : MemorySegment.NULL;
        glGetPerfMonitorGroupsAMD(pn, groups != null ? groups.length : 0, pg);
        if (numGroups != null && numGroups.length > 0) {
            numGroups[0] = pn.get(JAVA_INT, 0);
        }
        if (hasGroups) {
            RuntimeHelper.toArray(pg, groups);
        }
    }

    public static void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, MemorySegment counterList) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glSelectPerfMonitorCountersAMD).invokeExact(monitor, enable, group, numCounters, counterList);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glSelectPerfMonitorCountersAMD(SegmentAllocator allocator, int monitor, boolean enable, int group, int[] counterList) {
        glSelectPerfMonitorCountersAMD(monitor, enable, group, counterList.length, allocator.allocateArray(JAVA_INT, counterList));
    }
}
