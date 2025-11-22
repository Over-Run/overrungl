// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_device_generated_commands_compute` - device extension
public final class VKNVDeviceGeneratedCommandsCompute {
    public static final int VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_SPEC_VERSION = 2;
    public static final String VK_NV_DEVICE_GENERATED_COMMANDS_COMPUTE_EXTENSION_NAME = "VK_NV_device_generated_commands_compute";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV = 1000428000;
    public static final int VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_INDIRECT_BUFFER_INFO_NV = 1000428001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INDIRECT_DEVICE_ADDRESS_INFO_NV = 1000428002;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NV = 1000428003;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NV = 1000428004;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV = 0x00000080;
    private VKNVDeviceGeneratedCommandsCompute() {}
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineIndirectMemoryRequirementsNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdUpdatePipelineIndirectBufferNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPipelineIndirectDeviceAddressNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkGetPipelineIndirectMemoryRequirementsNV`.
    /// ```
    /// void vkGetPipelineIndirectMemoryRequirementsNV(VkDevice device, const VkComputePipelineCreateInfo* pCreateInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetPipelineIndirectMemoryRequirementsNV(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineIndirectMemoryRequirementsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineIndirectMemoryRequirementsNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineIndirectMemoryRequirementsNV", device, pCreateInfo, pMemoryRequirements); }
        Handles.MH_vkGetPipelineIndirectMemoryRequirementsNV.invokeExact(device.capabilities().PFN_vkGetPipelineIndirectMemoryRequirementsNV, device.segment(), pCreateInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineIndirectMemoryRequirementsNV", e); }
    }

    /// Invokes `vkCmdUpdatePipelineIndirectBufferNV`.
    /// ```
    /// void vkCmdUpdatePipelineIndirectBufferNV(VkCommandBuffer commandBuffer, VkPipelineBindPoint pipelineBindPoint, VkPipeline pipeline);
    /// ```
    public static void vkCmdUpdatePipelineIndirectBufferNV(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long pipeline) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdUpdatePipelineIndirectBufferNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdUpdatePipelineIndirectBufferNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdUpdatePipelineIndirectBufferNV", commandBuffer, pipelineBindPoint, pipeline); }
        Handles.MH_vkCmdUpdatePipelineIndirectBufferNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdUpdatePipelineIndirectBufferNV, commandBuffer.segment(), pipelineBindPoint, pipeline); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdUpdatePipelineIndirectBufferNV", e); }
    }

    /// Invokes `vkGetPipelineIndirectDeviceAddressNV`.
    /// ```
    /// VkDeviceAddress vkGetPipelineIndirectDeviceAddressNV(VkDevice device, const VkPipelineIndirectDeviceAddressInfoNV* pInfo);
    /// ```
    public static long vkGetPipelineIndirectDeviceAddressNV(@NonNull VkDevice device, @NonNull MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineIndirectDeviceAddressNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineIndirectDeviceAddressNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineIndirectDeviceAddressNV", device, pInfo); }
        return (long) Handles.MH_vkGetPipelineIndirectDeviceAddressNV.invokeExact(device.capabilities().PFN_vkGetPipelineIndirectDeviceAddressNV, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineIndirectDeviceAddressNV", e); }
    }

}
