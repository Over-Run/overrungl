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
public class VKKHRExternalFenceWin32 {
    public static final int VK_KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME = "VK_KHR_external_fence_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114001;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR = 1000114002;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkImportFenceWin32HandleKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetFenceWin32HandleKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkImportFenceWin32HandleKHR = RuntimeHelper.downcall(Descriptors.FD_vkImportFenceWin32HandleKHR);
        public static final MethodHandle MH_vkGetFenceWin32HandleKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetFenceWin32HandleKHR);
        public final MemorySegment PFN_vkImportFenceWin32HandleKHR;
        public final MemorySegment PFN_vkGetFenceWin32HandleKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkImportFenceWin32HandleKHR = func.invoke(device, "vkImportFenceWin32HandleKHR");
            PFN_vkGetFenceWin32HandleKHR = func.invoke(device, "vkGetFenceWin32HandleKHR");
        }
    }

    public VKKHRExternalFenceWin32(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int ImportFenceWin32HandleKHR(@CType("VkDevice") MemorySegment device, @CType("const VkImportFenceWin32HandleInfoKHR *") MemorySegment pImportFenceWin32HandleInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkImportFenceWin32HandleKHR)) throw new SymbolNotFoundError("Symbol not found: vkImportFenceWin32HandleKHR");
        try { return (int) Handles.MH_vkImportFenceWin32HandleKHR.invokeExact(handles.PFN_vkImportFenceWin32HandleKHR, device, pImportFenceWin32HandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportFenceWin32HandleKHR", e); }
    }

    public @CType("VkResult") int GetFenceWin32HandleKHR(@CType("VkDevice") MemorySegment device, @CType("const VkFenceGetWin32HandleInfoKHR *") MemorySegment pGetWin32HandleInfo, @CType("HANDLE *") MemorySegment pHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetFenceWin32HandleKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceWin32HandleKHR");
        try { return (int) Handles.MH_vkGetFenceWin32HandleKHR.invokeExact(handles.PFN_vkGetFenceWin32HandleKHR, device, pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceWin32HandleKHR", e); }
    }

}
