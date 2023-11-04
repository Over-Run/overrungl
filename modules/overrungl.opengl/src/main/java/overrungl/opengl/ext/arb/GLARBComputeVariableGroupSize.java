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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_compute_variable_group_size}
 */
public final class GLARBComputeVariableGroupSize {
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB = 0x90EB;
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB = 0x91BF;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_compute_variable_group_size) return;
        ext.glDispatchComputeGroupSizeARB = load.invoke("glDispatchComputeGroupSizeARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glDispatchComputeGroupSizeARB(int num_groups_x, int num_groups_y, int num_groups_z, int group_size_x, int group_size_y, int group_size_z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDispatchComputeGroupSizeARB).invokeExact(num_groups_x, num_groups_y, num_groups_z, group_size_x, group_size_y, group_size_z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
