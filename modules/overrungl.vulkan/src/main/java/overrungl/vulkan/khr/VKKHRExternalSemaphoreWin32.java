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
import java.util.*;
public class VKKHRExternalSemaphoreWin32 {
    public static final int VK_KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME = "VK_KHR_external_semaphore_win32";
    public static final int VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078000;
    public static final int VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR = 1000078001;
    public static final int VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR = 1000078002;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_GET_WIN32_HANDLE_INFO_KHR = 1000078003;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkImportSemaphoreWin32HandleKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetSemaphoreWin32HandleKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkImportSemaphoreWin32HandleKHR,
            FD_vkGetSemaphoreWin32HandleKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkImportSemaphoreWin32HandleKHR = RuntimeHelper.downcall(Descriptors.FD_vkImportSemaphoreWin32HandleKHR);
        public static final MethodHandle MH_vkGetSemaphoreWin32HandleKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetSemaphoreWin32HandleKHR);
        public final MemorySegment PFN_vkImportSemaphoreWin32HandleKHR;
        public final MemorySegment PFN_vkGetSemaphoreWin32HandleKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkImportSemaphoreWin32HandleKHR = func.invoke(device, "vkImportSemaphoreWin32HandleKHR");
            PFN_vkGetSemaphoreWin32HandleKHR = func.invoke(device, "vkGetSemaphoreWin32HandleKHR");
        }
    }

    public VKKHRExternalSemaphoreWin32(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int ImportSemaphoreWin32HandleKHR(@CType("VkDevice") MemorySegment device, @CType("const VkImportSemaphoreWin32HandleInfoKHR *") MemorySegment pImportSemaphoreWin32HandleInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkImportSemaphoreWin32HandleKHR)) throw new SymbolNotFoundError("Symbol not found: vkImportSemaphoreWin32HandleKHR");
        try { return (int) Handles.MH_vkImportSemaphoreWin32HandleKHR.invokeExact(handles.PFN_vkImportSemaphoreWin32HandleKHR, device, pImportSemaphoreWin32HandleInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportSemaphoreWin32HandleKHR", e); }
    }

    public @CType("VkResult") int GetSemaphoreWin32HandleKHR(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreGetWin32HandleInfoKHR *") MemorySegment pGetWin32HandleInfo, @CType("HANDLE *") MemorySegment pHandle) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetSemaphoreWin32HandleKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSemaphoreWin32HandleKHR");
        try { return (int) Handles.MH_vkGetSemaphoreWin32HandleKHR.invokeExact(handles.PFN_vkGetSemaphoreWin32HandleKHR, device, pGetWin32HandleInfo, pHandle); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreWin32HandleKHR", e); }
    }

}
