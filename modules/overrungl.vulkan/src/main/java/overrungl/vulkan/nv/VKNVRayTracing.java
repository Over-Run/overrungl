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
import static overrungl.vulkan.khr.VKKHRAccelerationStructure.*;
import static overrungl.vulkan.khr.VKKHRRayTracingPipeline.*;
public class VKNVRayTracing {
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV = 0;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV = 1;
    public static final int VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV = 2;
    public static final int VK_NV_RAY_TRACING_SPEC_VERSION = 3;
    public static final String VK_NV_RAY_TRACING_EXTENSION_NAME = "VK_NV_ray_tracing";
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
    public static final int VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;
    public static final int VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV = 0x00000020;
    public static final int VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT = 1000165000;
    public static final int VK_SHADER_UNUSED_NV = VK_SHADER_UNUSED_KHR;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_NV = VK_SHADER_STAGE_RAYGEN_BIT_KHR;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_NV = VK_SHADER_STAGE_ANY_HIT_BIT_KHR;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV = VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR;
    public static final int VK_SHADER_STAGE_MISS_BIT_NV = VK_SHADER_STAGE_MISS_BIT_KHR;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_NV = VK_SHADER_STAGE_INTERSECTION_BIT_KHR;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_NV = VK_SHADER_STAGE_CALLABLE_BIT_KHR;
    public static final int VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV = VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_KHR;
    public static final int VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV = VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_KHR;
    public static final int VK_BUFFER_USAGE_RAY_TRACING_BIT_NV = VK_BUFFER_USAGE_SHADER_BINDING_TABLE_BIT_KHR;
    public static final int VK_PIPELINE_BIND_POINT_RAY_TRACING_NV = VK_PIPELINE_BIND_POINT_RAY_TRACING_KHR;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV = VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR;
    public static final int VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV = VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR;
    public static final int VK_INDEX_TYPE_NONE_NV = VK_INDEX_TYPE_NONE_KHR;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV = VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV = VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR;
    public static final int VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV = VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR;
    public static final int VK_GEOMETRY_TYPE_TRIANGLES_NV = VK_GEOMETRY_TYPE_TRIANGLES_KHR;
    public static final int VK_GEOMETRY_TYPE_AABBS_NV = VK_GEOMETRY_TYPE_AABBS_KHR;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV = VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_KHR;
    public static final int VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV = VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_KHR;
    public static final int VK_GEOMETRY_OPAQUE_BIT_NV = VK_GEOMETRY_OPAQUE_BIT_KHR;
    public static final int VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV = VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV = VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR;
    public static final int VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV = VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV = VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR;
    public static final int VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV = VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV = VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_KHR;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV = VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_KHR;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV = VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_KHR;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV = VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_KHR;
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV = VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_KHR;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV = VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR;
    public static final int VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV = VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateAccelerationStructureNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyAccelerationStructureNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetAccelerationStructureMemoryRequirementsNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBindAccelerationStructureMemoryNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBuildAccelerationStructureNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkCmdCopyAccelerationStructureNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdTraceRaysNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCreateRayTracingPipelinesNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetRayTracingShaderGroupHandlesNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetAccelerationStructureHandleNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdWriteAccelerationStructuresPropertiesNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCompileDeferredNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateAccelerationStructureNV = RuntimeHelper.downcall(Descriptors.FD_vkCreateAccelerationStructureNV);
        public static final MethodHandle MH_vkDestroyAccelerationStructureNV = RuntimeHelper.downcall(Descriptors.FD_vkDestroyAccelerationStructureNV);
        public static final MethodHandle MH_vkGetAccelerationStructureMemoryRequirementsNV = RuntimeHelper.downcall(Descriptors.FD_vkGetAccelerationStructureMemoryRequirementsNV);
        public static final MethodHandle MH_vkBindAccelerationStructureMemoryNV = RuntimeHelper.downcall(Descriptors.FD_vkBindAccelerationStructureMemoryNV);
        public static final MethodHandle MH_vkCmdBuildAccelerationStructureNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdBuildAccelerationStructureNV);
        public static final MethodHandle MH_vkCmdCopyAccelerationStructureNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdCopyAccelerationStructureNV);
        public static final MethodHandle MH_vkCmdTraceRaysNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdTraceRaysNV);
        public static final MethodHandle MH_vkCreateRayTracingPipelinesNV = RuntimeHelper.downcall(Descriptors.FD_vkCreateRayTracingPipelinesNV);
        public static final MethodHandle MH_vkGetRayTracingShaderGroupHandlesNV = RuntimeHelper.downcall(Descriptors.FD_vkGetRayTracingShaderGroupHandlesNV);
        public static final MethodHandle MH_vkGetAccelerationStructureHandleNV = RuntimeHelper.downcall(Descriptors.FD_vkGetAccelerationStructureHandleNV);
        public static final MethodHandle MH_vkCmdWriteAccelerationStructuresPropertiesNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdWriteAccelerationStructuresPropertiesNV);
        public static final MethodHandle MH_vkCompileDeferredNV = RuntimeHelper.downcall(Descriptors.FD_vkCompileDeferredNV);
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
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
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

    public VKNVRayTracing(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreateAccelerationStructureNV(@CType("VkDevice") MemorySegment device, @CType("const VkAccelerationStructureCreateInfoNV *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkAccelerationStructureNV *") MemorySegment pAccelerationStructure) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureNV");
        try { return (int) Handles.MH_vkCreateAccelerationStructureNV.invokeExact(handles.PFN_vkCreateAccelerationStructureNV, device, pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAccelerationStructureNV", e); }
    }

    public void DestroyAccelerationStructureNV(@CType("VkDevice") MemorySegment device, @CType("VkAccelerationStructureNV") MemorySegment accelerationStructure, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureNV");
        try { Handles.MH_vkDestroyAccelerationStructureNV.invokeExact(handles.PFN_vkDestroyAccelerationStructureNV, device, accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyAccelerationStructureNV", e); }
    }

    public void GetAccelerationStructureMemoryRequirementsNV(@CType("VkDevice") MemorySegment device, @CType("const VkAccelerationStructureMemoryRequirementsInfoNV *") MemorySegment pInfo, @CType("VkMemoryRequirements2KHR *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetAccelerationStructureMemoryRequirementsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureMemoryRequirementsNV");
        try { Handles.MH_vkGetAccelerationStructureMemoryRequirementsNV.invokeExact(handles.PFN_vkGetAccelerationStructureMemoryRequirementsNV, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureMemoryRequirementsNV", e); }
    }

    public @CType("VkResult") int BindAccelerationStructureMemoryNV(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int bindInfoCount, @CType("const VkBindAccelerationStructureMemoryInfoNV *") MemorySegment pBindInfos) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindAccelerationStructureMemoryNV)) throw new SymbolNotFoundError("Symbol not found: vkBindAccelerationStructureMemoryNV");
        try { return (int) Handles.MH_vkBindAccelerationStructureMemoryNV.invokeExact(handles.PFN_vkBindAccelerationStructureMemoryNV, device, bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindAccelerationStructureMemoryNV", e); }
    }

    public void CmdBuildAccelerationStructureNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkAccelerationStructureInfoNV *") MemorySegment pInfo, @CType("VkBuffer") MemorySegment instanceData, @CType("VkDeviceSize") long instanceOffset, @CType("VkBool32") int update, @CType("VkAccelerationStructureNV") MemorySegment dst, @CType("VkAccelerationStructureNV") MemorySegment src, @CType("VkBuffer") MemorySegment scratch, @CType("VkDeviceSize") long scratchOffset) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBuildAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructureNV");
        try { Handles.MH_vkCmdBuildAccelerationStructureNV.invokeExact(handles.PFN_vkCmdBuildAccelerationStructureNV, commandBuffer, pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructureNV", e); }
    }

    public void CmdCopyAccelerationStructureNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkAccelerationStructureNV") MemorySegment dst, @CType("VkAccelerationStructureNV") MemorySegment src, @CType("VkCopyAccelerationStructureModeKHR") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdCopyAccelerationStructureNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureNV");
        try { Handles.MH_vkCmdCopyAccelerationStructureNV.invokeExact(handles.PFN_vkCmdCopyAccelerationStructureNV, commandBuffer, dst, src, mode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureNV", e); }
    }

    public void CmdTraceRaysNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment raygenShaderBindingTableBuffer, @CType("VkDeviceSize") long raygenShaderBindingOffset, @CType("VkBuffer") MemorySegment missShaderBindingTableBuffer, @CType("VkDeviceSize") long missShaderBindingOffset, @CType("VkDeviceSize") long missShaderBindingStride, @CType("VkBuffer") MemorySegment hitShaderBindingTableBuffer, @CType("VkDeviceSize") long hitShaderBindingOffset, @CType("VkDeviceSize") long hitShaderBindingStride, @CType("VkBuffer") MemorySegment callableShaderBindingTableBuffer, @CType("VkDeviceSize") long callableShaderBindingOffset, @CType("VkDeviceSize") long callableShaderBindingStride, @CType("uint32_t") int width, @CType("uint32_t") int height, @CType("uint32_t") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdTraceRaysNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysNV");
        try { Handles.MH_vkCmdTraceRaysNV.invokeExact(handles.PFN_vkCmdTraceRaysNV, commandBuffer, raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysNV", e); }
    }

    public @CType("VkResult") int CreateRayTracingPipelinesNV(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkRayTracingPipelineCreateInfoNV *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateRayTracingPipelinesNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateRayTracingPipelinesNV");
        try { return (int) Handles.MH_vkCreateRayTracingPipelinesNV.invokeExact(handles.PFN_vkCreateRayTracingPipelinesNV, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRayTracingPipelinesNV", e); }
    }

    public @CType("VkResult") int GetRayTracingShaderGroupHandlesNV(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("uint32_t") int firstGroup, @CType("uint32_t") int groupCount, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetRayTracingShaderGroupHandlesNV)) throw new SymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupHandlesNV");
        try { return (int) Handles.MH_vkGetRayTracingShaderGroupHandlesNV.invokeExact(handles.PFN_vkGetRayTracingShaderGroupHandlesNV, device, pipeline, firstGroup, groupCount, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingShaderGroupHandlesNV", e); }
    }

    public @CType("VkResult") int GetAccelerationStructureHandleNV(@CType("VkDevice") MemorySegment device, @CType("VkAccelerationStructureNV") MemorySegment accelerationStructure, @CType("size_t") long dataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetAccelerationStructureHandleNV)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureHandleNV");
        try { return (int) Handles.MH_vkGetAccelerationStructureHandleNV.invokeExact(handles.PFN_vkGetAccelerationStructureHandleNV, device, accelerationStructure, dataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureHandleNV", e); }
    }

    public void CmdWriteAccelerationStructuresPropertiesNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int accelerationStructureCount, @CType("const VkAccelerationStructureNV *") MemorySegment pAccelerationStructures, @CType("VkQueryType") int queryType, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int firstQuery) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdWriteAccelerationStructuresPropertiesNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesNV");
        try { Handles.MH_vkCmdWriteAccelerationStructuresPropertiesNV.invokeExact(handles.PFN_vkCmdWriteAccelerationStructuresPropertiesNV, commandBuffer, accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteAccelerationStructuresPropertiesNV", e); }
    }

    public @CType("VkResult") int CompileDeferredNV(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment pipeline, @CType("uint32_t") int shader) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCompileDeferredNV)) throw new SymbolNotFoundError("Symbol not found: vkCompileDeferredNV");
        try { return (int) Handles.MH_vkCompileDeferredNV.invokeExact(handles.PFN_vkCompileDeferredNV, device, pipeline, shader); }
        catch (Throwable e) { throw new RuntimeException("error in vkCompileDeferredNV", e); }
    }

}
