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
public class VKKHRGetDisplayProperties2 {
    public static final int VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_display_properties2";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR = 1000121000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR = 1000121001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR = 1000121002;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR = 1000121003;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR = 1000121004;
    public static final MethodHandle MH_vkGetPhysicalDeviceDisplayProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlaneProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDisplayModeProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDisplayPlaneCapabilities2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceDisplayProperties2KHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
    public final MemorySegment PFN_vkGetDisplayModeProperties2KHR;
    public final MemorySegment PFN_vkGetDisplayPlaneCapabilities2KHR;

    public VKKHRGetDisplayProperties2(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceDisplayProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayProperties2KHR");
        PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
        PFN_vkGetDisplayModeProperties2KHR = func.invoke(instance, "vkGetDisplayModeProperties2KHR");
        PFN_vkGetDisplayPlaneCapabilities2KHR = func.invoke(instance, "vkGetDisplayPlaneCapabilities2KHR");
    }

    public @CType("VkResult") int GetPhysicalDeviceDisplayProperties2KHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayProperties2KHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceDisplayProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayProperties2KHR");
        try { return (int) MH_vkGetPhysicalDeviceDisplayProperties2KHR.invokeExact(PFN_vkGetPhysicalDeviceDisplayProperties2KHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayProperties2KHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceDisplayPlaneProperties2KHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayPlaneProperties2KHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
        try { return (int) MH_vkGetPhysicalDeviceDisplayPlaneProperties2KHR.invokeExact(PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPlaneProperties2KHR", e); }
    }

    public @CType("VkResult") int GetDisplayModeProperties2KHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayKHR") MemorySegment display, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayModeProperties2KHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetDisplayModeProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayModeProperties2KHR");
        try { return (int) MH_vkGetDisplayModeProperties2KHR.invokeExact(PFN_vkGetDisplayModeProperties2KHR, physicalDevice, display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayModeProperties2KHR", e); }
    }

    public @CType("VkResult") int GetDisplayPlaneCapabilities2KHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkDisplayPlaneInfo2KHR *") MemorySegment pDisplayPlaneInfo, @CType("VkDisplayPlaneCapabilities2KHR *") MemorySegment pCapabilities) {
        if (Unmarshal.isNullPointer(PFN_vkGetDisplayPlaneCapabilities2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilities2KHR");
        try { return (int) MH_vkGetDisplayPlaneCapabilities2KHR.invokeExact(PFN_vkGetDisplayPlaneCapabilities2KHR, physicalDevice, pDisplayPlaneInfo, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneCapabilities2KHR", e); }
    }

}
