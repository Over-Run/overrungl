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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTCalibratedTimestamps {
    public static final int VK_EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 2;
    public static final String VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_EXT_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT = 1000543000;
    public static final int VK_TIME_DOMAIN_DEVICE_EXT = 0;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT = 1;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT = 2;
    public static final int VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT = 3;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCalibratedTimestampsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTCalibratedTimestamps() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pTimeDomainCount, VkTimeDomainKHR* pTimeDomains);
    /// ```
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, MemorySegment pTimeDomainCount, MemorySegment pTimeDomains) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCalibrateableTimeDomainsEXT");
        try { return (int) Handles.MH_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT, physicalDevice.segment(), pTimeDomainCount, pTimeDomains); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetCalibratedTimestampsEXT((struct VkDevice*) VkDevice device, uint32_t timestampCount, const VkCalibratedTimestampInfoKHR* pTimestampInfos, uint64_t* pTimestamps, uint64_t* pMaxDeviation);
    /// ```
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, int timestampCount, MemorySegment pTimestampInfos, MemorySegment pTimestamps, MemorySegment pMaxDeviation) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetCalibratedTimestampsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetCalibratedTimestampsEXT");
        try { return (int) Handles.MH_vkGetCalibratedTimestampsEXT.invokeExact(device.capabilities().PFN_vkGetCalibratedTimestampsEXT, device.segment(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCalibratedTimestampsEXT", e); }
    }

}
