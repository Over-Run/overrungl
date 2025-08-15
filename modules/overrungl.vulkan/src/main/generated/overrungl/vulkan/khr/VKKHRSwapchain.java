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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_swapchain` - device extension
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
        public static final MethodHandle MH_vkCreateSwapchainKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroySwapchainKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSwapchainImagesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireNextImageKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueuePresentKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupPresentCapabilitiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDevicePresentRectanglesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireNextImage2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRSwapchain() {}

    /// Invokes `vkCreateSwapchainKHR`.
    /// ```
    /// (int) VkResult vkCreateSwapchainKHR((struct VkDevice*) VkDevice device, const VkSwapchainCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSwapchainKHR* pSwapchain);
    /// ```
    public static int vkCreateSwapchainKHR(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pSwapchain) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateSwapchainKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateSwapchainKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateSwapchainKHR", device, pCreateInfo, pAllocator, pSwapchain); }
        return (int) Handles.MH_vkCreateSwapchainKHR.invokeExact(device.capabilities().PFN_vkCreateSwapchainKHR, device.segment(), pCreateInfo, pAllocator, pSwapchain); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateSwapchainKHR", e); }
    }

    /// Invokes `vkDestroySwapchainKHR`.
    /// ```
    /// void vkDestroySwapchainKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroySwapchainKHR(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroySwapchainKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroySwapchainKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroySwapchainKHR", device, swapchain, pAllocator); }
        Handles.MH_vkDestroySwapchainKHR.invokeExact(device.capabilities().PFN_vkDestroySwapchainKHR, device.segment(), swapchain, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySwapchainKHR", e); }
    }

    /// Invokes `vkGetSwapchainImagesKHR`.
    /// ```
    /// (int) VkResult vkGetSwapchainImagesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, uint32_t* pSwapchainImageCount, VkImage* pSwapchainImages);
    /// ```
    public static int vkGetSwapchainImagesKHR(@NonNull VkDevice device, long swapchain, @NonNull MemorySegment pSwapchainImageCount, @NonNull MemorySegment pSwapchainImages) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainImagesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainImagesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSwapchainImagesKHR", device, swapchain, pSwapchainImageCount, pSwapchainImages); }
        return (int) Handles.MH_vkGetSwapchainImagesKHR.invokeExact(device.capabilities().PFN_vkGetSwapchainImagesKHR, device.segment(), swapchain, pSwapchainImageCount, pSwapchainImages); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainImagesKHR", e); }
    }

    /// Invokes `vkAcquireNextImageKHR`.
    /// ```
    /// (int) VkResult vkAcquireNextImageKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, uint64_t timeout, (uint64_t) VkSemaphore semaphore, (uint64_t) VkFence fence, uint32_t* pImageIndex);
    /// ```
    public static int vkAcquireNextImageKHR(@NonNull VkDevice device, long swapchain, long timeout, long semaphore, long fence, @NonNull MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireNextImageKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquireNextImageKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquireNextImageKHR", device, swapchain, timeout, semaphore, fence, pImageIndex); }
        return (int) Handles.MH_vkAcquireNextImageKHR.invokeExact(device.capabilities().PFN_vkAcquireNextImageKHR, device.segment(), swapchain, timeout, semaphore, fence, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImageKHR", e); }
    }

    /// Invokes `vkQueuePresentKHR`.
    /// ```
    /// (int) VkResult vkQueuePresentKHR((struct VkQueue*) VkQueue queue, const VkPresentInfoKHR* pPresentInfo);
    /// ```
    public static int vkQueuePresentKHR(@NonNull VkQueue queue, @NonNull MemorySegment pPresentInfo) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueuePresentKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkQueuePresentKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueuePresentKHR", queue, pPresentInfo); }
        return (int) Handles.MH_vkQueuePresentKHR.invokeExact(queue.capabilities().PFN_vkQueuePresentKHR, queue.segment(), pPresentInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueuePresentKHR", e); }
    }

    /// Invokes `vkGetDeviceGroupPresentCapabilitiesKHR`.
    /// ```
    /// (int) VkResult vkGetDeviceGroupPresentCapabilitiesKHR((struct VkDevice*) VkDevice device, VkDeviceGroupPresentCapabilitiesKHR* pDeviceGroupPresentCapabilities);
    /// ```
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(@NonNull VkDevice device, @NonNull MemorySegment pDeviceGroupPresentCapabilities) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupPresentCapabilitiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceGroupPresentCapabilitiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceGroupPresentCapabilitiesKHR", device, pDeviceGroupPresentCapabilities); }
        return (int) Handles.MH_vkGetDeviceGroupPresentCapabilitiesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupPresentCapabilitiesKHR, device.segment(), pDeviceGroupPresentCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPresentCapabilitiesKHR", e); }
    }

    /// Invokes `vkGetDeviceGroupSurfacePresentModesKHR`.
    /// ```
    /// (int) VkResult vkGetDeviceGroupSurfacePresentModesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkSurfaceKHR surface, VkDeviceGroupPresentModeFlagsKHR* pModes);
    /// ```
    public static int vkGetDeviceGroupSurfacePresentModesKHR(@NonNull VkDevice device, long surface, @NonNull MemorySegment pModes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceGroupSurfacePresentModesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceGroupSurfacePresentModesKHR", device, surface, pModes); }
        return (int) Handles.MH_vkGetDeviceGroupSurfacePresentModesKHR.invokeExact(device.capabilities().PFN_vkGetDeviceGroupSurfacePresentModesKHR, device.segment(), surface, pModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupSurfacePresentModesKHR", e); }
    }

    /// Invokes `vkGetPhysicalDevicePresentRectanglesKHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDevicePresentRectanglesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkSurfaceKHR surface, uint32_t* pRectCount, VkRect2D* pRects);
    /// ```
    public static int vkGetPhysicalDevicePresentRectanglesKHR(@NonNull VkPhysicalDevice physicalDevice, long surface, @NonNull MemorySegment pRectCount, @NonNull MemorySegment pRects) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDevicePresentRectanglesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDevicePresentRectanglesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDevicePresentRectanglesKHR", physicalDevice, surface, pRectCount, pRects); }
        return (int) Handles.MH_vkGetPhysicalDevicePresentRectanglesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDevicePresentRectanglesKHR, physicalDevice.segment(), surface, pRectCount, pRects); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDevicePresentRectanglesKHR", e); }
    }

    /// Invokes `vkAcquireNextImage2KHR`.
    /// ```
    /// (int) VkResult vkAcquireNextImage2KHR((struct VkDevice*) VkDevice device, const VkAcquireNextImageInfoKHR* pAcquireInfo, uint32_t* pImageIndex);
    /// ```
    public static int vkAcquireNextImage2KHR(@NonNull VkDevice device, @NonNull MemorySegment pAcquireInfo, @NonNull MemorySegment pImageIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkAcquireNextImage2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkAcquireNextImage2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkAcquireNextImage2KHR", device, pAcquireInfo, pImageIndex); }
        return (int) Handles.MH_vkAcquireNextImage2KHR.invokeExact(device.capabilities().PFN_vkAcquireNextImage2KHR, device.segment(), pAcquireInfo, pImageIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireNextImage2KHR", e); }
    }

}
