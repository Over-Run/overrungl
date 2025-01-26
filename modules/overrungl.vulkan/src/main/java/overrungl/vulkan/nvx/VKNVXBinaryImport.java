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
package overrungl.vulkan.nvx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNVXBinaryImport {
    public static final int VK_NVX_BINARY_IMPORT_SPEC_VERSION = 2;
    public static final String VK_NVX_BINARY_IMPORT_EXTENSION_NAME = "VK_NVX_binary_import";
    public static final int VK_STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX = 1000029000;
    public static final int VK_STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX = 1000029001;
    public static final int VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX = 1000029002;
    public static final int VK_STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX = 1000029004;
    public static final int VK_OBJECT_TYPE_CU_MODULE_NVX = 1000029000;
    public static final int VK_OBJECT_TYPE_CU_FUNCTION_NVX = 1000029001;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT = 1000029000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT = 1000029001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateCuModuleNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCuFunctionNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCuModuleNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCuFunctionNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCuLaunchKernelNVX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreateCuModuleNVX;
        public final MemorySegment PFN_vkCreateCuFunctionNVX;
        public final MemorySegment PFN_vkDestroyCuModuleNVX;
        public final MemorySegment PFN_vkDestroyCuFunctionNVX;
        public final MemorySegment PFN_vkCmdCuLaunchKernelNVX;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateCuModuleNVX = func.invoke(device, "vkCreateCuModuleNVX");
            PFN_vkCreateCuFunctionNVX = func.invoke(device, "vkCreateCuFunctionNVX");
            PFN_vkDestroyCuModuleNVX = func.invoke(device, "vkDestroyCuModuleNVX");
            PFN_vkDestroyCuFunctionNVX = func.invoke(device, "vkDestroyCuFunctionNVX");
            PFN_vkCmdCuLaunchKernelNVX = func.invoke(device, "vkCmdCuLaunchKernelNVX");
        }
    }

    public VKNVXBinaryImport(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateCuModuleNVX(VkDevice device, const VkCuModuleCreateInfoNVX* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCuModuleNVX* pModule);
    /// ```
    public int CreateCuModuleNVX(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pModule) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateCuModuleNVX)) throw new SymbolNotFoundError("Symbol not found: vkCreateCuModuleNVX");
        try { return (int) Handles.MH_vkCreateCuModuleNVX.invokeExact(handles.PFN_vkCreateCuModuleNVX, device, pCreateInfo, pAllocator, pModule); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCuModuleNVX", e); }
    }

    /// ```
    /// VkResult vkCreateCuFunctionNVX(VkDevice device, const VkCuFunctionCreateInfoNVX* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCuFunctionNVX* pFunction);
    /// ```
    public int CreateCuFunctionNVX(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pFunction) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateCuFunctionNVX)) throw new SymbolNotFoundError("Symbol not found: vkCreateCuFunctionNVX");
        try { return (int) Handles.MH_vkCreateCuFunctionNVX.invokeExact(handles.PFN_vkCreateCuFunctionNVX, device, pCreateInfo, pAllocator, pFunction); }
        catch (Throwable e) { throw new RuntimeException("error in CreateCuFunctionNVX", e); }
    }

    /// ```
    /// void vkDestroyCuModuleNVX(VkDevice device, VkCuModuleNVX module, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyCuModuleNVX(MemorySegment device, long module, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyCuModuleNVX)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCuModuleNVX");
        try { Handles.MH_vkDestroyCuModuleNVX.invokeExact(handles.PFN_vkDestroyCuModuleNVX, device, module, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyCuModuleNVX", e); }
    }

    /// ```
    /// void vkDestroyCuFunctionNVX(VkDevice device, VkCuFunctionNVX function, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyCuFunctionNVX(MemorySegment device, long function, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyCuFunctionNVX)) throw new SymbolNotFoundError("Symbol not found: vkDestroyCuFunctionNVX");
        try { Handles.MH_vkDestroyCuFunctionNVX.invokeExact(handles.PFN_vkDestroyCuFunctionNVX, device, function, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyCuFunctionNVX", e); }
    }

    /// ```
    /// void vkCmdCuLaunchKernelNVX(VkCommandBuffer commandBuffer, const VkCuLaunchInfoNVX* pLaunchInfo);
    /// ```
    public void CmdCuLaunchKernelNVX(MemorySegment commandBuffer, MemorySegment pLaunchInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdCuLaunchKernelNVX)) throw new SymbolNotFoundError("Symbol not found: vkCmdCuLaunchKernelNVX");
        try { Handles.MH_vkCmdCuLaunchKernelNVX.invokeExact(handles.PFN_vkCmdCuLaunchKernelNVX, commandBuffer, pLaunchInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdCuLaunchKernelNVX", e); }
    }

}
