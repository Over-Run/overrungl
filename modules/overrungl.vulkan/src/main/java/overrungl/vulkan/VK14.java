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
public class VK14 extends VK13 {
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
    private final Handles handles;
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
        public final MemorySegment PFN_vkCmdSetLineStipple;
        public final MemorySegment PFN_vkMapMemory2;
        public final MemorySegment PFN_vkUnmapMemory2;
        public final MemorySegment PFN_vkCmdBindIndexBuffer2;
        public final MemorySegment PFN_vkGetRenderingAreaGranularity;
        public final MemorySegment PFN_vkGetDeviceImageSubresourceLayout;
        public final MemorySegment PFN_vkGetImageSubresourceLayout2;
        public final MemorySegment PFN_vkCmdPushDescriptorSet;
        public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplate;
        public final MemorySegment PFN_vkCmdSetRenderingAttachmentLocations;
        public final MemorySegment PFN_vkCmdSetRenderingInputAttachmentIndices;
        public final MemorySegment PFN_vkCmdBindDescriptorSets2;
        public final MemorySegment PFN_vkCmdPushConstants2;
        public final MemorySegment PFN_vkCmdPushDescriptorSet2;
        public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplate2;
        public final MemorySegment PFN_vkCopyMemoryToImage;
        public final MemorySegment PFN_vkCopyImageToMemory;
        public final MemorySegment PFN_vkCopyImageToImage;
        public final MemorySegment PFN_vkTransitionImageLayout;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkCmdSetLineStipple = func.invoke(instance, "vkCmdSetLineStipple", "vkCmdSetLineStippleKHR", "vkCmdSetLineStippleEXT");
            PFN_vkMapMemory2 = func.invoke(instance, "vkMapMemory2", "vkMapMemory2KHR");
            PFN_vkUnmapMemory2 = func.invoke(instance, "vkUnmapMemory2", "vkUnmapMemory2KHR");
            PFN_vkCmdBindIndexBuffer2 = func.invoke(instance, "vkCmdBindIndexBuffer2", "vkCmdBindIndexBuffer2KHR");
            PFN_vkGetRenderingAreaGranularity = func.invoke(instance, "vkGetRenderingAreaGranularity", "vkGetRenderingAreaGranularityKHR");
            PFN_vkGetDeviceImageSubresourceLayout = func.invoke(instance, "vkGetDeviceImageSubresourceLayout", "vkGetDeviceImageSubresourceLayoutKHR");
            PFN_vkGetImageSubresourceLayout2 = func.invoke(instance, "vkGetImageSubresourceLayout2", "vkGetImageSubresourceLayout2KHR", "vkGetImageSubresourceLayout2EXT");
            PFN_vkCmdPushDescriptorSet = func.invoke(instance, "vkCmdPushDescriptorSet", "vkCmdPushDescriptorSetKHR");
            PFN_vkCmdPushDescriptorSetWithTemplate = func.invoke(instance, "vkCmdPushDescriptorSetWithTemplate", "vkCmdPushDescriptorSetWithTemplateKHR");
            PFN_vkCmdSetRenderingAttachmentLocations = func.invoke(instance, "vkCmdSetRenderingAttachmentLocations", "vkCmdSetRenderingAttachmentLocationsKHR");
            PFN_vkCmdSetRenderingInputAttachmentIndices = func.invoke(instance, "vkCmdSetRenderingInputAttachmentIndices", "vkCmdSetRenderingInputAttachmentIndicesKHR");
            PFN_vkCmdBindDescriptorSets2 = func.invoke(instance, "vkCmdBindDescriptorSets2", "vkCmdBindDescriptorSets2KHR");
            PFN_vkCmdPushConstants2 = func.invoke(instance, "vkCmdPushConstants2", "vkCmdPushConstants2KHR");
            PFN_vkCmdPushDescriptorSet2 = func.invoke(instance, "vkCmdPushDescriptorSet2", "vkCmdPushDescriptorSet2KHR");
            PFN_vkCmdPushDescriptorSetWithTemplate2 = func.invoke(instance, "vkCmdPushDescriptorSetWithTemplate2", "vkCmdPushDescriptorSetWithTemplate2KHR");
            PFN_vkCopyMemoryToImage = func.invoke(instance, "vkCopyMemoryToImage", "vkCopyMemoryToImageEXT");
            PFN_vkCopyImageToMemory = func.invoke(instance, "vkCopyImageToMemory", "vkCopyImageToMemoryEXT");
            PFN_vkCopyImageToImage = func.invoke(instance, "vkCopyImageToImage", "vkCopyImageToImageEXT");
            PFN_vkTransitionImageLayout = func.invoke(instance, "vkTransitionImageLayout", "vkTransitionImageLayoutEXT");
        }
    }

    public VK14(MemorySegment instance, VKLoadFunc func) {
        super(instance, func);
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// void vkCmdSetLineStipple(VkCommandBuffer commandBuffer, uint32_t lineStippleFactor, uint16_t lineStipplePattern);
    /// ```
    public void CmdSetLineStipple(MemorySegment commandBuffer, int lineStippleFactor, short lineStipplePattern) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLineStipple)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStipple");
        try { Handles.MH_vkCmdSetLineStipple.invokeExact(handles.PFN_vkCmdSetLineStipple, commandBuffer, lineStippleFactor, lineStipplePattern); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLineStipple", e); }
    }

    /// ```
    /// VkResult vkMapMemory2(VkDevice device, const VkMemoryMapInfo* pMemoryMapInfo, void** ppData);
    /// ```
    public int MapMemory2(MemorySegment device, MemorySegment pMemoryMapInfo, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkMapMemory2)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory2");
        try { return (int) Handles.MH_vkMapMemory2.invokeExact(handles.PFN_vkMapMemory2, device, pMemoryMapInfo, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in MapMemory2", e); }
    }

    /// ```
    /// VkResult vkUnmapMemory2(VkDevice device, const VkMemoryUnmapInfo* pMemoryUnmapInfo);
    /// ```
    public int UnmapMemory2(MemorySegment device, MemorySegment pMemoryUnmapInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUnmapMemory2)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory2");
        try { return (int) Handles.MH_vkUnmapMemory2.invokeExact(handles.PFN_vkUnmapMemory2, device, pMemoryUnmapInfo); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapMemory2", e); }
    }

    /// ```
    /// void vkCmdBindIndexBuffer2(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkDeviceSize size, VkIndexType indexType);
    /// ```
    public void CmdBindIndexBuffer2(MemorySegment commandBuffer, long buffer, long offset, long size, int indexType) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindIndexBuffer2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindIndexBuffer2");
        try { Handles.MH_vkCmdBindIndexBuffer2.invokeExact(handles.PFN_vkCmdBindIndexBuffer2, commandBuffer, buffer, offset, size, indexType); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindIndexBuffer2", e); }
    }

    /// ```
    /// void vkGetRenderingAreaGranularity(VkDevice device, const VkRenderingAreaInfo* pRenderingAreaInfo, VkExtent2D* pGranularity);
    /// ```
    public void GetRenderingAreaGranularity(MemorySegment device, MemorySegment pRenderingAreaInfo, MemorySegment pGranularity) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRenderingAreaGranularity)) throw new SymbolNotFoundError("Symbol not found: vkGetRenderingAreaGranularity");
        try { Handles.MH_vkGetRenderingAreaGranularity.invokeExact(handles.PFN_vkGetRenderingAreaGranularity, device, pRenderingAreaInfo, pGranularity); }
        catch (Throwable e) { throw new RuntimeException("error in GetRenderingAreaGranularity", e); }
    }

    /// ```
    /// void vkGetDeviceImageSubresourceLayout(VkDevice device, const VkDeviceImageSubresourceInfo* pInfo, VkSubresourceLayout2* pLayout);
    /// ```
    public void GetDeviceImageSubresourceLayout(MemorySegment device, MemorySegment pInfo, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceImageSubresourceLayout)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageSubresourceLayout");
        try { Handles.MH_vkGetDeviceImageSubresourceLayout.invokeExact(handles.PFN_vkGetDeviceImageSubresourceLayout, device, pInfo, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceImageSubresourceLayout", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout2(VkDevice device, VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public void GetImageSubresourceLayout2(MemorySegment device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageSubresourceLayout2)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2");
        try { Handles.MH_vkGetImageSubresourceLayout2.invokeExact(handles.PFN_vkGetImageSubresourceLayout2, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageSubresourceLayout2", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSet(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites);
    /// ```
    public void CmdPushDescriptorSet(MemorySegment commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, MemorySegment pDescriptorWrites) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushDescriptorSet)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet");
        try { Handles.MH_vkCmdPushDescriptorSet.invokeExact(handles.PFN_vkCmdPushDescriptorSet, commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushDescriptorSet", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, uint32_t set, const void* pData);
    /// ```
    public void CmdPushDescriptorSetWithTemplate(MemorySegment commandBuffer, long descriptorUpdateTemplate, long layout, int set, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushDescriptorSetWithTemplate)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate");
        try { Handles.MH_vkCmdPushDescriptorSetWithTemplate.invokeExact(handles.PFN_vkCmdPushDescriptorSetWithTemplate, commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushDescriptorSetWithTemplate", e); }
    }

    /// ```
    /// void vkCmdSetRenderingAttachmentLocations(VkCommandBuffer commandBuffer, const VkRenderingAttachmentLocationInfo* pLocationInfo);
    /// ```
    public void CmdSetRenderingAttachmentLocations(MemorySegment commandBuffer, MemorySegment pLocationInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRenderingAttachmentLocations)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRenderingAttachmentLocations");
        try { Handles.MH_vkCmdSetRenderingAttachmentLocations.invokeExact(handles.PFN_vkCmdSetRenderingAttachmentLocations, commandBuffer, pLocationInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRenderingAttachmentLocations", e); }
    }

    /// ```
    /// void vkCmdSetRenderingInputAttachmentIndices(VkCommandBuffer commandBuffer, const VkRenderingInputAttachmentIndexInfo* pInputAttachmentIndexInfo);
    /// ```
    public void CmdSetRenderingInputAttachmentIndices(MemorySegment commandBuffer, MemorySegment pInputAttachmentIndexInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRenderingInputAttachmentIndices)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRenderingInputAttachmentIndices");
        try { Handles.MH_vkCmdSetRenderingInputAttachmentIndices.invokeExact(handles.PFN_vkCmdSetRenderingInputAttachmentIndices, commandBuffer, pInputAttachmentIndexInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRenderingInputAttachmentIndices", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorSets2(VkCommandBuffer commandBuffer, const VkBindDescriptorSetsInfo* pBindDescriptorSetsInfo);
    /// ```
    public void CmdBindDescriptorSets2(MemorySegment commandBuffer, MemorySegment pBindDescriptorSetsInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindDescriptorSets2)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets2");
        try { Handles.MH_vkCmdBindDescriptorSets2.invokeExact(handles.PFN_vkCmdBindDescriptorSets2, commandBuffer, pBindDescriptorSetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindDescriptorSets2", e); }
    }

    /// ```
    /// void vkCmdPushConstants2(VkCommandBuffer commandBuffer, const VkPushConstantsInfo* pPushConstantsInfo);
    /// ```
    public void CmdPushConstants2(MemorySegment commandBuffer, MemorySegment pPushConstantsInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushConstants2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants2");
        try { Handles.MH_vkCmdPushConstants2.invokeExact(handles.PFN_vkCmdPushConstants2, commandBuffer, pPushConstantsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushConstants2", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSet2(VkCommandBuffer commandBuffer, const VkPushDescriptorSetInfo* pPushDescriptorSetInfo);
    /// ```
    public void CmdPushDescriptorSet2(MemorySegment commandBuffer, MemorySegment pPushDescriptorSetInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushDescriptorSet2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet2");
        try { Handles.MH_vkCmdPushDescriptorSet2.invokeExact(handles.PFN_vkCmdPushDescriptorSet2, commandBuffer, pPushDescriptorSetInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushDescriptorSet2", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate2(VkCommandBuffer commandBuffer, const VkPushDescriptorSetWithTemplateInfo* pPushDescriptorSetWithTemplateInfo);
    /// ```
    public void CmdPushDescriptorSetWithTemplate2(MemorySegment commandBuffer, MemorySegment pPushDescriptorSetWithTemplateInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushDescriptorSetWithTemplate2)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate2");
        try { Handles.MH_vkCmdPushDescriptorSetWithTemplate2.invokeExact(handles.PFN_vkCmdPushDescriptorSetWithTemplate2, commandBuffer, pPushDescriptorSetWithTemplateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushDescriptorSetWithTemplate2", e); }
    }

    /// ```
    /// VkResult vkCopyMemoryToImage(VkDevice device, const VkCopyMemoryToImageInfo* pCopyMemoryToImageInfo);
    /// ```
    public int CopyMemoryToImage(MemorySegment device, MemorySegment pCopyMemoryToImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyMemoryToImage)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToImage");
        try { return (int) Handles.MH_vkCopyMemoryToImage.invokeExact(handles.PFN_vkCopyMemoryToImage, device, pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMemoryToImage", e); }
    }

    /// ```
    /// VkResult vkCopyImageToMemory(VkDevice device, const VkCopyImageToMemoryInfo* pCopyImageToMemoryInfo);
    /// ```
    public int CopyImageToMemory(MemorySegment device, MemorySegment pCopyImageToMemoryInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyImageToMemory)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToMemory");
        try { return (int) Handles.MH_vkCopyImageToMemory.invokeExact(handles.PFN_vkCopyImageToMemory, device, pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyImageToMemory", e); }
    }

    /// ```
    /// VkResult vkCopyImageToImage(VkDevice device, const VkCopyImageToImageInfo* pCopyImageToImageInfo);
    /// ```
    public int CopyImageToImage(MemorySegment device, MemorySegment pCopyImageToImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyImageToImage)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToImage");
        try { return (int) Handles.MH_vkCopyImageToImage.invokeExact(handles.PFN_vkCopyImageToImage, device, pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyImageToImage", e); }
    }

    /// ```
    /// VkResult vkTransitionImageLayout(VkDevice device, uint32_t transitionCount, const VkHostImageLayoutTransitionInfo* pTransitions);
    /// ```
    public int TransitionImageLayout(MemorySegment device, int transitionCount, MemorySegment pTransitions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkTransitionImageLayout)) throw new SymbolNotFoundError("Symbol not found: vkTransitionImageLayout");
        try { return (int) Handles.MH_vkTransitionImageLayout.invokeExact(handles.PFN_vkTransitionImageLayout, device, transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in TransitionImageLayout", e); }
    }

}
