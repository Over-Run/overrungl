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
package overrungl.vulkan.qnx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKQNXScreenSurface {
    public static final int VK_QNX_SCREEN_SURFACE_SPEC_VERSION = 1;
    public static final String VK_QNX_SCREEN_SURFACE_EXTENSION_NAME = "VK_QNX_screen_surface";
    public static final int VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX = 1000378000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateScreenSurfaceQNX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceScreenPresentationSupportQNX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKQNXScreenSurface() {}

    /// ```
    /// (int) VkResult vkCreateScreenSurfaceQNX((struct VkInstance*) VkInstance instance, const VkScreenSurfaceCreateInfoQNX* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateScreenSurfaceQNX(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateScreenSurfaceQNX)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateScreenSurfaceQNX");
        try { return (int) Handles.MH_vkCreateScreenSurfaceQNX.invokeExact(instance.capabilities().PFN_vkCreateScreenSurfaceQNX, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateScreenSurfaceQNX", e); }
    }

    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceScreenPresentationSupportQNX((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, struct _screen_window * window);
    /// ```
    public static int vkGetPhysicalDeviceScreenPresentationSupportQNX(VkPhysicalDevice physicalDevice, int queueFamilyIndex, MemorySegment window) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceScreenPresentationSupportQNX");
        try { return (int) Handles.MH_vkGetPhysicalDeviceScreenPresentationSupportQNX.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX, physicalDevice.segment(), queueFamilyIndex, window); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceScreenPresentationSupportQNX", e); }
    }

}
