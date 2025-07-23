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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTMeshShader {
    public static final int VK_EXT_MESH_SHADER_SPEC_VERSION = 1;
    public static final String VK_EXT_MESH_SHADER_EXTENSION_NAME = "VK_EXT_mesh_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT = 1000328000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT = 1000328001;
    public static final int VK_SHADER_STAGE_TASK_BIT_EXT = 0x00000040;
    public static final int VK_SHADER_STAGE_MESH_BIT_EXT = 0x00000080;
    public static final int VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT = 0x00080000;
    public static final int VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT = 0x00100000;
    public static final int VK_QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT = 1000328000;
    public static final int VK_QUERY_PIPELINE_STATISTIC_TASK_SHADER_INVOCATIONS_BIT_EXT = 0x00000800;
    public static final int VK_QUERY_PIPELINE_STATISTIC_MESH_SHADER_INVOCATIONS_BIT_EXT = 0x00001000;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV = 1000328000;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_EXT = 1000328000;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_EXT = 1000328001;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawMeshTasksEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTMeshShader() {}

    /// ```
    /// void vkCmdDrawMeshTasksEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t groupCountX, uint32_t groupCountY, uint32_t groupCountZ);
    /// ```
    public static void vkCmdDrawMeshTasksEXT(VkCommandBuffer commandBuffer, int groupCountX, int groupCountY, int groupCountZ) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawMeshTasksEXT", commandBuffer, groupCountX, groupCountY, groupCountZ); }
        Handles.MH_vkCmdDrawMeshTasksEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksEXT, commandBuffer.segment(), groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksEXT", e); }
    }

    /// ```
    /// void vkCmdDrawMeshTasksIndirectEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, uint32_t drawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawMeshTasksIndirectEXT(VkCommandBuffer commandBuffer, long buffer, long offset, int drawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawMeshTasksIndirectEXT", commandBuffer, buffer, offset, drawCount, stride); }
        Handles.MH_vkCmdDrawMeshTasksIndirectEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectEXT, commandBuffer.segment(), buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectEXT", e); }
    }

    /// ```
    /// void vkCmdDrawMeshTasksIndirectCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawMeshTasksIndirectCountEXT(VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawMeshTasksIndirectCountEXT", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawMeshTasksIndirectCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawMeshTasksIndirectCountEXT, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectCountEXT", e); }
    }

}
