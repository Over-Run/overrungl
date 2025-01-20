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
import overrungl.annotation.*;
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
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateExecutionGraphPipelinesAMDX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetExecutionGraphPipelineScratchSizeAMDX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetExecutionGraphPipelineNodeIndexAMDX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdInitializeGraphScratchMemoryAMDX = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkCmdDispatchGraphAMDX = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdDispatchGraphIndirectAMDX = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdDispatchGraphIndirectCountAMDX = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateExecutionGraphPipelinesAMDX = RuntimeHelper.downcall(Descriptors.FD_vkCreateExecutionGraphPipelinesAMDX);
        public static final MethodHandle MH_vkGetExecutionGraphPipelineScratchSizeAMDX = RuntimeHelper.downcall(Descriptors.FD_vkGetExecutionGraphPipelineScratchSizeAMDX);
        public static final MethodHandle MH_vkGetExecutionGraphPipelineNodeIndexAMDX = RuntimeHelper.downcall(Descriptors.FD_vkGetExecutionGraphPipelineNodeIndexAMDX);
        public static final MethodHandle MH_vkCmdInitializeGraphScratchMemoryAMDX = RuntimeHelper.downcall(Descriptors.FD_vkCmdInitializeGraphScratchMemoryAMDX);
        public static final MethodHandle MH_vkCmdDispatchGraphAMDX = RuntimeHelper.downcall(Descriptors.FD_vkCmdDispatchGraphAMDX);
        public static final MethodHandle MH_vkCmdDispatchGraphIndirectAMDX = RuntimeHelper.downcall(Descriptors.FD_vkCmdDispatchGraphIndirectAMDX);
        public static final MethodHandle MH_vkCmdDispatchGraphIndirectCountAMDX = RuntimeHelper.downcall(Descriptors.FD_vkCmdDispatchGraphIndirectCountAMDX);
        public final MemorySegment PFN_vkCreateExecutionGraphPipelinesAMDX;
        public final MemorySegment PFN_vkGetExecutionGraphPipelineScratchSizeAMDX;
        public final MemorySegment PFN_vkGetExecutionGraphPipelineNodeIndexAMDX;
        public final MemorySegment PFN_vkCmdInitializeGraphScratchMemoryAMDX;
        public final MemorySegment PFN_vkCmdDispatchGraphAMDX;
        public final MemorySegment PFN_vkCmdDispatchGraphIndirectAMDX;
        public final MemorySegment PFN_vkCmdDispatchGraphIndirectCountAMDX;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateExecutionGraphPipelinesAMDX = func.invoke(device, "vkCreateExecutionGraphPipelinesAMDX");
            PFN_vkGetExecutionGraphPipelineScratchSizeAMDX = func.invoke(device, "vkGetExecutionGraphPipelineScratchSizeAMDX");
            PFN_vkGetExecutionGraphPipelineNodeIndexAMDX = func.invoke(device, "vkGetExecutionGraphPipelineNodeIndexAMDX");
            PFN_vkCmdInitializeGraphScratchMemoryAMDX = func.invoke(device, "vkCmdInitializeGraphScratchMemoryAMDX");
            PFN_vkCmdDispatchGraphAMDX = func.invoke(device, "vkCmdDispatchGraphAMDX");
            PFN_vkCmdDispatchGraphIndirectAMDX = func.invoke(device, "vkCmdDispatchGraphIndirectAMDX");
            PFN_vkCmdDispatchGraphIndirectCountAMDX = func.invoke(device, "vkCmdDispatchGraphIndirectCountAMDX");
        }
    }

    public VKAMDXShaderEnqueue(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreateExecutionGraphPipelinesAMDX(@CType("VkDevice") MemorySegment device, @CType("VkPipelineCache") MemorySegment pipelineCache, @CType("uint32_t") int createInfoCount, @CType("const VkExecutionGraphPipelineCreateInfoAMDX *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipeline *") MemorySegment pPipelines) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateExecutionGraphPipelinesAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCreateExecutionGraphPipelinesAMDX");
        try { return (int) Handles.MH_vkCreateExecutionGraphPipelinesAMDX.invokeExact(handles.PFN_vkCreateExecutionGraphPipelinesAMDX, device, pipelineCache, createInfoCount, pCreateInfos, pAllocator, pPipelines); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateExecutionGraphPipelinesAMDX", e); }
    }

    public @CType("VkResult") int GetExecutionGraphPipelineScratchSizeAMDX(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment executionGraph, @CType("VkExecutionGraphPipelineScratchSizeAMDX *") MemorySegment pSizeInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetExecutionGraphPipelineScratchSizeAMDX)) throw new SymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineScratchSizeAMDX");
        try { return (int) Handles.MH_vkGetExecutionGraphPipelineScratchSizeAMDX.invokeExact(handles.PFN_vkGetExecutionGraphPipelineScratchSizeAMDX, device, executionGraph, pSizeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExecutionGraphPipelineScratchSizeAMDX", e); }
    }

    public @CType("VkResult") int GetExecutionGraphPipelineNodeIndexAMDX(@CType("VkDevice") MemorySegment device, @CType("VkPipeline") MemorySegment executionGraph, @CType("const VkPipelineShaderStageNodeCreateInfoAMDX *") MemorySegment pNodeInfo, @CType("uint32_t *") MemorySegment pNodeIndex) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetExecutionGraphPipelineNodeIndexAMDX)) throw new SymbolNotFoundError("Symbol not found: vkGetExecutionGraphPipelineNodeIndexAMDX");
        try { return (int) Handles.MH_vkGetExecutionGraphPipelineNodeIndexAMDX.invokeExact(handles.PFN_vkGetExecutionGraphPipelineNodeIndexAMDX, device, executionGraph, pNodeInfo, pNodeIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetExecutionGraphPipelineNodeIndexAMDX", e); }
    }

    public void CmdInitializeGraphScratchMemoryAMDX(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipeline") MemorySegment executionGraph, @CType("VkDeviceAddress") long scratch, @CType("VkDeviceSize") long scratchSize) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdInitializeGraphScratchMemoryAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdInitializeGraphScratchMemoryAMDX");
        try { Handles.MH_vkCmdInitializeGraphScratchMemoryAMDX.invokeExact(handles.PFN_vkCmdInitializeGraphScratchMemoryAMDX, commandBuffer, executionGraph, scratch, scratchSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdInitializeGraphScratchMemoryAMDX", e); }
    }

    public void CmdDispatchGraphAMDX(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDeviceAddress") long scratch, @CType("VkDeviceSize") long scratchSize, @CType("const VkDispatchGraphCountInfoAMDX *") MemorySegment pCountInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDispatchGraphAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphAMDX");
        try { Handles.MH_vkCmdDispatchGraphAMDX.invokeExact(handles.PFN_vkCmdDispatchGraphAMDX, commandBuffer, scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphAMDX", e); }
    }

    public void CmdDispatchGraphIndirectAMDX(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDeviceAddress") long scratch, @CType("VkDeviceSize") long scratchSize, @CType("const VkDispatchGraphCountInfoAMDX *") MemorySegment pCountInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDispatchGraphIndirectAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectAMDX");
        try { Handles.MH_vkCmdDispatchGraphIndirectAMDX.invokeExact(handles.PFN_vkCmdDispatchGraphIndirectAMDX, commandBuffer, scratch, scratchSize, pCountInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphIndirectAMDX", e); }
    }

    public void CmdDispatchGraphIndirectCountAMDX(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDeviceAddress") long scratch, @CType("VkDeviceSize") long scratchSize, @CType("VkDeviceAddress") long countInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDispatchGraphIndirectCountAMDX)) throw new SymbolNotFoundError("Symbol not found: vkCmdDispatchGraphIndirectCountAMDX");
        try { Handles.MH_vkCmdDispatchGraphIndirectCountAMDX.invokeExact(handles.PFN_vkCmdDispatchGraphIndirectCountAMDX, commandBuffer, scratch, scratchSize, countInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDispatchGraphIndirectCountAMDX", e); }
    }

}
