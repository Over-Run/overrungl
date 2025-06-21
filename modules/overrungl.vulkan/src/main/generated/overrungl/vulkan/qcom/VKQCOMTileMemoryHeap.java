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
package overrungl.vulkan.qcom;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKQCOMTileMemoryHeap {
    public static final int VK_QCOM_TILE_MEMORY_HEAP_SPEC_VERSION = 1;
    public static final String VK_QCOM_TILE_MEMORY_HEAP_EXTENSION_NAME = "VK_QCOM_tile_memory_heap";
    public static final int VK_MEMORY_HEAP_TILE_MEMORY_BIT_QCOM = 0x00000008;
    public static final int VK_BUFFER_USAGE_TILE_MEMORY_BIT_QCOM = 0x08000000;
    public static final long VK_BUFFER_USAGE_2_TILE_MEMORY_BIT_QCOM = 0x08000000L;
    public static final int VK_IMAGE_USAGE_TILE_MEMORY_BIT_QCOM = 0x08000000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_FEATURES_QCOM = 1000547000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_MEMORY_HEAP_PROPERTIES_QCOM = 1000547001;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_REQUIREMENTS_QCOM = 1000547002;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_BIND_INFO_QCOM = 1000547003;
    public static final int VK_STRUCTURE_TYPE_TILE_MEMORY_SIZE_INFO_QCOM = 1000547004;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindTileMemoryQCOM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKQCOMTileMemoryHeap() {}

    /// ```
    /// void vkCmdBindTileMemoryQCOM((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkTileMemoryBindInfoQCOM* pTileMemoryBindInfo);
    /// ```
    public static void vkCmdBindTileMemoryQCOM(VkCommandBuffer commandBuffer, MemorySegment pTileMemoryBindInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindTileMemoryQCOM)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindTileMemoryQCOM");
        try { Handles.MH_vkCmdBindTileMemoryQCOM.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindTileMemoryQCOM, commandBuffer.segment(), pTileMemoryBindInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindTileMemoryQCOM", e); }
    }

}
