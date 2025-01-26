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
public class VKKHRExternalSemaphoreFd {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_FD_INFO_KHR = 1000079000;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR = 1000079001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkImportSemaphoreFdKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetSemaphoreFdKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkImportSemaphoreFdKHR;
        public final MemorySegment PFN_vkGetSemaphoreFdKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkImportSemaphoreFdKHR = func.invoke(device, "vkImportSemaphoreFdKHR");
            PFN_vkGetSemaphoreFdKHR = func.invoke(device, "vkGetSemaphoreFdKHR");
        }
    }

    public VKKHRExternalSemaphoreFd(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkImportSemaphoreFdKHR(VkDevice device, const VkImportSemaphoreFdInfoKHR* pImportSemaphoreFdInfo);
    /// ```
    public int ImportSemaphoreFdKHR(MemorySegment device, MemorySegment pImportSemaphoreFdInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkImportSemaphoreFdKHR)) throw new SymbolNotFoundError("Symbol not found: vkImportSemaphoreFdKHR");
        try { return (int) Handles.MH_vkImportSemaphoreFdKHR.invokeExact(handles.PFN_vkImportSemaphoreFdKHR, device, pImportSemaphoreFdInfo); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSemaphoreFdKHR", e); }
    }

    /// ```
    /// VkResult vkGetSemaphoreFdKHR(VkDevice device, const VkSemaphoreGetFdInfoKHR* pGetFdInfo, int* pFd);
    /// ```
    public int GetSemaphoreFdKHR(MemorySegment device, MemorySegment pGetFdInfo, MemorySegment pFd) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetSemaphoreFdKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSemaphoreFdKHR");
        try { return (int) Handles.MH_vkGetSemaphoreFdKHR.invokeExact(handles.PFN_vkGetSemaphoreFdKHR, device, pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in GetSemaphoreFdKHR", e); }
    }

}
