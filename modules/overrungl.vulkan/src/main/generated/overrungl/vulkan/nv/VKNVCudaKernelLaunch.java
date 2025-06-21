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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVCudaKernelLaunch {
    public static final int VK_NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION = 2;
    public static final String VK_NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME = "VK_NV_cuda_kernel_launch";
    public static final int VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV = 1000307000;
    public static final int VK_STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV = 1000307001;
    public static final int VK_STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV = 1000307002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV = 1000307003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV = 1000307004;
    public static final int VK_OBJECT_TYPE_CUDA_MODULE_NV = 1000307000;
    public static final int VK_OBJECT_TYPE_CUDA_FUNCTION_NV = 1000307001;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT = 1000307000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT = 1000307001;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateCudaModuleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCudaModuleCacheNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCudaFunctionNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCudaModuleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCudaFunctionNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCudaLaunchKernelNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCudaKernelLaunch() {}

    /// ```
    /// (int) VkResult vkCreateCudaModuleNV((struct VkDevice*) VkDevice device, const VkCudaModuleCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCudaModuleNV* pModule);
    /// ```
    public static int vkCreateCudaModuleNV(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pModule) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCudaModuleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCudaModuleNV");
        try { return (int) Handles.MH_vkCreateCudaModuleNV.invokeExact(device.capabilities().PFN_vkCreateCudaModuleNV, device.segment(), pCreateInfo, pAllocator, pModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCudaModuleNV", e); }
    }

    /// ```
    /// (int) VkResult vkGetCudaModuleCacheNV((struct VkDevice*) VkDevice device, (uint64_t) VkCudaModuleNV module, size_t* pCacheSize, void* pCacheData);
    /// ```
    public static int vkGetCudaModuleCacheNV(VkDevice device, long module, MemorySegment pCacheSize, MemorySegment pCacheData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetCudaModuleCacheNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetCudaModuleCacheNV");
        try { return (int) Handles.MH_vkGetCudaModuleCacheNV.invokeExact(device.capabilities().PFN_vkGetCudaModuleCacheNV, device.segment(), module, pCacheSize, pCacheData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCudaModuleCacheNV", e); }
    }

    /// ```
    /// (int) VkResult vkCreateCudaFunctionNV((struct VkDevice*) VkDevice device, const VkCudaFunctionCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCudaFunctionNV* pFunction);
    /// ```
    public static int vkCreateCudaFunctionNV(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFunction) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCudaFunctionNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCudaFunctionNV");
        try { return (int) Handles.MH_vkCreateCudaFunctionNV.invokeExact(device.capabilities().PFN_vkCreateCudaFunctionNV, device.segment(), pCreateInfo, pAllocator, pFunction); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCudaFunctionNV", e); }
    }

    /// ```
    /// void vkDestroyCudaModuleNV((struct VkDevice*) VkDevice device, (uint64_t) VkCudaModuleNV module, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCudaModuleNV(VkDevice device, long module, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCudaModuleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCudaModuleNV");
        try { Handles.MH_vkDestroyCudaModuleNV.invokeExact(device.capabilities().PFN_vkDestroyCudaModuleNV, device.segment(), module, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCudaModuleNV", e); }
    }

    /// ```
    /// void vkDestroyCudaFunctionNV((struct VkDevice*) VkDevice device, (uint64_t) VkCudaFunctionNV function, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCudaFunctionNV(VkDevice device, long function, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCudaFunctionNV)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCudaFunctionNV");
        try { Handles.MH_vkDestroyCudaFunctionNV.invokeExact(device.capabilities().PFN_vkDestroyCudaFunctionNV, device.segment(), function, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCudaFunctionNV", e); }
    }

    /// ```
    /// void vkCmdCudaLaunchKernelNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCudaLaunchInfoNV* pLaunchInfo);
    /// ```
    public static void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, MemorySegment pLaunchInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCudaLaunchKernelNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCudaLaunchKernelNV");
        try { Handles.MH_vkCmdCudaLaunchKernelNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdCudaLaunchKernelNV, commandBuffer.segment(), pLaunchInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCudaLaunchKernelNV", e); }
    }

}
