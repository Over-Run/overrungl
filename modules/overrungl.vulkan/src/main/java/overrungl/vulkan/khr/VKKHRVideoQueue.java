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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
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
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceVideoCapabilitiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceVideoFormatPropertiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateVideoSessionKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyVideoSessionKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetVideoSessionMemoryRequirementsKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkBindVideoSessionMemoryKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateVideoSessionParametersKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkUpdateVideoSessionParametersKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyVideoSessionParametersKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBeginVideoCodingKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdEndVideoCodingKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdControlVideoCodingKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetPhysicalDeviceVideoCapabilitiesKHR,
            FD_vkGetPhysicalDeviceVideoFormatPropertiesKHR,
            FD_vkCreateVideoSessionKHR,
            FD_vkDestroyVideoSessionKHR,
            FD_vkGetVideoSessionMemoryRequirementsKHR,
            FD_vkBindVideoSessionMemoryKHR,
            FD_vkCreateVideoSessionParametersKHR,
            FD_vkUpdateVideoSessionParametersKHR,
            FD_vkDestroyVideoSessionParametersKHR,
            FD_vkCmdBeginVideoCodingKHR,
            FD_vkCmdEndVideoCodingKHR,
            FD_vkCmdControlVideoCodingKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoCapabilitiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceVideoCapabilitiesKHR);
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoFormatPropertiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceVideoFormatPropertiesKHR);
        public static final MethodHandle MH_vkCreateVideoSessionKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateVideoSessionKHR);
        public static final MethodHandle MH_vkDestroyVideoSessionKHR = RuntimeHelper.downcall(Descriptors.FD_vkDestroyVideoSessionKHR);
        public static final MethodHandle MH_vkGetVideoSessionMemoryRequirementsKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetVideoSessionMemoryRequirementsKHR);
        public static final MethodHandle MH_vkBindVideoSessionMemoryKHR = RuntimeHelper.downcall(Descriptors.FD_vkBindVideoSessionMemoryKHR);
        public static final MethodHandle MH_vkCreateVideoSessionParametersKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateVideoSessionParametersKHR);
        public static final MethodHandle MH_vkUpdateVideoSessionParametersKHR = RuntimeHelper.downcall(Descriptors.FD_vkUpdateVideoSessionParametersKHR);
        public static final MethodHandle MH_vkDestroyVideoSessionParametersKHR = RuntimeHelper.downcall(Descriptors.FD_vkDestroyVideoSessionParametersKHR);
        public static final MethodHandle MH_vkCmdBeginVideoCodingKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdBeginVideoCodingKHR);
        public static final MethodHandle MH_vkCmdEndVideoCodingKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdEndVideoCodingKHR);
        public static final MethodHandle MH_vkCmdControlVideoCodingKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdControlVideoCodingKHR);
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
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
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

    public VKKHRVideoQueue(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceVideoCapabilitiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkVideoProfileInfoKHR *") MemorySegment pVideoProfile, @CType("VkVideoCapabilitiesKHR *") MemorySegment pCapabilities) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoCapabilitiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceVideoCapabilitiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceVideoCapabilitiesKHR, physicalDevice, pVideoProfile, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceVideoCapabilitiesKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceVideoFormatPropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceVideoFormatInfoKHR *") MemorySegment pVideoFormatInfo, @CType("uint32_t *") MemorySegment pVideoFormatPropertyCount, @CType("VkVideoFormatPropertiesKHR *") MemorySegment pVideoFormatProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoFormatPropertiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceVideoFormatPropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceVideoFormatPropertiesKHR, physicalDevice, pVideoFormatInfo, pVideoFormatPropertyCount, pVideoFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceVideoFormatPropertiesKHR", e); }
    }

    public @CType("VkResult") int CreateVideoSessionKHR(@CType("VkDevice") MemorySegment device, @CType("const VkVideoSessionCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkVideoSessionKHR *") MemorySegment pVideoSession) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateVideoSessionKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateVideoSessionKHR");
        try { return (int) Handles.MH_vkCreateVideoSessionKHR.invokeExact(handles.PFN_vkCreateVideoSessionKHR, device, pCreateInfo, pAllocator, pVideoSession); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateVideoSessionKHR", e); }
    }

    public void DestroyVideoSessionKHR(@CType("VkDevice") MemorySegment device, @CType("VkVideoSessionKHR") MemorySegment videoSession, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyVideoSessionKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyVideoSessionKHR");
        try { Handles.MH_vkDestroyVideoSessionKHR.invokeExact(handles.PFN_vkDestroyVideoSessionKHR, device, videoSession, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyVideoSessionKHR", e); }
    }

    public @CType("VkResult") int GetVideoSessionMemoryRequirementsKHR(@CType("VkDevice") MemorySegment device, @CType("VkVideoSessionKHR") MemorySegment videoSession, @CType("uint32_t *") MemorySegment pMemoryRequirementsCount, @CType("VkVideoSessionMemoryRequirementsKHR *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetVideoSessionMemoryRequirementsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetVideoSessionMemoryRequirementsKHR");
        try { return (int) Handles.MH_vkGetVideoSessionMemoryRequirementsKHR.invokeExact(handles.PFN_vkGetVideoSessionMemoryRequirementsKHR, device, videoSession, pMemoryRequirementsCount, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetVideoSessionMemoryRequirementsKHR", e); }
    }

    public @CType("VkResult") int BindVideoSessionMemoryKHR(@CType("VkDevice") MemorySegment device, @CType("VkVideoSessionKHR") MemorySegment videoSession, @CType("uint32_t") int bindSessionMemoryInfoCount, @CType("const VkBindVideoSessionMemoryInfoKHR *") MemorySegment pBindSessionMemoryInfos) {
        if (Unmarshal.isNullPointer(handles.PFN_vkBindVideoSessionMemoryKHR)) throw new SymbolNotFoundError("Symbol not found: vkBindVideoSessionMemoryKHR");
        try { return (int) Handles.MH_vkBindVideoSessionMemoryKHR.invokeExact(handles.PFN_vkBindVideoSessionMemoryKHR, device, videoSession, bindSessionMemoryInfoCount, pBindSessionMemoryInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindVideoSessionMemoryKHR", e); }
    }

    public @CType("VkResult") int CreateVideoSessionParametersKHR(@CType("VkDevice") MemorySegment device, @CType("const VkVideoSessionParametersCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkVideoSessionParametersKHR *") MemorySegment pVideoSessionParameters) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateVideoSessionParametersKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateVideoSessionParametersKHR");
        try { return (int) Handles.MH_vkCreateVideoSessionParametersKHR.invokeExact(handles.PFN_vkCreateVideoSessionParametersKHR, device, pCreateInfo, pAllocator, pVideoSessionParameters); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateVideoSessionParametersKHR", e); }
    }

    public @CType("VkResult") int UpdateVideoSessionParametersKHR(@CType("VkDevice") MemorySegment device, @CType("VkVideoSessionParametersKHR") MemorySegment videoSessionParameters, @CType("const VkVideoSessionParametersUpdateInfoKHR *") MemorySegment pUpdateInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkUpdateVideoSessionParametersKHR)) throw new SymbolNotFoundError("Symbol not found: vkUpdateVideoSessionParametersKHR");
        try { return (int) Handles.MH_vkUpdateVideoSessionParametersKHR.invokeExact(handles.PFN_vkUpdateVideoSessionParametersKHR, device, videoSessionParameters, pUpdateInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkUpdateVideoSessionParametersKHR", e); }
    }

    public void DestroyVideoSessionParametersKHR(@CType("VkDevice") MemorySegment device, @CType("VkVideoSessionParametersKHR") MemorySegment videoSessionParameters, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyVideoSessionParametersKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyVideoSessionParametersKHR");
        try { Handles.MH_vkDestroyVideoSessionParametersKHR.invokeExact(handles.PFN_vkDestroyVideoSessionParametersKHR, device, videoSessionParameters, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyVideoSessionParametersKHR", e); }
    }

    public void CmdBeginVideoCodingKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkVideoBeginCodingInfoKHR *") MemorySegment pBeginInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBeginVideoCodingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginVideoCodingKHR");
        try { Handles.MH_vkCmdBeginVideoCodingKHR.invokeExact(handles.PFN_vkCmdBeginVideoCodingKHR, commandBuffer, pBeginInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginVideoCodingKHR", e); }
    }

    public void CmdEndVideoCodingKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkVideoEndCodingInfoKHR *") MemorySegment pEndCodingInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdEndVideoCodingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndVideoCodingKHR");
        try { Handles.MH_vkCmdEndVideoCodingKHR.invokeExact(handles.PFN_vkCmdEndVideoCodingKHR, commandBuffer, pEndCodingInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndVideoCodingKHR", e); }
    }

    public void CmdControlVideoCodingKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkVideoCodingControlInfoKHR *") MemorySegment pCodingControlInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdControlVideoCodingKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdControlVideoCodingKHR");
        try { Handles.MH_vkCmdControlVideoCodingKHR.invokeExact(handles.PFN_vkCmdControlVideoCodingKHR, commandBuffer, pCodingControlInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdControlVideoCodingKHR", e); }
    }

}
