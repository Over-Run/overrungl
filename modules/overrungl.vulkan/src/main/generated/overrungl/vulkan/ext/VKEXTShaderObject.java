// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_shader_object` - device extension
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
        public static final Supplier<MethodHandle> MH_vkCreateShadersEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkDestroyShaderEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkGetShaderBinaryDataEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBindShadersEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCullModeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetFrontFaceEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetPrimitiveTopologyEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetViewportWithCountEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetScissorWithCountEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdBindVertexBuffers2EXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthTestEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthWriteEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthCompareOpEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthBoundsTestEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetStencilTestEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetStencilOpEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetVertexInputEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetPatchControlPointsEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetRasterizerDiscardEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthBiasEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetLogicOpEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetPrimitiveRestartEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetTessellationDomainOriginEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthClampEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetPolygonModeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetRasterizationSamplesEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetSampleMaskEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetAlphaToCoverageEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetAlphaToOneEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetLogicOpEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetColorBlendEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetColorBlendEquationEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetColorWriteMaskEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetRasterizationStreamEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetConservativeRasterizationModeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthClipEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetSampleLocationsEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetColorBlendAdvancedEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetProvokingVertexModeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetLineRasterizationModeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetLineStippleEnableEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthClipNegativeOneToOneEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetViewportWScalingEnableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetViewportSwizzleNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCoverageToColorEnableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCoverageToColorLocationNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCoverageModulationModeNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCoverageModulationTableEnableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCoverageModulationTableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_vkCmdSetShadingRateImageEnableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetRepresentativeFragmentTestEnableNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetCoverageReductionModeNV = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_vkCmdSetDepthClampRangeEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        private Handles() {}
    }

    private VKEXTShaderObject() {}

    /// Invokes `vkCreateShadersEXT`.
    /// ```
    /// (int) VkResult vkCreateShadersEXT((struct VkDevice*) VkDevice device, uint32_t createInfoCount, const VkShaderCreateInfoEXT* pCreateInfos, const VkAllocationCallbacks* pAllocator, VkShaderEXT* pShaders);
    /// ```
    public static int vkCreateShadersEXT(@NonNull VkDevice device, int createInfoCount, @NonNull MemorySegment pCreateInfos, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pShaders) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreateShadersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateShadersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateShadersEXT", device, createInfoCount, pCreateInfos, pAllocator, pShaders); }
        return (int) Handles.MH_vkCreateShadersEXT.get().invokeExact(device.capabilities().PFN_vkCreateShadersEXT, device.segment(), createInfoCount, pCreateInfos, pAllocator, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateShadersEXT", e); }
    }

    /// Invokes `vkDestroyShaderEXT`.
    /// ```
    /// void vkDestroyShaderEXT((struct VkDevice*) VkDevice device, (uint64_t) VkShaderEXT shader, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyShaderEXT(@NonNull VkDevice device, long shader, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyShaderEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyShaderEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyShaderEXT", device, shader, pAllocator); }
        Handles.MH_vkDestroyShaderEXT.get().invokeExact(device.capabilities().PFN_vkDestroyShaderEXT, device.segment(), shader, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyShaderEXT", e); }
    }

    /// Invokes `vkGetShaderBinaryDataEXT`.
    /// ```
    /// (int) VkResult vkGetShaderBinaryDataEXT((struct VkDevice*) VkDevice device, (uint64_t) VkShaderEXT shader, size_t* pDataSize, void* pData);
    /// ```
    public static int vkGetShaderBinaryDataEXT(@NonNull VkDevice device, long shader, @NonNull MemorySegment pDataSize, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetShaderBinaryDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetShaderBinaryDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetShaderBinaryDataEXT", device, shader, pDataSize, pData); }
        return (int) Handles.MH_vkGetShaderBinaryDataEXT.get().invokeExact(device.capabilities().PFN_vkGetShaderBinaryDataEXT, device.segment(), shader, pDataSize, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetShaderBinaryDataEXT", e); }
    }

    /// Invokes `vkCmdBindShadersEXT`.
    /// ```
    /// void vkCmdBindShadersEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t stageCount, const VkShaderStageFlagBits* pStages, const VkShaderEXT* pShaders);
    /// ```
    public static void vkCmdBindShadersEXT(@NonNull VkCommandBuffer commandBuffer, int stageCount, @NonNull MemorySegment pStages, @NonNull MemorySegment pShaders) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindShadersEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindShadersEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindShadersEXT", commandBuffer, stageCount, pStages, pShaders); }
        Handles.MH_vkCmdBindShadersEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindShadersEXT, commandBuffer.segment(), stageCount, pStages, pShaders); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindShadersEXT", e); }
    }

    /// Invokes `vkCmdSetCullModeEXT`.
    /// ```
    /// void vkCmdSetCullModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkCullModeFlags cullMode);
    /// ```
    public static void vkCmdSetCullModeEXT(@NonNull VkCommandBuffer commandBuffer, int cullMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCullModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCullModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCullModeEXT", commandBuffer, cullMode); }
        Handles.MH_vkCmdSetCullModeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCullModeEXT, commandBuffer.segment(), cullMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCullModeEXT", e); }
    }

    /// Invokes `vkCmdSetFrontFaceEXT`.
    /// ```
    /// void vkCmdSetFrontFaceEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkFrontFace frontFace);
    /// ```
    public static void vkCmdSetFrontFaceEXT(@NonNull VkCommandBuffer commandBuffer, int frontFace) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetFrontFaceEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetFrontFaceEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetFrontFaceEXT", commandBuffer, frontFace); }
        Handles.MH_vkCmdSetFrontFaceEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetFrontFaceEXT, commandBuffer.segment(), frontFace); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetFrontFaceEXT", e); }
    }

    /// Invokes `vkCmdSetPrimitiveTopologyEXT`.
    /// ```
    /// void vkCmdSetPrimitiveTopologyEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPrimitiveTopology primitiveTopology);
    /// ```
    public static void vkCmdSetPrimitiveTopologyEXT(@NonNull VkCommandBuffer commandBuffer, int primitiveTopology) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopologyEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveTopologyEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveTopologyEXT", commandBuffer, primitiveTopology); }
        Handles.MH_vkCmdSetPrimitiveTopologyEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveTopologyEXT, commandBuffer.segment(), primitiveTopology); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveTopologyEXT", e); }
    }

    /// Invokes `vkCmdSetViewportWithCountEXT`.
    /// ```
    /// void vkCmdSetViewportWithCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t viewportCount, const VkViewport* pViewports);
    /// ```
    public static void vkCmdSetViewportWithCountEXT(@NonNull VkCommandBuffer commandBuffer, int viewportCount, @NonNull MemorySegment pViewports) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWithCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWithCountEXT", commandBuffer, viewportCount, pViewports); }
        Handles.MH_vkCmdSetViewportWithCountEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWithCountEXT, commandBuffer.segment(), viewportCount, pViewports); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWithCountEXT", e); }
    }

    /// Invokes `vkCmdSetScissorWithCountEXT`.
    /// ```
    /// void vkCmdSetScissorWithCountEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t scissorCount, const VkRect2D* pScissors);
    /// ```
    public static void vkCmdSetScissorWithCountEXT(@NonNull VkCommandBuffer commandBuffer, int scissorCount, @NonNull MemorySegment pScissors) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCountEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetScissorWithCountEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetScissorWithCountEXT", commandBuffer, scissorCount, pScissors); }
        Handles.MH_vkCmdSetScissorWithCountEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetScissorWithCountEXT, commandBuffer.segment(), scissorCount, pScissors); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetScissorWithCountEXT", e); }
    }

    /// Invokes `vkCmdBindVertexBuffers2EXT`.
    /// ```
    /// void vkCmdBindVertexBuffers2EXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstBinding, uint32_t bindingCount, const VkBuffer* pBuffers, const VkDeviceSize* pOffsets, const VkDeviceSize* pSizes, const VkDeviceSize* pStrides);
    /// ```
    public static void vkCmdBindVertexBuffers2EXT(@NonNull VkCommandBuffer commandBuffer, int firstBinding, int bindingCount, @NonNull MemorySegment pBuffers, @NonNull MemorySegment pOffsets, @NonNull MemorySegment pSizes, @NonNull MemorySegment pStrides) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2EXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBindVertexBuffers2EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBindVertexBuffers2EXT", commandBuffer, firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        Handles.MH_vkCmdBindVertexBuffers2EXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdBindVertexBuffers2EXT, commandBuffer.segment(), firstBinding, bindingCount, pBuffers, pOffsets, pSizes, pStrides); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBindVertexBuffers2EXT", e); }
    }

    /// Invokes `vkCmdSetDepthTestEnableEXT`.
    /// ```
    /// void vkCmdSetDepthTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthTestEnable);
    /// ```
    public static void vkCmdSetDepthTestEnableEXT(@NonNull VkCommandBuffer commandBuffer, int depthTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthTestEnableEXT", commandBuffer, depthTestEnable); }
        Handles.MH_vkCmdSetDepthTestEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthTestEnableEXT, commandBuffer.segment(), depthTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthTestEnableEXT", e); }
    }

    /// Invokes `vkCmdSetDepthWriteEnableEXT`.
    /// ```
    /// void vkCmdSetDepthWriteEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthWriteEnable);
    /// ```
    public static void vkCmdSetDepthWriteEnableEXT(@NonNull VkCommandBuffer commandBuffer, int depthWriteEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthWriteEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthWriteEnableEXT", commandBuffer, depthWriteEnable); }
        Handles.MH_vkCmdSetDepthWriteEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthWriteEnableEXT, commandBuffer.segment(), depthWriteEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthWriteEnableEXT", e); }
    }

    /// Invokes `vkCmdSetDepthCompareOpEXT`.
    /// ```
    /// void vkCmdSetDepthCompareOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCompareOp depthCompareOp);
    /// ```
    public static void vkCmdSetDepthCompareOpEXT(@NonNull VkCommandBuffer commandBuffer, int depthCompareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthCompareOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthCompareOpEXT", commandBuffer, depthCompareOp); }
        Handles.MH_vkCmdSetDepthCompareOpEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthCompareOpEXT, commandBuffer.segment(), depthCompareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthCompareOpEXT", e); }
    }

    /// Invokes `vkCmdSetDepthBoundsTestEnableEXT`.
    /// ```
    /// void vkCmdSetDepthBoundsTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthBoundsTestEnable);
    /// ```
    public static void vkCmdSetDepthBoundsTestEnableEXT(@NonNull VkCommandBuffer commandBuffer, int depthBoundsTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBoundsTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBoundsTestEnableEXT", commandBuffer, depthBoundsTestEnable); }
        Handles.MH_vkCmdSetDepthBoundsTestEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBoundsTestEnableEXT, commandBuffer.segment(), depthBoundsTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBoundsTestEnableEXT", e); }
    }

    /// Invokes `vkCmdSetStencilTestEnableEXT`.
    /// ```
    /// void vkCmdSetStencilTestEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 stencilTestEnable);
    /// ```
    public static void vkCmdSetStencilTestEnableEXT(@NonNull VkCommandBuffer commandBuffer, int stencilTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilTestEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilTestEnableEXT", commandBuffer, stencilTestEnable); }
        Handles.MH_vkCmdSetStencilTestEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilTestEnableEXT, commandBuffer.segment(), stencilTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilTestEnableEXT", e); }
    }

    /// Invokes `vkCmdSetStencilOpEXT`.
    /// ```
    /// void vkCmdSetStencilOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((uint32_t) VkFlags) VkStencilFaceFlags faceMask, (int) VkStencilOp failOp, (int) VkStencilOp passOp, (int) VkStencilOp depthFailOp, (int) VkCompareOp compareOp);
    /// ```
    public static void vkCmdSetStencilOpEXT(@NonNull VkCommandBuffer commandBuffer, int faceMask, int failOp, int passOp, int depthFailOp, int compareOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetStencilOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetStencilOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetStencilOpEXT", commandBuffer, faceMask, failOp, passOp, depthFailOp, compareOp); }
        Handles.MH_vkCmdSetStencilOpEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetStencilOpEXT, commandBuffer.segment(), faceMask, failOp, passOp, depthFailOp, compareOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetStencilOpEXT", e); }
    }

    /// Invokes `vkCmdSetVertexInputEXT`.
    /// ```
    /// void vkCmdSetVertexInputEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t vertexBindingDescriptionCount, const VkVertexInputBindingDescription2EXT* pVertexBindingDescriptions, uint32_t vertexAttributeDescriptionCount, const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);
    /// ```
    public static void vkCmdSetVertexInputEXT(@NonNull VkCommandBuffer commandBuffer, int vertexBindingDescriptionCount, @NonNull MemorySegment pVertexBindingDescriptions, int vertexAttributeDescriptionCount, @NonNull MemorySegment pVertexAttributeDescriptions) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetVertexInputEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetVertexInputEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetVertexInputEXT", commandBuffer, vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        Handles.MH_vkCmdSetVertexInputEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetVertexInputEXT, commandBuffer.segment(), vertexBindingDescriptionCount, pVertexBindingDescriptions, vertexAttributeDescriptionCount, pVertexAttributeDescriptions); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetVertexInputEXT", e); }
    }

    /// Invokes `vkCmdSetPatchControlPointsEXT`.
    /// ```
    /// void vkCmdSetPatchControlPointsEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t patchControlPoints);
    /// ```
    public static void vkCmdSetPatchControlPointsEXT(@NonNull VkCommandBuffer commandBuffer, int patchControlPoints) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPatchControlPointsEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPatchControlPointsEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPatchControlPointsEXT", commandBuffer, patchControlPoints); }
        Handles.MH_vkCmdSetPatchControlPointsEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPatchControlPointsEXT, commandBuffer.segment(), patchControlPoints); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPatchControlPointsEXT", e); }
    }

    /// Invokes `vkCmdSetRasterizerDiscardEnableEXT`.
    /// ```
    /// void vkCmdSetRasterizerDiscardEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 rasterizerDiscardEnable);
    /// ```
    public static void vkCmdSetRasterizerDiscardEnableEXT(@NonNull VkCommandBuffer commandBuffer, int rasterizerDiscardEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizerDiscardEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizerDiscardEnableEXT", commandBuffer, rasterizerDiscardEnable); }
        Handles.MH_vkCmdSetRasterizerDiscardEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizerDiscardEnableEXT, commandBuffer.segment(), rasterizerDiscardEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizerDiscardEnableEXT", e); }
    }

    /// Invokes `vkCmdSetDepthBiasEnableEXT`.
    /// ```
    /// void vkCmdSetDepthBiasEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthBiasEnable);
    /// ```
    public static void vkCmdSetDepthBiasEnableEXT(@NonNull VkCommandBuffer commandBuffer, int depthBiasEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthBiasEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthBiasEnableEXT", commandBuffer, depthBiasEnable); }
        Handles.MH_vkCmdSetDepthBiasEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthBiasEnableEXT, commandBuffer.segment(), depthBiasEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthBiasEnableEXT", e); }
    }

    /// Invokes `vkCmdSetLogicOpEXT`.
    /// ```
    /// void vkCmdSetLogicOpEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkLogicOp logicOp);
    /// ```
    public static void vkCmdSetLogicOpEXT(@NonNull VkCommandBuffer commandBuffer, int logicOp) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLogicOpEXT", commandBuffer, logicOp); }
        Handles.MH_vkCmdSetLogicOpEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEXT, commandBuffer.segment(), logicOp); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEXT", e); }
    }

    /// Invokes `vkCmdSetPrimitiveRestartEnableEXT`.
    /// ```
    /// void vkCmdSetPrimitiveRestartEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 primitiveRestartEnable);
    /// ```
    public static void vkCmdSetPrimitiveRestartEnableEXT(@NonNull VkCommandBuffer commandBuffer, int primitiveRestartEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPrimitiveRestartEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPrimitiveRestartEnableEXT", commandBuffer, primitiveRestartEnable); }
        Handles.MH_vkCmdSetPrimitiveRestartEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPrimitiveRestartEnableEXT, commandBuffer.segment(), primitiveRestartEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPrimitiveRestartEnableEXT", e); }
    }

    /// Invokes `vkCmdSetTessellationDomainOriginEXT`.
    /// ```
    /// void vkCmdSetTessellationDomainOriginEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkTessellationDomainOrigin domainOrigin);
    /// ```
    public static void vkCmdSetTessellationDomainOriginEXT(@NonNull VkCommandBuffer commandBuffer, int domainOrigin) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetTessellationDomainOriginEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetTessellationDomainOriginEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetTessellationDomainOriginEXT", commandBuffer, domainOrigin); }
        Handles.MH_vkCmdSetTessellationDomainOriginEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetTessellationDomainOriginEXT, commandBuffer.segment(), domainOrigin); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetTessellationDomainOriginEXT", e); }
    }

    /// Invokes `vkCmdSetDepthClampEnableEXT`.
    /// ```
    /// void vkCmdSetDepthClampEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthClampEnable);
    /// ```
    public static void vkCmdSetDepthClampEnableEXT(@NonNull VkCommandBuffer commandBuffer, int depthClampEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClampEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClampEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClampEnableEXT", commandBuffer, depthClampEnable); }
        Handles.MH_vkCmdSetDepthClampEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClampEnableEXT, commandBuffer.segment(), depthClampEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampEnableEXT", e); }
    }

    /// Invokes `vkCmdSetPolygonModeEXT`.
    /// ```
    /// void vkCmdSetPolygonModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkPolygonMode polygonMode);
    /// ```
    public static void vkCmdSetPolygonModeEXT(@NonNull VkCommandBuffer commandBuffer, int polygonMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetPolygonModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetPolygonModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetPolygonModeEXT", commandBuffer, polygonMode); }
        Handles.MH_vkCmdSetPolygonModeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetPolygonModeEXT, commandBuffer.segment(), polygonMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetPolygonModeEXT", e); }
    }

    /// Invokes `vkCmdSetRasterizationSamplesEXT`.
    /// ```
    /// void vkCmdSetRasterizationSamplesEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSampleCountFlagBits rasterizationSamples);
    /// ```
    public static void vkCmdSetRasterizationSamplesEXT(@NonNull VkCommandBuffer commandBuffer, int rasterizationSamples) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizationSamplesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizationSamplesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizationSamplesEXT", commandBuffer, rasterizationSamples); }
        Handles.MH_vkCmdSetRasterizationSamplesEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizationSamplesEXT, commandBuffer.segment(), rasterizationSamples); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationSamplesEXT", e); }
    }

    /// Invokes `vkCmdSetSampleMaskEXT`.
    /// ```
    /// void vkCmdSetSampleMaskEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkSampleCountFlagBits samples, const VkSampleMask* pSampleMask);
    /// ```
    public static void vkCmdSetSampleMaskEXT(@NonNull VkCommandBuffer commandBuffer, int samples, @NonNull MemorySegment pSampleMask) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleMaskEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetSampleMaskEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetSampleMaskEXT", commandBuffer, samples, pSampleMask); }
        Handles.MH_vkCmdSetSampleMaskEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleMaskEXT, commandBuffer.segment(), samples, pSampleMask); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleMaskEXT", e); }
    }

    /// Invokes `vkCmdSetAlphaToCoverageEnableEXT`.
    /// ```
    /// void vkCmdSetAlphaToCoverageEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 alphaToCoverageEnable);
    /// ```
    public static void vkCmdSetAlphaToCoverageEnableEXT(@NonNull VkCommandBuffer commandBuffer, int alphaToCoverageEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAlphaToCoverageEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetAlphaToCoverageEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetAlphaToCoverageEnableEXT", commandBuffer, alphaToCoverageEnable); }
        Handles.MH_vkCmdSetAlphaToCoverageEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAlphaToCoverageEnableEXT, commandBuffer.segment(), alphaToCoverageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToCoverageEnableEXT", e); }
    }

    /// Invokes `vkCmdSetAlphaToOneEnableEXT`.
    /// ```
    /// void vkCmdSetAlphaToOneEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 alphaToOneEnable);
    /// ```
    public static void vkCmdSetAlphaToOneEnableEXT(@NonNull VkCommandBuffer commandBuffer, int alphaToOneEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetAlphaToOneEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetAlphaToOneEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetAlphaToOneEnableEXT", commandBuffer, alphaToOneEnable); }
        Handles.MH_vkCmdSetAlphaToOneEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetAlphaToOneEnableEXT, commandBuffer.segment(), alphaToOneEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetAlphaToOneEnableEXT", e); }
    }

    /// Invokes `vkCmdSetLogicOpEnableEXT`.
    /// ```
    /// void vkCmdSetLogicOpEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 logicOpEnable);
    /// ```
    public static void vkCmdSetLogicOpEnableEXT(@NonNull VkCommandBuffer commandBuffer, int logicOpEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLogicOpEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLogicOpEnableEXT", commandBuffer, logicOpEnable); }
        Handles.MH_vkCmdSetLogicOpEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLogicOpEnableEXT, commandBuffer.segment(), logicOpEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLogicOpEnableEXT", e); }
    }

    /// Invokes `vkCmdSetColorBlendEnableEXT`.
    /// ```
    /// void vkCmdSetColorBlendEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkBool32* pColorBlendEnables);
    /// ```
    public static void vkCmdSetColorBlendEnableEXT(@NonNull VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, @NonNull MemorySegment pColorBlendEnables) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorBlendEnableEXT", commandBuffer, firstAttachment, attachmentCount, pColorBlendEnables); }
        Handles.MH_vkCmdSetColorBlendEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEnableEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendEnables); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEnableEXT", e); }
    }

    /// Invokes `vkCmdSetColorBlendEquationEXT`.
    /// ```
    /// void vkCmdSetColorBlendEquationEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendEquationEXT* pColorBlendEquations);
    /// ```
    public static void vkCmdSetColorBlendEquationEXT(@NonNull VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, @NonNull MemorySegment pColorBlendEquations) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEquationEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorBlendEquationEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorBlendEquationEXT", commandBuffer, firstAttachment, attachmentCount, pColorBlendEquations); }
        Handles.MH_vkCmdSetColorBlendEquationEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendEquationEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendEquations); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendEquationEXT", e); }
    }

    /// Invokes `vkCmdSetColorWriteMaskEXT`.
    /// ```
    /// void vkCmdSetColorWriteMaskEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorComponentFlags* pColorWriteMasks);
    /// ```
    public static void vkCmdSetColorWriteMaskEXT(@NonNull VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, @NonNull MemorySegment pColorWriteMasks) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorWriteMaskEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorWriteMaskEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorWriteMaskEXT", commandBuffer, firstAttachment, attachmentCount, pColorWriteMasks); }
        Handles.MH_vkCmdSetColorWriteMaskEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorWriteMaskEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorWriteMasks); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorWriteMaskEXT", e); }
    }

    /// Invokes `vkCmdSetRasterizationStreamEXT`.
    /// ```
    /// void vkCmdSetRasterizationStreamEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t rasterizationStream);
    /// ```
    public static void vkCmdSetRasterizationStreamEXT(@NonNull VkCommandBuffer commandBuffer, int rasterizationStream) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRasterizationStreamEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRasterizationStreamEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRasterizationStreamEXT", commandBuffer, rasterizationStream); }
        Handles.MH_vkCmdSetRasterizationStreamEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRasterizationStreamEXT, commandBuffer.segment(), rasterizationStream); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRasterizationStreamEXT", e); }
    }

    /// Invokes `vkCmdSetConservativeRasterizationModeEXT`.
    /// ```
    /// void vkCmdSetConservativeRasterizationModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkConservativeRasterizationModeEXT conservativeRasterizationMode);
    /// ```
    public static void vkCmdSetConservativeRasterizationModeEXT(@NonNull VkCommandBuffer commandBuffer, int conservativeRasterizationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetConservativeRasterizationModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetConservativeRasterizationModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetConservativeRasterizationModeEXT", commandBuffer, conservativeRasterizationMode); }
        Handles.MH_vkCmdSetConservativeRasterizationModeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetConservativeRasterizationModeEXT, commandBuffer.segment(), conservativeRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetConservativeRasterizationModeEXT", e); }
    }

    /// Invokes `vkCmdSetExtraPrimitiveOverestimationSizeEXT`.
    /// ```
    /// void vkCmdSetExtraPrimitiveOverestimationSizeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize);
    /// ```
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(@NonNull VkCommandBuffer commandBuffer, float extraPrimitiveOverestimationSize) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetExtraPrimitiveOverestimationSizeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetExtraPrimitiveOverestimationSizeEXT", commandBuffer, extraPrimitiveOverestimationSize); }
        Handles.MH_vkCmdSetExtraPrimitiveOverestimationSizeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetExtraPrimitiveOverestimationSizeEXT, commandBuffer.segment(), extraPrimitiveOverestimationSize); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetExtraPrimitiveOverestimationSizeEXT", e); }
    }

    /// Invokes `vkCmdSetDepthClipEnableEXT`.
    /// ```
    /// void vkCmdSetDepthClipEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 depthClipEnable);
    /// ```
    public static void vkCmdSetDepthClipEnableEXT(@NonNull VkCommandBuffer commandBuffer, int depthClipEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClipEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClipEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClipEnableEXT", commandBuffer, depthClipEnable); }
        Handles.MH_vkCmdSetDepthClipEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClipEnableEXT, commandBuffer.segment(), depthClipEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipEnableEXT", e); }
    }

    /// Invokes `vkCmdSetSampleLocationsEnableEXT`.
    /// ```
    /// void vkCmdSetSampleLocationsEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 sampleLocationsEnable);
    /// ```
    public static void vkCmdSetSampleLocationsEnableEXT(@NonNull VkCommandBuffer commandBuffer, int sampleLocationsEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetSampleLocationsEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetSampleLocationsEnableEXT", commandBuffer, sampleLocationsEnable); }
        Handles.MH_vkCmdSetSampleLocationsEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetSampleLocationsEnableEXT, commandBuffer.segment(), sampleLocationsEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetSampleLocationsEnableEXT", e); }
    }

    /// Invokes `vkCmdSetColorBlendAdvancedEXT`.
    /// ```
    /// void vkCmdSetColorBlendAdvancedEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstAttachment, uint32_t attachmentCount, const VkColorBlendAdvancedEXT* pColorBlendAdvanced);
    /// ```
    public static void vkCmdSetColorBlendAdvancedEXT(@NonNull VkCommandBuffer commandBuffer, int firstAttachment, int attachmentCount, @NonNull MemorySegment pColorBlendAdvanced) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetColorBlendAdvancedEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetColorBlendAdvancedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetColorBlendAdvancedEXT", commandBuffer, firstAttachment, attachmentCount, pColorBlendAdvanced); }
        Handles.MH_vkCmdSetColorBlendAdvancedEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetColorBlendAdvancedEXT, commandBuffer.segment(), firstAttachment, attachmentCount, pColorBlendAdvanced); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetColorBlendAdvancedEXT", e); }
    }

    /// Invokes `vkCmdSetProvokingVertexModeEXT`.
    /// ```
    /// void vkCmdSetProvokingVertexModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkProvokingVertexModeEXT provokingVertexMode);
    /// ```
    public static void vkCmdSetProvokingVertexModeEXT(@NonNull VkCommandBuffer commandBuffer, int provokingVertexMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetProvokingVertexModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetProvokingVertexModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetProvokingVertexModeEXT", commandBuffer, provokingVertexMode); }
        Handles.MH_vkCmdSetProvokingVertexModeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetProvokingVertexModeEXT, commandBuffer.segment(), provokingVertexMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetProvokingVertexModeEXT", e); }
    }

    /// Invokes `vkCmdSetLineRasterizationModeEXT`.
    /// ```
    /// void vkCmdSetLineRasterizationModeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, ((int) VkLineRasterizationMode) VkLineRasterizationModeEXT lineRasterizationMode);
    /// ```
    public static void vkCmdSetLineRasterizationModeEXT(@NonNull VkCommandBuffer commandBuffer, int lineRasterizationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineRasterizationModeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineRasterizationModeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineRasterizationModeEXT", commandBuffer, lineRasterizationMode); }
        Handles.MH_vkCmdSetLineRasterizationModeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineRasterizationModeEXT, commandBuffer.segment(), lineRasterizationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineRasterizationModeEXT", e); }
    }

    /// Invokes `vkCmdSetLineStippleEnableEXT`.
    /// ```
    /// void vkCmdSetLineStippleEnableEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 stippledLineEnable);
    /// ```
    public static void vkCmdSetLineStippleEnableEXT(@NonNull VkCommandBuffer commandBuffer, int stippledLineEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEnableEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetLineStippleEnableEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetLineStippleEnableEXT", commandBuffer, stippledLineEnable); }
        Handles.MH_vkCmdSetLineStippleEnableEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetLineStippleEnableEXT, commandBuffer.segment(), stippledLineEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetLineStippleEnableEXT", e); }
    }

    /// Invokes `vkCmdSetDepthClipNegativeOneToOneEXT`.
    /// ```
    /// void vkCmdSetDepthClipNegativeOneToOneEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 negativeOneToOne);
    /// ```
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(@NonNull VkCommandBuffer commandBuffer, int negativeOneToOne) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClipNegativeOneToOneEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClipNegativeOneToOneEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClipNegativeOneToOneEXT", commandBuffer, negativeOneToOne); }
        Handles.MH_vkCmdSetDepthClipNegativeOneToOneEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClipNegativeOneToOneEXT, commandBuffer.segment(), negativeOneToOne); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClipNegativeOneToOneEXT", e); }
    }

    /// Invokes `vkCmdSetViewportWScalingEnableNV`.
    /// ```
    /// void vkCmdSetViewportWScalingEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 viewportWScalingEnable);
    /// ```
    public static void vkCmdSetViewportWScalingEnableNV(@NonNull VkCommandBuffer commandBuffer, int viewportWScalingEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportWScalingEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportWScalingEnableNV", commandBuffer, viewportWScalingEnable); }
        Handles.MH_vkCmdSetViewportWScalingEnableNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportWScalingEnableNV, commandBuffer.segment(), viewportWScalingEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportWScalingEnableNV", e); }
    }

    /// Invokes `vkCmdSetViewportSwizzleNV`.
    /// ```
    /// void vkCmdSetViewportSwizzleNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t firstViewport, uint32_t viewportCount, const VkViewportSwizzleNV* pViewportSwizzles);
    /// ```
    public static void vkCmdSetViewportSwizzleNV(@NonNull VkCommandBuffer commandBuffer, int firstViewport, int viewportCount, @NonNull MemorySegment pViewportSwizzles) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetViewportSwizzleNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetViewportSwizzleNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetViewportSwizzleNV", commandBuffer, firstViewport, viewportCount, pViewportSwizzles); }
        Handles.MH_vkCmdSetViewportSwizzleNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetViewportSwizzleNV, commandBuffer.segment(), firstViewport, viewportCount, pViewportSwizzles); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetViewportSwizzleNV", e); }
    }

    /// Invokes `vkCmdSetCoverageToColorEnableNV`.
    /// ```
    /// void vkCmdSetCoverageToColorEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 coverageToColorEnable);
    /// ```
    public static void vkCmdSetCoverageToColorEnableNV(@NonNull VkCommandBuffer commandBuffer, int coverageToColorEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageToColorEnableNV", commandBuffer, coverageToColorEnable); }
        Handles.MH_vkCmdSetCoverageToColorEnableNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorEnableNV, commandBuffer.segment(), coverageToColorEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorEnableNV", e); }
    }

    /// Invokes `vkCmdSetCoverageToColorLocationNV`.
    /// ```
    /// void vkCmdSetCoverageToColorLocationNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t coverageToColorLocation);
    /// ```
    public static void vkCmdSetCoverageToColorLocationNV(@NonNull VkCommandBuffer commandBuffer, int coverageToColorLocation) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorLocationNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageToColorLocationNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageToColorLocationNV", commandBuffer, coverageToColorLocation); }
        Handles.MH_vkCmdSetCoverageToColorLocationNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageToColorLocationNV, commandBuffer.segment(), coverageToColorLocation); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageToColorLocationNV", e); }
    }

    /// Invokes `vkCmdSetCoverageModulationModeNV`.
    /// ```
    /// void vkCmdSetCoverageModulationModeNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCoverageModulationModeNV coverageModulationMode);
    /// ```
    public static void vkCmdSetCoverageModulationModeNV(@NonNull VkCommandBuffer commandBuffer, int coverageModulationMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationModeNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationModeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageModulationModeNV", commandBuffer, coverageModulationMode); }
        Handles.MH_vkCmdSetCoverageModulationModeNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationModeNV, commandBuffer.segment(), coverageModulationMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationModeNV", e); }
    }

    /// Invokes `vkCmdSetCoverageModulationTableEnableNV`.
    /// ```
    /// void vkCmdSetCoverageModulationTableEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 coverageModulationTableEnable);
    /// ```
    public static void vkCmdSetCoverageModulationTableEnableNV(@NonNull VkCommandBuffer commandBuffer, int coverageModulationTableEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageModulationTableEnableNV", commandBuffer, coverageModulationTableEnable); }
        Handles.MH_vkCmdSetCoverageModulationTableEnableNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableEnableNV, commandBuffer.segment(), coverageModulationTableEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableEnableNV", e); }
    }

    /// Invokes `vkCmdSetCoverageModulationTableNV`.
    /// ```
    /// void vkCmdSetCoverageModulationTableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, uint32_t coverageModulationTableCount, const float* pCoverageModulationTable);
    /// ```
    public static void vkCmdSetCoverageModulationTableNV(@NonNull VkCommandBuffer commandBuffer, int coverageModulationTableCount, @NonNull MemorySegment pCoverageModulationTable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageModulationTableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageModulationTableNV", commandBuffer, coverageModulationTableCount, pCoverageModulationTable); }
        Handles.MH_vkCmdSetCoverageModulationTableNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageModulationTableNV, commandBuffer.segment(), coverageModulationTableCount, pCoverageModulationTable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageModulationTableNV", e); }
    }

    /// Invokes `vkCmdSetShadingRateImageEnableNV`.
    /// ```
    /// void vkCmdSetShadingRateImageEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 shadingRateImageEnable);
    /// ```
    public static void vkCmdSetShadingRateImageEnableNV(@NonNull VkCommandBuffer commandBuffer, int shadingRateImageEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetShadingRateImageEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetShadingRateImageEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetShadingRateImageEnableNV", commandBuffer, shadingRateImageEnable); }
        Handles.MH_vkCmdSetShadingRateImageEnableNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetShadingRateImageEnableNV, commandBuffer.segment(), shadingRateImageEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetShadingRateImageEnableNV", e); }
    }

    /// Invokes `vkCmdSetRepresentativeFragmentTestEnableNV`.
    /// ```
    /// void vkCmdSetRepresentativeFragmentTestEnableNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (uint32_t) VkBool32 representativeFragmentTestEnable);
    /// ```
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(@NonNull VkCommandBuffer commandBuffer, int representativeFragmentTestEnable) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetRepresentativeFragmentTestEnableNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetRepresentativeFragmentTestEnableNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetRepresentativeFragmentTestEnableNV", commandBuffer, representativeFragmentTestEnable); }
        Handles.MH_vkCmdSetRepresentativeFragmentTestEnableNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetRepresentativeFragmentTestEnableNV, commandBuffer.segment(), representativeFragmentTestEnable); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetRepresentativeFragmentTestEnableNV", e); }
    }

    /// Invokes `vkCmdSetCoverageReductionModeNV`.
    /// ```
    /// void vkCmdSetCoverageReductionModeNV((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkCoverageReductionModeNV coverageReductionMode);
    /// ```
    public static void vkCmdSetCoverageReductionModeNV(@NonNull VkCommandBuffer commandBuffer, int coverageReductionMode) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetCoverageReductionModeNV)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetCoverageReductionModeNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetCoverageReductionModeNV", commandBuffer, coverageReductionMode); }
        Handles.MH_vkCmdSetCoverageReductionModeNV.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetCoverageReductionModeNV, commandBuffer.segment(), coverageReductionMode); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetCoverageReductionModeNV", e); }
    }

    /// Invokes `vkCmdSetDepthClampRangeEXT`.
    /// ```
    /// void vkCmdSetDepthClampRangeEXT((struct VkCommandBuffer*) VkCommandBuffer commandBuffer, (int) VkDepthClampModeEXT depthClampMode, const VkDepthClampRangeEXT* pDepthClampRange);
    /// ```
    public static void vkCmdSetDepthClampRangeEXT(@NonNull VkCommandBuffer commandBuffer, int depthClampMode, @NonNull MemorySegment pDepthClampRange) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdSetDepthClampRangeEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdSetDepthClampRangeEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdSetDepthClampRangeEXT", commandBuffer, depthClampMode, pDepthClampRange); }
        Handles.MH_vkCmdSetDepthClampRangeEXT.get().invokeExact(commandBuffer.capabilities().PFN_vkCmdSetDepthClampRangeEXT, commandBuffer.segment(), depthClampMode, pDepthClampRange); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdSetDepthClampRangeEXT", e); }
    }

}
