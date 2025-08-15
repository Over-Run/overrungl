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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_fragment_shading_rate` - device extension
public final class VKKHRFragmentShadingRate {
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR = 2;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR = 3;
    public static final int VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR = 4;
    public static final int VK_KHR_FRAGMENT_SHADING_RATE_SPEC_VERSION = 2;
    public static final String VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME = "VK_KHR_fragment_shading_rate";
    public static final int VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR = 1000226003;
    public static final int VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR = 1000226000;
    public static final int VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR = 1000226000;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR = 1000226001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR = 1000226002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR = 1000226003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR = 1000226004;
    public static final int VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x00800000;
    public static final int VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00000100;
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00400000;
    public static final int VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x40000000;
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x40000000L;
    public static final int VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR = 1000226006;
    public static final int VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00200000;
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x00200000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceFragmentShadingRatesKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetFragmentShadingRateKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRFragmentShadingRate() {}

    /// Invokes `vkGetPhysicalDeviceFragmentShadingRatesKHR`.
    /// ```
    /// (int) VkResult vkGetPhysicalDeviceFragmentShadingRatesKHR((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, uint32_t* pFragmentShadingRateCount, VkPhysicalDeviceFragmentShadingRateKHR* pFragmentShadingRates);
    /// ```
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(@NonNull VkPhysicalDevice physicalDevice, @NonNull MemorySegment pFragmentShadingRateCount, @NonNull MemorySegment pFragmentShadingRates) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFragmentShadingRatesKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPhysicalDeviceFragmentShadingRatesKHR", physicalDevice, pFragmentShadingRateCount, pFragmentShadingRates); }
        return (int) Handles.MH_vkGetPhysicalDeviceFragmentShadingRatesKHR.invokeExact(physicalDevice.capabilities().PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR, physicalDevice.segment(), pFragmentShadingRateCount, pFragmentShadingRates); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFragmentShadingRatesKHR", e); }
    }

    /// Invokes `vkCmdSetFragmentShadingRateKHR`.
    /// ```
    /// void vkCmdSetFragmentShadingRateKHR((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, const VkExtent2D* pFragmentSize, (int) VkFragmentShadingRateCombinerOpKHR combinerOps[2]);
    /// ```
    public static void vkCmdSetFragmentShadingRateKHR(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pFragmentSize, @NonNull MemorySegment combinerOps) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetFragmentShadingRateKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetFragmentShadingRateKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetFragmentShadingRateKHR", commandBuffer, pFragmentSize, combinerOps); }
        Handles.MH_vkCmdSetFragmentShadingRateKHR.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetFragmentShadingRateKHR, commandBuffer.segment(), pFragmentSize, combinerOps); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFragmentShadingRateKHR", e); }
    }

}
