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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTDirectfbSurface {
    public static final int VK_EXT_DIRECTFB_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_DIRECTFB_SURFACE_EXTENSION_NAME = "VK_EXT_directfb_surface";
    public static final int VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT = 1000346000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDirectFBSurfaceEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDirectFBPresentationSupportEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDirectfbSurface() {}

    /// ```
    /// (int) VkResult vkCreateDirectFBSurfaceEXT((struct VkInstance*) VkInstance instance, const VkDirectFBSurfaceCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateDirectFBSurfaceEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateDirectFBSurfaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDirectFBSurfaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDirectFBSurfaceEXT", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateDirectFBSurfaceEXT.invokeExact(instance.capabilities().PFN_vkCreateDirectFBSurfaceEXT, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDirectFBSurfaceEXT", e); }
    }

    /// ```
    /// (uint32_t) VkBool32 vkGetPhysicalDeviceDirectFBPresentationSupportEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, IDirectFB* dfb);
    /// ```
    public static int vkGetPhysicalDeviceDirectFBPresentationSupportEXT(VkPhysicalDevice physicalDevice, int queueFamilyIndex, MemorySegment dfb) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDirectFBPresentationSupportEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDirectFBPresentationSupportEXT", physicalDevice, queueFamilyIndex, dfb); }
        return (int) Handles.MH_vkGetPhysicalDeviceDirectFBPresentationSupportEXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT, physicalDevice.segment(), queueFamilyIndex, dfb); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDirectFBPresentationSupportEXT", e); }
    }

}
