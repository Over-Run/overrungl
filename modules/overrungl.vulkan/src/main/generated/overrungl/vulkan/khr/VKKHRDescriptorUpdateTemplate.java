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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRDescriptorUpdateTemplate {
    public static final int VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = 1;
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR = 1000085000;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = 1000085000;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = 0;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = 1000011000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDescriptorUpdateTemplateKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorUpdateTemplateKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateDescriptorSetWithTemplateKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplateKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRDescriptorUpdateTemplate() {}

    /// ```
    /// (int) VkResult vkCreateDescriptorUpdateTemplateKHR((struct VkDevice*) VkDevice device, const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorUpdateTemplate* pDescriptorUpdateTemplate);
    /// ```
    public static int vkCreateDescriptorUpdateTemplateKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDescriptorUpdateTemplate) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDescriptorUpdateTemplateKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDescriptorUpdateTemplateKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDescriptorUpdateTemplateKHR", device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate); }
        return (int) Handles.MH_vkCreateDescriptorUpdateTemplateKHR.invokeExact(device.capabilities().PFN_vkCreateDescriptorUpdateTemplateKHR, device.segment(), pCreateInfo, pAllocator, pDescriptorUpdateTemplate); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorUpdateTemplateKHR", e); }
    }

    /// ```
    /// void vkDestroyDescriptorUpdateTemplateKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, long descriptorUpdateTemplate, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDescriptorUpdateTemplateKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDescriptorUpdateTemplateKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDescriptorUpdateTemplateKHR", device, descriptorUpdateTemplate, pAllocator); }
        Handles.MH_vkDestroyDescriptorUpdateTemplateKHR.invokeExact(device.capabilities().PFN_vkDestroyDescriptorUpdateTemplateKHR, device.segment(), descriptorUpdateTemplate, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorUpdateTemplateKHR", e); }
    }

    /// ```
    /// void vkUpdateDescriptorSetWithTemplateKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSet descriptorSet, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, const void* pData);
    /// ```
    public static void vkUpdateDescriptorSetWithTemplateKHR(VkDevice device, long descriptorSet, long descriptorUpdateTemplate, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateDescriptorSetWithTemplateKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkUpdateDescriptorSetWithTemplateKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUpdateDescriptorSetWithTemplateKHR", device, descriptorSet, descriptorUpdateTemplate, pData); }
        Handles.MH_vkUpdateDescriptorSetWithTemplateKHR.invokeExact(device.capabilities().PFN_vkUpdateDescriptorSetWithTemplateKHR, device.segment(), descriptorSet, descriptorUpdateTemplate, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSetWithTemplateKHR", e); }
    }

    /// ```
    /// void vkCmdPushDescriptorSetWithTemplateKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, (uint64_t) VkPipelineLayout layout, uint32_t set, const void* pData);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplateKHR(VkCommandBuffer commandBuffer, long descriptorUpdateTemplate, long layout, int set, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplateKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplateKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSetWithTemplateKHR", commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        Handles.MH_vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplateKHR, commandBuffer.segment(), descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplateKHR", e); }
    }

}
