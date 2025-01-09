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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKAMDBufferMarker {
    public static final int VK_AMD_BUFFER_MARKER_SPEC_VERSION = 1;
    public static final String VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";
    public static final MethodHandle MH_vkCmdWriteBufferMarkerAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdWriteBufferMarker2AMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_vkCmdWriteBufferMarkerAMD;
    public final MemorySegment PFN_vkCmdWriteBufferMarker2AMD;

    public VKAMDBufferMarker(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCmdWriteBufferMarkerAMD = func.invoke(device, "vkCmdWriteBufferMarkerAMD");
        PFN_vkCmdWriteBufferMarker2AMD = func.invoke(device, "vkCmdWriteBufferMarker2AMD");
    }

    public void CmdWriteBufferMarkerAMD(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlagBits") int pipelineStage, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("uint32_t") int marker) {
        if (Unmarshal.isNullPointer(PFN_vkCmdWriteBufferMarkerAMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarkerAMD");
        try { MH_vkCmdWriteBufferMarkerAMD.invokeExact(PFN_vkCmdWriteBufferMarkerAMD, commandBuffer, pipelineStage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteBufferMarkerAMD", e); }
    }

    public void CmdWriteBufferMarker2AMD(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPipelineStageFlags2") long stage, @CType("VkBuffer") MemorySegment dstBuffer, @CType("VkDeviceSize") long dstOffset, @CType("uint32_t") int marker) {
        if (Unmarshal.isNullPointer(PFN_vkCmdWriteBufferMarker2AMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdWriteBufferMarker2AMD");
        try { MH_vkCmdWriteBufferMarker2AMD.invokeExact(PFN_vkCmdWriteBufferMarker2AMD, commandBuffer, stage, dstBuffer, dstOffset, marker); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdWriteBufferMarker2AMD", e); }
    }

}