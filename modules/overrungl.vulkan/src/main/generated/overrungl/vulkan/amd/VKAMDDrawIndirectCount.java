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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_AMD_draw_indirect_count` - device extension
public final class VKAMDDrawIndirectCount {
    public static final int VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = 2;
    public static final String VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_AMD_draw_indirect_count";
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCountAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCountAMD = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKAMDDrawIndirectCount() {}

    /// Invokes `vkCmdDrawIndirectCountAMD`.
    /// ```
    /// void vkCmdDrawIndirectCountAMD((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndirectCountAMD(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirectCountAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCountAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndirectCountAMD", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawIndirectCountAMD.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirectCountAMD, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectCountAMD", e); }
    }

    /// Invokes `vkCmdDrawIndexedIndirectCountAMD`.
    /// ```
    /// void vkCmdDrawIndexedIndirectCountAMD((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndexedIndirectCountAMD(@NonNull VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirectCountAMD)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCountAMD");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndexedIndirectCountAMD", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawIndexedIndirectCountAMD.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirectCountAMD, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirectCountAMD", e); }
    }

}
