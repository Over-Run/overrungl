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
public class VKKHRExternalFenceFd {
    public static final int VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR = 1000115000;
    public static final int VK_STRUCTURE_TYPE_FENCE_GET_FD_INFO_KHR = 1000115001;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkImportFenceFdKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetFenceFdKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkImportFenceFdKHR,
            FD_vkGetFenceFdKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkImportFenceFdKHR = RuntimeHelper.downcall(Descriptors.FD_vkImportFenceFdKHR);
        public static final MethodHandle MH_vkGetFenceFdKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetFenceFdKHR);
        public final MemorySegment PFN_vkImportFenceFdKHR;
        public final MemorySegment PFN_vkGetFenceFdKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkImportFenceFdKHR = func.invoke(device, "vkImportFenceFdKHR");
            PFN_vkGetFenceFdKHR = func.invoke(device, "vkGetFenceFdKHR");
        }
    }

    public VKKHRExternalFenceFd(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int ImportFenceFdKHR(@CType("VkDevice") MemorySegment device, @CType("const VkImportFenceFdInfoKHR *") MemorySegment pImportFenceFdInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkImportFenceFdKHR)) throw new SymbolNotFoundError("Symbol not found: vkImportFenceFdKHR");
        try { return (int) Handles.MH_vkImportFenceFdKHR.invokeExact(handles.PFN_vkImportFenceFdKHR, device, pImportFenceFdInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkImportFenceFdKHR", e); }
    }

    public @CType("VkResult") int GetFenceFdKHR(@CType("VkDevice") MemorySegment device, @CType("const VkFenceGetFdInfoKHR *") MemorySegment pGetFdInfo, @CType("int *") MemorySegment pFd) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetFenceFdKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetFenceFdKHR");
        try { return (int) Handles.MH_vkGetFenceFdKHR.invokeExact(handles.PFN_vkGetFenceFdKHR, device, pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetFenceFdKHR", e); }
    }

}
