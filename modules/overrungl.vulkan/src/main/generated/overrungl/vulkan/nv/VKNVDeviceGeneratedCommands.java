// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_device_generated_commands` - device extension
public final class VKNVDeviceGeneratedCommands {
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
    public static final class Handles {
        public static final MethodHandle MH_vkGetGeneratedCommandsMemoryRequirementsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdPreprocessGeneratedCommandsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdExecuteGeneratedCommandsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindPipelineShaderGroupNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCreateIndirectCommandsLayoutNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyIndirectCommandsLayoutNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVDeviceGeneratedCommands() {}

    /// Invokes `vkGetGeneratedCommandsMemoryRequirementsNV`.
    /// ```
    /// void vkGetGeneratedCommandsMemoryRequirementsNV((struct VkDevice*) VkDevice device, const VkGeneratedCommandsMemoryRequirementsInfoNV* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetGeneratedCommandsMemoryRequirementsNV(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetGeneratedCommandsMemoryRequirementsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetGeneratedCommandsMemoryRequirementsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetGeneratedCommandsMemoryRequirementsNV", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetGeneratedCommandsMemoryRequirementsNV.invokeExact(device.capabilities().PFN_vkGetGeneratedCommandsMemoryRequirementsNV, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetGeneratedCommandsMemoryRequirementsNV", e); }
    }

    /// Invokes `vkCmdPreprocessGeneratedCommandsNV`.
    /// ```
    /// void vkCmdPreprocessGeneratedCommandsNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkGeneratedCommandsInfoNV* pGeneratedCommandsInfo);
    /// ```
    public static void vkCmdPreprocessGeneratedCommandsNV(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pGeneratedCommandsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPreprocessGeneratedCommandsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPreprocessGeneratedCommandsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPreprocessGeneratedCommandsNV", commandBuffer, pGeneratedCommandsInfo); }
        Handles.MH_vkCmdPreprocessGeneratedCommandsNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdPreprocessGeneratedCommandsNV, commandBuffer.segment(), pGeneratedCommandsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPreprocessGeneratedCommandsNV", e); }
    }

    /// Invokes `vkCmdExecuteGeneratedCommandsNV`.
    /// ```
    /// void vkCmdExecuteGeneratedCommandsNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 isPreprocessed, const VkGeneratedCommandsInfoNV* pGeneratedCommandsInfo);
    /// ```
    public static void vkCmdExecuteGeneratedCommandsNV(@NonNull VkCommandBuffer commandBuffer, int isPreprocessed, @NonNull MemorySegment pGeneratedCommandsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdExecuteGeneratedCommandsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdExecuteGeneratedCommandsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdExecuteGeneratedCommandsNV", commandBuffer, isPreprocessed, pGeneratedCommandsInfo); }
        Handles.MH_vkCmdExecuteGeneratedCommandsNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdExecuteGeneratedCommandsNV, commandBuffer.segment(), isPreprocessed, pGeneratedCommandsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdExecuteGeneratedCommandsNV", e); }
    }

    /// Invokes `vkCmdBindPipelineShaderGroupNV`.
    /// ```
    /// void vkCmdBindPipelineShaderGroupNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipeline pipeline, uint32_t groupIndex);
    /// ```
    public static void vkCmdBindPipelineShaderGroupNV(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline, int groupIndex) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindPipelineShaderGroupNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindPipelineShaderGroupNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindPipelineShaderGroupNV", commandBuffer, pipelineBindPoint, pipeline, groupIndex); }
        Handles.MH_vkCmdBindPipelineShaderGroupNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindPipelineShaderGroupNV, commandBuffer.segment(), pipelineBindPoint, pipeline, groupIndex); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindPipelineShaderGroupNV", e); }
    }

    /// Invokes `vkCreateIndirectCommandsLayoutNV`.
    /// ```
    /// (int) VkResult vkCreateIndirectCommandsLayoutNV((struct VkDevice*) VkDevice device, const VkIndirectCommandsLayoutCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkIndirectCommandsLayoutNV* pIndirectCommandsLayout);
    /// ```
    public static int vkCreateIndirectCommandsLayoutNV(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pIndirectCommandsLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateIndirectCommandsLayoutNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateIndirectCommandsLayoutNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateIndirectCommandsLayoutNV", device, pCreateInfo, pAllocator, pIndirectCommandsLayout); }
        return (int) Handles.MH_vkCreateIndirectCommandsLayoutNV.invokeExact(device.capabilities().PFN_vkCreateIndirectCommandsLayoutNV, device.segment(), pCreateInfo, pAllocator, pIndirectCommandsLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateIndirectCommandsLayoutNV", e); }
    }

    /// Invokes `vkDestroyIndirectCommandsLayoutNV`.
    /// ```
    /// void vkDestroyIndirectCommandsLayoutNV((struct VkDevice*) VkDevice device, (uint64_t) VkIndirectCommandsLayoutNV indirectCommandsLayout, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyIndirectCommandsLayoutNV(@NonNull VkDevice device, long indirectCommandsLayout, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyIndirectCommandsLayoutNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyIndirectCommandsLayoutNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyIndirectCommandsLayoutNV", device, indirectCommandsLayout, pAllocator); }
        Handles.MH_vkDestroyIndirectCommandsLayoutNV.invokeExact(device.capabilities().PFN_vkDestroyIndirectCommandsLayoutNV, device.segment(), indirectCommandsLayout, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyIndirectCommandsLayoutNV", e); }
    }

}
