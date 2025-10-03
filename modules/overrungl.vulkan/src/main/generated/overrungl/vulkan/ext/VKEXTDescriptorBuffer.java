// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_descriptor_buffer` - device extension
public final class VKEXTDescriptorBuffer {
    public static final int VK_EXT_DESCRIPTOR_BUFFER_SPEC_VERSION = 1;
    public static final String VK_EXT_DESCRIPTOR_BUFFER_EXTENSION_NAME = "VK_EXT_descriptor_buffer";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT = 1000316000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT = 1000316001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT = 1000316002;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT = 1000316003;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT = 1000316004;
    public static final int VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316005;
    public static final int VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316006;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316007;
    public static final int VK_STRUCTURE_TYPE_SAMPLER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316008;
    public static final int VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT = 1000316010;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_INFO_EXT = 1000316011;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT = 1000316012;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 0x00000010;
    public static final int VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT = 0x00000020;
    public static final int VK_BUFFER_USAGE_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT = 0x00200000;
    public static final int VK_BUFFER_USAGE_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT = 0x00400000;
    public static final int VK_BUFFER_USAGE_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT = 0x04000000;
    public static final int VK_BUFFER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x00000020;
    public static final int VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x00010000;
    public static final int VK_IMAGE_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x00000004;
    public static final int VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x00000008;
    public static final int VK_ACCELERATION_STRUCTURE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 0x00000008;
    public static final long VK_ACCESS_2_DESCRIPTOR_BUFFER_READ_BIT_EXT = 0x20000000000L;
    public static final int VK_PIPELINE_CREATE_DESCRIPTOR_BUFFER_BIT_EXT = 0x20000000;
    public static final int VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT = 1000316009;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_vkGetDescriptorSetLayoutSizeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetDescriptorSetLayoutBindingOffsetEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetDescriptorEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBindDescriptorBuffersEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDescriptorBufferOffsetsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBindDescriptorBufferEmbeddedSamplersEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkGetBufferOpaqueCaptureDescriptorDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetImageOpaqueCaptureDescriptorDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetImageViewOpaqueCaptureDescriptorDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetSamplerOpaqueCaptureDescriptorDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTDescriptorBuffer() {}

    /// Invokes `vkGetDescriptorSetLayoutSizeEXT`.
    /// ```
    /// void vkGetDescriptorSetLayoutSizeEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSetLayout layout, VkDeviceSize* pLayoutSizeInBytes);
    /// ```
    public static void vkGetDescriptorSetLayoutSizeEXT(@NonNull VkDevice device, long layout, @NonNull MemorySegment pLayoutSizeInBytes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutSizeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSizeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDescriptorSetLayoutSizeEXT", device, layout, pLayoutSizeInBytes); }
        Handles.MH_vkGetDescriptorSetLayoutSizeEXT.get().invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutSizeEXT, device.segment(), layout, pLayoutSizeInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSizeEXT", e); }
    }

    /// Invokes `vkGetDescriptorSetLayoutBindingOffsetEXT`.
    /// ```
    /// void vkGetDescriptorSetLayoutBindingOffsetEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSetLayout layout, uint32_t binding, VkDeviceSize* pOffset);
    /// ```
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(@NonNull VkDevice device, long layout, int binding, @NonNull MemorySegment pOffset) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutBindingOffsetEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutBindingOffsetEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDescriptorSetLayoutBindingOffsetEXT", device, layout, binding, pOffset); }
        Handles.MH_vkGetDescriptorSetLayoutBindingOffsetEXT.get().invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutBindingOffsetEXT, device.segment(), layout, binding, pOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutBindingOffsetEXT", e); }
    }

    /// Invokes `vkGetDescriptorEXT`.
    /// ```
    /// void vkGetDescriptorEXT((struct VkDevice*) VkDevice device, const VkDescriptorGetInfoEXT* pDescriptorInfo, size_t dataSize, void* pDescriptor);
    /// ```
    public static void vkGetDescriptorEXT(@NonNull VkDevice device, @NonNull MemorySegment pDescriptorInfo, long dataSize, @NonNull MemorySegment pDescriptor) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDescriptorEXT", device, pDescriptorInfo, dataSize, pDescriptor); }
        Handles.MH_vkGetDescriptorEXT.get().invoke(device.capabilities().PFN_vkGetDescriptorEXT, device.segment(), pDescriptorInfo, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pDescriptor); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorEXT", e); }
    }

    /// Invokes `vkCmdBindDescriptorBuffersEXT`.
    /// ```
    /// void vkCmdBindDescriptorBuffersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t bufferCount, const VkDescriptorBufferBindingInfoEXT* pBindingInfos);
    /// ```
    public static void vkCmdBindDescriptorBuffersEXT(@NonNull VkCommandBuffer commandBuffer, int bufferCount, @NonNull MemorySegment pBindingInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBuffersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBuffersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindDescriptorBuffersEXT", commandBuffer, bufferCount, pBindingInfos); }
        Handles.MH_vkCmdBindDescriptorBuffersEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBuffersEXT, commandBuffer.segment(), bufferCount, pBindingInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBuffersEXT", e); }
    }

    /// Invokes `vkCmdSetDescriptorBufferOffsetsEXT`.
    /// ```
    /// void vkCmdSetDescriptorBufferOffsetsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t firstSet, uint32_t setCount, const uint32_t* pBufferIndices, const VkDeviceSize* pOffsets);
    /// ```
    public static void vkCmdSetDescriptorBufferOffsetsEXT(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int setCount, @NonNull MemorySegment pBufferIndices, @NonNull MemorySegment pOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsetsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDescriptorBufferOffsetsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDescriptorBufferOffsetsEXT", commandBuffer, pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets); }
        Handles.MH_vkCmdSetDescriptorBufferOffsetsEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsetsEXT, commandBuffer.segment(), pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDescriptorBufferOffsetsEXT", e); }
    }

    /// Invokes `vkCmdBindDescriptorBufferEmbeddedSamplersEXT`.
    /// ```
    /// void vkCmdBindDescriptorBufferEmbeddedSamplersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t set);
    /// ```
    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(@NonNull VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBufferEmbeddedSamplersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindDescriptorBufferEmbeddedSamplersEXT", commandBuffer, pipelineBindPoint, layout, set); }
        Handles.MH_vkCmdBindDescriptorBufferEmbeddedSamplersEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT, commandBuffer.segment(), pipelineBindPoint, layout, set); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBufferEmbeddedSamplersEXT", e); }
    }

    /// Invokes `vkGetBufferOpaqueCaptureDescriptorDataEXT`.
    /// ```
    /// (int) VkResult vkGetBufferOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkBufferCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferOpaqueCaptureDescriptorDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferOpaqueCaptureDescriptorDataEXT", device, pInfo, pData); }
        return (int) Handles.MH_vkGetBufferOpaqueCaptureDescriptorDataEXT.get().invokeExact(device.capabilities().PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// Invokes `vkGetImageOpaqueCaptureDescriptorDataEXT`.
    /// ```
    /// (int) VkResult vkGetImageOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkImageCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageOpaqueCaptureDescriptorDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageOpaqueCaptureDescriptorDataEXT", device, pInfo, pData); }
        return (int) Handles.MH_vkGetImageOpaqueCaptureDescriptorDataEXT.get().invokeExact(device.capabilities().PFN_vkGetImageOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// Invokes `vkGetImageViewOpaqueCaptureDescriptorDataEXT`.
    /// ```
    /// (int) VkResult vkGetImageViewOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkImageViewCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewOpaqueCaptureDescriptorDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetImageViewOpaqueCaptureDescriptorDataEXT", device, pInfo, pData); }
        return (int) Handles.MH_vkGetImageViewOpaqueCaptureDescriptorDataEXT.get().invokeExact(device.capabilities().PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// Invokes `vkGetSamplerOpaqueCaptureDescriptorDataEXT`.
    /// ```
    /// (int) VkResult vkGetSamplerOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkSamplerCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSamplerOpaqueCaptureDescriptorDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSamplerOpaqueCaptureDescriptorDataEXT", device, pInfo, pData); }
        return (int) Handles.MH_vkGetSamplerOpaqueCaptureDescriptorDataEXT.get().invokeExact(device.capabilities().PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSamplerOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// Invokes `vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT`.
    /// ```
    /// (int) VkResult vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkAccelerationStructureCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(@NonNull VkDevice device, @NonNull MemorySegment pInfo, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT", device, pInfo, pData); }
        return (int) Handles.MH_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.get().invokeExact(device.capabilities().PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT", e); }
    }

}
