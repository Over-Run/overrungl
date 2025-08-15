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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_external_memory_metal` - device extension
public final class VKEXTExternalMemoryMetal {
    public static final int VK_EXT_EXTERNAL_MEMORY_METAL_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME = "VK_EXT_external_memory_metal";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT = 1000602000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT = 1000602001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT = 1000602002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLBUFFER_BIT_EXT = 0x00010000;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLTEXTURE_BIT_EXT = 0x00020000;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLHEAP_BIT_EXT = 0x00040000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryMetalHandleEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryMetalHandlePropertiesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTExternalMemoryMetal() {}

    /// Invokes `vkGetMemoryMetalHandleEXT`.
    /// ```
    /// (int) VkResult vkGetMemoryMetalHandleEXT((struct VkDevice*) VkDevice device, const VkMemoryGetMetalHandleInfoEXT* pGetMetalHandleInfo, void** pHandle);
    /// ```
    public static int vkGetMemoryMetalHandleEXT(@NonNull VkDevice device, @NonNull MemorySegment pGetMetalHandleInfo, @NonNull MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryMetalHandleEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryMetalHandleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryMetalHandleEXT", device, pGetMetalHandleInfo, pHandle); }
        return (int) Handles.MH_vkGetMemoryMetalHandleEXT.invokeExact(device.capabilities().PFN_vkGetMemoryMetalHandleEXT, device.segment(), pGetMetalHandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryMetalHandleEXT", e); }
    }

    /// Invokes `vkGetMemoryMetalHandlePropertiesEXT`.
    /// ```
    /// (int) VkResult vkGetMemoryMetalHandlePropertiesEXT((struct VkDevice*) VkDevice device, (int) VkExternalMemoryHandleTypeFlagBits handleType, const void* pHandle, VkMemoryMetalHandlePropertiesEXT* pMemoryMetalHandleProperties);
    /// ```
    public static int vkGetMemoryMetalHandlePropertiesEXT(@NonNull VkDevice device, int handleType, @NonNull MemorySegment pHandle, @NonNull MemorySegment pMemoryMetalHandleProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryMetalHandlePropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryMetalHandlePropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryMetalHandlePropertiesEXT", device, handleType, pHandle, pMemoryMetalHandleProperties); }
        return (int) Handles.MH_vkGetMemoryMetalHandlePropertiesEXT.invokeExact(device.capabilities().PFN_vkGetMemoryMetalHandlePropertiesEXT, device.segment(), handleType, pHandle, pMemoryMetalHandleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryMetalHandlePropertiesEXT", e); }
    }

}
