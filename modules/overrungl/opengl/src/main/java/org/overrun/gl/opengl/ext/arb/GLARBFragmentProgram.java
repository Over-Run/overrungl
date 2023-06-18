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
import org.overrun.gl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.gl.FunctionDescriptors.*;

/**
 * {@code GL_ARB_fragment_program}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLARBFragmentProgram {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_fragment_program) return;
        ext.glBindProgramARB = load.invoke("glBindProgramARB", IIV);
        ext.glDeleteProgramsARB = load.invoke("glDeleteProgramsARB", IPV);
        ext.glGenProgramsARB = load.invoke("glGenProgramsARB", IPV);
        ext.glGetProgramEnvParameterdvARB = load.invoke("glGetProgramEnvParameterdvARB", IIPV);
        ext.glGetProgramEnvParameterfvARB = load.invoke("glGetProgramEnvParameterfvARB", IIPV);
        ext.glGetProgramLocalParameterdvARB = load.invoke("glGetProgramLocalParameterdvARB", IIPV);
        ext.glGetProgramLocalParameterfvARB = load.invoke("glGetProgramLocalParameterfvARB", IIPV);
        ext.glGetProgramStringARB = load.invoke("glGetProgramStringARB", IIPV);
        ext.glGetProgramivARB = load.invoke("glGetProgramivARB", IIPV);
        ext.glIsProgramARB = load.invoke("glIsProgramARB", IZ);
        ext.glProgramEnvParameter4dARB = load.invoke("glProgramEnvParameter4dARB", IIDDDDV);
        ext.glProgramEnvParameter4dvARB = load.invoke("glProgramEnvParameter4dvARB", IIPV);
        ext.glProgramEnvParameter4fARB = load.invoke("glProgramEnvParameter4fARB", IIFFFFV);
        ext.glProgramEnvParameter4fvARB = load.invoke("glProgramEnvParameter4fvARB", IIPV);
        ext.glProgramLocalParameter4dARB = load.invoke("glProgramLocalParameter4dARB", IIDDDDV);
        ext.glProgramLocalParameter4dvARB = load.invoke("glProgramLocalParameter4dvARB", IIPV);
        ext.glProgramLocalParameter4fARB = load.invoke("glProgramLocalParameter4fARB", IIFFFFV);
        ext.glProgramLocalParameter4fvARB = load.invoke("glProgramLocalParameter4fvARB", IIPV);
        ext.glProgramStringARB = load.invoke("glProgramStringARB", IIIPV);
    }

    public static void glBindProgramARB(int target, int program) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glBindProgramARB).invokeExact(target, program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteProgramsARB(int n, MemorySegment programs) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeleteProgramsARB).invokeExact(n, programs);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteProgramsARB(SegmentAllocator allocator, int[] programs) {
        glDeleteProgramsARB(programs.length, allocator.allocateArray(JAVA_INT, programs));
    }

    public static void glDeleteProgramARB(int program) {
        MemoryStack stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            glDeleteProgramsARB(1, stack.ints(program));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGenProgramsARB(int n, MemorySegment programs) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGenProgramsARB).invokeExact(n, programs);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenProgramsARB(SegmentAllocator allocator, int[] programs) {
        glGenProgramsARB(programs.length, allocator.allocateArray(JAVA_INT, programs));
    }

    public static int glGenProgramARB() {
        MemoryStack stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            MemorySegment segment = stack.calloc(JAVA_INT);
            glGenProgramsARB(1, segment);
            return segment.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGetProgramEnvParameterdvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetProgramEnvParameterdvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetProgramEnvParameterdvARB(SegmentAllocator allocator, int target, int index, double[] params) {
        glGetProgramEnvParameterdvARB(target, index, allocator.allocateArray(JAVA_DOUBLE, params));
    }

    public static void glGetProgramEnvParameterfvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetProgramEnvParameterfvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetProgramEnvParameterfvARB(SegmentAllocator allocator, int target, int index, float[] params) {
        glGetProgramEnvParameterfvARB(target, index, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void glGetProgramLocalParameterdvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetProgramLocalParameterdvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetProgramLocalParameterdvARB(SegmentAllocator allocator, int target, int index, double[] params) {
        glGetProgramLocalParameterdvARB(target, index, allocator.allocateArray(JAVA_DOUBLE, params));
    }

    public static void glGetProgramLocalParameterfvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetProgramLocalParameterfvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetProgramLocalParameterfvARB(SegmentAllocator allocator, int target, int index, float[] params) {
        glGetProgramLocalParameterfvARB(target, index, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void glGetProgramStringARB(int target, int pname, MemorySegment string) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetProgramStringARB).invokeExact(target, pname, string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetProgramivARB(int target, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetProgramivARB).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetProgramivARB(SegmentAllocator allocator, int target, int pname, int[] params) {
        glGetProgramivARB(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static boolean glIsProgramARB(int program) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) GLLoader.check(ext.glIsProgramARB).invokeExact(program);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramEnvParameter4dARB(int target, int index, double x, double y, double z, double w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramEnvParameter4dARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramEnvParameter4dvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramEnvParameter4dvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramEnvParameter4dvARB(SegmentAllocator allocator, int target, int index, double[] params) {
        glProgramEnvParameter4dvARB(target, index, allocator.allocateArray(JAVA_DOUBLE, params));
    }

    public static void glProgramEnvParameter4fARB(int target, int index, float x, float y, float z, float w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramEnvParameter4fARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramEnvParameter4fvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramEnvParameter4fvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramEnvParameter4fvARB(SegmentAllocator allocator, int target, int index, float[] params) {
        glProgramEnvParameter4fvARB(target, index, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void glProgramLocalParameter4dARB(int target, int index, double x, double y, double z, double w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramLocalParameter4dARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramLocalParameter4dvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramLocalParameter4dvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramLocalParameter4dvARB(SegmentAllocator allocator, int target, int index, double[] params) {
        glProgramLocalParameter4dvARB(target, index, allocator.allocateArray(JAVA_DOUBLE, params));
    }

    public static void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramLocalParameter4fARB).invokeExact(target, index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramLocalParameter4fvARB(int target, int index, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramLocalParameter4fvARB).invokeExact(target, index, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glProgramLocalParameter4fvARB(SegmentAllocator allocator, int target, int index, float[] params) {
        glProgramLocalParameter4fvARB(target, index, allocator.allocateArray(JAVA_FLOAT, params));
    }

    public static void glProgramStringARB(int target, int format, int len, MemorySegment string) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glProgramStringARB).invokeExact(target, format, len, string);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
