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

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

/**
 * {@code GL_AMD_sample_positions}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDSamplePositions {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_sample_positions) return;
        ext.glSetMultisamplefvAMD = load.invoke("glSetMultisamplefvAMD", FunctionDescriptors.IIPV);
    }

    public static void glSetMultisamplefvAMD(int pname, int index, MemorySegment val) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glSetMultisamplefvAMD).invokeExact(pname, index, val);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glSetMultisamplefvAMD(SegmentAllocator allocator, int pname, int index, float[] val) {
        glSetMultisamplefvAMD(pname, index, allocator.allocateArray(ValueLayout.JAVA_FLOAT, val));
    }
}
