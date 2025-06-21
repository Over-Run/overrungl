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
public final class VKKHRExternalFenceFd {
    public static final int VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = 1000115000;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR = 1000115001;
    public static final class Handles {
        public static final MethodHandle MH_vkImportFenceFdKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetFenceFdKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRExternalFenceFd() {}

    /// ```
    /// (int) VkResult vkImportFenceFdKHR((struct VkDevice*) VkDevice device, const VkImportFenceFdInfoKHR* pImportFenceFdInfo);
    /// ```
    public static int vkImportFenceFdKHR(VkDevice device, MemorySegment pImportFenceFdInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkImportFenceFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkImportFenceFdKHR");
        try { return (int) Handles.MH_vkImportFenceFdKHR.invokeExact(device.capabilities().PFN_vkImportFenceFdKHR, device.segment(), pImportFenceFdInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportFenceFdKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetFenceFdKHR((struct VkDevice*) VkDevice device, const VkFenceGetFdInfoKHR* pGetFdInfo, int* pFd);
    /// ```
    public static int vkGetFenceFdKHR(VkDevice device, MemorySegment pGetFdInfo, MemorySegment pFd) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetFenceFdKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetFenceFdKHR");
        try { return (int) Handles.MH_vkGetFenceFdKHR.invokeExact(device.capabilities().PFN_vkGetFenceFdKHR, device.segment(), pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceFdKHR", e); }
    }

}
