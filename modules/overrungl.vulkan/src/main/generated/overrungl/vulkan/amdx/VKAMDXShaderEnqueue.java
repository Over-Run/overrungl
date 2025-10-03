// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.amdx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_AMDX_shader_enqueue` - device extension
public final class VKAMDXShaderEnqueue {
    public static final int VK_AMDX_SHADER_ENQUEUE_SPEC_VERSION = 2;
    public static final String VK_AMDX_SHADER_ENQUEUE_EXTENSION_NAME = "VK_AMDX_shader_enqueue";
    public static final int VK_SHADER_INDEX_UNUSED_AMDX = (~0);
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX = 1000134000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX = 1000134001;
    public static final int VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_SCRATCH_SIZE_AMDX = 1000134002;
    public static final int VK_STRUCTURE_TYPE_EXECUTION_GRAPH_PIPELINE_CREATE_INFO_AMDX = 1000134003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX = 1000134004;
    public static final int VK_BUFFER_USAGE_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 0x02000000;
    public static final int VK_PIPELINE_BIND_POINT_EXECUTION_GRAPH_AMDX = 1000134000;
    public static final long VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX = 0x02000000L;
    public static final long VK_PIPELINE_CREATE_2_EXECUTION_GRAPH_BIT_AMDX = 0x100000000L;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCreateExecutionGraphPipelinesAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetExecutionGraphPipelineScratchSizeAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetExecutionGraphPipelineNodeIndexAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdInitializeGraphScratchMemoryAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        public static final Supplier<MethodHandle> MH_vkCmdDispatchGraphAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdDispatchGraphIndirectAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdDispatchGraphIndirectCountAMDX = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)));
        private Handles() {}
    }

    private VKAMDXShaderEnqueue() {}

    /// Invokes `vkCreateExecutionGraphPipelinesAMDX`.
    /// ```
    /// (int) VkResult vkCreateExecutionGraphPipelinesAMDX((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkExecutionGraphPipelineCreateInfoAMDX* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateExecutionGraphPipelinesAMDX(@NonNull VkDevice device, long pipelineCache, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateExecutionGraphPipelinesAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateExecutionGraphPipelinesAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateExecutionGraphPipelinesAMDX", device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        return (int) Handles.MH_vkCreateExecutionGraphPipelinesAMDX.get().invokeExact(device.capabilities().PFN_vkCreateExecutionGraphPipelinesAMDX, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateExecutionGraphPipelinesAMDX", e); }
    }

    /// Invokes `vkGetExecutionGraphPipelineScratchSizeAMDX`.
    /// ```
    /// (int) VkResult vkGetExecutionGraphPipelineScratchSizeAMDX((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline executionGraph, VkExecutionGraphPipelineScratchSizeAMDX* pSizeInfo);
    /// ```
    public static int vkGetExecutionGraphPipelineScratchSizeAMDX(@NonNull VkDevice device, long executionGraph, @NonNull MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetExecutionGraphPipelineScratchSizeAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineScratchSizeAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetExecutionGraphPipelineScratchSizeAMDX", device, executionGraph, pSizeInfo); }
        return (int) Handles.MH_vkGetExecutionGraphPipelineScratchSizeAMDX.get().invokeExact(device.capabilities().PFN_vkGetExecutionGraphPipelineScratchSizeAMDX, device.segment(), executionGraph, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExecutionGraphPipelineScratchSizeAMDX", e); }
    }

    /// Invokes `vkGetExecutionGraphPipelineNodeIndexAMDX`.
    /// ```
    /// (int) VkResult vkGetExecutionGraphPipelineNodeIndexAMDX((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline executionGraph, const VkPipelineShaderStageNodeCreateInfoAMDX* pNodeInfo, uint32_t* pNodeIndex);
    /// ```
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(@NonNull VkDevice device, long executionGraph, @NonNull MemorySegment pNodeInfo, @NonNull MemorySegment pNodeIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetExecutionGraphPipelineNodeIndexAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineNodeIndexAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetExecutionGraphPipelineNodeIndexAMDX", device, executionGraph, pNodeInfo, pNodeIndex); }
        return (int) Handles.MH_vkGetExecutionGraphPipelineNodeIndexAMDX.get().invokeExact(device.capabilities().PFN_vkGetExecutionGraphPipelineNodeIndexAMDX, device.segment(), executionGraph, pNodeInfo, pNodeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExecutionGraphPipelineNodeIndexAMDX", e); }
    }

    /// Invokes `vkCmdInitializeGraphScratchMemoryAMDX`.
    /// ```
    /// void vkCmdInitializeGraphScratchMemoryAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkPipeline executionGraph, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize);
    /// ```
    public static void vkCmdInitializeGraphScratchMemoryAMDX(@NonNull VkCommandBuffer commandBuffer, long executionGraph, long scratch, long scratchSize) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdInitializeGraphScratchMemoryAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdInitializeGraphScratchMemoryAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdInitializeGraphScratchMemoryAMDX", commandBuffer, executionGraph, scratch, scratchSize); }
        Handles.MH_vkCmdInitializeGraphScratchMemoryAMDX.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdInitializeGraphScratchMemoryAMDX, commandBuffer.segment(), executionGraph, scratch, scratchSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdInitializeGraphScratchMemoryAMDX", e); }
    }

    /// Invokes `vkCmdDispatchGraphAMDX`.
    /// ```
    /// void vkCmdDispatchGraphAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize, const VkDispatchGraphCountInfoAMDX* pCountInfo);
    /// ```
    public static void vkCmdDispatchGraphAMDX(@NonNull VkCommandBuffer commandBuffer, long scratch, long scratchSize, @NonNull MemorySegment pCountInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchGraphAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchGraphAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatchGraphAMDX", commandBuffer, scratch, scratchSize, pCountInfo); }
        Handles.MH_vkCmdDispatchGraphAMDX.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchGraphAMDX, commandBuffer.segment(), scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphAMDX", e); }
    }

    /// Invokes `vkCmdDispatchGraphIndirectAMDX`.
    /// ```
    /// void vkCmdDispatchGraphIndirectAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize, const VkDispatchGraphCountInfoAMDX* pCountInfo);
    /// ```
    public static void vkCmdDispatchGraphIndirectAMDX(@NonNull VkCommandBuffer commandBuffer, long scratch, long scratchSize, @NonNull MemorySegment pCountInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatchGraphIndirectAMDX", commandBuffer, scratch, scratchSize, pCountInfo); }
        Handles.MH_vkCmdDispatchGraphIndirectAMDX.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectAMDX, commandBuffer.segment(), scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphIndirectAMDX", e); }
    }

    /// Invokes `vkCmdDispatchGraphIndirectCountAMDX`.
    /// ```
    /// void vkCmdDispatchGraphIndirectCountAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize, (uint64_t) VkDeviceAddress countInfo);
    /// ```
    public static void vkCmdDispatchGraphIndirectCountAMDX(@NonNull VkCommandBuffer commandBuffer, long scratch, long scratchSize, long countInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectCountAMDX)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectCountAMDX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDispatchGraphIndirectCountAMDX", commandBuffer, scratch, scratchSize, countInfo); }
        Handles.MH_vkCmdDispatchGraphIndirectCountAMDX.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectCountAMDX, commandBuffer.segment(), scratch, scratchSize, countInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphIndirectCountAMDX", e); }
    }

}
