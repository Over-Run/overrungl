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
public final class VKKHRWin32Surface {
    public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";
    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateWin32SurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceWin32PresentationSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKKHRWin32Surface() {}

    /// ```
    /// (int) VkResult vkCreateWin32SurfaceKHR((struct VkInstance*) VkInstance instance, const VkWin32SurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateWin32SurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateWin32SurfaceKHR");
        try { return (int) Handles.MH_vkCreateWin32SurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateWin32SurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateWin32SurfaceKHR", e); }
    }

    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex);
    /// ```
    public static int vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceWin32PresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceWin32PresentationSupportKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR, physicalDevice.segment(), queueFamilyIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceWin32PresentationSupportKHR", e); }
    }

}
