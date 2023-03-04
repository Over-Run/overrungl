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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.gl.GLLoader;

/**
 * {@code GL_ARB_compute_variable_group_size}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBComputeVariableGroupSize {
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_INVOCATIONS_ARB = 0x9344;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_INVOCATIONS_ARB = 0x90EB;
    public static final int GL_MAX_COMPUTE_VARIABLE_GROUP_SIZE_ARB = 0x9345;
    public static final int GL_MAX_COMPUTE_FIXED_GROUP_SIZE_ARB = 0x91BF;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_compute_variable_group_size) return;
        ext.glDispatchComputeGroupSizeARB = load.invoke("glDispatchComputeGroupSizeARB", FunctionDescriptors.IIIIIIV);
    }

    public static void glDispatchComputeGroupSizeARB(int numGroupsX, int numGroupsY, int numGroupsZ, int groupSizeX, int groupSizeY, int groupSizeZ) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDispatchComputeGroupSizeARB).invokeExact(numGroupsX, numGroupsY, numGroupsZ, groupSizeX, groupSizeY, groupSizeZ);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
