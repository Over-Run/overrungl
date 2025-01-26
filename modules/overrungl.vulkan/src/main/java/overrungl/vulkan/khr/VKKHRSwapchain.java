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
public final class VKKHRSwapchain {
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
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 0x00000002;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateSwapchainKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySwapchainKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSwapchainImagesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireNextImageKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueuePresentKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupPresentCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDevicePresentRectanglesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireNextImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRSwapchain() {}

    /// ```
    /// (int) VkResult vkCreateSwapchainKHR((struct VkDevice*) VkDevice device, const VkSwapchainCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSwapchainKHR* pSwapchain);
    /// ```
    public static int vkCreateSwapchainKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSwapchain) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSwapchainKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateSwapchainKHR");
        try { return (int) Handles.MH_vkCreateSwapchainKHR.invokeExact(device.capabilities().PFN_vkCreateSwapchainKHR, device.segment(), pCreateInfo, pAllocator, pSwapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSwapchainKHR", e); }
    }

    /// ```
    /// void vkDestroySwapchainKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySwapchainKHR(VkDevice device, long swapchain, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySwapchainKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroySwapchainKHR");
        try { Handles.MH_vkDestroySwapchainKHR.invokeExact(device.capabilities().PFN_vkDestroySwapchainKHR, device.segment(), swapchain, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySwapchainKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetSwapchainImagesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, uint32_t* pSwapchainImageCount, VkImage* pSwapchainImages);
    /// ```
    public static int vkGetSwapchainImagesKHR(VkDevice device, long swapchain, MemorySegment pSwapchainImageCount, MemorySegment pSwapchainImages) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainImagesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSwapchainImagesKHR");
        try { return (int) Handles.MH_vkGetSwapchainImagesKHR.invokeExact(device.capabilities().PFN_vkGetSwapchainImagesKHR, device.segment(), swapchain, pSwapchainImageCount, pSwapchainImages); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainImagesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkAcquireNextImageKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, uint64_t timeout, (uint64_t) VkSemaphore semaphore, (uint64_t) VkFence fence, uint32_t* pImageIndex);
    /// ```
    public static int vkAcquireNextImageKHR(VkDevice device, long swapchain, long timeout, long semaphore, long fence, MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireNextImageKHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireNextImageKHR");
        try { return (int) Handles.MH_vkAcquireNextImageKHR.invokeExact(device.capabilities().PFN_vkAcquireNextImageKHR, device.segment(), swapchain, timeout, semaphore, fence, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImageKHR", e); }
    }

    /// ```
    /// (int) VkResult vkQueuePresentKHR((struct VkQueue*) VkQueue queue, const VkPresentInfoKHR* pPresentInfo);
    /// ```
    public static int vkQueuePresentKHR(VkQueue queue, MemorySegment pPresentInfo) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueuePresentKHR)) throw new SymbolNotFoundError("Symbol not found: vkQueuePresentKHR");
        try { return (int) Handles.MH_vkQueuePresentKHR.invokeExact(queue.capabilities().PFN_vkQueuePresentKHR, queue.segment(), pPresentInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueuePresentKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetDeviceGroupPresentCapabilitiesKHR((struct VkDevice*) VkDevice device, VkDeviceGroupPresentCapabilitiesKHR* pDeviceGroupPresentCapabilities);
    /// ```
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, MemorySegment pDeviceGroupPresentCapabilities) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupPresentCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPresentCapabilitiesKHR");
        try { return (int) Handles.MH_vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupPresentCapabilitiesKHR, device.segment(), pDeviceGroupPresentCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPresentCapabilitiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetDeviceGroupSurfacePresentModesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR* pModes);
    /// ```
    public static int vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, long surface, MemorySegment pModes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModesKHR");
        try { return (int) Handles.MH_vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModesKHR, device.segment(), surface, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupSurfacePresentModesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDevicePresentRectanglesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkSurfaceKHR surface, uint32_t* pRectCount, VkRect2D* pRects);
    /// ```
    public static int vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, long surface, MemorySegment pRectCount, MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDevicePresentRectanglesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDevicePresentRectanglesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDevicePresentRectanglesKHR, physicalDevice.segment(), surface, pRectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDevicePresentRectanglesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkAcquireNextImage2KHR((struct VkDevice*) VkDevice device, const VkAcquireNextImageInfoKHR* pAcquireInfo, uint32_t* pImageIndex);
    /// ```
    public static int vkAcquireNextImage2KHR(VkDevice device, MemorySegment pAcquireInfo, MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireNextImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireNextImage2KHR");
        try { return (int) Handles.MH_vkAcquireNextImage2KHR.invokeExact(device.capabilities().PFN_vkAcquireNextImage2KHR, device.segment(), pAcquireInfo, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImage2KHR", e); }
    }

}
