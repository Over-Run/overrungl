/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package overrungl.opengl.ext.arb;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

import java.lang.foreign.MemorySegment;

/**
 * {@code GL_ARB_point_parameters}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBPointParameters {
    public static final int GL_POINT_SIZE_MIN_ARB = 0x8126;
    public static final int GL_POINT_SIZE_MAX_ARB = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_ARB = 0x8128;
    public static final int GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_point_parameters) return;
        ext.glPointParameterfARB = load.invoke("glPointParameterfARB", FunctionDescriptors.IFV);
        ext.glPointParameterfvARB = load.invoke("glPointParameterfvARB", FunctionDescriptors.IPV);
    }

    public static void glPointParameterfARB(int pname, float param) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glPointParameterfARB).invokeExact(pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glPointParameterfvARB(int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glPointParameterfvARB).invokeExact(pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
