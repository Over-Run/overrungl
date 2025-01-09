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
import static overrungl.vulkan.VK11.*;
public class VKKHRExternalFenceCapabilities {
    public static final int VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_fence_capabilities";
    public static final int VK_LUID_SIZE_KHR = VK_LUID_SIZE;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FENCE_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES_KHR = VK_STRUCTURE_TYPE_EXTERNAL_FENCE_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT_KHR = VK_EXTERNAL_FENCE_HANDLE_TYPE_SYNC_FD_BIT;
    public static final int VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR = VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR = VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT;
    public static final MethodHandle MH_vkGetPhysicalDeviceExternalFencePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR;

    public VKKHRExternalFenceCapabilities(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceExternalFencePropertiesKHR", "vkGetPhysicalDeviceExternalFenceProperties");
    }

    public void GetPhysicalDeviceExternalFencePropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceExternalFenceInfo *") MemorySegment pExternalFenceInfo, @CType("VkExternalFenceProperties *") MemorySegment pExternalFenceProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalFencePropertiesKHR");
        try { MH_vkGetPhysicalDeviceExternalFencePropertiesKHR.invokeExact(PFN_vkGetPhysicalDeviceExternalFencePropertiesKHR, physicalDevice, pExternalFenceInfo, pExternalFenceProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalFencePropertiesKHR", e); }
    }

}