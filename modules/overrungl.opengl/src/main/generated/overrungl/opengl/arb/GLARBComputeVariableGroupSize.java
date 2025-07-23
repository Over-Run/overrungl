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

public final class GLARBComputeVariableGroupSize {
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB = 0x90EB;
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB = 0x91BF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDispatchComputeGroupSizeARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDispatchComputeGroupSizeARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDispatchComputeGroupSizeARB = func.invoke("glDispatchComputeGroupSizeARB");
        }
    }

    public GLARBComputeVariableGroupSize(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDispatchComputeGroupSizeARB((unsigned int) GLuint num_groups_x, (unsigned int) GLuint num_groups_y, (unsigned int) GLuint num_groups_z, (unsigned int) GLuint group_size_x, (unsigned int) GLuint group_size_y, (unsigned int) GLuint group_size_z);
    /// ```
    public void DispatchComputeGroupSizeARB(int num_groups_x, int num_groups_y, int num_groups_z, int group_size_x, int group_size_y, int group_size_z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDispatchComputeGroupSizeARB)) throw new GLSymbolNotFoundError("Symbol not found: glDispatchComputeGroupSizeARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDispatchComputeGroupSizeARB", num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z); }
        Handles.MH_glDispatchComputeGroupSizeARB.invokeExact(handles.PFN_glDispatchComputeGroupSizeARB, num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z); }
        catch (Throwable e) { throw new RuntimeException("error in DispatchComputeGroupSizeARB", e); }
    }

}
