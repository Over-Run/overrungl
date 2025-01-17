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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
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
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPipelineIndirectMemoryRequirementsNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdUpdatePipelineIndirectBufferNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPipelineIndirectDeviceAddressNV = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetPipelineIndirectMemoryRequirementsNV,
            FD_vkCmdUpdatePipelineIndirectBufferNV,
            FD_vkGetPipelineIndirectDeviceAddressNV
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineIndirectMemoryRequirementsNV = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineIndirectMemoryRequirementsNV);
        public static final MethodHandle MH_vkCmdUpdatePipelineIndirectBufferNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdUpdatePipelineIndirectBufferNV);
        public static final MethodHandle MH_vkGetPipelineIndirectDeviceAddressNV = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineIndirectDeviceAddressNV);
        public final MemorySegment PFN_vkGetPipelineIndirectMemoryRequirementsNV;
        public final MemorySegment PFN_vkCmdUpdatePipelineIndirectBufferNV;
        public final MemorySegment PFN_vkGetPipelineIndirectDeviceAddressNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPipelineIndirectMemoryRequirementsNV = func.invoke(device, "vkGetPipelineIndirectMemoryRequirementsNV");
            PFN_vkCmdUpdatePipelineIndirectBufferNV = func.invoke(device, "vkCmdUpdatePipelineIndirectBufferNV");
            PFN_vkGetPipelineIndirectDeviceAddressNV = func.invoke(device, "vkGetPipelineIndirectDeviceAddressNV");
        }
    }

    public VKNVDeviceGeneratedCommandsCompute(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void GetPipelineIndirectMemoryRequirementsNV(@CType("VkDevice") MemorySegment device, @CType("const VkComputePipelineCreateInfo *") MemorySegment pCreateInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineIndirectMemoryRequirementsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineIndirectMemoryRequirementsNV");
        try { Handles.MH_vkGetPipelineIndirectMemoryRequirementsNV.invokeExact(handles.PFN_vkGetPipelineIndirectMemoryRequirementsNV, device, pCreateInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineIndirectMemoryRequirementsNV", e); }
    }

    public void CmdUpdatePipelineIndirectBufferNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipeline") MemorySegment pipeline) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdUpdatePipelineIndirectBufferNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdUpdatePipelineIndirectBufferNV");
        try { Handles.MH_vkCmdUpdatePipelineIndirectBufferNV.invokeExact(handles.PFN_vkCmdUpdatePipelineIndirectBufferNV, commandBuffer, pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdatePipelineIndirectBufferNV", e); }
    }

    public @CType("VkDeviceAddress") long GetPipelineIndirectDeviceAddressNV(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineIndirectDeviceAddressInfoNV *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineIndirectDeviceAddressNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineIndirectDeviceAddressNV");
        try { return (long) Handles.MH_vkGetPipelineIndirectDeviceAddressNV.invokeExact(handles.PFN_vkGetPipelineIndirectDeviceAddressNV, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineIndirectDeviceAddressNV", e); }
    }

}
