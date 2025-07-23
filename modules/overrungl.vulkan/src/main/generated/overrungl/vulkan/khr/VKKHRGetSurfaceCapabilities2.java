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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRGetSurfaceCapabilities2 {
    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR = 1000119001;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR = 1000119002;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilities2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceFormats2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRGetSurfaceCapabilities2() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, VkSurfaceCapabilities2KHR* pSurfaceCapabilities);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilities2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceCapabilities2KHR", physicalDevice, pSurfaceInfo, pSurfaceCapabilities); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilities2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR, physicalDevice.segment(), pSurfaceInfo, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceCapabilities2KHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfaceFormats2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, uint32_t* pSurfaceFormatCount, VkSurfaceFormat2KHR* pSurfaceFormats);
    /// ```
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pSurfaceFormatCount, MemorySegment pSurfaceFormats) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceFormats2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceFormats2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceSurfaceFormats2KHR", physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats); }
        return (int) Handles.MH_vkGetPhysicalDeviceSurfaceFormats2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfaceFormats2KHR, physicalDevice.segment(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceFormats2KHR", e); }
    }

}
