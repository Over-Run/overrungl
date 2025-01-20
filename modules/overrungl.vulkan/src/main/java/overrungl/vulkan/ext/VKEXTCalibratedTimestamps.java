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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.khr.VKKHRCalibratedTimestamps.*;
public class VKEXTCalibratedTimestamps {
    public static final int VK_EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 2;
    public static final String VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_EXT_calibrated_timestamps";
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT = VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_KHR;
    public static final int VK_TIME_DOMAIN_DEVICE_EXT = VK_TIME_DOMAIN_DEVICE_KHR;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT = VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR;
    public static final int VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT = VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR;
    public static final int VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT = VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetCalibratedTimestampsEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;
        public final MemorySegment PFN_vkGetCalibratedTimestampsEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT = func.invoke(device, "vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", "vkGetPhysicalDeviceCalibrateableTimeDomainsKHR");
            PFN_vkGetCalibratedTimestampsEXT = func.invoke(device, "vkGetCalibratedTimestampsEXT", "vkGetCalibratedTimestampsKHR");
        }
    }

    public VKEXTCalibratedTimestamps(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceCalibrateableTimeDomainsEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pTimeDomainCount, @CType("VkTimeDomainKHR *") MemorySegment pTimeDomains) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCalibrateableTimeDomainsEXT");
        try { return (int) Handles.MH_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT.invokeExact(handles.PFN_vkGetPhysicalDeviceCalibrateableTimeDomainsEXT, physicalDevice, pTimeDomainCount, pTimeDomains); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCalibrateableTimeDomainsEXT", e); }
    }

    public @CType("VkResult") int GetCalibratedTimestampsEXT(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int timestampCount, @CType("const VkCalibratedTimestampInfoKHR *") MemorySegment pTimestampInfos, @CType("uint64_t *") MemorySegment pTimestamps, @CType("uint64_t *") MemorySegment pMaxDeviation) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetCalibratedTimestampsEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetCalibratedTimestampsEXT");
        try { return (int) Handles.MH_vkGetCalibratedTimestampsEXT.invokeExact(handles.PFN_vkGetCalibratedTimestampsEXT, device, timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetCalibratedTimestampsEXT", e); }
    }

}
