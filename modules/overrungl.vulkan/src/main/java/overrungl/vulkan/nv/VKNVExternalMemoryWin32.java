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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVExternalMemoryWin32 {
    public static final int VK_NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_NV_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057001;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryWin32HandleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVExternalMemoryWin32() {}

    /// ```
    /// (int) VkResult vkGetMemoryWin32HandleNV((struct VkDevice*) VkDevice device, (uint64_t) VkDeviceMemory memory, ((uint32_t) VkFlags) VkExternalMemoryHandleTypeFlagsNV handleType, HANDLE* pHandle);
    /// ```
    public static int vkGetMemoryWin32HandleNV(VkDevice device, long memory, int handleType, MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryWin32HandleNV)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandleNV");
        try { return (int) Handles.MH_vkGetMemoryWin32HandleNV.invokeExact(device.capabilities().PFN_vkGetMemoryWin32HandleNV, device.segment(), memory, handleType, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandleNV", e); }
    }

}
