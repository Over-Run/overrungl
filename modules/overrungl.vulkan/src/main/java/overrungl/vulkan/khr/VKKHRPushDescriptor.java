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
public class VKKHRPushDescriptor {
    public static final int VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;
    public static final String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS;
    public static final MethodHandle MH_vkCmdPushDescriptorSetKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCmdPushDescriptorSetKHR;
    public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplateKHR;

    public VKKHRPushDescriptor(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdPushDescriptorSetKHR = func.invoke(device, "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSet");
        PFN_vkCmdPushDescriptorSetWithTemplateKHR = func.invoke(device, "vkCmdPushDescriptorSetWithTemplateKHR", "vkCmdPushDescriptorSetWithTemplate");
    }

    public void CmdPushDescriptorSetKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int set, @CType("uint32_t") int descriptorWriteCount, @CType("const VkWriteDescriptorSet *") MemorySegment pDescriptorWrites) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushDescriptorSetKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetKHR");
        try { MH_vkCmdPushDescriptorSetKHR.invokeExact(PFN_vkCmdPushDescriptorSetKHR, commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetKHR", e); }
    }

    public void CmdPushDescriptorSetWithTemplateKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDescriptorUpdateTemplate") MemorySegment descriptorUpdateTemplate, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int set, @CType("const void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushDescriptorSetWithTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplateKHR");
        try { MH_vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(PFN_vkCmdPushDescriptorSetWithTemplateKHR, commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplateKHR", e); }
    }

}
