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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKKHRVideoQueue {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoFormatPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateVideoSessionKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyVideoSessionKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetVideoSessionMemoryRequirementsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindVideoSessionMemoryKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateVideoSessionParametersKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUpdateVideoSessionParametersKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyVideoSessionParametersKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginVideoCodingKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndVideoCodingKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdControlVideoCodingKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR;
        public final MemorySegment PFN_vkCreateVideoSessionKHR;
        public final MemorySegment PFN_vkDestroyVideoSessionKHR;
        public final MemorySegment PFN_vkGetVideoSessionMemoryRequirementsKHR;
        public final MemorySegment PFN_vkBindVideoSessionMemoryKHR;
        public final MemorySegment PFN_vkCreateVideoSessionParametersKHR;
        public final MemorySegment PFN_vkUpdateVideoSessionParametersKHR;
        public final MemorySegment PFN_vkDestroyVideoSessionParametersKHR;
        public final MemorySegment PFN_vkCmdBeginVideoCodingKHR;
        public final MemorySegment PFN_vkCmdEndVideoCodingKHR;
        public final MemorySegment PFN_vkCmdControlVideoCodingKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR = func.invoke(device, "vkGetPhysicalDeviceVideoCapabilitiesKHR");
            PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR = func.invoke(device, "vkGetPhysicalDeviceVideoFormatPropertiesKHR");
            PFN_vkCreateVideoSessionKHR = func.invoke(device, "vkCreateVideoSessionKHR");
            PFN_vkDestroyVideoSessionKHR = func.invoke(device, "vkDestroyVideoSessionKHR");
            PFN_vkGetVideoSessionMemoryRequirementsKHR = func.invoke(device, "vkGetVideoSessionMemoryRequirementsKHR");
            PFN_vkBindVideoSessionMemoryKHR = func.invoke(device, "vkBindVideoSessionMemoryKHR");
            PFN_vkCreateVideoSessionParametersKHR = func.invoke(device, "vkCreateVideoSessionParametersKHR");
            PFN_vkUpdateVideoSessionParametersKHR = func.invoke(device, "vkUpdateVideoSessionParametersKHR");
            PFN_vkDestroyVideoSessionParametersKHR = func.invoke(device, "vkDestroyVideoSessionParametersKHR");
            PFN_vkCmdBeginVideoCodingKHR = func.invoke(device, "vkCmdBeginVideoCodingKHR");
            PFN_vkCmdEndVideoCodingKHR = func.invoke(device, "vkCmdEndVideoCodingKHR");
            PFN_vkCmdControlVideoCodingKHR = func.invoke(device, "vkCmdControlVideoCodingKHR");
        }
    }

    public VKKHRVideoQueue(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceVideoCapabilitiesKHR(VkPhysicalDevice physicalDevice, const VkVideoProfileInfoKHR* pVideoProfile, VkVideoCapabilitiesKHR* pCapabilities);
    /// ```
    public int GetPhysicalDeviceVideoCapabilitiesKHR(MemorySegment physicalDevice, MemorySegment pVideoProfile, MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoCapabilitiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceVideoCapabilitiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR, physicalDevice, pVideoProfile, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceVideoCapabilitiesKHR", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceVideoFormatPropertiesKHR(VkPhysicalDevice physicalDevice, const VkPhysicalDeviceVideoFormatInfoKHR* pVideoFormatInfo, uint32_t* pVideoFormatPropertyCount, VkVideoFormatPropertiesKHR* pVideoFormatProperties);
    /// ```
    public int GetPhysicalDeviceVideoFormatPropertiesKHR(MemorySegment physicalDevice, MemorySegment pVideoFormatInfo, MemorySegment pVideoFormatPropertyCount, MemorySegment pVideoFormatProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoFormatPropertiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceVideoFormatPropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR, physicalDevice, pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceVideoFormatPropertiesKHR", e); }
    }

    /// ```
    /// VkResult vkCreateVideoSessionKHR(VkDevice device, const VkVideoSessionCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkVideoSessionKHR* pVideoSession);
    /// ```
    public int CreateVideoSessionKHR(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pVideoSession) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateVideoSessionKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateVideoSessionKHR");
        try { return (int) Handles.MH_vkCreateVideoSessionKHR.invokeExact(handles.PFN_vkCreateVideoSessionKHR, device, pCreateInfo, pAllocator, pVideoSession); }
        catch (Throwable e) { throw new RuntimeException("error in CreateVideoSessionKHR", e); }
    }

    /// ```
    /// void vkDestroyVideoSessionKHR(VkDevice device, VkVideoSessionKHR videoSession, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyVideoSessionKHR(MemorySegment device, long videoSession, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyVideoSessionKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyVideoSessionKHR");
        try { Handles.MH_vkDestroyVideoSessionKHR.invokeExact(handles.PFN_vkDestroyVideoSessionKHR, device, videoSession, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyVideoSessionKHR", e); }
    }

    /// ```
    /// VkResult vkGetVideoSessionMemoryRequirementsKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t* pMemoryRequirementsCount, VkVideoSessionMemoryRequirementsKHR* pMemoryRequirements);
    /// ```
    public int GetVideoSessionMemoryRequirementsKHR(MemorySegment device, long videoSession, MemorySegment pMemoryRequirementsCount, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetVideoSessionMemoryRequirementsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetVideoSessionMemoryRequirementsKHR");
        try { return (int) Handles.MH_vkGetVideoSessionMemoryRequirementsKHR.invokeExact(handles.PFN_vkGetVideoSessionMemoryRequirementsKHR, device, videoSession, pMemoryRequirementsCount, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoSessionMemoryRequirementsKHR", e); }
    }

    /// ```
    /// VkResult vkBindVideoSessionMemoryKHR(VkDevice device, VkVideoSessionKHR videoSession, uint32_t bindSessionMemoryInfoCount, const VkBindVideoSessionMemoryInfoKHR* pBindSessionMemoryInfos);
    /// ```
    public int BindVideoSessionMemoryKHR(MemorySegment device, long videoSession, int bindSessionMemoryInfoCount, MemorySegment pBindSessionMemoryInfos) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkBindVideoSessionMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkBindVideoSessionMemoryKHR");
        try { return (int) Handles.MH_vkBindVideoSessionMemoryKHR.invokeExact(handles.PFN_vkBindVideoSessionMemoryKHR, device, videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos); }
        catch (Throwable e) { throw new RuntimeException("error in BindVideoSessionMemoryKHR", e); }
    }

    /// ```
    /// VkResult vkCreateVideoSessionParametersKHR(VkDevice device, const VkVideoSessionParametersCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkVideoSessionParametersKHR* pVideoSessionParameters);
    /// ```
    public int CreateVideoSessionParametersKHR(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pVideoSessionParameters) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateVideoSessionParametersKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateVideoSessionParametersKHR");
        try { return (int) Handles.MH_vkCreateVideoSessionParametersKHR.invokeExact(handles.PFN_vkCreateVideoSessionParametersKHR, device, pCreateInfo, pAllocator, pVideoSessionParameters); }
        catch (Throwable e) { throw new RuntimeException("error in CreateVideoSessionParametersKHR", e); }
    }

    /// ```
    /// VkResult vkUpdateVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersKHR videoSessionParameters, const VkVideoSessionParametersUpdateInfoKHR* pUpdateInfo);
    /// ```
    public int UpdateVideoSessionParametersKHR(MemorySegment device, long videoSessionParameters, MemorySegment pUpdateInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUpdateVideoSessionParametersKHR)) throw new SymbolNotFoundError("Symbol not found: vkUpdateVideoSessionParametersKHR");
        try { return (int) Handles.MH_vkUpdateVideoSessionParametersKHR.invokeExact(handles.PFN_vkUpdateVideoSessionParametersKHR, device, videoSessionParameters, pUpdateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in UpdateVideoSessionParametersKHR", e); }
    }

    /// ```
    /// void vkDestroyVideoSessionParametersKHR(VkDevice device, VkVideoSessionParametersKHR videoSessionParameters, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyVideoSessionParametersKHR(MemorySegment device, long videoSessionParameters, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyVideoSessionParametersKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyVideoSessionParametersKHR");
        try { Handles.MH_vkDestroyVideoSessionParametersKHR.invokeExact(handles.PFN_vkDestroyVideoSessionParametersKHR, device, videoSessionParameters, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyVideoSessionParametersKHR", e); }
    }

    /// ```
    /// void vkCmdBeginVideoCodingKHR(VkCommandBuffer commandBuffer, const VkVideoBeginCodingInfoKHR* pBeginInfo);
    /// ```
    public void CmdBeginVideoCodingKHR(MemorySegment commandBuffer, MemorySegment pBeginInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginVideoCodingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginVideoCodingKHR");
        try { Handles.MH_vkCmdBeginVideoCodingKHR.invokeExact(handles.PFN_vkCmdBeginVideoCodingKHR, commandBuffer, pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginVideoCodingKHR", e); }
    }

    /// ```
    /// void vkCmdEndVideoCodingKHR(VkCommandBuffer commandBuffer, const VkVideoEndCodingInfoKHR* pEndCodingInfo);
    /// ```
    public void CmdEndVideoCodingKHR(MemorySegment commandBuffer, MemorySegment pEndCodingInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndVideoCodingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndVideoCodingKHR");
        try { Handles.MH_vkCmdEndVideoCodingKHR.invokeExact(handles.PFN_vkCmdEndVideoCodingKHR, commandBuffer, pEndCodingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndVideoCodingKHR", e); }
    }

    /// ```
    /// void vkCmdControlVideoCodingKHR(VkCommandBuffer commandBuffer, const VkVideoCodingControlInfoKHR* pCodingControlInfo);
    /// ```
    public void CmdControlVideoCodingKHR(MemorySegment commandBuffer, MemorySegment pCodingControlInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdControlVideoCodingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdControlVideoCodingKHR");
        try { Handles.MH_vkCmdControlVideoCodingKHR.invokeExact(handles.PFN_vkCmdControlVideoCodingKHR, commandBuffer, pCodingControlInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdControlVideoCodingKHR", e); }
    }

}
