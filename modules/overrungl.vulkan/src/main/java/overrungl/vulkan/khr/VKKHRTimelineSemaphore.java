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
import static overrungl.vulkan.VK12.*;
public class VKKHRTimelineSemaphore {
    public static final int VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION = 2;
    public static final String VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO_KHR = VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO_KHR = VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO;
    public static final int VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO_KHR = VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO;
    public static final int VK_SEMAPHORE_TYPE_BINARY_KHR = VK_SEMAPHORE_TYPE_BINARY;
    public static final int VK_SEMAPHORE_TYPE_TIMELINE_KHR = VK_SEMAPHORE_TYPE_TIMELINE;
    public static final int VK_SEMAPHORE_WAIT_ANY_BIT_KHR = VK_SEMAPHORE_WAIT_ANY_BIT;
    public static final MethodHandle MH_vkGetSemaphoreCounterValueKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkWaitSemaphoresKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkSignalSemaphoreKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetSemaphoreCounterValueKHR;
    public final MemorySegment PFN_vkWaitSemaphoresKHR;
    public final MemorySegment PFN_vkSignalSemaphoreKHR;

    public VKKHRTimelineSemaphore(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetSemaphoreCounterValueKHR = func.invoke(device, "vkGetSemaphoreCounterValueKHR", "vkGetSemaphoreCounterValue");
        PFN_vkWaitSemaphoresKHR = func.invoke(device, "vkWaitSemaphoresKHR", "vkWaitSemaphores");
        PFN_vkSignalSemaphoreKHR = func.invoke(device, "vkSignalSemaphoreKHR", "vkSignalSemaphore");
    }

    public @CType("VkResult") int GetSemaphoreCounterValueKHR(@CType("VkDevice") MemorySegment device, @CType("VkSemaphore") MemorySegment semaphore, @CType("uint64_t *") MemorySegment pValue) {
        if (Unmarshal.isNullPointer(PFN_vkGetSemaphoreCounterValueKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetSemaphoreCounterValueKHR");
        try { return (int) MH_vkGetSemaphoreCounterValueKHR.invokeExact(PFN_vkGetSemaphoreCounterValueKHR, device, semaphore, pValue); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetSemaphoreCounterValueKHR", e); }
    }

    public @CType("VkResult") int WaitSemaphoresKHR(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreWaitInfo *") MemorySegment pWaitInfo, @CType("uint64_t") long timeout) {
        if (Unmarshal.isNullPointer(PFN_vkWaitSemaphoresKHR)) throw new SymbolNotFoundError("Symbol not found: vkWaitSemaphoresKHR");
        try { return (int) MH_vkWaitSemaphoresKHR.invokeExact(PFN_vkWaitSemaphoresKHR, device, pWaitInfo, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in vkWaitSemaphoresKHR", e); }
    }

    public @CType("VkResult") int SignalSemaphoreKHR(@CType("VkDevice") MemorySegment device, @CType("const VkSemaphoreSignalInfo *") MemorySegment pSignalInfo) {
        if (Unmarshal.isNullPointer(PFN_vkSignalSemaphoreKHR)) throw new SymbolNotFoundError("Symbol not found: vkSignalSemaphoreKHR");
        try { return (int) MH_vkSignalSemaphoreKHR.invokeExact(PFN_vkSignalSemaphoreKHR, device, pSignalInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSignalSemaphoreKHR", e); }
    }

}
