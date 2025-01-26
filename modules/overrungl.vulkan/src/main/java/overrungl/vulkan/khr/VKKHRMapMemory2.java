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
public class VKKHRMapMemory2 {
    public static final int VK_KHR_MAP_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_MAP_MEMORY_2_EXTENSION_NAME = "VK_KHR_map_memory2";
    public static final int VK_STRUCTURE_TYPE_MEMORY_MAP_INFO_KHR = 1000271000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_UNMAP_INFO_KHR = 1000271001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkMapMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkUnmapMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkMapMemory2KHR;
        public final MemorySegment PFN_vkUnmapMemory2KHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkMapMemory2KHR = func.invoke(device, "vkMapMemory2KHR", "vkMapMemory2");
            PFN_vkUnmapMemory2KHR = func.invoke(device, "vkUnmapMemory2KHR", "vkUnmapMemory2");
        }
    }

    public VKKHRMapMemory2(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkMapMemory2KHR(VkDevice device, const VkMemoryMapInfo* pMemoryMapInfo, void** ppData);
    /// ```
    public int MapMemory2KHR(MemorySegment device, MemorySegment pMemoryMapInfo, MemorySegment ppData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkMapMemory2KHR)) throw new SymbolNotFoundError("Symbol not found: vkMapMemory2KHR");
        try { return (int) Handles.MH_vkMapMemory2KHR.invokeExact(handles.PFN_vkMapMemory2KHR, device, pMemoryMapInfo, ppData); }
        catch (Throwable e) { throw new RuntimeException("error in MapMemory2KHR", e); }
    }

    /// ```
    /// VkResult vkUnmapMemory2KHR(VkDevice device, const VkMemoryUnmapInfo* pMemoryUnmapInfo);
    /// ```
    public int UnmapMemory2KHR(MemorySegment device, MemorySegment pMemoryUnmapInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkUnmapMemory2KHR)) throw new SymbolNotFoundError("Symbol not found: vkUnmapMemory2KHR");
        try { return (int) Handles.MH_vkUnmapMemory2KHR.invokeExact(handles.PFN_vkUnmapMemory2KHR, device, pMemoryUnmapInfo); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapMemory2KHR", e); }
    }

}
