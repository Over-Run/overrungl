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
public class VKKHRPushDescriptor {
    public static final int VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;
    public static final String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR = 1000080000;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = 0x00000001;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdPushDescriptorSetKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCmdPushDescriptorSetKHR;
        public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplateKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdPushDescriptorSetKHR = func.invoke(device, "vkCmdPushDescriptorSetKHR", "vkCmdPushDescriptorSet");
            PFN_vkCmdPushDescriptorSetWithTemplateKHR = func.invoke(device, "vkCmdPushDescriptorSetWithTemplateKHR", "vkCmdPushDescriptorSetWithTemplate");
        }
    }

    public VKKHRPushDescriptor(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdPushDescriptorSetKHR(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites);
    /// ```
    public void CmdPushDescriptorSetKHR(MemorySegment commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, MemorySegment pDescriptorWrites) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushDescriptorSetKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetKHR");
        try { Handles.MH_vkCmdPushDescriptorSetKHR.invokeExact(handles.PFN_vkCmdPushDescriptorSetKHR, commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushDescriptorSetKHR", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplateKHR(VkCommandBuffer commandBuffer, VkDescriptorUpdateTemplate descriptorUpdateTemplate, VkPipelineLayout layout, uint32_t set, const void* pData);
    /// ```
    public void CmdPushDescriptorSetWithTemplateKHR(MemorySegment commandBuffer, long descriptorUpdateTemplate, long layout, int set, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPushDescriptorSetWithTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplateKHR");
        try { Handles.MH_vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(handles.PFN_vkCmdPushDescriptorSetWithTemplateKHR, commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPushDescriptorSetWithTemplateKHR", e); }
    }

}
