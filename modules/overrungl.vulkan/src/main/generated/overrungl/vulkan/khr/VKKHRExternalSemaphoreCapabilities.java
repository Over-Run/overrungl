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
public final class VKKHRExternalSemaphoreCapabilities {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_semaphore_capabilities";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_INFO_KHR = 1000076000;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES_KHR = 1000076001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR = 1000071004;
    public static final int VK_LUID_SIZE_KHR = 8;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = 0x00000001;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = 0x00000002;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = 0x00000004;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR = 0x00000008;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR = 0x00000010;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR = 0x00000001;
    public static final int VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR = 0x00000002;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRExternalSemaphoreCapabilities() {}

    /// ```
    /// void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, const VkPhysicalDeviceExternalSemaphoreInfo* pExternalSemaphoreInfo, VkExternalSemaphoreProperties* pExternalSemaphoreProperties);
    /// ```
    public static void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pExternalSemaphoreInfo, MemorySegment pExternalSemaphoreProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalSemaphorePropertiesKHR");
        try { Handles.MH_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceExternalSemaphorePropertiesKHR, physicalDevice.segment(), pExternalSemaphoreInfo, pExternalSemaphoreProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalSemaphorePropertiesKHR", e); }
    }

}
