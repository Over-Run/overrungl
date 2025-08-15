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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NVX_binary_import` - device extension
public final class VKNVXBinaryImport {
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
    public static final class Handles {
        public static final MethodHandle MH_vkCreateCuModuleNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateCuFunctionNVX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCuModuleNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyCuFunctionNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdCuLaunchKernelNVX = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVXBinaryImport() {}

    /// Invokes `vkCreateCuModuleNVX`.
    /// ```
    /// (int) VkResult vkCreateCuModuleNVX((struct VkDevice*) VkDevice device, const VkCuModuleCreateInfoNVX* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCuModuleNVX* pModule);
    /// ```
    public static int vkCreateCuModuleNVX(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pModule) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCuModuleNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCuModuleNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateCuModuleNVX", device, pCreateInfo, pAllocator, pModule); }
        return (int) Handles.MH_vkCreateCuModuleNVX.invokeExact(device.capabilities().PFN_vkCreateCuModuleNVX, device.segment(), pCreateInfo, pAllocator, pModule); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCuModuleNVX", e); }
    }

    /// Invokes `vkCreateCuFunctionNVX`.
    /// ```
    /// (int) VkResult vkCreateCuFunctionNVX((struct VkDevice*) VkDevice device, const VkCuFunctionCreateInfoNVX* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkCuFunctionNVX* pFunction);
    /// ```
    public static int vkCreateCuFunctionNVX(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pFunction) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateCuFunctionNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateCuFunctionNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateCuFunctionNVX", device, pCreateInfo, pAllocator, pFunction); }
        return (int) Handles.MH_vkCreateCuFunctionNVX.invokeExact(device.capabilities().PFN_vkCreateCuFunctionNVX, device.segment(), pCreateInfo, pAllocator, pFunction); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateCuFunctionNVX", e); }
    }

    /// Invokes `vkDestroyCuModuleNVX`.
    /// ```
    /// void vkDestroyCuModuleNVX((struct VkDevice*) VkDevice device, (uint64_t) VkCuModuleNVX module, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCuModuleNVX(@NonNull VkDevice device, long module, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCuModuleNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCuModuleNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyCuModuleNVX", device, module, pAllocator); }
        Handles.MH_vkDestroyCuModuleNVX.invokeExact(device.capabilities().PFN_vkDestroyCuModuleNVX, device.segment(), module, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCuModuleNVX", e); }
    }

    /// Invokes `vkDestroyCuFunctionNVX`.
    /// ```
    /// void vkDestroyCuFunctionNVX((struct VkDevice*) VkDevice device, (uint64_t) VkCuFunctionNVX function, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyCuFunctionNVX(@NonNull VkDevice device, long function, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyCuFunctionNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyCuFunctionNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyCuFunctionNVX", device, function, pAllocator); }
        Handles.MH_vkDestroyCuFunctionNVX.invokeExact(device.capabilities().PFN_vkDestroyCuFunctionNVX, device.segment(), function, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyCuFunctionNVX", e); }
    }

    /// Invokes `vkCmdCuLaunchKernelNVX`.
    /// ```
    /// void vkCmdCuLaunchKernelNVX((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkCuLaunchInfoNVX* pLaunchInfo);
    /// ```
    public static void vkCmdCuLaunchKernelNVX(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pLaunchInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdCuLaunchKernelNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdCuLaunchKernelNVX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdCuLaunchKernelNVX", commandBuffer, pLaunchInfo); }
        Handles.MH_vkCmdCuLaunchKernelNVX.invokeExact(commandBuffer.capabilities().PFN_vkCmdCuLaunchKernelNVX, commandBuffer.segment(), pLaunchInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdCuLaunchKernelNVX", e); }
    }

}
