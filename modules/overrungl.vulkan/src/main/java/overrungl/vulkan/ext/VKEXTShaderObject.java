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
    public static final MethodHandle MH_vkCreateShadersEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetShaderBinaryDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBindShadersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetCullModeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetFrontFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetPrimitiveTopologyEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetViewportWithCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetScissorWithCountEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBindVertexBuffers2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetDepthTestEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetDepthWriteEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetDepthCompareOpEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetStencilTestEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetStencilOpEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetVertexInputEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdSetPatchControlPointsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetDepthBiasEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetLogicOpEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_vkCmdSetTessellationDomainOriginEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
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
    public static final MethodHandle MH_vkCmdSetDepthClampRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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

    public VKEXTShaderObject(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
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

    public @CType("VkResult") int CreateShadersEXT(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int createInfoCount, @CType("const VkShaderCreateInfoEXT *") MemorySegment pCreateInfos, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkShaderEXT *") MemorySegment pShaders) {
        if (Unmarshal.isNullPointer(PFN_vkCreateShadersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateShadersEXT");
        try { return (int) MH_vkCreateShadersEXT.invokeExact(PFN_vkCreateShadersEXT, device, createInfoCount, pCreateInfos, pAllocator, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShadersEXT", e); }
    }

    public void DestroyShaderEXT(@CType("VkDevice") MemorySegment device, @CType("VkShaderEXT") MemorySegment shader, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyShaderEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderEXT");
        try { MH_vkDestroyShaderEXT.invokeExact(PFN_vkDestroyShaderEXT, device, shader, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderEXT", e); }
    }

    public @CType("VkResult") int GetShaderBinaryDataEXT(@CType("VkDevice") MemorySegment device, @CType("VkShaderEXT") MemorySegment shader, @CType("size_t *") MemorySegment pDataSize, @CType("void *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkGetShaderBinaryDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderBinaryDataEXT");
        try { return (int) MH_vkGetShaderBinaryDataEXT.invokeExact(PFN_vkGetShaderBinaryDataEXT, device, shader, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderBinaryDataEXT", e); }
    }

    public void CmdBindShadersEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int stageCount, @CType("const VkShaderStageFlagBits *") MemorySegment pStages, @CType("const VkShaderEXT *") MemorySegment pShaders) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindShadersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindShadersEXT");
        try { MH_vkCmdBindShadersEXT.invokeExact(PFN_vkCmdBindShadersEXT, commandBuffer, stageCount, pStages, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindShadersEXT", e); }
    }

    public void CmdSetCullModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCullModeFlags") int cullMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCullModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { MH_vkCmdSetCullModeEXT.invokeExact(PFN_vkCmdSetCullModeEXT, commandBuffer, cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullModeEXT", e); }
    }

    public void CmdSetFrontFaceEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkFrontFace") int frontFace) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetFrontFaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { MH_vkCmdSetFrontFaceEXT.invokeExact(PFN_vkCmdSetFrontFaceEXT, commandBuffer, frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFaceEXT", e); }
    }

    public void CmdSetPrimitiveTopologyEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPrimitiveTopology") int primitiveTopology) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetPrimitiveTopologyEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { MH_vkCmdSetPrimitiveTopologyEXT.invokeExact(PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer, primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopologyEXT", e); }
    }

    public void CmdSetViewportWithCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int viewportCount, @CType("const VkViewport *") MemorySegment pViewports) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetViewportWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { MH_vkCmdSetViewportWithCountEXT.invokeExact(PFN_vkCmdSetViewportWithCountEXT, commandBuffer, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCountEXT", e); }
    }

    public void CmdSetScissorWithCountEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int scissorCount, @CType("const VkRect2D *") MemorySegment pScissors) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetScissorWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { MH_vkCmdSetScissorWithCountEXT.invokeExact(PFN_vkCmdSetScissorWithCountEXT, commandBuffer, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCountEXT", e); }
    }

    public void CmdBindVertexBuffers2EXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstBinding, @CType("uint32_t") int bindingCount, @CType("const VkBuffer *") MemorySegment pBuffers, @CType("const VkDeviceSize *") MemorySegment pOffsets, @CType("const VkDeviceSize *") MemorySegment pSizes, @CType("const VkDeviceSize *") MemorySegment pStrides) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBindVertexBuffers2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { MH_vkCmdBindVertexBuffers2EXT.invokeExact(PFN_vkCmdBindVertexBuffers2EXT, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2EXT", e); }
    }

    public void CmdSetDepthTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthTestEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { MH_vkCmdSetDepthTestEnableEXT.invokeExact(PFN_vkCmdSetDepthTestEnableEXT, commandBuffer, depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnableEXT", e); }
    }

    public void CmdSetDepthWriteEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthWriteEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthWriteEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { MH_vkCmdSetDepthWriteEnableEXT.invokeExact(PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer, depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnableEXT", e); }
    }

    public void CmdSetDepthCompareOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCompareOp") int depthCompareOp) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthCompareOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { MH_vkCmdSetDepthCompareOpEXT.invokeExact(PFN_vkCmdSetDepthCompareOpEXT, commandBuffer, depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOpEXT", e); }
    }

    public void CmdSetDepthBoundsTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthBoundsTestEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { MH_vkCmdSetDepthBoundsTestEnableEXT.invokeExact(PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer, depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnableEXT", e); }
    }

    public void CmdSetStencilTestEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int stencilTestEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetStencilTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { MH_vkCmdSetStencilTestEnableEXT.invokeExact(PFN_vkCmdSetStencilTestEnableEXT, commandBuffer, stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnableEXT", e); }
    }

    public void CmdSetStencilOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkStencilFaceFlags") int faceMask, @CType("VkStencilOp") int failOp, @CType("VkStencilOp") int passOp, @CType("VkStencilOp") int depthFailOp, @CType("VkCompareOp") int compareOp) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetStencilOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { MH_vkCmdSetStencilOpEXT.invokeExact(PFN_vkCmdSetStencilOpEXT, commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOpEXT", e); }
    }

    public void CmdSetVertexInputEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int vertexBindingDescriptionCount, @CType("const VkVertexInputBindingDescription2EXT *") MemorySegment pVertexBindingDescriptions, @CType("uint32_t") int vertexAttributeDescriptionCount, @CType("const VkVertexInputAttributeDescription2EXT *") MemorySegment pVertexAttributeDescriptions) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetVertexInputEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { MH_vkCmdSetVertexInputEXT.invokeExact(PFN_vkCmdSetVertexInputEXT, commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetVertexInputEXT", e); }
    }

    public void CmdSetPatchControlPointsEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int patchControlPoints) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetPatchControlPointsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { MH_vkCmdSetPatchControlPointsEXT.invokeExact(PFN_vkCmdSetPatchControlPointsEXT, commandBuffer, patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPatchControlPointsEXT", e); }
    }

    public void CmdSetRasterizerDiscardEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int rasterizerDiscardEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { MH_vkCmdSetRasterizerDiscardEnableEXT.invokeExact(PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer, rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizerDiscardEnableEXT", e); }
    }

    public void CmdSetDepthBiasEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthBiasEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthBiasEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { MH_vkCmdSetDepthBiasEnableEXT.invokeExact(PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer, depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBiasEnableEXT", e); }
    }

    public void CmdSetLogicOpEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkLogicOp") int logicOp) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetLogicOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { MH_vkCmdSetLogicOpEXT.invokeExact(PFN_vkCmdSetLogicOpEXT, commandBuffer, logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEXT", e); }
    }

    public void CmdSetPrimitiveRestartEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int primitiveRestartEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { MH_vkCmdSetPrimitiveRestartEnableEXT.invokeExact(PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer, primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveRestartEnableEXT", e); }
    }

    public void CmdSetTessellationDomainOriginEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkTessellationDomainOrigin") int domainOrigin) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetTessellationDomainOriginEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { MH_vkCmdSetTessellationDomainOriginEXT.invokeExact(PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer, domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetTessellationDomainOriginEXT", e); }
    }

    public void CmdSetDepthClampEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthClampEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthClampEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampEnableEXT");
        try { MH_vkCmdSetDepthClampEnableEXT.invokeExact(PFN_vkCmdSetDepthClampEnableEXT, commandBuffer, depthClampEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampEnableEXT", e); }
    }

    public void CmdSetPolygonModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkPolygonMode") int polygonMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetPolygonModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPolygonModeEXT");
        try { MH_vkCmdSetPolygonModeEXT.invokeExact(PFN_vkCmdSetPolygonModeEXT, commandBuffer, polygonMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPolygonModeEXT", e); }
    }

    public void CmdSetRasterizationSamplesEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkSampleCountFlagBits") int rasterizationSamples) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetRasterizationSamplesEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationSamplesEXT");
        try { MH_vkCmdSetRasterizationSamplesEXT.invokeExact(PFN_vkCmdSetRasterizationSamplesEXT, commandBuffer, rasterizationSamples); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationSamplesEXT", e); }
    }

    public void CmdSetSampleMaskEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkSampleCountFlagBits") int samples, @CType("const VkSampleMask *") MemorySegment pSampleMask) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetSampleMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleMaskEXT");
        try { MH_vkCmdSetSampleMaskEXT.invokeExact(PFN_vkCmdSetSampleMaskEXT, commandBuffer, samples, pSampleMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleMaskEXT", e); }
    }

    public void CmdSetAlphaToCoverageEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int alphaToCoverageEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetAlphaToCoverageEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToCoverageEnableEXT");
        try { MH_vkCmdSetAlphaToCoverageEnableEXT.invokeExact(PFN_vkCmdSetAlphaToCoverageEnableEXT, commandBuffer, alphaToCoverageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToCoverageEnableEXT", e); }
    }

    public void CmdSetAlphaToOneEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int alphaToOneEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetAlphaToOneEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToOneEnableEXT");
        try { MH_vkCmdSetAlphaToOneEnableEXT.invokeExact(PFN_vkCmdSetAlphaToOneEnableEXT, commandBuffer, alphaToOneEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToOneEnableEXT", e); }
    }

    public void CmdSetLogicOpEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int logicOpEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetLogicOpEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEnableEXT");
        try { MH_vkCmdSetLogicOpEnableEXT.invokeExact(PFN_vkCmdSetLogicOpEnableEXT, commandBuffer, logicOpEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEnableEXT", e); }
    }

    public void CmdSetColorBlendEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkBool32 *") MemorySegment pColorBlendEnables) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetColorBlendEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEnableEXT");
        try { MH_vkCmdSetColorBlendEnableEXT.invokeExact(PFN_vkCmdSetColorBlendEnableEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEnableEXT", e); }
    }

    public void CmdSetColorBlendEquationEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkColorBlendEquationEXT *") MemorySegment pColorBlendEquations) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetColorBlendEquationEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEquationEXT");
        try { MH_vkCmdSetColorBlendEquationEXT.invokeExact(PFN_vkCmdSetColorBlendEquationEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendEquations); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEquationEXT", e); }
    }

    public void CmdSetColorWriteMaskEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkColorComponentFlags *") MemorySegment pColorWriteMasks) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetColorWriteMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorWriteMaskEXT");
        try { MH_vkCmdSetColorWriteMaskEXT.invokeExact(PFN_vkCmdSetColorWriteMaskEXT, commandBuffer, firstAttachment, attachmentCount, pColorWriteMasks); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorWriteMaskEXT", e); }
    }

    public void CmdSetRasterizationStreamEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int rasterizationStream) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetRasterizationStreamEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationStreamEXT");
        try { MH_vkCmdSetRasterizationStreamEXT.invokeExact(PFN_vkCmdSetRasterizationStreamEXT, commandBuffer, rasterizationStream); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationStreamEXT", e); }
    }

    public void CmdSetConservativeRasterizationModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkConservativeRasterizationModeEXT") int conservativeRasterizationMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetConservativeRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetConservativeRasterizationModeEXT");
        try { MH_vkCmdSetConservativeRasterizationModeEXT.invokeExact(PFN_vkCmdSetConservativeRasterizationModeEXT, commandBuffer, conservativeRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetConservativeRasterizationModeEXT", e); }
    }

    public void CmdSetExtraPrimitiveOverestimationSizeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, float extraPrimitiveOverestimationSize) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        try { MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT, commandBuffer, extraPrimitiveOverestimationSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExtraPrimitiveOverestimationSizeEXT", e); }
    }

    public void CmdSetDepthClipEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int depthClipEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthClipEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipEnableEXT");
        try { MH_vkCmdSetDepthClipEnableEXT.invokeExact(PFN_vkCmdSetDepthClipEnableEXT, commandBuffer, depthClipEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipEnableEXT", e); }
    }

    public void CmdSetSampleLocationsEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int sampleLocationsEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetSampleLocationsEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEnableEXT");
        try { MH_vkCmdSetSampleLocationsEnableEXT.invokeExact(PFN_vkCmdSetSampleLocationsEnableEXT, commandBuffer, sampleLocationsEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEnableEXT", e); }
    }

    public void CmdSetColorBlendAdvancedEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstAttachment, @CType("uint32_t") int attachmentCount, @CType("const VkColorBlendAdvancedEXT *") MemorySegment pColorBlendAdvanced) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetColorBlendAdvancedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendAdvancedEXT");
        try { MH_vkCmdSetColorBlendAdvancedEXT.invokeExact(PFN_vkCmdSetColorBlendAdvancedEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendAdvanced); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendAdvancedEXT", e); }
    }

    public void CmdSetProvokingVertexModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkProvokingVertexModeEXT") int provokingVertexMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetProvokingVertexModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetProvokingVertexModeEXT");
        try { MH_vkCmdSetProvokingVertexModeEXT.invokeExact(PFN_vkCmdSetProvokingVertexModeEXT, commandBuffer, provokingVertexMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetProvokingVertexModeEXT", e); }
    }

    public void CmdSetLineRasterizationModeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkLineRasterizationModeEXT") int lineRasterizationMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetLineRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineRasterizationModeEXT");
        try { MH_vkCmdSetLineRasterizationModeEXT.invokeExact(PFN_vkCmdSetLineRasterizationModeEXT, commandBuffer, lineRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineRasterizationModeEXT", e); }
    }

    public void CmdSetLineStippleEnableEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int stippledLineEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetLineStippleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEnableEXT");
        try { MH_vkCmdSetLineStippleEnableEXT.invokeExact(PFN_vkCmdSetLineStippleEnableEXT, commandBuffer, stippledLineEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleEnableEXT", e); }
    }

    public void CmdSetDepthClipNegativeOneToOneEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int negativeOneToOne) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthClipNegativeOneToOneEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipNegativeOneToOneEXT");
        try { MH_vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(PFN_vkCmdSetDepthClipNegativeOneToOneEXT, commandBuffer, negativeOneToOne); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipNegativeOneToOneEXT", e); }
    }

    public void CmdSetViewportWScalingEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int viewportWScalingEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetViewportWScalingEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingEnableNV");
        try { MH_vkCmdSetViewportWScalingEnableNV.invokeExact(PFN_vkCmdSetViewportWScalingEnableNV, commandBuffer, viewportWScalingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingEnableNV", e); }
    }

    public void CmdSetViewportSwizzleNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int firstViewport, @CType("uint32_t") int viewportCount, @CType("const VkViewportSwizzleNV *") MemorySegment pViewportSwizzles) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetViewportSwizzleNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportSwizzleNV");
        try { MH_vkCmdSetViewportSwizzleNV.invokeExact(PFN_vkCmdSetViewportSwizzleNV, commandBuffer, firstViewport, viewportCount, pViewportSwizzles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportSwizzleNV", e); }
    }

    public void CmdSetCoverageToColorEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int coverageToColorEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCoverageToColorEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorEnableNV");
        try { MH_vkCmdSetCoverageToColorEnableNV.invokeExact(PFN_vkCmdSetCoverageToColorEnableNV, commandBuffer, coverageToColorEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorEnableNV", e); }
    }

    public void CmdSetCoverageToColorLocationNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int coverageToColorLocation) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCoverageToColorLocationNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorLocationNV");
        try { MH_vkCmdSetCoverageToColorLocationNV.invokeExact(PFN_vkCmdSetCoverageToColorLocationNV, commandBuffer, coverageToColorLocation); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorLocationNV", e); }
    }

    public void CmdSetCoverageModulationModeNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCoverageModulationModeNV") int coverageModulationMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCoverageModulationModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationModeNV");
        try { MH_vkCmdSetCoverageModulationModeNV.invokeExact(PFN_vkCmdSetCoverageModulationModeNV, commandBuffer, coverageModulationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationModeNV", e); }
    }

    public void CmdSetCoverageModulationTableEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int coverageModulationTableEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCoverageModulationTableEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableEnableNV");
        try { MH_vkCmdSetCoverageModulationTableEnableNV.invokeExact(PFN_vkCmdSetCoverageModulationTableEnableNV, commandBuffer, coverageModulationTableEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableEnableNV", e); }
    }

    public void CmdSetCoverageModulationTableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("uint32_t") int coverageModulationTableCount, @CType("const float *") MemorySegment pCoverageModulationTable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCoverageModulationTableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableNV");
        try { MH_vkCmdSetCoverageModulationTableNV.invokeExact(PFN_vkCmdSetCoverageModulationTableNV, commandBuffer, coverageModulationTableCount, pCoverageModulationTable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableNV", e); }
    }

    public void CmdSetShadingRateImageEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int shadingRateImageEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetShadingRateImageEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetShadingRateImageEnableNV");
        try { MH_vkCmdSetShadingRateImageEnableNV.invokeExact(PFN_vkCmdSetShadingRateImageEnableNV, commandBuffer, shadingRateImageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetShadingRateImageEnableNV", e); }
    }

    public void CmdSetRepresentativeFragmentTestEnableNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkBool32") int representativeFragmentTestEnable) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetRepresentativeFragmentTestEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRepresentativeFragmentTestEnableNV");
        try { MH_vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(PFN_vkCmdSetRepresentativeFragmentTestEnableNV, commandBuffer, representativeFragmentTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRepresentativeFragmentTestEnableNV", e); }
    }

    public void CmdSetCoverageReductionModeNV(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkCoverageReductionModeNV") int coverageReductionMode) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetCoverageReductionModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageReductionModeNV");
        try { MH_vkCmdSetCoverageReductionModeNV.invokeExact(PFN_vkCmdSetCoverageReductionModeNV, commandBuffer, coverageReductionMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageReductionModeNV", e); }
    }

    public void CmdSetDepthClampRangeEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDepthClampModeEXT") int depthClampMode, @CType("const VkDepthClampRangeEXT *") MemorySegment pDepthClampRange) {
        if (Unmarshal.isNullPointer(PFN_vkCmdSetDepthClampRangeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampRangeEXT");
        try { MH_vkCmdSetDepthClampRangeEXT.invokeExact(PFN_vkCmdSetDepthClampRangeEXT, commandBuffer, depthClampMode, pDepthClampRange); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampRangeEXT", e); }
    }

}
