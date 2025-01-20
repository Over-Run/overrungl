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
public class VKKHRRayTracingPipeline {
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_GENERAL_KHR = 0;
    public static final int VK_SHADER_GROUP_SHADER_CLOSEST_HIT_KHR = 1;
    public static final int VK_SHADER_GROUP_SHADER_ANY_HIT_KHR = 2;
    public static final int VK_SHADER_GROUP_SHADER_INTERSECTION_KHR = 3;
    public static final int VK_KHR_RAY_TRACING_PIPELINE_SPEC_VERSION = 1;
    public static final String VK_KHR_RAY_TRACING_PIPELINE_EXTENSION_NAME = "VK_KHR_ray_tracing_pipeline";
    public static final int VK_SHADER_UNUSED_KHR = (~0);
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_FEATURES_KHR = 1000347000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR = 1000347001;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_KHR = 1000347015;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR = 1000347016;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR = 1000347018;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_KHR = 0x00000100;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_KHR = 0x00000200;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR = 0x00000400;
    public static final int VK_SHADER_STAGE_MISS_BIT_KHR = 0x00000800;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 0x00001000;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_KHR = 0x00002000;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR = 0x00200000;
    public static final int VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR = 0x00000400;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR = 1000347000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_ANY_HIT_SHADERS_BIT_KHR = 0x00004000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_CLOSEST_HIT_SHADERS_BIT_KHR = 0x00008000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_MISS_SHADERS_BIT_KHR = 0x00010000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_NO_NULL_INTERSECTION_SHADERS_BIT_KHR = 0x00020000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SKIP_TRIANGLES_BIT_KHR = 0x00001000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SKIP_AABBS_BIT_KHR = 0x00002000;
    public static final int VK_PIPELINE_CREATE_RAY_TRACING_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BIT_KHR = 0x00080000;
    public static final int VK_DYNAMIC_STATE_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = 1000347000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdTraceRaysKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateRayTracingPipelinesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupHandlesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdTraceRaysIndirectKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupStackSizeKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRayTracingPipelineStackSizeKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdTraceRaysKHR;
        public final MemorySegment PFN_vkCreateRayTracingPipelinesKHR;
        public final MemorySegment PFN_vkGetRayTracingShaderGroupHandlesKHR;
        public final MemorySegment PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
        public final MemorySegment PFN_vkCmdTraceRaysIndirectKHR;
        public final MemorySegment PFN_vkGetRayTracingShaderGroupStackSizeKHR;
        public final MemorySegment PFN_vkCmdSetRayTracingPipelineStackSizeKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdTraceRaysKHR = func.invoke(device, "vkCmdTraceRaysKHR");
            PFN_vkCreateRayTracingPipelinesKHR = func.invoke(device, "vkCreateRayTracingPipelinesKHR");
            PFN_vkGetRayTracingShaderGroupHandlesKHR = func.invoke(device, "vkGetRayTracingShaderGroupHandlesKHR", "vkGetRayTracingShaderGroupHandlesNV");
            PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = func.invoke(device, "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
            PFN_vkCmdTraceRaysIndirectKHR = func.invoke(device, "vkCmdTraceRaysIndirectKHR");
            PFN_vkGetRayTracingShaderGroupStackSizeKHR = func.invoke(device, "vkGetRayTracingShaderGroupStackSizeKHR");
            PFN_vkCmdSetRayTracingPipelineStackSizeKHR = func.invoke(device, "vkCmdSetRayTracingPipelineStackSizeKHR");
        }
    }

    public VKKHRRayTracingPipeline(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdTraceRaysKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pRaygenShaderBindingTable, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pMissShaderBindingTable, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pHitShaderBindingTable, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pCallableShaderBindingTable, @CType("uint32_t") int width, @CType("uint32_t") int height, @CType("uint32_t") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdTraceRaysKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysKHR");
        try { Handles.MH_vkCmdTraceRaysKHR.invokeExact(handles.PFN_vkCmdTraceRaysKHR, commandBuffer, pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysKHR", e); }
    }

    public @CType("VkResult") int CreateRayTracingPipelinesKHR(@CType("VkDevice") MemorySegment device, @CType("VkDeferredOperationKHR") MemorySegment deferredOperation, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkRayTracingPipelineCreateInfoKHR *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateRayTracingPipelinesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateRayTracingPipelinesKHR");
        try { return (int) Handles.MH_vkCreateRayTracingPipelinesKHR.invokeExact(handles.PFN_vkCreateRayTracingPipelinesKHR, device, deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRayTracingPipelinesKHR", e); }
    }

    public @CType("VkResult") int GetRayTracingShaderGroupHandlesKHR(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("uint32_t") int firstGroup, @CType("uint32_t") int groupCount, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRayTracingShaderGroupHandlesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupHandlesKHR");
        try { return (int) Handles.MH_vkGetRayTracingShaderGroupHandlesKHR.invokeExact(handles.PFN_vkGetRayTracingShaderGroupHandlesKHR, device, pipeline, firstGroup, groupCount, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingShaderGroupHandlesKHR", e); }
    }

    public @CType("VkResult") int GetRayTracingCaptureReplayShaderGroupHandlesKHR(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("uint32_t") int firstGroup, @CType("uint32_t") int groupCount, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
        try { return (int) Handles.MH_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.invokeExact(handles.PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR, device, pipeline, firstGroup, groupCount, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", e); }
    }

    public void CmdTraceRaysIndirectKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pRaygenShaderBindingTable, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pMissShaderBindingTable, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pHitShaderBindingTable, @CType("const VkStridedDeviceAddressRegionKHR *") MemorySegment pCallableShaderBindingTable, @CType("VkDeviceAddress") long indirectDeviceAddress) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdTraceRaysIndirectKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysIndirectKHR");
        try { Handles.MH_vkCmdTraceRaysIndirectKHR.invokeExact(handles.PFN_vkCmdTraceRaysIndirectKHR, commandBuffer, pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysIndirectKHR", e); }
    }

    public @CType("VkDeviceSize") long GetRayTracingShaderGroupStackSizeKHR(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("uint32_t") int group, @CType("VkShaderGroupShaderKHR") int groupShader) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRayTracingShaderGroupStackSizeKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupStackSizeKHR");
        try { return (long) Handles.MH_vkGetRayTracingShaderGroupStackSizeKHR.invokeExact(handles.PFN_vkGetRayTracingShaderGroupStackSizeKHR, device, pipeline, group, groupShader); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingShaderGroupStackSizeKHR", e); }
    }

    public void CmdSetRayTracingPipelineStackSizeKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int pipelineStackSize) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRayTracingPipelineStackSizeKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRayTracingPipelineStackSizeKHR");
        try { Handles.MH_vkCmdSetRayTracingPipelineStackSizeKHR.invokeExact(handles.PFN_vkCmdSetRayTracingPipelineStackSizeKHR, commandBuffer, pipelineStackSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRayTracingPipelineStackSizeKHR", e); }
    }

}
