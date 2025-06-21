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

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRWaylandSurface {
    public static final int VK_KHR_WAYLAND_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME = "VK_KHR_wayland_surface";
    public static final int VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR = 1000006000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateWaylandSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceWaylandPresentationSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRWaylandSurface() {}

    /// ```
    /// (int) VkResult vkCreateWaylandSurfaceKHR((struct VkInstance*) VkInstance instance, const VkWaylandSurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateWaylandSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateWaylandSurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateWaylandSurfaceKHR");
        try { return (int) Handles.MH_vkCreateWaylandSurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateWaylandSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateWaylandSurfaceKHR", e); }
    }

    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceWaylandPresentationSupportKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, struct wl_display * display);
    /// ```
    public static int vkGetPhysicalDeviceWaylandPresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, MemorySegment display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceWaylandPresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceWaylandPresentationSupportKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR, physicalDevice.segment(), queueFamilyIndex, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceWaylandPresentationSupportKHR", e); }
    }

}
