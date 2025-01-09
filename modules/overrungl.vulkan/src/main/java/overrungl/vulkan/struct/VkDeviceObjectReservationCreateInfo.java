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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### pipelineCacheCreateInfoCount
/// [VarHandle][#VH_pipelineCacheCreateInfoCount] - [Getter][#pipelineCacheCreateInfoCount()] - [Setter][#pipelineCacheCreateInfoCount(int)]
/// ### pPipelineCacheCreateInfos
/// [VarHandle][#VH_pPipelineCacheCreateInfos] - [Getter][#pPipelineCacheCreateInfos()] - [Setter][#pPipelineCacheCreateInfos(java.lang.foreign.MemorySegment)]
/// ### pipelinePoolSizeCount
/// [VarHandle][#VH_pipelinePoolSizeCount] - [Getter][#pipelinePoolSizeCount()] - [Setter][#pipelinePoolSizeCount(int)]
/// ### pPipelinePoolSizes
/// [VarHandle][#VH_pPipelinePoolSizes] - [Getter][#pPipelinePoolSizes()] - [Setter][#pPipelinePoolSizes(java.lang.foreign.MemorySegment)]
/// ### semaphoreRequestCount
/// [VarHandle][#VH_semaphoreRequestCount] - [Getter][#semaphoreRequestCount()] - [Setter][#semaphoreRequestCount(int)]
/// ### commandBufferRequestCount
/// [VarHandle][#VH_commandBufferRequestCount] - [Getter][#commandBufferRequestCount()] - [Setter][#commandBufferRequestCount(int)]
/// ### fenceRequestCount
/// [VarHandle][#VH_fenceRequestCount] - [Getter][#fenceRequestCount()] - [Setter][#fenceRequestCount(int)]
/// ### deviceMemoryRequestCount
/// [VarHandle][#VH_deviceMemoryRequestCount] - [Getter][#deviceMemoryRequestCount()] - [Setter][#deviceMemoryRequestCount(int)]
/// ### bufferRequestCount
/// [VarHandle][#VH_bufferRequestCount] - [Getter][#bufferRequestCount()] - [Setter][#bufferRequestCount(int)]
/// ### imageRequestCount
/// [VarHandle][#VH_imageRequestCount] - [Getter][#imageRequestCount()] - [Setter][#imageRequestCount(int)]
/// ### eventRequestCount
/// [VarHandle][#VH_eventRequestCount] - [Getter][#eventRequestCount()] - [Setter][#eventRequestCount(int)]
/// ### queryPoolRequestCount
/// [VarHandle][#VH_queryPoolRequestCount] - [Getter][#queryPoolRequestCount()] - [Setter][#queryPoolRequestCount(int)]
/// ### bufferViewRequestCount
/// [VarHandle][#VH_bufferViewRequestCount] - [Getter][#bufferViewRequestCount()] - [Setter][#bufferViewRequestCount(int)]
/// ### imageViewRequestCount
/// [VarHandle][#VH_imageViewRequestCount] - [Getter][#imageViewRequestCount()] - [Setter][#imageViewRequestCount(int)]
/// ### layeredImageViewRequestCount
/// [VarHandle][#VH_layeredImageViewRequestCount] - [Getter][#layeredImageViewRequestCount()] - [Setter][#layeredImageViewRequestCount(int)]
/// ### pipelineCacheRequestCount
/// [VarHandle][#VH_pipelineCacheRequestCount] - [Getter][#pipelineCacheRequestCount()] - [Setter][#pipelineCacheRequestCount(int)]
/// ### pipelineLayoutRequestCount
/// [VarHandle][#VH_pipelineLayoutRequestCount] - [Getter][#pipelineLayoutRequestCount()] - [Setter][#pipelineLayoutRequestCount(int)]
/// ### renderPassRequestCount
/// [VarHandle][#VH_renderPassRequestCount] - [Getter][#renderPassRequestCount()] - [Setter][#renderPassRequestCount(int)]
/// ### graphicsPipelineRequestCount
/// [VarHandle][#VH_graphicsPipelineRequestCount] - [Getter][#graphicsPipelineRequestCount()] - [Setter][#graphicsPipelineRequestCount(int)]
/// ### computePipelineRequestCount
/// [VarHandle][#VH_computePipelineRequestCount] - [Getter][#computePipelineRequestCount()] - [Setter][#computePipelineRequestCount(int)]
/// ### descriptorSetLayoutRequestCount
/// [VarHandle][#VH_descriptorSetLayoutRequestCount] - [Getter][#descriptorSetLayoutRequestCount()] - [Setter][#descriptorSetLayoutRequestCount(int)]
/// ### samplerRequestCount
/// [VarHandle][#VH_samplerRequestCount] - [Getter][#samplerRequestCount()] - [Setter][#samplerRequestCount(int)]
/// ### descriptorPoolRequestCount
/// [VarHandle][#VH_descriptorPoolRequestCount] - [Getter][#descriptorPoolRequestCount()] - [Setter][#descriptorPoolRequestCount(int)]
/// ### descriptorSetRequestCount
/// [VarHandle][#VH_descriptorSetRequestCount] - [Getter][#descriptorSetRequestCount()] - [Setter][#descriptorSetRequestCount(int)]
/// ### framebufferRequestCount
/// [VarHandle][#VH_framebufferRequestCount] - [Getter][#framebufferRequestCount()] - [Setter][#framebufferRequestCount(int)]
/// ### commandPoolRequestCount
/// [VarHandle][#VH_commandPoolRequestCount] - [Getter][#commandPoolRequestCount()] - [Setter][#commandPoolRequestCount(int)]
/// ### samplerYcbcrConversionRequestCount
/// [VarHandle][#VH_samplerYcbcrConversionRequestCount] - [Getter][#samplerYcbcrConversionRequestCount()] - [Setter][#samplerYcbcrConversionRequestCount(int)]
/// ### surfaceRequestCount
/// [VarHandle][#VH_surfaceRequestCount] - [Getter][#surfaceRequestCount()] - [Setter][#surfaceRequestCount(int)]
/// ### swapchainRequestCount
/// [VarHandle][#VH_swapchainRequestCount] - [Getter][#swapchainRequestCount()] - [Setter][#swapchainRequestCount(int)]
/// ### displayModeRequestCount
/// [VarHandle][#VH_displayModeRequestCount] - [Getter][#displayModeRequestCount()] - [Setter][#displayModeRequestCount(int)]
/// ### subpassDescriptionRequestCount
/// [VarHandle][#VH_subpassDescriptionRequestCount] - [Getter][#subpassDescriptionRequestCount()] - [Setter][#subpassDescriptionRequestCount(int)]
/// ### attachmentDescriptionRequestCount
/// [VarHandle][#VH_attachmentDescriptionRequestCount] - [Getter][#attachmentDescriptionRequestCount()] - [Setter][#attachmentDescriptionRequestCount(int)]
/// ### descriptorSetLayoutBindingRequestCount
/// [VarHandle][#VH_descriptorSetLayoutBindingRequestCount] - [Getter][#descriptorSetLayoutBindingRequestCount()] - [Setter][#descriptorSetLayoutBindingRequestCount(int)]
/// ### descriptorSetLayoutBindingLimit
/// [VarHandle][#VH_descriptorSetLayoutBindingLimit] - [Getter][#descriptorSetLayoutBindingLimit()] - [Setter][#descriptorSetLayoutBindingLimit(int)]
/// ### maxImageViewMipLevels
/// [VarHandle][#VH_maxImageViewMipLevels] - [Getter][#maxImageViewMipLevels()] - [Setter][#maxImageViewMipLevels(int)]
/// ### maxImageViewArrayLayers
/// [VarHandle][#VH_maxImageViewArrayLayers] - [Getter][#maxImageViewArrayLayers()] - [Setter][#maxImageViewArrayLayers(int)]
/// ### maxLayeredImageViewMipLevels
/// [VarHandle][#VH_maxLayeredImageViewMipLevels] - [Getter][#maxLayeredImageViewMipLevels()] - [Setter][#maxLayeredImageViewMipLevels(int)]
/// ### maxOcclusionQueriesPerPool
/// [VarHandle][#VH_maxOcclusionQueriesPerPool] - [Getter][#maxOcclusionQueriesPerPool()] - [Setter][#maxOcclusionQueriesPerPool(int)]
/// ### maxPipelineStatisticsQueriesPerPool
/// [VarHandle][#VH_maxPipelineStatisticsQueriesPerPool] - [Getter][#maxPipelineStatisticsQueriesPerPool()] - [Setter][#maxPipelineStatisticsQueriesPerPool(int)]
/// ### maxTimestampQueriesPerPool
/// [VarHandle][#VH_maxTimestampQueriesPerPool] - [Getter][#maxTimestampQueriesPerPool()] - [Setter][#maxTimestampQueriesPerPool(int)]
/// ### maxImmutableSamplersPerDescriptorSetLayout
/// [VarHandle][#VH_maxImmutableSamplersPerDescriptorSetLayout] - [Getter][#maxImmutableSamplersPerDescriptorSetLayout()] - [Setter][#maxImmutableSamplersPerDescriptorSetLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceObjectReservationCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t pipelineCacheCreateInfoCount;
///     const VkPipelineCacheCreateInfo * pPipelineCacheCreateInfos;
///     uint32_t pipelinePoolSizeCount;
///     const VkPipelinePoolSize * pPipelinePoolSizes;
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
/// } VkDeviceObjectReservationCreateInfo;
/// ```
public final class VkDeviceObjectReservationCreateInfo extends Struct {
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
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pipelineCacheCreateInfoCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineCacheCreateInfoCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheCreateInfoCount"));
    /// The [VarHandle] of `pPipelineCacheCreateInfos` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelineCacheCreateInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelineCacheCreateInfos"));
    /// The [VarHandle] of `pipelinePoolSizeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelinePoolSizeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelinePoolSizeCount"));
    /// The [VarHandle] of `pPipelinePoolSizes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPipelinePoolSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPipelinePoolSizes"));
    /// The [VarHandle] of `semaphoreRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_semaphoreRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreRequestCount"));
    /// The [VarHandle] of `commandBufferRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandBufferRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandBufferRequestCount"));
    /// The [VarHandle] of `fenceRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fenceRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fenceRequestCount"));
    /// The [VarHandle] of `deviceMemoryRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceMemoryRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMemoryRequestCount"));
    /// The [VarHandle] of `bufferRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferRequestCount"));
    /// The [VarHandle] of `imageRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageRequestCount"));
    /// The [VarHandle] of `eventRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_eventRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("eventRequestCount"));
    /// The [VarHandle] of `queryPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queryPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queryPoolRequestCount"));
    /// The [VarHandle] of `bufferViewRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bufferViewRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferViewRequestCount"));
    /// The [VarHandle] of `imageViewRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageViewRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageViewRequestCount"));
    /// The [VarHandle] of `layeredImageViewRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layeredImageViewRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layeredImageViewRequestCount"));
    /// The [VarHandle] of `pipelineCacheRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineCacheRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineCacheRequestCount"));
    /// The [VarHandle] of `pipelineLayoutRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_pipelineLayoutRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineLayoutRequestCount"));
    /// The [VarHandle] of `renderPassRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_renderPassRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("renderPassRequestCount"));
    /// The [VarHandle] of `graphicsPipelineRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_graphicsPipelineRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("graphicsPipelineRequestCount"));
    /// The [VarHandle] of `computePipelineRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_computePipelineRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("computePipelineRequestCount"));
    /// The [VarHandle] of `descriptorSetLayoutRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetLayoutRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayoutRequestCount"));
    /// The [VarHandle] of `samplerRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerRequestCount"));
    /// The [VarHandle] of `descriptorPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorPoolRequestCount"));
    /// The [VarHandle] of `descriptorSetRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetRequestCount"));
    /// The [VarHandle] of `framebufferRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framebufferRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferRequestCount"));
    /// The [VarHandle] of `commandPoolRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_commandPoolRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("commandPoolRequestCount"));
    /// The [VarHandle] of `samplerYcbcrConversionRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samplerYcbcrConversionRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samplerYcbcrConversionRequestCount"));
    /// The [VarHandle] of `surfaceRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_surfaceRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("surfaceRequestCount"));
    /// The [VarHandle] of `swapchainRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_swapchainRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainRequestCount"));
    /// The [VarHandle] of `displayModeRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_displayModeRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displayModeRequestCount"));
    /// The [VarHandle] of `subpassDescriptionRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subpassDescriptionRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subpassDescriptionRequestCount"));
    /// The [VarHandle] of `attachmentDescriptionRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachmentDescriptionRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachmentDescriptionRequestCount"));
    /// The [VarHandle] of `descriptorSetLayoutBindingRequestCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetLayoutBindingRequestCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayoutBindingRequestCount"));
    /// The [VarHandle] of `descriptorSetLayoutBindingLimit` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_descriptorSetLayoutBindingLimit = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorSetLayoutBindingLimit"));
    /// The [VarHandle] of `maxImageViewMipLevels` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageViewMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageViewMipLevels"));
    /// The [VarHandle] of `maxImageViewArrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageViewArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageViewArrayLayers"));
    /// The [VarHandle] of `maxLayeredImageViewMipLevels` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLayeredImageViewMipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLayeredImageViewMipLevels"));
    /// The [VarHandle] of `maxOcclusionQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxOcclusionQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOcclusionQueriesPerPool"));
    /// The [VarHandle] of `maxPipelineStatisticsQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPipelineStatisticsQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineStatisticsQueriesPerPool"));
    /// The [VarHandle] of `maxTimestampQueriesPerPool` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTimestampQueriesPerPool = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTimestampQueriesPerPool"));
    /// The [VarHandle] of `maxImmutableSamplersPerDescriptorSetLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImmutableSamplersPerDescriptorSetLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImmutableSamplersPerDescriptorSetLayout"));

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceObjectReservationCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceObjectReservationCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceObjectReservationCreateInfo(segment); }

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceObjectReservationCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceObjectReservationCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceObjectReservationCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceObjectReservationCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceObjectReservationCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceObjectReservationCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceObjectReservationCreateInfo`
    public static VkDeviceObjectReservationCreateInfo alloc(SegmentAllocator allocator) { return new VkDeviceObjectReservationCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceObjectReservationCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceObjectReservationCreateInfo`
    public static VkDeviceObjectReservationCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceObjectReservationCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceObjectReservationCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceObjectReservationCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceObjectReservationCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceObjectReservationCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo sType(@CType("VkStructureType") int value) { VkDeviceObjectReservationCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceObjectReservationCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `pipelineCacheCreateInfoCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineCacheCreateInfoCount(MemorySegment segment, long index) { return (int) VH_pipelineCacheCreateInfoCount.get(segment, 0L, index); }
    /// {@return `pipelineCacheCreateInfoCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineCacheCreateInfoCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pipelineCacheCreateInfoCount(segment, 0L); }
    /// {@return `pipelineCacheCreateInfoCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelineCacheCreateInfoCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pipelineCacheCreateInfoCount(this.segment(), index); }
    /// {@return `pipelineCacheCreateInfoCount`}
    public @CType("uint32_t") int pipelineCacheCreateInfoCount() { return VkDeviceObjectReservationCreateInfo.get_pipelineCacheCreateInfoCount(this.segment()); }
    /// Sets `pipelineCacheCreateInfoCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCacheCreateInfoCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineCacheCreateInfoCount.set(segment, 0L, index, value); }
    /// Sets `pipelineCacheCreateInfoCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCacheCreateInfoCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineCacheCreateInfoCount(segment, 0L, value); }
    /// Sets `pipelineCacheCreateInfoCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheCreateInfoCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineCacheCreateInfoCount(this.segment(), index, value); return this; }
    /// Sets `pipelineCacheCreateInfoCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheCreateInfoCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineCacheCreateInfoCount(this.segment(), value); return this; }

    /// {@return `pPipelineCacheCreateInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment get_pPipelineCacheCreateInfos(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelineCacheCreateInfos.get(segment, 0L, index); }
    /// {@return `pPipelineCacheCreateInfos`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment get_pPipelineCacheCreateInfos(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pPipelineCacheCreateInfos(segment, 0L); }
    /// {@return `pPipelineCacheCreateInfos` at the given index}
    /// @param index the index
    public @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment pPipelineCacheCreateInfosAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pPipelineCacheCreateInfos(this.segment(), index); }
    /// {@return `pPipelineCacheCreateInfos`}
    public @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment pPipelineCacheCreateInfos() { return VkDeviceObjectReservationCreateInfo.get_pPipelineCacheCreateInfos(this.segment()); }
    /// Sets `pPipelineCacheCreateInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelineCacheCreateInfos(MemorySegment segment, long index, @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment value) { VH_pPipelineCacheCreateInfos.set(segment, 0L, index, value); }
    /// Sets `pPipelineCacheCreateInfos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelineCacheCreateInfos(MemorySegment segment, @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pPipelineCacheCreateInfos(segment, 0L, value); }
    /// Sets `pPipelineCacheCreateInfos` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelineCacheCreateInfosAt(long index, @CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pPipelineCacheCreateInfos(this.segment(), index, value); return this; }
    /// Sets `pPipelineCacheCreateInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelineCacheCreateInfos(@CType("const VkPipelineCacheCreateInfo *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pPipelineCacheCreateInfos(this.segment(), value); return this; }

    /// {@return `pipelinePoolSizeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelinePoolSizeCount(MemorySegment segment, long index) { return (int) VH_pipelinePoolSizeCount.get(segment, 0L, index); }
    /// {@return `pipelinePoolSizeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelinePoolSizeCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pipelinePoolSizeCount(segment, 0L); }
    /// {@return `pipelinePoolSizeCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelinePoolSizeCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pipelinePoolSizeCount(this.segment(), index); }
    /// {@return `pipelinePoolSizeCount`}
    public @CType("uint32_t") int pipelinePoolSizeCount() { return VkDeviceObjectReservationCreateInfo.get_pipelinePoolSizeCount(this.segment()); }
    /// Sets `pipelinePoolSizeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelinePoolSizeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelinePoolSizeCount.set(segment, 0L, index, value); }
    /// Sets `pipelinePoolSizeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelinePoolSizeCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelinePoolSizeCount(segment, 0L, value); }
    /// Sets `pipelinePoolSizeCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelinePoolSizeCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelinePoolSizeCount(this.segment(), index, value); return this; }
    /// Sets `pipelinePoolSizeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelinePoolSizeCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelinePoolSizeCount(this.segment(), value); return this; }

    /// {@return `pPipelinePoolSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment get_pPipelinePoolSizes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPipelinePoolSizes.get(segment, 0L, index); }
    /// {@return `pPipelinePoolSizes`}
    /// @param segment the segment of the struct
    public static @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment get_pPipelinePoolSizes(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pPipelinePoolSizes(segment, 0L); }
    /// {@return `pPipelinePoolSizes` at the given index}
    /// @param index the index
    public @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment pPipelinePoolSizesAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pPipelinePoolSizes(this.segment(), index); }
    /// {@return `pPipelinePoolSizes`}
    public @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment pPipelinePoolSizes() { return VkDeviceObjectReservationCreateInfo.get_pPipelinePoolSizes(this.segment()); }
    /// Sets `pPipelinePoolSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPipelinePoolSizes(MemorySegment segment, long index, @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment value) { VH_pPipelinePoolSizes.set(segment, 0L, index, value); }
    /// Sets `pPipelinePoolSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPipelinePoolSizes(MemorySegment segment, @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pPipelinePoolSizes(segment, 0L, value); }
    /// Sets `pPipelinePoolSizes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelinePoolSizesAt(long index, @CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pPipelinePoolSizes(this.segment(), index, value); return this; }
    /// Sets `pPipelinePoolSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pPipelinePoolSizes(@CType("const VkPipelinePoolSize *") java.lang.foreign.MemorySegment value) { VkDeviceObjectReservationCreateInfo.set_pPipelinePoolSizes(this.segment(), value); return this; }

    /// {@return `semaphoreRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_semaphoreRequestCount(MemorySegment segment, long index) { return (int) VH_semaphoreRequestCount.get(segment, 0L, index); }
    /// {@return `semaphoreRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_semaphoreRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_semaphoreRequestCount(segment, 0L); }
    /// {@return `semaphoreRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int semaphoreRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_semaphoreRequestCount(this.segment(), index); }
    /// {@return `semaphoreRequestCount`}
    public @CType("uint32_t") int semaphoreRequestCount() { return VkDeviceObjectReservationCreateInfo.get_semaphoreRequestCount(this.segment()); }
    /// Sets `semaphoreRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphoreRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_semaphoreRequestCount.set(segment, 0L, index, value); }
    /// Sets `semaphoreRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphoreRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_semaphoreRequestCount(segment, 0L, value); }
    /// Sets `semaphoreRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo semaphoreRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_semaphoreRequestCount(this.segment(), index, value); return this; }
    /// Sets `semaphoreRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo semaphoreRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_semaphoreRequestCount(this.segment(), value); return this; }

    /// {@return `commandBufferRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandBufferRequestCount(MemorySegment segment, long index) { return (int) VH_commandBufferRequestCount.get(segment, 0L, index); }
    /// {@return `commandBufferRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandBufferRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_commandBufferRequestCount(segment, 0L); }
    /// {@return `commandBufferRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int commandBufferRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_commandBufferRequestCount(this.segment(), index); }
    /// {@return `commandBufferRequestCount`}
    public @CType("uint32_t") int commandBufferRequestCount() { return VkDeviceObjectReservationCreateInfo.get_commandBufferRequestCount(this.segment()); }
    /// Sets `commandBufferRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandBufferRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandBufferRequestCount.set(segment, 0L, index, value); }
    /// Sets `commandBufferRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandBufferRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_commandBufferRequestCount(segment, 0L, value); }
    /// Sets `commandBufferRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandBufferRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_commandBufferRequestCount(this.segment(), index, value); return this; }
    /// Sets `commandBufferRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandBufferRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_commandBufferRequestCount(this.segment(), value); return this; }

    /// {@return `fenceRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_fenceRequestCount(MemorySegment segment, long index) { return (int) VH_fenceRequestCount.get(segment, 0L, index); }
    /// {@return `fenceRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_fenceRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_fenceRequestCount(segment, 0L); }
    /// {@return `fenceRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int fenceRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_fenceRequestCount(this.segment(), index); }
    /// {@return `fenceRequestCount`}
    public @CType("uint32_t") int fenceRequestCount() { return VkDeviceObjectReservationCreateInfo.get_fenceRequestCount(this.segment()); }
    /// Sets `fenceRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fenceRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_fenceRequestCount.set(segment, 0L, index, value); }
    /// Sets `fenceRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fenceRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_fenceRequestCount(segment, 0L, value); }
    /// Sets `fenceRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo fenceRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_fenceRequestCount(this.segment(), index, value); return this; }
    /// Sets `fenceRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo fenceRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_fenceRequestCount(this.segment(), value); return this; }

    /// {@return `deviceMemoryRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceMemoryRequestCount(MemorySegment segment, long index) { return (int) VH_deviceMemoryRequestCount.get(segment, 0L, index); }
    /// {@return `deviceMemoryRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceMemoryRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_deviceMemoryRequestCount(segment, 0L); }
    /// {@return `deviceMemoryRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceMemoryRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_deviceMemoryRequestCount(this.segment(), index); }
    /// {@return `deviceMemoryRequestCount`}
    public @CType("uint32_t") int deviceMemoryRequestCount() { return VkDeviceObjectReservationCreateInfo.get_deviceMemoryRequestCount(this.segment()); }
    /// Sets `deviceMemoryRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceMemoryRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceMemoryRequestCount.set(segment, 0L, index, value); }
    /// Sets `deviceMemoryRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceMemoryRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_deviceMemoryRequestCount(segment, 0L, value); }
    /// Sets `deviceMemoryRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo deviceMemoryRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_deviceMemoryRequestCount(this.segment(), index, value); return this; }
    /// Sets `deviceMemoryRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo deviceMemoryRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_deviceMemoryRequestCount(this.segment(), value); return this; }

    /// {@return `bufferRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferRequestCount(MemorySegment segment, long index) { return (int) VH_bufferRequestCount.get(segment, 0L, index); }
    /// {@return `bufferRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_bufferRequestCount(segment, 0L); }
    /// {@return `bufferRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bufferRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_bufferRequestCount(this.segment(), index); }
    /// {@return `bufferRequestCount`}
    public @CType("uint32_t") int bufferRequestCount() { return VkDeviceObjectReservationCreateInfo.get_bufferRequestCount(this.segment()); }
    /// Sets `bufferRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferRequestCount.set(segment, 0L, index, value); }
    /// Sets `bufferRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_bufferRequestCount(segment, 0L, value); }
    /// Sets `bufferRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_bufferRequestCount(this.segment(), index, value); return this; }
    /// Sets `bufferRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_bufferRequestCount(this.segment(), value); return this; }

    /// {@return `imageRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageRequestCount(MemorySegment segment, long index) { return (int) VH_imageRequestCount.get(segment, 0L, index); }
    /// {@return `imageRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_imageRequestCount(segment, 0L); }
    /// {@return `imageRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int imageRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_imageRequestCount(this.segment(), index); }
    /// {@return `imageRequestCount`}
    public @CType("uint32_t") int imageRequestCount() { return VkDeviceObjectReservationCreateInfo.get_imageRequestCount(this.segment()); }
    /// Sets `imageRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageRequestCount.set(segment, 0L, index, value); }
    /// Sets `imageRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_imageRequestCount(segment, 0L, value); }
    /// Sets `imageRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_imageRequestCount(this.segment(), index, value); return this; }
    /// Sets `imageRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_imageRequestCount(this.segment(), value); return this; }

    /// {@return `eventRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_eventRequestCount(MemorySegment segment, long index) { return (int) VH_eventRequestCount.get(segment, 0L, index); }
    /// {@return `eventRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_eventRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_eventRequestCount(segment, 0L); }
    /// {@return `eventRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int eventRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_eventRequestCount(this.segment(), index); }
    /// {@return `eventRequestCount`}
    public @CType("uint32_t") int eventRequestCount() { return VkDeviceObjectReservationCreateInfo.get_eventRequestCount(this.segment()); }
    /// Sets `eventRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_eventRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_eventRequestCount.set(segment, 0L, index, value); }
    /// Sets `eventRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_eventRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_eventRequestCount(segment, 0L, value); }
    /// Sets `eventRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo eventRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_eventRequestCount(this.segment(), index, value); return this; }
    /// Sets `eventRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo eventRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_eventRequestCount(this.segment(), value); return this; }

    /// {@return `queryPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queryPoolRequestCount(MemorySegment segment, long index) { return (int) VH_queryPoolRequestCount.get(segment, 0L, index); }
    /// {@return `queryPoolRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queryPoolRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_queryPoolRequestCount(segment, 0L); }
    /// {@return `queryPoolRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queryPoolRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_queryPoolRequestCount(this.segment(), index); }
    /// {@return `queryPoolRequestCount`}
    public @CType("uint32_t") int queryPoolRequestCount() { return VkDeviceObjectReservationCreateInfo.get_queryPoolRequestCount(this.segment()); }
    /// Sets `queryPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queryPoolRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queryPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `queryPoolRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queryPoolRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_queryPoolRequestCount(segment, 0L, value); }
    /// Sets `queryPoolRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo queryPoolRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_queryPoolRequestCount(this.segment(), index, value); return this; }
    /// Sets `queryPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo queryPoolRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_queryPoolRequestCount(this.segment(), value); return this; }

    /// {@return `bufferViewRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bufferViewRequestCount(MemorySegment segment, long index) { return (int) VH_bufferViewRequestCount.get(segment, 0L, index); }
    /// {@return `bufferViewRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bufferViewRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_bufferViewRequestCount(segment, 0L); }
    /// {@return `bufferViewRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bufferViewRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_bufferViewRequestCount(this.segment(), index); }
    /// {@return `bufferViewRequestCount`}
    public @CType("uint32_t") int bufferViewRequestCount() { return VkDeviceObjectReservationCreateInfo.get_bufferViewRequestCount(this.segment()); }
    /// Sets `bufferViewRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferViewRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bufferViewRequestCount.set(segment, 0L, index, value); }
    /// Sets `bufferViewRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferViewRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_bufferViewRequestCount(segment, 0L, value); }
    /// Sets `bufferViewRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferViewRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_bufferViewRequestCount(this.segment(), index, value); return this; }
    /// Sets `bufferViewRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo bufferViewRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_bufferViewRequestCount(this.segment(), value); return this; }

    /// {@return `imageViewRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_imageViewRequestCount(MemorySegment segment, long index) { return (int) VH_imageViewRequestCount.get(segment, 0L, index); }
    /// {@return `imageViewRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_imageViewRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_imageViewRequestCount(segment, 0L); }
    /// {@return `imageViewRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int imageViewRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_imageViewRequestCount(this.segment(), index); }
    /// {@return `imageViewRequestCount`}
    public @CType("uint32_t") int imageViewRequestCount() { return VkDeviceObjectReservationCreateInfo.get_imageViewRequestCount(this.segment()); }
    /// Sets `imageViewRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageViewRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_imageViewRequestCount.set(segment, 0L, index, value); }
    /// Sets `imageViewRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageViewRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_imageViewRequestCount(segment, 0L, value); }
    /// Sets `imageViewRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageViewRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_imageViewRequestCount(this.segment(), index, value); return this; }
    /// Sets `imageViewRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo imageViewRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_imageViewRequestCount(this.segment(), value); return this; }

    /// {@return `layeredImageViewRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layeredImageViewRequestCount(MemorySegment segment, long index) { return (int) VH_layeredImageViewRequestCount.get(segment, 0L, index); }
    /// {@return `layeredImageViewRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layeredImageViewRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_layeredImageViewRequestCount(segment, 0L); }
    /// {@return `layeredImageViewRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layeredImageViewRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_layeredImageViewRequestCount(this.segment(), index); }
    /// {@return `layeredImageViewRequestCount`}
    public @CType("uint32_t") int layeredImageViewRequestCount() { return VkDeviceObjectReservationCreateInfo.get_layeredImageViewRequestCount(this.segment()); }
    /// Sets `layeredImageViewRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layeredImageViewRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layeredImageViewRequestCount.set(segment, 0L, index, value); }
    /// Sets `layeredImageViewRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layeredImageViewRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_layeredImageViewRequestCount(segment, 0L, value); }
    /// Sets `layeredImageViewRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo layeredImageViewRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_layeredImageViewRequestCount(this.segment(), index, value); return this; }
    /// Sets `layeredImageViewRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo layeredImageViewRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_layeredImageViewRequestCount(this.segment(), value); return this; }

    /// {@return `pipelineCacheRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineCacheRequestCount(MemorySegment segment, long index) { return (int) VH_pipelineCacheRequestCount.get(segment, 0L, index); }
    /// {@return `pipelineCacheRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineCacheRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pipelineCacheRequestCount(segment, 0L); }
    /// {@return `pipelineCacheRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelineCacheRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pipelineCacheRequestCount(this.segment(), index); }
    /// {@return `pipelineCacheRequestCount`}
    public @CType("uint32_t") int pipelineCacheRequestCount() { return VkDeviceObjectReservationCreateInfo.get_pipelineCacheRequestCount(this.segment()); }
    /// Sets `pipelineCacheRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineCacheRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineCacheRequestCount.set(segment, 0L, index, value); }
    /// Sets `pipelineCacheRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineCacheRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineCacheRequestCount(segment, 0L, value); }
    /// Sets `pipelineCacheRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineCacheRequestCount(this.segment(), index, value); return this; }
    /// Sets `pipelineCacheRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineCacheRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineCacheRequestCount(this.segment(), value); return this; }

    /// {@return `pipelineLayoutRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_pipelineLayoutRequestCount(MemorySegment segment, long index) { return (int) VH_pipelineLayoutRequestCount.get(segment, 0L, index); }
    /// {@return `pipelineLayoutRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_pipelineLayoutRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_pipelineLayoutRequestCount(segment, 0L); }
    /// {@return `pipelineLayoutRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int pipelineLayoutRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_pipelineLayoutRequestCount(this.segment(), index); }
    /// {@return `pipelineLayoutRequestCount`}
    public @CType("uint32_t") int pipelineLayoutRequestCount() { return VkDeviceObjectReservationCreateInfo.get_pipelineLayoutRequestCount(this.segment()); }
    /// Sets `pipelineLayoutRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pipelineLayoutRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_pipelineLayoutRequestCount.set(segment, 0L, index, value); }
    /// Sets `pipelineLayoutRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pipelineLayoutRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineLayoutRequestCount(segment, 0L, value); }
    /// Sets `pipelineLayoutRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineLayoutRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineLayoutRequestCount(this.segment(), index, value); return this; }
    /// Sets `pipelineLayoutRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo pipelineLayoutRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_pipelineLayoutRequestCount(this.segment(), value); return this; }

    /// {@return `renderPassRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_renderPassRequestCount(MemorySegment segment, long index) { return (int) VH_renderPassRequestCount.get(segment, 0L, index); }
    /// {@return `renderPassRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_renderPassRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_renderPassRequestCount(segment, 0L); }
    /// {@return `renderPassRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int renderPassRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_renderPassRequestCount(this.segment(), index); }
    /// {@return `renderPassRequestCount`}
    public @CType("uint32_t") int renderPassRequestCount() { return VkDeviceObjectReservationCreateInfo.get_renderPassRequestCount(this.segment()); }
    /// Sets `renderPassRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_renderPassRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_renderPassRequestCount.set(segment, 0L, index, value); }
    /// Sets `renderPassRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_renderPassRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_renderPassRequestCount(segment, 0L, value); }
    /// Sets `renderPassRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo renderPassRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_renderPassRequestCount(this.segment(), index, value); return this; }
    /// Sets `renderPassRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo renderPassRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_renderPassRequestCount(this.segment(), value); return this; }

    /// {@return `graphicsPipelineRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_graphicsPipelineRequestCount(MemorySegment segment, long index) { return (int) VH_graphicsPipelineRequestCount.get(segment, 0L, index); }
    /// {@return `graphicsPipelineRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_graphicsPipelineRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_graphicsPipelineRequestCount(segment, 0L); }
    /// {@return `graphicsPipelineRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int graphicsPipelineRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_graphicsPipelineRequestCount(this.segment(), index); }
    /// {@return `graphicsPipelineRequestCount`}
    public @CType("uint32_t") int graphicsPipelineRequestCount() { return VkDeviceObjectReservationCreateInfo.get_graphicsPipelineRequestCount(this.segment()); }
    /// Sets `graphicsPipelineRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_graphicsPipelineRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_graphicsPipelineRequestCount.set(segment, 0L, index, value); }
    /// Sets `graphicsPipelineRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_graphicsPipelineRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_graphicsPipelineRequestCount(segment, 0L, value); }
    /// Sets `graphicsPipelineRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo graphicsPipelineRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_graphicsPipelineRequestCount(this.segment(), index, value); return this; }
    /// Sets `graphicsPipelineRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo graphicsPipelineRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_graphicsPipelineRequestCount(this.segment(), value); return this; }

    /// {@return `computePipelineRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_computePipelineRequestCount(MemorySegment segment, long index) { return (int) VH_computePipelineRequestCount.get(segment, 0L, index); }
    /// {@return `computePipelineRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_computePipelineRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_computePipelineRequestCount(segment, 0L); }
    /// {@return `computePipelineRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int computePipelineRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_computePipelineRequestCount(this.segment(), index); }
    /// {@return `computePipelineRequestCount`}
    public @CType("uint32_t") int computePipelineRequestCount() { return VkDeviceObjectReservationCreateInfo.get_computePipelineRequestCount(this.segment()); }
    /// Sets `computePipelineRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_computePipelineRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_computePipelineRequestCount.set(segment, 0L, index, value); }
    /// Sets `computePipelineRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_computePipelineRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_computePipelineRequestCount(segment, 0L, value); }
    /// Sets `computePipelineRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo computePipelineRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_computePipelineRequestCount(this.segment(), index, value); return this; }
    /// Sets `computePipelineRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo computePipelineRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_computePipelineRequestCount(this.segment(), value); return this; }

    /// {@return `descriptorSetLayoutRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetLayoutRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorSetLayoutRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorSetLayoutRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetLayoutRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutRequestCount(segment, 0L); }
    /// {@return `descriptorSetLayoutRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorSetLayoutRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutRequestCount(this.segment(), index); }
    /// {@return `descriptorSetLayoutRequestCount`}
    public @CType("uint32_t") int descriptorSetLayoutRequestCount() { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutRequestCount(this.segment()); }
    /// Sets `descriptorSetLayoutRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetLayoutRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetLayoutRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayoutRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetLayoutRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutRequestCount(segment, 0L, value); }
    /// Sets `descriptorSetLayoutRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutRequestCount(this.segment(), index, value); return this; }
    /// Sets `descriptorSetLayoutRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutRequestCount(this.segment(), value); return this; }

    /// {@return `samplerRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_samplerRequestCount(MemorySegment segment, long index) { return (int) VH_samplerRequestCount.get(segment, 0L, index); }
    /// {@return `samplerRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_samplerRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_samplerRequestCount(segment, 0L); }
    /// {@return `samplerRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int samplerRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_samplerRequestCount(this.segment(), index); }
    /// {@return `samplerRequestCount`}
    public @CType("uint32_t") int samplerRequestCount() { return VkDeviceObjectReservationCreateInfo.get_samplerRequestCount(this.segment()); }
    /// Sets `samplerRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_samplerRequestCount.set(segment, 0L, index, value); }
    /// Sets `samplerRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_samplerRequestCount(segment, 0L, value); }
    /// Sets `samplerRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_samplerRequestCount(this.segment(), index, value); return this; }
    /// Sets `samplerRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_samplerRequestCount(this.segment(), value); return this; }

    /// {@return `descriptorPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorPoolRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorPoolRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorPoolRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorPoolRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_descriptorPoolRequestCount(segment, 0L); }
    /// {@return `descriptorPoolRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorPoolRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_descriptorPoolRequestCount(this.segment(), index); }
    /// {@return `descriptorPoolRequestCount`}
    public @CType("uint32_t") int descriptorPoolRequestCount() { return VkDeviceObjectReservationCreateInfo.get_descriptorPoolRequestCount(this.segment()); }
    /// Sets `descriptorPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorPoolRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorPoolRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorPoolRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorPoolRequestCount(segment, 0L, value); }
    /// Sets `descriptorPoolRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorPoolRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorPoolRequestCount(this.segment(), index, value); return this; }
    /// Sets `descriptorPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorPoolRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorPoolRequestCount(this.segment(), value); return this; }

    /// {@return `descriptorSetRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorSetRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorSetRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetRequestCount(segment, 0L); }
    /// {@return `descriptorSetRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorSetRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetRequestCount(this.segment(), index); }
    /// {@return `descriptorSetRequestCount`}
    public @CType("uint32_t") int descriptorSetRequestCount() { return VkDeviceObjectReservationCreateInfo.get_descriptorSetRequestCount(this.segment()); }
    /// Sets `descriptorSetRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetRequestCount(segment, 0L, value); }
    /// Sets `descriptorSetRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetRequestCount(this.segment(), index, value); return this; }
    /// Sets `descriptorSetRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetRequestCount(this.segment(), value); return this; }

    /// {@return `framebufferRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_framebufferRequestCount(MemorySegment segment, long index) { return (int) VH_framebufferRequestCount.get(segment, 0L, index); }
    /// {@return `framebufferRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_framebufferRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_framebufferRequestCount(segment, 0L); }
    /// {@return `framebufferRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int framebufferRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_framebufferRequestCount(this.segment(), index); }
    /// {@return `framebufferRequestCount`}
    public @CType("uint32_t") int framebufferRequestCount() { return VkDeviceObjectReservationCreateInfo.get_framebufferRequestCount(this.segment()); }
    /// Sets `framebufferRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebufferRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_framebufferRequestCount.set(segment, 0L, index, value); }
    /// Sets `framebufferRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebufferRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_framebufferRequestCount(segment, 0L, value); }
    /// Sets `framebufferRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo framebufferRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_framebufferRequestCount(this.segment(), index, value); return this; }
    /// Sets `framebufferRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo framebufferRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_framebufferRequestCount(this.segment(), value); return this; }

    /// {@return `commandPoolRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_commandPoolRequestCount(MemorySegment segment, long index) { return (int) VH_commandPoolRequestCount.get(segment, 0L, index); }
    /// {@return `commandPoolRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_commandPoolRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_commandPoolRequestCount(segment, 0L); }
    /// {@return `commandPoolRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int commandPoolRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_commandPoolRequestCount(this.segment(), index); }
    /// {@return `commandPoolRequestCount`}
    public @CType("uint32_t") int commandPoolRequestCount() { return VkDeviceObjectReservationCreateInfo.get_commandPoolRequestCount(this.segment()); }
    /// Sets `commandPoolRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_commandPoolRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_commandPoolRequestCount.set(segment, 0L, index, value); }
    /// Sets `commandPoolRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_commandPoolRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_commandPoolRequestCount(segment, 0L, value); }
    /// Sets `commandPoolRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandPoolRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_commandPoolRequestCount(this.segment(), index, value); return this; }
    /// Sets `commandPoolRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo commandPoolRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_commandPoolRequestCount(this.segment(), value); return this; }

    /// {@return `samplerYcbcrConversionRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_samplerYcbcrConversionRequestCount(MemorySegment segment, long index) { return (int) VH_samplerYcbcrConversionRequestCount.get(segment, 0L, index); }
    /// {@return `samplerYcbcrConversionRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_samplerYcbcrConversionRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_samplerYcbcrConversionRequestCount(segment, 0L); }
    /// {@return `samplerYcbcrConversionRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int samplerYcbcrConversionRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_samplerYcbcrConversionRequestCount(this.segment(), index); }
    /// {@return `samplerYcbcrConversionRequestCount`}
    public @CType("uint32_t") int samplerYcbcrConversionRequestCount() { return VkDeviceObjectReservationCreateInfo.get_samplerYcbcrConversionRequestCount(this.segment()); }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samplerYcbcrConversionRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_samplerYcbcrConversionRequestCount.set(segment, 0L, index, value); }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samplerYcbcrConversionRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_samplerYcbcrConversionRequestCount(segment, 0L, value); }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerYcbcrConversionRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_samplerYcbcrConversionRequestCount(this.segment(), index, value); return this; }
    /// Sets `samplerYcbcrConversionRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo samplerYcbcrConversionRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_samplerYcbcrConversionRequestCount(this.segment(), value); return this; }

    /// {@return `surfaceRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_surfaceRequestCount(MemorySegment segment, long index) { return (int) VH_surfaceRequestCount.get(segment, 0L, index); }
    /// {@return `surfaceRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_surfaceRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_surfaceRequestCount(segment, 0L); }
    /// {@return `surfaceRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int surfaceRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_surfaceRequestCount(this.segment(), index); }
    /// {@return `surfaceRequestCount`}
    public @CType("uint32_t") int surfaceRequestCount() { return VkDeviceObjectReservationCreateInfo.get_surfaceRequestCount(this.segment()); }
    /// Sets `surfaceRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_surfaceRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_surfaceRequestCount.set(segment, 0L, index, value); }
    /// Sets `surfaceRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_surfaceRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_surfaceRequestCount(segment, 0L, value); }
    /// Sets `surfaceRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo surfaceRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_surfaceRequestCount(this.segment(), index, value); return this; }
    /// Sets `surfaceRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo surfaceRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_surfaceRequestCount(this.segment(), value); return this; }

    /// {@return `swapchainRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_swapchainRequestCount(MemorySegment segment, long index) { return (int) VH_swapchainRequestCount.get(segment, 0L, index); }
    /// {@return `swapchainRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_swapchainRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_swapchainRequestCount(segment, 0L); }
    /// {@return `swapchainRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int swapchainRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_swapchainRequestCount(this.segment(), index); }
    /// {@return `swapchainRequestCount`}
    public @CType("uint32_t") int swapchainRequestCount() { return VkDeviceObjectReservationCreateInfo.get_swapchainRequestCount(this.segment()); }
    /// Sets `swapchainRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchainRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_swapchainRequestCount.set(segment, 0L, index, value); }
    /// Sets `swapchainRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchainRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_swapchainRequestCount(segment, 0L, value); }
    /// Sets `swapchainRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo swapchainRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_swapchainRequestCount(this.segment(), index, value); return this; }
    /// Sets `swapchainRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo swapchainRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_swapchainRequestCount(this.segment(), value); return this; }

    /// {@return `displayModeRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_displayModeRequestCount(MemorySegment segment, long index) { return (int) VH_displayModeRequestCount.get(segment, 0L, index); }
    /// {@return `displayModeRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_displayModeRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_displayModeRequestCount(segment, 0L); }
    /// {@return `displayModeRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int displayModeRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_displayModeRequestCount(this.segment(), index); }
    /// {@return `displayModeRequestCount`}
    public @CType("uint32_t") int displayModeRequestCount() { return VkDeviceObjectReservationCreateInfo.get_displayModeRequestCount(this.segment()); }
    /// Sets `displayModeRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displayModeRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_displayModeRequestCount.set(segment, 0L, index, value); }
    /// Sets `displayModeRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displayModeRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_displayModeRequestCount(segment, 0L, value); }
    /// Sets `displayModeRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo displayModeRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_displayModeRequestCount(this.segment(), index, value); return this; }
    /// Sets `displayModeRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo displayModeRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_displayModeRequestCount(this.segment(), value); return this; }

    /// {@return `subpassDescriptionRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subpassDescriptionRequestCount(MemorySegment segment, long index) { return (int) VH_subpassDescriptionRequestCount.get(segment, 0L, index); }
    /// {@return `subpassDescriptionRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subpassDescriptionRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_subpassDescriptionRequestCount(segment, 0L); }
    /// {@return `subpassDescriptionRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int subpassDescriptionRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_subpassDescriptionRequestCount(this.segment(), index); }
    /// {@return `subpassDescriptionRequestCount`}
    public @CType("uint32_t") int subpassDescriptionRequestCount() { return VkDeviceObjectReservationCreateInfo.get_subpassDescriptionRequestCount(this.segment()); }
    /// Sets `subpassDescriptionRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subpassDescriptionRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subpassDescriptionRequestCount.set(segment, 0L, index, value); }
    /// Sets `subpassDescriptionRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subpassDescriptionRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_subpassDescriptionRequestCount(segment, 0L, value); }
    /// Sets `subpassDescriptionRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo subpassDescriptionRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_subpassDescriptionRequestCount(this.segment(), index, value); return this; }
    /// Sets `subpassDescriptionRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo subpassDescriptionRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_subpassDescriptionRequestCount(this.segment(), value); return this; }

    /// {@return `attachmentDescriptionRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachmentDescriptionRequestCount(MemorySegment segment, long index) { return (int) VH_attachmentDescriptionRequestCount.get(segment, 0L, index); }
    /// {@return `attachmentDescriptionRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachmentDescriptionRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_attachmentDescriptionRequestCount(segment, 0L); }
    /// {@return `attachmentDescriptionRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int attachmentDescriptionRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_attachmentDescriptionRequestCount(this.segment(), index); }
    /// {@return `attachmentDescriptionRequestCount`}
    public @CType("uint32_t") int attachmentDescriptionRequestCount() { return VkDeviceObjectReservationCreateInfo.get_attachmentDescriptionRequestCount(this.segment()); }
    /// Sets `attachmentDescriptionRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachmentDescriptionRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachmentDescriptionRequestCount.set(segment, 0L, index, value); }
    /// Sets `attachmentDescriptionRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachmentDescriptionRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_attachmentDescriptionRequestCount(segment, 0L, value); }
    /// Sets `attachmentDescriptionRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo attachmentDescriptionRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_attachmentDescriptionRequestCount(this.segment(), index, value); return this; }
    /// Sets `attachmentDescriptionRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo attachmentDescriptionRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_attachmentDescriptionRequestCount(this.segment(), value); return this; }

    /// {@return `descriptorSetLayoutBindingRequestCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetLayoutBindingRequestCount(MemorySegment segment, long index) { return (int) VH_descriptorSetLayoutBindingRequestCount.get(segment, 0L, index); }
    /// {@return `descriptorSetLayoutBindingRequestCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetLayoutBindingRequestCount(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutBindingRequestCount(segment, 0L); }
    /// {@return `descriptorSetLayoutBindingRequestCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorSetLayoutBindingRequestCountAt(long index) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutBindingRequestCount(this.segment(), index); }
    /// {@return `descriptorSetLayoutBindingRequestCount`}
    public @CType("uint32_t") int descriptorSetLayoutBindingRequestCount() { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutBindingRequestCount(this.segment()); }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetLayoutBindingRequestCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetLayoutBindingRequestCount.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetLayoutBindingRequestCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutBindingRequestCount(segment, 0L, value); }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingRequestCountAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutBindingRequestCount(this.segment(), index, value); return this; }
    /// Sets `descriptorSetLayoutBindingRequestCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingRequestCount(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutBindingRequestCount(this.segment(), value); return this; }

    /// {@return `descriptorSetLayoutBindingLimit` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_descriptorSetLayoutBindingLimit(MemorySegment segment, long index) { return (int) VH_descriptorSetLayoutBindingLimit.get(segment, 0L, index); }
    /// {@return `descriptorSetLayoutBindingLimit`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_descriptorSetLayoutBindingLimit(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutBindingLimit(segment, 0L); }
    /// {@return `descriptorSetLayoutBindingLimit` at the given index}
    /// @param index the index
    public @CType("uint32_t") int descriptorSetLayoutBindingLimitAt(long index) { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutBindingLimit(this.segment(), index); }
    /// {@return `descriptorSetLayoutBindingLimit`}
    public @CType("uint32_t") int descriptorSetLayoutBindingLimit() { return VkDeviceObjectReservationCreateInfo.get_descriptorSetLayoutBindingLimit(this.segment()); }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_descriptorSetLayoutBindingLimit(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_descriptorSetLayoutBindingLimit.set(segment, 0L, index, value); }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_descriptorSetLayoutBindingLimit(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutBindingLimit(segment, 0L, value); }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingLimitAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutBindingLimit(this.segment(), index, value); return this; }
    /// Sets `descriptorSetLayoutBindingLimit` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo descriptorSetLayoutBindingLimit(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_descriptorSetLayoutBindingLimit(this.segment(), value); return this; }

    /// {@return `maxImageViewMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageViewMipLevels(MemorySegment segment, long index) { return (int) VH_maxImageViewMipLevels.get(segment, 0L, index); }
    /// {@return `maxImageViewMipLevels`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageViewMipLevels(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxImageViewMipLevels(segment, 0L); }
    /// {@return `maxImageViewMipLevels` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxImageViewMipLevelsAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxImageViewMipLevels(this.segment(), index); }
    /// {@return `maxImageViewMipLevels`}
    public @CType("uint32_t") int maxImageViewMipLevels() { return VkDeviceObjectReservationCreateInfo.get_maxImageViewMipLevels(this.segment()); }
    /// Sets `maxImageViewMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageViewMipLevels(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageViewMipLevels.set(segment, 0L, index, value); }
    /// Sets `maxImageViewMipLevels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageViewMipLevels(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImageViewMipLevels(segment, 0L, value); }
    /// Sets `maxImageViewMipLevels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewMipLevelsAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImageViewMipLevels(this.segment(), index, value); return this; }
    /// Sets `maxImageViewMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewMipLevels(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImageViewMipLevels(this.segment(), value); return this; }

    /// {@return `maxImageViewArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageViewArrayLayers(MemorySegment segment, long index) { return (int) VH_maxImageViewArrayLayers.get(segment, 0L, index); }
    /// {@return `maxImageViewArrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageViewArrayLayers(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxImageViewArrayLayers(segment, 0L); }
    /// {@return `maxImageViewArrayLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxImageViewArrayLayersAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxImageViewArrayLayers(this.segment(), index); }
    /// {@return `maxImageViewArrayLayers`}
    public @CType("uint32_t") int maxImageViewArrayLayers() { return VkDeviceObjectReservationCreateInfo.get_maxImageViewArrayLayers(this.segment()); }
    /// Sets `maxImageViewArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageViewArrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageViewArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxImageViewArrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageViewArrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImageViewArrayLayers(segment, 0L, value); }
    /// Sets `maxImageViewArrayLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewArrayLayersAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImageViewArrayLayers(this.segment(), index, value); return this; }
    /// Sets `maxImageViewArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImageViewArrayLayers(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImageViewArrayLayers(this.segment(), value); return this; }

    /// {@return `maxLayeredImageViewMipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxLayeredImageViewMipLevels(MemorySegment segment, long index) { return (int) VH_maxLayeredImageViewMipLevels.get(segment, 0L, index); }
    /// {@return `maxLayeredImageViewMipLevels`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxLayeredImageViewMipLevels(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxLayeredImageViewMipLevels(segment, 0L); }
    /// {@return `maxLayeredImageViewMipLevels` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxLayeredImageViewMipLevelsAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxLayeredImageViewMipLevels(this.segment(), index); }
    /// {@return `maxLayeredImageViewMipLevels`}
    public @CType("uint32_t") int maxLayeredImageViewMipLevels() { return VkDeviceObjectReservationCreateInfo.get_maxLayeredImageViewMipLevels(this.segment()); }
    /// Sets `maxLayeredImageViewMipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLayeredImageViewMipLevels(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxLayeredImageViewMipLevels.set(segment, 0L, index, value); }
    /// Sets `maxLayeredImageViewMipLevels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLayeredImageViewMipLevels(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxLayeredImageViewMipLevels(segment, 0L, value); }
    /// Sets `maxLayeredImageViewMipLevels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxLayeredImageViewMipLevelsAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxLayeredImageViewMipLevels(this.segment(), index, value); return this; }
    /// Sets `maxLayeredImageViewMipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxLayeredImageViewMipLevels(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxLayeredImageViewMipLevels(this.segment(), value); return this; }

    /// {@return `maxOcclusionQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxOcclusionQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxOcclusionQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxOcclusionQueriesPerPool`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxOcclusionQueriesPerPool(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxOcclusionQueriesPerPool(segment, 0L); }
    /// {@return `maxOcclusionQueriesPerPool` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxOcclusionQueriesPerPoolAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxOcclusionQueriesPerPool(this.segment(), index); }
    /// {@return `maxOcclusionQueriesPerPool`}
    public @CType("uint32_t") int maxOcclusionQueriesPerPool() { return VkDeviceObjectReservationCreateInfo.get_maxOcclusionQueriesPerPool(this.segment()); }
    /// Sets `maxOcclusionQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxOcclusionQueriesPerPool(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxOcclusionQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxOcclusionQueriesPerPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxOcclusionQueriesPerPool(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxOcclusionQueriesPerPool(segment, 0L, value); }
    /// Sets `maxOcclusionQueriesPerPool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxOcclusionQueriesPerPoolAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxOcclusionQueriesPerPool(this.segment(), index, value); return this; }
    /// Sets `maxOcclusionQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxOcclusionQueriesPerPool(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxOcclusionQueriesPerPool(this.segment(), value); return this; }

    /// {@return `maxPipelineStatisticsQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPipelineStatisticsQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxPipelineStatisticsQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxPipelineStatisticsQueriesPerPool`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPipelineStatisticsQueriesPerPool(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxPipelineStatisticsQueriesPerPool(segment, 0L); }
    /// {@return `maxPipelineStatisticsQueriesPerPool` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPipelineStatisticsQueriesPerPoolAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxPipelineStatisticsQueriesPerPool(this.segment(), index); }
    /// {@return `maxPipelineStatisticsQueriesPerPool`}
    public @CType("uint32_t") int maxPipelineStatisticsQueriesPerPool() { return VkDeviceObjectReservationCreateInfo.get_maxPipelineStatisticsQueriesPerPool(this.segment()); }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPipelineStatisticsQueriesPerPool(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPipelineStatisticsQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPipelineStatisticsQueriesPerPool(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxPipelineStatisticsQueriesPerPool(segment, 0L, value); }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxPipelineStatisticsQueriesPerPoolAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxPipelineStatisticsQueriesPerPool(this.segment(), index, value); return this; }
    /// Sets `maxPipelineStatisticsQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxPipelineStatisticsQueriesPerPool(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxPipelineStatisticsQueriesPerPool(this.segment(), value); return this; }

    /// {@return `maxTimestampQueriesPerPool` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTimestampQueriesPerPool(MemorySegment segment, long index) { return (int) VH_maxTimestampQueriesPerPool.get(segment, 0L, index); }
    /// {@return `maxTimestampQueriesPerPool`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTimestampQueriesPerPool(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxTimestampQueriesPerPool(segment, 0L); }
    /// {@return `maxTimestampQueriesPerPool` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTimestampQueriesPerPoolAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxTimestampQueriesPerPool(this.segment(), index); }
    /// {@return `maxTimestampQueriesPerPool`}
    public @CType("uint32_t") int maxTimestampQueriesPerPool() { return VkDeviceObjectReservationCreateInfo.get_maxTimestampQueriesPerPool(this.segment()); }
    /// Sets `maxTimestampQueriesPerPool` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTimestampQueriesPerPool(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTimestampQueriesPerPool.set(segment, 0L, index, value); }
    /// Sets `maxTimestampQueriesPerPool` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTimestampQueriesPerPool(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxTimestampQueriesPerPool(segment, 0L, value); }
    /// Sets `maxTimestampQueriesPerPool` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxTimestampQueriesPerPoolAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxTimestampQueriesPerPool(this.segment(), index, value); return this; }
    /// Sets `maxTimestampQueriesPerPool` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxTimestampQueriesPerPool(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxTimestampQueriesPerPool(this.segment(), value); return this; }

    /// {@return `maxImmutableSamplersPerDescriptorSetLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImmutableSamplersPerDescriptorSetLayout(MemorySegment segment, long index) { return (int) VH_maxImmutableSamplersPerDescriptorSetLayout.get(segment, 0L, index); }
    /// {@return `maxImmutableSamplersPerDescriptorSetLayout`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImmutableSamplersPerDescriptorSetLayout(MemorySegment segment) { return VkDeviceObjectReservationCreateInfo.get_maxImmutableSamplersPerDescriptorSetLayout(segment, 0L); }
    /// {@return `maxImmutableSamplersPerDescriptorSetLayout` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxImmutableSamplersPerDescriptorSetLayoutAt(long index) { return VkDeviceObjectReservationCreateInfo.get_maxImmutableSamplersPerDescriptorSetLayout(this.segment(), index); }
    /// {@return `maxImmutableSamplersPerDescriptorSetLayout`}
    public @CType("uint32_t") int maxImmutableSamplersPerDescriptorSetLayout() { return VkDeviceObjectReservationCreateInfo.get_maxImmutableSamplersPerDescriptorSetLayout(this.segment()); }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImmutableSamplersPerDescriptorSetLayout(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImmutableSamplersPerDescriptorSetLayout.set(segment, 0L, index, value); }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImmutableSamplersPerDescriptorSetLayout(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImmutableSamplersPerDescriptorSetLayout(segment, 0L, value); }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImmutableSamplersPerDescriptorSetLayoutAt(long index, @CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImmutableSamplersPerDescriptorSetLayout(this.segment(), index, value); return this; }
    /// Sets `maxImmutableSamplersPerDescriptorSetLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceObjectReservationCreateInfo maxImmutableSamplersPerDescriptorSetLayout(@CType("uint32_t") int value) { VkDeviceObjectReservationCreateInfo.set_maxImmutableSamplersPerDescriptorSetLayout(this.segment(), value); return this; }

}
