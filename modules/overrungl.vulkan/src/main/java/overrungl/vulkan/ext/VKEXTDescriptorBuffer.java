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
public class VKEXTDescriptorBuffer {
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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetDescriptorSetLayoutSizeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDescriptorSetLayoutBindingOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDescriptorEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBindDescriptorBuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetDescriptorBufferOffsetsEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBindDescriptorBufferEmbeddedSamplersEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkGetBufferOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageViewOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetSamplerOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetDescriptorSetLayoutSizeEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetDescriptorSetLayoutSizeEXT);
        public static final MethodHandle MH_vkGetDescriptorSetLayoutBindingOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetDescriptorSetLayoutBindingOffsetEXT);
        public static final MethodHandle MH_vkGetDescriptorEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetDescriptorEXT);
        public static final MethodHandle MH_vkCmdBindDescriptorBuffersEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindDescriptorBuffersEXT);
        public static final MethodHandle MH_vkCmdSetDescriptorBufferOffsetsEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDescriptorBufferOffsetsEXT);
        public static final MethodHandle MH_vkCmdBindDescriptorBufferEmbeddedSamplersEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindDescriptorBufferEmbeddedSamplersEXT);
        public static final MethodHandle MH_vkGetBufferOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetBufferOpaqueCaptureDescriptorDataEXT);
        public static final MethodHandle MH_vkGetImageOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetImageOpaqueCaptureDescriptorDataEXT);
        public static final MethodHandle MH_vkGetImageViewOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetImageViewOpaqueCaptureDescriptorDataEXT);
        public static final MethodHandle MH_vkGetSamplerOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetSamplerOpaqueCaptureDescriptorDataEXT);
        public static final MethodHandle MH_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT);
        public final MemorySegment PFN_vkGetDescriptorSetLayoutSizeEXT;
        public final MemorySegment PFN_vkGetDescriptorSetLayoutBindingOffsetEXT;
        public final MemorySegment PFN_vkGetDescriptorEXT;
        public final MemorySegment PFN_vkCmdBindDescriptorBuffersEXT;
        public final MemorySegment PFN_vkCmdSetDescriptorBufferOffsetsEXT;
        public final MemorySegment PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT;
        public final MemorySegment PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT;
        public final MemorySegment PFN_vkGetImageOpaqueCaptureDescriptorDataEXT;
        public final MemorySegment PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT;
        public final MemorySegment PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT;
        public final MemorySegment PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetDescriptorSetLayoutSizeEXT = func.invoke(device, "vkGetDescriptorSetLayoutSizeEXT");
            PFN_vkGetDescriptorSetLayoutBindingOffsetEXT = func.invoke(device, "vkGetDescriptorSetLayoutBindingOffsetEXT");
            PFN_vkGetDescriptorEXT = func.invoke(device, "vkGetDescriptorEXT");
            PFN_vkCmdBindDescriptorBuffersEXT = func.invoke(device, "vkCmdBindDescriptorBuffersEXT");
            PFN_vkCmdSetDescriptorBufferOffsetsEXT = func.invoke(device, "vkCmdSetDescriptorBufferOffsetsEXT");
            PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT = func.invoke(device, "vkCmdBindDescriptorBufferEmbeddedSamplersEXT");
            PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT = func.invoke(device, "vkGetBufferOpaqueCaptureDescriptorDataEXT");
            PFN_vkGetImageOpaqueCaptureDescriptorDataEXT = func.invoke(device, "vkGetImageOpaqueCaptureDescriptorDataEXT");
            PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT = func.invoke(device, "vkGetImageViewOpaqueCaptureDescriptorDataEXT");
            PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT = func.invoke(device, "vkGetSamplerOpaqueCaptureDescriptorDataEXT");
            PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT = func.invoke(device, "vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT");
        }
    }

    public VKEXTDescriptorBuffer(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void GetDescriptorSetLayoutSizeEXT(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSetLayout") MemorySegment layout, @CType("VkDeviceSize *") MemorySegment pLayoutSizeInBytes) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDescriptorSetLayoutSizeEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSizeEXT");
        try { Handles.MH_vkGetDescriptorSetLayoutSizeEXT.invokeExact(handles.PFN_vkGetDescriptorSetLayoutSizeEXT, device, layout, pLayoutSizeInBytes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSizeEXT", e); }
    }

    public void GetDescriptorSetLayoutBindingOffsetEXT(@CType("VkDevice") MemorySegment device, @CType("VkDescriptorSetLayout") MemorySegment layout, @CType("uint32_t") int binding, @CType("VkDeviceSize *") MemorySegment pOffset) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDescriptorSetLayoutBindingOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutBindingOffsetEXT");
        try { Handles.MH_vkGetDescriptorSetLayoutBindingOffsetEXT.invokeExact(handles.PFN_vkGetDescriptorSetLayoutBindingOffsetEXT, device, layout, binding, pOffset); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutBindingOffsetEXT", e); }
    }

    public void GetDescriptorEXT(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorGetInfoEXT *") MemorySegment pDescriptorInfo, @CType("size_t") long dataSize, @CType("void *") MemorySegment pDescriptor) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDescriptorEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorEXT");
        try { Handles.MH_vkGetDescriptorEXT.invokeExact(handles.PFN_vkGetDescriptorEXT, device, pDescriptorInfo, dataSize, pDescriptor); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorEXT", e); }
    }

    public void CmdBindDescriptorBuffersEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int bufferCount, @CType("const VkDescriptorBufferBindingInfoEXT *") MemorySegment pBindingInfos) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindDescriptorBuffersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBuffersEXT");
        try { Handles.MH_vkCmdBindDescriptorBuffersEXT.invokeExact(handles.PFN_vkCmdBindDescriptorBuffersEXT, commandBuffer, bufferCount, pBindingInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBuffersEXT", e); }
    }

    public void CmdSetDescriptorBufferOffsetsEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int firstSet, @CType("uint32_t") int setCount, @CType("const uint32_t *") MemorySegment pBufferIndices, @CType("const VkDeviceSize *") MemorySegment pOffsets) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDescriptorBufferOffsetsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDescriptorBufferOffsetsEXT");
        try { Handles.MH_vkCmdSetDescriptorBufferOffsetsEXT.invokeExact(handles.PFN_vkCmdSetDescriptorBufferOffsetsEXT, commandBuffer, pipelineBindPoint, layout, firstSet, setCount, pBufferIndices, pOffsets); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDescriptorBufferOffsetsEXT", e); }
    }

    public void CmdBindDescriptorBufferEmbeddedSamplersEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineBindPoint") int pipelineBindPoint, @CType("VkPipelineLayout") MemorySegment layout, @CType("uint32_t") int set) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindDescriptorBufferEmbeddedSamplersEXT");
        try { Handles.MH_vkCmdBindDescriptorBufferEmbeddedSamplersEXT.invokeExact(handles.PFN_vkCmdBindDescriptorBufferEmbeddedSamplersEXT, commandBuffer, pipelineBindPoint, layout, set); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindDescriptorBufferEmbeddedSamplersEXT", e); }
    }

    public @CType("VkResult") int GetBufferOpaqueCaptureDescriptorDataEXT(@CType("VkDevice") MemorySegment device, @CType("const VkBufferCaptureDescriptorDataInfoEXT *") MemorySegment pInfo, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetBufferOpaqueCaptureDescriptorDataEXT.invokeExact(handles.PFN_vkGetBufferOpaqueCaptureDescriptorDataEXT, device, pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferOpaqueCaptureDescriptorDataEXT", e); }
    }

    public @CType("VkResult") int GetImageOpaqueCaptureDescriptorDataEXT(@CType("VkDevice") MemorySegment device, @CType("const VkImageCaptureDescriptorDataInfoEXT *") MemorySegment pInfo, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageOpaqueCaptureDescriptorDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetImageOpaqueCaptureDescriptorDataEXT.invokeExact(handles.PFN_vkGetImageOpaqueCaptureDescriptorDataEXT, device, pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageOpaqueCaptureDescriptorDataEXT", e); }
    }

    public @CType("VkResult") int GetImageViewOpaqueCaptureDescriptorDataEXT(@CType("VkDevice") MemorySegment device, @CType("const VkImageViewCaptureDescriptorDataInfoEXT *") MemorySegment pInfo, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetImageViewOpaqueCaptureDescriptorDataEXT.invokeExact(handles.PFN_vkGetImageViewOpaqueCaptureDescriptorDataEXT, device, pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewOpaqueCaptureDescriptorDataEXT", e); }
    }

    public @CType("VkResult") int GetSamplerOpaqueCaptureDescriptorDataEXT(@CType("VkDevice") MemorySegment device, @CType("const VkSamplerCaptureDescriptorDataInfoEXT *") MemorySegment pInfo, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetSamplerOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetSamplerOpaqueCaptureDescriptorDataEXT.invokeExact(handles.PFN_vkGetSamplerOpaqueCaptureDescriptorDataEXT, device, pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSamplerOpaqueCaptureDescriptorDataEXT", e); }
    }

    public @CType("VkResult") int GetAccelerationStructureOpaqueCaptureDescriptorDataEXT(@CType("VkDevice") MemorySegment device, @CType("const VkAccelerationStructureCaptureDescriptorDataInfoEXT *") MemorySegment pInfo, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT");
        try { return (int) Handles.MH_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT.invokeExact(handles.PFN_vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT, device, pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT", e); }
    }

}
