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

package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.gl.GLLoader;

/**
 * {@code GL_ARB_parallel_shader_compile}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_ARB = 0x91B0;
    public static final int GL_COMPLETION_STATUS_ARB = 0x91B1;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_parallel_shader_compile) return;
        ext.glMaxShaderCompilerThreadsARB = load.invoke("glMaxShaderCompilerThreadsARB", FunctionDescriptors.IV);
    }

    public static void glMaxShaderCompilerThreadsARB(int count) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glMaxShaderCompilerThreadsARB).invokeExact(count);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
