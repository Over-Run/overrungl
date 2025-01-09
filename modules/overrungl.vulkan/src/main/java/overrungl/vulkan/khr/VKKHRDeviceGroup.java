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
import static overrungl.vulkan.VK11.*;
public class VKKHRDeviceGroup {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x00000008;
    public static final int VK_KHR_DEVICE_GROUP_SPEC_VERSION = 4;
    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR = VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR = VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR = VK_PEER_MEMORY_FEATURE_COPY_DST_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = VK_PIPELINE_CREATE_DISPATCH_BASE;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = VK_DEPENDENCY_DEVICE_GROUP_BIT;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR = VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR = VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT;
    public static final MethodHandle MH_vkGetDeviceGroupPeerMemoryFeaturesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetDeviceMaskKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDispatchBaseKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkGetDeviceGroupPresentCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDevicePresentRectanglesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkAcquireNextImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR;
    public final MemorySegment PFN_vkCmdSetDeviceMaskKHR;
    public final MemorySegment PFN_vkCmdDispatchBaseKHR;
    public final MemorySegment PFN_vkGetDeviceGroupPresentCapabilitiesKHR;
    public final MemorySegment PFN_vkGetDeviceGroupSurfacePresentModesKHR;
    public final MemorySegment PFN_vkGetPhysicalDevicePresentRectanglesKHR;
    public final MemorySegment PFN_vkAcquireNextImage2KHR;

    public VKKHRDeviceGroup(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR = func.invoke(device, "vkGetDeviceGroupPeerMemoryFeaturesKHR", "vkGetDeviceGroupPeerMemoryFeatures");
        PFN_vkCmdSetDeviceMaskKHR = func.invoke(device, "vkCmdSetDeviceMaskKHR", "vkCmdSetDeviceMask");
        PFN_vkCmdDispatchBaseKHR = func.invoke(device, "vkCmdDispatchBaseKHR", "vkCmdDispatchBase");
        PFN_vkGetDeviceGroupPresentCapabilitiesKHR = func.invoke(device, "vkGetDeviceGroupPresentCapabilitiesKHR");
        PFN_vkGetDeviceGroupSurfacePresentModesKHR = func.invoke(device, "vkGetDeviceGroupSurfacePresentModesKHR");
        PFN_vkGetPhysicalDevicePresentRectanglesKHR = func.invoke(device, "vkGetPhysicalDevicePresentRectanglesKHR");
        PFN_vkAcquireNextImage2KHR = func.invoke(device, "vkAcquireNextImage2KHR");
    }

    public void GetDeviceGroupPeerMemoryFeaturesKHR(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int heapIndex, @CType("uint32_t") int localDeviceIndex, @CType("uint32_t") int remoteDeviceIndex, @CType("VkPeerMemoryFeatureFlags *") MemorySegment pPeerMemoryFeatures) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPeerMemoryFeaturesKHR");
        try { MH_vkGetDeviceGroupPeerMemoryFeaturesKHR.invokeExact(PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR, device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceGroupPeerMemoryFeaturesKHR", e); }
    }

    public void CmdSetDeviceMaskKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int deviceMask) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDeviceMaskKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDeviceMaskKHR");
        try { MH_vkCmdSetDeviceMaskKHR.invokeExact(PFN_vkCmdSetDeviceMaskKHR, commandBuffer, deviceMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDeviceMaskKHR", e); }
    }

    public void CmdDispatchBaseKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int baseGroupX, @CType("uint32_t") int baseGroupY, @CType("uint32_t") int baseGroupZ, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDispatchBaseKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchBaseKHR");
        try { MH_vkCmdDispatchBaseKHR.invokeExact(PFN_vkCmdDispatchBaseKHR, commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchBaseKHR", e); }
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
