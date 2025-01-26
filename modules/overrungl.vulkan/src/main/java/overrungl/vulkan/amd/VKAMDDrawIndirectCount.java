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
public class VKAMDDrawIndirectCount {
    public static final int VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = 2;
    public static final String VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_AMD_draw_indirect_count";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCountAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCountAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_vkCmdDrawIndirectCountAMD;
        public final MemorySegment PFN_vkCmdDrawIndexedIndirectCountAMD;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdDrawIndirectCountAMD = func.invoke(device, "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndirectCount");
            PFN_vkCmdDrawIndexedIndirectCountAMD = func.invoke(device, "vkCmdDrawIndexedIndirectCountAMD", "vkCmdDrawIndexedIndirectCount");
        }
    }

    public VKAMDDrawIndirectCount(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkCmdDrawIndirectCountAMD(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public void CmdDrawIndirectCountAMD(MemorySegment commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDrawIndirectCountAMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCountAMD");
        try { Handles.MH_vkCmdDrawIndirectCountAMD.invokeExact(handles.PFN_vkCmdDrawIndirectCountAMD, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDrawIndirectCountAMD", e); }
    }

    /// ```
    /// void vkCmdDrawIndexedIndirectCountAMD(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, uint32_t maxDrawCount, uint32_t stride);
    /// ```
    public void CmdDrawIndexedIndirectCountAMD(MemorySegment commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, int maxDrawCount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdDrawIndexedIndirectCountAMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCountAMD");
        try { Handles.MH_vkCmdDrawIndexedIndirectCountAMD.invokeExact(handles.PFN_vkCmdDrawIndexedIndirectCountAMD, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in CmdDrawIndexedIndirectCountAMD", e); }
    }

}
