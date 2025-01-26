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
public class VKKHRGetSurfaceCapabilities2 {
    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR = 1000119001;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR = 1000119002;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilities2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceFormats2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceSurfaceFormats2KHR;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR = func.invoke(instance, "vkGetPhysicalDeviceSurfaceCapabilities2KHR");
            PFN_vkGetPhysicalDeviceSurfaceFormats2KHR = func.invoke(instance, "vkGetPhysicalDeviceSurfaceFormats2KHR");
        }
    }

    public VKKHRGetSurfaceCapabilities2(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, VkSurfaceCapabilities2KHR* pSurfaceCapabilities);
    /// ```
    public int GetPhysicalDeviceSurfaceCapabilities2KHR(MemorySegment physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pSurfaceCapabilities) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilities2KHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceSurfaceCapabilities2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceSurfaceCapabilities2KHR, physicalDevice, pSurfaceInfo, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceSurfaceCapabilities2KHR", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, uint32_t* pSurfaceFormatCount, VkSurfaceFormat2KHR* pSurfaceFormats);
    /// ```
    public int GetPhysicalDeviceSurfaceFormats2KHR(MemorySegment physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pSurfaceFormatCount, MemorySegment pSurfaceFormats) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceSurfaceFormats2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceFormats2KHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceSurfaceFormats2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceSurfaceFormats2KHR, physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceSurfaceFormats2KHR", e); }
    }

}
