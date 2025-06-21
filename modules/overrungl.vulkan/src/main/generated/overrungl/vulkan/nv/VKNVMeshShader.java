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
public final class VKNVMeshShader {
    public static final int VK_NV_MESH_SHADER_SPEC_VERSION = 1;
    public static final String VK_NV_MESH_SHADER_EXTENSION_NAME = "VK_NV_mesh_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV = 1000202000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV = 1000202001;
    public static final int VK_SHADER_STAGE_TASK_BIT_NV = 0x00000040;
    public static final int VK_SHADER_STAGE_MESH_BIT_NV = 0x00000080;
    public static final int VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV = 0x00080000;
    public static final int VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV = 0x00100000;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT = 1000202002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT = 1000202003;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawMeshTasksNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectCountNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKNVMeshShader() {}

    /// ```
    /// void vkCmdDrawMeshTasksNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t taskCount, uint32_t firstTask);
    /// ```
    public static void vkCmdDrawMeshTasksNV(VkCommandBuffer commandBuffer, int taskCount, int firstTask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksNV");
        try { Handles.MH_vkCmdDrawMeshTasksNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksNV, commandBuffer.segment(), taskCount, firstTask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksNV", e); }
    }

    /// ```
    /// void vkCmdDrawMeshTasksIndirectNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawMeshTasksIndirectNV(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectNV");
        try { Handles.MH_vkCmdDrawMeshTasksIndirectNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectNV, commandBuffer.segment(), buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectNV", e); }
    }

    /// ```
    /// void vkCmdDrawMeshTasksIndirectCountNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawMeshTasksIndirectCountNV(VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectCountNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectCountNV");
        try { Handles.MH_vkCmdDrawMeshTasksIndirectCountNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectCountNV, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectCountNV", e); }
    }

}
