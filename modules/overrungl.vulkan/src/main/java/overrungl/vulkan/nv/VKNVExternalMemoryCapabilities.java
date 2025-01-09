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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNVExternalMemoryCapabilities {
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV = 0x00000004;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV = 0x00000008;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV = 0x00000001;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV = 0x00000002;
    public static final int VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV = 0x00000004;
    public static final int VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME = "VK_NV_external_memory_capabilities";
    public static final MethodHandle MH_vkGetPhysicalDeviceExternalImageFormatPropertiesNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV;

    public VKNVExternalMemoryCapabilities(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV = func.invoke(instance, "vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
    }

    public @CType("VkResult") int GetPhysicalDeviceExternalImageFormatPropertiesNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("VkFormat") int format, @CType("VkImageType") int type, @CType("VkImageTiling") int tiling, @CType("VkImageUsageFlags") int usage, @CType("VkImageCreateFlags") int flags, @CType("VkExternalMemoryHandleTypeFlagsNV") int externalHandleType, @CType("VkExternalImageFormatPropertiesNV *") MemorySegment pExternalImageFormatProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
        try { return (int) MH_vkGetPhysicalDeviceExternalImageFormatPropertiesNV.invokeExact(PFN_vkGetPhysicalDeviceExternalImageFormatPropertiesNV, physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceExternalImageFormatPropertiesNV", e); }
    }

}
