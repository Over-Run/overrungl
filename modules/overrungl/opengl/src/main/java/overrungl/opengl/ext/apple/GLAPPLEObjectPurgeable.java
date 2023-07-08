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

package overrungl.opengl.ext.apple;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

/**
 * {@code GL_APPLE_object_purgeable}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAPPLEObjectPurgeable {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_object_purgeable) return;
        ext.glGetObjectParameterivAPPLE = load.invoke("glGetObjectParameterivAPPLE", FunctionDescriptors.IIIPV);
        ext.glObjectPurgeableAPPLE = load.invoke("glObjectPurgeableAPPLE", FunctionDescriptors.IIII);
        ext.glObjectUnpurgeableAPPLE = load.invoke("glObjectUnpurgeableAPPLE", FunctionDescriptors.IIII);
    }

    public static void glGetObjectParameterivAPPLE(int objectType, int name, int pname, MemorySegment params) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetObjectParameterivAPPLE).invokeExact(objectType, name, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGetObjectParameterivAPPLE(SegmentAllocator allocator, int objectType, int name, int pname, int[] params) {
        glGetObjectParameterivAPPLE(objectType, name, pname, allocator.allocateArray(ValueLayout.JAVA_INT, params));
    }

    public static int glObjectPurgeableAPPLE(int objectType, int name, int option) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glObjectPurgeableAPPLE).invokeExact(objectType, name, option);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int glObjectUnpurgeableAPPLE(int objectType, int name, int option) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glObjectUnpurgeableAPPLE).invokeExact(objectType, name, option);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
