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
package overrungl.vulkan.amdx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
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
        public static final MethodHandle MH_vkCreateExecutionGraphPipelinesAMDX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetExecutionGraphPipelineScratchSizeAMDX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetExecutionGraphPipelineNodeIndexAMDX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdInitializeGraphScratchMemoryAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdDispatchGraphAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDispatchGraphIndirectAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDispatchGraphIndirectCountAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    private VKAMDXShaderEnqueue() {}

    /// ```
    /// (int) VkResult vkCreateExecutionGraphPipelinesAMDX((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkExecutionGraphPipelineCreateInfoAMDX* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public static int vkCreateExecutionGraphPipelinesAMDX(VkDevice device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateExecutionGraphPipelinesAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCreateExecutionGraphPipelinesAMDX");
        try { return (int) Handles.MH_vkCreateExecutionGraphPipelinesAMDX.invokeExact(device.capabilities().PFN_vkCreateExecutionGraphPipelinesAMDX, device.segment(), pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateExecutionGraphPipelinesAMDX", e); }
    }

    /// ```
    /// (int) VkResult vkGetExecutionGraphPipelineScratchSizeAMDX((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline executionGraph, VkExecutionGraphPipelineScratchSizeAMDX* pSizeInfo);
    /// ```
    public static int vkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, long executionGraph, MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetExecutionGraphPipelineScratchSizeAMDX)) throw new SymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineScratchSizeAMDX");
        try { return (int) Handles.MH_vkGetExecutionGraphPipelineScratchSizeAMDX.invokeExact(device.capabilities().PFN_vkGetExecutionGraphPipelineScratchSizeAMDX, device.segment(), executionGraph, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExecutionGraphPipelineScratchSizeAMDX", e); }
    }

    /// ```
    /// (int) VkResult vkGetExecutionGraphPipelineNodeIndexAMDX((struct VkDevice*) VkDevice device, (uint64_t) VkPipeline executionGraph, const VkPipelineShaderStageNodeCreateInfoAMDX* pNodeInfo, uint32_t* pNodeIndex);
    /// ```
    public static int vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, long executionGraph, MemorySegment pNodeInfo, MemorySegment pNodeIndex) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetExecutionGraphPipelineNodeIndexAMDX)) throw new SymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineNodeIndexAMDX");
        try { return (int) Handles.MH_vkGetExecutionGraphPipelineNodeIndexAMDX.invokeExact(device.capabilities().PFN_vkGetExecutionGraphPipelineNodeIndexAMDX, device.segment(), executionGraph, pNodeInfo, pNodeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExecutionGraphPipelineNodeIndexAMDX", e); }
    }

    /// ```
    /// void vkCmdInitializeGraphScratchMemoryAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkPipeline executionGraph, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize);
    /// ```
    public static void vkCmdInitializeGraphScratchMemoryAMDX(VkCommandBuffer commandBuffer, long executionGraph, long scratch, long scratchSize) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdInitializeGraphScratchMemoryAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdInitializeGraphScratchMemoryAMDX");
        try { Handles.MH_vkCmdInitializeGraphScratchMemoryAMDX.invokeExact(commandBuffer.capabilities().PFN_vkCmdInitializeGraphScratchMemoryAMDX, commandBuffer.segment(), executionGraph, scratch, scratchSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdInitializeGraphScratchMemoryAMDX", e); }
    }

    /// ```
    /// void vkCmdDispatchGraphAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize, const VkDispatchGraphCountInfoAMDX* pCountInfo);
    /// ```
    public static void vkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, MemorySegment pCountInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchGraphAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphAMDX");
        try { Handles.MH_vkCmdDispatchGraphAMDX.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchGraphAMDX, commandBuffer.segment(), scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphAMDX", e); }
    }

    /// ```
    /// void vkCmdDispatchGraphIndirectAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize, const VkDispatchGraphCountInfoAMDX* pCountInfo);
    /// ```
    public static void vkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, MemorySegment pCountInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectAMDX");
        try { Handles.MH_vkCmdDispatchGraphIndirectAMDX.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectAMDX, commandBuffer.segment(), scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphIndirectAMDX", e); }
    }

    /// ```
    /// void vkCmdDispatchGraphIndirectCountAMDX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress scratch, (uint64_t) VkDeviceSize scratchSize, (uint64_t) VkDeviceAddress countInfo);
    /// ```
    public static void vkCmdDispatchGraphIndirectCountAMDX(VkCommandBuffer commandBuffer, long scratch, long scratchSize, long countInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectCountAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectCountAMDX");
        try { Handles.MH_vkCmdDispatchGraphIndirectCountAMDX.invokeExact(commandBuffer.capabilities().PFN_vkCmdDispatchGraphIndirectCountAMDX, commandBuffer.segment(), scratch, scratchSize, countInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphIndirectCountAMDX", e); }
    }

}
