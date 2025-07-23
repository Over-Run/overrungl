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
public final class VKKHRVideoEncodeQueue {
    public static final int VK_VIDEO_ENCODE_CAPABILITY_PRECEDING_EXTERNALLY_ENCODED_BYTES_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_CAPABILITY_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_DETECTION_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BUFFER_OFFSET_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_BYTES_WRITTEN_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_FEEDBACK_BITSTREAM_HAS_OVERRIDES_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_ENCODE_USAGE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_USAGE_TRANSCODING_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_USAGE_STREAMING_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_USAGE_RECORDING_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_ENCODE_USAGE_CONFERENCING_BIT_KHR = 0x00000008;
    public static final int VK_VIDEO_ENCODE_CONTENT_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_CONTENT_CAMERA_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_CONTENT_DESKTOP_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_CONTENT_RENDERED_BIT_KHR = 0x00000004;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_HIGH_QUALITY_KHR = 1;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_LOW_LATENCY_KHR = 2;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_ULTRA_LOW_LATENCY_KHR = 3;
    public static final int VK_VIDEO_ENCODE_TUNING_MODE_LOSSLESS_KHR = 4;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_DISABLED_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_CBR_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_ENCODE_RATE_CONTROL_MODE_VBR_BIT_KHR = 0x00000004;
    public static final int VK_KHR_VIDEO_ENCODE_QUEUE_SPEC_VERSION = 12;
    public static final String VK_KHR_VIDEO_ENCODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_encode_queue";
    public static final long VK_PIPELINE_STAGE_2_VIDEO_ENCODE_BIT_KHR = 0x08000000L;
    public static final long VK_ACCESS_2_VIDEO_ENCODE_READ_BIT_KHR = 0x2000000000L;
    public static final long VK_ACCESS_2_VIDEO_ENCODE_WRITE_BIT_KHR = 0x4000000000L;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_INFO_KHR = 1000299000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR = 1000299001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_LAYER_INFO_KHR = 1000299002;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR = 1000299003;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR = 1000299004;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR = 1000299005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR = 1000299006;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR = 1000299007;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR = 1000299008;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_GET_INFO_KHR = 1000299009;
    public static final int VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_PARAMETERS_FEEDBACK_INFO_KHR = 1000299010;
    public static final int VK_QUEUE_VIDEO_ENCODE_BIT_KHR = 0x00000040;
    public static final int VK_VIDEO_CODING_CONTROL_ENCODE_RATE_CONTROL_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_CODING_CONTROL_ENCODE_QUALITY_LEVEL_BIT_KHR = 0x00000004;
    public static final int VK_BUFFER_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x00008000;
    public static final int VK_BUFFER_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x00010000;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_DST_BIT_KHR = 0x00002000;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_SRC_BIT_KHR = 0x00004000;
    public static final int VK_IMAGE_USAGE_VIDEO_ENCODE_DPB_BIT_KHR = 0x00008000;
    public static final int VK_FORMAT_FEATURE_VIDEO_ENCODE_INPUT_BIT_KHR = 0x08000000;
    public static final int VK_FORMAT_FEATURE_VIDEO_ENCODE_DPB_BIT_KHR = 0x10000000;
    public static final int VK_VIDEO_SESSION_CREATE_ALLOW_ENCODE_PARAMETER_OPTIMIZATIONS_BIT_KHR = 0x00000002;
    public static final int VK_IMAGE_LAYOUT_VIDEO_ENCODE_DST_KHR = 1000299000;
    public static final int VK_IMAGE_LAYOUT_VIDEO_ENCODE_SRC_KHR = 1000299001;
    public static final int VK_IMAGE_LAYOUT_VIDEO_ENCODE_DPB_KHR = 1000299002;
    public static final int VK_QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR = 1000299000;
    public static final int VK_QUERY_RESULT_STATUS_INSUFFICIENT_BITSTREAM_BUFFER_RANGE_KHR = -1000299000;
    public static final int VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR = -1000299000;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_ENCODE_INPUT_BIT_KHR = 0x08000000L;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_ENCODE_DPB_BIT_KHR = 0x10000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetEncodedVideoSessionParametersKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEncodeVideoKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRVideoEncodeQueue() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR* pQualityLevelInfo, VkVideoEncodeQualityLevelPropertiesKHR* pQualityLevelProperties);
    /// ```
    public static int vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pQualityLevelInfo, MemorySegment pQualityLevelProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR", physicalDevice, pQualityLevelInfo, pQualityLevelProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR, physicalDevice.segment(), pQualityLevelInfo, pQualityLevelProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetEncodedVideoSessionParametersKHR((struct VkDevice*) VkDevice device, const VkVideoEncodeSessionParametersGetInfoKHR* pVideoSessionParametersInfo, VkVideoEncodeSessionParametersFeedbackInfoKHR* pFeedbackInfo, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetEncodedVideoSessionParametersKHR(VkDevice device, MemorySegment pVideoSessionParametersInfo, MemorySegment pFeedbackInfo, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetEncodedVideoSessionParametersKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetEncodedVideoSessionParametersKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetEncodedVideoSessionParametersKHR", device, pVideoSessionParametersInfo, pFeedbackInfo, pDataSize, pData); }
        return (int) Handles.MH_vkGetEncodedVideoSessionParametersKHR.invokeExact(device.capabilities().PFN_vkGetEncodedVideoSessionParametersKHR, device.segment(), pVideoSessionParametersInfo, pFeedbackInfo, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetEncodedVideoSessionParametersKHR", e); }
    }

    /// ```
    /// void vkCmdEncodeVideoKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkVideoEncodeInfoKHR* pEncodeInfo);
    /// ```
    public static void vkCmdEncodeVideoKHR(VkCommandBuffer commandBuffer, MemorySegment pEncodeInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEncodeVideoKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEncodeVideoKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEncodeVideoKHR", commandBuffer, pEncodeInfo); }
        Handles.MH_vkCmdEncodeVideoKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdEncodeVideoKHR, commandBuffer.segment(), pEncodeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEncodeVideoKHR", e); }
    }

}
