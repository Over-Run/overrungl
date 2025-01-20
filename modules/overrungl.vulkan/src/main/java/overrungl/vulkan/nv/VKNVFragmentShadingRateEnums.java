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
public class VKNVFragmentShadingRateEnums {
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
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetFragmentShadingRateEnumNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetFragmentShadingRateEnumNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetFragmentShadingRateEnumNV);
        public final MemorySegment PFN_vkCmdSetFragmentShadingRateEnumNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetFragmentShadingRateEnumNV = func.invoke(device, "vkCmdSetFragmentShadingRateEnumNV");
        }
    }

    public VKNVFragmentShadingRateEnums(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetFragmentShadingRateEnumNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkFragmentShadingRateNV") int shadingRate, @CType("const VkFragmentShadingRateCombinerOpKHR [2]") int combinerOps) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetFragmentShadingRateEnumNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFragmentShadingRateEnumNV");
        try { Handles.MH_vkCmdSetFragmentShadingRateEnumNV.invokeExact(handles.PFN_vkCmdSetFragmentShadingRateEnumNV, commandBuffer, shadingRate, combinerOps); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFragmentShadingRateEnumNV", e); }
    }

}
