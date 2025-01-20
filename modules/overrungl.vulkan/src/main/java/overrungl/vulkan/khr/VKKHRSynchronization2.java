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
import static overrungl.vulkan.VK13.*;
import static overrungl.vulkan.khr.VKKHRSynchronization2.*;
public class VKKHRSynchronization2 {
    public static final int VK_KHR_SYNCHRONIZATION_2_SPEC_VERSION = 1;
    public static final String VK_KHR_SYNCHRONIZATION_2_EXTENSION_NAME = "VK_KHR_synchronization2";
    public static final long VK_PIPELINE_STAGE_2_TRANSFORM_FEEDBACK_BIT_EXT = 0x01000000L;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_WRITE_BIT_EXT = 0x02000000L;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT = 0x04000000L;
    public static final long VK_ACCESS_2_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT = 0x08000000L;
    public static final long VK_PIPELINE_STAGE_2_CONDITIONAL_RENDERING_BIT_EXT = 0x00040000L;
    public static final long VK_ACCESS_2_CONDITIONAL_RENDERING_READ_BIT_EXT = 0x00100000L;
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV = 0x00020000L;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV = 0x00020000L;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV = 0x00040000L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00400000L;
    public static final long VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x00800000L;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR = 0x02000000L;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR = 0x00200000L;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR = 0x00400000L;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR = 0x00200000L;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_DENSITY_PROCESS_BIT_EXT = 0x00800000L;
    public static final long VK_ACCESS_2_FRAGMENT_DENSITY_MAP_READ_BIT_EXT = 0x01000000L;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT = 0x00080000L;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT = 0x00080000L;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT = 0x00100000L;
    public static final int VK_STRUCTURE_TYPE_MEMORY_BARRIER_2_KHR = VK_STRUCTURE_TYPE_MEMORY_BARRIER_2;
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2_KHR = VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2_KHR = VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2;
    public static final int VK_STRUCTURE_TYPE_DEPENDENCY_INFO_KHR = VK_STRUCTURE_TYPE_DEPENDENCY_INFO;
    public static final int VK_STRUCTURE_TYPE_SUBMIT_INFO_2_KHR = VK_STRUCTURE_TYPE_SUBMIT_INFO_2;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO_KHR = VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO_KHR = VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES;
    public static final int VK_EVENT_CREATE_DEVICE_ONLY_BIT_KHR = VK_EVENT_CREATE_DEVICE_ONLY_BIT;
    public static final int VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL_KHR = VK_IMAGE_LAYOUT_READ_ONLY_OPTIMAL;
    public static final int VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL_KHR = VK_IMAGE_LAYOUT_ATTACHMENT_OPTIMAL;
    public static final int VK_PIPELINE_STAGE_NONE_KHR = VK_PIPELINE_STAGE_NONE;
    public static final int VK_ACCESS_NONE_KHR = VK_ACCESS_NONE;
    public static final long VK_ACCESS_2_NONE_KHR = VK_ACCESS_2_NONE;
    public static final long VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT_KHR = VK_ACCESS_2_INDIRECT_COMMAND_READ_BIT;
    public static final long VK_ACCESS_2_INDEX_READ_BIT_KHR = VK_ACCESS_2_INDEX_READ_BIT;
    public static final long VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT_KHR = VK_ACCESS_2_VERTEX_ATTRIBUTE_READ_BIT;
    public static final long VK_ACCESS_2_UNIFORM_READ_BIT_KHR = VK_ACCESS_2_UNIFORM_READ_BIT;
    public static final long VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT_KHR = VK_ACCESS_2_INPUT_ATTACHMENT_READ_BIT;
    public static final long VK_ACCESS_2_SHADER_READ_BIT_KHR = VK_ACCESS_2_SHADER_READ_BIT;
    public static final long VK_ACCESS_2_SHADER_WRITE_BIT_KHR = VK_ACCESS_2_SHADER_WRITE_BIT;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT_KHR = VK_ACCESS_2_COLOR_ATTACHMENT_READ_BIT;
    public static final long VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT_KHR = VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT_KHR = VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_READ_BIT;
    public static final long VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT_KHR = VK_ACCESS_2_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT;
    public static final long VK_ACCESS_2_TRANSFER_READ_BIT_KHR = VK_ACCESS_2_TRANSFER_READ_BIT;
    public static final long VK_ACCESS_2_TRANSFER_WRITE_BIT_KHR = VK_ACCESS_2_TRANSFER_WRITE_BIT;
    public static final long VK_ACCESS_2_HOST_READ_BIT_KHR = VK_ACCESS_2_HOST_READ_BIT;
    public static final long VK_ACCESS_2_HOST_WRITE_BIT_KHR = VK_ACCESS_2_HOST_WRITE_BIT;
    public static final long VK_ACCESS_2_MEMORY_READ_BIT_KHR = VK_ACCESS_2_MEMORY_READ_BIT;
    public static final long VK_ACCESS_2_MEMORY_WRITE_BIT_KHR = VK_ACCESS_2_MEMORY_WRITE_BIT;
    public static final long VK_ACCESS_2_SHADER_SAMPLED_READ_BIT_KHR = VK_ACCESS_2_SHADER_SAMPLED_READ_BIT;
    public static final long VK_ACCESS_2_SHADER_STORAGE_READ_BIT_KHR = VK_ACCESS_2_SHADER_STORAGE_READ_BIT;
    public static final long VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT_KHR = VK_ACCESS_2_SHADER_STORAGE_WRITE_BIT;
    public static final long VK_PIPELINE_STAGE_2_NONE_KHR = VK_PIPELINE_STAGE_2_NONE;
    public static final long VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT_KHR = VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT;
    public static final long VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT_KHR = VK_PIPELINE_STAGE_2_DRAW_INDIRECT_BIT;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT_KHR = VK_PIPELINE_STAGE_2_VERTEX_INPUT_BIT;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT_KHR = VK_PIPELINE_STAGE_2_VERTEX_SHADER_BIT;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT_KHR = VK_PIPELINE_STAGE_2_TESSELLATION_CONTROL_SHADER_BIT;
    public static final long VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT_KHR = VK_PIPELINE_STAGE_2_TESSELLATION_EVALUATION_SHADER_BIT;
    public static final long VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT_KHR = VK_PIPELINE_STAGE_2_GEOMETRY_SHADER_BIT;
    public static final long VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT_KHR = VK_PIPELINE_STAGE_2_FRAGMENT_SHADER_BIT;
    public static final long VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT_KHR = VK_PIPELINE_STAGE_2_EARLY_FRAGMENT_TESTS_BIT;
    public static final long VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT_KHR = VK_PIPELINE_STAGE_2_LATE_FRAGMENT_TESTS_BIT;
    public static final long VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT_KHR = VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT;
    public static final long VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT_KHR = VK_PIPELINE_STAGE_2_COMPUTE_SHADER_BIT;
    public static final long VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT_KHR = VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT;
    public static final long VK_PIPELINE_STAGE_2_TRANSFER_BIT_KHR = VK_PIPELINE_STAGE_2_ALL_TRANSFER_BIT;
    public static final long VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT_KHR = VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT;
    public static final long VK_PIPELINE_STAGE_2_HOST_BIT_KHR = VK_PIPELINE_STAGE_2_HOST_BIT;
    public static final long VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT_KHR = VK_PIPELINE_STAGE_2_ALL_GRAPHICS_BIT;
    public static final long VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT_KHR = VK_PIPELINE_STAGE_2_ALL_COMMANDS_BIT;
    public static final long VK_PIPELINE_STAGE_2_COPY_BIT_KHR = VK_PIPELINE_STAGE_2_COPY_BIT;
    public static final long VK_PIPELINE_STAGE_2_RESOLVE_BIT_KHR = VK_PIPELINE_STAGE_2_RESOLVE_BIT;
    public static final long VK_PIPELINE_STAGE_2_BLIT_BIT_KHR = VK_PIPELINE_STAGE_2_BLIT_BIT;
    public static final long VK_PIPELINE_STAGE_2_CLEAR_BIT_KHR = VK_PIPELINE_STAGE_2_CLEAR_BIT;
    public static final long VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT_KHR = VK_PIPELINE_STAGE_2_INDEX_INPUT_BIT;
    public static final long VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT_KHR = VK_PIPELINE_STAGE_2_VERTEX_ATTRIBUTE_INPUT_BIT;
    public static final long VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT_KHR = VK_PIPELINE_STAGE_2_PRE_RASTERIZATION_SHADERS_BIT;
    public static final int VK_SUBMIT_PROTECTED_BIT_KHR = VK_SUBMIT_PROTECTED_BIT;
    public static final long VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_EXT = VK_PIPELINE_STAGE_2_COMMAND_PREPROCESS_BIT_NV;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_EXT = VK_ACCESS_2_COMMAND_PREPROCESS_READ_BIT_NV;
    public static final long VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_EXT = VK_ACCESS_2_COMMAND_PREPROCESS_WRITE_BIT_NV;
    public static final long VK_PIPELINE_STAGE_2_SHADING_RATE_IMAGE_BIT_NV = VK_PIPELINE_STAGE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR;
    public static final long VK_ACCESS_2_SHADING_RATE_IMAGE_READ_BIT_NV = VK_ACCESS_2_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR;
    public static final long VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_NV = VK_PIPELINE_STAGE_2_RAY_TRACING_SHADER_BIT_KHR;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_NV = VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_BUILD_BIT_KHR;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_NV = VK_ACCESS_2_ACCELERATION_STRUCTURE_READ_BIT_KHR;
    public static final long VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_NV = VK_ACCESS_2_ACCELERATION_STRUCTURE_WRITE_BIT_KHR;
    public static final long VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_NV = VK_PIPELINE_STAGE_2_TASK_SHADER_BIT_EXT;
    public static final long VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_NV = VK_PIPELINE_STAGE_2_MESH_SHADER_BIT_EXT;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetEvent2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdResetEvent2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_vkCmdWaitEvents2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdPipelineBarrier2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdWriteTimestamp2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkQueueSubmit2KHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetEvent2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetEvent2KHR);
        public static final MethodHandle MH_vkCmdResetEvent2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdResetEvent2KHR);
        public static final MethodHandle MH_vkCmdWaitEvents2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdWaitEvents2KHR);
        public static final MethodHandle MH_vkCmdPipelineBarrier2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdPipelineBarrier2KHR);
        public static final MethodHandle MH_vkCmdWriteTimestamp2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdWriteTimestamp2KHR);
        public static final MethodHandle MH_vkQueueSubmit2KHR = RuntimeHelper.downcall(Descriptors.FD_vkQueueSubmit2KHR);
        public final MemorySegment PFN_vkCmdSetEvent2KHR;
        public final MemorySegment PFN_vkCmdResetEvent2KHR;
        public final MemorySegment PFN_vkCmdWaitEvents2KHR;
        public final MemorySegment PFN_vkCmdPipelineBarrier2KHR;
        public final MemorySegment PFN_vkCmdWriteTimestamp2KHR;
        public final MemorySegment PFN_vkQueueSubmit2KHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetEvent2KHR = func.invoke(device, "vkCmdSetEvent2KHR", "vkCmdSetEvent2");
            PFN_vkCmdResetEvent2KHR = func.invoke(device, "vkCmdResetEvent2KHR", "vkCmdResetEvent2");
            PFN_vkCmdWaitEvents2KHR = func.invoke(device, "vkCmdWaitEvents2KHR", "vkCmdWaitEvents2");
            PFN_vkCmdPipelineBarrier2KHR = func.invoke(device, "vkCmdPipelineBarrier2KHR", "vkCmdPipelineBarrier2");
            PFN_vkCmdWriteTimestamp2KHR = func.invoke(device, "vkCmdWriteTimestamp2KHR", "vkCmdWriteTimestamp2");
            PFN_vkQueueSubmit2KHR = func.invoke(device, "vkQueueSubmit2KHR", "vkQueueSubmit2");
        }
    }

    public VKKHRSynchronization2(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetEvent2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkEvent") MemorySegment event, @CType("const VkDependencyInfo *") MemorySegment pDependencyInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetEvent2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetEvent2KHR");
        try { Handles.MH_vkCmdSetEvent2KHR.invokeExact(handles.PFN_vkCmdSetEvent2KHR, commandBuffer, event, pDependencyInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetEvent2KHR", e); }
    }

    public void CmdResetEvent2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkEvent") MemorySegment event, @CType("VkPipelineStageFlags2") long stageMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdResetEvent2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdResetEvent2KHR");
        try { Handles.MH_vkCmdResetEvent2KHR.invokeExact(handles.PFN_vkCmdResetEvent2KHR, commandBuffer, event, stageMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdResetEvent2KHR", e); }
    }

    public void CmdWaitEvents2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int eventCount, @CType("const VkEvent *") MemorySegment pEvents, @CType("const VkDependencyInfo *") MemorySegment pDependencyInfos) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdWaitEvents2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdWaitEvents2KHR");
        try { Handles.MH_vkCmdWaitEvents2KHR.invokeExact(handles.PFN_vkCmdWaitEvents2KHR, commandBuffer, eventCount, pEvents, pDependencyInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWaitEvents2KHR", e); }
    }

    public void CmdPipelineBarrier2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkDependencyInfo *") MemorySegment pDependencyInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdPipelineBarrier2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdPipelineBarrier2KHR");
        try { Handles.MH_vkCmdPipelineBarrier2KHR.invokeExact(handles.PFN_vkCmdPipelineBarrier2KHR, commandBuffer, pDependencyInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPipelineBarrier2KHR", e); }
    }

    public void CmdWriteTimestamp2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlags2") long stage, @CType("VkQueryPool") MemorySegment queryPool, @CType("uint32_t") int query) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdWriteTimestamp2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteTimestamp2KHR");
        try { Handles.MH_vkCmdWriteTimestamp2KHR.invokeExact(handles.PFN_vkCmdWriteTimestamp2KHR, commandBuffer, stage, queryPool, query); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteTimestamp2KHR", e); }
    }

    public @CType("VkResult") int QueueSubmit2KHR(@CType("VkQueue") MemorySegment queue, @CType("uint32_t") int submitCount, @CType("const VkSubmitInfo2 *") MemorySegment pSubmits, @CType("VkFence") MemorySegment fence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkQueueSubmit2KHR)) throw new SymbolNotFoundError("Symbol not found: vkQueueSubmit2KHR");
        try { return (int) Handles.MH_vkQueueSubmit2KHR.invokeExact(handles.PFN_vkQueueSubmit2KHR, queue, submitCount, pSubmits, fence); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueSubmit2KHR", e); }
    }

}
