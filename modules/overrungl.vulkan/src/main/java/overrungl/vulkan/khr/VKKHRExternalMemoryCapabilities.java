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
import java.util.*;
import static overrungl.vulkan.VK11.*;
public class VKKHRExternalMemoryCapabilities {
    public static final int VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_KHR_external_memory_capabilities";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_KHR = VK_STRUCTURE_TYPE_EXTERNAL_IMAGE_FORMAT_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES_KHR = VK_STRUCTURE_TYPE_EXTERNAL_BUFFER_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES;
    public static final int VK_LUID_SIZE_KHR = VK_LUID_SIZE;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR = VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR = VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR = VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceExternalBufferPropertiesKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetPhysicalDeviceExternalBufferPropertiesKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceExternalBufferPropertiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceExternalBufferPropertiesKHR);
        public final MemorySegment PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR = func.invoke(instance, "vkGetPhysicalDeviceExternalBufferPropertiesKHR", "vkGetPhysicalDeviceExternalBufferProperties");
        }
    }

    public VKKHRExternalMemoryCapabilities(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public void GetPhysicalDeviceExternalBufferPropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkPhysicalDeviceExternalBufferInfo *") MemorySegment pExternalBufferInfo, @CType("VkExternalBufferProperties *") MemorySegment pExternalBufferProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalBufferPropertiesKHR");
        try { Handles.MH_vkGetPhysicalDeviceExternalBufferPropertiesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceExternalBufferPropertiesKHR, physicalDevice, pExternalBufferInfo, pExternalBufferProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalBufferPropertiesKHR", e); }
    }

}
