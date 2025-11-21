// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceProperties2`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceProperties2 {
///     VkStructureType sType;
///     void* pNext;
///     VkPhysicalDeviceProperties properties;
/// }
/// ```
public final class VkPhysicalDeviceProperties2 extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkPhysicalDeviceProperties.LAYOUT.withName("properties")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_properties = LAYOUT.byteOffset(PathElement.groupElement("properties"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_properties = LAYOUT.select(PathElement.groupElement("properties"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_properties$apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("apiVersion"));
    public static final VarHandle VH_properties$driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("driverVersion"));
    public static final VarHandle VH_properties$vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("vendorID"));
    public static final VarHandle VH_properties$deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("deviceID"));
    public static final VarHandle VH_properties$deviceType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("deviceType"));
    public static final VarHandle VH_properties$deviceName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("deviceName"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$maxImageDimension1D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimension1D"));
    public static final VarHandle VH_properties$limits$maxImageDimension2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimension2D"));
    public static final VarHandle VH_properties$limits$maxImageDimension3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimension3D"));
    public static final VarHandle VH_properties$limits$maxImageDimensionCube = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimensionCube"));
    public static final VarHandle VH_properties$limits$maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxImageArrayLayers"));
    public static final VarHandle VH_properties$limits$maxTexelBufferElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTexelBufferElements"));
    public static final VarHandle VH_properties$limits$maxUniformBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxUniformBufferRange"));
    public static final VarHandle VH_properties$limits$maxStorageBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxStorageBufferRange"));
    public static final VarHandle VH_properties$limits$maxPushConstantsSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPushConstantsSize"));
    public static final VarHandle VH_properties$limits$maxMemoryAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxMemoryAllocationCount"));
    public static final VarHandle VH_properties$limits$maxSamplerAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxSamplerAllocationCount"));
    public static final VarHandle VH_properties$limits$bufferImageGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("bufferImageGranularity"));
    public static final VarHandle VH_properties$limits$sparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("sparseAddressSpaceSize"));
    public static final VarHandle VH_properties$limits$maxBoundDescriptorSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxBoundDescriptorSets"));
    public static final VarHandle VH_properties$limits$maxPerStageDescriptorSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorSamplers"));
    public static final VarHandle VH_properties$limits$maxPerStageDescriptorUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    public static final VarHandle VH_properties$limits$maxPerStageDescriptorStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    public static final VarHandle VH_properties$limits$maxPerStageDescriptorSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    public static final VarHandle VH_properties$limits$maxPerStageDescriptorStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    public static final VarHandle VH_properties$limits$maxPerStageDescriptorInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    public static final VarHandle VH_properties$limits$maxPerStageResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageResources"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetSamplers"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetSampledImages"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetStorageImages"));
    public static final VarHandle VH_properties$limits$maxDescriptorSetInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetInputAttachments"));
    public static final VarHandle VH_properties$limits$maxVertexInputAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputAttributes"));
    public static final VarHandle VH_properties$limits$maxVertexInputBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputBindings"));
    public static final VarHandle VH_properties$limits$maxVertexInputAttributeOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputAttributeOffset"));
    public static final VarHandle VH_properties$limits$maxVertexInputBindingStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputBindingStride"));
    public static final VarHandle VH_properties$limits$maxVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxVertexOutputComponents"));
    public static final VarHandle VH_properties$limits$maxTessellationGenerationLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationGenerationLevel"));
    public static final VarHandle VH_properties$limits$maxTessellationPatchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationPatchSize"));
    public static final VarHandle VH_properties$limits$maxTessellationControlPerVertexInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    public static final VarHandle VH_properties$limits$maxTessellationControlPerVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    public static final VarHandle VH_properties$limits$maxTessellationControlPerPatchOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    public static final VarHandle VH_properties$limits$maxTessellationControlTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    public static final VarHandle VH_properties$limits$maxTessellationEvaluationInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    public static final VarHandle VH_properties$limits$maxTessellationEvaluationOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    public static final VarHandle VH_properties$limits$maxGeometryShaderInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryShaderInvocations"));
    public static final VarHandle VH_properties$limits$maxGeometryInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryInputComponents"));
    public static final VarHandle VH_properties$limits$maxGeometryOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryOutputComponents"));
    public static final VarHandle VH_properties$limits$maxGeometryOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryOutputVertices"));
    public static final VarHandle VH_properties$limits$maxGeometryTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryTotalOutputComponents"));
    public static final VarHandle VH_properties$limits$maxFragmentInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentInputComponents"));
    public static final VarHandle VH_properties$limits$maxFragmentOutputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentOutputAttachments"));
    public static final VarHandle VH_properties$limits$maxFragmentDualSrcAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentDualSrcAttachments"));
    public static final VarHandle VH_properties$limits$maxFragmentCombinedOutputResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentCombinedOutputResources"));
    public static final VarHandle VH_properties$limits$maxComputeSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxComputeSharedMemorySize"));
    public static final VarHandle VH_properties$limits$maxComputeWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxComputeWorkGroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$maxComputeWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxComputeWorkGroupInvocations"));
    public static final VarHandle VH_properties$limits$maxComputeWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxComputeWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$subPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("subPixelPrecisionBits"));
    public static final VarHandle VH_properties$limits$subTexelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("subTexelPrecisionBits"));
    public static final VarHandle VH_properties$limits$mipmapPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("mipmapPrecisionBits"));
    public static final VarHandle VH_properties$limits$maxDrawIndexedIndexValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDrawIndexedIndexValue"));
    public static final VarHandle VH_properties$limits$maxDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxDrawIndirectCount"));
    public static final VarHandle VH_properties$limits$maxSamplerLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxSamplerLodBias"));
    public static final VarHandle VH_properties$limits$maxSamplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxSamplerAnisotropy"));
    public static final VarHandle VH_properties$limits$maxViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxViewports"));
    public static final VarHandle VH_properties$limits$maxViewportDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxViewportDimensions"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$viewportBoundsRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("viewportBoundsRange"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$viewportSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("viewportSubPixelBits"));
    public static final VarHandle VH_properties$limits$minMemoryMapAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minMemoryMapAlignment"));
    public static final VarHandle VH_properties$limits$minTexelBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minTexelBufferOffsetAlignment"));
    public static final VarHandle VH_properties$limits$minUniformBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minUniformBufferOffsetAlignment"));
    public static final VarHandle VH_properties$limits$minStorageBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minStorageBufferOffsetAlignment"));
    public static final VarHandle VH_properties$limits$minTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minTexelOffset"));
    public static final VarHandle VH_properties$limits$maxTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTexelOffset"));
    public static final VarHandle VH_properties$limits$minTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minTexelGatherOffset"));
    public static final VarHandle VH_properties$limits$maxTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxTexelGatherOffset"));
    public static final VarHandle VH_properties$limits$minInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("minInterpolationOffset"));
    public static final VarHandle VH_properties$limits$maxInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxInterpolationOffset"));
    public static final VarHandle VH_properties$limits$subPixelInterpolationOffsetBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("subPixelInterpolationOffsetBits"));
    public static final VarHandle VH_properties$limits$maxFramebufferWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFramebufferWidth"));
    public static final VarHandle VH_properties$limits$maxFramebufferHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFramebufferHeight"));
    public static final VarHandle VH_properties$limits$maxFramebufferLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxFramebufferLayers"));
    public static final VarHandle VH_properties$limits$framebufferColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("framebufferColorSampleCounts"));
    public static final VarHandle VH_properties$limits$framebufferDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("framebufferDepthSampleCounts"));
    public static final VarHandle VH_properties$limits$framebufferStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("framebufferStencilSampleCounts"));
    public static final VarHandle VH_properties$limits$framebufferNoAttachmentsSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    public static final VarHandle VH_properties$limits$maxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxColorAttachments"));
    public static final VarHandle VH_properties$limits$sampledImageColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("sampledImageColorSampleCounts"));
    public static final VarHandle VH_properties$limits$sampledImageIntegerSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("sampledImageIntegerSampleCounts"));
    public static final VarHandle VH_properties$limits$sampledImageDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("sampledImageDepthSampleCounts"));
    public static final VarHandle VH_properties$limits$sampledImageStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("sampledImageStencilSampleCounts"));
    public static final VarHandle VH_properties$limits$storageImageSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("storageImageSampleCounts"));
    public static final VarHandle VH_properties$limits$maxSampleMaskWords = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxSampleMaskWords"));
    public static final VarHandle VH_properties$limits$timestampComputeAndGraphics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("timestampComputeAndGraphics"));
    public static final VarHandle VH_properties$limits$timestampPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("timestampPeriod"));
    public static final VarHandle VH_properties$limits$maxClipDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxClipDistances"));
    public static final VarHandle VH_properties$limits$maxCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxCullDistances"));
    public static final VarHandle VH_properties$limits$maxCombinedClipAndCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("maxCombinedClipAndCullDistances"));
    public static final VarHandle VH_properties$limits$discreteQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("discreteQueuePriorities"));
    public static final VarHandle VH_properties$limits$pointSizeRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("pointSizeRange"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$lineWidthRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("lineWidthRange"), PathElement.sequenceElement());
    public static final VarHandle VH_properties$limits$pointSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("pointSizeGranularity"));
    public static final VarHandle VH_properties$limits$lineWidthGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("lineWidthGranularity"));
    public static final VarHandle VH_properties$limits$strictLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("strictLines"));
    public static final VarHandle VH_properties$limits$standardSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("standardSampleLocations"));
    public static final VarHandle VH_properties$limits$optimalBufferCopyOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    public static final VarHandle VH_properties$limits$optimalBufferCopyRowPitchAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    public static final VarHandle VH_properties$limits$nonCoherentAtomSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("limits"), PathElement.groupElement("nonCoherentAtomSize"));
    public static final VarHandle VH_properties$sparseProperties$residencyStandard2DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyStandard2DBlockShape"));
    public static final VarHandle VH_properties$sparseProperties$residencyStandard2DMultisampleBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    public static final VarHandle VH_properties$sparseProperties$residencyStandard3DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyStandard3DBlockShape"));
    public static final VarHandle VH_properties$sparseProperties$residencyAlignedMipSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyAlignedMipSize"));
    public static final VarHandle VH_properties$sparseProperties$residencyNonResidentStrict = LAYOUT.arrayElementVarHandle(PathElement.groupElement("properties"), PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyNonResidentStrict"));

    public VkPhysicalDeviceProperties2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceProperties2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties2(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceProperties2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties2(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceProperties2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties2(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceProperties2 alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProperties2(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceProperties2 alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProperties2(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceProperties2 allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2); }
    public static VkPhysicalDeviceProperties2 allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROPERTIES_2);
        return s;
    }
    public VkPhysicalDeviceProperties2 copyFrom(VkPhysicalDeviceProperties2 src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceProperties2 reinterpret(long count) { return new VkPhysicalDeviceProperties2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceProperties2 asSlice(long index) { return new VkPhysicalDeviceProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceProperties2 asSlice(long index, long count) { return new VkPhysicalDeviceProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceProperties2 at(long index, Consumer<VkPhysicalDeviceProperties2> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int properties$apiVersionAt(long index) { return (int) VH_properties$apiVersion.get(this.segment(), 0L, index); }
    public int properties$driverVersionAt(long index) { return (int) VH_properties$driverVersion.get(this.segment(), 0L, index); }
    public int properties$vendorIDAt(long index) { return (int) VH_properties$vendorID.get(this.segment(), 0L, index); }
    public int properties$deviceIDAt(long index) { return (int) VH_properties$deviceID.get(this.segment(), 0L, index); }
    public int properties$deviceTypeAt(long index) { return (int) VH_properties$deviceType.get(this.segment(), 0L, index); }
    public byte properties$deviceNameAt(long index, long index0) { return (byte) VH_properties$deviceName.get(this.segment(), 0L, index, index0); }
    public byte properties$pipelineCacheUUIDAt(long index, long index0) { return (byte) VH_properties$pipelineCacheUUID.get(this.segment(), 0L, index, index0); }
    public int properties$limits$maxImageDimension1DAt(long index) { return (int) VH_properties$limits$maxImageDimension1D.get(this.segment(), 0L, index); }
    public int properties$limits$maxImageDimension2DAt(long index) { return (int) VH_properties$limits$maxImageDimension2D.get(this.segment(), 0L, index); }
    public int properties$limits$maxImageDimension3DAt(long index) { return (int) VH_properties$limits$maxImageDimension3D.get(this.segment(), 0L, index); }
    public int properties$limits$maxImageDimensionCubeAt(long index) { return (int) VH_properties$limits$maxImageDimensionCube.get(this.segment(), 0L, index); }
    public int properties$limits$maxImageArrayLayersAt(long index) { return (int) VH_properties$limits$maxImageArrayLayers.get(this.segment(), 0L, index); }
    public int properties$limits$maxTexelBufferElementsAt(long index) { return (int) VH_properties$limits$maxTexelBufferElements.get(this.segment(), 0L, index); }
    public int properties$limits$maxUniformBufferRangeAt(long index) { return (int) VH_properties$limits$maxUniformBufferRange.get(this.segment(), 0L, index); }
    public int properties$limits$maxStorageBufferRangeAt(long index) { return (int) VH_properties$limits$maxStorageBufferRange.get(this.segment(), 0L, index); }
    public int properties$limits$maxPushConstantsSizeAt(long index) { return (int) VH_properties$limits$maxPushConstantsSize.get(this.segment(), 0L, index); }
    public int properties$limits$maxMemoryAllocationCountAt(long index) { return (int) VH_properties$limits$maxMemoryAllocationCount.get(this.segment(), 0L, index); }
    public int properties$limits$maxSamplerAllocationCountAt(long index) { return (int) VH_properties$limits$maxSamplerAllocationCount.get(this.segment(), 0L, index); }
    public long properties$limits$bufferImageGranularityAt(long index) { return (long) VH_properties$limits$bufferImageGranularity.get(this.segment(), 0L, index); }
    public long properties$limits$sparseAddressSpaceSizeAt(long index) { return (long) VH_properties$limits$sparseAddressSpaceSize.get(this.segment(), 0L, index); }
    public int properties$limits$maxBoundDescriptorSetsAt(long index) { return (int) VH_properties$limits$maxBoundDescriptorSets.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageDescriptorSamplersAt(long index) { return (int) VH_properties$limits$maxPerStageDescriptorSamplers.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageDescriptorUniformBuffersAt(long index) { return (int) VH_properties$limits$maxPerStageDescriptorUniformBuffers.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageDescriptorStorageBuffersAt(long index) { return (int) VH_properties$limits$maxPerStageDescriptorStorageBuffers.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageDescriptorSampledImagesAt(long index) { return (int) VH_properties$limits$maxPerStageDescriptorSampledImages.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageDescriptorStorageImagesAt(long index) { return (int) VH_properties$limits$maxPerStageDescriptorStorageImages.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageDescriptorInputAttachmentsAt(long index) { return (int) VH_properties$limits$maxPerStageDescriptorInputAttachments.get(this.segment(), 0L, index); }
    public int properties$limits$maxPerStageResourcesAt(long index) { return (int) VH_properties$limits$maxPerStageResources.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetSamplersAt(long index) { return (int) VH_properties$limits$maxDescriptorSetSamplers.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetUniformBuffersAt(long index) { return (int) VH_properties$limits$maxDescriptorSetUniformBuffers.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetUniformBuffersDynamicAt(long index) { return (int) VH_properties$limits$maxDescriptorSetUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetStorageBuffersAt(long index) { return (int) VH_properties$limits$maxDescriptorSetStorageBuffers.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetStorageBuffersDynamicAt(long index) { return (int) VH_properties$limits$maxDescriptorSetStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetSampledImagesAt(long index) { return (int) VH_properties$limits$maxDescriptorSetSampledImages.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetStorageImagesAt(long index) { return (int) VH_properties$limits$maxDescriptorSetStorageImages.get(this.segment(), 0L, index); }
    public int properties$limits$maxDescriptorSetInputAttachmentsAt(long index) { return (int) VH_properties$limits$maxDescriptorSetInputAttachments.get(this.segment(), 0L, index); }
    public int properties$limits$maxVertexInputAttributesAt(long index) { return (int) VH_properties$limits$maxVertexInputAttributes.get(this.segment(), 0L, index); }
    public int properties$limits$maxVertexInputBindingsAt(long index) { return (int) VH_properties$limits$maxVertexInputBindings.get(this.segment(), 0L, index); }
    public int properties$limits$maxVertexInputAttributeOffsetAt(long index) { return (int) VH_properties$limits$maxVertexInputAttributeOffset.get(this.segment(), 0L, index); }
    public int properties$limits$maxVertexInputBindingStrideAt(long index) { return (int) VH_properties$limits$maxVertexInputBindingStride.get(this.segment(), 0L, index); }
    public int properties$limits$maxVertexOutputComponentsAt(long index) { return (int) VH_properties$limits$maxVertexOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationGenerationLevelAt(long index) { return (int) VH_properties$limits$maxTessellationGenerationLevel.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationPatchSizeAt(long index) { return (int) VH_properties$limits$maxTessellationPatchSize.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationControlPerVertexInputComponentsAt(long index) { return (int) VH_properties$limits$maxTessellationControlPerVertexInputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationControlPerVertexOutputComponentsAt(long index) { return (int) VH_properties$limits$maxTessellationControlPerVertexOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationControlPerPatchOutputComponentsAt(long index) { return (int) VH_properties$limits$maxTessellationControlPerPatchOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationControlTotalOutputComponentsAt(long index) { return (int) VH_properties$limits$maxTessellationControlTotalOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationEvaluationInputComponentsAt(long index) { return (int) VH_properties$limits$maxTessellationEvaluationInputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxTessellationEvaluationOutputComponentsAt(long index) { return (int) VH_properties$limits$maxTessellationEvaluationOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxGeometryShaderInvocationsAt(long index) { return (int) VH_properties$limits$maxGeometryShaderInvocations.get(this.segment(), 0L, index); }
    public int properties$limits$maxGeometryInputComponentsAt(long index) { return (int) VH_properties$limits$maxGeometryInputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxGeometryOutputComponentsAt(long index) { return (int) VH_properties$limits$maxGeometryOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxGeometryOutputVerticesAt(long index) { return (int) VH_properties$limits$maxGeometryOutputVertices.get(this.segment(), 0L, index); }
    public int properties$limits$maxGeometryTotalOutputComponentsAt(long index) { return (int) VH_properties$limits$maxGeometryTotalOutputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxFragmentInputComponentsAt(long index) { return (int) VH_properties$limits$maxFragmentInputComponents.get(this.segment(), 0L, index); }
    public int properties$limits$maxFragmentOutputAttachmentsAt(long index) { return (int) VH_properties$limits$maxFragmentOutputAttachments.get(this.segment(), 0L, index); }
    public int properties$limits$maxFragmentDualSrcAttachmentsAt(long index) { return (int) VH_properties$limits$maxFragmentDualSrcAttachments.get(this.segment(), 0L, index); }
    public int properties$limits$maxFragmentCombinedOutputResourcesAt(long index) { return (int) VH_properties$limits$maxFragmentCombinedOutputResources.get(this.segment(), 0L, index); }
    public int properties$limits$maxComputeSharedMemorySizeAt(long index) { return (int) VH_properties$limits$maxComputeSharedMemorySize.get(this.segment(), 0L, index); }
    public int properties$limits$maxComputeWorkGroupCountAt(long index, long index0) { return (int) VH_properties$limits$maxComputeWorkGroupCount.get(this.segment(), 0L, index, index0); }
    public int properties$limits$maxComputeWorkGroupInvocationsAt(long index) { return (int) VH_properties$limits$maxComputeWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int properties$limits$maxComputeWorkGroupSizeAt(long index, long index0) { return (int) VH_properties$limits$maxComputeWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int properties$limits$subPixelPrecisionBitsAt(long index) { return (int) VH_properties$limits$subPixelPrecisionBits.get(this.segment(), 0L, index); }
    public int properties$limits$subTexelPrecisionBitsAt(long index) { return (int) VH_properties$limits$subTexelPrecisionBits.get(this.segment(), 0L, index); }
    public int properties$limits$mipmapPrecisionBitsAt(long index) { return (int) VH_properties$limits$mipmapPrecisionBits.get(this.segment(), 0L, index); }
    public int properties$limits$maxDrawIndexedIndexValueAt(long index) { return (int) VH_properties$limits$maxDrawIndexedIndexValue.get(this.segment(), 0L, index); }
    public int properties$limits$maxDrawIndirectCountAt(long index) { return (int) VH_properties$limits$maxDrawIndirectCount.get(this.segment(), 0L, index); }
    public float properties$limits$maxSamplerLodBiasAt(long index) { return (float) VH_properties$limits$maxSamplerLodBias.get(this.segment(), 0L, index); }
    public float properties$limits$maxSamplerAnisotropyAt(long index) { return (float) VH_properties$limits$maxSamplerAnisotropy.get(this.segment(), 0L, index); }
    public int properties$limits$maxViewportsAt(long index) { return (int) VH_properties$limits$maxViewports.get(this.segment(), 0L, index); }
    public int properties$limits$maxViewportDimensionsAt(long index, long index0) { return (int) VH_properties$limits$maxViewportDimensions.get(this.segment(), 0L, index, index0); }
    public float properties$limits$viewportBoundsRangeAt(long index, long index0) { return (float) VH_properties$limits$viewportBoundsRange.get(this.segment(), 0L, index, index0); }
    public int properties$limits$viewportSubPixelBitsAt(long index) { return (int) VH_properties$limits$viewportSubPixelBits.get(this.segment(), 0L, index); }
    public long properties$limits$minMemoryMapAlignmentAt(long index) { return (long) VH_properties$limits$minMemoryMapAlignment.get(this.segment(), 0L, index); }
    public long properties$limits$minTexelBufferOffsetAlignmentAt(long index) { return (long) VH_properties$limits$minTexelBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long properties$limits$minUniformBufferOffsetAlignmentAt(long index) { return (long) VH_properties$limits$minUniformBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long properties$limits$minStorageBufferOffsetAlignmentAt(long index) { return (long) VH_properties$limits$minStorageBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int properties$limits$minTexelOffsetAt(long index) { return (int) VH_properties$limits$minTexelOffset.get(this.segment(), 0L, index); }
    public int properties$limits$maxTexelOffsetAt(long index) { return (int) VH_properties$limits$maxTexelOffset.get(this.segment(), 0L, index); }
    public int properties$limits$minTexelGatherOffsetAt(long index) { return (int) VH_properties$limits$minTexelGatherOffset.get(this.segment(), 0L, index); }
    public int properties$limits$maxTexelGatherOffsetAt(long index) { return (int) VH_properties$limits$maxTexelGatherOffset.get(this.segment(), 0L, index); }
    public float properties$limits$minInterpolationOffsetAt(long index) { return (float) VH_properties$limits$minInterpolationOffset.get(this.segment(), 0L, index); }
    public float properties$limits$maxInterpolationOffsetAt(long index) { return (float) VH_properties$limits$maxInterpolationOffset.get(this.segment(), 0L, index); }
    public int properties$limits$subPixelInterpolationOffsetBitsAt(long index) { return (int) VH_properties$limits$subPixelInterpolationOffsetBits.get(this.segment(), 0L, index); }
    public int properties$limits$maxFramebufferWidthAt(long index) { return (int) VH_properties$limits$maxFramebufferWidth.get(this.segment(), 0L, index); }
    public int properties$limits$maxFramebufferHeightAt(long index) { return (int) VH_properties$limits$maxFramebufferHeight.get(this.segment(), 0L, index); }
    public int properties$limits$maxFramebufferLayersAt(long index) { return (int) VH_properties$limits$maxFramebufferLayers.get(this.segment(), 0L, index); }
    public int properties$limits$framebufferColorSampleCountsAt(long index) { return (int) VH_properties$limits$framebufferColorSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$framebufferDepthSampleCountsAt(long index) { return (int) VH_properties$limits$framebufferDepthSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$framebufferStencilSampleCountsAt(long index) { return (int) VH_properties$limits$framebufferStencilSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$framebufferNoAttachmentsSampleCountsAt(long index) { return (int) VH_properties$limits$framebufferNoAttachmentsSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$maxColorAttachmentsAt(long index) { return (int) VH_properties$limits$maxColorAttachments.get(this.segment(), 0L, index); }
    public int properties$limits$sampledImageColorSampleCountsAt(long index) { return (int) VH_properties$limits$sampledImageColorSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$sampledImageIntegerSampleCountsAt(long index) { return (int) VH_properties$limits$sampledImageIntegerSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$sampledImageDepthSampleCountsAt(long index) { return (int) VH_properties$limits$sampledImageDepthSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$sampledImageStencilSampleCountsAt(long index) { return (int) VH_properties$limits$sampledImageStencilSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$storageImageSampleCountsAt(long index) { return (int) VH_properties$limits$storageImageSampleCounts.get(this.segment(), 0L, index); }
    public int properties$limits$maxSampleMaskWordsAt(long index) { return (int) VH_properties$limits$maxSampleMaskWords.get(this.segment(), 0L, index); }
    public int properties$limits$timestampComputeAndGraphicsAt(long index) { return (int) VH_properties$limits$timestampComputeAndGraphics.get(this.segment(), 0L, index); }
    public float properties$limits$timestampPeriodAt(long index) { return (float) VH_properties$limits$timestampPeriod.get(this.segment(), 0L, index); }
    public int properties$limits$maxClipDistancesAt(long index) { return (int) VH_properties$limits$maxClipDistances.get(this.segment(), 0L, index); }
    public int properties$limits$maxCullDistancesAt(long index) { return (int) VH_properties$limits$maxCullDistances.get(this.segment(), 0L, index); }
    public int properties$limits$maxCombinedClipAndCullDistancesAt(long index) { return (int) VH_properties$limits$maxCombinedClipAndCullDistances.get(this.segment(), 0L, index); }
    public int properties$limits$discreteQueuePrioritiesAt(long index) { return (int) VH_properties$limits$discreteQueuePriorities.get(this.segment(), 0L, index); }
    public float properties$limits$pointSizeRangeAt(long index, long index0) { return (float) VH_properties$limits$pointSizeRange.get(this.segment(), 0L, index, index0); }
    public float properties$limits$lineWidthRangeAt(long index, long index0) { return (float) VH_properties$limits$lineWidthRange.get(this.segment(), 0L, index, index0); }
    public float properties$limits$pointSizeGranularityAt(long index) { return (float) VH_properties$limits$pointSizeGranularity.get(this.segment(), 0L, index); }
    public float properties$limits$lineWidthGranularityAt(long index) { return (float) VH_properties$limits$lineWidthGranularity.get(this.segment(), 0L, index); }
    public int properties$limits$strictLinesAt(long index) { return (int) VH_properties$limits$strictLines.get(this.segment(), 0L, index); }
    public int properties$limits$standardSampleLocationsAt(long index) { return (int) VH_properties$limits$standardSampleLocations.get(this.segment(), 0L, index); }
    public long properties$limits$optimalBufferCopyOffsetAlignmentAt(long index) { return (long) VH_properties$limits$optimalBufferCopyOffsetAlignment.get(this.segment(), 0L, index); }
    public long properties$limits$optimalBufferCopyRowPitchAlignmentAt(long index) { return (long) VH_properties$limits$optimalBufferCopyRowPitchAlignment.get(this.segment(), 0L, index); }
    public long properties$limits$nonCoherentAtomSizeAt(long index) { return (long) VH_properties$limits$nonCoherentAtomSize.get(this.segment(), 0L, index); }
    public int properties$sparseProperties$residencyStandard2DBlockShapeAt(long index) { return (int) VH_properties$sparseProperties$residencyStandard2DBlockShape.get(this.segment(), 0L, index); }
    public int properties$sparseProperties$residencyStandard2DMultisampleBlockShapeAt(long index) { return (int) VH_properties$sparseProperties$residencyStandard2DMultisampleBlockShape.get(this.segment(), 0L, index); }
    public int properties$sparseProperties$residencyStandard3DBlockShapeAt(long index) { return (int) VH_properties$sparseProperties$residencyStandard3DBlockShape.get(this.segment(), 0L, index); }
    public int properties$sparseProperties$residencyAlignedMipSizeAt(long index) { return (int) VH_properties$sparseProperties$residencyAlignedMipSize.get(this.segment(), 0L, index); }
    public int properties$sparseProperties$residencyNonResidentStrictAt(long index) { return (int) VH_properties$sparseProperties$residencyNonResidentStrict.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int properties$apiVersion() { return (int) VH_properties$apiVersion.get(this.segment(), 0L, 0L); }
    public int properties$driverVersion() { return (int) VH_properties$driverVersion.get(this.segment(), 0L, 0L); }
    public int properties$vendorID() { return (int) VH_properties$vendorID.get(this.segment(), 0L, 0L); }
    public int properties$deviceID() { return (int) VH_properties$deviceID.get(this.segment(), 0L, 0L); }
    public int properties$deviceType() { return (int) VH_properties$deviceType.get(this.segment(), 0L, 0L); }
    public byte properties$deviceName(long index0) { return (byte) VH_properties$deviceName.get(this.segment(), 0L, 0L, index0); }
    public byte properties$pipelineCacheUUID(long index0) { return (byte) VH_properties$pipelineCacheUUID.get(this.segment(), 0L, 0L, index0); }
    public int properties$limits$maxImageDimension1D() { return (int) VH_properties$limits$maxImageDimension1D.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxImageDimension2D() { return (int) VH_properties$limits$maxImageDimension2D.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxImageDimension3D() { return (int) VH_properties$limits$maxImageDimension3D.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxImageDimensionCube() { return (int) VH_properties$limits$maxImageDimensionCube.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxImageArrayLayers() { return (int) VH_properties$limits$maxImageArrayLayers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTexelBufferElements() { return (int) VH_properties$limits$maxTexelBufferElements.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxUniformBufferRange() { return (int) VH_properties$limits$maxUniformBufferRange.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxStorageBufferRange() { return (int) VH_properties$limits$maxStorageBufferRange.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPushConstantsSize() { return (int) VH_properties$limits$maxPushConstantsSize.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxMemoryAllocationCount() { return (int) VH_properties$limits$maxMemoryAllocationCount.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxSamplerAllocationCount() { return (int) VH_properties$limits$maxSamplerAllocationCount.get(this.segment(), 0L, 0L); }
    public long properties$limits$bufferImageGranularity() { return (long) VH_properties$limits$bufferImageGranularity.get(this.segment(), 0L, 0L); }
    public long properties$limits$sparseAddressSpaceSize() { return (long) VH_properties$limits$sparseAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxBoundDescriptorSets() { return (int) VH_properties$limits$maxBoundDescriptorSets.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageDescriptorSamplers() { return (int) VH_properties$limits$maxPerStageDescriptorSamplers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageDescriptorUniformBuffers() { return (int) VH_properties$limits$maxPerStageDescriptorUniformBuffers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageDescriptorStorageBuffers() { return (int) VH_properties$limits$maxPerStageDescriptorStorageBuffers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageDescriptorSampledImages() { return (int) VH_properties$limits$maxPerStageDescriptorSampledImages.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageDescriptorStorageImages() { return (int) VH_properties$limits$maxPerStageDescriptorStorageImages.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageDescriptorInputAttachments() { return (int) VH_properties$limits$maxPerStageDescriptorInputAttachments.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxPerStageResources() { return (int) VH_properties$limits$maxPerStageResources.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetSamplers() { return (int) VH_properties$limits$maxDescriptorSetSamplers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetUniformBuffers() { return (int) VH_properties$limits$maxDescriptorSetUniformBuffers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetUniformBuffersDynamic() { return (int) VH_properties$limits$maxDescriptorSetUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetStorageBuffers() { return (int) VH_properties$limits$maxDescriptorSetStorageBuffers.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetStorageBuffersDynamic() { return (int) VH_properties$limits$maxDescriptorSetStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetSampledImages() { return (int) VH_properties$limits$maxDescriptorSetSampledImages.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetStorageImages() { return (int) VH_properties$limits$maxDescriptorSetStorageImages.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDescriptorSetInputAttachments() { return (int) VH_properties$limits$maxDescriptorSetInputAttachments.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxVertexInputAttributes() { return (int) VH_properties$limits$maxVertexInputAttributes.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxVertexInputBindings() { return (int) VH_properties$limits$maxVertexInputBindings.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxVertexInputAttributeOffset() { return (int) VH_properties$limits$maxVertexInputAttributeOffset.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxVertexInputBindingStride() { return (int) VH_properties$limits$maxVertexInputBindingStride.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxVertexOutputComponents() { return (int) VH_properties$limits$maxVertexOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationGenerationLevel() { return (int) VH_properties$limits$maxTessellationGenerationLevel.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationPatchSize() { return (int) VH_properties$limits$maxTessellationPatchSize.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationControlPerVertexInputComponents() { return (int) VH_properties$limits$maxTessellationControlPerVertexInputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationControlPerVertexOutputComponents() { return (int) VH_properties$limits$maxTessellationControlPerVertexOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationControlPerPatchOutputComponents() { return (int) VH_properties$limits$maxTessellationControlPerPatchOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationControlTotalOutputComponents() { return (int) VH_properties$limits$maxTessellationControlTotalOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationEvaluationInputComponents() { return (int) VH_properties$limits$maxTessellationEvaluationInputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTessellationEvaluationOutputComponents() { return (int) VH_properties$limits$maxTessellationEvaluationOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxGeometryShaderInvocations() { return (int) VH_properties$limits$maxGeometryShaderInvocations.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxGeometryInputComponents() { return (int) VH_properties$limits$maxGeometryInputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxGeometryOutputComponents() { return (int) VH_properties$limits$maxGeometryOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxGeometryOutputVertices() { return (int) VH_properties$limits$maxGeometryOutputVertices.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxGeometryTotalOutputComponents() { return (int) VH_properties$limits$maxGeometryTotalOutputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFragmentInputComponents() { return (int) VH_properties$limits$maxFragmentInputComponents.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFragmentOutputAttachments() { return (int) VH_properties$limits$maxFragmentOutputAttachments.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFragmentDualSrcAttachments() { return (int) VH_properties$limits$maxFragmentDualSrcAttachments.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFragmentCombinedOutputResources() { return (int) VH_properties$limits$maxFragmentCombinedOutputResources.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxComputeSharedMemorySize() { return (int) VH_properties$limits$maxComputeSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxComputeWorkGroupCount(long index0) { return (int) VH_properties$limits$maxComputeWorkGroupCount.get(this.segment(), 0L, 0L, index0); }
    public int properties$limits$maxComputeWorkGroupInvocations() { return (int) VH_properties$limits$maxComputeWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxComputeWorkGroupSize(long index0) { return (int) VH_properties$limits$maxComputeWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int properties$limits$subPixelPrecisionBits() { return (int) VH_properties$limits$subPixelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int properties$limits$subTexelPrecisionBits() { return (int) VH_properties$limits$subTexelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int properties$limits$mipmapPrecisionBits() { return (int) VH_properties$limits$mipmapPrecisionBits.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDrawIndexedIndexValue() { return (int) VH_properties$limits$maxDrawIndexedIndexValue.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxDrawIndirectCount() { return (int) VH_properties$limits$maxDrawIndirectCount.get(this.segment(), 0L, 0L); }
    public float properties$limits$maxSamplerLodBias() { return (float) VH_properties$limits$maxSamplerLodBias.get(this.segment(), 0L, 0L); }
    public float properties$limits$maxSamplerAnisotropy() { return (float) VH_properties$limits$maxSamplerAnisotropy.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxViewports() { return (int) VH_properties$limits$maxViewports.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxViewportDimensions(long index0) { return (int) VH_properties$limits$maxViewportDimensions.get(this.segment(), 0L, 0L, index0); }
    public float properties$limits$viewportBoundsRange(long index0) { return (float) VH_properties$limits$viewportBoundsRange.get(this.segment(), 0L, 0L, index0); }
    public int properties$limits$viewportSubPixelBits() { return (int) VH_properties$limits$viewportSubPixelBits.get(this.segment(), 0L, 0L); }
    public long properties$limits$minMemoryMapAlignment() { return (long) VH_properties$limits$minMemoryMapAlignment.get(this.segment(), 0L, 0L); }
    public long properties$limits$minTexelBufferOffsetAlignment() { return (long) VH_properties$limits$minTexelBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long properties$limits$minUniformBufferOffsetAlignment() { return (long) VH_properties$limits$minUniformBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long properties$limits$minStorageBufferOffsetAlignment() { return (long) VH_properties$limits$minStorageBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public int properties$limits$minTexelOffset() { return (int) VH_properties$limits$minTexelOffset.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTexelOffset() { return (int) VH_properties$limits$maxTexelOffset.get(this.segment(), 0L, 0L); }
    public int properties$limits$minTexelGatherOffset() { return (int) VH_properties$limits$minTexelGatherOffset.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxTexelGatherOffset() { return (int) VH_properties$limits$maxTexelGatherOffset.get(this.segment(), 0L, 0L); }
    public float properties$limits$minInterpolationOffset() { return (float) VH_properties$limits$minInterpolationOffset.get(this.segment(), 0L, 0L); }
    public float properties$limits$maxInterpolationOffset() { return (float) VH_properties$limits$maxInterpolationOffset.get(this.segment(), 0L, 0L); }
    public int properties$limits$subPixelInterpolationOffsetBits() { return (int) VH_properties$limits$subPixelInterpolationOffsetBits.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFramebufferWidth() { return (int) VH_properties$limits$maxFramebufferWidth.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFramebufferHeight() { return (int) VH_properties$limits$maxFramebufferHeight.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxFramebufferLayers() { return (int) VH_properties$limits$maxFramebufferLayers.get(this.segment(), 0L, 0L); }
    public int properties$limits$framebufferColorSampleCounts() { return (int) VH_properties$limits$framebufferColorSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$framebufferDepthSampleCounts() { return (int) VH_properties$limits$framebufferDepthSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$framebufferStencilSampleCounts() { return (int) VH_properties$limits$framebufferStencilSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$framebufferNoAttachmentsSampleCounts() { return (int) VH_properties$limits$framebufferNoAttachmentsSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxColorAttachments() { return (int) VH_properties$limits$maxColorAttachments.get(this.segment(), 0L, 0L); }
    public int properties$limits$sampledImageColorSampleCounts() { return (int) VH_properties$limits$sampledImageColorSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$sampledImageIntegerSampleCounts() { return (int) VH_properties$limits$sampledImageIntegerSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$sampledImageDepthSampleCounts() { return (int) VH_properties$limits$sampledImageDepthSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$sampledImageStencilSampleCounts() { return (int) VH_properties$limits$sampledImageStencilSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$storageImageSampleCounts() { return (int) VH_properties$limits$storageImageSampleCounts.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxSampleMaskWords() { return (int) VH_properties$limits$maxSampleMaskWords.get(this.segment(), 0L, 0L); }
    public int properties$limits$timestampComputeAndGraphics() { return (int) VH_properties$limits$timestampComputeAndGraphics.get(this.segment(), 0L, 0L); }
    public float properties$limits$timestampPeriod() { return (float) VH_properties$limits$timestampPeriod.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxClipDistances() { return (int) VH_properties$limits$maxClipDistances.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxCullDistances() { return (int) VH_properties$limits$maxCullDistances.get(this.segment(), 0L, 0L); }
    public int properties$limits$maxCombinedClipAndCullDistances() { return (int) VH_properties$limits$maxCombinedClipAndCullDistances.get(this.segment(), 0L, 0L); }
    public int properties$limits$discreteQueuePriorities() { return (int) VH_properties$limits$discreteQueuePriorities.get(this.segment(), 0L, 0L); }
    public float properties$limits$pointSizeRange(long index0) { return (float) VH_properties$limits$pointSizeRange.get(this.segment(), 0L, 0L, index0); }
    public float properties$limits$lineWidthRange(long index0) { return (float) VH_properties$limits$lineWidthRange.get(this.segment(), 0L, 0L, index0); }
    public float properties$limits$pointSizeGranularity() { return (float) VH_properties$limits$pointSizeGranularity.get(this.segment(), 0L, 0L); }
    public float properties$limits$lineWidthGranularity() { return (float) VH_properties$limits$lineWidthGranularity.get(this.segment(), 0L, 0L); }
    public int properties$limits$strictLines() { return (int) VH_properties$limits$strictLines.get(this.segment(), 0L, 0L); }
    public int properties$limits$standardSampleLocations() { return (int) VH_properties$limits$standardSampleLocations.get(this.segment(), 0L, 0L); }
    public long properties$limits$optimalBufferCopyOffsetAlignment() { return (long) VH_properties$limits$optimalBufferCopyOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long properties$limits$optimalBufferCopyRowPitchAlignment() { return (long) VH_properties$limits$optimalBufferCopyRowPitchAlignment.get(this.segment(), 0L, 0L); }
    public long properties$limits$nonCoherentAtomSize() { return (long) VH_properties$limits$nonCoherentAtomSize.get(this.segment(), 0L, 0L); }
    public int properties$sparseProperties$residencyStandard2DBlockShape() { return (int) VH_properties$sparseProperties$residencyStandard2DBlockShape.get(this.segment(), 0L, 0L); }
    public int properties$sparseProperties$residencyStandard2DMultisampleBlockShape() { return (int) VH_properties$sparseProperties$residencyStandard2DMultisampleBlockShape.get(this.segment(), 0L, 0L); }
    public int properties$sparseProperties$residencyStandard3DBlockShape() { return (int) VH_properties$sparseProperties$residencyStandard3DBlockShape.get(this.segment(), 0L, 0L); }
    public int properties$sparseProperties$residencyAlignedMipSize() { return (int) VH_properties$sparseProperties$residencyAlignedMipSize.get(this.segment(), 0L, 0L); }
    public int properties$sparseProperties$residencyNonResidentStrict() { return (int) VH_properties$sparseProperties$residencyNonResidentStrict.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceProperties2 sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$apiVersionAt(long index, int value) { VH_properties$apiVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$driverVersionAt(long index, int value) { VH_properties$driverVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$vendorIDAt(long index, int value) { VH_properties$vendorID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$deviceIDAt(long index, int value) { VH_properties$deviceID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$deviceTypeAt(long index, int value) { VH_properties$deviceType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$deviceNameAt(long index, long index0, byte value) { VH_properties$deviceName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$pipelineCacheUUIDAt(long index, long index0, byte value) { VH_properties$pipelineCacheUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimension1DAt(long index, int value) { VH_properties$limits$maxImageDimension1D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimension2DAt(long index, int value) { VH_properties$limits$maxImageDimension2D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimension3DAt(long index, int value) { VH_properties$limits$maxImageDimension3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimensionCubeAt(long index, int value) { VH_properties$limits$maxImageDimensionCube.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageArrayLayersAt(long index, int value) { VH_properties$limits$maxImageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTexelBufferElementsAt(long index, int value) { VH_properties$limits$maxTexelBufferElements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxUniformBufferRangeAt(long index, int value) { VH_properties$limits$maxUniformBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxStorageBufferRangeAt(long index, int value) { VH_properties$limits$maxStorageBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPushConstantsSizeAt(long index, int value) { VH_properties$limits$maxPushConstantsSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxMemoryAllocationCountAt(long index, int value) { VH_properties$limits$maxMemoryAllocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSamplerAllocationCountAt(long index, int value) { VH_properties$limits$maxSamplerAllocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$bufferImageGranularityAt(long index, long value) { VH_properties$limits$bufferImageGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sparseAddressSpaceSizeAt(long index, long value) { VH_properties$limits$sparseAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxBoundDescriptorSetsAt(long index, int value) { VH_properties$limits$maxBoundDescriptorSets.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorSamplersAt(long index, int value) { VH_properties$limits$maxPerStageDescriptorSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorUniformBuffersAt(long index, int value) { VH_properties$limits$maxPerStageDescriptorUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorStorageBuffersAt(long index, int value) { VH_properties$limits$maxPerStageDescriptorStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorSampledImagesAt(long index, int value) { VH_properties$limits$maxPerStageDescriptorSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorStorageImagesAt(long index, int value) { VH_properties$limits$maxPerStageDescriptorStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorInputAttachmentsAt(long index, int value) { VH_properties$limits$maxPerStageDescriptorInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageResourcesAt(long index, int value) { VH_properties$limits$maxPerStageResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetSamplersAt(long index, int value) { VH_properties$limits$maxDescriptorSetSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetUniformBuffersAt(long index, int value) { VH_properties$limits$maxDescriptorSetUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetUniformBuffersDynamicAt(long index, int value) { VH_properties$limits$maxDescriptorSetUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetStorageBuffersAt(long index, int value) { VH_properties$limits$maxDescriptorSetStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetStorageBuffersDynamicAt(long index, int value) { VH_properties$limits$maxDescriptorSetStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetSampledImagesAt(long index, int value) { VH_properties$limits$maxDescriptorSetSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetStorageImagesAt(long index, int value) { VH_properties$limits$maxDescriptorSetStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetInputAttachmentsAt(long index, int value) { VH_properties$limits$maxDescriptorSetInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputAttributesAt(long index, int value) { VH_properties$limits$maxVertexInputAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputBindingsAt(long index, int value) { VH_properties$limits$maxVertexInputBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputAttributeOffsetAt(long index, int value) { VH_properties$limits$maxVertexInputAttributeOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputBindingStrideAt(long index, int value) { VH_properties$limits$maxVertexInputBindingStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexOutputComponentsAt(long index, int value) { VH_properties$limits$maxVertexOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationGenerationLevelAt(long index, int value) { VH_properties$limits$maxTessellationGenerationLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationPatchSizeAt(long index, int value) { VH_properties$limits$maxTessellationPatchSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlPerVertexInputComponentsAt(long index, int value) { VH_properties$limits$maxTessellationControlPerVertexInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlPerVertexOutputComponentsAt(long index, int value) { VH_properties$limits$maxTessellationControlPerVertexOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlPerPatchOutputComponentsAt(long index, int value) { VH_properties$limits$maxTessellationControlPerPatchOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlTotalOutputComponentsAt(long index, int value) { VH_properties$limits$maxTessellationControlTotalOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationEvaluationInputComponentsAt(long index, int value) { VH_properties$limits$maxTessellationEvaluationInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationEvaluationOutputComponentsAt(long index, int value) { VH_properties$limits$maxTessellationEvaluationOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryShaderInvocationsAt(long index, int value) { VH_properties$limits$maxGeometryShaderInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryInputComponentsAt(long index, int value) { VH_properties$limits$maxGeometryInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryOutputComponentsAt(long index, int value) { VH_properties$limits$maxGeometryOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryOutputVerticesAt(long index, int value) { VH_properties$limits$maxGeometryOutputVertices.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryTotalOutputComponentsAt(long index, int value) { VH_properties$limits$maxGeometryTotalOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentInputComponentsAt(long index, int value) { VH_properties$limits$maxFragmentInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentOutputAttachmentsAt(long index, int value) { VH_properties$limits$maxFragmentOutputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentDualSrcAttachmentsAt(long index, int value) { VH_properties$limits$maxFragmentDualSrcAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentCombinedOutputResourcesAt(long index, int value) { VH_properties$limits$maxFragmentCombinedOutputResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeSharedMemorySizeAt(long index, int value) { VH_properties$limits$maxComputeSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeWorkGroupCountAt(long index, long index0, int value) { VH_properties$limits$maxComputeWorkGroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeWorkGroupInvocationsAt(long index, int value) { VH_properties$limits$maxComputeWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeWorkGroupSizeAt(long index, long index0, int value) { VH_properties$limits$maxComputeWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$subPixelPrecisionBitsAt(long index, int value) { VH_properties$limits$subPixelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$subTexelPrecisionBitsAt(long index, int value) { VH_properties$limits$subTexelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$mipmapPrecisionBitsAt(long index, int value) { VH_properties$limits$mipmapPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDrawIndexedIndexValueAt(long index, int value) { VH_properties$limits$maxDrawIndexedIndexValue.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDrawIndirectCountAt(long index, int value) { VH_properties$limits$maxDrawIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSamplerLodBiasAt(long index, float value) { VH_properties$limits$maxSamplerLodBias.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSamplerAnisotropyAt(long index, float value) { VH_properties$limits$maxSamplerAnisotropy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxViewportsAt(long index, int value) { VH_properties$limits$maxViewports.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxViewportDimensionsAt(long index, long index0, int value) { VH_properties$limits$maxViewportDimensions.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$viewportBoundsRangeAt(long index, long index0, float value) { VH_properties$limits$viewportBoundsRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$viewportSubPixelBitsAt(long index, int value) { VH_properties$limits$viewportSubPixelBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minMemoryMapAlignmentAt(long index, long value) { VH_properties$limits$minMemoryMapAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minTexelBufferOffsetAlignmentAt(long index, long value) { VH_properties$limits$minTexelBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minUniformBufferOffsetAlignmentAt(long index, long value) { VH_properties$limits$minUniformBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minStorageBufferOffsetAlignmentAt(long index, long value) { VH_properties$limits$minStorageBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minTexelOffsetAt(long index, int value) { VH_properties$limits$minTexelOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTexelOffsetAt(long index, int value) { VH_properties$limits$maxTexelOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minTexelGatherOffsetAt(long index, int value) { VH_properties$limits$minTexelGatherOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTexelGatherOffsetAt(long index, int value) { VH_properties$limits$maxTexelGatherOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minInterpolationOffsetAt(long index, float value) { VH_properties$limits$minInterpolationOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxInterpolationOffsetAt(long index, float value) { VH_properties$limits$maxInterpolationOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$subPixelInterpolationOffsetBitsAt(long index, int value) { VH_properties$limits$subPixelInterpolationOffsetBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFramebufferWidthAt(long index, int value) { VH_properties$limits$maxFramebufferWidth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFramebufferHeightAt(long index, int value) { VH_properties$limits$maxFramebufferHeight.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFramebufferLayersAt(long index, int value) { VH_properties$limits$maxFramebufferLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferColorSampleCountsAt(long index, int value) { VH_properties$limits$framebufferColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferDepthSampleCountsAt(long index, int value) { VH_properties$limits$framebufferDepthSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferStencilSampleCountsAt(long index, int value) { VH_properties$limits$framebufferStencilSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferNoAttachmentsSampleCountsAt(long index, int value) { VH_properties$limits$framebufferNoAttachmentsSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxColorAttachmentsAt(long index, int value) { VH_properties$limits$maxColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageColorSampleCountsAt(long index, int value) { VH_properties$limits$sampledImageColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageIntegerSampleCountsAt(long index, int value) { VH_properties$limits$sampledImageIntegerSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageDepthSampleCountsAt(long index, int value) { VH_properties$limits$sampledImageDepthSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageStencilSampleCountsAt(long index, int value) { VH_properties$limits$sampledImageStencilSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$storageImageSampleCountsAt(long index, int value) { VH_properties$limits$storageImageSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSampleMaskWordsAt(long index, int value) { VH_properties$limits$maxSampleMaskWords.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$timestampComputeAndGraphicsAt(long index, int value) { VH_properties$limits$timestampComputeAndGraphics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$timestampPeriodAt(long index, float value) { VH_properties$limits$timestampPeriod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxClipDistancesAt(long index, int value) { VH_properties$limits$maxClipDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxCullDistancesAt(long index, int value) { VH_properties$limits$maxCullDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxCombinedClipAndCullDistancesAt(long index, int value) { VH_properties$limits$maxCombinedClipAndCullDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$discreteQueuePrioritiesAt(long index, int value) { VH_properties$limits$discreteQueuePriorities.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$pointSizeRangeAt(long index, long index0, float value) { VH_properties$limits$pointSizeRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$lineWidthRangeAt(long index, long index0, float value) { VH_properties$limits$lineWidthRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$pointSizeGranularityAt(long index, float value) { VH_properties$limits$pointSizeGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$lineWidthGranularityAt(long index, float value) { VH_properties$limits$lineWidthGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$strictLinesAt(long index, int value) { VH_properties$limits$strictLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$standardSampleLocationsAt(long index, int value) { VH_properties$limits$standardSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$optimalBufferCopyOffsetAlignmentAt(long index, long value) { VH_properties$limits$optimalBufferCopyOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$optimalBufferCopyRowPitchAlignmentAt(long index, long value) { VH_properties$limits$optimalBufferCopyRowPitchAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$nonCoherentAtomSizeAt(long index, long value) { VH_properties$limits$nonCoherentAtomSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyStandard2DBlockShapeAt(long index, int value) { VH_properties$sparseProperties$residencyStandard2DBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyStandard2DMultisampleBlockShapeAt(long index, int value) { VH_properties$sparseProperties$residencyStandard2DMultisampleBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyStandard3DBlockShapeAt(long index, int value) { VH_properties$sparseProperties$residencyStandard3DBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyAlignedMipSizeAt(long index, int value) { VH_properties$sparseProperties$residencyAlignedMipSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyNonResidentStrictAt(long index, int value) { VH_properties$sparseProperties$residencyNonResidentStrict.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties2 sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$apiVersion(int value) { VH_properties$apiVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$driverVersion(int value) { VH_properties$driverVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$vendorID(int value) { VH_properties$vendorID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$deviceID(int value) { VH_properties$deviceID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$deviceType(int value) { VH_properties$deviceType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$deviceName(long index0, byte value) { VH_properties$deviceName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$pipelineCacheUUID(long index0, byte value) { VH_properties$pipelineCacheUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimension1D(int value) { VH_properties$limits$maxImageDimension1D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimension2D(int value) { VH_properties$limits$maxImageDimension2D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimension3D(int value) { VH_properties$limits$maxImageDimension3D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageDimensionCube(int value) { VH_properties$limits$maxImageDimensionCube.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxImageArrayLayers(int value) { VH_properties$limits$maxImageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTexelBufferElements(int value) { VH_properties$limits$maxTexelBufferElements.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxUniformBufferRange(int value) { VH_properties$limits$maxUniformBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxStorageBufferRange(int value) { VH_properties$limits$maxStorageBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPushConstantsSize(int value) { VH_properties$limits$maxPushConstantsSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxMemoryAllocationCount(int value) { VH_properties$limits$maxMemoryAllocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSamplerAllocationCount(int value) { VH_properties$limits$maxSamplerAllocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$bufferImageGranularity(long value) { VH_properties$limits$bufferImageGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sparseAddressSpaceSize(long value) { VH_properties$limits$sparseAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxBoundDescriptorSets(int value) { VH_properties$limits$maxBoundDescriptorSets.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorSamplers(int value) { VH_properties$limits$maxPerStageDescriptorSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorUniformBuffers(int value) { VH_properties$limits$maxPerStageDescriptorUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorStorageBuffers(int value) { VH_properties$limits$maxPerStageDescriptorStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorSampledImages(int value) { VH_properties$limits$maxPerStageDescriptorSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorStorageImages(int value) { VH_properties$limits$maxPerStageDescriptorStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageDescriptorInputAttachments(int value) { VH_properties$limits$maxPerStageDescriptorInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxPerStageResources(int value) { VH_properties$limits$maxPerStageResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetSamplers(int value) { VH_properties$limits$maxDescriptorSetSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetUniformBuffers(int value) { VH_properties$limits$maxDescriptorSetUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetUniformBuffersDynamic(int value) { VH_properties$limits$maxDescriptorSetUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetStorageBuffers(int value) { VH_properties$limits$maxDescriptorSetStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetStorageBuffersDynamic(int value) { VH_properties$limits$maxDescriptorSetStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetSampledImages(int value) { VH_properties$limits$maxDescriptorSetSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetStorageImages(int value) { VH_properties$limits$maxDescriptorSetStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDescriptorSetInputAttachments(int value) { VH_properties$limits$maxDescriptorSetInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputAttributes(int value) { VH_properties$limits$maxVertexInputAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputBindings(int value) { VH_properties$limits$maxVertexInputBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputAttributeOffset(int value) { VH_properties$limits$maxVertexInputAttributeOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexInputBindingStride(int value) { VH_properties$limits$maxVertexInputBindingStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxVertexOutputComponents(int value) { VH_properties$limits$maxVertexOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationGenerationLevel(int value) { VH_properties$limits$maxTessellationGenerationLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationPatchSize(int value) { VH_properties$limits$maxTessellationPatchSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlPerVertexInputComponents(int value) { VH_properties$limits$maxTessellationControlPerVertexInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlPerVertexOutputComponents(int value) { VH_properties$limits$maxTessellationControlPerVertexOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlPerPatchOutputComponents(int value) { VH_properties$limits$maxTessellationControlPerPatchOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationControlTotalOutputComponents(int value) { VH_properties$limits$maxTessellationControlTotalOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationEvaluationInputComponents(int value) { VH_properties$limits$maxTessellationEvaluationInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTessellationEvaluationOutputComponents(int value) { VH_properties$limits$maxTessellationEvaluationOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryShaderInvocations(int value) { VH_properties$limits$maxGeometryShaderInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryInputComponents(int value) { VH_properties$limits$maxGeometryInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryOutputComponents(int value) { VH_properties$limits$maxGeometryOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryOutputVertices(int value) { VH_properties$limits$maxGeometryOutputVertices.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxGeometryTotalOutputComponents(int value) { VH_properties$limits$maxGeometryTotalOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentInputComponents(int value) { VH_properties$limits$maxFragmentInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentOutputAttachments(int value) { VH_properties$limits$maxFragmentOutputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentDualSrcAttachments(int value) { VH_properties$limits$maxFragmentDualSrcAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFragmentCombinedOutputResources(int value) { VH_properties$limits$maxFragmentCombinedOutputResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeSharedMemorySize(int value) { VH_properties$limits$maxComputeSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeWorkGroupCount(long index0, int value) { VH_properties$limits$maxComputeWorkGroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeWorkGroupInvocations(int value) { VH_properties$limits$maxComputeWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxComputeWorkGroupSize(long index0, int value) { VH_properties$limits$maxComputeWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$subPixelPrecisionBits(int value) { VH_properties$limits$subPixelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$subTexelPrecisionBits(int value) { VH_properties$limits$subTexelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$mipmapPrecisionBits(int value) { VH_properties$limits$mipmapPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDrawIndexedIndexValue(int value) { VH_properties$limits$maxDrawIndexedIndexValue.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxDrawIndirectCount(int value) { VH_properties$limits$maxDrawIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSamplerLodBias(float value) { VH_properties$limits$maxSamplerLodBias.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSamplerAnisotropy(float value) { VH_properties$limits$maxSamplerAnisotropy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxViewports(int value) { VH_properties$limits$maxViewports.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxViewportDimensions(long index0, int value) { VH_properties$limits$maxViewportDimensions.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$viewportBoundsRange(long index0, float value) { VH_properties$limits$viewportBoundsRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$viewportSubPixelBits(int value) { VH_properties$limits$viewportSubPixelBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minMemoryMapAlignment(long value) { VH_properties$limits$minMemoryMapAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minTexelBufferOffsetAlignment(long value) { VH_properties$limits$minTexelBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minUniformBufferOffsetAlignment(long value) { VH_properties$limits$minUniformBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minStorageBufferOffsetAlignment(long value) { VH_properties$limits$minStorageBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minTexelOffset(int value) { VH_properties$limits$minTexelOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTexelOffset(int value) { VH_properties$limits$maxTexelOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minTexelGatherOffset(int value) { VH_properties$limits$minTexelGatherOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxTexelGatherOffset(int value) { VH_properties$limits$maxTexelGatherOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$minInterpolationOffset(float value) { VH_properties$limits$minInterpolationOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxInterpolationOffset(float value) { VH_properties$limits$maxInterpolationOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$subPixelInterpolationOffsetBits(int value) { VH_properties$limits$subPixelInterpolationOffsetBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFramebufferWidth(int value) { VH_properties$limits$maxFramebufferWidth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFramebufferHeight(int value) { VH_properties$limits$maxFramebufferHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxFramebufferLayers(int value) { VH_properties$limits$maxFramebufferLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferColorSampleCounts(int value) { VH_properties$limits$framebufferColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferDepthSampleCounts(int value) { VH_properties$limits$framebufferDepthSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferStencilSampleCounts(int value) { VH_properties$limits$framebufferStencilSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$framebufferNoAttachmentsSampleCounts(int value) { VH_properties$limits$framebufferNoAttachmentsSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxColorAttachments(int value) { VH_properties$limits$maxColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageColorSampleCounts(int value) { VH_properties$limits$sampledImageColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageIntegerSampleCounts(int value) { VH_properties$limits$sampledImageIntegerSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageDepthSampleCounts(int value) { VH_properties$limits$sampledImageDepthSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$sampledImageStencilSampleCounts(int value) { VH_properties$limits$sampledImageStencilSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$storageImageSampleCounts(int value) { VH_properties$limits$storageImageSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxSampleMaskWords(int value) { VH_properties$limits$maxSampleMaskWords.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$timestampComputeAndGraphics(int value) { VH_properties$limits$timestampComputeAndGraphics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$timestampPeriod(float value) { VH_properties$limits$timestampPeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxClipDistances(int value) { VH_properties$limits$maxClipDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxCullDistances(int value) { VH_properties$limits$maxCullDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$maxCombinedClipAndCullDistances(int value) { VH_properties$limits$maxCombinedClipAndCullDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$discreteQueuePriorities(int value) { VH_properties$limits$discreteQueuePriorities.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$pointSizeRange(long index0, float value) { VH_properties$limits$pointSizeRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$lineWidthRange(long index0, float value) { VH_properties$limits$lineWidthRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$pointSizeGranularity(float value) { VH_properties$limits$pointSizeGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$lineWidthGranularity(float value) { VH_properties$limits$lineWidthGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$strictLines(int value) { VH_properties$limits$strictLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$standardSampleLocations(int value) { VH_properties$limits$standardSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$optimalBufferCopyOffsetAlignment(long value) { VH_properties$limits$optimalBufferCopyOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$optimalBufferCopyRowPitchAlignment(long value) { VH_properties$limits$optimalBufferCopyRowPitchAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$limits$nonCoherentAtomSize(long value) { VH_properties$limits$nonCoherentAtomSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyStandard2DBlockShape(int value) { VH_properties$sparseProperties$residencyStandard2DBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyStandard2DMultisampleBlockShape(int value) { VH_properties$sparseProperties$residencyStandard2DMultisampleBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyStandard3DBlockShape(int value) { VH_properties$sparseProperties$residencyStandard3DBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyAlignedMipSize(int value) { VH_properties$sparseProperties$residencyAlignedMipSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties2 properties$sparseProperties$residencyNonResidentStrict(int value) { VH_properties$sparseProperties$residencyNonResidentStrict.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceProperties2 _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties2 _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceProperties2 _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties2 _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _propertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_properties, index), LAYOUT_properties); }
    public MemorySegment _properties() { return _propertiesAt(0L); }
    public VkPhysicalDeviceProperties2 _propertiesAt(long index, MemorySegment src) { _propertiesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties2 _properties(MemorySegment src) { return _propertiesAt(0L, src); }
}
