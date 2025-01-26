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
public class VKAMDXShaderEnqueue {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateExecutionGraphPipelinesAMDX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetExecutionGraphPipelineScratchSizeAMDX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetExecutionGraphPipelineNodeIndexAMDX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdInitializeGraphScratchMemoryAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkCmdDispatchGraphAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDispatchGraphIndirectAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDispatchGraphIndirectCountAMDX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_vkCreateExecutionGraphPipelinesAMDX;
        public final MemorySegment PFN_vkGetExecutionGraphPipelineScratchSizeAMDX;
        public final MemorySegment PFN_vkGetExecutionGraphPipelineNodeIndexAMDX;
        public final MemorySegment PFN_vkCmdInitializeGraphScratchMemoryAMDX;
        public final MemorySegment PFN_vkCmdDispatchGraphAMDX;
        public final MemorySegment PFN_vkCmdDispatchGraphIndirectAMDX;
        public final MemorySegment PFN_vkCmdDispatchGraphIndirectCountAMDX;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateExecutionGraphPipelinesAMDX = func.invoke(device, "vkCreateExecutionGraphPipelinesAMDX");
            PFN_vkGetExecutionGraphPipelineScratchSizeAMDX = func.invoke(device, "vkGetExecutionGraphPipelineScratchSizeAMDX");
            PFN_vkGetExecutionGraphPipelineNodeIndexAMDX = func.invoke(device, "vkGetExecutionGraphPipelineNodeIndexAMDX");
            PFN_vkCmdInitializeGraphScratchMemoryAMDX = func.invoke(device, "vkCmdInitializeGraphScratchMemoryAMDX");
            PFN_vkCmdDispatchGraphAMDX = func.invoke(device, "vkCmdDispatchGraphAMDX");
            PFN_vkCmdDispatchGraphIndirectAMDX = func.invoke(device, "vkCmdDispatchGraphIndirectAMDX");
            PFN_vkCmdDispatchGraphIndirectCountAMDX = func.invoke(device, "vkCmdDispatchGraphIndirectCountAMDX");
        }
    }

    public VKAMDXShaderEnqueue(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateExecutionGraphPipelinesAMDX(VkDevice device, VkPipelineCache pipelineCache, uint32_t createInfoCount, const VkExecutionGraphPipelineCreateInfoAMDX* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkPipeline* pPipelines);
    /// ```
    public int CreateExecutionGraphPipelinesAMDX(MemorySegment device, long pipelineCache, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pPipelines) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateExecutionGraphPipelinesAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCreateExecutionGraphPipelinesAMDX");
        try { return (int) Handles.MH_vkCreateExecutionGraphPipelinesAMDX.invokeExact(handles.PFN_vkCreateExecutionGraphPipelinesAMDX, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in CreateExecutionGraphPipelinesAMDX", e); }
    }

    /// ```
    /// VkResult vkGetExecutionGraphPipelineScratchSizeAMDX(VkDevice device, VkPipeline executionGraph, VkExecutionGraphPipelineScratchSizeAMDX* pSizeInfo);
    /// ```
    public int GetExecutionGraphPipelineScratchSizeAMDX(MemorySegment device, long executionGraph, MemorySegment pSizeInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetExecutionGraphPipelineScratchSizeAMDX)) throw new SymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineScratchSizeAMDX");
        try { return (int) Handles.MH_vkGetExecutionGraphPipelineScratchSizeAMDX.invokeExact(handles.PFN_vkGetExecutionGraphPipelineScratchSizeAMDX, device, executionGraph, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetExecutionGraphPipelineScratchSizeAMDX", e); }
    }

    /// ```
    /// VkResult vkGetExecutionGraphPipelineNodeIndexAMDX(VkDevice device, VkPipeline executionGraph, const VkPipelineShaderStageNodeCreateInfoAMDX* pNodeInfo, uint32_t* pNodeIndex);
    /// ```
    public int GetExecutionGraphPipelineNodeIndexAMDX(MemorySegment device, long executionGraph, MemorySegment pNodeInfo, MemorySegment pNodeIndex) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetExecutionGraphPipelineNodeIndexAMDX)) throw new SymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineNodeIndexAMDX");
        try { return (int) Handles.MH_vkGetExecutionGraphPipelineNodeIndexAMDX.invokeExact(handles.PFN_vkGetExecutionGraphPipelineNodeIndexAMDX, device, executionGraph, pNodeInfo, pNodeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in GetExecutionGraphPipelineNodeIndexAMDX", e); }
    }

    /// ```
    /// void vkCmdInitializeGraphScratchMemoryAMDX(VkCommandBuffer commandBuffer, VkPipeline executionGraph, VkDeviceAddress scratch, VkDeviceSize scratchSize);
    /// ```
    public void CmdInitializeGraphScratchMemoryAMDX(MemorySegment commandBuffer, long executionGraph, long scratch, long scratchSize) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdInitializeGraphScratchMemoryAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdInitializeGraphScratchMemoryAMDX");
        try { Handles.MH_vkCmdInitializeGraphScratchMemoryAMDX.invokeExact(handles.PFN_vkCmdInitializeGraphScratchMemoryAMDX, commandBuffer, executionGraph, scratch, scratchSize); }
        catch (Throwable e) { throw new RuntimeException("error in CmdInitializeGraphScratchMemoryAMDX", e); }
    }

    /// ```
    /// void vkCmdDispatchGraphAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, const VkDispatchGraphCountInfoAMDX* pCountInfo);
    /// ```
    public void CmdDispatchGraphAMDX(MemorySegment commandBuffer, long scratch, long scratchSize, MemorySegment pCountInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDispatchGraphAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphAMDX");
        try { Handles.MH_vkCmdDispatchGraphAMDX.invokeExact(handles.PFN_vkCmdDispatchGraphAMDX, commandBuffer, scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDispatchGraphAMDX", e); }
    }

    /// ```
    /// void vkCmdDispatchGraphIndirectAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, const VkDispatchGraphCountInfoAMDX* pCountInfo);
    /// ```
    public void CmdDispatchGraphIndirectAMDX(MemorySegment commandBuffer, long scratch, long scratchSize, MemorySegment pCountInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDispatchGraphIndirectAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectAMDX");
        try { Handles.MH_vkCmdDispatchGraphIndirectAMDX.invokeExact(handles.PFN_vkCmdDispatchGraphIndirectAMDX, commandBuffer, scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDispatchGraphIndirectAMDX", e); }
    }

    /// ```
    /// void vkCmdDispatchGraphIndirectCountAMDX(VkCommandBuffer commandBuffer, VkDeviceAddress scratch, VkDeviceSize scratchSize, VkDeviceAddress countInfo);
    /// ```
    public void CmdDispatchGraphIndirectCountAMDX(MemorySegment commandBuffer, long scratch, long scratchSize, long countInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDispatchGraphIndirectCountAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectCountAMDX");
        try { Handles.MH_vkCmdDispatchGraphIndirectCountAMDX.invokeExact(handles.PFN_vkCmdDispatchGraphIndirectCountAMDX, commandBuffer, scratch, scratchSize, countInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDispatchGraphIndirectCountAMDX", e); }
    }

}
