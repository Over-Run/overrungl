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
package overrungl.vulkan.qnx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKQNXScreenSurface {
    public static final int VK_QNX_SCREEN_SURFACE_SPEC_VERSION = 1;
    public static final String VK_QNX_SCREEN_SURFACE_EXTENSION_NAME = "VK_QNX_screen_surface";
    public static final int VK_STRUCTURE_TYPE_SCREEN_SURFACE_CREATE_INFO_QNX = 1000378000;
    public static final MethodHandle MH_vkCreateScreenSurfaceQNX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceScreenPresentationSupportQNX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateScreenSurfaceQNX;
    public final MemorySegment PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX;

    public VKQNXScreenSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkCreateScreenSurfaceQNX = func.invoke(instance, "vkCreateScreenSurfaceQNX");
        PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX = func.invoke(instance, "vkGetPhysicalDeviceScreenPresentationSupportQNX");
    }

    public @CType("VkResult") int CreateScreenSurfaceQNX(@CType("VkInstance") MemorySegment instance, @CType("const VkScreenSurfaceCreateInfoQNX *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(PFN_vkCreateScreenSurfaceQNX)) throw new SymbolNotFoundError("Symbol not found: vkCreateScreenSurfaceQNX");
        try { return (int) MH_vkCreateScreenSurfaceQNX.invokeExact(PFN_vkCreateScreenSurfaceQNX, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateScreenSurfaceQNX", e); }
    }

    public @CType("VkBool32") int GetPhysicalDeviceScreenPresentationSupportQNX(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int queueFamilyIndex, @CType("struct _screen_window *") MemorySegment window) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceScreenPresentationSupportQNX");
        try { return (int) MH_vkGetPhysicalDeviceScreenPresentationSupportQNX.invokeExact(PFN_vkGetPhysicalDeviceScreenPresentationSupportQNX, physicalDevice, queueFamilyIndex, window); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceScreenPresentationSupportQNX", e); }
    }

}
