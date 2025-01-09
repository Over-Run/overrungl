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
import static overrungl.vulkan.VK11.*;
import static overrungl.vulkan.VK14.*;
import static overrungl.vulkan.ext.VKEXTDebugReport.*;
public class VKKHRDescriptorUpdateTemplate {
    public static final int VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION = 1;
    public static final String VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME = "VK_KHR_descriptor_update_template";
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO;
    public static final int VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR = VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR = VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT;
    public static final MethodHandle MH_vkCreateDescriptorUpdateTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyDescriptorUpdateTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkUpdateDescriptorSetWithTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplateKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateDescriptorUpdateTemplateKHR;
    public final MemorySegment PFN_vkDestroyDescriptorUpdateTemplateKHR;
    public final MemorySegment PFN_vkUpdateDescriptorSetWithTemplateKHR;
    public final MemorySegment PFN_vkCmdPushDescriptorSetWithTemplateKHR;

    public VKKHRDescriptorUpdateTemplate(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCreateDescriptorUpdateTemplateKHR = func.invoke(device, "vkCreateDescriptorUpdateTemplateKHR", "vkCreateDescriptorUpdateTemplate");
        PFN_vkDestroyDescriptorUpdateTemplateKHR = func.invoke(device, "vkDestroyDescriptorUpdateTemplateKHR", "vkDestroyDescriptorUpdateTemplate");
        PFN_vkUpdateDescriptorSetWithTemplateKHR = func.invoke(device, "vkUpdateDescriptorSetWithTemplateKHR", "vkUpdateDescriptorSetWithTemplate");
        PFN_vkCmdPushDescriptorSetWithTemplateKHR = func.invoke(device, "vkCmdPushDescriptorSetWithTemplateKHR", "vkCmdPushDescriptorSetWithTemplate");
    }

    public @CType("VkResult") int CreateDescriptorUpdateTemplateKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorUpdateTemplateCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDescriptorUpdateTemplate *") MemorySegment pDescriptorUpdateTemplate) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDescriptorUpdateTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDescriptorUpdateTemplateKHR");
        try { return (int) MH_vkCreateDescriptorUpdateTemplateKHR.invokeExact(PFN_vkCreateDescriptorUpdateTemplateKHR, device, pCreateInfo, pAllocator, pDescriptorUpdateTemplate); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDescriptorUpdateTemplateKHR", e); }
    }

    public void DestroyDescriptorUpdateTemplateKHR(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorUpdateTemplate") MemorySegment descriptorUpdateTemplate, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyDescriptorUpdateTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDescriptorUpdateTemplateKHR");
        try { MH_vkDestroyDescriptorUpdateTemplateKHR.invokeExact(PFN_vkDestroyDescriptorUpdateTemplateKHR, device, descriptorUpdateTemplate, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDescriptorUpdateTemplateKHR", e); }
    }

    public void UpdateDescriptorSetWithTemplateKHR(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSet") MemorySegment descriptorSet, @CType("VkDescriptorUpdateTemplate") MemorySegment descriptorUpdateTemplate, @CType("const void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkUpdateDescriptorSetWithTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkUpdateDescriptorSetWithTemplateKHR");
        try { MH_vkUpdateDescriptorSetWithTemplateKHR.invokeExact(PFN_vkUpdateDescriptorSetWithTemplateKHR, device, descriptorSet, descriptorUpdateTemplate, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateDescriptorSetWithTemplateKHR", e); }
    }

    public void CmdPushDescriptorSetWithTemplateKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDescriptorUpdateTemplate") MemorySegment descriptorUpdateTemplate, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int set, @CType("const void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkCmdPushDescriptorSetWithTemplateKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplateKHR");
        try { MH_vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(PFN_vkCmdPushDescriptorSetWithTemplateKHR, commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplateKHR", e); }
    }

}
