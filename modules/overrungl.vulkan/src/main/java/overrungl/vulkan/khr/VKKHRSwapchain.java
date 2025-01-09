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
public class VKKHRSwapchain {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x00000008;
    public static final int VK_KHR_SWAPCHAIN_SPEC_VERSION = 70;
    public static final String VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000;
    public static final int VK_STRUCTURE_TYPE_PRESENT_INFO_KHR = 1000001001;
    public static final int VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002;
    public static final int VK_SUBOPTIMAL_KHR = 1000001003;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;
    public static final int VK_OBJECT_TYPE_SWAPCHAIN_KHR = 1000001000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000001007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000001008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000001009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000001010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000001011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000001012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 0x00000002;
    public static final MethodHandle MH_vkCreateSwapchainKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroySwapchainKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetSwapchainImagesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkAcquireNextImageKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkQueuePresentKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceGroupPresentCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDevicePresentRectanglesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkAcquireNextImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateSwapchainKHR;
    public final MemorySegment PFN_vkDestroySwapchainKHR;
    public final MemorySegment PFN_vkGetSwapchainImagesKHR;
    public final MemorySegment PFN_vkAcquireNextImageKHR;
    public final MemorySegment PFN_vkQueuePresentKHR;
    public final MemorySegment PFN_vkGetDeviceGroupPresentCapabilitiesKHR;
    public final MemorySegment PFN_vkGetDeviceGroupSurfacePresentModesKHR;
    public final MemorySegment PFN_vkGetPhysicalDevicePresentRectanglesKHR;
    public final MemorySegment PFN_vkAcquireNextImage2KHR;

    public VKKHRSwapchain(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCreateSwapchainKHR = func.invoke(device, "vkCreateSwapchainKHR");
        PFN_vkDestroySwapchainKHR = func.invoke(device, "vkDestroySwapchainKHR");
        PFN_vkGetSwapchainImagesKHR = func.invoke(device, "vkGetSwapchainImagesKHR");
        PFN_vkAcquireNextImageKHR = func.invoke(device, "vkAcquireNextImageKHR");
        PFN_vkQueuePresentKHR = func.invoke(device, "vkQueuePresentKHR");
        PFN_vkGetDeviceGroupPresentCapabilitiesKHR = func.invoke(device, "vkGetDeviceGroupPresentCapabilitiesKHR");
        PFN_vkGetDeviceGroupSurfacePresentModesKHR = func.invoke(device, "vkGetDeviceGroupSurfacePresentModesKHR");
        PFN_vkGetPhysicalDevicePresentRectanglesKHR = func.invoke(device, "vkGetPhysicalDevicePresentRectanglesKHR");
        PFN_vkAcquireNextImage2KHR = func.invoke(device, "vkAcquireNextImage2KHR");
    }

    public @CType("VkResult") int CreateSwapchainKHR(@CType("VkDevice") MemorySegment device, @CType("const VkSwapchainCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSwapchainKHR *") MemorySegment pSwapchain) {
        if (Unmarshal.isNullPointer(PFN_vkCreateSwapchainKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateSwapchainKHR");
        try { return (int) MH_vkCreateSwapchainKHR.invokeExact(PFN_vkCreateSwapchainKHR, device, pCreateInfo, pAllocator, pSwapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSwapchainKHR", e); }
    }

    public void DestroySwapchainKHR(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroySwapchainKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroySwapchainKHR");
        try { MH_vkDestroySwapchainKHR.invokeExact(PFN_vkDestroySwapchainKHR, device, swapchain, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySwapchainKHR", e); }
    }

    public @CType("VkResult") int GetSwapchainImagesKHR(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("uint32_t *") MemorySegment pSwapchainImageCount, @CType("VkImage *") MemorySegment pSwapchainImages) {
        if (Unmarshal.isNullPointer(PFN_vkGetSwapchainImagesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSwapchainImagesKHR");
        try { return (int) MH_vkGetSwapchainImagesKHR.invokeExact(PFN_vkGetSwapchainImagesKHR, device, swapchain, pSwapchainImageCount, pSwapchainImages); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainImagesKHR", e); }
    }

    public @CType("VkResult") int AcquireNextImageKHR(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("uint64_t") long timeout, @CType("VkSemaphore") MemorySegment semaphore, @CType("VkFence") MemorySegment fence, @CType("uint32_t *") MemorySegment pImageIndex) {
        if (Unmarshal.isNullPointer(PFN_vkAcquireNextImageKHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireNextImageKHR");
        try { return (int) MH_vkAcquireNextImageKHR.invokeExact(PFN_vkAcquireNextImageKHR, device, swapchain, timeout, semaphore, fence, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImageKHR", e); }
    }

    public @CType("VkResult") int QueuePresentKHR(@CType("VkQueue") MemorySegment queue, @CType("const VkPresentInfoKHR *") MemorySegment pPresentInfo) {
        if (Unmarshal.isNullPointer(PFN_vkQueuePresentKHR)) throw new SymbolNotFoundError("Symbol not found: vkQueuePresentKHR");
        try { return (int) MH_vkQueuePresentKHR.invokeExact(PFN_vkQueuePresentKHR, queue, pPresentInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueuePresentKHR", e); }
    }

    public @CType("VkResult") int GetDeviceGroupPresentCapabilitiesKHR(@CType("VkDevice") MemorySegment device, @CType("VkDeviceGroupPresentCapabilitiesKHR *") MemorySegment pDeviceGroupPresentCapabilities) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceGroupPresentCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPresentCapabilitiesKHR");
        try { return (int) MH_vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(PFN_vkGetDeviceGroupPresentCapabilitiesKHR, device, pDeviceGroupPresentCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPresentCapabilitiesKHR", e); }
    }

    public @CType("VkResult") int GetDeviceGroupSurfacePresentModesKHR(@CType("VkDevice") MemorySegment device, @CType("VkSurfaceKHR") MemorySegment surface, @CType("VkDeviceGroupPresentModeFlagsKHR *") MemorySegment pModes) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceGroupSurfacePresentModesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModesKHR");
        try { return (int) MH_vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(PFN_vkGetDeviceGroupSurfacePresentModesKHR, device, surface, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupSurfacePresentModesKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDevicePresentRectanglesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkSurfaceKHR") MemorySegment surface, @CType("uint32_t *") MemorySegment pRectCount, @CType("VkRect2D *") MemorySegment pRects) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDevicePresentRectanglesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDevicePresentRectanglesKHR");
        try { return (int) MH_vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(PFN_vkGetPhysicalDevicePresentRectanglesKHR, physicalDevice, surface, pRectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDevicePresentRectanglesKHR", e); }
    }

    public @CType("VkResult") int AcquireNextImage2KHR(@CType("VkDevice") MemorySegment device, @CType("const VkAcquireNextImageInfoKHR *") MemorySegment pAcquireInfo, @CType("uint32_t *") MemorySegment pImageIndex) {
        if (Unmarshal.isNullPointer(PFN_vkAcquireNextImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireNextImage2KHR");
        try { return (int) MH_vkAcquireNextImage2KHR.invokeExact(PFN_vkAcquireNextImage2KHR, device, pAcquireInfo, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImage2KHR", e); }
    }

}