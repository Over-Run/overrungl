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
import overrungl.annotation.*;
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
    public static final MethodHandle MH_vkCreateCudaModuleNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetCudaModuleCacheNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateCudaFunctionNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyCudaModuleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyCudaFunctionNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdCudaLaunchKernelNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreateCudaModuleNV;
    public final MemorySegment PFN_vkGetCudaModuleCacheNV;
    public final MemorySegment PFN_vkCreateCudaFunctionNV;
    public final MemorySegment PFN_vkDestroyCudaModuleNV;
    public final MemorySegment PFN_vkDestroyCudaFunctionNV;
    public final MemorySegment PFN_vkCmdCudaLaunchKernelNV;

    public VKNVCudaKernelLaunch(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCreateCudaModuleNV = func.invoke(device, "vkCreateCudaModuleNV");
        PFN_vkGetCudaModuleCacheNV = func.invoke(device, "vkGetCudaModuleCacheNV");
        PFN_vkCreateCudaFunctionNV = func.invoke(device, "vkCreateCudaFunctionNV");
        PFN_vkDestroyCudaModuleNV = func.invoke(device, "vkDestroyCudaModuleNV");
        PFN_vkDestroyCudaFunctionNV = func.invoke(device, "vkDestroyCudaFunctionNV");
        PFN_vkCmdCudaLaunchKernelNV = func.invoke(device, "vkCmdCudaLaunchKernelNV");
    }

    public @CType("VkResult") int CreateCudaModuleNV(@CType("VkDevice") MemorySegment device, @CType("const VkCudaModuleCreateInfoNV *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkCudaModuleNV *") MemorySegment pModule) {
        if (Unmarshal.isNullPointer(PFN_vkCreateCudaModuleNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateCudaModuleNV");
        try { return (int) MH_vkCreateCudaModuleNV.invokeExact(PFN_vkCreateCudaModuleNV, device, pCreateInfo, pAllocator, pModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCudaModuleNV", e); }
    }

    public @CType("VkResult") int GetCudaModuleCacheNV(@CType("VkDevice") MemorySegment device, @CType("VkCudaModuleNV") MemorySegment module, @CType("size_t *") MemorySegment pCacheSize, @CType("void *") MemorySegment pCacheData) {
        if (Unmarshal.isNullPointer(PFN_vkGetCudaModuleCacheNV)) throw new SymbolNotFoundError("Symbol not found: vkGetCudaModuleCacheNV");
        try { return (int) MH_vkGetCudaModuleCacheNV.invokeExact(PFN_vkGetCudaModuleCacheNV, device, module, pCacheSize, pCacheData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCudaModuleCacheNV", e); }
    }

    public @CType("VkResult") int CreateCudaFunctionNV(@CType("VkDevice") MemorySegment device, @CType("const VkCudaFunctionCreateInfoNV *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkCudaFunctionNV *") MemorySegment pFunction) {
        if (Unmarshal.isNullPointer(PFN_vkCreateCudaFunctionNV)) throw new SymbolNotFoundError("Symbol not found: vkCreateCudaFunctionNV");
        try { return (int) MH_vkCreateCudaFunctionNV.invokeExact(PFN_vkCreateCudaFunctionNV, device, pCreateInfo, pAllocator, pFunction); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCudaFunctionNV", e); }
    }

    public void DestroyCudaModuleNV(@CType("VkDevice") MemorySegment device, @CType("VkCudaModuleNV") MemorySegment module, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyCudaModuleNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCudaModuleNV");
        try { MH_vkDestroyCudaModuleNV.invokeExact(PFN_vkDestroyCudaModuleNV, device, module, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCudaModuleNV", e); }
    }

    public void DestroyCudaFunctionNV(@CType("VkDevice") MemorySegment device, @CType("VkCudaFunctionNV") MemorySegment function, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyCudaFunctionNV)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCudaFunctionNV");
        try { MH_vkDestroyCudaFunctionNV.invokeExact(PFN_vkDestroyCudaFunctionNV, device, function, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCudaFunctionNV", e); }
    }

    public void CmdCudaLaunchKernelNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkCudaLaunchInfoNV *") MemorySegment pLaunchInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdCudaLaunchKernelNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdCudaLaunchKernelNV");
        try { MH_vkCmdCudaLaunchKernelNV.invokeExact(PFN_vkCmdCudaLaunchKernelNV, commandBuffer, pLaunchInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCudaLaunchKernelNV", e); }
    }

}
