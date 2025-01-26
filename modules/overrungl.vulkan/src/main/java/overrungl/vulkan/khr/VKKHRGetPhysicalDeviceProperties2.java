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
public class VKKHRGetPhysicalDeviceProperties2 {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceFeatures2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceFormatProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceImageFormatProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceMemoryProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPhysicalDeviceSparseImageFormatProperties2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceFeatures2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceProperties2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceFormatProperties2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceImageFormatProperties2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceMemoryProperties2KHR;
        public final MemorySegment PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceFeatures2KHR = func.invoke(instance, "vkGetPhysicalDeviceFeatures2KHR", "vkGetPhysicalDeviceFeatures2");
            PFN_vkGetPhysicalDeviceProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceProperties2KHR", "vkGetPhysicalDeviceProperties2");
            PFN_vkGetPhysicalDeviceFormatProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceFormatProperties2KHR", "vkGetPhysicalDeviceFormatProperties2");
            PFN_vkGetPhysicalDeviceImageFormatProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceImageFormatProperties2KHR", "vkGetPhysicalDeviceImageFormatProperties2");
            PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceQueueFamilyProperties2KHR", "vkGetPhysicalDeviceQueueFamilyProperties2");
            PFN_vkGetPhysicalDeviceMemoryProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceMemoryProperties2KHR", "vkGetPhysicalDeviceMemoryProperties2");
            PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR = func.invoke(instance, "vkGetPhysicalDeviceSparseImageFormatProperties2KHR", "vkGetPhysicalDeviceSparseImageFormatProperties2");
        }
    }

    public VKKHRGetPhysicalDeviceProperties2(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// void vkGetPhysicalDeviceFeatures2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceFeatures2* pFeatures);
    /// ```
    public void GetPhysicalDeviceFeatures2KHR(MemorySegment physicalDevice, MemorySegment pFeatures) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceFeatures2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFeatures2KHR");
        try { Handles.MH_vkGetPhysicalDeviceFeatures2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceFeatures2KHR, physicalDevice, pFeatures); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceFeatures2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceProperties2* pProperties);
    /// ```
    public void GetPhysicalDeviceProperties2KHR(MemorySegment physicalDevice, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceProperties2KHR, physicalDevice, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceFormatProperties2KHR(VkPhysicalDevice physicalDevice, VkFormat format, VkFormatProperties2* pFormatProperties);
    /// ```
    public void GetPhysicalDeviceFormatProperties2KHR(MemorySegment physicalDevice, int format, MemorySegment pFormatProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceFormatProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFormatProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceFormatProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceFormatProperties2KHR, physicalDevice, format, pFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceFormatProperties2KHR", e); }
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, const VkPhysicalDeviceImageFormatInfo2* pImageFormatInfo, VkImageFormatProperties2* pImageFormatProperties);
    /// ```
    public int GetPhysicalDeviceImageFormatProperties2KHR(MemorySegment physicalDevice, MemorySegment pImageFormatInfo, MemorySegment pImageFormatProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceImageFormatProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceImageFormatProperties2KHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceImageFormatProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceImageFormatProperties2KHR, physicalDevice, pImageFormatInfo, pImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceImageFormatProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceQueueFamilyProperties2KHR(VkPhysicalDevice physicalDevice, uint32_t* pQueueFamilyPropertyCount, VkQueueFamilyProperties2* pQueueFamilyProperties);
    /// ```
    public void GetPhysicalDeviceQueueFamilyProperties2KHR(MemorySegment physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceQueueFamilyProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceQueueFamilyProperties2KHR, physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceQueueFamilyProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceMemoryProperties2KHR(VkPhysicalDevice physicalDevice, VkPhysicalDeviceMemoryProperties2* pMemoryProperties);
    /// ```
    public void GetPhysicalDeviceMemoryProperties2KHR(MemorySegment physicalDevice, MemorySegment pMemoryProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceMemoryProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceMemoryProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceMemoryProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceMemoryProperties2KHR, physicalDevice, pMemoryProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceMemoryProperties2KHR", e); }
    }

    /// ```
    /// void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(VkPhysicalDevice physicalDevice, const VkPhysicalDeviceSparseImageFormatInfo2* pFormatInfo, uint32_t* pPropertyCount, VkSparseImageFormatProperties2* pProperties);
    /// ```
    public void GetPhysicalDeviceSparseImageFormatProperties2KHR(MemorySegment physicalDevice, MemorySegment pFormatInfo, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSparseImageFormatProperties2KHR");
        try { Handles.MH_vkGetPhysicalDeviceSparseImageFormatProperties2KHR.invokeExact(handles.PFN_vkGetPhysicalDeviceSparseImageFormatProperties2KHR, physicalDevice, pFormatInfo, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceSparseImageFormatProperties2KHR", e); }
    }

}
