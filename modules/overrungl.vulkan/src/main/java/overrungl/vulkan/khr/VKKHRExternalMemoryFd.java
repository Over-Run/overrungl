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
public class VKKHRExternalMemoryFd {
    public static final int VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION = 1;
    public static final String VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME = "VK_KHR_external_memory_fd";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_FD_INFO_KHR = 1000074000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_FD_PROPERTIES_KHR = 1000074001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR = 1000074002;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryFdKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetMemoryFdPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetMemoryFdKHR;
        public final MemorySegment PFN_vkGetMemoryFdPropertiesKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetMemoryFdKHR = func.invoke(device, "vkGetMemoryFdKHR");
            PFN_vkGetMemoryFdPropertiesKHR = func.invoke(device, "vkGetMemoryFdPropertiesKHR");
        }
    }

    public VKKHRExternalMemoryFd(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetMemoryFdKHR(VkDevice device, const VkMemoryGetFdInfoKHR* pGetFdInfo, int* pFd);
    /// ```
    public int GetMemoryFdKHR(MemorySegment device, MemorySegment pGetFdInfo, MemorySegment pFd) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMemoryFdKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryFdKHR");
        try { return (int) Handles.MH_vkGetMemoryFdKHR.invokeExact(handles.PFN_vkGetMemoryFdKHR, device, pGetFdInfo, pFd); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryFdKHR", e); }
    }

    /// ```
    /// VkResult vkGetMemoryFdPropertiesKHR(VkDevice device, VkExternalMemoryHandleTypeFlagBits handleType, int fd, VkMemoryFdPropertiesKHR* pMemoryFdProperties);
    /// ```
    public int GetMemoryFdPropertiesKHR(MemorySegment device, int handleType, int fd, MemorySegment pMemoryFdProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetMemoryFdPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetMemoryFdPropertiesKHR");
        try { return (int) Handles.MH_vkGetMemoryFdPropertiesKHR.invokeExact(handles.PFN_vkGetMemoryFdPropertiesKHR, device, handleType, fd, pMemoryFdProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetMemoryFdPropertiesKHR", e); }
    }

}
