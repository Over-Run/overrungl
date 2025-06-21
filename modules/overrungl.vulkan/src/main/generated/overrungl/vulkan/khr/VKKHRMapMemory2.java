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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRMapMemory2 {
    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;
    public static final class Handles {
        public static final MethodHandle MH_vkMapMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRMapMemory2() {}

    /// ```
    /// (int) VkResult vkMapMemory2KHR((struct VkDevice*) VkDevice device, const VkMemoryMapInfo* pMemoryMapInfo, void** ppData);
    /// ```
    public static int vkMapMemory2KHR(VkDevice device, MemorySegment pMemoryMapInfo, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMapMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkMapMemory2KHR");
        try { return (int) Handles.MH_vkMapMemory2KHR.invokeExact(device.capabilities().PFN_vkMapMemory2KHR, device.segment(), pMemoryMapInfo, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in vkMapMemory2KHR", e); }
    }

    /// ```
    /// (int) VkResult vkUnmapMemory2KHR((struct VkDevice*) VkDevice device, const VkMemoryUnmapInfo* pMemoryUnmapInfo);
    /// ```
    public static int vkUnmapMemory2KHR(VkDevice device, MemorySegment pMemoryUnmapInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkUnmapMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkUnmapMemory2KHR");
        try { return (int) Handles.MH_vkUnmapMemory2KHR.invokeExact(device.capabilities().PFN_vkUnmapMemory2KHR, device.segment(), pMemoryUnmapInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkUnmapMemory2KHR", e); }
    }

}
