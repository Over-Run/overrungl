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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNVDeviceGeneratedCommandsCompute {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV = 1000428001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV = 1000428002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x00000080;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineIndirectMemoryRequirementsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdUpdatePipelineIndirectBufferNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPipelineIndirectDeviceAddressNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPipelineIndirectMemoryRequirementsNV;
        public final MemorySegment PFN_vkCmdUpdatePipelineIndirectBufferNV;
        public final MemorySegment PFN_vkGetPipelineIndirectDeviceAddressNV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPipelineIndirectMemoryRequirementsNV = func.invoke(device, "vkGetPipelineIndirectMemoryRequirementsNV");
            PFN_vkCmdUpdatePipelineIndirectBufferNV = func.invoke(device, "vkCmdUpdatePipelineIndirectBufferNV");
            PFN_vkGetPipelineIndirectDeviceAddressNV = func.invoke(device, "vkGetPipelineIndirectDeviceAddressNV");
        }
    }

    public VKNVDeviceGeneratedCommandsCompute(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, const VkComputePipelineCreateInfo* pCreateInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public void GetPipelineIndirectMemoryRequirementsNV(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPipelineIndirectMemoryRequirementsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineIndirectMemoryRequirementsNV");
        try { Handles.MH_vkGetPipelineIndirectMemoryRequirementsNV.invokeExact(handles.PFN_vkGetPipelineIndirectMemoryRequirementsNV, device, pCreateInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetPipelineIndirectMemoryRequirementsNV", e); }
    }

    /// ```
    /// void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline);
    /// ```
    public void CmdUpdatePipelineIndirectBufferNV(MemorySegment commandBuffer, int pipelineBindPoint, long pipeline) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdUpdatePipelineIndirectBufferNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdUpdatePipelineIndirectBufferNV");
        try { Handles.MH_vkCmdUpdatePipelineIndirectBufferNV.invokeExact(handles.PFN_vkCmdUpdatePipelineIndirectBufferNV, commandBuffer, pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in CmdUpdatePipelineIndirectBufferNV", e); }
    }

    /// ```
    /// VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV(VkDevice device, const VkPipelineIndirectDeviceAddressInfoNV* pInfo);
    /// ```
    public long GetPipelineIndirectDeviceAddressNV(MemorySegment device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPipelineIndirectDeviceAddressNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineIndirectDeviceAddressNV");
        try { return (long) Handles.MH_vkGetPipelineIndirectDeviceAddressNV.invokeExact(handles.PFN_vkGetPipelineIndirectDeviceAddressNV, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetPipelineIndirectDeviceAddressNV", e); }
    }

}
