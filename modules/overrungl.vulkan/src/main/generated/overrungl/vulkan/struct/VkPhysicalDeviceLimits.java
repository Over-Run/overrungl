// This file is auto-generated. DO NOT EDIT!
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
///     VkDeviceSize bufferImageGranularity;
///     VkDeviceSize sparseAddressSpaceSize;
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
///     VkDeviceSize minTexelBufferOffsetAlignment;
///     VkDeviceSize minUniformBufferOffsetAlignment;
///     VkDeviceSize minStorageBufferOffsetAlignment;
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
///     VkSampleCountFlags framebufferColorSampleCounts;
///     VkSampleCountFlags framebufferDepthSampleCounts;
///     VkSampleCountFlags framebufferStencilSampleCounts;
///     VkSampleCountFlags framebufferNoAttachmentsSampleCounts;
///     uint32_t maxColorAttachments;
///     VkSampleCountFlags sampledImageColorSampleCounts;
///     VkSampleCountFlags sampledImageIntegerSampleCounts;
///     VkSampleCountFlags sampledImageDepthSampleCounts;
///     VkSampleCountFlags sampledImageStencilSampleCounts;
///     VkSampleCountFlags storageImageSampleCounts;
///     uint32_t maxSampleMaskWords;
///     VkBool32 timestampComputeAndGraphics;
///     float timestampPeriod;
///     uint32_t maxClipDistances;
///     uint32_t maxCullDistances;
///     uint32_t maxCombinedClipAndCullDistances;
///     uint32_t discreteQueuePriorities;
///     float pointSizeRange[2];
///     float lineWidthRange[2];
///     float pointSizeGranularity;
///     float lineWidthGranularity;
///     VkBool32 strictLines;
///     VkBool32 standardSampleLocations;
///     VkDeviceSize optimalBufferCopyOffsetAlignment;
///     VkDeviceSize optimalBufferCopyRowPitchAlignment;
///     VkDeviceSize nonCoherentAtomSize;
/// }
/// ```
public final class VkPhysicalDeviceLimits extends GroupType {
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
    public static final long OFFSET_maxImageDimension1D = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension1D"));
    public static final long OFFSET_maxImageDimension2D = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension2D"));
    public static final long OFFSET_maxImageDimension3D = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension3D"));
    public static final long OFFSET_maxImageDimensionCube = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimensionCube"));
    public static final long OFFSET_maxImageArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxImageArrayLayers"));
    public static final long OFFSET_maxTexelBufferElements = LAYOUT.byteOffset(PathElement.groupElement("maxTexelBufferElements"));
    public static final long OFFSET_maxUniformBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxUniformBufferRange"));
    public static final long OFFSET_maxStorageBufferRange = LAYOUT.byteOffset(PathElement.groupElement("maxStorageBufferRange"));
    public static final long OFFSET_maxPushConstantsSize = LAYOUT.byteOffset(PathElement.groupElement("maxPushConstantsSize"));
    public static final long OFFSET_maxMemoryAllocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationCount"));
    public static final long OFFSET_maxSamplerAllocationCount = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerAllocationCount"));
    public static final long OFFSET_bufferImageGranularity = LAYOUT.byteOffset(PathElement.groupElement("bufferImageGranularity"));
    public static final long OFFSET_sparseAddressSpaceSize = LAYOUT.byteOffset(PathElement.groupElement("sparseAddressSpaceSize"));
    public static final long OFFSET_maxBoundDescriptorSets = LAYOUT.byteOffset(PathElement.groupElement("maxBoundDescriptorSets"));
    public static final long OFFSET_maxPerStageDescriptorSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSamplers"));
    public static final long OFFSET_maxPerStageDescriptorUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    public static final long OFFSET_maxPerStageDescriptorStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    public static final long OFFSET_maxPerStageDescriptorSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    public static final long OFFSET_maxPerStageDescriptorStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    public static final long OFFSET_maxPerStageDescriptorInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    public static final long OFFSET_maxPerStageResources = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageResources"));
    public static final long OFFSET_maxDescriptorSetSamplers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSamplers"));
    public static final long OFFSET_maxDescriptorSetUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    public static final long OFFSET_maxDescriptorSetUniformBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    public static final long OFFSET_maxDescriptorSetStorageBuffersDynamic = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    public static final long OFFSET_maxDescriptorSetSampledImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSampledImages"));
    public static final long OFFSET_maxDescriptorSetStorageImages = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageImages"));
    public static final long OFFSET_maxDescriptorSetInputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInputAttachments"));
    public static final long OFFSET_maxVertexInputAttributes = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputAttributes"));
    public static final long OFFSET_maxVertexInputBindings = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputBindings"));
    public static final long OFFSET_maxVertexInputAttributeOffset = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputAttributeOffset"));
    public static final long OFFSET_maxVertexInputBindingStride = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputBindingStride"));
    public static final long OFFSET_maxVertexOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxVertexOutputComponents"));
    public static final long OFFSET_maxTessellationGenerationLevel = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationGenerationLevel"));
    public static final long OFFSET_maxTessellationPatchSize = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationPatchSize"));
    public static final long OFFSET_maxTessellationControlPerVertexInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    public static final long OFFSET_maxTessellationControlPerVertexOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    public static final long OFFSET_maxTessellationControlPerPatchOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    public static final long OFFSET_maxTessellationControlTotalOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    public static final long OFFSET_maxTessellationEvaluationInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    public static final long OFFSET_maxTessellationEvaluationOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    public static final long OFFSET_maxGeometryShaderInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryShaderInvocations"));
    public static final long OFFSET_maxGeometryInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryInputComponents"));
    public static final long OFFSET_maxGeometryOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryOutputComponents"));
    public static final long OFFSET_maxGeometryOutputVertices = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryOutputVertices"));
    public static final long OFFSET_maxGeometryTotalOutputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryTotalOutputComponents"));
    public static final long OFFSET_maxFragmentInputComponents = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentInputComponents"));
    public static final long OFFSET_maxFragmentOutputAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentOutputAttachments"));
    public static final long OFFSET_maxFragmentDualSrcAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDualSrcAttachments"));
    public static final long OFFSET_maxFragmentCombinedOutputResources = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentCombinedOutputResources"));
    public static final long OFFSET_maxComputeSharedMemorySize = LAYOUT.byteOffset(PathElement.groupElement("maxComputeSharedMemorySize"));
    public static final long OFFSET_maxComputeWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupCount"));
    public static final long OFFSET_maxComputeWorkGroupInvocations = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupInvocations"));
    public static final long OFFSET_maxComputeWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupSize"));
    public static final long OFFSET_subPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("subPixelPrecisionBits"));
    public static final long OFFSET_subTexelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("subTexelPrecisionBits"));
    public static final long OFFSET_mipmapPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("mipmapPrecisionBits"));
    public static final long OFFSET_maxDrawIndexedIndexValue = LAYOUT.byteOffset(PathElement.groupElement("maxDrawIndexedIndexValue"));
    public static final long OFFSET_maxDrawIndirectCount = LAYOUT.byteOffset(PathElement.groupElement("maxDrawIndirectCount"));
    public static final long OFFSET_maxSamplerLodBias = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerLodBias"));
    public static final long OFFSET_maxSamplerAnisotropy = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerAnisotropy"));
    public static final long OFFSET_maxViewports = LAYOUT.byteOffset(PathElement.groupElement("maxViewports"));
    public static final long OFFSET_maxViewportDimensions = LAYOUT.byteOffset(PathElement.groupElement("maxViewportDimensions"));
    public static final long OFFSET_viewportBoundsRange = LAYOUT.byteOffset(PathElement.groupElement("viewportBoundsRange"));
    public static final long OFFSET_viewportSubPixelBits = LAYOUT.byteOffset(PathElement.groupElement("viewportSubPixelBits"));
    public static final long OFFSET_minMemoryMapAlignment = LAYOUT.byteOffset(PathElement.groupElement("minMemoryMapAlignment"));
    public static final long OFFSET_minTexelBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minTexelBufferOffsetAlignment"));
    public static final long OFFSET_minUniformBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minUniformBufferOffsetAlignment"));
    public static final long OFFSET_minStorageBufferOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("minStorageBufferOffsetAlignment"));
    public static final long OFFSET_minTexelOffset = LAYOUT.byteOffset(PathElement.groupElement("minTexelOffset"));
    public static final long OFFSET_maxTexelOffset = LAYOUT.byteOffset(PathElement.groupElement("maxTexelOffset"));
    public static final long OFFSET_minTexelGatherOffset = LAYOUT.byteOffset(PathElement.groupElement("minTexelGatherOffset"));
    public static final long OFFSET_maxTexelGatherOffset = LAYOUT.byteOffset(PathElement.groupElement("maxTexelGatherOffset"));
    public static final long OFFSET_minInterpolationOffset = LAYOUT.byteOffset(PathElement.groupElement("minInterpolationOffset"));
    public static final long OFFSET_maxInterpolationOffset = LAYOUT.byteOffset(PathElement.groupElement("maxInterpolationOffset"));
    public static final long OFFSET_subPixelInterpolationOffsetBits = LAYOUT.byteOffset(PathElement.groupElement("subPixelInterpolationOffsetBits"));
    public static final long OFFSET_maxFramebufferWidth = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferWidth"));
    public static final long OFFSET_maxFramebufferHeight = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferHeight"));
    public static final long OFFSET_maxFramebufferLayers = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferLayers"));
    public static final long OFFSET_framebufferColorSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferColorSampleCounts"));
    public static final long OFFSET_framebufferDepthSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferDepthSampleCounts"));
    public static final long OFFSET_framebufferStencilSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferStencilSampleCounts"));
    public static final long OFFSET_framebufferNoAttachmentsSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    public static final long OFFSET_maxColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("maxColorAttachments"));
    public static final long OFFSET_sampledImageColorSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageColorSampleCounts"));
    public static final long OFFSET_sampledImageIntegerSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageIntegerSampleCounts"));
    public static final long OFFSET_sampledImageDepthSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageDepthSampleCounts"));
    public static final long OFFSET_sampledImageStencilSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("sampledImageStencilSampleCounts"));
    public static final long OFFSET_storageImageSampleCounts = LAYOUT.byteOffset(PathElement.groupElement("storageImageSampleCounts"));
    public static final long OFFSET_maxSampleMaskWords = LAYOUT.byteOffset(PathElement.groupElement("maxSampleMaskWords"));
    public static final long OFFSET_timestampComputeAndGraphics = LAYOUT.byteOffset(PathElement.groupElement("timestampComputeAndGraphics"));
    public static final long OFFSET_timestampPeriod = LAYOUT.byteOffset(PathElement.groupElement("timestampPeriod"));
    public static final long OFFSET_maxClipDistances = LAYOUT.byteOffset(PathElement.groupElement("maxClipDistances"));
    public static final long OFFSET_maxCullDistances = LAYOUT.byteOffset(PathElement.groupElement("maxCullDistances"));
    public static final long OFFSET_maxCombinedClipAndCullDistances = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedClipAndCullDistances"));
    public static final long OFFSET_discreteQueuePriorities = LAYOUT.byteOffset(PathElement.groupElement("discreteQueuePriorities"));
    public static final long OFFSET_pointSizeRange = LAYOUT.byteOffset(PathElement.groupElement("pointSizeRange"));
    public static final long OFFSET_lineWidthRange = LAYOUT.byteOffset(PathElement.groupElement("lineWidthRange"));
    public static final long OFFSET_pointSizeGranularity = LAYOUT.byteOffset(PathElement.groupElement("pointSizeGranularity"));
    public static final long OFFSET_lineWidthGranularity = LAYOUT.byteOffset(PathElement.groupElement("lineWidthGranularity"));
    public static final long OFFSET_strictLines = LAYOUT.byteOffset(PathElement.groupElement("strictLines"));
    public static final long OFFSET_standardSampleLocations = LAYOUT.byteOffset(PathElement.groupElement("standardSampleLocations"));
    public static final long OFFSET_optimalBufferCopyOffsetAlignment = LAYOUT.byteOffset(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    public static final long OFFSET_optimalBufferCopyRowPitchAlignment = LAYOUT.byteOffset(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    public static final long OFFSET_nonCoherentAtomSize = LAYOUT.byteOffset(PathElement.groupElement("nonCoherentAtomSize"));
    public static final MemoryLayout LAYOUT_maxImageDimension1D = LAYOUT.select(PathElement.groupElement("maxImageDimension1D"));
    public static final MemoryLayout LAYOUT_maxImageDimension2D = LAYOUT.select(PathElement.groupElement("maxImageDimension2D"));
    public static final MemoryLayout LAYOUT_maxImageDimension3D = LAYOUT.select(PathElement.groupElement("maxImageDimension3D"));
    public static final MemoryLayout LAYOUT_maxImageDimensionCube = LAYOUT.select(PathElement.groupElement("maxImageDimensionCube"));
    public static final MemoryLayout LAYOUT_maxImageArrayLayers = LAYOUT.select(PathElement.groupElement("maxImageArrayLayers"));
    public static final MemoryLayout LAYOUT_maxTexelBufferElements = LAYOUT.select(PathElement.groupElement("maxTexelBufferElements"));
    public static final MemoryLayout LAYOUT_maxUniformBufferRange = LAYOUT.select(PathElement.groupElement("maxUniformBufferRange"));
    public static final MemoryLayout LAYOUT_maxStorageBufferRange = LAYOUT.select(PathElement.groupElement("maxStorageBufferRange"));
    public static final MemoryLayout LAYOUT_maxPushConstantsSize = LAYOUT.select(PathElement.groupElement("maxPushConstantsSize"));
    public static final MemoryLayout LAYOUT_maxMemoryAllocationCount = LAYOUT.select(PathElement.groupElement("maxMemoryAllocationCount"));
    public static final MemoryLayout LAYOUT_maxSamplerAllocationCount = LAYOUT.select(PathElement.groupElement("maxSamplerAllocationCount"));
    public static final MemoryLayout LAYOUT_bufferImageGranularity = LAYOUT.select(PathElement.groupElement("bufferImageGranularity"));
    public static final MemoryLayout LAYOUT_sparseAddressSpaceSize = LAYOUT.select(PathElement.groupElement("sparseAddressSpaceSize"));
    public static final MemoryLayout LAYOUT_maxBoundDescriptorSets = LAYOUT.select(PathElement.groupElement("maxBoundDescriptorSets"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorSamplers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorSamplers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorUniformBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorStorageBuffers = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorSampledImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorStorageImages = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    public static final MemoryLayout LAYOUT_maxPerStageDescriptorInputAttachments = LAYOUT.select(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    public static final MemoryLayout LAYOUT_maxPerStageResources = LAYOUT.select(PathElement.groupElement("maxPerStageResources"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetSamplers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetSamplers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUniformBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetUniformBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageBuffers = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageBuffersDynamic = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetSampledImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetSampledImages"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetStorageImages = LAYOUT.select(PathElement.groupElement("maxDescriptorSetStorageImages"));
    public static final MemoryLayout LAYOUT_maxDescriptorSetInputAttachments = LAYOUT.select(PathElement.groupElement("maxDescriptorSetInputAttachments"));
    public static final MemoryLayout LAYOUT_maxVertexInputAttributes = LAYOUT.select(PathElement.groupElement("maxVertexInputAttributes"));
    public static final MemoryLayout LAYOUT_maxVertexInputBindings = LAYOUT.select(PathElement.groupElement("maxVertexInputBindings"));
    public static final MemoryLayout LAYOUT_maxVertexInputAttributeOffset = LAYOUT.select(PathElement.groupElement("maxVertexInputAttributeOffset"));
    public static final MemoryLayout LAYOUT_maxVertexInputBindingStride = LAYOUT.select(PathElement.groupElement("maxVertexInputBindingStride"));
    public static final MemoryLayout LAYOUT_maxVertexOutputComponents = LAYOUT.select(PathElement.groupElement("maxVertexOutputComponents"));
    public static final MemoryLayout LAYOUT_maxTessellationGenerationLevel = LAYOUT.select(PathElement.groupElement("maxTessellationGenerationLevel"));
    public static final MemoryLayout LAYOUT_maxTessellationPatchSize = LAYOUT.select(PathElement.groupElement("maxTessellationPatchSize"));
    public static final MemoryLayout LAYOUT_maxTessellationControlPerVertexInputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    public static final MemoryLayout LAYOUT_maxTessellationControlPerVertexOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    public static final MemoryLayout LAYOUT_maxTessellationControlPerPatchOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    public static final MemoryLayout LAYOUT_maxTessellationControlTotalOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    public static final MemoryLayout LAYOUT_maxTessellationEvaluationInputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    public static final MemoryLayout LAYOUT_maxTessellationEvaluationOutputComponents = LAYOUT.select(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    public static final MemoryLayout LAYOUT_maxGeometryShaderInvocations = LAYOUT.select(PathElement.groupElement("maxGeometryShaderInvocations"));
    public static final MemoryLayout LAYOUT_maxGeometryInputComponents = LAYOUT.select(PathElement.groupElement("maxGeometryInputComponents"));
    public static final MemoryLayout LAYOUT_maxGeometryOutputComponents = LAYOUT.select(PathElement.groupElement("maxGeometryOutputComponents"));
    public static final MemoryLayout LAYOUT_maxGeometryOutputVertices = LAYOUT.select(PathElement.groupElement("maxGeometryOutputVertices"));
    public static final MemoryLayout LAYOUT_maxGeometryTotalOutputComponents = LAYOUT.select(PathElement.groupElement("maxGeometryTotalOutputComponents"));
    public static final MemoryLayout LAYOUT_maxFragmentInputComponents = LAYOUT.select(PathElement.groupElement("maxFragmentInputComponents"));
    public static final MemoryLayout LAYOUT_maxFragmentOutputAttachments = LAYOUT.select(PathElement.groupElement("maxFragmentOutputAttachments"));
    public static final MemoryLayout LAYOUT_maxFragmentDualSrcAttachments = LAYOUT.select(PathElement.groupElement("maxFragmentDualSrcAttachments"));
    public static final MemoryLayout LAYOUT_maxFragmentCombinedOutputResources = LAYOUT.select(PathElement.groupElement("maxFragmentCombinedOutputResources"));
    public static final MemoryLayout LAYOUT_maxComputeSharedMemorySize = LAYOUT.select(PathElement.groupElement("maxComputeSharedMemorySize"));
    public static final MemoryLayout LAYOUT_maxComputeWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupCount"));
    public static final MemoryLayout LAYOUT_maxComputeWorkGroupInvocations = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupInvocations"));
    public static final MemoryLayout LAYOUT_maxComputeWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupSize"));
    public static final MemoryLayout LAYOUT_subPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("subPixelPrecisionBits"));
    public static final MemoryLayout LAYOUT_subTexelPrecisionBits = LAYOUT.select(PathElement.groupElement("subTexelPrecisionBits"));
    public static final MemoryLayout LAYOUT_mipmapPrecisionBits = LAYOUT.select(PathElement.groupElement("mipmapPrecisionBits"));
    public static final MemoryLayout LAYOUT_maxDrawIndexedIndexValue = LAYOUT.select(PathElement.groupElement("maxDrawIndexedIndexValue"));
    public static final MemoryLayout LAYOUT_maxDrawIndirectCount = LAYOUT.select(PathElement.groupElement("maxDrawIndirectCount"));
    public static final MemoryLayout LAYOUT_maxSamplerLodBias = LAYOUT.select(PathElement.groupElement("maxSamplerLodBias"));
    public static final MemoryLayout LAYOUT_maxSamplerAnisotropy = LAYOUT.select(PathElement.groupElement("maxSamplerAnisotropy"));
    public static final MemoryLayout LAYOUT_maxViewports = LAYOUT.select(PathElement.groupElement("maxViewports"));
    public static final MemoryLayout LAYOUT_maxViewportDimensions = LAYOUT.select(PathElement.groupElement("maxViewportDimensions"));
    public static final MemoryLayout LAYOUT_viewportBoundsRange = LAYOUT.select(PathElement.groupElement("viewportBoundsRange"));
    public static final MemoryLayout LAYOUT_viewportSubPixelBits = LAYOUT.select(PathElement.groupElement("viewportSubPixelBits"));
    public static final MemoryLayout LAYOUT_minMemoryMapAlignment = LAYOUT.select(PathElement.groupElement("minMemoryMapAlignment"));
    public static final MemoryLayout LAYOUT_minTexelBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minTexelBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_minUniformBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minUniformBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_minStorageBufferOffsetAlignment = LAYOUT.select(PathElement.groupElement("minStorageBufferOffsetAlignment"));
    public static final MemoryLayout LAYOUT_minTexelOffset = LAYOUT.select(PathElement.groupElement("minTexelOffset"));
    public static final MemoryLayout LAYOUT_maxTexelOffset = LAYOUT.select(PathElement.groupElement("maxTexelOffset"));
    public static final MemoryLayout LAYOUT_minTexelGatherOffset = LAYOUT.select(PathElement.groupElement("minTexelGatherOffset"));
    public static final MemoryLayout LAYOUT_maxTexelGatherOffset = LAYOUT.select(PathElement.groupElement("maxTexelGatherOffset"));
    public static final MemoryLayout LAYOUT_minInterpolationOffset = LAYOUT.select(PathElement.groupElement("minInterpolationOffset"));
    public static final MemoryLayout LAYOUT_maxInterpolationOffset = LAYOUT.select(PathElement.groupElement("maxInterpolationOffset"));
    public static final MemoryLayout LAYOUT_subPixelInterpolationOffsetBits = LAYOUT.select(PathElement.groupElement("subPixelInterpolationOffsetBits"));
    public static final MemoryLayout LAYOUT_maxFramebufferWidth = LAYOUT.select(PathElement.groupElement("maxFramebufferWidth"));
    public static final MemoryLayout LAYOUT_maxFramebufferHeight = LAYOUT.select(PathElement.groupElement("maxFramebufferHeight"));
    public static final MemoryLayout LAYOUT_maxFramebufferLayers = LAYOUT.select(PathElement.groupElement("maxFramebufferLayers"));
    public static final MemoryLayout LAYOUT_framebufferColorSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferColorSampleCounts"));
    public static final MemoryLayout LAYOUT_framebufferDepthSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferDepthSampleCounts"));
    public static final MemoryLayout LAYOUT_framebufferStencilSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferStencilSampleCounts"));
    public static final MemoryLayout LAYOUT_framebufferNoAttachmentsSampleCounts = LAYOUT.select(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    public static final MemoryLayout LAYOUT_maxColorAttachments = LAYOUT.select(PathElement.groupElement("maxColorAttachments"));
    public static final MemoryLayout LAYOUT_sampledImageColorSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageColorSampleCounts"));
    public static final MemoryLayout LAYOUT_sampledImageIntegerSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageIntegerSampleCounts"));
    public static final MemoryLayout LAYOUT_sampledImageDepthSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageDepthSampleCounts"));
    public static final MemoryLayout LAYOUT_sampledImageStencilSampleCounts = LAYOUT.select(PathElement.groupElement("sampledImageStencilSampleCounts"));
    public static final MemoryLayout LAYOUT_storageImageSampleCounts = LAYOUT.select(PathElement.groupElement("storageImageSampleCounts"));
    public static final MemoryLayout LAYOUT_maxSampleMaskWords = LAYOUT.select(PathElement.groupElement("maxSampleMaskWords"));
    public static final MemoryLayout LAYOUT_timestampComputeAndGraphics = LAYOUT.select(PathElement.groupElement("timestampComputeAndGraphics"));
    public static final MemoryLayout LAYOUT_timestampPeriod = LAYOUT.select(PathElement.groupElement("timestampPeriod"));
    public static final MemoryLayout LAYOUT_maxClipDistances = LAYOUT.select(PathElement.groupElement("maxClipDistances"));
    public static final MemoryLayout LAYOUT_maxCullDistances = LAYOUT.select(PathElement.groupElement("maxCullDistances"));
    public static final MemoryLayout LAYOUT_maxCombinedClipAndCullDistances = LAYOUT.select(PathElement.groupElement("maxCombinedClipAndCullDistances"));
    public static final MemoryLayout LAYOUT_discreteQueuePriorities = LAYOUT.select(PathElement.groupElement("discreteQueuePriorities"));
    public static final MemoryLayout LAYOUT_pointSizeRange = LAYOUT.select(PathElement.groupElement("pointSizeRange"));
    public static final MemoryLayout LAYOUT_lineWidthRange = LAYOUT.select(PathElement.groupElement("lineWidthRange"));
    public static final MemoryLayout LAYOUT_pointSizeGranularity = LAYOUT.select(PathElement.groupElement("pointSizeGranularity"));
    public static final MemoryLayout LAYOUT_lineWidthGranularity = LAYOUT.select(PathElement.groupElement("lineWidthGranularity"));
    public static final MemoryLayout LAYOUT_strictLines = LAYOUT.select(PathElement.groupElement("strictLines"));
    public static final MemoryLayout LAYOUT_standardSampleLocations = LAYOUT.select(PathElement.groupElement("standardSampleLocations"));
    public static final MemoryLayout LAYOUT_optimalBufferCopyOffsetAlignment = LAYOUT.select(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    public static final MemoryLayout LAYOUT_optimalBufferCopyRowPitchAlignment = LAYOUT.select(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    public static final MemoryLayout LAYOUT_nonCoherentAtomSize = LAYOUT.select(PathElement.groupElement("nonCoherentAtomSize"));
    public static final VarHandle VH_maxImageDimension1D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension1D"));
    public static final VarHandle VH_maxImageDimension2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension2D"));
    public static final VarHandle VH_maxImageDimension3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension3D"));
    public static final VarHandle VH_maxImageDimensionCube = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimensionCube"));
    public static final VarHandle VH_maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageArrayLayers"));
    public static final VarHandle VH_maxTexelBufferElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelBufferElements"));
    public static final VarHandle VH_maxUniformBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUniformBufferRange"));
    public static final VarHandle VH_maxStorageBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStorageBufferRange"));
    public static final VarHandle VH_maxPushConstantsSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPushConstantsSize"));
    public static final VarHandle VH_maxMemoryAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationCount"));
    public static final VarHandle VH_maxSamplerAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerAllocationCount"));
    public static final VarHandle VH_bufferImageGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageGranularity"));
    public static final VarHandle VH_sparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseAddressSpaceSize"));
    public static final VarHandle VH_maxBoundDescriptorSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBoundDescriptorSets"));
    public static final VarHandle VH_maxPerStageDescriptorSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSamplers"));
    public static final VarHandle VH_maxPerStageDescriptorUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    public static final VarHandle VH_maxPerStageDescriptorStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    public static final VarHandle VH_maxPerStageDescriptorSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    public static final VarHandle VH_maxPerStageDescriptorStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    public static final VarHandle VH_maxPerStageDescriptorInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    public static final VarHandle VH_maxPerStageResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageResources"));
    public static final VarHandle VH_maxDescriptorSetSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSamplers"));
    public static final VarHandle VH_maxDescriptorSetUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    public static final VarHandle VH_maxDescriptorSetUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    public static final VarHandle VH_maxDescriptorSetStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    public static final VarHandle VH_maxDescriptorSetSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSampledImages"));
    public static final VarHandle VH_maxDescriptorSetStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageImages"));
    public static final VarHandle VH_maxDescriptorSetInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInputAttachments"));
    public static final VarHandle VH_maxVertexInputAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputAttributes"));
    public static final VarHandle VH_maxVertexInputBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputBindings"));
    public static final VarHandle VH_maxVertexInputAttributeOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputAttributeOffset"));
    public static final VarHandle VH_maxVertexInputBindingStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputBindingStride"));
    public static final VarHandle VH_maxVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexOutputComponents"));
    public static final VarHandle VH_maxTessellationGenerationLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationGenerationLevel"));
    public static final VarHandle VH_maxTessellationPatchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationPatchSize"));
    public static final VarHandle VH_maxTessellationControlPerVertexInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    public static final VarHandle VH_maxTessellationControlPerVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    public static final VarHandle VH_maxTessellationControlPerPatchOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    public static final VarHandle VH_maxTessellationControlTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    public static final VarHandle VH_maxTessellationEvaluationInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    public static final VarHandle VH_maxTessellationEvaluationOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    public static final VarHandle VH_maxGeometryShaderInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryShaderInvocations"));
    public static final VarHandle VH_maxGeometryInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryInputComponents"));
    public static final VarHandle VH_maxGeometryOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryOutputComponents"));
    public static final VarHandle VH_maxGeometryOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryOutputVertices"));
    public static final VarHandle VH_maxGeometryTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryTotalOutputComponents"));
    public static final VarHandle VH_maxFragmentInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentInputComponents"));
    public static final VarHandle VH_maxFragmentOutputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentOutputAttachments"));
    public static final VarHandle VH_maxFragmentDualSrcAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDualSrcAttachments"));
    public static final VarHandle VH_maxFragmentCombinedOutputResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentCombinedOutputResources"));
    public static final VarHandle VH_maxComputeSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeSharedMemorySize"));
    public static final VarHandle VH_maxComputeWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_maxComputeWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupInvocations"));
    public static final VarHandle VH_maxComputeWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_subPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subPixelPrecisionBits"));
    public static final VarHandle VH_subTexelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subTexelPrecisionBits"));
    public static final VarHandle VH_mipmapPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipmapPrecisionBits"));
    public static final VarHandle VH_maxDrawIndexedIndexValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawIndexedIndexValue"));
    public static final VarHandle VH_maxDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawIndirectCount"));
    public static final VarHandle VH_maxSamplerLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerLodBias"));
    public static final VarHandle VH_maxSamplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerAnisotropy"));
    public static final VarHandle VH_maxViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxViewports"));
    public static final VarHandle VH_maxViewportDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxViewportDimensions"), PathElement.sequenceElement());
    public static final VarHandle VH_viewportBoundsRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportBoundsRange"), PathElement.sequenceElement());
    public static final VarHandle VH_viewportSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportSubPixelBits"));
    public static final VarHandle VH_minMemoryMapAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minMemoryMapAlignment"));
    public static final VarHandle VH_minTexelBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelBufferOffsetAlignment"));
    public static final VarHandle VH_minUniformBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minUniformBufferOffsetAlignment"));
    public static final VarHandle VH_minStorageBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minStorageBufferOffsetAlignment"));
    public static final VarHandle VH_minTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelOffset"));
    public static final VarHandle VH_maxTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelOffset"));
    public static final VarHandle VH_minTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelGatherOffset"));
    public static final VarHandle VH_maxTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelGatherOffset"));
    public static final VarHandle VH_minInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minInterpolationOffset"));
    public static final VarHandle VH_maxInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInterpolationOffset"));
    public static final VarHandle VH_subPixelInterpolationOffsetBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subPixelInterpolationOffsetBits"));
    public static final VarHandle VH_maxFramebufferWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferWidth"));
    public static final VarHandle VH_maxFramebufferHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferHeight"));
    public static final VarHandle VH_maxFramebufferLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferLayers"));
    public static final VarHandle VH_framebufferColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferColorSampleCounts"));
    public static final VarHandle VH_framebufferDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferDepthSampleCounts"));
    public static final VarHandle VH_framebufferStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferStencilSampleCounts"));
    public static final VarHandle VH_framebufferNoAttachmentsSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    public static final VarHandle VH_maxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxColorAttachments"));
    public static final VarHandle VH_sampledImageColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageColorSampleCounts"));
    public static final VarHandle VH_sampledImageIntegerSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageIntegerSampleCounts"));
    public static final VarHandle VH_sampledImageDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageDepthSampleCounts"));
    public static final VarHandle VH_sampledImageStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageStencilSampleCounts"));
    public static final VarHandle VH_storageImageSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageImageSampleCounts"));
    public static final VarHandle VH_maxSampleMaskWords = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleMaskWords"));
    public static final VarHandle VH_timestampComputeAndGraphics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampComputeAndGraphics"));
    public static final VarHandle VH_timestampPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampPeriod"));
    public static final VarHandle VH_maxClipDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClipDistances"));
    public static final VarHandle VH_maxCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCullDistances"));
    public static final VarHandle VH_maxCombinedClipAndCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedClipAndCullDistances"));
    public static final VarHandle VH_discreteQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discreteQueuePriorities"));
    public static final VarHandle VH_pointSizeRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointSizeRange"), PathElement.sequenceElement());
    public static final VarHandle VH_lineWidthRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidthRange"), PathElement.sequenceElement());
    public static final VarHandle VH_pointSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointSizeGranularity"));
    public static final VarHandle VH_lineWidthGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidthGranularity"));
    public static final VarHandle VH_strictLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("strictLines"));
    public static final VarHandle VH_standardSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("standardSampleLocations"));
    public static final VarHandle VH_optimalBufferCopyOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    public static final VarHandle VH_optimalBufferCopyRowPitchAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    public static final VarHandle VH_nonCoherentAtomSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonCoherentAtomSize"));

    public VkPhysicalDeviceLimits(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceLimits of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceLimits ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceLimits ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceLimits alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLimits(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceLimits alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceLimits(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceLimits copyFrom(VkPhysicalDeviceLimits src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceLimits reinterpret(long count) { return new VkPhysicalDeviceLimits(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceLimits asSlice(long index) { return new VkPhysicalDeviceLimits(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceLimits asSlice(long index, long count) { return new VkPhysicalDeviceLimits(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceLimits at(long index, Consumer<VkPhysicalDeviceLimits> func) { func.accept(asSlice(index)); return this; }
    public int maxImageDimension1DAt(long index) { return (int) VH_maxImageDimension1D.get(this.segment(), 0L, index); }
    public int maxImageDimension2DAt(long index) { return (int) VH_maxImageDimension2D.get(this.segment(), 0L, index); }
    public int maxImageDimension3DAt(long index) { return (int) VH_maxImageDimension3D.get(this.segment(), 0L, index); }
    public int maxImageDimensionCubeAt(long index) { return (int) VH_maxImageDimensionCube.get(this.segment(), 0L, index); }
    public int maxImageArrayLayersAt(long index) { return (int) VH_maxImageArrayLayers.get(this.segment(), 0L, index); }
    public int maxTexelBufferElementsAt(long index) { return (int) VH_maxTexelBufferElements.get(this.segment(), 0L, index); }
    public int maxUniformBufferRangeAt(long index) { return (int) VH_maxUniformBufferRange.get(this.segment(), 0L, index); }
    public int maxStorageBufferRangeAt(long index) { return (int) VH_maxStorageBufferRange.get(this.segment(), 0L, index); }
    public int maxPushConstantsSizeAt(long index) { return (int) VH_maxPushConstantsSize.get(this.segment(), 0L, index); }
    public int maxMemoryAllocationCountAt(long index) { return (int) VH_maxMemoryAllocationCount.get(this.segment(), 0L, index); }
    public int maxSamplerAllocationCountAt(long index) { return (int) VH_maxSamplerAllocationCount.get(this.segment(), 0L, index); }
    public long bufferImageGranularityAt(long index) { return (long) VH_bufferImageGranularity.get(this.segment(), 0L, index); }
    public long sparseAddressSpaceSizeAt(long index) { return (long) VH_sparseAddressSpaceSize.get(this.segment(), 0L, index); }
    public int maxBoundDescriptorSetsAt(long index) { return (int) VH_maxBoundDescriptorSets.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorSamplersAt(long index) { return (int) VH_maxPerStageDescriptorSamplers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorUniformBuffersAt(long index) { return (int) VH_maxPerStageDescriptorUniformBuffers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorStorageBuffersAt(long index) { return (int) VH_maxPerStageDescriptorStorageBuffers.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorSampledImagesAt(long index) { return (int) VH_maxPerStageDescriptorSampledImages.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorStorageImagesAt(long index) { return (int) VH_maxPerStageDescriptorStorageImages.get(this.segment(), 0L, index); }
    public int maxPerStageDescriptorInputAttachmentsAt(long index) { return (int) VH_maxPerStageDescriptorInputAttachments.get(this.segment(), 0L, index); }
    public int maxPerStageResourcesAt(long index) { return (int) VH_maxPerStageResources.get(this.segment(), 0L, index); }
    public int maxDescriptorSetSamplersAt(long index) { return (int) VH_maxDescriptorSetSamplers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUniformBuffersAt(long index) { return (int) VH_maxDescriptorSetUniformBuffers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetUniformBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetStorageBuffersAt(long index) { return (int) VH_maxDescriptorSetStorageBuffers.get(this.segment(), 0L, index); }
    public int maxDescriptorSetStorageBuffersDynamicAt(long index) { return (int) VH_maxDescriptorSetStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int maxDescriptorSetSampledImagesAt(long index) { return (int) VH_maxDescriptorSetSampledImages.get(this.segment(), 0L, index); }
    public int maxDescriptorSetStorageImagesAt(long index) { return (int) VH_maxDescriptorSetStorageImages.get(this.segment(), 0L, index); }
    public int maxDescriptorSetInputAttachmentsAt(long index) { return (int) VH_maxDescriptorSetInputAttachments.get(this.segment(), 0L, index); }
    public int maxVertexInputAttributesAt(long index) { return (int) VH_maxVertexInputAttributes.get(this.segment(), 0L, index); }
    public int maxVertexInputBindingsAt(long index) { return (int) VH_maxVertexInputBindings.get(this.segment(), 0L, index); }
    public int maxVertexInputAttributeOffsetAt(long index) { return (int) VH_maxVertexInputAttributeOffset.get(this.segment(), 0L, index); }
    public int maxVertexInputBindingStrideAt(long index) { return (int) VH_maxVertexInputBindingStride.get(this.segment(), 0L, index); }
    public int maxVertexOutputComponentsAt(long index) { return (int) VH_maxVertexOutputComponents.get(this.segment(), 0L, index); }
    public int maxTessellationGenerationLevelAt(long index) { return (int) VH_maxTessellationGenerationLevel.get(this.segment(), 0L, index); }
    public int maxTessellationPatchSizeAt(long index) { return (int) VH_maxTessellationPatchSize.get(this.segment(), 0L, index); }
    public int maxTessellationControlPerVertexInputComponentsAt(long index) { return (int) VH_maxTessellationControlPerVertexInputComponents.get(this.segment(), 0L, index); }
    public int maxTessellationControlPerVertexOutputComponentsAt(long index) { return (int) VH_maxTessellationControlPerVertexOutputComponents.get(this.segment(), 0L, index); }
    public int maxTessellationControlPerPatchOutputComponentsAt(long index) { return (int) VH_maxTessellationControlPerPatchOutputComponents.get(this.segment(), 0L, index); }
    public int maxTessellationControlTotalOutputComponentsAt(long index) { return (int) VH_maxTessellationControlTotalOutputComponents.get(this.segment(), 0L, index); }
    public int maxTessellationEvaluationInputComponentsAt(long index) { return (int) VH_maxTessellationEvaluationInputComponents.get(this.segment(), 0L, index); }
    public int maxTessellationEvaluationOutputComponentsAt(long index) { return (int) VH_maxTessellationEvaluationOutputComponents.get(this.segment(), 0L, index); }
    public int maxGeometryShaderInvocationsAt(long index) { return (int) VH_maxGeometryShaderInvocations.get(this.segment(), 0L, index); }
    public int maxGeometryInputComponentsAt(long index) { return (int) VH_maxGeometryInputComponents.get(this.segment(), 0L, index); }
    public int maxGeometryOutputComponentsAt(long index) { return (int) VH_maxGeometryOutputComponents.get(this.segment(), 0L, index); }
    public int maxGeometryOutputVerticesAt(long index) { return (int) VH_maxGeometryOutputVertices.get(this.segment(), 0L, index); }
    public int maxGeometryTotalOutputComponentsAt(long index) { return (int) VH_maxGeometryTotalOutputComponents.get(this.segment(), 0L, index); }
    public int maxFragmentInputComponentsAt(long index) { return (int) VH_maxFragmentInputComponents.get(this.segment(), 0L, index); }
    public int maxFragmentOutputAttachmentsAt(long index) { return (int) VH_maxFragmentOutputAttachments.get(this.segment(), 0L, index); }
    public int maxFragmentDualSrcAttachmentsAt(long index) { return (int) VH_maxFragmentDualSrcAttachments.get(this.segment(), 0L, index); }
    public int maxFragmentCombinedOutputResourcesAt(long index) { return (int) VH_maxFragmentCombinedOutputResources.get(this.segment(), 0L, index); }
    public int maxComputeSharedMemorySizeAt(long index) { return (int) VH_maxComputeSharedMemorySize.get(this.segment(), 0L, index); }
    public int maxComputeWorkGroupCountAt(long index, long index0) { return (int) VH_maxComputeWorkGroupCount.get(this.segment(), 0L, index, index0); }
    public int maxComputeWorkGroupInvocationsAt(long index) { return (int) VH_maxComputeWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int maxComputeWorkGroupSizeAt(long index, long index0) { return (int) VH_maxComputeWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int subPixelPrecisionBitsAt(long index) { return (int) VH_subPixelPrecisionBits.get(this.segment(), 0L, index); }
    public int subTexelPrecisionBitsAt(long index) { return (int) VH_subTexelPrecisionBits.get(this.segment(), 0L, index); }
    public int mipmapPrecisionBitsAt(long index) { return (int) VH_mipmapPrecisionBits.get(this.segment(), 0L, index); }
    public int maxDrawIndexedIndexValueAt(long index) { return (int) VH_maxDrawIndexedIndexValue.get(this.segment(), 0L, index); }
    public int maxDrawIndirectCountAt(long index) { return (int) VH_maxDrawIndirectCount.get(this.segment(), 0L, index); }
    public float maxSamplerLodBiasAt(long index) { return (float) VH_maxSamplerLodBias.get(this.segment(), 0L, index); }
    public float maxSamplerAnisotropyAt(long index) { return (float) VH_maxSamplerAnisotropy.get(this.segment(), 0L, index); }
    public int maxViewportsAt(long index) { return (int) VH_maxViewports.get(this.segment(), 0L, index); }
    public int maxViewportDimensionsAt(long index, long index0) { return (int) VH_maxViewportDimensions.get(this.segment(), 0L, index, index0); }
    public float viewportBoundsRangeAt(long index, long index0) { return (float) VH_viewportBoundsRange.get(this.segment(), 0L, index, index0); }
    public int viewportSubPixelBitsAt(long index) { return (int) VH_viewportSubPixelBits.get(this.segment(), 0L, index); }
    public long minMemoryMapAlignmentAt(long index) { return (long) VH_minMemoryMapAlignment.get(this.segment(), 0L, index); }
    public long minTexelBufferOffsetAlignmentAt(long index) { return (long) VH_minTexelBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long minUniformBufferOffsetAlignmentAt(long index) { return (long) VH_minUniformBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long minStorageBufferOffsetAlignmentAt(long index) { return (long) VH_minStorageBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int minTexelOffsetAt(long index) { return (int) VH_minTexelOffset.get(this.segment(), 0L, index); }
    public int maxTexelOffsetAt(long index) { return (int) VH_maxTexelOffset.get(this.segment(), 0L, index); }
    public int minTexelGatherOffsetAt(long index) { return (int) VH_minTexelGatherOffset.get(this.segment(), 0L, index); }
    public int maxTexelGatherOffsetAt(long index) { return (int) VH_maxTexelGatherOffset.get(this.segment(), 0L, index); }
    public float minInterpolationOffsetAt(long index) { return (float) VH_minInterpolationOffset.get(this.segment(), 0L, index); }
    public float maxInterpolationOffsetAt(long index) { return (float) VH_maxInterpolationOffset.get(this.segment(), 0L, index); }
    public int subPixelInterpolationOffsetBitsAt(long index) { return (int) VH_subPixelInterpolationOffsetBits.get(this.segment(), 0L, index); }
    public int maxFramebufferWidthAt(long index) { return (int) VH_maxFramebufferWidth.get(this.segment(), 0L, index); }
    public int maxFramebufferHeightAt(long index) { return (int) VH_maxFramebufferHeight.get(this.segment(), 0L, index); }
    public int maxFramebufferLayersAt(long index) { return (int) VH_maxFramebufferLayers.get(this.segment(), 0L, index); }
    public int framebufferColorSampleCountsAt(long index) { return (int) VH_framebufferColorSampleCounts.get(this.segment(), 0L, index); }
    public int framebufferDepthSampleCountsAt(long index) { return (int) VH_framebufferDepthSampleCounts.get(this.segment(), 0L, index); }
    public int framebufferStencilSampleCountsAt(long index) { return (int) VH_framebufferStencilSampleCounts.get(this.segment(), 0L, index); }
    public int framebufferNoAttachmentsSampleCountsAt(long index) { return (int) VH_framebufferNoAttachmentsSampleCounts.get(this.segment(), 0L, index); }
    public int maxColorAttachmentsAt(long index) { return (int) VH_maxColorAttachments.get(this.segment(), 0L, index); }
    public int sampledImageColorSampleCountsAt(long index) { return (int) VH_sampledImageColorSampleCounts.get(this.segment(), 0L, index); }
    public int sampledImageIntegerSampleCountsAt(long index) { return (int) VH_sampledImageIntegerSampleCounts.get(this.segment(), 0L, index); }
    public int sampledImageDepthSampleCountsAt(long index) { return (int) VH_sampledImageDepthSampleCounts.get(this.segment(), 0L, index); }
    public int sampledImageStencilSampleCountsAt(long index) { return (int) VH_sampledImageStencilSampleCounts.get(this.segment(), 0L, index); }
    public int storageImageSampleCountsAt(long index) { return (int) VH_storageImageSampleCounts.get(this.segment(), 0L, index); }
    public int maxSampleMaskWordsAt(long index) { return (int) VH_maxSampleMaskWords.get(this.segment(), 0L, index); }
    public int timestampComputeAndGraphicsAt(long index) { return (int) VH_timestampComputeAndGraphics.get(this.segment(), 0L, index); }
    public float timestampPeriodAt(long index) { return (float) VH_timestampPeriod.get(this.segment(), 0L, index); }
    public int maxClipDistancesAt(long index) { return (int) VH_maxClipDistances.get(this.segment(), 0L, index); }
    public int maxCullDistancesAt(long index) { return (int) VH_maxCullDistances.get(this.segment(), 0L, index); }
    public int maxCombinedClipAndCullDistancesAt(long index) { return (int) VH_maxCombinedClipAndCullDistances.get(this.segment(), 0L, index); }
    public int discreteQueuePrioritiesAt(long index) { return (int) VH_discreteQueuePriorities.get(this.segment(), 0L, index); }
    public float pointSizeRangeAt(long index, long index0) { return (float) VH_pointSizeRange.get(this.segment(), 0L, index, index0); }
    public float lineWidthRangeAt(long index, long index0) { return (float) VH_lineWidthRange.get(this.segment(), 0L, index, index0); }
    public float pointSizeGranularityAt(long index) { return (float) VH_pointSizeGranularity.get(this.segment(), 0L, index); }
    public float lineWidthGranularityAt(long index) { return (float) VH_lineWidthGranularity.get(this.segment(), 0L, index); }
    public int strictLinesAt(long index) { return (int) VH_strictLines.get(this.segment(), 0L, index); }
    public int standardSampleLocationsAt(long index) { return (int) VH_standardSampleLocations.get(this.segment(), 0L, index); }
    public long optimalBufferCopyOffsetAlignmentAt(long index) { return (long) VH_optimalBufferCopyOffsetAlignment.get(this.segment(), 0L, index); }
    public long optimalBufferCopyRowPitchAlignmentAt(long index) { return (long) VH_optimalBufferCopyRowPitchAlignment.get(this.segment(), 0L, index); }
    public long nonCoherentAtomSizeAt(long index) { return (long) VH_nonCoherentAtomSize.get(this.segment(), 0L, index); }
    public int maxImageDimension1D() { return (int) VH_maxImageDimension1D.get(this.segment(), 0L, 0L); }
    public int maxImageDimension2D() { return (int) VH_maxImageDimension2D.get(this.segment(), 0L, 0L); }
    public int maxImageDimension3D() { return (int) VH_maxImageDimension3D.get(this.segment(), 0L, 0L); }
    public int maxImageDimensionCube() { return (int) VH_maxImageDimensionCube.get(this.segment(), 0L, 0L); }
    public int maxImageArrayLayers() { return (int) VH_maxImageArrayLayers.get(this.segment(), 0L, 0L); }
    public int maxTexelBufferElements() { return (int) VH_maxTexelBufferElements.get(this.segment(), 0L, 0L); }
    public int maxUniformBufferRange() { return (int) VH_maxUniformBufferRange.get(this.segment(), 0L, 0L); }
    public int maxStorageBufferRange() { return (int) VH_maxStorageBufferRange.get(this.segment(), 0L, 0L); }
    public int maxPushConstantsSize() { return (int) VH_maxPushConstantsSize.get(this.segment(), 0L, 0L); }
    public int maxMemoryAllocationCount() { return (int) VH_maxMemoryAllocationCount.get(this.segment(), 0L, 0L); }
    public int maxSamplerAllocationCount() { return (int) VH_maxSamplerAllocationCount.get(this.segment(), 0L, 0L); }
    public long bufferImageGranularity() { return (long) VH_bufferImageGranularity.get(this.segment(), 0L, 0L); }
    public long sparseAddressSpaceSize() { return (long) VH_sparseAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public int maxBoundDescriptorSets() { return (int) VH_maxBoundDescriptorSets.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorSamplers() { return (int) VH_maxPerStageDescriptorSamplers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorUniformBuffers() { return (int) VH_maxPerStageDescriptorUniformBuffers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorStorageBuffers() { return (int) VH_maxPerStageDescriptorStorageBuffers.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorSampledImages() { return (int) VH_maxPerStageDescriptorSampledImages.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorStorageImages() { return (int) VH_maxPerStageDescriptorStorageImages.get(this.segment(), 0L, 0L); }
    public int maxPerStageDescriptorInputAttachments() { return (int) VH_maxPerStageDescriptorInputAttachments.get(this.segment(), 0L, 0L); }
    public int maxPerStageResources() { return (int) VH_maxPerStageResources.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetSamplers() { return (int) VH_maxDescriptorSetSamplers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUniformBuffers() { return (int) VH_maxDescriptorSetUniformBuffers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetUniformBuffersDynamic() { return (int) VH_maxDescriptorSetUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetStorageBuffers() { return (int) VH_maxDescriptorSetStorageBuffers.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetStorageBuffersDynamic() { return (int) VH_maxDescriptorSetStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetSampledImages() { return (int) VH_maxDescriptorSetSampledImages.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetStorageImages() { return (int) VH_maxDescriptorSetStorageImages.get(this.segment(), 0L, 0L); }
    public int maxDescriptorSetInputAttachments() { return (int) VH_maxDescriptorSetInputAttachments.get(this.segment(), 0L, 0L); }
    public int maxVertexInputAttributes() { return (int) VH_maxVertexInputAttributes.get(this.segment(), 0L, 0L); }
    public int maxVertexInputBindings() { return (int) VH_maxVertexInputBindings.get(this.segment(), 0L, 0L); }
    public int maxVertexInputAttributeOffset() { return (int) VH_maxVertexInputAttributeOffset.get(this.segment(), 0L, 0L); }
    public int maxVertexInputBindingStride() { return (int) VH_maxVertexInputBindingStride.get(this.segment(), 0L, 0L); }
    public int maxVertexOutputComponents() { return (int) VH_maxVertexOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxTessellationGenerationLevel() { return (int) VH_maxTessellationGenerationLevel.get(this.segment(), 0L, 0L); }
    public int maxTessellationPatchSize() { return (int) VH_maxTessellationPatchSize.get(this.segment(), 0L, 0L); }
    public int maxTessellationControlPerVertexInputComponents() { return (int) VH_maxTessellationControlPerVertexInputComponents.get(this.segment(), 0L, 0L); }
    public int maxTessellationControlPerVertexOutputComponents() { return (int) VH_maxTessellationControlPerVertexOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxTessellationControlPerPatchOutputComponents() { return (int) VH_maxTessellationControlPerPatchOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxTessellationControlTotalOutputComponents() { return (int) VH_maxTessellationControlTotalOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxTessellationEvaluationInputComponents() { return (int) VH_maxTessellationEvaluationInputComponents.get(this.segment(), 0L, 0L); }
    public int maxTessellationEvaluationOutputComponents() { return (int) VH_maxTessellationEvaluationOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxGeometryShaderInvocations() { return (int) VH_maxGeometryShaderInvocations.get(this.segment(), 0L, 0L); }
    public int maxGeometryInputComponents() { return (int) VH_maxGeometryInputComponents.get(this.segment(), 0L, 0L); }
    public int maxGeometryOutputComponents() { return (int) VH_maxGeometryOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxGeometryOutputVertices() { return (int) VH_maxGeometryOutputVertices.get(this.segment(), 0L, 0L); }
    public int maxGeometryTotalOutputComponents() { return (int) VH_maxGeometryTotalOutputComponents.get(this.segment(), 0L, 0L); }
    public int maxFragmentInputComponents() { return (int) VH_maxFragmentInputComponents.get(this.segment(), 0L, 0L); }
    public int maxFragmentOutputAttachments() { return (int) VH_maxFragmentOutputAttachments.get(this.segment(), 0L, 0L); }
    public int maxFragmentDualSrcAttachments() { return (int) VH_maxFragmentDualSrcAttachments.get(this.segment(), 0L, 0L); }
    public int maxFragmentCombinedOutputResources() { return (int) VH_maxFragmentCombinedOutputResources.get(this.segment(), 0L, 0L); }
    public int maxComputeSharedMemorySize() { return (int) VH_maxComputeSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int maxComputeWorkGroupCount(long index0) { return (int) VH_maxComputeWorkGroupCount.get(this.segment(), 0L, 0L, index0); }
    public int maxComputeWorkGroupInvocations() { return (int) VH_maxComputeWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int maxComputeWorkGroupSize(long index0) { return (int) VH_maxComputeWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int subPixelPrecisionBits() { return (int) VH_subPixelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int subTexelPrecisionBits() { return (int) VH_subTexelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int mipmapPrecisionBits() { return (int) VH_mipmapPrecisionBits.get(this.segment(), 0L, 0L); }
    public int maxDrawIndexedIndexValue() { return (int) VH_maxDrawIndexedIndexValue.get(this.segment(), 0L, 0L); }
    public int maxDrawIndirectCount() { return (int) VH_maxDrawIndirectCount.get(this.segment(), 0L, 0L); }
    public float maxSamplerLodBias() { return (float) VH_maxSamplerLodBias.get(this.segment(), 0L, 0L); }
    public float maxSamplerAnisotropy() { return (float) VH_maxSamplerAnisotropy.get(this.segment(), 0L, 0L); }
    public int maxViewports() { return (int) VH_maxViewports.get(this.segment(), 0L, 0L); }
    public int maxViewportDimensions(long index0) { return (int) VH_maxViewportDimensions.get(this.segment(), 0L, 0L, index0); }
    public float viewportBoundsRange(long index0) { return (float) VH_viewportBoundsRange.get(this.segment(), 0L, 0L, index0); }
    public int viewportSubPixelBits() { return (int) VH_viewportSubPixelBits.get(this.segment(), 0L, 0L); }
    public long minMemoryMapAlignment() { return (long) VH_minMemoryMapAlignment.get(this.segment(), 0L, 0L); }
    public long minTexelBufferOffsetAlignment() { return (long) VH_minTexelBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long minUniformBufferOffsetAlignment() { return (long) VH_minUniformBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long minStorageBufferOffsetAlignment() { return (long) VH_minStorageBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public int minTexelOffset() { return (int) VH_minTexelOffset.get(this.segment(), 0L, 0L); }
    public int maxTexelOffset() { return (int) VH_maxTexelOffset.get(this.segment(), 0L, 0L); }
    public int minTexelGatherOffset() { return (int) VH_minTexelGatherOffset.get(this.segment(), 0L, 0L); }
    public int maxTexelGatherOffset() { return (int) VH_maxTexelGatherOffset.get(this.segment(), 0L, 0L); }
    public float minInterpolationOffset() { return (float) VH_minInterpolationOffset.get(this.segment(), 0L, 0L); }
    public float maxInterpolationOffset() { return (float) VH_maxInterpolationOffset.get(this.segment(), 0L, 0L); }
    public int subPixelInterpolationOffsetBits() { return (int) VH_subPixelInterpolationOffsetBits.get(this.segment(), 0L, 0L); }
    public int maxFramebufferWidth() { return (int) VH_maxFramebufferWidth.get(this.segment(), 0L, 0L); }
    public int maxFramebufferHeight() { return (int) VH_maxFramebufferHeight.get(this.segment(), 0L, 0L); }
    public int maxFramebufferLayers() { return (int) VH_maxFramebufferLayers.get(this.segment(), 0L, 0L); }
    public int framebufferColorSampleCounts() { return (int) VH_framebufferColorSampleCounts.get(this.segment(), 0L, 0L); }
    public int framebufferDepthSampleCounts() { return (int) VH_framebufferDepthSampleCounts.get(this.segment(), 0L, 0L); }
    public int framebufferStencilSampleCounts() { return (int) VH_framebufferStencilSampleCounts.get(this.segment(), 0L, 0L); }
    public int framebufferNoAttachmentsSampleCounts() { return (int) VH_framebufferNoAttachmentsSampleCounts.get(this.segment(), 0L, 0L); }
    public int maxColorAttachments() { return (int) VH_maxColorAttachments.get(this.segment(), 0L, 0L); }
    public int sampledImageColorSampleCounts() { return (int) VH_sampledImageColorSampleCounts.get(this.segment(), 0L, 0L); }
    public int sampledImageIntegerSampleCounts() { return (int) VH_sampledImageIntegerSampleCounts.get(this.segment(), 0L, 0L); }
    public int sampledImageDepthSampleCounts() { return (int) VH_sampledImageDepthSampleCounts.get(this.segment(), 0L, 0L); }
    public int sampledImageStencilSampleCounts() { return (int) VH_sampledImageStencilSampleCounts.get(this.segment(), 0L, 0L); }
    public int storageImageSampleCounts() { return (int) VH_storageImageSampleCounts.get(this.segment(), 0L, 0L); }
    public int maxSampleMaskWords() { return (int) VH_maxSampleMaskWords.get(this.segment(), 0L, 0L); }
    public int timestampComputeAndGraphics() { return (int) VH_timestampComputeAndGraphics.get(this.segment(), 0L, 0L); }
    public float timestampPeriod() { return (float) VH_timestampPeriod.get(this.segment(), 0L, 0L); }
    public int maxClipDistances() { return (int) VH_maxClipDistances.get(this.segment(), 0L, 0L); }
    public int maxCullDistances() { return (int) VH_maxCullDistances.get(this.segment(), 0L, 0L); }
    public int maxCombinedClipAndCullDistances() { return (int) VH_maxCombinedClipAndCullDistances.get(this.segment(), 0L, 0L); }
    public int discreteQueuePriorities() { return (int) VH_discreteQueuePriorities.get(this.segment(), 0L, 0L); }
    public float pointSizeRange(long index0) { return (float) VH_pointSizeRange.get(this.segment(), 0L, 0L, index0); }
    public float lineWidthRange(long index0) { return (float) VH_lineWidthRange.get(this.segment(), 0L, 0L, index0); }
    public float pointSizeGranularity() { return (float) VH_pointSizeGranularity.get(this.segment(), 0L, 0L); }
    public float lineWidthGranularity() { return (float) VH_lineWidthGranularity.get(this.segment(), 0L, 0L); }
    public int strictLines() { return (int) VH_strictLines.get(this.segment(), 0L, 0L); }
    public int standardSampleLocations() { return (int) VH_standardSampleLocations.get(this.segment(), 0L, 0L); }
    public long optimalBufferCopyOffsetAlignment() { return (long) VH_optimalBufferCopyOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long optimalBufferCopyRowPitchAlignment() { return (long) VH_optimalBufferCopyRowPitchAlignment.get(this.segment(), 0L, 0L); }
    public long nonCoherentAtomSize() { return (long) VH_nonCoherentAtomSize.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceLimits maxImageDimension1DAt(long index, int value) { VH_maxImageDimension1D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimension2DAt(long index, int value) { VH_maxImageDimension2D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimension3DAt(long index, int value) { VH_maxImageDimension3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimensionCubeAt(long index, int value) { VH_maxImageDimensionCube.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxImageArrayLayersAt(long index, int value) { VH_maxImageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTexelBufferElementsAt(long index, int value) { VH_maxTexelBufferElements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxUniformBufferRangeAt(long index, int value) { VH_maxUniformBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxStorageBufferRangeAt(long index, int value) { VH_maxStorageBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPushConstantsSizeAt(long index, int value) { VH_maxPushConstantsSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxMemoryAllocationCountAt(long index, int value) { VH_maxMemoryAllocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxSamplerAllocationCountAt(long index, int value) { VH_maxSamplerAllocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits bufferImageGranularityAt(long index, long value) { VH_bufferImageGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits sparseAddressSpaceSizeAt(long index, long value) { VH_sparseAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxBoundDescriptorSetsAt(long index, int value) { VH_maxBoundDescriptorSets.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorSamplersAt(long index, int value) { VH_maxPerStageDescriptorSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffersAt(long index, int value) { VH_maxPerStageDescriptorUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffersAt(long index, int value) { VH_maxPerStageDescriptorStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImagesAt(long index, int value) { VH_maxPerStageDescriptorSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImagesAt(long index, int value) { VH_maxPerStageDescriptorStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachmentsAt(long index, int value) { VH_maxPerStageDescriptorInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageResourcesAt(long index, int value) { VH_maxPerStageResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetSamplersAt(long index, int value) { VH_maxDescriptorSetSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersAt(long index, int value) { VH_maxDescriptorSetUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersAt(long index, int value) { VH_maxDescriptorSetStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamicAt(long index, int value) { VH_maxDescriptorSetStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetSampledImagesAt(long index, int value) { VH_maxDescriptorSetSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetStorageImagesAt(long index, int value) { VH_maxDescriptorSetStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetInputAttachmentsAt(long index, int value) { VH_maxDescriptorSetInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputAttributesAt(long index, int value) { VH_maxVertexInputAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputBindingsAt(long index, int value) { VH_maxVertexInputBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputAttributeOffsetAt(long index, int value) { VH_maxVertexInputAttributeOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputBindingStrideAt(long index, int value) { VH_maxVertexInputBindingStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxVertexOutputComponentsAt(long index, int value) { VH_maxVertexOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationGenerationLevelAt(long index, int value) { VH_maxTessellationGenerationLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationPatchSizeAt(long index, int value) { VH_maxTessellationPatchSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponentsAt(long index, int value) { VH_maxTessellationControlPerVertexInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponentsAt(long index, int value) { VH_maxTessellationControlPerVertexOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponentsAt(long index, int value) { VH_maxTessellationControlPerPatchOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponentsAt(long index, int value) { VH_maxTessellationControlTotalOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponentsAt(long index, int value) { VH_maxTessellationEvaluationInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponentsAt(long index, int value) { VH_maxTessellationEvaluationOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryShaderInvocationsAt(long index, int value) { VH_maxGeometryShaderInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryInputComponentsAt(long index, int value) { VH_maxGeometryInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryOutputComponentsAt(long index, int value) { VH_maxGeometryOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryOutputVerticesAt(long index, int value) { VH_maxGeometryOutputVertices.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryTotalOutputComponentsAt(long index, int value) { VH_maxGeometryTotalOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentInputComponentsAt(long index, int value) { VH_maxFragmentInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentOutputAttachmentsAt(long index, int value) { VH_maxFragmentOutputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentDualSrcAttachmentsAt(long index, int value) { VH_maxFragmentDualSrcAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentCombinedOutputResourcesAt(long index, int value) { VH_maxFragmentCombinedOutputResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxComputeSharedMemorySizeAt(long index, int value) { VH_maxComputeSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxComputeWorkGroupCountAt(long index, long index0, int value) { VH_maxComputeWorkGroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLimits maxComputeWorkGroupInvocationsAt(long index, int value) { VH_maxComputeWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxComputeWorkGroupSizeAt(long index, long index0, int value) { VH_maxComputeWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLimits subPixelPrecisionBitsAt(long index, int value) { VH_subPixelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits subTexelPrecisionBitsAt(long index, int value) { VH_subTexelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits mipmapPrecisionBitsAt(long index, int value) { VH_mipmapPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDrawIndexedIndexValueAt(long index, int value) { VH_maxDrawIndexedIndexValue.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxDrawIndirectCountAt(long index, int value) { VH_maxDrawIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxSamplerLodBiasAt(long index, float value) { VH_maxSamplerLodBias.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxSamplerAnisotropyAt(long index, float value) { VH_maxSamplerAnisotropy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxViewportsAt(long index, int value) { VH_maxViewports.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxViewportDimensionsAt(long index, long index0, int value) { VH_maxViewportDimensions.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLimits viewportBoundsRangeAt(long index, long index0, float value) { VH_viewportBoundsRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLimits viewportSubPixelBitsAt(long index, int value) { VH_viewportSubPixelBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minMemoryMapAlignmentAt(long index, long value) { VH_minMemoryMapAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minTexelBufferOffsetAlignmentAt(long index, long value) { VH_minTexelBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minUniformBufferOffsetAlignmentAt(long index, long value) { VH_minUniformBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minStorageBufferOffsetAlignmentAt(long index, long value) { VH_minStorageBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minTexelOffsetAt(long index, int value) { VH_minTexelOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTexelOffsetAt(long index, int value) { VH_maxTexelOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minTexelGatherOffsetAt(long index, int value) { VH_minTexelGatherOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxTexelGatherOffsetAt(long index, int value) { VH_maxTexelGatherOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits minInterpolationOffsetAt(long index, float value) { VH_minInterpolationOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxInterpolationOffsetAt(long index, float value) { VH_maxInterpolationOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits subPixelInterpolationOffsetBitsAt(long index, int value) { VH_subPixelInterpolationOffsetBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFramebufferWidthAt(long index, int value) { VH_maxFramebufferWidth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFramebufferHeightAt(long index, int value) { VH_maxFramebufferHeight.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxFramebufferLayersAt(long index, int value) { VH_maxFramebufferLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits framebufferColorSampleCountsAt(long index, int value) { VH_framebufferColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits framebufferDepthSampleCountsAt(long index, int value) { VH_framebufferDepthSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits framebufferStencilSampleCountsAt(long index, int value) { VH_framebufferStencilSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCountsAt(long index, int value) { VH_framebufferNoAttachmentsSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxColorAttachmentsAt(long index, int value) { VH_maxColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits sampledImageColorSampleCountsAt(long index, int value) { VH_sampledImageColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits sampledImageIntegerSampleCountsAt(long index, int value) { VH_sampledImageIntegerSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits sampledImageDepthSampleCountsAt(long index, int value) { VH_sampledImageDepthSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits sampledImageStencilSampleCountsAt(long index, int value) { VH_sampledImageStencilSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits storageImageSampleCountsAt(long index, int value) { VH_storageImageSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxSampleMaskWordsAt(long index, int value) { VH_maxSampleMaskWords.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits timestampComputeAndGraphicsAt(long index, int value) { VH_timestampComputeAndGraphics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits timestampPeriodAt(long index, float value) { VH_timestampPeriod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxClipDistancesAt(long index, int value) { VH_maxClipDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxCullDistancesAt(long index, int value) { VH_maxCullDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxCombinedClipAndCullDistancesAt(long index, int value) { VH_maxCombinedClipAndCullDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits discreteQueuePrioritiesAt(long index, int value) { VH_discreteQueuePriorities.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits pointSizeRangeAt(long index, long index0, float value) { VH_pointSizeRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLimits lineWidthRangeAt(long index, long index0, float value) { VH_lineWidthRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceLimits pointSizeGranularityAt(long index, float value) { VH_pointSizeGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits lineWidthGranularityAt(long index, float value) { VH_lineWidthGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits strictLinesAt(long index, int value) { VH_strictLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits standardSampleLocationsAt(long index, int value) { VH_standardSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignmentAt(long index, long value) { VH_optimalBufferCopyOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignmentAt(long index, long value) { VH_optimalBufferCopyRowPitchAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits nonCoherentAtomSizeAt(long index, long value) { VH_nonCoherentAtomSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimension1D(int value) { VH_maxImageDimension1D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimension2D(int value) { VH_maxImageDimension2D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimension3D(int value) { VH_maxImageDimension3D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxImageDimensionCube(int value) { VH_maxImageDimensionCube.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxImageArrayLayers(int value) { VH_maxImageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTexelBufferElements(int value) { VH_maxTexelBufferElements.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxUniformBufferRange(int value) { VH_maxUniformBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxStorageBufferRange(int value) { VH_maxStorageBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPushConstantsSize(int value) { VH_maxPushConstantsSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxMemoryAllocationCount(int value) { VH_maxMemoryAllocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxSamplerAllocationCount(int value) { VH_maxSamplerAllocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits bufferImageGranularity(long value) { VH_bufferImageGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits sparseAddressSpaceSize(long value) { VH_sparseAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxBoundDescriptorSets(int value) { VH_maxBoundDescriptorSets.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorSamplers(int value) { VH_maxPerStageDescriptorSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffers(int value) { VH_maxPerStageDescriptorUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffers(int value) { VH_maxPerStageDescriptorStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImages(int value) { VH_maxPerStageDescriptorSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImages(int value) { VH_maxPerStageDescriptorStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachments(int value) { VH_maxPerStageDescriptorInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxPerStageResources(int value) { VH_maxPerStageResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetSamplers(int value) { VH_maxDescriptorSetSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffers(int value) { VH_maxDescriptorSetUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamic(int value) { VH_maxDescriptorSetUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffers(int value) { VH_maxDescriptorSetStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamic(int value) { VH_maxDescriptorSetStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetSampledImages(int value) { VH_maxDescriptorSetSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetStorageImages(int value) { VH_maxDescriptorSetStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDescriptorSetInputAttachments(int value) { VH_maxDescriptorSetInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputAttributes(int value) { VH_maxVertexInputAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputBindings(int value) { VH_maxVertexInputBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputAttributeOffset(int value) { VH_maxVertexInputAttributeOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxVertexInputBindingStride(int value) { VH_maxVertexInputBindingStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxVertexOutputComponents(int value) { VH_maxVertexOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationGenerationLevel(int value) { VH_maxTessellationGenerationLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationPatchSize(int value) { VH_maxTessellationPatchSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponents(int value) { VH_maxTessellationControlPerVertexInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponents(int value) { VH_maxTessellationControlPerVertexOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponents(int value) { VH_maxTessellationControlPerPatchOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponents(int value) { VH_maxTessellationControlTotalOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponents(int value) { VH_maxTessellationEvaluationInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponents(int value) { VH_maxTessellationEvaluationOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryShaderInvocations(int value) { VH_maxGeometryShaderInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryInputComponents(int value) { VH_maxGeometryInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryOutputComponents(int value) { VH_maxGeometryOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryOutputVertices(int value) { VH_maxGeometryOutputVertices.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxGeometryTotalOutputComponents(int value) { VH_maxGeometryTotalOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentInputComponents(int value) { VH_maxFragmentInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentOutputAttachments(int value) { VH_maxFragmentOutputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentDualSrcAttachments(int value) { VH_maxFragmentDualSrcAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFragmentCombinedOutputResources(int value) { VH_maxFragmentCombinedOutputResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxComputeSharedMemorySize(int value) { VH_maxComputeSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxComputeWorkGroupCount(long index0, int value) { VH_maxComputeWorkGroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceLimits maxComputeWorkGroupInvocations(int value) { VH_maxComputeWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxComputeWorkGroupSize(long index0, int value) { VH_maxComputeWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceLimits subPixelPrecisionBits(int value) { VH_subPixelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits subTexelPrecisionBits(int value) { VH_subTexelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits mipmapPrecisionBits(int value) { VH_mipmapPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDrawIndexedIndexValue(int value) { VH_maxDrawIndexedIndexValue.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxDrawIndirectCount(int value) { VH_maxDrawIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxSamplerLodBias(float value) { VH_maxSamplerLodBias.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxSamplerAnisotropy(float value) { VH_maxSamplerAnisotropy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxViewports(int value) { VH_maxViewports.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxViewportDimensions(long index0, int value) { VH_maxViewportDimensions.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceLimits viewportBoundsRange(long index0, float value) { VH_viewportBoundsRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceLimits viewportSubPixelBits(int value) { VH_viewportSubPixelBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minMemoryMapAlignment(long value) { VH_minMemoryMapAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minTexelBufferOffsetAlignment(long value) { VH_minTexelBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minUniformBufferOffsetAlignment(long value) { VH_minUniformBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minStorageBufferOffsetAlignment(long value) { VH_minStorageBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minTexelOffset(int value) { VH_minTexelOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTexelOffset(int value) { VH_maxTexelOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minTexelGatherOffset(int value) { VH_minTexelGatherOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxTexelGatherOffset(int value) { VH_maxTexelGatherOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits minInterpolationOffset(float value) { VH_minInterpolationOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxInterpolationOffset(float value) { VH_maxInterpolationOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits subPixelInterpolationOffsetBits(int value) { VH_subPixelInterpolationOffsetBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFramebufferWidth(int value) { VH_maxFramebufferWidth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFramebufferHeight(int value) { VH_maxFramebufferHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxFramebufferLayers(int value) { VH_maxFramebufferLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits framebufferColorSampleCounts(int value) { VH_framebufferColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits framebufferDepthSampleCounts(int value) { VH_framebufferDepthSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits framebufferStencilSampleCounts(int value) { VH_framebufferStencilSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCounts(int value) { VH_framebufferNoAttachmentsSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxColorAttachments(int value) { VH_maxColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits sampledImageColorSampleCounts(int value) { VH_sampledImageColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits sampledImageIntegerSampleCounts(int value) { VH_sampledImageIntegerSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits sampledImageDepthSampleCounts(int value) { VH_sampledImageDepthSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits sampledImageStencilSampleCounts(int value) { VH_sampledImageStencilSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits storageImageSampleCounts(int value) { VH_storageImageSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxSampleMaskWords(int value) { VH_maxSampleMaskWords.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits timestampComputeAndGraphics(int value) { VH_timestampComputeAndGraphics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits timestampPeriod(float value) { VH_timestampPeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxClipDistances(int value) { VH_maxClipDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxCullDistances(int value) { VH_maxCullDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits maxCombinedClipAndCullDistances(int value) { VH_maxCombinedClipAndCullDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits discreteQueuePriorities(int value) { VH_discreteQueuePriorities.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits pointSizeRange(long index0, float value) { VH_pointSizeRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceLimits lineWidthRange(long index0, float value) { VH_lineWidthRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceLimits pointSizeGranularity(float value) { VH_pointSizeGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits lineWidthGranularity(float value) { VH_lineWidthGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits strictLines(int value) { VH_strictLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits standardSampleLocations(int value) { VH_standardSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignment(long value) { VH_optimalBufferCopyOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignment(long value) { VH_optimalBufferCopyRowPitchAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceLimits nonCoherentAtomSize(long value) { VH_nonCoherentAtomSize.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _maxImageDimension1DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageDimension1D, index), LAYOUT_maxImageDimension1D); }
    public MemorySegment _maxImageDimension1D() { return _maxImageDimension1DAt(0L); }
    public VkPhysicalDeviceLimits _maxImageDimension1DAt(long index, MemorySegment src) { _maxImageDimension1DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxImageDimension1D(MemorySegment src) { return _maxImageDimension1DAt(0L, src); }
    public MemorySegment _maxImageDimension2DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageDimension2D, index), LAYOUT_maxImageDimension2D); }
    public MemorySegment _maxImageDimension2D() { return _maxImageDimension2DAt(0L); }
    public VkPhysicalDeviceLimits _maxImageDimension2DAt(long index, MemorySegment src) { _maxImageDimension2DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxImageDimension2D(MemorySegment src) { return _maxImageDimension2DAt(0L, src); }
    public MemorySegment _maxImageDimension3DAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageDimension3D, index), LAYOUT_maxImageDimension3D); }
    public MemorySegment _maxImageDimension3D() { return _maxImageDimension3DAt(0L); }
    public VkPhysicalDeviceLimits _maxImageDimension3DAt(long index, MemorySegment src) { _maxImageDimension3DAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxImageDimension3D(MemorySegment src) { return _maxImageDimension3DAt(0L, src); }
    public MemorySegment _maxImageDimensionCubeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageDimensionCube, index), LAYOUT_maxImageDimensionCube); }
    public MemorySegment _maxImageDimensionCube() { return _maxImageDimensionCubeAt(0L); }
    public VkPhysicalDeviceLimits _maxImageDimensionCubeAt(long index, MemorySegment src) { _maxImageDimensionCubeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxImageDimensionCube(MemorySegment src) { return _maxImageDimensionCubeAt(0L, src); }
    public MemorySegment _maxImageArrayLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxImageArrayLayers, index), LAYOUT_maxImageArrayLayers); }
    public MemorySegment _maxImageArrayLayers() { return _maxImageArrayLayersAt(0L); }
    public VkPhysicalDeviceLimits _maxImageArrayLayersAt(long index, MemorySegment src) { _maxImageArrayLayersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxImageArrayLayers(MemorySegment src) { return _maxImageArrayLayersAt(0L, src); }
    public MemorySegment _maxTexelBufferElementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTexelBufferElements, index), LAYOUT_maxTexelBufferElements); }
    public MemorySegment _maxTexelBufferElements() { return _maxTexelBufferElementsAt(0L); }
    public VkPhysicalDeviceLimits _maxTexelBufferElementsAt(long index, MemorySegment src) { _maxTexelBufferElementsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTexelBufferElements(MemorySegment src) { return _maxTexelBufferElementsAt(0L, src); }
    public MemorySegment _maxUniformBufferRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxUniformBufferRange, index), LAYOUT_maxUniformBufferRange); }
    public MemorySegment _maxUniformBufferRange() { return _maxUniformBufferRangeAt(0L); }
    public VkPhysicalDeviceLimits _maxUniformBufferRangeAt(long index, MemorySegment src) { _maxUniformBufferRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxUniformBufferRange(MemorySegment src) { return _maxUniformBufferRangeAt(0L, src); }
    public MemorySegment _maxStorageBufferRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxStorageBufferRange, index), LAYOUT_maxStorageBufferRange); }
    public MemorySegment _maxStorageBufferRange() { return _maxStorageBufferRangeAt(0L); }
    public VkPhysicalDeviceLimits _maxStorageBufferRangeAt(long index, MemorySegment src) { _maxStorageBufferRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxStorageBufferRange(MemorySegment src) { return _maxStorageBufferRangeAt(0L, src); }
    public MemorySegment _maxPushConstantsSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPushConstantsSize, index), LAYOUT_maxPushConstantsSize); }
    public MemorySegment _maxPushConstantsSize() { return _maxPushConstantsSizeAt(0L); }
    public VkPhysicalDeviceLimits _maxPushConstantsSizeAt(long index, MemorySegment src) { _maxPushConstantsSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPushConstantsSize(MemorySegment src) { return _maxPushConstantsSizeAt(0L, src); }
    public MemorySegment _maxMemoryAllocationCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxMemoryAllocationCount, index), LAYOUT_maxMemoryAllocationCount); }
    public MemorySegment _maxMemoryAllocationCount() { return _maxMemoryAllocationCountAt(0L); }
    public VkPhysicalDeviceLimits _maxMemoryAllocationCountAt(long index, MemorySegment src) { _maxMemoryAllocationCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxMemoryAllocationCount(MemorySegment src) { return _maxMemoryAllocationCountAt(0L, src); }
    public MemorySegment _maxSamplerAllocationCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSamplerAllocationCount, index), LAYOUT_maxSamplerAllocationCount); }
    public MemorySegment _maxSamplerAllocationCount() { return _maxSamplerAllocationCountAt(0L); }
    public VkPhysicalDeviceLimits _maxSamplerAllocationCountAt(long index, MemorySegment src) { _maxSamplerAllocationCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxSamplerAllocationCount(MemorySegment src) { return _maxSamplerAllocationCountAt(0L, src); }
    public MemorySegment _bufferImageGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_bufferImageGranularity, index), LAYOUT_bufferImageGranularity); }
    public MemorySegment _bufferImageGranularity() { return _bufferImageGranularityAt(0L); }
    public VkPhysicalDeviceLimits _bufferImageGranularityAt(long index, MemorySegment src) { _bufferImageGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _bufferImageGranularity(MemorySegment src) { return _bufferImageGranularityAt(0L, src); }
    public MemorySegment _sparseAddressSpaceSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseAddressSpaceSize, index), LAYOUT_sparseAddressSpaceSize); }
    public MemorySegment _sparseAddressSpaceSize() { return _sparseAddressSpaceSizeAt(0L); }
    public VkPhysicalDeviceLimits _sparseAddressSpaceSizeAt(long index, MemorySegment src) { _sparseAddressSpaceSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _sparseAddressSpaceSize(MemorySegment src) { return _sparseAddressSpaceSizeAt(0L, src); }
    public MemorySegment _maxBoundDescriptorSetsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxBoundDescriptorSets, index), LAYOUT_maxBoundDescriptorSets); }
    public MemorySegment _maxBoundDescriptorSets() { return _maxBoundDescriptorSetsAt(0L); }
    public VkPhysicalDeviceLimits _maxBoundDescriptorSetsAt(long index, MemorySegment src) { _maxBoundDescriptorSetsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxBoundDescriptorSets(MemorySegment src) { return _maxBoundDescriptorSetsAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorSamplers, index), LAYOUT_maxPerStageDescriptorSamplers); }
    public MemorySegment _maxPerStageDescriptorSamplers() { return _maxPerStageDescriptorSamplersAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorSamplersAt(long index, MemorySegment src) { _maxPerStageDescriptorSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorSamplers(MemorySegment src) { return _maxPerStageDescriptorSamplersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorUniformBuffers, index), LAYOUT_maxPerStageDescriptorUniformBuffers); }
    public MemorySegment _maxPerStageDescriptorUniformBuffers() { return _maxPerStageDescriptorUniformBuffersAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorUniformBuffersAt(long index, MemorySegment src) { _maxPerStageDescriptorUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorUniformBuffers(MemorySegment src) { return _maxPerStageDescriptorUniformBuffersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorStorageBuffers, index), LAYOUT_maxPerStageDescriptorStorageBuffers); }
    public MemorySegment _maxPerStageDescriptorStorageBuffers() { return _maxPerStageDescriptorStorageBuffersAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorStorageBuffersAt(long index, MemorySegment src) { _maxPerStageDescriptorStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorStorageBuffers(MemorySegment src) { return _maxPerStageDescriptorStorageBuffersAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorSampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorSampledImages, index), LAYOUT_maxPerStageDescriptorSampledImages); }
    public MemorySegment _maxPerStageDescriptorSampledImages() { return _maxPerStageDescriptorSampledImagesAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorSampledImagesAt(long index, MemorySegment src) { _maxPerStageDescriptorSampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorSampledImages(MemorySegment src) { return _maxPerStageDescriptorSampledImagesAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorStorageImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorStorageImages, index), LAYOUT_maxPerStageDescriptorStorageImages); }
    public MemorySegment _maxPerStageDescriptorStorageImages() { return _maxPerStageDescriptorStorageImagesAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorStorageImagesAt(long index, MemorySegment src) { _maxPerStageDescriptorStorageImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorStorageImages(MemorySegment src) { return _maxPerStageDescriptorStorageImagesAt(0L, src); }
    public MemorySegment _maxPerStageDescriptorInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageDescriptorInputAttachments, index), LAYOUT_maxPerStageDescriptorInputAttachments); }
    public MemorySegment _maxPerStageDescriptorInputAttachments() { return _maxPerStageDescriptorInputAttachmentsAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorInputAttachmentsAt(long index, MemorySegment src) { _maxPerStageDescriptorInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageDescriptorInputAttachments(MemorySegment src) { return _maxPerStageDescriptorInputAttachmentsAt(0L, src); }
    public MemorySegment _maxPerStageResourcesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPerStageResources, index), LAYOUT_maxPerStageResources); }
    public MemorySegment _maxPerStageResources() { return _maxPerStageResourcesAt(0L); }
    public VkPhysicalDeviceLimits _maxPerStageResourcesAt(long index, MemorySegment src) { _maxPerStageResourcesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxPerStageResources(MemorySegment src) { return _maxPerStageResourcesAt(0L, src); }
    public MemorySegment _maxDescriptorSetSamplersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetSamplers, index), LAYOUT_maxDescriptorSetSamplers); }
    public MemorySegment _maxDescriptorSetSamplers() { return _maxDescriptorSetSamplersAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetSamplersAt(long index, MemorySegment src) { _maxDescriptorSetSamplersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetSamplers(MemorySegment src) { return _maxDescriptorSetSamplersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUniformBuffers, index), LAYOUT_maxDescriptorSetUniformBuffers); }
    public MemorySegment _maxDescriptorSetUniformBuffers() { return _maxDescriptorSetUniformBuffersAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetUniformBuffersAt(long index, MemorySegment src) { _maxDescriptorSetUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetUniformBuffers(MemorySegment src) { return _maxDescriptorSetUniformBuffersAt(0L, src); }
    public MemorySegment _maxDescriptorSetUniformBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetUniformBuffersDynamic, index), LAYOUT_maxDescriptorSetUniformBuffersDynamic); }
    public MemorySegment _maxDescriptorSetUniformBuffersDynamic() { return _maxDescriptorSetUniformBuffersDynamicAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetUniformBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetUniformBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetUniformBuffersDynamic(MemorySegment src) { return _maxDescriptorSetUniformBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetStorageBuffers, index), LAYOUT_maxDescriptorSetStorageBuffers); }
    public MemorySegment _maxDescriptorSetStorageBuffers() { return _maxDescriptorSetStorageBuffersAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetStorageBuffersAt(long index, MemorySegment src) { _maxDescriptorSetStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetStorageBuffers(MemorySegment src) { return _maxDescriptorSetStorageBuffersAt(0L, src); }
    public MemorySegment _maxDescriptorSetStorageBuffersDynamicAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetStorageBuffersDynamic, index), LAYOUT_maxDescriptorSetStorageBuffersDynamic); }
    public MemorySegment _maxDescriptorSetStorageBuffersDynamic() { return _maxDescriptorSetStorageBuffersDynamicAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetStorageBuffersDynamicAt(long index, MemorySegment src) { _maxDescriptorSetStorageBuffersDynamicAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetStorageBuffersDynamic(MemorySegment src) { return _maxDescriptorSetStorageBuffersDynamicAt(0L, src); }
    public MemorySegment _maxDescriptorSetSampledImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetSampledImages, index), LAYOUT_maxDescriptorSetSampledImages); }
    public MemorySegment _maxDescriptorSetSampledImages() { return _maxDescriptorSetSampledImagesAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetSampledImagesAt(long index, MemorySegment src) { _maxDescriptorSetSampledImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetSampledImages(MemorySegment src) { return _maxDescriptorSetSampledImagesAt(0L, src); }
    public MemorySegment _maxDescriptorSetStorageImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetStorageImages, index), LAYOUT_maxDescriptorSetStorageImages); }
    public MemorySegment _maxDescriptorSetStorageImages() { return _maxDescriptorSetStorageImagesAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetStorageImagesAt(long index, MemorySegment src) { _maxDescriptorSetStorageImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetStorageImages(MemorySegment src) { return _maxDescriptorSetStorageImagesAt(0L, src); }
    public MemorySegment _maxDescriptorSetInputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDescriptorSetInputAttachments, index), LAYOUT_maxDescriptorSetInputAttachments); }
    public MemorySegment _maxDescriptorSetInputAttachments() { return _maxDescriptorSetInputAttachmentsAt(0L); }
    public VkPhysicalDeviceLimits _maxDescriptorSetInputAttachmentsAt(long index, MemorySegment src) { _maxDescriptorSetInputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDescriptorSetInputAttachments(MemorySegment src) { return _maxDescriptorSetInputAttachmentsAt(0L, src); }
    public MemorySegment _maxVertexInputAttributesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexInputAttributes, index), LAYOUT_maxVertexInputAttributes); }
    public MemorySegment _maxVertexInputAttributes() { return _maxVertexInputAttributesAt(0L); }
    public VkPhysicalDeviceLimits _maxVertexInputAttributesAt(long index, MemorySegment src) { _maxVertexInputAttributesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxVertexInputAttributes(MemorySegment src) { return _maxVertexInputAttributesAt(0L, src); }
    public MemorySegment _maxVertexInputBindingsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexInputBindings, index), LAYOUT_maxVertexInputBindings); }
    public MemorySegment _maxVertexInputBindings() { return _maxVertexInputBindingsAt(0L); }
    public VkPhysicalDeviceLimits _maxVertexInputBindingsAt(long index, MemorySegment src) { _maxVertexInputBindingsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxVertexInputBindings(MemorySegment src) { return _maxVertexInputBindingsAt(0L, src); }
    public MemorySegment _maxVertexInputAttributeOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexInputAttributeOffset, index), LAYOUT_maxVertexInputAttributeOffset); }
    public MemorySegment _maxVertexInputAttributeOffset() { return _maxVertexInputAttributeOffsetAt(0L); }
    public VkPhysicalDeviceLimits _maxVertexInputAttributeOffsetAt(long index, MemorySegment src) { _maxVertexInputAttributeOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxVertexInputAttributeOffset(MemorySegment src) { return _maxVertexInputAttributeOffsetAt(0L, src); }
    public MemorySegment _maxVertexInputBindingStrideAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexInputBindingStride, index), LAYOUT_maxVertexInputBindingStride); }
    public MemorySegment _maxVertexInputBindingStride() { return _maxVertexInputBindingStrideAt(0L); }
    public VkPhysicalDeviceLimits _maxVertexInputBindingStrideAt(long index, MemorySegment src) { _maxVertexInputBindingStrideAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxVertexInputBindingStride(MemorySegment src) { return _maxVertexInputBindingStrideAt(0L, src); }
    public MemorySegment _maxVertexOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexOutputComponents, index), LAYOUT_maxVertexOutputComponents); }
    public MemorySegment _maxVertexOutputComponents() { return _maxVertexOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxVertexOutputComponentsAt(long index, MemorySegment src) { _maxVertexOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxVertexOutputComponents(MemorySegment src) { return _maxVertexOutputComponentsAt(0L, src); }
    public MemorySegment _maxTessellationGenerationLevelAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationGenerationLevel, index), LAYOUT_maxTessellationGenerationLevel); }
    public MemorySegment _maxTessellationGenerationLevel() { return _maxTessellationGenerationLevelAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationGenerationLevelAt(long index, MemorySegment src) { _maxTessellationGenerationLevelAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationGenerationLevel(MemorySegment src) { return _maxTessellationGenerationLevelAt(0L, src); }
    public MemorySegment _maxTessellationPatchSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationPatchSize, index), LAYOUT_maxTessellationPatchSize); }
    public MemorySegment _maxTessellationPatchSize() { return _maxTessellationPatchSizeAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationPatchSizeAt(long index, MemorySegment src) { _maxTessellationPatchSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationPatchSize(MemorySegment src) { return _maxTessellationPatchSizeAt(0L, src); }
    public MemorySegment _maxTessellationControlPerVertexInputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationControlPerVertexInputComponents, index), LAYOUT_maxTessellationControlPerVertexInputComponents); }
    public MemorySegment _maxTessellationControlPerVertexInputComponents() { return _maxTessellationControlPerVertexInputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationControlPerVertexInputComponentsAt(long index, MemorySegment src) { _maxTessellationControlPerVertexInputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationControlPerVertexInputComponents(MemorySegment src) { return _maxTessellationControlPerVertexInputComponentsAt(0L, src); }
    public MemorySegment _maxTessellationControlPerVertexOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationControlPerVertexOutputComponents, index), LAYOUT_maxTessellationControlPerVertexOutputComponents); }
    public MemorySegment _maxTessellationControlPerVertexOutputComponents() { return _maxTessellationControlPerVertexOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationControlPerVertexOutputComponentsAt(long index, MemorySegment src) { _maxTessellationControlPerVertexOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationControlPerVertexOutputComponents(MemorySegment src) { return _maxTessellationControlPerVertexOutputComponentsAt(0L, src); }
    public MemorySegment _maxTessellationControlPerPatchOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationControlPerPatchOutputComponents, index), LAYOUT_maxTessellationControlPerPatchOutputComponents); }
    public MemorySegment _maxTessellationControlPerPatchOutputComponents() { return _maxTessellationControlPerPatchOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationControlPerPatchOutputComponentsAt(long index, MemorySegment src) { _maxTessellationControlPerPatchOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationControlPerPatchOutputComponents(MemorySegment src) { return _maxTessellationControlPerPatchOutputComponentsAt(0L, src); }
    public MemorySegment _maxTessellationControlTotalOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationControlTotalOutputComponents, index), LAYOUT_maxTessellationControlTotalOutputComponents); }
    public MemorySegment _maxTessellationControlTotalOutputComponents() { return _maxTessellationControlTotalOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationControlTotalOutputComponentsAt(long index, MemorySegment src) { _maxTessellationControlTotalOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationControlTotalOutputComponents(MemorySegment src) { return _maxTessellationControlTotalOutputComponentsAt(0L, src); }
    public MemorySegment _maxTessellationEvaluationInputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationEvaluationInputComponents, index), LAYOUT_maxTessellationEvaluationInputComponents); }
    public MemorySegment _maxTessellationEvaluationInputComponents() { return _maxTessellationEvaluationInputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationEvaluationInputComponentsAt(long index, MemorySegment src) { _maxTessellationEvaluationInputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationEvaluationInputComponents(MemorySegment src) { return _maxTessellationEvaluationInputComponentsAt(0L, src); }
    public MemorySegment _maxTessellationEvaluationOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTessellationEvaluationOutputComponents, index), LAYOUT_maxTessellationEvaluationOutputComponents); }
    public MemorySegment _maxTessellationEvaluationOutputComponents() { return _maxTessellationEvaluationOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxTessellationEvaluationOutputComponentsAt(long index, MemorySegment src) { _maxTessellationEvaluationOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTessellationEvaluationOutputComponents(MemorySegment src) { return _maxTessellationEvaluationOutputComponentsAt(0L, src); }
    public MemorySegment _maxGeometryShaderInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryShaderInvocations, index), LAYOUT_maxGeometryShaderInvocations); }
    public MemorySegment _maxGeometryShaderInvocations() { return _maxGeometryShaderInvocationsAt(0L); }
    public VkPhysicalDeviceLimits _maxGeometryShaderInvocationsAt(long index, MemorySegment src) { _maxGeometryShaderInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxGeometryShaderInvocations(MemorySegment src) { return _maxGeometryShaderInvocationsAt(0L, src); }
    public MemorySegment _maxGeometryInputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryInputComponents, index), LAYOUT_maxGeometryInputComponents); }
    public MemorySegment _maxGeometryInputComponents() { return _maxGeometryInputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxGeometryInputComponentsAt(long index, MemorySegment src) { _maxGeometryInputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxGeometryInputComponents(MemorySegment src) { return _maxGeometryInputComponentsAt(0L, src); }
    public MemorySegment _maxGeometryOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryOutputComponents, index), LAYOUT_maxGeometryOutputComponents); }
    public MemorySegment _maxGeometryOutputComponents() { return _maxGeometryOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxGeometryOutputComponentsAt(long index, MemorySegment src) { _maxGeometryOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxGeometryOutputComponents(MemorySegment src) { return _maxGeometryOutputComponentsAt(0L, src); }
    public MemorySegment _maxGeometryOutputVerticesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryOutputVertices, index), LAYOUT_maxGeometryOutputVertices); }
    public MemorySegment _maxGeometryOutputVertices() { return _maxGeometryOutputVerticesAt(0L); }
    public VkPhysicalDeviceLimits _maxGeometryOutputVerticesAt(long index, MemorySegment src) { _maxGeometryOutputVerticesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxGeometryOutputVertices(MemorySegment src) { return _maxGeometryOutputVerticesAt(0L, src); }
    public MemorySegment _maxGeometryTotalOutputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxGeometryTotalOutputComponents, index), LAYOUT_maxGeometryTotalOutputComponents); }
    public MemorySegment _maxGeometryTotalOutputComponents() { return _maxGeometryTotalOutputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxGeometryTotalOutputComponentsAt(long index, MemorySegment src) { _maxGeometryTotalOutputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxGeometryTotalOutputComponents(MemorySegment src) { return _maxGeometryTotalOutputComponentsAt(0L, src); }
    public MemorySegment _maxFragmentInputComponentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentInputComponents, index), LAYOUT_maxFragmentInputComponents); }
    public MemorySegment _maxFragmentInputComponents() { return _maxFragmentInputComponentsAt(0L); }
    public VkPhysicalDeviceLimits _maxFragmentInputComponentsAt(long index, MemorySegment src) { _maxFragmentInputComponentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFragmentInputComponents(MemorySegment src) { return _maxFragmentInputComponentsAt(0L, src); }
    public MemorySegment _maxFragmentOutputAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentOutputAttachments, index), LAYOUT_maxFragmentOutputAttachments); }
    public MemorySegment _maxFragmentOutputAttachments() { return _maxFragmentOutputAttachmentsAt(0L); }
    public VkPhysicalDeviceLimits _maxFragmentOutputAttachmentsAt(long index, MemorySegment src) { _maxFragmentOutputAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFragmentOutputAttachments(MemorySegment src) { return _maxFragmentOutputAttachmentsAt(0L, src); }
    public MemorySegment _maxFragmentDualSrcAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentDualSrcAttachments, index), LAYOUT_maxFragmentDualSrcAttachments); }
    public MemorySegment _maxFragmentDualSrcAttachments() { return _maxFragmentDualSrcAttachmentsAt(0L); }
    public VkPhysicalDeviceLimits _maxFragmentDualSrcAttachmentsAt(long index, MemorySegment src) { _maxFragmentDualSrcAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFragmentDualSrcAttachments(MemorySegment src) { return _maxFragmentDualSrcAttachmentsAt(0L, src); }
    public MemorySegment _maxFragmentCombinedOutputResourcesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFragmentCombinedOutputResources, index), LAYOUT_maxFragmentCombinedOutputResources); }
    public MemorySegment _maxFragmentCombinedOutputResources() { return _maxFragmentCombinedOutputResourcesAt(0L); }
    public VkPhysicalDeviceLimits _maxFragmentCombinedOutputResourcesAt(long index, MemorySegment src) { _maxFragmentCombinedOutputResourcesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFragmentCombinedOutputResources(MemorySegment src) { return _maxFragmentCombinedOutputResourcesAt(0L, src); }
    public MemorySegment _maxComputeSharedMemorySizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxComputeSharedMemorySize, index), LAYOUT_maxComputeSharedMemorySize); }
    public MemorySegment _maxComputeSharedMemorySize() { return _maxComputeSharedMemorySizeAt(0L); }
    public VkPhysicalDeviceLimits _maxComputeSharedMemorySizeAt(long index, MemorySegment src) { _maxComputeSharedMemorySizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxComputeSharedMemorySize(MemorySegment src) { return _maxComputeSharedMemorySizeAt(0L, src); }
    public MemorySegment _maxComputeWorkGroupCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupCount, index), LAYOUT_maxComputeWorkGroupCount); }
    public MemorySegment _maxComputeWorkGroupCount() { return _maxComputeWorkGroupCountAt(0L); }
    public VkPhysicalDeviceLimits _maxComputeWorkGroupCountAt(long index, MemorySegment src) { _maxComputeWorkGroupCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxComputeWorkGroupCount(MemorySegment src) { return _maxComputeWorkGroupCountAt(0L, src); }
    public MemorySegment _maxComputeWorkGroupInvocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupInvocations, index), LAYOUT_maxComputeWorkGroupInvocations); }
    public MemorySegment _maxComputeWorkGroupInvocations() { return _maxComputeWorkGroupInvocationsAt(0L); }
    public VkPhysicalDeviceLimits _maxComputeWorkGroupInvocationsAt(long index, MemorySegment src) { _maxComputeWorkGroupInvocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxComputeWorkGroupInvocations(MemorySegment src) { return _maxComputeWorkGroupInvocationsAt(0L, src); }
    public MemorySegment _maxComputeWorkGroupSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupSize, index), LAYOUT_maxComputeWorkGroupSize); }
    public MemorySegment _maxComputeWorkGroupSize() { return _maxComputeWorkGroupSizeAt(0L); }
    public VkPhysicalDeviceLimits _maxComputeWorkGroupSizeAt(long index, MemorySegment src) { _maxComputeWorkGroupSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxComputeWorkGroupSize(MemorySegment src) { return _maxComputeWorkGroupSizeAt(0L, src); }
    public MemorySegment _subPixelPrecisionBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subPixelPrecisionBits, index), LAYOUT_subPixelPrecisionBits); }
    public MemorySegment _subPixelPrecisionBits() { return _subPixelPrecisionBitsAt(0L); }
    public VkPhysicalDeviceLimits _subPixelPrecisionBitsAt(long index, MemorySegment src) { _subPixelPrecisionBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _subPixelPrecisionBits(MemorySegment src) { return _subPixelPrecisionBitsAt(0L, src); }
    public MemorySegment _subTexelPrecisionBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subTexelPrecisionBits, index), LAYOUT_subTexelPrecisionBits); }
    public MemorySegment _subTexelPrecisionBits() { return _subTexelPrecisionBitsAt(0L); }
    public VkPhysicalDeviceLimits _subTexelPrecisionBitsAt(long index, MemorySegment src) { _subTexelPrecisionBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _subTexelPrecisionBits(MemorySegment src) { return _subTexelPrecisionBitsAt(0L, src); }
    public MemorySegment _mipmapPrecisionBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_mipmapPrecisionBits, index), LAYOUT_mipmapPrecisionBits); }
    public MemorySegment _mipmapPrecisionBits() { return _mipmapPrecisionBitsAt(0L); }
    public VkPhysicalDeviceLimits _mipmapPrecisionBitsAt(long index, MemorySegment src) { _mipmapPrecisionBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _mipmapPrecisionBits(MemorySegment src) { return _mipmapPrecisionBitsAt(0L, src); }
    public MemorySegment _maxDrawIndexedIndexValueAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDrawIndexedIndexValue, index), LAYOUT_maxDrawIndexedIndexValue); }
    public MemorySegment _maxDrawIndexedIndexValue() { return _maxDrawIndexedIndexValueAt(0L); }
    public VkPhysicalDeviceLimits _maxDrawIndexedIndexValueAt(long index, MemorySegment src) { _maxDrawIndexedIndexValueAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDrawIndexedIndexValue(MemorySegment src) { return _maxDrawIndexedIndexValueAt(0L, src); }
    public MemorySegment _maxDrawIndirectCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxDrawIndirectCount, index), LAYOUT_maxDrawIndirectCount); }
    public MemorySegment _maxDrawIndirectCount() { return _maxDrawIndirectCountAt(0L); }
    public VkPhysicalDeviceLimits _maxDrawIndirectCountAt(long index, MemorySegment src) { _maxDrawIndirectCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxDrawIndirectCount(MemorySegment src) { return _maxDrawIndirectCountAt(0L, src); }
    public MemorySegment _maxSamplerLodBiasAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSamplerLodBias, index), LAYOUT_maxSamplerLodBias); }
    public MemorySegment _maxSamplerLodBias() { return _maxSamplerLodBiasAt(0L); }
    public VkPhysicalDeviceLimits _maxSamplerLodBiasAt(long index, MemorySegment src) { _maxSamplerLodBiasAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxSamplerLodBias(MemorySegment src) { return _maxSamplerLodBiasAt(0L, src); }
    public MemorySegment _maxSamplerAnisotropyAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSamplerAnisotropy, index), LAYOUT_maxSamplerAnisotropy); }
    public MemorySegment _maxSamplerAnisotropy() { return _maxSamplerAnisotropyAt(0L); }
    public VkPhysicalDeviceLimits _maxSamplerAnisotropyAt(long index, MemorySegment src) { _maxSamplerAnisotropyAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxSamplerAnisotropy(MemorySegment src) { return _maxSamplerAnisotropyAt(0L, src); }
    public MemorySegment _maxViewportsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxViewports, index), LAYOUT_maxViewports); }
    public MemorySegment _maxViewports() { return _maxViewportsAt(0L); }
    public VkPhysicalDeviceLimits _maxViewportsAt(long index, MemorySegment src) { _maxViewportsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxViewports(MemorySegment src) { return _maxViewportsAt(0L, src); }
    public MemorySegment _maxViewportDimensionsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxViewportDimensions, index), LAYOUT_maxViewportDimensions); }
    public MemorySegment _maxViewportDimensions() { return _maxViewportDimensionsAt(0L); }
    public VkPhysicalDeviceLimits _maxViewportDimensionsAt(long index, MemorySegment src) { _maxViewportDimensionsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxViewportDimensions(MemorySegment src) { return _maxViewportDimensionsAt(0L, src); }
    public MemorySegment _viewportBoundsRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportBoundsRange, index), LAYOUT_viewportBoundsRange); }
    public MemorySegment _viewportBoundsRange() { return _viewportBoundsRangeAt(0L); }
    public VkPhysicalDeviceLimits _viewportBoundsRangeAt(long index, MemorySegment src) { _viewportBoundsRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _viewportBoundsRange(MemorySegment src) { return _viewportBoundsRangeAt(0L, src); }
    public MemorySegment _viewportSubPixelBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_viewportSubPixelBits, index), LAYOUT_viewportSubPixelBits); }
    public MemorySegment _viewportSubPixelBits() { return _viewportSubPixelBitsAt(0L); }
    public VkPhysicalDeviceLimits _viewportSubPixelBitsAt(long index, MemorySegment src) { _viewportSubPixelBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _viewportSubPixelBits(MemorySegment src) { return _viewportSubPixelBitsAt(0L, src); }
    public MemorySegment _minMemoryMapAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minMemoryMapAlignment, index), LAYOUT_minMemoryMapAlignment); }
    public MemorySegment _minMemoryMapAlignment() { return _minMemoryMapAlignmentAt(0L); }
    public VkPhysicalDeviceLimits _minMemoryMapAlignmentAt(long index, MemorySegment src) { _minMemoryMapAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minMemoryMapAlignment(MemorySegment src) { return _minMemoryMapAlignmentAt(0L, src); }
    public MemorySegment _minTexelBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minTexelBufferOffsetAlignment, index), LAYOUT_minTexelBufferOffsetAlignment); }
    public MemorySegment _minTexelBufferOffsetAlignment() { return _minTexelBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceLimits _minTexelBufferOffsetAlignmentAt(long index, MemorySegment src) { _minTexelBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minTexelBufferOffsetAlignment(MemorySegment src) { return _minTexelBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _minUniformBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minUniformBufferOffsetAlignment, index), LAYOUT_minUniformBufferOffsetAlignment); }
    public MemorySegment _minUniformBufferOffsetAlignment() { return _minUniformBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceLimits _minUniformBufferOffsetAlignmentAt(long index, MemorySegment src) { _minUniformBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minUniformBufferOffsetAlignment(MemorySegment src) { return _minUniformBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _minStorageBufferOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minStorageBufferOffsetAlignment, index), LAYOUT_minStorageBufferOffsetAlignment); }
    public MemorySegment _minStorageBufferOffsetAlignment() { return _minStorageBufferOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceLimits _minStorageBufferOffsetAlignmentAt(long index, MemorySegment src) { _minStorageBufferOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minStorageBufferOffsetAlignment(MemorySegment src) { return _minStorageBufferOffsetAlignmentAt(0L, src); }
    public MemorySegment _minTexelOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minTexelOffset, index), LAYOUT_minTexelOffset); }
    public MemorySegment _minTexelOffset() { return _minTexelOffsetAt(0L); }
    public VkPhysicalDeviceLimits _minTexelOffsetAt(long index, MemorySegment src) { _minTexelOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minTexelOffset(MemorySegment src) { return _minTexelOffsetAt(0L, src); }
    public MemorySegment _maxTexelOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTexelOffset, index), LAYOUT_maxTexelOffset); }
    public MemorySegment _maxTexelOffset() { return _maxTexelOffsetAt(0L); }
    public VkPhysicalDeviceLimits _maxTexelOffsetAt(long index, MemorySegment src) { _maxTexelOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTexelOffset(MemorySegment src) { return _maxTexelOffsetAt(0L, src); }
    public MemorySegment _minTexelGatherOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minTexelGatherOffset, index), LAYOUT_minTexelGatherOffset); }
    public MemorySegment _minTexelGatherOffset() { return _minTexelGatherOffsetAt(0L); }
    public VkPhysicalDeviceLimits _minTexelGatherOffsetAt(long index, MemorySegment src) { _minTexelGatherOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minTexelGatherOffset(MemorySegment src) { return _minTexelGatherOffsetAt(0L, src); }
    public MemorySegment _maxTexelGatherOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxTexelGatherOffset, index), LAYOUT_maxTexelGatherOffset); }
    public MemorySegment _maxTexelGatherOffset() { return _maxTexelGatherOffsetAt(0L); }
    public VkPhysicalDeviceLimits _maxTexelGatherOffsetAt(long index, MemorySegment src) { _maxTexelGatherOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxTexelGatherOffset(MemorySegment src) { return _maxTexelGatherOffsetAt(0L, src); }
    public MemorySegment _minInterpolationOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_minInterpolationOffset, index), LAYOUT_minInterpolationOffset); }
    public MemorySegment _minInterpolationOffset() { return _minInterpolationOffsetAt(0L); }
    public VkPhysicalDeviceLimits _minInterpolationOffsetAt(long index, MemorySegment src) { _minInterpolationOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _minInterpolationOffset(MemorySegment src) { return _minInterpolationOffsetAt(0L, src); }
    public MemorySegment _maxInterpolationOffsetAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxInterpolationOffset, index), LAYOUT_maxInterpolationOffset); }
    public MemorySegment _maxInterpolationOffset() { return _maxInterpolationOffsetAt(0L); }
    public VkPhysicalDeviceLimits _maxInterpolationOffsetAt(long index, MemorySegment src) { _maxInterpolationOffsetAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxInterpolationOffset(MemorySegment src) { return _maxInterpolationOffsetAt(0L, src); }
    public MemorySegment _subPixelInterpolationOffsetBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_subPixelInterpolationOffsetBits, index), LAYOUT_subPixelInterpolationOffsetBits); }
    public MemorySegment _subPixelInterpolationOffsetBits() { return _subPixelInterpolationOffsetBitsAt(0L); }
    public VkPhysicalDeviceLimits _subPixelInterpolationOffsetBitsAt(long index, MemorySegment src) { _subPixelInterpolationOffsetBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _subPixelInterpolationOffsetBits(MemorySegment src) { return _subPixelInterpolationOffsetBitsAt(0L, src); }
    public MemorySegment _maxFramebufferWidthAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFramebufferWidth, index), LAYOUT_maxFramebufferWidth); }
    public MemorySegment _maxFramebufferWidth() { return _maxFramebufferWidthAt(0L); }
    public VkPhysicalDeviceLimits _maxFramebufferWidthAt(long index, MemorySegment src) { _maxFramebufferWidthAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFramebufferWidth(MemorySegment src) { return _maxFramebufferWidthAt(0L, src); }
    public MemorySegment _maxFramebufferHeightAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFramebufferHeight, index), LAYOUT_maxFramebufferHeight); }
    public MemorySegment _maxFramebufferHeight() { return _maxFramebufferHeightAt(0L); }
    public VkPhysicalDeviceLimits _maxFramebufferHeightAt(long index, MemorySegment src) { _maxFramebufferHeightAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFramebufferHeight(MemorySegment src) { return _maxFramebufferHeightAt(0L, src); }
    public MemorySegment _maxFramebufferLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxFramebufferLayers, index), LAYOUT_maxFramebufferLayers); }
    public MemorySegment _maxFramebufferLayers() { return _maxFramebufferLayersAt(0L); }
    public VkPhysicalDeviceLimits _maxFramebufferLayersAt(long index, MemorySegment src) { _maxFramebufferLayersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxFramebufferLayers(MemorySegment src) { return _maxFramebufferLayersAt(0L, src); }
    public MemorySegment _framebufferColorSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebufferColorSampleCounts, index), LAYOUT_framebufferColorSampleCounts); }
    public MemorySegment _framebufferColorSampleCounts() { return _framebufferColorSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _framebufferColorSampleCountsAt(long index, MemorySegment src) { _framebufferColorSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _framebufferColorSampleCounts(MemorySegment src) { return _framebufferColorSampleCountsAt(0L, src); }
    public MemorySegment _framebufferDepthSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebufferDepthSampleCounts, index), LAYOUT_framebufferDepthSampleCounts); }
    public MemorySegment _framebufferDepthSampleCounts() { return _framebufferDepthSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _framebufferDepthSampleCountsAt(long index, MemorySegment src) { _framebufferDepthSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _framebufferDepthSampleCounts(MemorySegment src) { return _framebufferDepthSampleCountsAt(0L, src); }
    public MemorySegment _framebufferStencilSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebufferStencilSampleCounts, index), LAYOUT_framebufferStencilSampleCounts); }
    public MemorySegment _framebufferStencilSampleCounts() { return _framebufferStencilSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _framebufferStencilSampleCountsAt(long index, MemorySegment src) { _framebufferStencilSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _framebufferStencilSampleCounts(MemorySegment src) { return _framebufferStencilSampleCountsAt(0L, src); }
    public MemorySegment _framebufferNoAttachmentsSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_framebufferNoAttachmentsSampleCounts, index), LAYOUT_framebufferNoAttachmentsSampleCounts); }
    public MemorySegment _framebufferNoAttachmentsSampleCounts() { return _framebufferNoAttachmentsSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _framebufferNoAttachmentsSampleCountsAt(long index, MemorySegment src) { _framebufferNoAttachmentsSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _framebufferNoAttachmentsSampleCounts(MemorySegment src) { return _framebufferNoAttachmentsSampleCountsAt(0L, src); }
    public MemorySegment _maxColorAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxColorAttachments, index), LAYOUT_maxColorAttachments); }
    public MemorySegment _maxColorAttachments() { return _maxColorAttachmentsAt(0L); }
    public VkPhysicalDeviceLimits _maxColorAttachmentsAt(long index, MemorySegment src) { _maxColorAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxColorAttachments(MemorySegment src) { return _maxColorAttachmentsAt(0L, src); }
    public MemorySegment _sampledImageColorSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampledImageColorSampleCounts, index), LAYOUT_sampledImageColorSampleCounts); }
    public MemorySegment _sampledImageColorSampleCounts() { return _sampledImageColorSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _sampledImageColorSampleCountsAt(long index, MemorySegment src) { _sampledImageColorSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _sampledImageColorSampleCounts(MemorySegment src) { return _sampledImageColorSampleCountsAt(0L, src); }
    public MemorySegment _sampledImageIntegerSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampledImageIntegerSampleCounts, index), LAYOUT_sampledImageIntegerSampleCounts); }
    public MemorySegment _sampledImageIntegerSampleCounts() { return _sampledImageIntegerSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _sampledImageIntegerSampleCountsAt(long index, MemorySegment src) { _sampledImageIntegerSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _sampledImageIntegerSampleCounts(MemorySegment src) { return _sampledImageIntegerSampleCountsAt(0L, src); }
    public MemorySegment _sampledImageDepthSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampledImageDepthSampleCounts, index), LAYOUT_sampledImageDepthSampleCounts); }
    public MemorySegment _sampledImageDepthSampleCounts() { return _sampledImageDepthSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _sampledImageDepthSampleCountsAt(long index, MemorySegment src) { _sampledImageDepthSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _sampledImageDepthSampleCounts(MemorySegment src) { return _sampledImageDepthSampleCountsAt(0L, src); }
    public MemorySegment _sampledImageStencilSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sampledImageStencilSampleCounts, index), LAYOUT_sampledImageStencilSampleCounts); }
    public MemorySegment _sampledImageStencilSampleCounts() { return _sampledImageStencilSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _sampledImageStencilSampleCountsAt(long index, MemorySegment src) { _sampledImageStencilSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _sampledImageStencilSampleCounts(MemorySegment src) { return _sampledImageStencilSampleCountsAt(0L, src); }
    public MemorySegment _storageImageSampleCountsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_storageImageSampleCounts, index), LAYOUT_storageImageSampleCounts); }
    public MemorySegment _storageImageSampleCounts() { return _storageImageSampleCountsAt(0L); }
    public VkPhysicalDeviceLimits _storageImageSampleCountsAt(long index, MemorySegment src) { _storageImageSampleCountsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _storageImageSampleCounts(MemorySegment src) { return _storageImageSampleCountsAt(0L, src); }
    public MemorySegment _maxSampleMaskWordsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxSampleMaskWords, index), LAYOUT_maxSampleMaskWords); }
    public MemorySegment _maxSampleMaskWords() { return _maxSampleMaskWordsAt(0L); }
    public VkPhysicalDeviceLimits _maxSampleMaskWordsAt(long index, MemorySegment src) { _maxSampleMaskWordsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxSampleMaskWords(MemorySegment src) { return _maxSampleMaskWordsAt(0L, src); }
    public MemorySegment _timestampComputeAndGraphicsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timestampComputeAndGraphics, index), LAYOUT_timestampComputeAndGraphics); }
    public MemorySegment _timestampComputeAndGraphics() { return _timestampComputeAndGraphicsAt(0L); }
    public VkPhysicalDeviceLimits _timestampComputeAndGraphicsAt(long index, MemorySegment src) { _timestampComputeAndGraphicsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _timestampComputeAndGraphics(MemorySegment src) { return _timestampComputeAndGraphicsAt(0L, src); }
    public MemorySegment _timestampPeriodAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_timestampPeriod, index), LAYOUT_timestampPeriod); }
    public MemorySegment _timestampPeriod() { return _timestampPeriodAt(0L); }
    public VkPhysicalDeviceLimits _timestampPeriodAt(long index, MemorySegment src) { _timestampPeriodAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _timestampPeriod(MemorySegment src) { return _timestampPeriodAt(0L, src); }
    public MemorySegment _maxClipDistancesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxClipDistances, index), LAYOUT_maxClipDistances); }
    public MemorySegment _maxClipDistances() { return _maxClipDistancesAt(0L); }
    public VkPhysicalDeviceLimits _maxClipDistancesAt(long index, MemorySegment src) { _maxClipDistancesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxClipDistances(MemorySegment src) { return _maxClipDistancesAt(0L, src); }
    public MemorySegment _maxCullDistancesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCullDistances, index), LAYOUT_maxCullDistances); }
    public MemorySegment _maxCullDistances() { return _maxCullDistancesAt(0L); }
    public VkPhysicalDeviceLimits _maxCullDistancesAt(long index, MemorySegment src) { _maxCullDistancesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxCullDistances(MemorySegment src) { return _maxCullDistancesAt(0L, src); }
    public MemorySegment _maxCombinedClipAndCullDistancesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCombinedClipAndCullDistances, index), LAYOUT_maxCombinedClipAndCullDistances); }
    public MemorySegment _maxCombinedClipAndCullDistances() { return _maxCombinedClipAndCullDistancesAt(0L); }
    public VkPhysicalDeviceLimits _maxCombinedClipAndCullDistancesAt(long index, MemorySegment src) { _maxCombinedClipAndCullDistancesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _maxCombinedClipAndCullDistances(MemorySegment src) { return _maxCombinedClipAndCullDistancesAt(0L, src); }
    public MemorySegment _discreteQueuePrioritiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_discreteQueuePriorities, index), LAYOUT_discreteQueuePriorities); }
    public MemorySegment _discreteQueuePriorities() { return _discreteQueuePrioritiesAt(0L); }
    public VkPhysicalDeviceLimits _discreteQueuePrioritiesAt(long index, MemorySegment src) { _discreteQueuePrioritiesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _discreteQueuePriorities(MemorySegment src) { return _discreteQueuePrioritiesAt(0L, src); }
    public MemorySegment _pointSizeRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pointSizeRange, index), LAYOUT_pointSizeRange); }
    public MemorySegment _pointSizeRange() { return _pointSizeRangeAt(0L); }
    public VkPhysicalDeviceLimits _pointSizeRangeAt(long index, MemorySegment src) { _pointSizeRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _pointSizeRange(MemorySegment src) { return _pointSizeRangeAt(0L, src); }
    public MemorySegment _lineWidthRangeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineWidthRange, index), LAYOUT_lineWidthRange); }
    public MemorySegment _lineWidthRange() { return _lineWidthRangeAt(0L); }
    public VkPhysicalDeviceLimits _lineWidthRangeAt(long index, MemorySegment src) { _lineWidthRangeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _lineWidthRange(MemorySegment src) { return _lineWidthRangeAt(0L, src); }
    public MemorySegment _pointSizeGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pointSizeGranularity, index), LAYOUT_pointSizeGranularity); }
    public MemorySegment _pointSizeGranularity() { return _pointSizeGranularityAt(0L); }
    public VkPhysicalDeviceLimits _pointSizeGranularityAt(long index, MemorySegment src) { _pointSizeGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _pointSizeGranularity(MemorySegment src) { return _pointSizeGranularityAt(0L, src); }
    public MemorySegment _lineWidthGranularityAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineWidthGranularity, index), LAYOUT_lineWidthGranularity); }
    public MemorySegment _lineWidthGranularity() { return _lineWidthGranularityAt(0L); }
    public VkPhysicalDeviceLimits _lineWidthGranularityAt(long index, MemorySegment src) { _lineWidthGranularityAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _lineWidthGranularity(MemorySegment src) { return _lineWidthGranularityAt(0L, src); }
    public MemorySegment _strictLinesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_strictLines, index), LAYOUT_strictLines); }
    public MemorySegment _strictLines() { return _strictLinesAt(0L); }
    public VkPhysicalDeviceLimits _strictLinesAt(long index, MemorySegment src) { _strictLinesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _strictLines(MemorySegment src) { return _strictLinesAt(0L, src); }
    public MemorySegment _standardSampleLocationsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_standardSampleLocations, index), LAYOUT_standardSampleLocations); }
    public MemorySegment _standardSampleLocations() { return _standardSampleLocationsAt(0L); }
    public VkPhysicalDeviceLimits _standardSampleLocationsAt(long index, MemorySegment src) { _standardSampleLocationsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _standardSampleLocations(MemorySegment src) { return _standardSampleLocationsAt(0L, src); }
    public MemorySegment _optimalBufferCopyOffsetAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalBufferCopyOffsetAlignment, index), LAYOUT_optimalBufferCopyOffsetAlignment); }
    public MemorySegment _optimalBufferCopyOffsetAlignment() { return _optimalBufferCopyOffsetAlignmentAt(0L); }
    public VkPhysicalDeviceLimits _optimalBufferCopyOffsetAlignmentAt(long index, MemorySegment src) { _optimalBufferCopyOffsetAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _optimalBufferCopyOffsetAlignment(MemorySegment src) { return _optimalBufferCopyOffsetAlignmentAt(0L, src); }
    public MemorySegment _optimalBufferCopyRowPitchAlignmentAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalBufferCopyRowPitchAlignment, index), LAYOUT_optimalBufferCopyRowPitchAlignment); }
    public MemorySegment _optimalBufferCopyRowPitchAlignment() { return _optimalBufferCopyRowPitchAlignmentAt(0L); }
    public VkPhysicalDeviceLimits _optimalBufferCopyRowPitchAlignmentAt(long index, MemorySegment src) { _optimalBufferCopyRowPitchAlignmentAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _optimalBufferCopyRowPitchAlignment(MemorySegment src) { return _optimalBufferCopyRowPitchAlignmentAt(0L, src); }
    public MemorySegment _nonCoherentAtomSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonCoherentAtomSize, index), LAYOUT_nonCoherentAtomSize); }
    public MemorySegment _nonCoherentAtomSize() { return _nonCoherentAtomSizeAt(0L); }
    public VkPhysicalDeviceLimits _nonCoherentAtomSizeAt(long index, MemorySegment src) { _nonCoherentAtomSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceLimits _nonCoherentAtomSize(MemorySegment src) { return _nonCoherentAtomSizeAt(0L, src); }
}
