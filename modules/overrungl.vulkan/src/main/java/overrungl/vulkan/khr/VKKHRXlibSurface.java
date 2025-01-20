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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKKHRXlibSurface {
    public static final int VK_KHR_XLIB_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_XLIB_SURFACE_EXTENSION_NAME = "VK_KHR_xlib_surface";
    public static final int VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = 1000004000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateXlibSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceXlibPresentationSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_vkCreateXlibSurfaceKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateXlibSurfaceKHR = func.invoke(instance, "vkCreateXlibSurfaceKHR");
            PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR = func.invoke(instance, "vkGetPhysicalDeviceXlibPresentationSupportKHR");
        }
    }

    public VKKHRXlibSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateXlibSurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("const VkXlibSurfaceCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateXlibSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateXlibSurfaceKHR");
        try { return (int) Handles.MH_vkCreateXlibSurfaceKHR.invokeExact(handles.PFN_vkCreateXlibSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateXlibSurfaceKHR", e); }
    }

    public @CType("VkBool32") int GetPhysicalDeviceXlibPresentationSupportKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int queueFamilyIndex, @CType("Display *") MemorySegment dpy, @CType("VisualID") long visualID) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceXlibPresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceXlibPresentationSupportKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR, physicalDevice, queueFamilyIndex, dpy, visualID); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceXlibPresentationSupportKHR", e); }
    }

}
