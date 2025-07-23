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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKGOOGLEDisplayTiming {
    public static final int VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION = 1;
    public static final String VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";
    public static final int VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE = 1000092000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetRefreshCycleDurationGOOGLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPastPresentationTimingGOOGLE = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKGOOGLEDisplayTiming() {}

    /// ```
    /// (int) VkResult vkGetRefreshCycleDurationGOOGLE((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, VkRefreshCycleDurationGOOGLE* pDisplayTimingProperties);
    /// ```
    public static int vkGetRefreshCycleDurationGOOGLE(VkDevice device, long swapchain, MemorySegment pDisplayTimingProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetRefreshCycleDurationGOOGLE)) throw new VKSymbolNotFoundError("Symbol not found: vkGetRefreshCycleDurationGOOGLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetRefreshCycleDurationGOOGLE", device, swapchain, pDisplayTimingProperties); }
        return (int) Handles.MH_vkGetRefreshCycleDurationGOOGLE.invokeExact(device.capabilities().PFN_vkGetRefreshCycleDurationGOOGLE, device.segment(), swapchain, pDisplayTimingProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetRefreshCycleDurationGOOGLE", e); }
    }

    /// ```
    /// (int) VkResult vkGetPastPresentationTimingGOOGLE((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, uint32_t* pPresentationTimingCount, VkPastPresentationTimingGOOGLE* pPresentationTimings);
    /// ```
    public static int vkGetPastPresentationTimingGOOGLE(VkDevice device, long swapchain, MemorySegment pPresentationTimingCount, MemorySegment pPresentationTimings) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPastPresentationTimingGOOGLE)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPastPresentationTimingGOOGLE");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPastPresentationTimingGOOGLE", device, swapchain, pPresentationTimingCount, pPresentationTimings); }
        return (int) Handles.MH_vkGetPastPresentationTimingGOOGLE.invokeExact(device.capabilities().PFN_vkGetPastPresentationTimingGOOGLE, device.segment(), swapchain, pPresentationTimingCount, pPresentationTimings); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPastPresentationTimingGOOGLE", e); }
    }

}
