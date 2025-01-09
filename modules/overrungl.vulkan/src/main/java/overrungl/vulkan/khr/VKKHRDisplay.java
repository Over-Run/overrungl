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
    public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDisplayPlaneSupportedDisplaysKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDisplayModePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateDisplayModeKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDisplayPlaneCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateDisplayPlaneSurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPropertiesKHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
    public final MemorySegment PFN_vkGetDisplayPlaneSupportedDisplaysKHR;
    public final MemorySegment PFN_vkGetDisplayModePropertiesKHR;
    public final MemorySegment PFN_vkCreateDisplayModeKHR;
    public final MemorySegment PFN_vkGetDisplayPlaneCapabilitiesKHR;
    public final MemorySegment PFN_vkCreateDisplayPlaneSurfaceKHR;

    public VKKHRDisplay(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceDisplayPropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPropertiesKHR");
        PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        PFN_vkGetDisplayPlaneSupportedDisplaysKHR = func.invoke(instance, "vkGetDisplayPlaneSupportedDisplaysKHR");
        PFN_vkGetDisplayModePropertiesKHR = func.invoke(instance, "vkGetDisplayModePropertiesKHR");
        PFN_vkCreateDisplayModeKHR = func.invoke(instance, "vkCreateDisplayModeKHR");
        PFN_vkGetDisplayPlaneCapabilitiesKHR = func.invoke(instance, "vkGetDisplayPlaneCapabilitiesKHR");
        PFN_vkCreateDisplayPlaneSurfaceKHR = func.invoke(instance, "vkCreateDisplayPlaneSurfaceKHR");
    }

    public @CType("VkResult") int GetPhysicalDeviceDisplayPropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayPropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceDisplayPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPropertiesKHR");
        try { return (int) MH_vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(PFN_vkGetPhysicalDeviceDisplayPropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPropertiesKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceDisplayPlanePropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayPlanePropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        try { return (int) MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPlanePropertiesKHR", e); }
    }

    public @CType("VkResult") int GetDisplayPlaneSupportedDisplaysKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int planeIndex, @CType("uint32_t *") MemorySegment pDisplayCount, @CType("VkDisplayKHR *") MemorySegment pDisplays) {
        if (Unmarshal.isNullPointer(PFN_vkGetDisplayPlaneSupportedDisplaysKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneSupportedDisplaysKHR");
        try { return (int) MH_vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(PFN_vkGetDisplayPlaneSupportedDisplaysKHR, physicalDevice, planeIndex, pDisplayCount, pDisplays); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneSupportedDisplaysKHR", e); }
    }

    public @CType("VkResult") int GetDisplayModePropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayKHR") MemorySegment display, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayModePropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetDisplayModePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayModePropertiesKHR");
        try { return (int) MH_vkGetDisplayModePropertiesKHR.invokeExact(PFN_vkGetDisplayModePropertiesKHR, physicalDevice, display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayModePropertiesKHR", e); }
    }

    public @CType("VkResult") int CreateDisplayModeKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayKHR") MemorySegment display, @CType("const VkDisplayModeCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDisplayModeKHR *") MemorySegment pMode) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDisplayModeKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDisplayModeKHR");
        try { return (int) MH_vkCreateDisplayModeKHR.invokeExact(PFN_vkCreateDisplayModeKHR, physicalDevice, display, pCreateInfo, pAllocator, pMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayModeKHR", e); }
    }

    public @CType("VkResult") int GetDisplayPlaneCapabilitiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayModeKHR") MemorySegment mode, @CType("uint32_t") int planeIndex, @CType("VkDisplayPlaneCapabilitiesKHR *") MemorySegment pCapabilities) {
        if (Unmarshal.isNullPointer(PFN_vkGetDisplayPlaneCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilitiesKHR");
        try { return (int) MH_vkGetDisplayPlaneCapabilitiesKHR.invokeExact(PFN_vkGetDisplayPlaneCapabilitiesKHR, physicalDevice, mode, planeIndex, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneCapabilitiesKHR", e); }
    }

    public @CType("VkResult") int CreateDisplayPlaneSurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("const VkDisplaySurfaceCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDisplayPlaneSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDisplayPlaneSurfaceKHR");
        try { return (int) MH_vkCreateDisplayPlaneSurfaceKHR.invokeExact(PFN_vkCreateDisplayPlaneSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayPlaneSurfaceKHR", e); }
    }

}
