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
public class VKNVCudaKernelLaunch {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateCudaModuleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCudaModuleCacheNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCudaFunctionNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCudaModuleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCudaFunctionNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCudaLaunchKernelNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateCudaModuleNV;
        public final MemorySegment PFN_vkGetCudaModuleCacheNV;
        public final MemorySegment PFN_vkCreateCudaFunctionNV;
        public final MemorySegment PFN_vkDestroyCudaModuleNV;
        public final MemorySegment PFN_vkDestroyCudaFunctionNV;
        public final MemorySegment PFN_vkCmdCudaLaunchKernelNV;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateCudaModuleNV = func.invoke(device, "vkCreateCudaModuleNV");
            PFN_vkGetCudaModuleCacheNV = func.invoke(device, "vkGetCudaModuleCacheNV");
            PFN_vkCreateCudaFunctionNV = func.invoke(device, "vkCreateCudaFunctionNV");
            PFN_vkDestroyCudaModuleNV = func.invoke(device, "vkDestroyCudaModuleNV");
            PFN_vkDestroyCudaFunctionNV = func.invoke(device, "vkDestroyCudaFunctionNV");
            PFN_vkCmdCudaLaunchKernelNV = func.invoke(device, "vkCmdCudaLaunchKernelNV");
        }
    }

    public VKNVCudaKernelLaunch(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateCudaModuleNV(VkDevice device, const VkCudaModuleCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCudaModuleNV* pModule);
    /// ```
    public int CreateCudaModuleNV(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pModule) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateCudaModuleNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateCudaModuleNV");
        try { return (int) Handles.MH_vkCreateCudaModuleNV.invokeExact(handles.PFN_vkCreateCudaModuleNV, device, pCreateInfo, pAllocator, pModule); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCudaModuleNV", e); }
    }

    /// ```
    /// VkResult vkGetCudaModuleCacheNV(VkDevice device, VkCudaModuleNV module, size_t* pCacheSize, void* pCacheData);
    /// ```
    public int GetCudaModuleCacheNV(MemorySegment device, long module, MemorySegment pCacheSize, MemorySegment pCacheData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetCudaModuleCacheNV)) throw new SymbolNotFoundError("Symbol not found: vkGetCudaModuleCacheNV");
        try { return (int) Handles.MH_vkGetCudaModuleCacheNV.invokeExact(handles.PFN_vkGetCudaModuleCacheNV, device, module, pCacheSize, pCacheData); }
        catch (Throwable e) { throw new RuntimeException("error in GetCudaModuleCacheNV", e); }
    }

    /// ```
    /// VkResult vkCreateCudaFunctionNV(VkDevice device, const VkCudaFunctionCreateInfoNV* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCudaFunctionNV* pFunction);
    /// ```
    public int CreateCudaFunctionNV(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFunction) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateCudaFunctionNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateCudaFunctionNV");
        try { return (int) Handles.MH_vkCreateCudaFunctionNV.invokeExact(handles.PFN_vkCreateCudaFunctionNV, device, pCreateInfo, pAllocator, pFunction); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCudaFunctionNV", e); }
    }

    /// ```
    /// void vkDestroyCudaModuleNV(VkDevice device, VkCudaModuleNV module, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyCudaModuleNV(MemorySegment device, long module, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyCudaModuleNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCudaModuleNV");
        try { Handles.MH_vkDestroyCudaModuleNV.invokeExact(handles.PFN_vkDestroyCudaModuleNV, device, module, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyCudaModuleNV", e); }
    }

    /// ```
    /// void vkDestroyCudaFunctionNV(VkDevice device, VkCudaFunctionNV function, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyCudaFunctionNV(MemorySegment device, long function, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyCudaFunctionNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCudaFunctionNV");
        try { Handles.MH_vkDestroyCudaFunctionNV.invokeExact(handles.PFN_vkDestroyCudaFunctionNV, device, function, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyCudaFunctionNV", e); }
    }

    /// ```
    /// void vkCmdCudaLaunchKernelNV(VkCommandBuffer commandBuffer, const VkCudaLaunchInfoNV* pLaunchInfo);
    /// ```
    public void CmdCudaLaunchKernelNV(MemorySegment commandBuffer, MemorySegment pLaunchInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCudaLaunchKernelNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdCudaLaunchKernelNV");
        try { Handles.MH_vkCmdCudaLaunchKernelNV.invokeExact(handles.PFN_vkCmdCudaLaunchKernelNV, commandBuffer, pLaunchInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCudaLaunchKernelNV", e); }
    }

}
