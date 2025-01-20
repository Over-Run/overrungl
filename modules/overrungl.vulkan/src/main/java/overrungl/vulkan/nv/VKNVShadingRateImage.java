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
import static overrungl.vulkan.khr.VKKHRFragmentShadingRate.*;
public class VKNVShadingRateImage {
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV = 0;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV = 1;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV = 2;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV = 3;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV = 4;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV = 5;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV = 6;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV = 7;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV = 8;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV = 9;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV = 10;
    public static final int VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV = 11;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_DEFAULT_NV = 0;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_CUSTOM_NV = 1;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_PIXEL_MAJOR_NV = 2;
    public static final int VK_COARSE_SAMPLE_ORDER_TYPE_SAMPLE_MAJOR_NV = 3;
    public static final int VK_NV_SHADING_RATE_IMAGE_SPEC_VERSION = 3;
    public static final String VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME = "VK_NV_shading_rate_image";
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV = 1000164000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV = 1000164001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV = 1000164002;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV = 1000164004;
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV = 1000164005;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV = 1000164006;
    public static final int VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV = VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR;
    public static final int VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV = VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR;
    public static final int VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV = VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR;
    public static final int VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV = VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdBindShadingRateImageNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetViewportShadingRatePaletteNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetCoarseSampleOrderNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCmdBindShadingRateImageNV,
            FD_vkCmdSetViewportShadingRatePaletteNV,
            FD_vkCmdSetCoarseSampleOrderNV
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdBindShadingRateImageNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindShadingRateImageNV);
        public static final MethodHandle MH_vkCmdSetViewportShadingRatePaletteNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetViewportShadingRatePaletteNV);
        public static final MethodHandle MH_vkCmdSetCoarseSampleOrderNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoarseSampleOrderNV);
        public final MemorySegment PFN_vkCmdBindShadingRateImageNV;
        public final MemorySegment PFN_vkCmdSetViewportShadingRatePaletteNV;
        public final MemorySegment PFN_vkCmdSetCoarseSampleOrderNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdBindShadingRateImageNV = func.invoke(device, "vkCmdBindShadingRateImageNV");
            PFN_vkCmdSetViewportShadingRatePaletteNV = func.invoke(device, "vkCmdSetViewportShadingRatePaletteNV");
            PFN_vkCmdSetCoarseSampleOrderNV = func.invoke(device, "vkCmdSetCoarseSampleOrderNV");
        }
    }

    public VKNVShadingRateImage(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdBindShadingRateImageNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkImageView") MemorySegment imageView, @CType("VkImageLayout") int imageLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindShadingRateImageNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindShadingRateImageNV");
        try { Handles.MH_vkCmdBindShadingRateImageNV.invokeExact(handles.PFN_vkCmdBindShadingRateImageNV, commandBuffer, imageView, imageLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindShadingRateImageNV", e); }
    }

    public void CmdSetViewportShadingRatePaletteNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstViewport, @CType("uint32_t") int viewportCount, @CType("const VkShadingRatePaletteNV *") MemorySegment pShadingRatePalettes) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetViewportShadingRatePaletteNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportShadingRatePaletteNV");
        try { Handles.MH_vkCmdSetViewportShadingRatePaletteNV.invokeExact(handles.PFN_vkCmdSetViewportShadingRatePaletteNV, commandBuffer, firstViewport, viewportCount, pShadingRatePalettes); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportShadingRatePaletteNV", e); }
    }

    public void CmdSetCoarseSampleOrderNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCoarseSampleOrderTypeNV") int sampleOrderType, @CType("uint32_t") int customSampleOrderCount, @CType("const VkCoarseSampleOrderCustomNV *") MemorySegment pCustomSampleOrders) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoarseSampleOrderNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoarseSampleOrderNV");
        try { Handles.MH_vkCmdSetCoarseSampleOrderNV.invokeExact(handles.PFN_vkCmdSetCoarseSampleOrderNV, commandBuffer, sampleOrderType, customSampleOrderCount, pCustomSampleOrders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoarseSampleOrderNV", e); }
    }

}
