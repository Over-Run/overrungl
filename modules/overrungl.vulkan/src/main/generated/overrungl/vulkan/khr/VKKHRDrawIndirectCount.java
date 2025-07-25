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
public final class VKKHRDrawIndirectCount {
    public static final int VK_KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;
    public static final String VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_KHR_draw_indirect_count";
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCountKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCountKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKKHRDrawIndirectCount() {}

    /// ```
    /// void vkCmdDrawIndirectCountKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndirectCountKHR(VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndirectCountKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCountKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndirectCountKHR", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawIndirectCountKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndirectCountKHR, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectCountKHR", e); }
    }

    /// ```
    /// void vkCmdDrawIndexedIndirectCountKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkBuffer buffer, (uint64_t) VkDeviceSize offset, (uint64_t) VkBuffer countBuffer, (uint64_t) VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public static void vkCmdDrawIndexedIndirectCountKHR(VkCommandBuffer commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirectCountKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCountKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdDrawIndexedIndirectCountKHR", commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        Handles.MH_vkCmdDrawIndexedIndirectCountKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdDrawIndexedIndirectCountKHR, commandBuffer.segment(), buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirectCountKHR", e); }
    }

}
