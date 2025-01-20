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
import java.util.*;
import static overrungl.vulkan.VK13.*;
import static overrungl.vulkan.ext.VKEXTShaderObject.*;
public class VKEXTShaderObject {
    public static final int VK_SHADER_CREATE_LINK_STAGE_BIT_EXT = 0x00000001;
    public static final int VK_SHADER_CODE_TYPE_BINARY_EXT = 0;
    public static final int VK_SHADER_CODE_TYPE_SPIRV_EXT = 1;
    public static final int VK_EXT_SHADER_OBJECT_SPEC_VERSION = 1;
    public static final String VK_EXT_SHADER_OBJECT_EXTENSION_NAME = "VK_EXT_shader_object";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_FEATURES_EXT = 1000482000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT = 1000482001;
    public static final int VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT = 1000482002;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT = 1000482001;
    public static final int VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT = 1000482002;
    public static final int VK_OBJECT_TYPE_SHADER_EXT = 1000482000;
    public static final int VK_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;
    public static final int VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT = 0x00000002;
    public static final int VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT = 0x00000004;
    public static final int VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT = 0x00000008;
    public static final int VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT = 0x00000010;
    public static final int VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT = 0x00000020;
    public static final int VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x00000040;
    public static final int VK_STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT = VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO;
    public static final int VK_ERROR_INCOMPATIBLE_SHADER_BINARY_EXT = VK_INCOMPATIBLE_SHADER_BINARY_EXT;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateShadersEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyShaderEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetShaderBinaryDataEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBindShadersEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetCullModeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetFrontFaceEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetPrimitiveTopologyEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetViewportWithCountEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetScissorWithCountEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdBindVertexBuffers2EXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetDepthTestEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetDepthWriteEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetDepthCompareOpEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetDepthBoundsTestEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetStencilTestEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetStencilOpEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetVertexInputEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCmdSetPatchControlPointsEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetRasterizerDiscardEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetDepthBiasEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetLogicOpEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetPrimitiveRestartEnableEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_vkCmdSetTessellationDomainOriginEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
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
        public static final FunctionDescriptor FD_vkCmdSetDepthClampRangeEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCreateShadersEXT,
            FD_vkDestroyShaderEXT,
            FD_vkGetShaderBinaryDataEXT,
            FD_vkCmdBindShadersEXT,
            FD_vkCmdSetCullModeEXT,
            FD_vkCmdSetFrontFaceEXT,
            FD_vkCmdSetPrimitiveTopologyEXT,
            FD_vkCmdSetViewportWithCountEXT,
            FD_vkCmdSetScissorWithCountEXT,
            FD_vkCmdBindVertexBuffers2EXT,
            FD_vkCmdSetDepthTestEnableEXT,
            FD_vkCmdSetDepthWriteEnableEXT,
            FD_vkCmdSetDepthCompareOpEXT,
            FD_vkCmdSetDepthBoundsTestEnableEXT,
            FD_vkCmdSetStencilTestEnableEXT,
            FD_vkCmdSetStencilOpEXT,
            FD_vkCmdSetVertexInputEXT,
            FD_vkCmdSetPatchControlPointsEXT,
            FD_vkCmdSetRasterizerDiscardEnableEXT,
            FD_vkCmdSetDepthBiasEnableEXT,
            FD_vkCmdSetLogicOpEXT,
            FD_vkCmdSetPrimitiveRestartEnableEXT,
            FD_vkCmdSetTessellationDomainOriginEXT,
            FD_vkCmdSetDepthClampEnableEXT,
            FD_vkCmdSetPolygonModeEXT,
            FD_vkCmdSetRasterizationSamplesEXT,
            FD_vkCmdSetSampleMaskEXT,
            FD_vkCmdSetAlphaToCoverageEnableEXT,
            FD_vkCmdSetAlphaToOneEnableEXT,
            FD_vkCmdSetLogicOpEnableEXT,
            FD_vkCmdSetColorBlendEnableEXT,
            FD_vkCmdSetColorBlendEquationEXT,
            FD_vkCmdSetColorWriteMaskEXT,
            FD_vkCmdSetRasterizationStreamEXT,
            FD_vkCmdSetConservativeRasterizationModeEXT,
            FD_vkCmdSetExtraPrimitiveOverestimationSizeEXT,
            FD_vkCmdSetDepthClipEnableEXT,
            FD_vkCmdSetSampleLocationsEnableEXT,
            FD_vkCmdSetColorBlendAdvancedEXT,
            FD_vkCmdSetProvokingVertexModeEXT,
            FD_vkCmdSetLineRasterizationModeEXT,
            FD_vkCmdSetLineStippleEnableEXT,
            FD_vkCmdSetDepthClipNegativeOneToOneEXT,
            FD_vkCmdSetViewportWScalingEnableNV,
            FD_vkCmdSetViewportSwizzleNV,
            FD_vkCmdSetCoverageToColorEnableNV,
            FD_vkCmdSetCoverageToColorLocationNV,
            FD_vkCmdSetCoverageModulationModeNV,
            FD_vkCmdSetCoverageModulationTableEnableNV,
            FD_vkCmdSetCoverageModulationTableNV,
            FD_vkCmdSetShadingRateImageEnableNV,
            FD_vkCmdSetRepresentativeFragmentTestEnableNV,
            FD_vkCmdSetCoverageReductionModeNV,
            FD_vkCmdSetDepthClampRangeEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateShadersEXT = RuntimeHelper.downcall(Descriptors.FD_vkCreateShadersEXT);
        public static final MethodHandle MH_vkDestroyShaderEXT = RuntimeHelper.downcall(Descriptors.FD_vkDestroyShaderEXT);
        public static final MethodHandle MH_vkGetShaderBinaryDataEXT = RuntimeHelper.downcall(Descriptors.FD_vkGetShaderBinaryDataEXT);
        public static final MethodHandle MH_vkCmdBindShadersEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindShadersEXT);
        public static final MethodHandle MH_vkCmdSetCullModeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetCullModeEXT);
        public static final MethodHandle MH_vkCmdSetFrontFaceEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetFrontFaceEXT);
        public static final MethodHandle MH_vkCmdSetPrimitiveTopologyEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetPrimitiveTopologyEXT);
        public static final MethodHandle MH_vkCmdSetViewportWithCountEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetViewportWithCountEXT);
        public static final MethodHandle MH_vkCmdSetScissorWithCountEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetScissorWithCountEXT);
        public static final MethodHandle MH_vkCmdBindVertexBuffers2EXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdBindVertexBuffers2EXT);
        public static final MethodHandle MH_vkCmdSetDepthTestEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthTestEnableEXT);
        public static final MethodHandle MH_vkCmdSetDepthWriteEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthWriteEnableEXT);
        public static final MethodHandle MH_vkCmdSetDepthCompareOpEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthCompareOpEXT);
        public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthBoundsTestEnableEXT);
        public static final MethodHandle MH_vkCmdSetStencilTestEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetStencilTestEnableEXT);
        public static final MethodHandle MH_vkCmdSetStencilOpEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetStencilOpEXT);
        public static final MethodHandle MH_vkCmdSetVertexInputEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetVertexInputEXT);
        public static final MethodHandle MH_vkCmdSetPatchControlPointsEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetPatchControlPointsEXT);
        public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetRasterizerDiscardEnableEXT);
        public static final MethodHandle MH_vkCmdSetDepthBiasEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthBiasEnableEXT);
        public static final MethodHandle MH_vkCmdSetLogicOpEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetLogicOpEXT);
        public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnableEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetPrimitiveRestartEnableEXT);
        public static final MethodHandle MH_vkCmdSetTessellationDomainOriginEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetTessellationDomainOriginEXT);
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
        public static final MethodHandle MH_vkCmdSetDepthClampRangeEXT = RuntimeHelper.downcall(Descriptors.FD_vkCmdSetDepthClampRangeEXT);
        public final MemorySegment PFN_vkCreateShadersEXT;
        public final MemorySegment PFN_vkDestroyShaderEXT;
        public final MemorySegment PFN_vkGetShaderBinaryDataEXT;
        public final MemorySegment PFN_vkCmdBindShadersEXT;
        public final MemorySegment PFN_vkCmdSetCullModeEXT;
        public final MemorySegment PFN_vkCmdSetFrontFaceEXT;
        public final MemorySegment PFN_vkCmdSetPrimitiveTopologyEXT;
        public final MemorySegment PFN_vkCmdSetViewportWithCountEXT;
        public final MemorySegment PFN_vkCmdSetScissorWithCountEXT;
        public final MemorySegment PFN_vkCmdBindVertexBuffers2EXT;
        public final MemorySegment PFN_vkCmdSetDepthTestEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthWriteEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthCompareOpEXT;
        public final MemorySegment PFN_vkCmdSetDepthBoundsTestEnableEXT;
        public final MemorySegment PFN_vkCmdSetStencilTestEnableEXT;
        public final MemorySegment PFN_vkCmdSetStencilOpEXT;
        public final MemorySegment PFN_vkCmdSetVertexInputEXT;
        public final MemorySegment PFN_vkCmdSetPatchControlPointsEXT;
        public final MemorySegment PFN_vkCmdSetRasterizerDiscardEnableEXT;
        public final MemorySegment PFN_vkCmdSetDepthBiasEnableEXT;
        public final MemorySegment PFN_vkCmdSetLogicOpEXT;
        public final MemorySegment PFN_vkCmdSetPrimitiveRestartEnableEXT;
        public final MemorySegment PFN_vkCmdSetTessellationDomainOriginEXT;
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
        public final MemorySegment PFN_vkCmdSetDepthClampRangeEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCreateShadersEXT = func.invoke(device, "vkCreateShadersEXT");
            PFN_vkDestroyShaderEXT = func.invoke(device, "vkDestroyShaderEXT");
            PFN_vkGetShaderBinaryDataEXT = func.invoke(device, "vkGetShaderBinaryDataEXT");
            PFN_vkCmdBindShadersEXT = func.invoke(device, "vkCmdBindShadersEXT");
            PFN_vkCmdSetCullModeEXT = func.invoke(device, "vkCmdSetCullModeEXT", "vkCmdSetCullMode");
            PFN_vkCmdSetFrontFaceEXT = func.invoke(device, "vkCmdSetFrontFaceEXT", "vkCmdSetFrontFace");
            PFN_vkCmdSetPrimitiveTopologyEXT = func.invoke(device, "vkCmdSetPrimitiveTopologyEXT", "vkCmdSetPrimitiveTopology");
            PFN_vkCmdSetViewportWithCountEXT = func.invoke(device, "vkCmdSetViewportWithCountEXT", "vkCmdSetViewportWithCount");
            PFN_vkCmdSetScissorWithCountEXT = func.invoke(device, "vkCmdSetScissorWithCountEXT", "vkCmdSetScissorWithCount");
            PFN_vkCmdBindVertexBuffers2EXT = func.invoke(device, "vkCmdBindVertexBuffers2EXT", "vkCmdBindVertexBuffers2");
            PFN_vkCmdSetDepthTestEnableEXT = func.invoke(device, "vkCmdSetDepthTestEnableEXT", "vkCmdSetDepthTestEnable");
            PFN_vkCmdSetDepthWriteEnableEXT = func.invoke(device, "vkCmdSetDepthWriteEnableEXT", "vkCmdSetDepthWriteEnable");
            PFN_vkCmdSetDepthCompareOpEXT = func.invoke(device, "vkCmdSetDepthCompareOpEXT", "vkCmdSetDepthCompareOp");
            PFN_vkCmdSetDepthBoundsTestEnableEXT = func.invoke(device, "vkCmdSetDepthBoundsTestEnableEXT", "vkCmdSetDepthBoundsTestEnable");
            PFN_vkCmdSetStencilTestEnableEXT = func.invoke(device, "vkCmdSetStencilTestEnableEXT", "vkCmdSetStencilTestEnable");
            PFN_vkCmdSetStencilOpEXT = func.invoke(device, "vkCmdSetStencilOpEXT", "vkCmdSetStencilOp");
            PFN_vkCmdSetVertexInputEXT = func.invoke(device, "vkCmdSetVertexInputEXT");
            PFN_vkCmdSetPatchControlPointsEXT = func.invoke(device, "vkCmdSetPatchControlPointsEXT");
            PFN_vkCmdSetRasterizerDiscardEnableEXT = func.invoke(device, "vkCmdSetRasterizerDiscardEnableEXT", "vkCmdSetRasterizerDiscardEnable");
            PFN_vkCmdSetDepthBiasEnableEXT = func.invoke(device, "vkCmdSetDepthBiasEnableEXT", "vkCmdSetDepthBiasEnable");
            PFN_vkCmdSetLogicOpEXT = func.invoke(device, "vkCmdSetLogicOpEXT");
            PFN_vkCmdSetPrimitiveRestartEnableEXT = func.invoke(device, "vkCmdSetPrimitiveRestartEnableEXT", "vkCmdSetPrimitiveRestartEnable");
            PFN_vkCmdSetTessellationDomainOriginEXT = func.invoke(device, "vkCmdSetTessellationDomainOriginEXT");
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
            PFN_vkCmdSetDepthClampRangeEXT = func.invoke(device, "vkCmdSetDepthClampRangeEXT");
        }
    }

    public VKEXTShaderObject(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CreateShadersEXT(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int createInfoCount, @CType("const VkShaderCreateInfoEXT *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkShaderEXT *") MemorySegment pShaders) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateShadersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateShadersEXT");
        try { return (int) Handles.MH_vkCreateShadersEXT.invokeExact(handles.PFN_vkCreateShadersEXT, device, createInfoCount, pCreateInfos, pAllocator, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShadersEXT", e); }
    }

    public void DestroyShaderEXT(@CType("VkDevice") MemorySegment device, @CType("VkShaderEXT") MemorySegment shader, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyShaderEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderEXT");
        try { Handles.MH_vkDestroyShaderEXT.invokeExact(handles.PFN_vkDestroyShaderEXT, device, shader, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderEXT", e); }
    }

    public @CType("VkResult") int GetShaderBinaryDataEXT(@CType("VkDevice") MemorySegment device, @CType("VkShaderEXT") MemorySegment shader, @CType("size_t *") MemorySegment pDataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetShaderBinaryDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderBinaryDataEXT");
        try { return (int) Handles.MH_vkGetShaderBinaryDataEXT.invokeExact(handles.PFN_vkGetShaderBinaryDataEXT, device, shader, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderBinaryDataEXT", e); }
    }

    public void CmdBindShadersEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int stageCount, @CType("const VkShaderStageFlagBits *") MemorySegment pStages, @CType("const VkShaderEXT *") MemorySegment pShaders) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindShadersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindShadersEXT");
        try { Handles.MH_vkCmdBindShadersEXT.invokeExact(handles.PFN_vkCmdBindShadersEXT, commandBuffer, stageCount, pStages, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindShadersEXT", e); }
    }

    public void CmdSetCullModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCullModeFlags") int cullMode) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetCullModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { Handles.MH_vkCmdSetCullModeEXT.invokeExact(handles.PFN_vkCmdSetCullModeEXT, commandBuffer, cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullModeEXT", e); }
    }

    public void CmdSetFrontFaceEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkFrontFace") int frontFace) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetFrontFaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { Handles.MH_vkCmdSetFrontFaceEXT.invokeExact(handles.PFN_vkCmdSetFrontFaceEXT, commandBuffer, frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFaceEXT", e); }
    }

    public void CmdSetPrimitiveTopologyEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPrimitiveTopology") int primitiveTopology) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetPrimitiveTopologyEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { Handles.MH_vkCmdSetPrimitiveTopologyEXT.invokeExact(handles.PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer, primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopologyEXT", e); }
    }

    public void CmdSetViewportWithCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int viewportCount, @CType("const VkViewport *") MemorySegment pViewports) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetViewportWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { Handles.MH_vkCmdSetViewportWithCountEXT.invokeExact(handles.PFN_vkCmdSetViewportWithCountEXT, commandBuffer, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCountEXT", e); }
    }

    public void CmdSetScissorWithCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int scissorCount, @CType("const VkRect2D *") MemorySegment pScissors) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetScissorWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { Handles.MH_vkCmdSetScissorWithCountEXT.invokeExact(handles.PFN_vkCmdSetScissorWithCountEXT, commandBuffer, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCountEXT", e); }
    }

    public void CmdBindVertexBuffers2EXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstBinding, @CType("uint32_t") int bindingCount, @CType("const VkBuffer *") MemorySegment pBuffers, @CType("const VkDeviceSize *") MemorySegment pOffsets, @CType("const VkDeviceSize *") MemorySegment pSizes, @CType("const VkDeviceSize *") MemorySegment pStrides) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdBindVertexBuffers2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { Handles.MH_vkCmdBindVertexBuffers2EXT.invokeExact(handles.PFN_vkCmdBindVertexBuffers2EXT, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2EXT", e); }
    }

    public void CmdSetDepthTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { Handles.MH_vkCmdSetDepthTestEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthTestEnableEXT, commandBuffer, depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnableEXT", e); }
    }

    public void CmdSetDepthWriteEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthWriteEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthWriteEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { Handles.MH_vkCmdSetDepthWriteEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer, depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnableEXT", e); }
    }

    public void CmdSetDepthCompareOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCompareOp") int depthCompareOp) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthCompareOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { Handles.MH_vkCmdSetDepthCompareOpEXT.invokeExact(handles.PFN_vkCmdSetDepthCompareOpEXT, commandBuffer, depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOpEXT", e); }
    }

    public void CmdSetDepthBoundsTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthBoundsTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { Handles.MH_vkCmdSetDepthBoundsTestEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer, depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnableEXT", e); }
    }

    public void CmdSetStencilTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int stencilTestEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { Handles.MH_vkCmdSetStencilTestEnableEXT.invokeExact(handles.PFN_vkCmdSetStencilTestEnableEXT, commandBuffer, stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnableEXT", e); }
    }

    public void CmdSetStencilOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("VkStencilOp") int failOp, @CType("VkStencilOp") int passOp, @CType("VkStencilOp") int depthFailOp, @CType("VkCompareOp") int compareOp) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetStencilOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { Handles.MH_vkCmdSetStencilOpEXT.invokeExact(handles.PFN_vkCmdSetStencilOpEXT, commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOpEXT", e); }
    }

    public void CmdSetVertexInputEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int vertexBindingDescriptionCount, @CType("const VkVertexInputBindingDescription2EXT *") MemorySegment pVertexBindingDescriptions, @CType("uint32_t") int vertexAttributeDescriptionCount, @CType("const VkVertexInputAttributeDescription2EXT *") MemorySegment pVertexAttributeDescriptions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetVertexInputEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { Handles.MH_vkCmdSetVertexInputEXT.invokeExact(handles.PFN_vkCmdSetVertexInputEXT, commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetVertexInputEXT", e); }
    }

    public void CmdSetPatchControlPointsEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int patchControlPoints) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetPatchControlPointsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { Handles.MH_vkCmdSetPatchControlPointsEXT.invokeExact(handles.PFN_vkCmdSetPatchControlPointsEXT, commandBuffer, patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPatchControlPointsEXT", e); }
    }

    public void CmdSetRasterizerDiscardEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int rasterizerDiscardEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { Handles.MH_vkCmdSetRasterizerDiscardEnableEXT.invokeExact(handles.PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer, rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizerDiscardEnableEXT", e); }
    }

    public void CmdSetDepthBiasEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthBiasEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthBiasEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { Handles.MH_vkCmdSetDepthBiasEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer, depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBiasEnableEXT", e); }
    }

    public void CmdSetLogicOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkLogicOp") int logicOp) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetLogicOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { Handles.MH_vkCmdSetLogicOpEXT.invokeExact(handles.PFN_vkCmdSetLogicOpEXT, commandBuffer, logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEXT", e); }
    }

    public void CmdSetPrimitiveRestartEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int primitiveRestartEnable) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { Handles.MH_vkCmdSetPrimitiveRestartEnableEXT.invokeExact(handles.PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer, primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveRestartEnableEXT", e); }
    }

    public void CmdSetTessellationDomainOriginEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkTessellationDomainOrigin") int domainOrigin) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetTessellationDomainOriginEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { Handles.MH_vkCmdSetTessellationDomainOriginEXT.invokeExact(handles.PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer, domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetTessellationDomainOriginEXT", e); }
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

    public void CmdSetDepthClampRangeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDepthClampModeEXT") int depthClampMode, @CType("const VkDepthClampRangeEXT *") MemorySegment pDepthClampRange) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdSetDepthClampRangeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampRangeEXT");
        try { Handles.MH_vkCmdSetDepthClampRangeEXT.invokeExact(handles.PFN_vkCmdSetDepthClampRangeEXT, commandBuffer, depthClampMode, pDepthClampRange); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampRangeEXT", e); }
    }

}
