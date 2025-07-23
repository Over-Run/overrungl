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
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRVideoQueue {
    public static final int VK_VIDEO_CODEC_OPERATION_NONE_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_INVALID_KHR = 0;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_MONOCHROME_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_420_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_422_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_CHROMA_SUBSAMPLING_444_BIT_KHR = 0x00000008;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_INVALID_KHR = 0;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_8_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_10_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_COMPONENT_BIT_DEPTH_12_BIT_KHR = 0x00000010;
    public static final int VK_VIDEO_CAPABILITY_PROTECTED_CONTENT_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_CAPABILITY_SEPARATE_REFERENCE_IMAGES_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_SESSION_CREATE_PROTECTED_CONTENT_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_CODING_CONTROL_RESET_BIT_KHR = 0x00000001;
    public static final int VK_QUERY_RESULT_STATUS_ERROR_KHR = -1;
    public static final int VK_QUERY_RESULT_STATUS_NOT_READY_KHR = 0;
    public static final int VK_QUERY_RESULT_STATUS_COMPLETE_KHR = 1;
    public static final int VK_KHR_VIDEO_QUEUE_SPEC_VERSION = 8;
    public static final String VK_KHR_VIDEO_QUEUE_EXTENSION_NAME = "VK_KHR_video_queue";
    public static final int VK_STRUCTURE_TYPE_VIDEO_PROFILE_INFO_KHR = 1000023000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR = 1000023001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR = 1000023002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR = 1000023003;
    public static final int VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR = 1000023004;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR = 1000023005;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_CREATE_INFO_KHR = 1000023006;
    public static final int VK_STRUCTURE_TYPE_VIDEO_SESSION_PARAMETERS_UPDATE_INFO_KHR = 1000023007;
    public static final int VK_STRUCTURE_TYPE_VIDEO_BEGIN_CODING_INFO_KHR = 1000023008;
    public static final int VK_STRUCTURE_TYPE_VIDEO_END_CODING_INFO_KHR = 1000023009;
    public static final int VK_STRUCTURE_TYPE_VIDEO_CODING_CONTROL_INFO_KHR = 1000023010;
    public static final int VK_STRUCTURE_TYPE_VIDEO_REFERENCE_SLOT_INFO_KHR = 1000023011;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_VIDEO_PROPERTIES_KHR = 1000023012;
    public static final int VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR = 1000023013;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_FORMAT_INFO_KHR = 1000023014;
    public static final int VK_STRUCTURE_TYPE_VIDEO_FORMAT_PROPERTIES_KHR = 1000023015;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR = 1000023016;
    public static final int VK_OBJECT_TYPE_VIDEO_SESSION_KHR = 1000023000;
    public static final int VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR = 1000023001;
    public static final int VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR = 1000023000;
    public static final int VK_QUERY_RESULT_WITH_STATUS_BIT_KHR = 0x00000010;
    public static final int VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR = -1000023000;
    public static final int VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR = -1000023001;
    public static final int VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR = -1000023002;
    public static final int VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR = -1000023003;
    public static final int VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR = -1000023004;
    public static final int VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR = -1000023005;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoCapabilitiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoFormatPropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateVideoSessionKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyVideoSessionKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetVideoSessionMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindVideoSessionMemoryKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateVideoSessionParametersKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateVideoSessionParametersKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyVideoSessionParametersKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginVideoCodingKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndVideoCodingKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdControlVideoCodingKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRVideoQueue() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkVideoProfileInfoKHR* pVideoProfile, VkVideoCapabilitiesKHR* pCapabilities);
    /// ```
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pVideoProfile, MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoCapabilitiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceVideoCapabilitiesKHR", physicalDevice, pVideoProfile, pCapabilities); }
        return (int) Handles.MH_vkGetPhysicalDeviceVideoCapabilitiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR, physicalDevice.segment(), pVideoProfile, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceVideoCapabilitiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceVideoFormatInfoKHR* pVideoFormatInfo, uint32_t* pVideoFormatPropertyCount, VkVideoFormatPropertiesKHR* pVideoFormatProperties);
    /// ```
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pVideoFormatInfo, MemorySegment pVideoFormatPropertyCount, MemorySegment pVideoFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoFormatPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceVideoFormatPropertiesKHR", physicalDevice, pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceVideoFormatPropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR, physicalDevice.segment(), pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceVideoFormatPropertiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCreateVideoSessionKHR((struct VkDevice*) VkDevice device, const VkVideoSessionCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkVideoSessionKHR* pVideoSession);
    /// ```
    public static int vkCreateVideoSessionKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pVideoSession) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateVideoSessionKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateVideoSessionKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateVideoSessionKHR", device, pCreateInfo, pAllocator, pVideoSession); }
        return (int) Handles.MH_vkCreateVideoSessionKHR.invokeExact(device.capabilities().PFN_vkCreateVideoSessionKHR, device.segment(), pCreateInfo, pAllocator, pVideoSession); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateVideoSessionKHR", e); }
    }

    /// ```
    /// void vkDestroyVideoSessionKHR((struct VkDevice*) VkDevice device, (uint64_t) VkVideoSessionKHR videoSession, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyVideoSessionKHR(VkDevice device, long videoSession, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyVideoSessionKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyVideoSessionKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyVideoSessionKHR", device, videoSession, pAllocator); }
        Handles.MH_vkDestroyVideoSessionKHR.invokeExact(device.capabilities().PFN_vkDestroyVideoSessionKHR, device.segment(), videoSession, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyVideoSessionKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetVideoSessionMemoryRequirementsKHR((struct VkDevice*) VkDevice device, (uint64_t) VkVideoSessionKHR videoSession, uint32_t* pMemoryRequirementsCount, VkVideoSessionMemoryRequirementsKHR* pMemoryRequirements);
    /// ```
    public static int vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, long videoSession, MemorySegment pMemoryRequirementsCount, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetVideoSessionMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetVideoSessionMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetVideoSessionMemoryRequirementsKHR", device, videoSession, pMemoryRequirementsCount, pMemoryRequirements); }
        return (int) Handles.MH_vkGetVideoSessionMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetVideoSessionMemoryRequirementsKHR, device.segment(), videoSession, pMemoryRequirementsCount, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetVideoSessionMemoryRequirementsKHR", e); }
    }

    /// ```
    /// (int) VkResult vkBindVideoSessionMemoryKHR((struct VkDevice*) VkDevice device, (uint64_t) VkVideoSessionKHR videoSession, uint32_t bindSessionMemoryInfoCount, const VkBindVideoSessionMemoryInfoKHR* pBindSessionMemoryInfos);
    /// ```
    public static int vkBindVideoSessionMemoryKHR(VkDevice device, long videoSession, int bindSessionMemoryInfoCount, MemorySegment pBindSessionMemoryInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindVideoSessionMemoryKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkBindVideoSessionMemoryKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindVideoSessionMemoryKHR", device, videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos); }
        return (int) Handles.MH_vkBindVideoSessionMemoryKHR.invokeExact(device.capabilities().PFN_vkBindVideoSessionMemoryKHR, device.segment(), videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindVideoSessionMemoryKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCreateVideoSessionParametersKHR((struct VkDevice*) VkDevice device, const VkVideoSessionParametersCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkVideoSessionParametersKHR* pVideoSessionParameters);
    /// ```
    public static int vkCreateVideoSessionParametersKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pVideoSessionParameters) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateVideoSessionParametersKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateVideoSessionParametersKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateVideoSessionParametersKHR", device, pCreateInfo, pAllocator, pVideoSessionParameters); }
        return (int) Handles.MH_vkCreateVideoSessionParametersKHR.invokeExact(device.capabilities().PFN_vkCreateVideoSessionParametersKHR, device.segment(), pCreateInfo, pAllocator, pVideoSessionParameters); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateVideoSessionParametersKHR", e); }
    }

    /// ```
    /// (int) VkResult vkUpdateVideoSessionParametersKHR((struct VkDevice*) VkDevice device, (uint64_t) VkVideoSessionParametersKHR videoSessionParameters, const VkVideoSessionParametersUpdateInfoKHR* pUpdateInfo);
    /// ```
    public static int vkUpdateVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, MemorySegment pUpdateInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUpdateVideoSessionParametersKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkUpdateVideoSessionParametersKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkUpdateVideoSessionParametersKHR", device, videoSessionParameters, pUpdateInfo); }
        return (int) Handles.MH_vkUpdateVideoSessionParametersKHR.invokeExact(device.capabilities().PFN_vkUpdateVideoSessionParametersKHR, device.segment(), videoSessionParameters, pUpdateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateVideoSessionParametersKHR", e); }
    }

    /// ```
    /// void vkDestroyVideoSessionParametersKHR((struct VkDevice*) VkDevice device, (uint64_t) VkVideoSessionParametersKHR videoSessionParameters, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyVideoSessionParametersKHR(VkDevice device, long videoSessionParameters, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyVideoSessionParametersKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyVideoSessionParametersKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyVideoSessionParametersKHR", device, videoSessionParameters, pAllocator); }
        Handles.MH_vkDestroyVideoSessionParametersKHR.invokeExact(device.capabilities().PFN_vkDestroyVideoSessionParametersKHR, device.segment(), videoSessionParameters, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyVideoSessionParametersKHR", e); }
    }

    /// ```
    /// void vkCmdBeginVideoCodingKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkVideoBeginCodingInfoKHR* pBeginInfo);
    /// ```
    public static void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, MemorySegment pBeginInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginVideoCodingKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginVideoCodingKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginVideoCodingKHR", commandBuffer, pBeginInfo); }
        Handles.MH_vkCmdBeginVideoCodingKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginVideoCodingKHR, commandBuffer.segment(), pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginVideoCodingKHR", e); }
    }

    /// ```
    /// void vkCmdEndVideoCodingKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkVideoEndCodingInfoKHR* pEndCodingInfo);
    /// ```
    public static void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, MemorySegment pEndCodingInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndVideoCodingKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndVideoCodingKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndVideoCodingKHR", commandBuffer, pEndCodingInfo); }
        Handles.MH_vkCmdEndVideoCodingKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndVideoCodingKHR, commandBuffer.segment(), pEndCodingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndVideoCodingKHR", e); }
    }

    /// ```
    /// void vkCmdControlVideoCodingKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkVideoCodingControlInfoKHR* pCodingControlInfo);
    /// ```
    public static void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, MemorySegment pCodingControlInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdControlVideoCodingKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdControlVideoCodingKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdControlVideoCodingKHR", commandBuffer, pCodingControlInfo); }
        Handles.MH_vkCmdControlVideoCodingKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdControlVideoCodingKHR, commandBuffer.segment(), pCodingControlInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdControlVideoCodingKHR", e); }
    }

}
