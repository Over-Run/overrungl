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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_deferred_host_operations` - device extension
public final class VKKHRDeferredHostOperations {
    public static final int VK_KHR_DEFERRED_HOST_OPERATIONS_SPEC_VERSION = 4;
    public static final String VK_KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME = "VK_KHR_deferred_host_operations";
    public static final int VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR = 1000268000;
    public static final int VK_THREAD_IDLE_KHR = 1000268000;
    public static final int VK_THREAD_DONE_KHR = 1000268001;
    public static final int VK_OPERATION_DEFERRED_KHR = 1000268002;
    public static final int VK_OPERATION_NOT_DEFERRED_KHR = 1000268003;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDeferredOperationKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDeferredOperationKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeferredOperationMaxConcurrencyKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetDeferredOperationResultKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkDeferredOperationJoinKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    private VKKHRDeferredHostOperations() {}

    /// Invokes `vkCreateDeferredOperationKHR`.
    /// ```
    /// (int) VkResult vkCreateDeferredOperationKHR((struct VkDevice*) VkDevice device, const VkAllocationCallbacks* pAllocator, VkDeferredOperationKHR* pDeferredOperation);
    /// ```
    public static int vkCreateDeferredOperationKHR(@NonNull VkDevice device, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pDeferredOperation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateDeferredOperationKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDeferredOperationKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDeferredOperationKHR", device, pAllocator, pDeferredOperation); }
        return (int) Handles.MH_vkCreateDeferredOperationKHR.invokeExact(device.capabilities().PFN_vkCreateDeferredOperationKHR, device.segment(), pAllocator, pDeferredOperation); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDeferredOperationKHR", e); }
    }

    /// Invokes `vkDestroyDeferredOperationKHR`.
    /// ```
    /// void vkDestroyDeferredOperationKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR operation, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDeferredOperationKHR(@NonNull VkDevice device, long operation, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyDeferredOperationKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDeferredOperationKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDeferredOperationKHR", device, operation, pAllocator); }
        Handles.MH_vkDestroyDeferredOperationKHR.invokeExact(device.capabilities().PFN_vkDestroyDeferredOperationKHR, device.segment(), operation, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDeferredOperationKHR", e); }
    }

    /// Invokes `vkGetDeferredOperationMaxConcurrencyKHR`.
    /// ```
    /// uint32_t vkGetDeferredOperationMaxConcurrencyKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR operation);
    /// ```
    public static int vkGetDeferredOperationMaxConcurrencyKHR(@NonNull VkDevice device, long operation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeferredOperationMaxConcurrencyKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeferredOperationMaxConcurrencyKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeferredOperationMaxConcurrencyKHR", device, operation); }
        return (int) Handles.MH_vkGetDeferredOperationMaxConcurrencyKHR.invokeExact(device.capabilities().PFN_vkGetDeferredOperationMaxConcurrencyKHR, device.segment(), operation); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeferredOperationMaxConcurrencyKHR", e); }
    }

    /// Invokes `vkGetDeferredOperationResultKHR`.
    /// ```
    /// (int) VkResult vkGetDeferredOperationResultKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR operation);
    /// ```
    public static int vkGetDeferredOperationResultKHR(@NonNull VkDevice device, long operation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeferredOperationResultKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeferredOperationResultKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeferredOperationResultKHR", device, operation); }
        return (int) Handles.MH_vkGetDeferredOperationResultKHR.invokeExact(device.capabilities().PFN_vkGetDeferredOperationResultKHR, device.segment(), operation); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeferredOperationResultKHR", e); }
    }

    /// Invokes `vkDeferredOperationJoinKHR`.
    /// ```
    /// (int) VkResult vkDeferredOperationJoinKHR((struct VkDevice*) VkDevice device, (uint64_t) VkDeferredOperationKHR operation);
    /// ```
    public static int vkDeferredOperationJoinKHR(@NonNull VkDevice device, long operation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDeferredOperationJoinKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkDeferredOperationJoinKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDeferredOperationJoinKHR", device, operation); }
        return (int) Handles.MH_vkDeferredOperationJoinKHR.invokeExact(device.capabilities().PFN_vkDeferredOperationJoinKHR, device.segment(), operation); }
        catch (Throwable e) { throw new RuntimeException("error in vkDeferredOperationJoinKHR", e); }
    }

}
