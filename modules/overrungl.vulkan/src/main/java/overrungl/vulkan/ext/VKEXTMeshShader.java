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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTMeshShader {
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
    public static final MethodHandle MH_vkCmdDrawMeshTasksEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_vkCmdDrawMeshTasksEXT;
    public final MemorySegment PFN_vkCmdDrawMeshTasksIndirectEXT;
    public final MemorySegment PFN_vkCmdDrawMeshTasksIndirectCountEXT;

    public VKEXTMeshShader(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdDrawMeshTasksEXT = func.invoke(device, "vkCmdDrawMeshTasksEXT");
        PFN_vkCmdDrawMeshTasksIndirectEXT = func.invoke(device, "vkCmdDrawMeshTasksIndirectEXT");
        PFN_vkCmdDrawMeshTasksIndirectCountEXT = func.invoke(device, "vkCmdDrawMeshTasksIndirectCountEXT");
    }

    public void CmdDrawMeshTasksEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int groupCountX, @CType("uint32_t") int groupCountY, @CType("uint32_t") int groupCountZ) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawMeshTasksEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksEXT");
        try { MH_vkCmdDrawMeshTasksEXT.invokeExact(PFN_vkCmdDrawMeshTasksEXT, commandBuffer, groupCountX, groupCountY, groupCountZ); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksEXT", e); }
    }

    public void CmdDrawMeshTasksIndirectEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("uint32_t") int drawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawMeshTasksIndirectEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectEXT");
        try { MH_vkCmdDrawMeshTasksIndirectEXT.invokeExact(PFN_vkCmdDrawMeshTasksIndirectEXT, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectEXT", e); }
    }

    public void CmdDrawMeshTasksIndirectCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDrawMeshTasksIndirectCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectCountEXT");
        try { MH_vkCmdDrawMeshTasksIndirectCountEXT.invokeExact(PFN_vkCmdDrawMeshTasksIndirectCountEXT, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectCountEXT", e); }
    }

}