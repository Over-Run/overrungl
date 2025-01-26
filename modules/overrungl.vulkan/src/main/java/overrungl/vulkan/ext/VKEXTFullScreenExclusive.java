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
public final class VKEXTFullScreenExclusive {
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
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSurfacePresentModes2EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireFullScreenExclusiveModeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkReleaseFullScreenExclusiveModeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModes2EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTFullScreenExclusive() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSurfacePresentModes2EXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, uint32_t* pPresentModeCount, VkPresentModeKHR* pPresentModes);
    /// ```
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pPresentModeCount, MemorySegment pPresentModes) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfacePresentModes2EXT");
        try { return (int) Handles.MH_vkGetPhysicalDeviceSurfacePresentModes2EXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSurfacePresentModes2EXT, physicalDevice.segment(), pSurfaceInfo, pPresentModeCount, pPresentModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfacePresentModes2EXT", e); }
    }

    /// ```
    /// (int) VkResult vkAcquireFullScreenExclusiveModeEXT((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain);
    /// ```
    public static int vkAcquireFullScreenExclusiveModeEXT(VkDevice device, long swapchain) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireFullScreenExclusiveModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkAcquireFullScreenExclusiveModeEXT");
        try { return (int) Handles.MH_vkAcquireFullScreenExclusiveModeEXT.invokeExact(device.capabilities().PFN_vkAcquireFullScreenExclusiveModeEXT, device.segment(), swapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireFullScreenExclusiveModeEXT", e); }
    }

    /// ```
    /// (int) VkResult vkReleaseFullScreenExclusiveModeEXT((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain);
    /// ```
    public static int vkReleaseFullScreenExclusiveModeEXT(VkDevice device, long swapchain) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkReleaseFullScreenExclusiveModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkReleaseFullScreenExclusiveModeEXT");
        try { return (int) Handles.MH_vkReleaseFullScreenExclusiveModeEXT.invokeExact(device.capabilities().PFN_vkReleaseFullScreenExclusiveModeEXT, device.segment(), swapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseFullScreenExclusiveModeEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetDeviceGroupSurfacePresentModes2EXT((struct VkDevice*) VkDevice device, const VkPhysicalDeviceSurfaceInfo2KHR* pSurfaceInfo, VkDeviceGroupPresentModeFlagsKHR* pModes);
    /// ```
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, MemorySegment pSurfaceInfo, MemorySegment pModes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModes2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModes2EXT");
        try { return (int) Handles.MH_vkGetDeviceGroupSurfacePresentModes2EXT.invokeExact(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModes2EXT, device.segment(), pSurfaceInfo, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupSurfacePresentModes2EXT", e); }
    }

}
