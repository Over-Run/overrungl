// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_device_generated_commands` - device extension
public final class VKEXTDeviceGeneratedCommands {
    public static final int VK_EXT_DEVICE_GENERATED_COMMANDS_SPEC_VERSION = 1;
    public static final String VK_EXT_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_EXT_device_generated_commands";
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
    public static final int VK_PIPELINE_STAGE_COMMAND_PREPROCESS_BIT_EXT = 0x00020000;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT = 0x00020000;
    public static final int VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT = 0x00040000;
    private VKEXTDeviceGeneratedCommands() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetGeneratedCommandsMemoryRequirementsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPreprocessGeneratedCommandsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdExecuteGeneratedCommandsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateIndirectCommandsLayoutEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyIndirectCommandsLayoutEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateIndirectExecutionSetEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyIndirectExecutionSetEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateIndirectExecutionSetPipelineEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateIndirectExecutionSetShaderEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetGeneratedCommandsMemoryRequirementsEXT`.
    /// ```
    /// void vkGetGeneratedCommandsMemoryRequirementsEXT(VkDevice device, const VkGeneratedCommandsMemoryRequirementsInfoEXT* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetGeneratedCommandsMemoryRequirementsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetGeneratedCommandsMemoryRequirementsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetGeneratedCommandsMemoryRequirementsEXT", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetGeneratedCommandsMemoryRequirementsEXT.invokeExact(device.capabilities().PFN_vkGetGeneratedCommandsMemoryRequirementsEXT, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetGeneratedCommandsMemoryRequirementsEXT", e); }
    }

    /// Invokes `vkCmdPreprocessGeneratedCommandsEXT`.
    /// ```
    /// void vkCmdPreprocessGeneratedCommandsEXT(VkCommandBuffer commandBuffer, const VkGeneratedCommandsInfoEXT* pGeneratedCommandsInfo, VkCommandBuffer stateCommandBuffer);
    /// ```
    public static void vkCmdPreprocessGeneratedCommandsEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pGeneratedCommandsInfo, @NonNull VkCommandBuffer stateCommandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPreprocessGeneratedCommandsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPreprocessGeneratedCommandsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPreprocessGeneratedCommandsEXT", commandBuffer, pGeneratedCommandsInfo, stateCommandBuffer); }
        Handles.MH_vkCmdPreprocessGeneratedCommandsEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdPreprocessGeneratedCommandsEXT, commandBuffer.segment(), pGeneratedCommandsInfo, stateCommandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPreprocessGeneratedCommandsEXT", e); }
    }

    /// Invokes `vkCmdExecuteGeneratedCommandsEXT`.
    /// ```
    /// void vkCmdExecuteGeneratedCommandsEXT(VkCommandBuffer commandBuffer, VkBool32 isPreprocessed, const VkGeneratedCommandsInfoEXT* pGeneratedCommandsInfo);
    /// ```
    public static void vkCmdExecuteGeneratedCommandsEXT(@NonNull VkCommandBuffer commandBuffer, int isPreprocessed, @NonNull MemorySegment pGeneratedCommandsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdExecuteGeneratedCommandsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdExecuteGeneratedCommandsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdExecuteGeneratedCommandsEXT", commandBuffer, isPreprocessed, pGeneratedCommandsInfo); }
        Handles.MH_vkCmdExecuteGeneratedCommandsEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdExecuteGeneratedCommandsEXT, commandBuffer.segment(), isPreprocessed, pGeneratedCommandsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdExecuteGeneratedCommandsEXT", e); }
    }

    /// Invokes `vkCreateIndirectCommandsLayoutEXT`.
    /// ```
    /// VkResult vkCreateIndirectCommandsLayoutEXT(VkDevice device, const VkIndirectCommandsLayoutCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkIndirectCommandsLayoutEXT* pIndirectCommandsLayout);
    /// ```
    public static int vkCreateIndirectCommandsLayoutEXT(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pIndirectCommandsLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateIndirectCommandsLayoutEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateIndirectCommandsLayoutEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateIndirectCommandsLayoutEXT", device, pCreateInfo, pAllocator, pIndirectCommandsLayout); }
        return (int) Handles.MH_vkCreateIndirectCommandsLayoutEXT.invokeExact(device.capabilities().PFN_vkCreateIndirectCommandsLayoutEXT, device.segment(), pCreateInfo, pAllocator, pIndirectCommandsLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateIndirectCommandsLayoutEXT", e); }
    }

    /// Invokes `vkDestroyIndirectCommandsLayoutEXT`.
    /// ```
    /// void vkDestroyIndirectCommandsLayoutEXT(VkDevice device, VkIndirectCommandsLayoutEXT indirectCommandsLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyIndirectCommandsLayoutEXT(@NonNull VkDevice device, long indirectCommandsLayout, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyIndirectCommandsLayoutEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyIndirectCommandsLayoutEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyIndirectCommandsLayoutEXT", device, indirectCommandsLayout, pAllocator); }
        Handles.MH_vkDestroyIndirectCommandsLayoutEXT.invokeExact(device.capabilities().PFN_vkDestroyIndirectCommandsLayoutEXT, device.segment(), indirectCommandsLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyIndirectCommandsLayoutEXT", e); }
    }

    /// Invokes `vkCreateIndirectExecutionSetEXT`.
    /// ```
    /// VkResult vkCreateIndirectExecutionSetEXT(VkDevice device, const VkIndirectExecutionSetCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkIndirectExecutionSetEXT* pIndirectExecutionSet);
    /// ```
    public static int vkCreateIndirectExecutionSetEXT(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pIndirectExecutionSet) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateIndirectExecutionSetEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateIndirectExecutionSetEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateIndirectExecutionSetEXT", device, pCreateInfo, pAllocator, pIndirectExecutionSet); }
        return (int) Handles.MH_vkCreateIndirectExecutionSetEXT.invokeExact(device.capabilities().PFN_vkCreateIndirectExecutionSetEXT, device.segment(), pCreateInfo, pAllocator, pIndirectExecutionSet); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateIndirectExecutionSetEXT", e); }
    }

    /// Invokes `vkDestroyIndirectExecutionSetEXT`.
    /// ```
    /// void vkDestroyIndirectExecutionSetEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyIndirectExecutionSetEXT(@NonNull VkDevice device, long indirectExecutionSet, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyIndirectExecutionSetEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyIndirectExecutionSetEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyIndirectExecutionSetEXT", device, indirectExecutionSet, pAllocator); }
        Handles.MH_vkDestroyIndirectExecutionSetEXT.invokeExact(device.capabilities().PFN_vkDestroyIndirectExecutionSetEXT, device.segment(), indirectExecutionSet, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyIndirectExecutionSetEXT", e); }
    }

    /// Invokes `vkUpdateIndirectExecutionSetPipelineEXT`.
    /// ```
    /// void vkUpdateIndirectExecutionSetPipelineEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, uint32_t executionSetWriteCount, const VkWriteIndirectExecutionSetPipelineEXT* pExecutionSetWrites);
    /// ```
    public static void vkUpdateIndirectExecutionSetPipelineEXT(@NonNull VkDevice device, long indirectExecutionSet, int executionSetWriteCount, @NonNull MemorySegment pExecutionSetWrites) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateIndirectExecutionSetPipelineEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkUpdateIndirectExecutionSetPipelineEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUpdateIndirectExecutionSetPipelineEXT", device, indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites); }
        Handles.MH_vkUpdateIndirectExecutionSetPipelineEXT.invokeExact(device.capabilities().PFN_vkUpdateIndirectExecutionSetPipelineEXT, device.segment(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateIndirectExecutionSetPipelineEXT", e); }
    }

    /// Invokes `vkUpdateIndirectExecutionSetShaderEXT`.
    /// ```
    /// void vkUpdateIndirectExecutionSetShaderEXT(VkDevice device, VkIndirectExecutionSetEXT indirectExecutionSet, uint32_t executionSetWriteCount, const VkWriteIndirectExecutionSetShaderEXT* pExecutionSetWrites);
    /// ```
    public static void vkUpdateIndirectExecutionSetShaderEXT(@NonNull VkDevice device, long indirectExecutionSet, int executionSetWriteCount, @NonNull MemorySegment pExecutionSetWrites) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateIndirectExecutionSetShaderEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkUpdateIndirectExecutionSetShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUpdateIndirectExecutionSetShaderEXT", device, indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites); }
        Handles.MH_vkUpdateIndirectExecutionSetShaderEXT.invokeExact(device.capabilities().PFN_vkUpdateIndirectExecutionSetShaderEXT, device.segment(), indirectExecutionSet, executionSetWriteCount, pExecutionSetWrites); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateIndirectExecutionSetShaderEXT", e); }
    }

}
