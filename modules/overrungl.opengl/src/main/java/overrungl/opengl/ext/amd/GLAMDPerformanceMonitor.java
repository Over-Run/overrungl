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
package overrungl.opengl.ext.amd;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_AMD_performance_monitor}
 */
public interface GLAMDPerformanceMonitor {
    int GL_COUNTER_TYPE_AMD = 0x8BC0;
    int GL_COUNTER_RANGE_AMD = 0x8BC1;
    int GL_UNSIGNED_INT64_AMD = 0x8BC2;
    int GL_PERCENTAGE_AMD = 0x8BC3;
    int GL_PERFMON_RESULT_AVAILABLE_AMD = 0x8BC4;
    int GL_PERFMON_RESULT_SIZE_AMD = 0x8BC5;
    int GL_PERFMON_RESULT_AMD = 0x8BC6;

    default void glGetPerfMonitorGroupsAMD(@NativeType("GLint *") MemorySegment numGroups, int groupsSize, @NativeType("GLuint *") MemorySegment groups) {
        throw new ContextException();
    }

    default void glGetPerfMonitorCountersAMD(int group, @NativeType("GLint *") MemorySegment numCounters, @NativeType("GLint *") MemorySegment maxActiveCounters, int counterSize, @NativeType("GLuint *") MemorySegment counters) {
        throw new ContextException();
    }

    default void glGetPerfMonitorGroupStringAMD(int group, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLchar *") MemorySegment groupString) {
        throw new ContextException();
    }

    default void glGetPerfMonitorCounterStringAMD(int group, int counter, int bufSize, @NativeType("GLsizei *") MemorySegment length, @NativeType("GLchar *") MemorySegment counterString) {
        throw new ContextException();
    }

    default void glGetPerfMonitorCounterInfoAMD(int group, int counter, int pname, @NativeType("void *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGenPerfMonitorsAMD(int n, @NativeType("GLuint *") MemorySegment monitors) {
        throw new ContextException();
    }

    default void glDeletePerfMonitorsAMD(int n, @NativeType("GLuint *") MemorySegment monitors) {
        throw new ContextException();
    }

    default void glSelectPerfMonitorCountersAMD(int monitor, boolean enable, int group, int numCounters, @NativeType("GLuint *") MemorySegment counterList) {
        throw new ContextException();
    }

    default void glBeginPerfMonitorAMD(int monitor) {
        throw new ContextException();
    }

    default void glEndPerfMonitorAMD(int monitor) {
        throw new ContextException();
    }

    default void glGetPerfMonitorCounterDataAMD(int monitor, int pname, int dataSize, @NativeType("GLuint *") MemorySegment data, @NativeType("GLint *") MemorySegment bytesWritten) {
        throw new ContextException();
    }

}
