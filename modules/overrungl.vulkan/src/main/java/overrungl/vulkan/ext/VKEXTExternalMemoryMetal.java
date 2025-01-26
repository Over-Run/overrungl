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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTExternalMemoryMetal {
    public static final int VK_EXT_EXTERNAL_MEMORY_METAL_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_METAL_EXTENSION_NAME = "VK_EXT_external_memory_metal";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_METAL_HANDLE_INFO_EXT = 1000602000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_METAL_HANDLE_PROPERTIES_EXT = 1000602001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_METAL_HANDLE_INFO_EXT = 1000602002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLBUFFER_BIT_EXT = 0x00010000;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLTEXTURE_BIT_EXT = 0x00020000;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_MTLHEAP_BIT_EXT = 0x00040000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryMetalHandleEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryMetalHandlePropertiesEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetMemoryMetalHandleEXT;
        public final MemorySegment PFN_vkGetMemoryMetalHandlePropertiesEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetMemoryMetalHandleEXT = func.invoke(device, "vkGetMemoryMetalHandleEXT");
            PFN_vkGetMemoryMetalHandlePropertiesEXT = func.invoke(device, "vkGetMemoryMetalHandlePropertiesEXT");
        }
    }

    public VKEXTExternalMemoryMetal(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetMemoryMetalHandleEXT(VkDevice device, const VkMemoryGetMetalHandleInfoEXT* pGetMetalHandleInfo, void** pHandle);
    /// ```
    public int GetMemoryMetalHandleEXT(MemorySegment device, MemorySegment pGetMetalHandleInfo, MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMemoryMetalHandleEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryMetalHandleEXT");
        try { return (int) Handles.MH_vkGetMemoryMetalHandleEXT.invokeExact(handles.PFN_vkGetMemoryMetalHandleEXT, device, pGetMetalHandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryMetalHandleEXT", e); }
    }

    /// ```
    /// VkResult vkGetMemoryMetalHandlePropertiesEXT(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, const void* pHandle, VkMemoryMetalHandlePropertiesEXT* pMemoryMetalHandleProperties);
    /// ```
    public int GetMemoryMetalHandlePropertiesEXT(MemorySegment device, int handleType, MemorySegment pHandle, MemorySegment pMemoryMetalHandleProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMemoryMetalHandlePropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryMetalHandlePropertiesEXT");
        try { return (int) Handles.MH_vkGetMemoryMetalHandlePropertiesEXT.invokeExact(handles.PFN_vkGetMemoryMetalHandlePropertiesEXT, device, handleType, pHandle, pMemoryMetalHandleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryMetalHandlePropertiesEXT", e); }
    }

}
