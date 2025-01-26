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
public class VKKHRCalibratedTimestamps {
    public static final int VK_TIME_DOMAIN_DEVICE_KHR = 0;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR = 1;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR = 2;
    public static final int VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR = 3;
    public static final int VK_KHR_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 1;
    public static final String VK_KHR_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_KHR_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR = 1000543000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCalibratedTimestampsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR;
        public final MemorySegment PFN_vkGetCalibratedTimestampsKHR;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR = func.invoke(device, "vkGetPhysicalDeviceCalibrateableTimeDomainsKHR", "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT");
            PFN_vkGetCalibratedTimestampsKHR = func.invoke(device, "vkGetCalibratedTimestampsKHR", "vkGetCalibratedTimestampsEXT");
        }
    }

    public VKKHRCalibratedTimestamps(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(VkPhysicalDevice physicalDevice, uint32_t* pTimeDomainCount, VkTimeDomainKHR* pTimeDomains);
    /// ```
    public int GetPhysicalDeviceCalibrateableTimeDomainsKHR(MemorySegment physicalDevice, MemorySegment pTimeDomainCount, MemorySegment pTimeDomains) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCalibrateableTimeDomainsKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsKHR, physicalDevice, pTimeDomainCount, pTimeDomains); }
        catch (Throwable e) { throw new RuntimeException("error in GetPhysicalDeviceCalibrateableTimeDomainsKHR", e); }
    }

    /// ```
    /// VkResult vkGetCalibratedTimestampsKHR(VkDevice device, uint32_t timestampCount, const VkCalibratedTimestampInfoKHR* pTimestampInfos, uint64_t* pTimestamps, uint64_t* pMaxDeviation);
    /// ```
    public int GetCalibratedTimestampsKHR(MemorySegment device, int timestampCount, MemorySegment pTimestampInfos, MemorySegment pTimestamps, MemorySegment pMaxDeviation) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetCalibratedTimestampsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetCalibratedTimestampsKHR");
        try { return (int) Handles.MH_vkGetCalibratedTimestampsKHR.invokeExact(handles.PFN_vkGetCalibratedTimestampsKHR, device, timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        catch (Throwable e) { throw new RuntimeException("error in GetCalibratedTimestampsKHR", e); }
    }

}
