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
import static overrungl.vulkan.VK11.*;
public class VKKHRBindMemory2 {
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR = VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = VK_IMAGE_CREATE_ALIAS_BIT;
    public static final MethodHandle MH_vkBindBufferMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkBindImageMemory2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkBindBufferMemory2KHR;
    public final MemorySegment PFN_vkBindImageMemory2KHR;

    public VKKHRBindMemory2(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkBindBufferMemory2KHR = func.invoke(device, "vkBindBufferMemory2KHR", "vkBindBufferMemory2");
        PFN_vkBindImageMemory2KHR = func.invoke(device, "vkBindImageMemory2KHR", "vkBindImageMemory2");
    }

    public @CType("VkResult") int BindBufferMemory2KHR(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int bindInfoCount, @CType("const VkBindBufferMemoryInfo *") MemorySegment pBindInfos) {
        if (Unmarshal.isNullPointer(PFN_vkBindBufferMemory2KHR)) throw new SymbolNotFoundError("Symbol not found: vkBindBufferMemory2KHR");
        try { return (int) MH_vkBindBufferMemory2KHR.invokeExact(PFN_vkBindBufferMemory2KHR, device, bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory2KHR", e); }
    }

    public @CType("VkResult") int BindImageMemory2KHR(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int bindInfoCount, @CType("const VkBindImageMemoryInfo *") MemorySegment pBindInfos) {
        if (Unmarshal.isNullPointer(PFN_vkBindImageMemory2KHR)) throw new SymbolNotFoundError("Symbol not found: vkBindImageMemory2KHR");
        try { return (int) MH_vkBindImageMemory2KHR.invokeExact(PFN_vkBindImageMemory2KHR, device, bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory2KHR", e); }
    }

}
