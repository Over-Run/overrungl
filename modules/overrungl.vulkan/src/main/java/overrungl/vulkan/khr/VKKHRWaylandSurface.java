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
public class VKKHRWaylandSurface {
    public static final int VK_KHR_WAYLAND_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME = "VK_KHR_wayland_surface";
    public static final int VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR = 1000006000;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateWaylandSurfaceKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceWaylandPresentationSupportKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateWaylandSurfaceKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateWaylandSurfaceKHR);
        public static final MethodHandle MH_vkGetPhysicalDeviceWaylandPresentationSupportKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceWaylandPresentationSupportKHR);
        public final MemorySegment PFN_vkCreateWaylandSurfaceKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateWaylandSurfaceKHR = func.invoke(instance, "vkCreateWaylandSurfaceKHR");
            PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR = func.invoke(instance, "vkGetPhysicalDeviceWaylandPresentationSupportKHR");
        }
    }

    public VKKHRWaylandSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateWaylandSurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("const VkWaylandSurfaceCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateWaylandSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateWaylandSurfaceKHR");
        try { return (int) Handles.MH_vkCreateWaylandSurfaceKHR.invokeExact(handles.PFN_vkCreateWaylandSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateWaylandSurfaceKHR", e); }
    }

    public @CType("VkBool32") int GetPhysicalDeviceWaylandPresentationSupportKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int queueFamilyIndex, @CType("struct wl_display *") MemorySegment display) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceWaylandPresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceWaylandPresentationSupportKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR, physicalDevice, queueFamilyIndex, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceWaylandPresentationSupportKHR", e); }
    }

}
