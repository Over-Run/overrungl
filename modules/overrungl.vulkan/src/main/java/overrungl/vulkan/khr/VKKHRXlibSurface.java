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
public final class VKKHRXlibSurface {
    public static final int VK_KHR_XLIB_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_XLIB_SURFACE_EXTENSION_NAME = "VK_KHR_xlib_surface";
    public static final int VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = 1000004000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateXlibSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceXlibPresentationSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, CanonicalTypes.C_LONG));
        private Handles() {}
    }

    private VKKHRXlibSurface() {}

    /// ```
    /// (int) VkResult vkCreateXlibSurfaceKHR((struct VkInstance*) VkInstance instance, const VkXlibSurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateXlibSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateXlibSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateXlibSurfaceKHR");
        try { return (int) Handles.MH_vkCreateXlibSurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateXlibSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateXlibSurfaceKHR", e); }
    }

    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceXlibPresentationSupportKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, Display* dpy, ((unsigned long) XID) VisualID visualID);
    /// ```
    public static int vkGetPhysicalDeviceXlibPresentationSupportKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, MemorySegment dpy, long visualID) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceXlibPresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceXlibPresentationSupportKHR.invoke(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR, physicalDevice.segment(), queueFamilyIndex, dpy, MemoryUtil.narrowingLong(CanonicalTypes.C_LONG, visualID)); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceXlibPresentationSupportKHR", e); }
    }

}
