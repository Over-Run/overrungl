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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTValidationCache {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;
    public static final int VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";
    public static final int VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160000;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160001;
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateValidationCacheEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyValidationCacheEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkMergeValidationCachesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetValidationCacheDataEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTValidationCache() {}

    /// ```
    /// (int) VkResult vkCreateValidationCacheEXT((struct VkDevice*) VkDevice device, const VkValidationCacheCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkValidationCacheEXT* pValidationCache);
    /// ```
    public static int vkCreateValidationCacheEXT(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pValidationCache) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateValidationCacheEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateValidationCacheEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateValidationCacheEXT", device, pCreateInfo, pAllocator, pValidationCache); }
        return (int) Handles.MH_vkCreateValidationCacheEXT.invokeExact(device.capabilities().PFN_vkCreateValidationCacheEXT, device.segment(), pCreateInfo, pAllocator, pValidationCache); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateValidationCacheEXT", e); }
    }

    /// ```
    /// void vkDestroyValidationCacheEXT((struct VkDevice*) VkDevice device, (uint64_t) VkValidationCacheEXT validationCache, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyValidationCacheEXT(VkDevice device, long validationCache, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyValidationCacheEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyValidationCacheEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyValidationCacheEXT", device, validationCache, pAllocator); }
        Handles.MH_vkDestroyValidationCacheEXT.invokeExact(device.capabilities().PFN_vkDestroyValidationCacheEXT, device.segment(), validationCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyValidationCacheEXT", e); }
    }

    /// ```
    /// (int) VkResult vkMergeValidationCachesEXT((struct VkDevice*) VkDevice device, (uint64_t) VkValidationCacheEXT dstCache, uint32_t srcCacheCount, const VkValidationCacheEXT* pSrcCaches);
    /// ```
    public static int vkMergeValidationCachesEXT(VkDevice device, long dstCache, int srcCacheCount, MemorySegment pSrcCaches) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkMergeValidationCachesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkMergeValidationCachesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkMergeValidationCachesEXT", device, dstCache, srcCacheCount, pSrcCaches); }
        return (int) Handles.MH_vkMergeValidationCachesEXT.invokeExact(device.capabilities().PFN_vkMergeValidationCachesEXT, device.segment(), dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in vkMergeValidationCachesEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetValidationCacheDataEXT((struct VkDevice*) VkDevice device, (uint64_t) VkValidationCacheEXT validationCache, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetValidationCacheDataEXT(VkDevice device, long validationCache, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetValidationCacheDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetValidationCacheDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetValidationCacheDataEXT", device, validationCache, pDataSize, pData); }
        return (int) Handles.MH_vkGetValidationCacheDataEXT.invokeExact(device.capabilities().PFN_vkGetValidationCacheDataEXT, device.segment(), validationCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetValidationCacheDataEXT", e); }
    }

}
