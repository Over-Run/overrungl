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
public final class VKKHRBindMemory2 {
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR = 1000157001;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x00000400;
    public static final class Handles {
        public static final MethodHandle MH_vkBindBufferMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindImageMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRBindMemory2() {}

    /// ```
    /// (int) VkResult vkBindBufferMemory2KHR((struct VkDevice*) VkDevice device, uint32_t bindInfoCount, const VkBindBufferMemoryInfo* pBindInfos);
    /// ```
    public static int vkBindBufferMemory2KHR(VkDevice device, int bindInfoCount, MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindBufferMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkBindBufferMemory2KHR");
        try { return (int) Handles.MH_vkBindBufferMemory2KHR.invokeExact(device.capabilities().PFN_vkBindBufferMemory2KHR, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory2KHR", e); }
    }

    /// ```
    /// (int) VkResult vkBindImageMemory2KHR((struct VkDevice*) VkDevice device, uint32_t bindInfoCount, const VkBindImageMemoryInfo* pBindInfos);
    /// ```
    public static int vkBindImageMemory2KHR(VkDevice device, int bindInfoCount, MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindImageMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkBindImageMemory2KHR");
        try { return (int) Handles.MH_vkBindImageMemory2KHR.invokeExact(device.capabilities().PFN_vkBindImageMemory2KHR, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory2KHR", e); }
    }

}
