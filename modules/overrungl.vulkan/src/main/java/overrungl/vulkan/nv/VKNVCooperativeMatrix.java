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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.khr.VKKHRCooperativeMatrix.*;
public class VKNVCooperativeMatrix {
    public static final int VK_NV_COOPERATIVE_MATRIX_SPEC_VERSION = 1;
    public static final String VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_NV_cooperative_matrix";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV = 1000249000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249002;
    public static final int VK_SCOPE_DEVICE_NV = VK_SCOPE_DEVICE_KHR;
    public static final int VK_SCOPE_WORKGROUP_NV = VK_SCOPE_WORKGROUP_KHR;
    public static final int VK_SCOPE_SUBGROUP_NV = VK_SCOPE_SUBGROUP_KHR;
    public static final int VK_SCOPE_QUEUE_FAMILY_NV = VK_SCOPE_QUEUE_FAMILY_KHR;
    public static final int VK_COMPONENT_TYPE_FLOAT16_NV = VK_COMPONENT_TYPE_FLOAT16_KHR;
    public static final int VK_COMPONENT_TYPE_FLOAT32_NV = VK_COMPONENT_TYPE_FLOAT32_KHR;
    public static final int VK_COMPONENT_TYPE_FLOAT64_NV = VK_COMPONENT_TYPE_FLOAT64_KHR;
    public static final int VK_COMPONENT_TYPE_SINT8_NV = VK_COMPONENT_TYPE_SINT8_KHR;
    public static final int VK_COMPONENT_TYPE_SINT16_NV = VK_COMPONENT_TYPE_SINT16_KHR;
    public static final int VK_COMPONENT_TYPE_SINT32_NV = VK_COMPONENT_TYPE_SINT32_KHR;
    public static final int VK_COMPONENT_TYPE_SINT64_NV = VK_COMPONENT_TYPE_SINT64_KHR;
    public static final int VK_COMPONENT_TYPE_UINT8_NV = VK_COMPONENT_TYPE_UINT8_KHR;
    public static final int VK_COMPONENT_TYPE_UINT16_NV = VK_COMPONENT_TYPE_UINT16_KHR;
    public static final int VK_COMPONENT_TYPE_UINT32_NV = VK_COMPONENT_TYPE_UINT32_KHR;
    public static final int VK_COMPONENT_TYPE_UINT64_NV = VK_COMPONENT_TYPE_UINT64_KHR;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV);
        public final MemorySegment PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = func.invoke(device, "vkGetPhysicalDeviceCooperativeMatrixPropertiesNV");
        }
    }

    public VKNVCooperativeMatrix(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceCooperativeMatrixPropertiesNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkCooperativeMatrixPropertiesNV *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCooperativeMatrixPropertiesNV");
        try { return (int) Handles.MH_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV.invokeExact(handles.PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCooperativeMatrixPropertiesNV", e); }
    }

}
