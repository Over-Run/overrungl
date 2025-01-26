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
public final class VKKHRExternalFenceWin32 {
    public static final int VK_KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME = "VK_KHR_external_fence_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_FENCE_WIN32_HANDLE_INFO_KHR = 1000114001;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_WIN32_HANDLE_INFO_KHR = 1000114002;
    public static final class Handles {
        public static final MethodHandle MH_vkImportFenceWin32HandleKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetFenceWin32HandleKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRExternalFenceWin32() {}

    /// ```
    /// (int) VkResult vkImportFenceWin32HandleKHR((struct VkDevice*) VkDevice device, const VkImportFenceWin32HandleInfoKHR* pImportFenceWin32HandleInfo);
    /// ```
    public static int vkImportFenceWin32HandleKHR(VkDevice device, MemorySegment pImportFenceWin32HandleInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportFenceWin32HandleKHR)) throw new SymbolNotFoundError("Symbol not found: vkImportFenceWin32HandleKHR");
        try { return (int) Handles.MH_vkImportFenceWin32HandleKHR.invokeExact(device.capabilities().PFN_vkImportFenceWin32HandleKHR, device.segment(), pImportFenceWin32HandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportFenceWin32HandleKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetFenceWin32HandleKHR((struct VkDevice*) VkDevice device, const VkFenceGetWin32HandleInfoKHR* pGetWin32HandleInfo, HANDLE* pHandle);
    /// ```
    public static int vkGetFenceWin32HandleKHR(VkDevice device, MemorySegment pGetWin32HandleInfo, MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFenceWin32HandleKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceWin32HandleKHR");
        try { return (int) Handles.MH_vkGetFenceWin32HandleKHR.invokeExact(device.capabilities().PFN_vkGetFenceWin32HandleKHR, device.segment(), pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceWin32HandleKHR", e); }
    }

}
