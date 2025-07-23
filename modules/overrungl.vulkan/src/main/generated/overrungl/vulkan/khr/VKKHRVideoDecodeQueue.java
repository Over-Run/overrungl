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
public final class VKKHRVideoDecodeQueue {
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_COINCIDE_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_DECODE_CAPABILITY_DPB_AND_OUTPUT_DISTINCT_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_DECODE_USAGE_DEFAULT_KHR = 0;
    public static final int VK_VIDEO_DECODE_USAGE_TRANSCODING_BIT_KHR = 0x00000001;
    public static final int VK_VIDEO_DECODE_USAGE_OFFLINE_BIT_KHR = 0x00000002;
    public static final int VK_VIDEO_DECODE_USAGE_STREAMING_BIT_KHR = 0x00000004;
    public static final int VK_KHR_VIDEO_DECODE_QUEUE_SPEC_VERSION = 8;
    public static final String VK_KHR_VIDEO_DECODE_QUEUE_EXTENSION_NAME = "VK_KHR_video_decode_queue";
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_INFO_KHR = 1000024000;
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_CAPABILITIES_KHR = 1000024001;
    public static final int VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR = 1000024002;
    public static final int VK_QUEUE_VIDEO_DECODE_BIT_KHR = 0x00000020;
    public static final long VK_PIPELINE_STAGE_2_VIDEO_DECODE_BIT_KHR = 0x04000000L;
    public static final long VK_ACCESS_2_VIDEO_DECODE_READ_BIT_KHR = 0x800000000L;
    public static final long VK_ACCESS_2_VIDEO_DECODE_WRITE_BIT_KHR = 0x1000000000L;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 0x00002000;
    public static final int VK_BUFFER_USAGE_VIDEO_DECODE_DST_BIT_KHR = 0x00004000;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DST_BIT_KHR = 0x00000400;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_SRC_BIT_KHR = 0x00000800;
    public static final int VK_IMAGE_USAGE_VIDEO_DECODE_DPB_BIT_KHR = 0x00001000;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_OUTPUT_BIT_KHR = 0x02000000;
    public static final int VK_FORMAT_FEATURE_VIDEO_DECODE_DPB_BIT_KHR = 0x04000000;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_DST_KHR = 1000024000;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_SRC_KHR = 1000024001;
    public static final int VK_IMAGE_LAYOUT_VIDEO_DECODE_DPB_KHR = 1000024002;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_OUTPUT_BIT_KHR = 0x02000000L;
    public static final long VK_FORMAT_FEATURE_2_VIDEO_DECODE_DPB_BIT_KHR = 0x04000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDecodeVideoKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRVideoDecodeQueue() {}

    /// ```
    /// void vkCmdDecodeVideoKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkVideoDecodeInfoKHR* pDecodeInfo);
    /// ```
    public static void vkCmdDecodeVideoKHR(VkCommandBuffer commandBuffer, MemorySegment pDecodeInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecodeVideoKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecodeVideoKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDecodeVideoKHR", commandBuffer, pDecodeInfo); }
        Handles.MH_vkCmdDecodeVideoKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecodeVideoKHR, commandBuffer.segment(), pDecodeInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecodeVideoKHR", e); }
    }

}
