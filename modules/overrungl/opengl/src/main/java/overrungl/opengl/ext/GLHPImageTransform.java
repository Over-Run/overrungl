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
import overrungl.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static overrungl.FunctionDescriptors.*;

/**
 * {@code GL_HP_image_transform}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLHPImageTransform {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_HP_image_transform) return;
        ext.glGetImageTransformParameterfvHP = load.invoke("glGetImageTransformParameterfvHP", IIPV);
        ext.glGetImageTransformParameterivHP = load.invoke("glGetImageTransformParameterivHP", IIPV);
        ext.glImageTransformParameterfHP = load.invoke("glImageTransformParameterfHP", IIFV);
        ext.glImageTransformParameterfvHP = load.invoke("glImageTransformParameterfvHP", IIPV);
        ext.glImageTransformParameteriHP = load.invoke("glImageTransformParameteriHP", IIIV);
        ext.glImageTransformParameterivHP = load.invoke("glImageTransformParameterivHP", IIPV);
    }

    public static void glGetImageTransformParameterfvHP(int target, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetImageTransformParameterfvHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetImageTransformParameterfvHP(SegmentAllocator allocator, int target, int pname, float[] params) {
        var seg = allocator.allocateArray(ValueLayout.JAVA_FLOAT, params.length);
        glGetImageTransformParameterfvHP(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void glGetImageTransformParameterivHP(int target, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetImageTransformParameterivHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetImageTransformParameterivHP(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(ValueLayout.JAVA_INT, params.length);
        glGetImageTransformParameterivHP(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static void glImageTransformParameterfHP(int target, int pname, float param) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glImageTransformParameterfHP).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterfvHP(int target, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glImageTransformParameterfvHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterfvHP(SegmentAllocator allocator, int target, int pname, float[] params) {
        glImageTransformParameterfvHP(target, pname, allocator.allocateArray(ValueLayout.JAVA_FLOAT, params));
    }

    public static void glImageTransformParameteriHP(int target, int pname, int param) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glImageTransformParameteriHP).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterivHP(int target, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glImageTransformParameterivHP).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glImageTransformParameterivHP(SegmentAllocator allocator, int target, int pname, int[] params) {
        glImageTransformParameterivHP(target, pname, allocator.allocateArray(ValueLayout.JAVA_INT, params));
    }
}
