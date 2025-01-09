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
import static overrungl.vulkan.VK14.*;
public class VKKHRMaintenance6 {
    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";
    public static final int VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT = 1000545007;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR = VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR = VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR = VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR = VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR = VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO;
    public static final MethodHandle MH_vkCmdBindDescriptorSets2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdPushConstants2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdPushDescriptorSet2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplate2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetDescriptorBufferOffsets2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdBindDescriptorSets2KHR;
    public final MemorySegment PFN_vkCmdPushConstants2KHR;
    public final MemorySegment PFN_vkCmdPushDescriptorSet2KHR;
    public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplate2KHR;
    public final MemorySegment PFN_vkCmdSetDescriptorBufferOffsets2EXT;
    public final MemorySegment PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT;

    public VKKHRMaintenance6(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdBindDescriptorSets2KHR = func.invoke(device, "vkCmdBindDescriptorSets2KHR", "vkCmdBindDescriptorSets2");
        PFN_vkCmdPushConstants2KHR = func.invoke(device, "vkCmdPushConstants2KHR", "vkCmdPushConstants2");
        PFN_vkCmdPushDescriptorSet2KHR = func.invoke(device, "vkCmdPushDescriptorSet2KHR", "vkCmdPushDescriptorSet2");
        PFN_vkCmdPushDescriptorSetWithTemplate2KHR = func.invoke(device, "vkCmdPushDescriptorSetWithTemplate2KHR", "vkCmdPushDescriptorSetWithTemplate2");
        PFN_vkCmdSetDescriptorBufferOffsets2EXT = func.invoke(device, "vkCmdSetDescriptorBufferOffsets2EXT");
        PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = func.invoke(device, "vkCmdBindDescriptorBufferEmbeddedSamplers2EXT");
    }

    public void CmdBindDescriptorSets2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkBindDescriptorSetsInfo *") MemorySegment pBindDescriptorSetsInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindDescriptorSets2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets2KHR");
        try { MH_vkCmdBindDescriptorSets2KHR.invokeExact(PFN_vkCmdBindDescriptorSets2KHR, commandBuffer, pBindDescriptorSetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets2KHR", e); }
    }

    public void CmdPushConstants2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkPushConstantsInfo *") MemorySegment pPushConstantsInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushConstants2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushConstants2KHR");
        try { MH_vkCmdPushConstants2KHR.invokeExact(PFN_vkCmdPushConstants2KHR, commandBuffer, pPushConstantsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants2KHR", e); }
    }

    public void CmdPushDescriptorSet2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkPushDescriptorSetInfo *") MemorySegment pPushDescriptorSetInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushDescriptorSet2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet2KHR");
        try { MH_vkCmdPushDescriptorSet2KHR.invokeExact(PFN_vkCmdPushDescriptorSet2KHR, commandBuffer, pPushDescriptorSetInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet2KHR", e); }
    }

    public void CmdPushDescriptorSetWithTemplate2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkPushDescriptorSetWithTemplateInfo *") MemorySegment pPushDescriptorSetWithTemplateInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushDescriptorSetWithTemplate2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate2KHR");
        try { MH_vkCmdPushDescriptorSetWithTemplate2KHR.invokeExact(PFN_vkCmdPushDescriptorSetWithTemplate2KHR, commandBuffer, pPushDescriptorSetWithTemplateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate2KHR", e); }
    }

    public void CmdSetDescriptorBufferOffsets2EXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkSetDescriptorBufferOffsetsInfoEXT *") MemorySegment pSetDescriptorBufferOffsetsInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDescriptorBufferOffsets2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDescriptorBufferOffsets2EXT");
        try { MH_vkCmdSetDescriptorBufferOffsets2EXT.invokeExact(PFN_vkCmdSetDescriptorBufferOffsets2EXT, commandBuffer, pSetDescriptorBufferOffsetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDescriptorBufferOffsets2EXT", e); }
    }

    public void CmdBindDescriptorBufferEmbeddedSamplers2EXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkBindDescriptorBufferEmbeddedSamplersInfoEXT *") MemorySegment pBindDescriptorBufferEmbeddedSamplersInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBufferEmbeddedSamplers2EXT");
        try { MH_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.invokeExact(PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT, commandBuffer, pBindDescriptorBufferEmbeddedSamplersInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBufferEmbeddedSamplers2EXT", e); }
    }

}
