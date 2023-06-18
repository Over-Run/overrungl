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

package org.overrun.gl.opengl.ext;

import org.overrun.gl.opengl.GLExtCaps;
import org.overrun.gl.opengl.GLLoadFunc;
import org.overrun.gl.opengl.GLLoader;

import java.lang.foreign.MemorySegment;

import static org.overrun.gl.FunctionDescriptors.IIPV;
import static org.overrun.gl.FunctionDescriptors.IV;

/**
 * {@code GL_INTEL_parallel_arrays}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLINTELParallelArrays {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_parallel_arrays) return;
        ext.glColorPointervINTEL = load.invoke("glColorPointervINTEL", IIPV);
        ext.glNormalPointervINTEL = load.invoke("glNormalPointervINTEL", IV);
        ext.glTexCoordPointervINTEL = load.invoke("glTexCoordPointervINTEL", IIPV);
        ext.glVertexPointervINTEL = load.invoke("glVertexPointervINTEL", IIPV);
    }

    public static void glColorPointervINTEL(int size, int type, MemorySegment pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glColorPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNormalPointervINTEL(int type, MemorySegment pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNormalPointervINTEL).invokeExact(type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glTexCoordPointervINTEL(int size, int type, MemorySegment pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glTexCoordPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glVertexPointervINTEL(int size, int type, MemorySegment pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glVertexPointervINTEL).invokeExact(size, type, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
