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
public class VKKHRDeviceGroup {
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR = 0x00000001;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR = 0x00000002;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR = 0x00000004;
    public static final int VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR = 0x00000008;
    public static final int VK_KHR_DEVICE_GROUP_SPEC_VERSION = 4;
    public static final String VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";
    public static final int VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO_KHR = 1000060000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_RENDER_PASS_BEGIN_INFO_KHR = 1000060003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_COMMAND_BUFFER_BEGIN_INFO_KHR = 1000060004;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO_KHR = 1000060005;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO_KHR = 1000060006;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR = 0x00000001;
    public static final int VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR = 0x00000002;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR = 0x00000004;
    public static final int VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR = 0x00000008;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR = 0x00000001;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = 0x00000008;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = 0x00000010;
    public static final int VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR = 0x00000004;
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060013;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO_KHR = 1000060014;
    public static final int VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000040;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = 1000060007;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR = 1000060008;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR = 1000060009;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR = 1000060010;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR = 1000060011;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR = 1000060012;
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDeviceGroupPeerMemoryFeaturesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDeviceMaskKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDispatchBaseKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetDeviceGroupPresentCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceGroupSurfacePresentModesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDevicePresentRectanglesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkAcquireNextImage2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR;
        public final MemorySegment PFN_vkCmdSetDeviceMaskKHR;
        public final MemorySegment PFN_vkCmdDispatchBaseKHR;
        public final MemorySegment PFN_vkGetDeviceGroupPresentCapabilitiesKHR;
        public final MemorySegment PFN_vkGetDeviceGroupSurfacePresentModesKHR;
        public final MemorySegment PFN_vkGetPhysicalDevicePresentRectanglesKHR;
        public final MemorySegment PFN_vkAcquireNextImage2KHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR = func.invoke(device, "vkGetDeviceGroupPeerMemoryFeaturesKHR", "vkGetDeviceGroupPeerMemoryFeatures");
            PFN_vkCmdSetDeviceMaskKHR = func.invoke(device, "vkCmdSetDeviceMaskKHR", "vkCmdSetDeviceMask");
            PFN_vkCmdDispatchBaseKHR = func.invoke(device, "vkCmdDispatchBaseKHR", "vkCmdDispatchBase");
            PFN_vkGetDeviceGroupPresentCapabilitiesKHR = func.invoke(device, "vkGetDeviceGroupPresentCapabilitiesKHR");
            PFN_vkGetDeviceGroupSurfacePresentModesKHR = func.invoke(device, "vkGetDeviceGroupSurfacePresentModesKHR");
            PFN_vkGetPhysicalDevicePresentRectanglesKHR = func.invoke(device, "vkGetPhysicalDevicePresentRectanglesKHR");
            PFN_vkAcquireNextImage2KHR = func.invoke(device, "vkAcquireNextImage2KHR");
        }
    }

    public VKKHRDeviceGroup(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkGetDeviceGroupPeerMemoryFeaturesKHR(VkDevice device, uint32_t heapIndex, uint32_t localDeviceIndex, uint32_t remoteDeviceIndex, VkPeerMemoryFeatureFlags* pPeerMemoryFeatures);
    /// ```
    public void GetDeviceGroupPeerMemoryFeaturesKHR(MemorySegment device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, MemorySegment pPeerMemoryFeatures) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceGroupPeerMemoryFeaturesKHR");
        try { Handles.MH_vkGetDeviceGroupPeerMemoryFeaturesKHR.invokeExact(handles.PFN_vkGetDeviceGroupPeerMemoryFeaturesKHR, device, heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceGroupPeerMemoryFeaturesKHR", e); }
    }

    /// ```
    /// void vkCmdSetDeviceMaskKHR(VkCommandBuffer commandBuffer, uint32_t deviceMask);
    /// ```
    public void CmdSetDeviceMaskKHR(MemorySegment commandBuffer, int deviceMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDeviceMaskKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDeviceMaskKHR");
        try { Handles.MH_vkCmdSetDeviceMaskKHR.invokeExact(handles.PFN_vkCmdSetDeviceMaskKHR, commandBuffer, deviceMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDeviceMaskKHR", e); }
    }

    /// ```
    /// void vkCmdDispatchBaseKHR(VkCommandBuffer commandBuffer, uint32_t baseGroupX, uint32_t baseGroupY, uint32_t baseGroupZ, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public void CmdDispatchBaseKHR(MemorySegment commandBuffer, int baseGroupX, int baseGroupY, int baseGroupZ, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDispatchBaseKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchBaseKHR");
        try { Handles.MH_vkCmdDispatchBaseKHR.invokeExact(handles.PFN_vkCmdDispatchBaseKHR, commandBuffer, baseGroupX, baseGroupY, baseGroupZ, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDispatchBaseKHR", e); }
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
