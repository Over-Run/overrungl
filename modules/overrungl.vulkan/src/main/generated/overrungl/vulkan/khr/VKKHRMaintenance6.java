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
public final class VKKHRMaintenance6 {
    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR = 1000545006;
    public static final int VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT = 1000545007;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindDescriptorSets2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushConstants2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSet2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplate2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDescriptorBufferOffsets2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRMaintenance6() {}

    /// ```
    /// void vkCmdBindDescriptorSets2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkBindDescriptorSetsInfo* pBindDescriptorSetsInfo);
    /// ```
    public static void vkCmdBindDescriptorSets2KHR(VkCommandBuffer commandBuffer, MemorySegment pBindDescriptorSetsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets2KHR");
        try { Handles.MH_vkCmdBindDescriptorSets2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2KHR, commandBuffer.segment(), pBindDescriptorSetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets2KHR", e); }
    }

    /// ```
    /// void vkCmdPushConstants2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushConstantsInfo* pPushConstantsInfo);
    /// ```
    public static void vkCmdPushConstants2KHR(VkCommandBuffer commandBuffer, MemorySegment pPushConstantsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushConstants2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushConstants2KHR");
        try { Handles.MH_vkCmdPushConstants2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushConstants2KHR, commandBuffer.segment(), pPushConstantsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants2KHR", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSet2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushDescriptorSetInfo* pPushDescriptorSetInfo);
    /// ```
    public static void vkCmdPushDescriptorSet2KHR(VkCommandBuffer commandBuffer, MemorySegment pPushDescriptorSetInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet2KHR");
        try { Handles.MH_vkCmdPushDescriptorSet2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2KHR, commandBuffer.segment(), pPushDescriptorSetInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet2KHR", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushDescriptorSetWithTemplateInfo* pPushDescriptorSetWithTemplateInfo);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplate2KHR(VkCommandBuffer commandBuffer, MemorySegment pPushDescriptorSetWithTemplateInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate2KHR");
        try { Handles.MH_vkCmdPushDescriptorSetWithTemplate2KHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2KHR, commandBuffer.segment(), pPushDescriptorSetWithTemplateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate2KHR", e); }
    }

    /// ```
    /// void vkCmdSetDescriptorBufferOffsets2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSetDescriptorBufferOffsetsInfoEXT* pSetDescriptorBufferOffsetsInfo);
    /// ```
    public static void vkCmdSetDescriptorBufferOffsets2EXT(VkCommandBuffer commandBuffer, MemorySegment pSetDescriptorBufferOffsetsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsets2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDescriptorBufferOffsets2EXT");
        try { Handles.MH_vkCmdSetDescriptorBufferOffsets2EXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsets2EXT, commandBuffer.segment(), pSetDescriptorBufferOffsetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDescriptorBufferOffsets2EXT", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkBindDescriptorBufferEmbeddedSamplersInfoEXT* pBindDescriptorBufferEmbeddedSamplersInfo);
    /// ```
    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(VkCommandBuffer commandBuffer, MemorySegment pBindDescriptorBufferEmbeddedSamplersInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBufferEmbeddedSamplers2EXT");
        try { Handles.MH_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT, commandBuffer.segment(), pBindDescriptorBufferEmbeddedSamplersInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBufferEmbeddedSamplers2EXT", e); }
    }

}
