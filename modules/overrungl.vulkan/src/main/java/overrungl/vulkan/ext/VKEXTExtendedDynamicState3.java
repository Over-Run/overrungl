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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTExtendedDynamicState3 {
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
    public static final class Handles {
        public static final MethodHandle MH_vkCmdSetDepthClampEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPolygonModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizationSamplesEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetSampleMaskEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetAlphaToCoverageEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetAlphaToOneEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLogicOpEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetColorBlendEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetColorBlendEquationEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetColorWriteMaskEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetTessellationDomainOriginEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizationStreamEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetConservativeRasterizationModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetDepthClipEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetSampleLocationsEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetColorBlendAdvancedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetProvokingVertexModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLineRasterizationModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLineStippleEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthClipNegativeOneToOneEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWScalingEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportSwizzleNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetCoverageToColorEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageToColorLocationNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageModulationModeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageModulationTableEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageModulationTableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetShadingRateImageEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRepresentativeFragmentTestEnableNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageReductionModeNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        private Handles() {}
    }

    private VKEXTExtendedDynamicState3() {}

    /// ```
    /// void vkCmdSetDepthClampEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthClampEnable);
    /// ```
    public static void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, int depthClampEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClampEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampEnableEXT");
        try { Handles.MH_vkCmdSetDepthClampEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClampEnableEXT, commandBuffer.segment(), depthClampEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetPolygonModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPolygonMode polygonMode);
    /// ```
    public static void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, int polygonMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPolygonModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPolygonModeEXT");
        try { Handles.MH_vkCmdSetPolygonModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPolygonModeEXT, commandBuffer.segment(), polygonMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPolygonModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizationSamplesEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSampleCountFlagBits rasterizationSamples);
    /// ```
    public static void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, int rasterizationSamples) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizationSamplesEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationSamplesEXT");
        try { Handles.MH_vkCmdSetRasterizationSamplesEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizationSamplesEXT, commandBuffer.segment(), rasterizationSamples); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationSamplesEXT", e); }
    }

    /// ```
    /// void vkCmdSetSampleMaskEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSampleCountFlagBits samples, const VkSampleMask* pSampleMask);
    /// ```
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, int samples, MemorySegment pSampleMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleMaskEXT");
        try { Handles.MH_vkCmdSetSampleMaskEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleMaskEXT, commandBuffer.segment(), samples, pSampleMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleMaskEXT", e); }
    }

    /// ```
    /// void vkCmdSetAlphaToCoverageEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 alphaToCoverageEnable);
    /// ```
    public static void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, int alphaToCoverageEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAlphaToCoverageEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToCoverageEnableEXT");
        try { Handles.MH_vkCmdSetAlphaToCoverageEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAlphaToCoverageEnableEXT, commandBuffer.segment(), alphaToCoverageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToCoverageEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetAlphaToOneEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 alphaToOneEnable);
    /// ```
    public static void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, int alphaToOneEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAlphaToOneEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToOneEnableEXT");
        try { Handles.MH_vkCmdSetAlphaToOneEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAlphaToOneEnableEXT, commandBuffer.segment(), alphaToOneEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToOneEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 logicOpEnable);
    /// ```
    public static void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, int logicOpEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEnableEXT");
        try { Handles.MH_vkCmdSetLogicOpEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEnableEXT, commandBuffer.segment(), logicOpEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkBool32* pColorBlendEnables);
    /// ```
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendEnables) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEnableEXT");
        try { Handles.MH_vkCmdSetColorBlendEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEnableEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendEquationEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendEquationEXT* pColorBlendEquations);
    /// ```
    public static void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendEquations) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEquationEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEquationEXT");
        try { Handles.MH_vkCmdSetColorBlendEquationEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEquationEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendEquations); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEquationEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorWriteMaskEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorComponentFlags* pColorWriteMasks);
    /// ```
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorWriteMasks) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorWriteMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorWriteMaskEXT");
        try { Handles.MH_vkCmdSetColorWriteMaskEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorWriteMaskEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorWriteMasks); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorWriteMaskEXT", e); }
    }

    /// ```
    /// void vkCmdSetTessellationDomainOriginEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkTessellationDomainOrigin domainOrigin);
    /// ```
    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, int domainOrigin) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetTessellationDomainOriginEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { Handles.MH_vkCmdSetTessellationDomainOriginEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer.segment(), domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetTessellationDomainOriginEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizationStreamEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t rasterizationStream);
    /// ```
    public static void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, int rasterizationStream) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizationStreamEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationStreamEXT");
        try { Handles.MH_vkCmdSetRasterizationStreamEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizationStreamEXT, commandBuffer.segment(), rasterizationStream); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationStreamEXT", e); }
    }

    /// ```
    /// void vkCmdSetConservativeRasterizationModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkConservativeRasterizationModeEXT conservativeRasterizationMode);
    /// ```
    public static void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, int conservativeRasterizationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetConservativeRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetConservativeRasterizationModeEXT");
        try { Handles.MH_vkCmdSetConservativeRasterizationModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetConservativeRasterizationModeEXT, commandBuffer.segment(), conservativeRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetConservativeRasterizationModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetExtraPrimitiveOverestimationSizeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize);
    /// ```
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        try { Handles.MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT, commandBuffer.segment(), extraPrimitiveOverestimationSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExtraPrimitiveOverestimationSizeEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClipEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthClipEnable);
    /// ```
    public static void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, int depthClipEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClipEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipEnableEXT");
        try { Handles.MH_vkCmdSetDepthClipEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClipEnableEXT, commandBuffer.segment(), depthClipEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetSampleLocationsEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 sampleLocationsEnable);
    /// ```
    public static void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, int sampleLocationsEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEnableEXT");
        try { Handles.MH_vkCmdSetSampleLocationsEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEnableEXT, commandBuffer.segment(), sampleLocationsEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendAdvancedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendAdvancedEXT* pColorBlendAdvanced);
    /// ```
    public static void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendAdvanced) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendAdvancedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendAdvancedEXT");
        try { Handles.MH_vkCmdSetColorBlendAdvancedEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendAdvancedEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendAdvanced); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendAdvancedEXT", e); }
    }

    /// ```
    /// void vkCmdSetProvokingVertexModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkProvokingVertexModeEXT provokingVertexMode);
    /// ```
    public static void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, int provokingVertexMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetProvokingVertexModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetProvokingVertexModeEXT");
        try { Handles.MH_vkCmdSetProvokingVertexModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetProvokingVertexModeEXT, commandBuffer.segment(), provokingVertexMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetProvokingVertexModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetLineRasterizationModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((int) VkLineRasterizationMode) VkLineRasterizationModeEXT lineRasterizationMode);
    /// ```
    public static void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, int lineRasterizationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineRasterizationModeEXT");
        try { Handles.MH_vkCmdSetLineRasterizationModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineRasterizationModeEXT, commandBuffer.segment(), lineRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineRasterizationModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetLineStippleEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 stippledLineEnable);
    /// ```
    public static void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, int stippledLineEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEnableEXT");
        try { Handles.MH_vkCmdSetLineStippleEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEnableEXT, commandBuffer.segment(), stippledLineEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClipNegativeOneToOneEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 negativeOneToOne);
    /// ```
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, int negativeOneToOne) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClipNegativeOneToOneEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipNegativeOneToOneEXT");
        try { Handles.MH_vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClipNegativeOneToOneEXT, commandBuffer.segment(), negativeOneToOne); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipNegativeOneToOneEXT", e); }
    }

    /// ```
    /// void vkCmdSetViewportWScalingEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 viewportWScalingEnable);
    /// ```
    public static void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, int viewportWScalingEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingEnableNV");
        try { Handles.MH_vkCmdSetViewportWScalingEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingEnableNV, commandBuffer.segment(), viewportWScalingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetViewportSwizzleNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewportSwizzleNV* pViewportSwizzles);
    /// ```
    public static void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, MemorySegment pViewportSwizzles) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportSwizzleNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportSwizzleNV");
        try { Handles.MH_vkCmdSetViewportSwizzleNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportSwizzleNV, commandBuffer.segment(), firstViewport, viewportCount, pViewportSwizzles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportSwizzleNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageToColorEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 coverageToColorEnable);
    /// ```
    public static void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, int coverageToColorEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorEnableNV");
        try { Handles.MH_vkCmdSetCoverageToColorEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorEnableNV, commandBuffer.segment(), coverageToColorEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageToColorLocationNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t coverageToColorLocation);
    /// ```
    public static void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, int coverageToColorLocation) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorLocationNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorLocationNV");
        try { Handles.MH_vkCmdSetCoverageToColorLocationNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorLocationNV, commandBuffer.segment(), coverageToColorLocation); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorLocationNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationModeNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCoverageModulationModeNV coverageModulationMode);
    /// ```
    public static void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, int coverageModulationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationModeNV");
        try { Handles.MH_vkCmdSetCoverageModulationModeNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationModeNV, commandBuffer.segment(), coverageModulationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationModeNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationTableEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 coverageModulationTableEnable);
    /// ```
    public static void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, int coverageModulationTableEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableEnableNV");
        try { Handles.MH_vkCmdSetCoverageModulationTableEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableEnableNV, commandBuffer.segment(), coverageModulationTableEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationTableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, const float* pCoverageModulationTable);
    /// ```
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, int coverageModulationTableCount, MemorySegment pCoverageModulationTable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableNV");
        try { Handles.MH_vkCmdSetCoverageModulationTableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableNV, commandBuffer.segment(), coverageModulationTableCount, pCoverageModulationTable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableNV", e); }
    }

    /// ```
    /// void vkCmdSetShadingRateImageEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 shadingRateImageEnable);
    /// ```
    public static void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, int shadingRateImageEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetShadingRateImageEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetShadingRateImageEnableNV");
        try { Handles.MH_vkCmdSetShadingRateImageEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetShadingRateImageEnableNV, commandBuffer.segment(), shadingRateImageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetShadingRateImageEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetRepresentativeFragmentTestEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 representativeFragmentTestEnable);
    /// ```
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, int representativeFragmentTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRepresentativeFragmentTestEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRepresentativeFragmentTestEnableNV");
        try { Handles.MH_vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRepresentativeFragmentTestEnableNV, commandBuffer.segment(), representativeFragmentTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRepresentativeFragmentTestEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageReductionModeNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCoverageReductionModeNV coverageReductionMode);
    /// ```
    public static void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, int coverageReductionMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageReductionModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageReductionModeNV");
        try { Handles.MH_vkCmdSetCoverageReductionModeNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageReductionModeNV, commandBuffer.segment(), coverageReductionMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageReductionModeNV", e); }
    }

}
