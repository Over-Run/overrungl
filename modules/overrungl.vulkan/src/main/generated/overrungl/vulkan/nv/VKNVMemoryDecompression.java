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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVMemoryDecompression {
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 0x00000001L;
    public static final int VK_NV_MEMORY_DECOMPRESSION_SPEC_VERSION = 1;
    public static final String VK_NV_MEMORY_DECOMPRESSION_EXTENSION_NAME = "VK_NV_memory_decompression";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_FEATURES_NV = 1000427000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV = 1000427001;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdDecompressMemoryNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdDecompressMemoryIndirectCountNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKNVMemoryDecompression() {}

    /// ```
    /// void vkCmdDecompressMemoryNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t decompressRegionCount, const VkDecompressMemoryRegionNV* pDecompressMemoryRegions);
    /// ```
    public static void vkCmdDecompressMemoryNV(VkCommandBuffer commandBuffer, int decompressRegionCount, MemorySegment pDecompressMemoryRegions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryNV");
        try { Handles.MH_vkCmdDecompressMemoryNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryNV, commandBuffer.segment(), decompressRegionCount, pDecompressMemoryRegions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryNV", e); }
    }

    /// ```
    /// void vkCmdDecompressMemoryIndirectCountNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint64_t) VkDeviceAddress indirectCommandsAddress, (uint64_t) VkDeviceAddress indirectCommandsCountAddress, uint32_t stride);
    /// ```
    public static void vkCmdDecompressMemoryIndirectCountNV(VkCommandBuffer commandBuffer, long indirectCommandsAddress, long indirectCommandsCountAddress, int stride) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdDecompressMemoryIndirectCountNV");
        try { Handles.MH_vkCmdDecompressMemoryIndirectCountNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdDecompressMemoryIndirectCountNV, commandBuffer.segment(), indirectCommandsAddress, indirectCommandsCountAddress, stride); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDecompressMemoryIndirectCountNV", e); }
    }

}
