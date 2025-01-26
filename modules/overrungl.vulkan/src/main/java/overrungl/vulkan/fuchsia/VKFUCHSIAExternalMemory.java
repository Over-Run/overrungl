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
package overrungl.vulkan.fuchsia;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKFUCHSIAExternalMemory {
    public static final int VK_FUCHSIA_EXTERNAL_MEMORY_SPEC_VERSION = 1;
    public static final String VK_FUCHSIA_EXTERNAL_MEMORY_EXTENSION_NAME = "VK_FUCHSIA_external_memory";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_ZIRCON_HANDLE_INFO_FUCHSIA = 1000364000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_ZIRCON_HANDLE_PROPERTIES_FUCHSIA = 1000364001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_ZIRCON_HANDLE_INFO_FUCHSIA = 1000364002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_ZIRCON_VMO_BIT_FUCHSIA = 0x00000800;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryZirconHandleFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryZirconHandlePropertiesFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetMemoryZirconHandleFUCHSIA;
        public final MemorySegment PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetMemoryZirconHandleFUCHSIA = func.invoke(device, "vkGetMemoryZirconHandleFUCHSIA");
            PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA = func.invoke(device, "vkGetMemoryZirconHandlePropertiesFUCHSIA");
        }
    }

    public VKFUCHSIAExternalMemory(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetMemoryZirconHandleFUCHSIA(VkDevice device, const VkMemoryGetZirconHandleInfoFUCHSIA* pGetZirconHandleInfo, zx_handle_t* pZirconHandle);
    /// ```
    public int GetMemoryZirconHandleFUCHSIA(MemorySegment device, MemorySegment pGetZirconHandleInfo, MemorySegment pZirconHandle) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMemoryZirconHandleFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryZirconHandleFUCHSIA");
        try { return (int) Handles.MH_vkGetMemoryZirconHandleFUCHSIA.invokeExact(handles.PFN_vkGetMemoryZirconHandleFUCHSIA, device, pGetZirconHandleInfo, pZirconHandle); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryZirconHandleFUCHSIA", e); }
    }

    /// ```
    /// VkResult vkGetMemoryZirconHandlePropertiesFUCHSIA(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, zx_handle_t zirconHandle, VkMemoryZirconHandlePropertiesFUCHSIA* pMemoryZirconHandleProperties);
    /// ```
    public int GetMemoryZirconHandlePropertiesFUCHSIA(MemorySegment device, int handleType, int zirconHandle, MemorySegment pMemoryZirconHandleProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryZirconHandlePropertiesFUCHSIA");
        try { return (int) Handles.MH_vkGetMemoryZirconHandlePropertiesFUCHSIA.invokeExact(handles.PFN_vkGetMemoryZirconHandlePropertiesFUCHSIA, device, handleType, zirconHandle, pMemoryZirconHandleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryZirconHandlePropertiesFUCHSIA", e); }
    }

}
