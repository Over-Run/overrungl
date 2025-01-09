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
public class VKKHRCooperativeMatrix {
    public static final int VK_SCOPE_DEVICE_KHR = 1;
    public static final int VK_SCOPE_WORKGROUP_KHR = 2;
    public static final int VK_SCOPE_SUBGROUP_KHR = 3;
    public static final int VK_SCOPE_QUEUE_FAMILY_KHR = 5;
    public static final int VK_COMPONENT_TYPE_FLOAT16_KHR = 0;
    public static final int VK_COMPONENT_TYPE_FLOAT32_KHR = 1;
    public static final int VK_COMPONENT_TYPE_FLOAT64_KHR = 2;
    public static final int VK_COMPONENT_TYPE_SINT8_KHR = 3;
    public static final int VK_COMPONENT_TYPE_SINT16_KHR = 4;
    public static final int VK_COMPONENT_TYPE_SINT32_KHR = 5;
    public static final int VK_COMPONENT_TYPE_SINT64_KHR = 6;
    public static final int VK_COMPONENT_TYPE_UINT8_KHR = 7;
    public static final int VK_COMPONENT_TYPE_UINT16_KHR = 8;
    public static final int VK_COMPONENT_TYPE_UINT32_KHR = 9;
    public static final int VK_COMPONENT_TYPE_UINT64_KHR = 10;
    public static final int VK_KHR_COOPERATIVE_MATRIX_SPEC_VERSION = 2;
    public static final String VK_KHR_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_KHR_cooperative_matrix";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR = 1000506000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR = 1000506002;
    public static final MethodHandle MH_vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR;

    public VKKHRCooperativeMatrix(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR = func.invoke(device, "vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR");
    }

    public @CType("VkResult") int GetPhysicalDeviceCooperativeMatrixPropertiesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkCooperativeMatrixPropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR");
        try { return (int) MH_vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR.invokeExact(PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR", e); }
    }

}