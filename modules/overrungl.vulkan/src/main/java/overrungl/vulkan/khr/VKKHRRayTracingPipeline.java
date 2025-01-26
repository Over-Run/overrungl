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
        public static final MethodHandle MH_vkCreateRayTracingPipelinesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupHandlesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdTraceRaysIndirectKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupStackSizeKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRayTracingPipelineStackSizeKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdTraceRaysKHR;
        public final MemorySegment PFN_vkCreateRayTracingPipelinesKHR;
        public final MemorySegment PFN_vkGetRayTracingShaderGroupHandlesKHR;
        public final MemorySegment PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR;
        public final MemorySegment PFN_vkCmdTraceRaysIndirectKHR;
        public final MemorySegment PFN_vkGetRayTracingShaderGroupStackSizeKHR;
        public final MemorySegment PFN_vkCmdSetRayTracingPipelineStackSizeKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdTraceRaysKHR = func.invoke(device, "vkCmdTraceRaysKHR");
            PFN_vkCreateRayTracingPipelinesKHR = func.invoke(device, "vkCreateRayTracingPipelinesKHR");
            PFN_vkGetRayTracingShaderGroupHandlesKHR = func.invoke(device, "vkGetRayTracingShaderGroupHandlesKHR", "vkGetRayTracingShaderGroupHandlesNV");
            PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = func.invoke(device, "vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
            PFN_vkCmdTraceRaysIndirectKHR = func.invoke(device, "vkCmdTraceRaysIndirectKHR");
            PFN_vkGetRayTracingShaderGroupStackSizeKHR = func.invoke(device, "vkGetRayTracingShaderGroupStackSizeKHR");
            PFN_vkCmdSetRayTracingPipelineStackSizeKHR = func.invoke(device, "vkCmdSetRayTracingPipelineStackSizeKHR");
        }
    }

    public VKKHRRayTracingPipeline(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdTraceRaysKHR(VkCommandBuffer commandBuffer, const VkStridedDeviceAddressRegionKHR* pRaygenShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pMissShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pHitShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pCallableShaderBindingTable, uint32_t width, uint32_t height, uint32_t depth);
    /// ```
    public void CmdTraceRaysKHR(MemorySegment commandBuffer, MemorySegment pRaygenShaderBindingTable, MemorySegment pMissShaderBindingTable, MemorySegment pHitShaderBindingTable, MemorySegment pCallableShaderBindingTable, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdTraceRaysKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysKHR");
        try { Handles.MH_vkCmdTraceRaysKHR.invokeExact(handles.PFN_vkCmdTraceRaysKHR, commandBuffer, pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in CmdTraceRaysKHR", e); }
    }

    /// ```
    /// VkResult vkCreateRayTracingPipelinesKHR(VkDevice device, VkDeferredOperationKHR deferredOperation, VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkRayTracingPipelineCreateInfoKHR* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public int CreateRayTracingPipelinesKHR(MemorySegment device, long deferredOperation, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateRayTracingPipelinesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateRayTracingPipelinesKHR");
        try { return (int) Handles.MH_vkCreateRayTracingPipelinesKHR.invokeExact(handles.PFN_vkCreateRayTracingPipelinesKHR, device, deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateRayTracingPipelinesKHR", e); }
    }

    /// ```
    /// VkResult vkGetRayTracingShaderGroupHandlesKHR(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void* pData);
    /// ```
    public int GetRayTracingShaderGroupHandlesKHR(MemorySegment device, long pipeline, int firstGroup, int groupCount, long dataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRayTracingShaderGroupHandlesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupHandlesKHR");
        try { return (int) Handles.MH_vkGetRayTracingShaderGroupHandlesKHR.invoke(handles.PFN_vkGetRayTracingShaderGroupHandlesKHR, device, pipeline, firstGroup, groupCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetRayTracingShaderGroupHandlesKHR", e); }
    }

    /// ```
    /// VkResult vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void* pData);
    /// ```
    public int GetRayTracingCaptureReplayShaderGroupHandlesKHR(MemorySegment device, long pipeline, int firstGroup, int groupCount, long dataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
        try { return (int) Handles.MH_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.invoke(handles.PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR, device, pipeline, firstGroup, groupCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetRayTracingCaptureReplayShaderGroupHandlesKHR", e); }
    }

    /// ```
    /// void vkCmdTraceRaysIndirectKHR(VkCommandBuffer commandBuffer, const VkStridedDeviceAddressRegionKHR* pRaygenShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pMissShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pHitShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pCallableShaderBindingTable, VkDeviceAddress indirectDeviceAddress);
    /// ```
    public void CmdTraceRaysIndirectKHR(MemorySegment commandBuffer, MemorySegment pRaygenShaderBindingTable, MemorySegment pMissShaderBindingTable, MemorySegment pHitShaderBindingTable, MemorySegment pCallableShaderBindingTable, long indirectDeviceAddress) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdTraceRaysIndirectKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysIndirectKHR");
        try { Handles.MH_vkCmdTraceRaysIndirectKHR.invokeExact(handles.PFN_vkCmdTraceRaysIndirectKHR, commandBuffer, pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress); }
        catch (Throwable e) { throw new RuntimeException("error in CmdTraceRaysIndirectKHR", e); }
    }

    /// ```
    /// VkDeviceSize vkGetRayTracingShaderGroupStackSizeKHR(VkDevice device, VkPipeline pipeline, uint32_t group, VkShaderGroupShaderKHR groupShader);
    /// ```
    public long GetRayTracingShaderGroupStackSizeKHR(MemorySegment device, long pipeline, int group, int groupShader) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRayTracingShaderGroupStackSizeKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupStackSizeKHR");
        try { return (long) Handles.MH_vkGetRayTracingShaderGroupStackSizeKHR.invokeExact(handles.PFN_vkGetRayTracingShaderGroupStackSizeKHR, device, pipeline, group, groupShader); }
        catch (Throwable e) { throw new RuntimeException("error in GetRayTracingShaderGroupStackSizeKHR", e); }
    }

    /// ```
    /// void vkCmdSetRayTracingPipelineStackSizeKHR(VkCommandBuffer commandBuffer, uint32_t pipelineStackSize);
    /// ```
    public void CmdSetRayTracingPipelineStackSizeKHR(MemorySegment commandBuffer, int pipelineStackSize) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRayTracingPipelineStackSizeKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRayTracingPipelineStackSizeKHR");
        try { Handles.MH_vkCmdSetRayTracingPipelineStackSizeKHR.invokeExact(handles.PFN_vkCmdSetRayTracingPipelineStackSizeKHR, commandBuffer, pipelineStackSize); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRayTracingPipelineStackSizeKHR", e); }
    }

}
