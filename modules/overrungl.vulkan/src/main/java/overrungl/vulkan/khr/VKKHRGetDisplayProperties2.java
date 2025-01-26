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
public class VKKHRGetDisplayProperties2 {
    public static final int VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_display_properties2";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR = 1000121000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR = 1000121001;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR = 1000121002;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR = 1000121003;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR = 1000121004;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlaneProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayModeProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneCapabilities2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceDisplayProperties2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
        public final MemorySegment PFN_vkGetDisplayModeProperties2KHR;
        public final MemorySegment PFN_vkGetDisplayPlaneCapabilities2KHR;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceDisplayProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayProperties2KHR");
            PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
            PFN_vkGetDisplayModeProperties2KHR = func.invoke(instance, "vkGetDisplayModeProperties2KHR");
            PFN_vkGetDisplayPlaneCapabilities2KHR = func.invoke(instance, "vkGetDisplayPlaneCapabilities2KHR");
        }
    }

    public VKKHRGetDisplayProperties2(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayProperties2KHR* pProperties);
    /// ```
    public int GetPhysicalDeviceDisplayProperties2KHR(MemorySegment physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceDisplayProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayProperties2KHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDisplayProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceDisplayProperties2KHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceDisplayProperties2KHR", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPlaneProperties2KHR* pProperties);
    /// ```
    public int GetPhysicalDeviceDisplayPlaneProperties2KHR(MemorySegment physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDisplayPlaneProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceDisplayPlaneProperties2KHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceDisplayPlaneProperties2KHR", e); }
    }

    /// ```
    /// VkResult vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t* pPropertyCount, VkDisplayModeProperties2KHR* pProperties);
    /// ```
    public int GetDisplayModeProperties2KHR(MemorySegment physicalDevice, long display, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDisplayModeProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayModeProperties2KHR");
        try { return (int) Handles.MH_vkGetDisplayModeProperties2KHR.invokeExact(handles.PFN_vkGetDisplayModeProperties2KHR, physicalDevice, display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetDisplayModeProperties2KHR", e); }
    }

    /// ```
    /// VkResult vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, const VkDisplayPlaneInfo2KHR* pDisplayPlaneInfo, VkDisplayPlaneCapabilities2KHR* pCapabilities);
    /// ```
    public int GetDisplayPlaneCapabilities2KHR(MemorySegment physicalDevice, MemorySegment pDisplayPlaneInfo, MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDisplayPlaneCapabilities2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilities2KHR");
        try { return (int) Handles.MH_vkGetDisplayPlaneCapabilities2KHR.invokeExact(handles.PFN_vkGetDisplayPlaneCapabilities2KHR, physicalDevice, pDisplayPlaneInfo, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in GetDisplayPlaneCapabilities2KHR", e); }
    }

}
