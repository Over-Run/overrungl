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
package overrungl.vulkan;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
public final class VK14 {
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME = 1024;
    public static final int VK_LINE_RASTERIZATION_MODE_DEFAULT = 0;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR = 1;
    public static final int VK_LINE_RASTERIZATION_MODE_BRESENHAM = 2;
    public static final int VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH = 3;
    public static final long VK_PIPELINE_CREATE_2_DISABLE_OPTIMIZATION_BIT = 0x00000001L;
    public static final long VK_PIPELINE_CREATE_2_ALLOW_DERIVATIVES_BIT = 0x00000002L;
    public static final long VK_PIPELINE_CREATE_2_DERIVATIVE_BIT = 0x00000004L;
    public static final long VK_PIPELINE_CREATE_2_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x00000008L;
    public static final long VK_PIPELINE_CREATE_2_DISPATCH_BASE_BIT = 0x00000010L;
    public static final long VK_PIPELINE_CREATE_2_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT = 0x00000100L;
    public static final long VK_PIPELINE_CREATE_2_EARLY_RETURN_ON_FAILURE_BIT = 0x00000200L;
    public static final long VK_PIPELINE_CREATE_2_NO_PROTECTED_ACCESS_BIT = 0x08000000L;
    public static final long VK_PIPELINE_CREATE_2_PROTECTED_ACCESS_ONLY_BIT = 0x40000000L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT = 0x00000001L;
    public static final long VK_BUFFER_USAGE_2_TRANSFER_DST_BIT = 0x00000002L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT = 0x00000004L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT = 0x00000008L;
    public static final long VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT = 0x00000010L;
    public static final long VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT = 0x00000020L;
    public static final long VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT = 0x00000040L;
    public static final long VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT = 0x00000080L;
    public static final long VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT = 0x00000100L;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2 = 3;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT = 0;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED = 1;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS = 2;
    public static final int VK_PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2 = 3;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY = 0x00000001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_FEATURES = 55;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES = 56;
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO = 1000174000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES = 1000388000;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES = 1000388001;
    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;
    public static final int VK_MAX_GLOBAL_PRIORITY_SIZE = 16;
    public static final int VK_ATTACHMENT_LOAD_OP_NONE = 1000400000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES = 1000416000;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_BIT = 0x00000200;
    public static final int VK_SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT = 0x00000400;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES = 1000528000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EXPECT_ASSUME_FEATURES = 1000544000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO = 1000259001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES = 1000259002;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE = 1000259000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES = 1000525000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO = 1000190001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES = 1000190002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES = 1000265000;
    public static final int VK_INDEX_TYPE_UINT8 = 1000265000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO = 1000271001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_FEATURES = 1000470000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_5_PROPERTIES = 1000470001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_AREA_INFO = 1000470003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_SUBRESOURCE_INFO = 1000470004;
    public static final int VK_FORMAT_A1B5G5R5_UNORM_PACK16 = 1000470000;
    public static final int VK_FORMAT_A8_UNORM = 1000470001;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2 = 1000338002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2 = 1000338003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_FLAGS_2_CREATE_INFO = 1000470005;
    public static final int VK_STRUCTURE_TYPE_BUFFER_USAGE_FLAGS_2_CREATE_INFO = 1000470006;
    public static final long VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT = 0x00020000L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES = 1000080000;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT = 0x00000001;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS = 1;
    public static final int VK_IMAGE_LAYOUT_RENDERING_LOCAL_READ = 1000232000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DYNAMIC_RENDERING_LOCAL_READ_FEATURES = 1000232000;
    public static final int VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_LOCATION_INFO = 1000232001;
    public static final int VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO = 1000232002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO = 1000545006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES = 1000466000;
    public static final int VK_PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT = 0x08000000;
    public static final int VK_PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT = 0x40000000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO = 1000068000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES = 1000068001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES = 1000068002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY = 1000270009;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT = 0x00400000;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT = 0x400000000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetLineStipple = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_vkMapMemory2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory2 = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindIndexBuffer2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetRenderingAreaGranularity = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSubresourceLayout = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSet = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplate = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetRenderingAttachmentLocations = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetRenderingInputAttachmentIndices = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindDescriptorSets2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushConstants2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSet2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplate2 = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyMemoryToImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToMemory = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToImage = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkTransitionImageLayout = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VK14() {}

    /// ```
    /// void vkCmdSetLineStipple((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t lineStippleFactor, uint16_t lineStipplePattern);
    /// ```
    public static void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, int lineStippleFactor, short lineStipplePattern) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineStipple)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStipple");
        try { Handles.MH_vkCmdSetLineStipple.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineStipple, commandBuffer.segment(), lineStippleFactor, lineStipplePattern); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStipple", e); }
    }

    /// ```
    /// (int) VkResult vkMapMemory2((struct VkDevice*) VkDevice device, const VkMemoryMapInfo* pMemoryMapInfo, void** ppData);
    /// ```
    public static int vkMapMemory2(VkDevice device, MemorySegment pMemoryMapInfo, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMapMemory2)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory2");
        try { return (int) Handles.MH_vkMapMemory2.invokeExact(device.capabilities().PFN_vkMapMemory2, device.segment(), pMemoryMapInfo, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory2", e); }
    }

    /// ```
    /// (int) VkResult vkUnmapMemory2((struct VkDevice*) VkDevice device, const VkMemoryUnmapInfo* pMemoryUnmapInfo);
    /// ```
    public static int vkUnmapMemory2(VkDevice device, MemorySegment pMemoryUnmapInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUnmapMemory2)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory2");
        try { return (int) Handles.MH_vkUnmapMemory2.invokeExact(device.capabilities().PFN_vkUnmapMemory2, device.segment(), pMemoryUnmapInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory2", e); }
    }

    /// ```
    /// void vkCmdBindIndexBuffer2((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkDeviceSize size, (int) VkIndexType indexType);
    /// ```
    public static void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, long buffer, long offset, long size, int indexType) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer2");
        try { Handles.MH_vkCmdBindIndexBuffer2.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindIndexBuffer2, commandBuffer.segment(), buffer, offset, size, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindIndexBuffer2", e); }
    }

    /// ```
    /// void vkGetRenderingAreaGranularity((struct VkDevice*) VkDevice device, const VkRenderingAreaInfo* pRenderingAreaInfo, VkExtent2D* pGranularity);
    /// ```
    public static void vkGetRenderingAreaGranularity(VkDevice device, MemorySegment pRenderingAreaInfo, MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRenderingAreaGranularity)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderingAreaGranularity");
        try { Handles.MH_vkGetRenderingAreaGranularity.invokeExact(device.capabilities().PFN_vkGetRenderingAreaGranularity, device.segment(), pRenderingAreaInfo, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRenderingAreaGranularity", e); }
    }

    /// ```
    /// void vkGetDeviceImageSubresourceLayout((struct VkDevice*) VkDevice device, const VkDeviceImageSubresourceInfo* pInfo, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetDeviceImageSubresourceLayout(VkDevice device, MemorySegment pInfo, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageSubresourceLayout)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageSubresourceLayout");
        try { Handles.MH_vkGetDeviceImageSubresourceLayout.invokeExact(device.capabilities().PFN_vkGetDeviceImageSubresourceLayout, device.segment(), pInfo, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSubresourceLayout", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout2((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout2(VkDevice device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout2)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2");
        try { Handles.MH_vkGetImageSubresourceLayout2.invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout2, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSet((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites);
    /// ```
    public static void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, MemorySegment pDescriptorWrites) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet");
        try { Handles.MH_vkCmdPushDescriptorSet.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet, commandBuffer.segment(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, (uint64_t) VkPipelineLayout layout, uint32_t set, const void* pData);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, long descriptorUpdateTemplate, long layout, int set, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate");
        try { Handles.MH_vkCmdPushDescriptorSetWithTemplate.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate, commandBuffer.segment(), descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate", e); }
    }

    /// ```
    /// void vkCmdSetRenderingAttachmentLocations((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderingAttachmentLocationInfo* pLocationInfo);
    /// ```
    public static void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, MemorySegment pLocationInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRenderingAttachmentLocations)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRenderingAttachmentLocations");
        try { Handles.MH_vkCmdSetRenderingAttachmentLocations.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRenderingAttachmentLocations, commandBuffer.segment(), pLocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingAttachmentLocations", e); }
    }

    /// ```
    /// void vkCmdSetRenderingInputAttachmentIndices((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkRenderingInputAttachmentIndexInfo* pInputAttachmentIndexInfo);
    /// ```
    public static void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, MemorySegment pInputAttachmentIndexInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRenderingInputAttachmentIndices)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRenderingInputAttachmentIndices");
        try { Handles.MH_vkCmdSetRenderingInputAttachmentIndices.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRenderingInputAttachmentIndices, commandBuffer.segment(), pInputAttachmentIndexInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRenderingInputAttachmentIndices", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorSets2((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkBindDescriptorSetsInfo* pBindDescriptorSetsInfo);
    /// ```
    public static void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, MemorySegment pBindDescriptorSetsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets2");
        try { Handles.MH_vkCmdBindDescriptorSets2.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2, commandBuffer.segment(), pBindDescriptorSetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets2", e); }
    }

    /// ```
    /// void vkCmdPushConstants2((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushConstantsInfo* pPushConstantsInfo);
    /// ```
    public static void vkCmdPushConstants2(VkCommandBuffer commandBuffer, MemorySegment pPushConstantsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushConstants2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants2");
        try { Handles.MH_vkCmdPushConstants2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushConstants2, commandBuffer.segment(), pPushConstantsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants2", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSet2((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushDescriptorSetInfo* pPushDescriptorSetInfo);
    /// ```
    public static void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, MemorySegment pPushDescriptorSetInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet2");
        try { Handles.MH_vkCmdPushDescriptorSet2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2, commandBuffer.segment(), pPushDescriptorSetInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet2", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate2((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushDescriptorSetWithTemplateInfo* pPushDescriptorSetWithTemplateInfo);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, MemorySegment pPushDescriptorSetWithTemplateInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate2");
        try { Handles.MH_vkCmdPushDescriptorSetWithTemplate2.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2, commandBuffer.segment(), pPushDescriptorSetWithTemplateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate2", e); }
    }

    /// ```
    /// (int) VkResult vkCopyMemoryToImage((struct VkDevice*) VkDevice device, const VkCopyMemoryToImageInfo* pCopyMemoryToImageInfo);
    /// ```
    public static int vkCopyMemoryToImage(VkDevice device, MemorySegment pCopyMemoryToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToImage)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToImage");
        try { return (int) Handles.MH_vkCopyMemoryToImage.invokeExact(device.capabilities().PFN_vkCopyMemoryToImage, device.segment(), pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToImage", e); }
    }

    /// ```
    /// (int) VkResult vkCopyImageToMemory((struct VkDevice*) VkDevice device, const VkCopyImageToMemoryInfo* pCopyImageToMemoryInfo);
    /// ```
    public static int vkCopyImageToMemory(VkDevice device, MemorySegment pCopyImageToMemoryInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToMemory)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToMemory");
        try { return (int) Handles.MH_vkCopyImageToMemory.invokeExact(device.capabilities().PFN_vkCopyImageToMemory, device.segment(), pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToMemory", e); }
    }

    /// ```
    /// (int) VkResult vkCopyImageToImage((struct VkDevice*) VkDevice device, const VkCopyImageToImageInfo* pCopyImageToImageInfo);
    /// ```
    public static int vkCopyImageToImage(VkDevice device, MemorySegment pCopyImageToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToImage)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToImage");
        try { return (int) Handles.MH_vkCopyImageToImage.invokeExact(device.capabilities().PFN_vkCopyImageToImage, device.segment(), pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToImage", e); }
    }

    /// ```
    /// (int) VkResult vkTransitionImageLayout((struct VkDevice*) VkDevice device, uint32_t transitionCount, const VkHostImageLayoutTransitionInfo* pTransitions);
    /// ```
    public static int vkTransitionImageLayout(VkDevice device, int transitionCount, MemorySegment pTransitions) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkTransitionImageLayout)) throw new SymbolNotFoundError("Symbol not found: vkTransitionImageLayout");
        try { return (int) Handles.MH_vkTransitionImageLayout.invokeExact(device.capabilities().PFN_vkTransitionImageLayout, device.segment(), transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in vkTransitionImageLayout", e); }
    }

}
