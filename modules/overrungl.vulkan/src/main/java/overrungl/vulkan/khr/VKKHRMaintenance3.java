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
public final class VKKHRMaintenance3 {
    public static final int VK_KHR_MAINTENANCE_3_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_KHR_MAINTENANCE3_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = 1000168000;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR = 1000168001;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDescriptorSetLayoutSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRMaintenance3() {}

    /// ```
    /// void vkGetDescriptorSetLayoutSupportKHR((struct VkDevice*) VkDevice device, const VkDescriptorSetLayoutCreateInfo* pCreateInfo, VkDescriptorSetLayoutSupport* pSupport);
    /// ```
    public static void vkGetDescriptorSetLayoutSupportKHR(VkDevice device, MemorySegment pCreateInfo, MemorySegment pSupport) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDescriptorSetLayoutSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSupportKHR");
        try { Handles.MH_vkGetDescriptorSetLayoutSupportKHR.invokeExact(device.capabilities().PFN_vkGetDescriptorSetLayoutSupportKHR, device.segment(), pCreateInfo, pSupport); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSupportKHR", e); }
    }

}
