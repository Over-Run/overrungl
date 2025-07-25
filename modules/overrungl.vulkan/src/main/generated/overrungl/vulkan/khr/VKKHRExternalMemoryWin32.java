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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRExternalMemoryWin32 {
    public static final int VK_KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME = "VK_KHR_external_memory_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR = 1000073001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_WIN32_HANDLE_PROPERTIES_KHR = 1000073002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_WIN32_HANDLE_INFO_KHR = 1000073003;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryWin32HandleKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryWin32HandlePropertiesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRExternalMemoryWin32() {}

    /// ```
    /// (int) VkResult vkGetMemoryWin32HandleKHR((struct VkDevice*) VkDevice device, const VkMemoryGetWin32HandleInfoKHR* pGetWin32HandleInfo, HANDLE* pHandle);
    /// ```
    public static int vkGetMemoryWin32HandleKHR(VkDevice device, MemorySegment pGetWin32HandleInfo, MemorySegment pHandle) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryWin32HandleKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandleKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryWin32HandleKHR", device, pGetWin32HandleInfo, pHandle); }
        return (int) Handles.MH_vkGetMemoryWin32HandleKHR.invokeExact(device.capabilities().PFN_vkGetMemoryWin32HandleKHR, device.segment(), pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandleKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetMemoryWin32HandlePropertiesKHR((struct VkDevice*) VkDevice device, (int) VkExternalMemoryHandleTypeFlagBits handleType, (void*) HANDLE handle, VkMemoryWin32HandlePropertiesKHR* pMemoryWin32HandleProperties);
    /// ```
    public static int vkGetMemoryWin32HandlePropertiesKHR(VkDevice device, int handleType, MemorySegment handle, MemorySegment pMemoryWin32HandleProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryWin32HandlePropertiesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryWin32HandlePropertiesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryWin32HandlePropertiesKHR", device, handleType, handle, pMemoryWin32HandleProperties); }
        return (int) Handles.MH_vkGetMemoryWin32HandlePropertiesKHR.invokeExact(device.capabilities().PFN_vkGetMemoryWin32HandlePropertiesKHR, device.segment(), handleType, handle, pMemoryWin32HandleProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryWin32HandlePropertiesKHR", e); }
    }

}
