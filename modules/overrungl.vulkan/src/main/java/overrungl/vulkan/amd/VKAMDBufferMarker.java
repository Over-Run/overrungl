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
public class VKAMDBufferMarker {
    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdWriteBufferMarkerAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdWriteBufferMarker2AMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdWriteBufferMarkerAMD;
        public final MemorySegment PFN_vkCmdWriteBufferMarker2AMD;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdWriteBufferMarkerAMD = func.invoke(device, "vkCmdWriteBufferMarkerAMD");
            PFN_vkCmdWriteBufferMarker2AMD = func.invoke(device, "vkCmdWriteBufferMarker2AMD");
        }
    }

    public VKAMDBufferMarker(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdWriteBufferMarkerAMD(VkCommandBuffer commandBuffer, VkPipelineStageFlagBits pipelineStage, VkBuffer dstBuffer, VkDeviceSize dstOffset, uint32_t marker);
    /// ```
    public void CmdWriteBufferMarkerAMD(MemorySegment commandBuffer, int pipelineStage, long dstBuffer, long dstOffset, int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteBufferMarkerAMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarkerAMD");
        try { Handles.MH_vkCmdWriteBufferMarkerAMD.invokeExact(handles.PFN_vkCmdWriteBufferMarkerAMD, commandBuffer, pipelineStage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteBufferMarkerAMD", e); }
    }

    /// ```
    /// void vkCmdWriteBufferMarker2AMD(VkCommandBuffer commandBuffer, VkPipelineStageFlags2 stage, VkBuffer dstBuffer, VkDeviceSize dstOffset, uint32_t marker);
    /// ```
    public void CmdWriteBufferMarker2AMD(MemorySegment commandBuffer, long stage, long dstBuffer, long dstOffset, int marker) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdWriteBufferMarker2AMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarker2AMD");
        try { Handles.MH_vkCmdWriteBufferMarker2AMD.invokeExact(handles.PFN_vkCmdWriteBufferMarker2AMD, commandBuffer, stage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in CmdWriteBufferMarker2AMD", e); }
    }

}
