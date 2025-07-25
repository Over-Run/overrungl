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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTShaderObject {
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
    public static final class Handles {
        public static final MethodHandle MH_vkCreateShadersEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyShaderEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetShaderBinaryDataEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindShadersEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetCullModeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetFrontFaceEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveTopologyEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWithCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetScissorWithCountEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBindVertexBuffers2EXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetDepthTestEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthWriteEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthCompareOpEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBoundsTestEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilTestEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetStencilOpEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetVertexInputEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetPatchControlPointsEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizerDiscardEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthBiasEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLogicOpEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPrimitiveRestartEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetTessellationDomainOriginEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthClampEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetPolygonModeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRasterizationSamplesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetSampleMaskEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetAlphaToCoverageEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetAlphaToOneEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLogicOpEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetColorBlendEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetColorBlendEquationEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetColorWriteMaskEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetRasterizationStreamEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetConservativeRasterizationModeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_vkCmdSetDepthClipEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetSampleLocationsEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetColorBlendAdvancedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetProvokingVertexModeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLineRasterizationModeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetLineStippleEnableEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthClipNegativeOneToOneEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportWScalingEnableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetViewportSwizzleNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetCoverageToColorEnableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageToColorLocationNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageModulationModeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageModulationTableEnableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageModulationTableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdSetShadingRateImageEnableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetRepresentativeFragmentTestEnableNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetCoverageReductionModeNV = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_vkCmdSetDepthClampRangeEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTShaderObject() {}

    /// ```
    /// (int) VkResult vkCreateShadersEXT((struct VkDevice*) VkDevice device, uint32_t createInfoCount, const VkShaderCreateInfoEXT* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkShaderEXT* pShaders);
    /// ```
    public static int vkCreateShadersEXT(VkDevice device, int createInfoCount, MemorySegment pCreateInfos, MemorySegment pAllocator, MemorySegment pShaders) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateShadersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateShadersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateShadersEXT", device, createInfoCount, pCreateInfos, pAllocator, pShaders); }
        return (int) Handles.MH_vkCreateShadersEXT.invokeExact(device.capabilities().PFN_vkCreateShadersEXT, device.segment(), createInfoCount, pCreateInfos, pAllocator, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShadersEXT", e); }
    }

    /// ```
    /// void vkDestroyShaderEXT((struct VkDevice*) VkDevice device, (uint64_t) VkShaderEXT shader, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyShaderEXT(VkDevice device, long shader, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyShaderEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyShaderEXT", device, shader, pAllocator); }
        Handles.MH_vkDestroyShaderEXT.invokeExact(device.capabilities().PFN_vkDestroyShaderEXT, device.segment(), shader, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderEXT", e); }
    }

    /// ```
    /// (int) VkResult vkGetShaderBinaryDataEXT((struct VkDevice*) VkDevice device, (uint64_t) VkShaderEXT shader, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetShaderBinaryDataEXT(VkDevice device, long shader, MemorySegment pDataSize, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderBinaryDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetShaderBinaryDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetShaderBinaryDataEXT", device, shader, pDataSize, pData); }
        return (int) Handles.MH_vkGetShaderBinaryDataEXT.invokeExact(device.capabilities().PFN_vkGetShaderBinaryDataEXT, device.segment(), shader, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderBinaryDataEXT", e); }
    }

    /// ```
    /// void vkCmdBindShadersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t stageCount, const VkShaderStageFlagBits* pStages, const VkShaderEXT* pShaders);
    /// ```
    public static void vkCmdBindShadersEXT(VkCommandBuffer commandBuffer, int stageCount, MemorySegment pStages, MemorySegment pShaders) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindShadersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindShadersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindShadersEXT", commandBuffer, stageCount, pStages, pShaders); }
        Handles.MH_vkCmdBindShadersEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindShadersEXT, commandBuffer.segment(), stageCount, pStages, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindShadersEXT", e); }
    }

    /// ```
    /// void vkCmdSetCullModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkCullModeFlags cullMode);
    /// ```
    public static void vkCmdSetCullModeEXT(VkCommandBuffer commandBuffer, int cullMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCullModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCullModeEXT", commandBuffer, cullMode); }
        Handles.MH_vkCmdSetCullModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCullModeEXT, commandBuffer.segment(), cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetFrontFaceEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkFrontFace frontFace);
    /// ```
    public static void vkCmdSetFrontFaceEXT(VkCommandBuffer commandBuffer, int frontFace) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetFrontFaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetFrontFaceEXT", commandBuffer, frontFace); }
        Handles.MH_vkCmdSetFrontFaceEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetFrontFaceEXT, commandBuffer.segment(), frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFaceEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveTopologyEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPrimitiveTopology primitiveTopology);
    /// ```
    public static void vkCmdSetPrimitiveTopologyEXT(VkCommandBuffer commandBuffer, int primitiveTopology) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopologyEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveTopologyEXT", commandBuffer, primitiveTopology); }
        Handles.MH_vkCmdSetPrimitiveTopologyEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer.segment(), primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopologyEXT", e); }
    }

    /// ```
    /// void vkCmdSetViewportWithCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public static void vkCmdSetViewportWithCountEXT(VkCommandBuffer commandBuffer, int viewportCount, MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWithCountEXT", commandBuffer, viewportCount, pViewports); }
        Handles.MH_vkCmdSetViewportWithCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCountEXT, commandBuffer.segment(), viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCountEXT", e); }
    }

    /// ```
    /// void vkCmdSetScissorWithCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public static void vkCmdSetScissorWithCountEXT(VkCommandBuffer commandBuffer, int scissorCount, MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetScissorWithCountEXT", commandBuffer, scissorCount, pScissors); }
        Handles.MH_vkCmdSetScissorWithCountEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCountEXT, commandBuffer.segment(), scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCountEXT", e); }
    }

    /// ```
    /// void vkCmdBindVertexBuffers2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes, const VkDeviceSize* pStrides);
    /// ```
    public static void vkCmdBindVertexBuffers2EXT(VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, MemorySegment pBuffers, MemorySegment pOffsets, MemorySegment pSizes, MemorySegment pStrides) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindVertexBuffers2EXT", commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        Handles.MH_vkCmdBindVertexBuffers2EXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2EXT, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2EXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthTestEnable);
    /// ```
    public static void vkCmdSetDepthTestEnableEXT(VkCommandBuffer commandBuffer, int depthTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthTestEnableEXT", commandBuffer, depthTestEnable); }
        Handles.MH_vkCmdSetDepthTestEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnableEXT, commandBuffer.segment(), depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthWriteEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthWriteEnable);
    /// ```
    public static void vkCmdSetDepthWriteEnableEXT(VkCommandBuffer commandBuffer, int depthWriteEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthWriteEnableEXT", commandBuffer, depthWriteEnable); }
        Handles.MH_vkCmdSetDepthWriteEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer.segment(), depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthCompareOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCompareOp depthCompareOp);
    /// ```
    public static void vkCmdSetDepthCompareOpEXT(VkCommandBuffer commandBuffer, int depthCompareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthCompareOpEXT", commandBuffer, depthCompareOp); }
        Handles.MH_vkCmdSetDepthCompareOpEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOpEXT, commandBuffer.segment(), depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBoundsTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthBoundsTestEnable);
    /// ```
    public static void vkCmdSetDepthBoundsTestEnableEXT(VkCommandBuffer commandBuffer, int depthBoundsTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBoundsTestEnableEXT", commandBuffer, depthBoundsTestEnable); }
        Handles.MH_vkCmdSetDepthBoundsTestEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer.segment(), depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetStencilTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 stencilTestEnable);
    /// ```
    public static void vkCmdSetStencilTestEnableEXT(VkCommandBuffer commandBuffer, int stencilTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilTestEnableEXT", commandBuffer, stencilTestEnable); }
        Handles.MH_vkCmdSetStencilTestEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnableEXT, commandBuffer.segment(), stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetStencilOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, (int) VkStencilOp failOp, (int) VkStencilOp passOp, (int) VkStencilOp depthFailOp, (int) VkCompareOp compareOp);
    /// ```
    public static void vkCmdSetStencilOpEXT(VkCommandBuffer commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilOpEXT", commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        Handles.MH_vkCmdSetStencilOpEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilOpEXT, commandBuffer.segment(), faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetVertexInputEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, const VkVertexInputBindingDescription2EXT* pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);
    /// ```
    public static void vkCmdSetVertexInputEXT(VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, MemorySegment pVertexAttributeDescriptions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetVertexInputEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetVertexInputEXT", commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        Handles.MH_vkCmdSetVertexInputEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetVertexInputEXT, commandBuffer.segment(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetVertexInputEXT", e); }
    }

    /// ```
    /// void vkCmdSetPatchControlPointsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t patchControlPoints);
    /// ```
    public static void vkCmdSetPatchControlPointsEXT(VkCommandBuffer commandBuffer, int patchControlPoints) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPatchControlPointsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPatchControlPointsEXT", commandBuffer, patchControlPoints); }
        Handles.MH_vkCmdSetPatchControlPointsEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPatchControlPointsEXT, commandBuffer.segment(), patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPatchControlPointsEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizerDiscardEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 rasterizerDiscardEnable);
    /// ```
    public static void vkCmdSetRasterizerDiscardEnableEXT(VkCommandBuffer commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizerDiscardEnableEXT", commandBuffer, rasterizerDiscardEnable); }
        Handles.MH_vkCmdSetRasterizerDiscardEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer.segment(), rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizerDiscardEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthBiasEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthBiasEnable);
    /// ```
    public static void vkCmdSetDepthBiasEnableEXT(VkCommandBuffer commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBiasEnableEXT", commandBuffer, depthBiasEnable); }
        Handles.MH_vkCmdSetDepthBiasEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer.segment(), depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBiasEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkLogicOp logicOp);
    /// ```
    public static void vkCmdSetLogicOpEXT(VkCommandBuffer commandBuffer, int logicOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLogicOpEXT", commandBuffer, logicOp); }
        Handles.MH_vkCmdSetLogicOpEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEXT, commandBuffer.segment(), logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEXT", e); }
    }

    /// ```
    /// void vkCmdSetPrimitiveRestartEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 primitiveRestartEnable);
    /// ```
    public static void vkCmdSetPrimitiveRestartEnableEXT(VkCommandBuffer commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveRestartEnableEXT", commandBuffer, primitiveRestartEnable); }
        Handles.MH_vkCmdSetPrimitiveRestartEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer.segment(), primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveRestartEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetTessellationDomainOriginEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkTessellationDomainOrigin domainOrigin);
    /// ```
    public static void vkCmdSetTessellationDomainOriginEXT(VkCommandBuffer commandBuffer, int domainOrigin) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetTessellationDomainOriginEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetTessellationDomainOriginEXT", commandBuffer, domainOrigin); }
        Handles.MH_vkCmdSetTessellationDomainOriginEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer.segment(), domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetTessellationDomainOriginEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClampEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthClampEnable);
    /// ```
    public static void vkCmdSetDepthClampEnableEXT(VkCommandBuffer commandBuffer, int depthClampEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClampEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClampEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClampEnableEXT", commandBuffer, depthClampEnable); }
        Handles.MH_vkCmdSetDepthClampEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClampEnableEXT, commandBuffer.segment(), depthClampEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetPolygonModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPolygonMode polygonMode);
    /// ```
    public static void vkCmdSetPolygonModeEXT(VkCommandBuffer commandBuffer, int polygonMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPolygonModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPolygonModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPolygonModeEXT", commandBuffer, polygonMode); }
        Handles.MH_vkCmdSetPolygonModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPolygonModeEXT, commandBuffer.segment(), polygonMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPolygonModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizationSamplesEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSampleCountFlagBits rasterizationSamples);
    /// ```
    public static void vkCmdSetRasterizationSamplesEXT(VkCommandBuffer commandBuffer, int rasterizationSamples) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizationSamplesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizationSamplesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizationSamplesEXT", commandBuffer, rasterizationSamples); }
        Handles.MH_vkCmdSetRasterizationSamplesEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizationSamplesEXT, commandBuffer.segment(), rasterizationSamples); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationSamplesEXT", e); }
    }

    /// ```
    /// void vkCmdSetSampleMaskEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSampleCountFlagBits samples, const VkSampleMask* pSampleMask);
    /// ```
    public static void vkCmdSetSampleMaskEXT(VkCommandBuffer commandBuffer, int samples, MemorySegment pSampleMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleMaskEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetSampleMaskEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetSampleMaskEXT", commandBuffer, samples, pSampleMask); }
        Handles.MH_vkCmdSetSampleMaskEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleMaskEXT, commandBuffer.segment(), samples, pSampleMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleMaskEXT", e); }
    }

    /// ```
    /// void vkCmdSetAlphaToCoverageEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 alphaToCoverageEnable);
    /// ```
    public static void vkCmdSetAlphaToCoverageEnableEXT(VkCommandBuffer commandBuffer, int alphaToCoverageEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAlphaToCoverageEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetAlphaToCoverageEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetAlphaToCoverageEnableEXT", commandBuffer, alphaToCoverageEnable); }
        Handles.MH_vkCmdSetAlphaToCoverageEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAlphaToCoverageEnableEXT, commandBuffer.segment(), alphaToCoverageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToCoverageEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetAlphaToOneEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 alphaToOneEnable);
    /// ```
    public static void vkCmdSetAlphaToOneEnableEXT(VkCommandBuffer commandBuffer, int alphaToOneEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAlphaToOneEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetAlphaToOneEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetAlphaToOneEnableEXT", commandBuffer, alphaToOneEnable); }
        Handles.MH_vkCmdSetAlphaToOneEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAlphaToOneEnableEXT, commandBuffer.segment(), alphaToOneEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToOneEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetLogicOpEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 logicOpEnable);
    /// ```
    public static void vkCmdSetLogicOpEnableEXT(VkCommandBuffer commandBuffer, int logicOpEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLogicOpEnableEXT", commandBuffer, logicOpEnable); }
        Handles.MH_vkCmdSetLogicOpEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEnableEXT, commandBuffer.segment(), logicOpEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkBool32* pColorBlendEnables);
    /// ```
    public static void vkCmdSetColorBlendEnableEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendEnables) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorBlendEnableEXT", commandBuffer, firstAttachment, attachmentCount, pColorBlendEnables); }
        Handles.MH_vkCmdSetColorBlendEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEnableEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendEquationEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendEquationEXT* pColorBlendEquations);
    /// ```
    public static void vkCmdSetColorBlendEquationEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendEquations) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEquationEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEquationEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorBlendEquationEXT", commandBuffer, firstAttachment, attachmentCount, pColorBlendEquations); }
        Handles.MH_vkCmdSetColorBlendEquationEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEquationEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendEquations); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEquationEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorWriteMaskEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorComponentFlags* pColorWriteMasks);
    /// ```
    public static void vkCmdSetColorWriteMaskEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorWriteMasks) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorWriteMaskEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorWriteMaskEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorWriteMaskEXT", commandBuffer, firstAttachment, attachmentCount, pColorWriteMasks); }
        Handles.MH_vkCmdSetColorWriteMaskEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorWriteMaskEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorWriteMasks); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorWriteMaskEXT", e); }
    }

    /// ```
    /// void vkCmdSetRasterizationStreamEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t rasterizationStream);
    /// ```
    public static void vkCmdSetRasterizationStreamEXT(VkCommandBuffer commandBuffer, int rasterizationStream) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizationStreamEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizationStreamEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizationStreamEXT", commandBuffer, rasterizationStream); }
        Handles.MH_vkCmdSetRasterizationStreamEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizationStreamEXT, commandBuffer.segment(), rasterizationStream); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationStreamEXT", e); }
    }

    /// ```
    /// void vkCmdSetConservativeRasterizationModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkConservativeRasterizationModeEXT conservativeRasterizationMode);
    /// ```
    public static void vkCmdSetConservativeRasterizationModeEXT(VkCommandBuffer commandBuffer, int conservativeRasterizationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetConservativeRasterizationModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetConservativeRasterizationModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetConservativeRasterizationModeEXT", commandBuffer, conservativeRasterizationMode); }
        Handles.MH_vkCmdSetConservativeRasterizationModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetConservativeRasterizationModeEXT, commandBuffer.segment(), conservativeRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetConservativeRasterizationModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetExtraPrimitiveOverestimationSizeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize);
    /// ```
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetExtraPrimitiveOverestimationSizeEXT", commandBuffer, extraPrimitiveOverestimationSize); }
        Handles.MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT, commandBuffer.segment(), extraPrimitiveOverestimationSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExtraPrimitiveOverestimationSizeEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClipEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthClipEnable);
    /// ```
    public static void vkCmdSetDepthClipEnableEXT(VkCommandBuffer commandBuffer, int depthClipEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClipEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClipEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClipEnableEXT", commandBuffer, depthClipEnable); }
        Handles.MH_vkCmdSetDepthClipEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClipEnableEXT, commandBuffer.segment(), depthClipEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetSampleLocationsEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 sampleLocationsEnable);
    /// ```
    public static void vkCmdSetSampleLocationsEnableEXT(VkCommandBuffer commandBuffer, int sampleLocationsEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetSampleLocationsEnableEXT", commandBuffer, sampleLocationsEnable); }
        Handles.MH_vkCmdSetSampleLocationsEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEnableEXT, commandBuffer.segment(), sampleLocationsEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetColorBlendAdvancedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendAdvancedEXT* pColorBlendAdvanced);
    /// ```
    public static void vkCmdSetColorBlendAdvancedEXT(VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, MemorySegment pColorBlendAdvanced) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendAdvancedEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorBlendAdvancedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorBlendAdvancedEXT", commandBuffer, firstAttachment, attachmentCount, pColorBlendAdvanced); }
        Handles.MH_vkCmdSetColorBlendAdvancedEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendAdvancedEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendAdvanced); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendAdvancedEXT", e); }
    }

    /// ```
    /// void vkCmdSetProvokingVertexModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkProvokingVertexModeEXT provokingVertexMode);
    /// ```
    public static void vkCmdSetProvokingVertexModeEXT(VkCommandBuffer commandBuffer, int provokingVertexMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetProvokingVertexModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetProvokingVertexModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetProvokingVertexModeEXT", commandBuffer, provokingVertexMode); }
        Handles.MH_vkCmdSetProvokingVertexModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetProvokingVertexModeEXT, commandBuffer.segment(), provokingVertexMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetProvokingVertexModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetLineRasterizationModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((int) VkLineRasterizationMode) VkLineRasterizationModeEXT lineRasterizationMode);
    /// ```
    public static void vkCmdSetLineRasterizationModeEXT(VkCommandBuffer commandBuffer, int lineRasterizationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineRasterizationModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineRasterizationModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineRasterizationModeEXT", commandBuffer, lineRasterizationMode); }
        Handles.MH_vkCmdSetLineRasterizationModeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineRasterizationModeEXT, commandBuffer.segment(), lineRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineRasterizationModeEXT", e); }
    }

    /// ```
    /// void vkCmdSetLineStippleEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 stippledLineEnable);
    /// ```
    public static void vkCmdSetLineStippleEnableEXT(VkCommandBuffer commandBuffer, int stippledLineEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineStippleEnableEXT", commandBuffer, stippledLineEnable); }
        Handles.MH_vkCmdSetLineStippleEnableEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEnableEXT, commandBuffer.segment(), stippledLineEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleEnableEXT", e); }
    }

    /// ```
    /// void vkCmdSetDepthClipNegativeOneToOneEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 negativeOneToOne);
    /// ```
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(VkCommandBuffer commandBuffer, int negativeOneToOne) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClipNegativeOneToOneEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClipNegativeOneToOneEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClipNegativeOneToOneEXT", commandBuffer, negativeOneToOne); }
        Handles.MH_vkCmdSetDepthClipNegativeOneToOneEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClipNegativeOneToOneEXT, commandBuffer.segment(), negativeOneToOne); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipNegativeOneToOneEXT", e); }
    }

    /// ```
    /// void vkCmdSetViewportWScalingEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 viewportWScalingEnable);
    /// ```
    public static void vkCmdSetViewportWScalingEnableNV(VkCommandBuffer commandBuffer, int viewportWScalingEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWScalingEnableNV", commandBuffer, viewportWScalingEnable); }
        Handles.MH_vkCmdSetViewportWScalingEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingEnableNV, commandBuffer.segment(), viewportWScalingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetViewportSwizzleNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewportSwizzleNV* pViewportSwizzles);
    /// ```
    public static void vkCmdSetViewportSwizzleNV(VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, MemorySegment pViewportSwizzles) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportSwizzleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportSwizzleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportSwizzleNV", commandBuffer, firstViewport, viewportCount, pViewportSwizzles); }
        Handles.MH_vkCmdSetViewportSwizzleNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportSwizzleNV, commandBuffer.segment(), firstViewport, viewportCount, pViewportSwizzles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportSwizzleNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageToColorEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 coverageToColorEnable);
    /// ```
    public static void vkCmdSetCoverageToColorEnableNV(VkCommandBuffer commandBuffer, int coverageToColorEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageToColorEnableNV", commandBuffer, coverageToColorEnable); }
        Handles.MH_vkCmdSetCoverageToColorEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorEnableNV, commandBuffer.segment(), coverageToColorEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageToColorLocationNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t coverageToColorLocation);
    /// ```
    public static void vkCmdSetCoverageToColorLocationNV(VkCommandBuffer commandBuffer, int coverageToColorLocation) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorLocationNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorLocationNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageToColorLocationNV", commandBuffer, coverageToColorLocation); }
        Handles.MH_vkCmdSetCoverageToColorLocationNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorLocationNV, commandBuffer.segment(), coverageToColorLocation); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorLocationNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationModeNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCoverageModulationModeNV coverageModulationMode);
    /// ```
    public static void vkCmdSetCoverageModulationModeNV(VkCommandBuffer commandBuffer, int coverageModulationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationModeNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationModeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageModulationModeNV", commandBuffer, coverageModulationMode); }
        Handles.MH_vkCmdSetCoverageModulationModeNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationModeNV, commandBuffer.segment(), coverageModulationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationModeNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationTableEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 coverageModulationTableEnable);
    /// ```
    public static void vkCmdSetCoverageModulationTableEnableNV(VkCommandBuffer commandBuffer, int coverageModulationTableEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageModulationTableEnableNV", commandBuffer, coverageModulationTableEnable); }
        Handles.MH_vkCmdSetCoverageModulationTableEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableEnableNV, commandBuffer.segment(), coverageModulationTableEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageModulationTableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, const float* pCoverageModulationTable);
    /// ```
    public static void vkCmdSetCoverageModulationTableNV(VkCommandBuffer commandBuffer, int coverageModulationTableCount, MemorySegment pCoverageModulationTable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageModulationTableNV", commandBuffer, coverageModulationTableCount, pCoverageModulationTable); }
        Handles.MH_vkCmdSetCoverageModulationTableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableNV, commandBuffer.segment(), coverageModulationTableCount, pCoverageModulationTable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableNV", e); }
    }

    /// ```
    /// void vkCmdSetShadingRateImageEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 shadingRateImageEnable);
    /// ```
    public static void vkCmdSetShadingRateImageEnableNV(VkCommandBuffer commandBuffer, int shadingRateImageEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetShadingRateImageEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetShadingRateImageEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetShadingRateImageEnableNV", commandBuffer, shadingRateImageEnable); }
        Handles.MH_vkCmdSetShadingRateImageEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetShadingRateImageEnableNV, commandBuffer.segment(), shadingRateImageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetShadingRateImageEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetRepresentativeFragmentTestEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 representativeFragmentTestEnable);
    /// ```
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(VkCommandBuffer commandBuffer, int representativeFragmentTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRepresentativeFragmentTestEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRepresentativeFragmentTestEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRepresentativeFragmentTestEnableNV", commandBuffer, representativeFragmentTestEnable); }
        Handles.MH_vkCmdSetRepresentativeFragmentTestEnableNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRepresentativeFragmentTestEnableNV, commandBuffer.segment(), representativeFragmentTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRepresentativeFragmentTestEnableNV", e); }
    }

    /// ```
    /// void vkCmdSetCoverageReductionModeNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCoverageReductionModeNV coverageReductionMode);
    /// ```
    public static void vkCmdSetCoverageReductionModeNV(VkCommandBuffer commandBuffer, int coverageReductionMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageReductionModeNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageReductionModeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageReductionModeNV", commandBuffer, coverageReductionMode); }
        Handles.MH_vkCmdSetCoverageReductionModeNV.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageReductionModeNV, commandBuffer.segment(), coverageReductionMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageReductionModeNV", e); }
    }

    /// ```
    /// void vkCmdSetDepthClampRangeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkDepthClampModeEXT depthClampMode, const VkDepthClampRangeEXT* pDepthClampRange);
    /// ```
    public static void vkCmdSetDepthClampRangeEXT(VkCommandBuffer commandBuffer, int depthClampMode, MemorySegment pDepthClampRange) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClampRangeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClampRangeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClampRangeEXT", commandBuffer, depthClampMode, pDepthClampRange); }
        Handles.MH_vkCmdSetDepthClampRangeEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClampRangeEXT, commandBuffer.segment(), depthClampMode, pDepthClampRange); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampRangeEXT", e); }
    }

}
