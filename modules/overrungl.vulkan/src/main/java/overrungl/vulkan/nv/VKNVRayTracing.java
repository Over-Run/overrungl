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
public class VKNVRayTracing {
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV = 2;
    public static final int VK_NV_RAY_TRACING_SPEC_VERSION = 3;
    public static final String VK_NV_RAY_TRACING_EXTENSION_NAME = "VK_NV_ray_tracing";
    public static final int VK_SHADER_UNUSED_NV = (~0);
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV = 1000165000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV = 1000165001;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_NV = 1000165003;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV = 1000165004;
    public static final int VK_STRUCTURE_TYPE_GEOMETRY_AABB_NV = 1000165005;
    public static final int VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV = 1000165006;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV = 1000165007;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV = 1000165008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV = 1000165009;
    public static final int VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV = 1000165011;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_INFO_NV = 1000165012;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_NV = 0x00000100;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_NV = 0x00000200;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV = 0x00000400;
    public static final int VK_SHADER_STAGE_MISS_BIT_NV = 0x00000800;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_NV = 0x00001000;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_NV = 0x00002000;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV = 0x00200000;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV = 0x02000000;
    public static final int VK_BUFFER_USAGE_RAY_TRACING_BIT_NV = 0x00000400;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_NV = 1000347000;
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV = 0x00200000;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV = 0x00400000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;
    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV = 0x00000020;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_INDEX_TYPE_NONE_NV = 1000150000;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV = 0;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV = 1;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV = 2;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_NV = 0;
    public static final int VK_GEOMETRY_TYPE_AABBS_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV = 1;
    public static final int VK_GEOMETRY_OPAQUE_BIT_NV = 0x00000001;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV = 0x00000002;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV = 0x00000001;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV = 0x00000002;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV = 0x00000004;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV = 0x00000008;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV = 0x00000001;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV = 0x00000002;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV = 0x00000004;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV = 0x00000008;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV = 0x00000010;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV = 0;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateAccelerationStructureNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyAccelerationStructureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetAccelerationStructureMemoryRequirementsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindAccelerationStructureMemoryNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBuildAccelerationStructureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdCopyAccelerationStructureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdTraceRaysNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateRayTracingPipelinesNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupHandlesNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetAccelerationStructureHandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdWriteAccelerationStructuresPropertiesNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCompileDeferredNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCreateAccelerationStructureNV;
        public final MemorySegment PFN_vkDestroyAccelerationStructureNV;
        public final MemorySegment PFN_vkGetAccelerationStructureMemoryRequirementsNV;
        public final MemorySegment PFN_vkBindAccelerationStructureMemoryNV;
        public final MemorySegment PFN_vkCmdBuildAccelerationStructureNV;
        public final MemorySegment PFN_vkCmdCopyAccelerationStructureNV;
        public final MemorySegment PFN_vkCmdTraceRaysNV;
        public final MemorySegment PFN_vkCreateRayTracingPipelinesNV;
        public final MemorySegment PFN_vkGetRayTracingShaderGroupHandlesNV;
        public final MemorySegment PFN_vkGetAccelerationStructureHandleNV;
        public final MemorySegment PFN_vkCmdWriteAccelerationStructuresPropertiesNV;
        public final MemorySegment PFN_vkCompileDeferredNV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateAccelerationStructureNV = func.invoke(device, "vkCreateAccelerationStructureNV");
            PFN_vkDestroyAccelerationStructureNV = func.invoke(device, "vkDestroyAccelerationStructureNV");
            PFN_vkGetAccelerationStructureMemoryRequirementsNV = func.invoke(device, "vkGetAccelerationStructureMemoryRequirementsNV");
            PFN_vkBindAccelerationStructureMemoryNV = func.invoke(device, "vkBindAccelerationStructureMemoryNV");
            PFN_vkCmdBuildAccelerationStructureNV = func.invoke(device, "vkCmdBuildAccelerationStructureNV");
            PFN_vkCmdCopyAccelerationStructureNV = func.invoke(device, "vkCmdCopyAccelerationStructureNV");
            PFN_vkCmdTraceRaysNV = func.invoke(device, "vkCmdTraceRaysNV");
            PFN_vkCreateRayTracingPipelinesNV = func.invoke(device, "vkCreateRayTracingPipelinesNV");
            PFN_vkGetRayTracingShaderGroupHandlesNV = func.invoke(device, "vkGetRayTracingShaderGroupHandlesNV", "vkGetRayTracingShaderGroupHandlesKHR");
            PFN_vkGetAccelerationStructureHandleNV = func.invoke(device, "vkGetAccelerationStructureHandleNV");
            PFN_vkCmdWriteAccelerationStructuresPropertiesNV = func.invoke(device, "vkCmdWriteAccelerationStructuresPropertiesNV");
            PFN_vkCompileDeferredNV = func.invoke(device, "vkCompileDeferredNV");
        }
    }

    public VKNVRayTracing(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateAccelerationStructureNV(VkDevice device, const VkAccelerationStructureCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkAccelerationStructureNV* pAccelerationStructure);
    /// ```
    public int CreateAccelerationStructureNV(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pAccelerationStructure) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureNV");
        try { return (int) Handles.MH_vkCreateAccelerationStructureNV.invokeExact(handles.PFN_vkCreateAccelerationStructureNV, device, pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in CreateAccelerationStructureNV", e); }
    }

    /// ```
    /// void vkDestroyAccelerationStructureNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyAccelerationStructureNV(MemorySegment device, long accelerationStructure, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureNV");
        try { Handles.MH_vkDestroyAccelerationStructureNV.invokeExact(handles.PFN_vkDestroyAccelerationStructureNV, device, accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyAccelerationStructureNV", e); }
    }

    /// ```
    /// void vkGetAccelerationStructureMemoryRequirementsNV(VkDevice device, const VkAccelerationStructureMemoryRequirementsInfoNV* pInfo, VkMemoryRequirements2KHR* pMemoryRequirements);
    /// ```
    public void GetAccelerationStructureMemoryRequirementsNV(MemorySegment device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetAccelerationStructureMemoryRequirementsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureMemoryRequirementsNV");
        try { Handles.MH_vkGetAccelerationStructureMemoryRequirementsNV.invokeExact(handles.PFN_vkGetAccelerationStructureMemoryRequirementsNV, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetAccelerationStructureMemoryRequirementsNV", e); }
    }

    /// ```
    /// VkResult vkBindAccelerationStructureMemoryNV(VkDevice device, uint32_t bindInfoCount, const VkBindAccelerationStructureMemoryInfoNV* pBindInfos);
    /// ```
    public int BindAccelerationStructureMemoryNV(MemorySegment device, int bindInfoCount, MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBindAccelerationStructureMemoryNV)) throw new SymbolNotFoundError("Symbol not found: vkBindAccelerationStructureMemoryNV");
        try { return (int) Handles.MH_vkBindAccelerationStructureMemoryNV.invokeExact(handles.PFN_vkBindAccelerationStructureMemoryNV, device, bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in BindAccelerationStructureMemoryNV", e); }
    }

    /// ```
    /// void vkCmdBuildAccelerationStructureNV(VkCommandBuffer commandBuffer, const VkAccelerationStructureInfoNV* pInfo, VkBuffer instanceData, VkDeviceSize instanceOffset, VkBool32 update, VkAccelerationStructureNV dst, VkAccelerationStructureNV src, VkBuffer scratch, VkDeviceSize scratchOffset);
    /// ```
    public void CmdBuildAccelerationStructureNV(MemorySegment commandBuffer, MemorySegment pInfo, long instanceData, long instanceOffset, int update, long dst, long src, long scratch, long scratchOffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBuildAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructureNV");
        try { Handles.MH_vkCmdBuildAccelerationStructureNV.invokeExact(handles.PFN_vkCmdBuildAccelerationStructureNV, commandBuffer, pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBuildAccelerationStructureNV", e); }
    }

    /// ```
    /// void vkCmdCopyAccelerationStructureNV(VkCommandBuffer commandBuffer, VkAccelerationStructureNV dst, VkAccelerationStructureNV src, VkCopyAccelerationStructureModeKHR mode);
    /// ```
    public void CmdCopyAccelerationStructureNV(MemorySegment commandBuffer, long dst, long src, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCopyAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureNV");
        try { Handles.MH_vkCmdCopyAccelerationStructureNV.invokeExact(handles.PFN_vkCmdCopyAccelerationStructureNV, commandBuffer, dst, src, mode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCopyAccelerationStructureNV", e); }
    }

    /// ```
    /// void vkCmdTraceRaysNV(VkCommandBuffer commandBuffer, VkBuffer raygenShaderBindingTableBuffer, VkDeviceSize raygenShaderBindingOffset, VkBuffer missShaderBindingTableBuffer, VkDeviceSize missShaderBindingOffset, VkDeviceSize missShaderBindingStride, VkBuffer hitShaderBindingTableBuffer, VkDeviceSize hitShaderBindingOffset, VkDeviceSize hitShaderBindingStride, VkBuffer callableShaderBindingTableBuffer, VkDeviceSize callableShaderBindingOffset, VkDeviceSize callableShaderBindingStride, uint32_t width, uint32_t height, uint32_t depth);
    /// ```
    public void CmdTraceRaysNV(MemorySegment commandBuffer, long raygenShaderBindingTableBuffer, long raygenShaderBindingOffset, long missShaderBindingTableBuffer, long missShaderBindingOffset, long missShaderBindingStride, long hitShaderBindingTableBuffer, long hitShaderBindingOffset, long hitShaderBindingStride, long callableShaderBindingTableBuffer, long callableShaderBindingOffset, long callableShaderBindingStride, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdTraceRaysNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysNV");
        try { Handles.MH_vkCmdTraceRaysNV.invokeExact(handles.PFN_vkCmdTraceRaysNV, commandBuffer, raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in CmdTraceRaysNV", e); }
    }

    /// ```
    /// VkResult vkCreateRayTracingPipelinesNV(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkRayTracingPipelineCreateInfoNV* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public int CreateRayTracingPipelinesNV(MemorySegment device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateRayTracingPipelinesNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateRayTracingPipelinesNV");
        try { return (int) Handles.MH_vkCreateRayTracingPipelinesNV.invokeExact(handles.PFN_vkCreateRayTracingPipelinesNV, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateRayTracingPipelinesNV", e); }
    }

    /// ```
    /// VkResult vkGetRayTracingShaderGroupHandlesNV(VkDevice device, VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void* pData);
    /// ```
    public int GetRayTracingShaderGroupHandlesNV(MemorySegment device, long pipeline, int firstGroup, int groupCount, long dataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetRayTracingShaderGroupHandlesNV)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupHandlesNV");
        try { return (int) Handles.MH_vkGetRayTracingShaderGroupHandlesNV.invoke(handles.PFN_vkGetRayTracingShaderGroupHandlesNV, device, pipeline, firstGroup, groupCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetRayTracingShaderGroupHandlesNV", e); }
    }

    /// ```
    /// VkResult vkGetAccelerationStructureHandleNV(VkDevice device, VkAccelerationStructureNV accelerationStructure, size_t dataSize, void* pData);
    /// ```
    public int GetAccelerationStructureHandleNV(MemorySegment device, long accelerationStructure, long dataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetAccelerationStructureHandleNV)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureHandleNV");
        try { return (int) Handles.MH_vkGetAccelerationStructureHandleNV.invoke(handles.PFN_vkGetAccelerationStructureHandleNV, device, accelerationStructure, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetAccelerationStructureHandleNV", e); }
    }

    /// ```
    /// void vkCmdWriteAccelerationStructuresPropertiesNV(VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, const VkAccelerationStructureNV* pAccelerationStructures, VkQueryType queryType, VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public void CmdWriteAccelerationStructuresPropertiesNV(MemorySegment commandBuffer, int accelerationStructureCount, MemorySegment pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteAccelerationStructuresPropertiesNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesNV");
        try { Handles.MH_vkCmdWriteAccelerationStructuresPropertiesNV.invokeExact(handles.PFN_vkCmdWriteAccelerationStructuresPropertiesNV, commandBuffer, accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteAccelerationStructuresPropertiesNV", e); }
    }

    /// ```
    /// VkResult vkCompileDeferredNV(VkDevice device, VkPipeline pipeline, uint32_t shader);
    /// ```
    public int CompileDeferredNV(MemorySegment device, long pipeline, int shader) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCompileDeferredNV)) throw new SymbolNotFoundError("Symbol not found: vkCompileDeferredNV");
        try { return (int) Handles.MH_vkCompileDeferredNV.invokeExact(handles.PFN_vkCompileDeferredNV, device, pipeline, shader); }
        catch (Throwable e) { throw new RuntimeException("error in CompileDeferredNV", e); }
    }

}
