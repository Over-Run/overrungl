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
import java.util.*;
import static overrungl.vulkan.nv.VKNVDeviceGeneratedCommands.*;
public class VKEXTDeviceGeneratedCommands {
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_EXECUTION_SET_EXT = 0;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_SEQUENCE_INDEX_EXT = 2;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_EXT = 3;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_EXT = 4;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_EXT = 5;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_EXT = 6;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_COUNT_EXT = 7;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_COUNT_EXT = 8;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_EXT = 9;
    public static final int VK_INDIRECT_EXECUTION_SET_INFO_TYPE_PIPELINES_EXT = 0;
    public static final int VK_INDIRECT_EXECUTION_SET_INFO_TYPE_SHADER_OBJECTS_EXT = 1;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EXPLICIT_PREPROCESS_BIT_EXT = 0x00000001;
    public static final int VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_EXT = 0x00000002;
    public static final int VK_INDIRECT_COMMANDS_INPUT_MODE_VULKAN_INDEX_BUFFER_EXT = 0x00000001;
    public static final int VK_INDIRECT_COMMANDS_INPUT_MODE_DXGI_INDEX_BUFFER_EXT = 0x00000002;
    public static final int VK_EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;
    public static final String VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_EXT_device_generated_commands";
    public static final int VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT = 0x00000080;
    public static final long VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT = 0x80000000L;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_FEATURES_EXT = 1000572000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_EXT = 1000572001;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT = 1000572002;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT = 1000572003;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT = 1000572004;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT = 1000572006;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT = 1000572007;
    public static final int VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_PIPELINE_EXT = 1000572008;
    public static final int VK_STRUCTURE_TYPE_WRITE_INDIRECT_EXECUTION_SET_SHADER_EXT = 1000572009;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_PIPELINE_INFO_EXT = 1000572010;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT = 1000572011;
    public static final int VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT = 1000572012;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_PIPELINE_INFO_EXT = 1000572013;
    public static final int VK_STRUCTURE_TYPE_GENERATED_COMMANDS_SHADER_INFO_EXT = 1000572014;
    public static final int VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT = 1000572000;
    public static final int VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT = 1000572001;
    public static final long VK_PIPELINE_CREATE_2_INDIRECT_BINDABLE_BIT_EXT = 0x4000000000L;
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT = VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_NV;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT = VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_NV;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT = VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetGeneratedCommandsMemoryRequirementsEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdPreprocessGeneratedCommandsEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdExecuteGeneratedCommandsEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateIndirectCommandsLayoutEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyIndirectCommandsLayoutEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateIndirectExecutionSetEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyIndirectExecutionSetEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkUpdateIndirectExecutionSetPipelineEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkUpdateIndirectExecutionSetShaderEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetGeneratedCommandsMemoryRequirementsEXT,
            FD_vkCmdPreprocessGeneratedCommandsEXT,
            FD_vkCmdExecuteGeneratedCommandsEXT,
            FD_vkCreateIndirectCommandsLayoutEXT,
            FD_vkDestroyIndirectCommandsLayoutEXT,
            FD_vkCreateIndirectExecutionSetEXT,
            FD_vkDestroyIndirectExecutionSetEXT,
            FD_vkUpdateIndirectExecutionSetPipelineEXT,
            FD_vkUpdateIndirectExecutionSetShaderEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetGeneratedCommandsMemoryRequirementsEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetGeneratedCommandsMemoryRequirementsEXT);
        public static final MethodHandle MH_vkCmdPreprocessGeneratedCommandsEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdPreprocessGeneratedCommandsEXT);
        public static final MethodHandle MH_vkCmdExecuteGeneratedCommandsEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdExecuteGeneratedCommandsEXT);
        public static final MethodHandle MH_vkCreateIndirectCommandsLayoutEXT = RuntimeHelper.downcall(Descriptors.FD_vkCreateIndirectCommandsLayoutEXT);
        public static final MethodHandle MH_vkDestroyIndirectCommandsLayoutEXT = RuntimeHelper.downcall(Descriptors.FD_vkDestroyIndirectCommandsLayoutEXT);
        public static final MethodHandle MH_vkCreateIndirectExecutionSetEXT = RuntimeHelper.downcall(Descriptors.FD_vkCreateIndirectExecutionSetEXT);
        public static final MethodHandle MH_vkDestroyIndirectExecutionSetEXT = RuntimeHelper.downcall(Descriptors.FD_vkDestroyIndirectExecutionSetEXT);
        public static final MethodHandle MH_vkUpdateIndirectExecutionSetPipelineEXT = RuntimeHelper.downcall(Descriptors.FD_vkUpdateIndirectExecutionSetPipelineEXT);
        public static final MethodHandle MH_vkUpdateIndirectExecutionSetShaderEXT = RuntimeHelper.downcall(Descriptors.FD_vkUpdateIndirectExecutionSetShaderEXT);
        public final MemorySegment PFN_vkGetGeneratedCommandsMemoryRequirementsEXT;
        public final MemorySegment PFN_vkCmdPreprocessGeneratedCommandsEXT;
        public final MemorySegment PFN_vkCmdExecuteGeneratedCommandsEXT;
        public final MemorySegment PFN_vkCreateIndirectCommandsLayoutEXT;
        public final MemorySegment PFN_vkDestroyIndirectCommandsLayoutEXT;
        public final MemorySegment PFN_vkCreateIndirectExecutionSetEXT;
        public final MemorySegment PFN_vkDestroyIndirectExecutionSetEXT;
        public final MemorySegment PFN_vkUpdateIndirectExecutionSetPipelineEXT;
        public final MemorySegment PFN_vkUpdateIndirectExecutionSetShaderEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetGeneratedCommandsMemoryRequirementsEXT = func.invoke(device, "vkGetGeneratedCommandsMemoryRequirementsEXT");
            PFN_vkCmdPreprocessGeneratedCommandsEXT = func.invoke(device, "vkCmdPreprocessGeneratedCommandsEXT");
            PFN_vkCmdExecuteGeneratedCommandsEXT = func.invoke(device, "vkCmdExecuteGeneratedCommandsEXT");
            PFN_vkCreateIndirectCommandsLayoutEXT = func.invoke(device, "vkCreateIndirectCommandsLayoutEXT");
            PFN_vkDestroyIndirectCommandsLayoutEXT = func.invoke(device, "vkDestroyIndirectCommandsLayoutEXT");
            PFN_vkCreateIndirectExecutionSetEXT = func.invoke(device, "vkCreateIndirectExecutionSetEXT");
            PFN_vkDestroyIndirectExecutionSetEXT = func.invoke(device, "vkDestroyIndirectExecutionSetEXT");
            PFN_vkUpdateIndirectExecutionSetPipelineEXT = func.invoke(device, "vkUpdateIndirectExecutionSetPipelineEXT");
            PFN_vkUpdateIndirectExecutionSetShaderEXT = func.invoke(device, "vkUpdateIndirectExecutionSetShaderEXT");
        }
    }

    public VKEXTDeviceGeneratedCommands(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void GetGeneratedCommandsMemoryRequirementsEXT(@CType("VkDevice") MemorySegment device, @CType("const VkGeneratedCommandsMemoryRequirementsInfoEXT *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetGeneratedCommandsMemoryRequirementsEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetGeneratedCommandsMemoryRequirementsEXT");
        try { Handles.MH_vkGetGeneratedCommandsMemoryRequirementsEXT.invokeExact(handles.PFN_vkGetGeneratedCommandsMemoryRequirementsEXT, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetGeneratedCommandsMemoryRequirementsEXT", e); }
    }

    public void CmdPreprocessGeneratedCommandsEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkGeneratedCommandsInfoEXT *") MemorySegment pGeneratedCommandsInfo, @CType("VkCommandBuffer") MemorySegment stateCommandBuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdPreprocessGeneratedCommandsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdPreprocessGeneratedCommandsEXT");
        try { Handles.MH_vkCmdPreprocessGeneratedCommandsEXT.invokeExact(handles.PFN_vkCmdPreprocessGeneratedCommandsEXT, commandBuffer, pGeneratedCommandsInfo, stateCommandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPreprocessGeneratedCommandsEXT", e); }
    }

    public void CmdExecuteGeneratedCommandsEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int isPreprocessed, @CType("const VkGeneratedCommandsInfoEXT *") MemorySegment pGeneratedCommandsInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdExecuteGeneratedCommandsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdExecuteGeneratedCommandsEXT");
        try { Handles.MH_vkCmdExecuteGeneratedCommandsEXT.invokeExact(handles.PFN_vkCmdExecuteGeneratedCommandsEXT, commandBuffer, isPreprocessed, pGeneratedCommandsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdExecuteGeneratedCommandsEXT", e); }
    }

    public @CType("VkResult") int CreateIndirectCommandsLayoutEXT(@CType("VkDevice") MemorySegment device, @CType("const VkIndirectCommandsLayoutCreateInfoEXT *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkIndirectCommandsLayoutEXT *") MemorySegment pIndirectCommandsLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateIndirectCommandsLayoutEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateIndirectCommandsLayoutEXT");
        try { return (int) Handles.MH_vkCreateIndirectCommandsLayoutEXT.invokeExact(handles.PFN_vkCreateIndirectCommandsLayoutEXT, device, pCreateInfo, pAllocator, pIndirectCommandsLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateIndirectCommandsLayoutEXT", e); }
    }

    public void DestroyIndirectCommandsLayoutEXT(@CType("VkDevice") MemorySegment device, @CType("VkIndirectCommandsLayoutEXT") MemorySegment indirectCommandsLayout, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyIndirectCommandsLayoutEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyIndirectCommandsLayoutEXT");
        try { Handles.MH_vkDestroyIndirectCommandsLayoutEXT.invokeExact(handles.PFN_vkDestroyIndirectCommandsLayoutEXT, device, indirectCommandsLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyIndirectCommandsLayoutEXT", e); }
    }

    public @CType("VkResult") int CreateIndirectExecutionSetEXT(@CType("VkDevice") MemorySegment device, @CType("const VkIndirectExecutionSetCreateInfoEXT *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkIndirectExecutionSetEXT *") MemorySegment pIndirectExecutionSet) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateIndirectExecutionSetEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateIndirectExecutionSetEXT");
        try { return (int) Handles.MH_vkCreateIndirectExecutionSetEXT.invokeExact(handles.PFN_vkCreateIndirectExecutionSetEXT, device, pCreateInfo, pAllocator, pIndirectExecutionSet); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateIndirectExecutionSetEXT", e); }
    }

    public void DestroyIndirectExecutionSetEXT(@CType("VkDevice") MemorySegment device, @CType("VkIndirectExecutionSetEXT") MemorySegment indirectExecutionSet, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyIndirectExecutionSetEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyIndirectExecutionSetEXT");
        try { Handles.MH_vkDestroyIndirectExecutionSetEXT.invokeExact(handles.PFN_vkDestroyIndirectExecutionSetEXT, device, indirectExecutionSet, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyIndirectExecutionSetEXT", e); }
    }

    public void UpdateIndirectExecutionSetPipelineEXT(@CType("VkDevice") MemorySegment device, @CType("VkIndirectExecutionSetEXT") MemorySegment indirectExecutionSet, @CType("uint32_t") int executionSetWriteCount, @CType("const VkWriteIndirectExecutionSetPipelineEXT *") MemorySegment pExecutionSetWrites) {
        if (Unmarshal.isNullPointer(handles.PFN_vkUpdateIndirectExecutionSetPipelineEXT)) throw new SymbolNotFoundError("Symbol not found: vkUpdateIndirectExecutionSetPipelineEXT");
        try { Handles.MH_vkUpdateIndirectExecutionSetPipelineEXT.invokeExact(handles.PFN_vkUpdateIndirectExecutionSetPipelineEXT, device, indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateIndirectExecutionSetPipelineEXT", e); }
    }

    public void UpdateIndirectExecutionSetShaderEXT(@CType("VkDevice") MemorySegment device, @CType("VkIndirectExecutionSetEXT") MemorySegment indirectExecutionSet, @CType("uint32_t") int executionSetWriteCount, @CType("const VkWriteIndirectExecutionSetShaderEXT *") MemorySegment pExecutionSetWrites) {
        if (Unmarshal.isNullPointer(handles.PFN_vkUpdateIndirectExecutionSetShaderEXT)) throw new SymbolNotFoundError("Symbol not found: vkUpdateIndirectExecutionSetShaderEXT");
        try { Handles.MH_vkUpdateIndirectExecutionSetShaderEXT.invokeExact(handles.PFN_vkUpdateIndirectExecutionSetShaderEXT, device, indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateIndirectExecutionSetShaderEXT", e); }
    }

}
