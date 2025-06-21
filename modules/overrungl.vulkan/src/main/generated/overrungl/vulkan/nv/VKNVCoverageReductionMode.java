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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVCoverageReductionMode {
    public static final int VK_COVERAGE_REDUCTION_MODE_MERGE_NV = 0;
    public static final int VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;
    public static final int VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION = 1;
    public static final String VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV = 1000250000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV = 1000250001;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV = 1000250002;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVCoverageReductionMode() {}

    /// ```
    /// (int) VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pCombinationCount, VkFramebufferMixedSamplesCombinationNV* pCombinations);
    /// ```
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, MemorySegment pCombinationCount, MemorySegment pCombinations) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV");
        try { return (int) Handles.MH_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV, physicalDevice.segment(), pCombinationCount, pCombinations); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", e); }
    }

}
