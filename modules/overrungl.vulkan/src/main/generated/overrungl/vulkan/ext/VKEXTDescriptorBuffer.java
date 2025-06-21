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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
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
        public static final MethodHandle MH_vkGetDescriptorSetLayoutSizeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDescriptorSetLayoutBindingOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDescriptorEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindDescriptorBuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDescriptorBufferOffsetsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindDescriptorBufferEmbeddedSamplersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkGetBufferOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSamplerOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDescriptorBuffer() {}

    /// ```
    /// void vkGetDescriptorSetLayoutSizeEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSetLayout layout, VkDeviceSize* pLayoutSizeInBytes);
    /// ```
    public static void vkGetDescriptorSetLayoutSizeEXT(VkDevice device, long layout, MemorySegment pLayoutSizeInBytes) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutSizeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSizeEXT");
        try { Handles.MH_vkGetDescriptorSetLayoutSizeEXT.invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutSizeEXT, device.segment(), layout, pLayoutSizeInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSizeEXT", e); }
    }

    /// ```
    /// void vkGetDescriptorSetLayoutBindingOffsetEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDescriptorSetLayout layout, uint32_t binding, VkDeviceSize* pOffset);
    /// ```
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(VkDevice device, long layout, int binding, MemorySegment pOffset) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutBindingOffsetEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutBindingOffsetEXT");
        try { Handles.MH_vkGetDescriptorSetLayoutBindingOffsetEXT.invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutBindingOffsetEXT, device.segment(), layout, binding, pOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutBindingOffsetEXT", e); }
    }

    /// ```
    /// void vkGetDescriptorEXT((struct VkDevice*) VkDevice device, const VkDescriptorGetInfoEXT* pDescriptorInfo, size_t dataSize, void* pDescriptor);
    /// ```
    public static void vkGetDescriptorEXT(VkDevice device, MemorySegment pDescriptorInfo, long dataSize, MemorySegment pDescriptor) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDescriptorEXT");
        try { Handles.MH_vkGetDescriptorEXT.invoke(device.capabilities().PFN_vkGetDescriptorEXT, device.segment(), pDescriptorInfo, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, dataSize), pDescriptor); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorEXT", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorBuffersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t bufferCount, const VkDescriptorBufferBindingInfoEXT* pBindingInfos);
    /// ```
    public static void vkCmdBindDescriptorBuffersEXT(VkCommandBuffer commandBuffer, int bufferCount, MemorySegment pBindingInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBuffersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBuffersEXT");
        try { Handles.MH_vkCmdBindDescriptorBuffersEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBuffersEXT, commandBuffer.segment(), bufferCount, pBindingInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBuffersEXT", e); }
    }

    /// ```
    /// void vkCmdSetDescriptorBufferOffsetsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t firstSet, uint32_t setCount, const uint32_t* pBufferIndices, const VkDeviceSize* pOffsets);
    /// ```
    public static void vkCmdSetDescriptorBufferOffsetsEXT(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int firstSet, int setCount, MemorySegment pBufferIndices, MemorySegment pOffsets) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsetsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDescriptorBufferOffsetsEXT");
        try { Handles.MH_vkCmdSetDescriptorBufferOffsetsEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDescriptorBufferOffsetsEXT, commandBuffer.segment(), pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDescriptorBufferOffsetsEXT", e); }
    }

    /// ```
    /// void vkCmdBindDescriptorBufferEmbeddedSamplersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineBindPoint pipelineBindPoint, (uint64_t) VkPipelineLayout layout, uint32_t set);
    /// ```
    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(VkCommandBuffer commandBuffer, int pipelineBindPoint, long layout, int set) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBufferEmbeddedSamplersEXT");
        try { Handles.MH_vkCmdBindDescriptorBufferEmbeddedSamplersEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT, commandBuffer.segment(), pipelineBindPoint, layout, set); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBufferEmbeddedSamplersEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetBufferOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkBufferCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetBufferOpaqueCaptureDescriptorDataEXT.invokeExact(device.capabilities().PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetImageOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkImageCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetImageOpaqueCaptureDescriptorDataEXT.invokeExact(device.capabilities().PFN_vkGetImageOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetImageViewOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkImageViewCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetImageViewOpaqueCaptureDescriptorDataEXT.invokeExact(device.capabilities().PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetSamplerOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkSamplerCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSamplerOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetSamplerOpaqueCaptureDescriptorDataEXT.invokeExact(device.capabilities().PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSamplerOpaqueCaptureDescriptorDataEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT((struct VkDevice*) VkDevice device, const VkAccelerationStructureCaptureDescriptorDataInfoEXT* pInfo, void* pData);
    /// ```
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.invokeExact(device.capabilities().PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT", e); }
    }

}
