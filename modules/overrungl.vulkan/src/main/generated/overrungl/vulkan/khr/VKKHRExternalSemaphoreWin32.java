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
public final class VKKHRExternalSemaphoreWin32 {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHR_external_semaphore_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078001;
    public static final int VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR = 1000078002;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR = 1000078003;
    public static final class Handles {
        public static final MethodHandle MH_vkImportSemaphoreWin32HandleKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSemaphoreWin32HandleKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRExternalSemaphoreWin32() {}

    /// ```
    /// (int) VkResult vkImportSemaphoreWin32HandleKHR((struct VkDevice*) VkDevice device, const VkImportSemaphoreWin32HandleInfoKHR* pImportSemaphoreWin32HandleInfo);
    /// ```
    public static int vkImportSemaphoreWin32HandleKHR(VkDevice device, MemorySegment pImportSemaphoreWin32HandleInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportSemaphoreWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkImportSemaphoreWin32HandleKHR");
        try { return (int) Handles.MH_vkImportSemaphoreWin32HandleKHR.invokeExact(device.capabilities().PFN_vkImportSemaphoreWin32HandleKHR, device.segment(), pImportSemaphoreWin32HandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportSemaphoreWin32HandleKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetSemaphoreWin32HandleKHR((struct VkDevice*) VkDevice device, const VkSemaphoreGetWin32HandleInfoKHR* pGetWin32HandleInfo, HANDLE* pHandle);
    /// ```
    public static int vkGetSemaphoreWin32HandleKHR(VkDevice device, MemorySegment pGetWin32HandleInfo, MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetSemaphoreWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetSemaphoreWin32HandleKHR");
        try { return (int) Handles.MH_vkGetSemaphoreWin32HandleKHR.invokeExact(device.capabilities().PFN_vkGetSemaphoreWin32HandleKHR, device.segment(), pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreWin32HandleKHR", e); }
    }

}
