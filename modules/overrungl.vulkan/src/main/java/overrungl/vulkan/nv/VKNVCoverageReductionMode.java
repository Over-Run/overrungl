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
public class VKNVCoverageReductionMode {
    public static final int VK_COVERAGE_REDUCTION_MODE_MERGE_NV = 0;
    public static final int VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;
    public static final int VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION = 1;
    public static final String VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV = 1000250000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV = 1000250001;
    public static final int VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV = 1000250002;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV);
        public final MemorySegment PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV = func.invoke(device, "vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV");
        }
    }

    public VKNVCoverageReductionMode(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pCombinationCount, @CType("VkFramebufferMixedSamplesCombinationNV *") MemorySegment pCombinations) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV");
        try { return (int) Handles.MH_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV.invokeExact(handles.PFN_vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV, physicalDevice, pCombinationCount, pCombinations); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV", e); }
    }

}
