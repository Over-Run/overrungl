// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_maintenance6` - device extension
public final class VKKHRMaintenance6 {
    public static final int VK_KHR_MAINTENANCE_6_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_6_EXTENSION_NAME = "VK_KHR_maintenance6";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_FEATURES_KHR = 1000545000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES_KHR = 1000545001;
    public static final int VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR = 1000545002;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_SETS_INFO_KHR = 1000545003;
    public static final int VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR = 1000545004;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_INFO_KHR = 1000545005;
    public static final int VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR = 1000545006;
    public static final int VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT = 1000545007;
    public static final int VK_STRUCTURE_TYPE_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_INFO_EXT = 1000545008;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkCmdBindDescriptorSets2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdPushConstants2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdPushDescriptorSet2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdPushDescriptorSetWithTemplate2KHR = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDescriptorBufferOffsets2EXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKKHRMaintenance6() {}

    /// Invokes `vkCmdBindDescriptorSets2KHR`.
    /// ```
    /// void vkCmdBindDescriptorSets2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkBindDescriptorSetsInfo* pBindDescriptorSetsInfo);
    /// ```
    public static void vkCmdBindDescriptorSets2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBindDescriptorSetsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorSets2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindDescriptorSets2KHR", commandBuffer, pBindDescriptorSetsInfo); }
        Handles.MH_vkCmdBindDescriptorSets2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorSets2KHR, commandBuffer.segment(), pBindDescriptorSetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorSets2KHR", e); }
    }

    /// Invokes `vkCmdPushConstants2KHR`.
    /// ```
    /// void vkCmdPushConstants2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushConstantsInfo* pPushConstantsInfo);
    /// ```
    public static void vkCmdPushConstants2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pPushConstantsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushConstants2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushConstants2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushConstants2KHR", commandBuffer, pPushConstantsInfo); }
        Handles.MH_vkCmdPushConstants2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdPushConstants2KHR, commandBuffer.segment(), pPushConstantsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushConstants2KHR", e); }
    }

    /// Invokes `vkCmdPushDescriptorSet2KHR`.
    /// ```
    /// void vkCmdPushDescriptorSet2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushDescriptorSetInfo* pPushDescriptorSetInfo);
    /// ```
    public static void vkCmdPushDescriptorSet2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pPushDescriptorSetInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSet2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSet2KHR", commandBuffer, pPushDescriptorSetInfo); }
        Handles.MH_vkCmdPushDescriptorSet2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSet2KHR, commandBuffer.segment(), pPushDescriptorSetInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSet2KHR", e); }
    }

    /// Invokes `vkCmdPushDescriptorSetWithTemplate2KHR`.
    /// ```
    /// void vkCmdPushDescriptorSetWithTemplate2KHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkPushDescriptorSetWithTemplateInfo* pPushDescriptorSetWithTemplateInfo);
    /// ```
    public static void vkCmdPushDescriptorSetWithTemplate2KHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pPushDescriptorSetWithTemplateInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdPushDescriptorSetWithTemplate2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdPushDescriptorSetWithTemplate2KHR", commandBuffer, pPushDescriptorSetWithTemplateInfo); }
        Handles.MH_vkCmdPushDescriptorSetWithTemplate2KHR.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdPushDescriptorSetWithTemplate2KHR, commandBuffer.segment(), pPushDescriptorSetWithTemplateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdPushDescriptorSetWithTemplate2KHR", e); }
    }

    /// Invokes `vkCmdSetDescriptorBufferOffsets2EXT`.
    /// ```
    /// void vkCmdSetDescriptorBufferOffsets2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkSetDescriptorBufferOffsetsInfoEXT* pSetDescriptorBufferOffsetsInfo);
    /// ```
    public static void vkCmdSetDescriptorBufferOffsets2EXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pSetDescriptorBufferOffsetsInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsets2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDescriptorBufferOffsets2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDescriptorBufferOffsets2EXT", commandBuffer, pSetDescriptorBufferOffsetsInfo); }
        Handles.MH_vkCmdSetDescriptorBufferOffsets2EXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsets2EXT, commandBuffer.segment(), pSetDescriptorBufferOffsetsInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDescriptorBufferOffsets2EXT", e); }
    }

    /// Invokes `vkCmdBindDescriptorBufferEmbeddedSamplers2EXT`.
    /// ```
    /// void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkBindDescriptorBufferEmbeddedSamplersInfoEXT* pBindDescriptorBufferEmbeddedSamplersInfo);
    /// ```
    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pBindDescriptorBufferEmbeddedSamplersInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBufferEmbeddedSamplers2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindDescriptorBufferEmbeddedSamplers2EXT", commandBuffer, pBindDescriptorBufferEmbeddedSamplersInfo); }
        Handles.MH_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplers2EXT, commandBuffer.segment(), pBindDescriptorBufferEmbeddedSamplersInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBufferEmbeddedSamplers2EXT", e); }
    }

}
