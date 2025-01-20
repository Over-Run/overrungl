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
import static overrungl.vulkan.khr.VKKHRFragmentShadingRate.*;
public class VKKHRFragmentShadingRate {
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
    public static final int VK_PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = VK_PIPELINE_CREATE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetPhysicalDeviceFragmentShadingRatesKHR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetFragmentShadingRateKHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetPhysicalDeviceFragmentShadingRatesKHR = RuntimeHelper.downcall(Descriptors.FD_vkGetPhysicalDeviceFragmentShadingRatesKHR);
        public static final MethodHandle MH_vkCmdSetFragmentShadingRateKHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetFragmentShadingRateKHR);
        public final MemorySegment PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR;
        public final MemorySegment PFN_vkCmdSetFragmentShadingRateKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR = func.invoke(device, "vkGetPhysicalDeviceFragmentShadingRatesKHR");
            PFN_vkCmdSetFragmentShadingRateKHR = func.invoke(device, "vkCmdSetFragmentShadingRateKHR");
        }
    }

    public VKKHRFragmentShadingRate(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int GetPhysicalDeviceFragmentShadingRatesKHR(@CType("VkPhysicalDevice") MemorySegment physicalDevice, @CType("uint32_t *") MemorySegment pFragmentShadingRateCount, @CType("VkPhysicalDeviceFragmentShadingRateKHR *") MemorySegment pFragmentShadingRates) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetPhysicalDeviceFragmentShadingRatesKHR");
        try { return (int) Handles.MH_vkGetPhysicalDeviceFragmentShadingRatesKHR.invokeExact(handles.PFN_vkGetPhysicalDeviceFragmentShadingRatesKHR, physicalDevice, pFragmentShadingRateCount, pFragmentShadingRates); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPhysicalDeviceFragmentShadingRatesKHR", e); }
    }

    public void CmdSetFragmentShadingRateKHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkExtent2D *") MemorySegment pFragmentSize, @CType("const VkFragmentShadingRateCombinerOpKHR [2]") int combinerOps) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetFragmentShadingRateKHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFragmentShadingRateKHR");
        try { Handles.MH_vkCmdSetFragmentShadingRateKHR.invokeExact(handles.PFN_vkCmdSetFragmentShadingRateKHR, commandBuffer, pFragmentSize, combinerOps); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFragmentShadingRateKHR", e); }
    }

}
