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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceDisplayPropertiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDisplayPlaneSupportedDisplaysKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDisplayModePropertiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateDisplayModeKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetDisplayPlaneCapabilitiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCreateDisplayPlaneSurfaceKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPropertiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceDisplayPropertiesKHR);
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceDisplayPlanePropertiesKHR);
        public static final MethodHandle MH_vkGetDisplayPlaneSupportedDisplaysKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetDisplayPlaneSupportedDisplaysKHR);
        public static final MethodHandle MH_vkGetDisplayModePropertiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetDisplayModePropertiesKHR);
        public static final MethodHandle MH_vkCreateDisplayModeKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateDisplayModeKHR);
        public static final MethodHandle MH_vkGetDisplayPlaneCapabilitiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetDisplayPlaneCapabilitiesKHR);
        public static final MethodHandle MH_vkCreateDisplayPlaneSurfaceKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreateDisplayPlaneSurfaceKHR);
        public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPropertiesKHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
        public final MemorySegment PFN_vkGetDisplayPlaneSupportedDisplaysKHR;
        public final MemorySegment PFN_vkGetDisplayModePropertiesKHR;
        public final MemorySegment PFN_vkCreateDisplayModeKHR;
        public final MemorySegment PFN_vkGetDisplayPlaneCapabilitiesKHR;
        public final MemorySegment PFN_vkCreateDisplayPlaneSurfaceKHR;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceDisplayPropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPropertiesKHR");
            PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
            PFN_vkGetDisplayPlaneSupportedDisplaysKHR = func.invoke(instance, "vkGetDisplayPlaneSupportedDisplaysKHR");
            PFN_vkGetDisplayModePropertiesKHR = func.invoke(instance, "vkGetDisplayModePropertiesKHR");
            PFN_vkCreateDisplayModeKHR = func.invoke(instance, "vkCreateDisplayModeKHR");
            PFN_vkGetDisplayPlaneCapabilitiesKHR = func.invoke(instance, "vkGetDisplayPlaneCapabilitiesKHR");
            PFN_vkCreateDisplayPlaneSurfaceKHR = func.invoke(instance, "vkCreateDisplayPlaneSurfaceKHR");
        }
    }

    public VKKHRDisplay(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceDisplayPropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayPropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceDisplayPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPropertiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceDisplayPropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPropertiesKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceDisplayPlanePropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayPlanePropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPlanePropertiesKHR", e); }
    }

    public @CType("VkResult") int GetDisplayPlaneSupportedDisplaysKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int planeIndex, @CType("uint32_t *") MemorySegment pDisplayCount, @CType("VkDisplayKHR *") MemorySegment pDisplays) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDisplayPlaneSupportedDisplaysKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneSupportedDisplaysKHR");
        try { return (int) Handles.MH_vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(handles.PFN_vkGetDisplayPlaneSupportedDisplaysKHR, physicalDevice, planeIndex, pDisplayCount, pDisplays); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneSupportedDisplaysKHR", e); }
    }

    public @CType("VkResult") int GetDisplayModePropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayKHR") MemorySegment display, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkDisplayModePropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDisplayModePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayModePropertiesKHR");
        try { return (int) Handles.MH_vkGetDisplayModePropertiesKHR.invokeExact(handles.PFN_vkGetDisplayModePropertiesKHR, physicalDevice, display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayModePropertiesKHR", e); }
    }

    public @CType("VkResult") int CreateDisplayModeKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayKHR") MemorySegment display, @CType("const VkDisplayModeCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDisplayModeKHR *") MemorySegment pMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDisplayModeKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDisplayModeKHR");
        try { return (int) Handles.MH_vkCreateDisplayModeKHR.invokeExact(handles.PFN_vkCreateDisplayModeKHR, physicalDevice, display, pCreateInfo, pAllocator, pMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayModeKHR", e); }
    }

    public @CType("VkResult") int GetDisplayPlaneCapabilitiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkDisplayModeKHR") MemorySegment mode, @CType("uint32_t") int planeIndex, @CType("VkDisplayPlaneCapabilitiesKHR *") MemorySegment pCapabilities) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDisplayPlaneCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilitiesKHR");
        try { return (int) Handles.MH_vkGetDisplayPlaneCapabilitiesKHR.invokeExact(handles.PFN_vkGetDisplayPlaneCapabilitiesKHR, physicalDevice, mode, planeIndex, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneCapabilitiesKHR", e); }
    }

    public @CType("VkResult") int CreateDisplayPlaneSurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("const VkDisplaySurfaceCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkSurfaceKHR *") MemorySegment pSurface) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDisplayPlaneSurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDisplayPlaneSurfaceKHR");
        try { return (int) Handles.MH_vkCreateDisplayPlaneSurfaceKHR.invokeExact(handles.PFN_vkCreateDisplayPlaneSurfaceKHR, instance, pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayPlaneSurfaceKHR", e); }
    }

}
