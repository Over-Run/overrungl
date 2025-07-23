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
package overrungl.vulkan.arm;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKARMTensors {
    public static final long VK_TENSOR_CREATE_MUTABLE_FORMAT_BIT_ARM = 0x00000001L;
    public static final long VK_TENSOR_CREATE_PROTECTED_BIT_ARM = 0x00000002L;
    public static final long VK_TENSOR_USAGE_SHADER_BIT_ARM = 0x00000002L;
    public static final long VK_TENSOR_USAGE_TRANSFER_SRC_BIT_ARM = 0x00000004L;
    public static final long VK_TENSOR_USAGE_TRANSFER_DST_BIT_ARM = 0x00000008L;
    public static final long VK_TENSOR_USAGE_IMAGE_ALIASING_BIT_ARM = 0x00000010L;
    public static final int VK_TENSOR_TILING_OPTIMAL_ARM = 0;
    public static final int VK_TENSOR_TILING_LINEAR_ARM = 1;
    public static final int VK_ARM_TENSORS_SPEC_VERSION = 1;
    public static final String VK_ARM_TENSORS_EXTENSION_NAME = "VK_ARM_tensors";
    public static final int VK_STRUCTURE_TYPE_TENSOR_CREATE_INFO_ARM = 1000460000;
    public static final int VK_STRUCTURE_TYPE_TENSOR_VIEW_CREATE_INFO_ARM = 1000460001;
    public static final int VK_STRUCTURE_TYPE_BIND_TENSOR_MEMORY_INFO_ARM = 1000460002;
    public static final int VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_TENSOR_ARM = 1000460003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_PROPERTIES_ARM = 1000460004;
    public static final int VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM = 1000460005;
    public static final int VK_STRUCTURE_TYPE_TENSOR_DESCRIPTION_ARM = 1000460006;
    public static final int VK_STRUCTURE_TYPE_TENSOR_MEMORY_REQUIREMENTS_INFO_ARM = 1000460007;
    public static final int VK_STRUCTURE_TYPE_TENSOR_MEMORY_BARRIER_ARM = 1000460008;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TENSOR_FEATURES_ARM = 1000460009;
    public static final int VK_STRUCTURE_TYPE_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM = 1000460010;
    public static final int VK_STRUCTURE_TYPE_COPY_TENSOR_INFO_ARM = 1000460011;
    public static final int VK_STRUCTURE_TYPE_TENSOR_COPY_ARM = 1000460012;
    public static final int VK_STRUCTURE_TYPE_TENSOR_DEPENDENCY_INFO_ARM = 1000460013;
    public static final int VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_TENSOR_ARM = 1000460014;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_TENSOR_INFO_ARM = 1000460015;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM = 1000460016;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_TENSOR_CREATE_INFO_ARM = 1000460017;
    public static final int VK_OBJECT_TYPE_TENSOR_ARM = 1000460000;
    public static final int VK_OBJECT_TYPE_TENSOR_VIEW_ARM = 1000460001;
    public static final int VK_DESCRIPTOR_TYPE_TENSOR_ARM = 1000460000;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_SHADER_BIT_ARM = 0x8000000000L;
    public static final long VK_FORMAT_FEATURE_2_TENSOR_IMAGE_ALIASING_BIT_ARM = 0x80000000000L;
    public static final int VK_IMAGE_USAGE_TENSOR_ALIASING_BIT_ARM = 0x00800000;
    public static final int VK_IMAGE_LAYOUT_TENSOR_ALIASING_ARM = 1000460000;
    public static final int VK_FORMAT_R8_BOOL_ARM = 1000460000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_FEATURES_ARM = 1000460018;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_TENSOR_PROPERTIES_ARM = 1000460019;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_GET_TENSOR_INFO_ARM = 1000460020;
    public static final int VK_STRUCTURE_TYPE_TENSOR_CAPTURE_DESCRIPTOR_DATA_INFO_ARM = 1000460021;
    public static final int VK_STRUCTURE_TYPE_TENSOR_VIEW_CAPTURE_DESCRIPTOR_DATA_INFO_ARM = 1000460022;
    public static final long VK_TENSOR_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 0x00000004L;
    public static final long VK_TENSOR_VIEW_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_ARM = 0x00000001L;
    public static final int VK_STRUCTURE_TYPE_FRAME_BOUNDARY_TENSORS_ARM = 1000460023;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateTensorARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyTensorARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateTensorViewARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyTensorViewARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetTensorMemoryRequirementsARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindTensorMemoryARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceTensorMemoryRequirementsARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCopyTensorARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalTensorPropertiesARM = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetTensorOpaqueCaptureDescriptorDataARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetTensorViewOpaqueCaptureDescriptorDataARM = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKARMTensors() {}

    /// ```
    /// (int) VkResult vkCreateTensorARM((struct VkDevice*) VkDevice device, const VkTensorCreateInfoARM* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkTensorARM* pTensor);
    /// ```
    public static int vkCreateTensorARM(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pTensor) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateTensorARM)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateTensorARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateTensorARM", device, pCreateInfo, pAllocator, pTensor); }
        return (int) Handles.MH_vkCreateTensorARM.invokeExact(device.capabilities().PFN_vkCreateTensorARM, device.segment(), pCreateInfo, pAllocator, pTensor); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateTensorARM", e); }
    }

    /// ```
    /// void vkDestroyTensorARM((struct VkDevice*) VkDevice device, (uint64_t) VkTensorARM tensor, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyTensorARM(VkDevice device, long tensor, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyTensorARM)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyTensorARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyTensorARM", device, tensor, pAllocator); }
        Handles.MH_vkDestroyTensorARM.invokeExact(device.capabilities().PFN_vkDestroyTensorARM, device.segment(), tensor, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyTensorARM", e); }
    }

    /// ```
    /// (int) VkResult vkCreateTensorViewARM((struct VkDevice*) VkDevice device, const VkTensorViewCreateInfoARM* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkTensorViewARM* pView);
    /// ```
    public static int vkCreateTensorViewARM(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pView) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateTensorViewARM)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateTensorViewARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateTensorViewARM", device, pCreateInfo, pAllocator, pView); }
        return (int) Handles.MH_vkCreateTensorViewARM.invokeExact(device.capabilities().PFN_vkCreateTensorViewARM, device.segment(), pCreateInfo, pAllocator, pView); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateTensorViewARM", e); }
    }

    /// ```
    /// void vkDestroyTensorViewARM((struct VkDevice*) VkDevice device, (uint64_t) VkTensorViewARM tensorView, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyTensorViewARM(VkDevice device, long tensorView, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyTensorViewARM)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyTensorViewARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyTensorViewARM", device, tensorView, pAllocator); }
        Handles.MH_vkDestroyTensorViewARM.invokeExact(device.capabilities().PFN_vkDestroyTensorViewARM, device.segment(), tensorView, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyTensorViewARM", e); }
    }

    /// ```
    /// void vkGetTensorMemoryRequirementsARM((struct VkDevice*) VkDevice device, const VkTensorMemoryRequirementsInfoARM* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetTensorMemoryRequirementsARM(VkDevice device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetTensorMemoryRequirementsARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetTensorMemoryRequirementsARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetTensorMemoryRequirementsARM", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetTensorMemoryRequirementsARM.invokeExact(device.capabilities().PFN_vkGetTensorMemoryRequirementsARM, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetTensorMemoryRequirementsARM", e); }
    }

    /// ```
    /// (int) VkResult vkBindTensorMemoryARM((struct VkDevice*) VkDevice device, uint32_t bindInfoCount, const VkBindTensorMemoryInfoARM* pBindInfos);
    /// ```
    public static int vkBindTensorMemoryARM(VkDevice device, int bindInfoCount, MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindTensorMemoryARM)) throw new VKSymbolNotFoundError("Symbol not found: vkBindTensorMemoryARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindTensorMemoryARM", device, bindInfoCount, pBindInfos); }
        return (int) Handles.MH_vkBindTensorMemoryARM.invokeExact(device.capabilities().PFN_vkBindTensorMemoryARM, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindTensorMemoryARM", e); }
    }

    /// ```
    /// void vkGetDeviceTensorMemoryRequirementsARM((struct VkDevice*) VkDevice device, const VkDeviceTensorMemoryRequirementsARM* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceTensorMemoryRequirementsARM(VkDevice device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceTensorMemoryRequirementsARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceTensorMemoryRequirementsARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceTensorMemoryRequirementsARM", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceTensorMemoryRequirementsARM.invokeExact(device.capabilities().PFN_vkGetDeviceTensorMemoryRequirementsARM, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceTensorMemoryRequirementsARM", e); }
    }

    /// ```
    /// void vkCmdCopyTensorARM((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCopyTensorInfoARM* pCopyTensorInfo);
    /// ```
    public static void vkCmdCopyTensorARM(VkCommandBuffer commandBuffer, MemorySegment pCopyTensorInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyTensorARM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyTensorARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyTensorARM", commandBuffer, pCopyTensorInfo); }
        Handles.MH_vkCmdCopyTensorARM.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyTensorARM, commandBuffer.segment(), pCopyTensorInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyTensorARM", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceExternalTensorPropertiesARM((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceExternalTensorInfoARM* pExternalTensorInfo, VkExternalTensorPropertiesARM* pExternalTensorProperties);
    /// ```
    public static void vkGetPhysicalDeviceExternalTensorPropertiesARM(VkPhysicalDevice physicalDevice, MemorySegment pExternalTensorInfo, MemorySegment pExternalTensorProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalTensorPropertiesARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalTensorPropertiesARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceExternalTensorPropertiesARM", physicalDevice, pExternalTensorInfo, pExternalTensorProperties); }
        Handles.MH_vkGetPhysicalDeviceExternalTensorPropertiesARM.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalTensorPropertiesARM, physicalDevice.segment(), pExternalTensorInfo, pExternalTensorProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalTensorPropertiesARM", e); }
    }

    /// ```
    /// (int) VkResult vkGetTensorOpaqueCaptureDescriptorDataARM((struct VkDevice*) VkDevice device, const VkTensorCaptureDescriptorDataInfoARM* pInfo, void* pData);
    /// ```
    public static int vkGetTensorOpaqueCaptureDescriptorDataARM(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetTensorOpaqueCaptureDescriptorDataARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetTensorOpaqueCaptureDescriptorDataARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetTensorOpaqueCaptureDescriptorDataARM", device, pInfo, pData); }
        return (int) Handles.MH_vkGetTensorOpaqueCaptureDescriptorDataARM.invokeExact(device.capabilities().PFN_vkGetTensorOpaqueCaptureDescriptorDataARM, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetTensorOpaqueCaptureDescriptorDataARM", e); }
    }

    /// ```
    /// (int) VkResult vkGetTensorViewOpaqueCaptureDescriptorDataARM((struct VkDevice*) VkDevice device, const VkTensorViewCaptureDescriptorDataInfoARM* pInfo, void* pData);
    /// ```
    public static int vkGetTensorViewOpaqueCaptureDescriptorDataARM(VkDevice device, MemorySegment pInfo, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetTensorViewOpaqueCaptureDescriptorDataARM)) throw new VKSymbolNotFoundError("Symbol not found: vkGetTensorViewOpaqueCaptureDescriptorDataARM");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetTensorViewOpaqueCaptureDescriptorDataARM", device, pInfo, pData); }
        return (int) Handles.MH_vkGetTensorViewOpaqueCaptureDescriptorDataARM.invokeExact(device.capabilities().PFN_vkGetTensorViewOpaqueCaptureDescriptorDataARM, device.segment(), pInfo, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetTensorViewOpaqueCaptureDescriptorDataARM", e); }
    }

}
