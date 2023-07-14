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

package overrungl.opengl.ext;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;

/**
 * {@code GL_MESA_window_pos}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLMESAWindowPos {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_MESA_window_pos) return;
        ext.glWindowPos2dMESA = load.invoke("glWindowPos2dMESA", DDV);
        ext.glWindowPos2dvMESA = load.invoke("glWindowPos2dvMESA", PV);
        ext.glWindowPos2fMESA = load.invoke("glWindowPos2fMESA", FFV);
        ext.glWindowPos2fvMESA = load.invoke("glWindowPos2fvMESA", PV);
        ext.glWindowPos2iMESA = load.invoke("glWindowPos2iMESA", IIV);
        ext.glWindowPos2ivMESA = load.invoke("glWindowPos2ivMESA", PV);
        ext.glWindowPos2sMESA = load.invoke("glWindowPos2sMESA", SSV);
        ext.glWindowPos2svMESA = load.invoke("glWindowPos2svMESA", PV);
        ext.glWindowPos3dMESA = load.invoke("glWindowPos3dMESA", DDDV);
        ext.glWindowPos3dvMESA = load.invoke("glWindowPos3dvMESA", PV);
        ext.glWindowPos3fMESA = load.invoke("glWindowPos3fMESA", FFFV);
        ext.glWindowPos3fvMESA = load.invoke("glWindowPos3fvMESA", PV);
        ext.glWindowPos3iMESA = load.invoke("glWindowPos3iMESA", IIIV);
        ext.glWindowPos3ivMESA = load.invoke("glWindowPos3ivMESA", PV);
        ext.glWindowPos3sMESA = load.invoke("glWindowPos3sMESA", SSSV);
        ext.glWindowPos3svMESA = load.invoke("glWindowPos3svMESA", PV);
        ext.glWindowPos4dMESA = load.invoke("glWindowPos4dMESA", DDDDV);
        ext.glWindowPos4dvMESA = load.invoke("glWindowPos4dvMESA", PV);
        ext.glWindowPos4fMESA = load.invoke("glWindowPos4fMESA", FFFFV);
        ext.glWindowPos4fvMESA = load.invoke("glWindowPos4fvMESA", PV);
        ext.glWindowPos4iMESA = load.invoke("glWindowPos4iMESA", IIIIV);
        ext.glWindowPos4ivMESA = load.invoke("glWindowPos4ivMESA", PV);
        ext.glWindowPos4sMESA = load.invoke("glWindowPos4sMESA", SSSSV);
        ext.glWindowPos4svMESA = load.invoke("glWindowPos4svMESA", PV);
    }

    public static void glWindowPos2dMESA(double x, double y) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2dMESA).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2dvMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2dvMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2dvMESA(SegmentAllocator allocator, double[] value) {
        glWindowPos2dvMESA(allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void glWindowPos2fMESA(float x, float y) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2fMESA).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2fvMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2fvMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2fvMESA(SegmentAllocator allocator, float[] value) {
        glWindowPos2fvMESA(allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void glWindowPos2iMESA(int x, int y) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2iMESA).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2ivMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2ivMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2ivMESA(SegmentAllocator allocator, int[] value) {
        glWindowPos2ivMESA(allocator.allocateArray(JAVA_INT, value));
    }

    public static void glWindowPos2sMESA(short x, short y) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2sMESA).invokeExact(x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2svMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos2svMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos2svMESA(SegmentAllocator allocator, short[] value) {
        glWindowPos2svMESA(allocator.allocateArray(JAVA_SHORT, value));
    }

    public static void glWindowPos3dMESA(double x, double y, double z) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3dMESA).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3dvMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3dvMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3dvMESA(SegmentAllocator allocator, double[] value) {
        glWindowPos3dvMESA(allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void glWindowPos3fMESA(float x, float y, float z) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3fMESA).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3fvMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3fvMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3fvMESA(SegmentAllocator allocator, float[] value) {
        glWindowPos3fvMESA(allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void glWindowPos3iMESA(int x, int y, int z) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3iMESA).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3ivMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3ivMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3ivMESA(SegmentAllocator allocator, int[] value) {
        glWindowPos3ivMESA(allocator.allocateArray(JAVA_INT, value));
    }

    public static void glWindowPos3sMESA(short x, short y, short z) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3sMESA).invokeExact(x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3svMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos3svMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos3svMESA(SegmentAllocator allocator, short[] value) {
        glWindowPos3svMESA(allocator.allocateArray(JAVA_SHORT, value));
    }

    public static void glWindowPos4dMESA(double x, double y, double z, double w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4dMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4dvMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4dvMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4dvMESA(SegmentAllocator allocator, double[] value) {
        glWindowPos4dvMESA(allocator.allocateArray(JAVA_DOUBLE, value));
    }

    public static void glWindowPos4fMESA(float x, float y, float z, float w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4fMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4fvMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4fvMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4fvMESA(SegmentAllocator allocator, float[] value) {
        glWindowPos4fvMESA(allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void glWindowPos4iMESA(int x, int y, int z, int w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4iMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4ivMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4ivMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4ivMESA(SegmentAllocator allocator, int[] value) {
        glWindowPos4ivMESA(allocator.allocateArray(JAVA_INT, value));
    }

    public static void glWindowPos4sMESA(short x, short y, short z, short w) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4sMESA).invokeExact(x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4svMESA(MemorySegment v) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glWindowPos4svMESA).invokeExact(v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glWindowPos4svMESA(SegmentAllocator allocator, short[] value) {
        glWindowPos4svMESA(allocator.allocateArray(JAVA_SHORT, value));
    }
}
