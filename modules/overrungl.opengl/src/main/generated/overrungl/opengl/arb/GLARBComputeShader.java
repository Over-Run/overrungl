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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBComputeShader {
    public static final int GL_COMPUTE_SHADER = 0x91B9;
    public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
    public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
    public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
    public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
    public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
    public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
    public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;
    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
    public static final int GL_COMPUTE_SHADER_BIT = 0x00000020;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDispatchCompute = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDispatchComputeIndirect = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glDispatchCompute;
        public final MemorySegment PFN_glDispatchComputeIndirect;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDispatchCompute = func.invoke("glDispatchCompute");
            PFN_glDispatchComputeIndirect = func.invoke("glDispatchComputeIndirect");
        }
    }

    public GLARBComputeShader(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDispatchCompute((unsigned int) GLuint num_groups_x, (unsigned int) GLuint num_groups_y, (unsigned int) GLuint num_groups_z);
    /// ```
    public void DispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDispatchCompute)) throw new GLSymbolNotFoundError("Symbol not found: glDispatchCompute");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDispatchCompute", num_groups_x, num_groups_y, num_groups_z); }
        Handles.MH_glDispatchCompute.invokeExact(handles.PFN_glDispatchCompute, num_groups_x, num_groups_y, num_groups_z); }
        catch (Throwable e) { throw new RuntimeException("error in DispatchCompute", e); }
    }

    /// ```
    /// void glDispatchComputeIndirect(((signed long long) khronos_intptr_t) GLintptr indirect);
    /// ```
    public void DispatchComputeIndirect(long indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDispatchComputeIndirect)) throw new GLSymbolNotFoundError("Symbol not found: glDispatchComputeIndirect");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDispatchComputeIndirect", indirect); }
        Handles.MH_glDispatchComputeIndirect.invokeExact(handles.PFN_glDispatchComputeIndirect, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DispatchComputeIndirect", e); }
    }

}
