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

package org.overrun.gl.opengl.ext.arb;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;

import java.lang.foreign.MemorySegment;

import static org.overrun.gl.FunctionDescriptors.*;

/**
 * {@code GL_ARB_occlusion_query}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBOcclusionQuery {
    public static final int GL_QUERY_COUNTER_BITS_ARB = 0x8864;
    public static final int GL_CURRENT_QUERY_ARB = 0x8865;
    public static final int GL_QUERY_RESULT_ARB = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;
    public static final int GL_SAMPLES_PASSED_ARB = 0x8914;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_occlusion_query) return;
        ext.glBeginQueryARB = load.invoke("glBeginQueryARB", IIV);
        ext.glDeleteQueriesARB = load.invoke("glDeleteQueriesARB", IPV);
        ext.glEndQueryARB = load.invoke("glEndQueryARB", IV);
        ext.glGenQueriesARB = load.invoke("glGenQueriesARB", IPV);
        ext.glGetQueryObjectivARB = load.invoke("glGetQueryObjectivARB", IIPV);
        ext.glGetQueryObjectuivARB = load.invoke("glGetQueryObjectuivARB", IIPV);
        ext.glGetQueryivARB = load.invoke("glGetQueryivARB", IIPV);
        ext.glIsQueryARB = load.invoke("glIsQueryARB", IZ);
    }

    public static void glBeginQueryARB(int target, int id) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glBeginQueryARB).invokeExact(target, id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteQueriesARB(int n, MemorySegment ids) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeleteQueriesARB).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glEndQueryARB(int target) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glEndQueryARB).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenQueriesARB(int n, MemorySegment ids) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGenQueriesARB).invokeExact(n, ids);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetQueryObjectivARB(int id, int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetQueryObjectivARB).invokeExact(id, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetQueryObjectuivARB(int id, int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetQueryObjectuivARB).invokeExact(id, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetQueryivARB(int target, int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetQueryivARB).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean glIsQueryARB(int id) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) GLLoader.check(ext.glIsQueryARB).invokeExact(id);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
