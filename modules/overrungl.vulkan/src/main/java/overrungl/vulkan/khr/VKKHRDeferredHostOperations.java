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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKKHRDeferredHostOperations {
    public static final int VK_KHR_DEFERRED_HOST_OPERATIONS_SPEC_VERSION = 4;
    public static final String VK_KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME = "VK_KHR_deferred_host_operations";
    public static final int VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR = 1000268000;
    public static final int VK_THREAD_IDLE_KHR = 1000268000;
    public static final int VK_THREAD_DONE_KHR = 1000268001;
    public static final int VK_OPERATION_DEFERRED_KHR = 1000268002;
    public static final int VK_OPERATION_NOT_DEFERRED_KHR = 1000268003;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDeferredOperationKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDeferredOperationKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeferredOperationMaxConcurrencyKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetDeferredOperationResultKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkDeferredOperationJoinKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_vkCreateDeferredOperationKHR;
        public final MemorySegment PFN_vkDestroyDeferredOperationKHR;
        public final MemorySegment PFN_vkGetDeferredOperationMaxConcurrencyKHR;
        public final MemorySegment PFN_vkGetDeferredOperationResultKHR;
        public final MemorySegment PFN_vkDeferredOperationJoinKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateDeferredOperationKHR = func.invoke(device, "vkCreateDeferredOperationKHR");
            PFN_vkDestroyDeferredOperationKHR = func.invoke(device, "vkDestroyDeferredOperationKHR");
            PFN_vkGetDeferredOperationMaxConcurrencyKHR = func.invoke(device, "vkGetDeferredOperationMaxConcurrencyKHR");
            PFN_vkGetDeferredOperationResultKHR = func.invoke(device, "vkGetDeferredOperationResultKHR");
            PFN_vkDeferredOperationJoinKHR = func.invoke(device, "vkDeferredOperationJoinKHR");
        }
    }

    public VKKHRDeferredHostOperations(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateDeferredOperationKHR(VkDevice device, const VkAllocationCallbacks* pAllocator, VkDeferredOperationKHR* pDeferredOperation);
    /// ```
    public int CreateDeferredOperationKHR(MemorySegment device, MemorySegment pAllocator, MemorySegment pDeferredOperation) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDeferredOperationKHR)) throw new SymbolNotFoundError("Symbol not found: vkCreateDeferredOperationKHR");
        try { return (int) Handles.MH_vkCreateDeferredOperationKHR.invokeExact(handles.PFN_vkCreateDeferredOperationKHR, device, pAllocator, pDeferredOperation); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDeferredOperationKHR", e); }
    }

    /// ```
    /// void vkDestroyDeferredOperationKHR(VkDevice device, VkDeferredOperationKHR operation, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyDeferredOperationKHR(MemorySegment device, long operation, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyDeferredOperationKHR)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDeferredOperationKHR");
        try { Handles.MH_vkDestroyDeferredOperationKHR.invokeExact(handles.PFN_vkDestroyDeferredOperationKHR, device, operation, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyDeferredOperationKHR", e); }
    }

    /// ```
    /// uint32_t vkGetDeferredOperationMaxConcurrencyKHR(VkDevice device, VkDeferredOperationKHR operation);
    /// ```
    public int GetDeferredOperationMaxConcurrencyKHR(MemorySegment device, long operation) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeferredOperationMaxConcurrencyKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeferredOperationMaxConcurrencyKHR");
        try { return (int) Handles.MH_vkGetDeferredOperationMaxConcurrencyKHR.invokeExact(handles.PFN_vkGetDeferredOperationMaxConcurrencyKHR, device, operation); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeferredOperationMaxConcurrencyKHR", e); }
    }

    /// ```
    /// VkResult vkGetDeferredOperationResultKHR(VkDevice device, VkDeferredOperationKHR operation);
    /// ```
    public int GetDeferredOperationResultKHR(MemorySegment device, long operation) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeferredOperationResultKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeferredOperationResultKHR");
        try { return (int) Handles.MH_vkGetDeferredOperationResultKHR.invokeExact(handles.PFN_vkGetDeferredOperationResultKHR, device, operation); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeferredOperationResultKHR", e); }
    }

    /// ```
    /// VkResult vkDeferredOperationJoinKHR(VkDevice device, VkDeferredOperationKHR operation);
    /// ```
    public int DeferredOperationJoinKHR(MemorySegment device, long operation) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDeferredOperationJoinKHR)) throw new SymbolNotFoundError("Symbol not found: vkDeferredOperationJoinKHR");
        try { return (int) Handles.MH_vkDeferredOperationJoinKHR.invokeExact(handles.PFN_vkDeferredOperationJoinKHR, device, operation); }
        catch (Throwable e) { throw new RuntimeException("error in DeferredOperationJoinKHR", e); }
    }

}
