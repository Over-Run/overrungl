// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_ray_tracing_pipeline` - device extension
public final class VKKHRRayTracingPipeline {
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
    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_SKIP_BUILT_IN_PRIMITIVES_BIT_KHR = 0x00001000L;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdTraceRaysKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateRayTracingPipelinesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupHandlesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdTraceRaysIndirectKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetRayTracingShaderGroupStackSizeKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRayTracingPipelineStackSizeKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKKHRRayTracingPipeline() {}

    /// Invokes `vkCmdTraceRaysKHR`.
    /// ```
    /// void vkCmdTraceRaysKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkStridedDeviceAddressRegionKHR* pRaygenShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pMissShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pHitShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pCallableShaderBindingTable, uint32_t width, uint32_t height, uint32_t depth);
    /// ```
    public static void vkCmdTraceRaysKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRaygenShaderBindingTable, @NonNull MemorySegment pMissShaderBindingTable, @NonNull MemorySegment pHitShaderBindingTable, @NonNull MemorySegment pCallableShaderBindingTable, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdTraceRaysKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdTraceRaysKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdTraceRaysKHR", commandBuffer, pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth); }
        Handles.MH_vkCmdTraceRaysKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdTraceRaysKHR, commandBuffer.segment(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysKHR", e); }
    }

    /// Invokes `vkCreateRayTracingPipelinesKHR`.
    /// ```
    /// (int) VkResult vkCreateRayTracingPipelinesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR deferredOperation, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkRayTracingPipelineCreateInfoKHR* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateRayTracingPipelinesKHR(@NonNull VkDevice device, long deferredOperation, long pipelineCache, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateRayTracingPipelinesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateRayTracingPipelinesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateRayTracingPipelinesKHR", device, deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        return (int) Handles.MH_vkCreateRayTracingPipelinesKHR.invokeExact(device.capabilities().PFN_vkCreateRayTracingPipelinesKHR, device.segment(), deferredOperation, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateRayTracingPipelinesKHR", e); }
    }

    /// Invokes `vkGetRayTracingShaderGroupHandlesKHR`.
    /// ```
    /// (int) VkResult vkGetRayTracingShaderGroupHandlesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void* pData);
    /// ```
    public static int vkGetRayTracingShaderGroupHandlesKHR(@NonNull VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRayTracingShaderGroupHandlesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupHandlesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRayTracingShaderGroupHandlesKHR", device, pipeline, firstGroup, groupCount, dataSize, pData); }
        return (int) Handles.MH_vkGetRayTracingShaderGroupHandlesKHR.invoke(device.capabilities().PFN_vkGetRayTracingShaderGroupHandlesKHR, device.segment(), pipeline, firstGroup, groupCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingShaderGroupHandlesKHR", e); }
    }

    /// Invokes `vkGetRayTracingCaptureReplayShaderGroupHandlesKHR`.
    /// ```
    /// (int) VkResult vkGetRayTracingCaptureReplayShaderGroupHandlesKHR((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, uint32_t firstGroup, uint32_t groupCount, size_t dataSize, void* pData);
    /// ```
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(@NonNull VkDevice device, long pipeline, int firstGroup, int groupCount, long dataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRayTracingCaptureReplayShaderGroupHandlesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", device, pipeline, firstGroup, groupCount, dataSize, pData); }
        return (int) Handles.MH_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR.invoke(device.capabilities().PFN_vkGetRayTracingCaptureReplayShaderGroupHandlesKHR, device.segment(), pipeline, firstGroup, groupCount, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", e); }
    }

    /// Invokes `vkCmdTraceRaysIndirectKHR`.
    /// ```
    /// void vkCmdTraceRaysIndirectKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkStridedDeviceAddressRegionKHR* pRaygenShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pMissShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pHitShaderBindingTable, const VkStridedDeviceAddressRegionKHR* pCallableShaderBindingTable, (uint64_t) VkDeviceAddress indirectDeviceAddress);
    /// ```
    public static void vkCmdTraceRaysIndirectKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pRaygenShaderBindingTable, @NonNull MemorySegment pMissShaderBindingTable, @NonNull MemorySegment pHitShaderBindingTable, @NonNull MemorySegment pCallableShaderBindingTable, long indirectDeviceAddress) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdTraceRaysIndirectKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdTraceRaysIndirectKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdTraceRaysIndirectKHR", commandBuffer, pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress); }
        Handles.MH_vkCmdTraceRaysIndirectKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdTraceRaysIndirectKHR, commandBuffer.segment(), pRaygenShaderBindingTable, pMissShaderBindingTable, pHitShaderBindingTable, pCallableShaderBindingTable, indirectDeviceAddress); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysIndirectKHR", e); }
    }

    /// Invokes `vkGetRayTracingShaderGroupStackSizeKHR`.
    /// ```
    /// (uint64_t) VkDeviceSize vkGetRayTracingShaderGroupStackSizeKHR((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline pipeline, uint32_t group, (int) VkShaderGroupShaderKHR groupShader);
    /// ```
    public static long vkGetRayTracingShaderGroupStackSizeKHR(@NonNull VkDevice device, long pipeline, int group, int groupShader) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRayTracingShaderGroupStackSizeKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRayTracingShaderGroupStackSizeKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRayTracingShaderGroupStackSizeKHR", device, pipeline, group, groupShader); }
        return (long) Handles.MH_vkGetRayTracingShaderGroupStackSizeKHR.invokeExact(device.capabilities().PFN_vkGetRayTracingShaderGroupStackSizeKHR, device.segment(), pipeline, group, groupShader); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRayTracingShaderGroupStackSizeKHR", e); }
    }

    /// Invokes `vkCmdSetRayTracingPipelineStackSizeKHR`.
    /// ```
    /// void vkCmdSetRayTracingPipelineStackSizeKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t pipelineStackSize);
    /// ```
    public static void vkCmdSetRayTracingPipelineStackSizeKHR(@NonNull VkCommandBuffer commandBuffer, int pipelineStackSize) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRayTracingPipelineStackSizeKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRayTracingPipelineStackSizeKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRayTracingPipelineStackSizeKHR", commandBuffer, pipelineStackSize); }
        Handles.MH_vkCmdSetRayTracingPipelineStackSizeKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRayTracingPipelineStackSizeKHR, commandBuffer.segment(), pipelineStackSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRayTracingPipelineStackSizeKHR", e); }
    }

}
