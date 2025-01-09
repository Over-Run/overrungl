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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKFUCHSIAExternalSemaphore {
    public static final int VK_FUCHSIA_EXTERNAL_SEMAPHORE_SPEC_VERSION = 1;
    public static final String VK_FUCHSIA_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_FUCHSIA_external_semaphore";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO_FUCHSIA = 1000365000;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_ZIRCON_HANDLE_INFO_FUCHSIA = 1000365001;
    public static final int VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_ZIRCON_EVENT_BIT_FUCHSIA = 0x00000080;
    public static final MethodHandle MH_vkImportSemaphoreZirconHandleFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetSemaphoreZirconHandleFUCHSIA = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkImportSemaphoreZirconHandleFUCHSIA;
    public final MemorySegment PFN_vkGetSemaphoreZirconHandleFUCHSIA;

    public VKFUCHSIAExternalSemaphore(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkImportSemaphoreZirconHandleFUCHSIA = func.invoke(device, "vkImportSemaphoreZirconHandleFUCHSIA");
        PFN_vkGetSemaphoreZirconHandleFUCHSIA = func.invoke(device, "vkGetSemaphoreZirconHandleFUCHSIA");
    }

    public @CType("VkResult") int ImportSemaphoreZirconHandleFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("const VkImportSemaphoreZirconHandleInfoFUCHSIA *") MemorySegment pImportSemaphoreZirconHandleInfo) {
        if (Unmarshal.isNullPointer(PFN_vkImportSemaphoreZirconHandleFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkImportSemaphoreZirconHandleFUCHSIA");
        try { return (int) MH_vkImportSemaphoreZirconHandleFUCHSIA.invokeExact(PFN_vkImportSemaphoreZirconHandleFUCHSIA, device, pImportSemaphoreZirconHandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportSemaphoreZirconHandleFUCHSIA", e); }
    }

    public @CType("VkResult") int GetSemaphoreZirconHandleFUCHSIA(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreGetZirconHandleInfoFUCHSIA *") MemorySegment pGetZirconHandleInfo, @CType("zx_handle_t *") MemorySegment pZirconHandle) {
        if (Unmarshal.isNullPointer(PFN_vkGetSemaphoreZirconHandleFUCHSIA)) throw new SymbolNotFoundError("Symbol not found: vkGetSemaphoreZirconHandleFUCHSIA");
        try { return (int) MH_vkGetSemaphoreZirconHandleFUCHSIA.invokeExact(PFN_vkGetSemaphoreZirconHandleFUCHSIA, device, pGetZirconHandleInfo, pZirconHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreZirconHandleFUCHSIA", e); }
    }

}