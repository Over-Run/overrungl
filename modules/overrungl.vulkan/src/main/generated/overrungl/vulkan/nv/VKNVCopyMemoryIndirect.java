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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVCopyMemoryIndirect {
    public static final int VK_NV_COPY_MEMORY_INDIRECT_SPEC_VERSION = 1;
    public static final String VK_NV_COPY_MEMORY_INDIRECT_EXTENSION_NAME = "VK_NV_copy_memory_indirect";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_NV = 1000426000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV = 1000426001;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdCopyMemoryIndirectNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdCopyMemoryToImageIndirectNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCopyMemoryIndirect() {}

    /// ```
    /// void vkCmdCopyMemoryIndirectNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress copyBufferAddress, uint32_t copyCount, uint32_t stride);
    /// ```
    public static void vkCmdCopyMemoryIndirectNV(VkCommandBuffer commandBuffer, long copyBufferAddress, int copyCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryIndirectNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMemoryIndirectNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMemoryIndirectNV", commandBuffer, copyBufferAddress, copyCount, stride); }
        Handles.MH_vkCmdCopyMemoryIndirectNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryIndirectNV, commandBuffer.segment(), copyBufferAddress, copyCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryIndirectNV", e); }
    }

    /// ```
    /// void vkCmdCopyMemoryToImageIndirectNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress copyBufferAddress, uint32_t copyCount, uint32_t stride, (uint64_t) VkImage dstImage, (int) VkImageLayout dstImageLayout, const VkImageSubresourceLayers* pImageSubresources);
    /// ```
    public static void vkCmdCopyMemoryToImageIndirectNV(VkCommandBuffer commandBuffer, long copyBufferAddress, int copyCount, int stride, long dstImage, int dstImageLayout, MemorySegment pImageSubresources) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToImageIndirectNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCopyMemoryToImageIndirectNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCopyMemoryToImageIndirectNV", commandBuffer, copyBufferAddress, copyCount, stride, dstImage, dstImageLayout, pImageSubresources); }
        Handles.MH_vkCmdCopyMemoryToImageIndirectNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdCopyMemoryToImageIndirectNV, commandBuffer.segment(), copyBufferAddress, copyCount, stride, dstImage, dstImageLayout, pImageSubresources); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCopyMemoryToImageIndirectNV", e); }
    }

}
