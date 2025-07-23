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
public final class VKKHRPipelineBinary {
    public static final int VK_KHR_PIPELINE_BINARY_SPEC_VERSION = 1;
    public static final String VK_KHR_PIPELINE_BINARY_EXTENSION_NAME = "VK_KHR_pipeline_binary";
    public static final int VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR = 32;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_FEATURES_KHR = 1000483000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR = 1000483001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR = 1000483002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR = 1000483003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_BINARY_PROPERTIES_KHR = 1000483004;
    public static final int VK_STRUCTURE_TYPE_RELEASE_CAPTURED_PIPELINE_DATA_INFO_KHR = 1000483005;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR = 1000483006;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_CREATE_INFO_KHR = 1000483007;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PIPELINE_BINARY_INTERNAL_CACHE_CONTROL_KHR = 1000483008;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR = 1000483009;
    public static final int VK_OBJECT_TYPE_PIPELINE_BINARY_KHR = 1000483000;
    public static final int VK_PIPELINE_BINARY_MISSING_KHR = 1000483000;
    public static final int VK_ERROR_NOT_ENOUGH_SPACE_KHR = -1000483000;
    public static final long VK_PIPELINE_CREATE_2_CAPTURE_DATA_BIT_KHR = 0x80000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkCreatePipelineBinariesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPipelineBinaryKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineKeyKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineBinaryDataKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkReleaseCapturedPipelineDataKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRPipelineBinary() {}

    /// ```
    /// (int) VkResult vkCreatePipelineBinariesKHR((struct VkDevice*) VkDevice device, const VkPipelineBinaryCreateInfoKHR* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPipelineBinaryHandlesInfoKHR* pBinaries);
    /// ```
    public static int vkCreatePipelineBinariesKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pBinaries) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePipelineBinariesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreatePipelineBinariesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreatePipelineBinariesKHR", device, pCreateInfo, pAllocator, pBinaries); }
        return (int) Handles.MH_vkCreatePipelineBinariesKHR.invokeExact(device.capabilities().PFN_vkCreatePipelineBinariesKHR, device.segment(), pCreateInfo, pAllocator, pBinaries); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineBinariesKHR", e); }
    }

    /// ```
    /// void vkDestroyPipelineBinaryKHR((struct VkDevice*) VkDevice device, (uint64_t) VkPipelineBinaryKHR pipelineBinary, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPipelineBinaryKHR(VkDevice device, long pipelineBinary, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPipelineBinaryKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPipelineBinaryKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyPipelineBinaryKHR", device, pipelineBinary, pAllocator); }
        Handles.MH_vkDestroyPipelineBinaryKHR.invokeExact(device.capabilities().PFN_vkDestroyPipelineBinaryKHR, device.segment(), pipelineBinary, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineBinaryKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPipelineKeyKHR((struct VkDevice*) VkDevice device, const VkPipelineCreateInfoKHR* pPipelineCreateInfo, VkPipelineBinaryKeyKHR* pPipelineKey);
    /// ```
    public static int vkGetPipelineKeyKHR(VkDevice device, MemorySegment pPipelineCreateInfo, MemorySegment pPipelineKey) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineKeyKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineKeyKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineKeyKHR", device, pPipelineCreateInfo, pPipelineKey); }
        return (int) Handles.MH_vkGetPipelineKeyKHR.invokeExact(device.capabilities().PFN_vkGetPipelineKeyKHR, device.segment(), pPipelineCreateInfo, pPipelineKey); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineKeyKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPipelineBinaryDataKHR((struct VkDevice*) VkDevice device, const VkPipelineBinaryDataInfoKHR* pInfo, VkPipelineBinaryKeyKHR* pPipelineBinaryKey, size_t* pPipelineBinaryDataSize, void* pPipelineBinaryData);
    /// ```
    public static int vkGetPipelineBinaryDataKHR(VkDevice device, MemorySegment pInfo, MemorySegment pPipelineBinaryKey, MemorySegment pPipelineBinaryDataSize, MemorySegment pPipelineBinaryData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineBinaryDataKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPipelineBinaryDataKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPipelineBinaryDataKHR", device, pInfo, pPipelineBinaryKey, pPipelineBinaryDataSize, pPipelineBinaryData); }
        return (int) Handles.MH_vkGetPipelineBinaryDataKHR.invokeExact(device.capabilities().PFN_vkGetPipelineBinaryDataKHR, device.segment(), pInfo, pPipelineBinaryKey, pPipelineBinaryDataSize, pPipelineBinaryData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineBinaryDataKHR", e); }
    }

    /// ```
    /// (int) VkResult vkReleaseCapturedPipelineDataKHR((struct VkDevice*) VkDevice device, const VkReleaseCapturedPipelineDataInfoKHR* pInfo, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static int vkReleaseCapturedPipelineDataKHR(VkDevice device, MemorySegment pInfo, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkReleaseCapturedPipelineDataKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkReleaseCapturedPipelineDataKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkReleaseCapturedPipelineDataKHR", device, pInfo, pAllocator); }
        return (int) Handles.MH_vkReleaseCapturedPipelineDataKHR.invokeExact(device.capabilities().PFN_vkReleaseCapturedPipelineDataKHR, device.segment(), pInfo, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseCapturedPipelineDataKHR", e); }
    }

}
