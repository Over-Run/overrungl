// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceProperties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceProperties {
///     uint32_t apiVersion;
///     uint32_t driverVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     VkPhysicalDeviceType deviceType;
///     char deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
///     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
///     VkPhysicalDeviceLimits limits;
///     VkPhysicalDeviceSparseProperties sparseProperties;
/// }
/// ```
public final class VkPhysicalDeviceProperties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("apiVersion"),
        ValueLayout.JAVA_INT.withName("driverVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_INT.withName("deviceType"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_MAX_PHYSICAL_DEVICE_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("deviceName"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID"),
        overrungl.vulkan.struct.VkPhysicalDeviceLimits.LAYOUT.withName("limits"),
        overrungl.vulkan.struct.VkPhysicalDeviceSparseProperties.LAYOUT.withName("sparseProperties")
    );
    public static final long OFFSET_apiVersion = LAYOUT.byteOffset(PathElement.groupElement("apiVersion"));
    public static final long OFFSET_driverVersion = LAYOUT.byteOffset(PathElement.groupElement("driverVersion"));
    public static final long OFFSET_vendorID = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
    public static final long OFFSET_deviceID = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
    public static final long OFFSET_deviceType = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
    public static final long OFFSET_deviceName = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
    public static final long OFFSET_pipelineCacheUUID = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheUUID"));
    public static final long OFFSET_limits = LAYOUT.byteOffset(PathElement.groupElement("limits"));
    public static final long OFFSET_sparseProperties = LAYOUT.byteOffset(PathElement.groupElement("sparseProperties"));
    public static final MemoryLayout LAYOUT_apiVersion = LAYOUT.select(PathElement.groupElement("apiVersion"));
    public static final MemoryLayout LAYOUT_driverVersion = LAYOUT.select(PathElement.groupElement("driverVersion"));
    public static final MemoryLayout LAYOUT_vendorID = LAYOUT.select(PathElement.groupElement("vendorID"));
    public static final MemoryLayout LAYOUT_deviceID = LAYOUT.select(PathElement.groupElement("deviceID"));
    public static final MemoryLayout LAYOUT_deviceType = LAYOUT.select(PathElement.groupElement("deviceType"));
    public static final MemoryLayout LAYOUT_deviceName = LAYOUT.select(PathElement.groupElement("deviceName"));
    public static final MemoryLayout LAYOUT_pipelineCacheUUID = LAYOUT.select(PathElement.groupElement("pipelineCacheUUID"));
    public static final MemoryLayout LAYOUT_limits = LAYOUT.select(PathElement.groupElement("limits"));
    public static final MemoryLayout LAYOUT_sparseProperties = LAYOUT.select(PathElement.groupElement("sparseProperties"));
    public static final VarHandle VH_apiVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("apiVersion"));
    public static final VarHandle VH_driverVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverVersion"));
    public static final VarHandle VH_vendorID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vendorID"));
    public static final VarHandle VH_deviceID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceID"));
    public static final VarHandle VH_deviceType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceType"));
    public static final VarHandle VH_deviceName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement());
    public static final VarHandle VH_pipelineCacheUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$maxImageDimension1D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimension1D"));
    public static final VarHandle VH_limits$maxImageDimension2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimension2D"));
    public static final VarHandle VH_limits$maxImageDimension3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimension3D"));
    public static final VarHandle VH_limits$maxImageDimensionCube = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxImageDimensionCube"));
    public static final VarHandle VH_limits$maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxImageArrayLayers"));
    public static final VarHandle VH_limits$maxTexelBufferElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTexelBufferElements"));
    public static final VarHandle VH_limits$maxUniformBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxUniformBufferRange"));
    public static final VarHandle VH_limits$maxStorageBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxStorageBufferRange"));
    public static final VarHandle VH_limits$maxPushConstantsSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPushConstantsSize"));
    public static final VarHandle VH_limits$maxMemoryAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxMemoryAllocationCount"));
    public static final VarHandle VH_limits$maxSamplerAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxSamplerAllocationCount"));
    public static final VarHandle VH_limits$bufferImageGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("bufferImageGranularity"));
    public static final VarHandle VH_limits$sparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("sparseAddressSpaceSize"));
    public static final VarHandle VH_limits$maxBoundDescriptorSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxBoundDescriptorSets"));
    public static final VarHandle VH_limits$maxPerStageDescriptorSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorSamplers"));
    public static final VarHandle VH_limits$maxPerStageDescriptorUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    public static final VarHandle VH_limits$maxPerStageDescriptorStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    public static final VarHandle VH_limits$maxPerStageDescriptorSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    public static final VarHandle VH_limits$maxPerStageDescriptorStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    public static final VarHandle VH_limits$maxPerStageDescriptorInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    public static final VarHandle VH_limits$maxPerStageResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxPerStageResources"));
    public static final VarHandle VH_limits$maxDescriptorSetSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetSamplers"));
    public static final VarHandle VH_limits$maxDescriptorSetUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    public static final VarHandle VH_limits$maxDescriptorSetUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    public static final VarHandle VH_limits$maxDescriptorSetStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    public static final VarHandle VH_limits$maxDescriptorSetStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    public static final VarHandle VH_limits$maxDescriptorSetSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetSampledImages"));
    public static final VarHandle VH_limits$maxDescriptorSetStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetStorageImages"));
    public static final VarHandle VH_limits$maxDescriptorSetInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDescriptorSetInputAttachments"));
    public static final VarHandle VH_limits$maxVertexInputAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputAttributes"));
    public static final VarHandle VH_limits$maxVertexInputBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputBindings"));
    public static final VarHandle VH_limits$maxVertexInputAttributeOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputAttributeOffset"));
    public static final VarHandle VH_limits$maxVertexInputBindingStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxVertexInputBindingStride"));
    public static final VarHandle VH_limits$maxVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxVertexOutputComponents"));
    public static final VarHandle VH_limits$maxTessellationGenerationLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationGenerationLevel"));
    public static final VarHandle VH_limits$maxTessellationPatchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationPatchSize"));
    public static final VarHandle VH_limits$maxTessellationControlPerVertexInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    public static final VarHandle VH_limits$maxTessellationControlPerVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    public static final VarHandle VH_limits$maxTessellationControlPerPatchOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    public static final VarHandle VH_limits$maxTessellationControlTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    public static final VarHandle VH_limits$maxTessellationEvaluationInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    public static final VarHandle VH_limits$maxTessellationEvaluationOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    public static final VarHandle VH_limits$maxGeometryShaderInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryShaderInvocations"));
    public static final VarHandle VH_limits$maxGeometryInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryInputComponents"));
    public static final VarHandle VH_limits$maxGeometryOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryOutputComponents"));
    public static final VarHandle VH_limits$maxGeometryOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryOutputVertices"));
    public static final VarHandle VH_limits$maxGeometryTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxGeometryTotalOutputComponents"));
    public static final VarHandle VH_limits$maxFragmentInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentInputComponents"));
    public static final VarHandle VH_limits$maxFragmentOutputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentOutputAttachments"));
    public static final VarHandle VH_limits$maxFragmentDualSrcAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentDualSrcAttachments"));
    public static final VarHandle VH_limits$maxFragmentCombinedOutputResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFragmentCombinedOutputResources"));
    public static final VarHandle VH_limits$maxComputeSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxComputeSharedMemorySize"));
    public static final VarHandle VH_limits$maxComputeWorkGroupCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxComputeWorkGroupCount"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$maxComputeWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxComputeWorkGroupInvocations"));
    public static final VarHandle VH_limits$maxComputeWorkGroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxComputeWorkGroupSize"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$subPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("subPixelPrecisionBits"));
    public static final VarHandle VH_limits$subTexelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("subTexelPrecisionBits"));
    public static final VarHandle VH_limits$mipmapPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("mipmapPrecisionBits"));
    public static final VarHandle VH_limits$maxDrawIndexedIndexValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDrawIndexedIndexValue"));
    public static final VarHandle VH_limits$maxDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxDrawIndirectCount"));
    public static final VarHandle VH_limits$maxSamplerLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxSamplerLodBias"));
    public static final VarHandle VH_limits$maxSamplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxSamplerAnisotropy"));
    public static final VarHandle VH_limits$maxViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxViewports"));
    public static final VarHandle VH_limits$maxViewportDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxViewportDimensions"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$viewportBoundsRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("viewportBoundsRange"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$viewportSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("viewportSubPixelBits"));
    public static final VarHandle VH_limits$minMemoryMapAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minMemoryMapAlignment"));
    public static final VarHandle VH_limits$minTexelBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minTexelBufferOffsetAlignment"));
    public static final VarHandle VH_limits$minUniformBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minUniformBufferOffsetAlignment"));
    public static final VarHandle VH_limits$minStorageBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minStorageBufferOffsetAlignment"));
    public static final VarHandle VH_limits$minTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minTexelOffset"));
    public static final VarHandle VH_limits$maxTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTexelOffset"));
    public static final VarHandle VH_limits$minTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minTexelGatherOffset"));
    public static final VarHandle VH_limits$maxTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxTexelGatherOffset"));
    public static final VarHandle VH_limits$minInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("minInterpolationOffset"));
    public static final VarHandle VH_limits$maxInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxInterpolationOffset"));
    public static final VarHandle VH_limits$subPixelInterpolationOffsetBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("subPixelInterpolationOffsetBits"));
    public static final VarHandle VH_limits$maxFramebufferWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFramebufferWidth"));
    public static final VarHandle VH_limits$maxFramebufferHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFramebufferHeight"));
    public static final VarHandle VH_limits$maxFramebufferLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxFramebufferLayers"));
    public static final VarHandle VH_limits$framebufferColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("framebufferColorSampleCounts"));
    public static final VarHandle VH_limits$framebufferDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("framebufferDepthSampleCounts"));
    public static final VarHandle VH_limits$framebufferStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("framebufferStencilSampleCounts"));
    public static final VarHandle VH_limits$framebufferNoAttachmentsSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    public static final VarHandle VH_limits$maxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxColorAttachments"));
    public static final VarHandle VH_limits$sampledImageColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("sampledImageColorSampleCounts"));
    public static final VarHandle VH_limits$sampledImageIntegerSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("sampledImageIntegerSampleCounts"));
    public static final VarHandle VH_limits$sampledImageDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("sampledImageDepthSampleCounts"));
    public static final VarHandle VH_limits$sampledImageStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("sampledImageStencilSampleCounts"));
    public static final VarHandle VH_limits$storageImageSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("storageImageSampleCounts"));
    public static final VarHandle VH_limits$maxSampleMaskWords = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxSampleMaskWords"));
    public static final VarHandle VH_limits$timestampComputeAndGraphics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("timestampComputeAndGraphics"));
    public static final VarHandle VH_limits$timestampPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("timestampPeriod"));
    public static final VarHandle VH_limits$maxClipDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxClipDistances"));
    public static final VarHandle VH_limits$maxCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxCullDistances"));
    public static final VarHandle VH_limits$maxCombinedClipAndCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("maxCombinedClipAndCullDistances"));
    public static final VarHandle VH_limits$discreteQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("discreteQueuePriorities"));
    public static final VarHandle VH_limits$pointSizeRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("pointSizeRange"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$lineWidthRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("lineWidthRange"), PathElement.sequenceElement());
    public static final VarHandle VH_limits$pointSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("pointSizeGranularity"));
    public static final VarHandle VH_limits$lineWidthGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("lineWidthGranularity"));
    public static final VarHandle VH_limits$strictLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("strictLines"));
    public static final VarHandle VH_limits$standardSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("standardSampleLocations"));
    public static final VarHandle VH_limits$optimalBufferCopyOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    public static final VarHandle VH_limits$optimalBufferCopyRowPitchAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    public static final VarHandle VH_limits$nonCoherentAtomSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("limits"), PathElement.groupElement("nonCoherentAtomSize"));
    public static final VarHandle VH_sparseProperties$residencyStandard2DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyStandard2DBlockShape"));
    public static final VarHandle VH_sparseProperties$residencyStandard2DMultisampleBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyStandard2DMultisampleBlockShape"));
    public static final VarHandle VH_sparseProperties$residencyStandard3DBlockShape = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyStandard3DBlockShape"));
    public static final VarHandle VH_sparseProperties$residencyAlignedMipSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyAlignedMipSize"));
    public static final VarHandle VH_sparseProperties$residencyNonResidentStrict = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseProperties"), PathElement.groupElement("residencyNonResidentStrict"));

    public VkPhysicalDeviceProperties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceProperties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceProperties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceProperties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceProperties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceProperties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceProperties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceProperties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceProperties(allocator.allocate(LAYOUT, count), count); }
    public VkPhysicalDeviceProperties copyFrom(VkPhysicalDeviceProperties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceProperties reinterpret(long count) { return new VkPhysicalDeviceProperties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceProperties asSlice(long index) { return new VkPhysicalDeviceProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceProperties asSlice(long index, long count) { return new VkPhysicalDeviceProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceProperties at(long index, Consumer<VkPhysicalDeviceProperties> func) { func.accept(asSlice(index)); return this; }
    public int apiVersionAt(long index) { return (int) VH_apiVersion.get(this.segment(), 0L, index); }
    public int driverVersionAt(long index) { return (int) VH_driverVersion.get(this.segment(), 0L, index); }
    public int vendorIDAt(long index) { return (int) VH_vendorID.get(this.segment(), 0L, index); }
    public int deviceIDAt(long index) { return (int) VH_deviceID.get(this.segment(), 0L, index); }
    public int deviceTypeAt(long index) { return (int) VH_deviceType.get(this.segment(), 0L, index); }
    public byte deviceNameAt(long index, long index0) { return (byte) VH_deviceName.get(this.segment(), 0L, index, index0); }
    public byte pipelineCacheUUIDAt(long index, long index0) { return (byte) VH_pipelineCacheUUID.get(this.segment(), 0L, index, index0); }
    public int limits$maxImageDimension1DAt(long index) { return (int) VH_limits$maxImageDimension1D.get(this.segment(), 0L, index); }
    public int limits$maxImageDimension2DAt(long index) { return (int) VH_limits$maxImageDimension2D.get(this.segment(), 0L, index); }
    public int limits$maxImageDimension3DAt(long index) { return (int) VH_limits$maxImageDimension3D.get(this.segment(), 0L, index); }
    public int limits$maxImageDimensionCubeAt(long index) { return (int) VH_limits$maxImageDimensionCube.get(this.segment(), 0L, index); }
    public int limits$maxImageArrayLayersAt(long index) { return (int) VH_limits$maxImageArrayLayers.get(this.segment(), 0L, index); }
    public int limits$maxTexelBufferElementsAt(long index) { return (int) VH_limits$maxTexelBufferElements.get(this.segment(), 0L, index); }
    public int limits$maxUniformBufferRangeAt(long index) { return (int) VH_limits$maxUniformBufferRange.get(this.segment(), 0L, index); }
    public int limits$maxStorageBufferRangeAt(long index) { return (int) VH_limits$maxStorageBufferRange.get(this.segment(), 0L, index); }
    public int limits$maxPushConstantsSizeAt(long index) { return (int) VH_limits$maxPushConstantsSize.get(this.segment(), 0L, index); }
    public int limits$maxMemoryAllocationCountAt(long index) { return (int) VH_limits$maxMemoryAllocationCount.get(this.segment(), 0L, index); }
    public int limits$maxSamplerAllocationCountAt(long index) { return (int) VH_limits$maxSamplerAllocationCount.get(this.segment(), 0L, index); }
    public long limits$bufferImageGranularityAt(long index) { return (long) VH_limits$bufferImageGranularity.get(this.segment(), 0L, index); }
    public long limits$sparseAddressSpaceSizeAt(long index) { return (long) VH_limits$sparseAddressSpaceSize.get(this.segment(), 0L, index); }
    public int limits$maxBoundDescriptorSetsAt(long index) { return (int) VH_limits$maxBoundDescriptorSets.get(this.segment(), 0L, index); }
    public int limits$maxPerStageDescriptorSamplersAt(long index) { return (int) VH_limits$maxPerStageDescriptorSamplers.get(this.segment(), 0L, index); }
    public int limits$maxPerStageDescriptorUniformBuffersAt(long index) { return (int) VH_limits$maxPerStageDescriptorUniformBuffers.get(this.segment(), 0L, index); }
    public int limits$maxPerStageDescriptorStorageBuffersAt(long index) { return (int) VH_limits$maxPerStageDescriptorStorageBuffers.get(this.segment(), 0L, index); }
    public int limits$maxPerStageDescriptorSampledImagesAt(long index) { return (int) VH_limits$maxPerStageDescriptorSampledImages.get(this.segment(), 0L, index); }
    public int limits$maxPerStageDescriptorStorageImagesAt(long index) { return (int) VH_limits$maxPerStageDescriptorStorageImages.get(this.segment(), 0L, index); }
    public int limits$maxPerStageDescriptorInputAttachmentsAt(long index) { return (int) VH_limits$maxPerStageDescriptorInputAttachments.get(this.segment(), 0L, index); }
    public int limits$maxPerStageResourcesAt(long index) { return (int) VH_limits$maxPerStageResources.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetSamplersAt(long index) { return (int) VH_limits$maxDescriptorSetSamplers.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetUniformBuffersAt(long index) { return (int) VH_limits$maxDescriptorSetUniformBuffers.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetUniformBuffersDynamicAt(long index) { return (int) VH_limits$maxDescriptorSetUniformBuffersDynamic.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetStorageBuffersAt(long index) { return (int) VH_limits$maxDescriptorSetStorageBuffers.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetStorageBuffersDynamicAt(long index) { return (int) VH_limits$maxDescriptorSetStorageBuffersDynamic.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetSampledImagesAt(long index) { return (int) VH_limits$maxDescriptorSetSampledImages.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetStorageImagesAt(long index) { return (int) VH_limits$maxDescriptorSetStorageImages.get(this.segment(), 0L, index); }
    public int limits$maxDescriptorSetInputAttachmentsAt(long index) { return (int) VH_limits$maxDescriptorSetInputAttachments.get(this.segment(), 0L, index); }
    public int limits$maxVertexInputAttributesAt(long index) { return (int) VH_limits$maxVertexInputAttributes.get(this.segment(), 0L, index); }
    public int limits$maxVertexInputBindingsAt(long index) { return (int) VH_limits$maxVertexInputBindings.get(this.segment(), 0L, index); }
    public int limits$maxVertexInputAttributeOffsetAt(long index) { return (int) VH_limits$maxVertexInputAttributeOffset.get(this.segment(), 0L, index); }
    public int limits$maxVertexInputBindingStrideAt(long index) { return (int) VH_limits$maxVertexInputBindingStride.get(this.segment(), 0L, index); }
    public int limits$maxVertexOutputComponentsAt(long index) { return (int) VH_limits$maxVertexOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxTessellationGenerationLevelAt(long index) { return (int) VH_limits$maxTessellationGenerationLevel.get(this.segment(), 0L, index); }
    public int limits$maxTessellationPatchSizeAt(long index) { return (int) VH_limits$maxTessellationPatchSize.get(this.segment(), 0L, index); }
    public int limits$maxTessellationControlPerVertexInputComponentsAt(long index) { return (int) VH_limits$maxTessellationControlPerVertexInputComponents.get(this.segment(), 0L, index); }
    public int limits$maxTessellationControlPerVertexOutputComponentsAt(long index) { return (int) VH_limits$maxTessellationControlPerVertexOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxTessellationControlPerPatchOutputComponentsAt(long index) { return (int) VH_limits$maxTessellationControlPerPatchOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxTessellationControlTotalOutputComponentsAt(long index) { return (int) VH_limits$maxTessellationControlTotalOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxTessellationEvaluationInputComponentsAt(long index) { return (int) VH_limits$maxTessellationEvaluationInputComponents.get(this.segment(), 0L, index); }
    public int limits$maxTessellationEvaluationOutputComponentsAt(long index) { return (int) VH_limits$maxTessellationEvaluationOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxGeometryShaderInvocationsAt(long index) { return (int) VH_limits$maxGeometryShaderInvocations.get(this.segment(), 0L, index); }
    public int limits$maxGeometryInputComponentsAt(long index) { return (int) VH_limits$maxGeometryInputComponents.get(this.segment(), 0L, index); }
    public int limits$maxGeometryOutputComponentsAt(long index) { return (int) VH_limits$maxGeometryOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxGeometryOutputVerticesAt(long index) { return (int) VH_limits$maxGeometryOutputVertices.get(this.segment(), 0L, index); }
    public int limits$maxGeometryTotalOutputComponentsAt(long index) { return (int) VH_limits$maxGeometryTotalOutputComponents.get(this.segment(), 0L, index); }
    public int limits$maxFragmentInputComponentsAt(long index) { return (int) VH_limits$maxFragmentInputComponents.get(this.segment(), 0L, index); }
    public int limits$maxFragmentOutputAttachmentsAt(long index) { return (int) VH_limits$maxFragmentOutputAttachments.get(this.segment(), 0L, index); }
    public int limits$maxFragmentDualSrcAttachmentsAt(long index) { return (int) VH_limits$maxFragmentDualSrcAttachments.get(this.segment(), 0L, index); }
    public int limits$maxFragmentCombinedOutputResourcesAt(long index) { return (int) VH_limits$maxFragmentCombinedOutputResources.get(this.segment(), 0L, index); }
    public int limits$maxComputeSharedMemorySizeAt(long index) { return (int) VH_limits$maxComputeSharedMemorySize.get(this.segment(), 0L, index); }
    public int limits$maxComputeWorkGroupCountAt(long index, long index0) { return (int) VH_limits$maxComputeWorkGroupCount.get(this.segment(), 0L, index, index0); }
    public int limits$maxComputeWorkGroupInvocationsAt(long index) { return (int) VH_limits$maxComputeWorkGroupInvocations.get(this.segment(), 0L, index); }
    public int limits$maxComputeWorkGroupSizeAt(long index, long index0) { return (int) VH_limits$maxComputeWorkGroupSize.get(this.segment(), 0L, index, index0); }
    public int limits$subPixelPrecisionBitsAt(long index) { return (int) VH_limits$subPixelPrecisionBits.get(this.segment(), 0L, index); }
    public int limits$subTexelPrecisionBitsAt(long index) { return (int) VH_limits$subTexelPrecisionBits.get(this.segment(), 0L, index); }
    public int limits$mipmapPrecisionBitsAt(long index) { return (int) VH_limits$mipmapPrecisionBits.get(this.segment(), 0L, index); }
    public int limits$maxDrawIndexedIndexValueAt(long index) { return (int) VH_limits$maxDrawIndexedIndexValue.get(this.segment(), 0L, index); }
    public int limits$maxDrawIndirectCountAt(long index) { return (int) VH_limits$maxDrawIndirectCount.get(this.segment(), 0L, index); }
    public float limits$maxSamplerLodBiasAt(long index) { return (float) VH_limits$maxSamplerLodBias.get(this.segment(), 0L, index); }
    public float limits$maxSamplerAnisotropyAt(long index) { return (float) VH_limits$maxSamplerAnisotropy.get(this.segment(), 0L, index); }
    public int limits$maxViewportsAt(long index) { return (int) VH_limits$maxViewports.get(this.segment(), 0L, index); }
    public int limits$maxViewportDimensionsAt(long index, long index0) { return (int) VH_limits$maxViewportDimensions.get(this.segment(), 0L, index, index0); }
    public float limits$viewportBoundsRangeAt(long index, long index0) { return (float) VH_limits$viewportBoundsRange.get(this.segment(), 0L, index, index0); }
    public int limits$viewportSubPixelBitsAt(long index) { return (int) VH_limits$viewportSubPixelBits.get(this.segment(), 0L, index); }
    public long limits$minMemoryMapAlignmentAt(long index) { return (long) VH_limits$minMemoryMapAlignment.get(this.segment(), 0L, index); }
    public long limits$minTexelBufferOffsetAlignmentAt(long index) { return (long) VH_limits$minTexelBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long limits$minUniformBufferOffsetAlignmentAt(long index) { return (long) VH_limits$minUniformBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public long limits$minStorageBufferOffsetAlignmentAt(long index) { return (long) VH_limits$minStorageBufferOffsetAlignment.get(this.segment(), 0L, index); }
    public int limits$minTexelOffsetAt(long index) { return (int) VH_limits$minTexelOffset.get(this.segment(), 0L, index); }
    public int limits$maxTexelOffsetAt(long index) { return (int) VH_limits$maxTexelOffset.get(this.segment(), 0L, index); }
    public int limits$minTexelGatherOffsetAt(long index) { return (int) VH_limits$minTexelGatherOffset.get(this.segment(), 0L, index); }
    public int limits$maxTexelGatherOffsetAt(long index) { return (int) VH_limits$maxTexelGatherOffset.get(this.segment(), 0L, index); }
    public float limits$minInterpolationOffsetAt(long index) { return (float) VH_limits$minInterpolationOffset.get(this.segment(), 0L, index); }
    public float limits$maxInterpolationOffsetAt(long index) { return (float) VH_limits$maxInterpolationOffset.get(this.segment(), 0L, index); }
    public int limits$subPixelInterpolationOffsetBitsAt(long index) { return (int) VH_limits$subPixelInterpolationOffsetBits.get(this.segment(), 0L, index); }
    public int limits$maxFramebufferWidthAt(long index) { return (int) VH_limits$maxFramebufferWidth.get(this.segment(), 0L, index); }
    public int limits$maxFramebufferHeightAt(long index) { return (int) VH_limits$maxFramebufferHeight.get(this.segment(), 0L, index); }
    public int limits$maxFramebufferLayersAt(long index) { return (int) VH_limits$maxFramebufferLayers.get(this.segment(), 0L, index); }
    public int limits$framebufferColorSampleCountsAt(long index) { return (int) VH_limits$framebufferColorSampleCounts.get(this.segment(), 0L, index); }
    public int limits$framebufferDepthSampleCountsAt(long index) { return (int) VH_limits$framebufferDepthSampleCounts.get(this.segment(), 0L, index); }
    public int limits$framebufferStencilSampleCountsAt(long index) { return (int) VH_limits$framebufferStencilSampleCounts.get(this.segment(), 0L, index); }
    public int limits$framebufferNoAttachmentsSampleCountsAt(long index) { return (int) VH_limits$framebufferNoAttachmentsSampleCounts.get(this.segment(), 0L, index); }
    public int limits$maxColorAttachmentsAt(long index) { return (int) VH_limits$maxColorAttachments.get(this.segment(), 0L, index); }
    public int limits$sampledImageColorSampleCountsAt(long index) { return (int) VH_limits$sampledImageColorSampleCounts.get(this.segment(), 0L, index); }
    public int limits$sampledImageIntegerSampleCountsAt(long index) { return (int) VH_limits$sampledImageIntegerSampleCounts.get(this.segment(), 0L, index); }
    public int limits$sampledImageDepthSampleCountsAt(long index) { return (int) VH_limits$sampledImageDepthSampleCounts.get(this.segment(), 0L, index); }
    public int limits$sampledImageStencilSampleCountsAt(long index) { return (int) VH_limits$sampledImageStencilSampleCounts.get(this.segment(), 0L, index); }
    public int limits$storageImageSampleCountsAt(long index) { return (int) VH_limits$storageImageSampleCounts.get(this.segment(), 0L, index); }
    public int limits$maxSampleMaskWordsAt(long index) { return (int) VH_limits$maxSampleMaskWords.get(this.segment(), 0L, index); }
    public int limits$timestampComputeAndGraphicsAt(long index) { return (int) VH_limits$timestampComputeAndGraphics.get(this.segment(), 0L, index); }
    public float limits$timestampPeriodAt(long index) { return (float) VH_limits$timestampPeriod.get(this.segment(), 0L, index); }
    public int limits$maxClipDistancesAt(long index) { return (int) VH_limits$maxClipDistances.get(this.segment(), 0L, index); }
    public int limits$maxCullDistancesAt(long index) { return (int) VH_limits$maxCullDistances.get(this.segment(), 0L, index); }
    public int limits$maxCombinedClipAndCullDistancesAt(long index) { return (int) VH_limits$maxCombinedClipAndCullDistances.get(this.segment(), 0L, index); }
    public int limits$discreteQueuePrioritiesAt(long index) { return (int) VH_limits$discreteQueuePriorities.get(this.segment(), 0L, index); }
    public float limits$pointSizeRangeAt(long index, long index0) { return (float) VH_limits$pointSizeRange.get(this.segment(), 0L, index, index0); }
    public float limits$lineWidthRangeAt(long index, long index0) { return (float) VH_limits$lineWidthRange.get(this.segment(), 0L, index, index0); }
    public float limits$pointSizeGranularityAt(long index) { return (float) VH_limits$pointSizeGranularity.get(this.segment(), 0L, index); }
    public float limits$lineWidthGranularityAt(long index) { return (float) VH_limits$lineWidthGranularity.get(this.segment(), 0L, index); }
    public int limits$strictLinesAt(long index) { return (int) VH_limits$strictLines.get(this.segment(), 0L, index); }
    public int limits$standardSampleLocationsAt(long index) { return (int) VH_limits$standardSampleLocations.get(this.segment(), 0L, index); }
    public long limits$optimalBufferCopyOffsetAlignmentAt(long index) { return (long) VH_limits$optimalBufferCopyOffsetAlignment.get(this.segment(), 0L, index); }
    public long limits$optimalBufferCopyRowPitchAlignmentAt(long index) { return (long) VH_limits$optimalBufferCopyRowPitchAlignment.get(this.segment(), 0L, index); }
    public long limits$nonCoherentAtomSizeAt(long index) { return (long) VH_limits$nonCoherentAtomSize.get(this.segment(), 0L, index); }
    public int sparseProperties$residencyStandard2DBlockShapeAt(long index) { return (int) VH_sparseProperties$residencyStandard2DBlockShape.get(this.segment(), 0L, index); }
    public int sparseProperties$residencyStandard2DMultisampleBlockShapeAt(long index) { return (int) VH_sparseProperties$residencyStandard2DMultisampleBlockShape.get(this.segment(), 0L, index); }
    public int sparseProperties$residencyStandard3DBlockShapeAt(long index) { return (int) VH_sparseProperties$residencyStandard3DBlockShape.get(this.segment(), 0L, index); }
    public int sparseProperties$residencyAlignedMipSizeAt(long index) { return (int) VH_sparseProperties$residencyAlignedMipSize.get(this.segment(), 0L, index); }
    public int sparseProperties$residencyNonResidentStrictAt(long index) { return (int) VH_sparseProperties$residencyNonResidentStrict.get(this.segment(), 0L, index); }
    public int apiVersion() { return (int) VH_apiVersion.get(this.segment(), 0L, 0L); }
    public int driverVersion() { return (int) VH_driverVersion.get(this.segment(), 0L, 0L); }
    public int vendorID() { return (int) VH_vendorID.get(this.segment(), 0L, 0L); }
    public int deviceID() { return (int) VH_deviceID.get(this.segment(), 0L, 0L); }
    public int deviceType() { return (int) VH_deviceType.get(this.segment(), 0L, 0L); }
    public byte deviceName(long index0) { return (byte) VH_deviceName.get(this.segment(), 0L, 0L, index0); }
    public byte pipelineCacheUUID(long index0) { return (byte) VH_pipelineCacheUUID.get(this.segment(), 0L, 0L, index0); }
    public int limits$maxImageDimension1D() { return (int) VH_limits$maxImageDimension1D.get(this.segment(), 0L, 0L); }
    public int limits$maxImageDimension2D() { return (int) VH_limits$maxImageDimension2D.get(this.segment(), 0L, 0L); }
    public int limits$maxImageDimension3D() { return (int) VH_limits$maxImageDimension3D.get(this.segment(), 0L, 0L); }
    public int limits$maxImageDimensionCube() { return (int) VH_limits$maxImageDimensionCube.get(this.segment(), 0L, 0L); }
    public int limits$maxImageArrayLayers() { return (int) VH_limits$maxImageArrayLayers.get(this.segment(), 0L, 0L); }
    public int limits$maxTexelBufferElements() { return (int) VH_limits$maxTexelBufferElements.get(this.segment(), 0L, 0L); }
    public int limits$maxUniformBufferRange() { return (int) VH_limits$maxUniformBufferRange.get(this.segment(), 0L, 0L); }
    public int limits$maxStorageBufferRange() { return (int) VH_limits$maxStorageBufferRange.get(this.segment(), 0L, 0L); }
    public int limits$maxPushConstantsSize() { return (int) VH_limits$maxPushConstantsSize.get(this.segment(), 0L, 0L); }
    public int limits$maxMemoryAllocationCount() { return (int) VH_limits$maxMemoryAllocationCount.get(this.segment(), 0L, 0L); }
    public int limits$maxSamplerAllocationCount() { return (int) VH_limits$maxSamplerAllocationCount.get(this.segment(), 0L, 0L); }
    public long limits$bufferImageGranularity() { return (long) VH_limits$bufferImageGranularity.get(this.segment(), 0L, 0L); }
    public long limits$sparseAddressSpaceSize() { return (long) VH_limits$sparseAddressSpaceSize.get(this.segment(), 0L, 0L); }
    public int limits$maxBoundDescriptorSets() { return (int) VH_limits$maxBoundDescriptorSets.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageDescriptorSamplers() { return (int) VH_limits$maxPerStageDescriptorSamplers.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageDescriptorUniformBuffers() { return (int) VH_limits$maxPerStageDescriptorUniformBuffers.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageDescriptorStorageBuffers() { return (int) VH_limits$maxPerStageDescriptorStorageBuffers.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageDescriptorSampledImages() { return (int) VH_limits$maxPerStageDescriptorSampledImages.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageDescriptorStorageImages() { return (int) VH_limits$maxPerStageDescriptorStorageImages.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageDescriptorInputAttachments() { return (int) VH_limits$maxPerStageDescriptorInputAttachments.get(this.segment(), 0L, 0L); }
    public int limits$maxPerStageResources() { return (int) VH_limits$maxPerStageResources.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetSamplers() { return (int) VH_limits$maxDescriptorSetSamplers.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetUniformBuffers() { return (int) VH_limits$maxDescriptorSetUniformBuffers.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetUniformBuffersDynamic() { return (int) VH_limits$maxDescriptorSetUniformBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetStorageBuffers() { return (int) VH_limits$maxDescriptorSetStorageBuffers.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetStorageBuffersDynamic() { return (int) VH_limits$maxDescriptorSetStorageBuffersDynamic.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetSampledImages() { return (int) VH_limits$maxDescriptorSetSampledImages.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetStorageImages() { return (int) VH_limits$maxDescriptorSetStorageImages.get(this.segment(), 0L, 0L); }
    public int limits$maxDescriptorSetInputAttachments() { return (int) VH_limits$maxDescriptorSetInputAttachments.get(this.segment(), 0L, 0L); }
    public int limits$maxVertexInputAttributes() { return (int) VH_limits$maxVertexInputAttributes.get(this.segment(), 0L, 0L); }
    public int limits$maxVertexInputBindings() { return (int) VH_limits$maxVertexInputBindings.get(this.segment(), 0L, 0L); }
    public int limits$maxVertexInputAttributeOffset() { return (int) VH_limits$maxVertexInputAttributeOffset.get(this.segment(), 0L, 0L); }
    public int limits$maxVertexInputBindingStride() { return (int) VH_limits$maxVertexInputBindingStride.get(this.segment(), 0L, 0L); }
    public int limits$maxVertexOutputComponents() { return (int) VH_limits$maxVertexOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationGenerationLevel() { return (int) VH_limits$maxTessellationGenerationLevel.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationPatchSize() { return (int) VH_limits$maxTessellationPatchSize.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationControlPerVertexInputComponents() { return (int) VH_limits$maxTessellationControlPerVertexInputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationControlPerVertexOutputComponents() { return (int) VH_limits$maxTessellationControlPerVertexOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationControlPerPatchOutputComponents() { return (int) VH_limits$maxTessellationControlPerPatchOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationControlTotalOutputComponents() { return (int) VH_limits$maxTessellationControlTotalOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationEvaluationInputComponents() { return (int) VH_limits$maxTessellationEvaluationInputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxTessellationEvaluationOutputComponents() { return (int) VH_limits$maxTessellationEvaluationOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxGeometryShaderInvocations() { return (int) VH_limits$maxGeometryShaderInvocations.get(this.segment(), 0L, 0L); }
    public int limits$maxGeometryInputComponents() { return (int) VH_limits$maxGeometryInputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxGeometryOutputComponents() { return (int) VH_limits$maxGeometryOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxGeometryOutputVertices() { return (int) VH_limits$maxGeometryOutputVertices.get(this.segment(), 0L, 0L); }
    public int limits$maxGeometryTotalOutputComponents() { return (int) VH_limits$maxGeometryTotalOutputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxFragmentInputComponents() { return (int) VH_limits$maxFragmentInputComponents.get(this.segment(), 0L, 0L); }
    public int limits$maxFragmentOutputAttachments() { return (int) VH_limits$maxFragmentOutputAttachments.get(this.segment(), 0L, 0L); }
    public int limits$maxFragmentDualSrcAttachments() { return (int) VH_limits$maxFragmentDualSrcAttachments.get(this.segment(), 0L, 0L); }
    public int limits$maxFragmentCombinedOutputResources() { return (int) VH_limits$maxFragmentCombinedOutputResources.get(this.segment(), 0L, 0L); }
    public int limits$maxComputeSharedMemorySize() { return (int) VH_limits$maxComputeSharedMemorySize.get(this.segment(), 0L, 0L); }
    public int limits$maxComputeWorkGroupCount(long index0) { return (int) VH_limits$maxComputeWorkGroupCount.get(this.segment(), 0L, 0L, index0); }
    public int limits$maxComputeWorkGroupInvocations() { return (int) VH_limits$maxComputeWorkGroupInvocations.get(this.segment(), 0L, 0L); }
    public int limits$maxComputeWorkGroupSize(long index0) { return (int) VH_limits$maxComputeWorkGroupSize.get(this.segment(), 0L, 0L, index0); }
    public int limits$subPixelPrecisionBits() { return (int) VH_limits$subPixelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int limits$subTexelPrecisionBits() { return (int) VH_limits$subTexelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int limits$mipmapPrecisionBits() { return (int) VH_limits$mipmapPrecisionBits.get(this.segment(), 0L, 0L); }
    public int limits$maxDrawIndexedIndexValue() { return (int) VH_limits$maxDrawIndexedIndexValue.get(this.segment(), 0L, 0L); }
    public int limits$maxDrawIndirectCount() { return (int) VH_limits$maxDrawIndirectCount.get(this.segment(), 0L, 0L); }
    public float limits$maxSamplerLodBias() { return (float) VH_limits$maxSamplerLodBias.get(this.segment(), 0L, 0L); }
    public float limits$maxSamplerAnisotropy() { return (float) VH_limits$maxSamplerAnisotropy.get(this.segment(), 0L, 0L); }
    public int limits$maxViewports() { return (int) VH_limits$maxViewports.get(this.segment(), 0L, 0L); }
    public int limits$maxViewportDimensions(long index0) { return (int) VH_limits$maxViewportDimensions.get(this.segment(), 0L, 0L, index0); }
    public float limits$viewportBoundsRange(long index0) { return (float) VH_limits$viewportBoundsRange.get(this.segment(), 0L, 0L, index0); }
    public int limits$viewportSubPixelBits() { return (int) VH_limits$viewportSubPixelBits.get(this.segment(), 0L, 0L); }
    public long limits$minMemoryMapAlignment() { return (long) VH_limits$minMemoryMapAlignment.get(this.segment(), 0L, 0L); }
    public long limits$minTexelBufferOffsetAlignment() { return (long) VH_limits$minTexelBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long limits$minUniformBufferOffsetAlignment() { return (long) VH_limits$minUniformBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long limits$minStorageBufferOffsetAlignment() { return (long) VH_limits$minStorageBufferOffsetAlignment.get(this.segment(), 0L, 0L); }
    public int limits$minTexelOffset() { return (int) VH_limits$minTexelOffset.get(this.segment(), 0L, 0L); }
    public int limits$maxTexelOffset() { return (int) VH_limits$maxTexelOffset.get(this.segment(), 0L, 0L); }
    public int limits$minTexelGatherOffset() { return (int) VH_limits$minTexelGatherOffset.get(this.segment(), 0L, 0L); }
    public int limits$maxTexelGatherOffset() { return (int) VH_limits$maxTexelGatherOffset.get(this.segment(), 0L, 0L); }
    public float limits$minInterpolationOffset() { return (float) VH_limits$minInterpolationOffset.get(this.segment(), 0L, 0L); }
    public float limits$maxInterpolationOffset() { return (float) VH_limits$maxInterpolationOffset.get(this.segment(), 0L, 0L); }
    public int limits$subPixelInterpolationOffsetBits() { return (int) VH_limits$subPixelInterpolationOffsetBits.get(this.segment(), 0L, 0L); }
    public int limits$maxFramebufferWidth() { return (int) VH_limits$maxFramebufferWidth.get(this.segment(), 0L, 0L); }
    public int limits$maxFramebufferHeight() { return (int) VH_limits$maxFramebufferHeight.get(this.segment(), 0L, 0L); }
    public int limits$maxFramebufferLayers() { return (int) VH_limits$maxFramebufferLayers.get(this.segment(), 0L, 0L); }
    public int limits$framebufferColorSampleCounts() { return (int) VH_limits$framebufferColorSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$framebufferDepthSampleCounts() { return (int) VH_limits$framebufferDepthSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$framebufferStencilSampleCounts() { return (int) VH_limits$framebufferStencilSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$framebufferNoAttachmentsSampleCounts() { return (int) VH_limits$framebufferNoAttachmentsSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$maxColorAttachments() { return (int) VH_limits$maxColorAttachments.get(this.segment(), 0L, 0L); }
    public int limits$sampledImageColorSampleCounts() { return (int) VH_limits$sampledImageColorSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$sampledImageIntegerSampleCounts() { return (int) VH_limits$sampledImageIntegerSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$sampledImageDepthSampleCounts() { return (int) VH_limits$sampledImageDepthSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$sampledImageStencilSampleCounts() { return (int) VH_limits$sampledImageStencilSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$storageImageSampleCounts() { return (int) VH_limits$storageImageSampleCounts.get(this.segment(), 0L, 0L); }
    public int limits$maxSampleMaskWords() { return (int) VH_limits$maxSampleMaskWords.get(this.segment(), 0L, 0L); }
    public int limits$timestampComputeAndGraphics() { return (int) VH_limits$timestampComputeAndGraphics.get(this.segment(), 0L, 0L); }
    public float limits$timestampPeriod() { return (float) VH_limits$timestampPeriod.get(this.segment(), 0L, 0L); }
    public int limits$maxClipDistances() { return (int) VH_limits$maxClipDistances.get(this.segment(), 0L, 0L); }
    public int limits$maxCullDistances() { return (int) VH_limits$maxCullDistances.get(this.segment(), 0L, 0L); }
    public int limits$maxCombinedClipAndCullDistances() { return (int) VH_limits$maxCombinedClipAndCullDistances.get(this.segment(), 0L, 0L); }
    public int limits$discreteQueuePriorities() { return (int) VH_limits$discreteQueuePriorities.get(this.segment(), 0L, 0L); }
    public float limits$pointSizeRange(long index0) { return (float) VH_limits$pointSizeRange.get(this.segment(), 0L, 0L, index0); }
    public float limits$lineWidthRange(long index0) { return (float) VH_limits$lineWidthRange.get(this.segment(), 0L, 0L, index0); }
    public float limits$pointSizeGranularity() { return (float) VH_limits$pointSizeGranularity.get(this.segment(), 0L, 0L); }
    public float limits$lineWidthGranularity() { return (float) VH_limits$lineWidthGranularity.get(this.segment(), 0L, 0L); }
    public int limits$strictLines() { return (int) VH_limits$strictLines.get(this.segment(), 0L, 0L); }
    public int limits$standardSampleLocations() { return (int) VH_limits$standardSampleLocations.get(this.segment(), 0L, 0L); }
    public long limits$optimalBufferCopyOffsetAlignment() { return (long) VH_limits$optimalBufferCopyOffsetAlignment.get(this.segment(), 0L, 0L); }
    public long limits$optimalBufferCopyRowPitchAlignment() { return (long) VH_limits$optimalBufferCopyRowPitchAlignment.get(this.segment(), 0L, 0L); }
    public long limits$nonCoherentAtomSize() { return (long) VH_limits$nonCoherentAtomSize.get(this.segment(), 0L, 0L); }
    public int sparseProperties$residencyStandard2DBlockShape() { return (int) VH_sparseProperties$residencyStandard2DBlockShape.get(this.segment(), 0L, 0L); }
    public int sparseProperties$residencyStandard2DMultisampleBlockShape() { return (int) VH_sparseProperties$residencyStandard2DMultisampleBlockShape.get(this.segment(), 0L, 0L); }
    public int sparseProperties$residencyStandard3DBlockShape() { return (int) VH_sparseProperties$residencyStandard3DBlockShape.get(this.segment(), 0L, 0L); }
    public int sparseProperties$residencyAlignedMipSize() { return (int) VH_sparseProperties$residencyAlignedMipSize.get(this.segment(), 0L, 0L); }
    public int sparseProperties$residencyNonResidentStrict() { return (int) VH_sparseProperties$residencyNonResidentStrict.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceProperties apiVersionAt(long index, int value) { VH_apiVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties driverVersionAt(long index, int value) { VH_driverVersion.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties vendorIDAt(long index, int value) { VH_vendorID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties deviceIDAt(long index, int value) { VH_deviceID.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties deviceTypeAt(long index, int value) { VH_deviceType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties deviceNameAt(long index, long index0, byte value) { VH_deviceName.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties pipelineCacheUUIDAt(long index, long index0, byte value) { VH_pipelineCacheUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimension1DAt(long index, int value) { VH_limits$maxImageDimension1D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimension2DAt(long index, int value) { VH_limits$maxImageDimension2D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimension3DAt(long index, int value) { VH_limits$maxImageDimension3D.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimensionCubeAt(long index, int value) { VH_limits$maxImageDimensionCube.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageArrayLayersAt(long index, int value) { VH_limits$maxImageArrayLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTexelBufferElementsAt(long index, int value) { VH_limits$maxTexelBufferElements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxUniformBufferRangeAt(long index, int value) { VH_limits$maxUniformBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxStorageBufferRangeAt(long index, int value) { VH_limits$maxStorageBufferRange.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPushConstantsSizeAt(long index, int value) { VH_limits$maxPushConstantsSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxMemoryAllocationCountAt(long index, int value) { VH_limits$maxMemoryAllocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSamplerAllocationCountAt(long index, int value) { VH_limits$maxSamplerAllocationCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$bufferImageGranularityAt(long index, long value) { VH_limits$bufferImageGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$sparseAddressSpaceSizeAt(long index, long value) { VH_limits$sparseAddressSpaceSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxBoundDescriptorSetsAt(long index, int value) { VH_limits$maxBoundDescriptorSets.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorSamplersAt(long index, int value) { VH_limits$maxPerStageDescriptorSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorUniformBuffersAt(long index, int value) { VH_limits$maxPerStageDescriptorUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorStorageBuffersAt(long index, int value) { VH_limits$maxPerStageDescriptorStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorSampledImagesAt(long index, int value) { VH_limits$maxPerStageDescriptorSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorStorageImagesAt(long index, int value) { VH_limits$maxPerStageDescriptorStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorInputAttachmentsAt(long index, int value) { VH_limits$maxPerStageDescriptorInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageResourcesAt(long index, int value) { VH_limits$maxPerStageResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetSamplersAt(long index, int value) { VH_limits$maxDescriptorSetSamplers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetUniformBuffersAt(long index, int value) { VH_limits$maxDescriptorSetUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetUniformBuffersDynamicAt(long index, int value) { VH_limits$maxDescriptorSetUniformBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetStorageBuffersAt(long index, int value) { VH_limits$maxDescriptorSetStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetStorageBuffersDynamicAt(long index, int value) { VH_limits$maxDescriptorSetStorageBuffersDynamic.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetSampledImagesAt(long index, int value) { VH_limits$maxDescriptorSetSampledImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetStorageImagesAt(long index, int value) { VH_limits$maxDescriptorSetStorageImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetInputAttachmentsAt(long index, int value) { VH_limits$maxDescriptorSetInputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputAttributesAt(long index, int value) { VH_limits$maxVertexInputAttributes.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputBindingsAt(long index, int value) { VH_limits$maxVertexInputBindings.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputAttributeOffsetAt(long index, int value) { VH_limits$maxVertexInputAttributeOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputBindingStrideAt(long index, int value) { VH_limits$maxVertexInputBindingStride.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexOutputComponentsAt(long index, int value) { VH_limits$maxVertexOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationGenerationLevelAt(long index, int value) { VH_limits$maxTessellationGenerationLevel.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationPatchSizeAt(long index, int value) { VH_limits$maxTessellationPatchSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlPerVertexInputComponentsAt(long index, int value) { VH_limits$maxTessellationControlPerVertexInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlPerVertexOutputComponentsAt(long index, int value) { VH_limits$maxTessellationControlPerVertexOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlPerPatchOutputComponentsAt(long index, int value) { VH_limits$maxTessellationControlPerPatchOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlTotalOutputComponentsAt(long index, int value) { VH_limits$maxTessellationControlTotalOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationEvaluationInputComponentsAt(long index, int value) { VH_limits$maxTessellationEvaluationInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationEvaluationOutputComponentsAt(long index, int value) { VH_limits$maxTessellationEvaluationOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryShaderInvocationsAt(long index, int value) { VH_limits$maxGeometryShaderInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryInputComponentsAt(long index, int value) { VH_limits$maxGeometryInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryOutputComponentsAt(long index, int value) { VH_limits$maxGeometryOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryOutputVerticesAt(long index, int value) { VH_limits$maxGeometryOutputVertices.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryTotalOutputComponentsAt(long index, int value) { VH_limits$maxGeometryTotalOutputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentInputComponentsAt(long index, int value) { VH_limits$maxFragmentInputComponents.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentOutputAttachmentsAt(long index, int value) { VH_limits$maxFragmentOutputAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentDualSrcAttachmentsAt(long index, int value) { VH_limits$maxFragmentDualSrcAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentCombinedOutputResourcesAt(long index, int value) { VH_limits$maxFragmentCombinedOutputResources.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeSharedMemorySizeAt(long index, int value) { VH_limits$maxComputeSharedMemorySize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeWorkGroupCountAt(long index, long index0, int value) { VH_limits$maxComputeWorkGroupCount.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeWorkGroupInvocationsAt(long index, int value) { VH_limits$maxComputeWorkGroupInvocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeWorkGroupSizeAt(long index, long index0, int value) { VH_limits$maxComputeWorkGroupSize.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$subPixelPrecisionBitsAt(long index, int value) { VH_limits$subPixelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$subTexelPrecisionBitsAt(long index, int value) { VH_limits$subTexelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$mipmapPrecisionBitsAt(long index, int value) { VH_limits$mipmapPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDrawIndexedIndexValueAt(long index, int value) { VH_limits$maxDrawIndexedIndexValue.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDrawIndirectCountAt(long index, int value) { VH_limits$maxDrawIndirectCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSamplerLodBiasAt(long index, float value) { VH_limits$maxSamplerLodBias.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSamplerAnisotropyAt(long index, float value) { VH_limits$maxSamplerAnisotropy.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxViewportsAt(long index, int value) { VH_limits$maxViewports.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxViewportDimensionsAt(long index, long index0, int value) { VH_limits$maxViewportDimensions.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$viewportBoundsRangeAt(long index, long index0, float value) { VH_limits$viewportBoundsRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$viewportSubPixelBitsAt(long index, int value) { VH_limits$viewportSubPixelBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minMemoryMapAlignmentAt(long index, long value) { VH_limits$minMemoryMapAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minTexelBufferOffsetAlignmentAt(long index, long value) { VH_limits$minTexelBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minUniformBufferOffsetAlignmentAt(long index, long value) { VH_limits$minUniformBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minStorageBufferOffsetAlignmentAt(long index, long value) { VH_limits$minStorageBufferOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minTexelOffsetAt(long index, int value) { VH_limits$minTexelOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTexelOffsetAt(long index, int value) { VH_limits$maxTexelOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minTexelGatherOffsetAt(long index, int value) { VH_limits$minTexelGatherOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTexelGatherOffsetAt(long index, int value) { VH_limits$maxTexelGatherOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$minInterpolationOffsetAt(long index, float value) { VH_limits$minInterpolationOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxInterpolationOffsetAt(long index, float value) { VH_limits$maxInterpolationOffset.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$subPixelInterpolationOffsetBitsAt(long index, int value) { VH_limits$subPixelInterpolationOffsetBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFramebufferWidthAt(long index, int value) { VH_limits$maxFramebufferWidth.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFramebufferHeightAt(long index, int value) { VH_limits$maxFramebufferHeight.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFramebufferLayersAt(long index, int value) { VH_limits$maxFramebufferLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferColorSampleCountsAt(long index, int value) { VH_limits$framebufferColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferDepthSampleCountsAt(long index, int value) { VH_limits$framebufferDepthSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferStencilSampleCountsAt(long index, int value) { VH_limits$framebufferStencilSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferNoAttachmentsSampleCountsAt(long index, int value) { VH_limits$framebufferNoAttachmentsSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxColorAttachmentsAt(long index, int value) { VH_limits$maxColorAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageColorSampleCountsAt(long index, int value) { VH_limits$sampledImageColorSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageIntegerSampleCountsAt(long index, int value) { VH_limits$sampledImageIntegerSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageDepthSampleCountsAt(long index, int value) { VH_limits$sampledImageDepthSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageStencilSampleCountsAt(long index, int value) { VH_limits$sampledImageStencilSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$storageImageSampleCountsAt(long index, int value) { VH_limits$storageImageSampleCounts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSampleMaskWordsAt(long index, int value) { VH_limits$maxSampleMaskWords.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$timestampComputeAndGraphicsAt(long index, int value) { VH_limits$timestampComputeAndGraphics.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$timestampPeriodAt(long index, float value) { VH_limits$timestampPeriod.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxClipDistancesAt(long index, int value) { VH_limits$maxClipDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxCullDistancesAt(long index, int value) { VH_limits$maxCullDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$maxCombinedClipAndCullDistancesAt(long index, int value) { VH_limits$maxCombinedClipAndCullDistances.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$discreteQueuePrioritiesAt(long index, int value) { VH_limits$discreteQueuePriorities.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$pointSizeRangeAt(long index, long index0, float value) { VH_limits$pointSizeRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$lineWidthRangeAt(long index, long index0, float value) { VH_limits$lineWidthRange.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$pointSizeGranularityAt(long index, float value) { VH_limits$pointSizeGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$lineWidthGranularityAt(long index, float value) { VH_limits$lineWidthGranularity.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$strictLinesAt(long index, int value) { VH_limits$strictLines.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$standardSampleLocationsAt(long index, int value) { VH_limits$standardSampleLocations.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$optimalBufferCopyOffsetAlignmentAt(long index, long value) { VH_limits$optimalBufferCopyOffsetAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$optimalBufferCopyRowPitchAlignmentAt(long index, long value) { VH_limits$optimalBufferCopyRowPitchAlignment.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties limits$nonCoherentAtomSizeAt(long index, long value) { VH_limits$nonCoherentAtomSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyStandard2DBlockShapeAt(long index, int value) { VH_sparseProperties$residencyStandard2DBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyStandard2DMultisampleBlockShapeAt(long index, int value) { VH_sparseProperties$residencyStandard2DMultisampleBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyStandard3DBlockShapeAt(long index, int value) { VH_sparseProperties$residencyStandard3DBlockShape.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyAlignedMipSizeAt(long index, int value) { VH_sparseProperties$residencyAlignedMipSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyNonResidentStrictAt(long index, int value) { VH_sparseProperties$residencyNonResidentStrict.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceProperties apiVersion(int value) { VH_apiVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties driverVersion(int value) { VH_driverVersion.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties vendorID(int value) { VH_vendorID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties deviceID(int value) { VH_deviceID.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties deviceType(int value) { VH_deviceType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties deviceName(long index0, byte value) { VH_deviceName.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties pipelineCacheUUID(long index0, byte value) { VH_pipelineCacheUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimension1D(int value) { VH_limits$maxImageDimension1D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimension2D(int value) { VH_limits$maxImageDimension2D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimension3D(int value) { VH_limits$maxImageDimension3D.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageDimensionCube(int value) { VH_limits$maxImageDimensionCube.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxImageArrayLayers(int value) { VH_limits$maxImageArrayLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTexelBufferElements(int value) { VH_limits$maxTexelBufferElements.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxUniformBufferRange(int value) { VH_limits$maxUniformBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxStorageBufferRange(int value) { VH_limits$maxStorageBufferRange.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPushConstantsSize(int value) { VH_limits$maxPushConstantsSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxMemoryAllocationCount(int value) { VH_limits$maxMemoryAllocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSamplerAllocationCount(int value) { VH_limits$maxSamplerAllocationCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$bufferImageGranularity(long value) { VH_limits$bufferImageGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$sparseAddressSpaceSize(long value) { VH_limits$sparseAddressSpaceSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxBoundDescriptorSets(int value) { VH_limits$maxBoundDescriptorSets.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorSamplers(int value) { VH_limits$maxPerStageDescriptorSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorUniformBuffers(int value) { VH_limits$maxPerStageDescriptorUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorStorageBuffers(int value) { VH_limits$maxPerStageDescriptorStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorSampledImages(int value) { VH_limits$maxPerStageDescriptorSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorStorageImages(int value) { VH_limits$maxPerStageDescriptorStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageDescriptorInputAttachments(int value) { VH_limits$maxPerStageDescriptorInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxPerStageResources(int value) { VH_limits$maxPerStageResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetSamplers(int value) { VH_limits$maxDescriptorSetSamplers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetUniformBuffers(int value) { VH_limits$maxDescriptorSetUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetUniformBuffersDynamic(int value) { VH_limits$maxDescriptorSetUniformBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetStorageBuffers(int value) { VH_limits$maxDescriptorSetStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetStorageBuffersDynamic(int value) { VH_limits$maxDescriptorSetStorageBuffersDynamic.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetSampledImages(int value) { VH_limits$maxDescriptorSetSampledImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetStorageImages(int value) { VH_limits$maxDescriptorSetStorageImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDescriptorSetInputAttachments(int value) { VH_limits$maxDescriptorSetInputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputAttributes(int value) { VH_limits$maxVertexInputAttributes.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputBindings(int value) { VH_limits$maxVertexInputBindings.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputAttributeOffset(int value) { VH_limits$maxVertexInputAttributeOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexInputBindingStride(int value) { VH_limits$maxVertexInputBindingStride.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxVertexOutputComponents(int value) { VH_limits$maxVertexOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationGenerationLevel(int value) { VH_limits$maxTessellationGenerationLevel.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationPatchSize(int value) { VH_limits$maxTessellationPatchSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlPerVertexInputComponents(int value) { VH_limits$maxTessellationControlPerVertexInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlPerVertexOutputComponents(int value) { VH_limits$maxTessellationControlPerVertexOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlPerPatchOutputComponents(int value) { VH_limits$maxTessellationControlPerPatchOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationControlTotalOutputComponents(int value) { VH_limits$maxTessellationControlTotalOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationEvaluationInputComponents(int value) { VH_limits$maxTessellationEvaluationInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTessellationEvaluationOutputComponents(int value) { VH_limits$maxTessellationEvaluationOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryShaderInvocations(int value) { VH_limits$maxGeometryShaderInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryInputComponents(int value) { VH_limits$maxGeometryInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryOutputComponents(int value) { VH_limits$maxGeometryOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryOutputVertices(int value) { VH_limits$maxGeometryOutputVertices.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxGeometryTotalOutputComponents(int value) { VH_limits$maxGeometryTotalOutputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentInputComponents(int value) { VH_limits$maxFragmentInputComponents.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentOutputAttachments(int value) { VH_limits$maxFragmentOutputAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentDualSrcAttachments(int value) { VH_limits$maxFragmentDualSrcAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFragmentCombinedOutputResources(int value) { VH_limits$maxFragmentCombinedOutputResources.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeSharedMemorySize(int value) { VH_limits$maxComputeSharedMemorySize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeWorkGroupCount(long index0, int value) { VH_limits$maxComputeWorkGroupCount.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeWorkGroupInvocations(int value) { VH_limits$maxComputeWorkGroupInvocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxComputeWorkGroupSize(long index0, int value) { VH_limits$maxComputeWorkGroupSize.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$subPixelPrecisionBits(int value) { VH_limits$subPixelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$subTexelPrecisionBits(int value) { VH_limits$subTexelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$mipmapPrecisionBits(int value) { VH_limits$mipmapPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDrawIndexedIndexValue(int value) { VH_limits$maxDrawIndexedIndexValue.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxDrawIndirectCount(int value) { VH_limits$maxDrawIndirectCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSamplerLodBias(float value) { VH_limits$maxSamplerLodBias.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSamplerAnisotropy(float value) { VH_limits$maxSamplerAnisotropy.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxViewports(int value) { VH_limits$maxViewports.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxViewportDimensions(long index0, int value) { VH_limits$maxViewportDimensions.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$viewportBoundsRange(long index0, float value) { VH_limits$viewportBoundsRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$viewportSubPixelBits(int value) { VH_limits$viewportSubPixelBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minMemoryMapAlignment(long value) { VH_limits$minMemoryMapAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minTexelBufferOffsetAlignment(long value) { VH_limits$minTexelBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minUniformBufferOffsetAlignment(long value) { VH_limits$minUniformBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minStorageBufferOffsetAlignment(long value) { VH_limits$minStorageBufferOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minTexelOffset(int value) { VH_limits$minTexelOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTexelOffset(int value) { VH_limits$maxTexelOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minTexelGatherOffset(int value) { VH_limits$minTexelGatherOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxTexelGatherOffset(int value) { VH_limits$maxTexelGatherOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$minInterpolationOffset(float value) { VH_limits$minInterpolationOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxInterpolationOffset(float value) { VH_limits$maxInterpolationOffset.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$subPixelInterpolationOffsetBits(int value) { VH_limits$subPixelInterpolationOffsetBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFramebufferWidth(int value) { VH_limits$maxFramebufferWidth.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFramebufferHeight(int value) { VH_limits$maxFramebufferHeight.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxFramebufferLayers(int value) { VH_limits$maxFramebufferLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferColorSampleCounts(int value) { VH_limits$framebufferColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferDepthSampleCounts(int value) { VH_limits$framebufferDepthSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferStencilSampleCounts(int value) { VH_limits$framebufferStencilSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$framebufferNoAttachmentsSampleCounts(int value) { VH_limits$framebufferNoAttachmentsSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxColorAttachments(int value) { VH_limits$maxColorAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageColorSampleCounts(int value) { VH_limits$sampledImageColorSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageIntegerSampleCounts(int value) { VH_limits$sampledImageIntegerSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageDepthSampleCounts(int value) { VH_limits$sampledImageDepthSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$sampledImageStencilSampleCounts(int value) { VH_limits$sampledImageStencilSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$storageImageSampleCounts(int value) { VH_limits$storageImageSampleCounts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxSampleMaskWords(int value) { VH_limits$maxSampleMaskWords.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$timestampComputeAndGraphics(int value) { VH_limits$timestampComputeAndGraphics.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$timestampPeriod(float value) { VH_limits$timestampPeriod.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxClipDistances(int value) { VH_limits$maxClipDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxCullDistances(int value) { VH_limits$maxCullDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$maxCombinedClipAndCullDistances(int value) { VH_limits$maxCombinedClipAndCullDistances.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$discreteQueuePriorities(int value) { VH_limits$discreteQueuePriorities.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$pointSizeRange(long index0, float value) { VH_limits$pointSizeRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$lineWidthRange(long index0, float value) { VH_limits$lineWidthRange.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceProperties limits$pointSizeGranularity(float value) { VH_limits$pointSizeGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$lineWidthGranularity(float value) { VH_limits$lineWidthGranularity.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$strictLines(int value) { VH_limits$strictLines.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$standardSampleLocations(int value) { VH_limits$standardSampleLocations.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$optimalBufferCopyOffsetAlignment(long value) { VH_limits$optimalBufferCopyOffsetAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$optimalBufferCopyRowPitchAlignment(long value) { VH_limits$optimalBufferCopyRowPitchAlignment.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties limits$nonCoherentAtomSize(long value) { VH_limits$nonCoherentAtomSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyStandard2DBlockShape(int value) { VH_sparseProperties$residencyStandard2DBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyStandard2DMultisampleBlockShape(int value) { VH_sparseProperties$residencyStandard2DMultisampleBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyStandard3DBlockShape(int value) { VH_sparseProperties$residencyStandard3DBlockShape.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyAlignedMipSize(int value) { VH_sparseProperties$residencyAlignedMipSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceProperties sparseProperties$residencyNonResidentStrict(int value) { VH_sparseProperties$residencyNonResidentStrict.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _apiVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_apiVersion, index), LAYOUT_apiVersion); }
    public MemorySegment _apiVersion() { return _apiVersionAt(0L); }
    public VkPhysicalDeviceProperties _apiVersionAt(long index, MemorySegment src) { _apiVersionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _apiVersion(MemorySegment src) { return _apiVersionAt(0L, src); }
    public MemorySegment _driverVersionAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_driverVersion, index), LAYOUT_driverVersion); }
    public MemorySegment _driverVersion() { return _driverVersionAt(0L); }
    public VkPhysicalDeviceProperties _driverVersionAt(long index, MemorySegment src) { _driverVersionAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _driverVersion(MemorySegment src) { return _driverVersionAt(0L, src); }
    public MemorySegment _vendorIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_vendorID, index), LAYOUT_vendorID); }
    public MemorySegment _vendorID() { return _vendorIDAt(0L); }
    public VkPhysicalDeviceProperties _vendorIDAt(long index, MemorySegment src) { _vendorIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _vendorID(MemorySegment src) { return _vendorIDAt(0L, src); }
    public MemorySegment _deviceIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceID, index), LAYOUT_deviceID); }
    public MemorySegment _deviceID() { return _deviceIDAt(0L); }
    public VkPhysicalDeviceProperties _deviceIDAt(long index, MemorySegment src) { _deviceIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _deviceID(MemorySegment src) { return _deviceIDAt(0L, src); }
    public MemorySegment _deviceTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceType, index), LAYOUT_deviceType); }
    public MemorySegment _deviceType() { return _deviceTypeAt(0L); }
    public VkPhysicalDeviceProperties _deviceTypeAt(long index, MemorySegment src) { _deviceTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _deviceType(MemorySegment src) { return _deviceTypeAt(0L, src); }
    public MemorySegment _deviceNameAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_deviceName, index), LAYOUT_deviceName); }
    public MemorySegment _deviceName() { return _deviceNameAt(0L); }
    public VkPhysicalDeviceProperties _deviceNameAt(long index, MemorySegment src) { _deviceNameAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _deviceName(MemorySegment src) { return _deviceNameAt(0L, src); }
    public MemorySegment _pipelineCacheUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pipelineCacheUUID, index), LAYOUT_pipelineCacheUUID); }
    public MemorySegment _pipelineCacheUUID() { return _pipelineCacheUUIDAt(0L); }
    public VkPhysicalDeviceProperties _pipelineCacheUUIDAt(long index, MemorySegment src) { _pipelineCacheUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _pipelineCacheUUID(MemorySegment src) { return _pipelineCacheUUIDAt(0L, src); }
    public MemorySegment _limitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_limits, index), LAYOUT_limits); }
    public MemorySegment _limits() { return _limitsAt(0L); }
    public VkPhysicalDeviceProperties _limitsAt(long index, MemorySegment src) { _limitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _limits(MemorySegment src) { return _limitsAt(0L, src); }
    public MemorySegment _sparsePropertiesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sparseProperties, index), LAYOUT_sparseProperties); }
    public MemorySegment _sparseProperties() { return _sparsePropertiesAt(0L); }
    public VkPhysicalDeviceProperties _sparsePropertiesAt(long index, MemorySegment src) { _sparsePropertiesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceProperties _sparseProperties(MemorySegment src) { return _sparsePropertiesAt(0L, src); }
}
