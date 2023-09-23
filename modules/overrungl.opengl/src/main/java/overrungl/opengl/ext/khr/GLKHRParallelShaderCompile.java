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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.khr;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_KHR_parallel_shader_compile}
  */
public final class GLKHRParallelShaderCompile {
    public static final int GL_MAX_SHADER_COMPILER_THREADS_KHR = 0x91B0;
    public static final int GL_COMPLETION_STATUS_KHR = 0x91B1;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_KHR_parallel_shader_compile) return;
        ext.glMaxShaderCompilerThreadsKHR = load.invoke("glMaxShaderCompilerThreadsKHR", ofVoid(JAVA_INT));
    }

    public static void glMaxShaderCompilerThreadsKHR(int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMaxShaderCompilerThreadsKHR).invokeExact(count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
