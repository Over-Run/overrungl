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
import java.util.*;
public class VKNVCooperativeMatrix2 {
    public static final int VK_NV_COOPERATIVE_MATRIX_2_SPEC_VERSION = 1;
    public static final String VK_NV_COOPERATIVE_MATRIX_2_EXTENSION_NAME = "VK_NV_cooperative_matrix2";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_FEATURES_NV = 1000593000;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV = 1000593001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV = 1000593002;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV);
        public final MemorySegment PFN_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV = func.invoke(device, "vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV");
        }
    }

    public VKNVCooperativeMatrix2(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pPropertyCount, @CType("VkCooperativeMatrixFlexibleDimensionsPropertiesNV *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV");
        try { return (int) Handles.MH_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV.invokeExact(handles.PFN_vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV, physicalDevice, pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV", e); }
    }

}
