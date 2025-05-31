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
public final class VKKHRPipelineExecutableProperties {
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR = 0;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR = 1;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR = 2;
    public static final int VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR = 3;
    public static final int VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_SPEC_VERSION = 1;
    public static final String VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME = "VK_KHR_pipeline_executable_properties";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR = 1000269000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR = 1000269001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR = 1000269002;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR = 1000269003;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR = 1000269004;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR = 1000269005;
    public static final int VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR = 0x00000040;
    public static final int VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x00000080;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineExecutablePropertiesKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineExecutableStatisticsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetPipelineExecutableInternalRepresentationsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRPipelineExecutableProperties() {}

    /// ```
    /// (int) VkResult vkGetPipelineExecutablePropertiesKHR((struct VkDevice*) VkDevice device, const VkPipelineInfoKHR* pPipelineInfo, uint32_t* pExecutableCount, VkPipelineExecutablePropertiesKHR* pProperties);
    /// ```
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, MemorySegment pPipelineInfo, MemorySegment pExecutableCount, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineExecutablePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineExecutablePropertiesKHR");
        try { return (int) Handles.MH_vkGetPipelineExecutablePropertiesKHR.invokeExact(device.capabilities().PFN_vkGetPipelineExecutablePropertiesKHR, device.segment(), pPipelineInfo, pExecutableCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutablePropertiesKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPipelineExecutableStatisticsKHR((struct VkDevice*) VkDevice device, const VkPipelineExecutableInfoKHR* pExecutableInfo, uint32_t* pStatisticCount, VkPipelineExecutableStatisticKHR* pStatistics);
    /// ```
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, MemorySegment pExecutableInfo, MemorySegment pStatisticCount, MemorySegment pStatistics) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineExecutableStatisticsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineExecutableStatisticsKHR");
        try { return (int) Handles.MH_vkGetPipelineExecutableStatisticsKHR.invokeExact(device.capabilities().PFN_vkGetPipelineExecutableStatisticsKHR, device.segment(), pExecutableInfo, pStatisticCount, pStatistics); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutableStatisticsKHR", e); }
    }

    /// ```
    /// (int) VkResult vkGetPipelineExecutableInternalRepresentationsKHR((struct VkDevice*) VkDevice device, const VkPipelineExecutableInfoKHR* pExecutableInfo, uint32_t* pInternalRepresentationCount, VkPipelineExecutableInternalRepresentationKHR* pInternalRepresentations);
    /// ```
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, MemorySegment pExecutableInfo, MemorySegment pInternalRepresentationCount, MemorySegment pInternalRepresentations) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPipelineExecutableInternalRepresentationsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineExecutableInternalRepresentationsKHR");
        try { return (int) Handles.MH_vkGetPipelineExecutableInternalRepresentationsKHR.invokeExact(device.capabilities().PFN_vkGetPipelineExecutableInternalRepresentationsKHR, device.segment(), pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutableInternalRepresentationsKHR", e); }
    }

}
