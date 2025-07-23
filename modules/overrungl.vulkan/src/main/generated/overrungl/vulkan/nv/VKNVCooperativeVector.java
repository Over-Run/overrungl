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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVCooperativeVector {
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_ROW_MAJOR_NV = 0;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_COLUMN_MAJOR_NV = 1;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_INFERENCING_OPTIMAL_NV = 2;
    public static final int VK_COOPERATIVE_VECTOR_MATRIX_LAYOUT_TRAINING_OPTIMAL_NV = 3;
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
    public static final int VK_NV_COOPERATIVE_VECTOR_SPEC_VERSION = 4;
    public static final String VK_NV_COOPERATIVE_VECTOR_EXTENSION_NAME = "VK_NV_cooperative_vector";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV = 1000491000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491001;
    public static final int VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV = 1000491002;
    public static final int VK_STRUCTURE_TYPE_CONVERT_COOPERATIVE_VECTOR_MATRIX_INFO_NV = 1000491004;
    public static final int VK_COMPONENT_TYPE_SINT8_PACKED_NV = 1000491000;
    public static final int VK_COMPONENT_TYPE_UINT8_PACKED_NV = 1000491001;
    public static final int VK_COMPONENT_TYPE_FLOAT_E4M3_NV = 1000567002;
    public static final int VK_COMPONENT_TYPE_FLOAT_E5M2_NV = 1000567003;
    public static final long VK_PIPELINE_STAGE_2_CONVERT_COOPERATIVE_VECTOR_MATRIX_BIT_NV = 0x100000000000L;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceCooperativeVectorPropertiesNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkConvertCooperativeVectorMatrixNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdConvertCooperativeVectorMatrixNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCooperativeVector() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceCooperativeVectorPropertiesNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pPropertyCount, VkCooperativeVectorPropertiesNV* pProperties);
    /// ```
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCooperativeVectorPropertiesNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceCooperativeVectorPropertiesNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceCooperativeVectorPropertiesNV", physicalDevice, pPropertyCount, pProperties); }
        return (int) Handles.MH_vkGetPhysicalDeviceCooperativeVectorPropertiesNV.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceCooperativeVectorPropertiesNV, physicalDevice.segment(), pPropertyCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceCooperativeVectorPropertiesNV", e); }
    }

    /// ```
    /// (int) VkResult vkConvertCooperativeVectorMatrixNV((struct VkDevice*) VkDevice device, const VkConvertCooperativeVectorMatrixInfoNV* pInfo);
    /// ```
    public static int vkConvertCooperativeVectorMatrixNV(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkConvertCooperativeVectorMatrixNV)) throw new VKSymbolNotFoundError("Symbol not found: vkConvertCooperativeVectorMatrixNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkConvertCooperativeVectorMatrixNV", device, pInfo); }
        return (int) Handles.MH_vkConvertCooperativeVectorMatrixNV.invokeExact(device.capabilities().PFN_vkConvertCooperativeVectorMatrixNV, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkConvertCooperativeVectorMatrixNV", e); }
    }

    /// ```
    /// void vkCmdConvertCooperativeVectorMatrixNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t infoCount, const VkConvertCooperativeVectorMatrixInfoNV* pInfos);
    /// ```
    public static void vkCmdConvertCooperativeVectorMatrixNV(VkCommandBuffer commandBuffer, int infoCount, MemorySegment pInfos) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdConvertCooperativeVectorMatrixNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdConvertCooperativeVectorMatrixNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdConvertCooperativeVectorMatrixNV", commandBuffer, infoCount, pInfos); }
        Handles.MH_vkCmdConvertCooperativeVectorMatrixNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdConvertCooperativeVectorMatrixNV, commandBuffer.segment(), infoCount, pInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdConvertCooperativeVectorMatrixNV", e); }
    }

}
