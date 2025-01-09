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
import static overrungl.vulkan.VK11.*;
import static overrungl.vulkan.khr.VKKHRMaintenance3.*;
public class VKKHRMaintenance3 {
    public static final int VK_KHR_MAINTENANCE_3_SPEC_VERSION = 1;
    public static final String VK_KHR_MAINTENANCE_3_EXTENSION_NAME = "VK_KHR_maintenance3";
    public static final int VK_KHR_MAINTENANCE3_SPEC_VERSION = VK_KHR_MAINTENANCE_3_SPEC_VERSION;
    public static final String VK_KHR_MAINTENANCE3_EXTENSION_NAME = VK_KHR_MAINTENANCE_3_EXTENSION_NAME;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT_KHR = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_SUPPORT;
    public static final MethodHandle MH_vkGetDescriptorSetLayoutSupportKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetDescriptorSetLayoutSupportKHR;

    public VKKHRMaintenance3(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetDescriptorSetLayoutSupportKHR = func.invoke(device, "vkGetDescriptorSetLayoutSupportKHR", "vkGetDescriptorSetLayoutSupport");
    }

    public void GetDescriptorSetLayoutSupportKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDescriptorSetLayoutCreateInfo *") MemorySegment pCreateInfo, @CType("VkDescriptorSetLayoutSupport *") MemorySegment pSupport) {
        if (Unmarshal.isNullPointer(PFN_vkGetDescriptorSetLayoutSupportKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDescriptorSetLayoutSupportKHR");
        try { MH_vkGetDescriptorSetLayoutSupportKHR.invokeExact(PFN_vkGetDescriptorSetLayoutSupportKHR, device, pCreateInfo, pSupport); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDescriptorSetLayoutSupportKHR", e); }
    }

}
