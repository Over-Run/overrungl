// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_ray_tracing` - device extension
public final class VKNVRayTracing {
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
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateAccelerationStructureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkDestroyAccelerationStructureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetAccelerationStructureMemoryRequirementsNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkBindAccelerationStructureMemoryNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBuildAccelerationStructureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_vkCmdCopyAccelerationStructureNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdTraceRaysNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCreateRayTracingPipelinesNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetRayTracingShaderGroupHandlesNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetAccelerationStructureHandleNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdWriteAccelerationStructuresPropertiesNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCompileDeferredNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        private Handles() {}
    }

    private VKNVRayTracing() {}

    /// Invokes `vkCreateAccelerationStructureNV`.
    /// ```
    /// (int) VkResult vkCreateAccelerationStructureNV((struct VkDevice*) VkDevice device, const VkAccelerationStructureCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkAccelerationStructureNV* pAccelerationStructure);
    /// ```
    public static int vkCreateAccelerationStructureNV(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pAccelerationStructure) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateAccelerationStructureNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateAccelerationStructureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateAccelerationStructureNV", device, pCreateInfo, pAllocator, pAccelerationStructure); }
        return (int) Handles.MH_vkCreateAccelerationStructureNV.get().invokeExact(device.capabilities().PFN_vkCreateAccelerationStructureNV, device.segment(), pCreateInfo, pAllocator, pAccelerationStructure); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateAccelerationStructureNV", e); }
    }

    /// Invokes `vkDestroyAccelerationStructureNV`.
    /// ```
    /// void vkDestroyAccelerationStructureNV((struct VkDevice*) VkDevice device, (uint64_t) VkAccelerationStructureNV accelerationStructure, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyAccelerationStructureNV(@NonNull VkDevice device, long accelerationStructure, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyAccelerationStructureNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyAccelerationStructureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyAccelerationStructureNV", device, accelerationStructure, pAllocator); }
        Handles.MH_vkDestroyAccelerationStructureNV.get().invokeExact(device.capabilities().PFN_vkDestroyAccelerationStructureNV, device.segment(), accelerationStructure, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyAccelerationStructureNV", e); }
    }

    /// Invokes `vkGetAccelerationStructureMemoryRequirementsNV`.
    /// ```
    /// void vkGetAccelerationStructureMemoryRequirementsNV((struct VkDevice*) VkDevice device, const VkAccelerationStructureMemoryRequirementsInfoNV* pInfo, VkMemoryRequirements2KHR* pMemoryRequirements);
    /// ```
    public static void vkGetAccelerationStructureMemoryRequirementsNV(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureMemoryRequirementsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAccelerationStructureMemoryRequirementsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetAccelerationStructureMemoryRequirementsNV", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetAccelerationStructureMemoryRequirementsNV.get().invokeExact(device.capabilities().PFN_vkGetAccelerationStructureMemoryRequirementsNV, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureMemoryRequirementsNV", e); }
    }

    /// Invokes `vkBindAccelerationStructureMemoryNV`.
    /// ```
    /// (int) VkResult vkBindAccelerationStructureMemoryNV((struct VkDevice*) VkDevice device, uint32_t bindInfoCount, const VkBindAccelerationStructureMemoryInfoNV* pBindInfos);
    /// ```
    public static int vkBindAccelerationStructureMemoryNV(@NonNull VkDevice device, int bindInfoCount, @NonNull MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindAccelerationStructureMemoryNV)) throw new VKSymbolNotFoundError("Symbol not found: vkBindAccelerationStructureMemoryNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindAccelerationStructureMemoryNV", device, bindInfoCount, pBindInfos); }
        return (int) Handles.MH_vkBindAccelerationStructureMemoryNV.get().invokeExact(device.capabilities().PFN_vkBindAccelerationStructureMemoryNV, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindAccelerationStructureMemoryNV", e); }
    }

    /// Invokes `vkCmdBuildAccelerationStructureNV`.
    /// ```
    /// void vkCmdBuildAccelerationStructureNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkAccelerationStructureInfoNV* pInfo, (uint64_t) VkBuffer instanceData, (uint64_t) VkDeviceSize instanceOffset, (uint32_t) VkBool32 update, (uint64_t) VkAccelerationStructureNV dst, (uint64_t) VkAccelerationStructureNV src, (uint64_t) VkBuffer scratch, (uint64_t) VkDeviceSize scratchOffset);
    /// ```
    public static void vkCmdBuildAccelerationStructureNV(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pInfo, long instanceData, long instanceOffset, int update, long dst, long src, long scratch, long scratchOffset) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructureNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBuildAccelerationStructureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBuildAccelerationStructureNV", commandBuffer, pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset); }
        Handles.MH_vkCmdBuildAccelerationStructureNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBuildAccelerationStructureNV, commandBuffer.segment(), pInfo, instanceData, instanceOffset, update, dst, src, scratch, scratchOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBuildAccelerationStructureNV", e); }
    }

    /// Invokes `vkCmdCopyAccelerationStructureNV`.
    /// ```
    /// void vkCmdCopyAccelerationStructureNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkAccelerationStructureNV dst, (uint64_t) VkAccelerationStructureNV src, (int) VkCopyAccelerationStructureModeKHR mode);
    /// ```
    public static void vkCmdCopyAccelerationStructureNV(@NonNull VkCommandBuffer commandBuffer, long dst, long src, int mode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyAccelerationStructureNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyAccelerationStructureNV", commandBuffer, dst, src, mode); }
        Handles.MH_vkCmdCopyAccelerationStructureNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyAccelerationStructureNV, commandBuffer.segment(), dst, src, mode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyAccelerationStructureNV", e); }
    }

    /// Invokes `vkCmdTraceRaysNV`.
    /// ```
    /// void vkCmdTraceRaysNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer raygenShaderBindingTableBuffer, (uint64_t) VkDeviceSize raygenShaderBindingOffset, (uint64_t) VkBuffer missShaderBindingTableBuffer, (uint64_t) VkDeviceSize missShaderBindingOffset, (uint64_t) VkDeviceSize missShaderBindingStride, (uint64_t) VkBuffer hitShaderBindingTableBuffer, (uint64_t) VkDeviceSize hitShaderBindingOffset, (uint64_t) VkDeviceSize hitShaderBindingStride, (uint64_t) VkBuffer callableShaderBindingTableBuffer, (uint64_t) VkDeviceSize callableShaderBindingOffset, (uint64_t) VkDeviceSize callableShaderBindingStride, uint32_t width, uint32_t height, uint32_t depth);
    /// ```
    public static void vkCmdTraceRaysNV(@NonNull VkCommandBuffer commandBuffer, long raygenShaderBindingTableBuffer, long raygenShaderBindingOffset, long missShaderBindingTableBuffer, long missShaderBindingOffset, long missShaderBindingStride, long hitShaderBindingTableBuffer, long hitShaderBindingOffset, long hitShaderBindingStride, long callableShaderBindingTableBuffer, long callableShaderBindingOffset, long callableShaderBindingStride, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdTraceRaysNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdTraceRaysNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdTraceRaysNV", commandBuffer, raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth); }
        Handles.MH_vkCmdTraceRaysNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdTraceRaysNV, commandBuffer.segment(), raygenShaderBindingTableBuffer, raygenShaderBindingOffset, missShaderBindingTableBuffer, missShaderBindingOffset, missShaderBindingStride, hitShaderBindingTableBuffer, hitShaderBindingOffset, hitShaderBindingStride, callableShaderBindingTableBuffer, callableShaderBindingOffset, callableShaderBindingStride, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysNV", e); }
    }

    /// Invokes `vkCreateRayTracingPipelinesNV`.
    /// ```
    /// (int) VkResult vkCreateRayTracingPipelinesNV((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkRayTracingPipelineCreateInfoNV* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateRayTracingPipelinesNV(@NonNull VkDevice device, long pipelineCache, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateRayTracingPipelinesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateRayTracingPipelinesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateRayTracingPipelinesNV", device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        return (int) Handles.MH_vkCreateRayTracingPipelinesNV.get().invokeExact(device.capabilities().PFN_vkCreateRayTracingPipelinesNV, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRayTracingPipelinesNV", e); }
    }

    /// Invokes `vkGetRayTracingShaderGroupHandlesNV`.
    /// ```
    /// (int) VkResult vkGetRayTracingShaderGroupHandlesNV((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void* pData);
    /// ```
    public static int vkGetRayTracingShaderGroupHandlesNV(@NonNull VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRayTracingShaderGroupHandlesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupHandlesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRayTracingShaderGroupHandlesNV", device, pipeline, firstGroup, groupCount, dataSize, pData); }
        return (int) Handles.MH_vkGetRayTracingShaderGroupHandlesNV.get().invoke(device.capabilities().PFN_vkGetRayTracingShaderGroupHandlesNV, device.segment(), pipeline, firstGroup, groupCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingShaderGroupHandlesNV", e); }
    }

    /// Invokes `vkGetAccelerationStructureHandleNV`.
    /// ```
    /// (int) VkResult vkGetAccelerationStructureHandleNV((struct VkDevice*) VkDevice device, (uint64_t) VkAccelerationStructureNV accelerationStructure, size_t dataSize, void* pData);
    /// ```
    public static int vkGetAccelerationStructureHandleNV(@NonNull VkDevice device, long accelerationStructure, long dataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureHandleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAccelerationStructureHandleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetAccelerationStructureHandleNV", device, accelerationStructure, dataSize, pData); }
        return (int) Handles.MH_vkGetAccelerationStructureHandleNV.get().invoke(device.capabilities().PFN_vkGetAccelerationStructureHandleNV, device.segment(), accelerationStructure, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureHandleNV", e); }
    }

    /// Invokes `vkCmdWriteAccelerationStructuresPropertiesNV`.
    /// ```
    /// void vkCmdWriteAccelerationStructuresPropertiesNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t accelerationStructureCount, const VkAccelerationStructureNV* pAccelerationStructures, (int) VkQueryType queryType, (uint64_t) VkQueryPool queryPool, uint32_t firstQuery);
    /// ```
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(@NonNull VkCommandBuffer commandBuffer, int accelerationStructureCount, @NonNull MemorySegment pAccelerationStructures, int queryType, long queryPool, int firstQuery) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteAccelerationStructuresPropertiesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteAccelerationStructuresPropertiesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdWriteAccelerationStructuresPropertiesNV", commandBuffer, accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        Handles.MH_vkCmdWriteAccelerationStructuresPropertiesNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteAccelerationStructuresPropertiesNV, commandBuffer.segment(), accelerationStructureCount, pAccelerationStructures, queryType, queryPool, firstQuery); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteAccelerationStructuresPropertiesNV", e); }
    }

    /// Invokes `vkCompileDeferredNV`.
    /// ```
    /// (int) VkResult vkCompileDeferredNV((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, uint32_t shader);
    /// ```
    public static int vkCompileDeferredNV(@NonNull VkDevice device, long pipeline, int shader) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCompileDeferredNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCompileDeferredNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCompileDeferredNV", device, pipeline, shader); }
        return (int) Handles.MH_vkCompileDeferredNV.get().invokeExact(device.capabilities().PFN_vkCompileDeferredNV, device.segment(), pipeline, shader); }
        catch (Throwable e) { throw new RuntimeException("error in vkCompileDeferredNV", e); }
    }

}
