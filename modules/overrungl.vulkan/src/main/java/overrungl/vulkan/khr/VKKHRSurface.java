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
public class VKKHRSurface {
    public static final int VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x00000001;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x00000002;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x00000004;
    public static final int VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x00000008;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x00000010;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x00000020;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x00000040;
    public static final int VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x00000080;
    public static final int VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x00000100;
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_COLOR_SPACE_SRGB_NONLINEAR_KHR = 0;
    public static final int VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x00000001;
    public static final int VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x00000002;
    public static final int VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x00000004;
    public static final int VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x00000008;
    public static final int VK_KHR_SURFACE_SPEC_VERSION = 25;
    public static final String VK_KHR_SURFACE_EXTENSION_NAME = "VK_KHR_surface";
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_OBJECT_TYPE_SURFACE_KHR = 1000000000;
    public static final int VK_COLORSPACE_SRGB_NONLINEAR_KHR = VK_COLOR_SPACE_SRGB_NONLINEAR_KHR;
    public static final MethodHandle MH_vkDestroySurfaceKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceCapabilitiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceSurfaceFormatsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceSurfacePresentModesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkDestroySurfaceKHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceSurfaceSupportKHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceSurfaceFormatsKHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceSurfacePresentModesKHR;

    public VKKHRSurface(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkDestroySurfaceKHR = func.invoke(instance, "vkDestroySurfaceKHR");
        PFN_vkGetPhysicalDeviceSurfaceSupportKHR = func.invoke(instance, "vkGetPhysicalDeviceSurfaceSupportKHR");
        PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR = func.invoke(instance, "vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
        PFN_vkGetPhysicalDeviceSurfaceFormatsKHR = func.invoke(instance, "vkGetPhysicalDeviceSurfaceFormatsKHR");
        PFN_vkGetPhysicalDeviceSurfacePresentModesKHR = func.invoke(instance, "vkGetPhysicalDeviceSurfacePresentModesKHR");
    }

    public void DestroySurfaceKHR(@CType("VkInstance") MemorySegment instance, @CType("VkSurfaceKHR") MemorySegment surface, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroySurfaceKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroySurfaceKHR");
        try { MH_vkDestroySurfaceKHR.invokeExact(PFN_vkDestroySurfaceKHR, instance, surface, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroySurfaceKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceSurfaceSupportKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int queueFamilyIndex, @CType("VkSurfaceKHR") MemorySegment surface, @CType("VkBool32 *") MemorySegment pSupported) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceSurfaceSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceSupportKHR");
        try { return (int) MH_vkGetPhysicalDeviceSurfaceSupportKHR.invokeExact(PFN_vkGetPhysicalDeviceSurfaceSupportKHR, physicalDevice, queueFamilyIndex, surface, pSupported); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceSupportKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceSurfaceCapabilitiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkSurfaceKHR") MemorySegment surface, @CType("VkSurfaceCapabilitiesKHR *") MemorySegment pSurfaceCapabilities) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
        try { return (int) MH_vkGetPhysicalDeviceSurfaceCapabilitiesKHR.invokeExact(PFN_vkGetPhysicalDeviceSurfaceCapabilitiesKHR, physicalDevice, surface, pSurfaceCapabilities); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceCapabilitiesKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceSurfaceFormatsKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkSurfaceKHR") MemorySegment surface, @CType("uint32_t *") MemorySegment pSurfaceFormatCount, @CType("VkSurfaceFormatKHR *") MemorySegment pSurfaceFormats) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceSurfaceFormatsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfaceFormatsKHR");
        try { return (int) MH_vkGetPhysicalDeviceSurfaceFormatsKHR.invokeExact(PFN_vkGetPhysicalDeviceSurfaceFormatsKHR, physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfaceFormatsKHR", e); }
    }

    public @CType("VkResult") int GetPhysicalDeviceSurfacePresentModesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkSurfaceKHR") MemorySegment surface, @CType("uint32_t *") MemorySegment pPresentModeCount, @CType("VkPresentModeKHR *") MemorySegment pPresentModes) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceSurfacePresentModesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSurfacePresentModesKHR");
        try { return (int) MH_vkGetPhysicalDeviceSurfacePresentModesKHR.invokeExact(PFN_vkGetPhysicalDeviceSurfacePresentModesKHR, physicalDevice, surface, pPresentModeCount, pPresentModes); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSurfacePresentModesKHR", e); }
    }

}
