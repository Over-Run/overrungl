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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNVAcquireWinrtDisplay {
    public static final int VK_NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME = "VK_NV_acquire_winrt_display";
    public static final MethodHandle MH_vkAcquireWinrtDisplayNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetWinrtDisplayNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkAcquireWinrtDisplayNV;
    public final MemorySegment PFN_vkGetWinrtDisplayNV;

    public VKNVAcquireWinrtDisplay(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkAcquireWinrtDisplayNV = func.invoke(device, "vkAcquireWinrtDisplayNV");
        PFN_vkGetWinrtDisplayNV = func.invoke(device, "vkGetWinrtDisplayNV");
    }

    public @CType("VkResult") int AcquireWinrtDisplayNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayKHR") MemorySegment display) {
        if (Unmarshal.isNullPointer(PFN_vkAcquireWinrtDisplayNV)) throw new SymbolNotFoundError("Symbol not found: vkAcquireWinrtDisplayNV");
        try { return (int) MH_vkAcquireWinrtDisplayNV.invokeExact(PFN_vkAcquireWinrtDisplayNV, physicalDevice, display); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireWinrtDisplayNV", e); }
    }

    public @CType("VkResult") int GetWinrtDisplayNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int deviceRelativeId, @CType("VkDisplayKHR *") MemorySegment pDisplay) {
        if (Unmarshal.isNullPointer(PFN_vkGetWinrtDisplayNV)) throw new SymbolNotFoundError("Symbol not found: vkGetWinrtDisplayNV");
        try { return (int) MH_vkGetWinrtDisplayNV.invokeExact(PFN_vkGetWinrtDisplayNV, physicalDevice, deviceRelativeId, pDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetWinrtDisplayNV", e); }
    }

}
