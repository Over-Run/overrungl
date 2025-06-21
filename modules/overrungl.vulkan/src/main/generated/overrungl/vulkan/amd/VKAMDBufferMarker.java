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
package overrungl.vulkan.amd;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKAMDBufferMarker {
    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";
    public static final class Handles {
        public static final MethodHandle MH_vkCmdWriteBufferMarkerAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWriteBufferMarker2AMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKAMDBufferMarker() {}

    /// ```
    /// void vkCmdWriteBufferMarkerAMD((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPipelineStageFlagBits pipelineStage, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, uint32_t marker);
    /// ```
    public static void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, int pipelineStage, long dstBuffer, long dstOffset, int marker) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarkerAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarkerAMD");
        try { Handles.MH_vkCmdWriteBufferMarkerAMD.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarkerAMD, commandBuffer.segment(), pipelineStage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteBufferMarkerAMD", e); }
    }

    /// ```
    /// void vkCmdWriteBufferMarker2AMD((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint64_t) VkFlags64) VkPipelineStageFlags2 stage, (uint64_t) VkBuffer dstBuffer, (uint64_t) VkDeviceSize dstOffset, uint32_t marker);
    /// ```
    public static void vkCmdWriteBufferMarker2AMD(VkCommandBuffer commandBuffer, long stage, long dstBuffer, long dstOffset, int marker) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarker2AMD)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarker2AMD");
        try { Handles.MH_vkCmdWriteBufferMarker2AMD.invokeExact(commandBuffer.capabilities().PFN_vkCmdWriteBufferMarker2AMD, commandBuffer.segment(), stage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteBufferMarker2AMD", e); }
    }

}
