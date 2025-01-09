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
import static overrungl.vulkan.VK13.*;
public class VKEXTToolingInfo {
    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;
    public static final String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";
    public static final int VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 0x00000020;
    public static final int VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT = 0x00000040;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT_EXT = VK_TOOL_PURPOSE_VALIDATION_BIT;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT_EXT = VK_TOOL_PURPOSE_PROFILING_BIT;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT_EXT = VK_TOOL_PURPOSE_TRACING_BIT;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT = VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT;
    public static final MethodHandle MH_vkGetPhysicalDeviceToolPropertiesEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceToolPropertiesEXT;

    public VKEXTToolingInfo(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceToolPropertiesEXT = func.invoke(device, "vkGetPhysicalDeviceToolPropertiesEXT", "vkGetPhysicalDeviceToolProperties");
    }

    public @CType("VkResult") int GetPhysicalDeviceToolPropertiesEXT(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pToolCount, @CType("VkPhysicalDeviceToolProperties *") MemorySegment pToolProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceToolPropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceToolPropertiesEXT");
        try { return (int) MH_vkGetPhysicalDeviceToolPropertiesEXT.invokeExact(PFN_vkGetPhysicalDeviceToolPropertiesEXT, physicalDevice, pToolCount, pToolProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceToolPropertiesEXT", e); }
    }

}
