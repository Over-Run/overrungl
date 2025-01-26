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
public final class VKEXTToolingInfo {
    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;
    public static final String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = 1000245000;
    public static final int VK_TOOL_PURPOSE_VALIDATION_BIT_EXT = 0x00000001;
    public static final int VK_TOOL_PURPOSE_PROFILING_BIT_EXT = 0x00000002;
    public static final int VK_TOOL_PURPOSE_TRACING_BIT_EXT = 0x00000004;
    public static final int VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 0x00000008;
    public static final int VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT = 0x00000010;
    public static final int VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 0x00000020;
    public static final int VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT = 0x00000040;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceToolPropertiesEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTToolingInfo() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceToolPropertiesEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pToolCount, VkPhysicalDeviceToolProperties* pToolProperties);
    /// ```
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, MemorySegment pToolCount, MemorySegment pToolProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceToolPropertiesEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceToolPropertiesEXT");
        try { return (int) Handles.MH_vkGetPhysicalDeviceToolPropertiesEXT.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceToolPropertiesEXT, physicalDevice.segment(), pToolCount, pToolProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceToolPropertiesEXT", e); }
    }

}
