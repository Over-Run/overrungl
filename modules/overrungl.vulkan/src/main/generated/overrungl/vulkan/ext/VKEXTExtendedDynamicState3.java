// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_extended_dynamic_state3` - device extension
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
        public static final Supplier<MethodHandle> MH_vkCmdSetTessellationDomainOriginEXT = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)));
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
        private Handles() {}
    }

    private VKEXTExtendedDynamicState3() {}

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

}
