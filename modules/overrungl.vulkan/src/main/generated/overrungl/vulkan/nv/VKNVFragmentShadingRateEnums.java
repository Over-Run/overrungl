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
public final class VKNVFragmentShadingRateEnums {
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV = 1;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV = 4;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV = 5;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV = 6;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV = 9;
    public static final int VK_FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV = 10;
    public static final int VK_FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV = 11;
    public static final int VK_FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV = 12;
    public static final int VK_FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV = 13;
    public static final int VK_FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV = 14;
    public static final int VK_FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV = 15;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV = 0;
    public static final int VK_FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV = 1;
    public static final int VK_NV_FRAGMENT_SHADING_RATE_ENUMS_SPEC_VERSION = 1;
    public static final String VK_NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME = "VK_NV_fragment_shading_rate_enums";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV = 1000326000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV = 1000326001;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV = 1000326002;
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetFragmentShadingRateEnumNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVFragmentShadingRateEnums() {}

    /// ```
    /// void vkCmdSetFragmentShadingRateEnumNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkFragmentShadingRateNV shadingRate, (int) VkFragmentShadingRateCombinerOpKHR combinerOps[2]);
    /// ```
    public static void vkCmdSetFragmentShadingRateEnumNV(VkCommandBuffer commandBuffer, int shadingRate, MemorySegment combinerOps) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetFragmentShadingRateEnumNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetFragmentShadingRateEnumNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetFragmentShadingRateEnumNV", commandBuffer, shadingRate, combinerOps); }
        Handles.MH_vkCmdSetFragmentShadingRateEnumNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetFragmentShadingRateEnumNV, commandBuffer.segment(), shadingRate, combinerOps); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFragmentShadingRateEnumNV", e); }
    }

}
