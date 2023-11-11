/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_draw_vulkan_image}
 */
public final class GLNVDrawVulkanImage {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_draw_vulkan_image) return;
        ext.glDrawVkImageNV = load.invoke("glDrawVkImageNV", ofVoid(JAVA_LONG, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glGetVkProcAddrNV = load.invoke("glGetVkProcAddrNV", of(ADDRESS, ADDRESS));
        ext.glWaitVkSemaphoreNV = load.invoke("glWaitVkSemaphoreNV", ofVoid(JAVA_LONG));
        ext.glSignalVkSemaphoreNV = load.invoke("glSignalVkSemaphoreNV", ofVoid(JAVA_LONG));
        ext.glSignalVkFenceNV = load.invoke("glSignalVkFenceNV", ofVoid(JAVA_LONG));
    }

    public static void glDrawVkImageNV(long vkImage, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawVkImageNV).invokeExact(vkImage, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static @NativeType("GLVULKANPROCNV") MemorySegment glGetVkProcAddrNV(@NativeType("const GLchar *") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glGetVkProcAddrNV).invokeExact(name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glWaitVkSemaphoreNV(long vkSemaphore) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glWaitVkSemaphoreNV).invokeExact(vkSemaphore);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSignalVkSemaphoreNV(long vkSemaphore) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSignalVkSemaphoreNV).invokeExact(vkSemaphore);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glSignalVkFenceNV(long vkFence) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSignalVkFenceNV).invokeExact(vkFence);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
