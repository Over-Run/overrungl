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
public final class VKKHRGetPhysicalDeviceProperties2 {
    public static final int VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION = 2;
    public static final String VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME = "VK_KHR_get_physical_device_properties2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR = 1000059000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2_KHR = 1000059001;
    public static final int VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2_KHR = 1000059002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2_KHR = 1000059003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_FORMAT_INFO_2_KHR = 1000059004;
    public static final int VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2_KHR = 1000059005;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2_KHR = 1000059006;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_FORMAT_PROPERTIES_2_KHR = 1000059007;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2_KHR = 1000059008;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRGetPhysicalDeviceProperties2() {}

    /// ```
    /// void vkGetPhysicalDeviceFeatures2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2* pFeatures);
    /// ```
    public static void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, MemorySegment pFeatures) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures2KHR");
        try { Handles.MH_vkGetPhysicalDeviceFeatures2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFeatures2KHR, physicalDevice.segment(), pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFeatures2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceProperties2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceProperties2KHR, physicalDevice.segment(), pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFormatProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (int) VkFormat format, VkFormatProperties2* pFormatProperties);
    /// ```
    public static void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, int format, MemorySegment pFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFormatProperties2KHR, physicalDevice.segment(), format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFormatProperties2KHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceImageFormatProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceImageFormatInfo2* pImageFormatInfo, VkImageFormatProperties2* pImageFormatProperties);
    /// ```
    public static int vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pImageFormatInfo, MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties2KHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceImageFormatProperties2KHR, physicalDevice.segment(), pImageFormatInfo, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceImageFormatProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties2* pQueueFamilyProperties);
    /// ```
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR, physicalDevice.segment(), pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceMemoryProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2* pMemoryProperties);
    /// ```
    public static void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pMemoryProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceMemoryProperties2KHR, physicalDevice.segment(), pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceMemoryProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceSparseImageFormatProperties2KHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo, uint32_t* pPropertyCount, VkSparseImageFormatProperties2* pProperties);
    /// ```
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pFormatInfo, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties2KHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR, physicalDevice.segment(), pFormatInfo, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSparseImageFormatProperties2KHR", e); }
    }

}
