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
public class VKKHRPipelineBinary {
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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreatePipelineBinariesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyPipelineBinaryKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPipelineKeyKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPipelineBinaryDataKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkReleaseCapturedPipelineDataKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreatePipelineBinariesKHR = RuntimeHelper.downcall(Descriptors.FD_vkCreatePipelineBinariesKHR);
        public static final MethodHandle MH_vkDestroyPipelineBinaryKHR = RuntimeHelper.downcall(Descriptors.FD_vkDestroyPipelineBinaryKHR);
        public static final MethodHandle MH_vkGetPipelineKeyKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineKeyKHR);
        public static final MethodHandle MH_vkGetPipelineBinaryDataKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineBinaryDataKHR);
        public static final MethodHandle MH_vkReleaseCapturedPipelineDataKHR = RuntimeHelper.downcall(Descriptors.FD_vkReleaseCapturedPipelineDataKHR);
        public final MemorySegment PFN_vkCreatePipelineBinariesKHR;
        public final MemorySegment PFN_vkDestroyPipelineBinaryKHR;
        public final MemorySegment PFN_vkGetPipelineKeyKHR;
        public final MemorySegment PFN_vkGetPipelineBinaryDataKHR;
        public final MemorySegment PFN_vkReleaseCapturedPipelineDataKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCreatePipelineBinariesKHR = func.invoke(device, "vkCreatePipelineBinariesKHR");
            PFN_vkDestroyPipelineBinaryKHR = func.invoke(device, "vkDestroyPipelineBinaryKHR");
            PFN_vkGetPipelineKeyKHR = func.invoke(device, "vkGetPipelineKeyKHR");
            PFN_vkGetPipelineBinaryDataKHR = func.invoke(device, "vkGetPipelineBinaryDataKHR");
            PFN_vkReleaseCapturedPipelineDataKHR = func.invoke(device, "vkReleaseCapturedPipelineDataKHR");
        }
    }

    public VKKHRPipelineBinary(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreatePipelineBinariesKHR(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineBinaryCreateInfoKHR *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPipelineBinaryHandlesInfoKHR *") MemorySegment pBinaries) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreatePipelineBinariesKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreatePipelineBinariesKHR");
        try { return (int) Handles.MH_vkCreatePipelineBinariesKHR.invokeExact(handles.PFN_vkCreatePipelineBinariesKHR, device, pCreateInfo, pAllocator, pBinaries); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePipelineBinariesKHR", e); }
    }

    public void DestroyPipelineBinaryKHR(@CType("VkDevice") MemorySegment device, @CType("VkPipelineBinaryKHR") MemorySegment pipelineBinary, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyPipelineBinaryKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPipelineBinaryKHR");
        try { Handles.MH_vkDestroyPipelineBinaryKHR.invokeExact(handles.PFN_vkDestroyPipelineBinaryKHR, device, pipelineBinary, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPipelineBinaryKHR", e); }
    }

    public @CType("VkResult") int GetPipelineKeyKHR(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineCreateInfoKHR *") MemorySegment pPipelineCreateInfo, @CType("VkPipelineBinaryKeyKHR *") MemorySegment pPipelineKey) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineKeyKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineKeyKHR");
        try { return (int) Handles.MH_vkGetPipelineKeyKHR.invokeExact(handles.PFN_vkGetPipelineKeyKHR, device, pPipelineCreateInfo, pPipelineKey); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineKeyKHR", e); }
    }

    public @CType("VkResult") int GetPipelineBinaryDataKHR(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineBinaryDataInfoKHR *") MemorySegment pInfo, @CType("VkPipelineBinaryKeyKHR *") MemorySegment pPipelineBinaryKey, @CType("size_t *") MemorySegment pPipelineBinaryDataSize, @CType("void *") MemorySegment pPipelineBinaryData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineBinaryDataKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineBinaryDataKHR");
        try { return (int) Handles.MH_vkGetPipelineBinaryDataKHR.invokeExact(handles.PFN_vkGetPipelineBinaryDataKHR, device, pInfo, pPipelineBinaryKey, pPipelineBinaryDataSize, pPipelineBinaryData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineBinaryDataKHR", e); }
    }

    public @CType("VkResult") int ReleaseCapturedPipelineDataKHR(@CType("VkDevice") MemorySegment device, @CType("const VkReleaseCapturedPipelineDataInfoKHR *") MemorySegment pInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkReleaseCapturedPipelineDataKHR)) throw new SymbolNotFoundError("Symbol not found: vkReleaseCapturedPipelineDataKHR");
        try { return (int) Handles.MH_vkReleaseCapturedPipelineDataKHR.invokeExact(handles.PFN_vkReleaseCapturedPipelineDataKHR, device, pInfo, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseCapturedPipelineDataKHR", e); }
    }

}
