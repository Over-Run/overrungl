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
public class VKKHRPerformanceQuery {
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR = 0x00000001;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR = 0x00000002;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR = 5;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR = 0;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR = 1;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR = 2;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR = 3;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR = 4;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR = 5;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR = 6;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR = 7;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR = 8;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR = 9;
    public static final int VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR = 10;
    public static final int VK_KHR_PERFORMANCE_QUERY_SPEC_VERSION = 1;
    public static final String VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_KHR_performance_query";
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR = 1000116000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR = 1000116000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR = 1000116001;
    public static final int VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR = 1000116002;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR = 1000116003;
    public static final int VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR = 1000116004;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR = 1000116005;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR = 1000116006;
    public static final int VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_RESERVATION_INFO_KHR = 1000116007;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR = VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR;
    public static final int VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR = VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR;
    public static final int VK_QUERY_SCOPE_COMMAND_BUFFER_KHR = VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR;
    public static final int VK_QUERY_SCOPE_RENDER_PASS_KHR = VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR;
    public static final int VK_QUERY_SCOPE_COMMAND_KHR = VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR;
    public static final MethodHandle MH_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkAcquireProfilingLockKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkReleaseProfilingLockKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
    public final MemorySegment PFN_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
    public final MemorySegment PFN_vkAcquireProfilingLockKHR;
    public final MemorySegment PFN_vkReleaseProfilingLockKHR;

    public VKKHRPerformanceQuery(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR = func.invoke(device, "vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR");
        PFN_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR = func.invoke(device, "vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR");
        PFN_vkAcquireProfilingLockKHR = func.invoke(device, "vkAcquireProfilingLockKHR");
        PFN_vkReleaseProfilingLockKHR = func.invoke(device, "vkReleaseProfilingLockKHR");
    }

    public @CType("VkResult") int EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t") int queueFamilyIndex, @CType("uint32_t *") MemorySegment pCounterCount, @CType("VkPerformanceCounterKHR *") MemorySegment pCounters, @CType("VkPerformanceCounterDescriptionKHR *") MemorySegment pCounterDescriptions) {
        if (Unmarshal.isNullPointer(PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR");
        try { return (int) MH_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR.invokeExact(PFN_vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR, physicalDevice, queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR", e); }
    }

    public void GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("const VkQueryPoolPerformanceCreateInfoKHR *") MemorySegment pPerformanceQueryCreateInfo, @CType("uint32_t *") MemorySegment pNumPasses) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR");
        try { MH_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR.invokeExact(PFN_vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR, physicalDevice, pPerformanceQueryCreateInfo, pNumPasses); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR", e); }
    }

    public @CType("VkResult") int AcquireProfilingLockKHR(@CType("VkDevice") MemorySegment device, @CType("const VkAcquireProfilingLockInfoKHR *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(PFN_vkAcquireProfilingLockKHR)) throw new SymbolNotFoundError("Symbol not found: vkAcquireProfilingLockKHR");
        try { return (int) MH_vkAcquireProfilingLockKHR.invokeExact(PFN_vkAcquireProfilingLockKHR, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkAcquireProfilingLockKHR", e); }
    }

    public void ReleaseProfilingLockKHR(@CType("VkDevice") MemorySegment device) {
        if (Unmarshal.isNullPointer(PFN_vkReleaseProfilingLockKHR)) throw new SymbolNotFoundError("Symbol not found: vkReleaseProfilingLockKHR");
        try { MH_vkReleaseProfilingLockKHR.invokeExact(PFN_vkReleaseProfilingLockKHR, device); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseProfilingLockKHR", e); }
    }

}
