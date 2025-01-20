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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKEXTExtendedDynamicState3 {
    public static final int VK_EXT_EXTENDED_DYNAMIC_STATE_3_SPEC_VERSION = 2;
    public static final String VK_EXT_EXTENDED_DYNAMIC_STATE_3_EXTENSION_NAME = "VK_EXT_extended_dynamic_state3";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT = 1000455000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_PROPERTIES_EXT = 1000455001;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLAMP_ENABLE_EXT = 1000455003;
    public static final int VK_DYNAMIC_STATE_POLYGON_MODE_EXT = 1000455004;
    public static final int VK_DYNAMIC_STATE_RASTERIZATION_SAMPLES_EXT = 1000455005;
    public static final int VK_DYNAMIC_STATE_SAMPLE_MASK_EXT = 1000455006;
    public static final int VK_DYNAMIC_STATE_ALPHA_TO_COVERAGE_ENABLE_EXT = 1000455007;
    public static final int VK_DYNAMIC_STATE_ALPHA_TO_ONE_ENABLE_EXT = 1000455008;
    public static final int VK_DYNAMIC_STATE_LOGIC_OP_ENABLE_EXT = 1000455009;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_ENABLE_EXT = 1000455010;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_EQUATION_EXT = 1000455011;
    public static final int VK_DYNAMIC_STATE_COLOR_WRITE_MASK_EXT = 1000455012;
    public static final int VK_DYNAMIC_STATE_TESSELLATION_DOMAIN_ORIGIN_EXT = 1000455002;
    public static final int VK_DYNAMIC_STATE_RASTERIZATION_STREAM_EXT = 1000455013;
    public static final int VK_DYNAMIC_STATE_CONSERVATIVE_RASTERIZATION_MODE_EXT = 1000455014;
    public static final int VK_DYNAMIC_STATE_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = 1000455015;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLIP_ENABLE_EXT = 1000455016;
    public static final int VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_ENABLE_EXT = 1000455017;
    public static final int VK_DYNAMIC_STATE_COLOR_BLEND_ADVANCED_EXT = 1000455018;
    public static final int VK_DYNAMIC_STATE_PROVOKING_VERTEX_MODE_EXT = 1000455019;
    public static final int VK_DYNAMIC_STATE_LINE_RASTERIZATION_MODE_EXT = 1000455020;
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_ENABLE_EXT = 1000455021;
    public static final int VK_DYNAMIC_STATE_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT = 1000455022;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_ENABLE_NV = 1000455023;
    public static final int VK_DYNAMIC_STATE_VIEWPORT_SWIZZLE_NV = 1000455024;
    public static final int VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_ENABLE_NV = 1000455025;
    public static final int VK_DYNAMIC_STATE_COVERAGE_TO_COLOR_LOCATION_NV = 1000455026;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_MODE_NV = 1000455027;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_ENABLE_NV = 1000455028;
    public static final int VK_DYNAMIC_STATE_COVERAGE_MODULATION_TABLE_NV = 1000455029;
    public static final int VK_DYNAMIC_STATE_SHADING_RATE_IMAGE_ENABLE_NV = 1000455030;
    public static final int VK_DYNAMIC_STATE_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV = 1000455031;
    public static final int VK_DYNAMIC_STATE_COVERAGE_REDUCTION_MODE_NV = 1000455032;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdSetDepthClampEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetPolygonModeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetRasterizationSamplesEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetSampleMaskEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetAlphaToCoverageEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetAlphaToOneEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetLogicOpEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetColorBlendEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetColorBlendEquationEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetColorWriteMaskEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetTessellationDomainOriginEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetRasterizationStreamEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetConservativeRasterizationModeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetExtraPrimitiveOverestimationSizeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_vkCmdSetDepthClipEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetSampleLocationsEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetColorBlendAdvancedEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetProvokingVertexModeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetLineRasterizationModeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetLineStippleEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetDepthClipNegativeOneToOneEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetViewportWScalingEnableNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetViewportSwizzleNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetCoverageToColorEnableNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetCoverageToColorLocationNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetCoverageModulationModeNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetCoverageModulationTableEnableNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetCoverageModulationTableNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetShadingRateImageEnableNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetRepresentativeFragmentTestEnableNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetCoverageReductionModeNV = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetDepthClampEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthClampEnableEXT);
        public static final MethodHandle MH_vkCmdSetPolygonModeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetPolygonModeEXT);
        public static final MethodHandle MH_vkCmdSetRasterizationSamplesEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetRasterizationSamplesEXT);
        public static final MethodHandle MH_vkCmdSetSampleMaskEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetSampleMaskEXT);
        public static final MethodHandle MH_vkCmdSetAlphaToCoverageEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetAlphaToCoverageEnableEXT);
        public static final MethodHandle MH_vkCmdSetAlphaToOneEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetAlphaToOneEnableEXT);
        public static final MethodHandle MH_vkCmdSetLogicOpEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetLogicOpEnableEXT);
        public static final MethodHandle MH_vkCmdSetColorBlendEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetColorBlendEnableEXT);
        public static final MethodHandle MH_vkCmdSetColorBlendEquationEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetColorBlendEquationEXT);
        public static final MethodHandle MH_vkCmdSetColorWriteMaskEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetColorWriteMaskEXT);
        public static final MethodHandle MH_vkCmdSetTessellationDomainOriginEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetTessellationDomainOriginEXT);
        public static final MethodHandle MH_vkCmdSetRasterizationStreamEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetRasterizationStreamEXT);
        public static final MethodHandle MH_vkCmdSetConservativeRasterizationModeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetConservativeRasterizationModeEXT);
        public static final MethodHandle MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetExtraPrimitiveOverestimationSizeEXT);
        public static final MethodHandle MH_vkCmdSetDepthClipEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthClipEnableEXT);
        public static final MethodHandle MH_vkCmdSetSampleLocationsEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetSampleLocationsEnableEXT);
        public static final MethodHandle MH_vkCmdSetColorBlendAdvancedEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetColorBlendAdvancedEXT);
        public static final MethodHandle MH_vkCmdSetProvokingVertexModeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetProvokingVertexModeEXT);
        public static final MethodHandle MH_vkCmdSetLineRasterizationModeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetLineRasterizationModeEXT);
        public static final MethodHandle MH_vkCmdSetLineStippleEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetLineStippleEnableEXT);
        public static final MethodHandle MH_vkCmdSetDepthClipNegativeOneToOneEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthClipNegativeOneToOneEXT);
        public static final MethodHandle MH_vkCmdSetViewportWScalingEnableNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetViewportWScalingEnableNV);
        public static final MethodHandle MH_vkCmdSetViewportSwizzleNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetViewportSwizzleNV);
        public static final MethodHandle MH_vkCmdSetCoverageToColorEnableNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoverageToColorEnableNV);
        public static final MethodHandle MH_vkCmdSetCoverageToColorLocationNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoverageToColorLocationNV);
        public static final MethodHandle MH_vkCmdSetCoverageModulationModeNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoverageModulationModeNV);
        public static final MethodHandle MH_vkCmdSetCoverageModulationTableEnableNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoverageModulationTableEnableNV);
        public static final MethodHandle MH_vkCmdSetCoverageModulationTableNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoverageModulationTableNV);
        public static final MethodHandle MH_vkCmdSetShadingRateImageEnableNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetShadingRateImageEnableNV);
        public static final MethodHandle MH_vkCmdSetRepresentativeFragmentTestEnableNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetRepresentativeFragmentTestEnableNV);
        public static final MethodHandle MH_vkCmdSetCoverageReductionModeNV = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCoverageReductionModeNV);
        public final MemorySegment PFN_vkCmdSetDepthClampEnableEXT;
        public final MemorySegment PFN_vkCmdSetPolygonModeEXT;
        public final MemorySegment PFN_vkCmdSetRasterizationSamplesEXT;
        public final MemorySegment PFN_vkCmdSetSampleMaskEXT;
        public final MemorySegment PFN_vkCmdSetAlphaToCoverageEnableEXT;
        public final MemorySegment PFN_vkCmdSetAlphaToOneEnableEXT;
        public final MemorySegment PFN_vkCmdSetLogicOpEnableEXT;
        public final MemorySegment PFN_vkCmdSetColorBlendEnableEXT;
        public final MemorySegment PFN_vkCmdSetColorBlendEquationEXT;
        public final MemorySegment PFN_vkCmdSetColorWriteMaskEXT;
        public final MemorySegment PFN_vkCmdSetTessellationDomainOriginEXT;
        public final MemorySegment PFN_vkCmdSetRasterizationStreamEXT;
        public final MemorySegment PFN_vkCmdSetConservativeRasterizationModeEXT;
        public final MemorySegment PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT;
        public final MemorySegment PFN_vkCmdSetDepthClipEnableEXT;
        public final MemorySegment PFN_vkCmdSetSampleLocationsEnableEXT;
        public final MemorySegment PFN_vkCmdSetColorBlendAdvancedEXT;
        public final MemorySegment PFN_vkCmdSetProvokingVertexModeEXT;
        public final MemorySegment PFN_vkCmdSetLineRasterizationModeEXT;
        public final MemorySegment PFN_vkCmdSetLineStippleEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthClipNegativeOneToOneEXT;
        public final MemorySegment PFN_vkCmdSetViewportWScalingEnableNV;
        public final MemorySegment PFN_vkCmdSetViewportSwizzleNV;
        public final MemorySegment PFN_vkCmdSetCoverageToColorEnableNV;
        public final MemorySegment PFN_vkCmdSetCoverageToColorLocationNV;
        public final MemorySegment PFN_vkCmdSetCoverageModulationModeNV;
        public final MemorySegment PFN_vkCmdSetCoverageModulationTableEnableNV;
        public final MemorySegment PFN_vkCmdSetCoverageModulationTableNV;
        public final MemorySegment PFN_vkCmdSetShadingRateImageEnableNV;
        public final MemorySegment PFN_vkCmdSetRepresentativeFragmentTestEnableNV;
        public final MemorySegment PFN_vkCmdSetCoverageReductionModeNV;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdSetDepthClampEnableEXT = func.invoke(device, "vkCmdSetDepthClampEnableEXT");
            PFN_vkCmdSetPolygonModeEXT = func.invoke(device, "vkCmdSetPolygonModeEXT");
            PFN_vkCmdSetRasterizationSamplesEXT = func.invoke(device, "vkCmdSetRasterizationSamplesEXT");
            PFN_vkCmdSetSampleMaskEXT = func.invoke(device, "vkCmdSetSampleMaskEXT");
            PFN_vkCmdSetAlphaToCoverageEnableEXT = func.invoke(device, "vkCmdSetAlphaToCoverageEnableEXT");
            PFN_vkCmdSetAlphaToOneEnableEXT = func.invoke(device, "vkCmdSetAlphaToOneEnableEXT");
            PFN_vkCmdSetLogicOpEnableEXT = func.invoke(device, "vkCmdSetLogicOpEnableEXT");
            PFN_vkCmdSetColorBlendEnableEXT = func.invoke(device, "vkCmdSetColorBlendEnableEXT");
            PFN_vkCmdSetColorBlendEquationEXT = func.invoke(device, "vkCmdSetColorBlendEquationEXT");
            PFN_vkCmdSetColorWriteMaskEXT = func.invoke(device, "vkCmdSetColorWriteMaskEXT");
            PFN_vkCmdSetTessellationDomainOriginEXT = func.invoke(device, "vkCmdSetTessellationDomainOriginEXT");
            PFN_vkCmdSetRasterizationStreamEXT = func.invoke(device, "vkCmdSetRasterizationStreamEXT");
            PFN_vkCmdSetConservativeRasterizationModeEXT = func.invoke(device, "vkCmdSetConservativeRasterizationModeEXT");
            PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT = func.invoke(device, "vkCmdSetExtraPrimitiveOverestimationSizeEXT");
            PFN_vkCmdSetDepthClipEnableEXT = func.invoke(device, "vkCmdSetDepthClipEnableEXT");
            PFN_vkCmdSetSampleLocationsEnableEXT = func.invoke(device, "vkCmdSetSampleLocationsEnableEXT");
            PFN_vkCmdSetColorBlendAdvancedEXT = func.invoke(device, "vkCmdSetColorBlendAdvancedEXT");
            PFN_vkCmdSetProvokingVertexModeEXT = func.invoke(device, "vkCmdSetProvokingVertexModeEXT");
            PFN_vkCmdSetLineRasterizationModeEXT = func.invoke(device, "vkCmdSetLineRasterizationModeEXT");
            PFN_vkCmdSetLineStippleEnableEXT = func.invoke(device, "vkCmdSetLineStippleEnableEXT");
            PFN_vkCmdSetDepthClipNegativeOneToOneEXT = func.invoke(device, "vkCmdSetDepthClipNegativeOneToOneEXT");
            PFN_vkCmdSetViewportWScalingEnableNV = func.invoke(device, "vkCmdSetViewportWScalingEnableNV");
            PFN_vkCmdSetViewportSwizzleNV = func.invoke(device, "vkCmdSetViewportSwizzleNV");
            PFN_vkCmdSetCoverageToColorEnableNV = func.invoke(device, "vkCmdSetCoverageToColorEnableNV");
            PFN_vkCmdSetCoverageToColorLocationNV = func.invoke(device, "vkCmdSetCoverageToColorLocationNV");
            PFN_vkCmdSetCoverageModulationModeNV = func.invoke(device, "vkCmdSetCoverageModulationModeNV");
            PFN_vkCmdSetCoverageModulationTableEnableNV = func.invoke(device, "vkCmdSetCoverageModulationTableEnableNV");
            PFN_vkCmdSetCoverageModulationTableNV = func.invoke(device, "vkCmdSetCoverageModulationTableNV");
            PFN_vkCmdSetShadingRateImageEnableNV = func.invoke(device, "vkCmdSetShadingRateImageEnableNV");
            PFN_vkCmdSetRepresentativeFragmentTestEnableNV = func.invoke(device, "vkCmdSetRepresentativeFragmentTestEnableNV");
            PFN_vkCmdSetCoverageReductionModeNV = func.invoke(device, "vkCmdSetCoverageReductionModeNV");
        }
    }

    public VKEXTExtendedDynamicState3(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdSetDepthClampEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthClampEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthClampEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampEnableEXT");
        try { Handles.MH_vkCmdSetDepthClampEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthClampEnableEXT, commandBuffer, depthClampEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampEnableEXT", e); }
    }

    public void CmdSetPolygonModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPolygonMode") int polygonMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetPolygonModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPolygonModeEXT");
        try { Handles.MH_vkCmdSetPolygonModeEXT.invokeExact(handles.PFN_vkCmdSetPolygonModeEXT, commandBuffer, polygonMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPolygonModeEXT", e); }
    }

    public void CmdSetRasterizationSamplesEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkSampleCountFlagBits") int rasterizationSamples) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRasterizationSamplesEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationSamplesEXT");
        try { Handles.MH_vkCmdSetRasterizationSamplesEXT.invokeExact(handles.PFN_vkCmdSetRasterizationSamplesEXT, commandBuffer, rasterizationSamples); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationSamplesEXT", e); }
    }

    public void CmdSetSampleMaskEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkSampleCountFlagBits") int samples, @CType("const VkSampleMask *") MemorySegment pSampleMask) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetSampleMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleMaskEXT");
        try { Handles.MH_vkCmdSetSampleMaskEXT.invokeExact(handles.PFN_vkCmdSetSampleMaskEXT, commandBuffer, samples, pSampleMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleMaskEXT", e); }
    }

    public void CmdSetAlphaToCoverageEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int alphaToCoverageEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetAlphaToCoverageEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToCoverageEnableEXT");
        try { Handles.MH_vkCmdSetAlphaToCoverageEnableEXT.invokeExact(handles.PFN_vkCmdSetAlphaToCoverageEnableEXT, commandBuffer, alphaToCoverageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToCoverageEnableEXT", e); }
    }

    public void CmdSetAlphaToOneEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int alphaToOneEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetAlphaToOneEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToOneEnableEXT");
        try { Handles.MH_vkCmdSetAlphaToOneEnableEXT.invokeExact(handles.PFN_vkCmdSetAlphaToOneEnableEXT, commandBuffer, alphaToOneEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToOneEnableEXT", e); }
    }

    public void CmdSetLogicOpEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int logicOpEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetLogicOpEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEnableEXT");
        try { Handles.MH_vkCmdSetLogicOpEnableEXT.invokeExact(handles.PFN_vkCmdSetLogicOpEnableEXT, commandBuffer, logicOpEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEnableEXT", e); }
    }

    public void CmdSetColorBlendEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkBool32 *") MemorySegment pColorBlendEnables) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetColorBlendEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEnableEXT");
        try { Handles.MH_vkCmdSetColorBlendEnableEXT.invokeExact(handles.PFN_vkCmdSetColorBlendEnableEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEnableEXT", e); }
    }

    public void CmdSetColorBlendEquationEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkColorBlendEquationEXT *") MemorySegment pColorBlendEquations) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetColorBlendEquationEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEquationEXT");
        try { Handles.MH_vkCmdSetColorBlendEquationEXT.invokeExact(handles.PFN_vkCmdSetColorBlendEquationEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendEquations); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEquationEXT", e); }
    }

    public void CmdSetColorWriteMaskEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkColorComponentFlags *") MemorySegment pColorWriteMasks) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetColorWriteMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorWriteMaskEXT");
        try { Handles.MH_vkCmdSetColorWriteMaskEXT.invokeExact(handles.PFN_vkCmdSetColorWriteMaskEXT, commandBuffer, firstAttachment, attachmentCount, pColorWriteMasks); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorWriteMaskEXT", e); }
    }

    public void CmdSetTessellationDomainOriginEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkTessellationDomainOrigin") int domainOrigin) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetTessellationDomainOriginEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { Handles.MH_vkCmdSetTessellationDomainOriginEXT.invokeExact(handles.PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer, domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetTessellationDomainOriginEXT", e); }
    }

    public void CmdSetRasterizationStreamEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int rasterizationStream) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRasterizationStreamEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationStreamEXT");
        try { Handles.MH_vkCmdSetRasterizationStreamEXT.invokeExact(handles.PFN_vkCmdSetRasterizationStreamEXT, commandBuffer, rasterizationStream); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationStreamEXT", e); }
    }

    public void CmdSetConservativeRasterizationModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetConservativeRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetConservativeRasterizationModeEXT");
        try { Handles.MH_vkCmdSetConservativeRasterizationModeEXT.invokeExact(handles.PFN_vkCmdSetConservativeRasterizationModeEXT, commandBuffer, conservativeRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetConservativeRasterizationModeEXT", e); }
    }

    public void CmdSetExtraPrimitiveOverestimationSizeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, float extraPrimitiveOverestimationSize) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        try { Handles.MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(handles.PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT, commandBuffer, extraPrimitiveOverestimationSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExtraPrimitiveOverestimationSizeEXT", e); }
    }

    public void CmdSetDepthClipEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthClipEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthClipEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipEnableEXT");
        try { Handles.MH_vkCmdSetDepthClipEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthClipEnableEXT, commandBuffer, depthClipEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipEnableEXT", e); }
    }

    public void CmdSetSampleLocationsEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int sampleLocationsEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetSampleLocationsEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEnableEXT");
        try { Handles.MH_vkCmdSetSampleLocationsEnableEXT.invokeExact(handles.PFN_vkCmdSetSampleLocationsEnableEXT, commandBuffer, sampleLocationsEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEnableEXT", e); }
    }

    public void CmdSetColorBlendAdvancedEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkColorBlendAdvancedEXT *") MemorySegment pColorBlendAdvanced) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetColorBlendAdvancedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendAdvancedEXT");
        try { Handles.MH_vkCmdSetColorBlendAdvancedEXT.invokeExact(handles.PFN_vkCmdSetColorBlendAdvancedEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendAdvanced); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendAdvancedEXT", e); }
    }

    public void CmdSetProvokingVertexModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkProvokingVertexModeEXT") int provokingVertexMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetProvokingVertexModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetProvokingVertexModeEXT");
        try { Handles.MH_vkCmdSetProvokingVertexModeEXT.invokeExact(handles.PFN_vkCmdSetProvokingVertexModeEXT, commandBuffer, provokingVertexMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetProvokingVertexModeEXT", e); }
    }

    public void CmdSetLineRasterizationModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkLineRasterizationModeEXT") int lineRasterizationMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetLineRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineRasterizationModeEXT");
        try { Handles.MH_vkCmdSetLineRasterizationModeEXT.invokeExact(handles.PFN_vkCmdSetLineRasterizationModeEXT, commandBuffer, lineRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineRasterizationModeEXT", e); }
    }

    public void CmdSetLineStippleEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int stippledLineEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetLineStippleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEnableEXT");
        try { Handles.MH_vkCmdSetLineStippleEnableEXT.invokeExact(handles.PFN_vkCmdSetLineStippleEnableEXT, commandBuffer, stippledLineEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleEnableEXT", e); }
    }

    public void CmdSetDepthClipNegativeOneToOneEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int negativeOneToOne) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthClipNegativeOneToOneEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipNegativeOneToOneEXT");
        try { Handles.MH_vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(handles.PFN_vkCmdSetDepthClipNegativeOneToOneEXT, commandBuffer, negativeOneToOne); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipNegativeOneToOneEXT", e); }
    }

    public void CmdSetViewportWScalingEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int viewportWScalingEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetViewportWScalingEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingEnableNV");
        try { Handles.MH_vkCmdSetViewportWScalingEnableNV.invokeExact(handles.PFN_vkCmdSetViewportWScalingEnableNV, commandBuffer, viewportWScalingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingEnableNV", e); }
    }

    public void CmdSetViewportSwizzleNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstViewport, @CType("uint32_t") int viewportCount, @CType("const VkViewportSwizzleNV *") MemorySegment pViewportSwizzles) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetViewportSwizzleNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportSwizzleNV");
        try { Handles.MH_vkCmdSetViewportSwizzleNV.invokeExact(handles.PFN_vkCmdSetViewportSwizzleNV, commandBuffer, firstViewport, viewportCount, pViewportSwizzles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportSwizzleNV", e); }
    }

    public void CmdSetCoverageToColorEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int coverageToColorEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoverageToColorEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorEnableNV");
        try { Handles.MH_vkCmdSetCoverageToColorEnableNV.invokeExact(handles.PFN_vkCmdSetCoverageToColorEnableNV, commandBuffer, coverageToColorEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorEnableNV", e); }
    }

    public void CmdSetCoverageToColorLocationNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int coverageToColorLocation) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoverageToColorLocationNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorLocationNV");
        try { Handles.MH_vkCmdSetCoverageToColorLocationNV.invokeExact(handles.PFN_vkCmdSetCoverageToColorLocationNV, commandBuffer, coverageToColorLocation); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorLocationNV", e); }
    }

    public void CmdSetCoverageModulationModeNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCoverageModulationModeNV") int coverageModulationMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoverageModulationModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationModeNV");
        try { Handles.MH_vkCmdSetCoverageModulationModeNV.invokeExact(handles.PFN_vkCmdSetCoverageModulationModeNV, commandBuffer, coverageModulationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationModeNV", e); }
    }

    public void CmdSetCoverageModulationTableEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int coverageModulationTableEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoverageModulationTableEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableEnableNV");
        try { Handles.MH_vkCmdSetCoverageModulationTableEnableNV.invokeExact(handles.PFN_vkCmdSetCoverageModulationTableEnableNV, commandBuffer, coverageModulationTableEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableEnableNV", e); }
    }

    public void CmdSetCoverageModulationTableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int coverageModulationTableCount, @CType("const float *") MemorySegment pCoverageModulationTable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoverageModulationTableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableNV");
        try { Handles.MH_vkCmdSetCoverageModulationTableNV.invokeExact(handles.PFN_vkCmdSetCoverageModulationTableNV, commandBuffer, coverageModulationTableCount, pCoverageModulationTable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableNV", e); }
    }

    public void CmdSetShadingRateImageEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int shadingRateImageEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetShadingRateImageEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetShadingRateImageEnableNV");
        try { Handles.MH_vkCmdSetShadingRateImageEnableNV.invokeExact(handles.PFN_vkCmdSetShadingRateImageEnableNV, commandBuffer, shadingRateImageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetShadingRateImageEnableNV", e); }
    }

    public void CmdSetRepresentativeFragmentTestEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int representativeFragmentTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRepresentativeFragmentTestEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRepresentativeFragmentTestEnableNV");
        try { Handles.MH_vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(handles.PFN_vkCmdSetRepresentativeFragmentTestEnableNV, commandBuffer, representativeFragmentTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRepresentativeFragmentTestEnableNV", e); }
    }

    public void CmdSetCoverageReductionModeNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCoverageReductionModeNV") int coverageReductionMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCoverageReductionModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageReductionModeNV");
        try { Handles.MH_vkCmdSetCoverageReductionModeNV.invokeExact(handles.PFN_vkCmdSetCoverageReductionModeNV, commandBuffer, coverageReductionMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageReductionModeNV", e); }
    }

}
