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
public class VKKHRDisplay {
    public static final int VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004;
    public static final int VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008;
    public static final int VK_KHR_DISPLAY_SPEC_VERSION = 23;
    public static final String VK_KHR_DISPLAY_EXTENSION_NAME = "VK_KHR_display";
    public static final int VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = 1000002000;
    public static final int VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001;
    public static final int VK_OBJECT_TYPE_DISPLAY_KHR = 1000002000;
    public static final int VK_OBJECT_TYPE_DISPLAY_MODE_KHR = 1000002001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneSupportedDisplaysKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayModePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDisplayModeKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDisplayPlaneSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPropertiesKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        public final MemorySegment PFN_vkGetDisplayPlaneSupportedDisplaysKHR;
        public final MemorySegment PFN_vkGetDisplayModePropertiesKHR;
        public final MemorySegment PFN_vkCreateDisplayModeKHR;
        public final MemorySegment PFN_vkGetDisplayPlaneCapabilitiesKHR;
        public final MemorySegment PFN_vkCreateDisplayPlaneSurfaceKHR;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceDisplayPropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPropertiesKHR");
            PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
            PFN_vkGetDisplayPlaneSupportedDisplaysKHR = func.invoke(instance, "vkGetDisplayPlaneSupportedDisplaysKHR");
            PFN_vkGetDisplayModePropertiesKHR = func.invoke(instance, "vkGetDisplayModePropertiesKHR");
            PFN_vkCreateDisplayModeKHR = func.invoke(instance, "vkCreateDisplayModeKHR");
            PFN_vkGetDisplayPlaneCapabilitiesKHR = func.invoke(instance, "vkGetDisplayPlaneCapabilitiesKHR");
            PFN_vkCreateDisplayPlaneSurfaceKHR = func.invoke(instance, "vkCreateDisplayPlaneSurfaceKHR");
        }
    }

    public VKKHRDisplay(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPropertiesKHR* pProperties);
    /// ```
    public int GetPhysicalDeviceDisplayPropertiesKHR(MemorySegment physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceDisplayPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPropertiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceDisplayPropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceDisplayPropertiesKHR", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPlanePropertiesKHR* pProperties);
    /// ```
    public int GetPhysicalDeviceDisplayPlanePropertiesKHR(MemorySegment physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceDisplayPlanePropertiesKHR", e); }
    }

    /// ```
    /// VkResult vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, uint32_t planeIndex, uint32_t* pDisplayCount, VkDisplayKHR* pDisplays);
    /// ```
    public int GetDisplayPlaneSupportedDisplaysKHR(MemorySegment physicalDevice, int planeIndex, MemorySegment pDisplayCount, MemorySegment pDisplays) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDisplayPlaneSupportedDisplaysKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneSupportedDisplaysKHR");
        try { return (int) Handles.MH_vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(handles.PFN_vkGetDisplayPlaneSupportedDisplaysKHR, physicalDevice, planeIndex, pDisplayCount, pDisplays); }
        catch (Throwable e) { throw new RuntimeException("error in GetDisplayPlaneSupportedDisplaysKHR", e); }
    }

    /// ```
    /// VkResult vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, uint32_t* pPropertyCount, VkDisplayModePropertiesKHR* pProperties);
    /// ```
    public int GetDisplayModePropertiesKHR(MemorySegment physicalDevice, long display, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDisplayModePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayModePropertiesKHR");
        try { return (int) Handles.MH_vkGetDisplayModePropertiesKHR.invokeExact(handles.PFN_vkGetDisplayModePropertiesKHR, physicalDevice, display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetDisplayModePropertiesKHR", e); }
    }

    /// ```
    /// VkResult vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, const VkDisplayModeCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDisplayModeKHR* pMode);
    /// ```
    public int CreateDisplayModeKHR(MemorySegment physicalDevice, long display, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDisplayModeKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDisplayModeKHR");
        try { return (int) Handles.MH_vkCreateDisplayModeKHR.invokeExact(handles.PFN_vkCreateDisplayModeKHR, physicalDevice, display, pCreateInfo, pAllocator, pMode); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDisplayModeKHR", e); }
    }

    /// ```
    /// VkResult vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, uint32_t planeIndex, VkDisplayPlaneCapabilitiesKHR* pCapabilities);
    /// ```
    public int GetDisplayPlaneCapabilitiesKHR(MemorySegment physicalDevice, long mode, int planeIndex, MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDisplayPlaneCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilitiesKHR");
        try { return (int) Handles.MH_vkGetDisplayPlaneCapabilitiesKHR.invokeExact(handles.PFN_vkGetDisplayPlaneCapabilitiesKHR, physicalDevice, mode, planeIndex, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in GetDisplayPlaneCapabilitiesKHR", e); }
    }

    /// ```
    /// VkResult vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, const VkDisplaySurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public int CreateDisplayPlaneSurfaceKHR(MemorySegment instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDisplayPlaneSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDisplayPlaneSurfaceKHR");
        try { return (int) Handles.MH_vkCreateDisplayPlaneSurfaceKHR.invokeExact(handles.PFN_vkCreateDisplayPlaneSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDisplayPlaneSurfaceKHR", e); }
    }

}
