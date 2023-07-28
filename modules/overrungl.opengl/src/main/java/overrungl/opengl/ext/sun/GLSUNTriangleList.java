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

package overrungl.opengl.ext.sun;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;

/**
 * {@code GL_SUN_triangle_list}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLSUNTriangleList {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_SUN_triangle_list) return;
        ext.glReplacementCodePointerSUN = load.invoke("glReplacementCodePointerSUN", IIPV);
        ext.glReplacementCodeubSUN = load.invoke("glReplacementCodeubSUN", BV);
        ext.glReplacementCodeubvSUN = load.invoke("glReplacementCodeubvSUN", PV);
        ext.glReplacementCodeuiSUN = load.invoke("glReplacementCodeuiSUN", IV);
        ext.glReplacementCodeuivSUN = load.invoke("glReplacementCodeuivSUN", PV);
        ext.glReplacementCodeusSUN = load.invoke("glReplacementCodeusSUN", SV);
        ext.glReplacementCodeusvSUN = load.invoke("glReplacementCodeusvSUN", PV);
    }

    public static void glReplacementCodePointerSUN(int type, int stride, MemorySegment pointer) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodePointerSUN).invokeExact(type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeubSUN(byte code) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodeubSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeubvSUN(MemorySegment code) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodeubvSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeubvSUN(SegmentAllocator allocator, byte[] code) {
        glReplacementCodeubvSUN(allocator.allocateArray(JAVA_BYTE, code));
    }

    public static void glReplacementCodeuiSUN(int code) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodeuiSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuivSUN(MemorySegment code) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodeuivSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeuivSUN(SegmentAllocator allocator, int[] code) {
        glReplacementCodeuivSUN(allocator.allocateArray(JAVA_INT, code));
    }

    public static void glReplacementCodeusSUN(short code) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodeusSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeusvSUN(MemorySegment code) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glReplacementCodeusvSUN).invokeExact(code);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glReplacementCodeusvSUN(SegmentAllocator allocator, short[] code) {
        glReplacementCodeusvSUN(allocator.allocateArray(JAVA_SHORT, code));
    }
}
