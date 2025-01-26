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
    public static final int VK_STRUCTURE_TYPE_SHADER_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT = 1000225001;
    public static final int VK_OBJECT_TYPE_SHADER_EXT = 1000482000;
    public static final int VK_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;
    public static final int VK_ERROR_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;
    public static final int VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT = 0x00000002;
    public static final int VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT = 0x00000004;
    public static final int VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT = 0x00000008;
    public static final int VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT = 0x00000010;
    public static final int VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT = 0x00000020;
    public static final int VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 0x00000040;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateShadersEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyShaderEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetShaderBinaryDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
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
        private Handles(MemorySegment device, VKLoadFunc func) {
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

    public VKEXTShaderObject(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreateShadersEXT(VkDevice device, uint32_t createInfoCount, const VkShaderCreateInfoEXT* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkShaderEXT* pShaders);
    /// ```
    public int CreateShadersEXT(MemorySegment device, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pShaders) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateShadersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateShadersEXT");
        try { return (int) Handles.MH_vkCreateShadersEXT.invokeExact(handles.PFN_vkCreateShadersEXT, device, createInfoCount, pCreateInfos, pAllocator, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShadersEXT", e); }
    }

    /// ```
    /// void vkDestroyShaderEXT(VkDevice device, VkShaderEXT shader, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyShaderEXT(MemorySegment device, long shader, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyShaderEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyShaderEXT");
        try { Handles.MH_vkDestroyShaderEXT.invokeExact(handles.PFN_vkDestroyShaderEXT, device, shader, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyShaderEXT", e); }
    }

    /// ```
    /// VkResult vkGetShaderBinaryDataEXT(VkDevice device, VkShaderEXT shader, size_t* pDataSize, void* pData);
    /// ```
    public int GetShaderBinaryDataEXT(MemorySegment device, long shader, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetShaderBinaryDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetShaderBinaryDataEXT");
        try { return (int) Handles.MH_vkGetShaderBinaryDataEXT.invokeExact(handles.PFN_vkGetShaderBinaryDataEXT, device, shader, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderBinaryDataEXT", e); }
    }

    /// ```
    /// void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, uint32_t stageCount, const VkShaderStageFlagBits* pStages, const VkShaderEXT* pShaders);
    /// ```
    public void CmdBindShadersEXT(MemorySegment commandBuffer, int stageCount, MemorySegment pStages, MemorySegment pShaders) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindShadersEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindShadersEXT");
        try { Handles.MH_vkCmdBindShadersEXT.invokeExact(handles.PFN_vkCmdBindShadersEXT, commandBuffer, stageCount, pStages, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindShadersEXT", e); }
    }

    /// ```
    /// void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, VkCullModeFlags cullMode);
    /// ```
    public void CmdSetCullModeEXT(MemorySegment commandBuffer, int cullMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCullModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { Handles.MH_vkCmdSetCullModeEXT.invokeExact(handles.PFN_vkCmdSetCullModeEXT, commandBuffer, cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCullModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, VkFrontFace frontFace);
    /// ```
    public void CmdSetFrontFaceEXT(MemorySegment commandBuffer, int frontFace) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetFrontFaceEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { Handles.MH_vkCmdSetFrontFaceEXT.invokeExact(handles.PFN_vkCmdSetFrontFaceEXT, commandBuffer, frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetFrontFaceEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, VkPrimitiveTopology primitiveTopology);
    /// ```
    public void CmdSetPrimitiveTopologyEXT(MemorySegment commandBuffer, int primitiveTopology) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPrimitiveTopologyEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { Handles.MH_vkCmdSetPrimitiveTopologyEXT.invokeExact(handles.PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer, primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPrimitiveTopologyEXT", e); }
    }

    /// ```
    /// void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public void CmdSetViewportWithCountEXT(MemorySegment commandBuffer, int viewportCount, MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetViewportWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { Handles.MH_vkCmdSetViewportWithCountEXT.invokeExact(handles.PFN_vkCmdSetViewportWithCountEXT, commandBuffer, viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetViewportWithCountEXT", e); }
    }

    /// ```
    /// void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public void CmdSetScissorWithCountEXT(MemorySegment commandBuffer, int scissorCount, MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetScissorWithCountEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { Handles.MH_vkCmdSetScissorWithCountEXT.invokeExact(handles.PFN_vkCmdSetScissorWithCountEXT, commandBuffer, scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetScissorWithCountEXT", e); }
    }

    /// ```
    /// void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes, const VkDeviceSize* pStrides);
    /// ```
    public void CmdBindVertexBuffers2EXT(MemorySegment commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets, MemorySegment pSizes, MemorySegment pStrides) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBindVertexBuffers2EXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { Handles.MH_vkCmdBindVertexBuffers2EXT.invokeExact(handles.PFN_vkCmdBindVertexBuffers2EXT, commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBindVertexBuffers2EXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthTestEnable);
    /// ```
    public void CmdSetDepthTestEnableEXT(MemorySegment commandBuffer, int depthTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { Handles.MH_vkCmdSetDepthTestEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthTestEnableEXT, commandBuffer, depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthWriteEnable);
    /// ```
    public void CmdSetDepthWriteEnableEXT(MemorySegment commandBuffer, int depthWriteEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthWriteEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { Handles.MH_vkCmdSetDepthWriteEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer, depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthWriteEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, VkCompareOp depthCompareOp);
    /// ```
    public void CmdSetDepthCompareOpEXT(MemorySegment commandBuffer, int depthCompareOp) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthCompareOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { Handles.MH_vkCmdSetDepthCompareOpEXT.invokeExact(handles.PFN_vkCmdSetDepthCompareOpEXT, commandBuffer, depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthCompareOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthBoundsTestEnable);
    /// ```
    public void CmdSetDepthBoundsTestEnableEXT(MemorySegment commandBuffer, int depthBoundsTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { Handles.MH_vkCmdSetDepthBoundsTestEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer, depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBoundsTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, VkBool32 stencilTestEnable);
    /// ```
    public void CmdSetStencilTestEnableEXT(MemorySegment commandBuffer, int stencilTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilTestEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { Handles.MH_vkCmdSetStencilTestEnableEXT.invokeExact(handles.PFN_vkCmdSetStencilTestEnableEXT, commandBuffer, stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, VkStencilFaceFlags faceMask, VkStencilOp failOp, VkStencilOp passOp, VkStencilOp depthFailOp, VkCompareOp compareOp);
    /// ```
    public void CmdSetStencilOpEXT(MemorySegment commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetStencilOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { Handles.MH_vkCmdSetStencilOpEXT.invokeExact(handles.PFN_vkCmdSetStencilOpEXT, commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetStencilOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, const VkVertexInputBindingDescription2EXT* pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);
    /// ```
    public void CmdSetVertexInputEXT(MemorySegment commandBuffer, int vertexBindingDescriptionCount, MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, MemorySegment pVertexAttributeDescriptions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetVertexInputEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { Handles.MH_vkCmdSetVertexInputEXT.invokeExact(handles.PFN_vkCmdSetVertexInputEXT, commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetVertexInputEXT", e); }
    }

    /// ```
    /// void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, uint32_t patchControlPoints);
    /// ```
    public void CmdSetPatchControlPointsEXT(MemorySegment commandBuffer, int patchControlPoints) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPatchControlPointsEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { Handles.MH_vkCmdSetPatchControlPointsEXT.invokeExact(handles.PFN_vkCmdSetPatchControlPointsEXT, commandBuffer, patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPatchControlPointsEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, VkBool32 rasterizerDiscardEnable);
    /// ```
    public void CmdSetRasterizerDiscardEnableEXT(MemorySegment commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { Handles.MH_vkCmdSetRasterizerDiscardEnableEXT.invokeExact(handles.PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer, rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRasterizerDiscardEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthBiasEnable);
    /// ```
    public void CmdSetDepthBiasEnableEXT(MemorySegment commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthBiasEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { Handles.MH_vkCmdSetDepthBiasEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer, depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthBiasEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, VkLogicOp logicOp);
    /// ```
    public void CmdSetLogicOpEXT(MemorySegment commandBuffer, int logicOp) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLogicOpEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { Handles.MH_vkCmdSetLogicOpEXT.invokeExact(handles.PFN_vkCmdSetLogicOpEXT, commandBuffer, logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLogicOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, VkBool32 primitiveRestartEnable);
    /// ```
    public void CmdSetPrimitiveRestartEnableEXT(MemorySegment commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { Handles.MH_vkCmdSetPrimitiveRestartEnableEXT.invokeExact(handles.PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer, primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPrimitiveRestartEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, VkTessellationDomainOrigin domainOrigin);
    /// ```
    public void CmdSetTessellationDomainOriginEXT(MemorySegment commandBuffer, int domainOrigin) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetTessellationDomainOriginEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { Handles.MH_vkCmdSetTessellationDomainOriginEXT.invokeExact(handles.PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer, domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetTessellationDomainOriginEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthClampEnable);
    /// ```
    public void CmdSetDepthClampEnableEXT(MemorySegment commandBuffer, int depthClampEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthClampEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampEnableEXT");
        try { Handles.MH_vkCmdSetDepthClampEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthClampEnableEXT, commandBuffer, depthClampEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthClampEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, VkPolygonMode polygonMode);
    /// ```
    public void CmdSetPolygonModeEXT(MemorySegment commandBuffer, int polygonMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetPolygonModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetPolygonModeEXT");
        try { Handles.MH_vkCmdSetPolygonModeEXT.invokeExact(handles.PFN_vkCmdSetPolygonModeEXT, commandBuffer, polygonMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetPolygonModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, VkSampleCountFlagBits rasterizationSamples);
    /// ```
    public void CmdSetRasterizationSamplesEXT(MemorySegment commandBuffer, int rasterizationSamples) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRasterizationSamplesEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationSamplesEXT");
        try { Handles.MH_vkCmdSetRasterizationSamplesEXT.invokeExact(handles.PFN_vkCmdSetRasterizationSamplesEXT, commandBuffer, rasterizationSamples); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRasterizationSamplesEXT", e); }
    }

    /// ```
    /// void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, VkSampleCountFlagBits samples, const VkSampleMask* pSampleMask);
    /// ```
    public void CmdSetSampleMaskEXT(MemorySegment commandBuffer, int samples, MemorySegment pSampleMask) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetSampleMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleMaskEXT");
        try { Handles.MH_vkCmdSetSampleMaskEXT.invokeExact(handles.PFN_vkCmdSetSampleMaskEXT, commandBuffer, samples, pSampleMask); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetSampleMaskEXT", e); }
    }

    /// ```
    /// void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, VkBool32 alphaToCoverageEnable);
    /// ```
    public void CmdSetAlphaToCoverageEnableEXT(MemorySegment commandBuffer, int alphaToCoverageEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetAlphaToCoverageEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToCoverageEnableEXT");
        try { Handles.MH_vkCmdSetAlphaToCoverageEnableEXT.invokeExact(handles.PFN_vkCmdSetAlphaToCoverageEnableEXT, commandBuffer, alphaToCoverageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetAlphaToCoverageEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, VkBool32 alphaToOneEnable);
    /// ```
    public void CmdSetAlphaToOneEnableEXT(MemorySegment commandBuffer, int alphaToOneEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetAlphaToOneEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetAlphaToOneEnableEXT");
        try { Handles.MH_vkCmdSetAlphaToOneEnableEXT.invokeExact(handles.PFN_vkCmdSetAlphaToOneEnableEXT, commandBuffer, alphaToOneEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetAlphaToOneEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, VkBool32 logicOpEnable);
    /// ```
    public void CmdSetLogicOpEnableEXT(MemorySegment commandBuffer, int logicOpEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLogicOpEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEnableEXT");
        try { Handles.MH_vkCmdSetLogicOpEnableEXT.invokeExact(handles.PFN_vkCmdSetLogicOpEnableEXT, commandBuffer, logicOpEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLogicOpEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkBool32* pColorBlendEnables);
    /// ```
    public void CmdSetColorBlendEnableEXT(MemorySegment commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendEnables) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetColorBlendEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEnableEXT");
        try { Handles.MH_vkCmdSetColorBlendEnableEXT.invokeExact(handles.PFN_vkCmdSetColorBlendEnableEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendEnables); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetColorBlendEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendEquationEXT* pColorBlendEquations);
    /// ```
    public void CmdSetColorBlendEquationEXT(MemorySegment commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendEquations) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetColorBlendEquationEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEquationEXT");
        try { Handles.MH_vkCmdSetColorBlendEquationEXT.invokeExact(handles.PFN_vkCmdSetColorBlendEquationEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendEquations); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetColorBlendEquationEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorComponentFlags* pColorWriteMasks);
    /// ```
    public void CmdSetColorWriteMaskEXT(MemorySegment commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorWriteMasks) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetColorWriteMaskEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorWriteMaskEXT");
        try { Handles.MH_vkCmdSetColorWriteMaskEXT.invokeExact(handles.PFN_vkCmdSetColorWriteMaskEXT, commandBuffer, firstAttachment, attachmentCount, pColorWriteMasks); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetColorWriteMaskEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, uint32_t rasterizationStream);
    /// ```
    public void CmdSetRasterizationStreamEXT(MemorySegment commandBuffer, int rasterizationStream) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRasterizationStreamEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRasterizationStreamEXT");
        try { Handles.MH_vkCmdSetRasterizationStreamEXT.invokeExact(handles.PFN_vkCmdSetRasterizationStreamEXT, commandBuffer, rasterizationStream); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRasterizationStreamEXT", e); }
    }

    /// ```
    /// void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, VkConservativeRasterizationModeEXT conservativeRasterizationMode);
    /// ```
    public void CmdSetConservativeRasterizationModeEXT(MemorySegment commandBuffer, int conservativeRasterizationMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetConservativeRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetConservativeRasterizationModeEXT");
        try { Handles.MH_vkCmdSetConservativeRasterizationModeEXT.invokeExact(handles.PFN_vkCmdSetConservativeRasterizationModeEXT, commandBuffer, conservativeRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetConservativeRasterizationModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize);
    /// ```
    public void CmdSetExtraPrimitiveOverestimationSizeEXT(MemorySegment commandBuffer, float extraPrimitiveOverestimationSize) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        try { Handles.MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(handles.PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT, commandBuffer, extraPrimitiveOverestimationSize); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetExtraPrimitiveOverestimationSizeEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, VkBool32 depthClipEnable);
    /// ```
    public void CmdSetDepthClipEnableEXT(MemorySegment commandBuffer, int depthClipEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthClipEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipEnableEXT");
        try { Handles.MH_vkCmdSetDepthClipEnableEXT.invokeExact(handles.PFN_vkCmdSetDepthClipEnableEXT, commandBuffer, depthClipEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthClipEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, VkBool32 sampleLocationsEnable);
    /// ```
    public void CmdSetSampleLocationsEnableEXT(MemorySegment commandBuffer, int sampleLocationsEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetSampleLocationsEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEnableEXT");
        try { Handles.MH_vkCmdSetSampleLocationsEnableEXT.invokeExact(handles.PFN_vkCmdSetSampleLocationsEnableEXT, commandBuffer, sampleLocationsEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetSampleLocationsEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendAdvancedEXT* pColorBlendAdvanced);
    /// ```
    public void CmdSetColorBlendAdvancedEXT(MemorySegment commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendAdvanced) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetColorBlendAdvancedEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetColorBlendAdvancedEXT");
        try { Handles.MH_vkCmdSetColorBlendAdvancedEXT.invokeExact(handles.PFN_vkCmdSetColorBlendAdvancedEXT, commandBuffer, firstAttachment, attachmentCount, pColorBlendAdvanced); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetColorBlendAdvancedEXT", e); }
    }

    /// ```
    /// void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, VkProvokingVertexModeEXT provokingVertexMode);
    /// ```
    public void CmdSetProvokingVertexModeEXT(MemorySegment commandBuffer, int provokingVertexMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetProvokingVertexModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetProvokingVertexModeEXT");
        try { Handles.MH_vkCmdSetProvokingVertexModeEXT.invokeExact(handles.PFN_vkCmdSetProvokingVertexModeEXT, commandBuffer, provokingVertexMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetProvokingVertexModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, VkLineRasterizationModeEXT lineRasterizationMode);
    /// ```
    public void CmdSetLineRasterizationModeEXT(MemorySegment commandBuffer, int lineRasterizationMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLineRasterizationModeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineRasterizationModeEXT");
        try { Handles.MH_vkCmdSetLineRasterizationModeEXT.invokeExact(handles.PFN_vkCmdSetLineRasterizationModeEXT, commandBuffer, lineRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLineRasterizationModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, VkBool32 stippledLineEnable);
    /// ```
    public void CmdSetLineStippleEnableEXT(MemorySegment commandBuffer, int stippledLineEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetLineStippleEnableEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEnableEXT");
        try { Handles.MH_vkCmdSetLineStippleEnableEXT.invokeExact(handles.PFN_vkCmdSetLineStippleEnableEXT, commandBuffer, stippledLineEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetLineStippleEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, VkBool32 negativeOneToOne);
    /// ```
    public void CmdSetDepthClipNegativeOneToOneEXT(MemorySegment commandBuffer, int negativeOneToOne) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthClipNegativeOneToOneEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClipNegativeOneToOneEXT");
        try { Handles.MH_vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(handles.PFN_vkCmdSetDepthClipNegativeOneToOneEXT, commandBuffer, negativeOneToOne); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthClipNegativeOneToOneEXT", e); }
    }

    /// ```
    /// void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, VkBool32 viewportWScalingEnable);
    /// ```
    public void CmdSetViewportWScalingEnableNV(MemorySegment commandBuffer, int viewportWScalingEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetViewportWScalingEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingEnableNV");
        try { Handles.MH_vkCmdSetViewportWScalingEnableNV.invokeExact(handles.PFN_vkCmdSetViewportWScalingEnableNV, commandBuffer, viewportWScalingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetViewportWScalingEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewportSwizzleNV* pViewportSwizzles);
    /// ```
    public void CmdSetViewportSwizzleNV(MemorySegment commandBuffer, int firstViewport, int viewportCount, MemorySegment pViewportSwizzles) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetViewportSwizzleNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetViewportSwizzleNV");
        try { Handles.MH_vkCmdSetViewportSwizzleNV.invokeExact(handles.PFN_vkCmdSetViewportSwizzleNV, commandBuffer, firstViewport, viewportCount, pViewportSwizzles); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetViewportSwizzleNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, VkBool32 coverageToColorEnable);
    /// ```
    public void CmdSetCoverageToColorEnableNV(MemorySegment commandBuffer, int coverageToColorEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCoverageToColorEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorEnableNV");
        try { Handles.MH_vkCmdSetCoverageToColorEnableNV.invokeExact(handles.PFN_vkCmdSetCoverageToColorEnableNV, commandBuffer, coverageToColorEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCoverageToColorEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, uint32_t coverageToColorLocation);
    /// ```
    public void CmdSetCoverageToColorLocationNV(MemorySegment commandBuffer, int coverageToColorLocation) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCoverageToColorLocationNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorLocationNV");
        try { Handles.MH_vkCmdSetCoverageToColorLocationNV.invokeExact(handles.PFN_vkCmdSetCoverageToColorLocationNV, commandBuffer, coverageToColorLocation); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCoverageToColorLocationNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, VkCoverageModulationModeNV coverageModulationMode);
    /// ```
    public void CmdSetCoverageModulationModeNV(MemorySegment commandBuffer, int coverageModulationMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCoverageModulationModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationModeNV");
        try { Handles.MH_vkCmdSetCoverageModulationModeNV.invokeExact(handles.PFN_vkCmdSetCoverageModulationModeNV, commandBuffer, coverageModulationMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCoverageModulationModeNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, VkBool32 coverageModulationTableEnable);
    /// ```
    public void CmdSetCoverageModulationTableEnableNV(MemorySegment commandBuffer, int coverageModulationTableEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCoverageModulationTableEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableEnableNV");
        try { Handles.MH_vkCmdSetCoverageModulationTableEnableNV.invokeExact(handles.PFN_vkCmdSetCoverageModulationTableEnableNV, commandBuffer, coverageModulationTableEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCoverageModulationTableEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, const float* pCoverageModulationTable);
    /// ```
    public void CmdSetCoverageModulationTableNV(MemorySegment commandBuffer, int coverageModulationTableCount, MemorySegment pCoverageModulationTable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCoverageModulationTableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableNV");
        try { Handles.MH_vkCmdSetCoverageModulationTableNV.invokeExact(handles.PFN_vkCmdSetCoverageModulationTableNV, commandBuffer, coverageModulationTableCount, pCoverageModulationTable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCoverageModulationTableNV", e); }
    }

    /// ```
    /// void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, VkBool32 shadingRateImageEnable);
    /// ```
    public void CmdSetShadingRateImageEnableNV(MemorySegment commandBuffer, int shadingRateImageEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetShadingRateImageEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetShadingRateImageEnableNV");
        try { Handles.MH_vkCmdSetShadingRateImageEnableNV.invokeExact(handles.PFN_vkCmdSetShadingRateImageEnableNV, commandBuffer, shadingRateImageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetShadingRateImageEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, VkBool32 representativeFragmentTestEnable);
    /// ```
    public void CmdSetRepresentativeFragmentTestEnableNV(MemorySegment commandBuffer, int representativeFragmentTestEnable) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetRepresentativeFragmentTestEnableNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetRepresentativeFragmentTestEnableNV");
        try { Handles.MH_vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(handles.PFN_vkCmdSetRepresentativeFragmentTestEnableNV, commandBuffer, representativeFragmentTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetRepresentativeFragmentTestEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, VkCoverageReductionModeNV coverageReductionMode);
    /// ```
    public void CmdSetCoverageReductionModeNV(MemorySegment commandBuffer, int coverageReductionMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetCoverageReductionModeNV)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetCoverageReductionModeNV");
        try { Handles.MH_vkCmdSetCoverageReductionModeNV.invokeExact(handles.PFN_vkCmdSetCoverageReductionModeNV, commandBuffer, coverageReductionMode); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetCoverageReductionModeNV", e); }
    }

    /// ```
    /// void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, VkDepthClampModeEXT depthClampMode, const VkDepthClampRangeEXT* pDepthClampRange);
    /// ```
    public void CmdSetDepthClampRangeEXT(MemorySegment commandBuffer, int depthClampMode, MemorySegment pDepthClampRange) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdSetDepthClampRangeEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdSetDepthClampRangeEXT");
        try { Handles.MH_vkCmdSetDepthClampRangeEXT.invokeExact(handles.PFN_vkCmdSetDepthClampRangeEXT, commandBuffer, depthClampMode, pDepthClampRange); }
        catch (Throwable e) { throw new RuntimeException("error in CmdSetDepthClampRangeEXT", e); }
    }

}
