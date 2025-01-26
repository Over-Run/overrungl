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
public class VKNVDeviceGeneratedCommands {
    public static final int VK_INDIRECT_STATE_FLAG_FRONTFACE_BIT_NV = 0x00000001;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV = 7;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_NV = 0x00000001;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NV = 0x00000002;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NV = 0x00000004;
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 3;
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NV_device_generated_commands";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV = 1000277000;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV = 1000277001;
    public static final int VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV = 1000277002;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV = 1000277003;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV = 1000277004;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV = 1000277005;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV = 1000277006;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_NV = 1000277007;
    public static final int VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x00040000;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV = 0x00020000;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV = 0x00020000;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV = 0x00040000;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV = 1000277000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetGeneratedCommandsMemoryRequirementsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPreprocessGeneratedCommandsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdExecuteGeneratedCommandsNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindPipelineShaderGroupNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateIndirectCommandsLayoutNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyIndirectCommandsLayoutNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetGeneratedCommandsMemoryRequirementsNV;
        public final MemorySegment PFN_vkCmdPreprocessGeneratedCommandsNV;
        public final MemorySegment PFN_vkCmdExecuteGeneratedCommandsNV;
        public final MemorySegment PFN_vkCmdBindPipelineShaderGroupNV;
        public final MemorySegment PFN_vkCreateIndirectCommandsLayoutNV;
        public final MemorySegment PFN_vkDestroyIndirectCommandsLayoutNV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetGeneratedCommandsMemoryRequirementsNV = func.invoke(device, "vkGetGeneratedCommandsMemoryRequirementsNV");
            PFN_vkCmdPreprocessGeneratedCommandsNV = func.invoke(device, "vkCmdPreprocessGeneratedCommandsNV");
            PFN_vkCmdExecuteGeneratedCommandsNV = func.invoke(device, "vkCmdExecuteGeneratedCommandsNV");
            PFN_vkCmdBindPipelineShaderGroupNV = func.invoke(device, "vkCmdBindPipelineShaderGroupNV");
            PFN_vkCreateIndirectCommandsLayoutNV = func.invoke(device, "vkCreateIndirectCommandsLayoutNV");
            PFN_vkDestroyIndirectCommandsLayoutNV = func.invoke(device, "vkDestroyIndirectCommandsLayoutNV");
        }
    }

    public VKNVDeviceGeneratedCommands(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkGetGeneratedCommandsMemoryRequirementsNV(VkDevice device, const VkGeneratedCommandsMemoryRequirementsInfoNV* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public void GetGeneratedCommandsMemoryRequirementsNV(MemorySegment device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetGeneratedCommandsMemoryRequirementsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetGeneratedCommandsMemoryRequirementsNV");
        try { Handles.MH_vkGetGeneratedCommandsMemoryRequirementsNV.invokeExact(handles.PFN_vkGetGeneratedCommandsMemoryRequirementsNV, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetGeneratedCommandsMemoryRequirementsNV", e); }
    }

    /// ```
    /// void vkCmdPreprocessGeneratedCommandsNV(VkCommandBuffer commandBuffer, const VkGeneratedCommandsInfoNV* pGeneratedCommandsInfo);
    /// ```
    public void CmdPreprocessGeneratedCommandsNV(MemorySegment commandBuffer, MemorySegment pGeneratedCommandsInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdPreprocessGeneratedCommandsNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdPreprocessGeneratedCommandsNV");
        try { Handles.MH_vkCmdPreprocessGeneratedCommandsNV.invokeExact(handles.PFN_vkCmdPreprocessGeneratedCommandsNV, commandBuffer, pGeneratedCommandsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdPreprocessGeneratedCommandsNV", e); }
    }

    /// ```
    /// void vkCmdExecuteGeneratedCommandsNV(VkCommandBuffer commandBuffer, VkBool32 isPreprocessed, const VkGeneratedCommandsInfoNV* pGeneratedCommandsInfo);
    /// ```
    public void CmdExecuteGeneratedCommandsNV(MemorySegment commandBuffer, int isPreprocessed, MemorySegment pGeneratedCommandsInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdExecuteGeneratedCommandsNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdExecuteGeneratedCommandsNV");
        try { Handles.MH_vkCmdExecuteGeneratedCommandsNV.invokeExact(handles.PFN_vkCmdExecuteGeneratedCommandsNV, commandBuffer, isPreprocessed, pGeneratedCommandsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdExecuteGeneratedCommandsNV", e); }
    }

    /// ```
    /// void vkCmdBindPipelineShaderGroupNV(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline, uint32_t groupIndex);
    /// ```
    public void CmdBindPipelineShaderGroupNV(MemorySegment commandBuffer, int pipelineBindPoint, long pipeline, int groupIndex) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindPipelineShaderGroupNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindPipelineShaderGroupNV");
        try { Handles.MH_vkCmdBindPipelineShaderGroupNV.invokeExact(handles.PFN_vkCmdBindPipelineShaderGroupNV, commandBuffer, pipelineBindPoint, pipeline, groupIndex); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindPipelineShaderGroupNV", e); }
    }

    /// ```
    /// VkResult vkCreateIndirectCommandsLayoutNV(VkDevice device, const VkIndirectCommandsLayoutCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkIndirectCommandsLayoutNV* pIndirectCommandsLayout);
    /// ```
    public int CreateIndirectCommandsLayoutNV(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pIndirectCommandsLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateIndirectCommandsLayoutNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateIndirectCommandsLayoutNV");
        try { return (int) Handles.MH_vkCreateIndirectCommandsLayoutNV.invokeExact(handles.PFN_vkCreateIndirectCommandsLayoutNV, device, pCreateInfo, pAllocator, pIndirectCommandsLayout); }
        catch (Throwable e) { throw new RuntimeException("error in CreateIndirectCommandsLayoutNV", e); }
    }

    /// ```
    /// void vkDestroyIndirectCommandsLayoutNV(VkDevice device, VkIndirectCommandsLayoutNV indirectCommandsLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyIndirectCommandsLayoutNV(MemorySegment device, long indirectCommandsLayout, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyIndirectCommandsLayoutNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyIndirectCommandsLayoutNV");
        try { Handles.MH_vkDestroyIndirectCommandsLayoutNV.invokeExact(handles.PFN_vkDestroyIndirectCommandsLayoutNV, device, indirectCommandsLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyIndirectCommandsLayoutNV", e); }
    }

}
