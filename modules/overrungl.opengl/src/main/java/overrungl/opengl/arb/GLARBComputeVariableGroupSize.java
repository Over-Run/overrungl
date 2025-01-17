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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBComputeVariableGroupSize {
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB = 0x90EB;
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB = 0x91BF;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDispatchComputeGroupSizeARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glDispatchComputeGroupSizeARB
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glDispatchComputeGroupSizeARB = RuntimeHelper.downcall(Descriptors.FD_glDispatchComputeGroupSizeARB);
        public final MemorySegment PFN_glDispatchComputeGroupSizeARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDispatchComputeGroupSizeARB = func.invoke("glDispatchComputeGroupSizeARB");
        }
    }

    public GLARBComputeVariableGroupSize(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DispatchComputeGroupSizeARB(@CType("GLuint") int num_groups_x, @CType("GLuint") int num_groups_y, @CType("GLuint") int num_groups_z, @CType("GLuint") int group_size_x, @CType("GLuint") int group_size_y, @CType("GLuint") int group_size_z) {
        if (Unmarshal.isNullPointer(handles.PFN_glDispatchComputeGroupSizeARB)) throw new SymbolNotFoundError("Symbol not found: glDispatchComputeGroupSizeARB");
        try { Handles.MH_glDispatchComputeGroupSizeARB.invokeExact(handles.PFN_glDispatchComputeGroupSizeARB, num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z); }
        catch (Throwable e) { throw new RuntimeException("error in glDispatchComputeGroupSizeARB", e); }
    }

}
