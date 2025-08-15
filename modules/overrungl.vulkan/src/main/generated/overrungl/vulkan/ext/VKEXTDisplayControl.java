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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_display_control` - device extension
public final class VKEXTDisplayControl {
    public static final int VK_DISPLAY_POWER_STATE_OFF_EXT = 0;
    public static final int VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1;
    public static final int VK_DISPLAY_POWER_STATE_ON_EXT = 2;
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;
    public static final int VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;
    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT = 1000091000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT = 1000091001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT = 1000091002;
    public static final int VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = 1000091003;
    public static final class Handles {
        public static final MethodHandle MH_vkDisplayPowerControlEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkRegisterDeviceEventEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkRegisterDisplayEventEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSwapchainCounterEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDisplayControl() {}

    /// Invokes `vkDisplayPowerControlEXT`.
    /// ```
    /// (int) VkResult vkDisplayPowerControlEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDisplayKHR display, const VkDisplayPowerInfoEXT* pDisplayPowerInfo);
    /// ```
    public static int vkDisplayPowerControlEXT(@NonNull VkDevice device, long display, @NonNull MemorySegment pDisplayPowerInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDisplayPowerControlEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDisplayPowerControlEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDisplayPowerControlEXT", device, display, pDisplayPowerInfo); }
        return (int) Handles.MH_vkDisplayPowerControlEXT.invokeExact(device.capabilities().PFN_vkDisplayPowerControlEXT, device.segment(), display, pDisplayPowerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkDisplayPowerControlEXT", e); }
    }

    /// Invokes `vkRegisterDeviceEventEXT`.
    /// ```
    /// (int) VkResult vkRegisterDeviceEventEXT((struct VkDevice*) VkDevice device, const VkDeviceEventInfoEXT* pDeviceEventInfo, const VkAllocationCallbacks* pAllocator, VkFence* pFence);
    /// ```
    public static int vkRegisterDeviceEventEXT(@NonNull VkDevice device, @NonNull MemorySegment pDeviceEventInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pFence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkRegisterDeviceEventEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkRegisterDeviceEventEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkRegisterDeviceEventEXT", device, pDeviceEventInfo, pAllocator, pFence); }
        return (int) Handles.MH_vkRegisterDeviceEventEXT.invokeExact(device.capabilities().PFN_vkRegisterDeviceEventEXT, device.segment(), pDeviceEventInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkRegisterDeviceEventEXT", e); }
    }

    /// Invokes `vkRegisterDisplayEventEXT`.
    /// ```
    /// (int) VkResult vkRegisterDisplayEventEXT((struct VkDevice*) VkDevice device, (uint64_t) VkDisplayKHR display, const VkDisplayEventInfoEXT* pDisplayEventInfo, const VkAllocationCallbacks* pAllocator, VkFence* pFence);
    /// ```
    public static int vkRegisterDisplayEventEXT(@NonNull VkDevice device, long display, @NonNull MemorySegment pDisplayEventInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pFence) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkRegisterDisplayEventEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkRegisterDisplayEventEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkRegisterDisplayEventEXT", device, display, pDisplayEventInfo, pAllocator, pFence); }
        return (int) Handles.MH_vkRegisterDisplayEventEXT.invokeExact(device.capabilities().PFN_vkRegisterDisplayEventEXT, device.segment(), display, pDisplayEventInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkRegisterDisplayEventEXT", e); }
    }

    /// Invokes `vkGetSwapchainCounterEXT`.
    /// ```
    /// (int) VkResult vkGetSwapchainCounterEXT((struct VkDevice*) VkDevice device, (uint64_t) VkSwapchainKHR swapchain, (int) VkSurfaceCounterFlagBitsEXT counter, uint64_t* pCounterValue);
    /// ```
    public static int vkGetSwapchainCounterEXT(@NonNull VkDevice device, long swapchain, int counter, @NonNull MemorySegment pCounterValue) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSwapchainCounterEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSwapchainCounterEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetSwapchainCounterEXT", device, swapchain, counter, pCounterValue); }
        return (int) Handles.MH_vkGetSwapchainCounterEXT.invokeExact(device.capabilities().PFN_vkGetSwapchainCounterEXT, device.segment(), swapchain, counter, pCounterValue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainCounterEXT", e); }
    }

}
