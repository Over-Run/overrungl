// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceLimits`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceLimits {
///     uint32_t maxImageDimension1D;
///     uint32_t maxImageDimension2D;
///     uint32_t maxImageDimension3D;
///     uint32_t maxImageDimensionCube;
///     uint32_t maxImageArrayLayers;
///     uint32_t maxTexelBufferElements;
///     uint32_t maxUniformBufferRange;
///     uint32_t maxStorageBufferRange;
///     uint32_t maxPushConstantsSize;
///     uint32_t maxMemoryAllocationCount;
///     uint32_t maxSamplerAllocationCount;
///     (uint64_t) VkDeviceSize bufferImageGranularity;
///     (uint64_t) VkDeviceSize sparseAddressSpaceSize;
///     uint32_t maxBoundDescriptorSets;
///     uint32_t maxPerStageDescriptorSamplers;
///     uint32_t maxPerStageDescriptorUniformBuffers;
///     uint32_t maxPerStageDescriptorStorageBuffers;
///     uint32_t maxPerStageDescriptorSampledImages;
///     uint32_t maxPerStageDescriptorStorageImages;
///     uint32_t maxPerStageDescriptorInputAttachments;
///     uint32_t maxPerStageResources;
///     uint32_t maxDescriptorSetSamplers;
///     uint32_t maxDescriptorSetUniformBuffers;
///     uint32_t maxDescriptorSetUniformBuffersDynamic;
///     uint32_t maxDescriptorSetStorageBuffers;
///     uint32_t maxDescriptorSetStorageBuffersDynamic;
///     uint32_t maxDescriptorSetSampledImages;
///     uint32_t maxDescriptorSetStorageImages;
///     uint32_t maxDescriptorSetInputAttachments;
///     uint32_t maxVertexInputAttributes;
///     uint32_t maxVertexInputBindings;
///     uint32_t maxVertexInputAttributeOffset;
///     uint32_t maxVertexInputBindingStride;
///     uint32_t maxVertexOutputComponents;
///     uint32_t maxTessellationGenerationLevel;
///     uint32_t maxTessellationPatchSize;
///     uint32_t maxTessellationControlPerVertexInputComponents;
///     uint32_t maxTessellationControlPerVertexOutputComponents;
///     uint32_t maxTessellationControlPerPatchOutputComponents;
///     uint32_t maxTessellationControlTotalOutputComponents;
///     uint32_t maxTessellationEvaluationInputComponents;
///     uint32_t maxTessellationEvaluationOutputComponents;
///     uint32_t maxGeometryShaderInvocations;
///     uint32_t maxGeometryInputComponents;
///     uint32_t maxGeometryOutputComponents;
///     uint32_t maxGeometryOutputVertices;
///     uint32_t maxGeometryTotalOutputComponents;
///     uint32_t maxFragmentInputComponents;
///     uint32_t maxFragmentOutputAttachments;
///     uint32_t maxFragmentDualSrcAttachments;
///     uint32_t maxFragmentCombinedOutputResources;
///     uint32_t maxComputeSharedMemorySize;
///     uint32_t maxComputeWorkGroupCount[3];
///     uint32_t maxComputeWorkGroupInvocations;
///     uint32_t maxComputeWorkGroupSize[3];
///     uint32_t subPixelPrecisionBits;
///     uint32_t subTexelPrecisionBits;
///     uint32_t mipmapPrecisionBits;
///     uint32_t maxDrawIndexedIndexValue;
///     uint32_t maxDrawIndirectCount;
///     float maxSamplerLodBias;
///     float maxSamplerAnisotropy;
///     uint32_t maxViewports;
///     uint32_t maxViewportDimensions[2];
///     float viewportBoundsRange[2];
///     uint32_t viewportSubPixelBits;
///     size_t minMemoryMapAlignment;
///     (uint64_t) VkDeviceSize minTexelBufferOffsetAlignment;
///     (uint64_t) VkDeviceSize minUniformBufferOffsetAlignment;
///     (uint64_t) VkDeviceSize minStorageBufferOffsetAlignment;
///     int32_t minTexelOffset;
///     uint32_t maxTexelOffset;
///     int32_t minTexelGatherOffset;
///     uint32_t maxTexelGatherOffset;
///     float minInterpolationOffset;
///     float maxInterpolationOffset;
///     uint32_t subPixelInterpolationOffsetBits;
///     uint32_t maxFramebufferWidth;
///     uint32_t maxFramebufferHeight;
///     uint32_t maxFramebufferLayers;
///     ((uint32_t) VkFlags) VkSampleCountFlags framebufferColorSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags framebufferDepthSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags framebufferStencilSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags framebufferNoAttachmentsSampleCounts;
///     uint32_t maxColorAttachments;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampledImageColorSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampledImageIntegerSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampledImageDepthSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags sampledImageStencilSampleCounts;
///     ((uint32_t) VkFlags) VkSampleCountFlags storageImageSampleCounts;
///     uint32_t maxSampleMaskWords;
///     (uint32_t) VkBool32 timestampComputeAndGraphics;
///     float timestampPeriod;
///     uint32_t maxClipDistances;
///     uint32_t maxCullDistances;
///     uint32_t maxCombinedClipAndCullDistances;
///     uint32_t discreteQueuePriorities;
///     float pointSizeRange[2];
///     float lineWidthRange[2];
///     float pointSizeGranularity;
///     float lineWidthGranularity;
///     (uint32_t) VkBool32 strictLines;
///     (uint32_t) VkBool32 standardSampleLocations;
///     (uint64_t) VkDeviceSize optimalBufferCopyOffsetAlignment;
///     (uint64_t) VkDeviceSize optimalBufferCopyRowPitchAlignment;
///     (uint64_t) VkDeviceSize nonCoherentAtomSize;
/// };
/// ```
public final class VkPhysicalDeviceLimits extends GroupType {
    /// The struct layout of `VkPhysicalDeviceLimits`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("maxImageDimension1D"),
        ValueLayout.JAVA_INT.withName("maxImageDimension2D"),
        ValueLayout.JAVA_INT.withName("maxImageDimension3D"),
        ValueLayout.JAVA_INT.withName("maxImageDimensionCube"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxTexelBufferElements"),
        ValueLayout.JAVA_INT.withName("maxUniformBufferRange"),
        ValueLayout.JAVA_INT.withName("maxStorageBufferRange"),
        ValueLayout.JAVA_INT.withName("maxPushConstantsSize"),
        ValueLayout.JAVA_INT.withName("maxMemoryAllocationCount"),
        ValueLayout.JAVA_INT.withName("maxSamplerAllocationCount"),
        ValueLayout.JAVA_LONG.withName("bufferImageGranularity"),
        ValueLayout.JAVA_LONG.withName("sparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("maxBoundDescriptorSets"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSamplers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorSampledImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorStorageImages"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxPerStageResources"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSamplers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUniformBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageBuffers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSampledImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetStorageImages"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInputAttachments"),
        ValueLayout.JAVA_INT.withName("maxVertexInputAttributes"),
        ValueLayout.JAVA_INT.withName("maxVertexInputBindings"),
        ValueLayout.JAVA_INT.withName("maxVertexInputAttributeOffset"),
        ValueLayout.JAVA_INT.withName("maxVertexInputBindingStride"),
        ValueLayout.JAVA_INT.withName("maxVertexOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationGenerationLevel"),
        ValueLayout.JAVA_INT.withName("maxTessellationPatchSize"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlPerVertexInputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlPerVertexOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlPerPatchOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationControlTotalOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationEvaluationInputComponents"),
        ValueLayout.JAVA_INT.withName("maxTessellationEvaluationOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxGeometryShaderInvocations"),
        ValueLayout.JAVA_INT.withName("maxGeometryInputComponents"),
        ValueLayout.JAVA_INT.withName("maxGeometryOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxGeometryOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxGeometryTotalOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxFragmentInputComponents"),
        ValueLayout.JAVA_INT.withName("maxFragmentOutputAttachments"),
        ValueLayout.JAVA_INT.withName("maxFragmentDualSrcAttachments"),
        ValueLayout.JAVA_INT.withName("maxFragmentCombinedOutputResources"),
        ValueLayout.JAVA_INT.withName("maxComputeSharedMemorySize"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxComputeWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxComputeWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("subPixelPrecisionBits"),
        ValueLayout.JAVA_INT.withName("subTexelPrecisionBits"),
        ValueLayout.JAVA_INT.withName("mipmapPrecisionBits"),
        ValueLayout.JAVA_INT.withName("maxDrawIndexedIndexValue"),
        ValueLayout.JAVA_INT.withName("maxDrawIndirectCount"),
        ValueLayout.JAVA_FLOAT.withName("maxSamplerLodBias"),
        ValueLayout.JAVA_FLOAT.withName("maxSamplerAnisotropy"),
        ValueLayout.JAVA_INT.withName("maxViewports"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("maxViewportDimensions"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("viewportBoundsRange"),
        ValueLayout.JAVA_INT.withName("viewportSubPixelBits"),
        CanonicalTypes.SIZE_T.withName("minMemoryMapAlignment"),
        ValueLayout.JAVA_LONG.withName("minTexelBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minUniformBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minStorageBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("minTexelOffset"),
        ValueLayout.JAVA_INT.withName("maxTexelOffset"),
        ValueLayout.JAVA_INT.withName("minTexelGatherOffset"),
        ValueLayout.JAVA_INT.withName("maxTexelGatherOffset"),
        ValueLayout.JAVA_FLOAT.withName("minInterpolationOffset"),
        ValueLayout.JAVA_FLOAT.withName("maxInterpolationOffset"),
        ValueLayout.JAVA_INT.withName("subPixelInterpolationOffsetBits"),
        ValueLayout.JAVA_INT.withName("maxFramebufferWidth"),
        ValueLayout.JAVA_INT.withName("maxFramebufferHeight"),
        ValueLayout.JAVA_INT.withName("maxFramebufferLayers"),
        ValueLayout.JAVA_INT.withName("framebufferColorSampleCounts"),
        ValueLayout.JAVA_INT.withName("framebufferDepthSampleCounts"),
        ValueLayout.JAVA_INT.withName("framebufferStencilSampleCounts"),
        ValueLayout.JAVA_INT.withName("framebufferNoAttachmentsSampleCounts"),
        ValueLayout.JAVA_INT.withName("maxColorAttachments"),
        ValueLayout.JAVA_INT.withName("sampledImageColorSampleCounts"),
        ValueLayout.JAVA_INT.withName("sampledImageIntegerSampleCounts"),
        ValueLayout.JAVA_INT.withName("sampledImageDepthSampleCounts"),
        ValueLayout.JAVA_INT.withName("sampledImageStencilSampleCounts"),
        ValueLayout.JAVA_INT.withName("storageImageSampleCounts"),
        ValueLayout.JAVA_INT.withName("maxSampleMaskWords"),
        ValueLayout.JAVA_INT.withName("timestampComputeAndGraphics"),
        ValueLayout.JAVA_FLOAT.withName("timestampPeriod"),
        ValueLayout.JAVA_INT.withName("maxClipDistances"),
        ValueLayout.JAVA_INT.withName("maxCullDistances"),
        ValueLayout.JAVA_INT.withName("maxCombinedClipAndCullDistances"),
        ValueLayout.JAVA_INT.withName("discreteQueuePriorities"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("pointSizeRange"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("lineWidthRange"),
        ValueLayout.JAVA_FLOAT.withName("pointSizeGranularity"),
        ValueLayout.JAVA_FLOAT.withName("lineWidthGranularity"),
        ValueLayout.JAVA_INT.withName("strictLines"),
        ValueLayout.JAVA_INT.withName("standardSampleLocations"),
        ValueLayout.JAVA_LONG.withName("optimalBufferCopyOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("optimalBufferCopyRowPitchAlignment"),
        ValueLayout.JAVA_LONG.withName("nonCoherentAtomSize")
    );
    /// The byte offset of `maxImageDimension1D`.
    public static final long OFFSET_maxImageDimension1D = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension1D"));
    /// The memory layout of `maxImageDimension1D`.
    public static final MemoryLayout LAYOUT_maxImageDimension1D = LAYOUT.select(PathElement.groupElement("maxImageDimension1D"));
    /// The [VarHandle] of `maxImageDimension1D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxImageDimension1D = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension1D")));
    /// The byte offset of `maxImageDimension2D`.
    public static final long OFFSET_maxImageDimension2D = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension2D"));
    /// The memory layout of `maxImageDimension2D`.
    public static final MemoryLayout LAYOUT_maxImageDimension2D = LAYOUT.select(PathElement.groupElement("maxImageDimension2D"));
    /// The [VarHandle] of `maxImageDimension2D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxImageDimension2D = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension2D")));
    /// The byte offset of `maxImageDimension3D`.
    public static final long OFFSET_maxImageDimension3D = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension3D"));
    /// The memory layout of `maxImageDimension3D`.
    public static final MemoryLayout LAYOUT_maxImageDimension3D = LAYOUT.select(PathElement.groupElement("maxImageDimension3D"));
    /// The [VarHandle] of `maxImageDimension3D` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxImageDimension3D = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension3D")));
    /// The byte offset of `maxImageDimensionCube`.
    public static final long OFFSET_maxImageDimensionCube = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimensionCube"));
    /// The memory layout of `maxImageDimensionCube`.
    public static final MemoryLayout LAYOUT_maxImageDimensionCube = LAYOUT.select(PathElement.groupElement("maxImageDimensionCube"));
    /// The [VarHandle] of `maxImageDimensionCube` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxImageDimensionCube = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimensionCube")));
    /// The byte offset of `maxImageArrayLayers`.
    public static final long OFFSET_maxImageArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxImageArrayLayers"));
    /// The memory layout of `maxImageArrayLayers`.
    public static final MemoryLayout LAYOUT_maxImageArrayLayers = LAYOUT.select(PathElement.groupElement("maxImageArrayLayers"));
    /// The [VarHandle] of `maxImageArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxImageArrayLayers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageArrayLayers")));
    /// The byte offset of `maxTexelBufferElements`.
    public static final long OFFSET_maxTexelBufferElements = LAYOUT.byteOffset(PathElement.groupElement("maxTexelBufferElements"));
    /// The memory layout of `maxTexelBufferElements`.
    public static final MemoryLayout LAYOUT_maxTexelBufferElements = LAYOUT.select(PathElement.groupElement("maxTexelBufferElements"));
    /// The [VarHandle] of `maxTexelBufferElements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTexelBufferElements = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelBufferElements")));
    /// The byte offset of `maxUniformBufferRange`.
    public static final long OFFSET_maxUniformBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxUniformBufferRange"));
    /// The memory layout of `maxUniformBufferRange`.
    public static final MemoryLayout LAYOUT_maxUniformBufferRange = LAYOUT.select(PathElement.groupElement("maxUniformBufferRange"));
    /// The [VarHandle] of `maxUniformBufferRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxUniformBufferRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUniformBufferRange")));
    /// The byte offset of `maxStorageBufferRange`.
    public static final long OFFSET_maxStorageBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxStorageBufferRange"));
    /// The memory layout of `maxStorageBufferRange`.
    public static final MemoryLayout LAYOUT_maxStorageBufferRange = LAYOUT.select(PathElement.groupElement("maxStorageBufferRange"));
    /// The [VarHandle] of `maxStorageBufferRange` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxStorageBufferRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStorageBufferRange")));
    /// The byte offset of `maxPushConstantsSize`.
    public static final long OFFSET_maxPushConstantsSize = LAYOUT.byteOffset(PathElement.groupElement("maxPushConstantsSize"));
    /// The memory layout of `maxPushConstantsSize`.
    public static final MemoryLayout LAYOUT_maxPushConstantsSize = LAYOUT.select(PathElement.groupElement("maxPushConstantsSize"));
    /// The [VarHandle] of `maxPushConstantsSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPushConstantsSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPushConstantsSize")));
    /// The byte offset of `maxMemoryAllocationCount`.
    public static final long OFFSET_maxMemoryAllocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationCount"));
    /// The memory layout of `maxMemoryAllocationCount`.
    public static final MemoryLayout LAYOUT_maxMemoryAllocationCount = LAYOUT.select(PathElement.groupElement("maxMemoryAllocationCount"));
    /// The [VarHandle] of `maxMemoryAllocationCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxMemoryAllocationCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationCount")));
    /// The byte offset of `maxSamplerAllocationCount`.
    public static final long OFFSET_maxSamplerAllocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerAllocationCount"));
    /// The memory layout of `maxSamplerAllocationCount`.
    public static final MemoryLayout LAYOUT_maxSamplerAllocationCount = LAYOUT.select(PathElement.groupElement("maxSamplerAllocationCount"));
    /// The [VarHandle] of `maxSamplerAllocationCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSamplerAllocationCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerAllocationCount")));
    /// The byte offset of `bufferImageGranularity`.
    public static final long OFFSET_bufferImageGranularity = LAYOUT.byteOffset(PathElement.groupElement("bufferImageGranularity"));
    /// The memory layout of `bufferImageGranularity`.
    public static final MemoryLayout LAYOUT_bufferImageGranularity = LAYOUT.select(PathElement.groupElement("bufferImageGranularity"));
    /// The [VarHandle] of `bufferImageGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_bufferImageGranularity = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageGranularity")));
    /// The byte offset of `sparseAddressSpaceSize`.
    public static final long OFFSET_sparseAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("sparseAddressSpaceSize"));
    /// The memory layout of `sparseAddressSpaceSize`.
    public static final MemoryLayout LAYOUT_sparseAddressSpaceSize = LAYOUT.select(PathElement.groupElement("sparseAddressSpaceSize"));
    /// The [VarHandle] of `sparseAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sparseAddressSpaceSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseAddressSpaceSize")));
    /// The byte offset of `maxBoundDescriptorSets`.
    public static final long OFFSET_maxBoundDescriptorSets = LAYOUT.byteOffset(PathElement.groupElement("maxBoundDescriptorSets"));
    /// The memory layout of `maxBoundDescriptorSets`.
    public static final MemoryLayout LAYOUT_maxBoundDescriptorSets = LAYOUT.select(PathElement.groupElement("maxBoundDescriptorSets"));
    /// The [VarHandle] of `maxBoundDescriptorSets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxBoundDescriptorSets = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBoundDescriptorSets")));
    /// The byte offset of `maxPerStageDescriptorSamplers`.
    public static final long OFFSET_maxPerStageDescriptorSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSamplers"));
    /// The memory layout of `maxPerStageDescriptorSamplers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorSamplers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorSamplers"));
    /// The [VarHandle] of `maxPerStageDescriptorSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorSamplers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSamplers")));
    /// The byte offset of `maxPerStageDescriptorUniformBuffers`.
    public static final long OFFSET_maxPerStageDescriptorUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    /// The memory layout of `maxPerStageDescriptorUniformBuffers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUniformBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorUniformBuffers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUniformBuffers")));
    /// The byte offset of `maxPerStageDescriptorStorageBuffers`.
    public static final long OFFSET_maxPerStageDescriptorStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    /// The memory layout of `maxPerStageDescriptorStorageBuffers`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorStorageBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorStorageBuffers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorStorageBuffers")));
    /// The byte offset of `maxPerStageDescriptorSampledImages`.
    public static final long OFFSET_maxPerStageDescriptorSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    /// The memory layout of `maxPerStageDescriptorSampledImages`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorSampledImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    /// The [VarHandle] of `maxPerStageDescriptorSampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorSampledImages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSampledImages")));
    /// The byte offset of `maxPerStageDescriptorStorageImages`.
    public static final long OFFSET_maxPerStageDescriptorStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    /// The memory layout of `maxPerStageDescriptorStorageImages`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorStorageImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    /// The [VarHandle] of `maxPerStageDescriptorStorageImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorStorageImages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorStorageImages")));
    /// The byte offset of `maxPerStageDescriptorInputAttachments`.
    public static final long OFFSET_maxPerStageDescriptorInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    /// The memory layout of `maxPerStageDescriptorInputAttachments`.
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorInputAttachments = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    /// The [VarHandle] of `maxPerStageDescriptorInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageDescriptorInputAttachments = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInputAttachments")));
    /// The byte offset of `maxPerStageResources`.
    public static final long OFFSET_maxPerStageResources = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageResources"));
    /// The memory layout of `maxPerStageResources`.
    public static final MemoryLayout LAYOUT_maxPerStageResources = LAYOUT.select(PathElement.groupElement("maxPerStageResources"));
    /// The [VarHandle] of `maxPerStageResources` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxPerStageResources = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageResources")));
    /// The byte offset of `maxDescriptorSetSamplers`.
    public static final long OFFSET_maxDescriptorSetSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSamplers"));
    /// The memory layout of `maxDescriptorSetSamplers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetSamplers"));
    /// The [VarHandle] of `maxDescriptorSetSamplers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetSamplers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSamplers")));
    /// The byte offset of `maxDescriptorSetUniformBuffers`.
    public static final long OFFSET_maxDescriptorSetUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    /// The memory layout of `maxDescriptorSetUniformBuffers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUniformBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetUniformBuffers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUniformBuffers")));
    /// The byte offset of `maxDescriptorSetUniformBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetUniformBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetUniformBuffersDynamic = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic")));
    /// The byte offset of `maxDescriptorSetStorageBuffers`.
    public static final long OFFSET_maxDescriptorSetStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    /// The memory layout of `maxDescriptorSetStorageBuffers`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    /// The [VarHandle] of `maxDescriptorSetStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetStorageBuffers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageBuffers")));
    /// The byte offset of `maxDescriptorSetStorageBuffersDynamic`.
    public static final long OFFSET_maxDescriptorSetStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    /// The memory layout of `maxDescriptorSetStorageBuffersDynamic`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetStorageBuffersDynamic = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic")));
    /// The byte offset of `maxDescriptorSetSampledImages`.
    public static final long OFFSET_maxDescriptorSetSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSampledImages"));
    /// The memory layout of `maxDescriptorSetSampledImages`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetSampledImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetSampledImages"));
    /// The [VarHandle] of `maxDescriptorSetSampledImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetSampledImages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSampledImages")));
    /// The byte offset of `maxDescriptorSetStorageImages`.
    public static final long OFFSET_maxDescriptorSetStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageImages"));
    /// The memory layout of `maxDescriptorSetStorageImages`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageImages"));
    /// The [VarHandle] of `maxDescriptorSetStorageImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetStorageImages = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageImages")));
    /// The byte offset of `maxDescriptorSetInputAttachments`.
    public static final long OFFSET_maxDescriptorSetInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInputAttachments"));
    /// The memory layout of `maxDescriptorSetInputAttachments`.
    public static final MemoryLayout LAYOUT_maxDescriptorSetInputAttachments = LAYOUT.select(PathElement.groupElement("maxDescriptorSetInputAttachments"));
    /// The [VarHandle] of `maxDescriptorSetInputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDescriptorSetInputAttachments = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInputAttachments")));
    /// The byte offset of `maxVertexInputAttributes`.
    public static final long OFFSET_maxVertexInputAttributes = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputAttributes"));
    /// The memory layout of `maxVertexInputAttributes`.
    public static final MemoryLayout LAYOUT_maxVertexInputAttributes = LAYOUT.select(PathElement.groupElement("maxVertexInputAttributes"));
    /// The [VarHandle] of `maxVertexInputAttributes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxVertexInputAttributes = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputAttributes")));
    /// The byte offset of `maxVertexInputBindings`.
    public static final long OFFSET_maxVertexInputBindings = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputBindings"));
    /// The memory layout of `maxVertexInputBindings`.
    public static final MemoryLayout LAYOUT_maxVertexInputBindings = LAYOUT.select(PathElement.groupElement("maxVertexInputBindings"));
    /// The [VarHandle] of `maxVertexInputBindings` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxVertexInputBindings = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputBindings")));
    /// The byte offset of `maxVertexInputAttributeOffset`.
    public static final long OFFSET_maxVertexInputAttributeOffset = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputAttributeOffset"));
    /// The memory layout of `maxVertexInputAttributeOffset`.
    public static final MemoryLayout LAYOUT_maxVertexInputAttributeOffset = LAYOUT.select(PathElement.groupElement("maxVertexInputAttributeOffset"));
    /// The [VarHandle] of `maxVertexInputAttributeOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxVertexInputAttributeOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputAttributeOffset")));
    /// The byte offset of `maxVertexInputBindingStride`.
    public static final long OFFSET_maxVertexInputBindingStride = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputBindingStride"));
    /// The memory layout of `maxVertexInputBindingStride`.
    public static final MemoryLayout LAYOUT_maxVertexInputBindingStride = LAYOUT.select(PathElement.groupElement("maxVertexInputBindingStride"));
    /// The [VarHandle] of `maxVertexInputBindingStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxVertexInputBindingStride = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputBindingStride")));
    /// The byte offset of `maxVertexOutputComponents`.
    public static final long OFFSET_maxVertexOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxVertexOutputComponents"));
    /// The memory layout of `maxVertexOutputComponents`.
    public static final MemoryLayout LAYOUT_maxVertexOutputComponents = LAYOUT.select(PathElement.groupElement("maxVertexOutputComponents"));
    /// The [VarHandle] of `maxVertexOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxVertexOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexOutputComponents")));
    /// The byte offset of `maxTessellationGenerationLevel`.
    public static final long OFFSET_maxTessellationGenerationLevel = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationGenerationLevel"));
    /// The memory layout of `maxTessellationGenerationLevel`.
    public static final MemoryLayout LAYOUT_maxTessellationGenerationLevel = LAYOUT.select(PathElement.groupElement("maxTessellationGenerationLevel"));
    /// The [VarHandle] of `maxTessellationGenerationLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationGenerationLevel = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationGenerationLevel")));
    /// The byte offset of `maxTessellationPatchSize`.
    public static final long OFFSET_maxTessellationPatchSize = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationPatchSize"));
    /// The memory layout of `maxTessellationPatchSize`.
    public static final MemoryLayout LAYOUT_maxTessellationPatchSize = LAYOUT.select(PathElement.groupElement("maxTessellationPatchSize"));
    /// The [VarHandle] of `maxTessellationPatchSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationPatchSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationPatchSize")));
    /// The byte offset of `maxTessellationControlPerVertexInputComponents`.
    public static final long OFFSET_maxTessellationControlPerVertexInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    /// The memory layout of `maxTessellationControlPerVertexInputComponents`.
    public static final MemoryLayout LAYOUT_maxTessellationControlPerVertexInputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    /// The [VarHandle] of `maxTessellationControlPerVertexInputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationControlPerVertexInputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerVertexInputComponents")));
    /// The byte offset of `maxTessellationControlPerVertexOutputComponents`.
    public static final long OFFSET_maxTessellationControlPerVertexOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    /// The memory layout of `maxTessellationControlPerVertexOutputComponents`.
    public static final MemoryLayout LAYOUT_maxTessellationControlPerVertexOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    /// The [VarHandle] of `maxTessellationControlPerVertexOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationControlPerVertexOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents")));
    /// The byte offset of `maxTessellationControlPerPatchOutputComponents`.
    public static final long OFFSET_maxTessellationControlPerPatchOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    /// The memory layout of `maxTessellationControlPerPatchOutputComponents`.
    public static final MemoryLayout LAYOUT_maxTessellationControlPerPatchOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    /// The [VarHandle] of `maxTessellationControlPerPatchOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationControlPerPatchOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents")));
    /// The byte offset of `maxTessellationControlTotalOutputComponents`.
    public static final long OFFSET_maxTessellationControlTotalOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    /// The memory layout of `maxTessellationControlTotalOutputComponents`.
    public static final MemoryLayout LAYOUT_maxTessellationControlTotalOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    /// The [VarHandle] of `maxTessellationControlTotalOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationControlTotalOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlTotalOutputComponents")));
    /// The byte offset of `maxTessellationEvaluationInputComponents`.
    public static final long OFFSET_maxTessellationEvaluationInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    /// The memory layout of `maxTessellationEvaluationInputComponents`.
    public static final MemoryLayout LAYOUT_maxTessellationEvaluationInputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    /// The [VarHandle] of `maxTessellationEvaluationInputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationEvaluationInputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationEvaluationInputComponents")));
    /// The byte offset of `maxTessellationEvaluationOutputComponents`.
    public static final long OFFSET_maxTessellationEvaluationOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    /// The memory layout of `maxTessellationEvaluationOutputComponents`.
    public static final MemoryLayout LAYOUT_maxTessellationEvaluationOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    /// The [VarHandle] of `maxTessellationEvaluationOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTessellationEvaluationOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationEvaluationOutputComponents")));
    /// The byte offset of `maxGeometryShaderInvocations`.
    public static final long OFFSET_maxGeometryShaderInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryShaderInvocations"));
    /// The memory layout of `maxGeometryShaderInvocations`.
    public static final MemoryLayout LAYOUT_maxGeometryShaderInvocations = LAYOUT.select(PathElement.groupElement("maxGeometryShaderInvocations"));
    /// The [VarHandle] of `maxGeometryShaderInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxGeometryShaderInvocations = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryShaderInvocations")));
    /// The byte offset of `maxGeometryInputComponents`.
    public static final long OFFSET_maxGeometryInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryInputComponents"));
    /// The memory layout of `maxGeometryInputComponents`.
    public static final MemoryLayout LAYOUT_maxGeometryInputComponents = LAYOUT.select(PathElement.groupElement("maxGeometryInputComponents"));
    /// The [VarHandle] of `maxGeometryInputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxGeometryInputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryInputComponents")));
    /// The byte offset of `maxGeometryOutputComponents`.
    public static final long OFFSET_maxGeometryOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryOutputComponents"));
    /// The memory layout of `maxGeometryOutputComponents`.
    public static final MemoryLayout LAYOUT_maxGeometryOutputComponents = LAYOUT.select(PathElement.groupElement("maxGeometryOutputComponents"));
    /// The [VarHandle] of `maxGeometryOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxGeometryOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryOutputComponents")));
    /// The byte offset of `maxGeometryOutputVertices`.
    public static final long OFFSET_maxGeometryOutputVertices = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryOutputVertices"));
    /// The memory layout of `maxGeometryOutputVertices`.
    public static final MemoryLayout LAYOUT_maxGeometryOutputVertices = LAYOUT.select(PathElement.groupElement("maxGeometryOutputVertices"));
    /// The [VarHandle] of `maxGeometryOutputVertices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxGeometryOutputVertices = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryOutputVertices")));
    /// The byte offset of `maxGeometryTotalOutputComponents`.
    public static final long OFFSET_maxGeometryTotalOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryTotalOutputComponents"));
    /// The memory layout of `maxGeometryTotalOutputComponents`.
    public static final MemoryLayout LAYOUT_maxGeometryTotalOutputComponents = LAYOUT.select(PathElement.groupElement("maxGeometryTotalOutputComponents"));
    /// The [VarHandle] of `maxGeometryTotalOutputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxGeometryTotalOutputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryTotalOutputComponents")));
    /// The byte offset of `maxFragmentInputComponents`.
    public static final long OFFSET_maxFragmentInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentInputComponents"));
    /// The memory layout of `maxFragmentInputComponents`.
    public static final MemoryLayout LAYOUT_maxFragmentInputComponents = LAYOUT.select(PathElement.groupElement("maxFragmentInputComponents"));
    /// The [VarHandle] of `maxFragmentInputComponents` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFragmentInputComponents = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentInputComponents")));
    /// The byte offset of `maxFragmentOutputAttachments`.
    public static final long OFFSET_maxFragmentOutputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentOutputAttachments"));
    /// The memory layout of `maxFragmentOutputAttachments`.
    public static final MemoryLayout LAYOUT_maxFragmentOutputAttachments = LAYOUT.select(PathElement.groupElement("maxFragmentOutputAttachments"));
    /// The [VarHandle] of `maxFragmentOutputAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFragmentOutputAttachments = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentOutputAttachments")));
    /// The byte offset of `maxFragmentDualSrcAttachments`.
    public static final long OFFSET_maxFragmentDualSrcAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDualSrcAttachments"));
    /// The memory layout of `maxFragmentDualSrcAttachments`.
    public static final MemoryLayout LAYOUT_maxFragmentDualSrcAttachments = LAYOUT.select(PathElement.groupElement("maxFragmentDualSrcAttachments"));
    /// The [VarHandle] of `maxFragmentDualSrcAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFragmentDualSrcAttachments = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDualSrcAttachments")));
    /// The byte offset of `maxFragmentCombinedOutputResources`.
    public static final long OFFSET_maxFragmentCombinedOutputResources = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentCombinedOutputResources"));
    /// The memory layout of `maxFragmentCombinedOutputResources`.
    public static final MemoryLayout LAYOUT_maxFragmentCombinedOutputResources = LAYOUT.select(PathElement.groupElement("maxFragmentCombinedOutputResources"));
    /// The [VarHandle] of `maxFragmentCombinedOutputResources` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFragmentCombinedOutputResources = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentCombinedOutputResources")));
    /// The byte offset of `maxComputeSharedMemorySize`.
    public static final long OFFSET_maxComputeSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxComputeSharedMemorySize"));
    /// The memory layout of `maxComputeSharedMemorySize`.
    public static final MemoryLayout LAYOUT_maxComputeSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxComputeSharedMemorySize"));
    /// The [VarHandle] of `maxComputeSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxComputeSharedMemorySize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeSharedMemorySize")));
    /// The byte offset of `maxComputeWorkGroupCount`.
    public static final long OFFSET_maxComputeWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupCount"));
    /// The memory layout of `maxComputeWorkGroupCount`.
    public static final MemoryLayout LAYOUT_maxComputeWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupCount"));
    /// The [VarHandle] of `maxComputeWorkGroupCount` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxComputeWorkGroupCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupCount"), PathElement.sequenceElement()));
    /// The byte offset of `maxComputeWorkGroupInvocations`.
    public static final long OFFSET_maxComputeWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupInvocations"));
    /// The memory layout of `maxComputeWorkGroupInvocations`.
    public static final MemoryLayout LAYOUT_maxComputeWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupInvocations"));
    /// The [VarHandle] of `maxComputeWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxComputeWorkGroupInvocations = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupInvocations")));
    /// The byte offset of `maxComputeWorkGroupSize`.
    public static final long OFFSET_maxComputeWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupSize"));
    /// The memory layout of `maxComputeWorkGroupSize`.
    public static final MemoryLayout LAYOUT_maxComputeWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupSize"));
    /// The [VarHandle] of `maxComputeWorkGroupSize` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxComputeWorkGroupSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupSize"), PathElement.sequenceElement()));
    /// The byte offset of `subPixelPrecisionBits`.
    public static final long OFFSET_subPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("subPixelPrecisionBits"));
    /// The memory layout of `subPixelPrecisionBits`.
    public static final MemoryLayout LAYOUT_subPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("subPixelPrecisionBits"));
    /// The [VarHandle] of `subPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subPixelPrecisionBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subPixelPrecisionBits")));
    /// The byte offset of `subTexelPrecisionBits`.
    public static final long OFFSET_subTexelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("subTexelPrecisionBits"));
    /// The memory layout of `subTexelPrecisionBits`.
    public static final MemoryLayout LAYOUT_subTexelPrecisionBits = LAYOUT.select(PathElement.groupElement("subTexelPrecisionBits"));
    /// The [VarHandle] of `subTexelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subTexelPrecisionBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subTexelPrecisionBits")));
    /// The byte offset of `mipmapPrecisionBits`.
    public static final long OFFSET_mipmapPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("mipmapPrecisionBits"));
    /// The memory layout of `mipmapPrecisionBits`.
    public static final MemoryLayout LAYOUT_mipmapPrecisionBits = LAYOUT.select(PathElement.groupElement("mipmapPrecisionBits"));
    /// The [VarHandle] of `mipmapPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_mipmapPrecisionBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipmapPrecisionBits")));
    /// The byte offset of `maxDrawIndexedIndexValue`.
    public static final long OFFSET_maxDrawIndexedIndexValue = LAYOUT.byteOffset(PathElement.groupElement("maxDrawIndexedIndexValue"));
    /// The memory layout of `maxDrawIndexedIndexValue`.
    public static final MemoryLayout LAYOUT_maxDrawIndexedIndexValue = LAYOUT.select(PathElement.groupElement("maxDrawIndexedIndexValue"));
    /// The [VarHandle] of `maxDrawIndexedIndexValue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDrawIndexedIndexValue = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawIndexedIndexValue")));
    /// The byte offset of `maxDrawIndirectCount`.
    public static final long OFFSET_maxDrawIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawIndirectCount"));
    /// The memory layout of `maxDrawIndirectCount`.
    public static final MemoryLayout LAYOUT_maxDrawIndirectCount = LAYOUT.select(PathElement.groupElement("maxDrawIndirectCount"));
    /// The [VarHandle] of `maxDrawIndirectCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxDrawIndirectCount = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawIndirectCount")));
    /// The byte offset of `maxSamplerLodBias`.
    public static final long OFFSET_maxSamplerLodBias = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerLodBias"));
    /// The memory layout of `maxSamplerLodBias`.
    public static final MemoryLayout LAYOUT_maxSamplerLodBias = LAYOUT.select(PathElement.groupElement("maxSamplerLodBias"));
    /// The [VarHandle] of `maxSamplerLodBias` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSamplerLodBias = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerLodBias")));
    /// The byte offset of `maxSamplerAnisotropy`.
    public static final long OFFSET_maxSamplerAnisotropy = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerAnisotropy"));
    /// The memory layout of `maxSamplerAnisotropy`.
    public static final MemoryLayout LAYOUT_maxSamplerAnisotropy = LAYOUT.select(PathElement.groupElement("maxSamplerAnisotropy"));
    /// The [VarHandle] of `maxSamplerAnisotropy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSamplerAnisotropy = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerAnisotropy")));
    /// The byte offset of `maxViewports`.
    public static final long OFFSET_maxViewports = LAYOUT.byteOffset(PathElement.groupElement("maxViewports"));
    /// The memory layout of `maxViewports`.
    public static final MemoryLayout LAYOUT_maxViewports = LAYOUT.select(PathElement.groupElement("maxViewports"));
    /// The [VarHandle] of `maxViewports` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxViewports = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxViewports")));
    /// The byte offset of `maxViewportDimensions`.
    public static final long OFFSET_maxViewportDimensions = LAYOUT.byteOffset(PathElement.groupElement("maxViewportDimensions"));
    /// The memory layout of `maxViewportDimensions`.
    public static final MemoryLayout LAYOUT_maxViewportDimensions = LAYOUT.select(PathElement.groupElement("maxViewportDimensions"));
    /// The [VarHandle] of `maxViewportDimensions` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxViewportDimensions = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxViewportDimensions"), PathElement.sequenceElement()));
    /// The byte offset of `viewportBoundsRange`.
    public static final long OFFSET_viewportBoundsRange = LAYOUT.byteOffset(PathElement.groupElement("viewportBoundsRange"));
    /// The memory layout of `viewportBoundsRange`.
    public static final MemoryLayout LAYOUT_viewportBoundsRange = LAYOUT.select(PathElement.groupElement("viewportBoundsRange"));
    /// The [VarHandle] of `viewportBoundsRange` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_viewportBoundsRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportBoundsRange"), PathElement.sequenceElement()));
    /// The byte offset of `viewportSubPixelBits`.
    public static final long OFFSET_viewportSubPixelBits = LAYOUT.byteOffset(PathElement.groupElement("viewportSubPixelBits"));
    /// The memory layout of `viewportSubPixelBits`.
    public static final MemoryLayout LAYOUT_viewportSubPixelBits = LAYOUT.select(PathElement.groupElement("viewportSubPixelBits"));
    /// The [VarHandle] of `viewportSubPixelBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_viewportSubPixelBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportSubPixelBits")));
    /// The byte offset of `minMemoryMapAlignment`.
    public static final long OFFSET_minMemoryMapAlignment = LAYOUT.byteOffset(PathElement.groupElement("minMemoryMapAlignment"));
    /// The memory layout of `minMemoryMapAlignment`.
    public static final MemoryLayout LAYOUT_minMemoryMapAlignment = LAYOUT.select(PathElement.groupElement("minMemoryMapAlignment"));
    /// The [VarHandle] of `minMemoryMapAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minMemoryMapAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minMemoryMapAlignment")));
    /// The byte offset of `minTexelBufferOffsetAlignment`.
    public static final long OFFSET_minTexelBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minTexelBufferOffsetAlignment"));
    /// The memory layout of `minTexelBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minTexelBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minTexelBufferOffsetAlignment"));
    /// The [VarHandle] of `minTexelBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minTexelBufferOffsetAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelBufferOffsetAlignment")));
    /// The byte offset of `minUniformBufferOffsetAlignment`.
    public static final long OFFSET_minUniformBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minUniformBufferOffsetAlignment"));
    /// The memory layout of `minUniformBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minUniformBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minUniformBufferOffsetAlignment"));
    /// The [VarHandle] of `minUniformBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minUniformBufferOffsetAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minUniformBufferOffsetAlignment")));
    /// The byte offset of `minStorageBufferOffsetAlignment`.
    public static final long OFFSET_minStorageBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minStorageBufferOffsetAlignment"));
    /// The memory layout of `minStorageBufferOffsetAlignment`.
    public static final MemoryLayout LAYOUT_minStorageBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minStorageBufferOffsetAlignment"));
    /// The [VarHandle] of `minStorageBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minStorageBufferOffsetAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minStorageBufferOffsetAlignment")));
    /// The byte offset of `minTexelOffset`.
    public static final long OFFSET_minTexelOffset = LAYOUT.byteOffset(PathElement.groupElement("minTexelOffset"));
    /// The memory layout of `minTexelOffset`.
    public static final MemoryLayout LAYOUT_minTexelOffset = LAYOUT.select(PathElement.groupElement("minTexelOffset"));
    /// The [VarHandle] of `minTexelOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minTexelOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelOffset")));
    /// The byte offset of `maxTexelOffset`.
    public static final long OFFSET_maxTexelOffset = LAYOUT.byteOffset(PathElement.groupElement("maxTexelOffset"));
    /// The memory layout of `maxTexelOffset`.
    public static final MemoryLayout LAYOUT_maxTexelOffset = LAYOUT.select(PathElement.groupElement("maxTexelOffset"));
    /// The [VarHandle] of `maxTexelOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTexelOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelOffset")));
    /// The byte offset of `minTexelGatherOffset`.
    public static final long OFFSET_minTexelGatherOffset = LAYOUT.byteOffset(PathElement.groupElement("minTexelGatherOffset"));
    /// The memory layout of `minTexelGatherOffset`.
    public static final MemoryLayout LAYOUT_minTexelGatherOffset = LAYOUT.select(PathElement.groupElement("minTexelGatherOffset"));
    /// The [VarHandle] of `minTexelGatherOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minTexelGatherOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelGatherOffset")));
    /// The byte offset of `maxTexelGatherOffset`.
    public static final long OFFSET_maxTexelGatherOffset = LAYOUT.byteOffset(PathElement.groupElement("maxTexelGatherOffset"));
    /// The memory layout of `maxTexelGatherOffset`.
    public static final MemoryLayout LAYOUT_maxTexelGatherOffset = LAYOUT.select(PathElement.groupElement("maxTexelGatherOffset"));
    /// The [VarHandle] of `maxTexelGatherOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxTexelGatherOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelGatherOffset")));
    /// The byte offset of `minInterpolationOffset`.
    public static final long OFFSET_minInterpolationOffset = LAYOUT.byteOffset(PathElement.groupElement("minInterpolationOffset"));
    /// The memory layout of `minInterpolationOffset`.
    public static final MemoryLayout LAYOUT_minInterpolationOffset = LAYOUT.select(PathElement.groupElement("minInterpolationOffset"));
    /// The [VarHandle] of `minInterpolationOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_minInterpolationOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("minInterpolationOffset")));
    /// The byte offset of `maxInterpolationOffset`.
    public static final long OFFSET_maxInterpolationOffset = LAYOUT.byteOffset(PathElement.groupElement("maxInterpolationOffset"));
    /// The memory layout of `maxInterpolationOffset`.
    public static final MemoryLayout LAYOUT_maxInterpolationOffset = LAYOUT.select(PathElement.groupElement("maxInterpolationOffset"));
    /// The [VarHandle] of `maxInterpolationOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxInterpolationOffset = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInterpolationOffset")));
    /// The byte offset of `subPixelInterpolationOffsetBits`.
    public static final long OFFSET_subPixelInterpolationOffsetBits = LAYOUT.byteOffset(PathElement.groupElement("subPixelInterpolationOffsetBits"));
    /// The memory layout of `subPixelInterpolationOffsetBits`.
    public static final MemoryLayout LAYOUT_subPixelInterpolationOffsetBits = LAYOUT.select(PathElement.groupElement("subPixelInterpolationOffsetBits"));
    /// The [VarHandle] of `subPixelInterpolationOffsetBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_subPixelInterpolationOffsetBits = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("subPixelInterpolationOffsetBits")));
    /// The byte offset of `maxFramebufferWidth`.
    public static final long OFFSET_maxFramebufferWidth = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferWidth"));
    /// The memory layout of `maxFramebufferWidth`.
    public static final MemoryLayout LAYOUT_maxFramebufferWidth = LAYOUT.select(PathElement.groupElement("maxFramebufferWidth"));
    /// The [VarHandle] of `maxFramebufferWidth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFramebufferWidth = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferWidth")));
    /// The byte offset of `maxFramebufferHeight`.
    public static final long OFFSET_maxFramebufferHeight = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferHeight"));
    /// The memory layout of `maxFramebufferHeight`.
    public static final MemoryLayout LAYOUT_maxFramebufferHeight = LAYOUT.select(PathElement.groupElement("maxFramebufferHeight"));
    /// The [VarHandle] of `maxFramebufferHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFramebufferHeight = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferHeight")));
    /// The byte offset of `maxFramebufferLayers`.
    public static final long OFFSET_maxFramebufferLayers = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferLayers"));
    /// The memory layout of `maxFramebufferLayers`.
    public static final MemoryLayout LAYOUT_maxFramebufferLayers = LAYOUT.select(PathElement.groupElement("maxFramebufferLayers"));
    /// The [VarHandle] of `maxFramebufferLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxFramebufferLayers = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferLayers")));
    /// The byte offset of `framebufferColorSampleCounts`.
    public static final long OFFSET_framebufferColorSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferColorSampleCounts"));
    /// The memory layout of `framebufferColorSampleCounts`.
    public static final MemoryLayout LAYOUT_framebufferColorSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferColorSampleCounts"));
    /// The [VarHandle] of `framebufferColorSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_framebufferColorSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferColorSampleCounts")));
    /// The byte offset of `framebufferDepthSampleCounts`.
    public static final long OFFSET_framebufferDepthSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferDepthSampleCounts"));
    /// The memory layout of `framebufferDepthSampleCounts`.
    public static final MemoryLayout LAYOUT_framebufferDepthSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferDepthSampleCounts"));
    /// The [VarHandle] of `framebufferDepthSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_framebufferDepthSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferDepthSampleCounts")));
    /// The byte offset of `framebufferStencilSampleCounts`.
    public static final long OFFSET_framebufferStencilSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferStencilSampleCounts"));
    /// The memory layout of `framebufferStencilSampleCounts`.
    public static final MemoryLayout LAYOUT_framebufferStencilSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferStencilSampleCounts"));
    /// The [VarHandle] of `framebufferStencilSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_framebufferStencilSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferStencilSampleCounts")));
    /// The byte offset of `framebufferNoAttachmentsSampleCounts`.
    public static final long OFFSET_framebufferNoAttachmentsSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    /// The memory layout of `framebufferNoAttachmentsSampleCounts`.
    public static final MemoryLayout LAYOUT_framebufferNoAttachmentsSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    /// The [VarHandle] of `framebufferNoAttachmentsSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_framebufferNoAttachmentsSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferNoAttachmentsSampleCounts")));
    /// The byte offset of `maxColorAttachments`.
    public static final long OFFSET_maxColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxColorAttachments"));
    /// The memory layout of `maxColorAttachments`.
    public static final MemoryLayout LAYOUT_maxColorAttachments = LAYOUT.select(PathElement.groupElement("maxColorAttachments"));
    /// The [VarHandle] of `maxColorAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxColorAttachments = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxColorAttachments")));
    /// The byte offset of `sampledImageColorSampleCounts`.
    public static final long OFFSET_sampledImageColorSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageColorSampleCounts"));
    /// The memory layout of `sampledImageColorSampleCounts`.
    public static final MemoryLayout LAYOUT_sampledImageColorSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageColorSampleCounts"));
    /// The [VarHandle] of `sampledImageColorSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampledImageColorSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageColorSampleCounts")));
    /// The byte offset of `sampledImageIntegerSampleCounts`.
    public static final long OFFSET_sampledImageIntegerSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageIntegerSampleCounts"));
    /// The memory layout of `sampledImageIntegerSampleCounts`.
    public static final MemoryLayout LAYOUT_sampledImageIntegerSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageIntegerSampleCounts"));
    /// The [VarHandle] of `sampledImageIntegerSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampledImageIntegerSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageIntegerSampleCounts")));
    /// The byte offset of `sampledImageDepthSampleCounts`.
    public static final long OFFSET_sampledImageDepthSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageDepthSampleCounts"));
    /// The memory layout of `sampledImageDepthSampleCounts`.
    public static final MemoryLayout LAYOUT_sampledImageDepthSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageDepthSampleCounts"));
    /// The [VarHandle] of `sampledImageDepthSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampledImageDepthSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageDepthSampleCounts")));
    /// The byte offset of `sampledImageStencilSampleCounts`.
    public static final long OFFSET_sampledImageStencilSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageStencilSampleCounts"));
    /// The memory layout of `sampledImageStencilSampleCounts`.
    public static final MemoryLayout LAYOUT_sampledImageStencilSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageStencilSampleCounts"));
    /// The [VarHandle] of `sampledImageStencilSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_sampledImageStencilSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageStencilSampleCounts")));
    /// The byte offset of `storageImageSampleCounts`.
    public static final long OFFSET_storageImageSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("storageImageSampleCounts"));
    /// The memory layout of `storageImageSampleCounts`.
    public static final MemoryLayout LAYOUT_storageImageSampleCounts = LAYOUT.select(PathElement.groupElement("storageImageSampleCounts"));
    /// The [VarHandle] of `storageImageSampleCounts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_storageImageSampleCounts = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageImageSampleCounts")));
    /// The byte offset of `maxSampleMaskWords`.
    public static final long OFFSET_maxSampleMaskWords = LAYOUT.byteOffset(PathElement.groupElement("maxSampleMaskWords"));
    /// The memory layout of `maxSampleMaskWords`.
    public static final MemoryLayout LAYOUT_maxSampleMaskWords = LAYOUT.select(PathElement.groupElement("maxSampleMaskWords"));
    /// The [VarHandle] of `maxSampleMaskWords` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxSampleMaskWords = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleMaskWords")));
    /// The byte offset of `timestampComputeAndGraphics`.
    public static final long OFFSET_timestampComputeAndGraphics = LAYOUT.byteOffset(PathElement.groupElement("timestampComputeAndGraphics"));
    /// The memory layout of `timestampComputeAndGraphics`.
    public static final MemoryLayout LAYOUT_timestampComputeAndGraphics = LAYOUT.select(PathElement.groupElement("timestampComputeAndGraphics"));
    /// The [VarHandle] of `timestampComputeAndGraphics` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_timestampComputeAndGraphics = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampComputeAndGraphics")));
    /// The byte offset of `timestampPeriod`.
    public static final long OFFSET_timestampPeriod = LAYOUT.byteOffset(PathElement.groupElement("timestampPeriod"));
    /// The memory layout of `timestampPeriod`.
    public static final MemoryLayout LAYOUT_timestampPeriod = LAYOUT.select(PathElement.groupElement("timestampPeriod"));
    /// The [VarHandle] of `timestampPeriod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_timestampPeriod = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampPeriod")));
    /// The byte offset of `maxClipDistances`.
    public static final long OFFSET_maxClipDistances = LAYOUT.byteOffset(PathElement.groupElement("maxClipDistances"));
    /// The memory layout of `maxClipDistances`.
    public static final MemoryLayout LAYOUT_maxClipDistances = LAYOUT.select(PathElement.groupElement("maxClipDistances"));
    /// The [VarHandle] of `maxClipDistances` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxClipDistances = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClipDistances")));
    /// The byte offset of `maxCullDistances`.
    public static final long OFFSET_maxCullDistances = LAYOUT.byteOffset(PathElement.groupElement("maxCullDistances"));
    /// The memory layout of `maxCullDistances`.
    public static final MemoryLayout LAYOUT_maxCullDistances = LAYOUT.select(PathElement.groupElement("maxCullDistances"));
    /// The [VarHandle] of `maxCullDistances` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxCullDistances = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCullDistances")));
    /// The byte offset of `maxCombinedClipAndCullDistances`.
    public static final long OFFSET_maxCombinedClipAndCullDistances = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedClipAndCullDistances"));
    /// The memory layout of `maxCombinedClipAndCullDistances`.
    public static final MemoryLayout LAYOUT_maxCombinedClipAndCullDistances = LAYOUT.select(PathElement.groupElement("maxCombinedClipAndCullDistances"));
    /// The [VarHandle] of `maxCombinedClipAndCullDistances` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_maxCombinedClipAndCullDistances = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedClipAndCullDistances")));
    /// The byte offset of `discreteQueuePriorities`.
    public static final long OFFSET_discreteQueuePriorities = LAYOUT.byteOffset(PathElement.groupElement("discreteQueuePriorities"));
    /// The memory layout of `discreteQueuePriorities`.
    public static final MemoryLayout LAYOUT_discreteQueuePriorities = LAYOUT.select(PathElement.groupElement("discreteQueuePriorities"));
    /// The [VarHandle] of `discreteQueuePriorities` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_discreteQueuePriorities = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("discreteQueuePriorities")));
    /// The byte offset of `pointSizeRange`.
    public static final long OFFSET_pointSizeRange = LAYOUT.byteOffset(PathElement.groupElement("pointSizeRange"));
    /// The memory layout of `pointSizeRange`.
    public static final MemoryLayout LAYOUT_pointSizeRange = LAYOUT.select(PathElement.groupElement("pointSizeRange"));
    /// The [VarHandle] of `pointSizeRange` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_pointSizeRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointSizeRange"), PathElement.sequenceElement()));
    /// The byte offset of `lineWidthRange`.
    public static final long OFFSET_lineWidthRange = LAYOUT.byteOffset(PathElement.groupElement("lineWidthRange"));
    /// The memory layout of `lineWidthRange`.
    public static final MemoryLayout LAYOUT_lineWidthRange = LAYOUT.select(PathElement.groupElement("lineWidthRange"));
    /// The [VarHandle] of `lineWidthRange` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final Supplier<VarHandle> VH_lineWidthRange = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidthRange"), PathElement.sequenceElement()));
    /// The byte offset of `pointSizeGranularity`.
    public static final long OFFSET_pointSizeGranularity = LAYOUT.byteOffset(PathElement.groupElement("pointSizeGranularity"));
    /// The memory layout of `pointSizeGranularity`.
    public static final MemoryLayout LAYOUT_pointSizeGranularity = LAYOUT.select(PathElement.groupElement("pointSizeGranularity"));
    /// The [VarHandle] of `pointSizeGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_pointSizeGranularity = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointSizeGranularity")));
    /// The byte offset of `lineWidthGranularity`.
    public static final long OFFSET_lineWidthGranularity = LAYOUT.byteOffset(PathElement.groupElement("lineWidthGranularity"));
    /// The memory layout of `lineWidthGranularity`.
    public static final MemoryLayout LAYOUT_lineWidthGranularity = LAYOUT.select(PathElement.groupElement("lineWidthGranularity"));
    /// The [VarHandle] of `lineWidthGranularity` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_lineWidthGranularity = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidthGranularity")));
    /// The byte offset of `strictLines`.
    public static final long OFFSET_strictLines = LAYOUT.byteOffset(PathElement.groupElement("strictLines"));
    /// The memory layout of `strictLines`.
    public static final MemoryLayout LAYOUT_strictLines = LAYOUT.select(PathElement.groupElement("strictLines"));
    /// The [VarHandle] of `strictLines` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_strictLines = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("strictLines")));
    /// The byte offset of `standardSampleLocations`.
    public static final long OFFSET_standardSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("standardSampleLocations"));
    /// The memory layout of `standardSampleLocations`.
    public static final MemoryLayout LAYOUT_standardSampleLocations = LAYOUT.select(PathElement.groupElement("standardSampleLocations"));
    /// The [VarHandle] of `standardSampleLocations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_standardSampleLocations = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("standardSampleLocations")));
    /// The byte offset of `optimalBufferCopyOffsetAlignment`.
    public static final long OFFSET_optimalBufferCopyOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    /// The memory layout of `optimalBufferCopyOffsetAlignment`.
    public static final MemoryLayout LAYOUT_optimalBufferCopyOffsetAlignment = LAYOUT.select(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    /// The [VarHandle] of `optimalBufferCopyOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_optimalBufferCopyOffsetAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalBufferCopyOffsetAlignment")));
    /// The byte offset of `optimalBufferCopyRowPitchAlignment`.
    public static final long OFFSET_optimalBufferCopyRowPitchAlignment = LAYOUT.byteOffset(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    /// The memory layout of `optimalBufferCopyRowPitchAlignment`.
    public static final MemoryLayout LAYOUT_optimalBufferCopyRowPitchAlignment = LAYOUT.select(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    /// The [VarHandle] of `optimalBufferCopyRowPitchAlignment` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_optimalBufferCopyRowPitchAlignment = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalBufferCopyRowPitchAlignment")));
    /// The byte offset of `nonCoherentAtomSize`.
    public static final long OFFSET_nonCoherentAtomSize = LAYOUT.byteOffset(PathElement.groupElement("nonCoherentAtomSize"));
    /// The memory layout of `nonCoherentAtomSize`.
    public static final MemoryLayout LAYOUT_nonCoherentAtomSize = LAYOUT.select(PathElement.groupElement("nonCoherentAtomSize"));
    /// The [VarHandle] of `nonCoherentAtomSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final Supplier<VarHandle> VH_nonCoherentAtomSize = StableValue.supplier(() -> LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonCoherentAtomSize")));

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceLimits(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLimits of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLimits ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLimits ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceLimits` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLimits`
    public static VkPhysicalDeviceLimits alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLimits(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceLimits` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLimits`
    public static VkPhysicalDeviceLimits alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLimits(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLimits copyFrom(VkPhysicalDeviceLimits src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceLimits reinterpret(long count) { return new VkPhysicalDeviceLimits(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `maxImageDimension1D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageDimension1D(MemorySegment segment, long index) { return (int) VH_maxImageDimension1D.get().get(segment, 0L, index); }
    /// {@return `maxImageDimension1D`}
    public int maxImageDimension1D() { return maxImageDimension1D(this.segment(), 0L); }
    /// Sets `maxImageDimension1D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageDimension1D(MemorySegment segment, long index, int value) { VH_maxImageDimension1D.get().set(segment, 0L, index, value); }
    /// Sets `maxImageDimension1D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension1D(int value) { maxImageDimension1D(this.segment(), 0L, value); return this; }

    /// {@return `maxImageDimension2D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageDimension2D(MemorySegment segment, long index) { return (int) VH_maxImageDimension2D.get().get(segment, 0L, index); }
    /// {@return `maxImageDimension2D`}
    public int maxImageDimension2D() { return maxImageDimension2D(this.segment(), 0L); }
    /// Sets `maxImageDimension2D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageDimension2D(MemorySegment segment, long index, int value) { VH_maxImageDimension2D.get().set(segment, 0L, index, value); }
    /// Sets `maxImageDimension2D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension2D(int value) { maxImageDimension2D(this.segment(), 0L, value); return this; }

    /// {@return `maxImageDimension3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageDimension3D(MemorySegment segment, long index) { return (int) VH_maxImageDimension3D.get().get(segment, 0L, index); }
    /// {@return `maxImageDimension3D`}
    public int maxImageDimension3D() { return maxImageDimension3D(this.segment(), 0L); }
    /// Sets `maxImageDimension3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageDimension3D(MemorySegment segment, long index, int value) { VH_maxImageDimension3D.get().set(segment, 0L, index, value); }
    /// Sets `maxImageDimension3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension3D(int value) { maxImageDimension3D(this.segment(), 0L, value); return this; }

    /// {@return `maxImageDimensionCube` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageDimensionCube(MemorySegment segment, long index) { return (int) VH_maxImageDimensionCube.get().get(segment, 0L, index); }
    /// {@return `maxImageDimensionCube`}
    public int maxImageDimensionCube() { return maxImageDimensionCube(this.segment(), 0L); }
    /// Sets `maxImageDimensionCube` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageDimensionCube(MemorySegment segment, long index, int value) { VH_maxImageDimensionCube.get().set(segment, 0L, index, value); }
    /// Sets `maxImageDimensionCube` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimensionCube(int value) { maxImageDimensionCube(this.segment(), 0L, value); return this; }

    /// {@return `maxImageArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageArrayLayers(MemorySegment segment, long index) { return (int) VH_maxImageArrayLayers.get().get(segment, 0L, index); }
    /// {@return `maxImageArrayLayers`}
    public int maxImageArrayLayers() { return maxImageArrayLayers(this.segment(), 0L); }
    /// Sets `maxImageArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageArrayLayers(MemorySegment segment, long index, int value) { VH_maxImageArrayLayers.get().set(segment, 0L, index, value); }
    /// Sets `maxImageArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageArrayLayers(int value) { maxImageArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxTexelBufferElements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTexelBufferElements(MemorySegment segment, long index) { return (int) VH_maxTexelBufferElements.get().get(segment, 0L, index); }
    /// {@return `maxTexelBufferElements`}
    public int maxTexelBufferElements() { return maxTexelBufferElements(this.segment(), 0L); }
    /// Sets `maxTexelBufferElements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTexelBufferElements(MemorySegment segment, long index, int value) { VH_maxTexelBufferElements.get().set(segment, 0L, index, value); }
    /// Sets `maxTexelBufferElements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelBufferElements(int value) { maxTexelBufferElements(this.segment(), 0L, value); return this; }

    /// {@return `maxUniformBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxUniformBufferRange(MemorySegment segment, long index) { return (int) VH_maxUniformBufferRange.get().get(segment, 0L, index); }
    /// {@return `maxUniformBufferRange`}
    public int maxUniformBufferRange() { return maxUniformBufferRange(this.segment(), 0L); }
    /// Sets `maxUniformBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxUniformBufferRange(MemorySegment segment, long index, int value) { VH_maxUniformBufferRange.get().set(segment, 0L, index, value); }
    /// Sets `maxUniformBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxUniformBufferRange(int value) { maxUniformBufferRange(this.segment(), 0L, value); return this; }

    /// {@return `maxStorageBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxStorageBufferRange(MemorySegment segment, long index) { return (int) VH_maxStorageBufferRange.get().get(segment, 0L, index); }
    /// {@return `maxStorageBufferRange`}
    public int maxStorageBufferRange() { return maxStorageBufferRange(this.segment(), 0L); }
    /// Sets `maxStorageBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxStorageBufferRange(MemorySegment segment, long index, int value) { VH_maxStorageBufferRange.get().set(segment, 0L, index, value); }
    /// Sets `maxStorageBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxStorageBufferRange(int value) { maxStorageBufferRange(this.segment(), 0L, value); return this; }

    /// {@return `maxPushConstantsSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPushConstantsSize(MemorySegment segment, long index) { return (int) VH_maxPushConstantsSize.get().get(segment, 0L, index); }
    /// {@return `maxPushConstantsSize`}
    public int maxPushConstantsSize() { return maxPushConstantsSize(this.segment(), 0L); }
    /// Sets `maxPushConstantsSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPushConstantsSize(MemorySegment segment, long index, int value) { VH_maxPushConstantsSize.get().set(segment, 0L, index, value); }
    /// Sets `maxPushConstantsSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPushConstantsSize(int value) { maxPushConstantsSize(this.segment(), 0L, value); return this; }

    /// {@return `maxMemoryAllocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxMemoryAllocationCount(MemorySegment segment, long index) { return (int) VH_maxMemoryAllocationCount.get().get(segment, 0L, index); }
    /// {@return `maxMemoryAllocationCount`}
    public int maxMemoryAllocationCount() { return maxMemoryAllocationCount(this.segment(), 0L); }
    /// Sets `maxMemoryAllocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMemoryAllocationCount(MemorySegment segment, long index, int value) { VH_maxMemoryAllocationCount.get().set(segment, 0L, index, value); }
    /// Sets `maxMemoryAllocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxMemoryAllocationCount(int value) { maxMemoryAllocationCount(this.segment(), 0L, value); return this; }

    /// {@return `maxSamplerAllocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSamplerAllocationCount(MemorySegment segment, long index) { return (int) VH_maxSamplerAllocationCount.get().get(segment, 0L, index); }
    /// {@return `maxSamplerAllocationCount`}
    public int maxSamplerAllocationCount() { return maxSamplerAllocationCount(this.segment(), 0L); }
    /// Sets `maxSamplerAllocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSamplerAllocationCount(MemorySegment segment, long index, int value) { VH_maxSamplerAllocationCount.get().set(segment, 0L, index, value); }
    /// Sets `maxSamplerAllocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerAllocationCount(int value) { maxSamplerAllocationCount(this.segment(), 0L, value); return this; }

    /// {@return `bufferImageGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferImageGranularity(MemorySegment segment, long index) { return (long) VH_bufferImageGranularity.get().get(segment, 0L, index); }
    /// {@return `bufferImageGranularity`}
    public long bufferImageGranularity() { return bufferImageGranularity(this.segment(), 0L); }
    /// Sets `bufferImageGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferImageGranularity(MemorySegment segment, long index, long value) { VH_bufferImageGranularity.get().set(segment, 0L, index, value); }
    /// Sets `bufferImageGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits bufferImageGranularity(long value) { bufferImageGranularity(this.segment(), 0L, value); return this; }

    /// {@return `sparseAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long sparseAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_sparseAddressSpaceSize.get().get(segment, 0L, index); }
    /// {@return `sparseAddressSpaceSize`}
    public long sparseAddressSpaceSize() { return sparseAddressSpaceSize(this.segment(), 0L); }
    /// Sets `sparseAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sparseAddressSpaceSize(MemorySegment segment, long index, long value) { VH_sparseAddressSpaceSize.get().set(segment, 0L, index, value); }
    /// Sets `sparseAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sparseAddressSpaceSize(long value) { sparseAddressSpaceSize(this.segment(), 0L, value); return this; }

    /// {@return `maxBoundDescriptorSets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxBoundDescriptorSets(MemorySegment segment, long index) { return (int) VH_maxBoundDescriptorSets.get().get(segment, 0L, index); }
    /// {@return `maxBoundDescriptorSets`}
    public int maxBoundDescriptorSets() { return maxBoundDescriptorSets(this.segment(), 0L); }
    /// Sets `maxBoundDescriptorSets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxBoundDescriptorSets(MemorySegment segment, long index, int value) { VH_maxBoundDescriptorSets.get().set(segment, 0L, index, value); }
    /// Sets `maxBoundDescriptorSets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxBoundDescriptorSets(int value) { maxBoundDescriptorSets(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorSamplers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorSamplers.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorSamplers`}
    public int maxPerStageDescriptorSamplers() { return maxPerStageDescriptorSamplers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorSamplers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorSamplers.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorSamplers(int value) { maxPerStageDescriptorSamplers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUniformBuffers.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUniformBuffers`}
    public int maxPerStageDescriptorUniformBuffers() { return maxPerStageDescriptorUniformBuffers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorUniformBuffers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorUniformBuffers.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffers(int value) { maxPerStageDescriptorUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorStorageBuffers.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorStorageBuffers`}
    public int maxPerStageDescriptorStorageBuffers() { return maxPerStageDescriptorStorageBuffers(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorStorageBuffers(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorStorageBuffers.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffers(int value) { maxPerStageDescriptorStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorSampledImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorSampledImages.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorSampledImages`}
    public int maxPerStageDescriptorSampledImages() { return maxPerStageDescriptorSampledImages(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorSampledImages(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorSampledImages.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImages(int value) { maxPerStageDescriptorSampledImages(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorStorageImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorStorageImages.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorStorageImages`}
    public int maxPerStageDescriptorStorageImages() { return maxPerStageDescriptorStorageImages(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorStorageImages(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorStorageImages.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImages(int value) { maxPerStageDescriptorStorageImages(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageDescriptorInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageDescriptorInputAttachments(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorInputAttachments.get().get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorInputAttachments`}
    public int maxPerStageDescriptorInputAttachments() { return maxPerStageDescriptorInputAttachments(this.segment(), 0L); }
    /// Sets `maxPerStageDescriptorInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageDescriptorInputAttachments(MemorySegment segment, long index, int value) { VH_maxPerStageDescriptorInputAttachments.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachments(int value) { maxPerStageDescriptorInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxPerStageResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPerStageResources(MemorySegment segment, long index) { return (int) VH_maxPerStageResources.get().get(segment, 0L, index); }
    /// {@return `maxPerStageResources`}
    public int maxPerStageResources() { return maxPerStageResources(this.segment(), 0L); }
    /// Sets `maxPerStageResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPerStageResources(MemorySegment segment, long index, int value) { VH_maxPerStageResources.get().set(segment, 0L, index, value); }
    /// Sets `maxPerStageResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageResources(int value) { maxPerStageResources(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetSamplers.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetSamplers`}
    public int maxDescriptorSetSamplers() { return maxDescriptorSetSamplers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetSamplers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetSamplers.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetSamplers(int value) { maxDescriptorSetSamplers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUniformBuffers.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUniformBuffers`}
    public int maxDescriptorSetUniformBuffers() { return maxDescriptorSetUniformBuffers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUniformBuffers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUniformBuffers.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffers(int value) { maxDescriptorSetUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUniformBuffersDynamic.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUniformBuffersDynamic`}
    public int maxDescriptorSetUniformBuffersDynamic() { return maxDescriptorSetUniformBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetUniformBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetUniformBuffersDynamic.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamic(int value) { maxDescriptorSetUniformBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageBuffers.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageBuffers`}
    public int maxDescriptorSetStorageBuffers() { return maxDescriptorSetStorageBuffers(this.segment(), 0L); }
    /// Sets `maxDescriptorSetStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetStorageBuffers(MemorySegment segment, long index, int value) { VH_maxDescriptorSetStorageBuffers.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffers(int value) { maxDescriptorSetStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageBuffersDynamic.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageBuffersDynamic`}
    public int maxDescriptorSetStorageBuffersDynamic() { return maxDescriptorSetStorageBuffersDynamic(this.segment(), 0L); }
    /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetStorageBuffersDynamic(MemorySegment segment, long index, int value) { VH_maxDescriptorSetStorageBuffersDynamic.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamic(int value) { maxDescriptorSetStorageBuffersDynamic(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetSampledImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetSampledImages.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetSampledImages`}
    public int maxDescriptorSetSampledImages() { return maxDescriptorSetSampledImages(this.segment(), 0L); }
    /// Sets `maxDescriptorSetSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetSampledImages(MemorySegment segment, long index, int value) { VH_maxDescriptorSetSampledImages.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetSampledImages(int value) { maxDescriptorSetSampledImages(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetStorageImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageImages.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageImages`}
    public int maxDescriptorSetStorageImages() { return maxDescriptorSetStorageImages(this.segment(), 0L); }
    /// Sets `maxDescriptorSetStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetStorageImages(MemorySegment segment, long index, int value) { VH_maxDescriptorSetStorageImages.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageImages(int value) { maxDescriptorSetStorageImages(this.segment(), 0L, value); return this; }

    /// {@return `maxDescriptorSetInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDescriptorSetInputAttachments(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetInputAttachments.get().get(segment, 0L, index); }
    /// {@return `maxDescriptorSetInputAttachments`}
    public int maxDescriptorSetInputAttachments() { return maxDescriptorSetInputAttachments(this.segment(), 0L); }
    /// Sets `maxDescriptorSetInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDescriptorSetInputAttachments(MemorySegment segment, long index, int value) { VH_maxDescriptorSetInputAttachments.get().set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetInputAttachments(int value) { maxDescriptorSetInputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexInputAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexInputAttributes(MemorySegment segment, long index) { return (int) VH_maxVertexInputAttributes.get().get(segment, 0L, index); }
    /// {@return `maxVertexInputAttributes`}
    public int maxVertexInputAttributes() { return maxVertexInputAttributes(this.segment(), 0L); }
    /// Sets `maxVertexInputAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexInputAttributes(MemorySegment segment, long index, int value) { VH_maxVertexInputAttributes.get().set(segment, 0L, index, value); }
    /// Sets `maxVertexInputAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputAttributes(int value) { maxVertexInputAttributes(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexInputBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexInputBindings(MemorySegment segment, long index) { return (int) VH_maxVertexInputBindings.get().get(segment, 0L, index); }
    /// {@return `maxVertexInputBindings`}
    public int maxVertexInputBindings() { return maxVertexInputBindings(this.segment(), 0L); }
    /// Sets `maxVertexInputBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexInputBindings(MemorySegment segment, long index, int value) { VH_maxVertexInputBindings.get().set(segment, 0L, index, value); }
    /// Sets `maxVertexInputBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputBindings(int value) { maxVertexInputBindings(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexInputAttributeOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexInputAttributeOffset(MemorySegment segment, long index) { return (int) VH_maxVertexInputAttributeOffset.get().get(segment, 0L, index); }
    /// {@return `maxVertexInputAttributeOffset`}
    public int maxVertexInputAttributeOffset() { return maxVertexInputAttributeOffset(this.segment(), 0L); }
    /// Sets `maxVertexInputAttributeOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexInputAttributeOffset(MemorySegment segment, long index, int value) { VH_maxVertexInputAttributeOffset.get().set(segment, 0L, index, value); }
    /// Sets `maxVertexInputAttributeOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputAttributeOffset(int value) { maxVertexInputAttributeOffset(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexInputBindingStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexInputBindingStride(MemorySegment segment, long index) { return (int) VH_maxVertexInputBindingStride.get().get(segment, 0L, index); }
    /// {@return `maxVertexInputBindingStride`}
    public int maxVertexInputBindingStride() { return maxVertexInputBindingStride(this.segment(), 0L); }
    /// Sets `maxVertexInputBindingStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexInputBindingStride(MemorySegment segment, long index, int value) { VH_maxVertexInputBindingStride.get().set(segment, 0L, index, value); }
    /// Sets `maxVertexInputBindingStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputBindingStride(int value) { maxVertexInputBindingStride(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexOutputComponents(MemorySegment segment, long index) { return (int) VH_maxVertexOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxVertexOutputComponents`}
    public int maxVertexOutputComponents() { return maxVertexOutputComponents(this.segment(), 0L); }
    /// Sets `maxVertexOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexOutputComponents(MemorySegment segment, long index, int value) { VH_maxVertexOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxVertexOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexOutputComponents(int value) { maxVertexOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationGenerationLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationGenerationLevel(MemorySegment segment, long index) { return (int) VH_maxTessellationGenerationLevel.get().get(segment, 0L, index); }
    /// {@return `maxTessellationGenerationLevel`}
    public int maxTessellationGenerationLevel() { return maxTessellationGenerationLevel(this.segment(), 0L); }
    /// Sets `maxTessellationGenerationLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationGenerationLevel(MemorySegment segment, long index, int value) { VH_maxTessellationGenerationLevel.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationGenerationLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationGenerationLevel(int value) { maxTessellationGenerationLevel(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationPatchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationPatchSize(MemorySegment segment, long index) { return (int) VH_maxTessellationPatchSize.get().get(segment, 0L, index); }
    /// {@return `maxTessellationPatchSize`}
    public int maxTessellationPatchSize() { return maxTessellationPatchSize(this.segment(), 0L); }
    /// Sets `maxTessellationPatchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationPatchSize(MemorySegment segment, long index, int value) { VH_maxTessellationPatchSize.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationPatchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationPatchSize(int value) { maxTessellationPatchSize(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationControlPerVertexInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationControlPerVertexInputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlPerVertexInputComponents.get().get(segment, 0L, index); }
    /// {@return `maxTessellationControlPerVertexInputComponents`}
    public int maxTessellationControlPerVertexInputComponents() { return maxTessellationControlPerVertexInputComponents(this.segment(), 0L); }
    /// Sets `maxTessellationControlPerVertexInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationControlPerVertexInputComponents(MemorySegment segment, long index, int value) { VH_maxTessellationControlPerVertexInputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlPerVertexInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponents(int value) { maxTessellationControlPerVertexInputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationControlPerVertexOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationControlPerVertexOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlPerVertexOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxTessellationControlPerVertexOutputComponents`}
    public int maxTessellationControlPerVertexOutputComponents() { return maxTessellationControlPerVertexOutputComponents(this.segment(), 0L); }
    /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationControlPerVertexOutputComponents(MemorySegment segment, long index, int value) { VH_maxTessellationControlPerVertexOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponents(int value) { maxTessellationControlPerVertexOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationControlPerPatchOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationControlPerPatchOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlPerPatchOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxTessellationControlPerPatchOutputComponents`}
    public int maxTessellationControlPerPatchOutputComponents() { return maxTessellationControlPerPatchOutputComponents(this.segment(), 0L); }
    /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationControlPerPatchOutputComponents(MemorySegment segment, long index, int value) { VH_maxTessellationControlPerPatchOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponents(int value) { maxTessellationControlPerPatchOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationControlTotalOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationControlTotalOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlTotalOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxTessellationControlTotalOutputComponents`}
    public int maxTessellationControlTotalOutputComponents() { return maxTessellationControlTotalOutputComponents(this.segment(), 0L); }
    /// Sets `maxTessellationControlTotalOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationControlTotalOutputComponents(MemorySegment segment, long index, int value) { VH_maxTessellationControlTotalOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlTotalOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponents(int value) { maxTessellationControlTotalOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationEvaluationInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationEvaluationInputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationEvaluationInputComponents.get().get(segment, 0L, index); }
    /// {@return `maxTessellationEvaluationInputComponents`}
    public int maxTessellationEvaluationInputComponents() { return maxTessellationEvaluationInputComponents(this.segment(), 0L); }
    /// Sets `maxTessellationEvaluationInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationEvaluationInputComponents(MemorySegment segment, long index, int value) { VH_maxTessellationEvaluationInputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationEvaluationInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponents(int value) { maxTessellationEvaluationInputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxTessellationEvaluationOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTessellationEvaluationOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationEvaluationOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxTessellationEvaluationOutputComponents`}
    public int maxTessellationEvaluationOutputComponents() { return maxTessellationEvaluationOutputComponents(this.segment(), 0L); }
    /// Sets `maxTessellationEvaluationOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTessellationEvaluationOutputComponents(MemorySegment segment, long index, int value) { VH_maxTessellationEvaluationOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxTessellationEvaluationOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponents(int value) { maxTessellationEvaluationOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryShaderInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryShaderInvocations(MemorySegment segment, long index) { return (int) VH_maxGeometryShaderInvocations.get().get(segment, 0L, index); }
    /// {@return `maxGeometryShaderInvocations`}
    public int maxGeometryShaderInvocations() { return maxGeometryShaderInvocations(this.segment(), 0L); }
    /// Sets `maxGeometryShaderInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryShaderInvocations(MemorySegment segment, long index, int value) { VH_maxGeometryShaderInvocations.get().set(segment, 0L, index, value); }
    /// Sets `maxGeometryShaderInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryShaderInvocations(int value) { maxGeometryShaderInvocations(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryInputComponents(MemorySegment segment, long index) { return (int) VH_maxGeometryInputComponents.get().get(segment, 0L, index); }
    /// {@return `maxGeometryInputComponents`}
    public int maxGeometryInputComponents() { return maxGeometryInputComponents(this.segment(), 0L); }
    /// Sets `maxGeometryInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryInputComponents(MemorySegment segment, long index, int value) { VH_maxGeometryInputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxGeometryInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryInputComponents(int value) { maxGeometryInputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryOutputComponents(MemorySegment segment, long index) { return (int) VH_maxGeometryOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxGeometryOutputComponents`}
    public int maxGeometryOutputComponents() { return maxGeometryOutputComponents(this.segment(), 0L); }
    /// Sets `maxGeometryOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryOutputComponents(MemorySegment segment, long index, int value) { VH_maxGeometryOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxGeometryOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryOutputComponents(int value) { maxGeometryOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryOutputVertices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryOutputVertices(MemorySegment segment, long index) { return (int) VH_maxGeometryOutputVertices.get().get(segment, 0L, index); }
    /// {@return `maxGeometryOutputVertices`}
    public int maxGeometryOutputVertices() { return maxGeometryOutputVertices(this.segment(), 0L); }
    /// Sets `maxGeometryOutputVertices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryOutputVertices(MemorySegment segment, long index, int value) { VH_maxGeometryOutputVertices.get().set(segment, 0L, index, value); }
    /// Sets `maxGeometryOutputVertices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryOutputVertices(int value) { maxGeometryOutputVertices(this.segment(), 0L, value); return this; }

    /// {@return `maxGeometryTotalOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxGeometryTotalOutputComponents(MemorySegment segment, long index) { return (int) VH_maxGeometryTotalOutputComponents.get().get(segment, 0L, index); }
    /// {@return `maxGeometryTotalOutputComponents`}
    public int maxGeometryTotalOutputComponents() { return maxGeometryTotalOutputComponents(this.segment(), 0L); }
    /// Sets `maxGeometryTotalOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxGeometryTotalOutputComponents(MemorySegment segment, long index, int value) { VH_maxGeometryTotalOutputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxGeometryTotalOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryTotalOutputComponents(int value) { maxGeometryTotalOutputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentInputComponents(MemorySegment segment, long index) { return (int) VH_maxFragmentInputComponents.get().get(segment, 0L, index); }
    /// {@return `maxFragmentInputComponents`}
    public int maxFragmentInputComponents() { return maxFragmentInputComponents(this.segment(), 0L); }
    /// Sets `maxFragmentInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentInputComponents(MemorySegment segment, long index, int value) { VH_maxFragmentInputComponents.get().set(segment, 0L, index, value); }
    /// Sets `maxFragmentInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentInputComponents(int value) { maxFragmentInputComponents(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentOutputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentOutputAttachments(MemorySegment segment, long index) { return (int) VH_maxFragmentOutputAttachments.get().get(segment, 0L, index); }
    /// {@return `maxFragmentOutputAttachments`}
    public int maxFragmentOutputAttachments() { return maxFragmentOutputAttachments(this.segment(), 0L); }
    /// Sets `maxFragmentOutputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentOutputAttachments(MemorySegment segment, long index, int value) { VH_maxFragmentOutputAttachments.get().set(segment, 0L, index, value); }
    /// Sets `maxFragmentOutputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentOutputAttachments(int value) { maxFragmentOutputAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentDualSrcAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentDualSrcAttachments(MemorySegment segment, long index) { return (int) VH_maxFragmentDualSrcAttachments.get().get(segment, 0L, index); }
    /// {@return `maxFragmentDualSrcAttachments`}
    public int maxFragmentDualSrcAttachments() { return maxFragmentDualSrcAttachments(this.segment(), 0L); }
    /// Sets `maxFragmentDualSrcAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentDualSrcAttachments(MemorySegment segment, long index, int value) { VH_maxFragmentDualSrcAttachments.get().set(segment, 0L, index, value); }
    /// Sets `maxFragmentDualSrcAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentDualSrcAttachments(int value) { maxFragmentDualSrcAttachments(this.segment(), 0L, value); return this; }

    /// {@return `maxFragmentCombinedOutputResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFragmentCombinedOutputResources(MemorySegment segment, long index) { return (int) VH_maxFragmentCombinedOutputResources.get().get(segment, 0L, index); }
    /// {@return `maxFragmentCombinedOutputResources`}
    public int maxFragmentCombinedOutputResources() { return maxFragmentCombinedOutputResources(this.segment(), 0L); }
    /// Sets `maxFragmentCombinedOutputResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFragmentCombinedOutputResources(MemorySegment segment, long index, int value) { VH_maxFragmentCombinedOutputResources.get().set(segment, 0L, index, value); }
    /// Sets `maxFragmentCombinedOutputResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentCombinedOutputResources(int value) { maxFragmentCombinedOutputResources(this.segment(), 0L, value); return this; }

    /// {@return `maxComputeSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxComputeSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxComputeSharedMemorySize.get().get(segment, 0L, index); }
    /// {@return `maxComputeSharedMemorySize`}
    public int maxComputeSharedMemorySize() { return maxComputeSharedMemorySize(this.segment(), 0L); }
    /// Sets `maxComputeSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxComputeSharedMemorySize(MemorySegment segment, long index, int value) { VH_maxComputeSharedMemorySize.get().set(segment, 0L, index, value); }
    /// Sets `maxComputeSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeSharedMemorySize(int value) { maxComputeSharedMemorySize(this.segment(), 0L, value); return this; }

    /// {@return `maxComputeWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxComputeWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupCount, index), LAYOUT_maxComputeWorkGroupCount); }
    /// {@return `maxComputeWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxComputeWorkGroupCount(MemorySegment segment, long index, long index0) { return (int) VH_maxComputeWorkGroupCount.get().get(segment, 0L, index, index0); }
    /// {@return `maxComputeWorkGroupCount`}
    public MemorySegment maxComputeWorkGroupCount() { return maxComputeWorkGroupCount(this.segment(), 0L); }
    /// {@return `maxComputeWorkGroupCount`}
    /// @param index0 the Index 0 of the array
    public int maxComputeWorkGroupCount(long index0) { return maxComputeWorkGroupCount(this.segment(), 0L, index0); }
    /// Sets `maxComputeWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxComputeWorkGroupCount(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxComputeWorkGroupCount, index), LAYOUT_maxComputeWorkGroupCount.byteSize()); }
    /// Sets `maxComputeWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxComputeWorkGroupCount(MemorySegment segment, long index, long index0, int value) { VH_maxComputeWorkGroupCount.get().set(segment, 0L, index, index0, value); }
    /// Sets `maxComputeWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupCount(MemorySegment value) { maxComputeWorkGroupCount(this.segment(), 0L, value); return this; }
    /// Sets `maxComputeWorkGroupCount` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupCount(long index0, int value) { maxComputeWorkGroupCount(this.segment(), 0L, index0, value); return this; }

    /// {@return `maxComputeWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxComputeWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxComputeWorkGroupInvocations.get().get(segment, 0L, index); }
    /// {@return `maxComputeWorkGroupInvocations`}
    public int maxComputeWorkGroupInvocations() { return maxComputeWorkGroupInvocations(this.segment(), 0L); }
    /// Sets `maxComputeWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxComputeWorkGroupInvocations(MemorySegment segment, long index, int value) { VH_maxComputeWorkGroupInvocations.get().set(segment, 0L, index, value); }
    /// Sets `maxComputeWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupInvocations(int value) { maxComputeWorkGroupInvocations(this.segment(), 0L, value); return this; }

    /// {@return `maxComputeWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxComputeWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupSize, index), LAYOUT_maxComputeWorkGroupSize); }
    /// {@return `maxComputeWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxComputeWorkGroupSize(MemorySegment segment, long index, long index0) { return (int) VH_maxComputeWorkGroupSize.get().get(segment, 0L, index, index0); }
    /// {@return `maxComputeWorkGroupSize`}
    public MemorySegment maxComputeWorkGroupSize() { return maxComputeWorkGroupSize(this.segment(), 0L); }
    /// {@return `maxComputeWorkGroupSize`}
    /// @param index0 the Index 0 of the array
    public int maxComputeWorkGroupSize(long index0) { return maxComputeWorkGroupSize(this.segment(), 0L, index0); }
    /// Sets `maxComputeWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxComputeWorkGroupSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxComputeWorkGroupSize, index), LAYOUT_maxComputeWorkGroupSize.byteSize()); }
    /// Sets `maxComputeWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxComputeWorkGroupSize(MemorySegment segment, long index, long index0, int value) { VH_maxComputeWorkGroupSize.get().set(segment, 0L, index, index0, value); }
    /// Sets `maxComputeWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupSize(MemorySegment value) { maxComputeWorkGroupSize(this.segment(), 0L, value); return this; }
    /// Sets `maxComputeWorkGroupSize` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupSize(long index0, int value) { maxComputeWorkGroupSize(this.segment(), 0L, index0, value); return this; }

    /// {@return `subPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_subPixelPrecisionBits.get().get(segment, 0L, index); }
    /// {@return `subPixelPrecisionBits`}
    public int subPixelPrecisionBits() { return subPixelPrecisionBits(this.segment(), 0L); }
    /// Sets `subPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subPixelPrecisionBits(MemorySegment segment, long index, int value) { VH_subPixelPrecisionBits.get().set(segment, 0L, index, value); }
    /// Sets `subPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subPixelPrecisionBits(int value) { subPixelPrecisionBits(this.segment(), 0L, value); return this; }

    /// {@return `subTexelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subTexelPrecisionBits(MemorySegment segment, long index) { return (int) VH_subTexelPrecisionBits.get().get(segment, 0L, index); }
    /// {@return `subTexelPrecisionBits`}
    public int subTexelPrecisionBits() { return subTexelPrecisionBits(this.segment(), 0L); }
    /// Sets `subTexelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subTexelPrecisionBits(MemorySegment segment, long index, int value) { VH_subTexelPrecisionBits.get().set(segment, 0L, index, value); }
    /// Sets `subTexelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subTexelPrecisionBits(int value) { subTexelPrecisionBits(this.segment(), 0L, value); return this; }

    /// {@return `mipmapPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mipmapPrecisionBits(MemorySegment segment, long index) { return (int) VH_mipmapPrecisionBits.get().get(segment, 0L, index); }
    /// {@return `mipmapPrecisionBits`}
    public int mipmapPrecisionBits() { return mipmapPrecisionBits(this.segment(), 0L); }
    /// Sets `mipmapPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mipmapPrecisionBits(MemorySegment segment, long index, int value) { VH_mipmapPrecisionBits.get().set(segment, 0L, index, value); }
    /// Sets `mipmapPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits mipmapPrecisionBits(int value) { mipmapPrecisionBits(this.segment(), 0L, value); return this; }

    /// {@return `maxDrawIndexedIndexValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDrawIndexedIndexValue(MemorySegment segment, long index) { return (int) VH_maxDrawIndexedIndexValue.get().get(segment, 0L, index); }
    /// {@return `maxDrawIndexedIndexValue`}
    public int maxDrawIndexedIndexValue() { return maxDrawIndexedIndexValue(this.segment(), 0L); }
    /// Sets `maxDrawIndexedIndexValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDrawIndexedIndexValue(MemorySegment segment, long index, int value) { VH_maxDrawIndexedIndexValue.get().set(segment, 0L, index, value); }
    /// Sets `maxDrawIndexedIndexValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDrawIndexedIndexValue(int value) { maxDrawIndexedIndexValue(this.segment(), 0L, value); return this; }

    /// {@return `maxDrawIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxDrawIndirectCount(MemorySegment segment, long index) { return (int) VH_maxDrawIndirectCount.get().get(segment, 0L, index); }
    /// {@return `maxDrawIndirectCount`}
    public int maxDrawIndirectCount() { return maxDrawIndirectCount(this.segment(), 0L); }
    /// Sets `maxDrawIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxDrawIndirectCount(MemorySegment segment, long index, int value) { VH_maxDrawIndirectCount.get().set(segment, 0L, index, value); }
    /// Sets `maxDrawIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDrawIndirectCount(int value) { maxDrawIndirectCount(this.segment(), 0L, value); return this; }

    /// {@return `maxSamplerLodBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxSamplerLodBias(MemorySegment segment, long index) { return (float) VH_maxSamplerLodBias.get().get(segment, 0L, index); }
    /// {@return `maxSamplerLodBias`}
    public float maxSamplerLodBias() { return maxSamplerLodBias(this.segment(), 0L); }
    /// Sets `maxSamplerLodBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSamplerLodBias(MemorySegment segment, long index, float value) { VH_maxSamplerLodBias.get().set(segment, 0L, index, value); }
    /// Sets `maxSamplerLodBias` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerLodBias(float value) { maxSamplerLodBias(this.segment(), 0L, value); return this; }

    /// {@return `maxSamplerAnisotropy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxSamplerAnisotropy(MemorySegment segment, long index) { return (float) VH_maxSamplerAnisotropy.get().get(segment, 0L, index); }
    /// {@return `maxSamplerAnisotropy`}
    public float maxSamplerAnisotropy() { return maxSamplerAnisotropy(this.segment(), 0L); }
    /// Sets `maxSamplerAnisotropy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSamplerAnisotropy(MemorySegment segment, long index, float value) { VH_maxSamplerAnisotropy.get().set(segment, 0L, index, value); }
    /// Sets `maxSamplerAnisotropy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerAnisotropy(float value) { maxSamplerAnisotropy(this.segment(), 0L, value); return this; }

    /// {@return `maxViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxViewports(MemorySegment segment, long index) { return (int) VH_maxViewports.get().get(segment, 0L, index); }
    /// {@return `maxViewports`}
    public int maxViewports() { return maxViewports(this.segment(), 0L); }
    /// Sets `maxViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxViewports(MemorySegment segment, long index, int value) { VH_maxViewports.get().set(segment, 0L, index, value); }
    /// Sets `maxViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewports(int value) { maxViewports(this.segment(), 0L, value); return this; }

    /// {@return `maxViewportDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxViewportDimensions(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxViewportDimensions, index), LAYOUT_maxViewportDimensions); }
    /// {@return `maxViewportDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int maxViewportDimensions(MemorySegment segment, long index, long index0) { return (int) VH_maxViewportDimensions.get().get(segment, 0L, index, index0); }
    /// {@return `maxViewportDimensions`}
    public MemorySegment maxViewportDimensions() { return maxViewportDimensions(this.segment(), 0L); }
    /// {@return `maxViewportDimensions`}
    /// @param index0 the Index 0 of the array
    public int maxViewportDimensions(long index0) { return maxViewportDimensions(this.segment(), 0L, index0); }
    /// Sets `maxViewportDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxViewportDimensions(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxViewportDimensions, index), LAYOUT_maxViewportDimensions.byteSize()); }
    /// Sets `maxViewportDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void maxViewportDimensions(MemorySegment segment, long index, long index0, int value) { VH_maxViewportDimensions.get().set(segment, 0L, index, index0, value); }
    /// Sets `maxViewportDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewportDimensions(MemorySegment value) { maxViewportDimensions(this.segment(), 0L, value); return this; }
    /// Sets `maxViewportDimensions` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewportDimensions(long index0, int value) { maxViewportDimensions(this.segment(), 0L, index0, value); return this; }

    /// {@return `viewportBoundsRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment viewportBoundsRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_viewportBoundsRange, index), LAYOUT_viewportBoundsRange); }
    /// {@return `viewportBoundsRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float viewportBoundsRange(MemorySegment segment, long index, long index0) { return (float) VH_viewportBoundsRange.get().get(segment, 0L, index, index0); }
    /// {@return `viewportBoundsRange`}
    public MemorySegment viewportBoundsRange() { return viewportBoundsRange(this.segment(), 0L); }
    /// {@return `viewportBoundsRange`}
    /// @param index0 the Index 0 of the array
    public float viewportBoundsRange(long index0) { return viewportBoundsRange(this.segment(), 0L, index0); }
    /// Sets `viewportBoundsRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportBoundsRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_viewportBoundsRange, index), LAYOUT_viewportBoundsRange.byteSize()); }
    /// Sets `viewportBoundsRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void viewportBoundsRange(MemorySegment segment, long index, long index0, float value) { VH_viewportBoundsRange.get().set(segment, 0L, index, index0, value); }
    /// Sets `viewportBoundsRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportBoundsRange(MemorySegment value) { viewportBoundsRange(this.segment(), 0L, value); return this; }
    /// Sets `viewportBoundsRange` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportBoundsRange(long index0, float value) { viewportBoundsRange(this.segment(), 0L, index0, value); return this; }

    /// {@return `viewportSubPixelBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int viewportSubPixelBits(MemorySegment segment, long index) { return (int) VH_viewportSubPixelBits.get().get(segment, 0L, index); }
    /// {@return `viewportSubPixelBits`}
    public int viewportSubPixelBits() { return viewportSubPixelBits(this.segment(), 0L); }
    /// Sets `viewportSubPixelBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void viewportSubPixelBits(MemorySegment segment, long index, int value) { VH_viewportSubPixelBits.get().set(segment, 0L, index, value); }
    /// Sets `viewportSubPixelBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportSubPixelBits(int value) { viewportSubPixelBits(this.segment(), 0L, value); return this; }

    /// {@return `minMemoryMapAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minMemoryMapAlignment(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_minMemoryMapAlignment.get().get(segment, 0L, index)); }
    /// {@return `minMemoryMapAlignment`}
    public long minMemoryMapAlignment() { return minMemoryMapAlignment(this.segment(), 0L); }
    /// Sets `minMemoryMapAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minMemoryMapAlignment(MemorySegment segment, long index, long value) { VH_minMemoryMapAlignment.get().set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `minMemoryMapAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minMemoryMapAlignment(long value) { minMemoryMapAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minTexelBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minTexelBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minTexelBufferOffsetAlignment.get().get(segment, 0L, index); }
    /// {@return `minTexelBufferOffsetAlignment`}
    public long minTexelBufferOffsetAlignment() { return minTexelBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minTexelBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minTexelBufferOffsetAlignment(MemorySegment segment, long index, long value) { VH_minTexelBufferOffsetAlignment.get().set(segment, 0L, index, value); }
    /// Sets `minTexelBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelBufferOffsetAlignment(long value) { minTexelBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minUniformBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minUniformBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minUniformBufferOffsetAlignment.get().get(segment, 0L, index); }
    /// {@return `minUniformBufferOffsetAlignment`}
    public long minUniformBufferOffsetAlignment() { return minUniformBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minUniformBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minUniformBufferOffsetAlignment(MemorySegment segment, long index, long value) { VH_minUniformBufferOffsetAlignment.get().set(segment, 0L, index, value); }
    /// Sets `minUniformBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minUniformBufferOffsetAlignment(long value) { minUniformBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minStorageBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long minStorageBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minStorageBufferOffsetAlignment.get().get(segment, 0L, index); }
    /// {@return `minStorageBufferOffsetAlignment`}
    public long minStorageBufferOffsetAlignment() { return minStorageBufferOffsetAlignment(this.segment(), 0L); }
    /// Sets `minStorageBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minStorageBufferOffsetAlignment(MemorySegment segment, long index, long value) { VH_minStorageBufferOffsetAlignment.get().set(segment, 0L, index, value); }
    /// Sets `minStorageBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minStorageBufferOffsetAlignment(long value) { minStorageBufferOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `minTexelOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minTexelOffset(MemorySegment segment, long index) { return (int) VH_minTexelOffset.get().get(segment, 0L, index); }
    /// {@return `minTexelOffset`}
    public int minTexelOffset() { return minTexelOffset(this.segment(), 0L); }
    /// Sets `minTexelOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minTexelOffset(MemorySegment segment, long index, int value) { VH_minTexelOffset.get().set(segment, 0L, index, value); }
    /// Sets `minTexelOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelOffset(int value) { minTexelOffset(this.segment(), 0L, value); return this; }

    /// {@return `maxTexelOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTexelOffset(MemorySegment segment, long index) { return (int) VH_maxTexelOffset.get().get(segment, 0L, index); }
    /// {@return `maxTexelOffset`}
    public int maxTexelOffset() { return maxTexelOffset(this.segment(), 0L); }
    /// Sets `maxTexelOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTexelOffset(MemorySegment segment, long index, int value) { VH_maxTexelOffset.get().set(segment, 0L, index, value); }
    /// Sets `maxTexelOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelOffset(int value) { maxTexelOffset(this.segment(), 0L, value); return this; }

    /// {@return `minTexelGatherOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minTexelGatherOffset(MemorySegment segment, long index) { return (int) VH_minTexelGatherOffset.get().get(segment, 0L, index); }
    /// {@return `minTexelGatherOffset`}
    public int minTexelGatherOffset() { return minTexelGatherOffset(this.segment(), 0L); }
    /// Sets `minTexelGatherOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minTexelGatherOffset(MemorySegment segment, long index, int value) { VH_minTexelGatherOffset.get().set(segment, 0L, index, value); }
    /// Sets `minTexelGatherOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelGatherOffset(int value) { minTexelGatherOffset(this.segment(), 0L, value); return this; }

    /// {@return `maxTexelGatherOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTexelGatherOffset(MemorySegment segment, long index) { return (int) VH_maxTexelGatherOffset.get().get(segment, 0L, index); }
    /// {@return `maxTexelGatherOffset`}
    public int maxTexelGatherOffset() { return maxTexelGatherOffset(this.segment(), 0L); }
    /// Sets `maxTexelGatherOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTexelGatherOffset(MemorySegment segment, long index, int value) { VH_maxTexelGatherOffset.get().set(segment, 0L, index, value); }
    /// Sets `maxTexelGatherOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelGatherOffset(int value) { maxTexelGatherOffset(this.segment(), 0L, value); return this; }

    /// {@return `minInterpolationOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float minInterpolationOffset(MemorySegment segment, long index) { return (float) VH_minInterpolationOffset.get().get(segment, 0L, index); }
    /// {@return `minInterpolationOffset`}
    public float minInterpolationOffset() { return minInterpolationOffset(this.segment(), 0L); }
    /// Sets `minInterpolationOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minInterpolationOffset(MemorySegment segment, long index, float value) { VH_minInterpolationOffset.get().set(segment, 0L, index, value); }
    /// Sets `minInterpolationOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minInterpolationOffset(float value) { minInterpolationOffset(this.segment(), 0L, value); return this; }

    /// {@return `maxInterpolationOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float maxInterpolationOffset(MemorySegment segment, long index) { return (float) VH_maxInterpolationOffset.get().get(segment, 0L, index); }
    /// {@return `maxInterpolationOffset`}
    public float maxInterpolationOffset() { return maxInterpolationOffset(this.segment(), 0L); }
    /// Sets `maxInterpolationOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxInterpolationOffset(MemorySegment segment, long index, float value) { VH_maxInterpolationOffset.get().set(segment, 0L, index, value); }
    /// Sets `maxInterpolationOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxInterpolationOffset(float value) { maxInterpolationOffset(this.segment(), 0L, value); return this; }

    /// {@return `subPixelInterpolationOffsetBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subPixelInterpolationOffsetBits(MemorySegment segment, long index) { return (int) VH_subPixelInterpolationOffsetBits.get().get(segment, 0L, index); }
    /// {@return `subPixelInterpolationOffsetBits`}
    public int subPixelInterpolationOffsetBits() { return subPixelInterpolationOffsetBits(this.segment(), 0L); }
    /// Sets `subPixelInterpolationOffsetBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subPixelInterpolationOffsetBits(MemorySegment segment, long index, int value) { VH_subPixelInterpolationOffsetBits.get().set(segment, 0L, index, value); }
    /// Sets `subPixelInterpolationOffsetBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subPixelInterpolationOffsetBits(int value) { subPixelInterpolationOffsetBits(this.segment(), 0L, value); return this; }

    /// {@return `maxFramebufferWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFramebufferWidth(MemorySegment segment, long index) { return (int) VH_maxFramebufferWidth.get().get(segment, 0L, index); }
    /// {@return `maxFramebufferWidth`}
    public int maxFramebufferWidth() { return maxFramebufferWidth(this.segment(), 0L); }
    /// Sets `maxFramebufferWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFramebufferWidth(MemorySegment segment, long index, int value) { VH_maxFramebufferWidth.get().set(segment, 0L, index, value); }
    /// Sets `maxFramebufferWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferWidth(int value) { maxFramebufferWidth(this.segment(), 0L, value); return this; }

    /// {@return `maxFramebufferHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFramebufferHeight(MemorySegment segment, long index) { return (int) VH_maxFramebufferHeight.get().get(segment, 0L, index); }
    /// {@return `maxFramebufferHeight`}
    public int maxFramebufferHeight() { return maxFramebufferHeight(this.segment(), 0L); }
    /// Sets `maxFramebufferHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFramebufferHeight(MemorySegment segment, long index, int value) { VH_maxFramebufferHeight.get().set(segment, 0L, index, value); }
    /// Sets `maxFramebufferHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferHeight(int value) { maxFramebufferHeight(this.segment(), 0L, value); return this; }

    /// {@return `maxFramebufferLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxFramebufferLayers(MemorySegment segment, long index) { return (int) VH_maxFramebufferLayers.get().get(segment, 0L, index); }
    /// {@return `maxFramebufferLayers`}
    public int maxFramebufferLayers() { return maxFramebufferLayers(this.segment(), 0L); }
    /// Sets `maxFramebufferLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFramebufferLayers(MemorySegment segment, long index, int value) { VH_maxFramebufferLayers.get().set(segment, 0L, index, value); }
    /// Sets `maxFramebufferLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferLayers(int value) { maxFramebufferLayers(this.segment(), 0L, value); return this; }

    /// {@return `framebufferColorSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framebufferColorSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferColorSampleCounts.get().get(segment, 0L, index); }
    /// {@return `framebufferColorSampleCounts`}
    public int framebufferColorSampleCounts() { return framebufferColorSampleCounts(this.segment(), 0L); }
    /// Sets `framebufferColorSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebufferColorSampleCounts(MemorySegment segment, long index, int value) { VH_framebufferColorSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `framebufferColorSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferColorSampleCounts(int value) { framebufferColorSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `framebufferDepthSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framebufferDepthSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferDepthSampleCounts.get().get(segment, 0L, index); }
    /// {@return `framebufferDepthSampleCounts`}
    public int framebufferDepthSampleCounts() { return framebufferDepthSampleCounts(this.segment(), 0L); }
    /// Sets `framebufferDepthSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebufferDepthSampleCounts(MemorySegment segment, long index, int value) { VH_framebufferDepthSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `framebufferDepthSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferDepthSampleCounts(int value) { framebufferDepthSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `framebufferStencilSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framebufferStencilSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferStencilSampleCounts.get().get(segment, 0L, index); }
    /// {@return `framebufferStencilSampleCounts`}
    public int framebufferStencilSampleCounts() { return framebufferStencilSampleCounts(this.segment(), 0L); }
    /// Sets `framebufferStencilSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebufferStencilSampleCounts(MemorySegment segment, long index, int value) { VH_framebufferStencilSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `framebufferStencilSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferStencilSampleCounts(int value) { framebufferStencilSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `framebufferNoAttachmentsSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framebufferNoAttachmentsSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferNoAttachmentsSampleCounts.get().get(segment, 0L, index); }
    /// {@return `framebufferNoAttachmentsSampleCounts`}
    public int framebufferNoAttachmentsSampleCounts() { return framebufferNoAttachmentsSampleCounts(this.segment(), 0L); }
    /// Sets `framebufferNoAttachmentsSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebufferNoAttachmentsSampleCounts(MemorySegment segment, long index, int value) { VH_framebufferNoAttachmentsSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `framebufferNoAttachmentsSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCounts(int value) { framebufferNoAttachmentsSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `maxColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxColorAttachments(MemorySegment segment, long index) { return (int) VH_maxColorAttachments.get().get(segment, 0L, index); }
    /// {@return `maxColorAttachments`}
    public int maxColorAttachments() { return maxColorAttachments(this.segment(), 0L); }
    /// Sets `maxColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxColorAttachments(MemorySegment segment, long index, int value) { VH_maxColorAttachments.get().set(segment, 0L, index, value); }
    /// Sets `maxColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxColorAttachments(int value) { maxColorAttachments(this.segment(), 0L, value); return this; }

    /// {@return `sampledImageColorSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampledImageColorSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageColorSampleCounts.get().get(segment, 0L, index); }
    /// {@return `sampledImageColorSampleCounts`}
    public int sampledImageColorSampleCounts() { return sampledImageColorSampleCounts(this.segment(), 0L); }
    /// Sets `sampledImageColorSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampledImageColorSampleCounts(MemorySegment segment, long index, int value) { VH_sampledImageColorSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `sampledImageColorSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageColorSampleCounts(int value) { sampledImageColorSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `sampledImageIntegerSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampledImageIntegerSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageIntegerSampleCounts.get().get(segment, 0L, index); }
    /// {@return `sampledImageIntegerSampleCounts`}
    public int sampledImageIntegerSampleCounts() { return sampledImageIntegerSampleCounts(this.segment(), 0L); }
    /// Sets `sampledImageIntegerSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampledImageIntegerSampleCounts(MemorySegment segment, long index, int value) { VH_sampledImageIntegerSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `sampledImageIntegerSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageIntegerSampleCounts(int value) { sampledImageIntegerSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `sampledImageDepthSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampledImageDepthSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageDepthSampleCounts.get().get(segment, 0L, index); }
    /// {@return `sampledImageDepthSampleCounts`}
    public int sampledImageDepthSampleCounts() { return sampledImageDepthSampleCounts(this.segment(), 0L); }
    /// Sets `sampledImageDepthSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampledImageDepthSampleCounts(MemorySegment segment, long index, int value) { VH_sampledImageDepthSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `sampledImageDepthSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageDepthSampleCounts(int value) { sampledImageDepthSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `sampledImageStencilSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sampledImageStencilSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageStencilSampleCounts.get().get(segment, 0L, index); }
    /// {@return `sampledImageStencilSampleCounts`}
    public int sampledImageStencilSampleCounts() { return sampledImageStencilSampleCounts(this.segment(), 0L); }
    /// Sets `sampledImageStencilSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sampledImageStencilSampleCounts(MemorySegment segment, long index, int value) { VH_sampledImageStencilSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `sampledImageStencilSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageStencilSampleCounts(int value) { sampledImageStencilSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `storageImageSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int storageImageSampleCounts(MemorySegment segment, long index) { return (int) VH_storageImageSampleCounts.get().get(segment, 0L, index); }
    /// {@return `storageImageSampleCounts`}
    public int storageImageSampleCounts() { return storageImageSampleCounts(this.segment(), 0L); }
    /// Sets `storageImageSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void storageImageSampleCounts(MemorySegment segment, long index, int value) { VH_storageImageSampleCounts.get().set(segment, 0L, index, value); }
    /// Sets `storageImageSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits storageImageSampleCounts(int value) { storageImageSampleCounts(this.segment(), 0L, value); return this; }

    /// {@return `maxSampleMaskWords` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxSampleMaskWords(MemorySegment segment, long index) { return (int) VH_maxSampleMaskWords.get().get(segment, 0L, index); }
    /// {@return `maxSampleMaskWords`}
    public int maxSampleMaskWords() { return maxSampleMaskWords(this.segment(), 0L); }
    /// Sets `maxSampleMaskWords` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxSampleMaskWords(MemorySegment segment, long index, int value) { VH_maxSampleMaskWords.get().set(segment, 0L, index, value); }
    /// Sets `maxSampleMaskWords` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSampleMaskWords(int value) { maxSampleMaskWords(this.segment(), 0L, value); return this; }

    /// {@return `timestampComputeAndGraphics` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int timestampComputeAndGraphics(MemorySegment segment, long index) { return (int) VH_timestampComputeAndGraphics.get().get(segment, 0L, index); }
    /// {@return `timestampComputeAndGraphics`}
    public int timestampComputeAndGraphics() { return timestampComputeAndGraphics(this.segment(), 0L); }
    /// Sets `timestampComputeAndGraphics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timestampComputeAndGraphics(MemorySegment segment, long index, int value) { VH_timestampComputeAndGraphics.get().set(segment, 0L, index, value); }
    /// Sets `timestampComputeAndGraphics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits timestampComputeAndGraphics(int value) { timestampComputeAndGraphics(this.segment(), 0L, value); return this; }

    /// {@return `timestampPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float timestampPeriod(MemorySegment segment, long index) { return (float) VH_timestampPeriod.get().get(segment, 0L, index); }
    /// {@return `timestampPeriod`}
    public float timestampPeriod() { return timestampPeriod(this.segment(), 0L); }
    /// Sets `timestampPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timestampPeriod(MemorySegment segment, long index, float value) { VH_timestampPeriod.get().set(segment, 0L, index, value); }
    /// Sets `timestampPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits timestampPeriod(float value) { timestampPeriod(this.segment(), 0L, value); return this; }

    /// {@return `maxClipDistances` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxClipDistances(MemorySegment segment, long index) { return (int) VH_maxClipDistances.get().get(segment, 0L, index); }
    /// {@return `maxClipDistances`}
    public int maxClipDistances() { return maxClipDistances(this.segment(), 0L); }
    /// Sets `maxClipDistances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxClipDistances(MemorySegment segment, long index, int value) { VH_maxClipDistances.get().set(segment, 0L, index, value); }
    /// Sets `maxClipDistances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxClipDistances(int value) { maxClipDistances(this.segment(), 0L, value); return this; }

    /// {@return `maxCullDistances` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCullDistances(MemorySegment segment, long index) { return (int) VH_maxCullDistances.get().get(segment, 0L, index); }
    /// {@return `maxCullDistances`}
    public int maxCullDistances() { return maxCullDistances(this.segment(), 0L); }
    /// Sets `maxCullDistances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCullDistances(MemorySegment segment, long index, int value) { VH_maxCullDistances.get().set(segment, 0L, index, value); }
    /// Sets `maxCullDistances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxCullDistances(int value) { maxCullDistances(this.segment(), 0L, value); return this; }

    /// {@return `maxCombinedClipAndCullDistances` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCombinedClipAndCullDistances(MemorySegment segment, long index) { return (int) VH_maxCombinedClipAndCullDistances.get().get(segment, 0L, index); }
    /// {@return `maxCombinedClipAndCullDistances`}
    public int maxCombinedClipAndCullDistances() { return maxCombinedClipAndCullDistances(this.segment(), 0L); }
    /// Sets `maxCombinedClipAndCullDistances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCombinedClipAndCullDistances(MemorySegment segment, long index, int value) { VH_maxCombinedClipAndCullDistances.get().set(segment, 0L, index, value); }
    /// Sets `maxCombinedClipAndCullDistances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxCombinedClipAndCullDistances(int value) { maxCombinedClipAndCullDistances(this.segment(), 0L, value); return this; }

    /// {@return `discreteQueuePriorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int discreteQueuePriorities(MemorySegment segment, long index) { return (int) VH_discreteQueuePriorities.get().get(segment, 0L, index); }
    /// {@return `discreteQueuePriorities`}
    public int discreteQueuePriorities() { return discreteQueuePriorities(this.segment(), 0L); }
    /// Sets `discreteQueuePriorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void discreteQueuePriorities(MemorySegment segment, long index, int value) { VH_discreteQueuePriorities.get().set(segment, 0L, index, value); }
    /// Sets `discreteQueuePriorities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits discreteQueuePriorities(int value) { discreteQueuePriorities(this.segment(), 0L, value); return this; }

    /// {@return `pointSizeRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pointSizeRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pointSizeRange, index), LAYOUT_pointSizeRange); }
    /// {@return `pointSizeRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float pointSizeRange(MemorySegment segment, long index, long index0) { return (float) VH_pointSizeRange.get().get(segment, 0L, index, index0); }
    /// {@return `pointSizeRange`}
    public MemorySegment pointSizeRange() { return pointSizeRange(this.segment(), 0L); }
    /// {@return `pointSizeRange`}
    /// @param index0 the Index 0 of the array
    public float pointSizeRange(long index0) { return pointSizeRange(this.segment(), 0L, index0); }
    /// Sets `pointSizeRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pointSizeRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pointSizeRange, index), LAYOUT_pointSizeRange.byteSize()); }
    /// Sets `pointSizeRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void pointSizeRange(MemorySegment segment, long index, long index0, float value) { VH_pointSizeRange.get().set(segment, 0L, index, index0, value); }
    /// Sets `pointSizeRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeRange(MemorySegment value) { pointSizeRange(this.segment(), 0L, value); return this; }
    /// Sets `pointSizeRange` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeRange(long index0, float value) { pointSizeRange(this.segment(), 0L, index0, value); return this; }

    /// {@return `lineWidthRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment lineWidthRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_lineWidthRange, index), LAYOUT_lineWidthRange); }
    /// {@return `lineWidthRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static float lineWidthRange(MemorySegment segment, long index, long index0) { return (float) VH_lineWidthRange.get().get(segment, 0L, index, index0); }
    /// {@return `lineWidthRange`}
    public MemorySegment lineWidthRange() { return lineWidthRange(this.segment(), 0L); }
    /// {@return `lineWidthRange`}
    /// @param index0 the Index 0 of the array
    public float lineWidthRange(long index0) { return lineWidthRange(this.segment(), 0L, index0); }
    /// Sets `lineWidthRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineWidthRange(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_lineWidthRange, index), LAYOUT_lineWidthRange.byteSize()); }
    /// Sets `lineWidthRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void lineWidthRange(MemorySegment segment, long index, long index0, float value) { VH_lineWidthRange.get().set(segment, 0L, index, index0, value); }
    /// Sets `lineWidthRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthRange(MemorySegment value) { lineWidthRange(this.segment(), 0L, value); return this; }
    /// Sets `lineWidthRange` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthRange(long index0, float value) { lineWidthRange(this.segment(), 0L, index0, value); return this; }

    /// {@return `pointSizeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float pointSizeGranularity(MemorySegment segment, long index) { return (float) VH_pointSizeGranularity.get().get(segment, 0L, index); }
    /// {@return `pointSizeGranularity`}
    public float pointSizeGranularity() { return pointSizeGranularity(this.segment(), 0L); }
    /// Sets `pointSizeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pointSizeGranularity(MemorySegment segment, long index, float value) { VH_pointSizeGranularity.get().set(segment, 0L, index, value); }
    /// Sets `pointSizeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeGranularity(float value) { pointSizeGranularity(this.segment(), 0L, value); return this; }

    /// {@return `lineWidthGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float lineWidthGranularity(MemorySegment segment, long index) { return (float) VH_lineWidthGranularity.get().get(segment, 0L, index); }
    /// {@return `lineWidthGranularity`}
    public float lineWidthGranularity() { return lineWidthGranularity(this.segment(), 0L); }
    /// Sets `lineWidthGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineWidthGranularity(MemorySegment segment, long index, float value) { VH_lineWidthGranularity.get().set(segment, 0L, index, value); }
    /// Sets `lineWidthGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthGranularity(float value) { lineWidthGranularity(this.segment(), 0L, value); return this; }

    /// {@return `strictLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int strictLines(MemorySegment segment, long index) { return (int) VH_strictLines.get().get(segment, 0L, index); }
    /// {@return `strictLines`}
    public int strictLines() { return strictLines(this.segment(), 0L); }
    /// Sets `strictLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void strictLines(MemorySegment segment, long index, int value) { VH_strictLines.get().set(segment, 0L, index, value); }
    /// Sets `strictLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits strictLines(int value) { strictLines(this.segment(), 0L, value); return this; }

    /// {@return `standardSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int standardSampleLocations(MemorySegment segment, long index) { return (int) VH_standardSampleLocations.get().get(segment, 0L, index); }
    /// {@return `standardSampleLocations`}
    public int standardSampleLocations() { return standardSampleLocations(this.segment(), 0L); }
    /// Sets `standardSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void standardSampleLocations(MemorySegment segment, long index, int value) { VH_standardSampleLocations.get().set(segment, 0L, index, value); }
    /// Sets `standardSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits standardSampleLocations(int value) { standardSampleLocations(this.segment(), 0L, value); return this; }

    /// {@return `optimalBufferCopyOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long optimalBufferCopyOffsetAlignment(MemorySegment segment, long index) { return (long) VH_optimalBufferCopyOffsetAlignment.get().get(segment, 0L, index); }
    /// {@return `optimalBufferCopyOffsetAlignment`}
    public long optimalBufferCopyOffsetAlignment() { return optimalBufferCopyOffsetAlignment(this.segment(), 0L); }
    /// Sets `optimalBufferCopyOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalBufferCopyOffsetAlignment(MemorySegment segment, long index, long value) { VH_optimalBufferCopyOffsetAlignment.get().set(segment, 0L, index, value); }
    /// Sets `optimalBufferCopyOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignment(long value) { optimalBufferCopyOffsetAlignment(this.segment(), 0L, value); return this; }

    /// {@return `optimalBufferCopyRowPitchAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long optimalBufferCopyRowPitchAlignment(MemorySegment segment, long index) { return (long) VH_optimalBufferCopyRowPitchAlignment.get().get(segment, 0L, index); }
    /// {@return `optimalBufferCopyRowPitchAlignment`}
    public long optimalBufferCopyRowPitchAlignment() { return optimalBufferCopyRowPitchAlignment(this.segment(), 0L); }
    /// Sets `optimalBufferCopyRowPitchAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalBufferCopyRowPitchAlignment(MemorySegment segment, long index, long value) { VH_optimalBufferCopyRowPitchAlignment.get().set(segment, 0L, index, value); }
    /// Sets `optimalBufferCopyRowPitchAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignment(long value) { optimalBufferCopyRowPitchAlignment(this.segment(), 0L, value); return this; }

    /// {@return `nonCoherentAtomSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long nonCoherentAtomSize(MemorySegment segment, long index) { return (long) VH_nonCoherentAtomSize.get().get(segment, 0L, index); }
    /// {@return `nonCoherentAtomSize`}
    public long nonCoherentAtomSize() { return nonCoherentAtomSize(this.segment(), 0L); }
    /// Sets `nonCoherentAtomSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nonCoherentAtomSize(MemorySegment segment, long index, long value) { VH_nonCoherentAtomSize.get().set(segment, 0L, index, value); }
    /// Sets `nonCoherentAtomSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits nonCoherentAtomSize(long value) { nonCoherentAtomSize(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceLimits`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceLimits`
    public VkPhysicalDeviceLimits asSlice(long index) { return new VkPhysicalDeviceLimits(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceLimits`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceLimits`
    public VkPhysicalDeviceLimits asSlice(long index, long count) { return new VkPhysicalDeviceLimits(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceLimits` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceLimits at(long index, Consumer<VkPhysicalDeviceLimits> func) { func.accept(asSlice(index)); return this; }

    /// {@return `maxImageDimension1D` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageDimension1DAt(long index) { return maxImageDimension1D(this.segment(), index); }
    /// Sets `maxImageDimension1D` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension1DAt(long index, int value) { maxImageDimension1D(this.segment(), index, value); return this; }

    /// {@return `maxImageDimension2D` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageDimension2DAt(long index) { return maxImageDimension2D(this.segment(), index); }
    /// Sets `maxImageDimension2D` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension2DAt(long index, int value) { maxImageDimension2D(this.segment(), index, value); return this; }

    /// {@return `maxImageDimension3D` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageDimension3DAt(long index) { return maxImageDimension3D(this.segment(), index); }
    /// Sets `maxImageDimension3D` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension3DAt(long index, int value) { maxImageDimension3D(this.segment(), index, value); return this; }

    /// {@return `maxImageDimensionCube` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageDimensionCubeAt(long index) { return maxImageDimensionCube(this.segment(), index); }
    /// Sets `maxImageDimensionCube` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimensionCubeAt(long index, int value) { maxImageDimensionCube(this.segment(), index, value); return this; }

    /// {@return `maxImageArrayLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageArrayLayersAt(long index) { return maxImageArrayLayers(this.segment(), index); }
    /// Sets `maxImageArrayLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageArrayLayersAt(long index, int value) { maxImageArrayLayers(this.segment(), index, value); return this; }

    /// {@return `maxTexelBufferElements` at the given index}
    /// @param index the index of the struct buffer
    public int maxTexelBufferElementsAt(long index) { return maxTexelBufferElements(this.segment(), index); }
    /// Sets `maxTexelBufferElements` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelBufferElementsAt(long index, int value) { maxTexelBufferElements(this.segment(), index, value); return this; }

    /// {@return `maxUniformBufferRange` at the given index}
    /// @param index the index of the struct buffer
    public int maxUniformBufferRangeAt(long index) { return maxUniformBufferRange(this.segment(), index); }
    /// Sets `maxUniformBufferRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxUniformBufferRangeAt(long index, int value) { maxUniformBufferRange(this.segment(), index, value); return this; }

    /// {@return `maxStorageBufferRange` at the given index}
    /// @param index the index of the struct buffer
    public int maxStorageBufferRangeAt(long index) { return maxStorageBufferRange(this.segment(), index); }
    /// Sets `maxStorageBufferRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxStorageBufferRangeAt(long index, int value) { maxStorageBufferRange(this.segment(), index, value); return this; }

    /// {@return `maxPushConstantsSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxPushConstantsSizeAt(long index) { return maxPushConstantsSize(this.segment(), index); }
    /// Sets `maxPushConstantsSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPushConstantsSizeAt(long index, int value) { maxPushConstantsSize(this.segment(), index, value); return this; }

    /// {@return `maxMemoryAllocationCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxMemoryAllocationCountAt(long index) { return maxMemoryAllocationCount(this.segment(), index); }
    /// Sets `maxMemoryAllocationCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxMemoryAllocationCountAt(long index, int value) { maxMemoryAllocationCount(this.segment(), index, value); return this; }

    /// {@return `maxSamplerAllocationCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxSamplerAllocationCountAt(long index) { return maxSamplerAllocationCount(this.segment(), index); }
    /// Sets `maxSamplerAllocationCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerAllocationCountAt(long index, int value) { maxSamplerAllocationCount(this.segment(), index, value); return this; }

    /// {@return `bufferImageGranularity` at the given index}
    /// @param index the index of the struct buffer
    public long bufferImageGranularityAt(long index) { return bufferImageGranularity(this.segment(), index); }
    /// Sets `bufferImageGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits bufferImageGranularityAt(long index, long value) { bufferImageGranularity(this.segment(), index, value); return this; }

    /// {@return `sparseAddressSpaceSize` at the given index}
    /// @param index the index of the struct buffer
    public long sparseAddressSpaceSizeAt(long index) { return sparseAddressSpaceSize(this.segment(), index); }
    /// Sets `sparseAddressSpaceSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sparseAddressSpaceSizeAt(long index, long value) { sparseAddressSpaceSize(this.segment(), index, value); return this; }

    /// {@return `maxBoundDescriptorSets` at the given index}
    /// @param index the index of the struct buffer
    public int maxBoundDescriptorSetsAt(long index) { return maxBoundDescriptorSets(this.segment(), index); }
    /// Sets `maxBoundDescriptorSets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxBoundDescriptorSetsAt(long index, int value) { maxBoundDescriptorSets(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorSamplers` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorSamplersAt(long index) { return maxPerStageDescriptorSamplers(this.segment(), index); }
    /// Sets `maxPerStageDescriptorSamplers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorSamplersAt(long index, int value) { maxPerStageDescriptorSamplers(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorUniformBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorUniformBuffersAt(long index) { return maxPerStageDescriptorUniformBuffers(this.segment(), index); }
    /// Sets `maxPerStageDescriptorUniformBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffersAt(long index, int value) { maxPerStageDescriptorUniformBuffers(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorStorageBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorStorageBuffersAt(long index) { return maxPerStageDescriptorStorageBuffers(this.segment(), index); }
    /// Sets `maxPerStageDescriptorStorageBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffersAt(long index, int value) { maxPerStageDescriptorStorageBuffers(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorSampledImages` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorSampledImagesAt(long index) { return maxPerStageDescriptorSampledImages(this.segment(), index); }
    /// Sets `maxPerStageDescriptorSampledImages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImagesAt(long index, int value) { maxPerStageDescriptorSampledImages(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorStorageImages` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorStorageImagesAt(long index) { return maxPerStageDescriptorStorageImages(this.segment(), index); }
    /// Sets `maxPerStageDescriptorStorageImages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImagesAt(long index, int value) { maxPerStageDescriptorStorageImages(this.segment(), index, value); return this; }

    /// {@return `maxPerStageDescriptorInputAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageDescriptorInputAttachmentsAt(long index) { return maxPerStageDescriptorInputAttachments(this.segment(), index); }
    /// Sets `maxPerStageDescriptorInputAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachmentsAt(long index, int value) { maxPerStageDescriptorInputAttachments(this.segment(), index, value); return this; }

    /// {@return `maxPerStageResources` at the given index}
    /// @param index the index of the struct buffer
    public int maxPerStageResourcesAt(long index) { return maxPerStageResources(this.segment(), index); }
    /// Sets `maxPerStageResources` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageResourcesAt(long index, int value) { maxPerStageResources(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetSamplers` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetSamplersAt(long index) { return maxDescriptorSetSamplers(this.segment(), index); }
    /// Sets `maxDescriptorSetSamplers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetSamplersAt(long index, int value) { maxDescriptorSetSamplers(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUniformBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUniformBuffersAt(long index) { return maxDescriptorSetUniformBuffers(this.segment(), index); }
    /// Sets `maxDescriptorSetUniformBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersAt(long index, int value) { maxDescriptorSetUniformBuffers(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetUniformBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetUniformBuffersDynamicAt(long index) { return maxDescriptorSetUniformBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamicAt(long index, int value) { maxDescriptorSetUniformBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetStorageBuffers` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetStorageBuffersAt(long index) { return maxDescriptorSetStorageBuffers(this.segment(), index); }
    /// Sets `maxDescriptorSetStorageBuffers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersAt(long index, int value) { maxDescriptorSetStorageBuffers(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetStorageBuffersDynamic` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetStorageBuffersDynamicAt(long index) { return maxDescriptorSetStorageBuffersDynamic(this.segment(), index); }
    /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamicAt(long index, int value) { maxDescriptorSetStorageBuffersDynamic(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetSampledImages` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetSampledImagesAt(long index) { return maxDescriptorSetSampledImages(this.segment(), index); }
    /// Sets `maxDescriptorSetSampledImages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetSampledImagesAt(long index, int value) { maxDescriptorSetSampledImages(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetStorageImages` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetStorageImagesAt(long index) { return maxDescriptorSetStorageImages(this.segment(), index); }
    /// Sets `maxDescriptorSetStorageImages` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageImagesAt(long index, int value) { maxDescriptorSetStorageImages(this.segment(), index, value); return this; }

    /// {@return `maxDescriptorSetInputAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int maxDescriptorSetInputAttachmentsAt(long index) { return maxDescriptorSetInputAttachments(this.segment(), index); }
    /// Sets `maxDescriptorSetInputAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetInputAttachmentsAt(long index, int value) { maxDescriptorSetInputAttachments(this.segment(), index, value); return this; }

    /// {@return `maxVertexInputAttributes` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexInputAttributesAt(long index) { return maxVertexInputAttributes(this.segment(), index); }
    /// Sets `maxVertexInputAttributes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputAttributesAt(long index, int value) { maxVertexInputAttributes(this.segment(), index, value); return this; }

    /// {@return `maxVertexInputBindings` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexInputBindingsAt(long index) { return maxVertexInputBindings(this.segment(), index); }
    /// Sets `maxVertexInputBindings` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputBindingsAt(long index, int value) { maxVertexInputBindings(this.segment(), index, value); return this; }

    /// {@return `maxVertexInputAttributeOffset` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexInputAttributeOffsetAt(long index) { return maxVertexInputAttributeOffset(this.segment(), index); }
    /// Sets `maxVertexInputAttributeOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputAttributeOffsetAt(long index, int value) { maxVertexInputAttributeOffset(this.segment(), index, value); return this; }

    /// {@return `maxVertexInputBindingStride` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexInputBindingStrideAt(long index) { return maxVertexInputBindingStride(this.segment(), index); }
    /// Sets `maxVertexInputBindingStride` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputBindingStrideAt(long index, int value) { maxVertexInputBindingStride(this.segment(), index, value); return this; }

    /// {@return `maxVertexOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxVertexOutputComponentsAt(long index) { return maxVertexOutputComponents(this.segment(), index); }
    /// Sets `maxVertexOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexOutputComponentsAt(long index, int value) { maxVertexOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxTessellationGenerationLevel` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationGenerationLevelAt(long index) { return maxTessellationGenerationLevel(this.segment(), index); }
    /// Sets `maxTessellationGenerationLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationGenerationLevelAt(long index, int value) { maxTessellationGenerationLevel(this.segment(), index, value); return this; }

    /// {@return `maxTessellationPatchSize` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationPatchSizeAt(long index) { return maxTessellationPatchSize(this.segment(), index); }
    /// Sets `maxTessellationPatchSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationPatchSizeAt(long index, int value) { maxTessellationPatchSize(this.segment(), index, value); return this; }

    /// {@return `maxTessellationControlPerVertexInputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationControlPerVertexInputComponentsAt(long index) { return maxTessellationControlPerVertexInputComponents(this.segment(), index); }
    /// Sets `maxTessellationControlPerVertexInputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponentsAt(long index, int value) { maxTessellationControlPerVertexInputComponents(this.segment(), index, value); return this; }

    /// {@return `maxTessellationControlPerVertexOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationControlPerVertexOutputComponentsAt(long index) { return maxTessellationControlPerVertexOutputComponents(this.segment(), index); }
    /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponentsAt(long index, int value) { maxTessellationControlPerVertexOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxTessellationControlPerPatchOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationControlPerPatchOutputComponentsAt(long index) { return maxTessellationControlPerPatchOutputComponents(this.segment(), index); }
    /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponentsAt(long index, int value) { maxTessellationControlPerPatchOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxTessellationControlTotalOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationControlTotalOutputComponentsAt(long index) { return maxTessellationControlTotalOutputComponents(this.segment(), index); }
    /// Sets `maxTessellationControlTotalOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponentsAt(long index, int value) { maxTessellationControlTotalOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxTessellationEvaluationInputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationEvaluationInputComponentsAt(long index) { return maxTessellationEvaluationInputComponents(this.segment(), index); }
    /// Sets `maxTessellationEvaluationInputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponentsAt(long index, int value) { maxTessellationEvaluationInputComponents(this.segment(), index, value); return this; }

    /// {@return `maxTessellationEvaluationOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxTessellationEvaluationOutputComponentsAt(long index) { return maxTessellationEvaluationOutputComponents(this.segment(), index); }
    /// Sets `maxTessellationEvaluationOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponentsAt(long index, int value) { maxTessellationEvaluationOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxGeometryShaderInvocations` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryShaderInvocationsAt(long index) { return maxGeometryShaderInvocations(this.segment(), index); }
    /// Sets `maxGeometryShaderInvocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryShaderInvocationsAt(long index, int value) { maxGeometryShaderInvocations(this.segment(), index, value); return this; }

    /// {@return `maxGeometryInputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryInputComponentsAt(long index) { return maxGeometryInputComponents(this.segment(), index); }
    /// Sets `maxGeometryInputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryInputComponentsAt(long index, int value) { maxGeometryInputComponents(this.segment(), index, value); return this; }

    /// {@return `maxGeometryOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryOutputComponentsAt(long index) { return maxGeometryOutputComponents(this.segment(), index); }
    /// Sets `maxGeometryOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryOutputComponentsAt(long index, int value) { maxGeometryOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxGeometryOutputVertices` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryOutputVerticesAt(long index) { return maxGeometryOutputVertices(this.segment(), index); }
    /// Sets `maxGeometryOutputVertices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryOutputVerticesAt(long index, int value) { maxGeometryOutputVertices(this.segment(), index, value); return this; }

    /// {@return `maxGeometryTotalOutputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxGeometryTotalOutputComponentsAt(long index) { return maxGeometryTotalOutputComponents(this.segment(), index); }
    /// Sets `maxGeometryTotalOutputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryTotalOutputComponentsAt(long index, int value) { maxGeometryTotalOutputComponents(this.segment(), index, value); return this; }

    /// {@return `maxFragmentInputComponents` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentInputComponentsAt(long index) { return maxFragmentInputComponents(this.segment(), index); }
    /// Sets `maxFragmentInputComponents` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentInputComponentsAt(long index, int value) { maxFragmentInputComponents(this.segment(), index, value); return this; }

    /// {@return `maxFragmentOutputAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentOutputAttachmentsAt(long index) { return maxFragmentOutputAttachments(this.segment(), index); }
    /// Sets `maxFragmentOutputAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentOutputAttachmentsAt(long index, int value) { maxFragmentOutputAttachments(this.segment(), index, value); return this; }

    /// {@return `maxFragmentDualSrcAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentDualSrcAttachmentsAt(long index) { return maxFragmentDualSrcAttachments(this.segment(), index); }
    /// Sets `maxFragmentDualSrcAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentDualSrcAttachmentsAt(long index, int value) { maxFragmentDualSrcAttachments(this.segment(), index, value); return this; }

    /// {@return `maxFragmentCombinedOutputResources` at the given index}
    /// @param index the index of the struct buffer
    public int maxFragmentCombinedOutputResourcesAt(long index) { return maxFragmentCombinedOutputResources(this.segment(), index); }
    /// Sets `maxFragmentCombinedOutputResources` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentCombinedOutputResourcesAt(long index, int value) { maxFragmentCombinedOutputResources(this.segment(), index, value); return this; }

    /// {@return `maxComputeSharedMemorySize` at the given index}
    /// @param index the index of the struct buffer
    public int maxComputeSharedMemorySizeAt(long index) { return maxComputeSharedMemorySize(this.segment(), index); }
    /// Sets `maxComputeSharedMemorySize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeSharedMemorySizeAt(long index, int value) { maxComputeSharedMemorySize(this.segment(), index, value); return this; }

    /// {@return `maxComputeWorkGroupCount` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxComputeWorkGroupCountAt(long index) { return maxComputeWorkGroupCount(this.segment(), index); }
    /// {@return `maxComputeWorkGroupCount` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int maxComputeWorkGroupCountAt(long index, long index0) { return maxComputeWorkGroupCount(this.segment(), index, index0); }
    /// Sets `maxComputeWorkGroupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupCountAt(long index, MemorySegment value) { maxComputeWorkGroupCount(this.segment(), index, value); return this; }
    /// Sets `maxComputeWorkGroupCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupCountAt(long index, long index0, int value) { maxComputeWorkGroupCount(this.segment(), index, index0, value); return this; }

    /// {@return `maxComputeWorkGroupInvocations` at the given index}
    /// @param index the index of the struct buffer
    public int maxComputeWorkGroupInvocationsAt(long index) { return maxComputeWorkGroupInvocations(this.segment(), index); }
    /// Sets `maxComputeWorkGroupInvocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupInvocationsAt(long index, int value) { maxComputeWorkGroupInvocations(this.segment(), index, value); return this; }

    /// {@return `maxComputeWorkGroupSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxComputeWorkGroupSizeAt(long index) { return maxComputeWorkGroupSize(this.segment(), index); }
    /// {@return `maxComputeWorkGroupSize` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int maxComputeWorkGroupSizeAt(long index, long index0) { return maxComputeWorkGroupSize(this.segment(), index, index0); }
    /// Sets `maxComputeWorkGroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupSizeAt(long index, MemorySegment value) { maxComputeWorkGroupSize(this.segment(), index, value); return this; }
    /// Sets `maxComputeWorkGroupSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupSizeAt(long index, long index0, int value) { maxComputeWorkGroupSize(this.segment(), index, index0, value); return this; }

    /// {@return `subPixelPrecisionBits` at the given index}
    /// @param index the index of the struct buffer
    public int subPixelPrecisionBitsAt(long index) { return subPixelPrecisionBits(this.segment(), index); }
    /// Sets `subPixelPrecisionBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subPixelPrecisionBitsAt(long index, int value) { subPixelPrecisionBits(this.segment(), index, value); return this; }

    /// {@return `subTexelPrecisionBits` at the given index}
    /// @param index the index of the struct buffer
    public int subTexelPrecisionBitsAt(long index) { return subTexelPrecisionBits(this.segment(), index); }
    /// Sets `subTexelPrecisionBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subTexelPrecisionBitsAt(long index, int value) { subTexelPrecisionBits(this.segment(), index, value); return this; }

    /// {@return `mipmapPrecisionBits` at the given index}
    /// @param index the index of the struct buffer
    public int mipmapPrecisionBitsAt(long index) { return mipmapPrecisionBits(this.segment(), index); }
    /// Sets `mipmapPrecisionBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits mipmapPrecisionBitsAt(long index, int value) { mipmapPrecisionBits(this.segment(), index, value); return this; }

    /// {@return `maxDrawIndexedIndexValue` at the given index}
    /// @param index the index of the struct buffer
    public int maxDrawIndexedIndexValueAt(long index) { return maxDrawIndexedIndexValue(this.segment(), index); }
    /// Sets `maxDrawIndexedIndexValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDrawIndexedIndexValueAt(long index, int value) { maxDrawIndexedIndexValue(this.segment(), index, value); return this; }

    /// {@return `maxDrawIndirectCount` at the given index}
    /// @param index the index of the struct buffer
    public int maxDrawIndirectCountAt(long index) { return maxDrawIndirectCount(this.segment(), index); }
    /// Sets `maxDrawIndirectCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDrawIndirectCountAt(long index, int value) { maxDrawIndirectCount(this.segment(), index, value); return this; }

    /// {@return `maxSamplerLodBias` at the given index}
    /// @param index the index of the struct buffer
    public float maxSamplerLodBiasAt(long index) { return maxSamplerLodBias(this.segment(), index); }
    /// Sets `maxSamplerLodBias` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerLodBiasAt(long index, float value) { maxSamplerLodBias(this.segment(), index, value); return this; }

    /// {@return `maxSamplerAnisotropy` at the given index}
    /// @param index the index of the struct buffer
    public float maxSamplerAnisotropyAt(long index) { return maxSamplerAnisotropy(this.segment(), index); }
    /// Sets `maxSamplerAnisotropy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerAnisotropyAt(long index, float value) { maxSamplerAnisotropy(this.segment(), index, value); return this; }

    /// {@return `maxViewports` at the given index}
    /// @param index the index of the struct buffer
    public int maxViewportsAt(long index) { return maxViewports(this.segment(), index); }
    /// Sets `maxViewports` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewportsAt(long index, int value) { maxViewports(this.segment(), index, value); return this; }

    /// {@return `maxViewportDimensions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxViewportDimensionsAt(long index) { return maxViewportDimensions(this.segment(), index); }
    /// {@return `maxViewportDimensions` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public int maxViewportDimensionsAt(long index, long index0) { return maxViewportDimensions(this.segment(), index, index0); }
    /// Sets `maxViewportDimensions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewportDimensionsAt(long index, MemorySegment value) { maxViewportDimensions(this.segment(), index, value); return this; }
    /// Sets `maxViewportDimensions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewportDimensionsAt(long index, long index0, int value) { maxViewportDimensions(this.segment(), index, index0, value); return this; }

    /// {@return `viewportBoundsRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment viewportBoundsRangeAt(long index) { return viewportBoundsRange(this.segment(), index); }
    /// {@return `viewportBoundsRange` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float viewportBoundsRangeAt(long index, long index0) { return viewportBoundsRange(this.segment(), index, index0); }
    /// Sets `viewportBoundsRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportBoundsRangeAt(long index, MemorySegment value) { viewportBoundsRange(this.segment(), index, value); return this; }
    /// Sets `viewportBoundsRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportBoundsRangeAt(long index, long index0, float value) { viewportBoundsRange(this.segment(), index, index0, value); return this; }

    /// {@return `viewportSubPixelBits` at the given index}
    /// @param index the index of the struct buffer
    public int viewportSubPixelBitsAt(long index) { return viewportSubPixelBits(this.segment(), index); }
    /// Sets `viewportSubPixelBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportSubPixelBitsAt(long index, int value) { viewportSubPixelBits(this.segment(), index, value); return this; }

    /// {@return `minMemoryMapAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minMemoryMapAlignmentAt(long index) { return minMemoryMapAlignment(this.segment(), index); }
    /// Sets `minMemoryMapAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minMemoryMapAlignmentAt(long index, long value) { minMemoryMapAlignment(this.segment(), index, value); return this; }

    /// {@return `minTexelBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minTexelBufferOffsetAlignmentAt(long index) { return minTexelBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minTexelBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelBufferOffsetAlignmentAt(long index, long value) { minTexelBufferOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `minUniformBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minUniformBufferOffsetAlignmentAt(long index) { return minUniformBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minUniformBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minUniformBufferOffsetAlignmentAt(long index, long value) { minUniformBufferOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `minStorageBufferOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long minStorageBufferOffsetAlignmentAt(long index) { return minStorageBufferOffsetAlignment(this.segment(), index); }
    /// Sets `minStorageBufferOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minStorageBufferOffsetAlignmentAt(long index, long value) { minStorageBufferOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `minTexelOffset` at the given index}
    /// @param index the index of the struct buffer
    public int minTexelOffsetAt(long index) { return minTexelOffset(this.segment(), index); }
    /// Sets `minTexelOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelOffsetAt(long index, int value) { minTexelOffset(this.segment(), index, value); return this; }

    /// {@return `maxTexelOffset` at the given index}
    /// @param index the index of the struct buffer
    public int maxTexelOffsetAt(long index) { return maxTexelOffset(this.segment(), index); }
    /// Sets `maxTexelOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelOffsetAt(long index, int value) { maxTexelOffset(this.segment(), index, value); return this; }

    /// {@return `minTexelGatherOffset` at the given index}
    /// @param index the index of the struct buffer
    public int minTexelGatherOffsetAt(long index) { return minTexelGatherOffset(this.segment(), index); }
    /// Sets `minTexelGatherOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelGatherOffsetAt(long index, int value) { minTexelGatherOffset(this.segment(), index, value); return this; }

    /// {@return `maxTexelGatherOffset` at the given index}
    /// @param index the index of the struct buffer
    public int maxTexelGatherOffsetAt(long index) { return maxTexelGatherOffset(this.segment(), index); }
    /// Sets `maxTexelGatherOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelGatherOffsetAt(long index, int value) { maxTexelGatherOffset(this.segment(), index, value); return this; }

    /// {@return `minInterpolationOffset` at the given index}
    /// @param index the index of the struct buffer
    public float minInterpolationOffsetAt(long index) { return minInterpolationOffset(this.segment(), index); }
    /// Sets `minInterpolationOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minInterpolationOffsetAt(long index, float value) { minInterpolationOffset(this.segment(), index, value); return this; }

    /// {@return `maxInterpolationOffset` at the given index}
    /// @param index the index of the struct buffer
    public float maxInterpolationOffsetAt(long index) { return maxInterpolationOffset(this.segment(), index); }
    /// Sets `maxInterpolationOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxInterpolationOffsetAt(long index, float value) { maxInterpolationOffset(this.segment(), index, value); return this; }

    /// {@return `subPixelInterpolationOffsetBits` at the given index}
    /// @param index the index of the struct buffer
    public int subPixelInterpolationOffsetBitsAt(long index) { return subPixelInterpolationOffsetBits(this.segment(), index); }
    /// Sets `subPixelInterpolationOffsetBits` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subPixelInterpolationOffsetBitsAt(long index, int value) { subPixelInterpolationOffsetBits(this.segment(), index, value); return this; }

    /// {@return `maxFramebufferWidth` at the given index}
    /// @param index the index of the struct buffer
    public int maxFramebufferWidthAt(long index) { return maxFramebufferWidth(this.segment(), index); }
    /// Sets `maxFramebufferWidth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferWidthAt(long index, int value) { maxFramebufferWidth(this.segment(), index, value); return this; }

    /// {@return `maxFramebufferHeight` at the given index}
    /// @param index the index of the struct buffer
    public int maxFramebufferHeightAt(long index) { return maxFramebufferHeight(this.segment(), index); }
    /// Sets `maxFramebufferHeight` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferHeightAt(long index, int value) { maxFramebufferHeight(this.segment(), index, value); return this; }

    /// {@return `maxFramebufferLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxFramebufferLayersAt(long index) { return maxFramebufferLayers(this.segment(), index); }
    /// Sets `maxFramebufferLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferLayersAt(long index, int value) { maxFramebufferLayers(this.segment(), index, value); return this; }

    /// {@return `framebufferColorSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int framebufferColorSampleCountsAt(long index) { return framebufferColorSampleCounts(this.segment(), index); }
    /// Sets `framebufferColorSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferColorSampleCountsAt(long index, int value) { framebufferColorSampleCounts(this.segment(), index, value); return this; }

    /// {@return `framebufferDepthSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int framebufferDepthSampleCountsAt(long index) { return framebufferDepthSampleCounts(this.segment(), index); }
    /// Sets `framebufferDepthSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferDepthSampleCountsAt(long index, int value) { framebufferDepthSampleCounts(this.segment(), index, value); return this; }

    /// {@return `framebufferStencilSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int framebufferStencilSampleCountsAt(long index) { return framebufferStencilSampleCounts(this.segment(), index); }
    /// Sets `framebufferStencilSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferStencilSampleCountsAt(long index, int value) { framebufferStencilSampleCounts(this.segment(), index, value); return this; }

    /// {@return `framebufferNoAttachmentsSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int framebufferNoAttachmentsSampleCountsAt(long index) { return framebufferNoAttachmentsSampleCounts(this.segment(), index); }
    /// Sets `framebufferNoAttachmentsSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCountsAt(long index, int value) { framebufferNoAttachmentsSampleCounts(this.segment(), index, value); return this; }

    /// {@return `maxColorAttachments` at the given index}
    /// @param index the index of the struct buffer
    public int maxColorAttachmentsAt(long index) { return maxColorAttachments(this.segment(), index); }
    /// Sets `maxColorAttachments` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxColorAttachmentsAt(long index, int value) { maxColorAttachments(this.segment(), index, value); return this; }

    /// {@return `sampledImageColorSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampledImageColorSampleCountsAt(long index) { return sampledImageColorSampleCounts(this.segment(), index); }
    /// Sets `sampledImageColorSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageColorSampleCountsAt(long index, int value) { sampledImageColorSampleCounts(this.segment(), index, value); return this; }

    /// {@return `sampledImageIntegerSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampledImageIntegerSampleCountsAt(long index) { return sampledImageIntegerSampleCounts(this.segment(), index); }
    /// Sets `sampledImageIntegerSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageIntegerSampleCountsAt(long index, int value) { sampledImageIntegerSampleCounts(this.segment(), index, value); return this; }

    /// {@return `sampledImageDepthSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampledImageDepthSampleCountsAt(long index) { return sampledImageDepthSampleCounts(this.segment(), index); }
    /// Sets `sampledImageDepthSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageDepthSampleCountsAt(long index, int value) { sampledImageDepthSampleCounts(this.segment(), index, value); return this; }

    /// {@return `sampledImageStencilSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int sampledImageStencilSampleCountsAt(long index) { return sampledImageStencilSampleCounts(this.segment(), index); }
    /// Sets `sampledImageStencilSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageStencilSampleCountsAt(long index, int value) { sampledImageStencilSampleCounts(this.segment(), index, value); return this; }

    /// {@return `storageImageSampleCounts` at the given index}
    /// @param index the index of the struct buffer
    public int storageImageSampleCountsAt(long index) { return storageImageSampleCounts(this.segment(), index); }
    /// Sets `storageImageSampleCounts` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits storageImageSampleCountsAt(long index, int value) { storageImageSampleCounts(this.segment(), index, value); return this; }

    /// {@return `maxSampleMaskWords` at the given index}
    /// @param index the index of the struct buffer
    public int maxSampleMaskWordsAt(long index) { return maxSampleMaskWords(this.segment(), index); }
    /// Sets `maxSampleMaskWords` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSampleMaskWordsAt(long index, int value) { maxSampleMaskWords(this.segment(), index, value); return this; }

    /// {@return `timestampComputeAndGraphics` at the given index}
    /// @param index the index of the struct buffer
    public int timestampComputeAndGraphicsAt(long index) { return timestampComputeAndGraphics(this.segment(), index); }
    /// Sets `timestampComputeAndGraphics` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits timestampComputeAndGraphicsAt(long index, int value) { timestampComputeAndGraphics(this.segment(), index, value); return this; }

    /// {@return `timestampPeriod` at the given index}
    /// @param index the index of the struct buffer
    public float timestampPeriodAt(long index) { return timestampPeriod(this.segment(), index); }
    /// Sets `timestampPeriod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits timestampPeriodAt(long index, float value) { timestampPeriod(this.segment(), index, value); return this; }

    /// {@return `maxClipDistances` at the given index}
    /// @param index the index of the struct buffer
    public int maxClipDistancesAt(long index) { return maxClipDistances(this.segment(), index); }
    /// Sets `maxClipDistances` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxClipDistancesAt(long index, int value) { maxClipDistances(this.segment(), index, value); return this; }

    /// {@return `maxCullDistances` at the given index}
    /// @param index the index of the struct buffer
    public int maxCullDistancesAt(long index) { return maxCullDistances(this.segment(), index); }
    /// Sets `maxCullDistances` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxCullDistancesAt(long index, int value) { maxCullDistances(this.segment(), index, value); return this; }

    /// {@return `maxCombinedClipAndCullDistances` at the given index}
    /// @param index the index of the struct buffer
    public int maxCombinedClipAndCullDistancesAt(long index) { return maxCombinedClipAndCullDistances(this.segment(), index); }
    /// Sets `maxCombinedClipAndCullDistances` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxCombinedClipAndCullDistancesAt(long index, int value) { maxCombinedClipAndCullDistances(this.segment(), index, value); return this; }

    /// {@return `discreteQueuePriorities` at the given index}
    /// @param index the index of the struct buffer
    public int discreteQueuePrioritiesAt(long index) { return discreteQueuePriorities(this.segment(), index); }
    /// Sets `discreteQueuePriorities` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits discreteQueuePrioritiesAt(long index, int value) { discreteQueuePriorities(this.segment(), index, value); return this; }

    /// {@return `pointSizeRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pointSizeRangeAt(long index) { return pointSizeRange(this.segment(), index); }
    /// {@return `pointSizeRange` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float pointSizeRangeAt(long index, long index0) { return pointSizeRange(this.segment(), index, index0); }
    /// Sets `pointSizeRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeRangeAt(long index, MemorySegment value) { pointSizeRange(this.segment(), index, value); return this; }
    /// Sets `pointSizeRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeRangeAt(long index, long index0, float value) { pointSizeRange(this.segment(), index, index0, value); return this; }

    /// {@return `lineWidthRange` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment lineWidthRangeAt(long index) { return lineWidthRange(this.segment(), index); }
    /// {@return `lineWidthRange` at the given index}
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
        public float lineWidthRangeAt(long index, long index0) { return lineWidthRange(this.segment(), index, index0); }
    /// Sets `lineWidthRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthRangeAt(long index, MemorySegment value) { lineWidthRange(this.segment(), index, value); return this; }
    /// Sets `lineWidthRange` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthRangeAt(long index, long index0, float value) { lineWidthRange(this.segment(), index, index0, value); return this; }

    /// {@return `pointSizeGranularity` at the given index}
    /// @param index the index of the struct buffer
    public float pointSizeGranularityAt(long index) { return pointSizeGranularity(this.segment(), index); }
    /// Sets `pointSizeGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeGranularityAt(long index, float value) { pointSizeGranularity(this.segment(), index, value); return this; }

    /// {@return `lineWidthGranularity` at the given index}
    /// @param index the index of the struct buffer
    public float lineWidthGranularityAt(long index) { return lineWidthGranularity(this.segment(), index); }
    /// Sets `lineWidthGranularity` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthGranularityAt(long index, float value) { lineWidthGranularity(this.segment(), index, value); return this; }

    /// {@return `strictLines` at the given index}
    /// @param index the index of the struct buffer
    public int strictLinesAt(long index) { return strictLines(this.segment(), index); }
    /// Sets `strictLines` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits strictLinesAt(long index, int value) { strictLines(this.segment(), index, value); return this; }

    /// {@return `standardSampleLocations` at the given index}
    /// @param index the index of the struct buffer
    public int standardSampleLocationsAt(long index) { return standardSampleLocations(this.segment(), index); }
    /// Sets `standardSampleLocations` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits standardSampleLocationsAt(long index, int value) { standardSampleLocations(this.segment(), index, value); return this; }

    /// {@return `optimalBufferCopyOffsetAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long optimalBufferCopyOffsetAlignmentAt(long index) { return optimalBufferCopyOffsetAlignment(this.segment(), index); }
    /// Sets `optimalBufferCopyOffsetAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignmentAt(long index, long value) { optimalBufferCopyOffsetAlignment(this.segment(), index, value); return this; }

    /// {@return `optimalBufferCopyRowPitchAlignment` at the given index}
    /// @param index the index of the struct buffer
    public long optimalBufferCopyRowPitchAlignmentAt(long index) { return optimalBufferCopyRowPitchAlignment(this.segment(), index); }
    /// Sets `optimalBufferCopyRowPitchAlignment` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignmentAt(long index, long value) { optimalBufferCopyRowPitchAlignment(this.segment(), index, value); return this; }

    /// {@return `nonCoherentAtomSize` at the given index}
    /// @param index the index of the struct buffer
    public long nonCoherentAtomSizeAt(long index) { return nonCoherentAtomSize(this.segment(), index); }
    /// Sets `nonCoherentAtomSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits nonCoherentAtomSizeAt(long index, long value) { nonCoherentAtomSize(this.segment(), index, value); return this; }

}
