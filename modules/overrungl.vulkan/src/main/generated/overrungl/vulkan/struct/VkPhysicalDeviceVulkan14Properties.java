// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.struct;
import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceVulkan14Properties`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan14Properties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t lineSubPixelPrecisionBits;
///     uint32_t maxVertexAttribDivisor;
///     VkBool32 supportsNonZeroFirstInstance;
///     uint32_t maxPushDescriptors;
///     VkBool32 dynamicRenderingLocalReadDepthStencilAttachments;
///     VkBool32 dynamicRenderingLocalReadMultisampledAttachments;
///     VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
///     VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
///     VkBool32 depthStencilSwizzleOneSupport;
///     VkBool32 polygonModePointSize;
///     VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
///     VkBool32 nonStrictWideLinesUseParallelogram;
///     VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     VkBool32 fragmentShadingRateClampCombinerInputs;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
///     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
///     VkPipelineRobustnessImageBehavior defaultRobustnessImages;
///     uint32_t copySrcLayoutCount;
///     VkImageLayout* pCopySrcLayouts;
///     uint32_t copyDstLayoutCount;
///     VkImageLayout* pCopyDstLayouts;
///     uint8_t optimalTilingLayoutUUID[VK_UUID_SIZE];
///     VkBool32 identicalMemoryTypeRequirements;
/// }
/// ```
public final class VkPhysicalDeviceVulkan14Properties extends GroupType {
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineSubPixelPrecisionBits"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance"),
        ValueLayout.JAVA_INT.withName("maxPushDescriptors"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalReadDepthStencilAttachments"),
        ValueLayout.JAVA_INT.withName("dynamicRenderingLocalReadMultisampledAttachments"),
        ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
        ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
        ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport"),
        ValueLayout.JAVA_INT.withName("polygonModePointSize"),
        ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram"),
        ValueLayout.JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
        ValueLayout.JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
        ValueLayout.JAVA_INT.withName("fragmentShadingRateClampCombinerInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessStorageBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessUniformBuffers"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessVertexInputs"),
        ValueLayout.JAVA_INT.withName("defaultRobustnessImages"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withName("pCopyDstLayouts"),
        MemoryLayout.sequenceLayout(overrungl.vulkan.VK10.VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    public static final long OFFSET_lineSubPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
    public static final long OFFSET_maxVertexAttribDivisor = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final long OFFSET_supportsNonZeroFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
    public static final long OFFSET_maxPushDescriptors = LAYOUT.byteOffset(PathElement.groupElement("maxPushDescriptors"));
    public static final long OFFSET_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    public static final long OFFSET_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    public static final long OFFSET_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    public static final long OFFSET_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    public static final long OFFSET_depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    public static final long OFFSET_polygonModePointSize = LAYOUT.byteOffset(PathElement.groupElement("polygonModePointSize"));
    public static final long OFFSET_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    public static final long OFFSET_nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    public static final long OFFSET_blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    public static final long OFFSET_maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    public static final long OFFSET_fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    public static final long OFFSET_defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    public static final long OFFSET_defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    public static final long OFFSET_defaultRobustnessVertexInputs = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessVertexInputs"));
    public static final long OFFSET_defaultRobustnessImages = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessImages"));
    public static final long OFFSET_copySrcLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copySrcLayoutCount"));
    public static final long OFFSET_pCopySrcLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopySrcLayouts"));
    public static final long OFFSET_copyDstLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copyDstLayoutCount"));
    public static final long OFFSET_pCopyDstLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopyDstLayouts"));
    public static final long OFFSET_optimalTilingLayoutUUID = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingLayoutUUID"));
    public static final long OFFSET_identicalMemoryTypeRequirements = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryTypeRequirements"));
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    public static final MemoryLayout LAYOUT_lineSubPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("lineSubPixelPrecisionBits"));
    public static final MemoryLayout LAYOUT_maxVertexAttribDivisor = LAYOUT.select(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final MemoryLayout LAYOUT_supportsNonZeroFirstInstance = LAYOUT.select(PathElement.groupElement("supportsNonZeroFirstInstance"));
    public static final MemoryLayout LAYOUT_maxPushDescriptors = LAYOUT.select(PathElement.groupElement("maxPushDescriptors"));
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    public static final MemoryLayout LAYOUT_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    public static final MemoryLayout LAYOUT_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    public static final MemoryLayout LAYOUT_depthStencilSwizzleOneSupport = LAYOUT.select(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    public static final MemoryLayout LAYOUT_polygonModePointSize = LAYOUT.select(PathElement.groupElement("polygonModePointSize"));
    public static final MemoryLayout LAYOUT_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    public static final MemoryLayout LAYOUT_nonStrictWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    public static final MemoryLayout LAYOUT_blockTexelViewCompatibleMultipleLayers = LAYOUT.select(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    public static final MemoryLayout LAYOUT_maxCombinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    public static final MemoryLayout LAYOUT_fragmentShadingRateClampCombinerInputs = LAYOUT.select(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    public static final MemoryLayout LAYOUT_defaultRobustnessStorageBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    public static final MemoryLayout LAYOUT_defaultRobustnessUniformBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    public static final MemoryLayout LAYOUT_defaultRobustnessVertexInputs = LAYOUT.select(PathElement.groupElement("defaultRobustnessVertexInputs"));
    public static final MemoryLayout LAYOUT_defaultRobustnessImages = LAYOUT.select(PathElement.groupElement("defaultRobustnessImages"));
    public static final MemoryLayout LAYOUT_copySrcLayoutCount = LAYOUT.select(PathElement.groupElement("copySrcLayoutCount"));
    public static final MemoryLayout LAYOUT_pCopySrcLayouts = LAYOUT.select(PathElement.groupElement("pCopySrcLayouts"));
    public static final MemoryLayout LAYOUT_copyDstLayoutCount = LAYOUT.select(PathElement.groupElement("copyDstLayoutCount"));
    public static final MemoryLayout LAYOUT_pCopyDstLayouts = LAYOUT.select(PathElement.groupElement("pCopyDstLayouts"));
    public static final MemoryLayout LAYOUT_optimalTilingLayoutUUID = LAYOUT.select(PathElement.groupElement("optimalTilingLayoutUUID"));
    public static final MemoryLayout LAYOUT_identicalMemoryTypeRequirements = LAYOUT.select(PathElement.groupElement("identicalMemoryTypeRequirements"));
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));
    public static final VarHandle VH_maxPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPushDescriptors"));
    public static final VarHandle VH_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    public static final VarHandle VH_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    public static final VarHandle VH_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    public static final VarHandle VH_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    public static final VarHandle VH_depthStencilSwizzleOneSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    public static final VarHandle VH_polygonModePointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonModePointSize"));
    public static final VarHandle VH_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    public static final VarHandle VH_nonStrictWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    public static final VarHandle VH_blockTexelViewCompatibleMultipleLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    public static final VarHandle VH_maxCombinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    public static final VarHandle VH_fragmentShadingRateClampCombinerInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    public static final VarHandle VH_defaultRobustnessStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    public static final VarHandle VH_defaultRobustnessUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    public static final VarHandle VH_defaultRobustnessVertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
    public static final VarHandle VH_defaultRobustnessImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessImages"));
    public static final VarHandle VH_copySrcLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copySrcLayoutCount"));
    public static final VarHandle VH_pCopySrcLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopySrcLayouts"));
    public static final VarHandle VH_copyDstLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyDstLayoutCount"));
    public static final VarHandle VH_pCopyDstLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopyDstLayouts"));
    public static final VarHandle VH_optimalTilingLayoutUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
    public static final VarHandle VH_identicalMemoryTypeRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));

    public VkPhysicalDeviceVulkan14Properties(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
    public static VkPhysicalDeviceVulkan14Properties of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment, estimateCount(segment, LAYOUT)); }
    public static VkPhysicalDeviceVulkan14Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment.reinterpret(LAYOUT.byteSize()), 1); }
    public static VkPhysicalDeviceVulkan14Properties ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment.reinterpret(LAYOUT.scale(0, count)), count); }
    public static VkPhysicalDeviceVulkan14Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan14Properties(allocator.allocate(LAYOUT), 1); }
    public static VkPhysicalDeviceVulkan14Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan14Properties(allocator.allocate(LAYOUT, count), count); }
    public static VkPhysicalDeviceVulkan14Properties allocInit(SegmentAllocator allocator) { return alloc(allocator).sType(overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES); }
    public static VkPhysicalDeviceVulkan14Properties allocInit(SegmentAllocator allocator, long count) {
        var s = alloc(allocator, count);
        for (long i = 0; i < count; i++) s.sTypeAt(i, overrungl.vulkan.VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_4_PROPERTIES);
        return s;
    }
    public VkPhysicalDeviceVulkan14Properties copyFrom(VkPhysicalDeviceVulkan14Properties src) { this.segment().copyFrom(src.segment()); return this; }
    public VkPhysicalDeviceVulkan14Properties reinterpret(long count) { return new VkPhysicalDeviceVulkan14Properties(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
    public VkPhysicalDeviceVulkan14Properties asSlice(long index) { return new VkPhysicalDeviceVulkan14Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }
    public VkPhysicalDeviceVulkan14Properties asSlice(long index, long count) { return new VkPhysicalDeviceVulkan14Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
    public VkPhysicalDeviceVulkan14Properties at(long index, Consumer<VkPhysicalDeviceVulkan14Properties> func) { func.accept(asSlice(index)); return this; }
    public int sTypeAt(long index) { return (int) VH_sType.get(this.segment(), 0L, index); }
    public MemorySegment pNextAt(long index) { return (MemorySegment) VH_pNext.get(this.segment(), 0L, index); }
    public int lineSubPixelPrecisionBitsAt(long index) { return (int) VH_lineSubPixelPrecisionBits.get(this.segment(), 0L, index); }
    public int maxVertexAttribDivisorAt(long index) { return (int) VH_maxVertexAttribDivisor.get(this.segment(), 0L, index); }
    public int supportsNonZeroFirstInstanceAt(long index) { return (int) VH_supportsNonZeroFirstInstance.get(this.segment(), 0L, index); }
    public int maxPushDescriptorsAt(long index) { return (int) VH_maxPushDescriptors.get(this.segment(), 0L, index); }
    public int dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index) { return (int) VH_dynamicRenderingLocalReadDepthStencilAttachments.get(this.segment(), 0L, index); }
    public int dynamicRenderingLocalReadMultisampledAttachmentsAt(long index) { return (int) VH_dynamicRenderingLocalReadMultisampledAttachments.get(this.segment(), 0L, index); }
    public int earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(this.segment(), 0L, index); }
    public int earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(this.segment(), 0L, index); }
    public int depthStencilSwizzleOneSupportAt(long index) { return (int) VH_depthStencilSwizzleOneSupport.get(this.segment(), 0L, index); }
    public int polygonModePointSizeAt(long index) { return (int) VH_polygonModePointSize.get(this.segment(), 0L, index); }
    public int nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(this.segment(), 0L, index); }
    public int nonStrictWideLinesUseParallelogramAt(long index) { return (int) VH_nonStrictWideLinesUseParallelogram.get(this.segment(), 0L, index); }
    public int blockTexelViewCompatibleMultipleLayersAt(long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(this.segment(), 0L, index); }
    public int maxCombinedImageSamplerDescriptorCountAt(long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(this.segment(), 0L, index); }
    public int fragmentShadingRateClampCombinerInputsAt(long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get(this.segment(), 0L, index); }
    public int defaultRobustnessStorageBuffersAt(long index) { return (int) VH_defaultRobustnessStorageBuffers.get(this.segment(), 0L, index); }
    public int defaultRobustnessUniformBuffersAt(long index) { return (int) VH_defaultRobustnessUniformBuffers.get(this.segment(), 0L, index); }
    public int defaultRobustnessVertexInputsAt(long index) { return (int) VH_defaultRobustnessVertexInputs.get(this.segment(), 0L, index); }
    public int defaultRobustnessImagesAt(long index) { return (int) VH_defaultRobustnessImages.get(this.segment(), 0L, index); }
    public int copySrcLayoutCountAt(long index) { return (int) VH_copySrcLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pCopySrcLayoutsAt(long index) { return (MemorySegment) VH_pCopySrcLayouts.get(this.segment(), 0L, index); }
    public int copyDstLayoutCountAt(long index) { return (int) VH_copyDstLayoutCount.get(this.segment(), 0L, index); }
    public MemorySegment pCopyDstLayoutsAt(long index) { return (MemorySegment) VH_pCopyDstLayouts.get(this.segment(), 0L, index); }
    public byte optimalTilingLayoutUUIDAt(long index, long index0) { return (byte) VH_optimalTilingLayoutUUID.get(this.segment(), 0L, index, index0); }
    public int identicalMemoryTypeRequirementsAt(long index) { return (int) VH_identicalMemoryTypeRequirements.get(this.segment(), 0L, index); }
    public int sType() { return (int) VH_sType.get(this.segment(), 0L, 0L); }
    public MemorySegment pNext() { return (MemorySegment) VH_pNext.get(this.segment(), 0L, 0L); }
    public int lineSubPixelPrecisionBits() { return (int) VH_lineSubPixelPrecisionBits.get(this.segment(), 0L, 0L); }
    public int maxVertexAttribDivisor() { return (int) VH_maxVertexAttribDivisor.get(this.segment(), 0L, 0L); }
    public int supportsNonZeroFirstInstance() { return (int) VH_supportsNonZeroFirstInstance.get(this.segment(), 0L, 0L); }
    public int maxPushDescriptors() { return (int) VH_maxPushDescriptors.get(this.segment(), 0L, 0L); }
    public int dynamicRenderingLocalReadDepthStencilAttachments() { return (int) VH_dynamicRenderingLocalReadDepthStencilAttachments.get(this.segment(), 0L, 0L); }
    public int dynamicRenderingLocalReadMultisampledAttachments() { return (int) VH_dynamicRenderingLocalReadMultisampledAttachments.get(this.segment(), 0L, 0L); }
    public int earlyFragmentMultisampleCoverageAfterSampleCounting() { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(this.segment(), 0L, 0L); }
    public int earlyFragmentSampleMaskTestBeforeSampleCounting() { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(this.segment(), 0L, 0L); }
    public int depthStencilSwizzleOneSupport() { return (int) VH_depthStencilSwizzleOneSupport.get(this.segment(), 0L, 0L); }
    public int polygonModePointSize() { return (int) VH_polygonModePointSize.get(this.segment(), 0L, 0L); }
    public int nonStrictSinglePixelWideLinesUseParallelogram() { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(this.segment(), 0L, 0L); }
    public int nonStrictWideLinesUseParallelogram() { return (int) VH_nonStrictWideLinesUseParallelogram.get(this.segment(), 0L, 0L); }
    public int blockTexelViewCompatibleMultipleLayers() { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(this.segment(), 0L, 0L); }
    public int maxCombinedImageSamplerDescriptorCount() { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(this.segment(), 0L, 0L); }
    public int fragmentShadingRateClampCombinerInputs() { return (int) VH_fragmentShadingRateClampCombinerInputs.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessStorageBuffers() { return (int) VH_defaultRobustnessStorageBuffers.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessUniformBuffers() { return (int) VH_defaultRobustnessUniformBuffers.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessVertexInputs() { return (int) VH_defaultRobustnessVertexInputs.get(this.segment(), 0L, 0L); }
    public int defaultRobustnessImages() { return (int) VH_defaultRobustnessImages.get(this.segment(), 0L, 0L); }
    public int copySrcLayoutCount() { return (int) VH_copySrcLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCopySrcLayouts() { return (MemorySegment) VH_pCopySrcLayouts.get(this.segment(), 0L, 0L); }
    public int copyDstLayoutCount() { return (int) VH_copyDstLayoutCount.get(this.segment(), 0L, 0L); }
    public MemorySegment pCopyDstLayouts() { return (MemorySegment) VH_pCopyDstLayouts.get(this.segment(), 0L, 0L); }
    public byte optimalTilingLayoutUUID(long index0) { return (byte) VH_optimalTilingLayoutUUID.get(this.segment(), 0L, 0L, index0); }
    public int identicalMemoryTypeRequirements() { return (int) VH_identicalMemoryTypeRequirements.get(this.segment(), 0L, 0L); }
    public VkPhysicalDeviceVulkan14Properties sTypeAt(long index, int value) { VH_sType.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties pNextAt(long index, MemorySegment value) { VH_pNext.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties lineSubPixelPrecisionBitsAt(long index, int value) { VH_lineSubPixelPrecisionBits.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties maxVertexAttribDivisorAt(long index, int value) { VH_maxVertexAttribDivisor.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties supportsNonZeroFirstInstanceAt(long index, int value) { VH_supportsNonZeroFirstInstance.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties maxPushDescriptorsAt(long index, int value) { VH_maxPushDescriptors.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index, int value) { VH_dynamicRenderingLocalReadDepthStencilAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadMultisampledAttachmentsAt(long index, int value) { VH_dynamicRenderingLocalReadMultisampledAttachments.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties depthStencilSwizzleOneSupportAt(long index, int value) { VH_depthStencilSwizzleOneSupport.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties polygonModePointSizeAt(long index, int value) { VH_polygonModePointSize.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties nonStrictSinglePixelWideLinesUseParallelogramAt(long index, int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties nonStrictWideLinesUseParallelogramAt(long index, int value) { VH_nonStrictWideLinesUseParallelogram.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties blockTexelViewCompatibleMultipleLayersAt(long index, int value) { VH_blockTexelViewCompatibleMultipleLayers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties maxCombinedImageSamplerDescriptorCountAt(long index, int value) { VH_maxCombinedImageSamplerDescriptorCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties fragmentShadingRateClampCombinerInputsAt(long index, int value) { VH_fragmentShadingRateClampCombinerInputs.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessStorageBuffersAt(long index, int value) { VH_defaultRobustnessStorageBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessUniformBuffersAt(long index, int value) { VH_defaultRobustnessUniformBuffers.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessVertexInputsAt(long index, int value) { VH_defaultRobustnessVertexInputs.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessImagesAt(long index, int value) { VH_defaultRobustnessImages.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties copySrcLayoutCountAt(long index, int value) { VH_copySrcLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties pCopySrcLayoutsAt(long index, MemorySegment value) { VH_pCopySrcLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties copyDstLayoutCountAt(long index, int value) { VH_copyDstLayoutCount.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties pCopyDstLayoutsAt(long index, MemorySegment value) { VH_pCopyDstLayouts.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUIDAt(long index, long index0, byte value) { VH_optimalTilingLayoutUUID.set(this.segment(), 0L, index, index0, value); return this; }
    public VkPhysicalDeviceVulkan14Properties identicalMemoryTypeRequirementsAt(long index, int value) { VH_identicalMemoryTypeRequirements.set(this.segment(), 0L, index, value); return this; }
    public VkPhysicalDeviceVulkan14Properties sType(int value) { VH_sType.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties pNext(MemorySegment value) { VH_pNext.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties lineSubPixelPrecisionBits(int value) { VH_lineSubPixelPrecisionBits.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties maxVertexAttribDivisor(int value) { VH_maxVertexAttribDivisor.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties supportsNonZeroFirstInstance(int value) { VH_supportsNonZeroFirstInstance.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties maxPushDescriptors(int value) { VH_maxPushDescriptors.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadDepthStencilAttachments(int value) { VH_dynamicRenderingLocalReadDepthStencilAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadMultisampledAttachments(int value) { VH_dynamicRenderingLocalReadMultisampledAttachments.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties earlyFragmentMultisampleCoverageAfterSampleCounting(int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties earlyFragmentSampleMaskTestBeforeSampleCounting(int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties depthStencilSwizzleOneSupport(int value) { VH_depthStencilSwizzleOneSupport.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties polygonModePointSize(int value) { VH_polygonModePointSize.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties nonStrictSinglePixelWideLinesUseParallelogram(int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties nonStrictWideLinesUseParallelogram(int value) { VH_nonStrictWideLinesUseParallelogram.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties blockTexelViewCompatibleMultipleLayers(int value) { VH_blockTexelViewCompatibleMultipleLayers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties maxCombinedImageSamplerDescriptorCount(int value) { VH_maxCombinedImageSamplerDescriptorCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties fragmentShadingRateClampCombinerInputs(int value) { VH_fragmentShadingRateClampCombinerInputs.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessStorageBuffers(int value) { VH_defaultRobustnessStorageBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessUniformBuffers(int value) { VH_defaultRobustnessUniformBuffers.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessVertexInputs(int value) { VH_defaultRobustnessVertexInputs.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessImages(int value) { VH_defaultRobustnessImages.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties copySrcLayoutCount(int value) { VH_copySrcLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties pCopySrcLayouts(MemorySegment value) { VH_pCopySrcLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties copyDstLayoutCount(int value) { VH_copyDstLayoutCount.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties pCopyDstLayouts(MemorySegment value) { VH_pCopyDstLayouts.set(this.segment(), 0L, 0L, value); return this; }
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUID(long index0, byte value) { VH_optimalTilingLayoutUUID.set(this.segment(), 0L, 0L, index0, value); return this; }
    public VkPhysicalDeviceVulkan14Properties identicalMemoryTypeRequirements(int value) { VH_identicalMemoryTypeRequirements.set(this.segment(), 0L, 0L, value); return this; }
    public MemorySegment _sTypeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_sType, index), LAYOUT_sType); }
    public MemorySegment _sType() { return _sTypeAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _sTypeAt(long index, MemorySegment src) { _sTypeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _sType(MemorySegment src) { return _sTypeAt(0L, src); }
    public MemorySegment _pNextAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pNext, index), LAYOUT_pNext); }
    public MemorySegment _pNext() { return _pNextAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _pNextAt(long index, MemorySegment src) { _pNextAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _pNext(MemorySegment src) { return _pNextAt(0L, src); }
    public MemorySegment _lineSubPixelPrecisionBitsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_lineSubPixelPrecisionBits, index), LAYOUT_lineSubPixelPrecisionBits); }
    public MemorySegment _lineSubPixelPrecisionBits() { return _lineSubPixelPrecisionBitsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _lineSubPixelPrecisionBitsAt(long index, MemorySegment src) { _lineSubPixelPrecisionBitsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _lineSubPixelPrecisionBits(MemorySegment src) { return _lineSubPixelPrecisionBitsAt(0L, src); }
    public MemorySegment _maxVertexAttribDivisorAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxVertexAttribDivisor, index), LAYOUT_maxVertexAttribDivisor); }
    public MemorySegment _maxVertexAttribDivisor() { return _maxVertexAttribDivisorAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _maxVertexAttribDivisorAt(long index, MemorySegment src) { _maxVertexAttribDivisorAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _maxVertexAttribDivisor(MemorySegment src) { return _maxVertexAttribDivisorAt(0L, src); }
    public MemorySegment _supportsNonZeroFirstInstanceAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_supportsNonZeroFirstInstance, index), LAYOUT_supportsNonZeroFirstInstance); }
    public MemorySegment _supportsNonZeroFirstInstance() { return _supportsNonZeroFirstInstanceAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _supportsNonZeroFirstInstanceAt(long index, MemorySegment src) { _supportsNonZeroFirstInstanceAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _supportsNonZeroFirstInstance(MemorySegment src) { return _supportsNonZeroFirstInstanceAt(0L, src); }
    public MemorySegment _maxPushDescriptorsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxPushDescriptors, index), LAYOUT_maxPushDescriptors); }
    public MemorySegment _maxPushDescriptors() { return _maxPushDescriptorsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _maxPushDescriptorsAt(long index, MemorySegment src) { _maxPushDescriptorsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _maxPushDescriptors(MemorySegment src) { return _maxPushDescriptorsAt(0L, src); }
    public MemorySegment _dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRenderingLocalReadDepthStencilAttachments, index), LAYOUT_dynamicRenderingLocalReadDepthStencilAttachments); }
    public MemorySegment _dynamicRenderingLocalReadDepthStencilAttachments() { return _dynamicRenderingLocalReadDepthStencilAttachmentsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index, MemorySegment src) { _dynamicRenderingLocalReadDepthStencilAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment src) { return _dynamicRenderingLocalReadDepthStencilAttachmentsAt(0L, src); }
    public MemorySegment _dynamicRenderingLocalReadMultisampledAttachmentsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_dynamicRenderingLocalReadMultisampledAttachments, index), LAYOUT_dynamicRenderingLocalReadMultisampledAttachments); }
    public MemorySegment _dynamicRenderingLocalReadMultisampledAttachments() { return _dynamicRenderingLocalReadMultisampledAttachmentsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _dynamicRenderingLocalReadMultisampledAttachmentsAt(long index, MemorySegment src) { _dynamicRenderingLocalReadMultisampledAttachmentsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _dynamicRenderingLocalReadMultisampledAttachments(MemorySegment src) { return _dynamicRenderingLocalReadMultisampledAttachmentsAt(0L, src); }
    public MemorySegment _earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_earlyFragmentMultisampleCoverageAfterSampleCounting, index), LAYOUT_earlyFragmentMultisampleCoverageAfterSampleCounting); }
    public MemorySegment _earlyFragmentMultisampleCoverageAfterSampleCounting() { return _earlyFragmentMultisampleCoverageAfterSampleCountingAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, MemorySegment src) { _earlyFragmentMultisampleCoverageAfterSampleCountingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment src) { return _earlyFragmentMultisampleCoverageAfterSampleCountingAt(0L, src); }
    public MemorySegment _earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_earlyFragmentSampleMaskTestBeforeSampleCounting, index), LAYOUT_earlyFragmentSampleMaskTestBeforeSampleCounting); }
    public MemorySegment _earlyFragmentSampleMaskTestBeforeSampleCounting() { return _earlyFragmentSampleMaskTestBeforeSampleCountingAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, MemorySegment src) { _earlyFragmentSampleMaskTestBeforeSampleCountingAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment src) { return _earlyFragmentSampleMaskTestBeforeSampleCountingAt(0L, src); }
    public MemorySegment _depthStencilSwizzleOneSupportAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_depthStencilSwizzleOneSupport, index), LAYOUT_depthStencilSwizzleOneSupport); }
    public MemorySegment _depthStencilSwizzleOneSupport() { return _depthStencilSwizzleOneSupportAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _depthStencilSwizzleOneSupportAt(long index, MemorySegment src) { _depthStencilSwizzleOneSupportAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _depthStencilSwizzleOneSupport(MemorySegment src) { return _depthStencilSwizzleOneSupportAt(0L, src); }
    public MemorySegment _polygonModePointSizeAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_polygonModePointSize, index), LAYOUT_polygonModePointSize); }
    public MemorySegment _polygonModePointSize() { return _polygonModePointSizeAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _polygonModePointSizeAt(long index, MemorySegment src) { _polygonModePointSizeAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _polygonModePointSize(MemorySegment src) { return _polygonModePointSizeAt(0L, src); }
    public MemorySegment _nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonStrictSinglePixelWideLinesUseParallelogram, index), LAYOUT_nonStrictSinglePixelWideLinesUseParallelogram); }
    public MemorySegment _nonStrictSinglePixelWideLinesUseParallelogram() { return _nonStrictSinglePixelWideLinesUseParallelogramAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _nonStrictSinglePixelWideLinesUseParallelogramAt(long index, MemorySegment src) { _nonStrictSinglePixelWideLinesUseParallelogramAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment src) { return _nonStrictSinglePixelWideLinesUseParallelogramAt(0L, src); }
    public MemorySegment _nonStrictWideLinesUseParallelogramAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_nonStrictWideLinesUseParallelogram, index), LAYOUT_nonStrictWideLinesUseParallelogram); }
    public MemorySegment _nonStrictWideLinesUseParallelogram() { return _nonStrictWideLinesUseParallelogramAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _nonStrictWideLinesUseParallelogramAt(long index, MemorySegment src) { _nonStrictWideLinesUseParallelogramAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _nonStrictWideLinesUseParallelogram(MemorySegment src) { return _nonStrictWideLinesUseParallelogramAt(0L, src); }
    public MemorySegment _blockTexelViewCompatibleMultipleLayersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_blockTexelViewCompatibleMultipleLayers, index), LAYOUT_blockTexelViewCompatibleMultipleLayers); }
    public MemorySegment _blockTexelViewCompatibleMultipleLayers() { return _blockTexelViewCompatibleMultipleLayersAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _blockTexelViewCompatibleMultipleLayersAt(long index, MemorySegment src) { _blockTexelViewCompatibleMultipleLayersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _blockTexelViewCompatibleMultipleLayers(MemorySegment src) { return _blockTexelViewCompatibleMultipleLayersAt(0L, src); }
    public MemorySegment _maxCombinedImageSamplerDescriptorCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_maxCombinedImageSamplerDescriptorCount, index), LAYOUT_maxCombinedImageSamplerDescriptorCount); }
    public MemorySegment _maxCombinedImageSamplerDescriptorCount() { return _maxCombinedImageSamplerDescriptorCountAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _maxCombinedImageSamplerDescriptorCountAt(long index, MemorySegment src) { _maxCombinedImageSamplerDescriptorCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _maxCombinedImageSamplerDescriptorCount(MemorySegment src) { return _maxCombinedImageSamplerDescriptorCountAt(0L, src); }
    public MemorySegment _fragmentShadingRateClampCombinerInputsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_fragmentShadingRateClampCombinerInputs, index), LAYOUT_fragmentShadingRateClampCombinerInputs); }
    public MemorySegment _fragmentShadingRateClampCombinerInputs() { return _fragmentShadingRateClampCombinerInputsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _fragmentShadingRateClampCombinerInputsAt(long index, MemorySegment src) { _fragmentShadingRateClampCombinerInputsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _fragmentShadingRateClampCombinerInputs(MemorySegment src) { return _fragmentShadingRateClampCombinerInputsAt(0L, src); }
    public MemorySegment _defaultRobustnessStorageBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessStorageBuffers, index), LAYOUT_defaultRobustnessStorageBuffers); }
    public MemorySegment _defaultRobustnessStorageBuffers() { return _defaultRobustnessStorageBuffersAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessStorageBuffersAt(long index, MemorySegment src) { _defaultRobustnessStorageBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessStorageBuffers(MemorySegment src) { return _defaultRobustnessStorageBuffersAt(0L, src); }
    public MemorySegment _defaultRobustnessUniformBuffersAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessUniformBuffers, index), LAYOUT_defaultRobustnessUniformBuffers); }
    public MemorySegment _defaultRobustnessUniformBuffers() { return _defaultRobustnessUniformBuffersAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessUniformBuffersAt(long index, MemorySegment src) { _defaultRobustnessUniformBuffersAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessUniformBuffers(MemorySegment src) { return _defaultRobustnessUniformBuffersAt(0L, src); }
    public MemorySegment _defaultRobustnessVertexInputsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessVertexInputs, index), LAYOUT_defaultRobustnessVertexInputs); }
    public MemorySegment _defaultRobustnessVertexInputs() { return _defaultRobustnessVertexInputsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessVertexInputsAt(long index, MemorySegment src) { _defaultRobustnessVertexInputsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessVertexInputs(MemorySegment src) { return _defaultRobustnessVertexInputsAt(0L, src); }
    public MemorySegment _defaultRobustnessImagesAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_defaultRobustnessImages, index), LAYOUT_defaultRobustnessImages); }
    public MemorySegment _defaultRobustnessImages() { return _defaultRobustnessImagesAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessImagesAt(long index, MemorySegment src) { _defaultRobustnessImagesAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _defaultRobustnessImages(MemorySegment src) { return _defaultRobustnessImagesAt(0L, src); }
    public MemorySegment _copySrcLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copySrcLayoutCount, index), LAYOUT_copySrcLayoutCount); }
    public MemorySegment _copySrcLayoutCount() { return _copySrcLayoutCountAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _copySrcLayoutCountAt(long index, MemorySegment src) { _copySrcLayoutCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _copySrcLayoutCount(MemorySegment src) { return _copySrcLayoutCountAt(0L, src); }
    public MemorySegment _pCopySrcLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCopySrcLayouts, index), LAYOUT_pCopySrcLayouts); }
    public MemorySegment _pCopySrcLayouts() { return _pCopySrcLayoutsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _pCopySrcLayoutsAt(long index, MemorySegment src) { _pCopySrcLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _pCopySrcLayouts(MemorySegment src) { return _pCopySrcLayoutsAt(0L, src); }
    public MemorySegment _copyDstLayoutCountAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_copyDstLayoutCount, index), LAYOUT_copyDstLayoutCount); }
    public MemorySegment _copyDstLayoutCount() { return _copyDstLayoutCountAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _copyDstLayoutCountAt(long index, MemorySegment src) { _copyDstLayoutCountAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _copyDstLayoutCount(MemorySegment src) { return _copyDstLayoutCountAt(0L, src); }
    public MemorySegment _pCopyDstLayoutsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_pCopyDstLayouts, index), LAYOUT_pCopyDstLayouts); }
    public MemorySegment _pCopyDstLayouts() { return _pCopyDstLayoutsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _pCopyDstLayoutsAt(long index, MemorySegment src) { _pCopyDstLayoutsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _pCopyDstLayouts(MemorySegment src) { return _pCopyDstLayoutsAt(0L, src); }
    public MemorySegment _optimalTilingLayoutUUIDAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_optimalTilingLayoutUUID, index), LAYOUT_optimalTilingLayoutUUID); }
    public MemorySegment _optimalTilingLayoutUUID() { return _optimalTilingLayoutUUIDAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _optimalTilingLayoutUUIDAt(long index, MemorySegment src) { _optimalTilingLayoutUUIDAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _optimalTilingLayoutUUID(MemorySegment src) { return _optimalTilingLayoutUUIDAt(0L, src); }
    public MemorySegment _identicalMemoryTypeRequirementsAt(long index) { return this.segment().asSlice(LAYOUT.scale(OFFSET_identicalMemoryTypeRequirements, index), LAYOUT_identicalMemoryTypeRequirements); }
    public MemorySegment _identicalMemoryTypeRequirements() { return _identicalMemoryTypeRequirementsAt(0L); }
    public VkPhysicalDeviceVulkan14Properties _identicalMemoryTypeRequirementsAt(long index, MemorySegment src) { _identicalMemoryTypeRequirementsAt(index).copyFrom(src); return this; }
    public VkPhysicalDeviceVulkan14Properties _identicalMemoryTypeRequirements(MemorySegment src) { return _identicalMemoryTypeRequirementsAt(0L, src); }
}
