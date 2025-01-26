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
public class VKKHRGetMemoryRequirements2 {
    public static final int VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146001;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = 1000146002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR = 1000146003;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR = 1000146004;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetImageMemoryRequirements2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferMemoryRequirements2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSparseMemoryRequirements2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetImageMemoryRequirements2KHR;
        public final MemorySegment PFN_vkGetBufferMemoryRequirements2KHR;
        public final MemorySegment PFN_vkGetImageSparseMemoryRequirements2KHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetImageMemoryRequirements2KHR = func.invoke(device, "vkGetImageMemoryRequirements2KHR", "vkGetImageMemoryRequirements2");
            PFN_vkGetBufferMemoryRequirements2KHR = func.invoke(device, "vkGetBufferMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2");
            PFN_vkGetImageSparseMemoryRequirements2KHR = func.invoke(device, "vkGetImageSparseMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2");
        }
    }

    public VKKHRGetMemoryRequirements2(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// void vkGetImageMemoryRequirements2KHR(VkDevice device, const VkImageMemoryRequirementsInfo2* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public void GetImageMemoryRequirements2KHR(MemorySegment device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageMemoryRequirements2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements2KHR");
        try { Handles.MH_vkGetImageMemoryRequirements2KHR.invokeExact(handles.PFN_vkGetImageMemoryRequirements2KHR, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageMemoryRequirements2KHR", e); }
    }

    /// ```
    /// void vkGetBufferMemoryRequirements2KHR(VkDevice device, const VkBufferMemoryRequirementsInfo2* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public void GetBufferMemoryRequirements2KHR(MemorySegment device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetBufferMemoryRequirements2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements2KHR");
        try { Handles.MH_vkGetBufferMemoryRequirements2KHR.invokeExact(handles.PFN_vkGetBufferMemoryRequirements2KHR, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetBufferMemoryRequirements2KHR", e); }
    }

    /// ```
    /// void vkGetImageSparseMemoryRequirements2KHR(VkDevice device, const VkImageSparseMemoryRequirementsInfo2* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public void GetImageSparseMemoryRequirements2KHR(MemorySegment device, MemorySegment pInfo, MemorySegment pSparseMemoryRequirementCount, MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageSparseMemoryRequirements2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements2KHR");
        try { Handles.MH_vkGetImageSparseMemoryRequirements2KHR.invokeExact(handles.PFN_vkGetImageSparseMemoryRequirements2KHR, device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageSparseMemoryRequirements2KHR", e); }
    }

}
