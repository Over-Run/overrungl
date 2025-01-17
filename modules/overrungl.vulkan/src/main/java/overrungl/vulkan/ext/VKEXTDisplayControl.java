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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import java.util.*;
public class VKEXTDisplayControl {
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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkDisplayPowerControlEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkRegisterDeviceEventEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkRegisterDisplayEventEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetSwapchainCounterEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkDisplayPowerControlEXT,
            FD_vkRegisterDeviceEventEXT,
            FD_vkRegisterDisplayEventEXT,
            FD_vkGetSwapchainCounterEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkDisplayPowerControlEXT = RuntimeHelper.downcall(Descriptors.FD_vkDisplayPowerControlEXT);
        public static final MethodHandle MH_vkRegisterDeviceEventEXT = RuntimeHelper.downcall(Descriptors.FD_vkRegisterDeviceEventEXT);
        public static final MethodHandle MH_vkRegisterDisplayEventEXT = RuntimeHelper.downcall(Descriptors.FD_vkRegisterDisplayEventEXT);
        public static final MethodHandle MH_vkGetSwapchainCounterEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetSwapchainCounterEXT);
        public final MemorySegment PFN_vkDisplayPowerControlEXT;
        public final MemorySegment PFN_vkRegisterDeviceEventEXT;
        public final MemorySegment PFN_vkRegisterDisplayEventEXT;
        public final MemorySegment PFN_vkGetSwapchainCounterEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkDisplayPowerControlEXT = func.invoke(device, "vkDisplayPowerControlEXT");
            PFN_vkRegisterDeviceEventEXT = func.invoke(device, "vkRegisterDeviceEventEXT");
            PFN_vkRegisterDisplayEventEXT = func.invoke(device, "vkRegisterDisplayEventEXT");
            PFN_vkGetSwapchainCounterEXT = func.invoke(device, "vkGetSwapchainCounterEXT");
        }
    }

    public VKEXTDisplayControl(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int DisplayPowerControlEXT(@CType("VkDevice") MemorySegment device, @CType("VkDisplayKHR") MemorySegment display, @CType("const VkDisplayPowerInfoEXT *") MemorySegment pDisplayPowerInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDisplayPowerControlEXT)) throw new SymbolNotFoundError("Symbol not found: vkDisplayPowerControlEXT");
        try { return (int) Handles.MH_vkDisplayPowerControlEXT.invokeExact(handles.PFN_vkDisplayPowerControlEXT, device, display, pDisplayPowerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkDisplayPowerControlEXT", e); }
    }

    public @CType("VkResult") int RegisterDeviceEventEXT(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceEventInfoEXT *") MemorySegment pDeviceEventInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkFence *") MemorySegment pFence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkRegisterDeviceEventEXT)) throw new SymbolNotFoundError("Symbol not found: vkRegisterDeviceEventEXT");
        try { return (int) Handles.MH_vkRegisterDeviceEventEXT.invokeExact(handles.PFN_vkRegisterDeviceEventEXT, device, pDeviceEventInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkRegisterDeviceEventEXT", e); }
    }

    public @CType("VkResult") int RegisterDisplayEventEXT(@CType("VkDevice") MemorySegment device, @CType("VkDisplayKHR") MemorySegment display, @CType("const VkDisplayEventInfoEXT *") MemorySegment pDisplayEventInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkFence *") MemorySegment pFence) {
        if (Unmarshal.isNullPointer(handles.PFN_vkRegisterDisplayEventEXT)) throw new SymbolNotFoundError("Symbol not found: vkRegisterDisplayEventEXT");
        try { return (int) Handles.MH_vkRegisterDisplayEventEXT.invokeExact(handles.PFN_vkRegisterDisplayEventEXT, device, display, pDisplayEventInfo, pAllocator, pFence); }
        catch (Throwable e) { throw new RuntimeException("error in vkRegisterDisplayEventEXT", e); }
    }

    public @CType("VkResult") int GetSwapchainCounterEXT(@CType("VkDevice") MemorySegment device, @CType("VkSwapchainKHR") MemorySegment swapchain, @CType("VkSurfaceCounterFlagBitsEXT") int counter, @CType("uint64_t *") MemorySegment pCounterValue) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetSwapchainCounterEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetSwapchainCounterEXT");
        try { return (int) Handles.MH_vkGetSwapchainCounterEXT.invokeExact(handles.PFN_vkGetSwapchainCounterEXT, device, swapchain, counter, pCounterValue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSwapchainCounterEXT", e); }
    }

}
