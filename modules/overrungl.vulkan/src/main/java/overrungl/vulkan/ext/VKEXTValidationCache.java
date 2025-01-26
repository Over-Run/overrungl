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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTValidationCache {
    public static final int VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = 1;
    public static final int VK_EXT_VALIDATION_CACHE_SPEC_VERSION = 1;
    public static final String VK_EXT_VALIDATION_CACHE_EXTENSION_NAME = "VK_EXT_validation_cache";
    public static final int VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160000;
    public static final int VK_STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT = 1000160001;
    public static final int VK_OBJECT_TYPE_VALIDATION_CACHE_EXT = 1000160000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateValidationCacheEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyValidationCacheEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkMergeValidationCachesEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetValidationCacheDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateValidationCacheEXT;
        public final MemorySegment PFN_vkDestroyValidationCacheEXT;
        public final MemorySegment PFN_vkMergeValidationCachesEXT;
        public final MemorySegment PFN_vkGetValidationCacheDataEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateValidationCacheEXT = func.invoke(device, "vkCreateValidationCacheEXT");
            PFN_vkDestroyValidationCacheEXT = func.invoke(device, "vkDestroyValidationCacheEXT");
            PFN_vkMergeValidationCachesEXT = func.invoke(device, "vkMergeValidationCachesEXT");
            PFN_vkGetValidationCacheDataEXT = func.invoke(device, "vkGetValidationCacheDataEXT");
        }
    }

    public VKEXTValidationCache(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateValidationCacheEXT(VkDevice device, const VkValidationCacheCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkValidationCacheEXT* pValidationCache);
    /// ```
    public int CreateValidationCacheEXT(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pValidationCache) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateValidationCacheEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateValidationCacheEXT");
        try { return (int) Handles.MH_vkCreateValidationCacheEXT.invokeExact(handles.PFN_vkCreateValidationCacheEXT, device, pCreateInfo, pAllocator, pValidationCache); }
        catch (Throwable e) { throw new RuntimeException("error in CreateValidationCacheEXT", e); }
    }

    /// ```
    /// void vkDestroyValidationCacheEXT(VkDevice device, VkValidationCacheEXT validationCache, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyValidationCacheEXT(MemorySegment device, long validationCache, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyValidationCacheEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyValidationCacheEXT");
        try { Handles.MH_vkDestroyValidationCacheEXT.invokeExact(handles.PFN_vkDestroyValidationCacheEXT, device, validationCache, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyValidationCacheEXT", e); }
    }

    /// ```
    /// VkResult vkMergeValidationCachesEXT(VkDevice device, VkValidationCacheEXT dstCache, uint32_t srcCacheCount, const VkValidationCacheEXT* pSrcCaches);
    /// ```
    public int MergeValidationCachesEXT(MemorySegment device, long dstCache, int srcCacheCount, MemorySegment pSrcCaches) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkMergeValidationCachesEXT)) throw new SymbolNotFoundError("Symbol not found: vkMergeValidationCachesEXT");
        try { return (int) Handles.MH_vkMergeValidationCachesEXT.invokeExact(handles.PFN_vkMergeValidationCachesEXT, device, dstCache, srcCacheCount, pSrcCaches); }
        catch (Throwable e) { throw new RuntimeException("error in MergeValidationCachesEXT", e); }
    }

    /// ```
    /// VkResult vkGetValidationCacheDataEXT(VkDevice device, VkValidationCacheEXT validationCache, size_t* pDataSize, void* pData);
    /// ```
    public int GetValidationCacheDataEXT(MemorySegment device, long validationCache, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetValidationCacheDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetValidationCacheDataEXT");
        try { return (int) Handles.MH_vkGetValidationCacheDataEXT.invokeExact(handles.PFN_vkGetValidationCacheDataEXT, device, validationCache, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetValidationCacheDataEXT", e); }
    }

}
