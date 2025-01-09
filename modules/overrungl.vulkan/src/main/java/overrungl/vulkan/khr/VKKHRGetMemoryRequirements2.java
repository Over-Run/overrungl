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
import static overrungl.vulkan.VK11.*;
public class VKKHRGetMemoryRequirements2 {
    public static final int VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION = 1;
    public static final String VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";
    public static final int VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2_KHR = VK_STRUCTURE_TYPE_BUFFER_MEMORY_REQUIREMENTS_INFO_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2_KHR = VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2;
    public static final int VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2_KHR = VK_STRUCTURE_TYPE_IMAGE_SPARSE_MEMORY_REQUIREMENTS_INFO_2;
    public static final int VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2_KHR = VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2;
    public static final int VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2_KHR = VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2;
    public static final MethodHandle MH_vkGetImageMemoryRequirements2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetBufferMemoryRequirements2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetImageSparseMemoryRequirements2KHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetImageMemoryRequirements2KHR;
    public final MemorySegment PFN_vkGetBufferMemoryRequirements2KHR;
    public final MemorySegment PFN_vkGetImageSparseMemoryRequirements2KHR;

    public VKKHRGetMemoryRequirements2(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetImageMemoryRequirements2KHR = func.invoke(device, "vkGetImageMemoryRequirements2KHR", "vkGetImageMemoryRequirements2");
        PFN_vkGetBufferMemoryRequirements2KHR = func.invoke(device, "vkGetBufferMemoryRequirements2KHR", "vkGetBufferMemoryRequirements2");
        PFN_vkGetImageSparseMemoryRequirements2KHR = func.invoke(device, "vkGetImageSparseMemoryRequirements2KHR", "vkGetImageSparseMemoryRequirements2");
    }

    public void GetImageMemoryRequirements2KHR(@CType("VkDevice") MemorySegment device, @CType("const VkImageMemoryRequirementsInfo2 *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetImageMemoryRequirements2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetImageMemoryRequirements2KHR");
        try { MH_vkGetImageMemoryRequirements2KHR.invokeExact(PFN_vkGetImageMemoryRequirements2KHR, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageMemoryRequirements2KHR", e); }
    }

    public void GetBufferMemoryRequirements2KHR(@CType("VkDevice") MemorySegment device, @CType("const VkBufferMemoryRequirementsInfo2 *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetBufferMemoryRequirements2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferMemoryRequirements2KHR");
        try { MH_vkGetBufferMemoryRequirements2KHR.invokeExact(PFN_vkGetBufferMemoryRequirements2KHR, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferMemoryRequirements2KHR", e); }
    }

    public void GetImageSparseMemoryRequirements2KHR(@CType("VkDevice") MemorySegment device, @CType("const VkImageSparseMemoryRequirementsInfo2 *") MemorySegment pInfo, @CType("uint32_t *") MemorySegment pSparseMemoryRequirementCount, @CType("VkSparseImageMemoryRequirements2 *") MemorySegment pSparseMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetImageSparseMemoryRequirements2KHR)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSparseMemoryRequirements2KHR");
        try { MH_vkGetImageSparseMemoryRequirements2KHR.invokeExact(PFN_vkGetImageSparseMemoryRequirements2KHR, device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSparseMemoryRequirements2KHR", e); }
    }

}
