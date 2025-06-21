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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVOpticalFlow {
    public static final int VK_OPTICAL_FLOW_USAGE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_USAGE_INPUT_BIT_NV = 0x00000001;
    public static final int VK_OPTICAL_FLOW_USAGE_OUTPUT_BIT_NV = 0x00000002;
    public static final int VK_OPTICAL_FLOW_USAGE_HINT_BIT_NV = 0x00000004;
    public static final int VK_OPTICAL_FLOW_USAGE_COST_BIT_NV = 0x00000008;
    public static final int VK_OPTICAL_FLOW_USAGE_GLOBAL_FLOW_BIT_NV = 0x00000010;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_1X1_BIT_NV = 0x00000001;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_2X2_BIT_NV = 0x00000002;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_4X4_BIT_NV = 0x00000004;
    public static final int VK_OPTICAL_FLOW_GRID_SIZE_8X8_BIT_NV = 0x00000008;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_SLOW_NV = 1;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_MEDIUM_NV = 2;
    public static final int VK_OPTICAL_FLOW_PERFORMANCE_LEVEL_FAST_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_UNKNOWN_NV = 0;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_INPUT_NV = 1;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_REFERENCE_NV = 2;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_HINT_NV = 3;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_FLOW_VECTOR_NV = 4;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_FLOW_VECTOR_NV = 5;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_COST_NV = 6;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_BACKWARD_COST_NV = 7;
    public static final int VK_OPTICAL_FLOW_SESSION_BINDING_POINT_GLOBAL_FLOW_NV = 8;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_HINT_BIT_NV = 0x00000001;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_COST_BIT_NV = 0x00000002;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ENABLE_GLOBAL_FLOW_BIT_NV = 0x00000004;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_ALLOW_REGIONS_BIT_NV = 0x00000008;
    public static final int VK_OPTICAL_FLOW_SESSION_CREATE_BOTH_DIRECTIONS_BIT_NV = 0x00000010;
    public static final int VK_OPTICAL_FLOW_EXECUTE_DISABLE_TEMPORAL_HINTS_BIT_NV = 0x00000001;
    public static final int VK_NV_OPTICAL_FLOW_SPEC_VERSION = 1;
    public static final String VK_NV_OPTICAL_FLOW_EXTENSION_NAME = "VK_NV_optical_flow";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV = 1000464000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV = 1000464001;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV = 1000464002;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV = 1000464003;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV = 1000464004;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV = 1000464005;
    public static final int VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV = 1000464010;
    public static final int VK_FORMAT_R16G16_SFIXED5_NV = 1000464000;
    public static final int VK_FORMAT_R16G16_S10_5_NV = 1000464000;
    public static final int VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV = 1000464000;
    public static final int VK_QUEUE_OPTICAL_FLOW_BIT_NV = 0x00000100;
    public static final long VK_PIPELINE_STAGE_2_OPTICAL_FLOW_BIT_NV = 0x20000000L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_READ_BIT_NV = 0x40000000000L;
    public static final long VK_ACCESS_2_OPTICAL_FLOW_WRITE_BIT_NV = 0x80000000000L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_IMAGE_BIT_NV = 0x10000000000L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_VECTOR_BIT_NV = 0x20000000000L;
    public static final long VK_FORMAT_FEATURE_2_OPTICAL_FLOW_COST_BIT_NV = 0x40000000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceOpticalFlowImageFormatsNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateOpticalFlowSessionNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyOpticalFlowSessionNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindOpticalFlowSessionImageNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdOpticalFlowExecuteNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVOpticalFlow() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceOpticalFlowImageFormatsNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkOpticalFlowImageFormatInfoNV* pOpticalFlowImageFormatInfo, uint32_t* pFormatCount, VkOpticalFlowImageFormatPropertiesNV* pImageFormatProperties);
    /// ```
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(VkPhysicalDevice physicalDevice, MemorySegment pOpticalFlowImageFormatInfo, MemorySegment pFormatCount, MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceOpticalFlowImageFormatsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceOpticalFlowImageFormatsNV");
        try { return (int) Handles.MH_vkGetPhysicalDeviceOpticalFlowImageFormatsNV.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceOpticalFlowImageFormatsNV, physicalDevice.segment(), pOpticalFlowImageFormatInfo, pFormatCount, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceOpticalFlowImageFormatsNV", e); }
    }

    /// ```
    /// (int) VkResult vkCreateOpticalFlowSessionNV((struct VkDevice*) VkDevice device, const VkOpticalFlowSessionCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkOpticalFlowSessionNV* pSession);
    /// ```
    public static int vkCreateOpticalFlowSessionNV(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSession) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateOpticalFlowSessionNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateOpticalFlowSessionNV");
        try { return (int) Handles.MH_vkCreateOpticalFlowSessionNV.invokeExact(device.capabilities().PFN_vkCreateOpticalFlowSessionNV, device.segment(), pCreateInfo, pAllocator, pSession); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateOpticalFlowSessionNV", e); }
    }

    /// ```
    /// void vkDestroyOpticalFlowSessionNV((struct VkDevice*) VkDevice device, (uint64_t) VkOpticalFlowSessionNV session, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyOpticalFlowSessionNV(VkDevice device, long session, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyOpticalFlowSessionNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyOpticalFlowSessionNV");
        try { Handles.MH_vkDestroyOpticalFlowSessionNV.invokeExact(device.capabilities().PFN_vkDestroyOpticalFlowSessionNV, device.segment(), session, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyOpticalFlowSessionNV", e); }
    }

    /// ```
    /// (int) VkResult vkBindOpticalFlowSessionImageNV((struct VkDevice*) VkDevice device, (uint64_t) VkOpticalFlowSessionNV session, (int) VkOpticalFlowSessionBindingPointNV bindingPoint, (uint64_t) VkImageView view, (int) VkImageLayout layout);
    /// ```
    public static int vkBindOpticalFlowSessionImageNV(VkDevice device, long session, int bindingPoint, long view, int layout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindOpticalFlowSessionImageNV)) throw new VKSymbolNotFoundError("Symbol not found: vkBindOpticalFlowSessionImageNV");
        try { return (int) Handles.MH_vkBindOpticalFlowSessionImageNV.invokeExact(device.capabilities().PFN_vkBindOpticalFlowSessionImageNV, device.segment(), session, bindingPoint, view, layout); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindOpticalFlowSessionImageNV", e); }
    }

    /// ```
    /// void vkCmdOpticalFlowExecuteNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkOpticalFlowSessionNV session, const VkOpticalFlowExecuteInfoNV* pExecuteInfo);
    /// ```
    public static void vkCmdOpticalFlowExecuteNV(VkCommandBuffer commandBuffer, long session, MemorySegment pExecuteInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdOpticalFlowExecuteNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdOpticalFlowExecuteNV");
        try { Handles.MH_vkCmdOpticalFlowExecuteNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdOpticalFlowExecuteNV, commandBuffer.segment(), session, pExecuteInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdOpticalFlowExecuteNV", e); }
    }

}
