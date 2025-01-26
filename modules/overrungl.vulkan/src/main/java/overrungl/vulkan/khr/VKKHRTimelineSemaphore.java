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
public class VKKHRTimelineSemaphore {
    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;
    public static final String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR = 1000207000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = 1000207001;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR = 1000207002;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR = 1000207003;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR = 1000207004;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR = 1000207005;
    public static final int VK_SEMAPHORE_TYPE_BINARY_KHR = 0;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE_KHR = 1;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = 0x00000001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetSemaphoreCounterValueKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkWaitSemaphoresKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkSignalSemaphoreKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetSemaphoreCounterValueKHR;
        public final MemorySegment PFN_vkWaitSemaphoresKHR;
        public final MemorySegment PFN_vkSignalSemaphoreKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetSemaphoreCounterValueKHR = func.invoke(device, "vkGetSemaphoreCounterValueKHR", "vkGetSemaphoreCounterValue");
            PFN_vkWaitSemaphoresKHR = func.invoke(device, "vkWaitSemaphoresKHR", "vkWaitSemaphores");
            PFN_vkSignalSemaphoreKHR = func.invoke(device, "vkSignalSemaphoreKHR", "vkSignalSemaphore");
        }
    }

    public VKKHRTimelineSemaphore(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetSemaphoreCounterValueKHR(VkDevice device, VkSemaphore semaphore, uint64_t* pValue);
    /// ```
    public int GetSemaphoreCounterValueKHR(MemorySegment device, long semaphore, MemorySegment pValue) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetSemaphoreCounterValueKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSemaphoreCounterValueKHR");
        try { return (int) Handles.MH_vkGetSemaphoreCounterValueKHR.invokeExact(handles.PFN_vkGetSemaphoreCounterValueKHR, device, semaphore, pValue); }
        catch (Throwable e) { throw new RuntimeException("error in GetSemaphoreCounterValueKHR", e); }
    }

    /// ```
    /// VkResult vkWaitSemaphoresKHR(VkDevice device, const VkSemaphoreWaitInfo* pWaitInfo, uint64_t timeout);
    /// ```
    public int WaitSemaphoresKHR(MemorySegment device, MemorySegment pWaitInfo, long timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkWaitSemaphoresKHR)) throw new SymbolNotFoundError("Symbol not found: vkWaitSemaphoresKHR");
        try { return (int) Handles.MH_vkWaitSemaphoresKHR.invokeExact(handles.PFN_vkWaitSemaphoresKHR, device, pWaitInfo, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSemaphoresKHR", e); }
    }

    /// ```
    /// VkResult vkSignalSemaphoreKHR(VkDevice device, const VkSemaphoreSignalInfo* pSignalInfo);
    /// ```
    public int SignalSemaphoreKHR(MemorySegment device, MemorySegment pSignalInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSignalSemaphoreKHR)) throw new SymbolNotFoundError("Symbol not found: vkSignalSemaphoreKHR");
        try { return (int) Handles.MH_vkSignalSemaphoreKHR.invokeExact(handles.PFN_vkSignalSemaphoreKHR, device, pSignalInfo); }
        catch (Throwable e) { throw new RuntimeException("error in SignalSemaphoreKHR", e); }
    }

}
