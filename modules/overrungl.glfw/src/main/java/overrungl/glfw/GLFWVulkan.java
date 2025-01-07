/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

package overrungl.glfw;

import overrungl.annotation.CType;
import overrungl.annotation.Out;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;
import overrungl.util.MemoryStack;
import overrungl.util.Unmarshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/**
 * GLFW Vulkan functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLFWVulkan {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        private Handles() { }
        /// The method handle of `glfwInitVulkanLoader`.
        public static final MethodHandle MH_glfwInitVulkanLoader = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwInitVulkanLoader", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        /// The method handle of `glfwGetInstanceProcAddress`.
        public static final MethodHandle MH_glfwGetInstanceProcAddress = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetInstanceProcAddress", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, Unmarshal.STR_LAYOUT));
        /// The method handle of `glfwGetPhysicalDevicePresentationSupport`.
        public static final MethodHandle MH_glfwGetPhysicalDevicePresentationSupport = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwGetPhysicalDevicePresentationSupport", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        /// The method handle of `glfwCreateWindowSurface`.
        public static final MethodHandle MH_glfwCreateWindowSurface = RuntimeHelper.downcall(GLFWInternal.lookup(), "glfwCreateWindowSurface", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    }
    //endregion

    public static void glfwInitVulkanLoader(@CType("PFN_vkGetInstanceProcAddr") java.lang.foreign.MemorySegment loader) {
        try {
            Handles.MH_glfwInitVulkanLoader.invokeExact(loader);
        } catch (Throwable e) { throw new RuntimeException("error in glfwInitVulkanLoader", e); }
    }

    public static @CType("GLFWvkproc") java.lang.foreign.MemorySegment glfwGetInstanceProcAddress(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("const char*") java.lang.foreign.MemorySegment procname) {
        try {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(instance, procname);
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    public static @CType("GLFWvkproc") java.lang.foreign.MemorySegment glfwGetInstanceProcAddress(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("const char*") java.lang.String procname) {
        try (var __overrungl_stack = MemoryStack.pushLocal()) {
            return (java.lang.foreign.MemorySegment) Handles.MH_glfwGetInstanceProcAddress.invokeExact(instance, Marshal.marshal(__overrungl_stack, procname));
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetInstanceProcAddress", e); }
    }

    public static @CType("int") boolean glfwGetPhysicalDevicePresentationSupport(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("VkPhysicalDevice") java.lang.foreign.MemorySegment device, @CType("uint32_t") int queuefamily) {
        try {
            return (int) Handles.MH_glfwGetPhysicalDevicePresentationSupport.invokeExact(instance, device, queuefamily) != GLFW.GLFW_FALSE;
        } catch (Throwable e) { throw new RuntimeException("error in glfwGetPhysicalDevicePresentationSupport", e); }
    }

    public static @CType("VkResult") int glfwCreateWindowSurface(@CType("VkInstance") java.lang.foreign.MemorySegment instance, @CType("GLFWwindow*") java.lang.foreign.MemorySegment window, @CType("const VkAllocationCallbacks*") java.lang.foreign.MemorySegment allocator, @Out @CType("VkSurfaceKHR*") java.lang.foreign.MemorySegment surface) {
        try {
            return (int) Handles.MH_glfwCreateWindowSurface.invokeExact(instance, window, allocator, surface);
        } catch (Throwable e) { throw new RuntimeException("error in glfwCreateWindowSurface", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private GLFWVulkan() {
    }
}
