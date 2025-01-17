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
import java.util.*;
public class VKKHRWin32Surface {
    public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 6;
    public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";
    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateWin32SurfaceKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceWin32PresentationSupportKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCreateWin32SurfaceKHR,
            FD_vkGetPhysicalDeviceWin32PresentationSupportKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateWin32SurfaceKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateWin32SurfaceKHR);
        public static final MethodHandle MH_vkGetPhysicalDeviceWin32PresentationSupportKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceWin32PresentationSupportKHR);
        public final MemorySegment PFN_vkCreateWin32SurfaceKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateWin32SurfaceKHR = func.invoke(instance, "vkCreateWin32SurfaceKHR");
            PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR = func.invoke(instance, "vkGetPhysicalDeviceWin32PresentationSupportKHR");
        }
    }

    public VKKHRWin32Surface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateWin32SurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("const VkWin32SurfaceCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateWin32SurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateWin32SurfaceKHR");
        try { return (int) Handles.MH_vkCreateWin32SurfaceKHR.invokeExact(handles.PFN_vkCreateWin32SurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateWin32SurfaceKHR", e); }
    }

    public @CType("VkBool32") int GetPhysicalDeviceWin32PresentationSupportKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int queueFamilyIndex) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceWin32PresentationSupportKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceWin32PresentationSupportKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR, physicalDevice, queueFamilyIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceWin32PresentationSupportKHR", e); }
    }

}
