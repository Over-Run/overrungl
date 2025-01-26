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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTDirectfbSurface {
    public static final int VK_EXT_DIRECTFB_SURFACE_SPEC_VERSION = 1;
    public static final String VK_EXT_DIRECTFB_SURFACE_EXTENSION_NAME = "VK_EXT_directfb_surface";
    public static final int VK_STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT = 1000346000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDirectFBSurfaceEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDirectFBPresentationSupportEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateDirectFBSurfaceEXT;
        public final MemorySegment PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateDirectFBSurfaceEXT = func.invoke(instance, "vkCreateDirectFBSurfaceEXT");
            PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT = func.invoke(instance, "vkGetPhysicalDeviceDirectFBPresentationSupportEXT");
        }
    }

    public VKEXTDirectfbSurface(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkCreateDirectFBSurfaceEXT(VkInstance instance, const VkDirectFBSurfaceCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public int CreateDirectFBSurfaceEXT(MemorySegment instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDirectFBSurfaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateDirectFBSurfaceEXT");
        try { return (int) Handles.MH_vkCreateDirectFBSurfaceEXT.invokeExact(handles.PFN_vkCreateDirectFBSurfaceEXT, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDirectFBSurfaceEXT", e); }
    }

    /// ```
    /// VkBool32 vkGetPhysicalDeviceDirectFBPresentationSupportEXT(VkPhysicalDevice physicalDevice, uint32_t queueFamilyIndex, IDirectFB* dfb);
    /// ```
    public int GetPhysicalDeviceDirectFBPresentationSupportEXT(MemorySegment physicalDevice, int queueFamilyIndex, MemorySegment dfb) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDirectFBPresentationSupportEXT");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDirectFBPresentationSupportEXT.invokeExact(handles.PFN_vkGetPhysicalDeviceDirectFBPresentationSupportEXT, physicalDevice, queueFamilyIndex, dfb); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceDirectFBPresentationSupportEXT", e); }
    }

}
