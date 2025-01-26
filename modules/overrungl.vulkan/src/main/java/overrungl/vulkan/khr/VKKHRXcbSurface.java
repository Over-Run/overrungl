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
public class VKKHRXcbSurface {
    public static final int VK_KHR_XCB_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_XCB_SURFACE_EXTENSION_NAME = "VK_KHR_xcb_surface";
    public static final int VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR = 1000005000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateXcbSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceXcbPresentationSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCreateXcbSurfaceKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateXcbSurfaceKHR = func.invoke(instance, "vkCreateXcbSurfaceKHR");
            PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR = func.invoke(instance, "vkGetPhysicalDeviceXcbPresentationSupportKHR");
        }
    }

    public VKKHRXcbSurface(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkCreateXcbSurfaceKHR(VkInstance instance, const VkXcbSurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public int CreateXcbSurfaceKHR(MemorySegment instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateXcbSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateXcbSurfaceKHR");
        try { return (int) Handles.MH_vkCreateXcbSurfaceKHR.invokeExact(handles.PFN_vkCreateXcbSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in CreateXcbSurfaceKHR", e); }
    }

    /// ```
    /// VkBool32 vkGetPhysicalDeviceXcbPresentationSupportKHR(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, xcb_connection_t* connection, xcb_visualid_t visual_id);
    /// ```
    public int GetPhysicalDeviceXcbPresentationSupportKHR(MemorySegment physicalDevice, int queueFamilyIndex, MemorySegment connection, int visual_id) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceXcbPresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceXcbPresentationSupportKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR, physicalDevice, queueFamilyIndex, connection, visual_id); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceXcbPresentationSupportKHR", e); }
    }

}
