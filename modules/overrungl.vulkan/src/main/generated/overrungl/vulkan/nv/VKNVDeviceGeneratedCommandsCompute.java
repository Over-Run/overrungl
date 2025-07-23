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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVDeviceGeneratedCommandsCompute {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV = 1000428001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV = 1000428002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x00000080;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineIndirectMemoryRequirementsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdUpdatePipelineIndirectBufferNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPipelineIndirectDeviceAddressNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVDeviceGeneratedCommandsCompute() {}

    /// ```
    /// void vkGetPipelineIndirectMemoryRequirementsNV((struct VkDevice*) VkDevice device, const VkComputePipelineCreateInfo* pCreateInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, MemorySegment pCreateInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineIndirectMemoryRequirementsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineIndirectMemoryRequirementsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineIndirectMemoryRequirementsNV", device, pCreateInfo, pMemoryRequirements); }
        Handles.MH_vkGetPipelineIndirectMemoryRequirementsNV.invokeExact(device.capabilities().PFN_vkGetPipelineIndirectMemoryRequirementsNV, device.segment(), pCreateInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineIndirectMemoryRequirementsNV", e); }
    }

    /// ```
    /// void vkCmdUpdatePipelineIndirectBufferNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipeline pipeline);
    /// ```
    public static void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdUpdatePipelineIndirectBufferNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdUpdatePipelineIndirectBufferNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdUpdatePipelineIndirectBufferNV", commandBuffer, pipelineBindPoint, pipeline); }
        Handles.MH_vkCmdUpdatePipelineIndirectBufferNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdUpdatePipelineIndirectBufferNV, commandBuffer.segment(), pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdatePipelineIndirectBufferNV", e); }
    }

    /// ```
    /// (uint64_t) VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV((struct VkDevice*) VkDevice device, const VkPipelineIndirectDeviceAddressInfoNV* pInfo);
    /// ```
    public static long vkGetPipelineIndirectDeviceAddressNV(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineIndirectDeviceAddressNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineIndirectDeviceAddressNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineIndirectDeviceAddressNV", device, pInfo); }
        return (long) Handles.MH_vkGetPipelineIndirectDeviceAddressNV.invokeExact(device.capabilities().PFN_vkGetPipelineIndirectDeviceAddressNV, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineIndirectDeviceAddressNV", e); }
    }

}
