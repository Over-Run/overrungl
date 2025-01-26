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
public class VKNVAcquireWinrtDisplay {
    public static final int VK_NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME = "VK_NV_acquire_winrt_display";
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkAcquireWinrtDisplayNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetWinrtDisplayNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkAcquireWinrtDisplayNV;
        public final MemorySegment PFN_vkGetWinrtDisplayNV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkAcquireWinrtDisplayNV = func.invoke(device, "vkAcquireWinrtDisplayNV");
            PFN_vkGetWinrtDisplayNV = func.invoke(device, "vkGetWinrtDisplayNV");
        }
    }

    public VKNVAcquireWinrtDisplay(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkAcquireWinrtDisplayNV(VkPhysicalDevice physicalDevice, VkDisplayKHR display);
    /// ```
    public int AcquireWinrtDisplayNV(MemorySegment physicalDevice, long display) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkAcquireWinrtDisplayNV)) throw new SymbolNotFoundError("Symbol not found: vkAcquireWinrtDisplayNV");
        try { return (int) Handles.MH_vkAcquireWinrtDisplayNV.invokeExact(handles.PFN_vkAcquireWinrtDisplayNV, physicalDevice, display); }
        catch (Throwable e) { throw new RuntimeException("error in AcquireWinrtDisplayNV", e); }
    }

    /// ```
    /// VkResult vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, uint32_t deviceRelativeId, VkDisplayKHR* pDisplay);
    /// ```
    public int GetWinrtDisplayNV(MemorySegment physicalDevice, int deviceRelativeId, MemorySegment pDisplay) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetWinrtDisplayNV)) throw new SymbolNotFoundError("Symbol not found: vkGetWinrtDisplayNV");
        try { return (int) Handles.MH_vkGetWinrtDisplayNV.invokeExact(handles.PFN_vkGetWinrtDisplayNV, physicalDevice, deviceRelativeId, pDisplay); }
        catch (Throwable e) { throw new RuntimeException("error in GetWinrtDisplayNV", e); }
    }

}
