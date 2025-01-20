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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
public class VKKHRDrawIndirectCount {
    public static final int VK_KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;
    public static final String VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME = "VK_KHR_draw_indirect_count";
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdDrawIndirectCountKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdDrawIndexedIndirectCountKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCmdDrawIndirectCountKHR,
            FD_vkCmdDrawIndexedIndirectCountKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDrawIndirectCountKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndirectCountKHR);
        public static final MethodHandle MH_vkCmdDrawIndexedIndirectCountKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdDrawIndexedIndirectCountKHR);
        public final MemorySegment PFN_vkCmdDrawIndirectCountKHR;
        public final MemorySegment PFN_vkCmdDrawIndexedIndirectCountKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdDrawIndirectCountKHR = func.invoke(device, "vkCmdDrawIndirectCountKHR", "vkCmdDrawIndirectCount");
            PFN_vkCmdDrawIndexedIndirectCountKHR = func.invoke(device, "vkCmdDrawIndexedIndirectCountKHR", "vkCmdDrawIndexedIndirectCount");
        }
    }

    public VKKHRDrawIndirectCount(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdDrawIndirectCountKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndirectCountKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndirectCountKHR");
        try { Handles.MH_vkCmdDrawIndirectCountKHR.invokeExact(handles.PFN_vkCmdDrawIndirectCountKHR, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndirectCountKHR", e); }
    }

    public void CmdDrawIndexedIndirectCountKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBuffer") MemorySegment buffer, @CType("VkDeviceSize") long offset, @CType("VkBuffer") MemorySegment countBuffer, @CType("VkDeviceSize") long countBufferOffset, @CType("uint32_t") int maxDrawCount, @CType("uint32_t") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdDrawIndexedIndirectCountKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdDrawIndexedIndirectCountKHR");
        try { Handles.MH_vkCmdDrawIndexedIndirectCountKHR.invokeExact(handles.PFN_vkCmdDrawIndexedIndirectCountKHR, commandBuffer, buffer, offset, countBuffer, countBufferOffset, maxDrawCount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDrawIndexedIndirectCountKHR", e); }
    }

}
