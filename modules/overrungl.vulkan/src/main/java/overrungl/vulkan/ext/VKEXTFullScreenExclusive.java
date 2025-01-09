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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTFullScreenExclusive {
    public static final int VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT = 0;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT = 1;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT = 2;
    public static final int VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT = 3;
    public static final int VK_EXT_FULL_SCREEN_EXCLUSIVE_SPEC_VERSION = 4;
    public static final String VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME = "VK_EXT_full_screen_exclusive";
    public static final int VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT = 1000255000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT = 1000255002;
    public static final int VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT = -1000255000;
    public static final int VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT = 1000255001;
    public static final MethodHandle MH_vkGetPhysicalDeviceSurfacePresentModes2EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkAcquireFullScreenExclusiveModeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkReleaseFullScreenExclusiveModeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModes2EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT;
    public final MemorySegment PFN_vkAcquireFullScreenExclusiveModeEXT;
    public final MemorySegment PFN_vkReleaseFullScreenExclusiveModeEXT;
    public final MemorySegment PFN_vkGetDeviceGroupSurfacePresentModes2EXT;

    public VKEXTFullScreenExclusive(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT = func.invoke(device, "vkGetPhysicalDeviceSurfacePresentModes2EXT");
        PFN_vkAcquireFullScreenExclusiveModeEXT = func.invoke(device, "vkAcquireFullScreenExclusiveModeEXT");
        PFN_vkReleaseFullScreenExclusiveModeEXT = func.invoke(device, "vkReleaseFullScreenExclusiveModeEXT");
        PFN_vkGetDeviceGroupSurfacePresentModes2EXT = func.invoke(device, "vkGetDeviceGroupSurfacePresentModes2EXT");
    }

    public @CType("VkResult") int GetPhysicalDeviceSurfacePresentModes2EXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceSurfaceInfo2KHR *") MemorySegment pSurfaceInfo, @CType("uint32_t *") MemorySegment pPresentModeCount, @CType("VkPresentModeKHR *") MemorySegment pPresentModes) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfacePresentModes2EXT");
        try { return (int) MH_vkGetPhysicalDeviceSurfacePresentModes2EXT.invokeExact(PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT, physicalDevice, pSurfaceInfo, pPresentModeCount, pPresentModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfacePresentModes2EXT", e); }
    }

    public @CType("VkResult") int AcquireFullScreenExclusiveModeEXT(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain) {
        if (Unmarshal.isNullPointer(PFN_vkAcquireFullScreenExclusiveModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkAcquireFullScreenExclusiveModeEXT");
        try { return (int) MH_vkAcquireFullScreenExclusiveModeEXT.invokeExact(PFN_vkAcquireFullScreenExclusiveModeEXT, device, swapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireFullScreenExclusiveModeEXT", e); }
    }

    public @CType("VkResult") int ReleaseFullScreenExclusiveModeEXT(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain) {
        if (Unmarshal.isNullPointer(PFN_vkReleaseFullScreenExclusiveModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkReleaseFullScreenExclusiveModeEXT");
        try { return (int) MH_vkReleaseFullScreenExclusiveModeEXT.invokeExact(PFN_vkReleaseFullScreenExclusiveModeEXT, device, swapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseFullScreenExclusiveModeEXT", e); }
    }

    public @CType("VkResult") int GetDeviceGroupSurfacePresentModes2EXT(@CType("VkDevice") MemorySegment device, @CType("const VkPhysicalDeviceSurfaceInfo2KHR *") MemorySegment pSurfaceInfo, @CType("VkDeviceGroupPresentModeFlagsKHR *") MemorySegment pModes) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceGroupSurfacePresentModes2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModes2EXT");
        try { return (int) MH_vkGetDeviceGroupSurfacePresentModes2EXT.invokeExact(PFN_vkGetDeviceGroupSurfacePresentModes2EXT, device, pSurfaceInfo, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupSurfacePresentModes2EXT", e); }
    }

}