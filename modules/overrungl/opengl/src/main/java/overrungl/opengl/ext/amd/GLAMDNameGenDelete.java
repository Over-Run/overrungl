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

package overrungl.opengl.ext.amd;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;
import overrungl.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_INT;

/**
 * {@code GL_AMD_name_gen_delete}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDNameGenDelete {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_name_gen_delete) return;
        ext.glDeleteNamesAMD = load.invoke("glDeleteNamesAMD", FunctionDescriptors.IIPV);
        ext.glGenNamesAMD = load.invoke("glGenNamesAMD", FunctionDescriptors.IIPV);
        ext.glIsNameAMD = load.invoke("glIsNameAMD", FunctionDescriptors.IIZ);
    }

    public static void glDeleteNamesAMD(int identifier, int num, MemorySegment names) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeleteNamesAMD).invokeExact(identifier, num, names);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteNamesAMD(SegmentAllocator allocator, int identifier, int[] names) {
        glDeleteNamesAMD(identifier, names.length, allocator.allocateArray(JAVA_INT, names));
    }

    public static void glDeleteNameAMD(int identifier, int name) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            glDeleteNamesAMD(identifier, 1, stack.ints(name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGenNamesAMD(int identifier, int num, MemorySegment names) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGenNamesAMD).invokeExact(identifier, num, names);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenNamesAMD(SegmentAllocator allocator, int identifier, int[] names) {
        var seg = allocator.allocateArray(JAVA_INT, names.length);
        glGenNamesAMD(identifier, names.length, seg);
        RuntimeHelper.toArray(seg, names);
    }

    public static int glGenNameAMD(int identifier) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGenNamesAMD(identifier, 1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean glIsNameAMD(int identifier, int name) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (boolean) GLLoader.check(ext.glIsNameAMD).invokeExact(identifier, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
