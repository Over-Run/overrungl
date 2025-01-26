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
public class VKKHRDescriptorUpdateTemplate {
    public static final int VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = 1;
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR = 1000085000;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = 1000085000;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = 0;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = 1000011000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDescriptorUpdateTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDescriptorUpdateTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateDescriptorSetWithTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateDescriptorUpdateTemplateKHR;
        public final MemorySegment PFN_vkDestroyDescriptorUpdateTemplateKHR;
        public final MemorySegment PFN_vkUpdateDescriptorSetWithTemplateKHR;
        public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplateKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateDescriptorUpdateTemplateKHR = func.invoke(device, "vkCreateDescriptorUpdateTemplateKHR", "vkCreateDescriptorUpdateTemplate");
            PFN_vkDestroyDescriptorUpdateTemplateKHR = func.invoke(device, "vkDestroyDescriptorUpdateTemplateKHR", "vkDestroyDescriptorUpdateTemplate");
            PFN_vkUpdateDescriptorSetWithTemplateKHR = func.invoke(device, "vkUpdateDescriptorSetWithTemplateKHR", "vkUpdateDescriptorSetWithTemplate");
            PFN_vkCmdPushDescriptorSetWithTemplateKHR = func.invoke(device, "vkCmdPushDescriptorSetWithTemplateKHR", "vkCmdPushDescriptorSetWithTemplate");
        }
    }

    public VKKHRDescriptorUpdateTemplate(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateDescriptorUpdateTemplateKHR(VkDevice device, const VkDescriptorUpdateTemplateCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDescriptorUpdateTemplate* pDescriptorUpdateTemplate);
    /// ```
    public int CreateDescriptorUpdateTemplateKHR(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDescriptorUpdateTemplate) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDescriptorUpdateTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorUpdateTemplateKHR");
        try { return (int) Handles.MH_vkCreateDescriptorUpdateTemplateKHR.invokeExact(handles.PFN_vkCreateDescriptorUpdateTemplateKHR, device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDescriptorUpdateTemplateKHR", e); }
    }

    /// ```
    /// void vkDestroyDescriptorUpdateTemplateKHR(VkDevice device, VkDescriptorUpdateTemplate descriptorUpdateTemplate, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyDescriptorUpdateTemplateKHR(MemorySegment device, long descriptorUpdateTemplate, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyDescriptorUpdateTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorUpdateTemplateKHR");
        try { Handles.MH_vkDestroyDescriptorUpdateTemplateKHR.invokeExact(handles.PFN_vkDestroyDescriptorUpdateTemplateKHR, device, descriptorUpdateTemplate, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyDescriptorUpdateTemplateKHR", e); }
    }

    /// ```
    /// void vkUpdateDescriptorSetWithTemplateKHR(VkDevice device, VkDescriptorSet descriptorSet, VkDescriptorUpdateTemplate descriptorUpdateTemplate, const void* pData);
    /// ```
    public void UpdateDescriptorSetWithTemplateKHR(MemorySegment device, long descriptorSet, long descriptorUpdateTemplate, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUpdateDescriptorSetWithTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSetWithTemplateKHR");
        try { Handles.MH_vkUpdateDescriptorSetWithTemplateKHR.invokeExact(handles.PFN_vkUpdateDescriptorSetWithTemplateKHR, device, descriptorSet, descriptorUpdateTemplate, pData); }
        catch (Throwable e) { throw new RuntimeException("error in UpdateDescriptorSetWithTemplateKHR", e); }
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
