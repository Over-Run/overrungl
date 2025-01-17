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
import java.util.*;
public class VKKHRPipelineExecutableProperties {
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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPipelineExecutablePropertiesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPipelineExecutableStatisticsKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetPipelineExecutableInternalRepresentationsKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkGetPipelineExecutablePropertiesKHR,
            FD_vkGetPipelineExecutableStatisticsKHR,
            FD_vkGetPipelineExecutableInternalRepresentationsKHR
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPipelineExecutablePropertiesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineExecutablePropertiesKHR);
        public static final MethodHandle MH_vkGetPipelineExecutableStatisticsKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineExecutableStatisticsKHR);
        public static final MethodHandle MH_vkGetPipelineExecutableInternalRepresentationsKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPipelineExecutableInternalRepresentationsKHR);
        public final MemorySegment PFN_vkGetPipelineExecutablePropertiesKHR;
        public final MemorySegment PFN_vkGetPipelineExecutableStatisticsKHR;
        public final MemorySegment PFN_vkGetPipelineExecutableInternalRepresentationsKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPipelineExecutablePropertiesKHR = func.invoke(device, "vkGetPipelineExecutablePropertiesKHR");
            PFN_vkGetPipelineExecutableStatisticsKHR = func.invoke(device, "vkGetPipelineExecutableStatisticsKHR");
            PFN_vkGetPipelineExecutableInternalRepresentationsKHR = func.invoke(device, "vkGetPipelineExecutableInternalRepresentationsKHR");
        }
    }

    public VKKHRPipelineExecutableProperties(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPipelineExecutablePropertiesKHR(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineInfoKHR *") MemorySegment pPipelineInfo, @CType("uint32_t *") MemorySegment pExecutableCount, @CType("VkPipelineExecutablePropertiesKHR *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineExecutablePropertiesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineExecutablePropertiesKHR");
        try { return (int) Handles.MH_vkGetPipelineExecutablePropertiesKHR.invokeExact(handles.PFN_vkGetPipelineExecutablePropertiesKHR, device, pPipelineInfo, pExecutableCount, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutablePropertiesKHR", e); }
    }

    public @CType("VkResult") int GetPipelineExecutableStatisticsKHR(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineExecutableInfoKHR *") MemorySegment pExecutableInfo, @CType("uint32_t *") MemorySegment pStatisticCount, @CType("VkPipelineExecutableStatisticKHR *") MemorySegment pStatistics) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineExecutableStatisticsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineExecutableStatisticsKHR");
        try { return (int) Handles.MH_vkGetPipelineExecutableStatisticsKHR.invokeExact(handles.PFN_vkGetPipelineExecutableStatisticsKHR, device, pExecutableInfo, pStatisticCount, pStatistics); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutableStatisticsKHR", e); }
    }

    public @CType("VkResult") int GetPipelineExecutableInternalRepresentationsKHR(@CType("VkDevice") MemorySegment device, @CType("const VkPipelineExecutableInfoKHR *") MemorySegment pExecutableInfo, @CType("uint32_t *") MemorySegment pInternalRepresentationCount, @CType("VkPipelineExecutableInternalRepresentationKHR *") MemorySegment pInternalRepresentations) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPipelineExecutableInternalRepresentationsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPipelineExecutableInternalRepresentationsKHR");
        try { return (int) Handles.MH_vkGetPipelineExecutableInternalRepresentationsKHR.invokeExact(handles.PFN_vkGetPipelineExecutableInternalRepresentationsKHR, device, pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPipelineExecutableInternalRepresentationsKHR", e); }
    }

}
