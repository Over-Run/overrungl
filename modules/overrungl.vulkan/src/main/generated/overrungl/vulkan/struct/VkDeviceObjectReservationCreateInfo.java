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

/// Represents `VkDeviceObjectReservationCreateInfo`.
/// ## Layout
/// ```
/// struct VkDeviceObjectReservationCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t pipelineCacheCreateInfoCount;
///     const VkPipelineCacheCreateInfo* pPipelineCacheCreateInfos;
///     uint32_t pipelinePoolSizeCount;
///     const VkPipelinePoolSize* pPipelinePoolSizes;
///     uint32_t semaphoreRequestCount;
///     uint32_t commandBufferRequestCount;
///     uint32_t fenceRequestCount;
///     uint32_t deviceMemoryRequestCount;
///     uint32_t bufferRequestCount;
///     uint32_t imageRequestCount;
///     uint32_t eventRequestCount;
///     uint32_t queryPoolRequestCount;
///     uint32_t bufferViewRequestCount;
///     uint32_t imageViewRequestCount;
///     uint32_t layeredImageViewRequestCount;
///     uint32_t pipelineCacheRequestCount;
///     uint32_t pipelineLayoutRequestCount;
///     uint32_t renderPassRequestCount;
///     uint32_t graphicsPipelineRequestCount;
///     uint32_t computePipelineRequestCount;
///     uint32_t descriptorSetLayoutRequestCount;
///     uint32_t samplerRequestCount;
///     uint32_t descriptorPoolRequestCount;
///     uint32_t descriptorSetRequestCount;
///     uint32_t framebufferRequestCount;
///     uint32_t commandPoolRequestCount;
///     uint32_t samplerYcbcrConversionRequestCount;
///     uint32_t surfaceRequestCount;
///     uint32_t swapchainRequestCount;
///     uint32_t displayModeRequestCount;
///     uint32_t subpassDescriptionRequestCount;
///     uint32_t attachmentDescriptionRequestCount;
///     uint32_t descriptorSetLayoutBindingRequestCount;
///     uint32_t descriptorSetLayoutBindingLimit;
///     uint32_t maxImageViewMipLevels;
///     uint32_t maxImageViewArrayLayers;
///     uint32_t maxLayeredImageViewMipLevels;
///     uint32_t maxOcclusionQueriesPerPool;
///     uint32_t maxPipelineStatisticsQueriesPerPool;
///     uint32_t maxTimestampQueriesPerPool;
///     uint32_t maxImmutableSamplersPerDescriptorSetLayout;
/// };
/// ```
public final class VkDeviceObjectReservationCreateInfo extends GroupType {
    /// The struct layout of `VkDeviceObjectReservationCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineCacheCreateInfoCount"),
        ValueLayout.ADDRESS.withName("pPipelineCacheCreateInfos"),
        ValueLayout.JAVA_INT.withName("pipelinePoolSizeCount"),
        ValueLayout.ADDRESS.withName("pPipelinePoolSizes"),
        ValueLayout.JAVA_INT.withName("semaphoreRequestCount"),
        ValueLayout.JAVA_INT.withName("commandBufferRequestCount"),
        ValueLayout.JAVA_INT.withName("fenceRequestCount"),
        ValueLayout.JAVA_INT.withName("deviceMemoryRequestCount"),
        ValueLayout.JAVA_INT.withName("bufferRequestCount"),
        ValueLayout.JAVA_INT.withName("imageRequestCount"),
        ValueLayout.JAVA_INT.withName("eventRequestCount"),
        ValueLayout.JAVA_INT.withName("queryPoolRequestCount"),
        ValueLayout.JAVA_INT.withName("bufferViewRequestCount"),
        ValueLayout.JAVA_INT.withName("imageViewRequestCount"),
        ValueLayout.JAVA_INT.withName("layeredImageViewRequestCount"),
        ValueLayout.JAVA_INT.withName("pipelineCacheRequestCount"),
        ValueLayout.JAVA_INT.withName("pipelineLayoutRequestCount"),
        ValueLayout.JAVA_INT.withName("renderPassRequestCount"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineRequestCount"),
        ValueLayout.JAVA_INT.withName("computePipelineRequestCount"),
        ValueLayout.JAVA_INT.withName("descriptorSetLayoutRequestCount"),
        ValueLayout.JAVA_INT.withName("samplerRequestCount"),
        ValueLayout.JAVA_INT.withName("descriptorPoolRequestCount"),
        ValueLayout.JAVA_INT.withName("descriptorSetRequestCount"),
        ValueLayout.JAVA_INT.withName("framebufferRequestCount"),
        ValueLayout.JAVA_INT.withName("commandPoolRequestCount"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversionRequestCount"),
        ValueLayout.JAVA_INT.withName("surfaceRequestCount"),
        ValueLayout.JAVA_INT.withName("swapchainRequestCount"),
        ValueLayout.JAVA_INT.withName("displayModeRequestCount"),
        ValueLayout.JAVA_INT.withName("subpassDescriptionRequestCount"),
        ValueLayout.JAVA_INT.withName("attachmentDescriptionRequestCount"),
        ValueLayout.JAVA_INT.withName("descriptorSetLayoutBindingRequestCount"),
        ValueLayout.JAVA_INT.withName("descriptorSetLayoutBindingLimit"),
        ValueLayout.JAVA_INT.withName("maxImageViewMipLevels"),
        ValueLayout.JAVA_INT.withName("maxImageViewArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxLayeredImageViewMipLevels"),
        ValueLayout.JAVA_INT.withName("maxOcclusionQueriesPerPool"),
        ValueLayout.JAVA_INT.withName("maxPipelineStatisticsQueriesPerPool"),
        ValueLayout.JAVA_INT.withName("maxTimestampQueriesPerPool"),
        ValueLayout.JAVA_INT.withName("maxImmutableSamplersPerDescriptorSetLayout")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `pipelineCacheCreateInfoCount`.
    public static final long OFFSET_pipelineCacheCreateInfoCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheCreateInfoCount"));
    /// The memory layout of `pipelineCacheCreateInfoCount`.
    public static final MemoryLayout LAYOUT_pipelineCacheCreateInfoCount = LAYOUT.select(PathElement.groupElement("pipelineCacheCreateInfoCount"));
    /// The [VarHandle] of `pipelineCacheCreateInfoCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineCacheCreateInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheCreateInfoCount"));
    /// The byte offset of `pPipelineCacheCreateInfos`.
    public static final long OFFSET_pPipelineCacheCreateInfos = LAYOUT.byteOffset(PathElement.groupElement("pPipelineCacheCreateInfos"));
    /// The memory layout of `pPipelineCacheCreateInfos`.
    public static final MemoryLayout LAYOUT_pPipelineCacheCreateInfos = LAYOUT.select(PathElement.groupElement("pPipelineCacheCreateInfos"));
    /// The [VarHandle] of `pPipelineCacheCreateInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelineCacheCreateInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCacheCreateInfos"));
    /// The byte offset of `pipelinePoolSizeCount`.
    public static final long OFFSET_pipelinePoolSizeCount = LAYOUT.byteOffset(PathElement.groupElement("pipelinePoolSizeCount"));
    /// The memory layout of `pipelinePoolSizeCount`.
    public static final MemoryLayout LAYOUT_pipelinePoolSizeCount = LAYOUT.select(PathElement.groupElement("pipelinePoolSizeCount"));
    /// The [VarHandle] of `pipelinePoolSizeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelinePoolSizeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelinePoolSizeCount"));
    /// The byte offset of `pPipelinePoolSizes`.
    public static final long OFFSET_pPipelinePoolSizes = LAYOUT.byteOffset(PathElement.groupElement("pPipelinePoolSizes"));
    /// The memory layout of `pPipelinePoolSizes`.
    public static final MemoryLayout LAYOUT_pPipelinePoolSizes = LAYOUT.select(PathElement.groupElement("pPipelinePoolSizes"));
    /// The [VarHandle] of `pPipelinePoolSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPipelinePoolSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelinePoolSizes"));
    /// The byte offset of `semaphoreRequestCount`.
    public static final long OFFSET_semaphoreRequestCount = LAYOUT.byteOffset(PathElement.groupElement("semaphoreRequestCount"));
    /// The memory layout of `semaphoreRequestCount`.
    public static final MemoryLayout LAYOUT_semaphoreRequestCount = LAYOUT.select(PathElement.groupElement("semaphoreRequestCount"));
    /// The [VarHandle] of `semaphoreRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphoreRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreRequestCount"));
    /// The byte offset of `commandBufferRequestCount`.
    public static final long OFFSET_commandBufferRequestCount = LAYOUT.byteOffset(PathElement.groupElement("commandBufferRequestCount"));
    /// The memory layout of `commandBufferRequestCount`.
    public static final MemoryLayout LAYOUT_commandBufferRequestCount = LAYOUT.select(PathElement.groupElement("commandBufferRequestCount"));
    /// The [VarHandle] of `commandBufferRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandBufferRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferRequestCount"));
    /// The byte offset of `fenceRequestCount`.
    public static final long OFFSET_fenceRequestCount = LAYOUT.byteOffset(PathElement.groupElement("fenceRequestCount"));
    /// The memory layout of `fenceRequestCount`.
    public static final MemoryLayout LAYOUT_fenceRequestCount = LAYOUT.select(PathElement.groupElement("fenceRequestCount"));
    /// The [VarHandle] of `fenceRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fenceRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fenceRequestCount"));
    /// The byte offset of `deviceMemoryRequestCount`.
    public static final long OFFSET_deviceMemoryRequestCount = LAYOUT.byteOffset(PathElement.groupElement("deviceMemoryRequestCount"));
    /// The memory layout of `deviceMemoryRequestCount`.
    public static final MemoryLayout LAYOUT_deviceMemoryRequestCount = LAYOUT.select(PathElement.groupElement("deviceMemoryRequestCount"));
    /// The [VarHandle] of `deviceMemoryRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_deviceMemoryRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMemoryRequestCount"));
    /// The byte offset of `bufferRequestCount`.
    public static final long OFFSET_bufferRequestCount = LAYOUT.byteOffset(PathElement.groupElement("bufferRequestCount"));
    /// The memory layout of `bufferRequestCount`.
    public static final MemoryLayout LAYOUT_bufferRequestCount = LAYOUT.select(PathElement.groupElement("bufferRequestCount"));
    /// The [VarHandle] of `bufferRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferRequestCount"));
    /// The byte offset of `imageRequestCount`.
    public static final long OFFSET_imageRequestCount = LAYOUT.byteOffset(PathElement.groupElement("imageRequestCount"));
    /// The memory layout of `imageRequestCount`.
    public static final MemoryLayout LAYOUT_imageRequestCount = LAYOUT.select(PathElement.groupElement("imageRequestCount"));
    /// The [VarHandle] of `imageRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageRequestCount"));
    /// The byte offset of `eventRequestCount`.
    public static final long OFFSET_eventRequestCount = LAYOUT.byteOffset(PathElement.groupElement("eventRequestCount"));
    /// The memory layout of `eventRequestCount`.
    public static final MemoryLayout LAYOUT_eventRequestCount = LAYOUT.select(PathElement.groupElement("eventRequestCount"));
    /// The [VarHandle] of `eventRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_eventRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("eventRequestCount"));
    /// The byte offset of `queryPoolRequestCount`.
    public static final long OFFSET_queryPoolRequestCount = LAYOUT.byteOffset(PathElement.groupElement("queryPoolRequestCount"));
    /// The memory layout of `queryPoolRequestCount`.
    public static final MemoryLayout LAYOUT_queryPoolRequestCount = LAYOUT.select(PathElement.groupElement("queryPoolRequestCount"));
    /// The [VarHandle] of `queryPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queryPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryPoolRequestCount"));
    /// The byte offset of `bufferViewRequestCount`.
    public static final long OFFSET_bufferViewRequestCount = LAYOUT.byteOffset(PathElement.groupElement("bufferViewRequestCount"));
    /// The memory layout of `bufferViewRequestCount`.
    public static final MemoryLayout LAYOUT_bufferViewRequestCount = LAYOUT.select(PathElement.groupElement("bufferViewRequestCount"));
    /// The [VarHandle] of `bufferViewRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferViewRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferViewRequestCount"));
    /// The byte offset of `imageViewRequestCount`.
    public static final long OFFSET_imageViewRequestCount = LAYOUT.byteOffset(PathElement.groupElement("imageViewRequestCount"));
    /// The memory layout of `imageViewRequestCount`.
    public static final MemoryLayout LAYOUT_imageViewRequestCount = LAYOUT.select(PathElement.groupElement("imageViewRequestCount"));
    /// The [VarHandle] of `imageViewRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageViewRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewRequestCount"));
    /// The byte offset of `layeredImageViewRequestCount`.
    public static final long OFFSET_layeredImageViewRequestCount = LAYOUT.byteOffset(PathElement.groupElement("layeredImageViewRequestCount"));
    /// The memory layout of `layeredImageViewRequestCount`.
    public static final MemoryLayout LAYOUT_layeredImageViewRequestCount = LAYOUT.select(PathElement.groupElement("layeredImageViewRequestCount"));
    /// The [VarHandle] of `layeredImageViewRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_layeredImageViewRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredImageViewRequestCount"));
    /// The byte offset of `pipelineCacheRequestCount`.
    public static final long OFFSET_pipelineCacheRequestCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineCacheRequestCount"));
    /// The memory layout of `pipelineCacheRequestCount`.
    public static final MemoryLayout LAYOUT_pipelineCacheRequestCount = LAYOUT.select(PathElement.groupElement("pipelineCacheRequestCount"));
    /// The [VarHandle] of `pipelineCacheRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineCacheRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheRequestCount"));
    /// The byte offset of `pipelineLayoutRequestCount`.
    public static final long OFFSET_pipelineLayoutRequestCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineLayoutRequestCount"));
    /// The memory layout of `pipelineLayoutRequestCount`.
    public static final MemoryLayout LAYOUT_pipelineLayoutRequestCount = LAYOUT.select(PathElement.groupElement("pipelineLayoutRequestCount"));
    /// The [VarHandle] of `pipelineLayoutRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineLayoutRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayoutRequestCount"));
    /// The byte offset of `renderPassRequestCount`.
    public static final long OFFSET_renderPassRequestCount = LAYOUT.byteOffset(PathElement.groupElement("renderPassRequestCount"));
    /// The memory layout of `renderPassRequestCount`.
    public static final MemoryLayout LAYOUT_renderPassRequestCount = LAYOUT.select(PathElement.groupElement("renderPassRequestCount"));
    /// The [VarHandle] of `renderPassRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_renderPassRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPassRequestCount"));
    /// The byte offset of `graphicsPipelineRequestCount`.
    public static final long OFFSET_graphicsPipelineRequestCount = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineRequestCount"));
    /// The memory layout of `graphicsPipelineRequestCount`.
    public static final MemoryLayout LAYOUT_graphicsPipelineRequestCount = LAYOUT.select(PathElement.groupElement("graphicsPipelineRequestCount"));
    /// The [VarHandle] of `graphicsPipelineRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_graphicsPipelineRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineRequestCount"));
    /// The byte offset of `computePipelineRequestCount`.
    public static final long OFFSET_computePipelineRequestCount = LAYOUT.byteOffset(PathElement.groupElement("computePipelineRequestCount"));
    /// The memory layout of `computePipelineRequestCount`.
    public static final MemoryLayout LAYOUT_computePipelineRequestCount = LAYOUT.select(PathElement.groupElement("computePipelineRequestCount"));
    /// The [VarHandle] of `computePipelineRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_computePipelineRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computePipelineRequestCount"));
    /// The byte offset of `descriptorSetLayoutRequestCount`.
    public static final long OFFSET_descriptorSetLayoutRequestCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayoutRequestCount"));
    /// The memory layout of `descriptorSetLayoutRequestCount`.
    public static final MemoryLayout LAYOUT_descriptorSetLayoutRequestCount = LAYOUT.select(PathElement.groupElement("descriptorSetLayoutRequestCount"));
    /// The [VarHandle] of `descriptorSetLayoutRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetLayoutRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayoutRequestCount"));
    /// The byte offset of `samplerRequestCount`.
    public static final long OFFSET_samplerRequestCount = LAYOUT.byteOffset(PathElement.groupElement("samplerRequestCount"));
    /// The memory layout of `samplerRequestCount`.
    public static final MemoryLayout LAYOUT_samplerRequestCount = LAYOUT.select(PathElement.groupElement("samplerRequestCount"));
    /// The [VarHandle] of `samplerRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerRequestCount"));
    /// The byte offset of `descriptorPoolRequestCount`.
    public static final long OFFSET_descriptorPoolRequestCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorPoolRequestCount"));
    /// The memory layout of `descriptorPoolRequestCount`.
    public static final MemoryLayout LAYOUT_descriptorPoolRequestCount = LAYOUT.select(PathElement.groupElement("descriptorPoolRequestCount"));
    /// The [VarHandle] of `descriptorPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorPoolRequestCount"));
    /// The byte offset of `descriptorSetRequestCount`.
    public static final long OFFSET_descriptorSetRequestCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetRequestCount"));
    /// The memory layout of `descriptorSetRequestCount`.
    public static final MemoryLayout LAYOUT_descriptorSetRequestCount = LAYOUT.select(PathElement.groupElement("descriptorSetRequestCount"));
    /// The [VarHandle] of `descriptorSetRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetRequestCount"));
    /// The byte offset of `framebufferRequestCount`.
    public static final long OFFSET_framebufferRequestCount = LAYOUT.byteOffset(PathElement.groupElement("framebufferRequestCount"));
    /// The memory layout of `framebufferRequestCount`.
    public static final MemoryLayout LAYOUT_framebufferRequestCount = LAYOUT.select(PathElement.groupElement("framebufferRequestCount"));
    /// The [VarHandle] of `framebufferRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_framebufferRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferRequestCount"));
    /// The byte offset of `commandPoolRequestCount`.
    public static final long OFFSET_commandPoolRequestCount = LAYOUT.byteOffset(PathElement.groupElement("commandPoolRequestCount"));
    /// The memory layout of `commandPoolRequestCount`.
    public static final MemoryLayout LAYOUT_commandPoolRequestCount = LAYOUT.select(PathElement.groupElement("commandPoolRequestCount"));
    /// The [VarHandle] of `commandPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_commandPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolRequestCount"));
    /// The byte offset of `samplerYcbcrConversionRequestCount`.
    public static final long OFFSET_samplerYcbcrConversionRequestCount = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionRequestCount"));
    /// The memory layout of `samplerYcbcrConversionRequestCount`.
    public static final MemoryLayout LAYOUT_samplerYcbcrConversionRequestCount = LAYOUT.select(PathElement.groupElement("samplerYcbcrConversionRequestCount"));
    /// The [VarHandle] of `samplerYcbcrConversionRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samplerYcbcrConversionRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionRequestCount"));
    /// The byte offset of `surfaceRequestCount`.
    public static final long OFFSET_surfaceRequestCount = LAYOUT.byteOffset(PathElement.groupElement("surfaceRequestCount"));
    /// The memory layout of `surfaceRequestCount`.
    public static final MemoryLayout LAYOUT_surfaceRequestCount = LAYOUT.select(PathElement.groupElement("surfaceRequestCount"));
    /// The [VarHandle] of `surfaceRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_surfaceRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceRequestCount"));
    /// The byte offset of `swapchainRequestCount`.
    public static final long OFFSET_swapchainRequestCount = LAYOUT.byteOffset(PathElement.groupElement("swapchainRequestCount"));
    /// The memory layout of `swapchainRequestCount`.
    public static final MemoryLayout LAYOUT_swapchainRequestCount = LAYOUT.select(PathElement.groupElement("swapchainRequestCount"));
    /// The [VarHandle] of `swapchainRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapchainRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainRequestCount"));
    /// The byte offset of `displayModeRequestCount`.
    public static final long OFFSET_displayModeRequestCount = LAYOUT.byteOffset(PathElement.groupElement("displayModeRequestCount"));
    /// The memory layout of `displayModeRequestCount`.
    public static final MemoryLayout LAYOUT_displayModeRequestCount = LAYOUT.select(PathElement.groupElement("displayModeRequestCount"));
    /// The [VarHandle] of `displayModeRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_displayModeRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayModeRequestCount"));
    /// The byte offset of `subpassDescriptionRequestCount`.
    public static final long OFFSET_subpassDescriptionRequestCount = LAYOUT.byteOffset(PathElement.groupElement("subpassDescriptionRequestCount"));
    /// The memory layout of `subpassDescriptionRequestCount`.
    public static final MemoryLayout LAYOUT_subpassDescriptionRequestCount = LAYOUT.select(PathElement.groupElement("subpassDescriptionRequestCount"));
    /// The [VarHandle] of `subpassDescriptionRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_subpassDescriptionRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassDescriptionRequestCount"));
    /// The byte offset of `attachmentDescriptionRequestCount`.
    public static final long OFFSET_attachmentDescriptionRequestCount = LAYOUT.byteOffset(PathElement.groupElement("attachmentDescriptionRequestCount"));
    /// The memory layout of `attachmentDescriptionRequestCount`.
    public static final MemoryLayout LAYOUT_attachmentDescriptionRequestCount = LAYOUT.select(PathElement.groupElement("attachmentDescriptionRequestCount"));
    /// The [VarHandle] of `attachmentDescriptionRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_attachmentDescriptionRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentDescriptionRequestCount"));
    /// The byte offset of `descriptorSetLayoutBindingRequestCount`.
    public static final long OFFSET_descriptorSetLayoutBindingRequestCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayoutBindingRequestCount"));
    /// The memory layout of `descriptorSetLayoutBindingRequestCount`.
    public static final MemoryLayout LAYOUT_descriptorSetLayoutBindingRequestCount = LAYOUT.select(PathElement.groupElement("descriptorSetLayoutBindingRequestCount"));
    /// The [VarHandle] of `descriptorSetLayoutBindingRequestCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetLayoutBindingRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayoutBindingRequestCount"));
    /// The byte offset of `descriptorSetLayoutBindingLimit`.
    public static final long OFFSET_descriptorSetLayoutBindingLimit = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayoutBindingLimit"));
    /// The memory layout of `descriptorSetLayoutBindingLimit`.
    public static final MemoryLayout LAYOUT_descriptorSetLayoutBindingLimit = LAYOUT.select(PathElement.groupElement("descriptorSetLayoutBindingLimit"));
    /// The [VarHandle] of `descriptorSetLayoutBindingLimit` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorSetLayoutBindingLimit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayoutBindingLimit"));
    /// The byte offset of `maxImageViewMipLevels`.
    public static final long OFFSET_maxImageViewMipLevels = LAYOUT.byteOffset(PathElement.groupElement("maxImageViewMipLevels"));
    /// The memory layout of `maxImageViewMipLevels`.
    public static final MemoryLayout LAYOUT_maxImageViewMipLevels = LAYOUT.select(PathElement.groupElement("maxImageViewMipLevels"));
    /// The [VarHandle] of `maxImageViewMipLevels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxImageViewMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageViewMipLevels"));
    /// The byte offset of `maxImageViewArrayLayers`.
    public static final long OFFSET_maxImageViewArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxImageViewArrayLayers"));
    /// The memory layout of `maxImageViewArrayLayers`.
    public static final MemoryLayout LAYOUT_maxImageViewArrayLayers = LAYOUT.select(PathElement.groupElement("maxImageViewArrayLayers"));
    /// The [VarHandle] of `maxImageViewArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxImageViewArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageViewArrayLayers"));
    /// The byte offset of `maxLayeredImageViewMipLevels`.
    public static final long OFFSET_maxLayeredImageViewMipLevels = LAYOUT.byteOffset(PathElement.groupElement("maxLayeredImageViewMipLevels"));
    /// The memory layout of `maxLayeredImageViewMipLevels`.
    public static final MemoryLayout LAYOUT_maxLayeredImageViewMipLevels = LAYOUT.select(PathElement.groupElement("maxLayeredImageViewMipLevels"));
    /// The [VarHandle] of `maxLayeredImageViewMipLevels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxLayeredImageViewMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLayeredImageViewMipLevels"));
    /// The byte offset of `maxOcclusionQueriesPerPool`.
    public static final long OFFSET_maxOcclusionQueriesPerPool = LAYOUT.byteOffset(PathElement.groupElement("maxOcclusionQueriesPerPool"));
    /// The memory layout of `maxOcclusionQueriesPerPool`.
    public static final MemoryLayout LAYOUT_maxOcclusionQueriesPerPool = LAYOUT.select(PathElement.groupElement("maxOcclusionQueriesPerPool"));
    /// The [VarHandle] of `maxOcclusionQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxOcclusionQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOcclusionQueriesPerPool"));
    /// The byte offset of `maxPipelineStatisticsQueriesPerPool`.
    public static final long OFFSET_maxPipelineStatisticsQueriesPerPool = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineStatisticsQueriesPerPool"));
    /// The memory layout of `maxPipelineStatisticsQueriesPerPool`.
    public static final MemoryLayout LAYOUT_maxPipelineStatisticsQueriesPerPool = LAYOUT.select(PathElement.groupElement("maxPipelineStatisticsQueriesPerPool"));
    /// The [VarHandle] of `maxPipelineStatisticsQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPipelineStatisticsQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineStatisticsQueriesPerPool"));
    /// The byte offset of `maxTimestampQueriesPerPool`.
    public static final long OFFSET_maxTimestampQueriesPerPool = LAYOUT.byteOffset(PathElement.groupElement("maxTimestampQueriesPerPool"));
    /// The memory layout of `maxTimestampQueriesPerPool`.
    public static final MemoryLayout LAYOUT_maxTimestampQueriesPerPool = LAYOUT.select(PathElement.groupElement("maxTimestampQueriesPerPool"));
    /// The [VarHandle] of `maxTimestampQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxTimestampQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTimestampQueriesPerPool"));
    /// The byte offset of `maxImmutableSamplersPerDescriptorSetLayout`.
    public static final long OFFSET_maxImmutableSamplersPerDescriptorSetLayout = LAYOUT.byteOffset(PathElement.groupElement("maxImmutableSamplersPerDescriptorSetLayout"));
    /// The memory layout of `maxImmutableSamplersPerDescriptorSetLayout`.
    public static final MemoryLayout LAYOUT_maxImmutableSamplersPerDescriptorSetLayout = LAYOUT.select(PathElement.groupElement("maxImmutableSamplersPerDescriptorSetLayout"));
    /// The [VarHandle] of `maxImmutableSamplersPerDescriptorSetLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxImmutableSamplersPerDescriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImmutableSamplersPerDescriptorSetLayout"));

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDeviceObjectReservationCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceObjectReservationCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceObjectReservationCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceObjectReservationCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceObjectReservationCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceObjectReservationCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDeviceObjectReservationCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDeviceObjectReservationCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceObjectReservationCreateInfo`
    public static VkDeviceObjectReservationCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceObjectReservationCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDeviceObjectReservationCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceObjectReservationCreateInfo`
    public static VkDeviceObjectReservationCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceObjectReservationCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo copyFrom(VkDeviceObjectReservationCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDeviceObjectReservationCreateInfo reinterpret(long count) { return new VkDeviceObjectReservationCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pipelineCacheCreateInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineCacheCreateInfoCount(MemorySegment segment, long index) { return (int) VH_pipelineCacheCreateInfoCount.get(segment, 0L, index); }
    /// {@return `pipelineCacheCreateInfoCount`}
    public int pipelineCacheCreateInfoCount() { return pipelineCacheCreateInfoCount(this.segment(), 0L); }
    /// Sets `pipelineCacheCreateInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineCacheCreateInfoCount(MemorySegment segment, long index, int value) { VH_pipelineCacheCreateInfoCount.set(segment, 0L, index, value); }
    /// Sets `pipelineCacheCreateInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheCreateInfoCount(int value) { pipelineCacheCreateInfoCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelineCacheCreateInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelineCacheCreateInfos(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelineCacheCreateInfos.get(segment, 0L, index); }
    /// {@return `pPipelineCacheCreateInfos`}
    public MemorySegment pPipelineCacheCreateInfos() { return pPipelineCacheCreateInfos(this.segment(), 0L); }
    /// Sets `pPipelineCacheCreateInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelineCacheCreateInfos(MemorySegment segment, long index, MemorySegment value) { VH_pPipelineCacheCreateInfos.set(segment, 0L, index, value); }
    /// Sets `pPipelineCacheCreateInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelineCacheCreateInfos(MemorySegment value) { pPipelineCacheCreateInfos(this.segment(), 0L, value); return this; }

    /// {@return `pipelinePoolSizeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelinePoolSizeCount(MemorySegment segment, long index) { return (int) VH_pipelinePoolSizeCount.get(segment, 0L, index); }
    /// {@return `pipelinePoolSizeCount`}
    public int pipelinePoolSizeCount() { return pipelinePoolSizeCount(this.segment(), 0L); }
    /// Sets `pipelinePoolSizeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelinePoolSizeCount(MemorySegment segment, long index, int value) { VH_pipelinePoolSizeCount.set(segment, 0L, index, value); }
    /// Sets `pipelinePoolSizeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelinePoolSizeCount(int value) { pipelinePoolSizeCount(this.segment(), 0L, value); return this; }

    /// {@return `pPipelinePoolSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pPipelinePoolSizes(MemorySegment segment, long index) { return (MemorySegment) VH_pPipelinePoolSizes.get(segment, 0L, index); }
    /// {@return `pPipelinePoolSizes`}
    public MemorySegment pPipelinePoolSizes() { return pPipelinePoolSizes(this.segment(), 0L); }
    /// Sets `pPipelinePoolSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pPipelinePoolSizes(MemorySegment segment, long index, MemorySegment value) { VH_pPipelinePoolSizes.set(segment, 0L, index, value); }
    /// Sets `pPipelinePoolSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelinePoolSizes(MemorySegment value) { pPipelinePoolSizes(this.segment(), 0L, value); return this; }

    /// {@return `semaphoreRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int semaphoreRequestCount(MemorySegment segment, long index) { return (int) VH_semaphoreRequestCount.get(segment, 0L, index); }
    /// {@return `semaphoreRequestCount`}
    public int semaphoreRequestCount() { return semaphoreRequestCount(this.segment(), 0L); }
    /// Sets `semaphoreRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphoreRequestCount(MemorySegment segment, long index, int value) { VH_semaphoreRequestCount.set(segment, 0L, index, value); }
    /// Sets `semaphoreRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo semaphoreRequestCount(int value) { semaphoreRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `commandBufferRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandBufferRequestCount(MemorySegment segment, long index) { return (int) VH_commandBufferRequestCount.get(segment, 0L, index); }
    /// {@return `commandBufferRequestCount`}
    public int commandBufferRequestCount() { return commandBufferRequestCount(this.segment(), 0L); }
    /// Sets `commandBufferRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandBufferRequestCount(MemorySegment segment, long index, int value) { VH_commandBufferRequestCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandBufferRequestCount(int value) { commandBufferRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `fenceRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fenceRequestCount(MemorySegment segment, long index) { return (int) VH_fenceRequestCount.get(segment, 0L, index); }
    /// {@return `fenceRequestCount`}
    public int fenceRequestCount() { return fenceRequestCount(this.segment(), 0L); }
    /// Sets `fenceRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fenceRequestCount(MemorySegment segment, long index, int value) { VH_fenceRequestCount.set(segment, 0L, index, value); }
    /// Sets `fenceRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo fenceRequestCount(int value) { fenceRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `deviceMemoryRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int deviceMemoryRequestCount(MemorySegment segment, long index) { return (int) VH_deviceMemoryRequestCount.get(segment, 0L, index); }
    /// {@return `deviceMemoryRequestCount`}
    public int deviceMemoryRequestCount() { return deviceMemoryRequestCount(this.segment(), 0L); }
    /// Sets `deviceMemoryRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void deviceMemoryRequestCount(MemorySegment segment, long index, int value) { VH_deviceMemoryRequestCount.set(segment, 0L, index, value); }
    /// Sets `deviceMemoryRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo deviceMemoryRequestCount(int value) { deviceMemoryRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `bufferRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferRequestCount(MemorySegment segment, long index) { return (int) VH_bufferRequestCount.get(segment, 0L, index); }
    /// {@return `bufferRequestCount`}
    public int bufferRequestCount() { return bufferRequestCount(this.segment(), 0L); }
    /// Sets `bufferRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferRequestCount(MemorySegment segment, long index, int value) { VH_bufferRequestCount.set(segment, 0L, index, value); }
    /// Sets `bufferRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferRequestCount(int value) { bufferRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `imageRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageRequestCount(MemorySegment segment, long index) { return (int) VH_imageRequestCount.get(segment, 0L, index); }
    /// {@return `imageRequestCount`}
    public int imageRequestCount() { return imageRequestCount(this.segment(), 0L); }
    /// Sets `imageRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageRequestCount(MemorySegment segment, long index, int value) { VH_imageRequestCount.set(segment, 0L, index, value); }
    /// Sets `imageRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageRequestCount(int value) { imageRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `eventRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int eventRequestCount(MemorySegment segment, long index) { return (int) VH_eventRequestCount.get(segment, 0L, index); }
    /// {@return `eventRequestCount`}
    public int eventRequestCount() { return eventRequestCount(this.segment(), 0L); }
    /// Sets `eventRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void eventRequestCount(MemorySegment segment, long index, int value) { VH_eventRequestCount.set(segment, 0L, index, value); }
    /// Sets `eventRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo eventRequestCount(int value) { eventRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `queryPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queryPoolRequestCount(MemorySegment segment, long index) { return (int) VH_queryPoolRequestCount.get(segment, 0L, index); }
    /// {@return `queryPoolRequestCount`}
    public int queryPoolRequestCount() { return queryPoolRequestCount(this.segment(), 0L); }
    /// Sets `queryPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queryPoolRequestCount(MemorySegment segment, long index, int value) { VH_queryPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `queryPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo queryPoolRequestCount(int value) { queryPoolRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `bufferViewRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferViewRequestCount(MemorySegment segment, long index) { return (int) VH_bufferViewRequestCount.get(segment, 0L, index); }
    /// {@return `bufferViewRequestCount`}
    public int bufferViewRequestCount() { return bufferViewRequestCount(this.segment(), 0L); }
    /// Sets `bufferViewRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferViewRequestCount(MemorySegment segment, long index, int value) { VH_bufferViewRequestCount.set(segment, 0L, index, value); }
    /// Sets `bufferViewRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferViewRequestCount(int value) { bufferViewRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `imageViewRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageViewRequestCount(MemorySegment segment, long index) { return (int) VH_imageViewRequestCount.get(segment, 0L, index); }
    /// {@return `imageViewRequestCount`}
    public int imageViewRequestCount() { return imageViewRequestCount(this.segment(), 0L); }
    /// Sets `imageViewRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageViewRequestCount(MemorySegment segment, long index, int value) { VH_imageViewRequestCount.set(segment, 0L, index, value); }
    /// Sets `imageViewRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageViewRequestCount(int value) { imageViewRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `layeredImageViewRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int layeredImageViewRequestCount(MemorySegment segment, long index) { return (int) VH_layeredImageViewRequestCount.get(segment, 0L, index); }
    /// {@return `layeredImageViewRequestCount`}
    public int layeredImageViewRequestCount() { return layeredImageViewRequestCount(this.segment(), 0L); }
    /// Sets `layeredImageViewRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void layeredImageViewRequestCount(MemorySegment segment, long index, int value) { VH_layeredImageViewRequestCount.set(segment, 0L, index, value); }
    /// Sets `layeredImageViewRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo layeredImageViewRequestCount(int value) { layeredImageViewRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `pipelineCacheRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineCacheRequestCount(MemorySegment segment, long index) { return (int) VH_pipelineCacheRequestCount.get(segment, 0L, index); }
    /// {@return `pipelineCacheRequestCount`}
    public int pipelineCacheRequestCount() { return pipelineCacheRequestCount(this.segment(), 0L); }
    /// Sets `pipelineCacheRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineCacheRequestCount(MemorySegment segment, long index, int value) { VH_pipelineCacheRequestCount.set(segment, 0L, index, value); }
    /// Sets `pipelineCacheRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheRequestCount(int value) { pipelineCacheRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `pipelineLayoutRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineLayoutRequestCount(MemorySegment segment, long index) { return (int) VH_pipelineLayoutRequestCount.get(segment, 0L, index); }
    /// {@return `pipelineLayoutRequestCount`}
    public int pipelineLayoutRequestCount() { return pipelineLayoutRequestCount(this.segment(), 0L); }
    /// Sets `pipelineLayoutRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineLayoutRequestCount(MemorySegment segment, long index, int value) { VH_pipelineLayoutRequestCount.set(segment, 0L, index, value); }
    /// Sets `pipelineLayoutRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineLayoutRequestCount(int value) { pipelineLayoutRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `renderPassRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int renderPassRequestCount(MemorySegment segment, long index) { return (int) VH_renderPassRequestCount.get(segment, 0L, index); }
    /// {@return `renderPassRequestCount`}
    public int renderPassRequestCount() { return renderPassRequestCount(this.segment(), 0L); }
    /// Sets `renderPassRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void renderPassRequestCount(MemorySegment segment, long index, int value) { VH_renderPassRequestCount.set(segment, 0L, index, value); }
    /// Sets `renderPassRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo renderPassRequestCount(int value) { renderPassRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `graphicsPipelineRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int graphicsPipelineRequestCount(MemorySegment segment, long index) { return (int) VH_graphicsPipelineRequestCount.get(segment, 0L, index); }
    /// {@return `graphicsPipelineRequestCount`}
    public int graphicsPipelineRequestCount() { return graphicsPipelineRequestCount(this.segment(), 0L); }
    /// Sets `graphicsPipelineRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void graphicsPipelineRequestCount(MemorySegment segment, long index, int value) { VH_graphicsPipelineRequestCount.set(segment, 0L, index, value); }
    /// Sets `graphicsPipelineRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo graphicsPipelineRequestCount(int value) { graphicsPipelineRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `computePipelineRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int computePipelineRequestCount(MemorySegment segment, long index) { return (int) VH_computePipelineRequestCount.get(segment, 0L, index); }
    /// {@return `computePipelineRequestCount`}
    public int computePipelineRequestCount() { return computePipelineRequestCount(this.segment(), 0L); }
    /// Sets `computePipelineRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void computePipelineRequestCount(MemorySegment segment, long index, int value) { VH_computePipelineRequestCount.set(segment, 0L, index, value); }
    /// Sets `computePipelineRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo computePipelineRequestCount(int value) { computePipelineRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetLayoutRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetLayoutRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorSetLayoutRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorSetLayoutRequestCount`}
    public int descriptorSetLayoutRequestCount() { return descriptorSetLayoutRequestCount(this.segment(), 0L); }
    /// Sets `descriptorSetLayoutRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetLayoutRequestCount(MemorySegment segment, long index, int value) { VH_descriptorSetLayoutRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayoutRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutRequestCount(int value) { descriptorSetLayoutRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `samplerRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerRequestCount(MemorySegment segment, long index) { return (int) VH_samplerRequestCount.get(segment, 0L, index); }
    /// {@return `samplerRequestCount`}
    public int samplerRequestCount() { return samplerRequestCount(this.segment(), 0L); }
    /// Sets `samplerRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerRequestCount(MemorySegment segment, long index, int value) { VH_samplerRequestCount.set(segment, 0L, index, value); }
    /// Sets `samplerRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerRequestCount(int value) { samplerRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorPoolRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorPoolRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorPoolRequestCount`}
    public int descriptorPoolRequestCount() { return descriptorPoolRequestCount(this.segment(), 0L); }
    /// Sets `descriptorPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorPoolRequestCount(MemorySegment segment, long index, int value) { VH_descriptorPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorPoolRequestCount(int value) { descriptorPoolRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorSetRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorSetRequestCount`}
    public int descriptorSetRequestCount() { return descriptorSetRequestCount(this.segment(), 0L); }
    /// Sets `descriptorSetRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetRequestCount(MemorySegment segment, long index, int value) { VH_descriptorSetRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetRequestCount(int value) { descriptorSetRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `framebufferRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int framebufferRequestCount(MemorySegment segment, long index) { return (int) VH_framebufferRequestCount.get(segment, 0L, index); }
    /// {@return `framebufferRequestCount`}
    public int framebufferRequestCount() { return framebufferRequestCount(this.segment(), 0L); }
    /// Sets `framebufferRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void framebufferRequestCount(MemorySegment segment, long index, int value) { VH_framebufferRequestCount.set(segment, 0L, index, value); }
    /// Sets `framebufferRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo framebufferRequestCount(int value) { framebufferRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `commandPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int commandPoolRequestCount(MemorySegment segment, long index) { return (int) VH_commandPoolRequestCount.get(segment, 0L, index); }
    /// {@return `commandPoolRequestCount`}
    public int commandPoolRequestCount() { return commandPoolRequestCount(this.segment(), 0L); }
    /// Sets `commandPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void commandPoolRequestCount(MemorySegment segment, long index, int value) { VH_commandPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `commandPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandPoolRequestCount(int value) { commandPoolRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `samplerYcbcrConversionRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samplerYcbcrConversionRequestCount(MemorySegment segment, long index) { return (int) VH_samplerYcbcrConversionRequestCount.get(segment, 0L, index); }
    /// {@return `samplerYcbcrConversionRequestCount`}
    public int samplerYcbcrConversionRequestCount() { return samplerYcbcrConversionRequestCount(this.segment(), 0L); }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samplerYcbcrConversionRequestCount(MemorySegment segment, long index, int value) { VH_samplerYcbcrConversionRequestCount.set(segment, 0L, index, value); }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerYcbcrConversionRequestCount(int value) { samplerYcbcrConversionRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `surfaceRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int surfaceRequestCount(MemorySegment segment, long index) { return (int) VH_surfaceRequestCount.get(segment, 0L, index); }
    /// {@return `surfaceRequestCount`}
    public int surfaceRequestCount() { return surfaceRequestCount(this.segment(), 0L); }
    /// Sets `surfaceRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void surfaceRequestCount(MemorySegment segment, long index, int value) { VH_surfaceRequestCount.set(segment, 0L, index, value); }
    /// Sets `surfaceRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo surfaceRequestCount(int value) { surfaceRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `swapchainRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int swapchainRequestCount(MemorySegment segment, long index) { return (int) VH_swapchainRequestCount.get(segment, 0L, index); }
    /// {@return `swapchainRequestCount`}
    public int swapchainRequestCount() { return swapchainRequestCount(this.segment(), 0L); }
    /// Sets `swapchainRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapchainRequestCount(MemorySegment segment, long index, int value) { VH_swapchainRequestCount.set(segment, 0L, index, value); }
    /// Sets `swapchainRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo swapchainRequestCount(int value) { swapchainRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `displayModeRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int displayModeRequestCount(MemorySegment segment, long index) { return (int) VH_displayModeRequestCount.get(segment, 0L, index); }
    /// {@return `displayModeRequestCount`}
    public int displayModeRequestCount() { return displayModeRequestCount(this.segment(), 0L); }
    /// Sets `displayModeRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void displayModeRequestCount(MemorySegment segment, long index, int value) { VH_displayModeRequestCount.set(segment, 0L, index, value); }
    /// Sets `displayModeRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo displayModeRequestCount(int value) { displayModeRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `subpassDescriptionRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int subpassDescriptionRequestCount(MemorySegment segment, long index) { return (int) VH_subpassDescriptionRequestCount.get(segment, 0L, index); }
    /// {@return `subpassDescriptionRequestCount`}
    public int subpassDescriptionRequestCount() { return subpassDescriptionRequestCount(this.segment(), 0L); }
    /// Sets `subpassDescriptionRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void subpassDescriptionRequestCount(MemorySegment segment, long index, int value) { VH_subpassDescriptionRequestCount.set(segment, 0L, index, value); }
    /// Sets `subpassDescriptionRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo subpassDescriptionRequestCount(int value) { subpassDescriptionRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `attachmentDescriptionRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int attachmentDescriptionRequestCount(MemorySegment segment, long index) { return (int) VH_attachmentDescriptionRequestCount.get(segment, 0L, index); }
    /// {@return `attachmentDescriptionRequestCount`}
    public int attachmentDescriptionRequestCount() { return attachmentDescriptionRequestCount(this.segment(), 0L); }
    /// Sets `attachmentDescriptionRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void attachmentDescriptionRequestCount(MemorySegment segment, long index, int value) { VH_attachmentDescriptionRequestCount.set(segment, 0L, index, value); }
    /// Sets `attachmentDescriptionRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo attachmentDescriptionRequestCount(int value) { attachmentDescriptionRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetLayoutBindingRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetLayoutBindingRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorSetLayoutBindingRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorSetLayoutBindingRequestCount`}
    public int descriptorSetLayoutBindingRequestCount() { return descriptorSetLayoutBindingRequestCount(this.segment(), 0L); }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetLayoutBindingRequestCount(MemorySegment segment, long index, int value) { VH_descriptorSetLayoutBindingRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingRequestCount(int value) { descriptorSetLayoutBindingRequestCount(this.segment(), 0L, value); return this; }

    /// {@return `descriptorSetLayoutBindingLimit` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorSetLayoutBindingLimit(MemorySegment segment, long index) { return (int) VH_descriptorSetLayoutBindingLimit.get(segment, 0L, index); }
    /// {@return `descriptorSetLayoutBindingLimit`}
    public int descriptorSetLayoutBindingLimit() { return descriptorSetLayoutBindingLimit(this.segment(), 0L); }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorSetLayoutBindingLimit(MemorySegment segment, long index, int value) { VH_descriptorSetLayoutBindingLimit.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingLimit(int value) { descriptorSetLayoutBindingLimit(this.segment(), 0L, value); return this; }

    /// {@return `maxImageViewMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageViewMipLevels(MemorySegment segment, long index) { return (int) VH_maxImageViewMipLevels.get(segment, 0L, index); }
    /// {@return `maxImageViewMipLevels`}
    public int maxImageViewMipLevels() { return maxImageViewMipLevels(this.segment(), 0L); }
    /// Sets `maxImageViewMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageViewMipLevels(MemorySegment segment, long index, int value) { VH_maxImageViewMipLevels.set(segment, 0L, index, value); }
    /// Sets `maxImageViewMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewMipLevels(int value) { maxImageViewMipLevels(this.segment(), 0L, value); return this; }

    /// {@return `maxImageViewArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageViewArrayLayers(MemorySegment segment, long index) { return (int) VH_maxImageViewArrayLayers.get(segment, 0L, index); }
    /// {@return `maxImageViewArrayLayers`}
    public int maxImageViewArrayLayers() { return maxImageViewArrayLayers(this.segment(), 0L); }
    /// Sets `maxImageViewArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageViewArrayLayers(MemorySegment segment, long index, int value) { VH_maxImageViewArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxImageViewArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewArrayLayers(int value) { maxImageViewArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxLayeredImageViewMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxLayeredImageViewMipLevels(MemorySegment segment, long index) { return (int) VH_maxLayeredImageViewMipLevels.get(segment, 0L, index); }
    /// {@return `maxLayeredImageViewMipLevels`}
    public int maxLayeredImageViewMipLevels() { return maxLayeredImageViewMipLevels(this.segment(), 0L); }
    /// Sets `maxLayeredImageViewMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxLayeredImageViewMipLevels(MemorySegment segment, long index, int value) { VH_maxLayeredImageViewMipLevels.set(segment, 0L, index, value); }
    /// Sets `maxLayeredImageViewMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxLayeredImageViewMipLevels(int value) { maxLayeredImageViewMipLevels(this.segment(), 0L, value); return this; }

    /// {@return `maxOcclusionQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxOcclusionQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxOcclusionQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxOcclusionQueriesPerPool`}
    public int maxOcclusionQueriesPerPool() { return maxOcclusionQueriesPerPool(this.segment(), 0L); }
    /// Sets `maxOcclusionQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxOcclusionQueriesPerPool(MemorySegment segment, long index, int value) { VH_maxOcclusionQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxOcclusionQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxOcclusionQueriesPerPool(int value) { maxOcclusionQueriesPerPool(this.segment(), 0L, value); return this; }

    /// {@return `maxPipelineStatisticsQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPipelineStatisticsQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxPipelineStatisticsQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxPipelineStatisticsQueriesPerPool`}
    public int maxPipelineStatisticsQueriesPerPool() { return maxPipelineStatisticsQueriesPerPool(this.segment(), 0L); }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPipelineStatisticsQueriesPerPool(MemorySegment segment, long index, int value) { VH_maxPipelineStatisticsQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxPipelineStatisticsQueriesPerPool(int value) { maxPipelineStatisticsQueriesPerPool(this.segment(), 0L, value); return this; }

    /// {@return `maxTimestampQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxTimestampQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxTimestampQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxTimestampQueriesPerPool`}
    public int maxTimestampQueriesPerPool() { return maxTimestampQueriesPerPool(this.segment(), 0L); }
    /// Sets `maxTimestampQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxTimestampQueriesPerPool(MemorySegment segment, long index, int value) { VH_maxTimestampQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxTimestampQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxTimestampQueriesPerPool(int value) { maxTimestampQueriesPerPool(this.segment(), 0L, value); return this; }

    /// {@return `maxImmutableSamplersPerDescriptorSetLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImmutableSamplersPerDescriptorSetLayout(MemorySegment segment, long index) { return (int) VH_maxImmutableSamplersPerDescriptorSetLayout.get(segment, 0L, index); }
    /// {@return `maxImmutableSamplersPerDescriptorSetLayout`}
    public int maxImmutableSamplersPerDescriptorSetLayout() { return maxImmutableSamplersPerDescriptorSetLayout(this.segment(), 0L); }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImmutableSamplersPerDescriptorSetLayout(MemorySegment segment, long index, int value) { VH_maxImmutableSamplersPerDescriptorSetLayout.set(segment, 0L, index, value); }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImmutableSamplersPerDescriptorSetLayout(int value) { maxImmutableSamplersPerDescriptorSetLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDeviceObjectReservationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDeviceObjectReservationCreateInfo`
    public VkDeviceObjectReservationCreateInfo asSlice(long index) { return new VkDeviceObjectReservationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDeviceObjectReservationCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDeviceObjectReservationCreateInfo`
    public VkDeviceObjectReservationCreateInfo asSlice(long index, long count) { return new VkDeviceObjectReservationCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDeviceObjectReservationCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo at(long index, Consumer<VkDeviceObjectReservationCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pipelineCacheCreateInfoCount` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineCacheCreateInfoCountAt(long index) { return pipelineCacheCreateInfoCount(this.segment(), index); }
    /// Sets `pipelineCacheCreateInfoCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheCreateInfoCountAt(long index, int value) { pipelineCacheCreateInfoCount(this.segment(), index, value); return this; }

    /// {@return `pPipelineCacheCreateInfos` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPipelineCacheCreateInfosAt(long index) { return pPipelineCacheCreateInfos(this.segment(), index); }
    /// Sets `pPipelineCacheCreateInfos` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelineCacheCreateInfosAt(long index, MemorySegment value) { pPipelineCacheCreateInfos(this.segment(), index, value); return this; }

    /// {@return `pipelinePoolSizeCount` at the given index}
    /// @param index the index of the struct buffer
    public int pipelinePoolSizeCountAt(long index) { return pipelinePoolSizeCount(this.segment(), index); }
    /// Sets `pipelinePoolSizeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelinePoolSizeCountAt(long index, int value) { pipelinePoolSizeCount(this.segment(), index, value); return this; }

    /// {@return `pPipelinePoolSizes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pPipelinePoolSizesAt(long index) { return pPipelinePoolSizes(this.segment(), index); }
    /// Sets `pPipelinePoolSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelinePoolSizesAt(long index, MemorySegment value) { pPipelinePoolSizes(this.segment(), index, value); return this; }

    /// {@return `semaphoreRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int semaphoreRequestCountAt(long index) { return semaphoreRequestCount(this.segment(), index); }
    /// Sets `semaphoreRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo semaphoreRequestCountAt(long index, int value) { semaphoreRequestCount(this.segment(), index, value); return this; }

    /// {@return `commandBufferRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int commandBufferRequestCountAt(long index) { return commandBufferRequestCount(this.segment(), index); }
    /// Sets `commandBufferRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandBufferRequestCountAt(long index, int value) { commandBufferRequestCount(this.segment(), index, value); return this; }

    /// {@return `fenceRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int fenceRequestCountAt(long index) { return fenceRequestCount(this.segment(), index); }
    /// Sets `fenceRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo fenceRequestCountAt(long index, int value) { fenceRequestCount(this.segment(), index, value); return this; }

    /// {@return `deviceMemoryRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int deviceMemoryRequestCountAt(long index) { return deviceMemoryRequestCount(this.segment(), index); }
    /// Sets `deviceMemoryRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo deviceMemoryRequestCountAt(long index, int value) { deviceMemoryRequestCount(this.segment(), index, value); return this; }

    /// {@return `bufferRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int bufferRequestCountAt(long index) { return bufferRequestCount(this.segment(), index); }
    /// Sets `bufferRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferRequestCountAt(long index, int value) { bufferRequestCount(this.segment(), index, value); return this; }

    /// {@return `imageRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int imageRequestCountAt(long index) { return imageRequestCount(this.segment(), index); }
    /// Sets `imageRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageRequestCountAt(long index, int value) { imageRequestCount(this.segment(), index, value); return this; }

    /// {@return `eventRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int eventRequestCountAt(long index) { return eventRequestCount(this.segment(), index); }
    /// Sets `eventRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo eventRequestCountAt(long index, int value) { eventRequestCount(this.segment(), index, value); return this; }

    /// {@return `queryPoolRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int queryPoolRequestCountAt(long index) { return queryPoolRequestCount(this.segment(), index); }
    /// Sets `queryPoolRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo queryPoolRequestCountAt(long index, int value) { queryPoolRequestCount(this.segment(), index, value); return this; }

    /// {@return `bufferViewRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int bufferViewRequestCountAt(long index) { return bufferViewRequestCount(this.segment(), index); }
    /// Sets `bufferViewRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferViewRequestCountAt(long index, int value) { bufferViewRequestCount(this.segment(), index, value); return this; }

    /// {@return `imageViewRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int imageViewRequestCountAt(long index) { return imageViewRequestCount(this.segment(), index); }
    /// Sets `imageViewRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageViewRequestCountAt(long index, int value) { imageViewRequestCount(this.segment(), index, value); return this; }

    /// {@return `layeredImageViewRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int layeredImageViewRequestCountAt(long index) { return layeredImageViewRequestCount(this.segment(), index); }
    /// Sets `layeredImageViewRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo layeredImageViewRequestCountAt(long index, int value) { layeredImageViewRequestCount(this.segment(), index, value); return this; }

    /// {@return `pipelineCacheRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineCacheRequestCountAt(long index) { return pipelineCacheRequestCount(this.segment(), index); }
    /// Sets `pipelineCacheRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheRequestCountAt(long index, int value) { pipelineCacheRequestCount(this.segment(), index, value); return this; }

    /// {@return `pipelineLayoutRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int pipelineLayoutRequestCountAt(long index) { return pipelineLayoutRequestCount(this.segment(), index); }
    /// Sets `pipelineLayoutRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineLayoutRequestCountAt(long index, int value) { pipelineLayoutRequestCount(this.segment(), index, value); return this; }

    /// {@return `renderPassRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int renderPassRequestCountAt(long index) { return renderPassRequestCount(this.segment(), index); }
    /// Sets `renderPassRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo renderPassRequestCountAt(long index, int value) { renderPassRequestCount(this.segment(), index, value); return this; }

    /// {@return `graphicsPipelineRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int graphicsPipelineRequestCountAt(long index) { return graphicsPipelineRequestCount(this.segment(), index); }
    /// Sets `graphicsPipelineRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo graphicsPipelineRequestCountAt(long index, int value) { graphicsPipelineRequestCount(this.segment(), index, value); return this; }

    /// {@return `computePipelineRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int computePipelineRequestCountAt(long index) { return computePipelineRequestCount(this.segment(), index); }
    /// Sets `computePipelineRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo computePipelineRequestCountAt(long index, int value) { computePipelineRequestCount(this.segment(), index, value); return this; }

    /// {@return `descriptorSetLayoutRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetLayoutRequestCountAt(long index) { return descriptorSetLayoutRequestCount(this.segment(), index); }
    /// Sets `descriptorSetLayoutRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutRequestCountAt(long index, int value) { descriptorSetLayoutRequestCount(this.segment(), index, value); return this; }

    /// {@return `samplerRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int samplerRequestCountAt(long index) { return samplerRequestCount(this.segment(), index); }
    /// Sets `samplerRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerRequestCountAt(long index, int value) { samplerRequestCount(this.segment(), index, value); return this; }

    /// {@return `descriptorPoolRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorPoolRequestCountAt(long index) { return descriptorPoolRequestCount(this.segment(), index); }
    /// Sets `descriptorPoolRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorPoolRequestCountAt(long index, int value) { descriptorPoolRequestCount(this.segment(), index, value); return this; }

    /// {@return `descriptorSetRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetRequestCountAt(long index) { return descriptorSetRequestCount(this.segment(), index); }
    /// Sets `descriptorSetRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetRequestCountAt(long index, int value) { descriptorSetRequestCount(this.segment(), index, value); return this; }

    /// {@return `framebufferRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int framebufferRequestCountAt(long index) { return framebufferRequestCount(this.segment(), index); }
    /// Sets `framebufferRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo framebufferRequestCountAt(long index, int value) { framebufferRequestCount(this.segment(), index, value); return this; }

    /// {@return `commandPoolRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int commandPoolRequestCountAt(long index) { return commandPoolRequestCount(this.segment(), index); }
    /// Sets `commandPoolRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandPoolRequestCountAt(long index, int value) { commandPoolRequestCount(this.segment(), index, value); return this; }

    /// {@return `samplerYcbcrConversionRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int samplerYcbcrConversionRequestCountAt(long index) { return samplerYcbcrConversionRequestCount(this.segment(), index); }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerYcbcrConversionRequestCountAt(long index, int value) { samplerYcbcrConversionRequestCount(this.segment(), index, value); return this; }

    /// {@return `surfaceRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int surfaceRequestCountAt(long index) { return surfaceRequestCount(this.segment(), index); }
    /// Sets `surfaceRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo surfaceRequestCountAt(long index, int value) { surfaceRequestCount(this.segment(), index, value); return this; }

    /// {@return `swapchainRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int swapchainRequestCountAt(long index) { return swapchainRequestCount(this.segment(), index); }
    /// Sets `swapchainRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo swapchainRequestCountAt(long index, int value) { swapchainRequestCount(this.segment(), index, value); return this; }

    /// {@return `displayModeRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int displayModeRequestCountAt(long index) { return displayModeRequestCount(this.segment(), index); }
    /// Sets `displayModeRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo displayModeRequestCountAt(long index, int value) { displayModeRequestCount(this.segment(), index, value); return this; }

    /// {@return `subpassDescriptionRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int subpassDescriptionRequestCountAt(long index) { return subpassDescriptionRequestCount(this.segment(), index); }
    /// Sets `subpassDescriptionRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo subpassDescriptionRequestCountAt(long index, int value) { subpassDescriptionRequestCount(this.segment(), index, value); return this; }

    /// {@return `attachmentDescriptionRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int attachmentDescriptionRequestCountAt(long index) { return attachmentDescriptionRequestCount(this.segment(), index); }
    /// Sets `attachmentDescriptionRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo attachmentDescriptionRequestCountAt(long index, int value) { attachmentDescriptionRequestCount(this.segment(), index, value); return this; }

    /// {@return `descriptorSetLayoutBindingRequestCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetLayoutBindingRequestCountAt(long index) { return descriptorSetLayoutBindingRequestCount(this.segment(), index); }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingRequestCountAt(long index, int value) { descriptorSetLayoutBindingRequestCount(this.segment(), index, value); return this; }

    /// {@return `descriptorSetLayoutBindingLimit` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorSetLayoutBindingLimitAt(long index) { return descriptorSetLayoutBindingLimit(this.segment(), index); }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingLimitAt(long index, int value) { descriptorSetLayoutBindingLimit(this.segment(), index, value); return this; }

    /// {@return `maxImageViewMipLevels` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageViewMipLevelsAt(long index) { return maxImageViewMipLevels(this.segment(), index); }
    /// Sets `maxImageViewMipLevels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewMipLevelsAt(long index, int value) { maxImageViewMipLevels(this.segment(), index, value); return this; }

    /// {@return `maxImageViewArrayLayers` at the given index}
    /// @param index the index of the struct buffer
    public int maxImageViewArrayLayersAt(long index) { return maxImageViewArrayLayers(this.segment(), index); }
    /// Sets `maxImageViewArrayLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewArrayLayersAt(long index, int value) { maxImageViewArrayLayers(this.segment(), index, value); return this; }

    /// {@return `maxLayeredImageViewMipLevels` at the given index}
    /// @param index the index of the struct buffer
    public int maxLayeredImageViewMipLevelsAt(long index) { return maxLayeredImageViewMipLevels(this.segment(), index); }
    /// Sets `maxLayeredImageViewMipLevels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxLayeredImageViewMipLevelsAt(long index, int value) { maxLayeredImageViewMipLevels(this.segment(), index, value); return this; }

    /// {@return `maxOcclusionQueriesPerPool` at the given index}
    /// @param index the index of the struct buffer
    public int maxOcclusionQueriesPerPoolAt(long index) { return maxOcclusionQueriesPerPool(this.segment(), index); }
    /// Sets `maxOcclusionQueriesPerPool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxOcclusionQueriesPerPoolAt(long index, int value) { maxOcclusionQueriesPerPool(this.segment(), index, value); return this; }

    /// {@return `maxPipelineStatisticsQueriesPerPool` at the given index}
    /// @param index the index of the struct buffer
    public int maxPipelineStatisticsQueriesPerPoolAt(long index) { return maxPipelineStatisticsQueriesPerPool(this.segment(), index); }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxPipelineStatisticsQueriesPerPoolAt(long index, int value) { maxPipelineStatisticsQueriesPerPool(this.segment(), index, value); return this; }

    /// {@return `maxTimestampQueriesPerPool` at the given index}
    /// @param index the index of the struct buffer
    public int maxTimestampQueriesPerPoolAt(long index) { return maxTimestampQueriesPerPool(this.segment(), index); }
    /// Sets `maxTimestampQueriesPerPool` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxTimestampQueriesPerPoolAt(long index, int value) { maxTimestampQueriesPerPool(this.segment(), index, value); return this; }

    /// {@return `maxImmutableSamplersPerDescriptorSetLayout` at the given index}
    /// @param index the index of the struct buffer
    public int maxImmutableSamplersPerDescriptorSetLayoutAt(long index) { return maxImmutableSamplersPerDescriptorSetLayout(this.segment(), index); }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImmutableSamplersPerDescriptorSetLayoutAt(long index, int value) { maxImmutableSamplersPerDescriptorSetLayout(this.segment(), index, value); return this; }

}
