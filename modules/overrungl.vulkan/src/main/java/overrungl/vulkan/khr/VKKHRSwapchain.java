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
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 0x00000002;
    private final Handles handles;
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
        public final MemorySegment PFN_vkCreateSwapchainKHR;
        public final MemorySegment PFN_vkDestroySwapchainKHR;
        public final MemorySegment PFN_vkGetSwapchainImagesKHR;
        public final MemorySegment PFN_vkAcquireNextImageKHR;
        public final MemorySegment PFN_vkQueuePresentKHR;
        public final MemorySegment PFN_vkGetDeviceGroupPresentCapabilitiesKHR;
        public final MemorySegment PFN_vkGetDeviceGroupSurfacePresentModesKHR;
        public final MemorySegment PFN_vkGetPhysicalDevicePresentRectanglesKHR;
        public final MemorySegment PFN_vkAcquireNextImage2KHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
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
    }

    public VKKHRSwapchain(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateSwapchainKHR(VkDevice device, const VkSwapchainCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSwapchainKHR* pSwapchain);
    /// ```
    public int CreateSwapchainKHR(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSwapchain) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateSwapchainKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateSwapchainKHR");
        try { return (int) Handles.MH_vkCreateSwapchainKHR.invokeExact(handles.PFN_vkCreateSwapchainKHR, device, pCreateInfo, pAllocator, pSwapchain); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSwapchainKHR", e); }
    }

    /// ```
    /// void vkDestroySwapchainKHR(VkDevice device, VkSwapchainKHR swapchain, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroySwapchainKHR(MemorySegment device, long swapchain, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroySwapchainKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroySwapchainKHR");
        try { Handles.MH_vkDestroySwapchainKHR.invokeExact(handles.PFN_vkDestroySwapchainKHR, device, swapchain, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroySwapchainKHR", e); }
    }

    /// ```
    /// VkResult vkGetSwapchainImagesKHR(VkDevice device, VkSwapchainKHR swapchain, uint32_t* pSwapchainImageCount, VkImage* pSwapchainImages);
    /// ```
    public int GetSwapchainImagesKHR(MemorySegment device, long swapchain, MemorySegment pSwapchainImageCount, MemorySegment pSwapchainImages) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetSwapchainImagesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSwapchainImagesKHR");
        try { return (int) Handles.MH_vkGetSwapchainImagesKHR.invokeExact(handles.PFN_vkGetSwapchainImagesKHR, device, swapchain, pSwapchainImageCount, pSwapchainImages); }
        catch (Throwable e) { throw new RuntimeException("error in GetSwapchainImagesKHR", e); }
    }

    /// ```
    /// VkResult vkAcquireNextImageKHR(VkDevice device, VkSwapchainKHR swapchain, uint64_t timeout, VkSemaphore semaphore, VkFence fence, uint32_t* pImageIndex);
    /// ```
    public int AcquireNextImageKHR(MemorySegment device, long swapchain, long timeout, long semaphore, long fence, MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAcquireNextImageKHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireNextImageKHR");
        try { return (int) Handles.MH_vkAcquireNextImageKHR.invokeExact(handles.PFN_vkAcquireNextImageKHR, device, swapchain, timeout, semaphore, fence, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in AcquireNextImageKHR", e); }
    }

    /// ```
    /// VkResult vkQueuePresentKHR(VkQueue queue, const VkPresentInfoKHR* pPresentInfo);
    /// ```
    public int QueuePresentKHR(MemorySegment queue, MemorySegment pPresentInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueuePresentKHR)) throw new SymbolNotFoundError("Symbol not found: vkQueuePresentKHR");
        try { return (int) Handles.MH_vkQueuePresentKHR.invokeExact(handles.PFN_vkQueuePresentKHR, queue, pPresentInfo); }
        catch (Throwable e) { throw new RuntimeException("error in QueuePresentKHR", e); }
    }

    /// ```
    /// VkResult vkGetDeviceGroupPresentCapabilitiesKHR(VkDevice device, VkDeviceGroupPresentCapabilitiesKHR* pDeviceGroupPresentCapabilities);
    /// ```
    public int GetDeviceGroupPresentCapabilitiesKHR(MemorySegment device, MemorySegment pDeviceGroupPresentCapabilities) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceGroupPresentCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPresentCapabilitiesKHR");
        try { return (int) Handles.MH_vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(handles.PFN_vkGetDeviceGroupPresentCapabilitiesKHR, device, pDeviceGroupPresentCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceGroupPresentCapabilitiesKHR", e); }
    }

    /// ```
    /// VkResult vkGetDeviceGroupSurfacePresentModesKHR(VkDevice device, VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR* pModes);
    /// ```
    public int GetDeviceGroupSurfacePresentModesKHR(MemorySegment device, long surface, MemorySegment pModes) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceGroupSurfacePresentModesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModesKHR");
        try { return (int) Handles.MH_vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(handles.PFN_vkGetDeviceGroupSurfacePresentModesKHR, device, surface, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceGroupSurfacePresentModesKHR", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDevicePresentRectanglesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, uint32_t* pRectCount, VkRect2D* pRects);
    /// ```
    public int GetPhysicalDevicePresentRectanglesKHR(MemorySegment physicalDevice, long surface, MemorySegment pRectCount, MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDevicePresentRectanglesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDevicePresentRectanglesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(handles.PFN_vkGetPhysicalDevicePresentRectanglesKHR, physicalDevice, surface, pRectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDevicePresentRectanglesKHR", e); }
    }

    /// ```
    /// VkResult vkAcquireNextImage2KHR(VkDevice device, const VkAcquireNextImageInfoKHR* pAcquireInfo, uint32_t* pImageIndex);
    /// ```
    public int AcquireNextImage2KHR(MemorySegment device, MemorySegment pAcquireInfo, MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAcquireNextImage2KHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireNextImage2KHR");
        try { return (int) Handles.MH_vkAcquireNextImage2KHR.invokeExact(handles.PFN_vkAcquireNextImage2KHR, device, pAcquireInfo, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in AcquireNextImage2KHR", e); }
    }

}
