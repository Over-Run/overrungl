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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRDisplay {
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
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneSupportedDisplaysKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayModePropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDisplayModeKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDisplayPlaneCapabilitiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDisplayPlaneSurfaceKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRDisplay() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceDisplayPropertiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPropertiesKHR* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDisplayPropertiesKHR", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPropertiesKHR, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPropertiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkDisplayPlanePropertiesKHR* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceDisplayPlanePropertiesKHR", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceDisplayPlanePropertiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetDisplayPlaneSupportedDisplaysKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t planeIndex, uint32_t* pDisplayCount, VkDisplayKHR* pDisplays);
    /// ```
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, int planeIndex, MemorySegment pDisplayCount, MemorySegment pDisplays) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayPlaneSupportedDisplaysKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayPlaneSupportedDisplaysKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayPlaneSupportedDisplaysKHR", physicalDevice, planeIndex, pDisplayCount, pDisplays); }
        return (int) Handles.MH_vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayPlaneSupportedDisplaysKHR, physicalDevice.segment(), planeIndex, pDisplayCount, pDisplays); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneSupportedDisplaysKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetDisplayModePropertiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkDisplayKHR display, uint32_t* pPropertyCount, VkDisplayModePropertiesKHR* pProperties);
    /// ```
    public static int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, long display, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayModePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayModePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayModePropertiesKHR", physicalDevice, display, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetDisplayModePropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayModePropertiesKHR, physicalDevice.segment(), display, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayModePropertiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCreateDisplayModeKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkDisplayKHR display, const VkDisplayModeCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDisplayModeKHR* pMode);
    /// ```
    public static int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, long display, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pMode) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkCreateDisplayModeKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDisplayModeKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDisplayModeKHR", physicalDevice, display, pCreateInfo, pAllocator, pMode); }
        return (int) Handles.MH_vkCreateDisplayModeKHR.invokeExact(physicalDevice.capabilities().PFN_vkCreateDisplayModeKHR, physicalDevice.segment(), display, pCreateInfo, pAllocator, pMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayModeKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetDisplayPlaneCapabilitiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkDisplayModeKHR mode, uint32_t planeIndex, VkDisplayPlaneCapabilitiesKHR* pCapabilities);
    /// ```
    public static int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, long mode, int planeIndex, MemorySegment pCapabilities) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetDisplayPlaneCapabilitiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDisplayPlaneCapabilitiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDisplayPlaneCapabilitiesKHR", physicalDevice, mode, planeIndex, pCapabilities); }
        return (int) Handles.MH_vkGetDisplayPlaneCapabilitiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetDisplayPlaneCapabilitiesKHR, physicalDevice.segment(), mode, planeIndex, pCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDisplayPlaneCapabilitiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkCreateDisplayPlaneSurfaceKHR((struct VkInstance*) VkInstance instance, const VkDisplaySurfaceCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkSurfaceKHR* pSurface);
    /// ```
    public static int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateDisplayPlaneSurfaceKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDisplayPlaneSurfaceKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDisplayPlaneSurfaceKHR", instance, pCreateInfo, pAllocator, pSurface); }
        return (int) Handles.MH_vkCreateDisplayPlaneSurfaceKHR.invokeExact(instance.capabilities().PFN_vkCreateDisplayPlaneSurfaceKHR, instance.segment(), pCreateInfo, pAllocator, pSurface); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDisplayPlaneSurfaceKHR", e); }
    }

}
