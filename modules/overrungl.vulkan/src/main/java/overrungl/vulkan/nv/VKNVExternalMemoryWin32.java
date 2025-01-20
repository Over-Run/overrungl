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
public class VKNVExternalMemoryWin32 {
    public static final int VK_NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_NV_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV = 1000057001;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetMemoryWin32HandleNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryWin32HandleNV = RuntimeHelper.downcall(Descriptors.FD_vkGetMemoryWin32HandleNV);
        public final MemorySegment PFN_vkGetMemoryWin32HandleNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetMemoryWin32HandleNV = func.invoke(device, "vkGetMemoryWin32HandleNV");
        }
    }

    public VKNVExternalMemoryWin32(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetMemoryWin32HandleNV(@CType("VkDevice") MemorySegment device, @CType("VkDeviceMemory") MemorySegment memory, @CType("VkExternalMemoryHandleTypeFlagsNV") int handleType, @CType("HANDLE *") MemorySegment pHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetMemoryWin32HandleNV)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandleNV");
        try { return (int) Handles.MH_vkGetMemoryWin32HandleNV.invokeExact(handles.PFN_vkGetMemoryWin32HandleNV, device, memory, handleType, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandleNV", e); }
    }

}
