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
package overrungl.vulkan.google;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKGOOGLEDisplayTiming {
    public static final int VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = 1;
    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE = 1000092000;
    public static final MethodHandle MH_vkGetRefreshCycleDurationGOOGLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPastPresentationTimingGOOGLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetRefreshCycleDurationGOOGLE;
    public final MemorySegment PFN_vkGetPastPresentationTimingGOOGLE;

    public VKGOOGLEDisplayTiming(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetRefreshCycleDurationGOOGLE = func.invoke(device, "vkGetRefreshCycleDurationGOOGLE");
        PFN_vkGetPastPresentationTimingGOOGLE = func.invoke(device, "vkGetPastPresentationTimingGOOGLE");
    }

    public @CType("VkResult") int GetRefreshCycleDurationGOOGLE(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("VkRefreshCycleDurationGOOGLE *") MemorySegment pDisplayTimingProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetRefreshCycleDurationGOOGLE)) throw new SymbolNotFoundError("Symbol not found: vkGetRefreshCycleDurationGOOGLE");
        try { return (int) MH_vkGetRefreshCycleDurationGOOGLE.invokeExact(PFN_vkGetRefreshCycleDurationGOOGLE, device, swapchain, pDisplayTimingProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRefreshCycleDurationGOOGLE", e); }
    }

    public @CType("VkResult") int GetPastPresentationTimingGOOGLE(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("uint32_t *") MemorySegment pPresentationTimingCount, @CType("VkPastPresentationTimingGOOGLE *") MemorySegment pPresentationTimings) {
        if (Unmarshal.isNullPointer(PFN_vkGetPastPresentationTimingGOOGLE)) throw new SymbolNotFoundError("Symbol not found: vkGetPastPresentationTimingGOOGLE");
        try { return (int) MH_vkGetPastPresentationTimingGOOGLE.invokeExact(PFN_vkGetPastPresentationTimingGOOGLE, device, swapchain, pPresentationTimingCount, pPresentationTimings); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPastPresentationTimingGOOGLE", e); }
    }

}
