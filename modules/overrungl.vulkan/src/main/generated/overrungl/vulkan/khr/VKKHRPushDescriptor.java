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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_push_descriptor` - device extension
public final class VKKHRPushDescriptor {
    public static final int VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;
    public static final String VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME = "VK_KHR_push_descriptor";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR = 1000080000;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR = 0x00000001;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdPushDescriptorSetKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPushDescriptorSetWithTemplateKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRPushDescriptor() {}

    /// Invokes `vkCmdPushDescriptorSetKHR`.
    /// ```
    /// void vkCmdPushDescriptorSetKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t set, uint32_t descriptorWriteCount, const VkWriteDescriptorSet* pDescriptorWrites);
    /// ```
    public static void vkCmdPushDescriptorSetKHR(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set, int descriptorWriteCount, @NonNull MemorySegment pDescriptorWrites) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSetKHR", commandBuffer, pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        Handles.MH_vkCmdPushDescriptorSetKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetKHR, commandBuffer.segment(), pipelineBindPoint, layout, set, descriptorWriteCount, pDescriptorWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetKHR", e); }
    }

    /// Invokes `vkCmdPushDescriptorSetWithTemplateKHR`.
    /// ```
    /// void vkCmdPushDescriptorSetWithTemplateKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDescriptorUpdateTemplate descriptorUpdateTemplate, (uint64_t) VkPipelineLayout layout, uint32_t set, const void* pData);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplateKHR(@NonNull VkCommandBuffer commandBuffer, long descriptorUpdateTemplate, long layout, int set, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplateKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplateKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSetWithTemplateKHR", commandBuffer, descriptorUpdateTemplate, layout, set, pData); }
        Handles.MH_vkCmdPushDescriptorSetWithTemplateKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplateKHR, commandBuffer.segment(), descriptorUpdateTemplate, layout, set, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplateKHR", e); }
    }

}
