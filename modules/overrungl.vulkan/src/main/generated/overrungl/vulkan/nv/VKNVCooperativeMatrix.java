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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_NV_cooperative_matrix` - device extension
public final class VKNVCooperativeMatrix {
    public static final int VK_NV_COOPERATIVE_MATRIX_SPEC_VERSION = 1;
    public static final String VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_NV_cooperative_matrix";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV = 1000249000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV = 1000249002;
    public static final int VK_SCOPE_DEVICE_NV = 1;
    public static final int VK_SCOPE_WORKGROUP_NV = 2;
    public static final int VK_SCOPE_SUBGROUP_NV = 3;
    public static final int VK_SCOPE_QUEUE_FAMILY_NV = 5;
    public static final int VK_COMPONENT_TYPE_FLOAT16_NV = 0;
    public static final int VK_COMPONENT_TYPE_FLOAT32_NV = 1;
    public static final int VK_COMPONENT_TYPE_FLOAT64_NV = 2;
    public static final int VK_COMPONENT_TYPE_SINT8_NV = 3;
    public static final int VK_COMPONENT_TYPE_SINT16_NV = 4;
    public static final int VK_COMPONENT_TYPE_SINT32_NV = 5;
    public static final int VK_COMPONENT_TYPE_SINT64_NV = 6;
    public static final int VK_COMPONENT_TYPE_UINT8_NV = 7;
    public static final int VK_COMPONENT_TYPE_UINT16_NV = 8;
    public static final int VK_COMPONENT_TYPE_UINT32_NV = 9;
    public static final int VK_COMPONENT_TYPE_UINT64_NV = 10;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCooperativeMatrix() {}

    /// Invokes `vkGetPhysicalDeviceCooperativeMatrixPropertiesNV`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkCooperativeMatrixPropertiesNV* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pPropertyCount, @NonNull MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCooperativeMatrixPropertiesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceCooperativeMatrixPropertiesNV", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCooperativeMatrixPropertiesNV, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCooperativeMatrixPropertiesNV", e); }
    }

}
