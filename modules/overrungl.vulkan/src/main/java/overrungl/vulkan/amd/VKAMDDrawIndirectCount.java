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
import java.util.*;
public class VKAMDDrawIndirectCount {
    public static final int VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = 2;
    public static final String VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_AMD_draw_indirect_count";
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdDrawIndirectCountAMD = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawIndexedIndirectCountAMD = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCmdDrawIndirectCountAMD,
            FD_vkCmdDrawIndexedIndirectCountAMD
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCountAMD = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndirectCountAMD);
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCountAMD = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndexedIndirectCountAMD);
        public final MemorySegment PFN_vkCmdDrawIndirectCountAMD;
        public final MemorySegment PFN_vkCmdDrawIndexedIndirectCountAMD;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdDrawIndirectCountAMD = func.invoke(device, "vkCmdDrawIndirectCountAMD", "vkCmdDrawIndirectCount");
            PFN_vkCmdDrawIndexedIndirectCountAMD = func.invoke(device, "vkCmdDrawIndexedIndirectCountAMD", "vkCmdDrawIndexedIndirectCount");
        }
    }

    public VKAMDDrawIndirectCount(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdDrawIndirectCountAMD(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndirectCountAMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCountAMD");
        try { Handles.MH_vkCmdDrawIndirectCountAMD.invokeExact(handles.PFN_vkCmdDrawIndirectCountAMD, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectCountAMD", e); }
    }

    public void CmdDrawIndexedIndirectCountAMD(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndexedIndirectCountAMD)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCountAMD");
        try { Handles.MH_vkCmdDrawIndexedIndirectCountAMD.invokeExact(handles.PFN_vkCmdDrawIndexedIndirectCountAMD, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirectCountAMD", e); }
    }

}
