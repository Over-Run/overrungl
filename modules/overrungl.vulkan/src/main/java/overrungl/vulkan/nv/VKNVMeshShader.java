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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
import static overrungl.vulkan.ext.VKEXTMeshShader.*;
public class VKNVMeshShader {
    public static final int VK_NV_MESH_SHADER_SPEC_VERSION = 1;
    public static final String VK_NV_MESH_SHADER_EXTENSION_NAME = "VK_NV_mesh_shader";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV = 1000202000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV = 1000202001;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_NV_EXT = 1000202002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_MESH_TASKS_COUNT_NV_EXT = 1000202003;
    public static final int VK_SHADER_STAGE_TASK_BIT_NV = VK_SHADER_STAGE_TASK_BIT_EXT;
    public static final int VK_SHADER_STAGE_MESH_BIT_NV = VK_SHADER_STAGE_MESH_BIT_EXT;
    public static final int VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV = VK_PIPELINE_STAGE_TASK_SHADER_BIT_EXT;
    public static final int VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV = VK_PIPELINE_STAGE_MESH_SHADER_BIT_EXT;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdDrawMeshTasksNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawMeshTasksIndirectNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawMeshTasksIndirectCountNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCmdDrawMeshTasksNV,
            FD_vkCmdDrawMeshTasksIndirectNV,
            FD_vkCmdDrawMeshTasksIndirectCountNV
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawMeshTasksNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawMeshTasksNV);
        public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawMeshTasksIndirectNV);
        public static final MethodHandle MH_vkCmdDrawMeshTasksIndirectCountNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawMeshTasksIndirectCountNV);
        public final MemorySegment PFN_vkCmdDrawMeshTasksNV;
        public final MemorySegment PFN_vkCmdDrawMeshTasksIndirectNV;
        public final MemorySegment PFN_vkCmdDrawMeshTasksIndirectCountNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdDrawMeshTasksNV = func.invoke(device, "vkCmdDrawMeshTasksNV");
            PFN_vkCmdDrawMeshTasksIndirectNV = func.invoke(device, "vkCmdDrawMeshTasksIndirectNV");
            PFN_vkCmdDrawMeshTasksIndirectCountNV = func.invoke(device, "vkCmdDrawMeshTasksIndirectCountNV");
        }
    }

    public VKNVMeshShader(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdDrawMeshTasksNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int taskCount, @CType("uint32_t") int firstTask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawMeshTasksNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksNV");
        try { Handles.MH_vkCmdDrawMeshTasksNV.invokeExact(handles.PFN_vkCmdDrawMeshTasksNV, commandBuffer, taskCount, firstTask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksNV", e); }
    }

    public void CmdDrawMeshTasksIndirectNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("uint32_t") int drawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawMeshTasksIndirectNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectNV");
        try { Handles.MH_vkCmdDrawMeshTasksIndirectNV.invokeExact(handles.PFN_vkCmdDrawMeshTasksIndirectNV, commandBuffer, buffer, offset, drawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectNV", e); }
    }

    public void CmdDrawMeshTasksIndirectCountNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawMeshTasksIndirectCountNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawMeshTasksIndirectCountNV");
        try { Handles.MH_vkCmdDrawMeshTasksIndirectCountNV.invokeExact(handles.PFN_vkCmdDrawMeshTasksIndirectCountNV, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawMeshTasksIndirectCountNV", e); }
    }

}
